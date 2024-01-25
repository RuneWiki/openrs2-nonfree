import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
	private int anInt48;

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "()V")
	@Override
	protected void method364() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method357(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean7 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static275.anInt4927, 16, Static314.aBoolean348 ? 2 : 1, true, false);
		this.aByteArray1 = new byte[0x100 << (Static314.aBoolean348 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	@Override
	public void method349(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static314.aBoolean348 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt48 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static121.method2096(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method349(Static52.method1203(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "()V")
	@Override
	protected void method354() {
		@Pc(1) short local1 = 256;
		if (Static314.aBoolean348) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray18[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray1[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray1[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray1, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
	@Override
	protected int method351() {
		return this.anInt48 - (this.aSourceDataLine1.available() >> (Static314.aBoolean348 ? 2 : 1));
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
	@Override
	protected void method350() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean7) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt48 << (Static314.aBoolean348 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}

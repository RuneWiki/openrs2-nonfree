import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	private int anInt4043;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!pk", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!pk", name = "W", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "()I")
	@Override
	protected int method3271() {
		return this.anInt4043 - (this.aSourceDataLine1.available() >> (Static14.aBoolean153 ? 2 : 1));
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "()V")
	@Override
	protected void method3269() {
		@Pc(1) short local1 = 256;
		if (Static14.aBoolean153) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray358[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray48[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray48[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray48, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
	@Override
	public void method3285(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static14.aBoolean153 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4043 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static138.method2260(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3285(Static74.method1127(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "()V")
	@Override
	protected void method3277() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3284(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean265 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static79.anInt1529, 16, Static14.aBoolean153 ? 2 : 1, true, false);
		this.aByteArray48 = new byte[0x100 << (Static14.aBoolean153 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "()V")
	@Override
	protected void method3270() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean265) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4043 << (Static14.aBoolean153 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}

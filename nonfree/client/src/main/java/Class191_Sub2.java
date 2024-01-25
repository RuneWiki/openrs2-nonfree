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

@OriginalClass("client!sv")
public final class Class191_Sub2 extends Class191 {

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
	private int anInt6342;

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "()V")
	@Override
	protected void method5006() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()V")
	@Override
	protected void method5002() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean419) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6342 << (Static335.aBoolean372 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	@Override
	public void method5008(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static335.aBoolean372 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6342 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static104.method1450(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5008(Static331.method4084(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "()I")
	@Override
	protected int method5011() {
		return this.anInt6342 - (this.aSourceDataLine1.available() >> (Static335.aBoolean372 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5012(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean419 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static193.anInt3215, 16, Static335.aBoolean372 ? 2 : 1, true, false);
		this.aByteArray81 = new byte[0x100 << (Static335.aBoolean372 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "()V")
	@Override
	protected void method5003() {
		@Pc(1) short local1 = 256;
		if (Static335.aBoolean372) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray445[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray81[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray81[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray81, 0, local1 << 1);
	}
}

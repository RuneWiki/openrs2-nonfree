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

@OriginalClass("client!cda")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!cda", name = "K", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!cda", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!cda", name = "M", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!cda", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!cda", name = "J", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	@Override
	public void method6489(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static570.aBoolean666 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt926 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static177.method2710(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6489(Static516.method7313(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "()V")
	@Override
	protected void method6503() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean42) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt926 << (Static570.aBoolean666 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "()V")
	@Override
	protected void method6494() {
		@Pc(1) short local1 = 256;
		if (Static570.aBoolean666) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray621[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray15[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray15[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray15, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "()I")
	@Override
	protected int method6497() {
		return this.anInt926 - (this.aSourceDataLine1.available() >> (Static570.aBoolean666 ? 2 : 1));
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6499(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(22) String local22 = local15.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean42 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static508.anInt8600, 16, Static570.aBoolean666 ? 2 : 1, true, false);
		this.aByteArray15 = new byte[0x100 << (Static570.aBoolean666 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "()V")
	@Override
	protected void method6490() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

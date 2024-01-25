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

@OriginalClass("client!bj")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!bj", name = "M", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1131(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(26) String local26 = local19.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean83 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static149.anInt2863, 16, Static124.aBoolean223 ? 2 : 1, true, false);
		this.aByteArray12 = new byte[0x100 << (Static124.aBoolean223 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	@Override
	protected void method1141() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean83) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1070 << (Static124.aBoolean223 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()I")
	@Override
	protected int method1130() {
		return this.anInt1070 - (this.aSourceDataLine1.available() >> (Static124.aBoolean223 ? 2 : 1));
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	@Override
	protected void method1129() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "()V")
	@Override
	protected void method1133() {
		@Pc(1) short local1 = 256;
		if (Static124.aBoolean223) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray66[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray12[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray12[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray12, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method1127(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static124.aBoolean223 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1070 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static368.method6033(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1127(Static178.method3152(arg0));
			}
		}
	}
}

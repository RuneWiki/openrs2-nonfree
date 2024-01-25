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

@OriginalClass("client!aw")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!aw", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!aw", name = "I", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "()V")
	@Override
	protected void method5641() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V")
	@Override
	public void method5643(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static314.aBoolean392 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt477 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static46.method733(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5643(Static51.method863(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "()V")
	@Override
	protected void method5635() {
		@Pc(1) short local1 = 256;
		if (Static314.aBoolean392) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray601[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray17[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray17[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray17, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "()I")
	@Override
	protected int method5629() {
		return this.anInt477 - (this.aSourceDataLine1.available() >> (Static314.aBoolean392 ? 2 : 1));
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5632(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean19 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static410.anInt6842, 16, Static314.aBoolean392 ? 2 : 1, true, false);
		this.aByteArray17 = new byte[0x100 << (Static314.aBoolean392 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "()V")
	@Override
	protected void method5640() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean19) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt477 << (Static314.aBoolean392 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}

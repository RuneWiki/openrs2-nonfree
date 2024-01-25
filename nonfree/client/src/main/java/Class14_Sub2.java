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

@OriginalClass("client!o")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "I")
	private int anInt6598;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!o", name = "H", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	@Override
	public void method5528(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static591.aBoolean732 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6598 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static331.method5069(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5528(Static89.method7259(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5519(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean516 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static162.anInt3474, 16, Static591.aBoolean732 ? 2 : 1, true, false);
		this.aByteArray67 = new byte[0x100 << (Static591.aBoolean732 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
	@Override
	protected void method5527() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean516) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6598 << (Static591.aBoolean732 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
	@Override
	protected void method5529() {
		@Pc(1) short local1 = 256;
		if (Static591.aBoolean732) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray454[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray67[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray67[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray67, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
	@Override
	protected void method5517() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()I")
	@Override
	protected int method5526() {
		return this.anInt6598 - (this.aSourceDataLine1.available() >> (Static591.aBoolean732 ? 2 : 1));
	}
}

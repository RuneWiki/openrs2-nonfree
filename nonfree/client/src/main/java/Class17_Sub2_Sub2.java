import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class17_Sub2_Sub2 extends Class17_Sub2 {

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "[B")
	private final byte[] aByteArray15 = new byte[512];

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private final AudioFormat anAudioFormat1 = new AudioFormat(22050.0F, 16, 1, true, false);

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class17_Sub2_Sub2() throws Exception {
		super(22050);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	@Override
	protected void method1438(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(16) Info local16 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 * 2);
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local16);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
		} catch (@Pc(29) LineUnavailableException local29) {
			this.aSourceDataLine1 = null;
			throw local29;
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "()I")
	@Override
	protected int method1445() {
		return this.aSourceDataLine1.available() >> 1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	@Override
	protected void method1439() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
	@Override
	protected void method1441() {
		for (@Pc(1) int local1 = 0; local1 < 256; local1++) {
			@Pc(8) int local8 = Static92.anIntArray307[local1];
			if ((local8 + 8388608 & 0xFF000000) != 0) {
				local8 = local8 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray15[local1 * 2] = (byte) (local8 >> 8);
			this.aByteArray15[local1 * 2 + 1] = (byte) (local8 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray15, 0, 512);
	}
}

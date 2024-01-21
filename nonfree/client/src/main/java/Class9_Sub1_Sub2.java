import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "[B")
	private final byte[] aByteArray24 = new byte[512];

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private final AudioFormat anAudioFormat1 = new AudioFormat(22050.0F, 16, 1, true, false);

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class9_Sub1_Sub2() throws Exception {
		super(22050);
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
	@Override
	protected void method1881() {
		for (@Pc(1) int local1 = 0; local1 < 256; local1++) {
			@Pc(8) int local8 = Static14.anIntArray396[local1];
			if ((local8 + 8388608 & 0xFF000000) != 0) {
				local8 = local8 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray24[local1 * 2] = (byte) (local8 >> 8);
			this.aByteArray24[local1 * 2 + 1] = (byte) (local8 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray24, 0, 512);
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()V")
	@Override
	protected void method1879() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	@Override
	protected void method1876(@OriginalArg(0) int arg0) throws LineUnavailableException {
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

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()I")
	@Override
	protected int method1878() {
		return this.aSourceDataLine1.available() >> 1;
	}
}

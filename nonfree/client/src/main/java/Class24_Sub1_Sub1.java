import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class24_Sub1_Sub1 extends Class24_Sub1 {

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "[B")
	private final byte[] aByteArray10 = new byte[512];

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private final AudioFormat anAudioFormat1 = new AudioFormat(22050.0F, 16, 1, true, false);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 11)
	@Override
	protected void method1089(@OriginalArg(0) int arg0) throws LineUnavailableException {
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

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 26)
	@Override
	protected void method1083() {
		for (@Pc(1) int local1 = 0; local1 < 256; local1++) {
			@Pc(8) int local8 = anIntArray337[local1];
			if ((local8 + 8388608 & 0xFF000000) != 0) {
				local8 = local8 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray10[local1 * 2] = (byte) (local8 >> 8);
			this.aByteArray10[local1 * 2 + 1] = (byte) (local8 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray10, 0, 512);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V", line = 44)
	@Override
	protected void method1087() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()I", line = 61)
	@Override
	protected int method1090() {
		return this.aSourceDataLine1.available() >> 1;
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 67)
	public Class24_Sub1_Sub1() throws Exception {
		super(22050);
	}
}

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

@OriginalClass("client!f")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!f", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!f", name = "db", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
	@Override
	protected void method874() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	@Override
	protected void method870() {
		@Pc(1) short local1 = 256;
		if (Static28.aBoolean29) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray158[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray16[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray16[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray16, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	@Override
	protected void method865() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	@Override
	protected int method869() {
		return this.anInt730 - (this.aSourceDataLine1.available() >> (Static28.aBoolean29 ? 2 : 1));
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	@Override
	public void method864(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static28.aBoolean29 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt730 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static107.method1731(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method864(Static52.method878(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method873(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static107.anInt2405, 16, Static28.aBoolean29 ? 2 : 1, true, false);
		this.aByteArray16 = new byte[0x100 << (Static28.aBoolean29 ? 2 : 1)];
	}
}

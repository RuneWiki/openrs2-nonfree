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

@OriginalClass("client!oe")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
	private int anInt2291;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
	@Override
	public void method1532(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static33.aBoolean47 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2291 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static115.method2089(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1532(Static51.method1127(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
	@Override
	protected void method1537() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1536(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static1.anInt3, 16, Static33.aBoolean47 ? 2 : 1, true, false);
		this.aByteArray31 = new byte[0x100 << (Static33.aBoolean47 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
	@Override
	protected void method1533() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
	@Override
	protected void method1521() {
		@Pc(1) short local1 = 256;
		if (Static33.aBoolean47) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray316[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray31[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray31[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray31, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()I")
	@Override
	protected int method1538() {
		return this.anInt2291 - (this.aSourceDataLine1.available() >> (Static33.aBoolean47 ? 2 : 1));
	}
}

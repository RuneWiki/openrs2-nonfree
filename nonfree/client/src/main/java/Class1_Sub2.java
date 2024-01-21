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

@OriginalClass("client!nf")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
	private int anInt2010;

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
	@Override
	protected void method1387() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()V")
	@Override
	protected void method1390() {
		@Pc(1) short local1 = 256;
		if (Static49.aBoolean48) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray263[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray46[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray46[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray46, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1389(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static38.anInt1141, 16, Static49.aBoolean48 ? 2 : 1, true, false);
		this.aByteArray46 = new byte[0x100 << (Static49.aBoolean48 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "()I")
	@Override
	protected int method1392() {
		return this.anInt2010 - (this.aSourceDataLine1.available() >> (Static49.aBoolean48 ? 2 : 1));
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	@Override
	public void method1395(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static49.aBoolean48 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2010 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static57.method1046(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1395(Static65.method1135(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
	@Override
	protected void method1386() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

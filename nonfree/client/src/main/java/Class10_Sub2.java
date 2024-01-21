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

@OriginalClass("client!mb")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
	private int anInt1779;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()I")
	@Override
	protected int method1292() {
		return this.anInt1779 - (this.aSourceDataLine1.available() >> (Static69.aBoolean49 ? 2 : 1));
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1298(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static45.anInt2755, 16, Static69.aBoolean49 ? 2 : 1, true, false);
		this.aByteArray29 = new byte[0x100 << (Static69.aBoolean49 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
	@Override
	protected void method1302() {
		@Pc(1) short local1 = 256;
		if (Static69.aBoolean49) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray291[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray29[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray29[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray29, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	@Override
	public void method1294(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static69.aBoolean49 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1779 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static96.method1624(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1294(Static86.method1522(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
	@Override
	protected void method1304() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
	@Override
	protected void method1293() {
		this.aSourceDataLine1.flush();
	}
}

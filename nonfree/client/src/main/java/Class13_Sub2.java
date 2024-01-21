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

@OriginalClass("client!ta")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
	private int anInt2566;

	@OriginalMember(owner = "client!ta", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ta", name = "V", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
	@Override
	protected int method1605() {
		return this.anInt2566 - (this.aSourceDataLine1.available() >> (Static23.aBoolean34 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
	@Override
	protected void method1609() {
		@Pc(1) short local1 = 256;
		if (Static23.aBoolean34) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray343[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray38[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray38[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray38, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	@Override
	public void method1608(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static23.aBoolean34 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2566 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static34.method558(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1608(Static86.method1301(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1610(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static23.anInt713, 16, Static23.aBoolean34 ? 2 : 1, true, false);
		this.aByteArray38 = new byte[0x100 << (Static23.aBoolean34 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
	@Override
	protected void method1596() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	@Override
	protected void method1594() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

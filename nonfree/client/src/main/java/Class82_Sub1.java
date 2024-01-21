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

@OriginalClass("client!uf")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!uf", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
	private int anInt3589;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2631(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static45.anInt1131, 16, Static128.aBoolean130 ? 2 : 1, true, false);
		this.aByteArray38 = new byte[0x100 << (Static128.aBoolean130 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()I")
	@Override
	protected int method2629() {
		return this.anInt3589 - (this.aSourceDataLine1.available() >> (Static128.aBoolean130 ? 2 : 1));
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
	@Override
	protected void method2630() {
		@Pc(1) short local1 = 256;
		if (Static128.aBoolean130) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray403[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray38[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray38[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray38, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	@Override
	public void method2640(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static128.aBoolean130 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3589 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static106.method1724(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2640(Static65.method1137(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "()V")
	@Override
	protected void method2643() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
	@Override
	protected void method2632() {
		this.aSourceDataLine1.flush();
	}
}

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

@OriginalClass("client!uh")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
	private int anInt3604;

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!uh", name = "Y", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!uh", name = "Z", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "()V")
	@Override
	protected void method2599() {
		@Pc(1) short local1 = 256;
		if (Static126.aBoolean195) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray381[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray44[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray44[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray44, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
	@Override
	protected void method2590() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2600(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static143.anInt3288, 16, Static126.aBoolean195 ? 2 : 1, true, false);
		this.aByteArray44 = new byte[0x100 << (Static126.aBoolean195 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()I")
	@Override
	protected int method2585() {
		return this.anInt3604 - (this.aSourceDataLine1.available() >> (Static126.aBoolean195 ? 2 : 1));
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "()V")
	@Override
	protected void method2593() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
	@Override
	public void method2602(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static126.aBoolean195 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3604 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static16.method296(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2602(Static50.method902(arg0));
			}
		}
	}
}

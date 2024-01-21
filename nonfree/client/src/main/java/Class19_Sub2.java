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

@OriginalClass("client!ff")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	private int anInt1271;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method893(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static63.anInt1680, 16, Static46.aBoolean62 ? 2 : 1, true, false);
		this.aByteArray22 = new byte[0x100 << (Static46.aBoolean62 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	@Override
	protected void method882() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
	@Override
	protected void method890() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
	@Override
	protected void method896() {
		@Pc(1) short local1 = 256;
		if (Static46.aBoolean62) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray207[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray22[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray22[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray22, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	@Override
	public void method885(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static46.aBoolean62 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1271 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static131.method2903(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method885(Static11.method173(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
	@Override
	protected int method889() {
		return this.anInt1271 - (this.aSourceDataLine1.available() >> (Static46.aBoolean62 ? 2 : 1));
	}
}

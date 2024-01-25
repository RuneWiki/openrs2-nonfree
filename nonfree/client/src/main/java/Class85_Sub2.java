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

@OriginalClass("client!qf")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
	private int anInt4799;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Z")
	private boolean aBoolean361 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
	@Override
	protected void method4214() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()V")
	@Override
	protected void method4218() {
		@Pc(1) short local1 = 256;
		if (Static44.aBoolean66) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray923[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray85[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray85[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray85, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
	@Override
	protected void method4217() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean361) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4799 << (Static44.aBoolean66 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4221(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean361 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static42.anInt4820, 16, Static44.aBoolean66 ? 2 : 1, true, false);
		this.aByteArray85 = new byte[0x100 << (Static44.aBoolean66 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
	@Override
	protected int method4220() {
		return this.anInt4799 - (this.aSourceDataLine1.available() >> (Static44.aBoolean66 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	@Override
	public void method4225(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static44.aBoolean66 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4799 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static231.method3755(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4225(Static6.method148(arg0));
			}
		}
	}
}

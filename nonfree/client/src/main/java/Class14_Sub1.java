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

@OriginalClass("client!ao")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()V")
	@Override
	protected void method4887() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	@Override
	protected void method4886() {
		@Pc(1) short local1 = 256;
		if (Static250.aBoolean432) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray682[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray4[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray4[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray4, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static250.aBoolean432 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt251 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static49.method3044(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4895(Static183.method1325(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4902(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean22 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static212.anInt3652, 16, Static250.aBoolean432 ? 2 : 1, true, false);
		this.aByteArray4 = new byte[0x100 << (Static250.aBoolean432 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()V")
	@Override
	protected void method4890() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean22) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt251 << (Static250.aBoolean432 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()I")
	@Override
	protected int method4889() {
		return this.anInt251 - (this.aSourceDataLine1.available() >> (Static250.aBoolean432 ? 2 : 1));
	}
}

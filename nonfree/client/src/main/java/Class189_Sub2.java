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

@OriginalClass("client!mf")
public final class Class189_Sub2 extends Class189 {

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
	private int anInt6097;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	@Override
	public void method4938(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static480.aBoolean552 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6097 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static224.method3523(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4938(Static14.method5936(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4947(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean439 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static313.anInt6055, 16, Static480.aBoolean552 ? 2 : 1, true, false);
		this.aByteArray77 = new byte[0x100 << (Static480.aBoolean552 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
	@Override
	protected void method4942() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()V")
	@Override
	protected void method4935() {
		@Pc(1) short local1 = 256;
		if (Static480.aBoolean552) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray437[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray77[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray77[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray77, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()V")
	@Override
	protected void method4944() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean439) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6097 << (Static480.aBoolean552 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()I")
	@Override
	protected int method4934() {
		return this.anInt6097 - (this.aSourceDataLine1.available() >> (Static480.aBoolean552 ? 2 : 1));
	}
}

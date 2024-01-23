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

@OriginalClass("client!tk")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
	private int anInt5585;

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "Z")
	private boolean aBoolean296 = false;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()I")
	@Override
	protected int method4349() {
		return this.anInt5585 - (this.aSourceDataLine1.available() >> (Static199.aBoolean240 ? 2 : 1));
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "()V")
	@Override
	protected void method4335() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean296) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5585 << (Static199.aBoolean240 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	@Override
	public void method4343(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static199.aBoolean240 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5585 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static244.method4187(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4343(Static227.method3943(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4344(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(21) String local21 = local16.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean296 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static43.anInt1255, 16, Static199.aBoolean240 ? 2 : 1, true, false);
		this.aByteArray72 = new byte[0x100 << (Static199.aBoolean240 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "()V")
	@Override
	protected void method4339() {
		@Pc(1) short local1 = 256;
		if (Static199.aBoolean240) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray562[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray72[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray72[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray72, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "()V")
	@Override
	protected void method4336() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

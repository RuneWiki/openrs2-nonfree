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

@OriginalClass("client!vn")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
	private int anInt6479;

	@OriginalMember(owner = "client!vn", name = "N", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!vn", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!vn", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
	@Override
	protected void method5503() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean419) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6479 << (Static178.aBoolean224 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()I")
	@Override
	protected int method5512() {
		return this.anInt6479 - (this.aSourceDataLine1.available() >> (Static178.aBoolean224 ? 2 : 1));
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()V")
	@Override
	protected void method5504() {
		@Pc(1) short local1 = 256;
		if (Static178.aBoolean224) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray535[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray97[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray97[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray97, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()V")
	@Override
	protected void method5515() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	@Override
	public void method5517(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static178.aBoolean224 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6479 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static348.method5637(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5517(Static90.method4097(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5508(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(22) String local22 = local17.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean419 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static352.anInt6698, 16, Static178.aBoolean224 ? 2 : 1, true, false);
		this.aByteArray97 = new byte[0x100 << (Static178.aBoolean224 ? 2 : 1)];
	}
}

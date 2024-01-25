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

@OriginalClass("client!bha")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!bha", name = "F", descriptor = "I")
	private int anInt1735;

	@OriginalMember(owner = "client!bha", name = "G", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!bha", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!bha", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!bha", name = "I", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "()V")
	@Override
	protected void method7221() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
	@Override
	public void method7212(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static600.aBoolean722 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1735 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static135.method3070(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7212(Static231.method4407(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7225(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(21) String local21 = local16.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean149 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static215.anInt4848, 16, Static600.aBoolean722 ? 2 : 1, true, false);
		this.aByteArray27 = new byte[0x100 << (Static600.aBoolean722 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "()I")
	@Override
	protected int method7211() {
		return this.anInt1735 - (this.aSourceDataLine1.available() >> (Static600.aBoolean722 ? 2 : 1));
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "()V")
	@Override
	protected void method7213() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean149) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1735 << (Static600.aBoolean722 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "()V")
	@Override
	protected void method7224() {
		@Pc(1) short local1 = 256;
		if (Static600.aBoolean722) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray557[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray27[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray27[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray27, 0, local1 << 1);
	}
}

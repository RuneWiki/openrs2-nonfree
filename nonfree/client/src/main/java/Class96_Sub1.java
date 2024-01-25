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

@OriginalClass("client!he")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!he", name = "L", descriptor = "I")
	private int anInt2733;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	@Override
	public void method3469(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static158.aBoolean222 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2733 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static69.method1262(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3469(Static342.method4774(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	@Override
	protected void method3463() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	@Override
	protected void method3462() {
		@Pc(1) short local1 = 256;
		if (Static158.aBoolean222) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray269[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray51[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray51[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray51, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
	@Override
	protected void method3464() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean208) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2733 << (Static158.aBoolean222 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()I")
	@Override
	protected int method3475() {
		return this.anInt2733 - (this.aSourceDataLine1.available() >> (Static158.aBoolean222 ? 2 : 1));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3461(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(24) String local24 = local17.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean208 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static203.anInt3626, 16, Static158.aBoolean222 ? 2 : 1, true, false);
		this.aByteArray51 = new byte[0x100 << (Static158.aBoolean222 ? 2 : 1)];
	}
}

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
	private int anInt3200;

	@OriginalMember(owner = "client!nj", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!nj", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!nj", name = "V", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!nj", name = "T", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "()V")
	@Override
	protected void method2410() {
		@Pc(1) short local1 = 256;
		if (Static97.aBoolean189) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray274[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray45[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray45[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray45, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2405(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(6) int local6 = 0; local6 < local1.length; local6++) {
				@Pc(20) Info local20 = local1[local6];
				if (local20 != null) {
					@Pc(26) String local26 = local20.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean271 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static14.anInt334, 16, Static97.aBoolean189 ? 2 : 1, true, false);
		this.aByteArray45 = new byte[0x100 << (Static97.aBoolean189 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "()I")
	@Override
	protected int method2418() {
		return this.anInt3200 - (this.aSourceDataLine1.available() >> (Static97.aBoolean189 ? 2 : 1));
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
	@Override
	protected void method2409() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	@Override
	public void method2408(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static97.aBoolean189 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3200 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static63.method1194(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2408(Static156.method2529(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()V")
	@Override
	protected void method2421() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean271) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3200 << (Static97.aBoolean189 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}

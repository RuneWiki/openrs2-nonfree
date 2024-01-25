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

@OriginalClass("client!un")
public final class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!un", name = "K", descriptor = "[B")
	private byte[] aByteArray91;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "I")
	private int anInt6949;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "Z")
	private boolean aBoolean467 = false;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
	@Override
	protected void method5347() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean467) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6949 << (Static394.aBoolean454 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	@Override
	public void method5353(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static394.aBoolean454 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6949 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static56.method1137(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5353(Static183.method2711(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5352(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean467 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static410.anInt6810, 16, Static394.aBoolean454 ? 2 : 1, true, false);
		this.aByteArray91 = new byte[0x100 << (Static394.aBoolean454 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "()V")
	@Override
	protected void method5351() {
		@Pc(1) short local1 = 256;
		if (Static394.aBoolean454) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray615[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray91[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray91[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray91, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "()V")
	@Override
	protected void method5364() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()I")
	@Override
	protected int method5361() {
		return this.anInt6949 - (this.aSourceDataLine1.available() >> (Static394.aBoolean454 ? 2 : 1));
	}
}

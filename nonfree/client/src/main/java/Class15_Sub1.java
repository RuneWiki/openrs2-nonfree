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

@OriginalClass("client!al")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!al", name = "E", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!al", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!al", name = "I", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!al", name = "H", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "()V")
	@Override
	protected void method5342() {
		@Pc(1) short local1 = 256;
		if (Static455.aBoolean611) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray387[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray1[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray1[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray1, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "()I")
	@Override
	protected int method5347() {
		return this.anInt910 - (this.aSourceDataLine1.available() >> (Static455.aBoolean611 ? 2 : 1));
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5350(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean87 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static544.anInt9957, 16, Static455.aBoolean611 ? 2 : 1, true, false);
		this.aByteArray1 = new byte[0x100 << (Static455.aBoolean611 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "()V")
	@Override
	protected void method5352() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean87) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt910 << (Static455.aBoolean611 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	@Override
	public void method5343(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static455.aBoolean611 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt910 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static60.method1364(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5343(Static488.method7100(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "()V")
	@Override
	protected void method5344() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

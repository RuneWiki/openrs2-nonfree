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

@OriginalClass("client!sa")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
	private int anInt3493;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
	@Override
	protected void method2623() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean194) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3493 << (Static151.aBoolean177 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	@Override
	protected void method2616() {
		@Pc(1) short local1 = 256;
		if (Static151.aBoolean177) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray305[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray47[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray47[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray47, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()I")
	@Override
	protected int method2626() {
		return this.anInt3493 - (this.aSourceDataLine1.available() >> (Static151.aBoolean177 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	@Override
	public void method2621(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static151.aBoolean177 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3493 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static15.method260(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2621(Static155.method2190(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2620(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean194 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static96.anInt2009, 16, Static151.aBoolean177 ? 2 : 1, true, false);
		this.aByteArray47 = new byte[0x100 << (Static151.aBoolean177 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()V")
	@Override
	protected void method2624() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

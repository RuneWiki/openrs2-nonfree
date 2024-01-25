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

@OriginalClass("client!wj")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
	private int anInt7420;

	@OriginalMember(owner = "client!wj", name = "L", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!wj", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "Z")
	private boolean aBoolean811 = false;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5868(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean811 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static228.anInt4846, 16, Static166.aBoolean323 ? 2 : 1, true, false);
		this.aByteArray94 = new byte[0x100 << (Static166.aBoolean323 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "()V")
	@Override
	protected void method5871() {
		@Pc(1) short local1 = 256;
		if (Static166.aBoolean323) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray508[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray94[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray94[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray94, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "()I")
	@Override
	protected int method5861() {
		return this.anInt7420 - (this.aSourceDataLine1.available() >> (Static166.aBoolean323 ? 2 : 1));
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "()V")
	@Override
	protected void method5870() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean811) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt7420 << (Static166.aBoolean323 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	@Override
	public void method5858(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static166.aBoolean323 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt7420 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static387.method5069(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5858(Static191.method2740(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	@Override
	protected void method5855() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

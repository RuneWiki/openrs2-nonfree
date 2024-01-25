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

@OriginalClass("client!tu")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!tu", name = "G", descriptor = "[B")
	private byte[] aByteArray91;

	@OriginalMember(owner = "client!tu", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
	private int anInt7125;

	@OriginalMember(owner = "client!tu", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!tu", name = "F", descriptor = "Z")
	private boolean aBoolean529 = false;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	@Override
	public void method5673(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static3.aBoolean91 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt7125 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static310.method4733(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5673(Static84.method6309(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "()V")
	@Override
	protected void method5671() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "()I")
	@Override
	protected int method5669() {
		return this.anInt7125 - (this.aSourceDataLine1.available() >> (Static3.aBoolean91 ? 2 : 1));
	}

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "()V")
	@Override
	protected void method5677() {
		@Pc(1) short local1 = 256;
		if (Static3.aBoolean91) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray577[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray91[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray91[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray91, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "()V")
	@Override
	protected void method5675() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean529) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt7125 << (Static3.aBoolean91 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5670(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean529 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static88.anInt6642, 16, Static3.aBoolean91 ? 2 : 1, true, false);
		this.aByteArray91 = new byte[0x100 << (Static3.aBoolean91 ? 2 : 1)];
	}
}

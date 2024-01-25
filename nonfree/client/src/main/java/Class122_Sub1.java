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

@OriginalClass("client!gw")
public final class Class122_Sub1 extends Class122 {

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!gw", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!gw", name = "K", descriptor = "I")
	private int anInt4597;

	@OriginalMember(owner = "client!gw", name = "I", descriptor = "Z")
	private boolean aBoolean390 = false;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6812(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean390 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static590.anInt9843, 16, Static457.aBoolean715 ? 2 : 1, true, false);
		this.aByteArray41 = new byte[0x100 << (Static457.aBoolean715 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	@Override
	public void method6802(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static457.aBoolean715 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4597 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static102.method8169(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6802(Static95.method2482(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "()I")
	@Override
	protected int method6809() {
		return this.anInt4597 - (this.aSourceDataLine1.available() >> (Static457.aBoolean715 ? 2 : 1));
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "()V")
	@Override
	protected void method6813() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean390) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4597 << (Static457.aBoolean715 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "()V")
	@Override
	protected void method6801() {
		@Pc(1) short local1 = 256;
		if (Static457.aBoolean715) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray513[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray41[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray41[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray41, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "()V")
	@Override
	protected void method6815() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

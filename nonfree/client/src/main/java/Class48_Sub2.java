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

@OriginalClass("client!tf")
public final class Class48_Sub2 extends Class48 {

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
	private int anInt4097;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
	@Override
	protected void method3215() {
		@Pc(1) short local1 = 256;
		if (Static130.aBoolean114) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray464[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray55[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray55[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray55, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()I")
	@Override
	protected int method3235() {
		return this.anInt4097 - (this.aSourceDataLine1.available() >> (Static130.aBoolean114 ? 2 : 1));
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()V")
	@Override
	protected void method3232() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3229(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(5) int local5 = 0; local5 < local1.length; local5++) {
				@Pc(19) Info local19 = local1[local5];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean194 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static50.anInt1044, 16, Static130.aBoolean114 ? 2 : 1, true, false);
		this.aByteArray55 = new byte[0x100 << (Static130.aBoolean114 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()V")
	@Override
	protected void method3217() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean194) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4097 << (Static130.aBoolean114 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	@Override
	public void method3218(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static130.aBoolean114 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4097 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static69.method1013(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3218(Static194.method3146(arg0));
			}
		}
	}
}

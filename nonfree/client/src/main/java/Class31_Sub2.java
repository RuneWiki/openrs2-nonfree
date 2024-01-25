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

@OriginalClass("client!fs")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!fs", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fs", name = "P", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!fs", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fs", name = "R", descriptor = "I")
	private int anInt2744;

	@OriginalMember(owner = "client!fs", name = "N", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "()V")
	@Override
	protected void method2015() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean175) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2744 << (Static344.aBoolean402 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "()V")
	@Override
	protected void method2008() {
		@Pc(1) short local1 = 256;
		if (Static344.aBoolean402) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray287[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray37[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray37[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray37, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "()V")
	@Override
	protected void method2020() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
	@Override
	protected int method2003() {
		return this.anInt2744 - (this.aSourceDataLine1.available() >> (Static344.aBoolean402 ? 2 : 1));
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2007(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean175 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static84.anInt2035, 16, Static344.aBoolean402 ? 2 : 1, true, false);
		this.aByteArray37 = new byte[0x100 << (Static344.aBoolean402 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	@Override
	public void method2002(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static344.aBoolean402 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2744 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static391.method5429(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2002(Static427.method5762(arg0));
			}
		}
	}
}

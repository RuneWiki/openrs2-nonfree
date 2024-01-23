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

@OriginalClass("client!lm")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
	private int anInt2960;

	@OriginalMember(owner = "client!lm", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!lm", name = "T", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!lm", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "()V")
	@Override
	protected void method2459() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean221) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2960 << (Static129.aBoolean297 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	@Override
	protected void method2454() {
		@Pc(1) short local1 = 256;
		if (Static129.aBoolean297) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray365[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray65[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray65[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray65, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()I")
	@Override
	protected int method2456() {
		return this.anInt2960 - (this.aSourceDataLine1.available() >> (Static129.aBoolean297 ? 2 : 1));
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method2457(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static129.aBoolean297 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2960 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static110.method1727(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2457(Static182.method2762(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2467(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(26) String local26 = local19.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean221 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static234.anInt4892, 16, Static129.aBoolean297 ? 2 : 1, true, false);
		this.aByteArray65 = new byte[0x100 << (Static129.aBoolean297 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "()V")
	@Override
	protected void method2461() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

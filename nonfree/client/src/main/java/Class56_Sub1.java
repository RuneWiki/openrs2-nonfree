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

@OriginalClass("client!nb")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	private int anInt2712;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	@Override
	public void method2446(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static150.aBoolean144 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2712 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static210.method3305(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2446(Static91.method1315(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()I")
	@Override
	protected int method2453() {
		return this.anInt2712 - (this.aSourceDataLine1.available() >> (Static150.aBoolean144 ? 2 : 1));
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	@Override
	protected void method2452() {
		@Pc(1) short local1 = 256;
		if (Static150.aBoolean144) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray251[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray29[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray29[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray29, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2450(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(24) String local24 = local17.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean133 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static91.anInt1796, 16, Static150.aBoolean144 ? 2 : 1, true, false);
		this.aByteArray29 = new byte[0x100 << (Static150.aBoolean144 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
	@Override
	protected void method2455() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean133) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2712 << (Static150.aBoolean144 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()V")
	@Override
	protected void method2458() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

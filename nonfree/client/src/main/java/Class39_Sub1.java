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

@OriginalClass("client!bv")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
	private int anInt1467;

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!bv", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!bv", name = "K", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "()V")
	@Override
	protected void method5067() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean111) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1467 << (Static267.aBoolean348 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
	@Override
	protected void method5058() {
		@Pc(1) short local1 = 256;
		if (Static267.aBoolean348) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray415[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray16[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray16[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray16, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5064(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(24) String local24 = local17.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean111 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static77.anInt2079, 16, Static267.aBoolean348 ? 2 : 1, true, false);
		this.aByteArray16 = new byte[0x100 << (Static267.aBoolean348 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "()V")
	@Override
	protected void method5069() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
	@Override
	public void method5065(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static267.aBoolean348 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1467 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static496.method7132(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5065(Static117.method2662(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "()I")
	@Override
	protected int method5070() {
		return this.anInt1467 - (this.aSourceDataLine1.available() >> (Static267.aBoolean348 ? 2 : 1));
	}
}

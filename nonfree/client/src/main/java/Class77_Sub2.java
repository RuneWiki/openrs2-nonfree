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

@OriginalClass("client!qp")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
	private int anInt5484;

	@OriginalMember(owner = "client!qp", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qp", name = "M", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!qp", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "Z")
	private boolean aBoolean445 = false;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "()V")
	@Override
	protected void method4263() {
		@Pc(1) short local1 = 256;
		if (Static25.aBoolean39) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray329[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray62[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray62[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray62, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "()I")
	@Override
	protected int method4275() {
		return this.anInt5484 - (this.aSourceDataLine1.available() >> (Static25.aBoolean39 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "()V")
	@Override
	protected void method4277() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
	@Override
	public void method4268(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static25.aBoolean39 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5484 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static190.method2503(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4268(Static88.method1286(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "()V")
	@Override
	protected void method4273() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean445) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5484 << (Static25.aBoolean39 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4269(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(20) String local20 = local15.getName();
					if (local20 != null && local20.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean445 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static155.anInt2607, 16, Static25.aBoolean39 ? 2 : 1, true, false);
		this.aByteArray62 = new byte[0x100 << (Static25.aBoolean39 ? 2 : 1)];
	}
}

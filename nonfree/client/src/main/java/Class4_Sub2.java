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

@OriginalClass("client!re")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!re", name = "F", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "I")
	private int anInt3671;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()V")
	@Override
	protected void method2769() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean147) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3671 << (Static128.aBoolean131 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
	@Override
	protected int method2766() {
		return this.anInt3671 - (this.aSourceDataLine1.available() >> (Static128.aBoolean131 ? 2 : 1));
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	@Override
	public void method2783(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static128.aBoolean131 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3671 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static209.method3286(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2783(Static50.method921(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()V")
	@Override
	protected void method2768() {
		@Pc(1) short local1 = 256;
		if (Static128.aBoolean131) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray429[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray44[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray44[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray44, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()V")
	@Override
	protected void method2770() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2774(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(27) String local27 = local20.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean147 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static178.anInt4019, 16, Static128.aBoolean131 ? 2 : 1, true, false);
		this.aByteArray44 = new byte[0x100 << (Static128.aBoolean131 ? 2 : 1)];
	}
}

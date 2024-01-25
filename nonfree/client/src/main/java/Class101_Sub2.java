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

@OriginalClass("client!sg")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	private int anInt6046;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4848(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(27) String local27 = local20.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean535 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static234.anInt4244, 16, Static167.aBoolean276 ? 2 : 1, true, false);
		this.aByteArray86 = new byte[0x100 << (Static167.aBoolean276 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	@Override
	public void method4854(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static167.aBoolean276 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6046 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static213.method3092(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4854(Static191.method2764(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
	@Override
	protected void method4850() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean535) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6046 << (Static167.aBoolean276 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()V")
	@Override
	protected void method4853() {
		@Pc(1) short local1 = 256;
		if (Static167.aBoolean276) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray454[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray86[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray86[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray86, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "()V")
	@Override
	protected void method4858() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
	@Override
	protected int method4845() {
		return this.anInt6046 - (this.aSourceDataLine1.available() >> (Static167.aBoolean276 ? 2 : 1));
	}
}

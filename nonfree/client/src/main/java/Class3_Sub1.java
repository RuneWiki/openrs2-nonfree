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

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
	@Override
	protected void method109() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean9) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt134 << (Static29.aBoolean31 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	@Override
	public void method98(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static29.aBoolean31 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt134 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static148.method2209(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method98(Static131.method1032(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()I")
	@Override
	protected int method111() {
		return this.anInt134 - (this.aSourceDataLine1.available() >> (Static29.aBoolean31 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	@Override
	protected void method99() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method103(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean9 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static88.anInt1852, 16, Static29.aBoolean31 ? 2 : 1, true, false);
		this.aByteArray1 = new byte[0x100 << (Static29.aBoolean31 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
	@Override
	protected void method104() {
		@Pc(1) short local1 = 256;
		if (Static29.aBoolean31) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray14[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray1[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray1[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray1, 0, local1 << 1);
	}
}

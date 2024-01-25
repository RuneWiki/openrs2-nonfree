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

@OriginalClass("client!ei")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
	private int anInt1842;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
	@Override
	protected void method1491() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean130) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1842 << (Static257.aBoolean291 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1483(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean130 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static333.anInt5628, 16, Static257.aBoolean291 ? 2 : 1, true, false);
		this.aByteArray12 = new byte[0x100 << (Static257.aBoolean291 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	@Override
	public void method1488(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static257.aBoolean291 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1842 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static259.method3496(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1488(Static29.method453(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()I")
	@Override
	protected int method1489() {
		return this.anInt1842 - (this.aSourceDataLine1.available() >> (Static257.aBoolean291 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()V")
	@Override
	protected void method1493() {
		@Pc(1) short local1 = 256;
		if (Static257.aBoolean291) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray141[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray12[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray12[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray12, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	@Override
	protected void method1482() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}

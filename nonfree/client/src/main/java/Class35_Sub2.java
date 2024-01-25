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

@OriginalClass("client!gl")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
	private int anInt3258;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "()V")
	@Override
	protected void method2743() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
	@Override
	protected void method2733() {
		@Pc(1) short local1 = 256;
		if (Static452.aBoolean540) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray215[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray41[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray41[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray41, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2741(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(26) String local26 = local20.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean239 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static283.anInt7446, 16, Static452.aBoolean540 ? 2 : 1, true, false);
		this.aByteArray41 = new byte[0x100 << (Static452.aBoolean540 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "()V")
	@Override
	protected void method2747() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean239) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3258 << (Static452.aBoolean540 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	@Override
	public void method2748(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static452.aBoolean540 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3258 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static155.method2315(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2748(Static350.method4699(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "()I")
	@Override
	protected int method2744() {
		return this.anInt3258 - (this.aSourceDataLine1.available() >> (Static452.aBoolean540 ? 2 : 1));
	}
}

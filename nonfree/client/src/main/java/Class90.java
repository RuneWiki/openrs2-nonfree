import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class90 {

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public int anInt2630;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	private int anInt2631;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public int anInt2632;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
	public int anInt2633;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
	private int anInt2634;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
	private int anInt2636;

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
	public int anInt2637;

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
	public int anInt2638;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
	public int anInt2639;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "Lclient!qa;")
	public Class142 aClass142_1;

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
	private int anInt2641;

	@OriginalMember(owner = "client!jn", name = "B", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
	private int anInt2644;

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "[F")
	public float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "Z")
	public boolean aBoolean195 = false;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class90(@OriginalArg(0) Class3_Sub26 arg0) {
		if (Static136.anIntArray307 == null) {
			Static29.method448();
		}
		this.anInt2638 = arg0.method3915();
		this.aBoolean197 = (this.anInt2638 & 0x10) != 0;
		this.aBoolean196 = (this.anInt2638 & 0x8) != 0;
		this.anInt2638 &= 0x7;
		this.anInt2630 = arg0.method3948();
		this.anInt2639 = arg0.method3948();
		this.anInt2632 = arg0.method3948();
		this.anInt2633 = arg0.method3915();
		this.method2332();
		this.aShortArray69 = new short[this.anInt2633 * 2 + 1];
		@Pc(80) int local80;
		for (local80 = 0; local80 < this.aShortArray69.length; local80++) {
			this.aShortArray69[local80] = (short) arg0.method3948();
		}
		this.anInt2635 = Static16.anIntArray25[arg0.method3948()];
		local80 = arg0.method3915();
		this.anInt2641 = (local80 & 0xE0) << 3;
		this.anInt2637 = local80 & 0x1F;
		if (this.anInt2637 != 31) {
			this.method2333();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	private void method2332() {
		@Pc(10) int local10 = (this.anInt2633 << 7) + 64;
		this.aFloat43 = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	private void method2333() {
		@Pc(12) int local12 = this.anInt2637;
		if (local12 == 2) {
			this.anInt2631 = 2048;
			this.anInt2634 = 0;
			this.anInt2644 = 1;
			this.anInt2636 = 2048;
		} else if (local12 == 3) {
			this.anInt2644 = 1;
			this.anInt2631 = 2048;
			this.anInt2636 = 4096;
			this.anInt2634 = 0;
		} else if (local12 == 4) {
			this.anInt2636 = 2048;
			this.anInt2631 = 2048;
			this.anInt2634 = 0;
			this.anInt2644 = 4;
		} else if (local12 == 5) {
			this.anInt2634 = 0;
			this.anInt2636 = 8192;
			this.anInt2631 = 2048;
			this.anInt2644 = 4;
		} else if (local12 == 12) {
			this.anInt2634 = 0;
			this.anInt2636 = 2048;
			this.anInt2644 = 2;
			this.anInt2631 = 2048;
		} else if (local12 == 13) {
			this.anInt2634 = 0;
			this.anInt2644 = 2;
			this.anInt2636 = 8192;
			this.anInt2631 = 2048;
		} else if (local12 == 10) {
			this.anInt2636 = 2048;
			this.anInt2644 = 3;
			this.anInt2631 = 512;
			this.anInt2634 = 1536;
		} else if (local12 == 11) {
			this.anInt2631 = 512;
			this.anInt2644 = 3;
			this.anInt2634 = 1536;
			this.anInt2636 = 4096;
		} else if (local12 == 6) {
			this.anInt2644 = 3;
			this.anInt2631 = 768;
			this.anInt2634 = 1280;
			this.anInt2636 = 2048;
		} else if (local12 == 7) {
			this.anInt2634 = 1280;
			this.anInt2644 = 3;
			this.anInt2636 = 4096;
			this.anInt2631 = 768;
		} else if (local12 == 8) {
			this.anInt2634 = 1024;
			this.anInt2644 = 3;
			this.anInt2636 = 2048;
			this.anInt2631 = 1024;
		} else if (local12 == 9) {
			this.anInt2631 = 1024;
			this.anInt2636 = 4096;
			this.anInt2644 = 3;
			this.anInt2634 = 1024;
		} else if (local12 == 14) {
			this.anInt2631 = 768;
			this.anInt2634 = 1280;
			this.anInt2636 = 2048;
			this.anInt2644 = 1;
		} else if (local12 == 15) {
			this.anInt2634 = 1536;
			this.anInt2644 = 1;
			this.anInt2636 = 4096;
			this.anInt2631 = 512;
		} else if (local12 == 16) {
			this.anInt2634 = 1792;
			this.anInt2631 = 256;
			this.anInt2644 = 1;
			this.anInt2636 = 8192;
		} else {
			this.anInt2636 = 2048;
			this.anInt2644 = 0;
			this.anInt2634 = 0;
			this.anInt2631 = 2048;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V")
	public void method2335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2636 = arg1;
		this.anInt2631 = arg0;
		this.anInt2644 = arg3;
		this.anInt2634 = arg2;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZ)V")
	public void method2336(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(25) int local25 = this.anInt2641 + this.anInt2636 * arg0 / 50 & 0x7FF;
		@Pc(28) int local28 = this.anInt2644;
		@Pc(58) int local58;
		if (local28 == 1) {
			local58 = (Class11.anIntArray26[local25] >> 6) + 1024;
		} else if (local28 == 3) {
			local58 = Static136.anIntArray307[local25] >> 1;
		} else if (local28 == 4) {
			local58 = local25 >> 10 << 11;
		} else if (local28 == 2) {
			local58 = local25;
		} else if (local28 == 5) {
			local58 = (local25 >= 1024 ? 2048 - local25 : local25) << 1;
		} else {
			local58 = 2048;
		}
		if (arg1) {
			local58 = 2048;
		}
		this.aFloat42 = (float) ((this.anInt2631 * local58 >> 11) + this.anInt2634) / 2048.0F;
		@Pc(122) float local122 = this.aFloat42 / 255.0F;
		this.aFloatArray8[2] = (float) (this.anInt2635 & 0xFF) * local122;
		this.aFloatArray8[0] = local122 * (float) (this.anInt2635 >> 16 & 0xFF);
		this.aFloatArray8[1] = local122 * (float) (this.anInt2635 >> 8 & 0xFF);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class90 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public int anInt2634;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!uh;")
	public Class171 aClass171_1;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	private int anInt2637;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	public int anInt2638;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	private int anInt2639;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private int anInt2640;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	private int anInt2641;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	public int anInt2644;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!k", name = "C", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "I")
	private int anInt2653;

	@OriginalMember(owner = "client!k", name = "G", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!k", name = "H", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[F")
	public float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class90(@OriginalArg(0) Class2_Sub26 arg0) {
		if (Static292.anIntArray519 == null) {
			Static2.method4757();
		}
		this.anInt2654 = arg0.method4261();
		this.aBoolean214 = (this.anInt2654 & 0x10) != 0;
		this.aBoolean213 = (this.anInt2654 & 0x8) != 0;
		this.anInt2654 &= 0x7;
		this.anInt2635 = arg0.method4242();
		this.anInt2649 = arg0.method4242();
		this.anInt2644 = arg0.method4242();
		this.anInt2652 = arg0.method4261();
		this.method2253();
		this.aShortArray39 = new short[this.anInt2652 * 2 + 1];
		@Pc(84) int local84;
		for (local84 = 0; local84 < this.aShortArray39.length; local84++) {
			this.aShortArray39[local84] = (short) arg0.method4242();
		}
		this.anInt2638 = Static93.anIntArray152[arg0.method4242()];
		local84 = arg0.method4261();
		this.anInt2640 = (local84 & 0xE0) << 3;
		this.anInt2634 = local84 & 0x1F;
		if (this.anInt2634 != 31) {
			this.method2256();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBZ)V")
	public void method2250(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = this.anInt2640 + this.anInt2639 * arg0 / 50 & 0x7FF;
		@Pc(24) int local24 = this.anInt2641;
		@Pc(61) int local61;
		if (local24 == 1) {
			local61 = (Class66.anIntArray148[local17] >> 6) + 1024;
		} else if (local24 == 3) {
			local61 = Static292.anIntArray519[local17] >> 1;
		} else if (local24 == 4) {
			local61 = local17 >> 10 << 11;
		} else if (local24 == 2) {
			local61 = local17;
		} else if (local24 == 5) {
			local61 = (local17 >= 1024 ? 2048 - local17 : local17) << 1;
		} else {
			local61 = 2048;
		}
		if (arg1) {
			local61 = 2048;
		}
		this.aFloat29 = (float) (this.anInt2653 + (local61 * this.anInt2637 >> 11)) / 2048.0F;
		@Pc(124) float local124 = this.aFloat29 / 255.0F;
		this.aFloatArray17[2] = (float) (this.anInt2638 & 0xFF) * local124;
		this.aFloatArray17[1] = local124 * (float) (this.anInt2638 >> 8 & 0xFF);
		this.aFloatArray17[0] = (float) (this.anInt2638 >> 16 & 0xFF) * local124;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	private void method2253() {
		@Pc(10) int local10 = (this.anInt2652 << 7) + 64;
		this.aFloat30 = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIBI)V")
	public void method2254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2653 = arg3;
		this.anInt2637 = arg0;
		this.anInt2641 = arg2;
		this.anInt2639 = arg1;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	private void method2256() {
		@Pc(8) int local8 = this.anInt2634;
		if (local8 == 2) {
			this.anInt2653 = 0;
			this.anInt2641 = 1;
			this.anInt2637 = 2048;
			this.anInt2639 = 2048;
		} else if (local8 == 3) {
			this.anInt2641 = 1;
			this.anInt2653 = 0;
			this.anInt2637 = 2048;
			this.anInt2639 = 4096;
		} else if (local8 == 4) {
			this.anInt2641 = 4;
			this.anInt2639 = 2048;
			this.anInt2637 = 2048;
			this.anInt2653 = 0;
		} else if (local8 == 5) {
			this.anInt2653 = 0;
			this.anInt2639 = 8192;
			this.anInt2637 = 2048;
			this.anInt2641 = 4;
		} else if (local8 == 12) {
			this.anInt2641 = 2;
			this.anInt2637 = 2048;
			this.anInt2653 = 0;
			this.anInt2639 = 2048;
		} else if (local8 == 13) {
			this.anInt2641 = 2;
			this.anInt2653 = 0;
			this.anInt2639 = 8192;
			this.anInt2637 = 2048;
		} else if (local8 == 10) {
			this.anInt2653 = 1536;
			this.anInt2641 = 3;
			this.anInt2637 = 512;
			this.anInt2639 = 2048;
		} else if (local8 == 11) {
			this.anInt2639 = 4096;
			this.anInt2641 = 3;
			this.anInt2637 = 512;
			this.anInt2653 = 1536;
		} else if (local8 == 6) {
			this.anInt2639 = 2048;
			this.anInt2641 = 3;
			this.anInt2637 = 768;
			this.anInt2653 = 1280;
		} else if (local8 == 7) {
			this.anInt2641 = 3;
			this.anInt2653 = 1280;
			this.anInt2637 = 768;
			this.anInt2639 = 4096;
		} else if (local8 == 8) {
			this.anInt2639 = 2048;
			this.anInt2637 = 1024;
			this.anInt2653 = 1024;
			this.anInt2641 = 3;
		} else if (local8 == 9) {
			this.anInt2653 = 1024;
			this.anInt2641 = 3;
			this.anInt2637 = 1024;
			this.anInt2639 = 4096;
		} else if (local8 == 14) {
			this.anInt2639 = 2048;
			this.anInt2641 = 1;
			this.anInt2653 = 1280;
			this.anInt2637 = 768;
		} else if (local8 == 15) {
			this.anInt2641 = 1;
			this.anInt2653 = 1536;
			this.anInt2637 = 512;
			this.anInt2639 = 4096;
		} else if (local8 == 16) {
			this.anInt2653 = 1792;
			this.anInt2637 = 256;
			this.anInt2639 = 8192;
			this.anInt2641 = 1;
		} else {
			this.anInt2637 = 2048;
			this.anInt2641 = 0;
			this.anInt2639 = 2048;
			this.anInt2653 = 0;
		}
	}
}

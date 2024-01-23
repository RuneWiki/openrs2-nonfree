import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class144 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	public int anInt4484;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
	public boolean aBoolean347;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	private int anInt4488;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!wf;")
	public Class178 aClass178_1;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public int anInt4490;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	public int anInt4492;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	private int anInt4494;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	private int anInt4495;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public int anInt4497;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private int anInt4498;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "I")
	public int anInt4499;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	private int anInt4501;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "Z")
	public boolean aBoolean348;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "I")
	public int anInt4502;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public int anInt4503;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "[F")
	public float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Z")
	public boolean aBoolean349 = false;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class144(@OriginalArg(0) Class1_Sub11 arg0) {
		if (Static203.anIntArray369 == null) {
			Static103.method1916();
		}
		this.anInt4492 = arg0.method2690();
		this.aBoolean347 = (this.anInt4492 & 0x8) != 0;
		this.aBoolean348 = (this.anInt4492 & 0x10) != 0;
		this.anInt4492 &= 0x7;
		this.anInt4502 = arg0.method2691();
		this.anInt4490 = arg0.method2691();
		this.anInt4484 = arg0.method2691();
		this.anInt4503 = arg0.method2690();
		this.method3555();
		this.aShortArray75 = new short[this.anInt4503 * 2 + 1];
		@Pc(87) int local87;
		for (local87 = 0; local87 < this.aShortArray75.length; local87++) {
			this.aShortArray75[local87] = (short) arg0.method2691();
		}
		this.anInt4497 = Static110.anIntArray224[arg0.method2691()];
		local87 = arg0.method2690();
		this.anInt4501 = (local87 & 0xE0) << 3;
		this.anInt4499 = local87 & 0x1F;
		if (this.anInt4499 != 31) {
			this.method3556();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public void method3549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4498 = arg2;
		this.anInt4495 = arg3;
		this.anInt4494 = arg1;
		this.anInt4488 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V")
	public void method3551(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) int local17 = this.anInt4501 + this.anInt4488 * arg0 / 50 & 0x7FF;
		@Pc(20) int local20 = this.anInt4494;
		@Pc(52) int local52;
		if (local20 == 1) {
			local52 = (Class68.anIntArray229[local17] >> 6) + 1024;
		} else if (local20 == 3) {
			local52 = Static203.anIntArray369[local17] >> 1;
		} else if (local20 == 4) {
			local52 = local17 >> 10 << 11;
		} else if (local20 == 2) {
			local52 = local17;
		} else if (local20 == 5) {
			local52 = (local17 < 1024 ? local17 : 2048 - local17) << 1;
		} else {
			local52 = 2048;
		}
		if (arg1) {
			local52 = 2048;
		}
		this.aFloat45 = (float) (this.anInt4495 + (this.anInt4498 * local52 >> 11)) / 2048.0F;
		@Pc(121) float local121 = this.aFloat45 / 255.0F;
		this.aFloatArray19[0] = local121 * (float) (this.anInt4497 >> 16 & 0xFF);
		this.aFloatArray19[2] = (float) (this.anInt4497 & 0xFF) * local121;
		this.aFloatArray19[1] = local121 * (float) (this.anInt4497 >> 8 & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	private void method3555() {
		@Pc(10) int local10 = (this.anInt4503 << 7) + 64;
		this.aFloat46 = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	private void method3556() {
		@Pc(12) int local12 = this.anInt4499;
		if (local12 == 2) {
			this.anInt4494 = 1;
			this.anInt4498 = 2048;
			this.anInt4488 = 2048;
			this.anInt4495 = 0;
		} else if (local12 == 3) {
			this.anInt4488 = 4096;
			this.anInt4498 = 2048;
			this.anInt4494 = 1;
			this.anInt4495 = 0;
		} else if (local12 == 4) {
			this.anInt4495 = 0;
			this.anInt4494 = 4;
			this.anInt4488 = 2048;
			this.anInt4498 = 2048;
		} else if (local12 == 5) {
			this.anInt4494 = 4;
			this.anInt4495 = 0;
			this.anInt4498 = 2048;
			this.anInt4488 = 8192;
		} else if (local12 == 12) {
			this.anInt4488 = 2048;
			this.anInt4494 = 2;
			this.anInt4498 = 2048;
			this.anInt4495 = 0;
		} else if (local12 == 13) {
			this.anInt4494 = 2;
			this.anInt4488 = 8192;
			this.anInt4495 = 0;
			this.anInt4498 = 2048;
		} else if (local12 == 10) {
			this.anInt4488 = 2048;
			this.anInt4494 = 3;
			this.anInt4495 = 1536;
			this.anInt4498 = 512;
		} else if (local12 == 11) {
			this.anInt4498 = 512;
			this.anInt4488 = 4096;
			this.anInt4495 = 1536;
			this.anInt4494 = 3;
		} else if (local12 == 6) {
			this.anInt4495 = 1280;
			this.anInt4488 = 2048;
			this.anInt4498 = 768;
			this.anInt4494 = 3;
		} else if (local12 == 7) {
			this.anInt4488 = 4096;
			this.anInt4498 = 768;
			this.anInt4494 = 3;
			this.anInt4495 = 1280;
		} else if (local12 == 8) {
			this.anInt4498 = 1024;
			this.anInt4495 = 1024;
			this.anInt4494 = 3;
			this.anInt4488 = 2048;
		} else if (local12 == 9) {
			this.anInt4498 = 1024;
			this.anInt4494 = 3;
			this.anInt4488 = 4096;
			this.anInt4495 = 1024;
		} else if (local12 == 14) {
			this.anInt4494 = 1;
			this.anInt4488 = 2048;
			this.anInt4498 = 768;
			this.anInt4495 = 1280;
		} else if (local12 == 15) {
			this.anInt4498 = 512;
			this.anInt4495 = 1536;
			this.anInt4488 = 4096;
			this.anInt4494 = 1;
		} else if (local12 == 16) {
			this.anInt4498 = 256;
			this.anInt4488 = 8192;
			this.anInt4495 = 1792;
			this.anInt4494 = 1;
		} else {
			this.anInt4494 = 0;
			this.anInt4495 = 0;
			this.anInt4488 = 2048;
			this.anInt4498 = 2048;
		}
	}
}

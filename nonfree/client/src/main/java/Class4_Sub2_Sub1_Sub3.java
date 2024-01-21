import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class4_Sub2_Sub1_Sub3 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!gf", name = "Yb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!gf", name = "Zb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!gf", name = "ec", descriptor = "I")
	public int anInt1105;

	@OriginalMember(owner = "client!gf", name = "hc", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!gf", name = "ic", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!gf", name = "oc", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!gf", name = "zc", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!gf", name = "Ec", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!gf", name = "Hc", descriptor = "I")
	private int anInt1122;

	@OriginalMember(owner = "client!gf", name = "Ic", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!gf", name = "qc", descriptor = "I")
	private int anInt1111 = 0;

	@OriginalMember(owner = "client!gf", name = "ac", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!gf", name = "Dc", descriptor = "I")
	private int anInt1120 = 0;

	@OriginalMember(owner = "client!gf", name = "kc", descriptor = "I")
	public final int anInt1107;

	@OriginalMember(owner = "client!gf", name = "Cc", descriptor = "I")
	private final int anInt1119;

	@OriginalMember(owner = "client!gf", name = "nc", descriptor = "I")
	public final int anInt1110;

	@OriginalMember(owner = "client!gf", name = "rc", descriptor = "I")
	private final int anInt1112;

	@OriginalMember(owner = "client!gf", name = "yc", descriptor = "I")
	private final int anInt1117;

	@OriginalMember(owner = "client!gf", name = "wc", descriptor = "I")
	public final int anInt1115;

	@OriginalMember(owner = "client!gf", name = "uc", descriptor = "I")
	public final int anInt1114;

	@OriginalMember(owner = "client!gf", name = "fc", descriptor = "I")
	public final int anInt1106;

	@OriginalMember(owner = "client!gf", name = "xc", descriptor = "I")
	private final int anInt1116;

	@OriginalMember(owner = "client!gf", name = "lc", descriptor = "I")
	private final int anInt1108;

	@OriginalMember(owner = "client!gf", name = "Fc", descriptor = "I")
	private final int anInt1121;

	@OriginalMember(owner = "client!gf", name = "Bc", descriptor = "Lclient!bd;")
	private final Class4_Sub2_Sub2 aClass4_Sub2_Sub2_2;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub2_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1107 = arg1;
		this.anInt1119 = arg8;
		this.aBoolean50 = false;
		this.anInt1110 = arg9;
		this.anInt1112 = arg7;
		this.anInt1117 = arg3;
		this.anInt1115 = arg10;
		this.anInt1114 = arg6;
		this.anInt1106 = arg5;
		this.anInt1116 = arg2;
		this.anInt1108 = arg4;
		this.anInt1121 = arg0;
		@Pc(52) int local52 = Static35.method590(this.anInt1121).anInt2545;
		if (local52 == -1) {
			this.aClass4_Sub2_Sub2_2 = null;
		} else {
			this.aClass4_Sub2_Sub2_2 = Static116.method2017(local52);
		}
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(B)Lclient!vb;")
	@Override
	public Class4_Sub2_Sub1_Sub6 method2172() {
		@Pc(9) Class4_Sub2_Sub13 local9 = Static35.method590(this.anInt1121);
		@Pc(21) Class4_Sub2_Sub1_Sub6 local21 = local9.method1843(this.anInt1111);
		if (local21 == null) {
			return null;
		} else {
			local21.method2144(this.anInt1122);
			return local21;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	public void method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean50) {
			local9 = arg1 - this.anInt1116;
			@Pc(16) double local16 = (double) (arg3 - this.anInt1117);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble2 = this.anInt1108;
			this.aDouble3 = (double) this.anInt1119 * local16 / local25 + (double) this.anInt1117;
			this.aDouble4 = (double) this.anInt1116 + (double) this.anInt1119 * local9 / local25;
		}
		local9 = this.anInt1114 + 1 - arg0;
		this.aDouble6 = ((double) arg3 - this.aDouble3) / local9;
		this.aDouble7 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble9 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble7 * this.aDouble7);
		if (!this.aBoolean50) {
			this.aDouble8 = -this.aDouble9 * Math.tan((double) this.anInt1112 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg2 - local9 * this.aDouble8 - this.aDouble2) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
	public void method737(@OriginalArg(1) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble6;
		this.aDouble4 += (double) arg0 * this.aDouble7;
		this.aDouble2 += this.aDouble8 * (double) arg0 + (double) arg0 * 0.5D * this.aDouble5 * (double) arg0;
		this.aBoolean50 = true;
		this.aDouble8 += (double) arg0 * this.aDouble5;
		this.anInt1105 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt1122 = (int) (Math.atan2(this.aDouble8, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass4_Sub2_Sub2_2 == null) {
			return;
		}
		this.anInt1120 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass4_Sub2_Sub2_2.anIntArray35[this.anInt1111] >= this.anInt1120) {
						return;
					}
					this.anInt1120 -= this.aClass4_Sub2_Sub2_2.anIntArray35[this.anInt1111];
					this.anInt1111++;
				} while (this.aClass4_Sub2_Sub2_2.anIntArray33.length > this.anInt1111);
				this.anInt1111 -= this.aClass4_Sub2_Sub2_2.anInt320;
			} while (this.anInt1111 >= 0 && this.aClass4_Sub2_Sub2_2.anIntArray33.length > this.anInt1111);
			this.anInt1111 = 0;
		}
	}
}

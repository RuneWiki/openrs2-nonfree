import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NZKYYWQJ")
public final class Class3_Sub3_Sub2_Sub4 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!NZKYYWQJ", name = "o", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "p", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "q", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "r", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "s", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "t", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "A", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "B", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "C", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "D", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "E", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "m", descriptor = "I")
	private int anInt398 = 1612;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "G", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "L", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "n", descriptor = "Lclient!XBHNZKGU;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "F", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "H", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "I", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "J", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "x", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "y", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "u", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "v", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "w", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "K", descriptor = "I")
	public int anInt412;

	@OriginalMember(owner = "client!NZKYYWQJ", name = "<init>", descriptor = "(IIIIIIIIIIIB)V")
	public Class3_Sub3_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11) {
		try {
			this.aClass43_2 = Class43.aClass43Array1[arg3];
			this.anInt408 = arg2;
			this.anInt409 = arg8;
			this.anInt410 = arg5;
			this.anInt411 = arg7;
			this.anInt404 = arg9;
			this.anInt405 = arg1;
			this.anInt401 = arg0;
			this.anInt402 = arg10;
			this.anInt403 = arg4;
			this.anInt412 = arg6;
			this.aBoolean99 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("62819, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZKYYWQJ", name = "a", descriptor = "(I)Lclient!FCIDIKVY;")
	@Override
	protected Class3_Sub3_Sub2_Sub3 method525() {
		try {
			@Pc(3) Class3_Sub3_Sub2_Sub3 local3 = this.aClass43_2.method516();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass43_2.aClass46_1 != null) {
				local9 = this.aClass43_2.aClass46_1.anIntArray198[this.anInt406];
			}
			@Pc(32) Class3_Sub3_Sub2_Sub3 local32 = new Class3_Sub3_Sub2_Sub3(false, Class12.method116(local9), true, local3, true);
			if (local9 != -1) {
				local32.method87();
				local32.method88(local9);
				local32.anIntArrayArray3 = null;
				local32.anIntArrayArray2 = null;
			}
			if (this.aClass43_2.anInt758 != 128 || this.aClass43_2.anInt759 != 128) {
				local32.method96(this.aClass43_2.anInt758, this.aClass43_2.anInt758, this.aBoolean98, this.aClass43_2.anInt759);
			}
			local32.method92(this.anInt400);
			local32.method97(this.aClass43_2.anInt761 + 64, this.aClass43_2.anInt762 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("49840, " + 0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZKYYWQJ", name = "a", descriptor = "(IIIZI)V")
	public void method233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean99) {
				local8 = arg3 - this.anInt409;
				@Pc(14) double local14 = (double) (arg2 - this.anInt410);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt409 + local8 * (double) this.anInt402 / local23;
				this.aDouble2 = (double) this.anInt410 + local14 * (double) this.anInt402 / local23;
				this.aDouble3 = this.anInt411;
			}
			local8 = this.anInt405 + 1 - arg0;
			this.aDouble5 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean99) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt401 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("71424, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZKYYWQJ", name = "a", descriptor = "(IZ)V")
	public void method234(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean99 = true;
			this.aDouble1 += this.aDouble5 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
			this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
			this.anInt399 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt400 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass43_2.aClass46_1 != null) {
				this.anInt407 += arg0;
				while (this.anInt407 > this.aClass43_2.aClass46_1.method520(this.anInt406)) {
					this.anInt407 -= this.aClass43_2.aClass46_1.method520(this.anInt406) + 1;
					this.anInt406++;
					if (this.anInt406 >= this.aClass43_2.aClass46_1.anInt780) {
						this.anInt406 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("71877, " + arg0 + ", " + true + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}

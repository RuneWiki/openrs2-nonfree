import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
	public int anInt2392;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
	private int anInt2398;

	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!kd", name = "Kb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!kd", name = "Mb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!kd", name = "Nb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "I")
	private int anInt2399 = 0;

	@OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
	private int anInt2411 = 0;

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
	private int anInt2402 = -32768;

	@OriginalMember(owner = "client!kd", name = "Pb", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
	private final int anInt2406;

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
	public final int anInt2397;

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
	private final int anInt2389;

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "I")
	private final int anInt2405;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
	private final int anInt2388;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
	private final int anInt2395;

	@OriginalMember(owner = "client!kd", name = "Ib", descriptor = "I")
	public final int anInt2410;

	@OriginalMember(owner = "client!kd", name = "tb", descriptor = "I")
	public final int anInt2400;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
	public final int anInt2393;

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
	private final int anInt2390;

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
	public final int anInt2391;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "Lclient!kg;")
	private final Class1_Sub2_Sub14 aClass1_Sub2_Sub14_2;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class6_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2406 = arg8;
		this.anInt2397 = arg9;
		this.aBoolean98 = false;
		this.anInt2389 = arg3;
		this.anInt2405 = arg4;
		this.anInt2388 = arg0;
		this.anInt2395 = arg2;
		this.anInt2410 = arg5;
		this.anInt2400 = arg10;
		this.anInt2393 = arg6;
		this.anInt2390 = arg7;
		this.anInt2391 = arg1;
		@Pc(55) int local55 = Static18.method345(this.anInt2388).anInt1270;
		if (local55 == -1) {
			this.aClass1_Sub2_Sub14_2 = null;
		} else {
			this.aClass1_Sub2_Sub14_2 = Static173.method2924(local55);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public void method1817(@OriginalArg(1) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble1;
		this.aBoolean98 = true;
		this.aDouble5 += this.aDouble4 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble7 + (double) arg0 * 0.5D * this.aDouble3 * (double) arg0;
		this.aDouble7 += this.aDouble3 * (double) arg0;
		this.anInt2392 = (int) (Math.atan2(this.aDouble1, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt2398 = (int) (Math.atan2(this.aDouble7, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub2_Sub14_2 == null) {
			return;
		}
		this.anInt2399 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub2_Sub14_2.anIntArray282[this.anInt2411] >= this.anInt2399) {
						return;
					}
					this.anInt2399 -= this.aClass1_Sub2_Sub14_2.anIntArray282[this.anInt2411];
					this.anInt2411++;
				} while (this.aClass1_Sub2_Sub14_2.anIntArray284.length > this.anInt2411);
				this.anInt2411 -= this.aClass1_Sub2_Sub14_2.anInt2497;
			} while (this.anInt2411 >= 0 && this.aClass1_Sub2_Sub14_2.anIntArray284.length > this.anInt2411);
			this.anInt2411 = 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class6_Sub3 local3 = this.method1820();
		if (local3 != null) {
			local3.method2989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2402 = local3.method2984();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		return this.anInt2402;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lclient!bf;")
	private Class6_Sub3 method1820() {
		@Pc(4) Class1_Sub2_Sub9 local4 = Static18.method345(this.anInt2388);
		@Pc(15) Class6_Sub3 local15 = local4.method823(this.anInt2411);
		if (local15 == null) {
			return null;
		} else {
			local15.method1182(this.anInt2398);
			return local15;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	public void method1823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean98) {
			local8 = arg0 - this.anInt2395;
			@Pc(15) double local15 = (double) (arg3 - this.anInt2389);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble6 = (double) this.anInt2395 + local8 * (double) this.anInt2406 / local24;
			this.aDouble2 = this.anInt2405;
			this.aDouble5 = (double) this.anInt2406 * local15 / local24 + (double) this.anInt2389;
		}
		local8 = this.anInt2393 + 1 - arg1;
		this.aDouble4 = ((double) arg3 - this.aDouble5) / local8;
		this.aDouble1 = ((double) arg0 - this.aDouble6) / local8;
		this.aDouble8 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean98) {
			this.aDouble7 = -this.aDouble8 * Math.tan((double) this.anInt2390 * 0.02454369D);
		}
		this.aDouble3 = ((double) arg2 - this.aDouble2 - local8 * this.aDouble7) * 2.0D / (local8 * local8);
	}
}

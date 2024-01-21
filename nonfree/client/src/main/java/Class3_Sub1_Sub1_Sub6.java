import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class3_Sub1_Sub1_Sub6 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!n", name = "pb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!n", name = "rb", descriptor = "I")
	public int anInt2341;

	@OriginalMember(owner = "client!n", name = "vb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!n", name = "Hb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!n", name = "Qb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!n", name = "Vb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!n", name = "ac", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!n", name = "ec", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!n", name = "fc", descriptor = "I")
	private int anInt2365;

	@OriginalMember(owner = "client!n", name = "ic", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!n", name = "Cb", descriptor = "I")
	private int anInt2348 = 0;

	@OriginalMember(owner = "client!n", name = "Nb", descriptor = "I")
	private int anInt2356 = 0;

	@OriginalMember(owner = "client!n", name = "Zb", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!n", name = "Fb", descriptor = "I")
	private final int anInt2351;

	@OriginalMember(owner = "client!n", name = "gc", descriptor = "I")
	private final int anInt2366;

	@OriginalMember(owner = "client!n", name = "Sb", descriptor = "I")
	private final int anInt2359;

	@OriginalMember(owner = "client!n", name = "dc", descriptor = "I")
	private final int anInt2364;

	@OriginalMember(owner = "client!n", name = "zb", descriptor = "I")
	public final int anInt2346;

	@OriginalMember(owner = "client!n", name = "Ub", descriptor = "I")
	public final int anInt2360;

	@OriginalMember(owner = "client!n", name = "cc", descriptor = "I")
	private final int anInt2363;

	@OriginalMember(owner = "client!n", name = "sb", descriptor = "I")
	public final int anInt2342;

	@OriginalMember(owner = "client!n", name = "Mb", descriptor = "I")
	public final int anInt2355;

	@OriginalMember(owner = "client!n", name = "ob", descriptor = "I")
	public final int anInt2340;

	@OriginalMember(owner = "client!n", name = "yb", descriptor = "I")
	private final int anInt2345;

	@OriginalMember(owner = "client!n", name = "Ob", descriptor = "Lclient!nf;")
	private final Class3_Sub1_Sub14 aClass3_Sub1_Sub14_3;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2351 = arg3;
		this.anInt2366 = arg8;
		this.anInt2359 = arg4;
		this.anInt2364 = arg0;
		this.anInt2346 = arg1;
		this.anInt2360 = arg10;
		this.anInt2363 = arg2;
		this.anInt2342 = arg5;
		this.anInt2355 = arg9;
		this.anInt2340 = arg6;
		this.anInt2345 = arg7;
		this.aBoolean86 = false;
		@Pc(52) int local52 = Static105.method2024(this.anInt2364).anInt1593;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub14_3 = null;
		} else {
			this.aClass3_Sub1_Sub14_3 = Static109.method2054(local52);
		}
	}

	@OriginalMember(owner = "client!n", name = "j", descriptor = "(I)Lclient!ea;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method2225() {
		@Pc(8) Class3_Sub1_Sub9 local8 = Static105.method2024(this.anInt2364);
		@Pc(14) Class3_Sub1_Sub1_Sub4 local14 = local8.method1055(this.anInt2356);
		if (local14 == null) {
			return null;
		} else {
			local14.method641(this.anInt2365);
			return local14;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBIII)V")
	public void method1523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean86) {
			local14 = arg3 - this.anInt2363;
			@Pc(20) double local20 = (double) (arg1 - this.anInt2351);
			@Pc(29) double local29 = Math.sqrt(local14 * local14 + local20 * local20);
			this.aDouble5 = (double) this.anInt2366 * local20 / local29 + (double) this.anInt2351;
			this.aDouble3 = local14 * (double) this.anInt2366 / local29 + (double) this.anInt2363;
			this.aDouble4 = this.anInt2359;
		}
		local14 = this.anInt2340 + 1 - arg2;
		this.aDouble6 = ((double) arg1 - this.aDouble5) / local14;
		this.aDouble7 = ((double) arg3 - this.aDouble3) / local14;
		this.aDouble9 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble6 * this.aDouble6);
		if (!this.aBoolean86) {
			this.aDouble8 = -this.aDouble9 * Math.tan((double) this.anInt2345 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg0 - local14 * this.aDouble8 - this.aDouble4) * 2.0D / (local14 * local14);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	public void method1526(@OriginalArg(1) int arg0) {
		this.aDouble4 += this.aDouble2 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble8 * (double) arg0;
		this.aBoolean86 = true;
		this.aDouble3 += (double) arg0 * this.aDouble7;
		this.aDouble8 += (double) arg0 * this.aDouble2;
		this.aDouble5 += (double) arg0 * this.aDouble6;
		this.anInt2341 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt2365 = (int) (Math.atan2(this.aDouble8, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub14_3 == null) {
			return;
		}
		this.anInt2348 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2348 <= this.aClass3_Sub1_Sub14_3.anIntArray247[this.anInt2356]) {
						return;
					}
					this.anInt2348 -= this.aClass3_Sub1_Sub14_3.anIntArray247[this.anInt2356];
					this.anInt2356++;
				} while (this.aClass3_Sub1_Sub14_3.anIntArray243.length > this.anInt2356);
				this.anInt2356 -= this.aClass3_Sub1_Sub14_3.anInt2478;
			} while (this.anInt2356 >= 0 && this.anInt2356 < this.aClass3_Sub1_Sub14_3.anIntArray243.length);
			this.anInt2356 = 0;
		}
	}
}

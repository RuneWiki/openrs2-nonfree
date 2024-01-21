import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub1_Sub8_Sub5 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!sa", name = "rb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!sa", name = "tb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
	private int anInt2361;

	@OriginalMember(owner = "client!sa", name = "xb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!sa", name = "yb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!sa", name = "Bb", descriptor = "I")
	public int anInt2363;

	@OriginalMember(owner = "client!sa", name = "Eb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!sa", name = "Kb", descriptor = "I")
	private int anInt2371 = 0;

	@OriginalMember(owner = "client!sa", name = "Ob", descriptor = "I")
	private int anInt2374 = 0;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "I")
	private final int anInt2362;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
	private final int anInt2358;

	@OriginalMember(owner = "client!sa", name = "Jb", descriptor = "I")
	private final int anInt2370;

	@OriginalMember(owner = "client!sa", name = "Db", descriptor = "I")
	private final int anInt2365;

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
	private final int anInt2359;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
	public final int anInt2357;

	@OriginalMember(owner = "client!sa", name = "Ib", descriptor = "I")
	public final int anInt2369;

	@OriginalMember(owner = "client!sa", name = "Sb", descriptor = "I")
	public final int anInt2378;

	@OriginalMember(owner = "client!sa", name = "Gb", descriptor = "I")
	private final int anInt2367;

	@OriginalMember(owner = "client!sa", name = "Qb", descriptor = "I")
	public final int anInt2376;

	@OriginalMember(owner = "client!sa", name = "Pb", descriptor = "I")
	public final int anInt2375;

	@OriginalMember(owner = "client!sa", name = "Lb", descriptor = "Lclient!s;")
	private final Class1_Sub1_Sub14 aClass1_Sub1_Sub14_2;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub8_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2362 = arg0;
		this.anInt2358 = arg2;
		this.anInt2370 = arg3;
		this.anInt2365 = arg7;
		this.anInt2359 = arg4;
		this.anInt2357 = arg9;
		this.anInt2369 = arg6;
		this.anInt2378 = arg10;
		this.anInt2367 = arg8;
		this.aBoolean131 = false;
		this.anInt2376 = arg1;
		this.anInt2375 = arg5;
		@Pc(52) int local52 = Static53.method1838(this.anInt2362).anInt1784;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub14_2 = null;
		} else {
			this.aClass1_Sub1_Sub14_2 = Static30.method574(local52);
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)Lclient!pc;")
	@Override
	protected Class1_Sub1_Sub8_Sub3 method1835() {
		@Pc(4) Class1_Sub1_Sub11 local4 = Static53.method1838(this.anInt2362);
		@Pc(19) Class1_Sub1_Sub8_Sub3 local19 = local4.method1256(this.anInt2371);
		if (local19 == null) {
			return null;
		} else {
			local19.method1370(this.anInt2361);
			return local19;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(BI)V")
	public void method1644(@OriginalArg(1) int arg0) {
		this.aBoolean131 = true;
		this.aDouble2 += this.aDouble6 * (double) arg0;
		this.aDouble5 += (double) arg0 * this.aDouble7;
		this.aDouble3 += (double) arg0 * (double) arg0 * this.aDouble4 * 0.5D + (double) arg0 * this.aDouble8;
		this.aDouble8 += (double) arg0 * this.aDouble4;
		this.anInt2363 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt2361 = (int) (Math.atan2(this.aDouble8, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub14_2 == null) {
			return;
		}
		this.anInt2374 += arg0;
		while (this.aClass1_Sub1_Sub14_2.anIntArray357[this.anInt2371] < this.anInt2374) {
			this.anInt2374 -= this.aClass1_Sub1_Sub14_2.anIntArray357[this.anInt2371];
			this.anInt2371++;
			if (this.anInt2371 >= this.aClass1_Sub1_Sub14_2.anIntArray355.length) {
				this.anInt2371 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIB)V")
	public void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean131) {
			local13 = arg2 - this.anInt2358;
			@Pc(20) double local20 = (double) (arg1 - this.anInt2370);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble3 = this.anInt2359;
			this.aDouble5 = (double) this.anInt2358 + (double) this.anInt2367 * local13 / local29;
			this.aDouble2 = (double) this.anInt2370 + local20 * (double) this.anInt2367 / local29;
		}
		local13 = this.anInt2369 + 1 - arg0;
		this.aDouble7 = ((double) arg2 - this.aDouble5) / local13;
		this.aDouble6 = ((double) arg1 - this.aDouble2) / local13;
		this.aDouble9 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble7 * this.aDouble7);
		if (!this.aBoolean131) {
			this.aDouble8 = -this.aDouble9 * Math.tan((double) this.anInt2365 * 0.02454369D);
		}
		this.aDouble4 = ((double) arg3 - this.aDouble3 - local13 * this.aDouble8) * 2.0D / (local13 * local13);
	}
}

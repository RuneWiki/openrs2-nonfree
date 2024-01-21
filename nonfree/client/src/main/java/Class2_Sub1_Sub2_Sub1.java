import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class2_Sub1_Sub2_Sub1 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!ed", name = "tb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ed", name = "zb", descriptor = "I")
	public int anInt784;

	@OriginalMember(owner = "client!ed", name = "Ab", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ed", name = "Bb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ed", name = "Db", descriptor = "I")
	private int anInt786;

	@OriginalMember(owner = "client!ed", name = "Eb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!ed", name = "Fb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ed", name = "Gb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ed", name = "Ib", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!ed", name = "Tb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!ed", name = "Hb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ed", name = "Xb", descriptor = "I")
	private int anInt793 = 0;

	@OriginalMember(owner = "client!ed", name = "Ub", descriptor = "I")
	private int anInt791 = 0;

	@OriginalMember(owner = "client!ed", name = "Qb", descriptor = "I")
	private final int anInt789;

	@OriginalMember(owner = "client!ed", name = "Vb", descriptor = "I")
	public final int anInt792;

	@OriginalMember(owner = "client!ed", name = "Cb", descriptor = "I")
	public final int anInt785;

	@OriginalMember(owner = "client!ed", name = "cc", descriptor = "I")
	private final int anInt796;

	@OriginalMember(owner = "client!ed", name = "Rb", descriptor = "I")
	private final int anInt790;

	@OriginalMember(owner = "client!ed", name = "ec", descriptor = "I")
	private final int anInt798;

	@OriginalMember(owner = "client!ed", name = "dc", descriptor = "I")
	private final int anInt797;

	@OriginalMember(owner = "client!ed", name = "ub", descriptor = "I")
	public final int anInt781;

	@OriginalMember(owner = "client!ed", name = "Jb", descriptor = "I")
	private final int anInt787;

	@OriginalMember(owner = "client!ed", name = "Kb", descriptor = "I")
	public final int anInt788;

	@OriginalMember(owner = "client!ed", name = "Zb", descriptor = "I")
	public final int anInt794;

	@OriginalMember(owner = "client!ed", name = "rb", descriptor = "Lclient!aa;")
	private final Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt789 = arg0;
		this.anInt792 = arg6;
		this.anInt785 = arg10;
		this.anInt796 = arg4;
		this.anInt790 = arg2;
		this.anInt798 = arg3;
		this.anInt797 = arg7;
		this.anInt781 = arg1;
		this.anInt787 = arg8;
		this.anInt788 = arg5;
		this.anInt794 = arg9;
		this.aBoolean49 = false;
		@Pc(52) int local52 = Static5.method79(this.anInt789).anInt2000;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub1_1 = null;
		} else {
			this.aClass2_Sub1_Sub1_1 = Static69.method1439(local52);
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)Lclient!ga;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method2061() {
		@Pc(8) Class2_Sub1_Sub13 local8 = Static5.method79(this.anInt789);
		@Pc(14) Class2_Sub1_Sub2_Sub2 local14 = local8.method1433(this.anInt793);
		if (local14 == null) {
			return null;
		} else {
			local14.method705(this.anInt786);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIII)V")
	public void method549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean49) {
			local8 = arg2 - this.anInt790;
			@Pc(15) double local15 = (double) (arg0 - this.anInt798);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble7 = (double) this.anInt798 + (double) this.anInt787 * local15 / local24;
			this.aDouble4 = this.anInt796;
			this.aDouble8 = (double) this.anInt790 + local8 * (double) this.anInt787 / local24;
		}
		local8 = this.anInt792 + 1 - arg1;
		this.aDouble5 = ((double) arg0 - this.aDouble7) / local8;
		this.aDouble3 = ((double) arg2 - this.aDouble8) / local8;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble3 * this.aDouble3);
		if (!this.aBoolean49) {
			this.aDouble1 = -this.aDouble6 * Math.tan((double) this.anInt797 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg3 - this.aDouble4 - local8 * this.aDouble1) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IB)V")
	public void method550(@OriginalArg(0) int arg0) {
		this.aBoolean49 = true;
		this.aDouble4 += (double) arg0 * this.aDouble1 + (double) arg0 * 0.5D * this.aDouble2 * (double) arg0;
		this.aDouble7 += (double) arg0 * this.aDouble5;
		this.aDouble1 += (double) arg0 * this.aDouble2;
		this.aDouble8 += this.aDouble3 * (double) arg0;
		this.anInt784 = (int) (Math.atan2(this.aDouble3, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt786 = (int) (Math.atan2(this.aDouble1, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub1_1 == null) {
			return;
		}
		this.anInt791 += arg0;
		while (this.aClass2_Sub1_Sub1_1.anIntArray8[this.anInt793] < this.anInt791) {
			this.anInt791 -= this.aClass2_Sub1_Sub1_1.anIntArray8[this.anInt793];
			this.anInt793++;
			if (this.anInt793 >= this.aClass2_Sub1_Sub1_1.anIntArray7.length) {
				this.anInt793 = 0;
			}
		}
	}
}

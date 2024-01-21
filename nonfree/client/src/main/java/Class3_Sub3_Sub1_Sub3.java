import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class3_Sub3_Sub1_Sub3 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!eb", name = "tb", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!eb", name = "Wb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!eb", name = "Yb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eb", name = "bc", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!eb", name = "cc", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!eb", name = "dc", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!eb", name = "ic", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!eb", name = "Ib", descriptor = "I")
	private int anInt636 = 0;

	@OriginalMember(owner = "client!eb", name = "Jb", descriptor = "I")
	private int anInt637 = 0;

	@OriginalMember(owner = "client!eb", name = "Ub", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!eb", name = "Lb", descriptor = "I")
	private final int anInt638;

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "I")
	private final int anInt635;

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "I")
	public final int anInt627;

	@OriginalMember(owner = "client!eb", name = "Qb", descriptor = "I")
	public final int anInt642;

	@OriginalMember(owner = "client!eb", name = "Cb", descriptor = "I")
	public final int anInt633;

	@OriginalMember(owner = "client!eb", name = "Xb", descriptor = "I")
	private final int anInt646;

	@OriginalMember(owner = "client!eb", name = "Db", descriptor = "I")
	private final int anInt634;

	@OriginalMember(owner = "client!eb", name = "Pb", descriptor = "I")
	public final int anInt641;

	@OriginalMember(owner = "client!eb", name = "Nb", descriptor = "I")
	private final int anInt639;

	@OriginalMember(owner = "client!eb", name = "Vb", descriptor = "I")
	private final int anInt645;

	@OriginalMember(owner = "client!eb", name = "Ob", descriptor = "I")
	public final int anInt640;

	@OriginalMember(owner = "client!eb", name = "Mb", descriptor = "Lclient!ua;")
	private final Class3_Sub3_Sub14 aClass3_Sub3_Sub14_2;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub3_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt638 = arg8;
		this.anInt635 = arg4;
		this.anInt627 = arg6;
		this.anInt642 = arg9;
		this.anInt633 = arg5;
		this.anInt646 = arg3;
		this.anInt634 = arg7;
		this.anInt641 = arg1;
		this.anInt639 = arg2;
		this.anInt645 = arg0;
		this.aBoolean36 = false;
		this.anInt640 = arg10;
		@Pc(52) int local52 = Static84.method1557(this.anInt645).anInt2485;
		if (local52 == -1) {
			this.aClass3_Sub3_Sub14_2 = null;
		} else {
			this.aClass3_Sub3_Sub14_2 = Static16.method298(local52);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIBI)V")
	public void method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean36) {
			@Pc(9) double local9 = (double) (arg0 - this.anInt646);
			local16 = arg3 - this.anInt639;
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble6 = (double) this.anInt646 + (double) this.anInt638 * local9 / local25;
			this.aDouble4 = (double) this.anInt639 + (double) this.anInt638 * local16 / local25;
			this.aDouble7 = this.anInt635;
		}
		local16 = this.anInt627 + 1 - arg1;
		this.aDouble2 = ((double) arg0 - this.aDouble6) / local16;
		this.aDouble5 = ((double) arg3 - this.aDouble4) / local16;
		this.aDouble3 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean36) {
			this.aDouble1 = -this.aDouble3 * Math.tan((double) this.anInt634 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg2 - this.aDouble7 - local16 * this.aDouble1) * 2.0D / (local16 * local16);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)Lclient!de;")
	@Override
	protected Class3_Sub3_Sub1_Sub1 method1667() {
		@Pc(16) Class3_Sub3_Sub11 local16 = Static84.method1557(this.anInt645);
		@Pc(22) Class3_Sub3_Sub1_Sub1 local22 = local16.method1710(this.anInt636);
		if (local22 == null) {
			return null;
		} else {
			local22.method395(this.anInt630);
			return local22;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	public void method483(@OriginalArg(0) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble2;
		this.aDouble4 += this.aDouble5 * (double) arg0;
		this.aDouble7 += this.aDouble1 * (double) arg0 + (double) arg0 * (double) arg0 * this.aDouble8 * 0.5D;
		this.aDouble1 += (double) arg0 * this.aDouble8;
		this.aBoolean36 = true;
		this.anInt648 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt630 = (int) (Math.atan2(this.aDouble1, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub3_Sub14_2 == null) {
			return;
		}
		this.anInt637 += arg0;
		while (this.anInt637 > this.aClass3_Sub3_Sub14_2.anIntArray383[this.anInt636]) {
			this.anInt637 -= this.aClass3_Sub3_Sub14_2.anIntArray383[this.anInt636];
			this.anInt636++;
			if (this.anInt636 >= this.aClass3_Sub3_Sub14_2.anIntArray382.length) {
				this.anInt636 = 0;
			}
		}
	}
}

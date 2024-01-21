import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!d", name = "Zb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!d", name = "dc", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!d", name = "hc", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!d", name = "tc", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!d", name = "uc", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!d", name = "wc", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!d", name = "xc", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!d", name = "Cc", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!d", name = "Mc", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!d", name = "Oc", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!d", name = "ac", descriptor = "I")
	private int anInt828 = 0;

	@OriginalMember(owner = "client!d", name = "Vb", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!d", name = "jc", descriptor = "I")
	private int anInt834 = 0;

	@OriginalMember(owner = "client!d", name = "Lb", descriptor = "I")
	private final int anInt821;

	@OriginalMember(owner = "client!d", name = "Kb", descriptor = "I")
	private final int anInt820;

	@OriginalMember(owner = "client!d", name = "Nb", descriptor = "I")
	public final int anInt823;

	@OriginalMember(owner = "client!d", name = "qc", descriptor = "I")
	private final int anInt838;

	@OriginalMember(owner = "client!d", name = "Pb", descriptor = "I")
	private final int anInt825;

	@OriginalMember(owner = "client!d", name = "ic", descriptor = "I")
	public final int anInt833;

	@OriginalMember(owner = "client!d", name = "Yb", descriptor = "I")
	public final int anInt827;

	@OriginalMember(owner = "client!d", name = "bc", descriptor = "I")
	public final int anInt829;

	@OriginalMember(owner = "client!d", name = "Ob", descriptor = "I")
	public final int anInt824;

	@OriginalMember(owner = "client!d", name = "lc", descriptor = "I")
	private final int anInt836;

	@OriginalMember(owner = "client!d", name = "yc", descriptor = "I")
	private final int anInt840;

	@OriginalMember(owner = "client!d", name = "Hc", descriptor = "Lclient!he;")
	private final Class2_Sub1_Sub9 aClass2_Sub1_Sub9_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt821 = arg2;
		this.anInt820 = arg4;
		this.aBoolean30 = false;
		this.anInt823 = arg10;
		this.anInt838 = arg8;
		this.anInt825 = arg0;
		this.anInt833 = arg1;
		this.anInt827 = arg6;
		this.anInt829 = arg5;
		this.anInt824 = arg9;
		this.anInt836 = arg3;
		this.anInt840 = arg7;
		@Pc(52) int local52 = Static65.method1339(this.anInt825).anInt1013;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub9_1 = null;
		} else {
			this.aClass2_Sub1_Sub9_1 = Static4.method192(local52);
		}
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)Lclient!pa;")
	@Override
	public Class2_Sub1_Sub1_Sub5 method1778() {
		@Pc(16) Class2_Sub1_Sub4 local16 = Static65.method1339(this.anInt825);
		@Pc(22) Class2_Sub1_Sub1_Sub5 local22 = local16.method715(this.anInt834);
		if (local22 == null) {
			return null;
		} else {
			local22.method1405(this.anInt830);
			return local22;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	public void method526(@OriginalArg(1) int arg0) {
		this.aBoolean30 = true;
		this.aDouble4 += (double) arg0 * this.aDouble7;
		this.aDouble2 += this.aDouble8 * (double) arg0;
		this.aDouble3 += this.aDouble6 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble1;
		this.aDouble1 += (double) arg0 * this.aDouble6;
		this.anInt847 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt830 = (int) (Math.atan2(this.aDouble1, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub9_1 == null) {
			return;
		}
		this.anInt828 += arg0;
		while (this.aClass2_Sub1_Sub9_1.anIntArray144[this.anInt834] < this.anInt828) {
			this.anInt828 -= this.aClass2_Sub1_Sub9_1.anIntArray144[this.anInt834];
			this.anInt834++;
			if (this.aClass2_Sub1_Sub9_1.anIntArray147.length <= this.anInt834) {
				this.anInt834 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	public void method527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean30) {
			local9 = arg3 - this.anInt821;
			@Pc(16) double local16 = (double) (arg1 - this.anInt836);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble2 = (double) this.anInt821 + local9 * (double) this.anInt838 / local25;
			this.aDouble4 = (double) this.anInt836 + (double) this.anInt838 * local16 / local25;
			this.aDouble3 = this.anInt820;
		}
		local9 = this.anInt827 + 1 - arg0;
		this.aDouble7 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble8 = ((double) arg3 - this.aDouble2) / local9;
		this.aDouble5 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean30) {
			this.aDouble1 = -this.aDouble5 * Math.tan((double) this.anInt840 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg2 - this.aDouble3 - this.aDouble1 * local9) * 2.0D / (local9 * local9);
	}
}

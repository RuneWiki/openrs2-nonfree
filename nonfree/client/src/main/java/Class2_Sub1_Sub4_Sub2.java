import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class2_Sub1_Sub4_Sub2 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!e", name = "kb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!e", name = "sb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!e", name = "vb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!e", name = "wb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!e", name = "yb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!e", name = "zb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!e", name = "Eb", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!e", name = "Gb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
	private int anInt840 = 0;

	@OriginalMember(owner = "client!e", name = "ob", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!e", name = "Fb", descriptor = "I")
	private int anInt849 = 0;

	@OriginalMember(owner = "client!e", name = "Yb", descriptor = "I")
	public final int anInt863;

	@OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
	private final int anInt837;

	@OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
	public final int anInt842;

	@OriginalMember(owner = "client!e", name = "Qb", descriptor = "I")
	public final int anInt857;

	@OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
	private final int anInt839;

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
	public final int anInt836;

	@OriginalMember(owner = "client!e", name = "Cb", descriptor = "I")
	private final int anInt847;

	@OriginalMember(owner = "client!e", name = "Hb", descriptor = "I")
	private final int anInt850;

	@OriginalMember(owner = "client!e", name = "Lb", descriptor = "I")
	public final int anInt854;

	@OriginalMember(owner = "client!e", name = "Nb", descriptor = "I")
	private final int anInt856;

	@OriginalMember(owner = "client!e", name = "Mb", descriptor = "I")
	private final int anInt855;

	@OriginalMember(owner = "client!e", name = "Ab", descriptor = "Lclient!mb;")
	private final Class2_Sub1_Sub10 aClass2_Sub1_Sub10_2;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt863 = arg9;
		this.anInt837 = arg0;
		this.anInt842 = arg1;
		this.anInt857 = arg10;
		this.anInt839 = arg3;
		this.anInt836 = arg6;
		this.anInt847 = arg4;
		this.anInt850 = arg8;
		this.anInt854 = arg5;
		this.anInt856 = arg7;
		this.anInt855 = arg2;
		this.aBoolean55 = false;
		@Pc(52) int local52 = Static75.method1409(this.anInt837).anInt2572;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub10_2 = null;
		} else {
			this.aClass2_Sub1_Sub10_2 = Static54.method1158(local52);
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)Lclient!hb;")
	@Override
	protected Class2_Sub1_Sub4_Sub5 method1264() {
		@Pc(13) Class2_Sub1_Sub14 local13 = Static75.method1409(this.anInt837);
		@Pc(19) Class2_Sub1_Sub4_Sub5 local19 = local13.method1600(this.anInt849);
		if (local19 == null) {
			return null;
		} else {
			local19.method911(this.anInt838);
			return local19;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public void method553(@OriginalArg(0) int arg0) {
		this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble4 += (double) arg0 * this.aDouble7;
		this.aDouble8 += this.aDouble5 * (double) arg0;
		this.aBoolean55 = true;
		this.aDouble1 += this.aDouble2 * (double) arg0;
		this.anInt848 = (int) (Math.atan2(this.aDouble7, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt838 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub10_2 == null) {
			return;
		}
		this.anInt840 += arg0;
		while (this.aClass2_Sub1_Sub10_2.anIntArray293[this.anInt849] < this.anInt840) {
			this.anInt840 -= this.aClass2_Sub1_Sub10_2.anIntArray293[this.anInt849];
			this.anInt849++;
			if (this.anInt849 >= this.aClass2_Sub1_Sub10_2.anIntArray292.length) {
				this.anInt849 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean55) {
			local9 = arg1 - this.anInt855;
			@Pc(16) double local16 = (double) (arg2 - this.anInt839);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble4 = local9 * (double) this.anInt850 / local25 + (double) this.anInt855;
			this.aDouble3 = this.anInt847;
			this.aDouble1 = (double) this.anInt839 + local16 * (double) this.anInt850 / local25;
		}
		local9 = this.anInt836 + 1 - arg0;
		this.aDouble7 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble2 = ((double) arg2 - this.aDouble1) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble7 * this.aDouble7);
		if (!this.aBoolean55) {
			this.aDouble8 = -this.aDouble6 * Math.tan((double) this.anInt856 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg3 - local9 * this.aDouble8 - this.aDouble3) * 2.0D / (local9 * local9);
	}
}

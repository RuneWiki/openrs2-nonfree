import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class3_Sub1_Sub2_Sub3 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!eb", name = "sb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
	private int anInt801;

	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!eb", name = "Cb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!eb", name = "Db", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!eb", name = "Ob", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eb", name = "Pb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!eb", name = "Zb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!eb", name = "gc", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!eb", name = "ic", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!eb", name = "rb", descriptor = "I")
	private int anInt797 = 0;

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "I")
	private int anInt805 = 0;

	@OriginalMember(owner = "client!eb", name = "Lb", descriptor = "I")
	private final int anInt809;

	@OriginalMember(owner = "client!eb", name = "Ib", descriptor = "I")
	public final int anInt806;

	@OriginalMember(owner = "client!eb", name = "Wb", descriptor = "I")
	public final int anInt815;

	@OriginalMember(owner = "client!eb", name = "bc", descriptor = "I")
	private final int anInt818;

	@OriginalMember(owner = "client!eb", name = "Vb", descriptor = "I")
	private final int anInt814;

	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
	public final int anInt803;

	@OriginalMember(owner = "client!eb", name = "Gb", descriptor = "I")
	private final int anInt804;

	@OriginalMember(owner = "client!eb", name = "ac", descriptor = "I")
	public final int anInt817;

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "I")
	private final int anInt799;

	@OriginalMember(owner = "client!eb", name = "Yb", descriptor = "I")
	public final int anInt816;

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	private final int anInt800;

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "Lclient!ed;")
	private final Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt809 = arg2;
		this.anInt806 = arg10;
		this.anInt815 = arg9;
		this.anInt818 = arg8;
		this.anInt814 = arg7;
		this.anInt803 = arg5;
		this.anInt804 = arg0;
		this.anInt817 = arg6;
		this.anInt799 = arg4;
		this.aBoolean41 = false;
		this.anInt816 = arg1;
		this.anInt800 = arg3;
		@Pc(52) int local52 = Static43.method800(this.anInt804).anInt470;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub4_1 = null;
		} else {
			this.aClass3_Sub1_Sub4_1 = Static41.method770(local52);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
	public void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean41) {
			local13 = arg0 - this.anInt809;
			@Pc(20) double local20 = (double) (arg1 - this.anInt800);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble8 = (double) this.anInt800 + local20 * (double) this.anInt818 / local29;
			this.aDouble4 = this.anInt799;
			this.aDouble2 = (double) this.anInt818 * local13 / local29 + (double) this.anInt809;
		}
		local13 = this.anInt817 + 1 - arg2;
		this.aDouble6 = ((double) arg1 - this.aDouble8) / local13;
		this.aDouble1 = ((double) arg0 - this.aDouble2) / local13;
		this.aDouble7 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble6 * this.aDouble6);
		if (!this.aBoolean41) {
			this.aDouble5 = -this.aDouble7 * Math.tan((double) this.anInt814 * 0.02454369D);
		}
		this.aDouble3 = ((double) arg3 - this.aDouble4 - local13 * this.aDouble5) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)Lclient!t;")
	@Override
	public Class3_Sub1_Sub2_Sub6 method2028() {
		@Pc(8) Class3_Sub1_Sub3 local8 = Static43.method800(this.anInt804);
		@Pc(20) Class3_Sub1_Sub2_Sub6 local20 = local8.method341(this.anInt805);
		if (local20 == null) {
			return null;
		} else {
			local20.method1786(this.anInt801);
			return local20;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(BI)V")
	public void method562(@OriginalArg(1) int arg0) {
		this.aBoolean41 = true;
		this.aDouble4 += this.aDouble3 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble5;
		this.aDouble2 += (double) arg0 * this.aDouble1;
		this.aDouble8 += this.aDouble6 * (double) arg0;
		this.aDouble5 += this.aDouble3 * (double) arg0;
		this.anInt823 = (int) (Math.atan2(this.aDouble1, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt801 = (int) (Math.atan2(this.aDouble5, this.aDouble7) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub4_1 == null) {
			return;
		}
		this.anInt797 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt797 <= this.aClass3_Sub1_Sub4_1.anIntArray54[this.anInt805]) {
						return;
					}
					this.anInt797 -= this.aClass3_Sub1_Sub4_1.anIntArray54[this.anInt805];
					this.anInt805++;
				} while (this.anInt805 < this.aClass3_Sub1_Sub4_1.anIntArray58.length);
				this.anInt805 -= this.aClass3_Sub1_Sub4_1.anInt871;
			} while (this.anInt805 >= 0 && this.anInt805 < this.aClass3_Sub1_Sub4_1.anIntArray58.length);
			this.anInt805 = 0;
		}
	}
}

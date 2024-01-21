import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class4_Sub1_Sub1_Sub3 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!dd", name = "fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!dd", name = "ib", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!dd", name = "qb", descriptor = "I")
	public int anInt844;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
	private int anInt834 = 0;

	@OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
	private int anInt840 = 0;

	@OriginalMember(owner = "client!dd", name = "nb", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public final int anInt832;

	@OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
	private final int anInt835;

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
	public final int anInt837;

	@OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
	private final int anInt843;

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
	private final int anInt831;

	@OriginalMember(owner = "client!dd", name = "tb", descriptor = "I")
	public final int anInt846;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
	private final int anInt833;

	@OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
	private final int anInt836;

	@OriginalMember(owner = "client!dd", name = "lb", descriptor = "I")
	private final int anInt842;

	@OriginalMember(owner = "client!dd", name = "rb", descriptor = "I")
	public final int anInt845;

	@OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
	public final int anInt839;

	@OriginalMember(owner = "client!dd", name = "mb", descriptor = "Lclient!ca;")
	private final Class4_Sub1_Sub4 aClass4_Sub1_Sub4_2;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt832 = arg9;
		this.anInt835 = arg7;
		this.anInt837 = arg6;
		this.anInt843 = arg0;
		this.anInt831 = arg4;
		this.anInt846 = arg5;
		this.anInt833 = arg2;
		this.aBoolean42 = false;
		this.anInt836 = arg8;
		this.anInt842 = arg3;
		this.anInt845 = arg10;
		this.anInt839 = arg1;
		@Pc(52) int local52 = Static93.method1816(this.anInt843).anInt1398;
		if (local52 == -1) {
			this.aClass4_Sub1_Sub4_2 = null;
		} else {
			this.aClass4_Sub1_Sub4_2 = Static137.method2394(local52);
		}
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)Lclient!dg;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method2820() {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static93.method1816(this.anInt843);
		@Pc(19) Class4_Sub1_Sub1_Sub4 local19 = local13.method1095(this.anInt840);
		if (local19 == null) {
			return null;
		} else {
			local19.method2831(this.anInt829);
			return local19;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public void method543(@OriginalArg(1) int arg0) {
		this.aDouble7 += (double) arg0 * this.aDouble5;
		this.aDouble4 += (double) arg0 * this.aDouble9;
		this.aBoolean42 = true;
		this.aDouble3 += (double) arg0 * 0.5D * this.aDouble2 * (double) arg0 + this.aDouble8 * (double) arg0;
		this.aDouble8 += (double) arg0 * this.aDouble2;
		this.anInt844 = (int) (Math.atan2(this.aDouble5, this.aDouble9) * 325.949D) + 1024 & 0x7FF;
		this.anInt829 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass4_Sub1_Sub4_2 == null) {
			return;
		}
		this.anInt834 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt834 <= this.aClass4_Sub1_Sub4_2.anIntArray50[this.anInt840]) {
						return;
					}
					this.anInt834 -= this.aClass4_Sub1_Sub4_2.anIntArray50[this.anInt840];
					this.anInt840++;
				} while (this.aClass4_Sub1_Sub4_2.anIntArray52.length > this.anInt840);
				this.anInt840 -= this.aClass4_Sub1_Sub4_2.anInt547;
			} while (this.anInt840 >= 0 && this.anInt840 < this.aClass4_Sub1_Sub4_2.anIntArray52.length);
			this.anInt840 = 0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIB)V")
	public void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean42) {
			local16 = arg0 - this.anInt833;
			@Pc(22) double local22 = (double) (arg3 - this.anInt842);
			@Pc(31) double local31 = Math.sqrt(local16 * local16 + local22 * local22);
			this.aDouble4 = (double) this.anInt842 + local22 * (double) this.anInt836 / local31;
			this.aDouble3 = this.anInt831;
			this.aDouble7 = (double) this.anInt833 + local16 * (double) this.anInt836 / local31;
		}
		local16 = this.anInt837 + 1 - arg2;
		this.aDouble9 = ((double) arg3 - this.aDouble4) / local16;
		this.aDouble5 = ((double) arg0 - this.aDouble7) / local16;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble9 * this.aDouble9);
		if (!this.aBoolean42) {
			this.aDouble8 = -this.aDouble6 * Math.tan((double) this.anInt835 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg1 - this.aDouble3 - local16 * this.aDouble8) * 2.0D / (local16 * local16);
	}
}

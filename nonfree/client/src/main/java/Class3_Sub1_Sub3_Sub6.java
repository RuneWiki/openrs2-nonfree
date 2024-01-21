import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class3_Sub1_Sub3_Sub6 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!w", name = "ob", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!w", name = "rb", descriptor = "I")
	private int anInt2807;

	@OriginalMember(owner = "client!w", name = "yb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!w", name = "Bb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!w", name = "Gb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!w", name = "Kb", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!w", name = "Lb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!w", name = "Nb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!w", name = "Pb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!w", name = "Rb", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!w", name = "wb", descriptor = "I")
	private int anInt2811 = 0;

	@OriginalMember(owner = "client!w", name = "Fb", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!w", name = "pb", descriptor = "I")
	private int anInt2805 = 0;

	@OriginalMember(owner = "client!w", name = "Sb", descriptor = "I")
	public final int anInt2820;

	@OriginalMember(owner = "client!w", name = "Ub", descriptor = "I")
	public final int anInt2822;

	@OriginalMember(owner = "client!w", name = "zb", descriptor = "I")
	private final int anInt2812;

	@OriginalMember(owner = "client!w", name = "Tb", descriptor = "I")
	private final int anInt2821;

	@OriginalMember(owner = "client!w", name = "ub", descriptor = "I")
	public final int anInt2809;

	@OriginalMember(owner = "client!w", name = "Ab", descriptor = "I")
	private final int anInt2813;

	@OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
	private final int anInt2801;

	@OriginalMember(owner = "client!w", name = "tb", descriptor = "I")
	private final int anInt2808;

	@OriginalMember(owner = "client!w", name = "Ob", descriptor = "I")
	public final int anInt2818;

	@OriginalMember(owner = "client!w", name = "Hb", descriptor = "I")
	private final int anInt2815;

	@OriginalMember(owner = "client!w", name = "Eb", descriptor = "I")
	public final int anInt2814;

	@OriginalMember(owner = "client!w", name = "kb", descriptor = "Lclient!oe;")
	private final Class3_Sub1_Sub11 aClass3_Sub1_Sub11_3;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2820 = arg1;
		this.anInt2822 = arg5;
		this.anInt2812 = arg4;
		this.anInt2821 = arg3;
		this.aBoolean168 = false;
		this.anInt2809 = arg10;
		this.anInt2813 = arg2;
		this.anInt2801 = arg0;
		this.anInt2808 = arg8;
		this.anInt2818 = arg6;
		this.anInt2815 = arg7;
		this.anInt2814 = arg9;
		@Pc(52) int local52 = Static105.method1827(this.anInt2801).anInt2528;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub11_3 = null;
		} else {
			this.aClass3_Sub1_Sub11_3 = Static41.method705(local52);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V")
	public void method1850(@OriginalArg(0) int arg0) {
		this.aDouble9 += this.aDouble6 * (double) arg0;
		this.aBoolean168 = true;
		this.aDouble5 += (double) arg0 * 0.5D * this.aDouble8 * (double) arg0 + this.aDouble4 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble7;
		this.aDouble4 += this.aDouble8 * (double) arg0;
		this.anInt2817 = (int) (Math.atan2(this.aDouble6, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt2807 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub11_3 == null) {
			return;
		}
		this.anInt2805 += arg0;
		while (this.aClass3_Sub1_Sub11_3.anIntArray231[this.anInt2811] < this.anInt2805) {
			this.anInt2805 -= this.aClass3_Sub1_Sub11_3.anIntArray231[this.anInt2811];
			this.anInt2811++;
			if (this.aClass3_Sub1_Sub11_3.anIntArray232.length <= this.anInt2811) {
				this.anInt2811 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Lclient!lb;")
	@Override
	protected Class3_Sub1_Sub3_Sub3 method1843() {
		@Pc(8) Class3_Sub1_Sub15 local8 = Static105.method1827(this.anInt2801);
		@Pc(14) Class3_Sub1_Sub3_Sub3 local14 = local8.method1608(this.anInt2811);
		if (local14 == null) {
			return null;
		} else {
			local14.method973(this.anInt2807);
			return local14;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IBIII)V")
	public void method1851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean168) {
			@Pc(13) double local13 = (double) (arg0 - this.anInt2813);
			@Pc(20) double local20 = (double) (arg1 - this.anInt2821);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble5 = this.anInt2812;
			this.aDouble2 = local20 * (double) this.anInt2808 / local29 + (double) this.anInt2821;
			this.aDouble9 = (double) this.anInt2808 * local13 / local29 + (double) this.anInt2813;
		}
		@Pc(76) double local76 = (double) (this.anInt2818 + 1 - arg2);
		this.aDouble6 = ((double) arg0 - this.aDouble9) / local76;
		this.aDouble7 = ((double) arg1 - this.aDouble2) / local76;
		this.aDouble3 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble7 * this.aDouble7);
		if (!this.aBoolean168) {
			this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt2815 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg3 - this.aDouble5 - this.aDouble4 * local76) * 2.0D / (local76 * local76);
	}
}

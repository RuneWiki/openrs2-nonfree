import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class3_Sub1_Sub1_Sub5 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!vb", name = "xb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!vb", name = "Cb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!vb", name = "Gb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!vb", name = "Ib", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!vb", name = "Lb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!vb", name = "Mb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!vb", name = "Ob", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!vb", name = "Sb", descriptor = "I")
	private int anInt2661;

	@OriginalMember(owner = "client!vb", name = "jc", descriptor = "I")
	public int anInt2672;

	@OriginalMember(owner = "client!vb", name = "cc", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!vb", name = "bc", descriptor = "I")
	private int anInt2667 = 0;

	@OriginalMember(owner = "client!vb", name = "Yb", descriptor = "I")
	private int anInt2665 = 0;

	@OriginalMember(owner = "client!vb", name = "lc", descriptor = "I")
	private final int anInt2674;

	@OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
	private final int anInt2651;

	@OriginalMember(owner = "client!vb", name = "Tb", descriptor = "I")
	private final int anInt2662;

	@OriginalMember(owner = "client!vb", name = "Pb", descriptor = "I")
	public final int anInt2659;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "I")
	private final int anInt2652;

	@OriginalMember(owner = "client!vb", name = "Xb", descriptor = "I")
	private final int anInt2664;

	@OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
	public final int anInt2653;

	@OriginalMember(owner = "client!vb", name = "Rb", descriptor = "I")
	public final int anInt2660;

	@OriginalMember(owner = "client!vb", name = "ec", descriptor = "I")
	private final int anInt2668;

	@OriginalMember(owner = "client!vb", name = "mc", descriptor = "I")
	public final int anInt2675;

	@OriginalMember(owner = "client!vb", name = "ic", descriptor = "I")
	public final int anInt2671;

	@OriginalMember(owner = "client!vb", name = "Zb", descriptor = "Lclient!m;")
	private final Class3_Sub1_Sub6 aClass3_Sub1_Sub6_2;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean232 = false;
		this.anInt2674 = arg2;
		this.anInt2651 = arg7;
		this.anInt2662 = arg3;
		this.anInt2659 = arg1;
		this.anInt2652 = arg0;
		this.anInt2664 = arg4;
		this.anInt2653 = arg9;
		this.anInt2660 = arg10;
		this.anInt2668 = arg8;
		this.anInt2675 = arg5;
		this.anInt2671 = arg6;
		@Pc(52) int local52 = Static47.method827(this.anInt2652).anInt2212;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub6_2 = null;
		} else {
			this.aClass3_Sub1_Sub6_2 = Static67.method1107(local52);
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Lclient!hc;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method1920() {
		@Pc(8) Class3_Sub1_Sub15 local8 = Static47.method827(this.anInt2652);
		@Pc(14) Class3_Sub1_Sub1_Sub4 local14 = local8.method1484(this.anInt2667);
		if (local14 == null) {
			return null;
		} else {
			local14.method791(this.anInt2661);
			return local14;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
	public void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean232) {
			local13 = arg0 - this.anInt2674;
			@Pc(20) double local20 = (double) (arg3 - this.anInt2662);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble8 = (double) this.anInt2674 + local13 * (double) this.anInt2668 / local29;
			this.aDouble3 = this.anInt2664;
			this.aDouble4 = (double) this.anInt2662 + (double) this.anInt2668 * local20 / local29;
		}
		local13 = this.anInt2671 + 1 - arg1;
		this.aDouble9 = ((double) arg3 - this.aDouble4) / local13;
		this.aDouble5 = ((double) arg0 - this.aDouble8) / local13;
		this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble9 * this.aDouble9);
		if (!this.aBoolean232) {
			this.aDouble6 = -this.aDouble7 * Math.tan((double) this.anInt2651 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg2 - local13 * this.aDouble6 - this.aDouble3) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)V")
	public void method1810(@OriginalArg(1) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble6 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble2;
		this.aDouble4 += this.aDouble9 * (double) arg0;
		this.aDouble6 += (double) arg0 * this.aDouble2;
		this.aBoolean232 = true;
		this.aDouble8 += (double) arg0 * this.aDouble5;
		this.anInt2672 = (int) (Math.atan2(this.aDouble5, this.aDouble9) * 325.949D) + 1024 & 0x7FF;
		this.anInt2661 = (int) (Math.atan2(this.aDouble6, this.aDouble7) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub6_2 == null) {
			return;
		}
		this.anInt2665 += arg0;
		while (this.anInt2665 > this.aClass3_Sub1_Sub6_2.anIntArray224[this.anInt2667]) {
			this.anInt2665 -= this.aClass3_Sub1_Sub6_2.anIntArray224[this.anInt2667];
			this.anInt2667++;
			if (this.anInt2667 >= this.aClass3_Sub1_Sub6_2.anIntArray220.length) {
				this.anInt2667 = 0;
			}
		}
	}
}

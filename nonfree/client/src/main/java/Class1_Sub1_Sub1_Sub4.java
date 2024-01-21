import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!o", name = "X", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
	public int anInt2926;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
	private int anInt2928;

	@OriginalMember(owner = "client!o", name = "db", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!o", name = "Cb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
	private int anInt2939 = 0;

	@OriginalMember(owner = "client!o", name = "vb", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!o", name = "Bb", descriptor = "I")
	private int anInt2945 = 0;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
	public final int anInt2930;

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
	public final int anInt2937;

	@OriginalMember(owner = "client!o", name = "Gb", descriptor = "I")
	private final int anInt2947;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
	private final int anInt2936;

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
	private final int anInt2934;

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
	private final int anInt2931;

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "I")
	public final int anInt2941;

	@OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
	private final int anInt2940;

	@OriginalMember(owner = "client!o", name = "Hb", descriptor = "I")
	public final int anInt2948;

	@OriginalMember(owner = "client!o", name = "Ab", descriptor = "I")
	private final int anInt2944;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
	public final int anInt2927;

	@OriginalMember(owner = "client!o", name = "Fb", descriptor = "Lclient!wf;")
	private final Class1_Sub1_Sub18 aClass1_Sub1_Sub18_2;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2930 = arg9;
		this.anInt2937 = arg10;
		this.anInt2947 = arg0;
		this.anInt2936 = arg3;
		this.anInt2934 = arg4;
		this.aBoolean144 = false;
		this.anInt2931 = arg2;
		this.anInt2941 = arg1;
		this.anInt2940 = arg7;
		this.anInt2948 = arg5;
		this.anInt2944 = arg8;
		this.anInt2927 = arg6;
		@Pc(52) int local52 = Static13.method251(this.anInt2947).anInt4142;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub18_2 = null;
		} else {
			this.aClass1_Sub1_Sub18_2 = Static157.method2652(local52);
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(IB)V")
	public void method2027(@OriginalArg(0) int arg0) {
		this.aBoolean144 = true;
		this.aDouble6 += (double) arg0 * this.aDouble5;
		this.aDouble7 += this.aDouble4 * (double) arg0;
		this.aDouble1 += (double) arg0 * (double) arg0 * this.aDouble8 * 0.5D + this.aDouble2 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble8;
		this.anInt2926 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt2928 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub18_2 == null) {
			return;
		}
		this.anInt2945 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub1_Sub18_2.anIntArray601[this.anInt2939] >= this.anInt2945) {
						return;
					}
					this.anInt2945 -= this.aClass1_Sub1_Sub18_2.anIntArray601[this.anInt2939];
					this.anInt2939++;
				} while (this.aClass1_Sub1_Sub18_2.anIntArray602.length > this.anInt2939);
				this.anInt2939 -= this.aClass1_Sub1_Sub18_2.anInt4304;
			} while (this.anInt2939 >= 0 && this.anInt2939 < this.aClass1_Sub1_Sub18_2.anIntArray602.length);
			this.anInt2939 = 0;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(IIIII)V")
	public void method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean144) {
			local9 = arg3 - this.anInt2931;
			@Pc(16) double local16 = (double) (arg2 - this.anInt2936);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble1 = this.anInt2934;
			this.aDouble7 = (double) this.anInt2936 + (double) this.anInt2944 * local16 / local25;
			this.aDouble6 = (double) this.anInt2931 + local9 * (double) this.anInt2944 / local25;
		}
		local9 = this.anInt2927 + 1 - arg0;
		this.aDouble4 = ((double) arg2 - this.aDouble7) / local9;
		this.aDouble5 = ((double) arg3 - this.aDouble6) / local9;
		this.aDouble3 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean144) {
			this.aDouble2 = -this.aDouble3 * Math.tan((double) this.anInt2940 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg1 - this.aDouble2 * local9 - this.aDouble1) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)Lclient!w;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method3157() {
		@Pc(4) Class1_Sub1_Sub16 local4 = Static13.method251(this.anInt2947);
		@Pc(20) Class1_Sub1_Sub1_Sub2 local20 = local4.method2919(this.anInt2939);
		if (local20 == null) {
			return null;
		} else {
			local20.method1079(this.anInt2928);
			return local20;
		}
	}
}

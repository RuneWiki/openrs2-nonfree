import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ODNHGUWK")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ODNHGUWK", name = "k", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!ODNHGUWK", name = "l", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!ODNHGUWK", name = "m", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ODNHGUWK", name = "o", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ODNHGUWK", name = "p", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ODNHGUWK", name = "q", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ODNHGUWK", name = "r", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ODNHGUWK", name = "w", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ODNHGUWK", name = "x", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!ODNHGUWK", name = "y", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!ODNHGUWK", name = "H", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!ODNHGUWK", name = "I", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!ODNHGUWK", name = "n", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!ODNHGUWK", name = "z", descriptor = "Z")
	private boolean aBoolean115 = true;

	@OriginalMember(owner = "client!ODNHGUWK", name = "J", descriptor = "I")
	private int anInt393 = -462;

	@OriginalMember(owner = "client!ODNHGUWK", name = "A", descriptor = "Lclient!BZLQCUPI;")
	private Class4 aClass4_2;

	@OriginalMember(owner = "client!ODNHGUWK", name = "B", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!ODNHGUWK", name = "s", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!ODNHGUWK", name = "t", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!ODNHGUWK", name = "u", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!ODNHGUWK", name = "C", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!ODNHGUWK", name = "D", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!ODNHGUWK", name = "E", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!ODNHGUWK", name = "F", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!ODNHGUWK", name = "G", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!ODNHGUWK", name = "v", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!ODNHGUWK", name = "<init>", descriptor = "(IIIIIBIIIIII)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(15) boolean local15 = false;
			this.aClass4_2 = Class4.aClass4Array1[arg3];
			this.anInt385 = arg0;
			this.anInt379 = arg1;
			this.anInt380 = arg7;
			this.anInt381 = arg6;
			this.anInt386 = arg4;
			this.anInt387 = arg8;
			this.anInt388 = arg9;
			this.anInt389 = arg11;
			this.anInt390 = arg10;
			this.anInt382 = arg2;
			this.aBoolean114 = false;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("45053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ODNHGUWK", name = "a", descriptor = "(IIIZI)V")
	public void method344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean114) {
				local8 = arg1 - this.anInt379;
				@Pc(14) double local14 = (double) (arg0 - this.anInt380);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt379 + local8 * (double) this.anInt389 / local23;
				this.aDouble2 = (double) this.anInt380 + local14 * (double) this.anInt389 / local23;
				this.aDouble3 = this.anInt381;
			}
			local8 = this.anInt387 + 1 - arg3;
			this.aDouble4 = ((double) arg1 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg0 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean114) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt388 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("4013, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ODNHGUWK", name = "a", descriptor = "(II)V")
	public void method345(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean114 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt383 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt384 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass4_2.aClass10_1 != null) {
				this.anInt392 += arg0;
				while (this.anInt392 > this.aClass4_2.aClass10_1.method160(this.anInt391)) {
					this.anInt392 -= this.aClass4_2.aClass10_1.method160(this.anInt391) + 1;
					this.anInt391++;
					if (this.anInt391 >= this.aClass4_2.aClass10_1.anInt198) {
						this.anInt391 = 0;
					}
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("80104, " + arg0 + ", " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ODNHGUWK", name = "a", descriptor = "(B)Lclient!CYPZUKMB;")
	@Override
	protected Class2_Sub1_Sub1_Sub2 method455() {
		try {
			@Pc(3) Class2_Sub1_Sub1_Sub2 local3 = this.aClass4_2.method19();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass4_2.aClass10_1 != null) {
				local9 = this.aClass4_2.aClass10_1.anIntArray68[this.anInt391];
			}
			@Pc(32) Class2_Sub1_Sub1_Sub2 local32 = new Class2_Sub1_Sub1_Sub2(Class32.method374(local9), local3, false, false, true);
			if (local9 != -1) {
				local32.method98();
				local32.method99(257, local9);
				local32.anIntArrayArray6 = null;
				local32.anIntArrayArray5 = null;
			}
			if (this.aClass4_2.anInt44 != 128 || this.aClass4_2.anInt45 != 128) {
				local32.method107(this.aClass4_2.anInt44, this.aClass4_2.anInt45, this.aClass4_2.anInt44);
			}
			local32.method103(this.anInt384);
			local32.method108(this.aClass4_2.anInt47 + 64, this.aClass4_2.anInt48 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("48997, " + -99 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}

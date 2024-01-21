import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private int anInt32;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	private int anInt34;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!kc;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public int anInt21;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	private int anInt22;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	private int anInt23;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public int anInt27;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	private int anInt28;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	public int anInt30;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIZIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass21_1 = Class21.aClass21Array1[arg9];
			if (arg7) {
				this.aBoolean6 = !this.aBoolean6;
			}
			this.anInt21 = arg1;
			this.anInt22 = arg10;
			this.anInt23 = arg3;
			this.anInt24 = arg8;
			this.anInt26 = arg2;
			this.anInt27 = arg11;
			this.anInt28 = arg0;
			this.anInt29 = arg6;
			this.anInt30 = arg5;
			this.anInt25 = arg4;
			this.aBoolean7 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("76665, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZII)V")
	public void method19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean7) {
				local8 = arg1 - this.anInt22;
				@Pc(14) double local14 = (double) (arg2 - this.anInt23);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt22 + local8 * (double) this.anInt29 / local23;
				this.aDouble2 = (double) this.anInt23 + local14 * (double) this.anInt29 / local23;
				this.aDouble3 = this.anInt24;
			}
			local8 = this.anInt27 + 1 - arg3;
			this.aDouble4 = ((double) arg1 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean7) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt28 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("17997, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)V")
	public void method20(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean7 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt31 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt32 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass21_1.aClass19_1 != null) {
				this.anInt34 += arg0;
				while (this.anInt34 > this.aClass21_1.aClass19_1.anIntArray188[this.anInt33]) {
					this.anInt34 -= this.aClass21_1.aClass19_1.anIntArray188[this.anInt33] + 1;
					this.anInt33++;
					if (this.anInt33 >= this.aClass21_1.aClass19_1.anInt530) {
						this.anInt33 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("38047, " + false + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub3_Sub1 local3 = this.aClass21_1.method401();
			@Pc(18) Class1_Sub3_Sub1 local18 = new Class1_Sub3_Sub1(364, local3, !this.aClass21_1.aBoolean143, false, true);
			if (this.aClass21_1.aClass19_1 != null) {
				local18.method229(797);
				local18.method230(this.aClass21_1.aClass19_1.anIntArray186[this.anInt33]);
				local18.anIntArrayArray7 = null;
				local18.anIntArrayArray6 = null;
			}
			local18.method234(this.anInt32);
			local18.method239(this.aClass21_1.anInt560 + 64, this.aClass21_1.anInt561 + 850, -30, -50, -30, true);
			@Pc(66) int local66 = 57 / arg0;
			return local18;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("13946, " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}

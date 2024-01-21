import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	public int anInt33;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	private int anInt34;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private int anInt35;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private int anInt36;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!kc;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	private int anInt25;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	private int anInt26;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public int anInt28;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	private int anInt30;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public int anInt27;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass21_1 = Class21.aClass21Array1[arg9];
			this.anInt23 = arg4;
			this.anInt24 = arg10;
			this.anInt25 = arg7;
			this.anInt26 = arg1;
			this.anInt28 = arg3;
			this.anInt29 = arg0;
			if (arg8 != 4) {
				throw new NullPointerException();
			}
			this.anInt30 = arg6;
			this.anInt31 = arg2;
			this.anInt32 = arg5;
			this.anInt27 = arg11;
			this.aBoolean5 = false;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("45283, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public void method19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(18) double local18;
			if (!this.aBoolean5) {
				local18 = arg0 - this.anInt24;
				@Pc(24) double local24 = (double) (arg2 - this.anInt25);
				@Pc(33) double local33 = Math.sqrt(local18 * local18 + local24 * local24);
				this.aDouble1 = (double) this.anInt24 + local18 * (double) this.anInt31 / local33;
				this.aDouble2 = (double) this.anInt25 + local24 * (double) this.anInt31 / local33;
				this.aDouble3 = this.anInt26;
			}
			local18 = this.anInt29 + 1 - arg3;
			this.aDouble4 = ((double) arg0 - this.aDouble1) / local18;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local18;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean5) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt30 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local18) * 2.0D / (local18 * local18);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("27792, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public void method20(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean5 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt33 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt34 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass21_1.aClass19_1 != null) {
				this.anInt36 += arg0;
				while (this.anInt36 > this.aClass21_1.aClass19_1.anIntArray188[this.anInt35]) {
					this.anInt36 -= this.aClass21_1.aClass19_1.anIntArray188[this.anInt35] + 1;
					this.anInt35++;
					if (this.anInt35 >= this.aClass21_1.aClass19_1.anInt546) {
						this.anInt35 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("69183, " + 0 + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 1 || arg0 > 1) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			@Pc(16) Class1_Sub3_Sub1 local16 = this.aClass21_1.method401();
			@Pc(31) Class1_Sub3_Sub1 local31 = new Class1_Sub3_Sub1(!this.aClass21_1.aBoolean133, false, false, local16, true);
			if (this.aClass21_1.aClass19_1 != null) {
				local31.method229();
				local31.method230(this.aClass21_1.aClass19_1.anIntArray186[this.anInt35]);
				local31.anIntArrayArray7 = null;
				local31.anIntArrayArray6 = null;
			}
			local31.method234(this.anInt34);
			local31.method239(this.aClass21_1.anInt579 + 64, this.aClass21_1.anInt580 + 850, -30, -50, -30, true);
			return local31;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("71052, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}

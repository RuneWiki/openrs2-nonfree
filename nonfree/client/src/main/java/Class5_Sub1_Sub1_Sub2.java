import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CSHXWWDM")
public final class Class5_Sub1_Sub1_Sub2 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!CSHXWWDM", name = "n", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!CSHXWWDM", name = "o", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!CSHXWWDM", name = "p", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!CSHXWWDM", name = "q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!CSHXWWDM", name = "x", descriptor = "I")
	private int anInt82;

	@OriginalMember(owner = "client!CSHXWWDM", name = "y", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!CSHXWWDM", name = "z", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!CSHXWWDM", name = "A", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!CSHXWWDM", name = "H", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!CSHXWWDM", name = "I", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!CSHXWWDM", name = "J", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!CSHXWWDM", name = "K", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!CSHXWWDM", name = "v", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!CSHXWWDM", name = "B", descriptor = "B")
	private byte aByte5 = 3;

	@OriginalMember(owner = "client!CSHXWWDM", name = "D", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!CSHXWWDM", name = "L", descriptor = "B")
	private byte aByte6 = 23;

	@OriginalMember(owner = "client!CSHXWWDM", name = "w", descriptor = "Lclient!BKJQHSVH;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!CSHXWWDM", name = "C", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!CSHXWWDM", name = "r", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!CSHXWWDM", name = "s", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!CSHXWWDM", name = "t", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!CSHXWWDM", name = "l", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!CSHXWWDM", name = "m", descriptor = "I")
	public int anInt77;

	@OriginalMember(owner = "client!CSHXWWDM", name = "E", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!CSHXWWDM", name = "F", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!CSHXWWDM", name = "G", descriptor = "I")
	public int anInt89;

	@OriginalMember(owner = "client!CSHXWWDM", name = "u", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!CSHXWWDM", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class5_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass6_1 = Class6.aClass6Array1[arg10];
			this.anInt86 = arg8;
			this.anInt78 = arg0;
			this.anInt79 = arg11;
			this.anInt80 = arg1;
			this.anInt76 = arg9;
			this.anInt77 = arg4;
			this.anInt87 = arg2;
			this.anInt88 = arg5;
			this.anInt89 = arg6;
			this.anInt81 = arg7;
			this.aBoolean51 = false;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("24170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXWWDM", name = "a", descriptor = "(IIIZI)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(11) double local11;
			if (!this.aBoolean51) {
				local11 = arg0 - this.anInt78;
				@Pc(17) double local17 = (double) (arg3 - this.anInt79);
				@Pc(26) double local26 = Math.sqrt(local11 * local11 + local17 * local17);
				this.aDouble1 = (double) this.anInt78 + local11 * (double) this.anInt88 / local26;
				this.aDouble2 = (double) this.anInt79 + local17 * (double) this.anInt88 / local26;
				this.aDouble3 = this.anInt80;
			}
			local11 = this.anInt77 + 1 - arg2;
			this.aDouble5 = ((double) arg0 - this.aDouble1) / local11;
			this.aDouble6 = ((double) arg3 - this.aDouble2) / local11;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean51) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt87 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble3 - this.aDouble8 * local11) * 2.0D / (local11 * local11);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("34517, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXWWDM", name = "a", descriptor = "(II)V")
	public void method58(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean51 = true;
			this.aDouble1 += this.aDouble5 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
			this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
			this.anInt84 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt85 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass6_1.aClass32_2 != null) {
				this.anInt83 += arg0;
				while (this.anInt83 > this.aClass6_1.aClass32_2.method229(this.anInt82, this.aByte5)) {
					this.anInt83 -= this.aClass6_1.aClass32_2.method229(this.anInt82, this.aByte5) + 1;
					this.anInt82++;
					if (this.anInt82 >= this.aClass6_1.aClass32_2.anInt441) {
						this.anInt82 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("38306, " + arg0 + ", " + -416 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXWWDM", name = "a", descriptor = "(I)Lclient!VYUQHOMO;")
	@Override
	protected Class5_Sub1_Sub1_Sub6 method372(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class5_Sub1_Sub1_Sub6 local3 = this.aClass6_1.method26();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass6_1.aClass32_2 != null) {
				local9 = this.aClass6_1.aClass32_2.anIntArray96[this.anInt82];
			}
			@Pc(33) Class5_Sub1_Sub1_Sub6 local33 = new Class5_Sub1_Sub1_Sub6(true, Class2.method11(local9), local3, this.aByte6, false);
			@Pc(37) boolean local37 = false;
			if (local9 != -1) {
				local33.method384();
				local33.method385(local9);
				local33.anIntArrayArray13 = null;
				local33.anIntArrayArray12 = null;
			}
			if (this.aClass6_1.anInt32 != 128 || this.aClass6_1.anInt33 != 128) {
				local33.method393(this.aClass6_1.anInt32, this.aClass6_1.anInt33, this.aClass6_1.anInt32);
			}
			local33.method389(this.anInt85, 246);
			local33.method394(this.aClass6_1.anInt35 + 64, this.aClass6_1.anInt36 + 850, -30, -50, -30, true);
			return local33;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("29085, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}

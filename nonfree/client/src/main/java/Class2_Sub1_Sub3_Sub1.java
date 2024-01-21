import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DGIXCFDO")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!DGIXCFDO", name = "l", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!DGIXCFDO", name = "q", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!DGIXCFDO", name = "r", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!DGIXCFDO", name = "s", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!DGIXCFDO", name = "x", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!DGIXCFDO", name = "y", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!DGIXCFDO", name = "z", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!DGIXCFDO", name = "A", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!DGIXCFDO", name = "B", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!DGIXCFDO", name = "C", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!DGIXCFDO", name = "D", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!DGIXCFDO", name = "L", descriptor = "I")
	public int anInt99;

	@OriginalMember(owner = "client!DGIXCFDO", name = "M", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!DGIXCFDO", name = "v", descriptor = "B")
	private byte aByte7 = -28;

	@OriginalMember(owner = "client!DGIXCFDO", name = "w", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!DGIXCFDO", name = "J", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!DGIXCFDO", name = "K", descriptor = "B")
	private byte aByte8 = -119;

	@OriginalMember(owner = "client!DGIXCFDO", name = "E", descriptor = "Lclient!TGYZPJQJ;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!DGIXCFDO", name = "I", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!DGIXCFDO", name = "m", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!DGIXCFDO", name = "n", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!DGIXCFDO", name = "o", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!DGIXCFDO", name = "t", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!DGIXCFDO", name = "u", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!DGIXCFDO", name = "F", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!DGIXCFDO", name = "N", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!DGIXCFDO", name = "G", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!DGIXCFDO", name = "H", descriptor = "I")
	public int anInt97;

	@OriginalMember(owner = "client!DGIXCFDO", name = "p", descriptor = "I")
	public int anInt89;

	@OriginalMember(owner = "client!DGIXCFDO", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class2_Sub1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass37_1 = Class37.aClass37Array1[arg11];
			this.anInt98 = arg8;
			this.anInt86 = arg4;
			this.anInt87 = arg5;
			this.anInt88 = arg9;
			this.anInt90 = arg2;
			this.anInt91 = arg0;
			this.anInt95 = arg10;
			if (arg3 != 0) {
				this.anInt101 = 5;
			}
			this.anInt96 = arg1;
			this.anInt97 = arg6;
			this.anInt89 = arg7;
			this.aBoolean29 = false;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("6552, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGIXCFDO", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	@Override
	protected Class2_Sub1_Sub3_Sub5 method510() {
		try {
			@Pc(3) Class2_Sub1_Sub3_Sub5 local3 = this.aClass37_1.method397();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass37_1.aClass23_2 != null) {
				local9 = this.aClass37_1.aClass23_2.anIntArray82[this.anInt93];
			}
			@Pc(32) Class2_Sub1_Sub3_Sub5 local32 = new Class2_Sub1_Sub3_Sub5(local3, true, false, Class31.method295(local9, (byte) 6), (byte) 0);
			if (local9 != -1) {
				local32.method430();
				local32.method431(local9);
				local32.anIntArrayArray12 = null;
				local32.anIntArrayArray11 = null;
			}
			if (this.aClass37_1.anInt620 != 128 || this.aClass37_1.anInt621 != 128) {
				local32.method439(this.aBoolean28, this.aClass37_1.anInt620, this.aClass37_1.anInt620, this.aClass37_1.anInt621);
			}
			local32.method435(this.anInt100, this.aByte7);
			local32.method440(this.aClass37_1.anInt623 + 64, this.aClass37_1.anInt624 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("48489, " + false + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGIXCFDO", name = "a", descriptor = "(ZI)V")
	public void method67(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean29 = true;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble6 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble1 * (double) arg0;
			this.anInt99 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt100 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass37_1.aClass23_2 != null) {
				this.anInt94 += arg0;
				while (this.anInt94 > this.aClass37_1.aClass23_2.method235(this.anInt93, this.anInt92)) {
					this.anInt94 -= this.aClass37_1.aClass23_2.method235(this.anInt93, this.anInt92) + 1;
					this.anInt93++;
					if (this.anInt93 >= this.aClass37_1.aClass23_2.anInt358) {
						this.anInt93 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("76301, " + false + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGIXCFDO", name = "a", descriptor = "(BIIII)V")
	public void method68(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.aByte8 != -119) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(19) double local19;
			if (!this.aBoolean29) {
				local19 = arg1 - this.anInt86;
				@Pc(25) double local25 = (double) (arg0 - this.anInt87);
				@Pc(34) double local34 = Math.sqrt(local19 * local19 + local25 * local25);
				this.aDouble2 = (double) this.anInt86 + local19 * (double) this.anInt96 / local34;
				this.aDouble3 = (double) this.anInt87 + local25 * (double) this.anInt96 / local34;
				this.aDouble4 = this.anInt88;
			}
			local19 = this.anInt91 + 1 - arg3;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local19;
			this.aDouble6 = ((double) arg0 - this.aDouble3) / local19;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean29) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt95 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg2 - this.aDouble4 - this.aDouble8 * local19) * 2.0D / (local19 * local19);
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("39882, " + -119 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}

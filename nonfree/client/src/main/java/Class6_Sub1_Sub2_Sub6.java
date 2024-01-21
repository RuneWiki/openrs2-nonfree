import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XQTFUCRC")
public final class Class6_Sub1_Sub2_Sub6 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!XQTFUCRC", name = "m", descriptor = "I")
	private int anInt739;

	@OriginalMember(owner = "client!XQTFUCRC", name = "n", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!XQTFUCRC", name = "o", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!XQTFUCRC", name = "p", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!XQTFUCRC", name = "q", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!XQTFUCRC", name = "r", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!XQTFUCRC", name = "s", descriptor = "I")
	private int anInt742;

	@OriginalMember(owner = "client!XQTFUCRC", name = "y", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!XQTFUCRC", name = "z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!XQTFUCRC", name = "A", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!XQTFUCRC", name = "B", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!XQTFUCRC", name = "F", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!XQTFUCRC", name = "H", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!XQTFUCRC", name = "I", descriptor = "I")
	private int anInt751 = 584;

	@OriginalMember(owner = "client!XQTFUCRC", name = "L", descriptor = "B")
	private byte aByte53 = 2;

	@OriginalMember(owner = "client!XQTFUCRC", name = "x", descriptor = "Lclient!OKJTNJLE;")
	private Class28 aClass28_2;

	@OriginalMember(owner = "client!XQTFUCRC", name = "G", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!XQTFUCRC", name = "t", descriptor = "I")
	private int anInt743;

	@OriginalMember(owner = "client!XQTFUCRC", name = "u", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!XQTFUCRC", name = "v", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!XQTFUCRC", name = "J", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!XQTFUCRC", name = "K", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!XQTFUCRC", name = "C", descriptor = "I")
	private int anInt747;

	@OriginalMember(owner = "client!XQTFUCRC", name = "D", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!XQTFUCRC", name = "E", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!XQTFUCRC", name = "w", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!XQTFUCRC", name = "<init>", descriptor = "(IIIIIIZIIIII)V")
	public Class6_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass28_2 = Class28.aClass28Array1[arg0];
			this.anInt750 = arg1;
			this.anInt743 = arg2;
			this.anInt744 = arg4;
			this.anInt745 = arg9;
			this.anInt752 = arg11;
			this.anInt753 = arg10;
			this.anInt747 = arg5;
			this.anInt748 = arg8;
			this.anInt749 = arg3;
			this.anInt746 = arg7;
			this.aBoolean184 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("22383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQTFUCRC", name = "a", descriptor = "(IB)V")
	public void method523(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aBoolean184 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			if (arg1 != 10) {
				for (@Pc(19) int local19 = 1; local19 > 0; local19++) {
				}
			}
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + 0.5D * this.aDouble8 * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt741 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt742 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass28_2.aClass2_2 != null) {
				this.anInt740 += arg0;
				while (this.anInt740 > this.aClass28_2.aClass2_2.method12(this.anInt739, 214)) {
					this.anInt740 -= this.aClass28_2.aClass2_2.method12(this.anInt739, 214);
					this.anInt739++;
					if (this.anInt739 >= this.aClass28_2.aClass2_2.anInt40) {
						this.anInt739 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("31607, " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQTFUCRC", name = "a", descriptor = "(IIIII)V")
	public void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(11) double local11;
			if (!this.aBoolean184) {
				local11 = (double) (arg3 - this.anInt743);
				@Pc(17) double local17 = (double) (arg1 - this.anInt744);
				@Pc(26) double local26 = Math.sqrt(local11 * local11 + local17 * local17);
				this.aDouble1 = (double) this.anInt743 + local11 * (double) this.anInt748 / local26;
				this.aDouble2 = (double) this.anInt744 + local17 * (double) this.anInt748 / local26;
				this.aDouble3 = (double) this.anInt745;
			}
			local11 = (double) (this.anInt753 + 1 - arg0);
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local11;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local11;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean184) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt747 * 0.02454369D);
			}
			this.aDouble8 = 2.0D * ((double) arg2 - this.aDouble3 - this.aDouble7 * local11) / (local11 * local11);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("19439, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XQTFUCRC", name = "a", descriptor = "(B)Lclient!FLXAIVEA;")
	@Override
	protected Class6_Sub1_Sub2_Sub2 method522(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class6_Sub1_Sub2_Sub2 local3 = this.aClass28_2.method188();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (2 != this.aByte53) {
				this.anInt751 = -203;
			}
			if (this.aClass28_2.aClass2_2 != null) {
				local9 = this.aClass28_2.aClass2_2.anIntArray10[this.anInt739];
			}
			@Pc(39) Class6_Sub1_Sub2_Sub2 local39 = new Class6_Sub1_Sub2_Sub2(local3, Class27.method185(local9), true, (byte) 8, false);
			if (local9 != -1) {
				local39.method93();
				local39.method94(local9);
				local39.anIntArrayArray5 = null;
				local39.anIntArrayArray4 = null;
			}
			if (this.aClass28_2.anInt351 != 128 || this.aClass28_2.anInt352 != 128) {
				local39.method102(this.aClass28_2.anInt351, this.aClass28_2.anInt351, this.aClass28_2.anInt352);
			}
			local39.method98(this.anInt742, 81);
			local39.method103(64 + this.aClass28_2.anInt354, 850 + this.aClass28_2.anInt355, -30, -50, -30, true);
			return local39;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("80712, " + 2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}

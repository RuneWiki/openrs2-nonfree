import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YBXLKULU")
public final class Class3_Sub1_Sub1_Sub5 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!YBXLKULU", name = "p", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!YBXLKULU", name = "q", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!YBXLKULU", name = "r", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!YBXLKULU", name = "s", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!YBXLKULU", name = "w", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!YBXLKULU", name = "x", descriptor = "I")
	private int anInt784;

	@OriginalMember(owner = "client!YBXLKULU", name = "B", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!YBXLKULU", name = "C", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!YBXLKULU", name = "D", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!YBXLKULU", name = "E", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!YBXLKULU", name = "L", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!YBXLKULU", name = "M", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!YBXLKULU", name = "n", descriptor = "B")
	private byte aByte40 = 1;

	@OriginalMember(owner = "client!YBXLKULU", name = "o", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!YBXLKULU", name = "t", descriptor = "I")
	private int anInt781 = 5;

	@OriginalMember(owner = "client!YBXLKULU", name = "v", descriptor = "Lclient!XWNROHZR;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!YBXLKULU", name = "u", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!YBXLKULU", name = "H", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!YBXLKULU", name = "I", descriptor = "I")
	private int anInt791;

	@OriginalMember(owner = "client!YBXLKULU", name = "J", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!YBXLKULU", name = "F", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!YBXLKULU", name = "G", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!YBXLKULU", name = "y", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!YBXLKULU", name = "z", descriptor = "I")
	private int anInt786;

	@OriginalMember(owner = "client!YBXLKULU", name = "A", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!YBXLKULU", name = "K", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!YBXLKULU", name = "<init>", descriptor = "(IIIIIIIIBIII)V")
	public Class3_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass44_2 = Class44.aClass44Array1[arg0];
			this.anInt782 = arg7;
			this.anInt790 = arg6;
			this.anInt791 = arg4;
			this.anInt792 = arg11;
			this.anInt788 = arg1;
			this.anInt789 = arg2;
			this.anInt785 = arg5;
			this.anInt786 = arg9;
			this.anInt787 = arg3;
			this.anInt793 = arg10;
			this.aBoolean204 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("9789, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YBXLKULU", name = "a", descriptor = "(I)Lclient!CADBNSXE;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method562(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class3_Sub1_Sub1_Sub1 local3 = this.aClass44_2.method552();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (arg0 >= 0) {
				for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
				}
			}
			if (this.aClass44_2.aClass38_2 != null) {
				local9 = this.aClass44_2.aClass38_2.anIntArray191[this.anInt794];
			}
			@Pc(42) Class3_Sub1_Sub1_Sub1 local42 = new Class3_Sub1_Sub1_Sub1(false, Class7.method94(local9), local3, this.aByte40, true);
			if (local9 != -1) {
				local42.method29();
				local42.method30(local9);
				local42.anIntArrayArray3 = null;
				local42.anIntArrayArray2 = null;
			}
			if (this.aClass44_2.anInt764 != 128 || this.aClass44_2.anInt765 != 128) {
				local42.method38(this.aClass44_2.anInt764, this.aClass44_2.anInt765, this.aClass44_2.anInt764);
			}
			local42.method34(this.anInt784);
			local42.method39(this.aClass44_2.anInt767 + 64, this.aClass44_2.anInt768 + 850, -30, -50, -30, true);
			return local42;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("119, " + arg0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YBXLKULU", name = "a", descriptor = "(BI)V")
	public void method557(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean204 = true;
			this.aDouble1 += this.aDouble5 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
			this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
			this.anInt783 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt784 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass44_2.aClass38_2 != null) {
				this.anInt795 += arg0;
				while (this.anInt795 > this.aClass44_2.aClass38_2.method525((byte) 5, this.anInt794)) {
					this.anInt795 -= this.aClass44_2.aClass38_2.method525((byte) 5, this.anInt794) + 1;
					this.anInt794++;
					if (this.anInt794 >= this.aClass44_2.aClass38_2.anInt707) {
						this.anInt794 = 0;
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("97334, " + -10 + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YBXLKULU", name = "a", descriptor = "(ZIIII)V")
	public void method558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean204) {
				local8 = arg3 - this.anInt790;
				@Pc(14) double local14 = (double) (arg0 - this.anInt791);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt790 + local8 * (double) this.anInt786 / local23;
				this.aDouble2 = (double) this.anInt791 + local14 * (double) this.anInt786 / local23;
				this.aDouble3 = this.anInt792;
			}
			local8 = this.anInt789 + 1 - arg1;
			this.aDouble5 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg0 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean204) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt785 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg2 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("92052, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	public int anInt1042;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!e", name = "db", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!e", name = "lb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!e", name = "nb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	private int anInt1052 = 0;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	private int anInt1044 = 0;

	@OriginalMember(owner = "client!e", name = "T", descriptor = "I")
	private int anInt1059 = -32768;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!e", name = "D", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
	public int anInt1071;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
	public int anInt1065;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "Lclient!qa;")
	private Class96 aClass96_1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1060 = arg4;
		this.anInt1050 = arg3;
		this.anInt1063 = arg8;
		this.anInt1053 = arg9;
		this.anInt1071 = arg5;
		this.aBoolean99 = false;
		this.anInt1048 = arg6;
		this.anInt1064 = arg0;
		this.anInt1065 = arg1;
		this.anInt1047 = arg10;
		this.anInt1055 = arg7;
		this.anInt1061 = arg2;
		@Pc(55) int local55 = Static89.method1514(this.anInt1064).anInt2562;
		if (local55 == -1) {
			this.aClass96_1 = null;
		} else {
			this.aClass96_1 = Static2.method88(local55);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public void method921(@OriginalArg(0) int arg0) {
		this.aDouble7 += this.aDouble8 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble1;
		this.aDouble5 += this.aDouble6 * (double) arg0;
		this.aBoolean99 = true;
		this.aDouble2 += this.aDouble3 * (double) arg0;
		this.aDouble1 += (double) arg0 * this.aDouble8;
		this.anInt1042 = (int) (Math.atan2(this.aDouble6, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt1066 = (int) (Math.atan2(this.aDouble1, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass96_1 == null) {
			return;
		}
		this.anInt1052 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass96_1.anIntArray327[this.anInt1044] >= this.anInt1052) {
						return;
					}
					this.anInt1052 -= this.aClass96_1.anIntArray327[this.anInt1044];
					this.anInt1044++;
				} while (this.aClass96_1.anIntArray323.length > this.anInt1044);
				this.anInt1044 -= this.aClass96_1.anInt3645;
			} while (this.anInt1044 >= 0 && this.aClass96_1.anIntArray323.length > this.anInt1044);
			this.anInt1044 = 0;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lclient!nb;")
	private Class5_Sub3 method923() {
		@Pc(15) Class69 local15 = Static89.method1514(this.anInt1064);
		@Pc(21) Class5_Sub3 local21 = local15.method2008(this.anInt1044);
		if (local21 == null) {
			return null;
		} else {
			local21.method530(this.anInt1066);
			return local21;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class5_Sub3 local3 = this.method923();
		if (local3 != null) {
			local3.method2300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1059 = local3.method2297();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		return this.anInt1059;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIII)V")
	public void method928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) double local15;
		if (!this.aBoolean99) {
			@Pc(9) double local9 = (double) (arg1 - this.anInt1050);
			local15 = arg2 - this.anInt1061;
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble2 = local9 * (double) this.anInt1063 / local24 + (double) this.anInt1050;
			this.aDouble7 = this.anInt1060;
			this.aDouble5 = (double) this.anInt1061 + (double) this.anInt1063 * local15 / local24;
		}
		local15 = this.anInt1048 + 1 - arg3;
		this.aDouble3 = ((double) arg1 - this.aDouble2) / local15;
		this.aDouble6 = ((double) arg2 - this.aDouble5) / local15;
		this.aDouble4 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble3 * this.aDouble3);
		if (!this.aBoolean99) {
			this.aDouble1 = -this.aDouble4 * Math.tan((double) this.anInt1055 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg0 - this.aDouble7 - this.aDouble1 * local15) * 2.0D / (local15 * local15);
	}
}

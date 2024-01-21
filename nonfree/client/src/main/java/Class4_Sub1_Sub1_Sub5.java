import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QJBDGANU")
public final class Class4_Sub1_Sub1_Sub5 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!QJBDGANU", name = "m", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!QJBDGANU", name = "n", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!QJBDGANU", name = "o", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!QJBDGANU", name = "p", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!QJBDGANU", name = "q", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!QJBDGANU", name = "A", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!QJBDGANU", name = "I", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!QJBDGANU", name = "J", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!QJBDGANU", name = "K", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!QJBDGANU", name = "L", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!QJBDGANU", name = "M", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!QJBDGANU", name = "N", descriptor = "I")
	private int anInt560;

	@OriginalMember(owner = "client!QJBDGANU", name = "u", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!QJBDGANU", name = "v", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!QJBDGANU", name = "B", descriptor = "I")
	private int anInt552 = 40410;

	@OriginalMember(owner = "client!QJBDGANU", name = "F", descriptor = "I")
	private int anInt556 = 559;

	@OriginalMember(owner = "client!QJBDGANU", name = "t", descriptor = "Lclient!BUIWQSXJ;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!QJBDGANU", name = "O", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!QJBDGANU", name = "w", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "client!QJBDGANU", name = "x", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!QJBDGANU", name = "y", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!QJBDGANU", name = "G", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!QJBDGANU", name = "H", descriptor = "I")
	public int anInt558;

	@OriginalMember(owner = "client!QJBDGANU", name = "C", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!QJBDGANU", name = "D", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!QJBDGANU", name = "E", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!QJBDGANU", name = "z", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!QJBDGANU", name = "r", descriptor = "I")
	private int anInt547;

	@OriginalMember(owner = "client!QJBDGANU", name = "<init>", descriptor = "(IIIIBIIIIIII)V")
	public Class4_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass6_2 = Class6.aClass6Array1[arg5];
			this.anInt561 = arg3;
			this.anInt548 = arg6;
			this.anInt549 = arg9;
			this.anInt550 = arg0;
			this.anInt557 = arg2;
			this.anInt558 = arg1;
			this.anInt553 = arg7;
			this.anInt554 = arg8;
			this.anInt555 = arg11;
			this.anInt551 = arg10;
			this.aBoolean147 = false;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("40318, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBDGANU", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method559() {
		try {
			@Pc(3) Class4_Sub1_Sub1_Sub4 local3 = this.aClass6_2.method72();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass6_2.aClass21_1 != null) {
				local9 = this.aClass6_2.aClass21_1.anIntArray69[this.anInt545];
			}
			@Pc(32) Class4_Sub1_Sub1_Sub4 local32 = new Class4_Sub1_Sub1_Sub4(Class16.method193(local9), true, false, -785, local3);
			if (local9 != -1) {
				local32.method406();
				local32.method407(local9);
				local32.anIntArrayArray12 = null;
				local32.anIntArrayArray11 = null;
			}
			if (this.aClass6_2.anInt34 != 128 || this.aClass6_2.anInt35 != 128) {
				local32.method415(this.aClass6_2.anInt35, this.aClass6_2.anInt34, this.aClass6_2.anInt34);
			}
			local32.method411(this.anInt560);
			local32.method416(this.aClass6_2.anInt37 + 64, this.aClass6_2.anInt38 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("74888, " + true + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBDGANU", name = "a", descriptor = "(ZI)V")
	public void method431(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean147 = true;
			this.aDouble1 += this.aDouble5 * (double) arg1;
			this.aDouble2 += this.aDouble6 * (double) arg1;
			this.aDouble3 += this.aDouble8 * (double) arg1 + this.aDouble4 * 0.5D * (double) arg1 * (double) arg1;
			this.aDouble8 += this.aDouble4 * (double) arg1;
			this.anInt559 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt560 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (!arg0) {
				this.anInt547 = 430;
			}
			if (this.aClass6_2.aClass21_1 != null) {
				this.anInt546 += arg1;
				while (this.anInt546 > this.aClass6_2.aClass21_1.method275(this.anInt552, this.anInt545)) {
					this.anInt546 -= this.aClass6_2.aClass21_1.method275(this.anInt552, this.anInt545) + 1;
					this.anInt545++;
					if (this.anInt545 >= this.aClass6_2.aClass21_1.anInt369) {
						this.anInt545 = 0;
					}
				}
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("85866, " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBDGANU", name = "a", descriptor = "(IIBII)V")
	public void method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean147) {
				local8 = arg3 - this.anInt548;
				@Pc(14) double local14 = (double) (arg1 - this.anInt549);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt548 + local8 * (double) this.anInt554 / local23;
				this.aDouble2 = (double) this.anInt549 + local14 * (double) this.anInt554 / local23;
				this.aDouble3 = this.anInt550;
			}
			local8 = this.anInt558 + 1 - arg0;
			this.aDouble5 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean147) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt553 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg2 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("40037, " + arg0 + ", " + arg1 + ", " + -41 + ", " + arg2 + ", " + arg3 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}

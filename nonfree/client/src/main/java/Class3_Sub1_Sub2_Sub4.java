import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OPRNYJBH")
public final class Class3_Sub1_Sub2_Sub4 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!OPRNYJBH", name = "q", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!OPRNYJBH", name = "r", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!OPRNYJBH", name = "v", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!OPRNYJBH", name = "w", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!OPRNYJBH", name = "x", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!OPRNYJBH", name = "y", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!OPRNYJBH", name = "z", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!OPRNYJBH", name = "H", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!OPRNYJBH", name = "K", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!OPRNYJBH", name = "L", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!OPRNYJBH", name = "M", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!OPRNYJBH", name = "N", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!OPRNYJBH", name = "O", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!OPRNYJBH", name = "u", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!OPRNYJBH", name = "E", descriptor = "Z")
	private boolean aBoolean113 = true;

	@OriginalMember(owner = "client!OPRNYJBH", name = "I", descriptor = "Z")
	private boolean aBoolean114 = true;

	@OriginalMember(owner = "client!OPRNYJBH", name = "J", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!OPRNYJBH", name = "t", descriptor = "Lclient!CIVOPMKV;")
	private Class7 aClass7_2;

	@OriginalMember(owner = "client!OPRNYJBH", name = "s", descriptor = "I")
	public int anInt343;

	@OriginalMember(owner = "client!OPRNYJBH", name = "A", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!OPRNYJBH", name = "B", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!OPRNYJBH", name = "C", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!OPRNYJBH", name = "F", descriptor = "I")
	public int anInt350;

	@OriginalMember(owner = "client!OPRNYJBH", name = "G", descriptor = "I")
	public int anInt351;

	@OriginalMember(owner = "client!OPRNYJBH", name = "n", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!OPRNYJBH", name = "o", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!OPRNYJBH", name = "p", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!OPRNYJBH", name = "D", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!OPRNYJBH", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass7_2 = Class7.aClass7Array1[arg11];
			this.anInt343 = arg5;
			this.anInt346 = arg8;
			this.anInt347 = arg6;
			this.anInt348 = arg4;
			this.anInt350 = arg1;
			this.anInt351 = arg10;
			this.anInt338 = arg2;
			this.anInt339 = arg0;
			this.anInt340 = arg9;
			this.anInt349 = arg7;
			this.aBoolean115 = false;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("45011, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPRNYJBH", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	@Override
	protected Class3_Sub1_Sub2_Sub6 method505() {
		try {
			@Pc(9) Class3_Sub1_Sub2_Sub6 local9 = this.aClass7_2.method69();
			if (local9 == null) {
				return null;
			}
			@Pc(15) int local15 = -1;
			if (this.aClass7_2.aClass49_1 != null) {
				local15 = this.aClass7_2.aClass49_1.anIntArray206[this.anInt341];
			}
			@Pc(38) Class3_Sub1_Sub2_Sub6 local38 = new Class3_Sub1_Sub2_Sub6(660, local9, Class15.method125(local15), true, false);
			if (local15 != -1) {
				local38.method517();
				local38.method518(598, local15);
				local38.anIntArrayArray18 = null;
				local38.anIntArrayArray17 = null;
			}
			if (this.aClass7_2.anInt124 != 128 || this.aClass7_2.anInt125 != 128) {
				local38.method526(this.aClass7_2.anInt125, this.aClass7_2.anInt124, this.aClass7_2.anInt124);
			}
			local38.method522(this.anInt345);
			local38.method527(this.aClass7_2.anInt127 + 64, this.aClass7_2.anInt128 + 850, -30, -50, -30, true);
			return local38;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("76808, " + true + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPRNYJBH", name = "a", descriptor = "(IIIII)V")
	public void method290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean115) {
				local8 = arg0 - this.anInt346;
				@Pc(14) double local14 = (double) (arg1 - this.anInt347);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt346 + local8 * (double) this.anInt339 / local23;
				this.aDouble2 = (double) this.anInt347 + local14 * (double) this.anInt339 / local23;
				this.aDouble3 = this.anInt348;
			}
			local8 = this.anInt351 + 1 - arg2;
			this.aDouble5 = ((double) arg0 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean115) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt338 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg3 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("57958, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPRNYJBH", name = "a", descriptor = "(ZI)V")
	public void method291(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean115 = true;
			this.aDouble1 += this.aDouble5 * (double) arg1;
			this.aDouble2 += this.aDouble6 * (double) arg1;
			if (arg0) {
				this.anInt352 = 431;
			}
			this.aDouble3 += this.aDouble8 * (double) arg1 + this.aDouble4 * 0.5D * (double) arg1 * (double) arg1;
			this.aDouble8 += this.aDouble4 * (double) arg1;
			this.anInt344 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt345 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass7_2.aClass49_1 != null) {
				this.anInt342 += arg1;
				while (this.anInt342 > this.aClass7_2.aClass49_1.method567(this.anInt341)) {
					this.anInt342 -= this.aClass7_2.aClass49_1.method567(this.anInt341) + 1;
					this.anInt341++;
					if (this.anInt341 >= this.aClass7_2.aClass49_1.anInt786) {
						this.anInt341 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("13582, " + arg0 + ", " + arg1 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}
}

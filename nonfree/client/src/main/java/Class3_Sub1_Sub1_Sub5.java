import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PXEWTQHA")
public final class Class3_Sub1_Sub1_Sub5 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!PXEWTQHA", name = "p", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!PXEWTQHA", name = "q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!PXEWTQHA", name = "r", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!PXEWTQHA", name = "s", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!PXEWTQHA", name = "B", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!PXEWTQHA", name = "C", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!PXEWTQHA", name = "D", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!PXEWTQHA", name = "E", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!PXEWTQHA", name = "G", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!PXEWTQHA", name = "K", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!PXEWTQHA", name = "L", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!PXEWTQHA", name = "M", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!PXEWTQHA", name = "l", descriptor = "Z")
	private boolean aBoolean138 = true;

	@OriginalMember(owner = "client!PXEWTQHA", name = "t", descriptor = "I")
	private int anInt501 = -456;

	@OriginalMember(owner = "client!PXEWTQHA", name = "H", descriptor = "I")
	private int anInt513 = 9;

	@OriginalMember(owner = "client!PXEWTQHA", name = "I", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!PXEWTQHA", name = "J", descriptor = "I")
	private int anInt514 = -79;

	@OriginalMember(owner = "client!PXEWTQHA", name = "F", descriptor = "Lclient!FXNZCBPL;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!PXEWTQHA", name = "A", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!PXEWTQHA", name = "w", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!PXEWTQHA", name = "x", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!PXEWTQHA", name = "y", descriptor = "I")
	private int anInt506;

	@OriginalMember(owner = "client!PXEWTQHA", name = "u", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!PXEWTQHA", name = "v", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!PXEWTQHA", name = "m", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!PXEWTQHA", name = "n", descriptor = "I")
	private int anInt499;

	@OriginalMember(owner = "client!PXEWTQHA", name = "o", descriptor = "I")
	public int anInt500;

	@OriginalMember(owner = "client!PXEWTQHA", name = "z", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!PXEWTQHA", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class3_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass6_1 = Class6.aClass6Array1[arg8];
			this.anInt508 = arg5;
			this.anInt504 = arg1;
			this.anInt505 = arg0;
			this.anInt506 = arg7;
			this.anInt502 = arg3;
			this.anInt503 = arg2;
			this.anInt498 = arg11;
			this.anInt499 = arg9;
			this.anInt500 = arg4;
			this.anInt507 = arg10;
			this.aBoolean139 = false;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("76557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXEWTQHA", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method535() {
		try {
			@Pc(9) Class3_Sub1_Sub1_Sub1 local9 = this.aClass6_1.method82();
			if (local9 == null) {
				return null;
			}
			@Pc(15) int local15 = -1;
			if (this.aClass6_1.aClass31_2 != null) {
				local15 = this.aClass6_1.aClass31_2.anIntArray126[this.anInt511];
			}
			@Pc(38) Class3_Sub1_Sub1_Sub1 local38 = new Class3_Sub1_Sub1_Sub1(true, Class18.method210(local15), local9, false, (byte) -45);
			if (local15 != -1) {
				local38.method40();
				local38.method41(local15);
				local38.anIntArrayArray2 = null;
				local38.anIntArrayArray1 = null;
			}
			if (this.aClass6_1.anInt121 != 128 || this.aClass6_1.anInt122 != 128) {
				local38.method49(this.aClass6_1.anInt121, this.aClass6_1.anInt122, this.aClass6_1.anInt121);
			}
			local38.method45(this.anInt510);
			local38.method50(this.aClass6_1.anInt124 + 64, 850 + this.aClass6_1.anInt125, -30, -50, -30, true);
			return local38;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("55949, " + true + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXEWTQHA", name = "a", descriptor = "(IBIII)V")
	public void method346(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean139) {
				local8 = (double) (arg2 - this.anInt504);
				@Pc(14) double local14 = (double) (arg3 - this.anInt505);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble6 = (double) this.anInt504 + local8 * (double) this.anInt499 / local23;
				this.aDouble7 = (double) this.anInt505 + local14 * (double) this.anInt499 / local23;
				this.aDouble8 = (double) this.anInt506;
			}
			local8 = (double) (this.anInt503 + 1 - arg4);
			this.aDouble1 = ((double) arg2 - this.aDouble6) / local8;
			this.aDouble2 = ((double) arg3 - this.aDouble7) / local8;
			@Pc(85) boolean local85 = false;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean139) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt498 * 0.02454369D);
			}
			this.aDouble5 = 2.0D * ((double) arg0 - this.aDouble8 - this.aDouble4 * local8) / (local8 * local8);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("93880, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PXEWTQHA", name = "a", descriptor = "(II)V")
	public void method347(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean139 = true;
			this.aDouble6 += this.aDouble1 * (double) arg0;
			this.aDouble7 += this.aDouble2 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0 + 0.5D * this.aDouble5 * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble5 * (double) arg0;
			this.anInt509 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt510 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass6_1.aClass31_2 != null) {
				this.anInt512 += arg0;
				while (this.anInt512 > this.aClass6_1.aClass31_2.method340(this.anInt511, this.anInt513)) {
					this.anInt512 -= this.aClass6_1.aClass31_2.method340(this.anInt511, this.anInt513) + 1;
					this.anInt511++;
					if (this.anInt511 >= this.aClass6_1.aClass31_2.anInt481) {
						this.anInt511 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("91406, " + arg0 + ", " + 3 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}

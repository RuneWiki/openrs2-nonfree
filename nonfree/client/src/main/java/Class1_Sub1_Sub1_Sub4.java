import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public int anInt458;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt459;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt460;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private int anInt447 = 6;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public int anInt448;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt451;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt454;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt452;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIZI)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg3];
			this.anInt448 = arg6;
			this.anInt449 = arg4;
			this.anInt450 = arg7;
			this.anInt451 = arg1;
			this.anInt453 = arg2;
			this.anInt454 = arg8;
			this.anInt455 = arg9;
			this.anInt456 = arg0;
			this.anInt457 = arg5;
			this.anInt452 = arg11;
			this.aBoolean109 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("7515, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIII)V")
	public void method240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean109) {
				local8 = arg3 - this.anInt449;
				@Pc(14) double local14 = (double) (arg1 - this.anInt450);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt449 + local8 * (double) this.anInt456 / local23;
				this.aDouble2 = (double) this.anInt450 + local14 * (double) this.anInt456 / local23;
				this.aDouble3 = this.anInt451;
			}
			local8 = this.anInt454 + 1 - arg2;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean109) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt455 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("57005, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public void method241(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean109 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt458 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt459 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt461 += arg0;
				while (this.anInt461 > this.aClass33_1.aClass27_2.method502(this.anInt460)) {
					this.anInt461 -= this.aClass33_1.aClass27_2.method502(this.anInt460) + 1;
					this.anInt460++;
					if (this.anInt460 >= this.aClass33_1.aClass27_2.anInt783) {
						this.anInt460 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("69669, " + arg0 + ", " + -816 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method672() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_1.method519();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local9 = this.aClass33_1.aClass27_2.anIntArray224[this.anInt460];
			}
			@Pc(33) Class1_Sub1_Sub1_Sub5 local33 = new Class1_Sub1_Sub1_Sub5(local3, Class12.method304(local9), false, this.anInt446, true);
			if (local9 != -1) {
				local33.method267((byte) 3);
				local33.method268(local9, 188);
				local33.anIntArrayArray9 = null;
				local33.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt819 != 128 || this.aClass33_1.anInt820 != 128) {
				local33.method276(this.aClass33_1.anInt819, this.aClass33_1.anInt819, this.aClass33_1.anInt820);
			}
			local33.method272(this.anInt459);
			local33.method277(this.aClass33_1.anInt822 + 64, this.aClass33_1.anInt823 + 850, -30, -50, -30, true);
			return local33;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("13403, " + -37770 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}
}

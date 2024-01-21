import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "z", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private int anInt449 = 5;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private int anInt450 = 7;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt453;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt459;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public int anInt455;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg7];
			this.anInt451 = arg6;
			this.anInt452 = arg5;
			this.anInt453 = arg9;
			this.anInt454 = arg0;
			this.anInt456 = arg11;
			this.anInt457 = arg10;
			this.anInt458 = arg3;
			this.anInt459 = arg2;
			this.anInt460 = arg4;
			this.anInt455 = arg8;
			this.aBoolean116 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("60988, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIII)V")
	public void method241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean116) {
				local8 = arg3 - this.anInt452;
				@Pc(14) double local14 = (double) (arg2 - this.anInt453);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt452 + local8 * (double) this.anInt459 / local23;
				this.aDouble2 = (double) this.anInt453 + local14 * (double) this.anInt459 / local23;
				this.aDouble3 = this.anInt454;
			}
			local8 = this.anInt457 + 1 - arg0;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean116) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt458 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("87466, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public void method242(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean116 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			if (this.anInt450 > 7 || this.anInt450 < 7) {
				for (@Pc(24) int local24 = 1; local24 > 0; local24++) {
				}
			}
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt461 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt462 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt464 += arg0;
				while (this.anInt464 > this.aClass33_1.aClass27_2.method506(this.anInt463)) {
					this.anInt464 -= this.aClass33_1.aClass27_2.method506(this.anInt463) + 1;
					this.anInt463++;
					if (this.anInt463 >= this.aClass33_1.aClass27_2.anInt785) {
						this.anInt463 = 0;
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("2420, " + 7 + ", " + arg0 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_1.method523();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local9 = this.aClass33_1.aClass27_2.anIntArray225[this.anInt463];
			}
			@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = new Class1_Sub1_Sub1_Sub5(false, local3, true, (byte) 119, Class12.method306(local9, (byte) 7));
			if (local9 != -1) {
				local41.method268();
				local41.method269(local9);
				local41.anIntArrayArray9 = null;
				local41.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt820 != 128 || this.aClass33_1.anInt821 != 128) {
				local41.method277(this.aClass33_1.anInt820, this.aClass33_1.anInt820, this.aClass33_1.anInt821);
			}
			local41.method273(this.anInt462);
			local41.method278(this.aClass33_1.anInt823 + 64, this.aClass33_1.anInt824 + 850, -30, -50, -30, true);
			return local41;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("11889, " + true + ", " + local103.toString());
			throw new RuntimeException();
		}
	}
}

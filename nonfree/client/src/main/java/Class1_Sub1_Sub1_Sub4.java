import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

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
	public int anInt471;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private int anInt460 = 5;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg9];
			this.anInt461 = arg5;
			this.anInt462 = arg2;
			this.anInt463 = arg10;
			this.anInt464 = arg4;
			this.anInt466 = arg11;
			this.anInt467 = arg0;
			this.anInt468 = arg7;
			this.anInt469 = arg3;
			while (arg1 >= 0) {
				this.anInt460 = -137;
			}
			this.anInt470 = arg6;
			this.anInt465 = arg8;
			this.aBoolean107 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("18183, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V")
	public void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(10) double local10;
			if (!this.aBoolean107) {
				local10 = arg4 - this.anInt462;
				@Pc(16) double local16 = (double) (arg0 - this.anInt463);
				@Pc(25) double local25 = Math.sqrt(local10 * local10 + local16 * local16);
				this.aDouble1 = (double) this.anInt462 + local10 * (double) this.anInt469 / local25;
				this.aDouble2 = (double) this.anInt463 + local16 * (double) this.anInt469 / local25;
				this.aDouble3 = this.anInt464;
			}
			local10 = this.anInt467 + 1 - arg1;
			@Pc(69) boolean local69 = false;
			this.aDouble4 = ((double) arg4 - this.aDouble1) / local10;
			this.aDouble5 = ((double) arg0 - this.aDouble2) / local10;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean107) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt468 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local10) * 2.0D / (local10 * local10);
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("80744, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	public void method242(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean107 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt471 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt472 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt474 += arg0;
				while (this.anInt474 > this.aClass33_1.aClass27_2.method506(this.anInt473)) {
					this.anInt474 -= this.aClass33_1.aClass27_2.method506(this.anInt473) + 1;
					this.anInt473++;
					if (this.anInt473 >= this.aClass33_1.aClass27_2.anInt791) {
						this.anInt473 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("97255, " + arg0 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(14) Class1_Sub1_Sub1_Sub5 local14 = this.aClass33_1.method523();
			if (local14 == null) {
				return null;
			}
			@Pc(20) int local20 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local20 = this.aClass33_1.aClass27_2.anIntArray225[this.anInt473];
			}
			@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = new Class1_Sub1_Sub1_Sub5(false, true, Class12.method306(local20), local14, 396);
			if (local20 != -1) {
				local43.method268();
				local43.method269(local20);
				local43.anIntArrayArray9 = null;
				local43.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt825 != 128 || this.aClass33_1.anInt826 != 128) {
				local43.method277(this.aClass33_1.anInt825, this.aClass33_1.anInt825, this.aClass33_1.anInt826);
			}
			local43.method273(this.anInt472);
			local43.method278(this.aClass33_1.anInt828 + 64, this.aClass33_1.anInt829 + 850, -30, -50, -30, true);
			return local43;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("88722, " + -67 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}

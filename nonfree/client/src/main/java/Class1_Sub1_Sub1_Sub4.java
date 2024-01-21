import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "y", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private int anInt463 = 25881;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			if (arg0 != 0) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			this.aClass33_1 = Class33.aClass33Array1[arg3];
			this.anInt464 = arg10;
			this.anInt465 = arg8;
			this.anInt466 = arg2;
			this.anInt467 = arg1;
			this.anInt469 = arg11;
			this.anInt470 = arg4;
			this.anInt471 = arg6;
			this.anInt472 = arg7;
			this.anInt473 = arg5;
			this.anInt468 = arg9;
			this.aBoolean104 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("82448, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZII)V")
	public void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean104) {
				local8 = arg3 - this.anInt465;
				@Pc(14) double local14 = (double) (arg0 - this.anInt466);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt465 + local8 * (double) this.anInt472 / local23;
				this.aDouble2 = (double) this.anInt466 + local14 * (double) this.anInt472 / local23;
				this.aDouble3 = this.anInt467;
			}
			local8 = this.anInt470 + 1 - arg1;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg0 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean104) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt471 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("83438, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public void method242(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean104 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt474 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt475 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt477 += arg0;
				while (this.anInt477 > this.aClass33_1.aClass27_2.method506(this.anInt476)) {
					this.anInt477 -= this.aClass33_1.aClass27_2.method506(this.anInt476) + 1;
					this.anInt476++;
					if (this.anInt476 >= this.aClass33_1.aClass27_2.anInt794) {
						this.anInt476 = 0;
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("2141, " + arg0 + ", " + 5 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(12) Class1_Sub1_Sub1_Sub5 local12 = this.aClass33_1.method523();
			if (local12 == null) {
				return null;
			}
			@Pc(18) int local18 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local18 = this.aClass33_1.aClass27_2.anIntArray225[this.anInt476];
			}
			@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = new Class1_Sub1_Sub1_Sub5(Class12.method306(local18), false, true, local12, 0);
			if (local18 != -1) {
				local41.method268();
				local41.method269(local18);
				local41.anIntArrayArray9 = null;
				local41.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt830 != 128 || this.aClass33_1.anInt831 != 128) {
				local41.method277(this.aClass33_1.anInt830, this.aClass33_1.anInt830, this.aClass33_1.anInt831);
			}
			local41.method273(this.anInt475);
			local41.method278(this.aClass33_1.anInt833 + 64, this.aClass33_1.anInt834 + 850, -30, -50, -30, true);
			return local41;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("23478, " + -20 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}
}

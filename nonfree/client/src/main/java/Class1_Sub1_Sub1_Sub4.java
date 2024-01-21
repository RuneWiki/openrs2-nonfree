import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	private int anInt480;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private int anInt464 = -231;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	private int anInt465 = 35102;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt466 = 977;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public int anInt472;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt471;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg8];
			this.anInt467 = arg2;
			this.anInt468 = arg5;
			this.anInt469 = arg10;
			this.anInt470 = arg9;
			this.anInt472 = arg7;
			this.anInt473 = arg6;
			this.anInt474 = arg3;
			this.anInt475 = arg1;
			this.anInt476 = arg11;
			this.anInt471 = arg4;
			this.aBoolean105 = false;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("66367, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public void method241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean105) {
				local8 = arg0 - this.anInt468;
				@Pc(14) double local14 = (double) (arg3 - this.anInt469);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt468 + local8 * (double) this.anInt475 / local23;
				this.aDouble2 = (double) this.anInt469 + local14 * (double) this.anInt475 / local23;
				this.aDouble3 = this.anInt470;
			}
			local8 = this.anInt473 + 1 - arg1;
			this.aDouble4 = ((double) arg0 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg3 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean105) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt474 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("5692, " + 8424 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
	public void method242(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean105 = true;
			this.aDouble1 += this.aDouble4 * (double) arg1;
			this.aDouble2 += this.aDouble5 * (double) arg1;
			this.aDouble3 += this.aDouble7 * (double) arg1 + this.aDouble8 * 0.5D * (double) arg1 * (double) arg1;
			this.aDouble7 += this.aDouble8 * (double) arg1;
			@Pc(60) boolean local60 = false;
			this.anInt477 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt478 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt480 += arg1;
				while (this.anInt480 > this.aClass33_1.aClass27_2.method506(this.anInt479, this.anInt466)) {
					this.anInt480 -= this.aClass33_1.aClass27_2.method506(this.anInt479, this.anInt466) + 1;
					this.anInt479++;
					if (this.anInt479 >= this.aClass33_1.aClass27_2.anInt808) {
						this.anInt479 = 0;
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("10175, " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(9) Class1_Sub1_Sub1_Sub5 local9 = this.aClass33_1.method523();
			if (local9 == null) {
				return null;
			}
			@Pc(15) int local15 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local15 = this.aClass33_1.aClass27_2.anIntArray225[this.anInt479];
			}
			@Pc(38) Class1_Sub1_Sub1_Sub5 local38 = new Class1_Sub1_Sub1_Sub5(Class12.method306(local15), false, 0, true, local9);
			if (local15 != -1) {
				local38.method268(this.anInt463);
				local38.method269(local15);
				local38.anIntArrayArray9 = null;
				local38.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt843 != 128 || this.aClass33_1.anInt844 != 128) {
				local38.method277(this.aClass33_1.anInt844, this.aClass33_1.anInt843, this.aClass33_1.anInt843);
			}
			local38.method273(this.anInt478);
			local38.method278(this.aClass33_1.anInt846 + 64, this.aClass33_1.anInt847 + 850, -30, -50, -30, true);
			return local38;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("80691, " + -59 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}

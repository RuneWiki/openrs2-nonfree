import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class20_Sub6 extends Class20 {

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public int anInt4029;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	private int anInt4030;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	private int anInt4039 = 0;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
	private int anInt4048 = 0;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
	private int anInt4050 = -32768;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
	private int anInt4049;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "I")
	private int anInt4035;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	private int anInt4028;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	private int anInt4033;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public int anInt4031;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	public int anInt4045;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	public int anInt4046;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "I")
	public int anInt4044;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "I")
	private int anInt4043;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	private int anInt4034;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "I")
	public int anInt4047;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Lclient!tc;")
	private Class110 aClass110_2;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class20_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt4049 = arg2;
		this.anInt4035 = arg0;
		this.anInt4028 = arg3;
		this.anInt4033 = arg7;
		this.anInt4031 = arg1;
		this.anInt4045 = arg9;
		this.aBoolean190 = false;
		this.anInt4046 = arg6;
		this.anInt4044 = arg10;
		this.anInt4043 = arg4;
		this.anInt4034 = arg8;
		this.anInt4047 = arg5;
		@Pc(55) int local55 = Static216.method3377(this.anInt4035).anInt1563;
		if (local55 == -1) {
			this.aClass110_2 = null;
		} else {
			this.aClass110_2 = Static200.method3204(local55);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
	public void method3206(@OriginalArg(0) int arg0) {
		this.aDouble2 += this.aDouble7 * (double) arg0;
		this.aDouble9 += this.aDouble8 * (double) arg0;
		this.aDouble6 += (double) arg0 * this.aDouble5 + (double) arg0 * (double) arg0 * this.aDouble4 * 0.5D;
		this.aBoolean190 = true;
		this.aDouble5 += (double) arg0 * this.aDouble4;
		this.anInt4029 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt4030 = (int) (Math.atan2(this.aDouble5, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass110_2 == null) {
			return;
		}
		this.anInt4039 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4039 <= this.aClass110_2.anIntArray460[this.anInt4048]) {
						return;
					}
					this.anInt4039 -= this.aClass110_2.anIntArray460[this.anInt4048];
					this.anInt4048++;
				} while (this.aClass110_2.anIntArray458.length > this.anInt4048);
				this.anInt4048 -= this.aClass110_2.anInt4010;
			} while (this.anInt4048 >= 0 && this.aClass110_2.anIntArray458.length > this.anInt4048);
			this.anInt4048 = 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class20_Sub5 local7 = this.method3209();
		if (local7 != null) {
			local7.method3495(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt4050 = local7.method3494();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IIIII)V")
	public void method3208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean190) {
			local13 = arg3 - this.anInt4049;
			@Pc(20) double local20 = (double) (arg2 - this.anInt4028);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble6 = this.anInt4043;
			this.aDouble2 = local20 * (double) this.anInt4034 / local29 + (double) this.anInt4028;
			this.aDouble9 = (double) this.anInt4049 + local13 * (double) this.anInt4034 / local29;
		}
		local13 = this.anInt4046 + 1 - arg1;
		this.aDouble7 = ((double) arg2 - this.aDouble2) / local13;
		this.aDouble8 = ((double) arg3 - this.aDouble9) / local13;
		this.aDouble1 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean190) {
			this.aDouble5 = -this.aDouble1 * Math.tan((double) this.anInt4033 * 0.02454369D);
		}
		this.aDouble4 = ((double) arg0 - local13 * this.aDouble5 - this.aDouble6) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		return this.anInt4050;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lclient!ra;")
	private Class20_Sub5 method3209() {
		@Pc(8) Class46 local8 = Static216.method3377(this.anInt4035);
		@Pc(20) Class20_Sub5 local20 = local8.method1128(this.anInt4048);
		if (local20 == null) {
			return null;
		} else {
			local20.method1696(this.anInt4030);
			return local20;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class22_Sub6 extends Class22 {

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "[I")
	public static int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	private int anInt2652;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "Lclient!ko;")
	private Class45_Sub2 aClass45_Sub2_5;

	@OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
	public int anInt2666;

	@OriginalMember(owner = "client!jl", name = "T", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	private int anInt2650 = -1;

	@OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
	private int anInt2665 = 0;

	@OriginalMember(owner = "client!jl", name = "S", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!jl", name = "X", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!jl", name = "bb", descriptor = "I")
	private int anInt2672 = 0;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
	private int anInt2657 = -32768;

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
	private int anInt2660;

	@OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
	public int anInt2671;

	@OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
	private int anInt2669;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
	public int anInt2653;

	@OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
	public int anInt2667;

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
	public int anInt2661;

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
	private int anInt2656;

	@OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
	private int anInt2673;

	@OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
	public int anInt2663;

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
	private int anInt2659;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	private int anInt2649;

	@OriginalMember(owner = "client!jl", name = "db", descriptor = "Lclient!tc;")
	private Class167 aClass167_3;

	static {
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(16) int local16 = local11;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1) == 1) {
					local16 = local16 >>> 1 ^ 0xEDB88320;
				} else {
					local16 >>>= 0x1;
				}
			}
			anIntArray219[local11] = local16;
		}
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class22_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2660 = arg3;
		this.anInt2671 = arg1;
		this.anInt2669 = arg8;
		this.anInt2653 = arg6;
		this.anInt2667 = arg10;
		this.anInt2661 = arg9;
		this.anInt2656 = arg0;
		this.anInt2673 = arg2;
		this.anInt2663 = arg5;
		this.anInt2659 = arg7;
		this.anInt2649 = arg4;
		this.aBoolean193 = false;
		@Pc(61) int local61 = Static239.method3759(this.anInt2656).anInt2712;
		if (local61 == -1) {
			this.aClass167_3 = null;
		} else {
			this.aClass167_3 = Static313.method4648(local61);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lclient!hc;")
	private Class22_Sub4 method2152() {
		@Pc(14) Class97 local14 = Static239.method3759(this.anInt2656);
		@Pc(24) Class22_Sub4 local24 = local14.method2204(this.anInt2650, this.anInt2665, this.anInt2672);
		if (local24 == null) {
			return null;
		} else {
			local24.method3565(this.anInt2652);
			return local24;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		return this.anInt2657;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public void method2154(@OriginalArg(0) int arg0) {
		if (this.anInt2659 == -1) {
			this.aDouble4 += this.aDouble8 * (double) arg0;
		} else {
			this.aDouble4 += this.aDouble3 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble8;
			this.aDouble8 += (double) arg0 * this.aDouble3;
		}
		this.aDouble1 += (double) arg0 * this.aDouble6;
		this.aDouble7 += this.aDouble5 * (double) arg0;
		this.aBoolean193 = true;
		this.anInt2666 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt2652 = (int) (Math.atan2(this.aDouble8, this.aDouble2) * 325.949D) & 0x7FF;
		if (this.aClass167_3 == null) {
			return;
		}
		this.anInt2665 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2665 <= this.aClass167_3.anIntArray463[this.anInt2672]) {
						return;
					}
					this.anInt2665 -= this.aClass167_3.anIntArray463[this.anInt2672];
					this.anInt2672++;
					if (this.aClass167_3.anIntArray461.length <= this.anInt2672) {
						this.anInt2672 -= this.aClass167_3.anInt5122;
						if (this.anInt2672 < 0 || this.aClass167_3.anIntArray461.length <= this.anInt2672) {
							this.anInt2672 = 0;
						}
					}
					this.anInt2650 = this.anInt2672 + 1;
				} while (this.aClass167_3.anIntArray461.length > this.anInt2650);
				this.anInt2650 -= this.aClass167_3.anInt5122;
			} while (this.anInt2650 >= 0 && this.anInt2650 < this.aClass167_3.anIntArray461.length);
			this.anInt2650 = -1;
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(IIIII)V")
	public void method2156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean193) {
			local13 = arg2 - this.anInt2673;
			@Pc(20) double local20 = (double) (arg3 - this.anInt2660);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble1 = local20 * (double) this.anInt2669 / local29 + (double) this.anInt2660;
			this.aDouble7 = (double) this.anInt2669 * local13 / local29 + (double) this.anInt2673;
			this.aDouble4 = this.anInt2649;
		}
		local13 = this.anInt2653 + 1 - arg1;
		this.aDouble5 = ((double) arg2 - this.aDouble7) / local13;
		this.aDouble6 = ((double) arg3 - this.aDouble1) / local13;
		this.aDouble2 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble5 * this.aDouble5);
		if (this.anInt2659 == -1) {
			this.aDouble8 = ((double) arg0 - this.aDouble4) / local13;
		} else {
			if (!this.aBoolean193) {
				this.aDouble8 = -this.aDouble2 * Math.tan((double) this.anInt2659 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - this.aDouble4 - local13 * this.aDouble8) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!hc;Z)V")
	private void method2159(@OriginalArg(0) Class22_Sub4 arg0) {
		if (Static291.aBoolean404) {
			@Pc(49) Class22_Sub4_Sub1 local49 = (Class22_Sub4_Sub1) arg0;
			if ((this.aClass45_Sub2_5 == null || this.aClass45_Sub2_5.aBoolean216) && (local49.aClass49Array1 != null || local49.aClass15Array1 != null)) {
				this.aClass45_Sub2_5 = new Class45_Sub2(Static37.anInt757, 1, 1);
			}
			if (this.aClass45_Sub2_5 != null) {
				this.aClass45_Sub2_5.method2405(local49.aClass49Array1, local49.aClass15Array1, false, local49.anIntArray174, local49.anIntArray175, local49.anIntArray170);
			}
		} else {
			@Pc(4) Class22_Sub4_Sub2 local4 = (Class22_Sub4_Sub2) arg0;
			if ((this.aClass45_Sub2_5 == null || this.aClass45_Sub2_5.aBoolean216) && (local4.aClass49Array2 != null || local4.aClass15Array2 != null)) {
				this.aClass45_Sub2_5 = new Class45_Sub2(Static37.anInt757, 1, 1);
			}
			if (this.aClass45_Sub2_5 != null) {
				this.aClass45_Sub2_5.method2405(local4.aClass49Array2, local4.aClass15Array2, false, local4.anIntArray385, local4.anIntArray382, local4.anIntArray379);
			}
		}
		this.aBoolean194 = true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		@Pc(7) Class22_Sub4 local7 = this.method2152();
		if (local7 != null) {
			this.method2159(local7);
			local7.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_5);
			this.anInt2657 = local7.method4071();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean194) {
			@Pc(11) Class22_Sub4 local11 = this.method2152();
			if (local11 == null) {
				return;
			}
			this.method2159(local11);
		}
		if (this.aClass45_Sub2_5 != null) {
			this.aClass45_Sub2_5.method2396(arg0, arg1, arg3, arg2, arg4);
		}
	}
}

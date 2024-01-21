import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "D")
	private double aDouble59;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "D")
	public double aDouble60;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	public int anInt2363;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "D")
	private double aDouble61;

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "D")
	public double aDouble62;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	private int anInt2368;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "D")
	public double aDouble63;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "D")
	private double aDouble64;

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "D")
	private double aDouble65;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "D")
	private double aDouble66;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	private int anInt2357 = 0;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
	private int anInt2369 = 0;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
	private int anInt2382 = -32768;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	private final int anInt2367;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	private final int anInt2379;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	public final int anInt2365;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	public final int anInt2362;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	public final int anInt2364;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	private final int anInt2376;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	private final int anInt2359;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
	private final int anInt2378;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	private final int anInt2381;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
	public final int anInt2371;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
	public final int anInt2366;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "Lclient!nd;")
	private final Class3_Sub3_Sub17 aClass3_Sub3_Sub17_2;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class26_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2367 = arg8;
		this.anInt2379 = arg4;
		this.anInt2365 = arg5;
		this.anInt2362 = arg9;
		this.aBoolean121 = false;
		this.anInt2364 = arg6;
		this.anInt2376 = arg0;
		this.anInt2359 = arg7;
		this.anInt2378 = arg2;
		this.anInt2381 = arg3;
		this.anInt2371 = arg10;
		this.anInt2366 = arg1;
		@Pc(55) int local55 = Static78.method1141(this.anInt2376).anInt106;
		if (local55 == -1) {
			this.aClass3_Sub3_Sub17_2 = null;
		} else {
			this.aClass3_Sub3_Sub17_2 = Static11.method254(local55);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lclient!wa;")
	private Class26_Sub6 method1691() {
		@Pc(8) Class3_Sub3_Sub1 local8 = Static78.method1141(this.anInt2376);
		@Pc(14) Class26_Sub6 local14 = local8.method89(this.anInt2369);
		if (local14 == null) {
			return null;
		} else {
			local14.method2532(this.anInt2368);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	public void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean121) {
			local13 = arg3 - this.anInt2378;
			@Pc(20) double local20 = (double) (arg1 - this.anInt2381);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble60 = (double) this.anInt2378 + (double) this.anInt2367 * local13 / local29;
			this.aDouble62 = this.anInt2379;
			this.aDouble63 = (double) this.anInt2381 + local20 * (double) this.anInt2367 / local29;
		}
		local13 = this.anInt2364 + 1 - arg0;
		this.aDouble66 = ((double) arg3 - this.aDouble60) / local13;
		this.aDouble64 = ((double) arg1 - this.aDouble63) / local13;
		this.aDouble65 = Math.sqrt(this.aDouble64 * this.aDouble64 + this.aDouble66 * this.aDouble66);
		if (!this.aBoolean121) {
			this.aDouble61 = -this.aDouble65 * Math.tan((double) this.anInt2359 * 0.02454369D);
		}
		this.aDouble59 = ((double) arg2 - local13 * this.aDouble61 - this.aDouble62) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		return this.anInt2382;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class26_Sub6 local7 = this.method1691();
		if (local7 != null) {
			local7.method2993(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2382 = local7.method2995();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V")
	public void method1695(@OriginalArg(0) int arg0) {
		this.aBoolean121 = true;
		this.aDouble62 += this.aDouble59 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble61 * (double) arg0;
		this.aDouble61 += this.aDouble59 * (double) arg0;
		this.aDouble60 += (double) arg0 * this.aDouble66;
		this.aDouble63 += (double) arg0 * this.aDouble64;
		this.anInt2363 = (int) (Math.atan2(this.aDouble66, this.aDouble64) * 325.949D) + 1024 & 0x7FF;
		this.anInt2368 = (int) (Math.atan2(this.aDouble61, this.aDouble65) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub3_Sub17_2 == null) {
			return;
		}
		this.anInt2357 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2357 <= this.aClass3_Sub3_Sub17_2.anIntArray193[this.anInt2369]) {
						return;
					}
					this.anInt2357 -= this.aClass3_Sub3_Sub17_2.anIntArray193[this.anInt2369];
					this.anInt2369++;
				} while (this.aClass3_Sub3_Sub17_2.anIntArray197.length > this.anInt2369);
				this.anInt2369 -= this.aClass3_Sub3_Sub17_2.anInt2738;
			} while (this.anInt2369 >= 0 && this.anInt2369 < this.aClass3_Sub3_Sub17_2.anIntArray197.length);
			this.anInt2369 = 0;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	public int anInt2245;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
	private int anInt2258;

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "D")
	public double aDouble10;

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "Lclient!sa;")
	private Class86_Sub1 aClass86_Sub1_4;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
	private int anInt2249 = 0;

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
	private int anInt2254 = -32768;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
	private int anInt2260 = -1;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	private int anInt2243 = 0;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	public int anInt2242;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
	public int anInt2267;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
	public int anInt2256;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
	private int anInt2255;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
	private int anInt2246;

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
	private int anInt2269;

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "Lclient!om;")
	private Class125 aClass125_2;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class14_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2242 = arg1;
		this.anInt2267 = arg10;
		this.anInt2256 = arg5;
		this.anInt2265 = arg7;
		this.anInt2266 = arg6;
		this.anInt2255 = arg3;
		this.anInt2250 = arg0;
		this.anInt2263 = arg2;
		this.anInt2246 = arg4;
		this.anInt2269 = arg8;
		this.anInt2257 = arg9;
		this.aBoolean156 = false;
		@Pc(58) int local58 = Static242.method3711(this.anInt2250).anInt4951;
		if (local58 == -1) {
			this.aClass125_2 = null;
		} else {
			this.aClass125_2 = Static90.method1591(local58);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)V")
	public void method1785(@OriginalArg(0) int arg0) {
		this.aDouble8 += this.aDouble6 * (double) arg0;
		this.aDouble10 += (double) arg0 * this.aDouble7;
		if (this.anInt2265 == -1) {
			this.aDouble5 += (double) arg0 * this.aDouble4;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble4 + this.aDouble3 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble3 * (double) arg0;
		}
		this.aBoolean156 = true;
		this.anInt2245 = (int) (Math.atan2(this.aDouble6, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt2258 = (int) (Math.atan2(this.aDouble4, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass125_2 == null) {
			return;
		}
		this.anInt2243 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2243 <= this.aClass125_2.anIntArray356[this.anInt2249]) {
						return;
					}
					this.anInt2243 -= this.aClass125_2.anIntArray356[this.anInt2249];
					this.anInt2249++;
					if (this.anInt2249 >= this.aClass125_2.anIntArray357.length) {
						this.anInt2249 -= this.aClass125_2.anInt3946;
						if (this.anInt2249 < 0 || this.aClass125_2.anIntArray357.length <= this.anInt2249) {
							this.anInt2249 = 0;
						}
					}
					this.anInt2260 = this.anInt2249 + 1;
				} while (this.aClass125_2.anIntArray357.length > this.anInt2260);
				this.anInt2260 -= this.aClass125_2.anInt3946;
			} while (this.anInt2260 >= 0 && this.anInt2260 < this.aClass125_2.anIntArray357.length);
			this.anInt2260 = -1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIII)V")
	public void method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean156) {
			@Pc(13) double local13 = (double) (arg1 - this.anInt2255);
			local19 = arg2 - this.anInt2263;
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local13 * local13);
			this.aDouble8 = (double) this.anInt2263 + (double) this.anInt2269 * local19 / local28;
			this.aDouble5 = this.anInt2246;
			this.aDouble10 = (double) this.anInt2255 + local13 * (double) this.anInt2269 / local28;
		}
		local19 = this.anInt2266 + 1 - arg3;
		this.aDouble6 = ((double) arg2 - this.aDouble8) / local19;
		this.aDouble7 = ((double) arg1 - this.aDouble10) / local19;
		this.aDouble9 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble6 * this.aDouble6);
		if (this.anInt2265 == -1) {
			this.aDouble4 = ((double) arg0 - this.aDouble5) / local19;
		} else {
			if (!this.aBoolean156) {
				this.aDouble4 = -this.aDouble9 * Math.tan((double) this.anInt2265 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - this.aDouble4 * local19 - this.aDouble5) * 2.0D / (local19 * local19);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		return this.anInt2254;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
		@Pc(7) Class14_Sub6 local7 = this.method1791();
		if (local7 != null) {
			local7.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_4);
			this.anInt2254 = local7.method4091();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)Lclient!q;")
	private Class14_Sub6 method1791() {
		@Pc(13) Class157 local13 = Static242.method3711(this.anInt2250);
		@Pc(23) Class14_Sub6 local23 = local13.method3873(this.anInt2249, this.anInt2260, this.anInt2243);
		if (local23 == null) {
			return null;
		} else {
			local23.method4108(this.anInt2258);
			return local23;
		}
	}
}

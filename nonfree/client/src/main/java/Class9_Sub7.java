import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class9_Sub7 extends Class9 {

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	public int anInt3117;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	private int anInt3120;

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lclient!nl;")
	private Class96_Sub1 aClass96_Sub1_6;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	private int anInt3116 = -1;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
	private int anInt3128 = 0;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
	private int anInt3126 = -32768;

	@OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
	private int anInt3138 = 0;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	public int anInt3134;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	private int anInt3118;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	private int anInt3112;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	private int anInt3114;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	public int anInt3135;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
	private int anInt3124;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
	private int anInt3115;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt3107;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
	public int anInt3123;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "Lclient!gj;")
	private Class49 aClass49_3;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class9_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt3134 = arg9;
		this.anInt3118 = arg4;
		this.anInt3112 = arg2;
		this.anInt3114 = arg3;
		this.anInt3135 = arg10;
		this.anInt3124 = arg0;
		this.anInt3115 = arg8;
		this.aBoolean168 = false;
		this.anInt3132 = arg7;
		this.anInt3107 = arg5;
		this.anInt3127 = arg1;
		this.anInt3123 = arg6;
		@Pc(58) int local58 = Static172.method2975(this.anInt3124).anInt634;
		if (local58 == -1) {
			this.aClass49_3 = null;
		} else {
			this.aClass49_3 = Static131.method697(local58);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		return this.anInt3126;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Lclient!gh;")
	private Class9_Sub5 method2368() {
		@Pc(18) Class14 local18 = Static172.method2975(this.anInt3124);
		@Pc(28) Class9_Sub5 local28 = local18.method332(this.anInt3116, this.anInt3128, this.anInt3138);
		if (local28 == null) {
			return null;
		} else {
			local28.method3619(this.anInt3120);
			return local28;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
		@Pc(7) Class9_Sub5 local7 = this.method2368();
		if (local7 != null) {
			local7.method3588(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass96_Sub1_6);
			this.anInt3126 = local7.method3587();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
	public void method2370(@OriginalArg(1) int arg0) {
		this.aDouble5 += (double) arg0 * this.aDouble3;
		this.aBoolean168 = true;
		if (this.anInt3132 == -1) {
			this.aDouble7 += this.aDouble4 * (double) arg0;
		} else {
			this.aDouble7 += (double) arg0 * 0.5D * this.aDouble6 * (double) arg0 + this.aDouble4 * (double) arg0;
			this.aDouble4 += (double) arg0 * this.aDouble6;
		}
		this.aDouble2 += (double) arg0 * this.aDouble8;
		this.anInt3117 = (int) (Math.atan2(this.aDouble8, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt3120 = (int) (Math.atan2(this.aDouble4, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass49_3 == null) {
			return;
		}
		this.anInt3138 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass49_3.anIntArray170[this.anInt3128] >= this.anInt3138) {
						return;
					}
					this.anInt3138 -= this.aClass49_3.anIntArray170[this.anInt3128];
					this.anInt3128++;
					if (this.aClass49_3.anIntArray168.length <= this.anInt3128) {
						this.anInt3128 -= this.aClass49_3.anInt2195;
						if (this.anInt3128 < 0 || this.anInt3128 >= this.aClass49_3.anIntArray168.length) {
							this.anInt3128 = 0;
						}
					}
					this.anInt3116 = this.anInt3128 + 1;
				} while (this.anInt3116 < this.aClass49_3.anIntArray168.length);
				this.anInt3116 -= this.aClass49_3.anInt2195;
			} while (this.anInt3116 >= 0 && this.anInt3116 < this.aClass49_3.anIntArray168.length);
			this.anInt3116 = -1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIIII)V")
	public void method2371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) double local21;
		if (!this.aBoolean168) {
			local21 = arg0 - this.anInt3112;
			@Pc(28) double local28 = (double) (arg1 - this.anInt3114);
			@Pc(37) double local37 = Math.sqrt(local28 * local28 + local21 * local21);
			this.aDouble7 = this.anInt3118;
			this.aDouble5 = (double) this.anInt3115 * local28 / local37 + (double) this.anInt3114;
			this.aDouble2 = (double) this.anInt3115 * local21 / local37 + (double) this.anInt3112;
		}
		local21 = this.anInt3123 + 1 - arg2;
		this.aDouble3 = ((double) arg1 - this.aDouble5) / local21;
		this.aDouble8 = ((double) arg0 - this.aDouble2) / local21;
		this.aDouble1 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble3 * this.aDouble3);
		if (this.anInt3132 == -1) {
			this.aDouble4 = ((double) arg3 - this.aDouble7) / local21;
		} else {
			if (!this.aBoolean168) {
				this.aDouble4 = -this.aDouble1 * Math.tan((double) this.anInt3132 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg3 - this.aDouble7 - local21 * this.aDouble4) * 2.0D / (local21 * local21);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}

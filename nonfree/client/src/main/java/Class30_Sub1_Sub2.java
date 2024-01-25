import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class30_Sub1_Sub2 extends Class30_Sub1 {

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	private int anInt4230;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "Lclient!cc;")
	private Class41_Sub1 aClass41_Sub1_4;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	private int anInt4236;

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!kc", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	private int anInt4246 = -1;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	private int anInt4235 = -32768;

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
	private int anInt4253 = 0;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
	private int anInt4256 = 0;

	@OriginalMember(owner = "client!kc", name = "nb", descriptor = "I")
	public final int anInt4257;

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
	private final int anInt4247;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
	private final int anInt4229;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "Z")
	private final boolean aBoolean264;

	@OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
	public final int anInt4251;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
	public final int anInt4248;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
	public final int anInt4240;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	private final int anInt4243;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	private final int anInt4231;

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "Lclient!sq;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class30_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static227.method3475(arg2, arg3, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4257 = arg5;
		this.anInt4247 = arg7;
		this.aBoolean265 = false;
		this.anInt4229 = arg8;
		this.aBoolean264 = arg11;
		this.anInt4251 = arg10;
		this.anInt4248 = arg9;
		this.anInt4240 = arg6;
		this.anInt4243 = arg0;
		this.anInt4231 = arg4;
		@Pc(77) int local77 = Static145.aClass63_1.method1524(this.anInt4243).anInt6642;
		if (local77 == -1) {
			this.aClass235_1 = null;
		} else {
			this.aClass235_1 = Static107.aClass239_1.method5420(local77);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	@Override
	public void method5726() {
		super.aShort104 = super.aShort105 = (short) (this.aDouble1 / 128.0D);
		super.aShort103 = super.aShort102 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub1_4 != null) {
			this.aClass41_Sub1_4.method873();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public void method3282() {
		if (this.aClass41_Sub1_4 != null) {
			this.aClass41_Sub1_4.method873();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!za;II)Lclient!e;")
	private Class17 method3283(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class223 local9 = Static145.aClass63_1.method1524(this.anInt4243);
		return local9.method5069(arg1, this.anInt4253, Static107.aClass239_1, arg0, this.anInt4256, this.anInt4246);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public void method3285(@OriginalArg(0) int arg0) {
		this.aBoolean265 = true;
		this.aDouble1 += this.aDouble2 * (double) arg0;
		this.aDouble7 += (double) arg0 * this.lb;
		if (this.aBoolean264) {
			this.aDouble4 = Static227.method3475((int) this.aDouble1, (int) this.aDouble7, super.aByte102) - this.anInt4231;
		} else if (this.anInt4247 == -1) {
			this.aDouble4 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble4 += (double) arg0 * this.aDouble3 + (double) arg0 * this.aDouble6 * 0.5D * (double) arg0;
			this.aDouble3 += this.aDouble6 * (double) arg0;
		}
		this.anInt4230 = (int) (Math.atan2(this.aDouble2, this.lb) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4236 = (int) (Math.atan2(this.aDouble3, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass235_1 == null) {
			return;
		}
		this.anInt4256 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass235_1.anIntArray632[this.anInt4253] >= this.anInt4256) {
						return;
					}
					this.anInt4256 -= this.aClass235_1.anIntArray632[this.anInt4253];
					this.anInt4253++;
					if (this.anInt4253 >= this.aClass235_1.anIntArray633.length) {
						this.anInt4253 -= this.aClass235_1.anInt6857;
						if (this.anInt4253 < 0 || this.aClass235_1.anIntArray633.length <= this.anInt4253) {
							this.anInt4253 = 0;
						}
					}
					this.anInt4246 = this.anInt4253 + 1;
				} while (this.aClass235_1.anIntArray633.length > this.anInt4246);
				this.anInt4246 -= this.aClass235_1.anInt6857;
			} while (this.anInt4246 >= 0 && this.anInt4246 < this.aClass235_1.anIntArray633.length);
			this.anInt4246 = -1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!e;Lclient!za;)V")
	private void method3286(@OriginalArg(1) Class17 arg0, @OriginalArg(2) Class106 arg1) {
		@Pc(13) Class94[] local13 = arg0.method6201();
		@Pc(16) Class114[] local16 = arg0.method6205();
		if ((this.aClass41_Sub1_4 == null || this.aClass41_Sub1_4.aBoolean73) && (local13 != null || local16 != null)) {
			this.aClass41_Sub1_4 = new Class41_Sub1(Static187.anInt3975);
		}
		if (this.aClass41_Sub1_4 != null) {
			this.aClass41_Sub1_4.method871(arg1, (long) Static187.anInt3975, local13, local16);
			this.aClass41_Sub1_4.method882(super.aByte102, super.aShort104, super.aShort105, super.aShort103, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
	public void method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean265) {
			local13 = arg3 - super.anInt7490;
			@Pc(19) double local19 = (double) (arg2 - super.anInt7488);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local13 * local13);
			this.aDouble7 = (double) this.anInt4229 * local19 / local28 + (double) super.anInt7488;
			this.aDouble1 = (double) super.anInt7490 + local13 * (double) this.anInt4229 / local28;
			if (this.aBoolean264) {
				this.aDouble4 = Static227.method3475((int) this.aDouble1, (int) this.aDouble7, super.aByte102) - this.anInt4231;
			} else {
				this.aDouble4 = super.anInt7495;
			}
		}
		local13 = this.anInt4240 + 1 - arg1;
		this.lb = ((double) arg2 - this.aDouble7) / local13;
		this.aDouble2 = ((double) arg3 - this.aDouble1) / local13;
		this.aDouble5 = Math.sqrt(this.lb * this.lb + this.aDouble2 * this.aDouble2);
		if (this.anInt4247 == -1) {
			this.aDouble3 = ((double) arg0 - this.aDouble4) / local13;
		} else {
			if (!this.aBoolean265) {
				this.aDouble3 = -this.aDouble5 * Math.tan((double) this.anInt4247 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg0 - this.aDouble4 - this.aDouble3 * local13) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)I")
	@Override
	public int method5724() {
		return this.anInt4235;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		@Pc(17) Class17 local17 = this.method3283(arg0, 0);
		if (local17 == null) {
			return;
		}
		@Pc(23) Class40 local23 = arg0.method5918();
		local23.g(this.anInt4236);
		local23.EA(this.anInt4230);
		local23.W((int) this.aDouble1, (int) this.aDouble4, (int) this.aDouble7);
		this.anInt4235 = local17.B();
		this.method3286(local17, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		@Pc(14) Class17 local14 = this.method3283(arg0, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class40 local21 = arg0.method5918();
		local21.g(this.anInt4236);
		local21.EA(this.anInt4230);
		local21.W((int) this.aDouble1, (int) this.aDouble4, (int) this.aDouble7);
		if (this.aClass41_Sub1_4 == null) {
			local14.method6189(local21, null, 0);
		} else {
			@Pc(47) Class51 local47 = this.aClass41_Sub1_4.method875();
			arg0.method5952(local14, local47, local21, null);
		}
		this.anInt4235 = local14.B();
		this.method3286(local14, arg0);
		return null;
	}
}

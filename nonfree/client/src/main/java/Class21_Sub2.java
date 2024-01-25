import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public abstract class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	protected int anInt5451;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	protected int anInt5456;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	protected int anInt5458;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
	protected int anInt5465;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "Lclient!lr;")
	protected final Class16_Sub2 aClass16_Sub2_8;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	public final int anInt5460;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	public final int anInt5459;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!lr;II)V")
	public Class21_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass16_Sub2_8 = arg0;
		this.anInt5460 = arg1;
		this.anInt5459 = arg2;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
	protected abstract void method4504(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method5799(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass16_Sub2_8.method5326()) {
			throw new IllegalStateException();
		} else if (this.method4506(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub3 local20 = (Class1_Sub3) arg6;
			this.method4505(local20.anIntArray606, local20.anIntArray605, Static515.anInt5464 - arg7, -arg8 - (Static515.anInt5473 - Static515.anInt5469));
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "()I")
	@Override
	public final int method5779() {
		return this.anInt5465 + this.anInt5460 + this.anInt5456;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method5800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "()I")
	@Override
	public final int method5790() {
		return this.anInt5460;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([I[III)V")
	protected abstract void method4505(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method5781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method5786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass16_Sub2_8.method5326()) {
			throw new IllegalStateException();
		} else if (this.method4506(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static515.anInt5468 = arg7;
			if (arg6 != 1) {
				Static515.anInt5471 = arg7 >>> 24;
				Static515.anInt5461 = 256 - Static515.anInt5471;
				if (arg6 == 0) {
					Static515.anInt5467 = arg7 >> 16 & 0xFF;
					Static515.anInt5450 = arg7 >> 8 & 0xFF;
					Static515.anInt5470 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static515.anInt5449 = arg7 >>> 24;
					Static515.anInt5454 = 256 - Static515.anInt5449;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static515.anInt5454 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static515.anInt5454 & 0xFF0000;
					Static515.anInt5447 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method4504(1);
			} else if (arg6 == 0) {
				this.method4504(0);
			} else if (arg6 == 3) {
				this.method4504(3);
			} else if (arg6 == 2) {
				this.method4504(2);
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method4506(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5465 + this.anInt5460 + this.anInt5456;
		@Pc(17) int local17 = this.anInt5458 + this.anInt5459 + this.anInt5451;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5460 || local17 != this.anInt5459) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5458;
			local65 = local53 * (float) this.anInt5458;
			local71 = local32 * (float) this.anInt5465;
			local77 = local39 * (float) this.anInt5465;
			@Pc(84) float local84 = -local32 * (float) this.anInt5456;
			@Pc(91) float local91 = -local39 * (float) this.anInt5456;
			@Pc(98) float local98 = -local46 * (float) this.anInt5451;
			@Pc(105) float local105 = -local53 * (float) this.anInt5451;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass16_Sub2_8.anInt6466) {
			local46 = this.aClass16_Sub2_8.anInt6466;
		}
		if (local53 > (float) this.aClass16_Sub2_8.anInt6484) {
			local53 = this.aClass16_Sub2_8.anInt6484;
		}
		if (local59 < (float) this.aClass16_Sub2_8.anInt6473) {
			local59 = this.aClass16_Sub2_8.anInt6473;
		}
		if (local65 > (float) this.aClass16_Sub2_8.anInt6476) {
			local65 = this.aClass16_Sub2_8.anInt6476;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static515.anInt5476 = this.aClass16_Sub2_8.anInt6490;
		Static515.anInt5475 = (int) ((float) ((int) local59 * Static515.anInt5476) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static515.anInt5448 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5460 / local71);
		Static515.anInt5472 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5459 / local77);
		Static515.anInt5463 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5460 / local77);
		Static515.anInt5462 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5459 / local71);
		Static515.anInt5477 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static515.anInt5452 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static515.anInt5457 = (this.anInt5460 >> 1 << 12) + (Static515.anInt5452 * Static515.anInt5463 >> 4);
		Static515.anInt5455 = (this.anInt5459 >> 1 << 12) + (Static515.anInt5452 * Static515.anInt5462 >> 4);
		Static515.anInt5453 = Static515.anInt5477 * Static515.anInt5448 >> 4;
		Static515.anInt5474 = Static515.anInt5477 * Static515.anInt5472 >> 4;
		Static515.anInt5464 = (int) local46;
		Static515.anInt5466 = (int) local53;
		Static515.anInt5469 = (int) local59;
		Static515.anInt5473 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method4507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "()I")
	@Override
	public final int method5783() {
		return this.anInt5459;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "()I")
	@Override
	public final int method5785() {
		return this.anInt5458 + this.anInt5459 + this.anInt5451;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5465 = arg0;
		this.anInt5458 = arg1;
		this.anInt5456 = arg2;
		this.anInt5451 = arg3;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V")
	public abstract void method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass16_Sub2_8.method5326()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray319 == null) {
			this.anIntArray319 = new int[4];
		}
		this.aClass16_Sub2_8.K(this.anIntArray319);
		this.aClass16_Sub2_8.T(this.aClass16_Sub2_8.anInt6466, this.aClass16_Sub2_8.anInt6473, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5779();
		@Pc(40) int local40 = this.method5785();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5791(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass16_Sub2_8.KA(this.anIntArray319[0], this.anIntArray319[1], this.anIntArray319[2], this.anIntArray319[3]);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public abstract class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
	protected int anInt10524;

	@OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
	protected int anInt10530;

	@OriginalMember(owner = "client!aja", name = "q", descriptor = "[I")
	private int[] anIntArray699;

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
	protected int anInt10533;

	@OriginalMember(owner = "client!aja", name = "y", descriptor = "I")
	protected int anInt10539;

	@OriginalMember(owner = "client!aja", name = "t", descriptor = "Lclient!nia;")
	protected final Class132_Sub2 aClass132_Sub2_12;

	@OriginalMember(owner = "client!aja", name = "z", descriptor = "I")
	public final int anInt10540;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
	public final int anInt10519;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!nia;II)V")
	public Class9_Sub1(@OriginalArg(0) Class132_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass132_Sub2_12 = arg0;
		this.anInt10540 = arg1;
		this.anInt10519 = arg2;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "([I[III)V")
	protected abstract void method8939(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "()I")
	@Override
	public final int method8930() {
		return this.anInt10539 + this.anInt10519 + this.anInt10524;
	}

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "()I")
	@Override
	public final int method8938() {
		return this.anInt10540;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "()I")
	@Override
	public final int method8918() {
		return this.anInt10519;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method8941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt10530 + this.anInt10540 + this.anInt10533;
		@Pc(17) int local17 = this.anInt10539 + this.anInt10519 + this.anInt10524;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt10540 || local17 != this.anInt10519) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt10539;
			local65 = local53 * (float) this.anInt10539;
			local71 = local32 * (float) this.anInt10530;
			local77 = local39 * (float) this.anInt10530;
			@Pc(84) float local84 = -local32 * (float) this.anInt10533;
			@Pc(91) float local91 = -local39 * (float) this.anInt10533;
			@Pc(98) float local98 = -local46 * (float) this.anInt10524;
			@Pc(105) float local105 = -local53 * (float) this.anInt10524;
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
		if (local46 < (float) this.aClass132_Sub2_12.anInt6627) {
			local46 = (float) this.aClass132_Sub2_12.anInt6627;
		}
		if (local53 > (float) this.aClass132_Sub2_12.anInt6632) {
			local53 = (float) this.aClass132_Sub2_12.anInt6632;
		}
		if (local59 < (float) this.aClass132_Sub2_12.anInt6642) {
			local59 = (float) this.aClass132_Sub2_12.anInt6642;
		}
		if (local65 > (float) this.aClass132_Sub2_12.anInt6626) {
			local65 = (float) this.aClass132_Sub2_12.anInt6626;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static18.anInt10531 = this.aClass132_Sub2_12.anInt6641;
		Static18.anInt10534 = (int) ((float) ((int) local59 * Static18.anInt10531) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static18.anInt10543 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt10540 / local71);
		Static18.anInt10528 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt10519 / local77);
		Static18.anInt10517 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt10540 / local77);
		Static18.anInt10529 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt10519 / local71);
		Static18.anInt10521 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static18.anInt10541 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static18.anInt10547 = (this.anInt10540 >> 1 << 12) + (Static18.anInt10541 * Static18.anInt10517 >> 4);
		Static18.anInt10526 = (this.anInt10519 >> 1 << 12) + (Static18.anInt10541 * Static18.anInt10529 >> 4);
		Static18.anInt10527 = Static18.anInt10521 * Static18.anInt10543 >> 4;
		Static18.anInt10525 = Static18.anInt10521 * Static18.anInt10528 >> 4;
		Static18.anInt10523 = (int) local46;
		Static18.anInt10544 = (int) local53;
		Static18.anInt10537 = (int) local59;
		Static18.anInt10545 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method8931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10530 = arg0;
		this.anInt10539 = arg1;
		this.anInt10533 = arg2;
		this.anInt10524 = arg3;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method8929(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass132_Sub2_12.method5682()) {
			throw new IllegalStateException();
		} else if (this.method8941(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static18.anInt10518 = arg7;
			if (arg6 != 1) {
				Static18.anInt10536 = arg7 >>> 24;
				Static18.anInt10532 = 256 - Static18.anInt10536;
				if (arg6 == 0) {
					Static18.anInt10520 = arg7 >> 16 & 0xFF;
					Static18.anInt10542 = arg7 >> 8 & 0xFF;
					Static18.anInt10546 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static18.anInt10535 = arg7 >>> 24;
					Static18.anInt10538 = 256 - Static18.anInt10535;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static18.anInt10538 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static18.anInt10538 & 0xFF0000;
					Static18.anInt10522 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method8942(1);
			} else if (arg6 == 0) {
				this.method8942(0);
			} else if (arg6 == 3) {
				this.method8942(3);
			} else if (arg6 == 2) {
				this.method8942(2);
			}
		}
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(II)V")
	protected abstract void method8942(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "([I)V")
	@Override
	public final void method8923(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10530;
		arg0[1] = this.anInt10539;
		arg0[2] = this.anInt10533;
		arg0[3] = this.anInt10524;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method8916(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass132_Sub2_12.method5682()) {
			throw new IllegalStateException();
		} else if (this.method8941(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method8939(local20.anIntArray120, local20.anIntArray119, Static18.anInt10523 - arg7, -arg8 - (Static18.anInt10545 - Static18.anInt10537));
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIII)V")
	public abstract void method8919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method8926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass132_Sub2_12.method5682()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray699 == null) {
			this.anIntArray699 = new int[4];
		}
		this.aClass132_Sub2_12.K(this.anIntArray699);
		this.aClass132_Sub2_12.T(this.aClass132_Sub2_12.anInt6627, this.aClass132_Sub2_12.anInt6642, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method8937();
		@Pc(40) int local40 = this.method8930();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method8919(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass132_Sub2_12.KA(this.anIntArray699[0], this.anIntArray699[1], this.anIntArray699[2], this.anIntArray699[3]);
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "()I")
	@Override
	public final int method8937() {
		return this.anInt10530 + this.anInt10540 + this.anInt10533;
	}
}

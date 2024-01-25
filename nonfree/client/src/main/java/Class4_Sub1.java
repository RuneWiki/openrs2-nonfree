import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	protected int anInt9439;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	protected int anInt9446;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "I")
	protected int anInt9447;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "I")
	protected int anInt9455;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!jf;")
	protected final Class5_Sub3 aClass5_Sub3_10;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public final int anInt9435;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	public final int anInt9454;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!jf;II)V")
	public Class4_Sub1(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub3_10 = arg0;
		this.anInt9435 = arg1;
		this.anInt9454 = arg2;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([I[III)V")
	protected abstract void method7714(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	protected abstract void method7715(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()I")
	@Override
	public final int method7700() {
		return this.anInt9446 + this.anInt9435 + this.anInt9455;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7716(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9446 + this.anInt9435 + this.anInt9455;
		@Pc(17) int local17 = this.anInt9439 + this.anInt9454 + this.anInt9447;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt9435 || local17 != this.anInt9454) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt9439;
			local65 = local53 * (float) this.anInt9439;
			local71 = local32 * (float) this.anInt9446;
			local77 = local39 * (float) this.anInt9446;
			@Pc(84) float local84 = -local32 * (float) this.anInt9455;
			@Pc(91) float local91 = -local39 * (float) this.anInt9455;
			@Pc(98) float local98 = -local46 * (float) this.anInt9447;
			@Pc(105) float local105 = -local53 * (float) this.anInt9447;
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
		if (local46 < (float) this.aClass5_Sub3_10.anInt5674) {
			local46 = (float) this.aClass5_Sub3_10.anInt5674;
		}
		if (local53 > (float) this.aClass5_Sub3_10.anInt5672) {
			local53 = (float) this.aClass5_Sub3_10.anInt5672;
		}
		if (local59 < (float) this.aClass5_Sub3_10.anInt5663) {
			local59 = (float) this.aClass5_Sub3_10.anInt5663;
		}
		if (local65 > (float) this.aClass5_Sub3_10.anInt5661) {
			local65 = (float) this.aClass5_Sub3_10.anInt5661;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static488.anInt9438 = this.aClass5_Sub3_10.anInt5670;
		Static488.anInt9451 = (int) ((float) ((int) local59 * Static488.anInt9438) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static488.anInt9444 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9435 / local71);
		Static488.anInt9437 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9454 / local77);
		Static488.anInt9441 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9435 / local77);
		Static488.anInt9430 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9454 / local71);
		Static488.anInt9428 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static488.anInt9445 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static488.anInt9450 = (this.anInt9435 >> 1 << 12) + (Static488.anInt9445 * Static488.anInt9441 >> 4);
		Static488.anInt9443 = (this.anInt9454 >> 1 << 12) + (Static488.anInt9445 * Static488.anInt9430 >> 4);
		Static488.anInt9427 = Static488.anInt9428 * Static488.anInt9444 >> 4;
		Static488.anInt9456 = Static488.anInt9428 * Static488.anInt9437 >> 4;
		Static488.anInt9453 = (int) local46;
		Static488.anInt9448 = (int) local53;
		Static488.anInt9431 = (int) local59;
		Static488.anInt9433 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
	@Override
	public final int method7694() {
		return this.anInt9454;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7696(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass5_Sub3_10.method4747()) {
			throw new IllegalStateException();
		} else if (this.method7716(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static488.anInt9434 = arg7;
			if (arg6 != 1) {
				Static488.anInt9449 = arg7 >>> 24;
				Static488.anInt9442 = 256 - Static488.anInt9449;
				if (arg6 == 0) {
					Static488.anInt9436 = arg7 >> 16 & 0xFF;
					Static488.anInt9457 = arg7 >> 8 & 0xFF;
					Static488.anInt9429 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static488.anInt9432 = arg7 >>> 24;
					Static488.anInt9452 = 256 - Static488.anInt9432;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static488.anInt9452 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static488.anInt9452 & 0xFF0000;
					Static488.anInt9440 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7715(1);
			} else if (arg6 == 0) {
				this.method7715(0);
			} else if (arg6 == 3) {
				this.method7715(3);
			} else if (arg6 == 2) {
				this.method7715(2);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
	@Override
	public final int method7712() {
		return this.anInt9439 + this.anInt9454 + this.anInt9447;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass5_Sub3_10.method4747()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray500 == null) {
			this.anIntArray500 = new int[4];
		}
		this.aClass5_Sub3_10.K(this.anIntArray500);
		this.aClass5_Sub3_10.T(this.aClass5_Sub3_10.anInt5674, this.aClass5_Sub3_10.anInt5663, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method7700();
		@Pc(40) int local40 = this.method7712();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method7711(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass5_Sub3_10.KA(this.anIntArray500[0], this.anIntArray500[1], this.anIntArray500[2], this.anIntArray500[3]);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass5_Sub3_10.method4747()) {
			throw new IllegalStateException();
		} else if (this.method7716(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method7714(local20.anIntArray212, local20.anIntArray213, Static488.anInt9453 - arg7, -arg8 - (Static488.anInt9433 - Static488.anInt9431));
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public abstract void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(IIII)V")
	@Override
	public final void method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9446 = arg0;
		this.anInt9439 = arg1;
		this.anInt9455 = arg2;
		this.anInt9447 = arg3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([I)V")
	@Override
	public final void method7704(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9446;
		arg0[1] = this.anInt9439;
		arg0[2] = this.anInt9455;
		arg0[3] = this.anInt9447;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()I")
	@Override
	public final int method7697() {
		return this.anInt9435;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public abstract class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	public int anInt9367;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	public int anInt9382;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "[I")
	private int[] anIntArray699;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
	public int anInt9385;

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
	public int anInt9389;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "Lclient!lea;")
	protected final Class14_Sub1 aClass14_Sub1_17;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	public final int anInt9369;

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
	public final int anInt9392;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!lea;II)V")
	public Class58_Sub1(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass14_Sub1_17 = arg0;
		this.anInt9369 = arg1;
		this.anInt9392 = arg2;
	}

	@OriginalMember(owner = "client!qv", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public final void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass14_Sub1_17.method5053()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray699 == null) {
			this.anIntArray699 = new int[4];
		}
		this.aClass14_Sub1_17.A(this.anIntArray699);
		this.aClass14_Sub1_17.Q(this.aClass14_Sub1_17.anInt5844, this.aClass14_Sub1_17.anInt5831, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.AA();
		@Pc(40) int local40 = this.a();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.I(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass14_Sub1_17.ca(this.anIntArray699[0], this.anIntArray699[1], this.anIntArray699[2], this.anIntArray699[3]);
	}

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "(IIIII)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "([I[III)V")
	protected abstract void method7667(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qv", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9367 = arg0;
		this.anInt9389 = arg1;
		this.anInt9385 = arg2;
		this.anInt9382 = arg3;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILclient!fa;II)V")
	public abstract void method7662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7668(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9367 + this.anInt9369 + this.anInt9385;
		@Pc(17) int local17 = this.anInt9389 + this.anInt9392 + this.anInt9382;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt9369 || local17 != this.anInt9392) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt9389;
			local65 = local53 * (float) this.anInt9389;
			local71 = local32 * (float) this.anInt9367;
			local77 = local39 * (float) this.anInt9367;
			@Pc(84) float local84 = -local32 * (float) this.anInt9385;
			@Pc(91) float local91 = -local39 * (float) this.anInt9385;
			@Pc(98) float local98 = -local46 * (float) this.anInt9382;
			@Pc(105) float local105 = -local53 * (float) this.anInt9382;
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
		if (local46 < (float) this.aClass14_Sub1_17.anInt5844) {
			local46 = this.aClass14_Sub1_17.anInt5844;
		}
		if (local53 > (float) this.aClass14_Sub1_17.anInt5825) {
			local53 = this.aClass14_Sub1_17.anInt5825;
		}
		if (local59 < (float) this.aClass14_Sub1_17.anInt5831) {
			local59 = this.aClass14_Sub1_17.anInt5831;
		}
		if (local65 > (float) this.aClass14_Sub1_17.anInt5838) {
			local65 = this.aClass14_Sub1_17.anInt5838;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static437.anInt9394 = this.aClass14_Sub1_17.anInt5817;
		Static437.anInt9380 = (int) ((float) ((int) local59 * Static437.anInt9394) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static437.anInt9397 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9369 / local71);
		Static437.anInt9383 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9392 / local77);
		Static437.anInt9368 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9369 / local77);
		Static437.anInt9379 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9392 / local71);
		Static437.anInt9373 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static437.anInt9378 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static437.anInt9381 = (this.anInt9369 >> 1 << 12) + (Static437.anInt9378 * Static437.anInt9368 >> 4);
		Static437.anInt9371 = (this.anInt9392 >> 1 << 12) + (Static437.anInt9378 * Static437.anInt9379 >> 4);
		Static437.anInt9376 = Static437.anInt9373 * Static437.anInt9397 >> 4;
		Static437.anInt9374 = Static437.anInt9373 * Static437.anInt9383 >> 4;
		Static437.anInt9388 = (int) local46;
		Static437.anInt9393 = (int) local53;
		Static437.anInt9395 = (int) local59;
		Static437.anInt9390 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected final void method7660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class86 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass14_Sub1_17.method5053()) {
			throw new IllegalStateException();
		} else if (this.method7668(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class86_Sub1 local20 = (Class86_Sub1) arg6;
			this.method7667(local20.anIntArray567, local20.anIntArray566, Static437.anInt9388 - arg7, -arg8 - (Static437.anInt9390 - Static437.anInt9395));
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "()I")
	@Override
	public final int a() {
		return this.anInt9389 + this.anInt9392 + this.anInt9382;
	}

	@OriginalMember(owner = "client!qv", name = "AA", descriptor = "()I")
	@Override
	public final int AA() {
		return this.anInt9367 + this.anInt9369 + this.anInt9385;
	}

	@OriginalMember(owner = "client!qv", name = "KA", descriptor = "(IIIIIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qv", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass14_Sub1_17.method5053()) {
			throw new IllegalStateException();
		} else if (this.method7668(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static437.anInt9396 = arg7;
			if (arg6 != 1) {
				Static437.anInt9391 = arg7 >>> 24;
				Static437.anInt9377 = 256 - Static437.anInt9391;
				if (arg6 == 0) {
					Static437.anInt9372 = arg7 >> 16 & 0xFF;
					Static437.anInt9370 = arg7 >> 8 & 0xFF;
					Static437.anInt9375 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static437.anInt9384 = arg7 >>> 24;
					Static437.anInt9387 = 256 - Static437.anInt9384;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static437.anInt9387 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static437.anInt9387 & 0xFF0000;
					Static437.anInt9386 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7669(1);
			} else if (arg6 == 0) {
				this.method7669(0);
			} else if (arg6 == 3) {
				this.method7669(3);
			} else if (arg6 == 2) {
				this.method7669(2);
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "QA", descriptor = "()I")
	@Override
	public final int QA() {
		return this.anInt9369;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)V")
	protected abstract void method7669(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt9392;
	}
}

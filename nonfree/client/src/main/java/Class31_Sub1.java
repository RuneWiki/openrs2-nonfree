import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public abstract class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "[I")
	private int[] anIntArray732;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
	protected int anInt10347;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
	protected int anInt10350;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	protected int anInt10353;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
	protected int anInt10355;

	@OriginalMember(owner = "client!qw", name = "G", descriptor = "Lclient!aha;")
	protected final Class13_Sub1 aClass13_Sub1_12;

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
	public final int anInt10364;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
	public final int anInt10343;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!aha;II)V")
	public Class31_Sub1(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub1_12 = arg0;
		this.anInt10364 = arg1;
		this.anInt10343 = arg2;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "()I")
	@Override
	public final int method8788() {
		return this.anInt10350 + this.anInt10364 + this.anInt10353;
	}

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "()I")
	@Override
	public final int method8807() {
		return this.anInt10355 + this.anInt10343 + this.anInt10347;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method8813(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt10350 + this.anInt10364 + this.anInt10353;
		@Pc(17) int local17 = this.anInt10355 + this.anInt10343 + this.anInt10347;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt10364 || local17 != this.anInt10343) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt10355;
			local65 = local53 * (float) this.anInt10355;
			local71 = local32 * (float) this.anInt10350;
			local77 = local39 * (float) this.anInt10350;
			@Pc(84) float local84 = -local32 * (float) this.anInt10353;
			@Pc(91) float local91 = -local39 * (float) this.anInt10353;
			@Pc(98) float local98 = -local46 * (float) this.anInt10347;
			@Pc(105) float local105 = -local53 * (float) this.anInt10347;
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
		if (local46 < (float) this.aClass13_Sub1_12.anInt233) {
			local46 = (float) this.aClass13_Sub1_12.anInt233;
		}
		if (local53 > (float) this.aClass13_Sub1_12.anInt245) {
			local53 = (float) this.aClass13_Sub1_12.anInt245;
		}
		if (local59 < (float) this.aClass13_Sub1_12.anInt236) {
			local59 = (float) this.aClass13_Sub1_12.anInt236;
		}
		if (local65 > (float) this.aClass13_Sub1_12.anInt253) {
			local65 = (float) this.aClass13_Sub1_12.anInt253;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static483.anInt10348 = this.aClass13_Sub1_12.anInt254;
		Static483.anInt10358 = (int) ((float) ((int) local59 * Static483.anInt10348) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static483.anInt10346 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt10364 / local71);
		Static483.anInt10360 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt10343 / local77);
		Static483.anInt10340 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt10364 / local77);
		Static483.anInt10339 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt10343 / local71);
		Static483.anInt10363 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static483.anInt10342 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static483.anInt10362 = (this.anInt10364 >> 1 << 12) + (Static483.anInt10342 * Static483.anInt10340 >> 4);
		Static483.anInt10344 = (this.anInt10343 >> 1 << 12) + (Static483.anInt10342 * Static483.anInt10339 >> 4);
		Static483.anInt10351 = Static483.anInt10363 * Static483.anInt10346 >> 4;
		Static483.anInt10361 = Static483.anInt10363 * Static483.anInt10360 >> 4;
		Static483.anInt10338 = (int) local46;
		Static483.anInt10352 = (int) local53;
		Static483.anInt10365 = (int) local59;
		Static483.anInt10357 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([I)V")
	@Override
	public final void method8799(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10350;
		arg0[1] = this.anInt10355;
		arg0[2] = this.anInt10353;
		arg0[3] = this.anInt10347;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "()I")
	@Override
	public final int method8789() {
		return this.anInt10343;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method8800(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass13_Sub1_12.method342()) {
			throw new IllegalStateException();
		} else if (this.method8813(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method8815(local20.anIntArray170, local20.anIntArray171, Static483.anInt10338 - arg7, -arg8 - (Static483.anInt10357 - Static483.anInt10365));
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
	public abstract void method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)V")
	protected abstract void method8814(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method8808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass13_Sub1_12.method342()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray732 == null) {
			this.anIntArray732 = new int[4];
		}
		this.aClass13_Sub1_12.K(this.anIntArray732);
		this.aClass13_Sub1_12.T(this.aClass13_Sub1_12.anInt233, this.aClass13_Sub1_12.anInt236, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method8788();
		@Pc(40) int local40 = this.method8807();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method8796(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass13_Sub1_12.KA(this.anIntArray732[0], this.anIntArray732[1], this.anIntArray732[2], this.anIntArray732[3]);
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "()I")
	@Override
	public final int method8801() {
		return this.anInt10364;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method8791(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass13_Sub1_12.method342()) {
			throw new IllegalStateException();
		} else if (this.method8813(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static483.anInt10354 = arg7;
			if (arg6 != 1) {
				Static483.anInt10356 = arg7 >>> 24;
				Static483.anInt10341 = 256 - Static483.anInt10356;
				if (arg6 == 0) {
					Static483.anInt10337 = arg7 >> 16 & 0xFF;
					Static483.anInt10366 = arg7 >> 8 & 0xFF;
					Static483.anInt10367 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static483.anInt10359 = arg7 >>> 24;
					Static483.anInt10349 = 256 - Static483.anInt10359;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static483.anInt10349 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static483.anInt10349 & 0xFF0000;
					Static483.anInt10345 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method8814(1);
			} else if (arg6 == 0) {
				this.method8814(0);
			} else if (arg6 == 3) {
				this.method8814(3);
			} else if (arg6 == 2) {
				this.method8814(2);
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([I[III)V")
	protected abstract void method8815(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method8792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10350 = arg0;
		this.anInt10355 = arg1;
		this.anInt10353 = arg2;
		this.anInt10347 = arg3;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}

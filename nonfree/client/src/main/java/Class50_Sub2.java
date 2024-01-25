import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public abstract class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	protected int anInt7234;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	protected int anInt7241;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	protected int anInt7248;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	protected int anInt7254;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!qk;")
	protected final Class65_Sub3 aClass65_Sub3_10;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	public final int anInt7252;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	public final int anInt7255;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!qk;II)V")
	public Class50_Sub2(@OriginalArg(0) Class65_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass65_Sub3_10 = arg0;
		this.anInt7252 = arg1;
		this.anInt7255 = arg2;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method6005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass65_Sub3_10.method6974()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray407 == null) {
			this.anIntArray407 = new int[4];
		}
		this.aClass65_Sub3_10.K(this.anIntArray407);
		this.aClass65_Sub3_10.T(this.aClass65_Sub3_10.lb, this.aClass65_Sub3_10.anInt8135, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method6003();
		@Pc(40) int local40 = this.method6010();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5987(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass65_Sub3_10.KA(this.anIntArray407[0], this.anIntArray407[1], this.anIntArray407[2], this.anIntArray407[3]);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()I")
	@Override
	public final int method6010() {
		return this.anInt7248 + this.anInt7255 + this.anInt7234;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()I")
	@Override
	public final int method6002() {
		return this.anInt7252;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([I[III)V")
	protected abstract void method6011(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method5997(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass65_Sub3_10.method6974()) {
			throw new IllegalStateException();
		} else if (this.method6013(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static659.anInt7240 = arg7;
			if (arg6 != 1) {
				Static659.anInt7249 = arg7 >>> 24;
				Static659.anInt7253 = 256 - Static659.anInt7249;
				if (arg6 == 0) {
					Static659.anInt7236 = arg7 >> 16 & 0xFF;
					Static659.anInt7246 = arg7 >> 8 & 0xFF;
					Static659.anInt7256 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static659.anInt7250 = arg7 >>> 24;
					Static659.anInt7231 = 256 - Static659.anInt7250;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static659.anInt7231 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static659.anInt7231 & 0xFF0000;
					Static659.anInt7228 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6014(1);
			} else if (arg6 == 0) {
				this.method6014(0);
			} else if (arg6 == 3) {
				this.method6014(3);
			} else if (arg6 == 2) {
				this.method6014(2);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([I)V")
	@Override
	public final void method5999(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7241;
		arg0[1] = this.anInt7248;
		arg0[2] = this.anInt7254;
		arg0[3] = this.anInt7234;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method5990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
	public abstract void method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method6001(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass65_Sub3_10.method6974()) {
			throw new IllegalStateException();
		} else if (this.method6013(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub3 local20 = (Class1_Sub3) arg6;
			this.method6011(local20.anIntArray549, local20.anIntArray548, Static659.anInt7237 - arg7, -arg8 - (Static659.anInt7245 - Static659.anInt7257));
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
	@Override
	public final int method6003() {
		return this.anInt7241 + this.anInt7252 + this.anInt7254;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7241 = arg0;
		this.anInt7248 = arg1;
		this.anInt7254 = arg2;
		this.anInt7234 = arg3;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6013(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7241 + this.anInt7252 + this.anInt7254;
		@Pc(17) int local17 = this.anInt7248 + this.anInt7255 + this.anInt7234;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7252 || local17 != this.anInt7255) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7248;
			local65 = local53 * (float) this.anInt7248;
			local71 = local32 * (float) this.anInt7241;
			local77 = local39 * (float) this.anInt7241;
			@Pc(84) float local84 = -local32 * (float) this.anInt7254;
			@Pc(91) float local91 = -local39 * (float) this.anInt7254;
			@Pc(98) float local98 = -local46 * (float) this.anInt7234;
			@Pc(105) float local105 = -local53 * (float) this.anInt7234;
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
		if (local46 < (float) this.aClass65_Sub3_10.lb) {
			local46 = (float) this.aClass65_Sub3_10.lb;
		}
		if (local53 > (float) this.aClass65_Sub3_10.anInt8156) {
			local53 = (float) this.aClass65_Sub3_10.anInt8156;
		}
		if (local59 < (float) this.aClass65_Sub3_10.anInt8135) {
			local59 = (float) this.aClass65_Sub3_10.anInt8135;
		}
		if (local65 > (float) this.aClass65_Sub3_10.anInt8147) {
			local65 = (float) this.aClass65_Sub3_10.anInt8147;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static659.anInt7239 = this.aClass65_Sub3_10.anInt8131;
		Static659.anInt7227 = (int) ((float) ((int) local59 * Static659.anInt7239) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static659.anInt7247 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7252 / local71);
		Static659.anInt7238 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7255 / local77);
		Static659.anInt7232 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7252 / local77);
		Static659.anInt7243 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7255 / local71);
		Static659.anInt7235 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static659.anInt7242 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static659.anInt7244 = (this.anInt7252 >> 1 << 12) + (Static659.anInt7242 * Static659.anInt7232 >> 4);
		Static659.anInt7251 = (this.anInt7255 >> 1 << 12) + (Static659.anInt7242 * Static659.anInt7243 >> 4);
		Static659.anInt7230 = Static659.anInt7235 * Static659.anInt7247 >> 4;
		Static659.anInt7233 = Static659.anInt7235 * Static659.anInt7238 >> 4;
		Static659.anInt7237 = (int) local46;
		Static659.anInt7229 = (int) local53;
		Static659.anInt7257 = (int) local59;
		Static659.anInt7245 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
	@Override
	public final int method5992() {
		return this.anInt7255;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
	protected abstract void method6014(@OriginalArg(0) int arg0);
}

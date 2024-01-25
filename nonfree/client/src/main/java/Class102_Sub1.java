import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public abstract class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	protected int anInt8216;

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
	protected int anInt8227;

	@OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
	protected int anInt8229;

	@OriginalMember(owner = "client!tfa", name = "C", descriptor = "I")
	protected int anInt8239;

	@OriginalMember(owner = "client!tfa", name = "y", descriptor = "Lclient!ut;")
	protected final Class16_Sub3 aClass16_Sub3_9;

	@OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
	public final int anInt8224;

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
	public final int anInt8218;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!ut;II)V")
	public Class102_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass16_Sub3_9 = arg0;
		this.anInt8224 = arg1;
		this.anInt8218 = arg2;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "([I)V")
	@Override
	public final void method6953(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8229;
		arg0[1] = this.anInt8239;
		arg0[2] = this.anInt8227;
		arg0[3] = this.anInt8216;
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(IIII)V")
	@Override
	public final void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8229 = arg0;
		this.anInt8239 = arg1;
		this.anInt8227 = arg2;
		this.anInt8216 = arg3;
	}

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "()I")
	@Override
	public final int method6962() {
		return this.anInt8218;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIII)V")
	public abstract void method6955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "([I[III)V")
	protected abstract void method6972(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6973(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8229 + this.anInt8224 + this.anInt8227;
		@Pc(17) int local17 = this.anInt8239 + this.anInt8218 + this.anInt8216;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8224 || local17 != this.anInt8218) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8239;
			local65 = local53 * (float) this.anInt8239;
			local71 = local32 * (float) this.anInt8229;
			local77 = local39 * (float) this.anInt8229;
			@Pc(84) float local84 = -local32 * (float) this.anInt8227;
			@Pc(91) float local91 = -local39 * (float) this.anInt8227;
			@Pc(98) float local98 = -local46 * (float) this.anInt8216;
			@Pc(105) float local105 = -local53 * (float) this.anInt8216;
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
		if (local46 < (float) this.aClass16_Sub3_9.anInt9634) {
			local46 = (float) this.aClass16_Sub3_9.anInt9634;
		}
		if (local53 > (float) this.aClass16_Sub3_9.anInt9623) {
			local53 = (float) this.aClass16_Sub3_9.anInt9623;
		}
		if (local59 < (float) this.aClass16_Sub3_9.anInt9632) {
			local59 = (float) this.aClass16_Sub3_9.anInt9632;
		}
		if (local65 > (float) this.aClass16_Sub3_9.anInt9639) {
			local65 = (float) this.aClass16_Sub3_9.anInt9639;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static572.anInt8219 = this.aClass16_Sub3_9.anInt9638;
		Static572.anInt8242 = (int) ((float) ((int) local59 * Static572.anInt8219) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static572.anInt8240 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8224 / local71);
		Static572.anInt8213 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8218 / local77);
		Static572.anInt8215 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8224 / local77);
		Static572.anInt8236 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8218 / local71);
		Static572.anInt8226 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static572.anInt8234 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static572.anInt8237 = (this.anInt8224 >> 1 << 12) + (Static572.anInt8234 * Static572.anInt8215 >> 4);
		Static572.anInt8223 = (this.anInt8218 >> 1 << 12) + (Static572.anInt8234 * Static572.anInt8236 >> 4);
		Static572.anInt8214 = Static572.anInt8226 * Static572.anInt8240 >> 4;
		Static572.anInt8238 = Static572.anInt8226 * Static572.anInt8213 >> 4;
		Static572.anInt8230 = (int) local46;
		Static572.anInt8228 = (int) local53;
		Static572.anInt8243 = (int) local59;
		Static572.anInt8217 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "()I")
	@Override
	public final int method6958() {
		return this.anInt8239 + this.anInt8218 + this.anInt8216;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method6965(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass16_Sub3_9.method8206()) {
			throw new IllegalStateException();
		} else if (this.method6973(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static572.anInt8221 = arg7;
			if (arg6 != 1) {
				Static572.anInt8241 = arg7 >>> 24;
				Static572.anInt8232 = 256 - Static572.anInt8241;
				if (arg6 == 0) {
					Static572.anInt8233 = arg7 >> 16 & 0xFF;
					Static572.anInt8220 = arg7 >> 8 & 0xFF;
					Static572.anInt8231 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static572.anInt8235 = arg7 >>> 24;
					Static572.anInt8225 = 256 - Static572.anInt8235;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static572.anInt8225 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static572.anInt8225 & 0xFF0000;
					Static572.anInt8222 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6974(1);
			} else if (arg6 == 0) {
				this.method6974(0);
			} else if (arg6 == 3) {
				this.method6974(3);
			} else if (arg6 == 2) {
				this.method6974(2);
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "()I")
	@Override
	public final int method6957() {
		return this.anInt8224;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
	protected abstract void method6974(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method6960(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass16_Sub3_9.method8206()) {
			throw new IllegalStateException();
		} else if (this.method6973(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method6972(local20.anIntArray141, local20.anIntArray142, Static572.anInt8230 - arg7, -arg8 - (Static572.anInt8217 - Static572.anInt8243));
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "()I")
	@Override
	public final int method6951() {
		return this.anInt8229 + this.anInt8224 + this.anInt8227;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass16_Sub3_9.method8206()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray529 == null) {
			this.anIntArray529 = new int[4];
		}
		this.aClass16_Sub3_9.K(this.anIntArray529);
		this.aClass16_Sub3_9.T(this.aClass16_Sub3_9.anInt9634, this.aClass16_Sub3_9.anInt9632, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method6951();
		@Pc(40) int local40 = this.method6958();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method6955(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass16_Sub3_9.KA(this.anIntArray529[0], this.anIntArray529[1], this.anIntArray529[2], this.anIntArray529[3]);
	}
}

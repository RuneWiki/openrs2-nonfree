import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public abstract class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	protected int anInt7271;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
	protected int anInt7285;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
	protected int anInt7295;

	@OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
	protected int anInt7299;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!st;")
	protected final Class162_Sub2 aClass162_Sub2_8;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	public final int anInt7296;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
	public final int anInt7293;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!st;II)V")
	public Class38_Sub1(@OriginalArg(0) Class162_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass162_Sub2_8 = arg0;
		this.anInt7296 = arg1;
		this.anInt7293 = arg2;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5926(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7271 + this.anInt7296 + this.anInt7285;
		@Pc(17) int local17 = this.anInt7299 + this.anInt7293 + this.anInt7295;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7296 || local17 != this.anInt7293) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7299;
			local65 = local53 * (float) this.anInt7299;
			local71 = local32 * (float) this.anInt7271;
			local77 = local39 * (float) this.anInt7271;
			@Pc(84) float local84 = -local32 * (float) this.anInt7285;
			@Pc(91) float local91 = -local39 * (float) this.anInt7285;
			@Pc(98) float local98 = -local46 * (float) this.anInt7295;
			@Pc(105) float local105 = -local53 * (float) this.anInt7295;
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
		if (local46 < (float) this.aClass162_Sub2_8.anInt7898) {
			local46 = this.aClass162_Sub2_8.anInt7898;
		}
		if (local53 > (float) this.aClass162_Sub2_8.anInt7885) {
			local53 = this.aClass162_Sub2_8.anInt7885;
		}
		if (local59 < (float) this.aClass162_Sub2_8.anInt7894) {
			local59 = this.aClass162_Sub2_8.anInt7894;
		}
		if (local65 > (float) this.aClass162_Sub2_8.anInt7884) {
			local65 = this.aClass162_Sub2_8.anInt7884;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static44.anInt7278 = this.aClass162_Sub2_8.anInt7902;
		Static44.anInt7274 = (int) ((float) ((int) local59 * Static44.anInt7278) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static44.anInt7288 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7296 / local71);
		Static44.anInt7300 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7293 / local77);
		Static44.anInt7287 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7296 / local77);
		Static44.anInt7289 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7293 / local71);
		Static44.anInt7276 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static44.anInt7273 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static44.anInt7277 = (this.anInt7296 >> 1 << 12) + (Static44.anInt7273 * Static44.anInt7287 >> 4);
		Static44.anInt7283 = (this.anInt7293 >> 1 << 12) + (Static44.anInt7273 * Static44.anInt7289 >> 4);
		Static44.anInt7298 = Static44.anInt7276 * Static44.anInt7288 >> 4;
		Static44.anInt7282 = Static44.anInt7276 * Static44.anInt7300 >> 4;
		Static44.anInt7294 = (int) local46;
		Static44.anInt7286 = (int) local53;
		Static44.anInt7301 = (int) local59;
		Static44.anInt7297 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt7271 + this.anInt7296 + this.anInt7285;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([I[III)V")
	protected abstract void method5927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
	protected abstract void method5928(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt7293;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bn", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass162_Sub2_8.method6432()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray489 == null) {
			this.anIntArray489 = new int[4];
		}
		this.aClass162_Sub2_8.oa(this.anIntArray489);
		this.aClass162_Sub2_8.V(this.aClass162_Sub2_8.anInt7898, this.aClass162_Sub2_8.anInt7894, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.A();
		@Pc(40) int local40 = this.ca();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.V(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass162_Sub2_8.da(this.anIntArray489[0], this.anIntArray489[1], this.anIntArray489[2], this.anIntArray489[3]);
	}

	@OriginalMember(owner = "client!bn", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7271 = arg0;
		this.anInt7299 = arg1;
		this.anInt7285 = arg2;
		this.anInt7295 = arg3;
	}

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7465(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class84 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass162_Sub2_8.method6432()) {
			throw new IllegalStateException();
		} else if (this.method5926(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class84_Sub1 local20 = (Class84_Sub1) arg6;
			this.method5927(local20.anIntArray167, local20.anIntArray166, Static44.anInt7294 - arg7, -arg8 - (Static44.anInt7297 - Static44.anInt7301));
		}
	}

	@OriginalMember(owner = "client!bn", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt7299 + this.anInt7293 + this.anInt7295;
	}

	@OriginalMember(owner = "client!bn", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!bn", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt7296;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!bn", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass162_Sub2_8.method6432()) {
			throw new IllegalStateException();
		} else if (this.method5926(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static44.anInt7280 = arg7;
			if (arg6 != 1) {
				Static44.anInt7281 = arg7 >>> 24;
				Static44.anInt7291 = 256 - Static44.anInt7281;
				if (arg6 == 0) {
					Static44.anInt7292 = arg7 >> 16 & 0xFF;
					Static44.anInt7272 = arg7 >> 8 & 0xFF;
					Static44.anInt7275 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static44.anInt7279 = arg7 >>> 24;
					Static44.anInt7290 = 256 - Static44.anInt7279;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static44.anInt7290 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static44.anInt7290 & 0xFF0000;
					Static44.anInt7284 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5928(1);
			} else if (arg6 == 0) {
				this.method5928(0);
			} else if (arg6 == 3) {
				this.method5928(3);
			} else if (arg6 == 2) {
				this.method5928(2);
			}
		}
	}
}

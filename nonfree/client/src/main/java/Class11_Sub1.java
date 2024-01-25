import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	protected int anInt5290;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	protected int anInt5300;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	protected int anInt5305;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	protected int anInt5310;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "Lclient!dg;")
	protected final Class51_Sub1 aClass51_Sub1_11;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
	protected final int anInt5306;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	protected final int anInt5287;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!dg;II)V")
	protected Class11_Sub1(@OriginalArg(0) Class51_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass51_Sub1_11 = arg0;
		this.anInt5306 = arg1;
		this.anInt5287 = arg2;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected final void method4395(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class119 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass51_Sub1_11.method1123()) {
			throw new IllegalStateException();
		}
		this.method4262(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class119_Sub1 local18 = (Class119_Sub1) arg6;
		this.method4260(local18.anIntArray292, local18.anIntArray290, Static160.anInt5293 - arg7, -arg8 - (Static160.anInt5301 - Static160.anInt5292));
	}

	@OriginalMember(owner = "client!ho", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt5306;
	}

	@OriginalMember(owner = "client!ho", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt5300 + this.anInt5287 + this.anInt5310;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!ma;II)V")
	public abstract void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ho", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([I[III)V")
	protected abstract void method4260(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "(IIIII)V")
	public abstract void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "()I")
	@Override
	public final int j() {
		return this.anInt5290 + this.anInt5306 + this.anInt5305;
	}

	@OriginalMember(owner = "client!ho", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass51_Sub1_11.method1123()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray477 == null) {
			this.anIntArray477 = new int[4];
		}
		this.aClass51_Sub1_11.da(this.anIntArray477);
		this.aClass51_Sub1_11.fa(this.aClass51_Sub1_11.anInt1298, this.aClass51_Sub1_11.anInt1281, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.j();
		@Pc(40) int local40 = this.T();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.r(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass51_Sub1_11.OA(this.anIntArray477[0], this.anIntArray477[1], this.anIntArray477[2], this.anIntArray477[3]);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass51_Sub1_11.method1123()) {
			throw new IllegalStateException();
		}
		this.method4262(arg0, arg1, arg2, arg3, arg4, arg5);
		Static160.anInt5312 = arg7;
		if (arg6 != 1) {
			Static160.anInt5317 = arg7 >>> 24;
			Static160.anInt5314 = 256 - Static160.anInt5317;
			if (arg6 == 0) {
				Static160.anInt5299 = arg7 >> 16 & 0xFF;
				Static160.anInt5315 = arg7 >> 8 & 0xFF;
				Static160.anInt5289 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static160.anInt5311 = arg7 >>> 24;
				Static160.anInt5309 = 256 - Static160.anInt5311;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static160.anInt5309 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static160.anInt5309 & 0xFF0000;
				Static160.anInt5303 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method4261(1);
		} else if (arg6 == 0) {
			this.method4261(0);
		} else if (arg6 == 3) {
			this.method4261(3);
		} else if (arg6 == 2) {
			this.method4261(2);
		}
	}

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "(IIIIIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)V")
	protected abstract void method4261(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ho", name = "MA", descriptor = "(IIII)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5290 = arg0;
		this.anInt5300 = arg1;
		this.anInt5305 = arg2;
		this.anInt5310 = arg3;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFF)V")
	private void method4262(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5290 + this.anInt5306 + this.anInt5305;
		@Pc(17) int local17 = this.anInt5300 + this.anInt5287 + this.anInt5310;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5306 || local17 != this.anInt5287) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5300;
			local65 = local53 * (float) this.anInt5300;
			local71 = local32 * (float) this.anInt5290;
			local77 = local39 * (float) this.anInt5290;
			@Pc(84) float local84 = -local32 * (float) this.anInt5305;
			@Pc(91) float local91 = -local39 * (float) this.anInt5305;
			@Pc(98) float local98 = -local46 * (float) this.anInt5310;
			@Pc(105) float local105 = -local53 * (float) this.anInt5310;
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
		if (local46 < (float) this.aClass51_Sub1_11.anInt1298) {
			local46 = this.aClass51_Sub1_11.anInt1298;
		}
		if (local53 > (float) this.aClass51_Sub1_11.anInt1273) {
			local53 = this.aClass51_Sub1_11.anInt1273;
		}
		if (local59 < (float) this.aClass51_Sub1_11.anInt1281) {
			local59 = this.aClass51_Sub1_11.anInt1281;
		}
		if (local65 > (float) this.aClass51_Sub1_11.anInt1297) {
			local65 = this.aClass51_Sub1_11.anInt1297;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static160.anInt5308 = this.aClass51_Sub1_11.anInt1284;
		Static160.anInt5294 = (int) ((float) ((int) local59 * Static160.anInt5308) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static160.anInt5296 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5306 / local71);
		Static160.anInt5313 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5287 / local77);
		Static160.anInt5307 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5306 / local77);
		Static160.anInt5316 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5287 / local71);
		Static160.anInt5291 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static160.anInt5297 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static160.anInt5304 = (this.anInt5306 >> 1 << 12) + (Static160.anInt5297 * Static160.anInt5307 >> 4);
		Static160.anInt5295 = (this.anInt5287 >> 1 << 12) + (Static160.anInt5297 * Static160.anInt5316 >> 4);
		Static160.anInt5288 = Static160.anInt5291 * Static160.anInt5296 >> 4;
		Static160.anInt5302 = Static160.anInt5291 * Static160.anInt5313 >> 4;
		Static160.anInt5293 = (int) local46;
		Static160.anInt5298 = (int) local53;
		Static160.anInt5292 = (int) local59;
		Static160.anInt5301 = (int) local65;
	}
}

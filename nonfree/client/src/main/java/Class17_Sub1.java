import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public abstract class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
	protected int anInt7311;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "[I")
	private int[] anIntArray628;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	protected int anInt7323;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	protected int anInt7328;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	protected int anInt7337;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "Lclient!cv;")
	protected final Class49_Sub1 aClass49_Sub1_11;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
	protected final int anInt7339;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	protected final int anInt7324;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!cv;II)V")
	protected Class17_Sub1(@OriginalArg(0) Class49_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass49_Sub1_11 = arg0;
		this.anInt7339 = arg1;
		this.anInt7324 = arg2;
	}

	@OriginalMember(owner = "client!vo", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt7324;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([I[III)V")
	protected abstract void method5776(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected final void method5768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass49_Sub1_11.method1096()) {
			throw new IllegalStateException();
		}
		this.method5777(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class73_Sub1 local18 = (Class73_Sub1) arg6;
		this.method5776(local18.anIntArray181, local18.anIntArray182, Static426.anInt7336 - arg7, -arg8 - (Static426.anInt7309 - Static426.anInt7333));
	}

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "(IIIII)V")
	public abstract void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "()I")
	@Override
	public final int j() {
		return this.anInt7311 + this.anInt7339 + this.anInt7323;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(FFFFFF)V")
	private void method5777(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7311 + this.anInt7339 + this.anInt7323;
		@Pc(17) int local17 = this.anInt7328 + this.anInt7324 + this.anInt7337;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7339 || local17 != this.anInt7324) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7328;
			local65 = local53 * (float) this.anInt7328;
			local71 = local32 * (float) this.anInt7311;
			local77 = local39 * (float) this.anInt7311;
			@Pc(84) float local84 = -local32 * (float) this.anInt7323;
			@Pc(91) float local91 = -local39 * (float) this.anInt7323;
			@Pc(98) float local98 = -local46 * (float) this.anInt7337;
			@Pc(105) float local105 = -local53 * (float) this.anInt7337;
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
		if (local46 < (float) this.aClass49_Sub1_11.anInt1266) {
			local46 = this.aClass49_Sub1_11.anInt1266;
		}
		if (local53 > (float) this.aClass49_Sub1_11.anInt1286) {
			local53 = this.aClass49_Sub1_11.anInt1286;
		}
		if (local59 < (float) this.aClass49_Sub1_11.anInt1281) {
			local59 = this.aClass49_Sub1_11.anInt1281;
		}
		if (local65 > (float) this.aClass49_Sub1_11.anInt1279) {
			local65 = this.aClass49_Sub1_11.anInt1279;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static426.anInt7317 = this.aClass49_Sub1_11.anInt1264;
		Static426.anInt7318 = (int) ((float) ((int) local59 * Static426.anInt7317) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static426.anInt7320 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7339 / local71);
		Static426.anInt7312 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7324 / local77);
		Static426.anInt7332 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7339 / local77);
		Static426.anInt7335 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7324 / local71);
		Static426.anInt7319 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static426.anInt7315 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static426.anInt7322 = (this.anInt7339 >> 1 << 12) + (Static426.anInt7315 * Static426.anInt7332 >> 4);
		Static426.anInt7331 = (this.anInt7324 >> 1 << 12) + (Static426.anInt7315 * Static426.anInt7335 >> 4);
		Static426.anInt7325 = Static426.anInt7319 * Static426.anInt7320 >> 4;
		Static426.anInt7321 = Static426.anInt7319 * Static426.anInt7312 >> 4;
		Static426.anInt7336 = (int) local46;
		Static426.anInt7326 = (int) local53;
		Static426.anInt7333 = (int) local59;
		Static426.anInt7309 = (int) local65;
	}

	@OriginalMember(owner = "client!vo", name = "MA", descriptor = "(IIII)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7311 = arg0;
		this.anInt7328 = arg1;
		this.anInt7323 = arg2;
		this.anInt7337 = arg3;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass49_Sub1_11.method1096()) {
			throw new IllegalStateException();
		}
		this.method5777(arg0, arg1, arg2, arg3, arg4, arg5);
		Static426.anInt7314 = arg7;
		if (arg6 != 1) {
			Static426.anInt7338 = arg7 >>> 24;
			Static426.anInt7327 = 256 - Static426.anInt7338;
			if (arg6 == 0) {
				Static426.anInt7313 = arg7 >> 16 & 0xFF;
				Static426.anInt7316 = arg7 >> 8 & 0xFF;
				Static426.anInt7310 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static426.anInt7329 = arg7 >>> 24;
				Static426.anInt7334 = 256 - Static426.anInt7329;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static426.anInt7334 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static426.anInt7334 & 0xFF0000;
				Static426.anInt7330 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5778(1);
		} else if (arg6 == 0) {
			this.method5778(0);
		} else if (arg6 == 3) {
			this.method5778(3);
		} else if (arg6 == 2) {
			this.method5778(2);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!ma;II)V")
	public abstract void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vo", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt7328 + this.anInt7324 + this.anInt7337;
	}

	@OriginalMember(owner = "client!vo", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass49_Sub1_11.method1096()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray628 == null) {
			this.anIntArray628 = new int[4];
		}
		this.aClass49_Sub1_11.da(this.anIntArray628);
		this.aClass49_Sub1_11.fa(this.aClass49_Sub1_11.anInt1266, this.aClass49_Sub1_11.anInt1281, arg0 + arg2, arg1 + arg3);
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
		this.aClass49_Sub1_11.OA(this.anIntArray628[0], this.anIntArray628[1], this.anIntArray628[2], this.anIntArray628[3]);
	}

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "(IIIIIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!vo", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt7339;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)V")
	protected abstract void method5778(@OriginalArg(0) int arg0);
}

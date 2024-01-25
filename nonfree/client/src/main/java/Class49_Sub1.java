import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public abstract class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	protected int anInt7299;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	protected int anInt7302;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
	protected int anInt7310;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	protected int anInt7312;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!qf;")
	protected final Class200_Sub1 aClass200_Sub1_11;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	protected final int anInt7292;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	protected final int anInt7284;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!qf;II)V")
	protected Class49_Sub1(@OriginalArg(0) Class200_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass200_Sub1_11 = arg0;
		this.anInt7292 = arg1;
		this.anInt7284 = arg2;
	}

	@OriginalMember(owner = "client!eb", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass200_Sub1_11.method4314()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray488 == null) {
			this.anIntArray488 = new int[4];
		}
		this.aClass200_Sub1_11.MA(this.anIntArray488);
		this.aClass200_Sub1_11.HA(this.aClass200_Sub1_11.anInt5416, this.aClass200_Sub1_11.anInt5404, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.RA();
		@Pc(40) int local40 = this.Q();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.W(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass200_Sub1_11.ba(this.anIntArray488[0], this.anIntArray488[1], this.anIntArray488[2], this.anIntArray488[3]);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFFFFF)V")
	private void method5795(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7312 + this.anInt7292 + this.anInt7299;
		@Pc(17) int local17 = this.anInt7302 + this.anInt7284 + this.anInt7310;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7292 || local17 != this.anInt7284) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7302;
			local65 = local53 * (float) this.anInt7302;
			local71 = local32 * (float) this.anInt7312;
			local77 = local39 * (float) this.anInt7312;
			@Pc(84) float local84 = -local32 * (float) this.anInt7299;
			@Pc(91) float local91 = -local39 * (float) this.anInt7299;
			@Pc(98) float local98 = -local46 * (float) this.anInt7310;
			@Pc(105) float local105 = -local53 * (float) this.anInt7310;
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
		if (local46 < (float) this.aClass200_Sub1_11.anInt5416) {
			local46 = this.aClass200_Sub1_11.anInt5416;
		}
		if (local53 > (float) this.aClass200_Sub1_11.anInt5411) {
			local53 = this.aClass200_Sub1_11.anInt5411;
		}
		if (local59 < (float) this.aClass200_Sub1_11.anInt5404) {
			local59 = this.aClass200_Sub1_11.anInt5404;
		}
		if (local65 > (float) this.aClass200_Sub1_11.anInt5401) {
			local65 = this.aClass200_Sub1_11.anInt5401;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static90.anInt7291 = this.aClass200_Sub1_11.anInt5426;
		Static90.anInt7296 = (int) ((float) ((int) local59 * Static90.anInt7291) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static90.anInt7288 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7292 / local71);
		Static90.anInt7295 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7284 / local77);
		Static90.anInt7290 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7292 / local77);
		Static90.anInt7307 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7284 / local71);
		Static90.anInt7306 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static90.anInt7303 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static90.anInt7311 = (this.anInt7292 >> 1 << 12) + (Static90.anInt7303 * Static90.anInt7290 >> 4);
		Static90.anInt7293 = (this.anInt7284 >> 1 << 12) + (Static90.anInt7303 * Static90.anInt7307 >> 4);
		Static90.anInt7304 = Static90.anInt7306 * Static90.anInt7288 >> 4;
		Static90.anInt7283 = Static90.anInt7306 * Static90.anInt7295 >> 4;
		Static90.anInt7287 = (int) local46;
		Static90.anInt7282 = (int) local53;
		Static90.anInt7301 = (int) local59;
		Static90.anInt7305 = (int) local65;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[III)V")
	protected abstract void method5796(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "(IIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	protected abstract void method5797(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eb", name = "RA", descriptor = "()I")
	@Override
	public final int RA() {
		return this.anInt7312 + this.anInt7292 + this.anInt7299;
	}

	@OriginalMember(owner = "client!eb", name = "ya", descriptor = "(IIIIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "()I")
	@Override
	public final int Q() {
		return this.anInt7302 + this.anInt7284 + this.anInt7310;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!ta;II)V")
	public abstract void method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eb", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		return this.anInt7292;
	}

	@OriginalMember(owner = "client!eb", name = "ZA", descriptor = "()I")
	@Override
	public final int ZA() {
		return this.anInt7284;
	}

	@OriginalMember(owner = "client!eb", name = "ha", descriptor = "(IIII)V")
	@Override
	public final void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7312 = arg0;
		this.anInt7302 = arg1;
		this.anInt7299 = arg2;
		this.anInt7310 = arg3;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected final void method5791(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class97 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass200_Sub1_11.method4314()) {
			throw new IllegalStateException();
		}
		this.method5795(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class97_Sub1 local18 = (Class97_Sub1) arg6;
		this.method5796(local18.anIntArray140, local18.anIntArray141, Static90.anInt7287 - arg7, -arg8 - (Static90.anInt7305 - Static90.anInt7301));
	}

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass200_Sub1_11.method4314()) {
			throw new IllegalStateException();
		}
		this.method5795(arg0, arg1, arg2, arg3, arg4, arg5);
		Static90.anInt7285 = arg7;
		if (arg6 != 1) {
			Static90.anInt7289 = arg7 >>> 24;
			Static90.anInt7297 = 256 - Static90.anInt7289;
			if (arg6 == 0) {
				Static90.anInt7309 = arg7 >> 16 & 0xFF;
				Static90.anInt7298 = arg7 >> 8 & 0xFF;
				Static90.anInt7300 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static90.anInt7294 = arg7 >>> 24;
				Static90.anInt7286 = 256 - Static90.anInt7294;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static90.anInt7286 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static90.anInt7286 & 0xFF0000;
				Static90.anInt7308 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5797(1);
		} else if (arg6 == 0) {
			this.method5797(0);
		} else if (arg6 == 3) {
			this.method5797(3);
		} else if (arg6 == 2) {
			this.method5797(2);
		}
	}
}

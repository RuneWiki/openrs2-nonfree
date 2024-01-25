import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public abstract class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
	protected int anInt4411;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
	protected int anInt4412;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	protected int anInt4417;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	protected int anInt4425;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "Lclient!ra;")
	protected final Class109_Sub2 aClass109_Sub2_7;

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
	protected final int anInt4423;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	protected final int anInt4398;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!ra;II)V")
	protected Class80_Sub1(@OriginalArg(0) Class109_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass109_Sub2_7 = arg0;
		this.anInt4423 = arg1;
		this.anInt4398 = arg2;
	}

	@OriginalMember(owner = "client!fp", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass109_Sub2_7.method4758()) {
			throw new IllegalStateException();
		}
		this.method3634(arg0, arg1, arg2, arg3, arg4, arg5);
		Static117.anInt4415 = arg7;
		if (arg6 != 1) {
			Static117.anInt4414 = arg7 >>> 24;
			Static117.anInt4409 = 256 - Static117.anInt4414;
			if (arg6 == 0) {
				Static117.anInt4407 = arg7 >> 16 & 0xFF;
				Static117.anInt4404 = arg7 >> 8 & 0xFF;
				Static117.anInt4426 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static117.anInt4416 = arg7 >>> 24;
				Static117.anInt4405 = 256 - Static117.anInt4416;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static117.anInt4405 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static117.anInt4405 & 0xFF0000;
				Static117.anInt4410 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method3632(1);
		} else if (arg6 == 0) {
			this.method3632(0);
		} else if (arg6 == 3) {
			this.method3632(3);
		} else if (arg6 == 2) {
			this.method3632(2);
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)V")
	protected abstract void method3632(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fp", name = "JA", descriptor = "()I")
	@Override
	public final int JA() {
		return this.anInt4411 + this.anInt4398 + this.anInt4425;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([I[III)V")
	protected abstract void method3633(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public final void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass109_Sub2_7.method4758()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray353 == null) {
			this.anIntArray353 = new int[4];
		}
		this.aClass109_Sub2_7.u(this.anIntArray353);
		this.aClass109_Sub2_7.Z(this.aClass109_Sub2_7.anInt5878, this.aClass109_Sub2_7.anInt5861, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.ja();
		@Pc(40) int local40 = this.JA();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.YA(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass109_Sub2_7.pa(this.anIntArray353[0], this.anIntArray353[1], this.anIntArray353[2], this.anIntArray353[3]);
	}

	@OriginalMember(owner = "client!fp", name = "qa", descriptor = "()I")
	@Override
	public final int qa() {
		return this.anInt4398;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected final void method6091(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass109_Sub2_7.method4758()) {
			throw new IllegalStateException();
		}
		this.method3634(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class62_Sub1 local18 = (Class62_Sub1) arg6;
		this.method3633(local18.anIntArray443, local18.anIntArray442, Static117.anInt4422 - arg7, -arg8 - (Static117.anInt4397 - Static117.anInt4420));
	}

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!fp", name = "UA", descriptor = "()I")
	@Override
	public final int UA() {
		return this.anInt4423;
	}

	@OriginalMember(owner = "client!fp", name = "ka", descriptor = "(IIII)V")
	@Override
	public final void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4417 = arg0;
		this.anInt4411 = arg1;
		this.anInt4412 = arg2;
		this.anInt4425 = arg3;
	}

	@OriginalMember(owner = "client!fp", name = "ja", descriptor = "()I")
	@Override
	public final int ja() {
		return this.anInt4417 + this.anInt4423 + this.anInt4412;
	}

	@OriginalMember(owner = "client!fp", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(FFFFFF)V")
	private void method3634(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4417 + this.anInt4423 + this.anInt4412;
		@Pc(17) int local17 = this.anInt4411 + this.anInt4398 + this.anInt4425;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4423 || local17 != this.anInt4398) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4411;
			local65 = local53 * (float) this.anInt4411;
			local71 = local32 * (float) this.anInt4417;
			local77 = local39 * (float) this.anInt4417;
			@Pc(84) float local84 = -local32 * (float) this.anInt4412;
			@Pc(91) float local91 = -local39 * (float) this.anInt4412;
			@Pc(98) float local98 = -local46 * (float) this.anInt4425;
			@Pc(105) float local105 = -local53 * (float) this.anInt4425;
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
		if (local46 < (float) this.aClass109_Sub2_7.anInt5878) {
			local46 = this.aClass109_Sub2_7.anInt5878;
		}
		if (local53 > (float) this.aClass109_Sub2_7.anInt5860) {
			local53 = this.aClass109_Sub2_7.anInt5860;
		}
		if (local59 < (float) this.aClass109_Sub2_7.anInt5861) {
			local59 = this.aClass109_Sub2_7.anInt5861;
		}
		if (local65 > (float) this.aClass109_Sub2_7.anInt5886) {
			local65 = this.aClass109_Sub2_7.anInt5886;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static117.anInt4400 = this.aClass109_Sub2_7.anInt5884;
		Static117.anInt4396 = (int) ((float) ((int) local59 * Static117.anInt4400) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static117.anInt4419 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4423 / local71);
		Static117.anInt4406 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4398 / local77);
		Static117.anInt4408 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4423 / local77);
		Static117.anInt4413 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4398 / local71);
		Static117.anInt4403 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static117.anInt4401 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static117.anInt4399 = (this.anInt4423 >> 1 << 12) + (Static117.anInt4401 * Static117.anInt4408 >> 4);
		Static117.anInt4424 = (this.anInt4398 >> 1 << 12) + (Static117.anInt4401 * Static117.anInt4413 >> 4);
		Static117.anInt4402 = Static117.anInt4403 * Static117.anInt4419 >> 4;
		Static117.anInt4418 = Static117.anInt4403 * Static117.anInt4406 >> 4;
		Static117.anInt4422 = (int) local46;
		Static117.anInt4421 = (int) local53;
		Static117.anInt4420 = (int) local59;
		Static117.anInt4397 = (int) local65;
	}
}

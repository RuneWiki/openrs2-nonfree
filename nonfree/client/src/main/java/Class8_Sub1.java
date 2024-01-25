import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public abstract class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	protected int anInt6377;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	protected int anInt6378;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
	protected int anInt6389;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	protected int anInt6399;

	@OriginalMember(owner = "client!ts", name = "G", descriptor = "Lclient!o;")
	protected final Class172_Sub1 aClass172_Sub1_10;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
	protected final int anInt6373;

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
	protected final int anInt6384;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!o;II)V")
	protected Class8_Sub1(@OriginalArg(0) Class172_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass172_Sub1_10 = arg0;
		this.anInt6373 = arg1;
		this.anInt6384 = arg2;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFF)V")
	private void method4974(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6377 + this.anInt6373 + this.anInt6378;
		@Pc(17) int local17 = this.anInt6399 + this.anInt6384 + this.anInt6389;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6373 || local17 != this.anInt6384) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6399;
			local65 = local53 * (float) this.anInt6399;
			local71 = local32 * (float) this.anInt6377;
			local77 = local39 * (float) this.anInt6377;
			@Pc(84) float local84 = -local32 * (float) this.anInt6378;
			@Pc(91) float local91 = -local39 * (float) this.anInt6378;
			@Pc(98) float local98 = -local46 * (float) this.anInt6389;
			@Pc(105) float local105 = -local53 * (float) this.anInt6389;
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
		if (local46 < (float) this.aClass172_Sub1_10.anInt5164) {
			local46 = this.aClass172_Sub1_10.anInt5164;
		}
		if (local53 > (float) this.aClass172_Sub1_10.anInt5158) {
			local53 = this.aClass172_Sub1_10.anInt5158;
		}
		if (local59 < (float) this.aClass172_Sub1_10.anInt5175) {
			local59 = this.aClass172_Sub1_10.anInt5175;
		}
		if (local65 > (float) this.aClass172_Sub1_10.anInt5155) {
			local65 = this.aClass172_Sub1_10.anInt5155;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static395.anInt6400 = this.aClass172_Sub1_10.anInt5174;
		Static395.anInt6383 = (int) ((float) ((int) local59 * Static395.anInt6400) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static395.anInt6370 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6373 / local71);
		Static395.anInt6374 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6384 / local77);
		Static395.anInt6379 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6373 / local77);
		Static395.anInt6398 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6384 / local71);
		Static395.anInt6381 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static395.anInt6375 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static395.anInt6391 = (this.anInt6373 >> 1 << 12) + (Static395.anInt6375 * Static395.anInt6379 >> 4);
		Static395.anInt6390 = (this.anInt6384 >> 1 << 12) + (Static395.anInt6375 * Static395.anInt6398 >> 4);
		Static395.anInt6376 = Static395.anInt6381 * Static395.anInt6370 >> 4;
		Static395.anInt6396 = Static395.anInt6381 * Static395.anInt6374 >> 4;
		Static395.anInt6372 = (int) local46;
		Static395.anInt6386 = (int) local53;
		Static395.anInt6393 = (int) local59;
		Static395.anInt6392 = (int) local65;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ts", name = "ka", descriptor = "(IIII)V")
	@Override
	public final void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6377 = arg0;
		this.anInt6399 = arg1;
		this.anInt6378 = arg2;
		this.anInt6389 = arg3;
	}

	@OriginalMember(owner = "client!ts", name = "JA", descriptor = "()I")
	@Override
	public final int JA() {
		return this.anInt6399 + this.anInt6384 + this.anInt6389;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([I[III)V")
	protected abstract void method4975(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public final void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass172_Sub1_10.method4023()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray407 == null) {
			this.anIntArray407 = new int[4];
		}
		this.aClass172_Sub1_10.u(this.anIntArray407);
		this.aClass172_Sub1_10.Z(this.aClass172_Sub1_10.anInt5164, this.aClass172_Sub1_10.anInt5175, arg0 + arg2, arg1 + arg3);
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
		this.aClass172_Sub1_10.pa(this.anIntArray407[0], this.anIntArray407[1], this.anIntArray407[2], this.anIntArray407[3]);
	}

	@OriginalMember(owner = "client!ts", name = "ja", descriptor = "()I")
	@Override
	public final int ja() {
		return this.anInt6377 + this.anInt6373 + this.anInt6378;
	}

	@OriginalMember(owner = "client!ts", name = "qa", descriptor = "()I")
	@Override
	public final int qa() {
		return this.anInt6384;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)V")
	protected abstract void method4976(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass172_Sub1_10.method4023()) {
			throw new IllegalStateException();
		}
		this.method4974(arg0, arg1, arg2, arg3, arg4, arg5);
		Static395.anInt6388 = arg7;
		if (arg6 != 1) {
			Static395.anInt6394 = arg7 >>> 24;
			Static395.anInt6397 = 256 - Static395.anInt6394;
			if (arg6 == 0) {
				Static395.anInt6385 = arg7 >> 16 & 0xFF;
				Static395.anInt6395 = arg7 >> 8 & 0xFF;
				Static395.anInt6382 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static395.anInt6380 = arg7 >>> 24;
				Static395.anInt6387 = 256 - Static395.anInt6380;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static395.anInt6387 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static395.anInt6387 & 0xFF0000;
				Static395.anInt6371 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method4976(1);
		} else if (arg6 == 0) {
			this.method4976(0);
		} else if (arg6 == 3) {
			this.method4976(3);
		} else if (arg6 == 2) {
			this.method4976(2);
		}
	}

	@OriginalMember(owner = "client!ts", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected final void method5996(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class58 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass172_Sub1_10.method4023()) {
			throw new IllegalStateException();
		}
		this.method4974(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class58_Sub1 local18 = (Class58_Sub1) arg6;
		this.method4975(local18.anIntArray146, local18.anIntArray147, Static395.anInt6372 - arg7, -arg8 - (Static395.anInt6392 - Static395.anInt6393));
	}

	@OriginalMember(owner = "client!ts", name = "UA", descriptor = "()I")
	@Override
	public final int UA() {
		return this.anInt6373;
	}

	@OriginalMember(owner = "client!ts", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public abstract class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	protected int anInt5035;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	protected int anInt5045;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	protected int anInt5050;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	protected int anInt5057;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!hh;")
	protected final Class26_Sub2 aClass26_Sub2_10;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	protected final int anInt5039;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	protected final int anInt5063;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!hh;II)V")
	protected Class76_Sub1(@OriginalArg(0) Class26_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass26_Sub2_10 = arg0;
		this.anInt5039 = arg1;
		this.anInt5063 = arg2;
	}

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!kc", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kc", name = "ja", descriptor = "()I")
	@Override
	public final int ja() {
		return this.anInt5045 + this.anInt5039 + this.anInt5050;
	}

	@OriginalMember(owner = "client!kc", name = "ka", descriptor = "(IIII)V")
	@Override
	public final void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5045 = arg0;
		this.anInt5057 = arg1;
		this.anInt5050 = arg2;
		this.anInt5035 = arg3;
	}

	@OriginalMember(owner = "client!kc", name = "JA", descriptor = "()I")
	@Override
	public final int JA() {
		return this.anInt5057 + this.anInt5063 + this.anInt5035;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected final void method6096(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass26_Sub2_10.method2305()) {
			throw new IllegalStateException();
		}
		this.method4093(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class14_Sub1 local18 = (Class14_Sub1) arg6;
		this.method4092(local18.anIntArray23, local18.anIntArray24, Static202.anInt5056 - arg7, -arg8 - (Static202.anInt5046 - Static202.anInt5044));
	}

	@OriginalMember(owner = "client!kc", name = "qa", descriptor = "()I")
	@Override
	public final int qa() {
		return this.anInt5063;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([I[III)V")
	protected abstract void method4092(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kc", name = "UA", descriptor = "()I")
	@Override
	public final int UA() {
		return this.anInt5039;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method6094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kc", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass26_Sub2_10.method2305()) {
			throw new IllegalStateException();
		}
		this.method4093(arg0, arg1, arg2, arg3, arg4, arg5);
		Static202.anInt5036 = arg7;
		if (arg6 != 1) {
			Static202.anInt5049 = arg7 >>> 24;
			Static202.anInt5061 = 256 - Static202.anInt5049;
			if (arg6 == 0) {
				Static202.anInt5043 = arg7 >> 16 & 0xFF;
				Static202.anInt5060 = arg7 >> 8 & 0xFF;
				Static202.anInt5037 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static202.anInt5053 = arg7 >>> 24;
				Static202.anInt5034 = 256 - Static202.anInt5053;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static202.anInt5034 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static202.anInt5034 & 0xFF0000;
				Static202.anInt5040 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method4094(1);
		} else if (arg6 == 0) {
			this.method4094(0);
		} else if (arg6 == 3) {
			this.method4094(3);
		} else if (arg6 == 2) {
			this.method4094(2);
		}
	}

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public final void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass26_Sub2_10.method2305()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray338 == null) {
			this.anIntArray338 = new int[4];
		}
		this.aClass26_Sub2_10.u(this.anIntArray338);
		this.aClass26_Sub2_10.Z(this.aClass26_Sub2_10.anInt2903, this.aClass26_Sub2_10.anInt2905, arg0 + arg2, arg1 + arg3);
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
		this.aClass26_Sub2_10.pa(this.anIntArray338[0], this.anIntArray338[1], this.anIntArray338[2], this.anIntArray338[3]);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(FFFFFF)V")
	private void method4093(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5045 + this.anInt5039 + this.anInt5050;
		@Pc(17) int local17 = this.anInt5057 + this.anInt5063 + this.anInt5035;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5039 || local17 != this.anInt5063) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5057;
			local65 = local53 * (float) this.anInt5057;
			local71 = local32 * (float) this.anInt5045;
			local77 = local39 * (float) this.anInt5045;
			@Pc(84) float local84 = -local32 * (float) this.anInt5050;
			@Pc(91) float local91 = -local39 * (float) this.anInt5050;
			@Pc(98) float local98 = -local46 * (float) this.anInt5035;
			@Pc(105) float local105 = -local53 * (float) this.anInt5035;
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
		if (local46 < (float) this.aClass26_Sub2_10.anInt2903) {
			local46 = this.aClass26_Sub2_10.anInt2903;
		}
		if (local53 > (float) this.aClass26_Sub2_10.anInt2884) {
			local53 = this.aClass26_Sub2_10.anInt2884;
		}
		if (local59 < (float) this.aClass26_Sub2_10.anInt2905) {
			local59 = this.aClass26_Sub2_10.anInt2905;
		}
		if (local65 > (float) this.aClass26_Sub2_10.anInt2899) {
			local65 = this.aClass26_Sub2_10.anInt2899;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static202.anInt5041 = this.aClass26_Sub2_10.anInt2887;
		Static202.anInt5042 = (int) ((float) ((int) local59 * Static202.anInt5041) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static202.anInt5058 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5039 / local71);
		Static202.anInt5047 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5063 / local77);
		Static202.anInt5048 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5039 / local77);
		Static202.anInt5052 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5063 / local71);
		Static202.anInt5054 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static202.anInt5062 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static202.anInt5033 = (this.anInt5039 >> 1 << 12) + (Static202.anInt5062 * Static202.anInt5048 >> 4);
		Static202.anInt5059 = (this.anInt5063 >> 1 << 12) + (Static202.anInt5062 * Static202.anInt5052 >> 4);
		Static202.anInt5051 = Static202.anInt5054 * Static202.anInt5058 >> 4;
		Static202.anInt5055 = Static202.anInt5054 * Static202.anInt5047 >> 4;
		Static202.anInt5056 = (int) local46;
		Static202.anInt5038 = (int) local53;
		Static202.anInt5044 = (int) local59;
		Static202.anInt5046 = (int) local65;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	protected abstract void method4094(@OriginalArg(0) int arg0);
}

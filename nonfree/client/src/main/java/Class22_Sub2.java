import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public abstract class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	protected int anInt3179;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
	protected int anInt3184;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
	protected int anInt3186;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
	protected int anInt3203;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!fe;")
	protected final Class75_Sub1 aClass75_Sub1_6;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
	protected final int anInt3190;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
	protected final int anInt3200;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!fe;II)V")
	protected Class22_Sub2(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub1_6 = arg0;
		this.anInt3190 = arg1;
		this.anInt3200 = arg2;
	}

	@OriginalMember(owner = "client!ij", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass75_Sub1_6.method2036()) {
			throw new IllegalStateException();
		}
		this.method2549(arg0, arg1, arg2, arg3, arg4, arg5);
		Static173.anInt3178 = arg7;
		if (arg6 != 1) {
			Static173.anInt3198 = arg7 >>> 24;
			Static173.anInt3199 = 256 - Static173.anInt3198;
			if (arg6 == 0) {
				Static173.anInt3195 = arg7 >> 16 & 0xFF;
				Static173.anInt3191 = arg7 >> 8 & 0xFF;
				Static173.anInt3205 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static173.anInt3192 = arg7 >>> 24;
				Static173.anInt3201 = 256 - Static173.anInt3192;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static173.anInt3201 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static173.anInt3201 & 0xFF0000;
				Static173.anInt3202 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method2548(1);
		} else if (arg6 == 0) {
			this.method2548(0);
		} else if (arg6 == 3) {
			this.method2548(3);
		} else if (arg6 == 2) {
			this.method2548(2);
		}
	}

	@OriginalMember(owner = "client!ij", name = "JA", descriptor = "()I")
	@Override
	public final int JA() {
		return this.anInt3184 + this.anInt3200 + this.anInt3179;
	}

	@OriginalMember(owner = "client!ij", name = "ja", descriptor = "()I")
	@Override
	public final int ja() {
		return this.anInt3186 + this.anInt3190 + this.anInt3203;
	}

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ij", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)V")
	protected abstract void method2548(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ij", name = "ka", descriptor = "(IIII)V")
	@Override
	public final void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3186 = arg0;
		this.anInt3184 = arg1;
		this.anInt3203 = arg2;
		this.anInt3179 = arg3;
	}

	@OriginalMember(owner = "client!ij", name = "UA", descriptor = "()I")
	@Override
	public final int UA() {
		return this.anInt3190;
	}

	@OriginalMember(owner = "client!ij", name = "qa", descriptor = "()I")
	@Override
	public final int qa() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(FFFFFF)V")
	private void method2549(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt3186 + this.anInt3190 + this.anInt3203;
		@Pc(17) int local17 = this.anInt3184 + this.anInt3200 + this.anInt3179;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt3190 || local17 != this.anInt3200) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt3184;
			local65 = local53 * (float) this.anInt3184;
			local71 = local32 * (float) this.anInt3186;
			local77 = local39 * (float) this.anInt3186;
			@Pc(84) float local84 = -local32 * (float) this.anInt3203;
			@Pc(91) float local91 = -local39 * (float) this.anInt3203;
			@Pc(98) float local98 = -local46 * (float) this.anInt3179;
			@Pc(105) float local105 = -local53 * (float) this.anInt3179;
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
		if (local46 < (float) this.aClass75_Sub1_6.anInt2483) {
			local46 = this.aClass75_Sub1_6.anInt2483;
		}
		if (local53 > (float) this.aClass75_Sub1_6.anInt2467) {
			local53 = this.aClass75_Sub1_6.anInt2467;
		}
		if (local59 < (float) this.aClass75_Sub1_6.anInt2479) {
			local59 = this.aClass75_Sub1_6.anInt2479;
		}
		if (local65 > (float) this.aClass75_Sub1_6.anInt2475) {
			local65 = this.aClass75_Sub1_6.anInt2475;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static173.anInt3182 = this.aClass75_Sub1_6.anInt2482;
		Static173.anInt3188 = (int) ((float) ((int) local59 * Static173.anInt3182) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static173.anInt3193 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt3190 / local71);
		Static173.anInt3183 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt3200 / local77);
		Static173.anInt3189 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt3190 / local77);
		Static173.anInt3206 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt3200 / local71);
		Static173.anInt3196 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static173.anInt3197 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static173.anInt3181 = (this.anInt3190 >> 1 << 12) + (Static173.anInt3197 * Static173.anInt3189 >> 4);
		Static173.anInt3204 = (this.anInt3200 >> 1 << 12) + (Static173.anInt3197 * Static173.anInt3206 >> 4);
		Static173.anInt3207 = Static173.anInt3196 * Static173.anInt3193 >> 4;
		Static173.anInt3208 = Static173.anInt3196 * Static173.anInt3183 >> 4;
		Static173.anInt3185 = (int) local46;
		Static173.anInt3194 = (int) local53;
		Static173.anInt3187 = (int) local59;
		Static173.anInt3180 = (int) local65;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([I[III)V")
	protected abstract void method2550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public final void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass75_Sub1_6.method2036()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray239 == null) {
			this.anIntArray239 = new int[4];
		}
		this.aClass75_Sub1_6.u(this.anIntArray239);
		this.aClass75_Sub1_6.Z(this.aClass75_Sub1_6.anInt2483, this.aClass75_Sub1_6.anInt2479, arg0 + arg2, arg1 + arg3);
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
		this.aClass75_Sub1_6.pa(this.anIntArray239[0], this.anIntArray239[1], this.anIntArray239[2], this.anIntArray239[3]);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected final void method6073(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class32 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass75_Sub1_6.method2036()) {
			throw new IllegalStateException();
		}
		this.method2549(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class32_Sub1 local18 = (Class32_Sub1) arg6;
		this.method2550(local18.anIntArray72, local18.anIntArray73, Static173.anInt3185 - arg7, -arg8 - (Static173.anInt3180 - Static173.anInt3187));
	}
}

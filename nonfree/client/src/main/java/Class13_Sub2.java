import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public abstract class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	protected int anInt7209;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
	private int[] anIntArray639;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	protected int anInt7216;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
	protected int anInt7227;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
	protected int anInt7229;

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "Lclient!ms;")
	protected final Class163_Sub1 aClass163_Sub1_11;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	protected final int anInt7212;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	protected final int anInt7221;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ms;II)V")
	protected Class13_Sub2(@OriginalArg(0) Class163_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass163_Sub1_11 = arg0;
		this.anInt7212 = arg1;
		this.anInt7221 = arg2;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
	protected abstract void method5673(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "ZA", descriptor = "()I")
	@Override
	public final int ZA() {
		return this.anInt7221;
	}

	@OriginalMember(owner = "client!kl", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		return this.anInt7212;
	}

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "()I")
	@Override
	public final int Q() {
		return this.anInt7209 + this.anInt7221 + this.anInt7229;
	}

	@OriginalMember(owner = "client!kl", name = "ya", descriptor = "(IIIIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!kl", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass163_Sub1_11.method3441()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray639 == null) {
			this.anIntArray639 = new int[4];
		}
		this.aClass163_Sub1_11.MA(this.anIntArray639);
		this.aClass163_Sub1_11.HA(this.aClass163_Sub1_11.anInt4215, this.aClass163_Sub1_11.anInt4217, arg0 + arg2, arg1 + arg3);
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
		this.aClass163_Sub1_11.ba(this.anIntArray639[0], this.anIntArray639[1], this.anIntArray639[2], this.anIntArray639[3]);
	}

	@OriginalMember(owner = "client!kl", name = "RA", descriptor = "()I")
	@Override
	public final int RA() {
		return this.anInt7216 + this.anInt7212 + this.anInt7227;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([I[III)V")
	protected abstract void method5674(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kl", name = "ha", descriptor = "(IIII)V")
	@Override
	public final void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7216 = arg0;
		this.anInt7209 = arg1;
		this.anInt7227 = arg2;
		this.anInt7229 = arg3;
	}

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass163_Sub1_11.method3441()) {
			throw new IllegalStateException();
		}
		this.method5675(arg0, arg1, arg2, arg3, arg4, arg5);
		Static213.anInt7238 = arg7;
		if (arg6 != 1) {
			Static213.anInt7210 = arg7 >>> 24;
			Static213.anInt7237 = 256 - Static213.anInt7210;
			if (arg6 == 0) {
				Static213.anInt7226 = arg7 >> 16 & 0xFF;
				Static213.anInt7223 = arg7 >> 8 & 0xFF;
				Static213.anInt7231 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static213.anInt7228 = arg7 >>> 24;
				Static213.anInt7230 = 256 - Static213.anInt7228;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static213.anInt7230 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static213.anInt7230 & 0xFF0000;
				Static213.anInt7235 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5673(1);
		} else if (arg6 == 0) {
			this.method5673(0);
		} else if (arg6 == 3) {
			this.method5673(3);
		} else if (arg6 == 2) {
			this.method5673(2);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFF)V")
	private void method5675(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7216 + this.anInt7212 + this.anInt7227;
		@Pc(17) int local17 = this.anInt7209 + this.anInt7221 + this.anInt7229;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7212 || local17 != this.anInt7221) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7209;
			local65 = local53 * (float) this.anInt7209;
			local71 = local32 * (float) this.anInt7216;
			local77 = local39 * (float) this.anInt7216;
			@Pc(84) float local84 = -local32 * (float) this.anInt7227;
			@Pc(91) float local91 = -local39 * (float) this.anInt7227;
			@Pc(98) float local98 = -local46 * (float) this.anInt7229;
			@Pc(105) float local105 = -local53 * (float) this.anInt7229;
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
		if (local46 < (float) this.aClass163_Sub1_11.anInt4215) {
			local46 = this.aClass163_Sub1_11.anInt4215;
		}
		if (local53 > (float) this.aClass163_Sub1_11.anInt4213) {
			local53 = this.aClass163_Sub1_11.anInt4213;
		}
		if (local59 < (float) this.aClass163_Sub1_11.anInt4217) {
			local59 = this.aClass163_Sub1_11.anInt4217;
		}
		if (local65 > (float) this.aClass163_Sub1_11.anInt4220) {
			local65 = this.aClass163_Sub1_11.anInt4220;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static213.anInt7219 = this.aClass163_Sub1_11.anInt4224;
		Static213.anInt7217 = (int) ((float) ((int) local59 * Static213.anInt7219) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static213.anInt7236 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7212 / local71);
		Static213.anInt7239 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7221 / local77);
		Static213.anInt7211 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7212 / local77);
		Static213.anInt7224 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7221 / local71);
		Static213.anInt7218 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static213.anInt7222 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static213.anInt7215 = (this.anInt7212 >> 1 << 12) + (Static213.anInt7222 * Static213.anInt7211 >> 4);
		Static213.anInt7233 = (this.anInt7221 >> 1 << 12) + (Static213.anInt7222 * Static213.anInt7224 >> 4);
		Static213.anInt7220 = Static213.anInt7218 * Static213.anInt7236 >> 4;
		Static213.anInt7213 = Static213.anInt7218 * Static213.anInt7239 >> 4;
		Static213.anInt7232 = (int) local46;
		Static213.anInt7214 = (int) local53;
		Static213.anInt7234 = (int) local59;
		Static213.anInt7225 = (int) local65;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected final void method5663(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class35 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass163_Sub1_11.method3441()) {
			throw new IllegalStateException();
		}
		this.method5675(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class35_Sub1 local18 = (Class35_Sub1) arg6;
		this.method5674(local18.anIntArray89, local18.anIntArray88, Static213.anInt7232 - arg7, -arg8 - (Static213.anInt7225 - Static213.anInt7234));
	}

	@OriginalMember(owner = "client!kl", name = "W", descriptor = "(IIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILclient!ta;II)V")
	public abstract void method5666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}

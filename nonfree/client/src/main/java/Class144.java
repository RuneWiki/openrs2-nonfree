import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class144 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	private int anInt4270;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	private int anInt4271;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	private int anInt4274;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!kr;")
	private Class20 aClass20_10;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private int anInt4277;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "I")
	public int anInt4279;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	private final int anInt4273;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	private final int anInt4272;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	private final int anInt4276;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Z")
	private final boolean aBoolean357;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	private final int anInt4275;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	private final int anInt4269;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	private final int anInt4280;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	private final int anInt4278;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4273 = arg2;
		this.anInt4272 = arg3;
		this.anInt4276 = arg4;
		this.aBoolean357 = arg7;
		this.anInt4275 = arg1;
		this.anInt4269 = arg6;
		this.anInt4280 = arg5;
		this.anInt4278 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	public void method3540() {
		this.aClass20_10 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ha;Lclient!he;)V")
	private void method3541(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class144 arg1) {
		@Pc(6) Class379 local6 = Static614.method8359(this.anInt4275, Static617.aClass97_151);
		if (local6 == null) {
			return;
		}
		arg0.K(Static203.anIntArray291);
		arg0.KA(0, 0, this.anInt4271, this.anInt4271);
		arg0.aa(0, 0, this.anInt4271, this.anInt4271, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean357) {
				local32 = -arg1.anInt4273;
				local34 = -arg1.anInt4272;
				local36 = -arg1.anInt4276;
			} else {
				local32 = this.anInt4273 - arg1.anInt4273;
				local34 = this.anInt4272 - arg1.anInt4272;
				local36 = this.anInt4276 - arg1.anInt4276;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4274 != 0) {
			local81 = -this.anInt4274 & 0x3FFF;
			local85 = Class353.anIntArray681[local81];
			local89 = Class353.anIntArray682[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt4277 != 0) {
			local81 = -this.anInt4277 & 0x3FFF;
			local85 = Class353.anIntArray681[local81];
			local89 = Class353.anIntArray682[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class25 local172 = arg0.method7975(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7896(arg0.method7910());
		@Pc(218) Class6 local218 = arg0.method7892();
		local218.method6701(0, 0, arg0.i() - local172.HA());
		local172.method7725(local218, null, arg0.i(), 1);
		this.aClass20_10 = arg0.method7927(0, 0, this.anInt4271, this.anInt4271, true);
		this.aClass20_10.method4585(3);
		arg0.KA(Static203.anIntArray291[0], Static203.anIntArray291[1], Static203.anIntArray291[2], Static203.anIntArray291[3]);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method3542(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass20_10 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4274 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4277 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4270) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4270) / 2;
		if (local38 < arg4 && local38 + this.anInt4270 > 0 && local51 < arg3 && local51 + this.anInt4270 > 0) {
			this.aClass20_10.method4583(local51 + arg1, local38 + arg2, this.anInt4270, this.anInt4270);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!ha;Lclient!he;)Z")
	public boolean method3543(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class144 arg1) {
		return this.aClass20_10 != null || this.method3544(arg0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!ha;Lclient!he;)Z")
	private boolean method3544(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class144 arg1) {
		if (this.aClass20_10 == null) {
			if (this.anInt4278 == 0) {
				if (Static486.anInterface6_10.method6355(this.anInt4275)) {
					@Pc(23) int[] local23 = Static486.anInterface6_10.method6358(this.anInt4271, this.anInt4275, 0.7F, this.anInt4271);
					this.aClass20_10 = arg0.method7913(this.anInt4271, local23, this.anInt4271, this.anInt4271);
				}
			} else if (this.anInt4278 == 2) {
				this.method3541(arg0, arg1);
			} else if (this.anInt4278 == 1) {
				this.method3546(arg0, arg1);
			}
		}
		return this.aClass20_10 != null;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(Lclient!ha;Lclient!he;)V")
	private void method3546(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class144 arg1) {
		Static203.method3545(arg0);
		Static203.method3538(arg0);
		arg0.K(Static203.anIntArray291);
		arg0.KA(0, 0, this.anInt4271, this.anInt4271);
		arg0.ya();
		arg0.aa(0, 0, this.anInt4271, this.anInt4271, this.anInt4269 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean357) {
				local31 = -arg1.anInt4273;
				local33 = -arg1.anInt4272;
				local35 = -arg1.anInt4276;
			} else {
				local31 = arg1.anInt4273 - this.anInt4273;
				local33 = arg1.anInt4272 - this.anInt4272;
				local35 = arg1.anInt4276 - this.anInt4276;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4274 != 0) {
			local79 = Class353.anIntArray681[this.anInt4274];
			local84 = Class353.anIntArray682[this.anInt4274];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt4277 != 0) {
			local79 = Class353.anIntArray681[this.anInt4277];
			local84 = Class353.anIntArray682[this.anInt4277];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class25 local147 = Static203.aClass25_6.method7732((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt4275);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4271 * 1024 / (local147.RA() - local147.V());
		if (this.anInt4269 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt4271 / 2, this.anInt4271 / 2, local84, local84);
		arg0.method7896(arg0.method7910());
		@Pc(206) Class6 local206 = arg0.method7910();
		local206.method6701(0, 0, arg0.i() - local147.HA());
		local147.method7725(local206, null, 1024, 1);
		@Pc(228) int local228 = this.anInt4271 * 13 / 16;
		@Pc(235) int local235 = (this.anInt4271 - local228) / 2;
		Static203.aClass20_9.method4596(local235, local235, local228, local228, 0, this.anInt4269 | 0xFF000000, 1);
		this.aClass20_10 = arg0.method7927(0, 0, this.anInt4271, this.anInt4271, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt4271, this.anInt4271, 0, 0);
		Static203.aClass20_11.method4596(0, 0, this.anInt4271, this.anInt4271, 1, 0, 0);
		this.aClass20_10.method4585(0);
		arg0.KA(Static203.anIntArray291[0], Static203.anIntArray291[1], Static203.anIntArray291[2], Static203.anIntArray291[3]);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z")
	public boolean method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean357) {
			this.anInt4279 = 1073741823;
			local7 = this.anInt4273;
			local12 = this.anInt4272;
			local17 = this.anInt4276;
		} else {
			local7 = this.anInt4273 - arg0;
			local12 = this.anInt4272 - arg1;
			local17 = this.anInt4276 - arg2;
			this.anInt4279 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4279 == 0) {
				this.anInt4279 = 1;
			}
			local7 = (local7 << 8) / this.anInt4279;
			local12 = (local12 << 8) / this.anInt4279;
			local17 = (local17 << 8) / this.anInt4279;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4270 = this.anInt4280 * arg3 / (this.aBoolean357 ? 1024 : this.anInt4279);
		} else {
			this.anInt4270 = 0;
		}
		if (this.anInt4270 < 8) {
			this.aClass20_10 = null;
			return false;
		}
		@Pc(143) int local143 = Static347.method5404(this.anInt4270);
		if (local143 > arg3) {
			local143 = Static291.method4549(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4271) {
			this.anInt4271 = local143;
		}
		this.anInt4274 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4277 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass20_10 = null;
		return true;
	}
}

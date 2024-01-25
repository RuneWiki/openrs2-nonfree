import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class164 {

	@OriginalMember(owner = "client!ija", name = "e", descriptor = "I")
	private int anInt4432;

	@OriginalMember(owner = "client!ija", name = "h", descriptor = "I")
	private int anInt4435;

	@OriginalMember(owner = "client!ija", name = "i", descriptor = "I")
	private int anInt4436;

	@OriginalMember(owner = "client!ija", name = "l", descriptor = "Lclient!jd;")
	private Class20 aClass20_7;

	@OriginalMember(owner = "client!ija", name = "m", descriptor = "I")
	private int anInt4438;

	@OriginalMember(owner = "client!ija", name = "n", descriptor = "I")
	public int anInt4439;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "I")
	private final int anInt4428;

	@OriginalMember(owner = "client!ija", name = "f", descriptor = "I")
	private final int anInt4433;

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "I")
	private final int anInt4429;

	@OriginalMember(owner = "client!ija", name = "k", descriptor = "Z")
	private final boolean aBoolean306;

	@OriginalMember(owner = "client!ija", name = "g", descriptor = "I")
	private final int anInt4434;

	@OriginalMember(owner = "client!ija", name = "c", descriptor = "I")
	private final int anInt4430;

	@OriginalMember(owner = "client!ija", name = "d", descriptor = "I")
	private final int anInt4431;

	@OriginalMember(owner = "client!ija", name = "j", descriptor = "I")
	private final int anInt4437;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4428 = arg2;
		this.anInt4433 = arg3;
		this.anInt4429 = arg4;
		this.aBoolean306 = arg7;
		this.anInt4434 = arg1;
		this.anInt4430 = arg6;
		this.anInt4431 = arg5;
		this.anInt4437 = arg0;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lclient!ha;Lclient!ija;)Z")
	private boolean method3662(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class164 arg1) {
		if (this.aClass20_7 == null) {
			if (this.anInt4437 == 0) {
				if (Static132.anInterface3_1.method6181(this.anInt4434)) {
					@Pc(23) int[] local23 = Static132.anInterface3_1.method6176(this.anInt4434, this.anInt4432, this.anInt4432, 0.7F);
					this.aClass20_7 = arg0.method7885(this.anInt4432, this.anInt4432, local23, this.anInt4432);
				}
			} else if (this.anInt4437 == 2) {
				this.method3667(arg0, arg1);
			} else if (this.anInt4437 == 1) {
				this.method3669(arg0, arg1);
			}
		}
		return this.aClass20_7 != null;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "()V")
	public void method3664() {
		this.aClass20_7 = null;
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(Lclient!ha;Lclient!ija;)Z")
	public boolean method3665(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class164 arg1) {
		return this.aClass20_7 != null || this.method3662(arg0, arg1);
	}

	@OriginalMember(owner = "client!ija", name = "c", descriptor = "(Lclient!ha;Lclient!ija;)V")
	private void method3667(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class164 arg1) {
		@Pc(6) Class67 local6 = Static40.method1465(Static391.aClass386_89, this.anInt4434);
		if (local6 == null) {
			return;
		}
		arg0.K(Static249.anIntArray346);
		arg0.KA(0, 0, this.anInt4432, this.anInt4432);
		arg0.aa(0, 0, this.anInt4432, this.anInt4432, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean306) {
				local32 = -arg1.anInt4428;
				local34 = -arg1.anInt4433;
				local36 = -arg1.anInt4429;
			} else {
				local32 = this.anInt4428 - arg1.anInt4428;
				local34 = this.anInt4433 - arg1.anInt4433;
				local36 = this.anInt4429 - arg1.anInt4429;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4435 != 0) {
			local81 = -this.anInt4435 & 0x3FFF;
			local85 = Class32.anIntArray76[local81];
			local89 = Class32.anIntArray77[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt4436 != 0) {
			local81 = -this.anInt4436 & 0x3FFF;
			local85 = Class32.anIntArray76[local81];
			local89 = Class32.anIntArray77[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class80 local172 = arg0.method7901(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7950(arg0.method7918());
		@Pc(218) Class26 local218 = arg0.method7923();
		local218.method6457(0, 0, arg0.i() - local172.HA());
		local172.method6375(local218, (Class12_Sub1) null, arg0.i(), 1);
		this.aClass20_7 = arg0.method7900(0, 0, this.anInt4432, this.anInt4432, true);
		this.aClass20_7.method7410(3);
		arg0.KA(Static249.anIntArray346[0], Static249.anIntArray346[1], Static249.anIntArray346[2], Static249.anIntArray346[3]);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method3668(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass20_7 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4435 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4436 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4438) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4438) / 2;
		if (local38 < arg4 && local38 + this.anInt4438 > 0 && local51 < arg3 && local51 + this.anInt4438 > 0) {
			this.aClass20_7.method7405(local51 + arg1, local38 + arg2, this.anInt4438, this.anInt4438);
		}
	}

	@OriginalMember(owner = "client!ija", name = "d", descriptor = "(Lclient!ha;Lclient!ija;)V")
	private void method3669(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class164 arg1) {
		Static249.method3671(arg0);
		Static249.method3663(arg0);
		arg0.K(Static249.anIntArray346);
		arg0.KA(0, 0, this.anInt4432, this.anInt4432);
		arg0.ya();
		arg0.aa(0, 0, this.anInt4432, this.anInt4432, this.anInt4430 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean306) {
				local31 = -arg1.anInt4428;
				local33 = -arg1.anInt4433;
				local35 = -arg1.anInt4429;
			} else {
				local31 = arg1.anInt4428 - this.anInt4428;
				local33 = arg1.anInt4433 - this.anInt4433;
				local35 = arg1.anInt4429 - this.anInt4429;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4435 != 0) {
			local79 = Class32.anIntArray76[this.anInt4435];
			local84 = Class32.anIntArray77[this.anInt4435];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt4436 != 0) {
			local79 = Class32.anIntArray76[this.anInt4436];
			local84 = Class32.anIntArray77[this.anInt4436];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class80 local147 = Static249.aClass80_5.method6378((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt4434);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4432 * 1024 / (local147.RA() - local147.V());
		if (this.anInt4430 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt4432 / 2, this.anInt4432 / 2, local84, local84);
		arg0.method7950(arg0.method7918());
		@Pc(206) Class26 local206 = arg0.method7918();
		local206.method6457(0, 0, arg0.i() - local147.HA());
		local147.method6375(local206, (Class12_Sub1) null, 1024, 1);
		@Pc(228) int local228 = this.anInt4432 * 13 / 16;
		@Pc(235) int local235 = (this.anInt4432 - local228) / 2;
		Static249.aClass20_9.method7398(local235, local235, local228, local228, 0, this.anInt4430 | 0xFF000000, 1);
		this.aClass20_7 = arg0.method7900(0, 0, this.anInt4432, this.anInt4432, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt4432, this.anInt4432, 0, 0);
		Static249.aClass20_8.method7398(0, 0, this.anInt4432, this.anInt4432, 1, 0, 0);
		this.aClass20_7.method7410(0);
		arg0.KA(Static249.anIntArray346[0], Static249.anIntArray346[1], Static249.anIntArray346[2], Static249.anIntArray346[3]);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IIII)Z")
	public boolean method3670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean306) {
			this.anInt4439 = 1073741823;
			local7 = this.anInt4428;
			local12 = this.anInt4433;
			local17 = this.anInt4429;
		} else {
			local7 = this.anInt4428 - arg0;
			local12 = this.anInt4433 - arg1;
			local17 = this.anInt4429 - arg2;
			this.anInt4439 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4439 == 0) {
				this.anInt4439 = 1;
			}
			local7 = (local7 << 8) / this.anInt4439;
			local12 = (local12 << 8) / this.anInt4439;
			local17 = (local17 << 8) / this.anInt4439;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4438 = this.anInt4431 * arg3 / (this.aBoolean306 ? 1024 : this.anInt4439);
		} else {
			this.anInt4438 = 0;
		}
		if (this.anInt4438 < 8) {
			this.aClass20_7 = null;
			return false;
		}
		@Pc(143) int local143 = Static330.method5181(this.anInt4438);
		if (local143 > arg3) {
			local143 = Static133.method2141(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4432) {
			this.anInt4432 = local143;
		}
		this.anInt4435 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4436 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass20_7 = null;
		return true;
	}
}

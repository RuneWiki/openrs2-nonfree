import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class282 {

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!pga;")
	private Class32 aClass32_34;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public int anInt8344;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt8345;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt8346;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	private int anInt8347;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	private int anInt8351;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	private final int anInt8352;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	private final int anInt8348;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private final int anInt8350;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private final boolean aBoolean563;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private final int anInt8342;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private final int anInt8349;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private final int anInt8341;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	private final int anInt8343;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt8352 = arg2;
		this.anInt8348 = arg3;
		this.anInt8350 = arg4;
		this.aBoolean563 = arg7;
		this.anInt8342 = arg1;
		this.anInt8349 = arg6;
		this.anInt8341 = arg5;
		this.anInt8343 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)Z")
	public boolean method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean563) {
			this.anInt8344 = 1073741823;
			local7 = this.anInt8352;
			local12 = this.anInt8348;
			local17 = this.anInt8350;
		} else {
			local7 = this.anInt8352 - arg0;
			local12 = this.anInt8348 - arg1;
			local17 = this.anInt8350 - arg2;
			this.anInt8344 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt8344 == 0) {
				this.anInt8344 = 1;
			}
			local7 = (local7 << 8) / this.anInt8344;
			local12 = (local12 << 8) / this.anInt8344;
			local17 = (local17 << 8) / this.anInt8344;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt8351 = this.anInt8341 * arg3 / (this.aBoolean563 ? 1024 : this.anInt8344);
		} else {
			this.anInt8351 = 0;
		}
		if (this.anInt8351 < 8) {
			this.aClass32_34 = null;
			return false;
		}
		@Pc(143) int local143 = Static567.method8129(this.anInt8351);
		if (local143 > arg3) {
			local143 = Static600.method8449(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt8346) {
			this.anInt8346 = local143;
		}
		this.anInt8345 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt8347 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass32_34 = null;
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ha;Lclient!rc;)V")
	private void method7204(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class282 arg1) {
		@Pc(6) Class64 local6 = Static84.method1447(Static285.aClass353_43, this.anInt8342);
		if (local6 == null) {
			return;
		}
		arg0.K(Static481.anIntArray524);
		arg0.KA(0, 0, this.anInt8346, this.anInt8346);
		arg0.aa(0, 0, this.anInt8346, this.anInt8346, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean563) {
				local32 = -arg1.anInt8352;
				local34 = -arg1.anInt8348;
				local36 = -arg1.anInt8350;
			} else {
				local32 = this.anInt8352 - arg1.anInt8352;
				local34 = this.anInt8348 - arg1.anInt8348;
				local36 = this.anInt8350 - arg1.anInt8350;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt8345 != 0) {
			local81 = -this.anInt8345 & 0x3FFF;
			local85 = Class100_Sub1.anIntArray428[local81];
			local89 = Class100_Sub1.anIntArray429[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt8347 != 0) {
			local81 = -this.anInt8347 & 0x3FFF;
			local85 = Class100_Sub1.anIntArray428[local81];
			local89 = Class100_Sub1.anIntArray429[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class24 local172 = arg0.method8770(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8850(arg0.method8838());
		@Pc(218) Class154 local218 = arg0.method8785();
		local218.method6559(0, 0, arg0.i() - local172.HA());
		local172.method6845(local218, (Class20_Sub4) null, arg0.i(), 1);
		this.aClass32_34 = arg0.method8804(0, 0, this.anInt8346, this.anInt8346, true);
		this.aClass32_34.method5086(3);
		arg0.KA(Static481.anIntArray524[0], Static481.anIntArray524[1], Static481.anIntArray524[2], Static481.anIntArray524[3]);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lclient!ha;Lclient!rc;)V")
	private void method7205(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class282 arg1) {
		Static481.method7207(arg0);
		Static481.method7202(arg0);
		arg0.K(Static481.anIntArray524);
		arg0.KA(0, 0, this.anInt8346, this.anInt8346);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8346, this.anInt8346, this.anInt8349 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean563) {
				local31 = -arg1.anInt8352;
				local33 = -arg1.anInt8348;
				local35 = -arg1.anInt8350;
			} else {
				local31 = arg1.anInt8352 - this.anInt8352;
				local33 = arg1.anInt8348 - this.anInt8348;
				local35 = arg1.anInt8350 - this.anInt8350;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt8345 != 0) {
			local79 = Class100_Sub1.anIntArray428[this.anInt8345];
			local84 = Class100_Sub1.anIntArray429[this.anInt8345];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt8347 != 0) {
			local79 = Class100_Sub1.anIntArray428[this.anInt8347];
			local84 = Class100_Sub1.anIntArray429[this.anInt8347];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class24 local147 = Static481.aClass24_5.method6850((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt8342);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt8346 * 1024 / (local147.RA() - local147.V());
		if (this.anInt8349 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt8346 / 2, this.anInt8346 / 2, local84, local84);
		arg0.method8850(arg0.method8838());
		@Pc(206) Class154 local206 = arg0.method8838();
		local206.method6559(0, 0, arg0.i() - local147.HA());
		local147.method6845(local206, (Class20_Sub4) null, 1024, 1);
		@Pc(228) int local228 = this.anInt8346 * 13 / 16;
		@Pc(235) int local235 = (this.anInt8346 - local228) / 2;
		Static481.aClass32_35.method5076(local235, local235, local228, local228, 0, this.anInt8349 | 0xFF000000, 1);
		this.aClass32_34 = arg0.method8804(0, 0, this.anInt8346, this.anInt8346, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8346, this.anInt8346, 0, 0);
		Static481.aClass32_33.method5076(0, 0, this.anInt8346, this.anInt8346, 1, 0, 0);
		this.aClass32_34.method5086(0);
		arg0.KA(Static481.anIntArray524[0], Static481.anIntArray524[1], Static481.anIntArray524[2], Static481.anIntArray524[3]);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method7206(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass32_34 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt8345 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt8347 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt8351) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt8351) / 2;
		if (local38 < arg4 && local38 + this.anInt8351 > 0 && local51 < arg3 && local51 + this.anInt8351 > 0) {
			this.aClass32_34.method5090(local51 + arg1, local38 + arg2, this.anInt8351, this.anInt8351);
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lclient!ha;Lclient!rc;)Z")
	public boolean method7209(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class282 arg1) {
		return this.aClass32_34 != null || this.method7210(arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(Lclient!ha;Lclient!rc;)Z")
	private boolean method7210(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class282 arg1) {
		if (this.aClass32_34 == null) {
			if (this.anInt8343 == 0) {
				if (Static199.anInterface4_6.method892(this.anInt8342)) {
					@Pc(23) int[] local23 = Static199.anInterface4_6.method897(this.anInt8342, 0.7F, this.anInt8346, this.anInt8346);
					this.aClass32_34 = arg0.method8847(this.anInt8346, this.anInt8346, local23, this.anInt8346);
				}
			} else if (this.anInt8343 == 2) {
				this.method7204(arg0, arg1);
			} else if (this.anInt8343 == 1) {
				this.method7205(arg0, arg1);
			}
		}
		return this.aClass32_34 != null;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "()V")
	public void method7211() {
		this.aClass32_34 = null;
	}
}

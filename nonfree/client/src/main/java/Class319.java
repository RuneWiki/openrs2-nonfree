import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class319 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
	private int anInt9365;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	public int anInt9366;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
	private int anInt9372;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
	private int anInt9373;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "Lclient!ha;")
	private Class35 aClass35_30;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
	private int anInt9375;

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
	private final int anInt9371;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	private final int anInt9374;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
	private final int anInt9364;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Z")
	private final boolean aBoolean677;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
	private final int anInt9369;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	private final int anInt9367;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
	private final int anInt9368;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
	private final int anInt9370;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt9371 = arg2;
		this.anInt9374 = arg3;
		this.anInt9364 = arg4;
		this.aBoolean677 = arg7;
		this.anInt9369 = arg1;
		this.anInt9367 = arg6;
		this.anInt9368 = arg5;
		this.anInt9370 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!qa;Lclient!wt;)V")
	private void method7786(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class319 arg1) {
		@Pc(6) Class29 local6 = Static342.method5377(this.anInt9369, Static530.aClass53_149);
		if (local6 == null) {
			return;
		}
		arg0.d(Static544.anIntArray766);
		arg0.N(0, 0, this.anInt9375, this.anInt9375);
		arg0.f(0, 0, this.anInt9375, this.anInt9375, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean677) {
				local32 = -arg1.anInt9371;
				local34 = -arg1.anInt9374;
				local36 = -arg1.anInt9364;
			} else {
				local32 = this.anInt9371 - arg1.anInt9371;
				local34 = this.anInt9374 - arg1.anInt9374;
				local36 = this.anInt9364 - arg1.anInt9364;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt9373 != 0) {
			local81 = -this.anInt9373 & 0x3FFF;
			local85 = Class125.anIntArray381[local81];
			local89 = Class125.anIntArray382[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt9365 != 0) {
			local81 = -this.anInt9365 & 0x3FFF;
			local85 = Class125.anIntArray381[local81];
			local89 = Class125.anIntArray382[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class63 local172 = arg0.method6011(local6, 2048, 0, 64, 768);
		local85 = local172.va() - local172.wa();
		local89 = local172.n() - local172.TA();
		local99 = local172.wa() + local85 / 2;
		@Pc(198) int local198 = local172.TA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method6015(arg0.method6035());
		@Pc(218) Class181 local218 = arg0.method6022();
		local218.oa(0, 0, arg0.c() - local172.Q());
		local172.method7703(local218, null, arg0.c());
		this.aClass35_30 = arg0.method6072(0, 0, this.anInt9375, this.anInt9375, true);
		this.aClass35_30.BA(0, 0, 3);
		arg0.N(Static544.anIntArray766[0], Static544.anIntArray766[1], Static544.anIntArray766[2], Static544.anIntArray766[3]);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(Lclient!qa;Lclient!wt;)Z")
	public boolean method7787(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class319 arg1) {
		return this.aClass35_30 != null || this.method7793(arg0, arg1);
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(Lclient!qa;Lclient!wt;)V")
	private void method7790(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class319 arg1) {
		Static544.method7788(arg0);
		Static544.method7792(arg0);
		arg0.d(Static544.anIntArray766);
		arg0.N(0, 0, this.anInt9375, this.anInt9375);
		arg0.method6056();
		arg0.f(0, 0, this.anInt9375, this.anInt9375, this.anInt9367 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean677) {
				local31 = -arg1.anInt9371;
				local33 = -arg1.anInt9374;
				local35 = -arg1.anInt9364;
			} else {
				local31 = arg1.anInt9371 - this.anInt9371;
				local33 = arg1.anInt9374 - this.anInt9374;
				local35 = arg1.anInt9364 - this.anInt9364;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt9373 != 0) {
			local79 = Class125.anIntArray381[this.anInt9373];
			local84 = Class125.anIntArray382[this.anInt9373];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt9365 != 0) {
			local79 = Class125.anIntArray381[this.anInt9365];
			local84 = Class125.anIntArray382[this.anInt9365];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class63 local147 = Static544.aClass63_7.method7706((byte) 0, 51200, true);
		if (arg0.method6024()) {
			local147.L((short) 0, (short) this.anInt9369);
		} else {
			local147.pa((short) 127, Static436.anInterface12_16.method2573(this.anInt9369).aShort118);
			local147.L((short) 0, (short) -1);
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt9375 * 1024 / (local147.va() - local147.wa());
		if (this.anInt9367 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt9375 / 2, this.anInt9375 / 2, local84, local84);
		arg0.method6015(arg0.method6035());
		@Pc(223) Class181 local223 = arg0.method6035();
		local223.oa(0, 0, arg0.c() - local147.Q());
		local147.method7703(local223, null, 1024);
		@Pc(245) int local245 = this.anInt9375 * 13 / 16;
		@Pc(252) int local252 = (this.anInt9375 - local245) / 2;
		Static544.aClass35_29.ra(local252, local252, local245, local245, 0, this.anInt9367 | 0xFF000000, 1);
		this.aClass35_30 = arg0.method6072(0, 0, this.anInt9375, this.anInt9375, true);
		arg0.method6056();
		arg0.f(0, 0, this.anInt9375, this.anInt9375, 0, 0);
		Static544.aClass35_31.ra(0, 0, this.anInt9375, this.anInt9375, 1, 0, 0);
		this.aClass35_30.BA(0, 0, 0);
		arg0.N(Static544.anIntArray766[0], Static544.anIntArray766[1], Static544.anIntArray766[2], Static544.anIntArray766[3]);
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "()V")
	public void method7791() {
		this.aClass35_30 = null;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(Lclient!qa;Lclient!wt;)Z")
	private boolean method7793(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class319 arg1) {
		if (this.aClass35_30 == null) {
			if (this.anInt9370 == 0) {
				if (Static436.anInterface12_16.method2572(this.anInt9369)) {
					@Pc(23) int[] local23 = Static436.anInterface12_16.method2574(0.7F, this.anInt9375, this.anInt9369, this.anInt9375);
					this.aClass35_30 = arg0.method6049(local23, this.anInt9375, this.anInt9375, this.anInt9375);
				}
			} else if (this.anInt9370 == 2) {
				this.method7786(arg0, arg1);
			} else if (this.anInt9370 == 1) {
				this.method7790(arg0, arg1);
			}
		}
		return this.aClass35_30 != null;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIII)Z")
	public boolean method7794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean677) {
			this.anInt9366 = 1073741823;
			local7 = this.anInt9371;
			local12 = this.anInt9374;
			local17 = this.anInt9364;
		} else {
			local7 = this.anInt9371 - arg0;
			local12 = this.anInt9374 - arg1;
			local17 = this.anInt9364 - arg2;
			this.anInt9366 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt9366 == 0) {
				this.anInt9366 = 1;
			}
			local7 = (local7 << 8) / this.anInt9366;
			local12 = (local12 << 8) / this.anInt9366;
			local17 = (local17 << 8) / this.anInt9366;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt9372 = this.anInt9368 * arg3 / (this.aBoolean677 ? 1024 : this.anInt9366);
		} else {
			this.anInt9372 = 0;
		}
		if (this.anInt9372 < 8) {
			this.aClass35_30 = null;
			return false;
		}
		@Pc(143) int local143 = Static131.method2413(this.anInt9372);
		if (local143 > arg3) {
			local143 = Static266.method4292(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt9375) {
			this.anInt9375 = local143;
		}
		this.anInt9373 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt9365 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass35_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method7795(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass35_30 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt9373 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt9365 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt9372) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt9372) / 2;
		if (local38 < arg4 && local38 + this.anInt9372 > 0 && local51 < arg3 && local51 + this.anInt9372 > 0) {
			this.aClass35_30.method7347(local51 + arg1, local38 + arg2, this.anInt9372, this.anInt9372);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class80 {

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	private int anInt2367;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	private int anInt2368;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	private int anInt2373;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
	private int anInt2374;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
	public int anInt2376;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "Lclient!iea;")
	private Class31 aClass31_5;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	private final int anInt2372;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	private final int anInt2371;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	private final int anInt2375;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Z")
	private final boolean aBoolean190;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	private final int anInt2369;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	private final int anInt2366;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	private final int anInt2370;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	private final int anInt2377;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2372 = arg2;
		this.anInt2371 = arg3;
		this.anInt2375 = arg4;
		this.aBoolean190 = arg7;
		this.anInt2369 = arg1;
		this.anInt2366 = arg6;
		this.anInt2370 = arg5;
		this.anInt2377 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
	public void method1986() {
		this.aClass31_5 = null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ha;Lclient!dn;)Z")
	private boolean method1987(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class80 arg1) {
		if (this.aClass31_5 == null) {
			if (this.anInt2377 == 0) {
				if (Static65.anInterface2_6.method6026(this.anInt2369)) {
					@Pc(23) int[] local23 = Static65.anInterface2_6.method6023(this.anInt2368, 0.7F, this.anInt2369, this.anInt2368);
					this.aClass31_5 = arg0.method8088(this.anInt2368, this.anInt2368, local23, this.anInt2368);
				}
			} else if (this.anInt2377 == 2) {
				this.method1989(arg0, arg1);
			} else if (this.anInt2377 == 1) {
				this.method1988(arg0, arg1);
			}
		}
		return this.aClass31_5 != null;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lclient!ha;Lclient!dn;)V")
	private void method1988(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class80 arg1) {
		Static109.method1995(arg0);
		Static109.method1993(arg0);
		arg0.K(Static109.anIntArray177);
		arg0.KA(0, 0, this.anInt2368, this.anInt2368);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2368, this.anInt2368, this.anInt2366 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean190) {
				local31 = -arg1.anInt2372;
				local33 = -arg1.anInt2371;
				local35 = -arg1.anInt2375;
			} else {
				local31 = arg1.anInt2372 - this.anInt2372;
				local33 = arg1.anInt2371 - this.anInt2371;
				local35 = arg1.anInt2375 - this.anInt2375;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2367 != 0) {
			local79 = Class290.anIntArray546[this.anInt2367];
			local84 = Class290.anIntArray547[this.anInt2367];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt2373 != 0) {
			local79 = Class290.anIntArray546[this.anInt2373];
			local84 = Class290.anIntArray547[this.anInt2373];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class193 local147 = Static109.aClass193_2.method6609((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt2369);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2368 * 1024 / (local147.RA() - local147.V());
		if (this.anInt2366 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt2368 / 2, this.anInt2368 / 2, local84, local84);
		arg0.method8138(arg0.method8137());
		@Pc(206) Class51 local206 = arg0.method8137();
		local206.method6705(0, 0, arg0.i() - local147.HA());
		local147.method6622(local206, (Class16_Sub10) null, 1024, 1);
		@Pc(228) int local228 = this.anInt2368 * 13 / 16;
		@Pc(235) int local235 = (this.anInt2368 - local228) / 2;
		Static109.aClass31_3.method8797(local235, local235, local228, local228, 0, this.anInt2366 | 0xFF000000, 1);
		this.aClass31_5 = arg0.method8153(0, 0, this.anInt2368, this.anInt2368, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2368, this.anInt2368, 0, 0);
		Static109.aClass31_4.method8797(0, 0, this.anInt2368, this.anInt2368, 1, 0, 0);
		this.aClass31_5.method8794(0);
		arg0.KA(Static109.anIntArray177[0], Static109.anIntArray177[1], Static109.anIntArray177[2], Static109.anIntArray177[3]);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(Lclient!ha;Lclient!dn;)V")
	private void method1989(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class80 arg1) {
		@Pc(6) Class212 local6 = Static532.method7368(Static134.aClass238_269, this.anInt2369);
		if (local6 == null) {
			return;
		}
		arg0.K(Static109.anIntArray177);
		arg0.KA(0, 0, this.anInt2368, this.anInt2368);
		arg0.aa(0, 0, this.anInt2368, this.anInt2368, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean190) {
				local32 = -arg1.anInt2372;
				local34 = -arg1.anInt2371;
				local36 = -arg1.anInt2375;
			} else {
				local32 = this.anInt2372 - arg1.anInt2372;
				local34 = this.anInt2371 - arg1.anInt2371;
				local36 = this.anInt2375 - arg1.anInt2375;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2367 != 0) {
			local81 = -this.anInt2367 & 0x3FFF;
			local85 = Class290.anIntArray546[local81];
			local89 = Class290.anIntArray547[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt2373 != 0) {
			local81 = -this.anInt2373 & 0x3FFF;
			local85 = Class290.anIntArray546[local81];
			local89 = Class290.anIntArray547[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class193 local172 = arg0.method8161(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8138(arg0.method8137());
		@Pc(218) Class51 local218 = arg0.method8154();
		local218.method6705(0, 0, arg0.i() - local172.HA());
		local172.method6622(local218, (Class16_Sub10) null, arg0.i(), 1);
		this.aClass31_5 = arg0.method8153(0, 0, this.anInt2368, this.anInt2368, true);
		this.aClass31_5.method8794(3);
		arg0.KA(Static109.anIntArray177[0], Static109.anIntArray177[1], Static109.anIntArray177[2], Static109.anIntArray177[3]);
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(Lclient!ha;Lclient!dn;)Z")
	public boolean method1990(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class80 arg1) {
		return this.aClass31_5 != null || this.method1987(arg0, arg1);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method1992(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass31_5 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2367 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2373 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2374) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2374) / 2;
		if (local38 < arg4 && local38 + this.anInt2374 > 0 && local51 < arg3 && local51 + this.anInt2374 > 0) {
			this.aClass31_5.method8795(local51 + arg1, local38 + arg2, this.anInt2374, this.anInt2374);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)Z")
	public boolean method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean190) {
			this.anInt2376 = 1073741823;
			local7 = this.anInt2372;
			local12 = this.anInt2371;
			local17 = this.anInt2375;
		} else {
			local7 = this.anInt2372 - arg0;
			local12 = this.anInt2371 - arg1;
			local17 = this.anInt2375 - arg2;
			this.anInt2376 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2376 == 0) {
				this.anInt2376 = 1;
			}
			local7 = (local7 << 8) / this.anInt2376;
			local12 = (local12 << 8) / this.anInt2376;
			local17 = (local17 << 8) / this.anInt2376;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2374 = this.anInt2370 * arg3 / (this.aBoolean190 ? 1024 : this.anInt2376);
		} else {
			this.anInt2374 = 0;
		}
		if (this.anInt2374 < 8) {
			this.aClass31_5 = null;
			return false;
		}
		@Pc(143) int local143 = Static613.method8565(this.anInt2374);
		if (local143 > arg3) {
			local143 = Static276.method7580(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2368) {
			this.anInt2368 = local143;
		}
		this.anInt2367 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt2373 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass31_5 = null;
		return true;
	}
}

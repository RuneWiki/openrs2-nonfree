import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "[I")
	public static int[] anIntArray644;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_149 = new Class85("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
	public static final int[] anIntArray643 = new int[256];

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_150 = new Class85("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
	public static void method6037() {
		while (true) {
			@Pc(6) Class5_Sub19 local6 = (Class5_Sub19) Static32.aClass103_18.method2743();
			if (local6 == null) {
				return;
			}
			if (Static178.aClass174ArrayArrayArray3 != null) {
				@Pc(22) Class4_Sub5_Sub2 local22;
				@Pc(18) int local18;
				if (local6.anInt2005 >= 0) {
					local18 = local6.anInt2005 - 1;
					local22 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local18];
				} else {
					local18 = -local6.anInt2005 - 1;
					if (local18 == Static166.anInt3304) {
						local22 = Static192.aClass4_Sub5_Sub2_Sub1_2;
					} else {
						local22 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local18];
					}
				}
				if (local22 != null) {
					@Pc(52) Class156 local52 = Static111.method1967(local6.anInt1998);
					@Pc(68) int local68;
					@Pc(65) int local65;
					if (local6.anInt2001 == 1 || local6.anInt2001 == 3) {
						local68 = local52.anInt4769;
						local65 = local52.anInt4775;
					} else {
						local65 = local52.anInt4769;
						local68 = local52.anInt4775;
					}
					@Pc(83) int local83 = (local68 >> 1) + local6.anInt1993;
					@Pc(92) int local92 = (local68 + 1 >> 1) + local6.anInt1993;
					@Pc(99) int local99 = (local65 >> 1) + local6.anInt2003;
					@Pc(108) int local108 = (local65 + 1 >> 1) + local6.anInt2003;
					@Pc(113) Class51 local113 = Static8.aClass51Array1[local22.aByte75];
					@Pc(138) int local138 = local113.method1856(local83, local99) + local113.method1856(local92, local99) + local113.method1856(local83, local108) + local113.method1856(local92, local108) >> 2;
					@Pc(140) Interface5 local140 = null;
					@Pc(145) int local145 = Static34.anIntArray71[local6.anInt2000];
					if (local145 == 0) {
						local140 = (Interface5) Static330.method5730(local22.aByte75, local6.anInt1993, local6.anInt2003);
					} else if (local145 == 1) {
						local140 = (Interface5) Static241.method4296(local22.aByte75, local6.anInt1993, local6.anInt2003);
					} else if (local145 == 2) {
						local140 = (Interface5) Static259.method4533(local22.aByte75, local6.anInt1993, local6.anInt2003, iq.class);
					} else if (local145 == 3) {
						local140 = (Interface5) Static101.method1810(local22.aByte75, local6.anInt1993, local6.anInt2003);
					}
					if (local140 != null) {
						Static131.method2331(local6.anInt2003, local145, local22.aByte75, local6.anInt1993, local6.anInt1989, local6.anInt1991 + 1, 0, -1, 0);
						local22.anInterface5_3 = local140;
						local22.anInt5424 = local138;
						local22.anInt5420 = Static283.anInt5563 + local6.anInt1989;
						local22.anInt5418 = local6.anInt1993 * 128 + local68 * 64;
						local22.anInt5425 = Static283.anInt5563 + local6.anInt1991;
						local22.anInt5415 = local65 * 64 + local6.anInt2003 * 128;
						@Pc(269) int local269 = local6.anInt1992;
						@Pc(272) int local272 = local6.anInt1995;
						@Pc(275) int local275 = local6.anInt1999;
						@Pc(278) int local278 = local6.anInt1990;
						@Pc(283) int local283;
						if (local272 < local269) {
							local283 = local269;
							local269 = local272;
							local272 = local283;
						}
						local22.anInt5414 = local269 + local6.anInt1993;
						local22.anInt5423 = local6.anInt1993 + local272;
						if (local275 > local278) {
							local283 = local275;
							local275 = local278;
							local278 = local283;
						}
						local22.anInt5422 = local6.anInt2003 + local278;
						local22.anInt5421 = local6.anInt2003 + local275;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ea;Lclient!wk;ILclient!qg;)V")
	public static void method6039(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(3) Class5_Sub32 arg2) {
		@Pc(10) Class95 local10 = arg1.method5996(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5503();
		if (local16 < local10.method5506()) {
			local16 = local10.method5506();
		}
		@Pc(36) int local36 = arg2.anInt5144;
		@Pc(39) int local39 = arg2.anInt5149;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(59) int local59;
		@Pc(82) int local82;
		if (arg1.aString66 != null) {
			local41 = Static185.aClass36_6.method644(null, Static314.aStringArray62, arg1.aString66, null);
			for (local59 = 0; local59 < local41; local59++) {
				@Pc(65) String local65 = Static314.aStringArray62[local59];
				if (local41 - 1 > local59) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local82 = Static335.aClass71_9.method1623(local65);
				if (local82 > local43) {
					local43 = local82;
				}
			}
			local45 = Static335.aClass71_9.method1627() * local41 + Static335.aClass71_9.method1622() / 2;
		}
		local59 = arg2.anInt5144 + local16 / 2;
		@Pc(121) int local121 = arg2.anInt5149;
		if (Static290.anInt2767 + local16 > local36) {
			local59 = local43 / 2 + local16 / 2 + Static290.anInt2767 + 5 + 10;
			local36 = Static290.anInt2767;
		} else if (local36 > Static290.anInt2768 - local16) {
			local36 = Static290.anInt2768 - local16;
			local59 = Static290.anInt2768 - local16 / 2 - local43 / 2 - 10 - 5;
		}
		if (local39 < local16 + Static290.anInt2773) {
			local39 = Static290.anInt2773;
			local121 = local16 / 2 + Static290.anInt2773 + 10;
		} else if (local39 > Static290.anInt2774 - local16) {
			local39 = Static290.anInt2774 - local16;
			local121 = Static290.anInt2774 - local16 / 2 - local45 - 10;
		}
		local82 = (int) (Math.atan2((double) (local36 - arg2.anInt5144), (double) (local39 - arg2.anInt5149)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5505((float) local36 + (float) local16 / 2.0F, (float) local39 + (float) local16 / 2.0F, 4096, local82);
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		if (arg1.aString66 != null) {
			local262 = local59 - local43 / 2 - 5;
			local264 = local121;
			local268 = local121 + Static335.aClass71_9.method1627() * local41 + 3;
			local266 = local43 + local262 + 10;
			if (arg1.anInt6759 != 0) {
				arg0.method5254(local266 - local262, arg1.anInt6759, local268 - local121, local262, local121);
			}
			if (arg1.anInt6764 != 0) {
				arg0.method5251(local262, arg1.anInt6764, local266 - local262, -local121 + local268, local121);
			}
			for (@Pc(341) int local341 = 0; local341 < local41; local341++) {
				@Pc(347) String local347 = Static314.aStringArray62[local341];
				if (local41 - 1 > local341) {
					local347 = local347.substring(0, local347.length() - 4);
				}
				Static335.aClass71_9.method1626(arg0, local347, local59, local121, arg1.anInt6757);
				local121 += Static335.aClass71_9.method1627();
			}
		}
		if (arg1.anInt6749 == -1 && arg1.aString66 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(399) Class5_Sub34 local399 = new Class5_Sub34(arg2);
		local399.anInt5209 = local266;
		local399.anInt5219 = local36 - local16;
		local399.anInt5210 = local16 + local39;
		local399.anInt5214 = local262;
		local399.anInt5217 = local39 - local16;
		local399.anInt5211 = local264;
		local399.anInt5207 = local268;
		local399.anInt5218 = local16 + local36;
		Static239.aClass103_116.method2745(local399);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BZ)V")
	public static void method6040(@OriginalArg(1) boolean arg0) {
		Static175.method2604(Static256.anInt5066, Static32.anInt628, arg0, Static168.anInt3376);
	}
}

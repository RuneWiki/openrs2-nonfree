import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Lclient!gi;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public static int anInt2519 = 0;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!id;")
	public static Class43 aClass43_10 = new Class43(64);

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!i;")
	private static Class41 aClass41_749 = Static184.method2923("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_750 = aClass41_749;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean135 = true;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)I")
	public static int method1775(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!i;BILclient!i;ILclient!i;)V")
	public static void method1777(@OriginalArg(0) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class41 arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static171.anIntArray419[local3] = Static171.anIntArray419[local3 - 1];
			Static107.aClass41Array35[local3] = Static107.aClass41Array35[local3 - 1];
			Static188.aClass41Array68[local3] = Static188.aClass41Array68[local3 - 1];
			Static202.aClass41Array25[local3] = Static202.aClass41Array25[local3 - 1];
			Static118.anIntArray305[local3] = Static118.anIntArray305[local3 - 1];
		}
		Static32.anInt845++;
		Static107.aClass41Array35[0] = arg2;
		Static188.aClass41Array68[0] = arg0;
		Static171.anIntArray419[0] = arg3;
		Static118.anIntArray305[0] = arg1;
		Static202.aClass41Array25[0] = arg4;
		Static6.anInt309 = Static60.anInt4782;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public static void method1778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (Static62.anInt1675 != arg0) {
			Static20.anIntArray45 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static20.anIntArray45[local9] = (local9 << 12) / arg0;
			}
			Static39.anInt1065 = arg0 == 64 ? 2048 : 4096;
			Static62.anInt1675 = arg0;
			Static41.anInt1259 = arg0 - 1;
		}
		if (arg1 == Static25.anInt4767) {
			return;
		}
		if (Static62.anInt1675 == arg1) {
			Static97.anIntArray240 = Static20.anIntArray45;
		} else {
			Static97.anIntArray240 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static97.anIntArray240[local9] = (local9 << 12) / arg1;
			}
		}
		Static25.anInt4767 = arg1;
		Static195.anInt4423 = arg1 - 1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static128.anInt2975++;
		Static158.anInt3732 = 0;
		@Pc(9) int local9 = arg4 - 16;
		@Pc(13) int local13 = arg4 + 16;
		@Pc(17) int local17 = arg5 - 16;
		@Pc(21) int local21 = arg5 + 16;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(100) int local100;
		for (@Pc(23) int local23 = Static146.anInt3317; local23 < Static10.anInt369; local23++) {
			@Pc(28) Class2_Sub7[][] local28 = Static27.aClass2_Sub7ArrayArrayArray4[local23];
			for (local30 = Static141.anInt3249; local30 < Static5.anInt285; local30++) {
				for (local33 = Static89.anInt2200; local33 < Static204.anInt4550; local33++) {
					@Pc(40) Class2_Sub7 local40 = local28[local30][local33];
					if (local40 != null) {
						if (local40.anInt1375 <= Static140.anInt3233 && Static17.aBooleanArrayArray1[local30 + Static135.anInt3149 - Static69.anInt1824][local33 + Static135.anInt3149 - Static77.anInt1993] && (arg3 == null || local23 < 0 || arg3[local23][local30][local33] != 0)) {
							local40.aBoolean67 = true;
							local40.aBoolean69 = true;
							if (local40.anInt1382 > 0) {
								local40.aBoolean68 = true;
							} else {
								local40.aBoolean68 = false;
							}
							Static158.anInt3732++;
						} else {
							local40.aBoolean67 = false;
							local40.aBoolean69 = false;
							local40.anInt1377 = 0;
							if (local40.aClass51Array1 != null && local30 >= local9 && local30 <= local13 && local33 >= local17 && local33 <= local21) {
								for (local100 = 0; local100 < local40.anInt1382; local100++) {
									@Pc(106) Class51 local106 = local40.aClass51Array1[local100];
									local106.aClass12_4.method2717((local106.anInt2305 + (local106.anInt2312 - local106.anInt2305 >> 1)) * 128 + 64, (local106.anInt2308 + (local106.anInt2307 - local106.anInt2308 >> 1)) * 128 + 64);
								}
							}
						}
					}
				}
			}
		}
		@Pc(183) boolean local183 = Static56.anIntArrayArrayArray7 == Static139.anIntArrayArrayArray16;
		@Pc(211) int local211;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(202) int local202;
		for (local30 = Static146.anInt3317; local30 < Static10.anInt369; local30++) {
			@Pc(190) Class2_Sub7[][] local190 = Static27.aClass2_Sub7ArrayArrayArray4[local30];
			for (@Pc(193) int local193 = -Static135.anInt3149; local193 <= 0; local193++) {
				local100 = Static69.anInt1824 + local193;
				local202 = Static69.anInt1824 - local193;
				if (local100 >= Static141.anInt3249 || local202 < Static5.anInt285) {
					for (local211 = -Static135.anInt3149; local211 <= 0; local211++) {
						local216 = Static77.anInt1993 + local211;
						local220 = Static77.anInt1993 - local211;
						@Pc(232) Class2_Sub7 local232;
						if (local100 >= Static141.anInt3249) {
							if (local216 >= Static89.anInt2200) {
								local232 = local190[local100][local216];
								if (local232 != null && local232.aBoolean67) {
									Static71.method1305(local232, true);
								}
							}
							if (local220 < Static204.anInt4550) {
								local232 = local190[local100][local220];
								if (local232 != null && local232.aBoolean67) {
									Static71.method1305(local232, true);
								}
							}
						}
						if (local202 < Static5.anInt285) {
							if (local216 >= Static89.anInt2200) {
								local232 = local190[local202][local216];
								if (local232 != null && local232.aBoolean67) {
									Static71.method1305(local232, true);
								}
							}
							if (local220 < Static204.anInt4550) {
								local232 = local190[local202][local220];
								if (local232 != null && local232.aBoolean67) {
									Static71.method1305(local232, true);
								}
							}
						}
						if (Static158.anInt3732 == 0) {
							if (!local183) {
								aBoolean136 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local33 = Static146.anInt3317; local33 < Static10.anInt369; local33++) {
			@Pc(318) Class2_Sub7[][] local318 = Static27.aClass2_Sub7ArrayArrayArray4[local33];
			for (local100 = -Static135.anInt3149; local100 <= 0; local100++) {
				local202 = Static69.anInt1824 + local100;
				local211 = Static69.anInt1824 - local100;
				if (local202 >= Static141.anInt3249 || local211 < Static5.anInt285) {
					for (local216 = -Static135.anInt3149; local216 <= 0; local216++) {
						local220 = Static77.anInt1993 + local216;
						@Pc(348) int local348 = Static77.anInt1993 - local216;
						@Pc(360) Class2_Sub7 local360;
						if (local202 >= Static141.anInt3249) {
							if (local220 >= Static89.anInt2200) {
								local360 = local318[local202][local220];
								if (local360 != null && local360.aBoolean67) {
									Static71.method1305(local360, false);
								}
							}
							if (local348 < Static204.anInt4550) {
								local360 = local318[local202][local348];
								if (local360 != null && local360.aBoolean67) {
									Static71.method1305(local360, false);
								}
							}
						}
						if (local211 < Static5.anInt285) {
							if (local220 >= Static89.anInt2200) {
								local360 = local318[local211][local220];
								if (local360 != null && local360.aBoolean67) {
									Static71.method1305(local360, false);
								}
							}
							if (local348 < Static204.anInt4550) {
								local360 = local318[local211][local348];
								if (local360 != null && local360.aBoolean67) {
									Static71.method1305(local360, false);
								}
							}
						}
						if (Static158.anInt3732 == 0) {
							if (!local183) {
								aBoolean136 = false;
							}
							return;
						}
					}
				}
			}
		}
		aBoolean136 = false;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!cc;Lclient!cc;B)V")
	public static void method1780(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) Class2_Sub2_Sub4 arg1) {
		if (Static70.aClass2_Sub2_Sub16Array8 == null) {
			Static70.aClass2_Sub2_Sub16Array8 = Static32.method632(0, Static200.aClass15_Sub1_125, Static13.anInt408);
		}
		if (Static21.aClass60Array49 == null) {
			Static21.aClass60Array49 = Static168.method2709(Static7.anInt319, Static200.aClass15_Sub1_125, 0);
		}
		if (Static150.aClass60Array36 == null) {
			Static150.aClass60Array36 = Static168.method2709(Static84.anInt2160, Static200.aClass15_Sub1_125, 0);
		}
		if (Static39.aClass60Array13 == null) {
			Static39.aClass60Array13 = Static168.method2709(Static106.anInt2584, Static200.aClass15_Sub1_125, 0);
		}
		Static64.method1164(0, 23, 765, 480, 0);
		Static64.method1168(0, 0, 138, 23, 12425273, 9135624);
		Static64.method1168(138, 0, 640, 23, 5197647, 2697513);
		arg1.method771(Static114.aClass41_793, 69, 15, 0, -1);
		if (Static39.aClass60Array13 != null) {
			Static39.aClass60Array13[1].method2740(140, 1);
			arg0.method784(Static113.aClass41_784, 152, 10, 16777215, -1);
			Static39.aClass60Array13[0].method2740(140, 12);
			arg0.method784(Static101.aClass41_726, 152, 21, 16777215, -1);
		}
		if (Static150.aClass60Array36 != null) {
			if (Static25.anIntArray495[0] == 0 && Static78.anIntArray196[0] == 0) {
				Static150.aClass60Array36[2].method2740(280, 4);
			} else {
				Static150.aClass60Array36[0].method2740(280, 4);
			}
			if (Static25.anIntArray495[0] == 0 && Static78.anIntArray196[0] == 1) {
				Static150.aClass60Array36[3].method2740(295, 4);
			} else {
				Static150.aClass60Array36[1].method2740(295, 4);
			}
			arg1.method784(Static63.aClass41_525, 312, 17, 16777215, -1);
			if (Static25.anIntArray495[0] == 1 && Static78.anIntArray196[0] == 0) {
				Static150.aClass60Array36[2].method2740(390, 4);
			} else {
				Static150.aClass60Array36[0].method2740(390, 4);
			}
			if (Static25.anIntArray495[0] == 1 && Static78.anIntArray196[0] == 1) {
				Static150.aClass60Array36[3].method2740(405, 4);
			} else {
				Static150.aClass60Array36[1].method2740(405, 4);
			}
			arg1.method784(Static206.aClass41_1237, 422, 17, 16777215, -1);
			if (Static25.anIntArray495[0] == 2 && Static78.anIntArray196[0] == 0) {
				Static150.aClass60Array36[2].method2740(500, 4);
			} else {
				Static150.aClass60Array36[0].method2740(500, 4);
			}
			if (Static25.anIntArray495[0] == 2 && Static78.anIntArray196[0] == 1) {
				Static150.aClass60Array36[3].method2740(515, 4);
			} else {
				Static150.aClass60Array36[1].method2740(515, 4);
			}
			arg1.method784(Static131.aClass41_844, 532, 17, 16777215, -1);
			if (Static25.anIntArray495[0] == 3 && Static78.anIntArray196[0] == 0) {
				Static150.aClass60Array36[2].method2740(610, 4);
			} else {
				Static150.aClass60Array36[0].method2740(610, 4);
			}
			if (Static25.anIntArray495[0] == 3 && Static78.anIntArray196[0] == 1) {
				Static150.aClass60Array36[3].method2740(625, 4);
			} else {
				Static150.aClass60Array36[1].method2740(625, 4);
			}
			arg1.method784(Static184.aClass41_1115, 642, 17, 16777215, -1);
		}
		Static64.method1164(700, 4, 58, 16, 0);
		arg0.method771(Static5.aClass41_50, 729, 16, 16777215, -1);
		Static76.anInt787 = -1;
		if (Static70.aClass2_Sub2_Sub16Array8 == null) {
			return;
		}
		@Pc(388) int local388 = 24;
		@Pc(394) int local394 = 8;
		@Pc(396) int local396;
		@Pc(398) int local398;
		do {
			local396 = local388;
			local398 = local394;
			if (Static91.anInt2267 <= local388 * (local394 - 1)) {
				local394--;
			}
			if (local394 * (local388 - 1) >= Static91.anInt2267) {
				local388--;
			}
			if (Static91.anInt2267 <= (local388 - 1) * local394) {
				local388--;
			}
		} while (local388 != local396 || local398 != local394);
		local396 = (765 - local394 * 88) / (local394 + 1);
		local398 = (480 - local388 * 19) / (local388 + 1);
		if (local398 > 5) {
			local398 = 5;
		}
		if (local396 > 5) {
			local396 = 5;
		}
		@Pc(491) int local491 = (765 - local396 * (local394 - 1) - local394 * 88) / 2;
		@Pc(493) int local493 = local491;
		@Pc(509) int local509 = (480 - local388 * 19 - local398 * (local388 + -1)) / 2;
		@Pc(514) int local514 = local509 + 23;
		@Pc(516) int local516 = 0;
		for (@Pc(518) int local518 = 0; local518 < Static91.anInt2267; local518++) {
			@Pc(524) Class37 local524 = Static178.aClass37Array1[local518];
			@Pc(526) boolean local526 = true;
			@Pc(531) Class41 local531 = Static152.method2471(local524.anInt1667);
			if (local524.anInt1667 == -1) {
				local531 = Static44.aClass41_383;
				local526 = false;
			} else if (local524.anInt1667 > 1980) {
				local531 = Static81.aClass41_617;
				local526 = false;
			}
			if (Static26.anInt663 >= local493 && Static212.anInt4711 >= local514 && Static26.anInt663 < local493 + 88 && Static212.anInt4711 < local514 + 19 && local526) {
				Static76.anInt787 = local518;
				Static70.aClass2_Sub2_Sub16Array8[local524.aBoolean91 ? 1 : 0].method2406(local493, local514);
			} else {
				Static70.aClass2_Sub2_Sub16Array8[local524.aBoolean91 ? 1 : 0].method2396(local493, local514);
			}
			if (Static21.aClass60Array49 != null) {
				Static21.aClass60Array49[local524.anInt1670 + (local524.aBoolean91 ? 8 : 0)].method2740(local493 + 29, local514);
			}
			arg1.method771(Static152.method2471(local524.anInt1671), local493 + 15, 5 + 9 + local514, 0, -1);
			arg0.method771(local531, local493 + 60, local514 - -5 + 9, 268435455, -1);
			local514 += local398 + 19;
			local516++;
			if (local388 <= local516) {
				local514 = local509 + 23;
				local516 = 0;
				local493 += local396 + 88;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIILclient!q;I)V")
	public static void method1781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class80 arg5, @OriginalArg(7) int arg6) {
		if (Static1.aBoolean237) {
			Static111.anInt2666 = 32;
		} else {
			Static111.anInt2666 = 0;
		}
		Static1.aBoolean237 = false;
		@Pc(130) int local130;
		if (Static141.anInt3252 != 0) {
			if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 <= arg4 && arg4 < arg6 + 16) {
				arg5.anInt3655 -= 4;
				Static176.method2833(arg5);
			} else if (arg0 <= arg2 && arg2 < arg0 + 16 && arg4 >= arg6 + arg3 - 16 && arg6 + arg3 > arg4) {
				arg5.anInt3655 += 4;
				Static176.method2833(arg5);
			} else if (arg2 >= arg0 - Static111.anInt2666 && arg2 < Static111.anInt2666 + arg0 + 16 && arg6 + 16 <= arg4 && arg4 < arg6 + arg3 - 16) {
				local130 = arg3 * (arg3 - 32) / arg1;
				if (local130 < 8) {
					local130 = 8;
				}
				@Pc(144) int local144 = arg3 - local130 - 32;
				@Pc(155) int local155 = arg4 - local130 / 2 - arg6 - 16;
				arg5.anInt3655 = local155 * (arg1 - arg3) / local144;
				Static176.method2833(arg5);
				Static1.aBoolean237 = true;
			}
		}
		if (Static79.anInt2046 == 0) {
			return;
		}
		local130 = arg5.anInt3635;
		if (arg2 >= arg0 - local130 && arg6 <= arg4 && arg2 < arg0 + 16 && arg4 <= arg6 + arg3) {
			arg5.anInt3655 += Static79.anInt2046 * 45;
			Static176.method2833(arg5);
		}
	}
}

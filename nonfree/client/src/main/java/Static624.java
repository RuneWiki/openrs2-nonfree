import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lclient!gj;")
	public static Class143 aClass143_133;

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_66 = new Class193();

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_139 = new Class376(79, -1);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!dg;IIIII)Z")
	public static boolean method8247(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static44.aBoolean107 || !Static262.aBoolean400) {
			return false;
		} else if (Static594.anInt9366 < 100) {
			return false;
		} else if (arg5 != arg3 || arg4 != arg0) {
			for (@Pc(52) int local52 = arg3; local52 <= arg5; local52++) {
				for (@Pc(56) int local56 = arg0; local56 <= arg4; local56++) {
					if (-Static553.anInt8943 == Static662.anIntArrayArrayArray20[arg2][local52][local56]) {
						return false;
					}
				}
			}
			if (Static486.method6977(arg1)) {
				Static236.anInt4477++;
				return true;
			} else {
				return false;
			}
		} else if (!Static213.method3374(arg2, arg3, arg0)) {
			return false;
		} else if (Static486.method6977(arg1)) {
			Static236.anInt4477++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZIIB)Lclient!ji;")
	public static Class3_Sub28 method8248(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub28 local7 = new Class3_Sub28();
		local7.anInt5253 = arg2;
		local7.anInt5252 = arg0;
		Static222.aClass62_21.method1686((long) arg3, local7);
		Static117.method2134(arg0);
		@Pc(26) Class208 local26 = Static676.method8728(arg3);
		if (local26 != null) {
			Static374.method5525(local26);
		}
		if (Static339.aClass208_8 != null) {
			Static374.method5525(Static339.aClass208_8);
			Static339.aClass208_8 = null;
		}
		Static146.method2534();
		if (local26 != null) {
			Static650.method8523(local26, !arg1);
		}
		if (!arg1) {
			Static543.method7510(arg0);
		}
		if (!arg1 && Static277.anInt5201 != -1) {
			Static325.method5063(1, Static277.anInt5201);
		}
		return local7;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/lang/String;[BIIII)I")
	public static int method8249(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg0.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg1[local17 + arg3] = -128;
			} else if (local25 == '‚') {
				arg1[local17 + arg3] = -126;
			} else if (local25 == 'ƒ') {
				arg1[arg3 + local17] = -125;
			} else if (local25 == '„') {
				arg1[local17 + arg3] = -124;
			} else if (local25 == '…') {
				arg1[arg3 + local17] = -123;
			} else if (local25 == '†') {
				arg1[local17 + arg3] = -122;
			} else if (local25 == '‡') {
				arg1[local17 + arg3] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg3 + local17] = -120;
			} else if (local25 == '‰') {
				arg1[arg3 + local17] = -119;
			} else if (local25 == 'Š') {
				arg1[local17 + arg3] = -118;
			} else if (local25 == '‹') {
				arg1[local17 + arg3] = -117;
			} else if (local25 == 'Œ') {
				arg1[local17 + arg3] = -116;
			} else if (local25 == 'Ž') {
				arg1[local17 + arg3] = -114;
			} else if (local25 == '‘') {
				arg1[local17 + arg3] = -111;
			} else if (local25 == '’') {
				arg1[arg3 + local17] = -110;
			} else if (local25 == '“') {
				arg1[local17 + arg3] = -109;
			} else if (local25 == '”') {
				arg1[arg3 + local17] = -108;
			} else if (local25 == '•') {
				arg1[local17 + arg3] = -107;
			} else if (local25 == '–') {
				arg1[arg3 + local17] = -106;
			} else if (local25 == '—') {
				arg1[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg1[arg3 + local17] = -104;
			} else if (local25 == '™') {
				arg1[local17 + arg3] = -103;
			} else if (local25 == 'š') {
				arg1[arg3 + local17] = -102;
			} else if (local25 == '›') {
				arg1[local17 + arg3] = -101;
			} else if (local25 == 'œ') {
				arg1[local17 + arg3] = -100;
			} else if (local25 == 'ž') {
				arg1[arg3 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[arg3 + local17] = -97;
			} else {
				arg1[arg3 + local17] = 63;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIZII)V")
	public static void method8250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class3_Sub6_Sub7 local14 = Static198.method3146((long) arg1 | (long) arg3 << 32, 18);
		local14.method1712();
		local14.anInt1782 = arg0;
		local14.anInt1790 = arg2;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V")
	public static void method8252() {
		if (!Static463.aBoolean600) {
			Static548.aBoolean662 = Static308.anInt5688 != -1 && Static37.anInt1104 >= Static308.anInt5688 || Static37.anInt1104 * 16 + (Static236.aBoolean347 ? 26 : 22) > Static483.anInt8181;
		}
		Static585.aClass193_63.method4458();
		Static123.aClass193_14.method4458();
		@Pc(44) int local44;
		for (@Pc(39) Class3_Sub6_Sub16 local39 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local39 != null; local39 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
			local44 = local39.anInt7069;
			if (local44 < 1000) {
				local39.method8770();
				if (local44 == 20 || local44 == 49 || local44 == 45 || local44 == 13 || local44 == 17 || local44 == 9 || local44 == 2) {
					Static123.aClass193_14.method4462(local39);
				} else {
					Static585.aClass193_63.method4462(local39);
				}
			}
		}
		Static585.aClass193_63.method4464(Static362.aClass193_32);
		Static123.aClass193_14.method4464(Static362.aClass193_32);
		if (Static37.anInt1104 > 1) {
			if (Static381.aBoolean509 && Static530.aClass284_1.method7637(81) && Static37.anInt1104 > 2) {
				Static614.aClass3_Sub6_Sub16_4 = (Class3_Sub6_Sub16) Static362.aClass193_32.aClass3_155.aClass3_338.aClass3_338;
			} else {
				Static614.aClass3_Sub6_Sub16_4 = (Class3_Sub6_Sub16) Static362.aClass193_32.aClass3_155.aClass3_338;
			}
			Static154.aClass3_Sub6_Sub16_2 = (Class3_Sub6_Sub16) Static362.aClass193_32.aClass3_155.aClass3_338;
		} else {
			Static614.aClass3_Sub6_Sub16_4 = null;
			Static154.aClass3_Sub6_Sub16_2 = null;
		}
		local44 = -1;
		@Pc(161) Class3_Sub21 local161 = (Class3_Sub21) Static565.aClass193_55.method4457();
		if (local161 != null) {
			local44 = local161.method7983();
		}
		if (!Static463.aBoolean600) {
			if (local44 == 0 && (Static516.anInt8103 == 1 && Static37.anInt1104 > 2 || Static101.method1997())) {
				local44 = 2;
			}
			if (local44 == 2 && Static37.anInt1104 > 0 && local161 != null) {
				if (Static503.aClass208_9 == null && Static523.anInt5720 == 0) {
					Static5.method55(local161.method7977(), local161.method7981());
				} else {
					Static545.anInt8892 = 2;
				}
			}
			if (local44 == 0) {
				if (Static614.aClass3_Sub6_Sub16_4 != null) {
					Static593.method7943();
				} else if (Static329.aBoolean166) {
					Static61.method1523();
				}
			}
			if (Static503.aClass208_9 == null && Static523.anInt5720 == 0) {
				Static545.anInt8892 = 0;
				Static32.aClass3_Sub6_Sub16_1 = null;
			}
			return;
		}
		@Pc(244) int local244;
		@Pc(248) int local248;
		@Pc(325) int local325;
		@Pc(327) int local327;
		if (local44 == -1) {
			local244 = Static542.aClass75_1.method8412();
			local248 = Static542.aClass75_1.method8405();
			@Pc(250) boolean local250 = false;
			if (Static407.aClass3_Sub6_Sub20_1 != null) {
				if (Static382.anInt6708 - 10 <= local244 && local244 <= Static382.anInt6708 + Static505.anInt8464 + 10 && local248 >= Static226.anInt6457 - 10 && local248 <= Static226.anInt6457 + Static274.anInt5127 + 10) {
					local250 = true;
				} else {
					Static159.method8610();
				}
			}
			if (!local250) {
				if (local244 < Static567.anInt9059 - 10 || local244 > Static108.anInt2244 + Static567.anInt9059 + 10 || local248 < Static467.anInt7972 - 10 || Static467.anInt7972 + Static464.anInt7952 + 10 < local248) {
					Static376.method5544();
				} else if (Static548.aBoolean662) {
					local325 = -1;
					local327 = -1;
					@Pc(341) int local341;
					for (@Pc(329) int local329 = 0; local329 < Static661.anInt10221; local329++) {
						if (Static236.aBoolean347) {
							local341 = local329 * 16 + Static467.anInt7972 + 33;
							if (local341 - 13 < local248 && local248 < local341 + 4) {
								local327 = local341 - 13;
								local325 = local329;
								break;
							}
						} else {
							local341 = Static467.anInt7972 + local329 * 16 + 31;
							if (local341 - 13 < local248 && local341 + 3 > local248) {
								local327 = local341 - 13;
								local325 = local329;
								break;
							}
						}
					}
					if (local325 != -1) {
						local341 = 0;
						@Pc(412) Class289 local412 = new Class289(Static239.aClass258_3);
						for (@Pc(417) Class3_Sub6_Sub20 local417 = (Class3_Sub6_Sub20) local412.method6829(); local417 != null; local417 = (Class3_Sub6_Sub20) local412.method6827()) {
							if (local325 == local341) {
								if (local417.anInt9677 > 1) {
									Static194.method5134(local248, local417, local327);
								}
								break;
							}
							local341++;
						}
					}
				}
			}
		}
		if (local44 != 0) {
			return;
		}
		local244 = local161.method7977();
		local248 = local161.method7981();
		@Pc(508) int local508;
		@Pc(695) Class289 local695;
		@Pc(593) Class3_Sub6_Sub16 local593;
		if (Static407.aClass3_Sub6_Sub20_1 != null && local244 >= Static382.anInt6708 && local244 <= Static505.anInt8464 + Static382.anInt6708 && local248 >= Static226.anInt6457 && local248 <= Static226.anInt6457 + Static274.anInt5127) {
			local508 = -1;
			for (local325 = 0; local325 < Static407.aClass3_Sub6_Sub20_1.anInt9677; local325++) {
				if (Static236.aBoolean347) {
					local327 = local325 * 16 + Static226.anInt6457 + 33;
					if (local248 > local327 - 13 && local248 < local327 + 4) {
						local508 = local325;
					}
				} else {
					local327 = local325 * 16 + Static226.anInt6457 + 31;
					if (local327 - 13 < local248 && local327 + 3 > local248) {
						local508 = local325;
					}
				}
			}
			if (local508 != -1) {
				local327 = 0;
				local695 = new Class289(Static407.aClass3_Sub6_Sub20_1.aClass258_13);
				for (local593 = (Class3_Sub6_Sub16) local695.method6829(); local593 != null; local593 = (Class3_Sub6_Sub16) local695.method6827()) {
					if (local327 == local508) {
						Static182.method2995(local593, local244, local248);
						break;
					}
					local327++;
				}
			}
			Static376.method5544();
			return;
		}
		if (local244 < Static567.anInt9059 || Static108.anInt2244 + Static567.anInt9059 < local244 || Static467.anInt7972 > local248 || local248 > Static464.anInt7952 + Static467.anInt7972) {
			return;
		}
		if (!Static548.aBoolean662) {
			local508 = -1;
			for (local325 = 0; local325 < Static37.anInt1104; local325++) {
				if (Static236.aBoolean347) {
					local327 = Static467.anInt7972 + (Static37.anInt1104 - local325 - 1) * 16 + 33;
					if (local327 - 13 < local248 && local327 + 4 > local248) {
						local508 = local325;
					}
				} else {
					local327 = (Static37.anInt1104 - local325 - 1) * 16 + Static467.anInt7972 + 31;
					if (local248 > local327 - 13 && local327 + 3 > local248) {
						local508 = local325;
					}
				}
			}
			if (local508 != -1) {
				local327 = 0;
				@Pc(588) Class191 local588 = new Class191(Static362.aClass193_32);
				for (local593 = (Class3_Sub6_Sub16) local588.method4410(); local593 != null; local593 = (Class3_Sub6_Sub16) local588.method4412()) {
					if (local508 == local327) {
						Static182.method2995(local593, local244, local248);
						break;
					}
					local327++;
				}
			}
			Static376.method5544();
			return;
		}
		local508 = -1;
		for (local325 = 0; local325 < Static661.anInt10221; local325++) {
			if (Static236.aBoolean347) {
				local327 = Static467.anInt7972 + local325 * 16 + 33;
				if (local248 > local327 - 13 && local248 < local327 + 4) {
					local508 = local325;
					break;
				}
			} else {
				local327 = Static467.anInt7972 + local325 * 16 + 31;
				if (local248 > local327 - 13 && local327 + 3 > local248) {
					local508 = local325;
					break;
				}
			}
		}
		if (local508 == -1) {
			return;
		}
		local327 = 0;
		local695 = new Class289(Static239.aClass258_3);
		for (@Pc(700) Class3_Sub6_Sub20 local700 = (Class3_Sub6_Sub20) local695.method6829(); local700 != null; local700 = (Class3_Sub6_Sub20) local695.method6827()) {
			if (local327 == local508) {
				Static182.method2995((Class3_Sub6_Sub16) local700.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67, local244, local248);
				Static376.method5544();
				return;
			}
			local327++;
		}
		return;
	}
}

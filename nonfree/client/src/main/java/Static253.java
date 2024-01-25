import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "Lclient!ru;")
	public static Class219 aClass219_4;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_100 = new Class92(60, 7);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 128 || arg2 < 128 || arg3 > Static181.anInt3574 * 128 - 256 || (Static117.anInt2450 - 2) * 128 < arg2) {
			Static247.anIntArray317[0] = Static247.anIntArray317[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static221.method3331(arg1, arg2, arg3) - arg6;
		Static382.aClass5_4.method3843(arg4, 0, 0);
		Static126.aClass66_5.method5071(Static382.aClass5_4);
		Static126.aClass66_5.method5030(arg3, local49, arg2, Static247.anIntArray317);
		Static382.aClass5_4.method3843(-arg4, 0, 0);
		Static126.aClass66_5.method5071(Static382.aClass5_4);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!qo;IIIIIIIII)Z")
	public static boolean method4332(@OriginalArg(0) int arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg3 - 64;
		@Pc(23) int local23 = arg2 - 64;
		Static336.anIntArrayArray37[64][64] = 99;
		Static203.anIntArrayArray25[64][64] = 0;
		@Pc(53) byte local53 = 0;
		Static146.anIntArray183[0] = arg3;
		@Pc(59) int local59 = 0;
		@Pc(62) int local62 = local53 + 1;
		Static190.anIntArray25[0] = arg2;
		@Pc(67) int[][] local67 = arg1.anIntArrayArray34;
		while (local59 != local62) {
			local7 = Static146.anIntArray183[local59];
			local9 = Static190.anIntArray25[local59];
			@Pc(81) int local81 = local9 - local23;
			@Pc(86) int local86 = local7 - local18;
			local59 = local59 + 1 & 0xFFF;
			@Pc(98) int local98 = local7 - arg1.anInt5599;
			@Pc(104) int local104 = local9 - arg1.anInt5598;
			if (arg9 == -4) {
				if (local7 == arg7 && local9 == arg5) {
					Static219.anInt3951 = local7;
					Static446.anInt8003 = local9;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static9.method304(arg4, arg5, arg7, local9, 2, local7, arg0, 2)) {
					Static446.anInt8003 = local9;
					Static219.anInt3951 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg1.method4711(local7, arg4, arg0, 2, arg6, local9, arg7, arg5, 2)) {
					Static219.anInt3951 = local7;
					Static446.anInt8003 = local9;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg1.method4703(2, arg7, arg4, arg5, local9, arg0, arg6, local7)) {
					Static219.anInt3951 = local7;
					Static446.anInt8003 = local9;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg1.method4704(local7, arg8, 2, arg9, arg7, arg5, local9)) {
					Static219.anInt3951 = local7;
					Static446.anInt8003 = local9;
					return true;
				}
			} else if (arg1.method4712(arg9, 2, arg7, arg8, arg5, local9, local7)) {
				Static446.anInt8003 = local9;
				Static219.anInt3951 = local7;
				return true;
			}
			@Pc(253) int local253 = Static203.anIntArrayArray25[local86][local81] + 1;
			if (local86 > 0 && Static336.anIntArrayArray37[local86 - 1][local81] == 0 && (local67[local98 - 1][local104] & 0x43A40000) == 0 && (local67[local98 - 1][local104 + 1] & 0x4E240000) == 0) {
				Static146.anIntArray183[local62] = local7 - 1;
				Static190.anIntArray25[local62] = local9;
				Static336.anIntArrayArray37[local86 - 1][local81] = 2;
				local62 = local62 + 1 & 0xFFF;
				Static203.anIntArrayArray25[local86 - 1][local81] = local253;
			}
			if (local86 < 126 && Static336.anIntArrayArray37[local86 + 1][local81] == 0 && (local67[local98 + 2][local104] & 0x60E40000) == 0 && (local67[local98 + 2][local104 + 1] & 0x78240000) == 0) {
				Static146.anIntArray183[local62] = local7 + 1;
				Static190.anIntArray25[local62] = local9;
				local62 = local62 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local86 + 1][local81] = 8;
				Static203.anIntArrayArray25[local86 + 1][local81] = local253;
			}
			if (local81 > 0 && Static336.anIntArrayArray37[local86][local81 - 1] == 0 && (local67[local98][local104 - 1] & 0x43A40000) == 0 && (local67[local98 + 1][local104 - 1] & 0x60E40000) == 0) {
				Static146.anIntArray183[local62] = local7;
				Static190.anIntArray25[local62] = local9 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local86][local81 - 1] = 1;
				Static203.anIntArrayArray25[local86][local81 - 1] = local253;
			}
			if (local81 < 126 && Static336.anIntArrayArray37[local86][local81 + 1] == 0 && (local67[local98][local104 + 2] & 0x4E240000) == 0 && (local67[local98 + 1][local104 + 2] & 0x78240000) == 0) {
				Static146.anIntArray183[local62] = local7;
				Static190.anIntArray25[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local86][local81 + 1] = 4;
				Static203.anIntArrayArray25[local86][local81 + 1] = local253;
			}
			if (local86 > 0 && local81 > 0 && Static336.anIntArrayArray37[local86 - 1][local81 - 1] == 0 && (local67[local98 - 1][local104] & 0x4FA40000) == 0 && (local67[local98 - 1][local104 - 1] & 0x43A40000) == 0 && (local67[local98][local104 - 1] & 0x63E40000) == 0) {
				Static146.anIntArray183[local62] = local7 - 1;
				Static190.anIntArray25[local62] = local9 - 1;
				Static336.anIntArrayArray37[local86 - 1][local81 - 1] = 3;
				local62 = local62 + 1 & 0xFFF;
				Static203.anIntArrayArray25[local86 - 1][local81 - 1] = local253;
			}
			if (local86 < 126 && local81 > 0 && Static336.anIntArrayArray37[local86 + 1][local81 - 1] == 0 && (local67[local98 + 1][local104 - 1] & 0x63E40000) == 0 && (local67[local98 + 2][local104 - 1] & 0x60E40000) == 0 && (local67[local98 + 2][local104] & 0x78E40000) == 0) {
				Static146.anIntArray183[local62] = local7 + 1;
				Static190.anIntArray25[local62] = local9 - 1;
				Static336.anIntArrayArray37[local86 + 1][local81 - 1] = 9;
				local62 = local62 + 1 & 0xFFF;
				Static203.anIntArrayArray25[local86 + 1][local81 - 1] = local253;
			}
			if (local86 > 0 && local81 < 126 && Static336.anIntArrayArray37[local86 - 1][local81 + 1] == 0 && (local67[local98 - 1][local104 + 1] & 0x4FA40000) == 0 && (local67[local98 - 1][local104 + 2] & 0x4E240000) == 0 && (local67[local98][local104 + 2] & 0x7E240000) == 0) {
				Static146.anIntArray183[local62] = local7 - 1;
				Static190.anIntArray25[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local86 - 1][local81 + 1] = 6;
				Static203.anIntArrayArray25[local86 - 1][local81 + 1] = local253;
			}
			if (local86 < 126 && local81 < 126 && Static336.anIntArrayArray37[local86 + 1][local81 + 1] == 0 && (local67[local98 + 1][local104 + 2] & 0x7E240000) == 0 && (local67[local98 + 2][local104 + 2] & 0x78240000) == 0 && (local67[local98 + 2][local104 + 1] & 0x78E40000) == 0) {
				Static146.anIntArray183[local62] = local7 + 1;
				Static190.anIntArray25[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local86 + 1][local81 + 1] = 12;
				Static203.anIntArrayArray25[local86 + 1][local81 + 1] = local253;
			}
		}
		Static446.anInt8003 = local9;
		Static219.anInt3951 = local7;
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!he;Lclient!he;ILclient!bk;Lclient!he;)Z")
	public static boolean method4333(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Class6_Sub4_Sub2 arg2, @OriginalArg(4) Class100 arg3) {
		Static333.aClass100_64 = arg0;
		Static387.aClass6_Sub4_Sub2_3 = arg2;
		Static232.aClass100_46 = arg1;
		Static335.aClass100_67 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!so;ILclient!md;II)V")
	public static void method4334(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) Class6_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if ((arg3 & 0x2) != 0) {
			local15 = arg1.method6477();
			if (local15 == 65535) {
				local15 = -1;
			}
			arg0.anInt6569 = local15;
		}
		@Pc(25) byte local25 = -1;
		if ((arg3 & 0x200) != 0) {
			local15 = arg1.method6477();
			arg0.anInt6537 = arg1.method6431();
			arg0.anInt6577 = arg1.method6472();
			arg0.aBoolean419 = (local15 & 0x8000) != 0;
			arg0.anInt6542 = local15 & 0x7FFF;
			arg0.anInt6556 = arg0.anInt6537 + arg0.anInt6542 + Static66.anInt1741;
		}
		if ((arg3 & 0x40) != 0) {
			arg0.anInt6626 = arg1.method6447();
			if (arg0.anInt6613 == 0) {
				arg0.method5523(arg0.anInt6626);
				arg0.anInt6626 = -1;
			}
		}
		if ((arg3 & 0x40000) != 0) {
			local15 = arg1.method6472();
			@Pc(108) int[] local108 = new int[local15];
			@Pc(111) int[] local111 = new int[local15];
			@Pc(114) int[] local114 = new int[local15];
			for (@Pc(116) int local116 = 0; local116 < local15; local116++) {
				@Pc(122) int local122 = arg1.method6447();
				if (local122 == 65535) {
					local122 = -1;
				}
				local108[local116] = local122;
				local111[local116] = arg1.method6433();
				local114[local116] = arg1.method6455();
			}
			Static244.method6372(local111, arg0, local114, local108);
		}
		@Pc(165) int local165;
		@Pc(169) int local169;
		if ((arg3 & 0x1000) != 0) {
			local15 = Static66.anInt1741;
			local165 = arg1.method6445();
			local169 = arg1.method6472();
			arg0.method5512(local165, local169, local15);
		}
		if ((arg3 & 0x4000) != 0) {
			local25 = arg1.method6486();
		}
		if ((arg3 & 0x1) != 0) {
			local15 = arg1.method6485();
			local165 = arg1.method6431();
			local169 = arg1.method6431();
			@Pc(210) int local210 = arg1.anInt7898;
			@Pc(218) boolean local218 = (local15 & 0x8000) != 0;
			if (arg0.aString54 != null && arg0.aClass259_1 != null) {
				@Pc(226) boolean local226 = false;
				if (local165 <= 1) {
					if (!local218 && (Static18.aBoolean26 && !Static225.aBoolean270 || Static421.aBoolean475)) {
						local226 = true;
					} else if (Static38.method944(arg0.aString54)) {
						local226 = true;
					}
				}
				if (!local226 && Static214.anInt3921 == 0) {
					Static237.aClass6_Sub1_3.anInt7898 = 0;
					arg1.method6429(local169, Static237.aClass6_Sub1_3.aByteArray96);
					Static237.aClass6_Sub1_3.anInt7898 = 0;
					@Pc(267) int local267 = -1;
					@Pc(275) String local275;
					if (local218) {
						local15 &= 0x7FFF;
						@Pc(285) Class189 local285 = Static209.method2239(Static237.aClass6_Sub1_3);
						local267 = local285.anInt5268;
						local275 = local285.aClass6_Sub2_Sub12_1.method4356(Static237.aClass6_Sub1_3);
					} else {
						local275 = Static195.method5951(Static131.method2329(Static237.aClass6_Sub1_3));
					}
					arg0.aString52 = local275.trim();
					arg0.anInt6591 = local15 >> 8;
					arg0.anInt6539 = 150;
					arg0.anInt6540 = local15 & 0xFF;
					@Pc(327) int local327;
					if (local165 == 1 || local165 == 2) {
						local327 = local218 ? 17 : 1;
					} else {
						local327 = local218 ? 17 : 2;
					}
					if (local165 == 2) {
						Static143.method2456(local275, null, local327, "<img=1>" + arg0.method5532(), local267, "<img=1>" + arg0.method5536(), 0);
					} else if (local165 == 1) {
						Static143.method2456(local275, null, local327, "<img=0>" + arg0.method5532(), local267, "<img=0>" + arg0.method5536(), 0);
					} else {
						Static143.method2456(local275, null, local327, arg0.method5532(), local267, arg0.method5536(), 0);
					}
				}
			}
			arg1.anInt7898 = local210 + local169;
		}
		if ((arg3 & 0x20000) != 0) {
			arg0.aByte91 = arg1.method6441();
			arg0.aByte92 = arg1.method6441();
			arg0.aByte89 = arg1.method6468();
			arg0.aByte90 = (byte) arg1.method6472();
			arg0.anInt6582 = Static66.anInt1741 + arg1.method6455();
			arg0.anInt6600 = Static66.anInt1741 + arg1.method6477();
		}
		if ((arg3 & 0x10000) != 0) {
			local15 = arg1.method6447();
			if (local15 == 65535) {
				local15 = -1;
			}
			local165 = arg1.method6491();
			local169 = arg1.method6488();
			arg0.method5522(true, local15, local169, local165);
		}
		if ((arg3 & 0x800) != 0) {
			local15 = arg1.method6447();
			if (local15 == 65535) {
				local15 = -1;
			}
			local165 = arg1.method6469();
			local169 = arg1.method6431();
			arg0.method5522(false, local15, local169, local165);
		}
		if ((arg3 & 0x4) != 0) {
			local15 = arg1.method6477();
			if (local15 == 65535) {
				local15 = -1;
			}
			local165 = arg1.method6431();
			Static350.method5232(local165, local15, arg0);
		}
		if ((arg3 & 0x10) != 0) {
			local15 = arg1.method6488();
			@Pc(588) byte[] local588 = new byte[local15];
			@Pc(593) Class6_Sub1 local593 = new Class6_Sub1(local588);
			arg1.method6429(local15, local588);
			Static184.aClass6_Sub1Array1[arg2] = local593;
			arg0.method5531(local593);
		}
		if ((arg3 & 0x20) != 0) {
			Static340.aByteArray74[arg2] = arg1.method6486();
		}
		if ((arg3 & 0x2000) != 0) {
			arg0.aBoolean422 = arg1.method6433() == 1;
		}
		if ((arg3 & 0x8) != 0) {
			local15 = arg1.method6445();
			local165 = arg1.method6488();
			arg0.method5512(local15, local165, Static66.anInt1741);
			arg0.anInt6593 = Static66.anInt1741 + 300;
			arg0.anInt6589 = arg1.method6472();
		}
		if ((arg3 & 0x8000) != 0) {
			arg0.anInt6536 = arg1.method6468();
			arg0.anInt6554 = arg1.method6441();
			arg0.anInt6560 = arg1.method6441();
			arg0.anInt6578 = arg1.method6441();
			arg0.anInt6570 = arg1.method6455() + Static66.anInt1741;
			arg0.anInt6595 = arg1.method6477() + Static66.anInt1741;
			arg0.anInt6580 = arg1.method6433();
			arg0.anInt6611 = 0;
			if (arg0.aBoolean423) {
				arg0.anInt6578 += arg0.anInt6640;
				arg0.anInt6536 += arg0.anInt6645;
				arg0.anInt6560 += arg0.anInt6645;
				arg0.anInt6613 = 0;
				arg0.anInt6554 += arg0.anInt6640;
			} else {
				arg0.anInt6613 = 1;
				arg0.anInt6578 += arg0.anIntArray459[0];
				arg0.anInt6536 += arg0.anIntArray458[0];
				arg0.anInt6560 += arg0.anIntArray458[0];
				arg0.anInt6554 += arg0.anIntArray459[0];
			}
		}
		if ((arg3 & 0x100) != 0) {
			arg0.aString52 = arg1.method6473();
			if (arg0.aString52.charAt(0) == '~') {
				arg0.aString52 = arg0.aString52.substring(1);
				Static247.method3826(arg0.aString52, 0, arg0.method5532(), 2, arg0.method5536());
			} else if (Static302.aClass3_Sub2_Sub1_Sub2_2 == arg0) {
				Static247.method3826(arg0.aString52, 0, arg0.method5532(), 2, arg0.method5536());
			}
			arg0.anInt6540 = 0;
			arg0.anInt6591 = 0;
			arg0.anInt6539 = 150;
		}
		if (!arg0.aBoolean423) {
			return;
		}
		if (local25 == 127) {
			arg0.method5537(arg0.anInt6645, arg0.anInt6640);
			return;
		}
		@Pc(878) byte local878;
		if (local25 == -1) {
			local878 = Static340.aByteArray74[arg2];
		} else {
			local878 = local25;
		}
		arg0.method5535(local878, arg0.anInt6645, arg0.anInt6640);
	}
}

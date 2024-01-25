import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIIIIB)V")
	public static void method6622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static330.anInt6025 <= arg4 && arg1 <= Static194.anInt3788 && arg5 >= Static120.anInt2491 && Static71.anInt1350 >= arg3) {
			if (arg0 == 1) {
				Static449.method6299(arg5, arg2, arg4, arg3, arg1);
			} else {
				Static232.method3447(arg1, arg0, arg4, arg3, arg5, arg2);
			}
		} else if (arg0 == 1) {
			Static430.method6140(arg4, arg3, arg1, arg2, arg5);
		} else {
			Static568.method7220(arg5, arg4, arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIB[Ljava/lang/Object;[J)V")
	public static void method6623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) long local16 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local16;
		@Pc(30) Object local30 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg0; local50 < arg1; local50++) {
			if (arg3[local50] < (long) (local50 & local48) + local16) {
				@Pc(71) long local71 = arg3[local50];
				arg3[local50] = arg3[local12];
				arg3[local12] = local71;
				@Pc(85) Object local85 = arg2[local50];
				arg2[local50] = arg2[local12];
				arg2[local12++] = local85;
			}
		}
		arg3[arg1] = arg3[local12];
		arg3[local12] = local16;
		arg2[arg1] = arg2[local12];
		arg2[local12] = local30;
		method6623(arg0, local12 - 1, arg2, arg3);
		method6623(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!r;)V")
	public static void method6626(@OriginalArg(1) Class78 arg0) {
		@Pc(7) int local7 = Static405.anInt7239;
		@Pc(9) int local9 = Static130.anInt2592;
		@Pc(11) int local11 = Static570.anInt9417;
		@Pc(15) int local15 = Static563.anInt9345 - 3;
		if (Static567.aClass5_25 == null || Static440.aClass5_34 == null) {
			if (Static121.aClass308_48.method6538(Static500.anInt8737) && Static121.aClass308_48.method6538(Static221.anInt4092)) {
				Static567.aClass5_25 = arg0.method6838(Static604.method6027(Static121.aClass308_48, Static500.anInt8737, 0), true);
				@Pc(44) Class282 local44 = Static604.method6027(Static121.aClass308_48, Static221.anInt4092, 0);
				Static440.aClass5_34 = arg0.method6838(local44, true);
				local44.method6026();
				Static483.aClass5_36 = arg0.method6838(local44, true);
			} else {
				arg0.J(local7, local9, local11, 20, Static593.anInt9729 | 255 - Static138.anInt2724 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static567.aClass5_25 != null && Static440.aClass5_34 != null) {
			local88 = (local11 - Static440.aClass5_34.E() * 2) / Static567.aClass5_25.E();
			for (local90 = 0; local90 < local88; local90++) {
				Static567.aClass5_25.method7795(Static440.aClass5_34.E() + local7 + Static567.aClass5_25.E() * local90, local9);
			}
			Static440.aClass5_34.method7795(local7, local9);
			Static483.aClass5_36.method7795(local7 + local11 - Static483.aClass5_36.E(), local9);
		}
		Static62.aClass96_4.method7257(Static375.aClass253_28.method5453(Static161.anInt3095), local7 + 3, Static306.anInt4906 | 0xFF000000, local9 + 14, -1);
		arg0.J(local7, local9 + 20, local11, local15 - 20, 255 - Static138.anInt2724 << 24 | Static593.anInt9729, 1);
		local88 = Static216.aClass238_1.method5661();
		local90 = Static216.aClass238_1.method5653();
		@Pc(173) int local173 = 0;
		@Pc(196) int local196;
		for (@Pc(178) Class1_Sub40 local178 = (Class1_Sub40) Static166.aClass111_49.method2547(); local178 != null; local178 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			local196 = local9 + (-local173 + Static22.anInt572 - 1) * 16 + 33;
			local173++;
			if (local88 > local7 && local11 + local7 > local88 && local196 - 13 < local90 && local90 < local196 + 4 && local178.aBoolean590) {
				arg0.J(local7, local196 - 12, local11, 16, Static413.anInt7320 | 255 - Static197.anInt3802 << 24, 1);
			}
		}
		if ((Static468.aClass5_35 == null || Static582.aClass5_38 == null || Static83.aClass5_6 == null) && Static121.aClass308_48.method6538(Static162.anInt3144) && Static121.aClass308_48.method6538(Static76.anInt6355) && Static121.aClass308_48.method6538(Static445.anInt7838)) {
			@Pc(270) Class282 local270 = Static604.method6027(Static121.aClass308_48, Static76.anInt6355, 0);
			Static582.aClass5_38 = arg0.method6838(local270, true);
			local270.method6026();
			Static524.aClass5_4 = arg0.method6838(local270, true);
			Static468.aClass5_35 = arg0.method6838(Static604.method6027(Static121.aClass308_48, Static162.anInt3144, 0), true);
			@Pc(295) Class282 local295 = Static604.method6027(Static121.aClass308_48, Static445.anInt7838, 0);
			Static83.aClass5_6 = arg0.method6838(local295, true);
			local295.method6026();
			Static524.aClass5_3 = arg0.method6838(local295, true);
		}
		local173 = 0;
		@Pc(369) int local369;
		@Pc(328) int local328;
		if (Static468.aClass5_35 != null && Static582.aClass5_38 != null && Static83.aClass5_6 != null) {
			local196 = (local11 - Static83.aClass5_6.E() * 2) / Static468.aClass5_35.E();
			for (local328 = 0; local328 < local196; local328++) {
				Static468.aClass5_35.method7795(local7 + Static83.aClass5_6.E() + Static468.aClass5_35.E() * local328, -Static468.aClass5_35.u() + local15 + local9);
			}
			local369 = (local15 - Static83.aClass5_6.u() - 20) / Static582.aClass5_38.u();
			for (@Pc(371) int local371 = 0; local371 < local369; local371++) {
				Static582.aClass5_38.method7795(local7, local9 + local371 * Static582.aClass5_38.u() + 20);
				Static524.aClass5_4.method7795(local11 + local7 - Static524.aClass5_4.E(), local371 * Static582.aClass5_38.u() + local9 - -20);
			}
			Static83.aClass5_6.method7795(local7, local15 + local9 - Static83.aClass5_6.u());
			Static524.aClass5_3.method7795(local7 + local11 - Static83.aClass5_6.E(), local9 - -local15 + -Static83.aClass5_6.u());
		}
		for (@Pc(442) Class1_Sub40 local442 = (Class1_Sub40) Static166.aClass111_49.method2547(); local442 != null; local442 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			local328 = (Static22.anInt572 - local173 - 1) * 16 + local9 + 13 + 20;
			local369 = Static306.anInt4906 | 0xFF000000;
			if (local7 < local88 && local7 + local11 > local88 && local328 - 13 < local90 && local328 + 4 > local90 && local442.aBoolean590) {
				local369 = Static55.anInt1066 | 0xFF000000;
			}
			@Pc(495) int[] local495 = null;
			if (Static176.method2783(local442.anInt7819)) {
				local495 = Static230.aClass225_1.method4857((int) local442.aLong199).anIntArray352;
			} else if (local442.anInt7818 != -1) {
				local495 = Static230.aClass225_1.method4857(local442.anInt7818).anIntArray352;
			} else if (Static308.method4628(local442.anInt7819)) {
				@Pc(573) Class1_Sub33 local573 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local442.aLong199);
				if (local573 != null) {
					@Pc(578) Class11_Sub1_Sub1_Sub3_Sub2 local578 = local573.aClass11_Sub1_Sub1_Sub3_Sub2_2;
					@Pc(581) Class354 local581 = local578.aClass354_1;
					if (local581.anIntArray597 != null) {
						local581 = local581.method7683(Static390.aClass353_29);
					}
					if (local581 != null) {
						local495 = local581.anIntArray595;
					}
				}
			} else if (Static13.method257(local442.anInt7819)) {
				@Pc(540) Class178 local540;
				if (local442.anInt7819 == 1010) {
					local540 = Static347.aClass122_4.method2770((int) local442.aLong199);
				} else {
					local540 = Static347.aClass122_4.method2770((int) (local442.aLong199 >>> 32 & 0x7FFFFFFFL));
				}
				if (local540.anIntArray252 != null) {
					local540 = local540.method3713(Static390.aClass353_29);
				}
				if (local540 != null) {
					local495 = local540.anIntArray253;
				}
			}
			@Pc(607) String local607 = Static262.method3792(local442);
			if (local495 != null) {
				local607 = local607 + Static254.method2368(local495);
			}
			Static62.aClass96_4.method7248(Static230.anIntArray218, local328, local7 + 3, local369, Static519.aClass5Array19, local607);
			if (local442.aBoolean592) {
				Static76.aClass5_22.method7795(Static88.aClass352_7.method7572(local607) + local7 + 5, local328 + -12);
			}
			local173++;
		}
		Static524.method1208(Static570.anInt9417, Static563.anInt9345, Static130.anInt2592, Static405.anInt7239);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ls;BZ)V")
	public static void method6627(@OriginalArg(0) Class11_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) Class114 local11 = arg0.method6073();
		if (arg0.anInt7604 == 0) {
			Static68.anInt1305 = -1;
			Static359.anInt6547 = 0;
			arg0.anInt7605 = 0;
			return;
		}
		if (arg0.anInt7591 != -1 && arg0.anInt7532 == 0) {
			@Pc(39) Class197 local39 = Static223.aClass245_1.method5312(arg0.anInt7591);
			if (arg0.anInt7607 > 0 && local39.anInt5073 == 0) {
				Static68.anInt1305 = -1;
				Static359.anInt6547 = 0;
				arg0.anInt7605++;
				return;
			}
			if (arg0.anInt7607 <= 0 && local39.anInt5064 == 0) {
				Static359.anInt6547 = 0;
				Static68.anInt1305 = -1;
				arg0.anInt7605++;
				return;
			}
		}
		@Pc(108) Class197 local108;
		@Pc(94) Class134 local94;
		if (arg0.anInt7547 != -1 && Static518.anInt9331 >= arg0.anInt7566) {
			local94 = Static583.aClass256_2.method5466(arg0.anInt7547);
			if (local94.aBoolean272 && local94.anInt3775 != -1) {
				local108 = Static223.aClass245_1.method5312(local94.anInt3775);
				if (arg0.anInt7607 > 0 && local108.anInt5073 == 0) {
					Static68.anInt1305 = -1;
					Static359.anInt6547 = 0;
					arg0.anInt7605++;
					return;
				}
				if (arg0.anInt7607 <= 0 && local108.anInt5064 == 0) {
					arg0.anInt7605++;
					Static359.anInt6547 = 0;
					Static68.anInt1305 = -1;
					return;
				}
			}
		}
		if (arg0.anInt7547 != -1 && arg0.anInt7566 <= Static518.anInt9331) {
			local94 = Static583.aClass256_2.method5466(arg0.anInt7547);
			if (local94.aBoolean272 && local94.anInt3775 != -1) {
				local108 = Static223.aClass245_1.method5312(local94.anInt3775);
				if (arg0.anInt7607 > 0 && local108.anInt5073 == 0) {
					Static359.anInt6547 = 0;
					Static68.anInt1305 = -1;
					arg0.anInt7605++;
					return;
				}
				if (arg0.anInt7607 <= 0 && local108.anInt5064 == 0) {
					Static68.anInt1305 = -1;
					arg0.anInt7605++;
					Static359.anInt6547 = 0;
					return;
				}
			}
		}
		@Pc(225) int local225 = arg0.anInt8902;
		@Pc(228) int local228 = arg0.anInt8906;
		@Pc(245) int local245 = arg0.anIntArray455[arg0.anInt7604 - 1] * 512 + arg0.method6058() * 256;
		@Pc(261) int local261 = arg0.anIntArray454[arg0.anInt7604 - 1] * 512 + arg0.method6058() * 256;
		if (local245 > local225) {
			if (local228 < local261) {
				arg0.method6065(10240);
			} else if (local228 > local261) {
				arg0.method6065(14336);
			} else {
				arg0.method6065(12288);
			}
		} else if (local225 <= local245) {
			if (local261 > local228) {
				arg0.method6065(8192);
			} else if (local228 > local261) {
				arg0.method6065(0);
			}
		} else if (local261 > local228) {
			arg0.method6065(6144);
		} else if (local228 > local261) {
			arg0.method6065(2048);
		} else {
			arg0.method6065(4096);
		}
		@Pc(355) byte local355 = arg0.aByteArray75[arg0.anInt7604 - 1];
		if (!arg1 && (local245 - local225 > 1024 || local245 - local225 < -1024 || local261 - local228 > 1024 || local261 - local228 < -1024)) {
			arg0.anInt8902 = local245;
			arg0.anInt8906 = local261;
			arg0.method6072(false, arg0.anInt7522);
			arg0.anInt7604--;
			Static68.anInt1305 = -1;
			Static359.anInt6547 = 0;
			if (arg0.anInt7607 > 0) {
				arg0.anInt7607--;
			}
			return;
		}
		@Pc(416) int local416 = 16;
		@Pc(418) boolean local418 = true;
		if (arg0 instanceof Class11_Sub1_Sub1_Sub3_Sub2) {
			local418 = ((Class11_Sub1_Sub1_Sub3_Sub2) arg0).aClass354_1.aBoolean704;
		}
		@Pc(458) int local458;
		if (local418) {
			local458 = arg0.anInt7522 - arg0.aClass106_7.anInt2824;
			if (local458 != 0 && arg0.anInt7528 == -1 && arg0.anInt7565 != 0) {
				local416 = 8;
			}
			if (!arg1 && arg0.anInt7604 > 2) {
				local416 = 24;
			}
			if (!arg1 && arg0.anInt7604 > 3) {
				local416 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt7604 > 1) {
				local416 = 24;
			}
			if (!arg1 && arg0.anInt7604 > 2) {
				local416 = 32;
			}
		}
		if (arg0.anInt7605 > 0 && arg0.anInt7604 > 1) {
			local416 = 32;
			arg0.anInt7605--;
		}
		if (local355 == 2) {
			local416 <<= 0x1;
		} else if (local355 == 0) {
			local416 >>= 0x1;
		}
		Static359.anInt6547 = 0;
		if (local11.anInt2986 != -1) {
			local416 <<= 0x9;
			if (arg0.anInt7604 == 1) {
				local458 = arg0.anInt7606 * arg0.anInt7606;
				@Pc(569) int local569 = (arg0.anInt8902 <= local245 ? local245 - arg0.anInt8902 : -local245 + arg0.anInt8902) << 9;
				@Pc(587) int local587 = (local261 >= arg0.anInt8906 ? local261 - arg0.anInt8906 : arg0.anInt8906 + -local261) << 9;
				@Pc(598) int local598 = local569 > local587 ? local569 : local587;
				@Pc(605) int local605 = local598 * local11.anInt2986 * 2;
				if (local605 < local458) {
					arg0.anInt7606 /= 2;
				} else if (local598 < local458 / 2) {
					arg0.anInt7606 -= local11.anInt2986;
					if (arg0.anInt7606 < 0) {
						arg0.anInt7606 = 0;
					}
				} else if (arg0.anInt7606 < local416) {
					arg0.anInt7606 += local11.anInt2986;
					if (arg0.anInt7606 > local416) {
						arg0.anInt7606 = local416;
					}
				}
			} else if (local416 > arg0.anInt7606) {
				arg0.anInt7606 += local11.anInt2986;
				if (arg0.anInt7606 > local416) {
					arg0.anInt7606 = local416;
				}
			} else if (arg0.anInt7606 > 0) {
				arg0.anInt7606 -= local11.anInt2986;
				if (arg0.anInt7606 < 0) {
					arg0.anInt7606 = 0;
				}
			}
			local416 = arg0.anInt7606 >> 9;
			if (local416 < 1) {
				local416 = 1;
			}
		}
		if (local245 == local225 && local228 == local261) {
			Static68.anInt1305 = -1;
		} else {
			if (local225 < local245) {
				Static359.anInt6547 |= 0x4;
				arg0.anInt8902 += local416;
				if (arg0.anInt8902 > local245) {
					arg0.anInt8902 = local245;
				}
			} else if (local245 < local225) {
				Static359.anInt6547 |= 0x8;
				arg0.anInt8902 -= local416;
				if (arg0.anInt8902 < local245) {
					arg0.anInt8902 = local245;
				}
			}
			if (local261 > local228) {
				arg0.anInt8906 += local416;
				Static359.anInt6547 |= 0x1;
				if (local261 < arg0.anInt8906) {
					arg0.anInt8906 = local261;
				}
			} else if (local228 > local261) {
				arg0.anInt8906 -= local416;
				Static359.anInt6547 |= 0x2;
				if (local261 > arg0.anInt8906) {
					arg0.anInt8906 = local261;
				}
			}
			if (local416 < 32) {
				Static68.anInt1305 = local355;
			} else {
				Static68.anInt1305 = 2;
			}
		}
		if (arg0.anInt8902 == local245 && arg0.anInt8906 == local261) {
			if (arg0.anInt7607 > 0) {
				arg0.anInt7607--;
			}
			arg0.anInt7604--;
		}
	}
}

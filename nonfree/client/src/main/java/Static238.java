import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
	public static final int[] anIntArray357 = new int[1000];

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt4001 = -1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!oq;IIILclient!wq;ILclient!gh;)V")
	public static void method3230(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub5_Sub2_Sub2 arg5, @OriginalArg(7) Class11_Sub5_Sub2_Sub1 arg6) {
		@Pc(7) Class2_Sub3 local7 = new Class2_Sub3();
		local7.anInt345 = arg4 << 7;
		local7.anInt347 = arg0;
		local7.anInt348 = arg3 << 7;
		if (arg1 != null) {
			local7.aClass192_1 = arg1;
			@Pc(33) int local33 = arg1.anInt5455;
			@Pc(36) int local36 = arg1.anInt5446;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg1.anInt5446;
				local36 = arg1.anInt5455;
			}
			local7.anIntArray36 = arg1.anIntArray463;
			local7.anInt340 = arg3 + local36 << 7;
			local7.anInt339 = arg1.anInt5430;
			local7.anInt344 = arg1.anInt5458 << 7;
			local7.anInt349 = arg1.anInt5436;
			local7.anInt337 = arg1.anInt5414;
			local7.anInt351 = arg1.anInt5456;
			local7.anInt350 = local33 + arg4 << 7;
			if (arg1.anIntArray462 != null) {
				local7.aBoolean15 = true;
				local7.method337();
			}
			if (local7.anIntArray36 != null) {
				local7.anInt342 = local7.anInt339 + (int) ((double) (local7.anInt351 - local7.anInt339) * Math.random());
			}
			Static463.aClass181_52.method3973(local7);
		} else if (arg5 != null) {
			local7.aClass11_Sub5_Sub2_Sub2_1 = arg5;
			@Pc(135) Class82 local135 = arg5.aClass82_1;
			if (local135.anIntArray149 != null) {
				local7.aBoolean15 = true;
				local135 = local135.method1888(Static63.aClass120_2);
			}
			if (local135 != null) {
				local7.anInt340 = arg3 + local135.anInt1963 << 7;
				local7.anInt350 = local135.anInt1963 + arg4 << 7;
				local7.anInt349 = Static442.method5943(arg5);
				local7.anInt337 = local135.anInt1954;
				local7.anInt344 = local135.anInt1944 << 7;
			}
			Static294.aClass181_27.method3973(local7);
		} else if (arg6 != null) {
			local7.aClass11_Sub5_Sub2_Sub1_1 = arg6;
			local7.anInt350 = arg4 + arg6.method6215() << 7;
			local7.anInt340 = arg3 + arg6.method6215() << 7;
			local7.anInt349 = Static363.method5111(arg6);
			local7.anInt337 = arg6.anInt2416;
			local7.anInt344 = arg6.anInt2402 << 7;
			Static271.aClass220_24.method5104(local7, (long) arg6.anInt7670);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
	public static boolean method3232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static186.anInt3290; local1++) {
			@Pc(6) Class160 local6 = Static417.aClass160Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3942 == 1) {
				local15 = local6.anInt3945 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3943 + (local6.anInt3941 * local15 >> 8);
					local37 = local6.anInt3937 + (local6.anInt3932 * local15 >> 8);
					local47 = local6.anInt3929 + (local6.anInt3947 * local15 >> 8);
					local57 = local6.anInt3946 + (local6.anInt3944 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3942 == 2) {
				local15 = arg0 - local6.anInt3945;
				if (local15 > 0) {
					local27 = local6.anInt3943 + (local6.anInt3941 * local15 >> 8);
					local37 = local6.anInt3937 + (local6.anInt3932 * local15 >> 8);
					local47 = local6.anInt3929 + (local6.anInt3947 * local15 >> 8);
					local57 = local6.anInt3946 + (local6.anInt3944 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3942 == 3) {
				local15 = local6.anInt3943 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3945 + (local6.anInt3934 * local15 >> 8);
					local37 = local6.anInt3940 + (local6.anInt3930 * local15 >> 8);
					local47 = local6.anInt3929 + (local6.anInt3947 * local15 >> 8);
					local57 = local6.anInt3946 + (local6.anInt3944 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3942 == 4) {
				local15 = arg2 - local6.anInt3943;
				if (local15 > 0) {
					local27 = local6.anInt3945 + (local6.anInt3934 * local15 >> 8);
					local37 = local6.anInt3940 + (local6.anInt3930 * local15 >> 8);
					local47 = local6.anInt3929 + (local6.anInt3947 * local15 >> 8);
					local57 = local6.anInt3946 + (local6.anInt3944 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3942 == 5) {
				local15 = arg1 - local6.anInt3929;
				if (local15 > 0) {
					local27 = local6.anInt3945 + (local6.anInt3934 * local15 >> 8);
					local37 = local6.anInt3940 + (local6.anInt3930 * local15 >> 8);
					local47 = local6.anInt3943 + (local6.anInt3941 * local15 >> 8);
					local57 = local6.anInt3937 + (local6.anInt3932 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	public static void method3233() {
		Static274.method3920(10);
		Static108.method1795();
		System.gc();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIIII)V")
	public static void method3234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static118.anInt2005 && Static123.anInt2069 >= arg3) {
			@Pc(15) int local15 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2);
			@Pc(21) int local21 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0);
			Static382.method5262(local15, arg1, local21, arg3);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!za;BII)V")
	public static void method3235(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static437.anInt7354 == 0 || Static329.anInt5895 == 0) {
			return;
		}
		arg0.GA(Static204.anInt3500, Static265.anInt4442, Static437.anInt7354, Static329.anInt5895);
		arg0.ba(Static305.anInt167, Static127.anInt2133, Static437.anInt7354, Static329.anInt5895);
		@Pc(35) Class6 local35 = arg0.method6014();
		local35.YA(Static303.anInt4486, Static275.anInt4984, Static86.anInt1452, Static262.anInt4606, Static442.anInt7406, Static460.anInt7742);
		arg0.SA(local35);
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(111) int[] local111;
		@Pc(143) int local143;
		@Pc(152) int local152;
		if (Static114.aClass22Array2 != null) {
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			local59 = arg0.AA();
			local67 = local59 * (arg1 - Static204.anInt3500) / Static437.anInt7354;
			local76 = (arg2 - Static265.anInt4442) * local59 / Static329.anInt5895;
			local79 = arg0.r();
			local87 = (arg1 - Static204.anInt3500) * local79 / Static437.anInt7354;
			local96 = (arg2 - Static265.anInt4442) * local79 / Static329.anInt5895;
			local111 = new int[] { local67, local76, local59 };
			local35.wa(local111);
			@Pc(129) int[] local129 = new int[] { local87, local96, local79 };
			local35.wa(local129);
			@Pc(134) float local134 = 0.0F;
			local143 = local129[0] - local111[0];
			local152 = local129[1] - local111[1];
			@Pc(160) int local160 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				@Pc(173) int local173 = (int) ((float) local111[0] + (float) local143 * local134);
				@Pc(177) int local177 = local173 >> 7;
				@Pc(188) int local188 = (int) (local134 * (float) local160 + (float) local111[2]);
				@Pc(192) int local192 = local188 >> 7;
				if (local177 > 0 && local192 > 0 && Static234.anInt3949 > local177 && local192 < Static371.anInt6492) {
					@Pc(209) int local209 = Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101;
					if (local209 < 3 && (Static326.aByteArrayArrayArray15[1][local177][local192] & 0x2) != 0) {
						local209++;
					}
					if ((float) Static114.aClass22Array2[local209].ca(local173, local188) < (float) local111[1] + (float) local152 * local134) {
						local54 = local173 + (Static127.aClass11_Sub5_Sub2_Sub1_2.method6215() - 1 << 6) >> 7;
						local56 = local188 + (Static127.aClass11_Sub5_Sub2_Sub1_2.method6215() - 1 << 6) >> 7;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local54 != -1 && local56 != -1) {
				if (Static11.aBoolean7 && (Static331.anInt5940 & 0x40) != 0) {
					@Pc(336) Class93 local336 = Static34.method566(anInt4001, Static329.anInt5889);
					if (local336 == null) {
						Static465.method5985();
					} else {
						Static202.method2833(0L, local56, true, false, " ->", -1, local54, Static88.aString38, 25, Static252.anInt4355);
					}
				} else {
					if (Static10.aClass200_1 == Static201.aClass200_4) {
						Static202.method2833(0L, local56, true, false, "", -1, local54, Static431.aClass231_121.method5261(Static80.anInt6195), 60, -1);
					}
					Static202.method2833(0L, local56, true, false, "", -1, local54, Static20.aString3, 47, Static448.anInt7474);
				}
			}
		}
		@Pc(358) Class97 local358 = Static393.aClass97_8;
		for (@Pc(363) Class28_Sub5 local363 = (Class28_Sub5) local358.method2145(); local363 != null; local363 = (Class28_Sub5) local358.method2148()) {
			if ((Static82.aBoolean260 || Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 == local363.anInt5377) && local363.method4281(arg0, arg1, arg2)) {
				@Pc(501) int local501;
				@Pc(512) int local512;
				if (local363.aClass11_1 instanceof Class11_Sub5_Sub2_Sub1) {
					@Pc(387) Class11_Sub5_Sub2_Sub1 local387 = (Class11_Sub5_Sub2_Sub1) local363.aClass11_1;
					local67 = local387.method6215();
					if ((local67 & 0x1) == 0 && (local387.anInt7626 & 0x7F) == 0 && (local387.anInt7622 & 0x7F) == 0 || (local67 & 0x1) == 1 && (local387.anInt7626 & 0x7F) == 64 && (local387.anInt7622 & 0x7F) == 64) {
						local76 = local387.anInt7626 - (local387.method6215() - 1 << 6);
						local79 = local387.anInt7622 - (local387.method6215() - 1 << 6);
						for (local87 = 0; local87 < Static458.anInt7721; local87++) {
							@Pc(471) Class2_Sub34 local471 = (Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local87]);
							if (local471 != null) {
								@Pc(476) Class11_Sub5_Sub2_Sub2 local476 = local471.aClass11_Sub5_Sub2_Sub2_2;
								if (local476.anInt7680 != Static277.anInt5022 && local476.aBoolean513) {
									local501 = local476.anInt7626 - (local476.aClass82_1.anInt1963 - 1 << 6);
									local512 = local476.anInt7622 - (local476.aClass82_1.anInt1963 - 1 << 6);
									if (local76 <= local501 && local476.aClass82_1.anInt1963 <= local387.method6215() - (local501 - local76 >> 7) && local79 <= local512 && local476.aClass82_1.anInt1963 <= local387.method6215() - (local512 - local79 >> 7)) {
										Static85.method1309(local363.anInt5377 != Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101, local476);
										local476.anInt7680 = Static277.anInt5022;
									}
								}
							}
						}
						local96 = Static121.anInt2062;
						local111 = Static311.anIntArray474;
						for (local501 = 0; local501 < local96; local501++) {
							@Pc(592) Class11_Sub5_Sub2_Sub1 local592 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local111[local501]];
							if (local592 != null && local592.anInt7680 != Static277.anInt5022 && local592 != local387 && local592.aBoolean513) {
								local143 = local592.anInt7626 - (local592.method6215() - 1 << 6);
								local152 = local592.anInt7622 - (local592.method6215() - 1 << 6);
								if (local143 >= local76 && local592.method6215() <= local387.method6215() - (local143 - local76 >> 7) && local152 >= local79 && local592.method6215() <= local387.method6215() - (local152 - local79 >> 7)) {
									Static364.method5127(local592, local363.anInt5377 != Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101);
									local592.anInt7680 = Static277.anInt5022;
								}
							}
						}
					}
					if (Static277.anInt5022 == local387.anInt7680) {
						continue;
					}
					Static364.method5127(local387, local363.anInt5377 != Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101);
					local387.anInt7680 = Static277.anInt5022;
				}
				@Pc(837) int local837;
				if (local363.aClass11_1 instanceof Class11_Sub5_Sub2_Sub2) {
					@Pc(723) Class11_Sub5_Sub2_Sub2 local723 = (Class11_Sub5_Sub2_Sub2) local363.aClass11_1;
					if (local723.aClass82_1 != null) {
						if ((local723.aClass82_1.anInt1963 & 0x1) == 0 && (local723.anInt7626 & 0x7F) == 0 && (local723.anInt7622 & 0x7F) == 0 || (local723.aClass82_1.anInt1963 & 0x1) == 1 && (local723.anInt7626 & 0x7F) == 64 && (local723.anInt7622 & 0x7F) == 64) {
							local67 = local723.anInt7626 - (local723.aClass82_1.anInt1963 - 1 << 6);
							local76 = local723.anInt7622 - (local723.aClass82_1.anInt1963 - 1 << 6);
							for (local79 = 0; local79 < Static458.anInt7721; local79++) {
								@Pc(805) Class2_Sub34 local805 = (Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local79]);
								if (local805 != null) {
									@Pc(810) Class11_Sub5_Sub2_Sub2 local810 = local805.aClass11_Sub5_Sub2_Sub2_2;
									if (local810.anInt7680 != Static277.anInt5022 && local723 != local810 && local810.aBoolean513) {
										local837 = local810.anInt7626 - (local810.aClass82_1.anInt1963 - 1 << 6);
										local501 = local810.anInt7622 - (local810.aClass82_1.anInt1963 - 1 << 6);
										if (local837 >= local67 && local723.aClass82_1.anInt1963 - (local837 - local67 >> 7) >= local810.aClass82_1.anInt1963 && local76 <= local501 && local723.aClass82_1.anInt1963 - (local501 - local76 >> 7) >= local810.aClass82_1.anInt1963) {
											Static85.method1309(Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 != local363.anInt5377, local810);
											local810.anInt7680 = Static277.anInt5022;
										}
									}
								}
							}
							local87 = Static121.anInt2062;
							@Pc(916) int[] local916 = Static311.anIntArray474;
							for (local837 = 0; local837 < local87; local837++) {
								@Pc(926) Class11_Sub5_Sub2_Sub1 local926 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local916[local837]];
								if (local926 != null && local926.anInt7680 != Static277.anInt5022 && local926.aBoolean513) {
									local512 = local926.anInt7626 - (local926.method6215() - 1 << 6);
									local143 = local926.anInt7622 - (local926.method6215() - 1 << 6);
									if (local512 >= local67 && local926.method6215() <= local723.aClass82_1.anInt1963 - (local512 - local67 >> 7) && local143 >= local76 && local926.method6215() <= local723.aClass82_1.anInt1963 - (local143 - local76 >> 7)) {
										Static364.method5127(local926, Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 != local363.anInt5377);
										local926.anInt7680 = Static277.anInt5022;
									}
								}
							}
						}
						if (local723.anInt7680 == Static277.anInt5022) {
							continue;
						}
						Static85.method1309(Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 != local363.anInt5377, local723);
						local723.anInt7680 = Static277.anInt5022;
					}
				}
				if (local363.aClass11_1 instanceof Class11_Sub4_Sub1) {
					local59 = Static386.anInt7205 + local363.anInt5379;
					local67 = Static153.anInt2798 + local363.anInt5376;
					@Pc(1089) Class2_Sub43 local1089 = (Class2_Sub43) Static293.aClass220_27.method5099((long) (local363.anInt5377 << 28 | local67 << 14 | local59));
					if (local1089 != null) {
						for (@Pc(1097) Class2_Sub26 local1097 = (Class2_Sub26) local1089.aClass181_47.method3974(); local1097 != null; local1097 = (Class2_Sub26) local1089.aClass181_47.method3966()) {
							@Pc(1105) Class218 local1105 = Static413.aClass271_2.method6193(local1097.anInt4284);
							if (!Static11.aBoolean7) {
								if (Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 == local363.anInt5377) {
									@Pc(1177) String[] local1177 = local1105.aStringArray61;
									for (local837 = 4; local837 >= 0; local837--) {
										if (local1177 != null && local1177[local837] != null) {
											@Pc(1189) byte local1189 = 0;
											local512 = Static385.anInt6687;
											if (local837 == 0) {
												local1189 = 15;
											}
											if (local837 == 1) {
												local1189 = 3;
											}
											if (local837 == 2) {
												local1189 = 57;
											}
											if (local837 == 3) {
												local1189 = 23;
											}
											if (local837 == local1105.anInt6296) {
												local512 = local1105.anInt6300;
											}
											if (local837 == 4) {
												local1189 = 44;
											}
											if (local1105.anInt6267 == local837) {
												local512 = local1105.anInt6299;
											}
											Static202.method2833((long) local1097.anInt4284, local363.anInt5376, true, false, "<col=ff9040>" + local1105.aString65, -1, local363.anInt5379, local1177[local837], local1189, local512);
										}
									}
								}
								Static202.method2833((long) local1097.anInt4284, local363.anInt5376, true, local363.anInt5377 != Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101, "<col=ff9040>" + local1105.aString65, -1, local363.anInt5379, Static195.aClass231_65.method5261(Static80.anInt6195), 1006, Static229.anInt3813);
							} else if (Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 == local363.anInt5377) {
								@Pc(1122) Class198 local1122 = Static456.anInt7598 == -1 ? null : Static275.aClass235_1.method5382(Static456.anInt7598);
								if ((Static331.anInt5940 & 0x1) != 0 && (local1122 == null || local1105.method5010(local1122.anInt5653, Static456.anInt7598) != local1122.anInt5653)) {
									Static202.method2833((long) local1097.anInt4284, local363.anInt5376, true, false, Static359.aString66 + " -> <col=ff9040>" + local1105.aString65, -1, local363.anInt5379, Static88.aString38, 45, Static252.anInt4355);
								}
							}
						}
					}
				}
				if (local363.aClass11_1 instanceof Interface6) {
					@Pc(1331) Interface6 local1331 = (Interface6) local363.aClass11_1;
					@Pc(1340) Class192 local1340 = Static249.aClass39_2.method748(local1331.method5718());
					if (local1340.anIntArray462 != null) {
						local1340 = local1340.method4323(Static63.aClass120_2);
					}
					if (local1340 != null) {
						if (!Static11.aBoolean7) {
							if (Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 == local363.anInt5377) {
								@Pc(1360) String[] local1360 = local1340.aStringArray50;
								if (local1360 != null) {
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1360[local79] != null) {
											@Pc(1372) short local1372 = 0;
											local96 = Static385.anInt6687;
											if (local79 == 0) {
												local1372 = 51;
											}
											if (local79 == 1) {
												local1372 = 50;
											}
											if (local79 == 2) {
												local1372 = 9;
											}
											if (local79 == 3) {
												local1372 = 12;
											}
											if (local1340.anInt5411 == local79) {
												local96 = local1340.anInt5449;
											}
											if (local79 == 4) {
												local1372 = 1002;
											}
											if (local1340.anInt5454 == local79) {
												local96 = local1340.anInt5451;
											}
											Static202.method2833(Static205.method2888(local363.anInt5379, local363.anInt5376, local1331), local363.anInt5376, true, false, "<col=00ffff>" + local1340.aString45, -1, local363.anInt5379, local1360[local79], local1372, local96);
										}
									}
								}
							}
							Static202.method2833((long) local1340.anInt5422, local363.anInt5376, true, Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 != local363.anInt5377, "<col=00ffff>" + local1340.aString45, -1, local363.anInt5379, Static195.aClass231_65.method5261(Static80.anInt6195), 1007, Static229.anInt3813);
						} else if (local363.anInt5377 == Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101) {
							@Pc(1521) Class198 local1521 = Static456.anInt7598 == -1 ? null : Static275.aClass235_1.method5382(Static456.anInt7598);
							if ((Static331.anInt5940 & 0x4) != 0 && (local1521 == null || local1340.method4308(local1521.anInt5653, Static456.anInt7598) != local1521.anInt5653)) {
								Static202.method2833(Static205.method2888(local363.anInt5379, local363.anInt5376, local1331), local363.anInt5376, true, false, Static359.aString66 + " -> <col=00ffff>" + local1340.aString45, -1, local363.anInt5379, Static88.aString38, 2, Static252.anInt4355);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ot;Lclient!ce;)V")
	public static void method3236(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class36 arg1) {
		if (!arg1.aBoolean32) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort3;
		@Pc(9) short local9 = arg1.aShort4;
		@Pc(12) byte local12 = arg1.aByte4;
		@Pc(15) byte local15 = arg1.aByte2;
		@Pc(21) int local21 = (local6 << Static146.anInt2674) + Static417.anInt7156;
		@Pc(27) int local27 = (local9 << Static146.anInt2674) + Static417.anInt7156;
		@Pc(31) Class36[][] local31 = Static175.aClass36ArrayArrayArray1[local12];
		@Pc(53) float local53;
		if (Static46.aClass22Array1 == Static241.aClass22Array3) {
			Static29.aClass75_4.a(Static114.aClass22Array2[0].ca(local21, local27), Static183.method2649(local6, local9), Static25.method5839(local6, local9), Static92.method1396(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static29.aClass75_4.da(3000.0F, local53 * 1.5F);
		@Pc(86) Class36 local86;
		@Pc(616) Class28_Sub5 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class28_Sub5 local377;
		@Pc(408) int local408;
		@Pc(411) Class11_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean31) {
			if (Static241.aBoolean268) {
				if (local12 > 0) {
					local86 = Static175.aClass36ArrayArrayArray1[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean32) {
						return;
					}
				}
				if (local6 <= Static308.anInt5540 && local6 > Static152.anInt2787) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean32 && (local86.aBoolean31 || (arg1.aByte7 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static308.anInt5540 && local6 < Static352.anInt6218 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean32 && (local86.aBoolean31 || (arg1.aByte7 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static109.anInt1838 && local9 > Static371.anInt6494) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean32 && (local86.aBoolean31 || (arg1.aByte7 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static109.anInt1838 && local9 < Static450.anInt7752 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean32 && (local86.aBoolean31 || (arg1.aByte7 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static241.aBoolean268 = true;
			}
			arg1.aBoolean31 = false;
			if (arg1.aClass36_1 != null) {
				local86 = arg1.aClass36_1;
				Static29.aClass75_4.da(3000.0F, (201.5F - (float) (local86.aByte2 + 1) * 50.0F) * 1.5F);
				if (!Static50.method775(local86.aByte2, local6, local9)) {
					Static241.aClass22Array3[local86.aByte2].method2327(local6, local9);
				}
				@Pc(249) Class11_Sub1 local249 = local86.aClass11_Sub1_2;
				if (local249 != null) {
					if (Static457.aBoolean511) {
						if ((local249.anInt3191 & arg1.aShort2) == 0) {
							Static272.method3911(arg0, local12, local6, local9);
						} else {
							Static374.method5205(arg0, local249.anInt3191, local15, local6, local9);
						}
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					local249.method6205(Static29.aClass75_4);
				}
				for (@Pc(286) Class195 local286 = local86.aClass195_1; local286 != null; local286 = local286.aClass195_2) {
					@Pc(290) Class11_Sub5 local290 = local286.aClass11_Sub5_1;
					if (local290 != null) {
						if (Static457.aBoolean511) {
							Static272.method3911(arg0, local12, local6, local9);
							Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
						}
						local290.method6205(Static29.aClass75_4);
					}
				}
				Static29.aClass75_4.da(3000.0F, local53 * 1.5F);
			}
			local330 = !Static50.method775(local15, local6, local9);
			if (local330) {
				Static241.aClass22Array3[local15].method2327(local6, local9);
				@Pc(341) Class11_Sub3 local341 = arg1.aClass11_Sub3_1;
				if (local341 != null && local341.aBoolean430) {
					if (local341.aBoolean427) {
						Static29.aClass75_4.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					local377 = local341.method6205(Static29.aClass75_4);
					if (local377 != null) {
						local377.aClass11_1 = local341;
						local377.anInt5377 = local12;
						local377.anInt5379 = local6;
						local377.anInt5376 = local9;
						Static393.aClass97_8.method2154(local377);
					}
					if (local341.aBoolean427) {
						Static29.aClass75_4.da(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass11_Sub1_2;
			@Pc(414) Class11_Sub2 local414 = arg1.aClass11_Sub2_1;
			if (local411 != null || local414 != null) {
				if (Static308.anInt5540 == local6) {
					local406++;
				} else if (Static308.anInt5540 < local6) {
					local406 += 2;
				}
				if (Static109.anInt1838 == local9) {
					local406 += 3;
				} else if (Static109.anInt1838 > local9) {
					local406 += 6;
				}
				local408 = Static143.anIntArray226[local406];
				arg1.aShort2 = Static99.aShortArray16[local406];
			}
			if (local411 != null) {
				if ((local411.anInt3191 & Static346.anIntArray514[local406]) == 0) {
					arg1.aByte3 = 0;
				} else if (local411.anInt3191 == 16) {
					arg1.aByte3 = 3;
					arg1.aByte6 = Static431.aByteArray88[local406];
					arg1.aByte8 = (byte) (3 - arg1.aByte6);
				} else if (local411.anInt3191 == 32) {
					arg1.aByte3 = 6;
					arg1.aByte6 = Static211.aByteArray48[local406];
					arg1.aByte8 = (byte) (6 - arg1.aByte6);
				} else if (local411.anInt3191 == 64) {
					arg1.aByte3 = 12;
					arg1.aByte6 = Static249.aByteArray54[local406];
					arg1.aByte8 = (byte) (12 - arg1.aByte6);
				} else {
					arg1.aByte3 = 9;
					arg1.aByte6 = Static357.aByteArray67[local406];
					arg1.aByte8 = (byte) (9 - arg1.aByte6);
				}
				if ((local411.anInt3191 & local408) != 0 && !Static75.method1140(local15, local6, local9, local411.anInt3191)) {
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					@Pc(563) Class28_Sub5 local563 = local411.method6205(Static29.aClass75_4);
					if (local563 != null) {
						local563.aClass11_1 = local411;
						local563.anInt5377 = local12;
						local563.anInt5379 = local6;
						local563.anInt5376 = local9;
						Static393.aClass97_8.method2154(local563);
					}
				}
				@Pc(584) Class11_Sub1 local584 = arg1.aClass11_Sub1_3;
				if (local584 != null && (local584.anInt3191 & local408) != 0 && !Static75.method1140(local15, local6, local9, local584.anInt3191)) {
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					local616 = local584.method6205(Static29.aClass75_4);
					if (local616 != null) {
						local616.aClass11_1 = local584;
						local616.anInt5377 = local12;
						local616.anInt5379 = local6;
						local616.anInt5376 = local9;
						Static393.aClass97_8.method2154(local616);
					}
				}
			}
			if (local414 != null && !Static410.method5653(local15, local6, local9, local414.method3586())) {
				@Pc(647) Class11_Sub2 local647 = arg1.aClass11_Sub2_2;
				Static29.aClass75_4.da(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt4483 & local408) != 0) {
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					local616 = local414.method6205(Static29.aClass75_4);
					if (local616 != null) {
						local616.aClass11_1 = local414;
						local616.anInt5377 = local12;
						local616.anInt5379 = local6;
						local616.anInt5376 = local9;
						Static393.aClass97_8.method2154(local616);
					}
				} else if (local414.anInt4483 == 256) {
					local706 = local414.anInt4485 - Static268.anInt4658;
					local711 = local414.anInt4487 - Static171.anInt5502;
					local714 = local414.anInt4488;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					@Pc(759) Class28_Sub5 local759;
					if (local735 < local723) {
						local759 = local414.method6205(Static29.aClass75_4);
						if (local759 != null) {
							local759.aClass11_1 = local414;
							local759.anInt5377 = local12;
							local759.anInt5379 = local6;
							local759.anInt5376 = local9;
							Static393.aClass97_8.method2154(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6205(Static29.aClass75_4);
						if (local759 != null) {
							local759.aClass11_1 = local647;
							local759.anInt5377 = local12;
							local759.anInt5379 = local6;
							local759.anInt5376 = local9;
							Static393.aClass97_8.method2154(local759);
						}
					}
				}
				Static29.aClass75_4.da(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class11_Sub3 local814 = arg1.aClass11_Sub3_1;
				if (local814 != null && !local814.aBoolean430) {
					if (local814.aBoolean427) {
						Static29.aClass75_4.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					local616 = local814.method6205(Static29.aClass75_4);
					if (local616 != null) {
						local616.aClass11_1 = local814;
						local616.anInt5377 = local12;
						local616.anInt5379 = local6;
						local616.anInt5376 = local9;
						Static393.aClass97_8.method2154(local616);
					}
					if (local814.aBoolean427) {
						Static29.aClass75_4.da(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class11_Sub4 local880 = arg1.aClass11_Sub4_1;
				if (local880 != null && !local880.aBoolean394) {
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					@Pc(903) Class28_Sub5 local903 = local880.method6205(Static29.aClass75_4);
					if (local903 != null) {
						local903.aClass11_1 = local880;
						local903.anInt5377 = local12;
						local903.anInt5379 = local6;
						local903.anInt5376 = local9;
						Static393.aClass97_8.method2154(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte7;
			if (local924 != 0) {
				@Pc(941) Class36 local941;
				if (local6 < Static308.anInt5540 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean32) {
						Static45.aClass20_1.method5680(local941);
					}
				}
				if (local9 < Static109.anInt1838 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean32) {
						Static45.aClass20_1.method5680(local941);
					}
				}
				if (local6 > Static308.anInt5540 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean32) {
						Static45.aClass20_1.method5680(local941);
					}
				}
				if (local9 > Static109.anInt1838 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean32) {
						Static45.aClass20_1.method5680(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class11_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class195 local1030;
		if (arg1.aByte3 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass195_1; local1030 != null; local1030 = local1030.aClass195_2) {
				if (local1030.aClass11_Sub5_1.anInt7623 != Static455.anInt7589 && (local1030.anInt5542 & arg1.aByte3) == arg1.aByte6) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass11_Sub1_2;
				if (!Static75.method1140(local15, local6, local9, local1057.anInt3191)) {
					if (Static457.aBoolean511) {
						label682: {
							if (local1057.anInt3191 >= 16) {
								local1074 = local6 - Static308.anInt5540;
								local1078 = local9 - Static109.anInt1838;
								if (local1057.anInt3191 == 16) {
									local1074 -= Static417.anInt7156;
									local1078 += Static417.anInt7156;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static104.anInt1675) {
										Static272.method3911(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt3191 == 32) {
									local1074 += Static417.anInt7156;
									local1078 += Static417.anInt7156;
									if (local1078 < -local1074 && local6 < Static212.anInt3636 && local9 < Static104.anInt1675) {
										Static272.method3911(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt3191 == 64) {
									local1074 += Static417.anInt7156;
									local1078 -= Static417.anInt7156;
									if (local1078 > local1074 && local6 < Static212.anInt3636 && local9 > 0) {
										Static272.method3911(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt3191 == 128) {
									local1074 -= Static417.anInt7156;
									local1078 -= Static417.anInt7156;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static272.method3911(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static272.method3911(arg0, local12, local6, local9);
						}
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					@Pc(1216) Class28_Sub5 local1216 = local1057.method6205(Static29.aClass75_4);
					if (local1216 != null) {
						local1216.aClass11_1 = local1057;
						local1216.anInt5377 = local12;
						local1216.anInt5379 = local6;
						local1216.anInt5376 = local9;
						Static393.aClass97_8.method2154(local1216);
					}
				}
				arg1.aByte3 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean33) {
			try {
				arg1.aBoolean33 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass195_1; local1030 != null; local1030 = local1030.aClass195_2) {
					@Pc(1252) Class11_Sub5 local1252 = local1030.aClass11_Sub5_1;
					if (local1252.anInt7623 != Static455.anInt7589) {
						for (local1074 = local1252.aShort108; local1074 <= local1252.aShort107; local1074++) {
							for (local1078 = local1252.aShort109; local1078 <= local1252.aShort106; local1078++) {
								@Pc(1270) Class36 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean31) {
									arg1.aBoolean33 = true;
									continue label625;
								}
								if (local1270.aByte3 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort108) {
										local706++;
									}
									if (local1074 < local1252.aShort107) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort109) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort106) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte3) == arg1.aByte8) {
										arg1.aBoolean33 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static308.anInt5540 - local1252.aShort108;
						local1333 = local1252.aShort107 - Static308.anInt5540;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static109.anInt1838 - local1252.aShort109;
						local711 = local1252.aShort106 - Static109.anInt1838;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass11_Sub5Array2[local1245] = local1252;
						arg0.anIntArray21[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class11_Sub5 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass11_Sub5Array2[local1078];
						if (local1384.anInt7623 != Static455.anInt7589) {
							local706 = arg0.anIntArray21[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7626 - Static268.anInt4658;
								local714 = local1384.anInt7622 - Static171.anInt5502;
								local723 = arg0.aClass11_Sub5Array2[local1074].anInt7626 - Static268.anInt4658;
								local735 = arg0.aClass11_Sub5Array2[local1074].anInt7622 - Static171.anInt5502;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass11_Sub5Array2[local1074];
					local1384.anInt7623 = Static455.anInt7589;
					if (!Static421.method5771(local15, local1384.aShort108, local1384.aShort107, local1384.aShort109, local1384.aShort106, local1384.method6213())) {
						if (Static457.aBoolean511) {
							if (local1384.aByte100 == 0) {
								Static266.method3703(arg0, local12, local1384.aShort108, local1384.aShort109, local1384.aShort107, local1384.aShort106);
							} else {
								Static272.method3911(arg0, local12, local6, local9);
								local706 = local6 - Static308.anInt5540;
								local711 = local9 - Static109.anInt1838;
								if (local1384.aByte100 == 2) {
									if (local711 > -local706) {
										Static319.method4542(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static319.method4542(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static319.method4542(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static319.method4542(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
						}
						local616 = local1384.method6205(Static29.aClass75_4);
						if (local616 != null) {
							local616.aClass11_1 = local1384;
							local616.anInt5377 = local12;
							local616.anInt5379 = local1384.aShort108;
							local616.anInt5376 = local1384.aShort109;
							Static393.aClass97_8.method2154(local616);
						}
					}
					for (local706 = local1384.aShort108; local706 <= local1384.aShort107; local706++) {
						for (local711 = local1384.aShort109; local711 <= local1384.aShort106; local711++) {
							@Pc(1609) Class36 local1609 = local31[local706][local711];
							if (local1609.aByte3 != 0) {
								Static45.aClass20_1.method5680(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean32) {
								Static45.aClass20_1.method5680(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean33) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean33 = false;
			}
		}
		if (arg1.aClass56_2 != null && arg1.aByte5 == (byte) (Static399.anInt6981 & 0xFF)) {
			@Pc(1664) Class56 local1664 = arg1.aClass56_2;
			local406 = Static241.aClass22Array3[local12].ua(local6, local9);
			if (local12 < Static180.anInt3181 - 1) {
				local408 = Static241.aClass22Array3[local12].ua(local6, local9) - Static241.aClass22Array3[local12 + 1].ua(local6, local9);
			} else {
				local408 = 0x8 << Static146.anInt2674;
			}
			Static34.aClass6_1.method4658(local21, local406, local27, arg0.anIntArray20);
			local1074 = arg0.anIntArray20[2];
			Static34.aClass6_1.method4658(local21, local406 - local408, local27, arg0.anIntArray20);
			local1078 = arg0.anIntArray20[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static315.anInt5650;
			local706 += Static315.anInt5650;
			local1664.anInt1244 = local1333;
			local1664.anInt1243 = local706;
			local1664.aBoolean67 = true;
			Static29.aClass75_4.method5957(local1664);
		}
		if (!arg1.aBoolean32) {
			return;
		}
		if (arg1.aByte3 != 0) {
			return;
		}
		if (local6 <= Static308.anInt5540 && local6 > Static152.anInt2787) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean32) {
				return;
			}
		}
		if (local6 >= Static308.anInt5540 && local6 < Static352.anInt6218 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean32) {
				return;
			}
		}
		if (local9 <= Static109.anInt1838 && local9 > Static371.anInt6494) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean32) {
				return;
			}
		}
		if (local9 >= Static109.anInt1838 && local9 < Static450.anInt7752 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean32) {
				return;
			}
		}
		arg1.aBoolean32 = false;
		Static346.anInt6124--;
		@Pc(1855) Class11_Sub4 local1855 = arg1.aClass11_Sub4_1;
		if (local1855 != null && local1855.aBoolean394) {
			if (Static457.aBoolean511) {
				Static272.method3911(arg0, local12, local6, local9);
				Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
			}
			@Pc(1878) Class28_Sub5 local1878 = local1855.method6205(Static29.aClass75_4);
			if (local1878 != null) {
				local1878.aClass11_1 = local1855;
				local1878.anInt5377 = local12;
				local1878.anInt5379 = local6;
				local1878.anInt5376 = local9;
				Static393.aClass97_8.method2154(local1878);
			}
		}
		if (arg1.aShort2 != 0) {
			@Pc(1902) Class11_Sub2 local1902 = arg1.aClass11_Sub2_1;
			if (local1902 != null && !Static410.method5653(local15, local6, local9, local1902.method3586())) {
				if ((local1902.anInt4483 & arg1.aShort2) != 0) {
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					local377 = local1902.method6205(Static29.aClass75_4);
					if (local377 != null) {
						local377.aClass11_1 = local1902;
						local377.anInt5377 = local12;
						local377.anInt5379 = local6;
						local377.anInt5376 = local9;
						Static393.aClass97_8.method2154(local377);
					}
				} else if (local1902.anInt4483 == 256) {
					local408 = local1902.anInt4485 - Static268.anInt4658;
					local1074 = local1902.anInt4487 - Static171.anInt5502;
					local1078 = local1902.anInt4488;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static457.aBoolean511) {
						Static272.method3911(arg0, local12, local6, local9);
						Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
					}
					@Pc(2012) Class11_Sub2 local2012 = arg1.aClass11_Sub2_2;
					@Pc(2020) Class28_Sub5 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method6205(Static29.aClass75_4);
						if (local2020 != null) {
							local2020.aClass11_1 = local1902;
							local2020.anInt5377 = local12;
							local2020.anInt5379 = local6;
							local2020.anInt5376 = local9;
							Static393.aClass97_8.method2154(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method6205(Static29.aClass75_4);
						if (local2020 != null) {
							local2020.aClass11_1 = local2012;
							local2020.anInt5377 = local12;
							local2020.anInt5379 = local6;
							local2020.anInt5376 = local9;
							Static393.aClass97_8.method2154(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass11_Sub1_2;
			local411 = arg1.aClass11_Sub1_3;
			@Pc(2105) Class28_Sub5 local2105;
			if (local411 != null && (local411.anInt3191 & arg1.aShort2) != 0 && !Static75.method1140(local15, local6, local9, local411.anInt3191)) {
				if (Static457.aBoolean511) {
					Static374.method5205(arg0, local411.anInt3191, local12, local6, local9);
					Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
				}
				local2105 = local411.method6205(Static29.aClass75_4);
				if (local2105 != null) {
					local2105.aClass11_1 = local411;
					local2105.anInt5377 = local12;
					local2105.anInt5379 = local6;
					local2105.anInt5376 = local9;
					Static393.aClass97_8.method2154(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt3191 & arg1.aShort2) != 0 && !Static75.method1140(local15, local6, local9, local1057.anInt3191)) {
				if (Static457.aBoolean511) {
					Static374.method5205(arg0, local1057.anInt3191, local12, local6, local9);
					Static29.aClass75_4.method6018(arg0.anInt164, arg0.aClass2_Sub4Array2);
				}
				local2105 = local1057.method6205(Static29.aClass75_4);
				if (local2105 != null) {
					local2105.aClass11_1 = local1057;
					local2105.anInt5377 = local12;
					local2105.anInt5379 = local6;
					local2105.anInt5376 = local9;
					Static393.aClass97_8.method2154(local2105);
				}
			}
		}
		@Pc(2191) Class36 local2191;
		if (local12 < Static180.anInt3181 - 1) {
			local2191 = Static175.aClass36ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean32) {
				Static45.aClass20_1.method5679(local2191);
			}
		}
		if (local6 < Static308.anInt5540) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean32) {
				Static45.aClass20_1.method5680(local2191);
			}
		}
		if (local9 < Static109.anInt1838) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean32) {
				Static45.aClass20_1.method5680(local2191);
			}
		}
		if (local6 > Static308.anInt5540) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean32) {
				Static45.aClass20_1.method5680(local2191);
			}
		}
		if (local9 > Static109.anInt1838) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean32) {
				Static45.aClass20_1.method5680(local2191);
			}
		}
	}
}

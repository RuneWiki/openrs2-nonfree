import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)V")
	public static void method4441() {
		Static213.aClass80_1 = new Class80(8);
		Static246.anInt5006 = 0;
		for (@Pc(19) Class30_Sub7 local19 = (Class30_Sub7) Static84.aClass77_5.method2157(); local19 != null; local19 = (Class30_Sub7) Static84.aClass77_5.method2160()) {
			local19.method5900();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!qa;II)V")
	public static void method4442(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static147.anInt3077 == 0 || Static373.anInt6920 == 0) {
			return;
		}
		arg1.b(Static79.anInt1504, Static324.anInt6228, Static147.anInt3077, Static373.anInt6920);
		arg1.N(Static319.anInt6178, Static19.anInt7581, Static147.anInt3077, Static373.anInt6920);
		@Pc(35) Class78 local35 = arg1.method7011();
		local35.B(Static416.anInt7368, Static398.anInt7149, Static267.anInt5244, Static283.anInt5788, Static255.anInt5114, Static389.anInt7025);
		arg1.method7068(local35);
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(109) int[] local109;
		@Pc(140) int local140;
		@Pc(148) int local148;
		if (Static493.aClass131Array5 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			local55 = arg1.c();
			local64 = (arg2 - Static79.anInt1504) * local55 / Static147.anInt3077;
			local73 = (arg0 - Static324.anInt6228) * local55 / Static373.anInt6920;
			local76 = arg1.CA();
			local85 = (arg2 - Static79.anInt1504) * local76 / Static147.anInt3077;
			local94 = local76 * (arg0 - Static324.anInt6228) / Static373.anInt6920;
			local109 = new int[] { local64, local73, local55 };
			local35.va(local109);
			@Pc(127) int[] local127 = new int[] { local85, local94, local76 };
			local35.va(local127);
			@Pc(132) float local132 = 0.0F;
			local140 = local127[0] - local109[0];
			local148 = local127[1] - local109[1];
			@Pc(157) int local157 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				@Pc(170) int local170 = (int) (local132 * (float) local140 + (float) local109[0]);
				@Pc(174) int local174 = local170 >> 7;
				@Pc(185) int local185 = (int) ((float) local157 * local132 + (float) local109[2]);
				@Pc(189) int local189 = local185 >> 7;
				if (local174 > 0 && local189 > 0 && local174 < Static460.anInt7894 && Static235.anInt4493 > local189) {
					@Pc(212) int local212 = Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91;
					if (local212 < 3 && (Static429.aByteArrayArrayArray17[1][local174][local189] & 0x2) != 0) {
						local212++;
					}
					if ((float) Static493.aClass131Array5[local212].aa(local170, local185) < (float) local109[1] + local132 * (float) local148) {
						local50 = local170 + (Static35.aClass15_Sub2_Sub1_Sub1_1.method4035() - 1 << 6) >> 7;
						local52 = (Static35.aClass15_Sub2_Sub1_Sub1_1.method4035() - 1 << 6) + local185 >> 7;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static479.aBoolean594 && (Static354.anInt6690 & 0x40) != 0) {
					@Pc(336) Class220 local336 = Static485.method6724(Static496.anInt8516, Static207.anInt3882);
					if (local336 == null) {
						Static187.method3151();
					} else {
						Static371.method5606(Static186.anInt3582, local52, 20, -1, true, 0L, local50, Static150.aString37, false, " ->");
					}
				} else {
					if (Static525.aClass155_4 == Static53.aClass155_1) {
						Static371.method5606(-1, local52, 59, -1, true, 0L, local50, Static426.aClass40_122.method1063(Static194.anInt3737), false, "");
					}
					Static371.method5606(Static399.anInt7152, local52, 46, -1, true, 0L, local50, Static222.aString80, false, "");
				}
			}
		}
		@Pc(358) Class77 local358 = Static541.aClass77_13;
		for (@Pc(369) Class30_Sub1 local369 = (Class30_Sub1) local358.method2157(); local369 != null; local369 = (Class30_Sub1) local358.method2160()) {
			if ((Static409.aBoolean518 || Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local369.anInt915) && local369.method851(arg0, arg2, arg1)) {
				@Pc(499) int local499;
				@Pc(511) int local511;
				if (local369.aClass15_1 instanceof Class15_Sub2_Sub1_Sub1) {
					@Pc(393) Class15_Sub2_Sub1_Sub1 local393 = (Class15_Sub2_Sub1_Sub1) local369.aClass15_1;
					local64 = local393.method4035();
					if ((local64 & 0x1) == 0 && (local393.anInt8492 & 0x7F) == 0 && (local393.anInt8493 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local393.anInt8492 & 0x7F) == 64 && (local393.anInt8493 & 0x7F) == 64) {
						local73 = local393.anInt8492 - (local393.method4035() - 1 << 6);
						local76 = local393.anInt8493 - (local393.method4035() - 1 << 6);
						for (local85 = 0; local85 < Static438.anInt7689; local85++) {
							@Pc(474) Class5_Sub51 local474 = (Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local85]);
							if (local474 != null) {
								@Pc(479) Class15_Sub2_Sub1_Sub2 local479 = local474.aClass15_Sub2_Sub1_Sub2_2;
								if (Static481.anInt8318 != local479.anInt4746 && local479.aBoolean300) {
									local499 = local479.anInt8492 - (local479.aClass305_1.anInt8815 - 1 << 6);
									local511 = local479.anInt8493 - (local479.aClass305_1.anInt8815 - 1 << 6);
									if (local499 >= local73 && local479.aClass305_1.anInt8815 <= local393.method4035() - (local499 - local73 >> 7) && local76 <= local511 && local479.aClass305_1.anInt8815 <= local393.method4035() - (local511 - local76 >> 7)) {
										Static130.method2414(local369.anInt915 != Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, local479);
										local479.anInt4746 = Static481.anInt8318;
									}
								}
							}
						}
						local94 = Static103.anInt992;
						local109 = Static523.anIntArray682;
						for (local499 = 0; local499 < local94; local499++) {
							@Pc(594) Class15_Sub2_Sub1_Sub1 local594 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local109[local499]];
							if (local594 != null && Static481.anInt8318 != local594.anInt4746 && local393 != local594 && local594.aBoolean300) {
								local140 = local594.anInt8492 - (local594.method4035() - 1 << 6);
								local148 = local594.anInt8493 - (local594.method4035() - 1 << 6);
								if (local140 >= local73 && local594.method4035() <= local393.method4035() - (local140 - local73 >> 7) && local76 <= local148 && local594.method4035() <= local393.method4035() - (local148 - local76 >> 7)) {
									Static134.method2520(local369.anInt915 != Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, local594);
									local594.anInt4746 = Static481.anInt8318;
								}
							}
						}
					}
					if (Static481.anInt8318 == local393.anInt4746) {
						continue;
					}
					Static134.method2520(local369.anInt915 != Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, local393);
					local393.anInt4746 = Static481.anInt8318;
				}
				@Pc(854) int local854;
				if (local369.aClass15_1 instanceof Class15_Sub2_Sub1_Sub2) {
					@Pc(740) Class15_Sub2_Sub1_Sub2 local740 = (Class15_Sub2_Sub1_Sub2) local369.aClass15_1;
					if (local740.aClass305_1 != null) {
						if ((local740.aClass305_1.anInt8815 & 0x1) == 0 && (local740.anInt8492 & 0x7F) == 0 && (local740.anInt8493 & 0x7F) == 0 || (local740.aClass305_1.anInt8815 & 0x1) == 1 && (local740.anInt8492 & 0x7F) == 64 && (local740.anInt8493 & 0x7F) == 64) {
							local64 = local740.anInt8492 - (local740.aClass305_1.anInt8815 - 1 << 6);
							local73 = local740.anInt8493 - (local740.aClass305_1.anInt8815 - 1 << 6);
							for (local76 = 0; local76 < Static438.anInt7689; local76++) {
								@Pc(821) Class5_Sub51 local821 = (Class5_Sub51) Static521.aClass42_42.method1109((long) Static547.anIntArray731[local76]);
								if (local821 != null) {
									@Pc(826) Class15_Sub2_Sub1_Sub2 local826 = local821.aClass15_Sub2_Sub1_Sub2_2;
									if (Static481.anInt8318 != local826.anInt4746 && local740 != local826 && local826.aBoolean300) {
										local854 = local826.anInt8492 - (local826.aClass305_1.anInt8815 - 1 << 6);
										local499 = local826.anInt8493 - (local826.aClass305_1.anInt8815 - 1 << 6);
										if (local64 <= local854 && local740.aClass305_1.anInt8815 - (local854 - local64 >> 7) >= local826.aClass305_1.anInt8815 && local499 >= local73 && local826.aClass305_1.anInt8815 <= local740.aClass305_1.anInt8815 - (local499 - local73 >> 7)) {
											Static130.method2414(Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 != local369.anInt915, local826);
											local826.anInt4746 = Static481.anInt8318;
										}
									}
								}
							}
							local85 = Static103.anInt992;
							@Pc(936) int[] local936 = Static523.anIntArray682;
							for (local854 = 0; local854 < local85; local854++) {
								@Pc(946) Class15_Sub2_Sub1_Sub1 local946 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local936[local854]];
								if (local946 != null && local946.anInt4746 != Static481.anInt8318 && local946.aBoolean300) {
									local511 = local946.anInt8492 - (local946.method4035() - 1 << 6);
									local140 = local946.anInt8493 - (local946.method4035() - 1 << 6);
									if (local64 <= local511 && local946.method4035() <= local740.aClass305_1.anInt8815 - (local511 - local64 >> 7) && local140 >= local73 && local946.method4035() <= local740.aClass305_1.anInt8815 - (local140 - local73 >> 7)) {
										Static134.method2520(Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 != local369.anInt915, local946);
										local946.anInt4746 = Static481.anInt8318;
									}
								}
							}
						}
						if (Static481.anInt8318 == local740.anInt4746) {
							continue;
						}
						Static130.method2414(local369.anInt915 != Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, local740);
						local740.anInt4746 = Static481.anInt8318;
					}
				}
				if (local369.aClass15_1 instanceof Class15_Sub4_Sub1) {
					local55 = local369.anInt913 + Static515.anInt3214;
					local64 = Static338.anInt6353 + local369.anInt916;
					@Pc(1103) Class5_Sub7 local1103 = (Class5_Sub7) Static181.aClass42_11.method1109((long) (local64 << 14 | local369.anInt915 << 28 | local55));
					if (local1103 != null) {
						for (@Pc(1111) Class5_Sub4 local1111 = (Class5_Sub4) local1103.aClass99_12.method2527(); local1111 != null; local1111 = (Class5_Sub4) local1103.aClass99_12.method2515()) {
							@Pc(1119) Class22 local1119 = Static451.aClass67_2.method2006(local1111.anInt469);
							if (!Static479.aBoolean594) {
								if (Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local369.anInt915) {
									@Pc(1133) String[] local1133 = local1119.aStringArray8;
									for (local854 = 4; local854 >= 0; local854--) {
										if (local1133 != null && local1133[local854] != null) {
											@Pc(1145) byte local1145 = 0;
											local511 = Static37.anInt895;
											if (local854 == 0) {
												local1145 = 18;
											}
											if (local854 == 1) {
												local1145 = 57;
											}
											if (local854 == 2) {
												local1145 = 45;
											}
											if (local854 == 3) {
												local1145 = 3;
											}
											if (local854 == local1119.anInt540) {
												local511 = local1119.anInt555;
											}
											if (local854 == 4) {
												local1145 = 30;
											}
											if (local854 == local1119.anInt575) {
												local511 = local1119.anInt578;
											}
											Static371.method5606(local511, local369.anInt916, local1145, -1, true, (long) local1111.anInt469, local369.anInt913, local1133[local854], false, "<col=ff9040>" + local1119.aString15);
										}
									}
								}
								Static371.method5606(Static502.anInt8572, local369.anInt916, 1003, -1, true, (long) local1111.anInt469, local369.anInt913, Static49.aClass40_15.method1063(Static194.anInt3737), local369.anInt915 != Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, "<col=ff9040>" + local1119.aString15);
							} else if (Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local369.anInt915) {
								@Pc(1289) Class135 local1289 = Static192.anInt3701 == -1 ? null : Static216.aClass298_11.method6969(Static192.anInt3701);
								if ((Static354.anInt6690 & 0x1) != 0 && (local1289 == null || local1119.method674(Static192.anInt3701, local1289.anInt3793) != local1289.anInt3793)) {
									Static371.method5606(Static186.anInt3582, local369.anInt916, 9, -1, true, (long) local1111.anInt469, local369.anInt913, Static150.aString37, false, Static516.aString81 + " -> <col=ff9040>" + local1119.aString15);
								}
							}
						}
					}
				}
				if (local369.aClass15_1 instanceof Interface10) {
					@Pc(1352) Interface10 local1352 = (Interface10) local369.aClass15_1;
					@Pc(1361) Class283 local1361 = Static453.aClass88_3.method2294(local1352.method6868());
					if (local1361.anIntArray632 != null) {
						local1361 = local1361.method6604(Static540.aClass242_1);
					}
					if (local1361 != null) {
						if (!Static479.aBoolean594) {
							if (Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local369.anInt915) {
								@Pc(1456) String[] local1456 = local1361.aStringArray35;
								if (local1456 != null) {
									for (local76 = 4; local76 >= 0; local76--) {
										if (local1456[local76] != null) {
											@Pc(1468) short local1468 = 0;
											if (local76 == 0) {
												local1468 = 48;
											}
											local94 = Static37.anInt895;
											if (local76 == 1) {
												local1468 = 19;
											}
											if (local76 == 2) {
												local1468 = 15;
											}
											if (local76 == 3) {
												local1468 = 21;
											}
											if (local76 == local1361.anInt8177) {
												local94 = local1361.anInt8155;
											}
											if (local76 == 4) {
												local1468 = 1010;
											}
											if (local76 == local1361.anInt8161) {
												local94 = local1361.anInt8174;
											}
											Static371.method5606(local94, local369.anInt916, local1468, -1, true, Static67.method7339(local369.anInt916, local1352, local369.anInt913), local369.anInt913, local1456[local76], false, "<col=00ffff>" + local1361.aString74);
										}
									}
								}
							}
							Static371.method5606(Static502.anInt8572, local369.anInt916, 1004, -1, true, (long) local1361.anInt8190, local369.anInt913, Static49.aClass40_15.method1063(Static194.anInt3737), local369.anInt915 != Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, "<col=00ffff>" + local1361.aString74);
						} else if (Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local369.anInt915) {
							@Pc(1389) Class135 local1389 = Static192.anInt3701 == -1 ? null : Static216.aClass298_11.method6969(Static192.anInt3701);
							if ((Static354.anInt6690 & 0x4) != 0 && (local1389 == null || local1361.method6618(Static192.anInt3701, local1389.anInt3793) != local1389.anInt3793)) {
								Static371.method5606(Static186.anInt3582, local369.anInt916, 44, -1, true, Static67.method7339(local369.anInt916, local1352, local369.anInt913), local369.anInt913, Static150.aString37, false, Static516.aString81 + " -> <col=00ffff>" + local1361.aString74);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static394.method5746(arg1, arg0) || Static477.method6653(arg0, arg1);
	}
}

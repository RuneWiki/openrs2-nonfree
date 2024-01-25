import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ir", name = "i", descriptor = "Ljava/lang/Class;")
	private static Class aClass2;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!ft;B)V")
	public static void method6480(@OriginalArg(0) Class5_Sub2_Sub5 arg0) {
		arg0.method8569();
		@Pc(8) boolean local8 = false;
		for (@Pc(13) Class5_Sub2_Sub5 local13 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3100(); local13 != null; local13 = (Class5_Sub2_Sub5) Static600.aClass150_16.method3096()) {
			if (Static579.method7885(local13.method2536(), arg0.method2536())) {
				Static463.method6854(arg0, local13);
				local8 = true;
				break;
			}
		}
		if (!local8) {
			Static600.aClass150_16.method3095(arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ha;B)Z")
	public static boolean method6481(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1) {
		@Pc(11) int local11 = (Static124.anInt2150 - 104) / 2;
		@Pc(25) int local25 = (Static64.anInt1015 - 104) / 2;
		@Pc(27) boolean local27 = true;
		@Pc(37) int local37;
		@Pc(48) int local48;
		for (@Pc(29) int local29 = local11; local29 < local11 + 104; local29++) {
			for (@Pc(33) int local33 = local25; local33 < local25 + 104; local33++) {
				for (local37 = arg0; local37 <= 3; local37++) {
					if (Static71.method1044(local37, local29, local33, arg0)) {
						local48 = local37;
						if (Static488.method7149(local29, local33)) {
							local48 = local37 - 1;
						}
						if (local48 >= 0) {
							local27 &= Static496.method7199(local48, local33, local29);
						}
					}
				}
			}
		}
		if (!local27) {
			return false;
		}
		@Pc(96) int[] local96 = new int[262144];
		for (local37 = 0; local37 < local96.length; local37++) {
			local96[local37] = -16777216;
		}
		Static242.aClass59_38 = arg1.method6241(512, 512, 512, local96);
		Static335.method5149();
		local48 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(165) int local165 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(184) int local184 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(196) boolean[][] local196 = new boolean[Static612.anInt9882 + 1 + 2][Static612.anInt9882 + 2 + 1];
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(208) int local208;
		@Pc(210) int local210;
		@Pc(219) int local219;
		@Pc(229) int local229;
		@Pc(239) int local239;
		@Pc(266) int local266;
		@Pc(270) int local270;
		@Pc(327) int local327;
		@Pc(333) int local333;
		@Pc(337) int local337;
		@Pc(356) int local356;
		for (@Pc(198) int local198 = local11; local198 < local11 + 104; local198 += Static612.anInt9882) {
			for (local202 = local25; local202 < local25 + 104; local202 += Static612.anInt9882) {
				local206 = 0;
				local208 = 0;
				local210 = local198;
				if (local198 > 0) {
					local206 += 4;
					local210 = local198 - 1;
				}
				local219 = local202;
				if (local202 > 0) {
					local219 = local202 - 1;
				}
				local229 = local198 + Static612.anInt9882;
				if (local229 < 104) {
					local229++;
				}
				local239 = Static612.anInt9882 + local202;
				if (local239 < 104) {
					local208 += 4;
					local239++;
				}
				arg1.KA(0, 0, local206 + Static612.anInt9882 * 4, Static612.anInt9882 * 4 + local208);
				arg1.GA(-16777216);
				@Pc(274) int local274;
				for (local266 = arg0; local266 <= 3; local266++) {
					for (local270 = 0; local270 <= Static612.anInt9882; local270++) {
						for (local274 = 0; local274 <= Static612.anInt9882; local274++) {
							local196[local270][local274] = Static71.method1044(local266, local210 + local270, local274 + local219, arg0);
						}
					}
					Static230.aClass88Array2[local266].method8745(local210, local219, local229, local239, local196);
					if (!Static279.aBoolean290) {
						for (local274 = -4; local274 < Static612.anInt9882; local274++) {
							for (local327 = -4; local327 < Static612.anInt9882; local327++) {
								local333 = local274 + local198;
								local337 = local327 + local202;
								if (local11 <= local333 && local25 <= local337 && Static71.method1044(local266, local333, local337, arg0)) {
									local356 = local266;
									if (Static488.method7149(local333, local337)) {
										local356 = local266 - 1;
									}
									if (local356 >= 0) {
										Static80.method1218(local337, (Static612.anInt9882 - local327) * 4 + local208 - 4, local165, local48, local333, local356, local206 + local274 * 4, arg1);
									}
								}
							}
						}
					}
				}
				if (Static279.aBoolean290) {
					@Pc(418) Class234 local418 = Static137.aClass234Array1[arg0];
					for (local274 = 0; local274 < Static612.anInt9882; local274++) {
						for (local327 = 0; local327 < Static612.anInt9882; local327++) {
							local333 = local274 + local198;
							local337 = local202 + local327;
							local356 = local418.anIntArrayArray50[local333 - local418.anInt6497][local337 - local418.anInt6490];
							if ((local356 & 0x40240000) != 0) {
								arg1.method6252((Static612.anInt9882 - local327) * 4 + local208 - 4, local274 * 4 + local206, -1713569622, 4, 4);
							} else if ((local356 & 0x800000) != 0) {
								arg1.method6243(local206 + local274 * 4, -1713569622, 4, (Static612.anInt9882 - local327) * 4 + local208 - 4);
							} else if ((local356 & 0x2000000) != 0) {
								arg1.method6245(4, -1713569622, (Static612.anInt9882 - local327) * 4 + local208 - 4, local206 + 3 + local274 * 4);
							} else if ((local356 & 0x8000000) != 0) {
								arg1.method6243(local206 + local274 * 4, -1713569622, 4, local208 + (Static612.anInt9882 - local327) * 4 + 3 - 4);
							} else if ((local356 & 0x20000000) != 0) {
								arg1.method6245(4, -1713569622, local208 + (Static612.anInt9882 - local327) * 4 - 4, local274 * 4 + local206);
							}
						}
					}
				}
				arg1.aa(local206, local208, Static612.anInt9882 * 4, Static612.anInt9882 * 4, local184, 2);
				Static242.aClass59_38.method8054((local198 - local11) * 4 + 48, -(Static612.anInt9882 * 4) + -((local202 - local25) * 4) + 464, Static612.anInt9882 * 4, Static612.anInt9882 * 4, local206, local208);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static212.method3058();
		Static518.anInt9184 = 0;
		Static635.aClass124_103.method2567();
		if (!Static279.aBoolean290) {
			for (local202 = local11; local202 < local11 + 104; local202++) {
				for (local206 = local25; local206 < local25 + 104; local206++) {
					for (local208 = arg0; local208 <= arg0 + 1 && local208 <= 3; local208++) {
						if (Static71.method1044(local208, local202, local206, arg0)) {
							@Pc(703) Interface10 local703 = (Interface10) Static198.method2808(local208, local202, local206);
							if (local703 == null) {
								local703 = (Interface10) Static156.method2369(local208, local202, local206, aClass2 == null ? (aClass2 = Class138.a("ija")) : aClass2);
							}
							if (local703 == null) {
								local703 = (Interface10) Static322.method5015(local208, local202, local206);
							}
							if (local703 == null) {
								local703 = (Interface10) Static295.method4024(local208, local202, local206);
							}
							if (local703 != null) {
								@Pc(744) Class81 local744 = Static400.aClass140_4.method2839(local703.method8668());
								if (!local744.aBoolean128 || Static581.aBoolean701) {
									local229 = local744.anInt1914;
									if (local744.anIntArray100 != null) {
										for (local239 = 0; local239 < local744.anIntArray100.length; local239++) {
											if (local744.anIntArray100[local239] != -1) {
												@Pc(773) Class81 local773 = Static400.aClass140_4.method2839(local744.anIntArray100[local239]);
												if (local773.anInt1914 >= 0) {
													local229 = local773.anInt1914;
												}
											}
										}
									}
									if (local229 >= 0) {
										@Pc(792) boolean local792 = false;
										if (local229 >= 0) {
											@Pc(799) Class262 local799 = Static299.aClass218_1.method5163(local229);
											if (local799 != null && local799.aBoolean561) {
												local792 = true;
											}
										}
										local266 = local202;
										local270 = local206;
										if (local792) {
											@Pc(817) int[][] local817 = Static137.aClass234Array1[local208].anIntArrayArray50;
											local327 = Static137.aClass234Array1[local208].anInt6497;
											local333 = Static137.aClass234Array1[local208].anInt6490;
											for (local337 = 0; local337 < 10; local337++) {
												local356 = (int) (Math.random() * 4.0D);
												if (local356 == 0 && local266 > local11 && local266 > local202 - 3 && (local817[local266 - local327 - 1][local270 - local333] & 0x2C0108) == 0) {
													local266--;
												}
												if (local356 == 1 && local11 + 104 - 1 > local266 && local266 < local202 + 3 && (local817[local266 + 1 - local327][local270 - local333] & 0x2C0180) == 0) {
													local266++;
												}
												if (local356 == 2 && local270 > local25 && local206 - 3 < local270 && (local817[local266 - local327][local270 - local333 - 1] & 0x2C0102) == 0) {
													local270--;
												}
												if (local356 == 3 && local270 < local25 + 103 && local206 + 3 > local270 && (local817[local266 - local327][local270 + 1 - local333] & 0x2C0120) == 0) {
													local270++;
												}
											}
										}
										Static359.anIntArray277[Static518.anInt9184] = local744.anInt1883;
										Static552.anIntArray594[Static518.anInt9184] = local266;
										Static153.anIntArray129[Static518.anInt9184] = local270;
										Static518.anInt9184++;
									}
								}
							}
						}
					}
				}
			}
			if (Static652.aClass79_3 != null) {
				Static238.aClass50_62.anInt990 = 1;
				Static299.aClass218_1.method5157(1024, 64);
				for (local206 = 0; local206 < Static652.aClass79_3.anInt1866; local206++) {
					local208 = Static652.aClass79_3.anIntArray94[local206];
					if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 == local208 >> 28) {
						local210 = (local208 >> 14 & 0x3FFF) - Static454.anInt7910;
						local219 = (local208 & 0x3FFF) - Static48.anInt750;
						if (local210 >= 0 && Static124.anInt2150 > local210 && local219 >= 0 && Static64.anInt1015 > local219) {
							Static635.aClass124_103.method2574(new Class5_Sub43(local206));
						} else {
							@Pc(1097) Class262 local1097 = Static299.aClass218_1.method5163(Static652.aClass79_3.anIntArray95[local206]);
							if (local1097.anIntArray427 != null && local1097.anInt7625 + local210 >= 0 && local210 + local1097.anInt7621 < Static124.anInt2150 && local1097.anInt7616 + local219 >= 0 && Static64.anInt1015 > local219 + local1097.anInt7644) {
								Static635.aClass124_103.method2574(new Class5_Sub43(local206));
							}
						}
					}
				}
				Static299.aClass218_1.method5157(128, 64);
				Static238.aClass50_62.anInt990 = 2;
				Static238.aClass50_62.method903();
			}
		}
		return true;
	}
}

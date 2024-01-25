import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_159 = new Class208(104, 10);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ve;II)Z")
	public static boolean method4744(@OriginalArg(0) Class2_Sub24_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method5793(2);
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(107) int local107;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(121) int local121;
		if (local8 == 0) {
			if (arg0.method5793(1) != 0) {
				method4744(arg0, arg1);
			}
			local35 = arg0.method5793(6);
			local40 = arg0.method5793(6);
			@Pc(52) boolean local52 = arg0.method5793(1) == 1;
			if (local52) {
				Static374.anIntArray578[Static70.anInt1556++] = arg1;
			}
			if (Static42.aClass1_Sub2_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(79) Class1_Sub2_Sub1_Sub1 local79 = Static42.aClass1_Sub2_Sub1_Sub1Array1[arg1] = new Class1_Sub2_Sub1_Sub1();
			local79.anInt5374 = arg1;
			if (Static287.aClass2_Sub24Array1[arg1] != null) {
				local79.method699(Static287.aClass2_Sub24Array1[arg1]);
			}
			local79.method4796(Static243.anIntArray393[arg1]);
			local79.anInt5418 = Static53.anIntArray84[arg1];
			local107 = Static249.anIntArray396[arg1];
			local111 = local107 >> 28;
			local117 = local107 >> 14 & 0xFF;
			local121 = local107 & 0xFF;
			local79.aByteArray78[0] = Static345.aByteArray95[arg1];
			local79.aByte73 = (byte) local111;
			local79.method703(local40 + (local121 << 6) - Static350.anInt6470, -Static279.anInt5198 + local35 + (local117 << 6));
			local79.anInt951 = -1;
			return true;
		} else if (local8 == 1) {
			local35 = arg0.method5793(2);
			local40 = Static249.anIntArray396[arg1];
			Static249.anIntArray396[arg1] = (((local40 >> 28) + local35 & 0x3) << 28) + (local40 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(206) int local206;
			@Pc(210) int local210;
			if (local8 != 2) {
				local35 = arg0.method5793(18);
				local40 = local35 >> 16;
				local206 = local35 >> 8 & 0xFF;
				local210 = local35 & 0xFF;
				local107 = Static249.anIntArray396[arg1];
				local111 = (local107 >> 28) + local40 & 0x3;
				local117 = (local107 >> 14) + local206 & 0xFF;
				local121 = local210 + local107 & 0xFF;
				Static249.anIntArray396[arg1] = (local117 << 14) + ((local111 << 28) + local121);
				return false;
			}
			local35 = arg0.method5793(5);
			local40 = local35 >> 3;
			local206 = local35 & 0x7;
			local210 = Static249.anIntArray396[arg1];
			local107 = local40 + (local210 >> 28) & 0x3;
			local111 = local210 >> 14 & 0xFF;
			local117 = local210 & 0xFF;
			if (local206 == 0) {
				local111--;
				local117--;
			}
			if (local206 == 1) {
				local117--;
			}
			if (local206 == 2) {
				local111++;
				local117--;
			}
			if (local206 == 3) {
				local111--;
			}
			if (local206 == 4) {
				local111++;
			}
			if (local206 == 5) {
				local111--;
				local117++;
			}
			if (local206 == 6) {
				local117++;
			}
			if (local206 == 7) {
				local111++;
				local117++;
			}
			Static249.anIntArray396[arg1] = (local107 << 28) + (local111 << 14) + local117;
			return false;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!gn;)V")
	public static void method4745(@OriginalArg(1) Class1_Sub2_Sub1 arg0) {
		arg0.aBoolean393 = false;
		@Pc(22) Class102 local22;
		if (arg0.anInt5421 != -1) {
			local22 = Static333.aClass50_2.method1175(arg0.anInt5421);
			if (local22 == null || local22.anIntArray231 == null) {
				arg0.aBoolean394 = false;
				arg0.anInt5421 = -1;
			} else {
				label297: {
					arg0.anInt5413++;
					if (arg0.anInt5375 < local22.anIntArray231.length && local22.anIntArray229[arg0.anInt5375] < arg0.anInt5413) {
						arg0.anInt5377++;
						arg0.anInt5413 = 1;
						arg0.anInt5375++;
						Static343.method5495(local22, arg0 == Static182.aClass1_Sub2_Sub1_Sub1_1, arg0.anInt6800, arg0.anInt5375, arg0.anInt6798, arg0.aByte73);
					}
					if (arg0.anInt5375 >= local22.anIntArray231.length) {
						arg0.anInt5375 = 0;
						arg0.anInt5413 = 0;
						if (arg0.aBoolean394) {
							arg0.anInt5421 = arg0.method4799().method5576();
							if (arg0.anInt5421 == -1) {
								arg0.aBoolean394 = false;
								break label297;
							}
							local22 = Static333.aClass50_2.method1175(arg0.anInt5421);
						}
						Static343.method5495(local22, arg0 == Static182.aClass1_Sub2_Sub1_Sub1_1, arg0.anInt6800, arg0.anInt5375, arg0.anInt6798, arg0.aByte73);
					}
					arg0.anInt5377 = arg0.anInt5375 + 1;
					if (local22.anIntArray231.length <= arg0.anInt5377) {
						arg0.anInt5377 = 0;
					}
				}
			}
		}
		@Pc(190) Class102 local190;
		if (arg0.anInt5396 != -1 && arg0.anInt5390 <= Static339.anInt6265) {
			@Pc(179) Class182 local179 = Static153.aClass116_1.method2791(arg0.anInt5396);
			@Pc(182) int local182 = local179.anInt5101;
			if (local182 == -1) {
				arg0.anInt5396 = -1;
			} else {
				label299: {
					local190 = Static333.aClass50_2.method1175(local182);
					if (local179.aBoolean374) {
						if (local190.anInt2983 == 3) {
							if (arg0.anInt5431 > 0 && arg0.anInt5416 <= Static339.anInt6265 && arg0.anInt5415 < Static339.anInt6265) {
								arg0.anInt5396 = -1;
								break label299;
							}
						} else if (local190.anInt2983 == 1 && arg0.anInt5431 > 0 && arg0.anInt5416 <= Static339.anInt6265 && Static339.anInt6265 > arg0.anInt5415) {
							arg0.anInt5390 = Static339.anInt6265 + 1;
							break label299;
						}
					}
					if (local190 == null || local190.anIntArray231 == null) {
						arg0.anInt5396 = -1;
					} else {
						if (arg0.anInt5404 < 0) {
							arg0.anInt5404 = 0;
							Static343.method5495(local190, arg0 == Static182.aClass1_Sub2_Sub1_Sub1_1, arg0.anInt6800, 0, arg0.anInt6798, arg0.aByte73);
						}
						arg0.anInt5391++;
						if (local190.anIntArray231.length > arg0.anInt5404 && arg0.anInt5391 > local190.anIntArray229[arg0.anInt5404]) {
							arg0.anInt5391 = 1;
							arg0.anInt5404++;
							Static343.method5495(local190, arg0 == Static182.aClass1_Sub2_Sub1_Sub1_1, arg0.anInt6800, arg0.anInt5404, arg0.anInt6798, arg0.aByte73);
						}
						if (local190.anIntArray231.length <= arg0.anInt5404) {
							if (local179.aBoolean374) {
								arg0.anInt5406++;
								arg0.anInt5404 -= local190.anInt2996;
								if (local190.anInt2990 <= arg0.anInt5406) {
									arg0.anInt5396 = -1;
								} else if (arg0.anInt5404 >= 0 && arg0.anInt5404 < local190.anIntArray231.length) {
									Static343.method5495(local190, Static182.aClass1_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt6800, arg0.anInt5404, arg0.anInt6798, arg0.aByte73);
								} else {
									arg0.anInt5396 = -1;
								}
							} else {
								arg0.anInt5396 = -1;
							}
						}
						arg0.anInt5364 = arg0.anInt5404 + 1;
						if (arg0.anInt5364 >= local190.anIntArray231.length) {
							if (local179.aBoolean374) {
								arg0.anInt5364 -= local190.anInt2996;
								if (arg0.anInt5406 + 1 >= local190.anInt2990) {
									arg0.anInt5364 = -1;
								} else if (arg0.anInt5364 < 0 || local190.anIntArray231.length <= arg0.anInt5364) {
									arg0.anInt5364 = -1;
								}
							} else {
								arg0.anInt5364 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5366 != -1 && arg0.anInt5405 <= 1) {
			local22 = Static333.aClass50_2.method1175(arg0.anInt5366);
			if (local22.anInt2983 == 3) {
				if (arg0.anInt5431 > 0 && Static339.anInt6265 >= arg0.anInt5416 && arg0.anInt5415 < Static339.anInt6265) {
					arg0.anInt5366 = -1;
				}
			} else if (local22.anInt2983 == 1 && arg0.anInt5431 > 0 && Static339.anInt6265 >= arg0.anInt5416 && arg0.anInt5415 < Static339.anInt6265) {
				arg0.anInt5405 = 2;
			}
		}
		if (arg0.anInt5366 != -1 && arg0.anInt5405 == 0) {
			local22 = Static333.aClass50_2.method1175(arg0.anInt5366);
			if (local22 == null || local22.anIntArray231 == null) {
				arg0.anInt5366 = -1;
			} else {
				arg0.anInt5367++;
				if (arg0.anInt5407 < local22.anIntArray231.length && local22.anIntArray229[arg0.anInt5407] < arg0.anInt5367) {
					arg0.anInt5367 = 1;
					arg0.anInt5407++;
					Static343.method5495(local22, Static182.aClass1_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt6800, arg0.anInt5407, arg0.anInt6798, arg0.aByte73);
				}
				if (local22.anIntArray231.length <= arg0.anInt5407) {
					arg0.anInt5407 -= local22.anInt2996;
					arg0.anInt5414++;
					if (arg0.anInt5414 >= local22.anInt2990) {
						arg0.anInt5366 = -1;
					} else if (arg0.anInt5407 >= 0 && local22.anIntArray231.length > arg0.anInt5407) {
						Static343.method5495(local22, Static182.aClass1_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt6800, arg0.anInt5407, arg0.anInt6798, arg0.aByte73);
					} else {
						arg0.anInt5366 = -1;
					}
				}
				arg0.anInt5425 = arg0.anInt5407 + 1;
				if (local22.anIntArray231.length <= arg0.anInt5425) {
					arg0.anInt5425 -= local22.anInt2996;
					if (arg0.anInt5414 + 1 >= local22.anInt2990) {
						arg0.anInt5425 = -1;
					} else if (arg0.anInt5425 < 0 || arg0.anInt5425 >= local22.anIntArray231.length) {
						arg0.anInt5425 = -1;
					}
				}
				arg0.aBoolean393 = local22.aBoolean211;
			}
		}
		if (arg0.anInt5405 > 0) {
			arg0.anInt5405--;
		}
		for (@Pc(754) int local754 = 0; local754 < arg0.aClass51Array3.length; local754++) {
			@Pc(761) Class51 local761 = arg0.aClass51Array3[local754];
			if (local761 != null) {
				if (local761.anInt1438 > 0) {
					local761.anInt1438--;
				} else {
					local190 = Static333.aClass50_2.method1175(local761.anInt1433);
					if (local190 == null || local190.anIntArray231 == null) {
						arg0.aClass51Array3[local754] = null;
					} else {
						local761.anInt1435++;
						if (local761.anInt1437 < local190.anIntArray231.length && local761.anInt1435 > local190.anIntArray229[local761.anInt1437]) {
							local761.anInt1437++;
							local761.anInt1435 = 1;
							Static343.method5495(local190, arg0 == Static182.aClass1_Sub2_Sub1_Sub1_1, arg0.anInt6800, local761.anInt1437, arg0.anInt6798, arg0.aByte73);
						}
						if (local190.anIntArray231.length <= local761.anInt1437) {
							local761.anInt1436++;
							local761.anInt1437 -= local190.anInt2996;
							if (local761.anInt1436 >= local190.anInt2990) {
								arg0.aClass51Array3[local754] = null;
							} else if (local761.anInt1437 >= 0 && local190.anIntArray231.length > local761.anInt1437) {
								Static343.method5495(local190, arg0 == Static182.aClass1_Sub2_Sub1_Sub1_1, arg0.anInt6800, local761.anInt1437, arg0.anInt6798, arg0.aByte73);
							} else {
								arg0.aClass51Array3[local754] = null;
							}
						}
						local761.anInt1434 = local761.anInt1437 + 1;
						if (local190.anIntArray231.length <= local761.anInt1434) {
							local761.anInt1434 -= local190.anInt2996;
							if (local761.anInt1436 + 1 >= local190.anInt2990) {
								local761.anInt1434 = -1;
							} else if (local761.anInt1434 < 0 || local190.anIntArray231.length <= local761.anInt1434) {
								local761.anInt1434 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
	public static void method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub3_3 != null) {
			local7.aClass1_Sub3_3 = null;
		}
		if (local7.aClass1_Sub3_2 != null) {
			local7.aClass1_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method4747(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString61 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local10 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(77) String local77;
			if (local65 == -1) {
				local77 = local59;
			} else {
				local77 = local59.substring(0, local65);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			local10 = local10 + local77;
			if (local65 != -1 && local72 != -1) {
				@Pc(124) int local124 = local59.indexOf(".java:", local65);
				if (local124 >= 0) {
					local10 = local10 + local59.substring(local124 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}
}

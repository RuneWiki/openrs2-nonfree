import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Z")
	public static boolean aBoolean228;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!nb;")
	public static Class15 aClass15_33;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!kj;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "J")
	public static long aLong113 = 0L;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!i;")
	private static Class41 aClass41_987 = Static184.method2923("Welcome to RuneScape");

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_986 = aClass41_987;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!i;")
	private static Class41 aClass41_990 = Static184.method2923("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_988 = aClass41_990;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_989 = Static184.method2923(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	public static int anInt3706 = 3;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2553(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString1 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(53) String local53 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local24 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(94) String local94 = local67.substring(local73 + 1, local80);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local24 = local24 + local94 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local24 = local24 + local67 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	public static void method2554(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static148.anIntArray346[arg0];
		@Pc(14) int local14 = Static192.anIntArray451[arg0];
		@Pc(18) int local18 = Static48.aShortArray34[arg0];
		@Pc(22) long local22 = Static65.aLongArray4[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(31) int local31 = (int) Static65.aLongArray4[arg0];
		@Pc(38) Class12_Sub3_Sub1 local38;
		if (local18 == 31) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static142.anInt3253 = 2;
				Static132.anInt3013 = Static200.anInt4491;
				Static41.anInt1265 = 0;
				Static140.anInt3235 = Static154.anInt3614;
				Static131.aClass2_Sub3_Sub1_2.method221(192);
				Static131.aClass2_Sub3_Sub1_2.method193(Static44.anInt1332);
				Static131.aClass2_Sub3_Sub1_2.method213(Static185.anInt4248);
				Static131.aClass2_Sub3_Sub1_2.method167(Static53.anInt1534);
				Static131.aClass2_Sub3_Sub1_2.method167(local31);
			}
		}
		if (local18 == 1006) {
			Static41.anInt1265 = 0;
			Static132.anInt3013 = Static200.anInt4491;
			Static140.anInt3235 = Static154.anInt3614;
			Static142.anInt3253 = 2;
			Static131.aClass2_Sub3_Sub1_2.method221(191);
			Static131.aClass2_Sub3_Sub1_2.method167(local31);
		}
		if (local18 == 7) {
			Static88.method1560(local14, local22, local10);
			Static131.aClass2_Sub3_Sub1_2.method221(53);
			Static131.aClass2_Sub3_Sub1_2.method167((int) (local22 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass2_Sub3_Sub1_2.method206(Static168.anInt3899 + local14);
			Static131.aClass2_Sub3_Sub1_2.method206(local10 + Static198.anInt4451);
		}
		@Pc(176) Class80 local176;
		if (local18 == 15) {
			local176 = Static34.method675(local10, local14);
			if (local176 != null) {
				Static43.method905();
				Static143.method2230(local14, Static76.method598(Static70.method1287(local176)), local10);
				Static26.anInt665 = 0;
				Static177.aClass41_1092 = Static171.method2773(local176);
				if (Static177.aClass41_1092 == null) {
					Static177.aClass41_1092 = Static38.aClass41_335;
				}
				if (local176.aBoolean215) {
					Static26.aClass41_174 = Static149.method2324(new Class41[] { local176.aClass41_982, Static77.aClass41_596 });
					return;
				}
				Static26.aClass41_174 = Static149.method2324(new Class41[] { Static11.aClass41_80, local176.aClass41_983, Static77.aClass41_596 });
			}
			return;
		}
		if (local18 == 30) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static142.anInt3253 = 2;
				Static140.anInt3235 = Static154.anInt3614;
				Static132.anInt3013 = Static200.anInt4491;
				Static131.aClass2_Sub3_Sub1_2.method221(65);
				Static131.aClass2_Sub3_Sub1_2.method176(local31);
			}
		}
		if (local18 == 40) {
			Static131.aClass2_Sub3_Sub1_2.method221(196);
			Static131.aClass2_Sub3_Sub1_2.method206(Static31.anInt811);
			Static131.aClass2_Sub3_Sub1_2.method200(Static15.anInt425);
			Static131.aClass2_Sub3_Sub1_2.method188(local14);
			Static131.aClass2_Sub3_Sub1_2.method193(local10);
		}
		@Pc(333) Class12_Sub3_Sub2 local333;
		if (local18 == 34) {
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				Static183.method925(1, 0, local333.anIntArray414[0], local333.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static142.anInt3253 = 2;
				Static140.anInt3235 = Static154.anInt3614;
				Static132.anInt3013 = Static200.anInt4491;
				Static131.aClass2_Sub3_Sub1_2.method221(78);
				Static131.aClass2_Sub3_Sub1_2.method193(local31);
			}
		}
		if (local18 == 58) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static142.anInt3253 = 2;
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static131.aClass2_Sub3_Sub1_2.method221(151);
				Static131.aClass2_Sub3_Sub1_2.method167(local31);
			}
		}
		if (local18 == 4) {
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				Static183.method925(1, 0, local333.anIntArray414[0], local333.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static132.anInt3013 = Static200.anInt4491;
				Static41.anInt1265 = 0;
				Static142.anInt3253 = 2;
				Static140.anInt3235 = Static154.anInt3614;
				Static131.aClass2_Sub3_Sub1_2.method221(71);
				Static131.aClass2_Sub3_Sub1_2.method167(local31);
			}
		}
		if (local18 == 39) {
			Static131.aClass2_Sub3_Sub1_2.method221(35);
			Static131.aClass2_Sub3_Sub1_2.method206(local31);
			Static131.aClass2_Sub3_Sub1_2.method167(Static31.anInt811);
			Static131.aClass2_Sub3_Sub1_2.method178(Static15.anInt425);
			Static131.aClass2_Sub3_Sub1_2.method193(local10);
			Static131.aClass2_Sub3_Sub1_2.method178(local14);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		@Pc(583) int local583;
		if (local18 == 36) {
			Static131.aClass2_Sub3_Sub1_2.method221(109);
			Static131.aClass2_Sub3_Sub1_2.method200(local14);
			local176 = Static212.method3256(local14);
			if (local176.anIntArrayArray32 != null && local176.anIntArrayArray32[0][0] == 5) {
				local583 = local176.anIntArrayArray32[0][1];
				Static99.anIntArray243[local583] = 1 - Static99.anIntArray243[local583];
				Static143.method2234(local583);
			}
		}
		if (local18 == 1001) {
			local176 = Static212.method3256(local14);
			if (local176 == null || local176.anIntArray390[local10] < 100000) {
				Static131.aClass2_Sub3_Sub1_2.method221(191);
				Static131.aClass2_Sub3_Sub1_2.method167(local31);
			} else {
				Static198.method3075(Static149.method2324(new Class41[] { Static152.method2471(local176.anIntArray390[local10]), Static95.aClass41_695, Static63.method1158(local31).aClass41_858 }), 0, Static156.aClass41_981);
			}
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 1) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static142.anInt3253 = 2;
				Static140.anInt3235 = Static154.anInt3614;
				Static132.anInt3013 = Static200.anInt4491;
				Static41.anInt1265 = 0;
				Static131.aClass2_Sub3_Sub1_2.method221(47);
				Static131.aClass2_Sub3_Sub1_2.method206(local31);
			}
		}
		if (local18 == 21) {
			Static131.aClass2_Sub3_Sub1_2.method221(160);
			Static131.aClass2_Sub3_Sub1_2.method206(local10);
			Static131.aClass2_Sub3_Sub1_2.method213(local14);
			Static131.aClass2_Sub3_Sub1_2.method193(local31);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 2) {
			Static131.aClass2_Sub3_Sub1_2.method221(216);
			Static131.aClass2_Sub3_Sub1_2.method178(local14);
			Static131.aClass2_Sub3_Sub1_2.method176(local10);
			Static131.aClass2_Sub3_Sub1_2.method206(local31);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 35) {
			Static88.method1560(local14, local22, local10);
			Static131.aClass2_Sub3_Sub1_2.method221(13);
			Static131.aClass2_Sub3_Sub1_2.method206(Integer.MAX_VALUE & (int) (local22 >>> 32));
			Static131.aClass2_Sub3_Sub1_2.method176(Static198.anInt4451 + local10);
			Static131.aClass2_Sub3_Sub1_2.method176(local14 + Static168.anInt3899);
		}
		if (local18 == 51) {
			Static88.method1560(local14, local22, local10);
			Static131.aClass2_Sub3_Sub1_2.method221(94);
			Static131.aClass2_Sub3_Sub1_2.method193(local10 + Static198.anInt4451);
			Static131.aClass2_Sub3_Sub1_2.method167(local14 + Static168.anInt3899);
			Static131.aClass2_Sub3_Sub1_2.method206(Integer.MAX_VALUE & (int) (local22 >>> 32));
		}
		if (local18 == 29) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static142.anInt3253 = 2;
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static131.aClass2_Sub3_Sub1_2.method221(118);
				Static131.aClass2_Sub3_Sub1_2.method193(local31);
			}
		}
		if (local18 == 48) {
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				Static183.method925(1, 0, local333.anIntArray414[0], local333.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static41.anInt1265 = 0;
				Static142.anInt3253 = 2;
				Static131.aClass2_Sub3_Sub1_2.method221(30);
				Static131.aClass2_Sub3_Sub1_2.method176(Static53.anInt1534);
				Static131.aClass2_Sub3_Sub1_2.method188(Static185.anInt4248);
				Static131.aClass2_Sub3_Sub1_2.method176(local31);
				Static131.aClass2_Sub3_Sub1_2.method206(Static44.anInt1332);
			}
		}
		if (local18 == 44) {
			Static131.aClass2_Sub3_Sub1_2.method221(112);
			Static131.aClass2_Sub3_Sub1_2.method167(local10);
			Static131.aClass2_Sub3_Sub1_2.method188(local14);
			Static131.aClass2_Sub3_Sub1_2.method206(local31);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 14) {
			Static27.method1631();
		}
		if (local18 == 17) {
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				Static183.method925(1, 0, local333.anIntArray414[0], local333.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static142.anInt3253 = 2;
				Static41.anInt1265 = 0;
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static131.aClass2_Sub3_Sub1_2.method221(164);
				Static131.aClass2_Sub3_Sub1_2.method167(local31);
			}
		}
		@Pc(1117) boolean local1117;
		if (local18 == 57) {
			local1117 = Static183.method925(0, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			if (!local1117) {
				Static183.method925(1, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			}
			Static140.anInt3235 = Static154.anInt3614;
			Static132.anInt3013 = Static200.anInt4491;
			Static142.anInt3253 = 2;
			Static41.anInt1265 = 0;
			Static131.aClass2_Sub3_Sub1_2.method221(107);
			Static131.aClass2_Sub3_Sub1_2.method176(Static168.anInt3899 + local14);
			Static131.aClass2_Sub3_Sub1_2.method176(local31);
			Static131.aClass2_Sub3_Sub1_2.method206(local10 + Static198.anInt4451);
		}
		if (local18 == 12) {
			Static43.method905();
			local176 = Static212.method3256(local14);
			Static26.anInt665 = 1;
			Static53.anInt1534 = local10;
			Static185.anInt4248 = local14;
			Static44.anInt1332 = local31;
			Static176.method2833(local176);
			Static68.aClass41_561 = Static149.method2324(new Class41[] { Static121.aClass41_1282, Static63.method1158(local31).aClass41_858, Static77.aClass41_596 });
			if (Static68.aClass41_561 == null) {
				Static68.aClass41_561 = Static161.aClass41_1008;
			}
			return;
		}
		if (local18 == 23) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static142.anInt3253 = 2;
				Static140.anInt3235 = Static154.anInt3614;
				Static41.anInt1265 = 0;
				Static132.anInt3013 = Static200.anInt4491;
				Static131.aClass2_Sub3_Sub1_2.method221(6);
				Static131.aClass2_Sub3_Sub1_2.method206(local31);
				Static131.aClass2_Sub3_Sub1_2.method193(Static31.anInt811);
				Static131.aClass2_Sub3_Sub1_2.method188(Static15.anInt425);
			}
		}
		if (local18 == 6) {
			Static131.aClass2_Sub3_Sub1_2.method221(150);
			Static131.aClass2_Sub3_Sub1_2.method178(local14);
			Static131.aClass2_Sub3_Sub1_2.method206(local10);
			Static131.aClass2_Sub3_Sub1_2.method167(local31);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 10) {
			Static46.method2854(Static134.anInt3147, local10, local14);
		}
		if (local18 == 1004) {
			Static88.method1560(local14, local22, local10);
			Static131.aClass2_Sub3_Sub1_2.method221(97);
			Static131.aClass2_Sub3_Sub1_2.method206(local14 + Static168.anInt3899);
			Static131.aClass2_Sub3_Sub1_2.method206((int) (local22 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass2_Sub3_Sub1_2.method176(local10 + Static198.anInt4451);
		}
		if (local18 == 43 || local18 == 1003) {
			Static179.method2860(local31, Static177.aClass41Array63[arg0], local10, local14);
		}
		if (local18 == 3) {
			local1117 = Static183.method925(0, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			if (!local1117) {
				Static183.method925(1, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			}
			Static140.anInt3235 = Static154.anInt3614;
			Static132.anInt3013 = Static200.anInt4491;
			Static142.anInt3253 = 2;
			Static41.anInt1265 = 0;
			Static131.aClass2_Sub3_Sub1_2.method221(138);
			Static131.aClass2_Sub3_Sub1_2.method193(local14 + Static168.anInt3899);
			Static131.aClass2_Sub3_Sub1_2.method167(local31);
			Static131.aClass2_Sub3_Sub1_2.method193(Static198.anInt4451 + local10);
		}
		if (local18 == 8) {
			Static131.aClass2_Sub3_Sub1_2.method221(205);
			Static131.aClass2_Sub3_Sub1_2.method176(local31);
			Static131.aClass2_Sub3_Sub1_2.method193(local10);
			Static131.aClass2_Sub3_Sub1_2.method178(local14);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 13) {
			Static131.aClass2_Sub3_Sub1_2.method221(26);
			Static131.aClass2_Sub3_Sub1_2.method167(local10);
			Static131.aClass2_Sub3_Sub1_2.method167(local31);
			Static131.aClass2_Sub3_Sub1_2.method200(local14);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 41) {
			local1117 = Static183.method925(0, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			if (!local1117) {
				Static183.method925(1, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			}
			Static140.anInt3235 = Static154.anInt3614;
			Static41.anInt1265 = 0;
			Static132.anInt3013 = Static200.anInt4491;
			Static142.anInt3253 = 2;
			Static131.aClass2_Sub3_Sub1_2.method221(77);
			Static131.aClass2_Sub3_Sub1_2.method206(local31);
			Static131.aClass2_Sub3_Sub1_2.method206(local14 + Static168.anInt3899);
			Static131.aClass2_Sub3_Sub1_2.method167(local10 + Static198.anInt4451);
		}
		if (local18 == 1002) {
			Static132.anInt3013 = Static200.anInt4491;
			Static41.anInt1265 = 0;
			Static140.anInt3235 = Static154.anInt3614;
			Static142.anInt3253 = 2;
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				@Pc(1623) Class2_Sub2_Sub12 local1623 = local333.aClass2_Sub2_Sub12_1;
				if (local1623.anIntArray294 != null) {
					local1623 = local1623.method1902();
				}
				if (local1623 != null) {
					Static131.aClass2_Sub3_Sub1_2.method221(127);
					Static131.aClass2_Sub3_Sub1_2.method176(local1623.anInt2653);
				}
			}
		}
		if (local18 == 49) {
			Static131.aClass2_Sub3_Sub1_2.method221(32);
			Static131.aClass2_Sub3_Sub1_2.method206(local31);
			Static131.aClass2_Sub3_Sub1_2.method200(local14);
			Static131.aClass2_Sub3_Sub1_2.method206(local10);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 26 && Static88.method1560(local14, local22, local10)) {
			Static131.aClass2_Sub3_Sub1_2.method221(170);
			Static131.aClass2_Sub3_Sub1_2.method193(Static168.anInt3899 + local14);
			Static131.aClass2_Sub3_Sub1_2.method200(Static185.anInt4248);
			Static131.aClass2_Sub3_Sub1_2.method206(local10 + Static198.anInt4451);
			Static131.aClass2_Sub3_Sub1_2.method176(Static53.anInt1534);
			Static131.aClass2_Sub3_Sub1_2.method193(Integer.MAX_VALUE & (int) (local22 >>> 32));
			Static131.aClass2_Sub3_Sub1_2.method206(Static44.anInt1332);
		}
		if (local18 == 45) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static142.anInt3253 = 2;
				Static131.aClass2_Sub3_Sub1_2.method221(214);
				Static131.aClass2_Sub3_Sub1_2.method193(local31);
			}
		}
		if (local18 == 25) {
			local1117 = Static183.method925(0, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			if (!local1117) {
				Static183.method925(1, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			}
			Static142.anInt3253 = 2;
			Static140.anInt3235 = Static154.anInt3614;
			Static132.anInt3013 = Static200.anInt4491;
			Static41.anInt1265 = 0;
			Static131.aClass2_Sub3_Sub1_2.method221(84);
			Static131.aClass2_Sub3_Sub1_2.method167(local10 + Static198.anInt4451);
			Static131.aClass2_Sub3_Sub1_2.method167(local31);
			Static131.aClass2_Sub3_Sub1_2.method176(local14 + Static168.anInt3899);
			Static131.aClass2_Sub3_Sub1_2.method213(Static15.anInt425);
			Static131.aClass2_Sub3_Sub1_2.method176(Static31.anInt811);
		}
		if (local18 == 22) {
			local1117 = Static183.method925(0, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			if (!local1117) {
				Static183.method925(1, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			}
			Static142.anInt3253 = 2;
			Static140.anInt3235 = Static154.anInt3614;
			Static132.anInt3013 = Static200.anInt4491;
			Static41.anInt1265 = 0;
			Static131.aClass2_Sub3_Sub1_2.method221(39);
			Static131.aClass2_Sub3_Sub1_2.method176(local10 + Static198.anInt4451);
			Static131.aClass2_Sub3_Sub1_2.method193(local31);
			Static131.aClass2_Sub3_Sub1_2.method206(Static168.anInt3899 + local14);
		}
		if (local18 == 38) {
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				Static183.method925(1, 0, local333.anIntArray414[0], local333.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static142.anInt3253 = 2;
				Static41.anInt1265 = 0;
				Static131.aClass2_Sub3_Sub1_2.method221(33);
				Static131.aClass2_Sub3_Sub1_2.method176(local31);
			}
		}
		if (local18 == 24 && Static88.method1560(local14, local22, local10)) {
			Static131.aClass2_Sub3_Sub1_2.method221(234);
			Static131.aClass2_Sub3_Sub1_2.method176(Integer.MAX_VALUE & (int) (local22 >>> 32));
			Static131.aClass2_Sub3_Sub1_2.method176(Static31.anInt811);
			Static131.aClass2_Sub3_Sub1_2.method178(Static15.anInt425);
			Static131.aClass2_Sub3_Sub1_2.method176(local10 + Static198.anInt4451);
			Static131.aClass2_Sub3_Sub1_2.method167(Static168.anInt3899 + local14);
		}
		if (local18 == 28) {
			Static131.aClass2_Sub3_Sub1_2.method221(154);
			Static131.aClass2_Sub3_Sub1_2.method200(local14);
			Static131.aClass2_Sub3_Sub1_2.method206(local31);
			Static131.aClass2_Sub3_Sub1_2.method206(local10);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 20) {
			Static131.aClass2_Sub3_Sub1_2.method221(109);
			Static131.aClass2_Sub3_Sub1_2.method200(local14);
			local176 = Static212.method3256(local14);
			if (local176.anIntArrayArray32 != null && local176.anIntArrayArray32[0][0] == 5) {
				local583 = local176.anIntArrayArray32[0][1];
				if (local176.anIntArray391[0] != Static99.anIntArray243[local583]) {
					Static99.anIntArray243[local583] = local176.anIntArray391[0];
					Static143.method2234(local583);
				}
			}
		}
		if (local18 == 18) {
			Static131.aClass2_Sub3_Sub1_2.method221(251);
			Static131.aClass2_Sub3_Sub1_2.method167(local10);
			Static131.aClass2_Sub3_Sub1_2.method193(local31);
			Static131.aClass2_Sub3_Sub1_2.method200(local14);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 47 && Static48.aClass80_5 == null) {
			Static179.method2861(local10, local14);
			Static48.aClass80_5 = Static34.method675(local10, local14);
			Static176.method2833(Static48.aClass80_5);
		}
		if (local18 == 32) {
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				Static183.method925(1, 0, local333.anIntArray414[0], local333.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static132.anInt3013 = Static200.anInt4491;
				Static142.anInt3253 = 2;
				Static41.anInt1265 = 0;
				Static140.anInt3235 = Static154.anInt3614;
				Static131.aClass2_Sub3_Sub1_2.method221(195);
				Static131.aClass2_Sub3_Sub1_2.method167(local31);
			}
		}
		if (local18 == 33) {
			Static88.method1560(local14, local22, local10);
			Static131.aClass2_Sub3_Sub1_2.method221(169);
			Static131.aClass2_Sub3_Sub1_2.method167(local14 + Static168.anInt3899);
			Static131.aClass2_Sub3_Sub1_2.method176(Integer.MAX_VALUE & (int) (local22 >>> 32));
			Static131.aClass2_Sub3_Sub1_2.method206(Static198.anInt4451 + local10);
		}
		if (local18 == 11) {
			local176 = Static212.method3256(local14);
			@Pc(2327) boolean local2327 = true;
			if (local176.anInt3670 > 0) {
				local2327 = Static48.method961(local176);
			}
			if (local2327) {
				Static131.aClass2_Sub3_Sub1_2.method221(109);
				Static131.aClass2_Sub3_Sub1_2.method200(local14);
			}
		}
		if (local18 == 9) {
			Static131.aClass2_Sub3_Sub1_2.method221(55);
			Static131.aClass2_Sub3_Sub1_2.method176(local10);
			Static131.aClass2_Sub3_Sub1_2.method213(local14);
			Static131.aClass2_Sub3_Sub1_2.method193(local31);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 5) {
			local1117 = Static183.method925(0, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			if (!local1117) {
				Static183.method925(1, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			}
			Static41.anInt1265 = 0;
			Static142.anInt3253 = 2;
			Static132.anInt3013 = Static200.anInt4491;
			Static140.anInt3235 = Static154.anInt3614;
			Static131.aClass2_Sub3_Sub1_2.method221(211);
			Static131.aClass2_Sub3_Sub1_2.method206(Static198.anInt4451 + local10);
			Static131.aClass2_Sub3_Sub1_2.method176(local14 + Static168.anInt3899);
			Static131.aClass2_Sub3_Sub1_2.method206(local31);
		}
		if (local18 == 42) {
			Static131.aClass2_Sub3_Sub1_2.method221(4);
			Static131.aClass2_Sub3_Sub1_2.method167(Static44.anInt1332);
			Static131.aClass2_Sub3_Sub1_2.method193(local31);
			Static131.aClass2_Sub3_Sub1_2.method193(Static53.anInt1534);
			Static131.aClass2_Sub3_Sub1_2.method188(local14);
			Static131.aClass2_Sub3_Sub1_2.method193(local10);
			Static131.aClass2_Sub3_Sub1_2.method200(Static185.anInt4248);
			Static124.anInt2947 = 0;
			Static52.aClass80_6 = Static212.method3256(local14);
			Static81.anInt2075 = local10;
		}
		if (local18 == 37) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static142.anInt3253 = 2;
				Static131.aClass2_Sub3_Sub1_2.method221(114);
				Static131.aClass2_Sub3_Sub1_2.method167(local31);
			}
		}
		if (local18 == 16) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static132.anInt3013 = Static200.anInt4491;
				Static140.anInt3235 = Static154.anInt3614;
				Static142.anInt3253 = 2;
				Static131.aClass2_Sub3_Sub1_2.method221(161);
				Static131.aClass2_Sub3_Sub1_2.method193(local31);
			}
		}
		if (local18 == 1005) {
			Static142.anInt3253 = 2;
			Static140.anInt3235 = Static154.anInt3614;
			Static41.anInt1265 = 0;
			Static132.anInt3013 = Static200.anInt4491;
			Static131.aClass2_Sub3_Sub1_2.method221(166);
			Static131.aClass2_Sub3_Sub1_2.method193(local31);
		}
		if (local18 == 50) {
			local38 = Static216.aClass12_Sub3_Sub1Array1[local31];
			if (local38 != null) {
				Static183.method925(1, 0, local38.anIntArray414[0], local38.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static142.anInt3253 = 2;
				Static41.anInt1265 = 0;
				Static140.anInt3235 = Static154.anInt3614;
				Static132.anInt3013 = Static200.anInt4491;
				Static131.aClass2_Sub3_Sub1_2.method221(204);
				Static131.aClass2_Sub3_Sub1_2.method206(local31);
			}
		}
		if (local18 == 19) {
			local333 = Static199.aClass12_Sub3_Sub2Array1[local31];
			if (local333 != null) {
				Static183.method925(1, 0, local333.anIntArray414[0], local333.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				Static41.anInt1265 = 0;
				Static132.anInt3013 = Static200.anInt4491;
				Static142.anInt3253 = 2;
				Static140.anInt3235 = Static154.anInt3614;
				Static131.aClass2_Sub3_Sub1_2.method221(145);
				Static131.aClass2_Sub3_Sub1_2.method213(Static15.anInt425);
				Static131.aClass2_Sub3_Sub1_2.method176(local31);
				Static131.aClass2_Sub3_Sub1_2.method167(Static31.anInt811);
			}
		}
		if (local18 == 46) {
			local1117 = Static183.method925(0, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 0, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			if (!local1117) {
				Static183.method925(1, 0, local14, local10, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
			}
			Static142.anInt3253 = 2;
			Static41.anInt1265 = 0;
			Static140.anInt3235 = Static154.anInt3614;
			Static132.anInt3013 = Static200.anInt4491;
			Static131.aClass2_Sub3_Sub1_2.method221(176);
			Static131.aClass2_Sub3_Sub1_2.method176(Static168.anInt3899 + local14);
			Static131.aClass2_Sub3_Sub1_2.method178(Static185.anInt4248);
			Static131.aClass2_Sub3_Sub1_2.method176(Static53.anInt1534);
			Static131.aClass2_Sub3_Sub1_2.method206(Static198.anInt4451 + local10);
			Static131.aClass2_Sub3_Sub1_2.method206(Static44.anInt1332);
			Static131.aClass2_Sub3_Sub1_2.method176(local31);
		}
		if (Static26.anInt665 != 0) {
			Static26.anInt665 = 0;
			Static176.method2833(Static212.method3256(Static185.anInt4248));
		}
		if (Static9.aBoolean16) {
			Static43.method905();
		}
		if (Static52.aClass80_6 != null && Static124.anInt2947 == 0) {
			Static176.method2833(Static52.aClass80_6);
		}
	}
}

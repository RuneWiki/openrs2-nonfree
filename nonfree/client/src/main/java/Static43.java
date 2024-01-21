import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_416 = Static41.method597("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public static int anInt1110 = 0;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_417 = Static41.method597(":trade:");

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_418 = Static41.method597("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)V")
	public static void method615(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static83.anInt1972; local14++) {
			if (Static35.aLongArray4[local14] == arg0) {
				Static83.anInt1972--;
				for (@Pc(32) int local32 = local14; local32 < Static83.anInt1972; local32++) {
					Static32.aClass60Array4[local32] = Static32.aClass60Array4[local32 + 1];
					Static61.anIntArray177[local32] = Static61.anIntArray177[local32 + 1];
					Static35.aLongArray4[local32] = Static35.aLongArray4[local32 + 1];
					Static46.anIntArray116[local32] = Static46.anIntArray116[local32 + 1];
				}
				Static8.anInt94 = Static87.anInt2052;
				Static14.aClass4_Sub9_Sub1_1.method826(229);
				Static14.aClass4_Sub9_Sub1_1.method805(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
	public static int method616(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method617() {
		aClass60_417 = null;
		aClass60_416 = null;
		aClass60_418 = null;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method618() {
		Static81.aClass12_16.method284();
		Static121.aClass12_26.method284();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!tf;IIIIII)V")
	public static void method619(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(22) int local22;
		if (arg0 < 0 || arg0 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local22 = arg1.method773();
				if (local22 == 0) {
					break;
				}
				if (local22 == 1) {
					arg1.method773();
					break;
				}
				if (local22 <= 49) {
					arg1.method773();
				}
			}
			return;
		}
		Static69.aByteArrayArrayArray5[arg4][arg0][arg3] = 0;
		while (true) {
			local22 = arg1.method773();
			if (local22 == 0) {
				if (arg4 == 0) {
					Static16.anIntArrayArrayArray1[0][arg0][arg3] = -Static48.method664(arg0 + arg2 + 932731, arg3 + 556238 + arg5) * 8;
				} else {
					Static16.anIntArrayArrayArray1[arg4][arg0][arg3] = Static16.anIntArrayArrayArray1[arg4 - 1][arg0][arg3] - 240;
				}
				break;
			}
			if (local22 == 1) {
				@Pc(120) int local120 = arg1.method773();
				if (local120 == 1) {
					local120 = 0;
				}
				if (arg4 == 0) {
					Static16.anIntArrayArrayArray1[0][arg0][arg3] = -local120 * 8;
				} else {
					Static16.anIntArrayArrayArray1[arg4][arg0][arg3] = Static16.anIntArrayArrayArray1[arg4 - 1][arg0][arg3] - local120 * 8;
				}
				break;
			}
			if (local22 <= 49) {
				Static9.aByteArrayArrayArray1[arg4][arg0][arg3] = arg1.method797();
				Static53.aByteArrayArrayArray3[arg4][arg0][arg3] = (byte) ((local22 - 2) / 4);
				Static119.aByteArrayArrayArray7[arg4][arg0][arg3] = (byte) (local22 + arg6 - 2 & 0x3);
			} else if (local22 <= 81) {
				Static69.aByteArrayArrayArray5[arg4][arg0][arg3] = (byte) (local22 - 49);
			} else {
				Static112.aByteArrayArrayArray6[arg4][arg0][arg3] = (byte) (local22 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZZ)V")
	public static void method620(@OriginalArg(0) boolean arg0) {
		Static56.aBoolean47 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(151) int local151;
		if (!Static56.aBoolean47) {
			local18 = Static96.aClass4_Sub9_Sub1_2.method816();
			local22 = Static96.aClass4_Sub9_Sub1_2.method769();
			local30 = (Static7.anInt79 - Static96.aClass4_Sub9_Sub1_2.anInt1312) / 16;
			Static101.anIntArrayArray89 = new int[local30][4];
			for (local36 = 0; local36 < local30; local36++) {
				for (local40 = 0; local40 < 4; local40++) {
					Static101.anIntArrayArray89[local36][local40] = Static96.aClass4_Sub9_Sub1_2.method780();
				}
			}
			local40 = Static96.aClass4_Sub9_Sub1_2.method798();
			local70 = Static96.aClass4_Sub9_Sub1_2.method771();
			local74 = Static96.aClass4_Sub9_Sub1_2.method816();
			Static39.aByteArrayArray5 = new byte[local30][];
			Static113.anIntArray133 = new int[local30];
			Static31.anIntArray93 = new int[local30];
			Static3.aByteArrayArray1 = new byte[local30][];
			Static50.anIntArray139 = new int[local30];
			@Pc(91) boolean local91 = false;
			if ((local70 / 8 == 48 || local70 / 8 == 49) && (local18 / 8) == 48) {
				local91 = true;
			}
			if (local70 / 8 == 48 && local18 / 8 == 148) {
				local91 = true;
			}
			local30 = 0;
			for (local134 = (local70 - 6) / 8; local134 <= (local70 + 6) / 8; local134++) {
				for (local142 = (local18 - 6) / 8; local142 <= (local18 + 6) / 8; local142++) {
					local151 = (local134 << 8) + local142;
					if (!local91 || local142 != 49 && local142 != 149 && local142 != 147 && local134 != 50 && (local134 != 49 || local142 != 47)) {
						Static50.anIntArray139[local30] = local151;
						Static113.anIntArray133[local30] = Static127.aClass10_Sub1_8.method1770(Static12.method1761(new Class60[] { Static98.aClass60_927, Static65.method1051(local134), Static68.aClass60_673, Static65.method1051(local142) }));
						Static31.anIntArray93[local30] = Static127.aClass10_Sub1_8.method1770(Static12.method1761(new Class60[] { Static130.aClass60_1124, Static65.method1051(local134), Static68.aClass60_673, Static65.method1051(local142) }));
						local30++;
					}
				}
			}
			Static90.method1472(local70, local40, local22, local18, local74);
			return;
		}
		local18 = Static96.aClass4_Sub9_Sub1_2.method802();
		Static96.aClass4_Sub9_Sub1_2.method832();
		for (local22 = 0; local22 < 4; local22++) {
			for (local30 = 0; local30 < 13; local30++) {
				for (local36 = 0; local36 < 13; local36++) {
					local40 = Static96.aClass4_Sub9_Sub1_2.method833(1);
					if (local40 == 1) {
						Static67.anIntArrayArrayArray6[local22][local30][local36] = Static96.aClass4_Sub9_Sub1_2.method833(26);
					} else {
						Static67.anIntArrayArrayArray6[local22][local30][local36] = -1;
					}
				}
			}
		}
		Static96.aClass4_Sub9_Sub1_2.method828();
		local30 = (Static7.anInt79 - Static96.aClass4_Sub9_Sub1_2.anInt1312) / 16;
		Static101.anIntArrayArray89 = new int[local30][4];
		for (local36 = 0; local36 < local30; local36++) {
			for (local40 = 0; local40 < 4; local40++) {
				Static101.anIntArrayArray89[local36][local40] = Static96.aClass4_Sub9_Sub1_2.method782();
			}
		}
		local40 = Static96.aClass4_Sub9_Sub1_2.method771();
		local70 = Static96.aClass4_Sub9_Sub1_2.method816();
		local74 = Static96.aClass4_Sub9_Sub1_2.method773();
		@Pc(398) int local398 = Static96.aClass4_Sub9_Sub1_2.method802();
		Static39.aByteArrayArray5 = new byte[local30][];
		Static31.anIntArray93 = new int[local30];
		Static113.anIntArray133 = new int[local30];
		Static50.anIntArray139 = new int[local30];
		Static3.aByteArrayArray1 = new byte[local30][];
		local30 = 0;
		for (local134 = 0; local134 < 4; local134++) {
			for (local142 = 0; local142 < 13; local142++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(435) int local435 = Static67.anIntArrayArrayArray6[local134][local142][local151];
					if (local435 != -1) {
						@Pc(445) int local445 = local435 >> 14 & 0x3FF;
						@Pc(451) int local451 = local435 >> 3 & 0x7FF;
						@Pc(461) int local461 = (local445 / 8 << 8) + local451 / 8;
						for (@Pc(463) int local463 = 0; local463 < local30; local463++) {
							if (local461 == Static50.anIntArray139[local463]) {
								local461 = -1;
								break;
							}
						}
						if (local461 != -1) {
							Static50.anIntArray139[local30] = local461;
							@Pc(499) int local499 = local461 >> 8 & 0xFF;
							@Pc(503) int local503 = local461 & 0xFF;
							Static113.anIntArray133[local30] = Static127.aClass10_Sub1_8.method1770(Static12.method1761(new Class60[] { Static98.aClass60_927, Static65.method1051(local499), Static68.aClass60_673, Static65.method1051(local503) }));
							Static31.anIntArray93[local30] = Static127.aClass10_Sub1_8.method1770(Static12.method1761(new Class60[] { Static130.aClass60_1124, Static65.method1051(local499), Static68.aClass60_673, Static65.method1051(local503) }));
							local30++;
						}
					}
				}
			}
		}
		Static90.method1472(local398, local74, local40, local70, local18);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
	public static boolean method621() {
		@Pc(5) Class40 local5 = Static108.aClass40_1;
		synchronized (Static108.aClass40_1) {
			if (Static2.anInt17 == Static36.anInt1009) {
				return false;
			} else {
				Static81.anInt1917 = Static40.anIntArray109[Static36.anInt1009];
				Static9.anInt136 = Static81.anIntArray223[Static36.anInt1009];
				Static36.anInt1009 = Static36.anInt1009 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLclient!c;ILclient!od;Lclient!od;Z)V")
	public static void method622(@OriginalArg(1) Class10 arg0, @OriginalArg(3) Class60 arg1, @OriginalArg(4) Class60 arg2) {
		@Pc(8) int local8 = arg0.method1770(arg2);
		@Pc(26) int local26 = arg0.method1785(arg1, local8);
		Static6.method57(local8, local26, arg0, 255);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZLclient!c;Lclient!c;)V")
	public static void method623(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class10 arg2) {
		Static24.aBoolean34 = arg0;
		Static3.aClass10_4 = arg2;
		Static117.aClass10_30 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)Z")
	public static boolean method624(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
	public static void method625(@OriginalArg(1) int arg0) {
		Static12.anInt2556 += arg0 * 128;
		@Pc(21) int local21;
		if (Static77.anIntArray212.length < Static12.anInt2556) {
			Static12.anInt2556 -= Static77.anIntArray212.length;
			local21 = (int) (Math.random() * 12.0D);
			Static24.method442(Static9.aClass4_Sub3_Sub6_Sub2Array1[local21]);
		}
		local21 = 0;
		@Pc(41) int local41 = (256 - arg0) * 128;
		@Pc(45) int local45 = arg0 * 128;
		@Pc(76) int local76;
		for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
			local76 = Static80.anIntArray222[local21 + local45] - Static77.anIntArray212[Static77.anIntArray212.length - 1 & Static12.anInt2556 + local21] * arg0 / 6;
			if (local76 < 0) {
				local76 = 0;
			}
			Static80.anIntArray222[local21++] = local76;
		}
		@Pc(100) int local100;
		@Pc(102) int local102;
		@Pc(109) int local109;
		for (local76 = 256 - arg0; local76 < 256; local76++) {
			local100 = local76 * 128;
			for (local102 = 0; local102 < 128; local102++) {
				local109 = (int) (Math.random() * 100.0D);
				if (local109 < 50 && local102 > 10 && local102 < 118) {
					Static80.anIntArray222[local102 + local100] = 255;
				} else {
					Static80.anIntArray222[local100 + local102] = 0;
				}
			}
		}
		if (Static96.anInt2277 > 0) {
			Static96.anInt2277 -= arg0 * 4;
		}
		if (Static56.anInt1514 > 0) {
			Static56.anInt1514 -= arg0 * 4;
		}
		if (Static56.anInt1514 == 0 && Static96.anInt2277 == 0) {
			local100 = (int) (Math.random() * (double) (2000 / arg0));
			if (local100 == 1) {
				Static96.anInt2277 = 1024;
			}
			if (local100 == 0) {
				Static56.anInt1514 = 1024;
			}
		}
		for (local100 = 0; local100 < 256 - arg0; local100++) {
			Static107.anIntArray323[local100] = Static107.anIntArray323[arg0 + local100];
		}
		for (local102 = 256 - arg0; local102 < 256; local102++) {
			Static107.anIntArray323[local102] = (int) (Math.sin((double) Static76.anInt1840 / 14.0D) * 16.0D + Math.sin((double) Static76.anInt1840 / 15.0D) * 14.0D + Math.sin((double) Static76.anInt1840 / 16.0D) * 12.0D);
			Static76.anInt1840++;
		}
		Static125.anInt2825 += arg0;
		local109 = ((Static118.anInt2741 & 0x1) + arg0) / 2;
		if (local109 <= 0) {
			return;
		}
		@Pc(280) int local280;
		@Pc(287) int local287;
		for (@Pc(271) int local271 = 0; local271 < Static125.anInt2825 * 100; local271++) {
			local280 = (int) (Math.random() * 124.0D) + 2;
			local287 = (int) (Math.random() * 128.0D) + 128;
			Static80.anIntArray222[(local287 << 7) + local280] = 192;
		}
		Static125.anInt2825 = 0;
		@Pc(317) int local317;
		@Pc(320) int local320;
		for (local280 = 0; local280 < 256; local280++) {
			local287 = 0;
			local317 = local280 * 128;
			for (local320 = -local109; local320 < 128; local320++) {
				if (local109 + local320 < 128) {
					local287 += Static80.anIntArray222[local317 + local320 + local109];
				}
				if (local320 - local109 - 1 >= 0) {
					local287 -= Static80.anIntArray222[local320 + local317 - local109 - 1];
				}
				if (local320 >= 0) {
					Static53.anIntArray146[local320 + local317] = local287 / (local109 * 2 + 1);
				}
			}
		}
		for (local287 = 0; local287 < 128; local287++) {
			local317 = 0;
			for (local320 = -local109; local320 < 256; local320++) {
				@Pc(399) int local399 = local320 * 128;
				if (local109 + local320 < 256) {
					local317 += Static53.anIntArray146[local399 + local287 + local109 * 128];
				}
				if (local320 - local109 - 1 >= 0) {
					local317 -= Static53.anIntArray146[local287 + local399 - local109 * 128 - 128];
				}
				if (local320 >= 0) {
					Static80.anIntArray222[local287 + local399] = local317 / (local109 * 2 + 1);
				}
			}
		}
	}
}

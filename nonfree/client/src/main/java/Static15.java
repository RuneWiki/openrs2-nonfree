import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public static int anInt278;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
	public static int anInt296 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
	public static void method261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(14) int local14 = arg4 + arg2;
		@Pc(16) int local16;
		for (local16 = arg2; local16 < local14; local16++) {
			Static129.method2127(arg1, arg5, arg0, Static234.anIntArrayArray40[local16]);
		}
		@Pc(40) int local40 = arg1 - arg4;
		for (local16 = arg3; local16 > local10; local16--) {
			Static129.method2127(arg1, arg5, arg0, Static234.anIntArrayArray40[local16]);
		}
		@Pc(65) int local65 = arg5 + arg4;
		for (local16 = local14; local16 <= local10; local16++) {
			@Pc(74) int[] local74 = Static234.anIntArrayArray40[local16];
			Static129.method2127(local65, arg5, arg0, local74);
			Static129.method2127(arg1, local40, arg0, local74);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I")
	public static int method262(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method264(@OriginalArg(1) int arg0) {
		@Pc(4) String local4 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local4.length() - 3; local13 > 0; local13 -= 3) {
			local4 = local4.substring(0, local13) + "," + local4.substring(local13);
		}
		if (local4.length() <= 9) {
			return local4.length() > 6 ? " <col=ffffff>" + local4.substring(0, local4.length() - 4) + Static220.aString140 + " (" + local4 + ")</col>" : " <col=ffff00>" + local4 + "</col>";
		} else {
			return " <col=00ff80>" + local4.substring(0, local4.length() - 8) + Static230.aString147 + " (" + local4 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(IB)V")
	public static void method265(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static136.anIntArray251[arg0];
		@Pc(19) int local19 = Static66.anIntArray136[arg0];
		@Pc(23) int local23 = Static299.aShortArray93[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(35) int local35 = (int) Static100.aLongArray4[arg0];
		@Pc(39) long local39 = Static100.aLongArray4[arg0];
		if (local23 == 8) {
			Static237.anInt4589 = Static35.anInt708;
			Static145.anInt2968 = Static147.anInt2993;
			Static127.anInt2701 = 2;
			Static126.anInt2697 = 0;
			Static142.aClass4_Sub17_Sub1_3.method1905(79);
			Static142.aClass4_Sub17_Sub1_3.method1855(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static142.aClass4_Sub17_Sub1_3.method1897(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1876(Static170.anInt3385 + local19);
		}
		if (local23 == 1003) {
			Static127.anInt2701 = 2;
			Static145.anInt2968 = Static147.anInt2993;
			Static126.anInt2697 = 0;
			Static237.anInt4589 = Static35.anInt708;
			Static142.aClass4_Sub17_Sub1_3.method1905(96);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
		}
		if (local23 == 60) {
			Static142.aClass4_Sub17_Sub1_3.method1905(143);
			Static142.aClass4_Sub17_Sub1_3.method1852(local15);
			Static142.aClass4_Sub17_Sub1_3.method1876(local19);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 1) {
			Static237.anInt4589 = Static35.anInt708;
			Static126.anInt2697 = 0;
			Static127.anInt2701 = 2;
			Static145.anInt2968 = Static147.anInt2993;
			Static142.aClass4_Sub17_Sub1_3.method1905(67);
			Static142.aClass4_Sub17_Sub1_3.method1897(Static170.anInt3385 + local19);
			Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1897(local35);
		}
		if (local23 == 50) {
			Static142.aClass4_Sub17_Sub1_3.method1905(221);
			Static142.aClass4_Sub17_Sub1_3.method1876(Static161.anInt3204);
			Static142.aClass4_Sub17_Sub1_3.method1852(Static52.anInt1044);
			Static142.aClass4_Sub17_Sub1_3.method1876(local19);
			Static142.aClass4_Sub17_Sub1_3.method1893(local15);
		}
		if (local23 == 29) {
			Static126.anInt2697 = 0;
			Static127.anInt2701 = 2;
			Static145.anInt2968 = Static147.anInt2993;
			Static237.anInt4589 = Static35.anInt708;
			Static142.aClass4_Sub17_Sub1_3.method1905(137);
			Static142.aClass4_Sub17_Sub1_3.method1876(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static142.aClass4_Sub17_Sub1_3.method1876(local15 + Static239.anInt4613);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
		}
		@Pc(297) Class12_Sub3_Sub1 local297;
		if (local23 == 30) {
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				Static145.anInt2968 = Static147.anInt2993;
				Static127.anInt2701 = 2;
				Static126.anInt2697 = 0;
				Static237.anInt4589 = Static35.anInt708;
				Static142.aClass4_Sub17_Sub1_3.method1905(97);
				Static142.aClass4_Sub17_Sub1_3.method1855(local35);
				Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 42) {
			Static127.anInt2701 = 2;
			Static237.anInt4589 = Static35.anInt708;
			Static126.anInt2697 = 0;
			Static145.anInt2968 = Static147.anInt2993;
			Static142.aClass4_Sub17_Sub1_3.method1905(238);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static161.anInt3204);
			Static142.aClass4_Sub17_Sub1_3.method1887(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1854(Static52.anInt1044);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static142.aClass4_Sub17_Sub1_3.method1876(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1855(local19 + Static170.anInt3385);
		}
		if (local23 == 4) {
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static127.anInt2701 = 2;
				Static145.anInt2968 = Static147.anInt2993;
				Static126.anInt2697 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(121);
				Static142.aClass4_Sub17_Sub1_3.method1855(Static294.anInt4283);
				Static142.aClass4_Sub17_Sub1_3.method1887(Static96.aBooleanArray15[82] ? 1 : 0);
				Static142.aClass4_Sub17_Sub1_3.method1855(Static235.anInt4581);
				Static142.aClass4_Sub17_Sub1_3.method1897(local35);
				Static142.aClass4_Sub17_Sub1_3.method1852(Static3.anInt65);
			}
		}
		@Pc(452) Class12_Sub3_Sub2 local452;
		if (local23 == 45) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static127.anInt2701 = 2;
				Static145.anInt2968 = Static147.anInt2993;
				Static126.anInt2697 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(116);
				Static142.aClass4_Sub17_Sub1_3.method1855(local35);
				Static142.aClass4_Sub17_Sub1_3.method1897(Static161.anInt3204);
				Static142.aClass4_Sub17_Sub1_3.method1854(Static52.anInt1044);
				Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		@Pc(538) int local538;
		@Pc(517) Class22 local517;
		if (local23 == 13) {
			Static142.aClass4_Sub17_Sub1_3.method1905(208);
			Static142.aClass4_Sub17_Sub1_3.method1854(local15);
			local517 = Static21.method3453(local15);
			if (local517.anIntArrayArray6 != null && local517.anIntArrayArray6[0][0] == 5) {
				local538 = local517.anIntArrayArray6[0][1];
				Static221.anIntArray393[local538] = 1 - Static221.anIntArray393[local538];
				Static102.method1653(local538);
			}
		}
		if (local23 == 5) {
			if (local35 == 0) {
				Static213.method3414(Static210.anInt4103, local19, local15);
			} else if (local35 == 1) {
				if (Static176.anInt829 > 0 && Static96.aBooleanArray15[82] && Static96.aBooleanArray15[81]) {
					Static213.method3420(Static239.anInt4613 + local15, local19 + Static170.anInt3385, Static210.anInt4103);
				} else {
					Static94.method1516(local19, 1, local15);
					Static142.aClass4_Sub17_Sub1_3.method1861(Static211.anInt4222);
					Static142.aClass4_Sub17_Sub1_3.method1861(Static11.anInt213);
					Static142.aClass4_Sub17_Sub1_3.method1875((int) Static270.aFloat49);
					Static142.aClass4_Sub17_Sub1_3.method1861(57);
					Static142.aClass4_Sub17_Sub1_3.method1861(Static113.anInt2470);
					Static142.aClass4_Sub17_Sub1_3.method1861(Static44.anInt879);
					Static142.aClass4_Sub17_Sub1_3.method1861(89);
					Static142.aClass4_Sub17_Sub1_3.method1875(Static239.aClass12_Sub3_Sub2_2.anInt4141);
					Static142.aClass4_Sub17_Sub1_3.method1875(Static239.aClass12_Sub3_Sub2_2.anInt4113);
					Static142.aClass4_Sub17_Sub1_3.method1861(Static68.anInt1269);
					Static142.aClass4_Sub17_Sub1_3.method1861(63);
				}
			}
		}
		if (local23 == 17) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static127.anInt2701 = 2;
				Static126.anInt2697 = 0;
				Static237.anInt4589 = Static35.anInt708;
				Static145.anInt2968 = Static147.anInt2993;
				Static142.aClass4_Sub17_Sub1_3.method1905(19);
				Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
				Static142.aClass4_Sub17_Sub1_3.method1897(local35);
			}
		}
		if (local23 == 1006) {
			Static126.anInt2697 = 0;
			Static145.anInt2968 = Static147.anInt2993;
			Static127.anInt2701 = 2;
			Static237.anInt4589 = Static35.anInt708;
			Static142.aClass4_Sub17_Sub1_3.method1905(49);
			Static142.aClass4_Sub17_Sub1_3.method1897(local35);
		}
		if (local23 == 16) {
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static145.anInt2968 = Static147.anInt2993;
				Static127.anInt2701 = 2;
				Static126.anInt2697 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(166);
				Static142.aClass4_Sub17_Sub1_3.method1876(local35);
				Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 1004) {
			local517 = Static21.method3453(local15);
			if (local517 == null || local517.anIntArray56[local19] < 100000) {
				Static142.aClass4_Sub17_Sub1_3.method1905(49);
				Static142.aClass4_Sub17_Sub1_3.method1897(local35);
			} else {
				Static271.method4062(local517.anIntArray56[local19] + " x " + Static277.method4117(local35).aString169, 0, "");
			}
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 23) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static145.anInt2968 = Static147.anInt2993;
				Static127.anInt2701 = 2;
				Static126.anInt2697 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(158);
				Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
				Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			}
		}
		if (local23 == 1005) {
			Static127.anInt2701 = 2;
			Static126.anInt2697 = 0;
			Static237.anInt4589 = Static35.anInt708;
			Static145.anInt2968 = Static147.anInt2993;
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				@Pc(876) Class175 local876 = local297.aClass175_1;
				if (local876.anIntArray462 != null) {
					local876 = local876.method4133();
				}
				if (local876 != null) {
					Static142.aClass4_Sub17_Sub1_3.method1905(72);
					Static142.aClass4_Sub17_Sub1_3.method1875(local876.anInt5224);
				}
			}
		}
		if (local23 == 25) {
			Static127.anInt2701 = 2;
			Static145.anInt2968 = Static147.anInt2993;
			Static237.anInt4589 = Static35.anInt708;
			Static126.anInt2697 = 0;
			Static142.aClass4_Sub17_Sub1_3.method1905(61);
			Static142.aClass4_Sub17_Sub1_3.method1887(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static142.aClass4_Sub17_Sub1_3.method1875(Static239.anInt4613 + local15);
		}
		if (local23 == 11) {
			Static142.aClass4_Sub17_Sub1_3.method1905(171);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static142.aClass4_Sub17_Sub1_3.method1843(local15);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 6 && Static32.aClass22_4 == null) {
			Static255.method3845(local15, local19);
			Static32.aClass22_4 = Static172.method2702(local15, local19);
			Static81.method3274(Static32.aClass22_4);
		}
		if (local23 == 46) {
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				Static126.anInt2697 = 0;
				Static127.anInt2701 = 2;
				Static237.anInt4589 = Static35.anInt708;
				Static145.anInt2968 = Static147.anInt2993;
				Static142.aClass4_Sub17_Sub1_3.method1905(254);
				Static142.aClass4_Sub17_Sub1_3.method1897(local35);
				Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 28) {
			Static47.method749();
		}
		if (local23 == 2) {
			Static142.aClass4_Sub17_Sub1_3.method1905(179);
			Static142.aClass4_Sub17_Sub1_3.method1897(local35);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19);
			Static142.aClass4_Sub17_Sub1_3.method1854(local15);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 26) {
			if (local35 == 0) {
				Static261.anInt4958 = 1;
				Static213.method3414(Static210.anInt4103, local19, local15);
			} else if (local35 == 1) {
				Static142.aClass4_Sub17_Sub1_3.method1905(251);
				Static142.aClass4_Sub17_Sub1_3.method1875(Static170.anInt3385 + local19);
				Static142.aClass4_Sub17_Sub1_3.method1897(Static161.anInt3204);
				Static142.aClass4_Sub17_Sub1_3.method1876(local15 + Static239.anInt4613);
				Static142.aClass4_Sub17_Sub1_3.method1893(Static52.anInt1044);
			}
		}
		if (local23 == 1001) {
			Static127.anInt2701 = 2;
			Static237.anInt4589 = Static35.anInt708;
			Static126.anInt2697 = 0;
			Static145.anInt2968 = Static147.anInt2993;
			Static142.aClass4_Sub17_Sub1_3.method1905(8);
			Static142.aClass4_Sub17_Sub1_3.method1876(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1876(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static142.aClass4_Sub17_Sub1_3.method1875(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1859(Static96.aBooleanArray15[82] ? 1 : 0);
		}
		if (local23 == 37) {
			Static142.aClass4_Sub17_Sub1_3.method1905(178);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static142.aClass4_Sub17_Sub1_3.method1852(local15);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 44) {
			Static237.anInt4589 = Static35.anInt708;
			Static127.anInt2701 = 2;
			Static145.anInt2968 = Static147.anInt2993;
			Static126.anInt2697 = 0;
			Static142.aClass4_Sub17_Sub1_3.method1905(145);
			Static142.aClass4_Sub17_Sub1_3.method1859(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1855(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1897(Integer.MAX_VALUE & (int) (local39 >>> 32));
		}
		if (local23 == 59) {
			Static145.anInt2968 = Static147.anInt2993;
			Static127.anInt2701 = 2;
			Static126.anInt2697 = 0;
			Static237.anInt4589 = Static35.anInt708;
			Static142.aClass4_Sub17_Sub1_3.method1905(134);
			Static142.aClass4_Sub17_Sub1_3.method1876(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1875(local35);
			Static142.aClass4_Sub17_Sub1_3.method1887(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1876(Static239.anInt4613 + local15);
		}
		if (local23 == 43) {
			Static142.aClass4_Sub17_Sub1_3.method1905(138);
			Static142.aClass4_Sub17_Sub1_3.method1897(Static294.anInt4283);
			Static142.aClass4_Sub17_Sub1_3.method1876(local19);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static235.anInt4581);
			Static142.aClass4_Sub17_Sub1_3.method1854(Static3.anInt65);
			Static142.aClass4_Sub17_Sub1_3.method1855(local35);
			Static142.aClass4_Sub17_Sub1_3.method1893(local15);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 7) {
			Static127.anInt2701 = 2;
			Static145.anInt2968 = Static147.anInt2993;
			Static126.anInt2697 = 0;
			Static237.anInt4589 = Static35.anInt708;
			Static142.aClass4_Sub17_Sub1_3.method1905(204);
			Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static235.anInt4581);
			Static142.aClass4_Sub17_Sub1_3.method1855(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static142.aClass4_Sub17_Sub1_3.method1852(Static3.anInt65);
			Static142.aClass4_Sub17_Sub1_3.method1897(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1876(Static294.anInt4283);
		}
		if (local23 == 33) {
			Static127.anInt2701 = 2;
			Static237.anInt4589 = Static35.anInt708;
			Static126.anInt2697 = 0;
			Static145.anInt2968 = Static147.anInt2993;
			Static142.aClass4_Sub17_Sub1_3.method1905(10);
			Static142.aClass4_Sub17_Sub1_3.method1897(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1897(local35);
			Static142.aClass4_Sub17_Sub1_3.method1876(Static235.anInt4581);
			Static142.aClass4_Sub17_Sub1_3.method1875(Static294.anInt4283);
			Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1852(Static3.anInt65);
		}
		if (local23 == 40) {
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static126.anInt2697 = 0;
				Static145.anInt2968 = Static147.anInt2993;
				Static127.anInt2701 = 2;
				Static142.aClass4_Sub17_Sub1_3.method1905(151);
				Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
				Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			}
		}
		if (local23 == 51) {
			Static142.aClass4_Sub17_Sub1_3.method1905(159);
			Static142.aClass4_Sub17_Sub1_3.method1897(local35);
			Static142.aClass4_Sub17_Sub1_3.method1893(local15);
			Static142.aClass4_Sub17_Sub1_3.method1897(local19);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 9) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static126.anInt2697 = 0;
				Static127.anInt2701 = 2;
				Static145.anInt2968 = Static147.anInt2993;
				Static142.aClass4_Sub17_Sub1_3.method1905(216);
				Static142.aClass4_Sub17_Sub1_3.method1855(local35);
				Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 22) {
			Static126.anInt2697 = 0;
			Static237.anInt4589 = Static35.anInt708;
			Static127.anInt2701 = 2;
			Static145.anInt2968 = Static147.anInt2993;
			Static142.aClass4_Sub17_Sub1_3.method1905(89);
			Static142.aClass4_Sub17_Sub1_3.method1876(local15 + Static239.anInt4613);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1887(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1843(Static52.anInt1044);
			Static142.aClass4_Sub17_Sub1_3.method1855(Integer.MAX_VALUE & (int) (local39 >>> 32));
			Static142.aClass4_Sub17_Sub1_3.method1875(Static161.anInt3204);
		}
		if (local23 == 58) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static127.anInt2701 = 2;
				Static145.anInt2968 = Static147.anInt2993;
				Static126.anInt2697 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(111);
				Static142.aClass4_Sub17_Sub1_3.method1876(local35);
				Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 18) {
			local517 = Static172.method2702(local15, local19);
			if (local517 != null) {
				Static66.method1016();
				@Pc(1754) Class4_Sub25 local1754 = Static40.method681(local517);
				Static97.method1569(local1754.anInt3559, local15, local1754.method2834(), local517.anInt539, local19, local517.anInt582);
				Static216.anInt4288 = 0;
				Static235.aString155 = Static118.method2030(local517);
				if (local517.aBoolean33) {
					Static254.aString165 = local517.aString9 + "<col=ffffff>";
				} else {
					Static254.aString165 = "<col=00ff00>" + local517.aString14 + "<col=ffffff>";
				}
				if (Static235.aString155 == null) {
					Static235.aString155 = "Null";
				}
			}
			return;
		}
		if (local23 == 35) {
			Static142.aClass4_Sub17_Sub1_3.method1905(219);
			Static142.aClass4_Sub17_Sub1_3.method1855(local19);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static161.anInt3204);
			Static142.aClass4_Sub17_Sub1_3.method1843(local15);
			Static142.aClass4_Sub17_Sub1_3.method1854(Static52.anInt1044);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 24) {
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static126.anInt2697 = 0;
				Static127.anInt2701 = 2;
				Static145.anInt2968 = Static147.anInt2993;
				Static142.aClass4_Sub17_Sub1_3.method1905(140);
				Static142.aClass4_Sub17_Sub1_3.method1897(local35);
				Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 34) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static237.anInt4589 = Static35.anInt708;
				Static126.anInt2697 = 0;
				Static145.anInt2968 = Static147.anInt2993;
				Static127.anInt2701 = 2;
				Static142.aClass4_Sub17_Sub1_3.method1905(212);
				Static142.aClass4_Sub17_Sub1_3.method1855(local35);
				Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 21) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static127.anInt2701 = 2;
				Static145.anInt2968 = Static147.anInt2993;
				Static126.anInt2697 = 0;
				Static237.anInt4589 = Static35.anInt708;
				Static142.aClass4_Sub17_Sub1_3.method1905(210);
				Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
				Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			}
		}
		if (local23 == 20) {
			@Pc(1975) boolean local1975 = true;
			local517 = Static21.method3453(local15);
			if (local517.anInt612 > 0) {
				local1975 = Static57.method925(local517);
			}
			if (local1975) {
				Static142.aClass4_Sub17_Sub1_3.method1905(208);
				Static142.aClass4_Sub17_Sub1_3.method1854(local15);
			}
		}
		if (local23 == 19) {
			Static142.aClass4_Sub17_Sub1_3.method1905(201);
			Static142.aClass4_Sub17_Sub1_3.method1855(local35);
			Static142.aClass4_Sub17_Sub1_3.method1843(local15);
			Static142.aClass4_Sub17_Sub1_3.method1876(local19);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 14) {
			Static142.aClass4_Sub17_Sub1_3.method1905(38);
			Static142.aClass4_Sub17_Sub1_3.method1897(local35);
			Static142.aClass4_Sub17_Sub1_3.method1893(local15);
			Static142.aClass4_Sub17_Sub1_3.method1855(local19);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 36) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static126.anInt2697 = 0;
				Static145.anInt2968 = Static147.anInt2993;
				Static127.anInt2701 = 2;
				Static237.anInt4589 = Static35.anInt708;
				Static142.aClass4_Sub17_Sub1_3.method1905(83);
				Static142.aClass4_Sub17_Sub1_3.method1859(Static96.aBooleanArray15[82] ? 1 : 0);
				Static142.aClass4_Sub17_Sub1_3.method1855(local35);
			}
		}
		if (local23 == 32) {
			Static142.aClass4_Sub17_Sub1_3.method1905(245);
			Static142.aClass4_Sub17_Sub1_3.method1893(local15);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static142.aClass4_Sub17_Sub1_3.method1876(local19);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 12) {
			local297 = Static100.aClass12_Sub3_Sub1Array1[local35];
			if (local297 != null) {
				Static127.anInt2701 = 2;
				Static145.anInt2968 = Static147.anInt2993;
				Static237.anInt4589 = Static35.anInt708;
				Static126.anInt2697 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(13);
				Static142.aClass4_Sub17_Sub1_3.method1875(local35);
				Static142.aClass4_Sub17_Sub1_3.method1897(Static161.anInt3204);
				Static142.aClass4_Sub17_Sub1_3.method1893(Static52.anInt1044);
				Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 38) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static145.anInt2968 = Static147.anInt2993;
				Static237.anInt4589 = Static35.anInt708;
				Static127.anInt2701 = 2;
				Static126.anInt2697 = 0;
				Static142.aClass4_Sub17_Sub1_3.method1905(102);
				Static142.aClass4_Sub17_Sub1_3.method1855(local35);
				Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local23 == 41) {
			Static142.aClass4_Sub17_Sub1_3.method1905(208);
			Static142.aClass4_Sub17_Sub1_3.method1854(local15);
			local517 = Static21.method3453(local15);
			if (local517.anIntArrayArray6 != null && local517.anIntArrayArray6[0][0] == 5) {
				local538 = local517.anIntArrayArray6[0][1];
				if (local517.anIntArray50[0] != Static221.anIntArray393[local538]) {
					Static221.anIntArray393[local538] = local517.anIntArray50[0];
					Static102.method1653(local538);
				}
			}
		}
		if (local23 == 39) {
			Static145.anInt2968 = Static147.anInt2993;
			Static126.anInt2697 = 0;
			Static237.anInt4589 = Static35.anInt708;
			Static127.anInt2701 = 2;
			Static142.aClass4_Sub17_Sub1_3.method1905(46);
			Static142.aClass4_Sub17_Sub1_3.method1859(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1875(local15 + Static239.anInt4613);
			Static142.aClass4_Sub17_Sub1_3.method1855(local19 + Static170.anInt3385);
			Static142.aClass4_Sub17_Sub1_3.method1855(local35);
		}
		if (local23 == 31) {
			local452 = Static257.aClass12_Sub3_Sub2Array1[local35];
			if (local452 != null) {
				Static126.anInt2697 = 0;
				Static127.anInt2701 = 2;
				Static237.anInt4589 = Static35.anInt708;
				Static145.anInt2968 = Static147.anInt2993;
				Static142.aClass4_Sub17_Sub1_3.method1905(113);
				Static142.aClass4_Sub17_Sub1_3.method1897(Static294.anInt4283);
				Static142.aClass4_Sub17_Sub1_3.method1859(Static96.aBooleanArray15[82] ? 1 : 0);
				Static142.aClass4_Sub17_Sub1_3.method1875(Static235.anInt4581);
				Static142.aClass4_Sub17_Sub1_3.method1843(Static3.anInt65);
				Static142.aClass4_Sub17_Sub1_3.method1897(local35);
			}
		}
		if (local23 == 10) {
			if (local35 == 0) {
				Static34.anInt671 = 1;
				Static213.method3414(Static210.anInt4103, local19, local15);
			} else if (Static176.anInt829 > 0 && Static96.aBooleanArray15[82] && Static96.aBooleanArray15[81]) {
				Static213.method3420(local15 + Static239.anInt4613, Static170.anInt3385 + local19, Static210.anInt4103);
			} else {
				Static142.aClass4_Sub17_Sub1_3.method1905(232);
				Static142.aClass4_Sub17_Sub1_3.method1897(Static239.anInt4613 + local15);
				Static142.aClass4_Sub17_Sub1_3.method1876(Static170.anInt3385 + local19);
			}
		}
		if (local23 == 15) {
			Static126.anInt2697 = 0;
			Static145.anInt2968 = Static147.anInt2993;
			Static127.anInt2701 = 2;
			Static237.anInt4589 = Static35.anInt708;
			Static142.aClass4_Sub17_Sub1_3.method1905(228);
			Static142.aClass4_Sub17_Sub1_3.method1875(local35);
			Static142.aClass4_Sub17_Sub1_3.method1884(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1855(Static239.anInt4613 + local15);
			Static142.aClass4_Sub17_Sub1_3.method1876(Static170.anInt3385 + local19);
		}
		if (local23 == 47) {
			Static142.aClass4_Sub17_Sub1_3.method1905(73);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static142.aClass4_Sub17_Sub1_3.method1852(local15);
			Static142.aClass4_Sub17_Sub1_3.method1897(local19);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 == 48) {
			Static127.anInt2701 = 2;
			Static126.anInt2697 = 0;
			Static237.anInt4589 = Static35.anInt708;
			Static145.anInt2968 = Static147.anInt2993;
			Static142.aClass4_Sub17_Sub1_3.method1905(94);
			Static142.aClass4_Sub17_Sub1_3.method1897(Static170.anInt3385 + local19);
			Static142.aClass4_Sub17_Sub1_3.method1859(Static96.aBooleanArray15[82] ? 1 : 0);
			Static142.aClass4_Sub17_Sub1_3.method1875(local15 + Static239.anInt4613);
			Static142.aClass4_Sub17_Sub1_3.method1876(Integer.MAX_VALUE & (int) (local39 >>> 32));
		}
		if (local23 == 49 || local23 == 1002) {
			Static57.method929(local19, local35, Static35.aStringArray7[arg0], local15);
		}
		if (local23 == 57) {
			Static142.aClass4_Sub17_Sub1_3.method1905(65);
			Static142.aClass4_Sub17_Sub1_3.method1893(local15);
			Static142.aClass4_Sub17_Sub1_3.method1875(local19);
			Static142.aClass4_Sub17_Sub1_3.method1876(local35);
			Static136.anInt2804 = 0;
			Static287.aClass22_11 = Static21.method3453(local15);
			Static79.anInt1518 = local19;
		}
		if (local23 != 3) {
			if (Static216.anInt4288 != 0) {
				Static216.anInt4288 = 0;
				Static81.method3274(Static21.method3453(Static3.anInt65));
			}
			if (Static26.aBoolean30) {
				Static66.method1016();
			}
			if (Static287.aClass22_11 != null && Static136.anInt2804 == 0) {
				Static81.method3274(Static287.aClass22_11);
			}
			return;
		}
		Static66.method1016();
		local517 = Static21.method3453(local15);
		Static216.anInt4288 = 1;
		Static3.anInt65 = local15;
		Static294.anInt4283 = local19;
		Static235.anInt4581 = local35;
		Static81.method3274(local517);
		Static222.aString143 = "<col=ff9040>" + Static277.method4117(local35).aString169 + "<col=ffffff>";
		if (Static222.aString143 == null) {
			Static222.aString143 = "null";
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)Z")
	public static boolean method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static211.anIntArrayArrayArray9[arg0][arg1][arg2];
		if (local7 == -Static65.anInt1217) {
			return false;
		} else if (local7 == Static65.anInt1217) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static96.method1563(local22 + 1, Static250.anIntArrayArrayArray13[arg0][arg1][arg2], local26 + 1) && Static96.method1563(local22 + 128 - 1, Static250.anIntArrayArrayArray13[arg0][arg1 + 1][arg2], local26 + 1) && Static96.method1563(local22 + 128 - 1, Static250.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static96.method1563(local22 + 1, Static250.anIntArrayArrayArray13[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static211.anIntArrayArrayArray9[arg0][arg1][arg2] = Static65.anInt1217;
				return true;
			} else {
				Static211.anIntArrayArrayArray9[arg0][arg1][arg2] = -Static65.anInt1217;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method267() {
		anIntArrayArrayArray2 = null;
	}
}

import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_888 = Static33.method650("rot:");

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!ab;")
	public static Class2 aClass2_3 = new Class2(32);

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt1586 = 0;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "J")
	public static volatile long aLong40 = 0L;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public static int anInt1592 = 0;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public static int anInt1593 = 78;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_889 = Static33.method650("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!td;III[Lclient!td;IIIII)Lclient!td;")
	public static Class3_Sub1_Sub16 method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub16[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 > arg8 || arg0 > arg3 || arg8 >= arg10 || arg3 >= arg1) {
			return null;
		}
		for (@Pc(33) int local33 = 0; local33 < arg6.length; local33++) {
			@Pc(39) Class3_Sub1_Sub16 local39 = arg6[local33];
			if (local39 != null && arg7 == local39.anInt2845 && !Static109.method1157(local39) && arg2 != local39) {
				@Pc(62) int local62 = arg4 + local39.anInt2855 - arg5;
				@Pc(70) int local70 = local39.anInt2797 + arg0 - arg9;
				if (local39.anInt2857 == 0) {
					@Pc(99) Class3_Sub1_Sub16 local99 = method1060(local70, local39.anInt2827 + local70, arg2, arg3, local62, local39.anInt2842, arg6, local39.anInt2817, arg8, local39.anInt2806, local39.anInt2854 + local62);
					if (local99 != null) {
						return local99;
					}
					if (local39.aClass3_Sub1_Sub16Array2 != null) {
						local99 = method1060(local70, local70 + local39.anInt2827, arg2, arg3, local62, local39.anInt2842, local39.aClass3_Sub1_Sub16Array2, local39.anInt2817, arg8, local39.anInt2806, local39.anInt2854 + local62);
						if (local99 != null) {
							return local99;
						}
					}
				}
				if (Static13.method246(Static34.method652(local39)) && local62 <= arg8 && local70 <= arg3 && local39.anInt2854 + local62 > arg8 && arg3 < local39.anInt2827 + local70) {
					return local39;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBI)V")
	private static void method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub18 local8 = (Class3_Sub18) aClass2_3.method17((long) arg0);
		if (local8 == null) {
			local8 = new Class3_Sub18();
			aClass2_3.method12(local8, (long) arg0);
		}
		if (arg2 >= local8.anIntArray298.length) {
			@Pc(38) int[] local38 = new int[arg2 + 1];
			@Pc(43) int[] local43 = new int[arg2 + 1];
			for (@Pc(45) int local45 = 0; local45 < local8.anIntArray298.length; local45++) {
				local38[local45] = local8.anIntArray298[local45];
				local43[local45] = local8.anIntArray300[local45];
			}
			for (@Pc(75) int local75 = local8.anIntArray298.length; local75 < arg2; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local8.anIntArray300 = local43;
			local8.anIntArray298 = local38;
		}
		local8.anIntArray298[arg2] = arg3;
		local8.anIntArray300[arg2] = arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method1062() {
		@Pc(7) int local7 = Static115.anInt2940;
		@Pc(9) int local9 = Static23.anInt690;
		@Pc(11) int local11 = Static14.anInt319;
		@Pc(13) int local13 = Static57.anInt1610;
		Static6.method1487(local7, local9, local11, local13, 6116423);
		Static6.method1487(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static6.method1495(local7 + 1, local9 - -18, local11 - 2, local13 + -19, 0);
		Static57.aClass3_Sub1_Sub1_Sub1_3.method738(Static114.aClass56_1569, local7 + 3, local9 + 14, 6116423);
		@Pc(59) int local59 = Static36.anInt1021;
		@Pc(61) int local61 = Static102.anInt3222;
		if (Static42.anInt1117 == 0) {
			local59 -= 4;
			local61 -= 4;
		}
		if (Static42.anInt1117 == 1) {
			local61 -= 205;
			local59 -= 553;
		}
		if (Static42.anInt1117 == 2) {
			local61 -= 357;
			local59 -= 17;
		}
		for (@Pc(80) int local80 = 0; local80 < Static66.anInt559; local80++) {
			@Pc(103) int local103 = (Static66.anInt559 - local80 - 1) * 15 + local9 + 31;
			@Pc(105) int local105 = 16777215;
			if (local59 > local7 && local59 < local11 + local7 && local103 - 13 < local61 && local103 + 3 > local61) {
				local105 = 16776960;
			}
			Static57.aClass3_Sub1_Sub1_Sub1_3.method733(Static28.aClass56Array2[local80], local7 + 3, local103, local105, true);
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method1063() {
		aClass56_888 = null;
		aClass2_3 = null;
		aClass56_889 = null;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
	public static boolean method1064() {
		if (Static117.aClass17_4 == null) {
			return false;
		}
		@Pc(196) int local196;
		try {
			@Pc(13) int local13 = Static117.aClass17_4.method499();
			if (local13 == 0) {
				return false;
			}
			if (Static43.anInt1142 == -1) {
				Static117.aClass17_4.method500(0, 1, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
				local13--;
				Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
				Static43.anInt1142 = Static31.aClass3_Sub2_Sub1_3.method319();
				Static73.anInt2013 = Static43.anIntArray76[Static43.anInt1142];
			}
			if (Static73.anInt2013 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static117.aClass17_4.method500(0, 1, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
				Static73.anInt2013 = Static31.aClass3_Sub2_Sub1_3.aByteArray7[0] & 0xFF;
			}
			if (Static73.anInt2013 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static117.aClass17_4.method500(0, 2, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
				Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
				Static73.anInt2013 = Static31.aClass3_Sub2_Sub1_3.method276();
			}
			if (local13 < Static73.anInt2013) {
				return false;
			}
			Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
			Static117.aClass17_4.method500(0, Static73.anInt2013, Static31.aClass3_Sub2_Sub1_3.aByteArray7);
			Static8.anInt210 = 0;
			Static99.anInt895 = Static122.anInt3002;
			Static122.anInt3002 = Static48.anInt1395;
			Static48.anInt1395 = Static43.anInt1142;
			@Pc(126) int local126;
			if (Static43.anInt1142 == 123) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method284();
				@Pc(130) byte local130 = Static31.aClass3_Sub2_Sub1_3.method286();
				Static87.anIntArray199[local126] = local130;
				if (Static115.anIntArray292[local126] != local130) {
					Static115.anIntArray292[local126] = local130;
					Static11.method234(local126);
					if (Static69.anInt1918 != -1) {
						Static12.aBoolean17 = true;
					}
					Static115.aBoolean157 = true;
				}
				Static5.anInt69 = Static98.anInt2566;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 118) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method276();
				if (local126 == 65535) {
					local126 = -1;
				}
				Static57.method1075(local126);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 55) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method312();
				if (local126 == 65535) {
					local126 = -1;
				}
				local196 = Static31.aClass3_Sub2_Sub1_3.method264();
				Static99.method619(local196, local126);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 220) {
				Static86.method1602();
				Static43.anInt1142 = -1;
				return true;
			}
			@Pc(230) int local230;
			@Pc(236) int local236;
			@Pc(244) int local244;
			if (Static43.anInt1142 == 97) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method284();
				local230 = local126 >> 10 & 0x1F;
				local236 = local126 >> 5 & 0x1F;
				local196 = Static31.aClass3_Sub2_Sub1_3.method278();
				local244 = local126 & 0x1F;
				@Pc(248) Class3_Sub1_Sub16 local248 = Static96.method1688(local196);
				local248.anInt2822 = (local244 << 3) + (local236 << 11) + (local230 << 19);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 19) {
				for (local126 = 0; local126 < Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1.length; local126++) {
					if (Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local126] != null) {
						Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local126].anInt3149 = -1;
					}
				}
				for (local196 = 0; local196 < Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1.length; local196++) {
					if (Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local196] != null) {
						Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local196].anInt3149 = -1;
					}
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 235) {
				Static86.anInt2355 = Static31.aClass3_Sub2_Sub1_3.method270();
				if (Static86.anInt2355 == 1) {
					Static126.anInt3102 = Static31.aClass3_Sub2_Sub1_3.method276();
				}
				if (Static86.anInt2355 >= 2 && Static86.anInt2355 <= 6) {
					if (Static86.anInt2355 == 2) {
						Static62.anInt1803 = 64;
						Static79.anInt2102 = 64;
					}
					if (Static86.anInt2355 == 3) {
						Static79.anInt2102 = 64;
						Static62.anInt1803 = 0;
					}
					if (Static86.anInt2355 == 4) {
						Static79.anInt2102 = 64;
						Static62.anInt1803 = 128;
					}
					if (Static86.anInt2355 == 5) {
						Static79.anInt2102 = 0;
						Static62.anInt1803 = 64;
					}
					if (Static86.anInt2355 == 6) {
						Static62.anInt1803 = 64;
						Static79.anInt2102 = 128;
					}
					Static86.anInt2355 = 2;
					Static75.anInt2024 = Static31.aClass3_Sub2_Sub1_3.method276();
					Static68.anInt1869 = Static31.aClass3_Sub2_Sub1_3.method276();
					Static108.anInt2715 = Static31.aClass3_Sub2_Sub1_3.method270();
				}
				if (Static86.anInt2355 == 10) {
					Static44.anInt1154 = Static31.aClass3_Sub2_Sub1_3.method276();
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 122) {
				Static106.anInt2633 = Static31.aClass3_Sub2_Sub1_3.method284() * 30;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 32) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method270();
				local196 = Static31.aClass3_Sub2_Sub1_3.method270();
				local230 = Static31.aClass3_Sub2_Sub1_3.method270();
				local236 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static60.aBooleanArray5[local126] = true;
				Static72.anIntArray81[local126] = local196;
				Static118.anIntArray306[local126] = local230;
				Static38.anIntArray64[local126] = local236;
				Static84.anIntArray192[local126] = 0;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 119) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method299();
				Static51.method981(local126);
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static12.aBoolean17 = true;
					Static57.anInt1609 = -1;
				}
				if (Static63.anInt1818 != -1) {
					Static25.method532(Static63.anInt1818);
					Static63.anInt1818 = -1;
					Static79.method1393(30);
				}
				if (Static88.anInt2370 != -1) {
					Static25.method532(Static88.anInt2370);
					Static88.anInt2370 = -1;
				}
				if (Static57.anInt1607 != -1) {
					Static25.method532(Static57.anInt1607);
					Static57.anInt1607 = -1;
				}
				if (local126 == Static111.anInt2804) {
					Static25.method531(Static111.anInt2804);
				} else {
					Static25.method532(Static111.anInt2804);
					Static111.anInt2804 = local126;
				}
				Static115.aBoolean157 = true;
				Static79.anInt2107 = -1;
				if (Static126.anInt3105 != 0) {
					Static12.aBoolean17 = true;
					Static126.anInt3105 = 0;
				}
				Static124.aBoolean167 = true;
				Static106.method1757(Static111.anInt2804);
				Static43.anInt1142 = -1;
				return true;
			}
			@Pc(573) long local573;
			@Pc(583) long local583;
			@Pc(565) long local565;
			@Pc(591) long local591;
			if (Static43.anInt1142 == 183) {
				local565 = Static31.aClass3_Sub2_Sub1_3.method266();
				@Pc(569) byte local569 = Static31.aClass3_Sub2_Sub1_3.method265();
				local573 = Static31.aClass3_Sub2_Sub1_3.method266();
				@Pc(578) long local578 = (long) Static31.aClass3_Sub2_Sub1_3.method276();
				local583 = Static31.aClass3_Sub2_Sub1_3.method264();
				@Pc(585) boolean local585 = false;
				local591 = local583 + (local578 << 32);
				@Pc(595) int local595 = Static31.aClass3_Sub2_Sub1_3.method270();
				for (@Pc(597) int local597 = 0; local597 < 100; local597++) {
					if (local591 == Static48.aLongArray14[local597]) {
						local585 = true;
						break;
					}
				}
				if (local595 <= 1) {
					for (@Pc(622) int local622 = 0; local622 < Static63.anInt1820; local622++) {
						if (local565 == Static84.aLongArray24[local622]) {
							local585 = true;
							break;
						}
					}
				}
				if (!local585 && Static4.anInt59 == 0) {
					Static48.aLongArray14[Static94.anInt2463] = local591;
					Static94.anInt2463 = (Static94.anInt2463 + 1) % 100;
					@Pc(669) Class56 local669 = Static60.method1187(Static31.aClass3_Sub2_Sub1_3).method1419();
					@Pc(698) Class56 local698 = Static84.method1524(new Class56[] { Static9.aClass56_121, Static16.method342(local573), Static23.aClass56_345, Static111.method1851(local569), Static111.aClass56_1540 });
					if (local595 == 2 || local595 == 3) {
						Static75.method1348(7, local669, Static84.method1524(new Class56[] { local698, Static44.aClass56_694, Static16.method342(local565).method1421() }));
					} else if (local595 == 1) {
						Static75.method1348(7, local669, Static84.method1524(new Class56[] { local698, Static41.aClass56_654, Static16.method342(local565).method1421() }));
					} else {
						Static75.method1348(3, local669, Static84.method1524(new Class56[] { local698, Static16.method342(local565).method1421() }));
					}
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 218) {
				Static27.anInt798 = Static31.aClass3_Sub2_Sub1_3.method283();
				Static124.aBoolean167 = true;
				Static115.aBoolean157 = true;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 15) {
				Static25.anInt756 = Static31.aClass3_Sub2_Sub1_3.method312();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 232) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method276();
				Static51.method981(local126);
				if (Static111.anInt2804 != -1) {
					Static25.method532(Static111.anInt2804);
					Static115.aBoolean157 = true;
					Static124.aBoolean167 = true;
					Static111.anInt2804 = -1;
				}
				if (Static63.anInt1818 != -1) {
					Static25.method532(Static63.anInt1818);
					Static63.anInt1818 = -1;
					Static79.method1393(30);
				}
				if (Static88.anInt2370 != -1) {
					Static25.method532(Static88.anInt2370);
					Static88.anInt2370 = -1;
				}
				if (Static57.anInt1607 != -1) {
					Static25.method532(Static57.anInt1607);
					Static57.anInt1607 = -1;
				}
				if (Static57.anInt1609 == local126) {
					Static25.method531(Static57.anInt1609);
				} else {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = local126;
				}
				Static79.anInt2107 = -1;
				Static106.method1757(Static57.anInt1609);
				Static12.aBoolean17 = true;
				Static43.anInt1142 = -1;
				return true;
			}
			@Pc(922) Class3_Sub1_Sub16 local922;
			if (Static43.anInt1142 == 34) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method298();
				local196 = Static31.aClass3_Sub2_Sub1_3.method276();
				local230 = Static31.aClass3_Sub2_Sub1_3.method278();
				if (local196 == 65535) {
					local196 = -1;
				}
				local922 = Static96.method1688(local126);
				@Pc(935) Class3_Sub1_Sub8 local935;
				if (local922.aBoolean149) {
					local922.anInt2814 = local230;
					local922.anInt2831 = local196;
					local935 = Static12.method239(local196);
					local922.anInt2858 = local935.anInt1751;
					local922.anInt2856 = local935.anInt1766;
					local922.anInt2837 = local935.anInt1740;
					local922.anInt2809 = local935.anInt1756;
					local922.anInt2801 = local935.anInt1753;
					if (local922.anInt2854 > 0) {
						local922.anInt2837 = local922.anInt2837 * 32 / local922.anInt2854;
					}
					local922.anInt2826 = local935.anInt1760;
					Static122.method1958(local922);
				} else if (local196 == -1) {
					Static43.anInt1142 = -1;
					local922.anInt2841 = 0;
					return true;
				} else {
					local935 = Static12.method239(local196);
					local922.anInt2805 = local196;
					local922.anInt2856 = local935.anInt1766;
					local922.anInt2837 = local935.anInt1740 * 100 / local230;
					local922.anInt2841 = 4;
					local922.anInt2858 = local935.anInt1751;
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 91) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method281();
				if (Static69.anInt1918 != local126) {
					Static25.method532(Static69.anInt1918);
					Static69.anInt1918 = local126;
				}
				Static12.aBoolean17 = true;
				Static106.method1757(Static69.anInt1918);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 8) {
				if (Static27.anInt798 == 12) {
					Static115.aBoolean157 = true;
				}
				Static47.anInt1377 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static43.anInt1142 = -1;
				return true;
			}
			@Pc(1084) Class3_Sub1_Sub16 local1084;
			if (Static43.anInt1142 == 94) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method315();
				local196 = Static31.aClass3_Sub2_Sub1_3.method310();
				local1084 = Static96.method1688(local196);
				if (local1084.anInt2835 != local126 || local126 == -1) {
					local1084.anInt2835 = local126;
					local1084.anInt2803 = 0;
					local1084.anInt2815 = 0;
				}
				Static43.anInt1142 = -1;
				return true;
			}
			@Pc(1121) Class3_Sub1_Sub16 local1121;
			if (Static43.anInt1142 == 204) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method298();
				local1121 = Static96.method1688(local126);
				local1121.anInt2841 = 3;
				local1121.anInt2805 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass42_1.method1086();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 131) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method283();
				local196 = Static31.aClass3_Sub2_Sub1_3.method270();
				local230 = Static31.aClass3_Sub2_Sub1_3.method294();
				Static94.anInt2470 = local126 >> 1;
				Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.method2031((local126 & 0x1) == 1, local196, local230);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 251) {
				Static38.anInt1028 = 0;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 14) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method299();
				local196 = Static31.aClass3_Sub2_Sub1_3.method312();
				local230 = Static31.aClass3_Sub2_Sub1_3.method267();
				local922 = Static96.method1688(local230);
				Static43.anInt1142 = -1;
				local922.anInt2860 = local126 + (local196 << 16);
				return true;
			}
			if (Static43.anInt1142 == 228) {
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = -1;
				}
				Static43.anInt1142 = -1;
				Static105.aBoolean121 = false;
				Static122.aClass56_1646 = Static122.aClass56_1633;
				Static12.aBoolean17 = true;
				Static126.anInt3105 = 1;
				return true;
			}
			if (Static43.anInt1142 == 201) {
				Static34.anInt966 = Static31.aClass3_Sub2_Sub1_3.method306();
				Static43.anInt1142 = -1;
				if (Static34.anInt966 == Static27.anInt798) {
					Static115.aBoolean157 = true;
					if (Static34.anInt966 == 3) {
						Static27.anInt798 = 1;
					} else {
						Static27.anInt798 = 3;
					}
				}
				return true;
			}
			if (Static43.anInt1142 == 44) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method284();
				local196 = Static31.aClass3_Sub2_Sub1_3.method278();
				local1084 = Static96.method1688(local196);
				local1084.anInt2841 = 2;
				Static43.anInt1142 = -1;
				local1084.anInt2805 = local126;
				return true;
			}
			@Pc(1301) Class56 local1301;
			if (Static43.anInt1142 == 38) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method270();
				local1301 = Static31.aClass3_Sub2_Sub1_3.method301();
				local230 = Static31.aClass3_Sub2_Sub1_3.method306();
				if (local126 >= 1 && local126 <= 5) {
					if (local1301.method1418(Static117.aClass56_1616)) {
						local1301 = null;
					}
					Static108.aClass56Array11[local126 - 1] = local1301;
					Static118.aBooleanArray14[local126 - 1] = local230 == 0;
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 100) {
				Static24.anInt707 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static115.aBoolean157 = true;
				Static43.anInt1142 = -1;
				Static5.anInt69 = Static98.anInt2566;
				return true;
			}
			if (Static43.anInt1142 == 3) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method267();
				local196 = Static31.aClass3_Sub2_Sub1_3.method312();
				local230 = Static31.aClass3_Sub2_Sub1_3.method299();
				local236 = Static31.aClass3_Sub2_Sub1_3.method299();
				@Pc(1383) Class3_Sub1_Sub16 local1383 = Static96.method1688(local126);
				local1383.anInt2856 = local236;
				local1383.anInt2837 = local230;
				Static43.anInt1142 = -1;
				local1383.anInt2858 = local196;
				return true;
			}
			if (Static43.anInt1142 == 153) {
				Static119.anInt2986 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 107) {
				Static27.aBoolean43 = true;
				Static77.anInt3137 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static69.anInt1917 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static33.anInt960 = Static31.aClass3_Sub2_Sub1_3.method276();
				Static14.anInt328 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static79.anInt2113 = Static31.aClass3_Sub2_Sub1_3.method270();
				if (Static79.anInt2113 >= 100) {
					Static57.anInt1615 = Static77.anInt3137 * 128 + 64;
					Static15.anInt433 = Static69.anInt1917 * 128 + 64;
					Static111.anInt2863 = Static27.method560(Static15.anInt433, Static94.anInt2470, Static57.anInt1615) - Static33.anInt960;
				}
				Static43.anInt1142 = -1;
				return true;
			}
			@Pc(1521) int local1521;
			@Pc(1537) int local1537;
			if (Static43.anInt1142 == 29) {
				Static27.aBoolean43 = true;
				Static31.anInt924 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static100.anInt2569 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static125.anInt3194 = Static31.aClass3_Sub2_Sub1_3.method276();
				Static68.anInt1865 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static53.anInt1523 = Static31.aClass3_Sub2_Sub1_3.method270();
				if (Static53.anInt1523 >= 100) {
					local196 = Static100.anInt2569 * 128 + 64;
					local126 = Static31.anInt924 * 128 + 64;
					local230 = Static27.method560(local196, Static94.anInt2470, local126) - Static125.anInt3194;
					local244 = local230 - Static111.anInt2863;
					local1521 = local196 - Static15.anInt433;
					local236 = local126 - Static57.anInt1615;
					local1537 = (int) Math.sqrt((double) (local1521 * local1521 + local236 * local236));
					Static97.anInt2547 = (int) (Math.atan2((double) local244, (double) local1537) * 325.949D) & 0x7FF;
					Static94.anInt2474 = (int) (-325.949D * Math.atan2((double) local236, (double) local1521)) & 0x7FF;
					if (Static97.anInt2547 < 128) {
						Static97.anInt2547 = 128;
					}
					if (Static97.anInt2547 > 383) {
						Static97.anInt2547 = 383;
					}
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 102) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method281();
				local196 = Static31.aClass3_Sub2_Sub1_3.method281();
				local230 = Static31.aClass3_Sub2_Sub1_3.method278();
				local922 = Static96.method1688(local230);
				Static43.anInt1142 = -1;
				local922.anInt2797 = local126 + local922.anInt2840;
				local922.anInt2855 = local196 + local922.anInt2848;
				return true;
			}
			if (Static43.anInt1142 == 176) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method278();
				local1121 = Static96.method1688(local126);
				for (local230 = 0; local230 < local1121.anIntArray267.length; local230++) {
					local1121.anIntArray267[local230] = -1;
					local1121.anIntArray267[local230] = 0;
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 39) {
				local565 = Static31.aClass3_Sub2_Sub1_3.method266();
				local230 = Static31.aClass3_Sub2_Sub1_3.method276();
				local236 = Static31.aClass3_Sub2_Sub1_3.method270();
				@Pc(1676) Class56 local1676 = Static16.method342(local565).method1421();
				for (local1521 = 0; local1521 < Static42.anInt1124; local1521++) {
					if (Static3.aLongArray36[local1521] == local565) {
						if (local230 != Static86.anIntArray195[local1521]) {
							Static86.anIntArray195[local1521] = local230;
							Static115.aBoolean157 = true;
							if (local230 > 0) {
								Static75.method1348(5, Static84.method1524(new Class56[] { local1676, Static109.aClass56_911 }), Static122.aClass56_1633);
							}
							if (local230 == 0) {
								Static75.method1348(5, Static84.method1524(new Class56[] { local1676, Static25.aClass56_366 }), Static122.aClass56_1633);
							}
						}
						Static59.anIntArray133[local1521] = local236;
						local1676 = null;
						break;
					}
				}
				@Pc(1757) boolean local1757 = false;
				if (local1676 != null && Static42.anInt1124 < 200) {
					Static3.aLongArray36[Static42.anInt1124] = local565;
					Static113.aClass56Array15[Static42.anInt1124] = local1676;
					Static86.anIntArray195[Static42.anInt1124] = local230;
					Static59.anIntArray133[Static42.anInt1124] = local236;
					Static42.anInt1124++;
					Static5.anInt69 = Static98.anInt2566;
					Static115.aBoolean157 = true;
				}
				while (!local1757) {
					local1757 = true;
					for (@Pc(1792) int local1792 = 0; local1792 < Static42.anInt1124 - 1; local1792++) {
						if (Static86.anIntArray195[local1792] != Static4.anInt54 && Static86.anIntArray195[local1792 + 1] == Static4.anInt54 || Static86.anIntArray195[local1792] == 0 && Static86.anIntArray195[local1792 + 1] != 0) {
							local1757 = false;
							@Pc(1829) int local1829 = Static86.anIntArray195[local1792];
							Static86.anIntArray195[local1792] = Static86.anIntArray195[local1792 + 1];
							Static86.anIntArray195[local1792 + 1] = local1829;
							@Pc(1847) Class56 local1847 = Static113.aClass56Array15[local1792];
							Static113.aClass56Array15[local1792] = Static113.aClass56Array15[local1792 + 1];
							Static113.aClass56Array15[local1792 + 1] = local1847;
							local591 = Static3.aLongArray36[local1792];
							Static3.aLongArray36[local1792] = Static3.aLongArray36[local1792 + 1];
							Static3.aLongArray36[local1792 + 1] = local591;
							@Pc(1883) int local1883 = Static59.anIntArray133[local1792];
							Static59.anIntArray133[local1792] = Static59.anIntArray133[local1792 + 1];
							Static59.anIntArray133[local1792 + 1] = local1883;
							Static115.aBoolean157 = true;
						}
					}
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 68) {
				Static38.anInt1031 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static53.anInt1522 = Static31.aClass3_Sub2_Sub1_3.method283();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 6) {
				Static66.anInt541 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static46.anInt2266 = Static31.aClass3_Sub2_Sub1_3.method270();
				anInt1592 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static43.anInt1142 = -1;
				Static12.aBoolean17 = true;
				Static105.aBoolean120 = true;
				return true;
			}
			if (Static43.anInt1142 == 229) {
				if (Static111.anInt2804 != -1) {
					Static25.method532(Static111.anInt2804);
					Static124.aBoolean167 = true;
					Static115.aBoolean157 = true;
					Static111.anInt2804 = -1;
				}
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = -1;
					Static12.aBoolean17 = true;
				}
				if (Static63.anInt1818 != -1) {
					Static25.method532(Static63.anInt1818);
					Static63.anInt1818 = -1;
					Static79.method1393(30);
				}
				if (Static88.anInt2370 != -1) {
					Static25.method532(Static88.anInt2370);
					Static88.anInt2370 = -1;
				}
				if (Static57.anInt1607 != -1) {
					Static25.method532(Static57.anInt1607);
					Static57.anInt1607 = -1;
				}
				Static79.anInt2107 = -1;
				Static43.anInt1142 = -1;
				if (Static126.anInt3105 != 0) {
					Static126.anInt3105 = 0;
					Static12.aBoolean17 = true;
				}
				return true;
			}
			if (Static43.anInt1142 == 151) {
				if (Static27.anInt798 == 12) {
					Static115.aBoolean157 = true;
				}
				Static33.anInt964 = Static31.aClass3_Sub2_Sub1_3.method315();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 80) {
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = -1;
				}
				Static43.anInt1142 = -1;
				Static105.aBoolean121 = false;
				Static122.aClass56_1646 = Static122.aClass56_1633;
				Static126.anInt3105 = 2;
				Static12.aBoolean17 = true;
				return true;
			}
			@Pc(2073) long local2073;
			if (Static43.anInt1142 == 244) {
				local565 = Static31.aClass3_Sub2_Sub1_3.method266();
				local2073 = Static31.aClass3_Sub2_Sub1_3.method276();
				@Pc(2078) long local2078 = (long) Static31.aClass3_Sub2_Sub1_3.method264();
				@Pc(2080) boolean local2080 = false;
				local583 = (local2073 << 32) + local2078;
				local1537 = Static31.aClass3_Sub2_Sub1_3.method270();
				for (@Pc(2093) int local2093 = 0; local2093 < 100; local2093++) {
					if (Static48.aLongArray14[local2093] == local583) {
						local2080 = true;
						break;
					}
				}
				if (local1537 <= 1) {
					for (@Pc(2120) int local2120 = 0; local2120 < Static63.anInt1820; local2120++) {
						if (local565 == Static84.aLongArray24[local2120]) {
							local2080 = true;
							break;
						}
					}
				}
				if (!local2080 && Static4.anInt59 == 0) {
					Static48.aLongArray14[Static94.anInt2463] = local583;
					Static94.anInt2463 = (Static94.anInt2463 + 1) % 100;
					@Pc(2163) Class56 local2163 = Static60.method1187(Static31.aClass3_Sub2_Sub1_3).method1419();
					if (local1537 == 2 || local1537 == 3) {
						Static75.method1348(7, local2163, Static84.method1524(new Class56[] { Static44.aClass56_694, Static16.method342(local565).method1421() }));
					} else if (local1537 == 1) {
						Static75.method1348(7, local2163, Static84.method1524(new Class56[] { Static41.aClass56_654, Static16.method342(local565).method1421() }));
					} else {
						Static75.method1348(3, local2163, Static16.method342(local565).method1421());
					}
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 7) {
				Static18.method353(false);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 205) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method298();
				Static38.aClass54_3 = Static8.aClass43_1.method1095(local126);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 136) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method299();
				Static51.method981(local126);
				if (Static111.anInt2804 != -1) {
					Static25.method532(Static111.anInt2804);
					Static111.anInt2804 = -1;
					Static115.aBoolean157 = true;
					Static124.aBoolean167 = true;
				}
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = -1;
					Static12.aBoolean17 = true;
				}
				if (Static63.anInt1818 != -1) {
					Static25.method532(Static63.anInt1818);
					Static63.anInt1818 = -1;
					Static79.method1393(30);
				}
				if (Static88.anInt2370 != -1) {
					Static25.method532(Static88.anInt2370);
					Static88.anInt2370 = -1;
				}
				if (Static57.anInt1607 == local126) {
					Static25.method531(Static57.anInt1607);
				} else {
					Static25.method532(Static57.anInt1607);
					Static57.anInt1607 = local126;
				}
				if (Static126.anInt3105 != 0) {
					Static126.anInt3105 = 0;
					Static12.aBoolean17 = true;
				}
				Static79.anInt2107 = -1;
				Static106.method1757(Static57.anInt1607);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 196) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method299();
				local196 = Static31.aClass3_Sub2_Sub1_3.method312();
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = -1;
					Static12.aBoolean17 = true;
				}
				if (Static63.anInt1818 != -1) {
					Static25.method532(Static63.anInt1818);
					Static63.anInt1818 = -1;
					Static79.method1393(30);
				}
				if (Static88.anInt2370 != -1) {
					Static25.method532(Static88.anInt2370);
					Static88.anInt2370 = -1;
				}
				if (local126 == Static57.anInt1607) {
					Static25.method531(Static57.anInt1607);
				} else {
					Static25.method532(Static57.anInt1607);
					Static57.anInt1607 = local126;
				}
				if (local196 == Static111.anInt2804) {
					Static25.method531(Static111.anInt2804);
				} else {
					Static25.method532(Static111.anInt2804);
					Static111.anInt2804 = local196;
				}
				if (Static126.anInt3105 != 0) {
					Static126.anInt3105 = 0;
					Static12.aBoolean17 = true;
				}
				Static79.anInt2107 = -1;
				Static115.aBoolean157 = true;
				Static124.aBoolean167 = true;
				Static106.method1757(Static57.anInt1607);
				Static106.method1757(Static111.anInt2804);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 9) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method281();
				if (local126 >= 0) {
					Static51.method981(local126);
				}
				if (local126 != Static109.anInt1693) {
					Static25.method532(Static109.anInt1693);
					Static109.anInt1693 = local126;
				}
				Static106.method1757(Static109.anInt1693);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 181) {
				Static38.anInt1031 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static53.anInt1522 = Static31.aClass3_Sub2_Sub1_3.method294();
				while (Static73.anInt2013 > Static31.aClass3_Sub2_Sub1_3.anInt413) {
					Static43.anInt1142 = Static31.aClass3_Sub2_Sub1_3.method270();
					Static70.method1284();
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 222) {
				for (local126 = 0; local126 < Static115.anIntArray292.length; local126++) {
					if (Static115.anIntArray292[local126] != Static87.anIntArray199[local126]) {
						Static115.anIntArray292[local126] = Static87.anIntArray199[local126];
						Static11.method234(local126);
						Static115.aBoolean157 = true;
					}
				}
				Static5.anInt69 = Static98.anInt2566;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 70) {
				Static115.aBoolean157 = true;
				local126 = Static31.aClass3_Sub2_Sub1_3.method278();
				local196 = Static31.aClass3_Sub2_Sub1_3.method276();
				if (local126 < -70000) {
					local196 += 32768;
				}
				if (local126 >= 0) {
					local1084 = Static96.method1688(local126);
				} else {
					local1084 = null;
				}
				while (Static73.anInt2013 > Static31.aClass3_Sub2_Sub1_3.anInt413) {
					local236 = Static31.aClass3_Sub2_Sub1_3.method311();
					local244 = Static31.aClass3_Sub2_Sub1_3.method276();
					local1521 = 0;
					if (local244 != 0) {
						local1521 = Static31.aClass3_Sub2_Sub1_3.method270();
						if (local1521 == 255) {
							local1521 = Static31.aClass3_Sub2_Sub1_3.method278();
						}
					}
					if (local1084 != null && local236 >= 0 && local1084.anIntArray267.length > local236) {
						local1084.anIntArray267[local236] = local244;
						local1084.anIntArray265[local236] = local1521;
					}
					method1061(local196, local1521, local236, local244 - 1);
				}
				Static80.anInt2149 = Static98.anInt2566;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 52) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method276();
				local196 = Static31.aClass3_Sub2_Sub1_3.method270();
				local230 = Static31.aClass3_Sub2_Sub1_3.method276();
				Static69.method1275(local196, local126, local230);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 21) {
				Static115.aBoolean157 = true;
				local126 = Static31.aClass3_Sub2_Sub1_3.method278();
				local196 = Static31.aClass3_Sub2_Sub1_3.method276();
				if (local126 >= 0) {
					local1084 = Static96.method1688(local126);
				} else {
					local1084 = null;
				}
				if (local126 < -70000) {
					local196 += 32768;
				}
				if (local1084 != null) {
					for (local236 = 0; local236 < local1084.anIntArray267.length; local236++) {
						local1084.anIntArray267[local236] = 0;
						local1084.anIntArray265[local236] = 0;
					}
				}
				Static70.method1285(local196);
				local236 = Static31.aClass3_Sub2_Sub1_3.method276();
				for (local244 = 0; local244 < local236; local244++) {
					local1521 = Static31.aClass3_Sub2_Sub1_3.method283();
					if (local1521 == 255) {
						local1521 = Static31.aClass3_Sub2_Sub1_3.method310();
					}
					local1537 = Static31.aClass3_Sub2_Sub1_3.method284();
					if (local1084 != null && local244 < local1084.anIntArray267.length) {
						local1084.anIntArray267[local244] = local1537;
						local1084.anIntArray265[local244] = local1521;
					}
					method1061(local196, local1521, local244, local1537 - 1);
				}
				Static80.anInt2149 = Static98.anInt2566;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 221) {
				Static27.method563(Static73.anInt2013, Static8.aClass43_1, Static31.aClass3_Sub2_Sub1_3);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 36) {
				Static46.method1518();
				Static43.anInt1142 = -1;
				return false;
			}
			if (Static43.anInt1142 == 137 || Static43.anInt1142 == 31 || Static43.anInt1142 == 170 || Static43.anInt1142 == 138 || Static43.anInt1142 == 167 || Static43.anInt1142 == 175 || Static43.anInt1142 == 13 || Static43.anInt1142 == 87 || Static43.anInt1142 == 83 || Static43.anInt1142 == 178 || Static43.anInt1142 == 115) {
				Static70.method1284();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 213) {
				Static79.method1396();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 92) {
				for (local126 = 0; local126 < Static106.anInt2626; local126++) {
					@Pc(2888) Class3_Sub1_Sub6 local2888 = Static119.method1924(local126);
					if (local2888 != null && local2888.anInt1123 == 0) {
						Static87.anIntArray199[local126] = 0;
						Static115.anIntArray292[local126] = 0;
					}
				}
				Static5.anInt69 = Static98.anInt2566;
				if (Static69.anInt1918 != -1) {
					Static12.aBoolean17 = true;
				}
				Static115.aBoolean157 = true;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 116) {
				Static122.aClass56_1640 = Static31.aClass3_Sub2_Sub1_3.method301();
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = -1;
				}
				Static12.aBoolean17 = true;
				Static105.aBoolean121 = false;
				Static43.anInt1142 = -1;
				Static126.anInt3105 = 4;
				Static122.aClass56_1646 = Static122.aClass56_1633;
				return true;
			}
			@Pc(2962) Class56 local2962;
			if (Static43.anInt1142 == 57) {
				local2962 = Static31.aClass3_Sub2_Sub1_3.method301();
				local196 = Static31.aClass3_Sub2_Sub1_3.method278();
				local1084 = Static96.method1688(local196);
				local1084.aClass56_1546 = local2962;
				if (Static44.anIntArray79[Static27.anInt798] == local196 >> 16) {
					Static115.aBoolean157 = true;
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 78) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method276();
				Static29.method591(local126);
				Static43.anInt1142 = -1;
				Static80.anInt2149 = Static98.anInt2566;
				return true;
			}
			if (Static43.anInt1142 == 129) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method278();
				local196 = Static31.aClass3_Sub2_Sub1_3.method312();
				Static87.anIntArray199[local196] = local126;
				if (local126 != Static115.anIntArray292[local196]) {
					Static115.anIntArray292[local196] = local126;
					Static11.method234(local196);
					Static115.aBoolean157 = true;
					if (Static69.anInt1918 != -1) {
						Static12.aBoolean17 = true;
					}
				}
				Static5.anInt69 = Static98.anInt2566;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 27) {
				Static38.anInt1031 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static53.anInt1522 = Static31.aClass3_Sub2_Sub1_3.method283();
				for (local126 = Static38.anInt1031; local126 < Static38.anInt1031 + 8; local126++) {
					for (local196 = Static53.anInt1522; local196 < Static53.anInt1522 + 8; local196++) {
						if (Static8.aClass37ArrayArrayArray1[Static94.anInt2470][local126][local196] != null) {
							Static8.aClass37ArrayArrayArray1[Static94.anInt2470][local126][local196] = null;
							Static5.method41(local126, local196);
						}
					}
				}
				for (@Pc(3101) Class3_Sub6 local3101 = (Class3_Sub6) Static67.aClass37_11.method989(); local3101 != null; local3101 = (Class3_Sub6) Static67.aClass37_11.method990()) {
					if (Static38.anInt1031 <= local3101.anInt943 && local3101.anInt943 < Static38.anInt1031 + 8 && local3101.anInt954 >= Static53.anInt1522 && Static53.anInt1522 + 8 > local3101.anInt954 && Static94.anInt2470 == local3101.anInt942) {
						local3101.anInt947 = 0;
					}
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 207) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method312();
				local196 = Static31.aClass3_Sub2_Sub1_3.method310();
				local1084 = Static96.method1688(local196);
				local1084.anInt2805 = local126;
				local1084.anInt2841 = 1;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 135) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method312();
				local196 = Static31.aClass3_Sub2_Sub1_3.method276();
				Static51.method981(local196);
				if (local126 != -1) {
					Static51.method981(local126);
				}
				if (Static57.anInt1607 != -1) {
					Static25.method532(Static57.anInt1607);
					Static57.anInt1607 = -1;
				}
				if (Static111.anInt2804 != -1) {
					Static25.method532(Static111.anInt2804);
					Static111.anInt2804 = -1;
				}
				if (Static57.anInt1609 != -1) {
					Static25.method532(Static57.anInt1609);
					Static57.anInt1609 = -1;
				}
				if (Static63.anInt1818 == local196) {
					Static25.method531(Static63.anInt1818);
				} else {
					Static25.method532(Static63.anInt1818);
					Static63.anInt1818 = local196;
					Static79.method1393(35);
				}
				if (local196 == Static88.anInt2370) {
					Static25.method531(Static88.anInt2370);
				} else {
					Static25.method532(Static88.anInt2370);
					Static88.anInt2370 = local126;
				}
				Static79.anInt2107 = -1;
				Static126.anInt3105 = 0;
				Static106.method1757(Static63.anInt1818);
				Static106.method1757(Static88.anInt2370);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 162) {
				Static102.anInt3225 = Static31.aClass3_Sub2_Sub1_3.method270();
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 112) {
				Static115.aBoolean157 = true;
				local126 = Static31.aClass3_Sub2_Sub1_3.method270();
				local196 = Static31.aClass3_Sub2_Sub1_3.method306();
				local230 = Static31.aClass3_Sub2_Sub1_3.method310();
				Static113.anIntArray287[local196] = local230;
				Static92.anIntArray218[local196] = local126;
				Static105.anIntArray223[local196] = 1;
				for (local236 = 0; local236 < 98; local236++) {
					if (local230 >= Class3_Sub2.anIntArray27[local236]) {
						Static105.anIntArray223[local196] = local236 + 2;
					}
				}
				Static93.anInt2432 = Static98.anInt2566;
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 224) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method276();
				local196 = Static31.aClass3_Sub2_Sub1_3.method267();
				local1084 = Static96.method1688(local196);
				Static43.anInt1142 = -1;
				if (local1084 != null && local1084.anInt2857 == 0) {
					if (local1084.anInt2829 - local1084.anInt2827 < local126) {
						local126 = local1084.anInt2829 - local1084.anInt2827;
					}
					if (local126 < 0) {
						local126 = 0;
					}
					local1084.anInt2806 = local126;
				}
				return true;
			}
			if (Static43.anInt1142 == 37) {
				Static27.aBoolean43 = false;
				for (local126 = 0; local126 < 5; local126++) {
					Static60.aBooleanArray5[local126] = false;
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 22) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method267();
				@Pc(3434) boolean local3434 = Static31.aClass3_Sub2_Sub1_3.method283() == 1;
				local1084 = Static96.method1688(local126);
				Static43.anInt1142 = -1;
				local1084.aBoolean148 = local3434;
				return true;
			}
			if (Static43.anInt1142 == 217) {
				Static18.method353(true);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 238) {
				local2962 = Static31.aClass3_Sub2_Sub1_3.method301();
				@Pc(3489) boolean local3489;
				if (local2962.method1423(Static123.aClass56_1661)) {
					local3489 = false;
					local1301 = local2962.method1451(local2962.method1424(Static105.aClass56_1442), 0);
					local2073 = local1301.method1445();
					for (local1521 = 0; local1521 < Static63.anInt1820; local1521++) {
						if (local2073 == Static84.aLongArray24[local1521]) {
							local3489 = true;
							break;
						}
					}
					if (!local3489 && Static4.anInt59 == 0) {
						Static75.method1348(4, Static41.aClass56_651, local1301);
					}
				} else if (local2962.method1423(Static97.aClass56_1393)) {
					local1301 = local2962.method1451(local2962.method1424(Static105.aClass56_1442), 0);
					local2073 = local1301.method1445();
					local3489 = false;
					for (local1521 = 0; local1521 < Static63.anInt1820; local1521++) {
						if (local2073 == Static84.aLongArray24[local1521]) {
							local3489 = true;
							break;
						}
					}
					if (!local3489 && Static4.anInt59 == 0) {
						Static75.method1348(8, Static105.aClass56_1435, local1301);
					}
				} else if (local2962.method1423(Static109.aClass56_914)) {
					local1301 = local2962.method1451(local2962.method1424(Static105.aClass56_1442), 0);
					local2073 = local1301.method1445();
					local3489 = false;
					for (local1521 = 0; local1521 < Static63.anInt1820; local1521++) {
						if (Static84.aLongArray24[local1521] == local2073) {
							local3489 = true;
							break;
						}
					}
					if (!local3489 && Static4.anInt59 == 0) {
						@Pc(3590) Class56 local3590 = local2962.method1451(local2962.method1426() - 9, local2962.method1424(Static105.aClass56_1442) + 1);
						Static75.method1348(8, local3590, local1301);
					}
				} else {
					Static75.method1348(0, local2962, Static122.aClass56_1633);
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 24) {
				local2962 = Static31.aClass3_Sub2_Sub1_3.method301();
				@Pc(3673) Object[] local3673 = new Object[local2962.method1426() + 1];
				for (local230 = local2962.method1426() - 1; local230 >= 0; local230--) {
					if (local2962.method1449(local230) == 115) {
						local3673[local230 + 1] = Static31.aClass3_Sub2_Sub1_3.method301();
					} else {
						local3673[local230 + 1] = Integer.valueOf(Static31.aClass3_Sub2_Sub1_3.method278());
					}
				}
				local3673[0] = Integer.valueOf(Static31.aClass3_Sub2_Sub1_3.method278());
				method1067(null, 0, null, local3673, 0, 0);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 74) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method299();
				local196 = Static31.aClass3_Sub2_Sub1_3.method310();
				if (local126 == 65535) {
					local126 = -1;
				}
				local230 = Static31.aClass3_Sub2_Sub1_3.method298();
				local573 = (long) local126 + ((long) local196 << 32);
				@Pc(3769) Class3 local3769 = Static41.aClass2_1.method17(local573);
				if (local3769 != null) {
					local3769.method2055();
				}
				Static41.aClass2_1.method12(new Class3_Sub12(local230), local573);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 234) {
				local126 = Static31.aClass3_Sub2_Sub1_3.method312();
				if (local126 == 65535) {
					local126 = -1;
				}
				local196 = Static31.aClass3_Sub2_Sub1_3.method294();
				if (local126 == Static44.anIntArray79[local196]) {
					Static25.method531(Static44.anIntArray79[local196]);
				} else {
					Static25.method532(Static44.anIntArray79[local196]);
					Static44.anIntArray79[local196] = local126;
				}
				Static115.aBoolean157 = true;
				Static124.aBoolean167 = true;
				Static106.method1757(Static44.anIntArray79[local196]);
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 99) {
				Static63.anInt1820 = Static73.anInt2013 / 8;
				for (local126 = 0; local126 < Static63.anInt1820; local126++) {
					Static84.aLongArray24[local126] = Static31.aClass3_Sub2_Sub1_3.method266();
				}
				Static43.anInt1142 = -1;
				return true;
			}
			if (Static43.anInt1142 == 227) {
				local565 = Static31.aClass3_Sub2_Sub1_3.method266();
				@Pc(3884) Class56 local3884 = Static60.method1187(Static31.aClass3_Sub2_Sub1_3).method1419();
				Static75.method1348(6, local3884, Static16.method342(local565).method1421());
				Static43.anInt1142 = -1;
				return true;
			}
			Static61.method1200("T1 - " + Static43.anInt1142 + "," + Static122.anInt3002 + "," + Static99.anInt895 + " - " + Static73.anInt2013, null);
			Static46.method1518();
		} catch (@Pc(3923) IOException local3923) {
			Static97.method1706();
		} catch (@Pc(3927) Exception local3927) {
			@Pc(3969) String local3969 = "T2 - " + Static43.anInt1142 + "," + Static122.anInt3002 + "," + Static99.anInt895 + " - " + Static73.anInt2013 + "," + (Static18.anInt497 + Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0]) + "," + (Static57.anInt1618 + Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0]) + " - ";
			for (local196 = 0; Static73.anInt2013 > local196 && local196 < 50; local196++) {
				local3969 = local3969 + Static31.aClass3_Sub2_Sub1_3.aByteArray7[local196] + ",";
			}
			Static61.method1200(local3969, local3927);
			Static46.method1518();
		}
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)I")
	public static int method1065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg5;
			arg5 = arg3;
			arg3 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg4;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 1 + 7 - arg5 - arg4;
		} else {
			return 7 + 1 - arg1 - arg3;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II[Lclient!wc;II[BI)V")
	public static void method1066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg5 + local11 > 0 && arg5 + local11 < 103) {
						arg2[local3].anIntArrayArray29[local7 + arg1][local11 + arg5] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(89) Class3_Sub2 local89 = new Class3_Sub2(arg4);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(112) int local112 = 0; local112 < 64; local112++) {
				for (@Pc(116) int local116 = 0; local116 < 64; local116++) {
					Static41.method765(arg1 + local112, local89, local11, 0, arg3, local116 + arg5, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!td;ILclient!td;[Ljava/lang/Object;III)V")
	public static void method1067(@OriginalArg(0) Class3_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub16 arg2, @OriginalArg(3) Object[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = (Integer) arg3[0];
		@Pc(15) Class3_Sub1_Sub12 local15 = Static14.method248(local11);
		if (local15 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = -1;
		@Pc(27) int[] local27 = local15.anIntArray217;
		@Pc(34) int[] local34 = local15.anIntArray216;
		@Pc(36) byte local36 = -1;
		try {
			Static81.anIntArray188 = new int[local15.anInt2427];
			Static119.aClass56Array20 = new Class56[local15.anInt2429];
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			@Pc(78) int local78;
			for (@Pc(50) int local50 = 1; local50 < arg3.length; local50++) {
				if (arg3[local50] instanceof Integer) {
					local78 = (Integer) arg3[local50];
					if (local78 == -2147483647) {
						local78 = arg5;
					}
					if (local78 == -2147483646) {
						local78 = arg4;
					}
					if (local78 == -2147483645) {
						local78 = arg0 == null ? -1 : arg0.anInt2817;
					}
					if (local78 == -2147483644) {
						local78 = arg1;
					}
					if (local78 == -2147483643) {
						local78 = arg0 == null ? -1 : arg0.anInt2807;
					}
					if (local78 == -2147483642) {
						local78 = arg2 == null ? -1 : arg2.anInt2817;
					}
					if (local78 == -2147483641) {
						local78 = arg2 == null ? -1 : arg2.anInt2807;
					}
					Static81.anIntArray188[local48++] = local78;
				} else if (arg3[local50] instanceof Class56) {
					Static119.aClass56Array20[local46++] = (Class56) arg3[local50];
				}
			}
			local78 = 0;
			label1246: while (true) {
				local78++;
				if (local78 > 200000) {
					throw new RuntimeException("slow");
				}
				local24++;
				@Pc(169) int local169 = local27[local24];
				@Pc(739) int local739;
				@Pc(590) int local590;
				@Pc(615) int local615;
				@Pc(728) int local728;
				@Pc(548) Class56 local548;
				if (local169 < 100) {
					if (local169 == 0) {
						Static103.anIntArray222[local20++] = local34[local24];
						continue;
					}
					@Pc(195) int local195;
					if (local169 == 1) {
						local195 = local34[local24];
						Static103.anIntArray222[local20++] = Static115.anIntArray292[local195];
						continue;
					}
					if (local169 == 2) {
						local195 = local34[local24];
						local20--;
						Static115.anIntArray292[local195] = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 3) {
						Static53.aClass56Array4[local22++] = local15.aClass56Array9[local24];
						continue;
					}
					if (local169 == 6) {
						local24 += local34[local24];
						continue;
					}
					if (local169 == 7) {
						local20 -= 2;
						if (Static103.anIntArray222[local20 + 1] != Static103.anIntArray222[local20]) {
							local24 += local34[local24];
						}
						continue;
					}
					if (local169 == 8) {
						local20 -= 2;
						if (Static103.anIntArray222[local20 + 1] == Static103.anIntArray222[local20]) {
							local24 += local34[local24];
						}
						continue;
					}
					if (local169 == 9) {
						local20 -= 2;
						if (Static103.anIntArray222[local20 + 1] > Static103.anIntArray222[local20]) {
							local24 += local34[local24];
						}
						continue;
					}
					if (local169 == 10) {
						local20 -= 2;
						if (Static103.anIntArray222[local20 + 1] < Static103.anIntArray222[local20]) {
							local24 += local34[local24];
						}
						continue;
					}
					if (local169 == 21) {
						if (Static31.anInt917 == 0) {
							return;
						}
						@Pc(367) Class59 local367 = Static114.aClass59Array1[--Static31.anInt917];
						Static119.aClass56Array20 = local367.aClass56Array8;
						local24 = local367.anInt2362;
						local15 = local367.aClass3_Sub1_Sub12_1;
						local34 = local15.anIntArray216;
						local27 = local15.anIntArray217;
						Static81.anIntArray188 = local367.anIntArray198;
						continue;
					}
					if (local169 == 25) {
						local195 = local34[local24];
						Static103.anIntArray222[local20++] = Static75.method1343(local195);
						continue;
					}
					if (local169 == 27) {
						local195 = local34[local24];
						local20--;
						Static113.method1863(Static103.anIntArray222[local20], local195);
						continue;
					}
					if (local169 == 31) {
						local20 -= 2;
						if (Static103.anIntArray222[local20] <= Static103.anIntArray222[local20 + 1]) {
							local24 += local34[local24];
						}
						continue;
					}
					if (local169 == 32) {
						local20 -= 2;
						if (Static103.anIntArray222[local20] >= Static103.anIntArray222[local20 + 1]) {
							local24 += local34[local24];
						}
						continue;
					}
					if (local169 == 33) {
						Static103.anIntArray222[local20++] = Static81.anIntArray188[local34[local24]];
						continue;
					}
					@Pc(494) int local494;
					if (local169 == 34) {
						local494 = local34[local24];
						local20--;
						Static81.anIntArray188[local494] = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 35) {
						Static53.aClass56Array4[local22++] = Static119.aClass56Array20[local34[local24]];
						continue;
					}
					if (local169 == 36) {
						local494 = local34[local24];
						local22--;
						Static119.aClass56Array20[local494] = Static53.aClass56Array4[local22];
						continue;
					}
					if (local169 == 37) {
						local195 = local34[local24];
						local22 -= local195;
						local548 = Static51.method984(local22, local195, Static53.aClass56Array4);
						Static53.aClass56Array4[local22++] = local548;
						continue;
					}
					if (local169 == 38) {
						local20--;
						continue;
					}
					if (local169 == 39) {
						local22--;
						continue;
					}
					if (local169 == 40) {
						local195 = local34[local24];
						@Pc(580) Class3_Sub1_Sub12 local580 = Static14.method248(local195);
						@Pc(584) Class56[] local584 = new Class56[local580.anInt2429];
						@Pc(588) int[] local588 = new int[local580.anInt2427];
						for (local590 = 0; local590 < local580.anInt2420; local590++) {
							local588[local590] = Static103.anIntArray222[local590 + local20 - local580.anInt2420];
						}
						for (local615 = 0; local615 < local580.anInt2421; local615++) {
							local584[local615] = Static53.aClass56Array4[local615 + local22 - local580.anInt2421];
						}
						local20 -= local580.anInt2420;
						local22 -= local580.anInt2421;
						@Pc(651) Class59 local651 = new Class59();
						local651.aClass3_Sub1_Sub12_1 = local15;
						local651.anIntArray198 = Static81.anIntArray188;
						local15 = local580;
						local651.aClass56Array8 = Static119.aClass56Array20;
						local651.anInt2362 = local24;
						Static114.aClass59Array1[Static31.anInt917++] = local651;
						Static119.aClass56Array20 = local584;
						Static81.anIntArray188 = local588;
						local34 = local580.anIntArray216;
						local24 = -1;
						local27 = local580.anIntArray217;
						continue;
					}
					if (local169 == 42) {
						Static103.anIntArray222[local20++] = Static119.anIntArray309[local34[local24]];
						continue;
					}
					if (local169 == 43) {
						local494 = local34[local24];
						local20--;
						Static119.anIntArray309[local494] = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 44) {
						local728 = local34[local24] & 0xFFFF;
						local195 = local34[local24] >> 16;
						local20--;
						local739 = Static103.anIntArray222[local20];
						if (local739 >= 0 && local739 <= 5000) {
							Static65.anIntArray143[local195] = local739;
							@Pc(754) byte local754 = -1;
							if (local728 == 105) {
								local754 = 0;
							}
							local590 = 0;
							while (true) {
								if (local739 <= local590) {
									continue label1246;
								}
								Static61.anIntArrayArray17[local195][local590] = local754;
								local590++;
							}
						}
						throw new RuntimeException();
					}
					if (local169 == 45) {
						local195 = local34[local24];
						local20--;
						local728 = Static103.anIntArray222[local20];
						if (local728 >= 0 && local728 < Static65.anIntArray143[local195]) {
							Static103.anIntArray222[local20++] = Static61.anIntArrayArray17[local195][local728];
							continue;
						}
						throw new RuntimeException();
					}
					if (local169 == 46) {
						local20 -= 2;
						local195 = local34[local24];
						local728 = Static103.anIntArray222[local20];
						if (local728 >= 0 && Static65.anIntArray143[local195] > local728) {
							Static61.anIntArrayArray17[local195][local728] = Static103.anIntArray222[local20 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(865) boolean local865;
				if (local34[local24] == 1) {
					local865 = true;
				} else {
					local865 = false;
				}
				@Pc(899) Class3_Sub1_Sub16 local899;
				@Pc(1718) int local1718;
				@Pc(2472) int local2472;
				if (local169 < 1000) {
					if (local169 == 100) {
						local20 -= 3;
						local728 = Static103.anIntArray222[local20];
						local1718 = Static103.anIntArray222[local20 + 2];
						local739 = Static103.anIntArray222[local20 + 1];
						if (local739 == 0) {
							throw new RuntimeException();
						}
						@Pc(4263) Class3_Sub1_Sub16 local4263 = Static96.method1688(local728);
						if (local4263.aClass3_Sub1_Sub16Array2 == null) {
							local4263.aClass3_Sub1_Sub16Array2 = new Class3_Sub1_Sub16[local1718 + 1];
						}
						if (local1718 >= local4263.aClass3_Sub1_Sub16Array2.length) {
							@Pc(4286) Class3_Sub1_Sub16[] local4286 = new Class3_Sub1_Sub16[local1718 + 1];
							for (local2472 = 0; local2472 < local4263.aClass3_Sub1_Sub16Array2.length; local2472++) {
								local4286[local2472] = local4263.aClass3_Sub1_Sub16Array2[local2472];
							}
							local4263.aClass3_Sub1_Sub16Array2 = local4286;
						}
						if (local1718 > 0 && local4263.aClass3_Sub1_Sub16Array2[local1718 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1718 - 1));
						}
						@Pc(4335) Class3_Sub1_Sub16 local4335 = new Class3_Sub1_Sub16();
						local4335.anInt2807 = local1718;
						local4335.anInt2845 = local4335.anInt2817 = local4263.anInt2817;
						local4335.aBoolean149 = true;
						local4335.anInt2857 = local739;
						local4263.aClass3_Sub1_Sub16Array2[local1718] = local4335;
						if (local865) {
							Static96.aClass3_Sub1_Sub16_4 = local4335;
						} else {
							Static29.aClass3_Sub1_Sub16_2 = local4335;
						}
						Static122.method1958(local4263);
						continue;
					}
					if (local169 == 101) {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
						@Pc(4383) Class3_Sub1_Sub16 local4383 = Static96.method1688(local899.anInt2817);
						local4383.aClass3_Sub1_Sub16Array2[local899.anInt2807] = null;
						Static122.method1958(local4383);
						continue;
					}
					if (local169 == 102) {
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
						local899.aClass3_Sub1_Sub16Array2 = null;
						Static122.method1958(local899);
						continue;
					}
					if (local169 == 200) {
						local20 -= 2;
						local739 = Static103.anIntArray222[local20 + 1];
						local728 = Static103.anIntArray222[local20];
						@Pc(4431) Class3_Sub1_Sub16 local4431 = Static42.method784(local728, local739);
						if (local4431 != null && local739 != -1) {
							Static103.anIntArray222[local20++] = 1;
							if (local865) {
								Static96.aClass3_Sub1_Sub16_4 = local4431;
							} else {
								Static29.aClass3_Sub1_Sub16_2 = local4431;
							}
							continue;
						}
						Static103.anIntArray222[local20++] = 0;
						continue;
					}
				} else if (local169 >= 1000 && local169 < 1100 || !(local169 < 2000 || local169 >= 2100)) {
					if (local169 >= 2000) {
						local169 -= 1000;
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
					} else {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
					}
					Static122.method1958(local899);
					if (local169 == 1000) {
						local20 -= 2;
						local899.anInt2855 = Static103.anIntArray222[local20];
						local899.anInt2797 = Static103.anIntArray222[local20 + 1];
						continue;
					}
					if (local169 == 1001) {
						local20 -= 2;
						local899.anInt2854 = Static103.anIntArray222[local20];
						local899.anInt2827 = Static103.anIntArray222[local20 + 1];
						continue;
					}
					if (local169 == 1003) {
						local20--;
						local899.aBoolean148 = Static103.anIntArray222[local20] == 1;
						continue;
					}
				} else if (local169 >= 1100 && local169 < 1200 || local169 >= 2100 && local169 < 2200) {
					if (local169 >= 2000) {
						local169 -= 1000;
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
					} else {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
					}
					Static122.method1958(local899);
					if (local169 == 1100) {
						local20 -= 2;
						local899.anInt2842 = Static103.anIntArray222[local20];
						if (local899.anInt2862 - local899.anInt2854 < local899.anInt2842) {
							local899.anInt2842 = local899.anInt2862 - local899.anInt2854;
						}
						if (local899.anInt2842 < 0) {
							local899.anInt2842 = 0;
						}
						local899.anInt2806 = Static103.anIntArray222[local20 + 1];
						if (local899.anInt2829 - local899.anInt2827 < local899.anInt2806) {
							local899.anInt2806 = local899.anInt2829 - local899.anInt2827;
						}
						if (local899.anInt2806 < 0) {
							local899.anInt2806 = 0;
						}
						continue;
					}
					if (local169 == 1101) {
						local20--;
						local899.anInt2822 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1102) {
						local20--;
						local899.aBoolean147 = Static103.anIntArray222[local20] == 1;
						continue;
					}
					if (local169 == 1103) {
						local20--;
						local899.anInt2819 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1104) {
						local20--;
						local899.anInt2843 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1105) {
						local20--;
						local899.anInt2812 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1106) {
						local20--;
						local899.anInt2833 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1107) {
						local20--;
						local899.aBoolean146 = Static103.anIntArray222[local20] == 1;
						continue;
					}
					if (local169 == 1108) {
						local899.anInt2841 = 1;
						local20--;
						local899.anInt2805 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1109) {
						local20 -= 6;
						local899.anInt2809 = Static103.anIntArray222[local20];
						local899.anInt2826 = Static103.anIntArray222[local20 + 1];
						local899.anInt2856 = Static103.anIntArray222[local20 + 2];
						local899.anInt2858 = Static103.anIntArray222[local20 + 3];
						local899.anInt2801 = Static103.anIntArray222[local20 + 4];
						local899.anInt2837 = Static103.anIntArray222[local20 + 5];
						continue;
					}
					if (local169 == 1110) {
						local20--;
						local899.anInt2835 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1111) {
						local20--;
						local899.aBoolean152 = Static103.anIntArray222[local20] == 1;
						continue;
					}
					if (local169 == 1112) {
						local22--;
						local899.aClass56_1546 = Static53.aClass56Array4[local22];
						continue;
					}
					if (local169 == 1113) {
						local20--;
						local899.anInt2798 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1114) {
						local20 -= 3;
						local899.anInt2849 = Static103.anIntArray222[local20];
						local899.anInt2808 = Static103.anIntArray222[local20 + 1];
						local899.anInt2850 = Static103.anIntArray222[local20 + 2];
						continue;
					}
					if (local169 == 1115) {
						local20--;
						local899.aBoolean145 = Static103.anIntArray222[local20] == 1;
						continue;
					}
					if (local169 == 1116) {
						local20--;
						local899.anInt2838 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1117) {
						local20--;
						local899.anInt2846 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1118) {
						local20--;
						local899.aBoolean151 = Static103.anIntArray222[local20] == 1;
						continue;
					}
					if (local169 == 1119) {
						local20--;
						local899.aBoolean153 = Static103.anIntArray222[local20] == 1;
						continue;
					}
					if (local169 == 1120) {
						local20 -= 2;
						local899.anInt2862 = Static103.anIntArray222[local20];
						local899.anInt2829 = Static103.anIntArray222[local20 + 1];
						continue;
					}
				} else if (local169 >= 1200 && local169 < 1300 || local169 >= 2200 && local169 < 2300) {
					if (local169 < 2000) {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
					} else {
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
						local169 -= 1000;
					}
					Static122.method1958(local899);
					if (local169 == 1200) {
						local20 -= 2;
						local739 = Static103.anIntArray222[local20];
						local1718 = Static103.anIntArray222[local20 + 1];
						local899.anInt2831 = local739;
						local899.anInt2814 = local1718;
						@Pc(3732) Class3_Sub1_Sub8 local3732 = Static12.method239(local739);
						local899.anInt2837 = local3732.anInt1740;
						local899.anInt2826 = local3732.anInt1760;
						local899.anInt2858 = local3732.anInt1751;
						local899.anInt2856 = local3732.anInt1766;
						local899.anInt2801 = local3732.anInt1753;
						local899.anInt2809 = local3732.anInt1756;
						if (local899.anInt2854 > 0) {
							local899.anInt2837 = local899.anInt2837 * 32 / local899.anInt2854;
						}
						continue;
					}
					if (local169 == 1201) {
						local899.anInt2841 = 2;
						local20--;
						local899.anInt2805 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1202) {
						local899.anInt2841 = 3;
						local899.anInt2805 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass42_1.method1086();
						continue;
					}
				} else if ((local169 < 1300 || local169 >= 1400) && (local169 < 2300 || local169 >= 2400)) {
					@Pc(1060) Class56 local1060;
					if (local169 >= 1400 && local169 < 1500 || local169 >= 2400 && local169 < 2500) {
						if (local169 >= 2000) {
							local169 -= 1000;
							local20--;
							local899 = Static96.method1688(Static103.anIntArray222[local20]);
						} else {
							local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
						}
						local22--;
						local1060 = Static53.aClass56Array4[local22];
						@Pc(1067) Object[] local1067 = new Object[local1060.method1426() + 1];
						for (local590 = local1067.length - 1; local590 >= 1; local590--) {
							if (local1060.method1449(local590 - 1) == 115) {
								local22--;
								local1067[local590] = Static53.aClass56Array4[local22];
							} else {
								local20--;
								local1067[local590] = Integer.valueOf(Static103.anIntArray222[local20]);
							}
						}
						local20--;
						local615 = Static103.anIntArray222[local20];
						if (local615 == -1) {
							local1067 = null;
						} else {
							local1067[0] = Integer.valueOf(local615);
						}
						local899.aBoolean142 = true;
						if (local169 == 1417) {
							local899.anObjectArray13 = local1067;
						}
						if (local169 == 1409) {
							local899.anObjectArray14 = local1067;
						}
						if (local169 == 1400) {
							local899.anObjectArray12 = local1067;
						}
						if (local169 == 1407) {
							local899.anObjectArray7 = local1067;
						}
						if (local169 == 1412) {
							local899.anObjectArray11 = local1067;
						}
						if (local169 == 1410) {
							local899.anObjectArray19 = local1067;
						}
						if (local169 == 1414) {
							local899.anObjectArray10 = local1067;
						}
						if (local169 == 1405) {
							local899.anObjectArray9 = local1067;
						}
						if (local169 == 1413) {
							local899.anObjectArray15 = local1067;
						}
						if (local169 == 1403) {
							local899.anObjectArray20 = local1067;
						}
						if (local169 == 1416) {
							local899.anObjectArray17 = local1067;
						}
						if (local169 == 1402) {
							local899.anObjectArray18 = local1067;
						}
						if (local169 == 1401) {
							local899.anObjectArray3 = local1067;
						}
						if (local169 == 1415) {
							local899.anObjectArray16 = local1067;
						}
						if (local169 == 1406) {
							local899.anObjectArray21 = local1067;
						}
						if (local169 == 1408) {
							local899.anObjectArray6 = local1067;
						}
						if (local169 == 1411) {
							local899.anObjectArray5 = local1067;
						}
						if (local169 == 1404) {
							local899.anObjectArray8 = local1067;
						}
						continue;
					}
					if (local169 < 1600) {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
						if (local169 == 1500) {
							Static103.anIntArray222[local20++] = local899.anInt2855;
							continue;
						}
						if (local169 == 1501) {
							Static103.anIntArray222[local20++] = local899.anInt2797;
							continue;
						}
						if (local169 == 1502) {
							Static103.anIntArray222[local20++] = local899.anInt2854;
							continue;
						}
						if (local169 == 1503) {
							Static103.anIntArray222[local20++] = local899.anInt2827;
							continue;
						}
						if (local169 == 1504) {
							Static103.anIntArray222[local20++] = local899.aBoolean148 ? 1 : 0;
							continue;
						}
						if (local169 == 1505) {
							Static103.anIntArray222[local20++] = local899.anInt2845;
							continue;
						}
					} else if (local169 < 1700) {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
						if (local169 == 1600) {
							Static103.anIntArray222[local20++] = local899.anInt2842;
							continue;
						}
						if (local169 == 1601) {
							Static103.anIntArray222[local20++] = local899.anInt2806;
							continue;
						}
						if (local169 == 1602) {
							Static53.aClass56Array4[local22++] = local899.aClass56_1546;
							continue;
						}
						if (local169 == 1603) {
							Static103.anIntArray222[local20++] = local899.anInt2862;
							continue;
						}
						if (local169 == 1604) {
							Static103.anIntArray222[local20++] = local899.anInt2829;
							continue;
						}
						if (local169 == 1605) {
							Static103.anIntArray222[local20++] = local899.anInt2837;
							continue;
						}
					} else if (local169 < 1800) {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
						if (local169 == 1700) {
							Static103.anIntArray222[local20++] = local899.anInt2831;
							continue;
						}
						if (local169 == 1701) {
							if (local899.anInt2831 == -1) {
								Static103.anIntArray222[local20++] = 0;
							} else {
								Static103.anIntArray222[local20++] = local899.anInt2814;
							}
							continue;
						}
						if (local169 == 1702) {
							Static103.anIntArray222[local20++] = local899.anInt2807;
							continue;
						}
					} else if (local169 < 1900) {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
						if (local169 == 1800) {
							Static103.anIntArray222[local20++] = Static126.method2013(Static34.method652(local899));
							continue;
						}
					} else if (local169 < 2600) {
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
						if (local169 == 2500) {
							Static103.anIntArray222[local20++] = local899.anInt2855;
							continue;
						}
						if (local169 == 2501) {
							Static103.anIntArray222[local20++] = local899.anInt2797;
							continue;
						}
						if (local169 == 2502) {
							Static103.anIntArray222[local20++] = local899.anInt2854;
							continue;
						}
						if (local169 == 2503) {
							Static103.anIntArray222[local20++] = local899.anInt2827;
							continue;
						}
						if (local169 == 2504) {
							Static103.anIntArray222[local20++] = local899.aBoolean148 ? 1 : 0;
							continue;
						}
						if (local169 == 2505) {
							Static103.anIntArray222[local20++] = local899.anInt2845;
							continue;
						}
					} else if (local169 < 2700) {
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
						if (local169 == 2600) {
							Static103.anIntArray222[local20++] = local899.anInt2842;
							continue;
						}
						if (local169 == 2601) {
							Static103.anIntArray222[local20++] = local899.anInt2806;
							continue;
						}
						if (local169 == 2602) {
							Static53.aClass56Array4[local22++] = local899.aClass56_1546;
							continue;
						}
						if (local169 == 2603) {
							Static103.anIntArray222[local20++] = local899.anInt2862;
							continue;
						}
						if (local169 == 2604) {
							Static103.anIntArray222[local20++] = local899.anInt2829;
							continue;
						}
						if (local169 == 2605) {
							Static103.anIntArray222[local20++] = local899.anInt2837;
							continue;
						}
					} else if (local169 < 2800) {
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
						if (local169 == 2700) {
							Static103.anIntArray222[local20++] = local899.anInt2831;
							continue;
						}
						if (local169 == 2701) {
							if (local899.anInt2831 == -1) {
								Static103.anIntArray222[local20++] = 0;
							} else {
								Static103.anIntArray222[local20++] = local899.anInt2814;
							}
							continue;
						}
					} else if (local169 < 2900) {
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
						if (local169 == 2800) {
							Static103.anIntArray222[local20++] = Static126.method2013(Static34.method652(local899));
							continue;
						}
					} else if (local169 < 3200) {
						if (local169 == 3100) {
							local22--;
							local548 = Static53.aClass56Array4[local22];
							Static75.method1348(0, local548, Static119.aClass56_1625);
							continue;
						}
						if (local169 == 3101) {
							local20 -= 2;
							Static7.method302(Static103.anIntArray222[local20], Static103.anIntArray222[local20 + 1], Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1);
							continue;
						}
						if (local169 == 3102) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							if (local728 >= 0 && local728 < Static44.anIntArray79.length && Static44.anIntArray79[local728] != -1) {
								Static124.aBoolean167 = true;
								Static115.aBoolean157 = true;
								Static27.anInt798 = local728;
							}
							continue;
						}
						if (local169 == 3103) {
							Static1.method1();
							continue;
						}
					} else if (local169 < 3300) {
						if (local169 == 3200) {
							local20 -= 3;
							Static69.method1275(Static103.anIntArray222[local20 + 1], Static103.anIntArray222[local20], Static103.anIntArray222[local20 + 2]);
							continue;
						}
						if (local169 == 3201) {
							local20--;
							Static57.method1075(Static103.anIntArray222[local20]);
							continue;
						}
						if (local169 == 3202) {
							local20 -= 2;
							Static99.method619(Static103.anIntArray222[local20 + 1], Static103.anIntArray222[local20]);
							continue;
						}
					} else if (local169 < 3400) {
						if (local169 == 3300) {
							Static103.anIntArray222[local20++] = Static98.anInt2566;
							continue;
						}
						if (local169 == 3301) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = Static114.method1876(local739, local728);
							continue;
						}
						if (local169 == 3302) {
							local20 -= 2;
							local739 = Static103.anIntArray222[local20 + 1];
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static59.method1169(local728, local739);
							continue;
						}
						if (local169 == 3303) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = Static28.method578(local739, local728);
							continue;
						}
						if (local169 == 3304) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static45.method816(local728).anInt2220;
							continue;
						}
						if (local169 == 3305) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static92.anIntArray218[local728];
							continue;
						}
						if (local169 == 3306) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static105.anIntArray223[local728];
							continue;
						}
						if (local169 == 3307) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static113.anIntArray287[local728];
							continue;
						}
						if (local169 == 3308) {
							local728 = Static94.anInt2470;
							local1718 = Static57.anInt1618 + (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 >> 7);
							local739 = Static18.anInt497 + (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 >> 7);
							Static103.anIntArray222[local20++] = (local739 << 14) + (local728 << 28) + local1718;
							continue;
						}
						if (local169 == 3309) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local728 >> 14 & 0x3FFF;
							continue;
						}
						if (local169 == 3310) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local728 >> 28;
							continue;
						}
						if (local169 == 3311) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local728 & 0x3FFF;
							continue;
						}
						if (local169 == 3312) {
							Static103.anIntArray222[local20++] = Static3.aBoolean168 ? 1 : 0;
							continue;
						}
						if (local169 == 3313) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20] + 32768;
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = Static114.method1876(local739, local728);
							continue;
						}
						if (local169 == 3314) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20] + 32768;
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = Static59.method1169(local728, local739);
							continue;
						}
						if (local169 == 3315) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20] + 32768;
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = Static28.method578(local739, local728);
							continue;
						}
					} else if (local169 < 3700) {
						if (local169 == 3600) {
							if (Static24.anInt707 == 0) {
								Static103.anIntArray222[local20++] = -2;
							} else if (Static24.anInt707 == 1) {
								Static103.anIntArray222[local20++] = -1;
							} else {
								Static103.anIntArray222[local20++] = Static42.anInt1124;
							}
							continue;
						}
						if (local169 == 3601) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							if (Static24.anInt707 == 2 && Static42.anInt1124 > local728) {
								Static53.aClass56Array4[local22++] = Static113.aClass56Array15[local728];
								continue;
							}
							Static53.aClass56Array4[local22++] = Static119.aClass56_1625;
							continue;
						}
						if (local169 == 3602) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							if (Static24.anInt707 == 2 && local728 < Static42.anInt1124) {
								Static103.anIntArray222[local20++] = Static86.anIntArray195[local728];
								continue;
							}
							Static103.anIntArray222[local20++] = 0;
							continue;
						}
						if (local169 == 3603) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							if (Static24.anInt707 == 2 && local728 < Static42.anInt1124) {
								Static103.anIntArray222[local20++] = Static59.anIntArray133[local728];
								continue;
							}
							Static103.anIntArray222[local20++] = 0;
							continue;
						}
						if (local169 == 3604) {
							local22--;
							local548 = Static53.aClass56Array4[local22];
							local20--;
							local739 = Static103.anIntArray222[local20];
							Static18.method357(local548, local739);
							continue;
						}
					} else if (local169 < 4100) {
						if (local169 == 4000) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = local739 + local728;
							continue;
						}
						if (local169 == 4001) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = local728 - local739;
							continue;
						}
						if (local169 == 4002) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = local739 * local728;
							continue;
						}
						if (local169 == 4003) {
							local20 -= 2;
							local739 = Static103.anIntArray222[local20 + 1];
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local728 / local739;
							continue;
						}
						if (local169 == 4004) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = (int) ((double) local728 * Math.random());
							continue;
						}
						if (local169 == 4005) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = (int) (Math.random() * (double) (local728 + 1));
							continue;
						}
						if (local169 == 4006) {
							local20 -= 5;
							local1718 = Static103.anIntArray222[local20 + 2];
							local615 = Static103.anIntArray222[local20 + 4];
							local590 = Static103.anIntArray222[local20 + 3];
							local739 = Static103.anIntArray222[local20 + 1];
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local728 + (local615 - local1718) * (-local728 + local739) / (local590 - local1718);
							continue;
						}
						if (local169 == 4007) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = local728 * local739 / 100 + local728;
							continue;
						}
						if (local169 == 4008) {
							local20 -= 2;
							local739 = Static103.anIntArray222[local20 + 1];
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local728 | 0x1 << local739;
							continue;
						}
						if (local169 == 4009) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = -(0x1 << local739) - 1 & local728;
							continue;
						}
						if (local169 == 4010) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = (0x1 << local739 & local728) == 0 ? 0 : 1;
							continue;
						}
						if (local169 == 4011) {
							local20 -= 2;
							local739 = Static103.anIntArray222[local20 + 1];
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local728 % local739;
							continue;
						}
						if (local169 == 4012) {
							local20 -= 2;
							local739 = Static103.anIntArray222[local20 + 1];
							local728 = Static103.anIntArray222[local20];
							if (local728 == 0) {
								Static103.anIntArray222[local20++] = 0;
							} else {
								Static103.anIntArray222[local20++] = (int) Math.pow((double) local728, (double) local739);
							}
							continue;
						}
						if (local169 == 4013) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							if (local728 == 0) {
								Static103.anIntArray222[local20++] = 0;
							} else if (local739 == 0) {
								Static103.anIntArray222[local20++] = Integer.MAX_VALUE;
							} else {
								Static103.anIntArray222[local20++] = (int) Math.pow((double) local728, 1.0D / (double) local739);
							}
							continue;
						}
						if (local169 == 4014) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							Static103.anIntArray222[local20++] = local739 & local728;
							continue;
						}
						if (local169 == 4015) {
							local20 -= 2;
							local739 = Static103.anIntArray222[local20 + 1];
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = local739 | local728;
							continue;
						}
					} else if (local169 < 4200) {
						if (local169 == 4100) {
							local22--;
							local548 = Static53.aClass56Array4[local22];
							local20--;
							local739 = Static103.anIntArray222[local20];
							Static53.aClass56Array4[local22++] = Static84.method1524(new Class56[] { local548, Static111.method1851(local739) });
							continue;
						}
						if (local169 == 4101) {
							local22 -= 2;
							local548 = Static53.aClass56Array4[local22];
							local1060 = Static53.aClass56Array4[local22 + 1];
							Static53.aClass56Array4[local22++] = Static84.method1524(new Class56[] { local548, local1060 });
							continue;
						}
						if (local169 == 4102) {
							local20--;
							local739 = Static103.anIntArray222[local20];
							local22--;
							local548 = Static53.aClass56Array4[local22];
							Static53.aClass56Array4[local22++] = Static84.method1524(new Class56[] { local548, Static32.method647(local739) });
							continue;
						}
						if (local169 == 4103) {
							local22--;
							local548 = Static53.aClass56Array4[local22];
							Static53.aClass56Array4[local22++] = local548.method1422();
							continue;
						}
						if (local169 == 4104) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							@Pc(2454) long local2454 = ((long) local728 + 11745L) * 86400000L;
							Static24.aCalendar1.setTime(new Date(local2454));
							local590 = Static24.aCalendar1.get(5);
							local615 = Static24.aCalendar1.get(2);
							local2472 = Static24.aCalendar1.get(1);
							Static53.aClass56Array4[local22++] = Static84.method1524(new Class56[] { Static111.method1851(local590), Static31.aClass56_505, Static93.aClass56Array10[local615], Static31.aClass56_505, Static111.method1851(local2472) });
							continue;
						}
						if (local169 == 4105) {
							local22 -= 2;
							local1060 = Static53.aClass56Array4[local22 + 1];
							local548 = Static53.aClass56Array4[local22];
							if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass42_1 != null && Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass42_1.aBoolean72) {
								Static53.aClass56Array4[local22++] = local1060;
								continue;
							}
							Static53.aClass56Array4[local22++] = local548;
							continue;
						}
						if (local169 == 4106) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static53.aClass56Array4[local22++] = Static111.method1851(local728);
							continue;
						}
						if (local169 == 4107) {
							local22 -= 2;
							Static103.anIntArray222[local20++] = Static53.aClass56Array4[local22].method1454(Static53.aClass56Array4[local22 + 1]);
							continue;
						}
						@Pc(2611) byte[] local2611;
						@Pc(2616) Class3_Sub1_Sub1_Sub1 local2616;
						if (local169 == 4108) {
							local20 -= 2;
							local739 = Static103.anIntArray222[local20];
							local1718 = Static103.anIntArray222[local20 + 1];
							local22--;
							local548 = Static53.aClass56Array4[local22];
							local2611 = Static12.aClass44_Sub1_14.method1146(local1718, 0);
							local2616 = new Class3_Sub1_Sub1_Sub1(local2611);
							Static103.anIntArray222[local20++] = local2616.method739(local548, local739);
							continue;
						}
						if (local169 == 4109) {
							local20 -= 2;
							local22--;
							local548 = Static53.aClass56Array4[local22];
							local739 = Static103.anIntArray222[local20];
							local1718 = Static103.anIntArray222[local20 + 1];
							local2611 = Static12.aClass44_Sub1_14.method1146(local1718, 0);
							local2616 = new Class3_Sub1_Sub1_Sub1(local2611);
							Static103.anIntArray222[local20++] = local2616.method749(local548, local739);
							continue;
						}
						if (local169 == 4110) {
							local22 -= 2;
							local548 = Static53.aClass56Array4[local22];
							local1060 = Static53.aClass56Array4[local22 + 1];
							local20--;
							if (Static103.anIntArray222[local20] == 1) {
								Static53.aClass56Array4[local22++] = local548;
							} else {
								Static53.aClass56Array4[local22++] = local1060;
							}
							continue;
						}
					} else if (local169 < 4300) {
						if (local169 == 4200) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static53.aClass56Array4[local22++] = Static12.method239(local728).aClass56_944;
							continue;
						}
						@Pc(2087) Class3_Sub1_Sub8 local2087;
						if (local169 == 4201) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							local2087 = Static12.method239(local728);
							if (local739 >= 1 && local739 <= 5 && local2087.aClass56Array6[local739 - 1] != null) {
								Static53.aClass56Array4[local22++] = local2087.aClass56Array6[local739 - 1];
								continue;
							}
							Static53.aClass56Array4[local22++] = Static119.aClass56_1625;
							continue;
						}
						if (local169 == 4202) {
							local20 -= 2;
							local728 = Static103.anIntArray222[local20];
							local739 = Static103.anIntArray222[local20 + 1];
							local2087 = Static12.method239(local728);
							if (local739 >= 1 && local739 <= 5 && local2087.aClass56Array7[local739 - 1] != null) {
								Static53.aClass56Array4[local22++] = local2087.aClass56Array7[local739 - 1];
								continue;
							}
							Static53.aClass56Array4[local22++] = Static119.aClass56_1625;
							continue;
						}
						if (local169 == 4203) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static12.method239(local728).anInt1754;
							continue;
						}
						if (local169 == 4204) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static12.method239(local728).anInt1731 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2234) Class3_Sub1_Sub8 local2234;
						if (local169 == 4205) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							local2234 = Static12.method239(local728);
							if (local2234.anInt1762 == -1 && local2234.anInt1774 >= 0) {
								Static103.anIntArray222[local20++] = local2234.anInt1774;
								continue;
							}
							Static103.anIntArray222[local20++] = local728;
							continue;
						}
						if (local169 == 4206) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							local2234 = Static12.method239(local728);
							if (local2234.anInt1762 >= 0 && local2234.anInt1774 >= 0) {
								Static103.anIntArray222[local20++] = local2234.anInt1774;
								continue;
							}
							Static103.anIntArray222[local20++] = local728;
							continue;
						}
						if (local169 == 4207) {
							local20--;
							local728 = Static103.anIntArray222[local20];
							Static103.anIntArray222[local20++] = Static12.method239(local728).aBoolean82 ? 1 : 0;
							continue;
						}
					}
				} else {
					if (local169 >= 2000) {
						local169 -= 1000;
						local20--;
						local899 = Static96.method1688(Static103.anIntArray222[local20]);
					} else {
						local899 = local865 ? Static96.aClass3_Sub1_Sub16_4 : Static29.aClass3_Sub1_Sub16_2;
					}
					if (local169 == 1300) {
						local20--;
						local739 = Static103.anIntArray222[local20] - 1;
						if (local739 >= 0 && local739 <= 9) {
							local22--;
							local899.method1852(Static53.aClass56Array4[local22], local739);
							continue;
						}
						local22--;
						continue;
					}
					if (local169 == 1301) {
						local20 -= 2;
						local1718 = Static103.anIntArray222[local20 + 1];
						local739 = Static103.anIntArray222[local20];
						local899.aClass3_Sub1_Sub16_5 = Static42.method784(local739, local1718);
						continue;
					}
					if (local169 == 1302) {
						local20--;
						local899.aBoolean150 = Static103.anIntArray222[local20] == 1;
						continue;
					}
					if (local169 == 1303) {
						local20--;
						local899.anInt2796 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1304) {
						local20--;
						local899.anInt2830 = Static103.anIntArray222[local20];
						continue;
					}
					if (local169 == 1305) {
						local22--;
						local899.aClass56_1545 = Static53.aClass56Array4[local22];
						continue;
					}
					if (local169 == 1306) {
						local22--;
						local899.aClass56_1538 = Static53.aClass56Array4[local22];
						continue;
					}
				}
				Static61.method1200("CS2 - nosuchop:" + local169, null);
				return;
			}
		} catch (@Pc(4471) Exception local4471) {
			Static61.method1200("CS2 - scr:" + local15.aLong94 + " op:" + local36, local4471);
		}
	}
}

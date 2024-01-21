import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array17;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_4;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!ac;")
	public static Class3 aClass3_3;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
	public static int anInt823;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_418 = Static14.method2017("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "Lclient!kc;")
	private static Class36 aClass36_428 = Static14.method2017("K");

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_419 = aClass36_428;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_420 = Static14.method2017("@yel@*V");

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_421 = Static14.method2017("@cr2@");

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Lclient!kc;")
	private static Class36 aClass36_430 = Static14.method2017("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!kc;")
	public static Class36 aClass36_422 = aClass36_430;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_423 = Static14.method2017("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!kc;")
	public static Class36 aClass36_424 = Static14.method2017("mapedge");

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!kc;")
	public static Class36 aClass36_425 = aClass36_428;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!kc;")
	private static Class36 aClass36_426 = Static14.method2017("Accept challenge");

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Lclient!kc;")
	public static Class36 aClass36_427 = aClass36_426;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_429 = Static14.method2017("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
	public static int method621() {
		return Static56.anInt1487++;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZIIII)V")
	public static void method622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static85.aClass61_1.method1710(arg1, arg4, arg3);
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (local11 != 0) {
			local24 = Static85.aClass61_1.method1699(arg1, arg4, arg3, local11);
			local30 = local24 >> 6 & 0x3;
			local34 = local24 & 0x1F;
			local36 = arg0;
			if (local11 > 0) {
				local36 = arg2;
			}
			local59 = (52736 - arg3 * 512) * 4 + arg4 * 4 + 24624;
			local65 = local11 >> 14 & 0x7FFF;
			@Pc(68) int[] local68 = Static6.aClass2_Sub1_Sub1_Sub3_2.anIntArray224;
			@Pc(72) Class2_Sub1_Sub13 local72 = Static2.method2072(local65);
			if (local72.anInt2296 == -1) {
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						local68[local59] = local36;
						local68[local59 + 512] = local36;
						local68[local59 + 1024] = local36;
						local68[local59 + 1536] = local36;
					} else if (local30 == 1) {
						local68[local59] = local36;
						local68[local59 + 1] = local36;
						local68[local59 + 2] = local36;
						local68[local59 + 3] = local36;
					} else if (local30 == 2) {
						local68[local59 + 3] = local36;
						local68[local59 + 3 + 512] = local36;
						local68[local59 + 1027] = local36;
						local68[local59 + 1539] = local36;
					} else if (local30 == 3) {
						local68[local59 + 1536] = local36;
						local68[local59 + 1536 + 1] = local36;
						local68[local59 + 2 + 1536] = local36;
						local68[local59 + 1539] = local36;
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						local68[local59] = local36;
					} else if (local30 == 1) {
						local68[local59 + 3] = local36;
					} else if (local30 == 2) {
						local68[local59 + 1536 + 3] = local36;
					} else if (local30 == 3) {
						local68[local59 + 1536] = local36;
					}
				}
				if (local34 == 2) {
					if (local30 == 3) {
						local68[local59] = local36;
						local68[local59 + 512] = local36;
						local68[local59 + 1024] = local36;
						local68[local59 + 1536] = local36;
					} else if (local30 == 0) {
						local68[local59] = local36;
						local68[local59 + 1] = local36;
						local68[local59 + 2] = local36;
						local68[local59 + 3] = local36;
					} else if (local30 == 1) {
						local68[local59 + 3] = local36;
						local68[local59 + 3 + 512] = local36;
						local68[local59 + 1027] = local36;
						local68[local59 + 3 + 1536] = local36;
					} else if (local30 == 2) {
						local68[local59 + 1536] = local36;
						local68[local59 + 1536 + 1] = local36;
						local68[local59 + 2 + 1536] = local36;
						local68[local59 + 1536 + 3] = local36;
					}
				}
			} else {
				@Pc(387) Class2_Sub1_Sub1_Sub1 local387 = Static112.aClass2_Sub1_Sub1_Sub1Array52[local72.anInt2296];
				if (local387 != null) {
					@Pc(400) int local400 = (local72.anInt2326 * 4 - local387.anInt94) / 2;
					@Pc(411) int local411 = (local72.anInt2288 * 4 - local387.anInt93) / 2;
					local387.method97(local400 + arg4 * 4 + 48, 48 - (-((-local72.anInt2288 + (104 - arg3)) * 4) - local411));
				}
			}
		}
		local11 = Static85.aClass61_1.method1702(arg1, arg4, arg3);
		if (local11 != 0) {
			local24 = Static85.aClass61_1.method1699(arg1, arg4, arg3, local11);
			local30 = local24 >> 6 & 0x3;
			local34 = local24 & 0x1F;
			local36 = local11 >> 14 & 0x7FFF;
			@Pc(469) Class2_Sub1_Sub13 local469 = Static2.method2072(local36);
			@Pc(491) int local491;
			if (local469.anInt2296 != -1) {
				@Pc(478) Class2_Sub1_Sub1_Sub1 local478 = Static112.aClass2_Sub1_Sub1_Sub1Array52[local469.anInt2296];
				if (local478 != null) {
					local491 = (local469.anInt2288 * 4 - local478.anInt93) / 2;
					local65 = (local469.anInt2326 * 4 - local478.anInt94) / 2;
					local478.method97(arg4 * 4 + local65 + 48, local491 + (-arg3 + 104 - local469.anInt2288) * 4 + 48);
				}
			} else if (local34 == 9) {
				local59 = 15658734;
				local491 = 4 * 512 * (103 - arg3) + arg4 * 4 + 24624;
				if (local11 > 0) {
					local59 = 15597568;
				}
				@Pc(555) int[] local555 = Static6.aClass2_Sub1_Sub1_Sub3_2.anIntArray224;
				if (local30 == 0 || local30 == 2) {
					local555[local491 + 1536] = local59;
					local555[local491 + 1 + 1024] = local59;
					local555[local491 + 514] = local59;
					local555[local491 + 3] = local59;
				} else {
					local555[local491] = local59;
					local555[local491 + 512 + 1] = local59;
					local555[local491 + 1026] = local59;
					local555[local491 + 1539] = local59;
				}
			}
		}
		local11 = Static85.aClass61_1.method1713(arg1, arg4, arg3);
		if (local11 == 0) {
			return;
		}
		local24 = local11 >> 14 & 0x7FFF;
		@Pc(630) Class2_Sub1_Sub13 local630 = Static2.method2072(local24);
		if (local630.anInt2296 == -1) {
			return;
		}
		@Pc(640) Class2_Sub1_Sub1_Sub1 local640 = Static112.aClass2_Sub1_Sub1_Sub1Array52[local630.anInt2296];
		if (local640 != null) {
			local36 = (local630.anInt2326 * 4 - local640.anInt94) / 2;
			@Pc(664) int local664 = (local630.anInt2288 * 4 - local640.anInt93) / 2;
			local640.method97(local36 + arg4 * 4 + 48, local664 + (-arg3 + 104 - local630.anInt2288) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	public static boolean method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static49.anIntArrayArray18[local3][local7] = 0;
				Static65.anIntArrayArray23[local3][local7] = 99999999;
			}
		}
		local7 = arg10;
		Static49.anIntArrayArray18[arg10][arg2] = 99;
		Static65.anIntArrayArray23[arg10][arg2] = 0;
		@Pc(49) byte local49 = 0;
		Static32.anIntArray128[0] = arg10;
		@Pc(56) int local56 = local49 + 1;
		Static117.anIntArray235[0] = arg2;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = arg2;
		@Pc(64) boolean local64 = false;
		@Pc(69) int[][] local69 = Static11.aClass4Array1[Static92.anInt2412].anIntArrayArray3;
		@Pc(77) int local77 = Static32.anIntArray128.length;
		@Pc(194) int local194;
		while (local56 != local60) {
			local7 = Static32.anIntArray128[local60];
			local62 = Static117.anIntArray235[local60];
			local60 = (local60 + 1) % local77;
			if (local7 == arg4 && local62 == arg6) {
				local64 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static11.aClass4Array1[Static92.anInt2412].method126(arg1 - 1, arg6, local62, local7, arg4, arg7)) {
					local64 = true;
					break;
				}
				if (arg1 < 10 && Static11.aClass4Array1[Static92.anInt2412].method125(arg6, arg7, local62, arg1 - 1, local7, arg4)) {
					local64 = true;
					break;
				}
			}
			if (arg3 != 0 && arg0 != 0 && Static11.aClass4Array1[Static92.anInt2412].method130(arg4, arg0, arg3, local62, arg9, arg6, local7)) {
				local64 = true;
				break;
			}
			local194 = Static65.anIntArrayArray23[local7][local62] + 1;
			if (local7 > 0 && Static49.anIntArrayArray18[local7 - 1][local62] == 0 && (local69[local7 - 1][local62] & 0x1280108) == 0) {
				Static32.anIntArray128[local56] = local7 - 1;
				Static117.anIntArray235[local56] = local62;
				local56 = (local56 + 1) % local77;
				Static49.anIntArrayArray18[local7 - 1][local62] = 2;
				Static65.anIntArrayArray23[local7 - 1][local62] = local194;
			}
			if (local7 < 103 && Static49.anIntArrayArray18[local7 + 1][local62] == 0 && (local69[local7 + 1][local62] & 0x1280180) == 0) {
				Static32.anIntArray128[local56] = local7 + 1;
				Static117.anIntArray235[local56] = local62;
				Static49.anIntArrayArray18[local7 + 1][local62] = 8;
				local56 = (local56 + 1) % local77;
				Static65.anIntArrayArray23[local7 + 1][local62] = local194;
			}
			if (local62 > 0 && Static49.anIntArrayArray18[local7][local62 - 1] == 0 && (local69[local7][local62 - 1] & 0x1280102) == 0) {
				Static32.anIntArray128[local56] = local7;
				Static117.anIntArray235[local56] = local62 - 1;
				local56 = (local56 + 1) % local77;
				Static49.anIntArrayArray18[local7][local62 - 1] = 1;
				Static65.anIntArrayArray23[local7][local62 - 1] = local194;
			}
			if (local62 < 103 && Static49.anIntArrayArray18[local7][local62 + 1] == 0 && (local69[local7][local62 + 1] & 0x1280120) == 0) {
				Static32.anIntArray128[local56] = local7;
				Static117.anIntArray235[local56] = local62 + 1;
				Static49.anIntArrayArray18[local7][local62 + 1] = 4;
				local56 = (local56 + 1) % local77;
				Static65.anIntArrayArray23[local7][local62 + 1] = local194;
			}
			if (local7 > 0 && local62 > 0 && Static49.anIntArrayArray18[local7 - 1][local62 - 1] == 0 && (local69[local7 - 1][local62 - 1] & 0x128010E) == 0 && (local69[local7 - 1][local62] & 0x1280108) == 0 && (local69[local7][local62 - 1] & 0x1280102) == 0) {
				Static32.anIntArray128[local56] = local7 - 1;
				Static117.anIntArray235[local56] = local62 - 1;
				local56 = (local56 + 1) % local77;
				Static49.anIntArrayArray18[local7 - 1][local62 - 1] = 3;
				Static65.anIntArrayArray23[local7 - 1][local62 - 1] = local194;
			}
			if (local7 < 103 && local62 > 0 && Static49.anIntArrayArray18[local7 + 1][local62 - 1] == 0 && (local69[local7 + 1][local62 - 1] & 0x1280183) == 0 && (local69[local7 + 1][local62] & 0x1280180) == 0 && (local69[local7][local62 - 1] & 0x1280102) == 0) {
				Static32.anIntArray128[local56] = local7 + 1;
				Static117.anIntArray235[local56] = local62 - 1;
				local56 = (local56 + 1) % local77;
				Static49.anIntArrayArray18[local7 + 1][local62 - 1] = 9;
				Static65.anIntArrayArray23[local7 + 1][local62 - 1] = local194;
			}
			if (local7 > 0 && local62 < 103 && Static49.anIntArrayArray18[local7 - 1][local62 + 1] == 0 && (local69[local7 - 1][local62 + 1] & 0x1280138) == 0 && (local69[local7 - 1][local62] & 0x1280108) == 0 && (local69[local7][local62 + 1] & 0x1280120) == 0) {
				Static32.anIntArray128[local56] = local7 - 1;
				Static117.anIntArray235[local56] = local62 + 1;
				Static49.anIntArrayArray18[local7 - 1][local62 + 1] = 6;
				Static65.anIntArrayArray23[local7 - 1][local62 + 1] = local194;
				local56 = (local56 + 1) % local77;
			}
			if (local7 < 103 && local62 < 103 && Static49.anIntArrayArray18[local7 + 1][local62 + 1] == 0 && (local69[local7 + 1][local62 + 1] & 0x12801E0) == 0 && (local69[local7 + 1][local62] & 0x1280180) == 0 && (local69[local7][local62 + 1] & 0x1280120) == 0) {
				Static32.anIntArray128[local56] = local7 + 1;
				Static117.anIntArray235[local56] = local62 + 1;
				local56 = (local56 + 1) % local77;
				Static49.anIntArrayArray18[local7 + 1][local62 + 1] = 12;
				Static65.anIntArrayArray23[local7 + 1][local62 + 1] = local194;
			}
		}
		Static17.anInt442 = 0;
		@Pc(816) int local816;
		@Pc(823) int local823;
		@Pc(830) int local830;
		if (!local64) {
			if (!arg8) {
				return false;
			}
			local194 = 1000;
			local816 = 100;
			for (local823 = arg4 - 10; local823 <= arg4 + 10; local823++) {
				for (local830 = arg6 - 10; local830 <= arg6 + 10; local830++) {
					if (local823 >= 0 && local830 >= 0 && local823 < 104 && local830 < 104 && Static65.anIntArrayArray23[local823][local830] < 100) {
						@Pc(860) int local860 = 0;
						if (local823 < arg4) {
							local860 = arg4 - local823;
						} else if (local823 > arg3 + arg4 - 1) {
							local860 = local823 + 1 - arg4 - arg3;
						}
						@Pc(891) int local891 = 0;
						if (arg6 > local830) {
							local891 = arg6 - local830;
						} else if (local830 > arg6 + arg0 - 1) {
							local891 = local830 + 1 - arg6 - arg0;
						}
						@Pc(925) int local925 = local891 * local891 + local860 * local860;
						if (local194 > local925 || local925 == local194 && local816 > Static65.anIntArrayArray23[local823][local830]) {
							local62 = local830;
							local816 = Static65.anIntArrayArray23[local823][local830];
							local7 = local823;
							local194 = local925;
						}
					}
				}
			}
			if (local194 == 1000) {
				return false;
			}
			if (local7 == arg10 && arg2 == local62) {
				return false;
			}
			Static17.anInt442 = 1;
		}
		@Pc(1001) byte local1001 = 0;
		Static32.anIntArray128[0] = local7;
		local60 = local1001 + 1;
		Static117.anIntArray235[0] = local62;
		local194 = local816 = Static49.anIntArrayArray18[local7][local62];
		while (arg10 != local7 || local62 != arg2) {
			if (local194 != local816) {
				local816 = local194;
				Static32.anIntArray128[local60] = local7;
				Static117.anIntArray235[local60++] = local62;
			}
			if ((local194 & 0x1) != 0) {
				local62++;
			} else if ((local194 & 0x4) != 0) {
				local62--;
			}
			if ((local194 & 0x2) != 0) {
				local7++;
			} else if ((local194 & 0x8) != 0) {
				local7--;
			}
			local194 = Static49.anIntArrayArray18[local7][local62];
		}
		if (local60 > 0) {
			local77 = local60;
			if (local60 > 25) {
				local77 = 25;
			}
			local60--;
			local823 = Static117.anIntArray235[local60];
			@Pc(1103) int local1103 = Static32.anIntArray128[local60];
			if (arg5 == 0) {
				Static42.aClass2_Sub12_Sub1_1.method1422(142);
				Static42.aClass2_Sub12_Sub1_1.method1409(local77 + local77 + 3);
			}
			if (arg5 == 1) {
				Static42.aClass2_Sub12_Sub1_1.method1422(22);
				Static42.aClass2_Sub12_Sub1_1.method1409(local77 + local77 + 3 + 14);
			}
			if (arg5 == 2) {
				Static42.aClass2_Sub12_Sub1_1.method1422(148);
				Static42.aClass2_Sub12_Sub1_1.method1409(local77 + local77 + 3);
			}
			Static42.aClass2_Sub12_Sub1_1.method1379(Static23.anInt592 + local823);
			Static42.aClass2_Sub12_Sub1_1.method1392(local1103 + Static25.anInt632);
			Static78.anInt2040 = Static117.anIntArray235[0];
			Static22.anInt576 = Static32.anIntArray128[0];
			for (local830 = 1; local830 < local77; local830++) {
				local60--;
				Static42.aClass2_Sub12_Sub1_1.method1409(Static32.anIntArray128[local60] - local1103);
				Static42.aClass2_Sub12_Sub1_1.method1396(Static117.anIntArray235[local60] - local823);
			}
			Static42.aClass2_Sub12_Sub1_1.method1381(Static60.aBooleanArray8[82] ? 1 : 0);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method624(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!ed;)[I")
	public static int[] method625(@OriginalArg(1) Class2_Sub1_Sub6 arg0) {
		@Pc(10) int local10 = arg0.anInt680 >> 16;
		if (!Static33.method328(local10)) {
			return null;
		}
		@Pc(19) int local19 = arg0.anInt722;
		@Pc(22) int local22 = arg0.anInt685;
		@Pc(30) int local30 = arg0.anInt669;
		while (local30 != -1) {
			@Pc(40) Class2_Sub1_Sub6 local40 = Static42.aClass2_Sub1_Sub6ArrayArray1[local10][local30 & 0xFFFF];
			local22 += local40.anInt685 - local40.anInt716;
			local30 = local40.anInt669;
			local19 += local40.anInt722 - local40.anInt675;
		}
		return new int[] { local19, local22 };
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method626() {
		if (Static60.anInt1597 != 0 || Static24.aClass2_Sub1_Sub6_1 != null) {
			return;
		}
		@Pc(13) int local13 = Static95.anInt2522;
		if (Static56.aBoolean70 && Static59.anInt1578 >= 516 && Static90.anInt2349 >= 160 && Static59.anInt1578 <= 765 && Static90.anInt2349 <= 205) {
			local13 = 0;
		}
		@Pc(51) int local51;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (!Static73.aBoolean82) {
			if (local13 == 1 && Static43.anInt1141 > 0) {
				local51 = Static55.anIntArray329[Static43.anInt1141 - 1];
				if (local51 == 8 || local51 == 15 || local51 == 4 || local51 == 37 || local51 == 43 || local51 == 2 || local51 == 24 || local51 == 27 || local51 == 55 || local51 == 19 || local51 == 56 || local51 == 1005) {
					local103 = Static57.anIntArray187[Static43.anInt1141 - 1];
					local109 = Static51.anIntArray317[Static43.anInt1141 - 1];
					@Pc(113) Class2_Sub1_Sub6 local113 = Static71.method1274(local109);
					if (Static10.method214(Static67.method1163(local113)) || Static100.method1851(Static67.method1163(local113))) {
						Static65.anInt1685 = 0;
						Static13.anInt308 = Static90.anInt2349;
						Static60.anInt1597 = 2;
						if (Static78.anInt2037 == local109 >> 16) {
							Static60.anInt1597 = 1;
						}
						if (local109 >> 16 == Static49.anInt1312) {
							Static60.anInt1597 = 3;
						}
						Static41.aBoolean53 = false;
						Static99.anInt2035 = Static59.anInt1578;
						Static101.anInt2658 = local109;
						Static77.anInt2024 = local103;
						return;
					}
				}
			}
			if (local13 == 1 && (Static100.anInt2614 == 1 || Static52.method1001(Static43.anInt1141 - 1)) && Static43.anInt1141 > 2) {
				local13 = 2;
			}
			if (local13 == 1 && Static43.anInt1141 > 0) {
				Static55.method1925(Static43.anInt1141 - 1);
			}
			if (local13 == 2 && Static43.anInt1141 > 0) {
				Static113.method2045();
			}
			return;
		}
		if (local13 != 1) {
			local51 = Static115.anInt1789;
			local103 = Static64.anInt1640;
			if (Static24.anInt620 == 0) {
				local51 -= 4;
				local103 -= 4;
			}
			if (Static24.anInt620 == 1) {
				local103 -= 205;
				local51 -= 553;
			}
			if (Static24.anInt620 == 2) {
				local103 -= 357;
				local51 -= 17;
			}
			if (Static61.anInt1612 - 10 > local51 || local51 > Static61.anInt1612 + Static94.anInt2475 + 10 || Static77.anInt2023 - 10 > local103 || Static95.anInt2518 + Static77.anInt2023 + 10 < local103) {
				Static73.aBoolean82 = false;
				if (Static24.anInt620 == 2) {
					Static115.aBoolean77 = true;
				}
				if (Static24.anInt620 == 1) {
					Static100.aBoolean118 = true;
				}
			}
		}
		if (local13 != 1) {
			return;
		}
		local51 = Static61.anInt1612;
		local103 = Static77.anInt2023;
		@Pc(290) int local290 = Static59.anInt1578;
		local109 = Static94.anInt2475;
		@Pc(294) int local294 = -1;
		@Pc(296) int local296 = Static90.anInt2349;
		if (Static24.anInt620 == 0) {
			local296 -= 4;
			local290 -= 4;
		}
		if (Static24.anInt620 == 1) {
			local290 -= 553;
			local296 -= 205;
		}
		if (Static24.anInt620 == 2) {
			local290 -= 17;
			local296 -= 357;
		}
		for (@Pc(317) int local317 = 0; local317 < Static43.anInt1141; local317++) {
			@Pc(332) int local332 = local103 + (Static43.anInt1141 - (1 - -local317)) * 15 + 31;
			if (local290 > local51 && local290 < local109 + local51 && local296 > local332 - 13 && local296 < local332 + 3) {
				local294 = local317;
			}
		}
		if (local294 != -1) {
			Static55.method1925(local294);
		}
		Static73.aBoolean82 = false;
		if (Static24.anInt620 == 2) {
			Static115.aBoolean77 = true;
		}
		if (Static24.anInt620 == 1) {
			Static100.aBoolean118 = true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V")
	public static void method627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(16) Class2_Sub1_Sub3 local16 = (Class2_Sub1_Sub3) Static60.aClass31_2.method905(local10);
		if (local16 != null) {
			Static33.aClass1_2.method2(local16);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	public static void method628() {
		aClass36Array17 = null;
		aClass3_3 = null;
		aClass3_Sub1_4 = null;
		aClass36_427 = null;
		aClass36_421 = null;
		aClass36_422 = null;
		aClass36_424 = null;
		aClass36_428 = null;
		aClass36_425 = null;
		aClass36_420 = null;
		aClass36_430 = null;
		aClass36_423 = null;
		aClass36_426 = null;
		aClass36_419 = null;
		aClass36_418 = null;
		aClass36_429 = null;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	public static void method629() {
		if (Static20.anInt500 == 0 && !Static56.aBoolean70) {
			Static34.method717(18, Static64.anInt1640, Static115.anInt1789, Static105.aClass36_1352, 0, Static23.aClass36_321);
		}
		@Pc(31) int local31 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static30.anInt870; local33++) {
			@Pc(39) int local39 = Static30.anIntArray98[local33];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 29 & 0x3;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local31 != local39) {
				local31 = local39;
				@Pc(186) int local186;
				if (local55 == 2 && Static85.aClass61_1.method1699(Static92.anInt2412, local43, local49, local39) >= 0) {
					@Pc(84) Class2_Sub1_Sub13 local84 = Static2.method2072(local61);
					if (local84.anIntArray275 != null) {
						local84 = local84.method1630();
					}
					if (local84 == null) {
						continue;
					}
					if (Static20.anInt500 == 1) {
						Static34.method717(38, local49, local43, Static49.method949(new Class36[] { Static78.aClass36_958, Static18.aClass36_234, local84.aClass36_1077 }), local39, Static27.aClass36_397);
					} else if (!Static56.aBoolean70) {
						@Pc(174) Class36[] local174 = local84.aClass36Array39;
						if (Static20.aBoolean17) {
							local174 = Static39.method753(local174);
						}
						if (local174 != null) {
							for (local186 = 4; local186 >= 0; local186--) {
								if (local174[local186] != null) {
									@Pc(198) short local198 = 0;
									if (local186 == 0) {
										local198 = 23;
									}
									if (local186 == 1) {
										local198 = 39;
									}
									if (local186 == 2) {
										local198 = 57;
									}
									if (local186 == 3) {
										local198 = 29;
									}
									if (local186 == 4) {
										local198 = 1003;
									}
									Static34.method717(local198, local49, local43, Static49.method949(new Class36[] { Static10.aClass36_146, local84.aClass36_1077 }), local39, local174[local186]);
								}
							}
						}
						Static34.method717(1004, local49, local43, Static49.method949(new Class36[] { Static10.aClass36_146, local84.aClass36_1077 }), local84.anInt2317 << 14, Static117.aClass36_903);
					} else if ((Static88.anInt2320 & 0x4) == 4) {
						Static34.method717(35, local49, local43, Static49.method949(new Class36[] { Static73.aClass36_890, Static18.aClass36_234, local84.aClass36_1077 }), local39, Static55.aClass36_1328);
					}
				}
				@Pc(305) int local305;
				@Pc(313) Class2_Sub1_Sub4_Sub2_Sub1 local313;
				@Pc(366) Class2_Sub1_Sub4_Sub2_Sub2 local366;
				if (local55 == 1) {
					@Pc(284) Class2_Sub1_Sub4_Sub2_Sub1 local284 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local61];
					if (local284.aClass2_Sub1_Sub9_1.anInt1528 == 1 && (local284.anInt2204 & 0x7F) == 64 && (local284.anInt2149 & 0x7F) == 64) {
						for (local305 = 0; local305 < Static108.anInt2775; local305++) {
							local313 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[Static51.anIntArray316[local305]];
							if (local313 != null && local313 != local284 && local313.aClass2_Sub1_Sub9_1.anInt1528 == 1 && local284.anInt2204 == local313.anInt2204 && local313.anInt2149 == local284.anInt2149) {
								Static40.method1548(local49, local313.aClass2_Sub1_Sub9_1, Static51.anIntArray316[local305], local43);
							}
						}
						for (local186 = 0; local186 < Static65.anInt1689; local186++) {
							local366 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[Static99.anIntArray243[local186]];
							if (local366 != null && local366.anInt2204 == local284.anInt2204 && local366.anInt2149 == local284.anInt2149) {
								Static33.method332(local43, local366, Static99.anIntArray243[local186], local49);
							}
						}
					}
					Static40.method1548(local49, local284.aClass2_Sub1_Sub9_1, local61, local43);
				}
				if (local55 == 0) {
					@Pc(412) Class2_Sub1_Sub4_Sub2_Sub2 local412 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local61];
					if ((local412.anInt2204 & 0x7F) == 64 && (local412.anInt2149 & 0x7F) == 64) {
						for (local305 = 0; local305 < Static108.anInt2775; local305++) {
							local313 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[Static51.anIntArray316[local305]];
							if (local313 != null && local313.aClass2_Sub1_Sub9_1.anInt1528 == 1 && local412.anInt2204 == local313.anInt2204 && local313.anInt2149 == local412.anInt2149) {
								Static40.method1548(local49, local313.aClass2_Sub1_Sub9_1, Static51.anIntArray316[local305], local43);
							}
						}
						for (local186 = 0; local186 < Static65.anInt1689; local186++) {
							local366 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[Static99.anIntArray243[local186]];
							if (local366 != null && local366 != local412 && local412.anInt2204 == local366.anInt2204 && local412.anInt2149 == local366.anInt2149) {
								Static33.method332(local43, local366, Static99.anIntArray243[local186], local49);
							}
						}
					}
					Static33.method332(local43, local412, local61, local49);
				}
				if (local55 == 3) {
					@Pc(544) Class8 local544 = Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local43][local49];
					if (local544 != null) {
						for (@Pc(551) Class2_Sub1_Sub4_Sub3 local551 = (Class2_Sub1_Sub4_Sub3) local544.method185(); local551 != null; local551 = (Class2_Sub1_Sub4_Sub3) local544.method176()) {
							@Pc(558) Class2_Sub1_Sub18 local558 = Static43.method832(local551.anInt1747);
							if (Static20.anInt500 == 1) {
								Static34.method717(47, local49, local43, Static49.method949(new Class36[] { Static78.aClass36_958, Static8.aClass36_118, local558.aClass36_1397 }), local551.anInt1747, Static27.aClass36_397);
							} else if (!Static56.aBoolean70) {
								@Pc(568) Class36[] local568 = local558.aClass36Array49;
								if (Static20.aBoolean17) {
									local568 = Static39.method753(local568);
								}
								for (@Pc(580) int local580 = 4; local580 >= 0; local580--) {
									if (local568 != null && local568[local580] != null) {
										@Pc(622) byte local622 = 0;
										if (local580 == 0) {
											local622 = 31;
										}
										if (local580 == 1) {
											local622 = 34;
										}
										if (local580 == 2) {
											local622 = 5;
										}
										if (local580 == 3) {
											local622 = 22;
										}
										if (local580 == 4) {
											local622 = 30;
										}
										Static34.method717(local622, local49, local43, Static49.method949(new Class36[] { Static96.aClass36_1235, local558.aClass36_1397 }), local551.anInt1747, local568[local580]);
									} else if (local580 == 2) {
										Static34.method717(5, local49, local43, Static49.method949(new Class36[] { Static96.aClass36_1235, local558.aClass36_1397 }), local551.anInt1747, Static83.aClass36_989);
									}
								}
								Static34.method717(1001, local49, local43, Static49.method949(new Class36[] { Static96.aClass36_1235, local558.aClass36_1397 }), local551.anInt1747, Static117.aClass36_903);
							} else if ((Static88.anInt2320 & 0x1) == 1) {
								Static34.method717(6, local49, local43, Static49.method949(new Class36[] { Static73.aClass36_890, Static8.aClass36_118, local558.aClass36_1397 }), local551.anInt1747, Static55.aClass36_1328);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
	public static void method630() {
		if (Static60.aBooleanArray8[96]) {
			Static55.anInt2712 += (-Static55.anInt2712 - 24) / 2;
		} else if (Static60.aBooleanArray8[97]) {
			Static55.anInt2712 += (24 - Static55.anInt2712) / 2;
		} else {
			Static55.anInt2712 /= 2;
		}
		if (Static60.aBooleanArray8[98]) {
			Static99.anInt2033 += (12 - Static99.anInt2033) / 2;
		} else if (Static60.aBooleanArray8[99]) {
			Static99.anInt2033 += (-Static99.anInt2033 - 12) / 2;
		} else {
			Static99.anInt2033 /= 2;
		}
		Static14.anInt2903 = Static55.anInt2712 / 2 + Static14.anInt2903 & 0x7FF;
		Static100.anInt2618 += Static99.anInt2033 / 2;
		@Pc(92) int local92 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2204 + Static63.anInt1623;
		if (Static100.anInt2618 < 128) {
			Static100.anInt2618 = 128;
		}
		@Pc(105) int local105 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2149 + Static57.anInt1504;
		if (Static96.anInt2561 - local92 < -500 || Static96.anInt2561 - local92 > 500 || Static51.anInt2604 - local105 < -500 || Static51.anInt2604 - local105 > 500) {
			Static96.anInt2561 = local92;
			Static51.anInt2604 = local105;
		}
		if (Static51.anInt2604 != local105) {
			Static51.anInt2604 += (local105 - Static51.anInt2604) / 16;
		}
		if (Static100.anInt2618 > 383) {
			Static100.anInt2618 = 383;
		}
		@Pc(160) int local160 = Static51.anInt2604 >> 7;
		@Pc(162) int local162 = 0;
		if (Static96.anInt2561 != local92) {
			Static96.anInt2561 += (local92 - Static96.anInt2561) / 16;
		}
		@Pc(186) int local186 = Static96.anInt2561 >> 7;
		@Pc(192) int local192 = Static56.method1044(Static51.anInt2604, Static96.anInt2561, Static92.anInt2412);
		@Pc(208) int local208;
		if (local186 > 3 && local160 > 3 && local186 < 100 && local160 < 100) {
			for (local208 = local186 - 4; local208 <= local186 + 4; local208++) {
				for (@Pc(214) int local214 = local160 - 4; local214 <= local160 + 4; local214++) {
					@Pc(218) int local218 = Static92.anInt2412;
					if (local218 < 3 && (Static16.aByteArrayArrayArray3[1][local208][local214] & 0x2) == 2) {
						local218++;
					}
					@Pc(246) int local246 = local192 - Static27.anIntArrayArrayArray4[local218][local208][local214];
					if (local246 > local162) {
						local162 = local246;
					}
				}
			}
		}
		local208 = local162 * 192;
		if (local208 > 98048) {
			local208 = 98048;
		}
		if (local208 < 32768) {
			local208 = 32768;
		}
		if (Static13.anInt307 < local208) {
			Static13.anInt307 += (local208 - Static13.anInt307) / 24;
		} else if (Static13.anInt307 > local208) {
			Static13.anInt307 += (local208 - Static13.anInt307) / 80;
			return;
		}
	}
}

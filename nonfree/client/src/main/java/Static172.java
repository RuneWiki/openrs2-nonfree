import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	public static int anInt3639;

	@OriginalMember(owner = "client!lo", name = "K", descriptor = "Lclient!lm;")
	public static Class134 aClass134_83;

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!lo", name = "R", descriptor = "Lclient!ke;")
	public static final Class122 aClass122_6 = new Class122();

	@OriginalMember(owner = "client!lo", name = "S", descriptor = "Ljava/lang/String;")
	public static final String aString134 = "wave2:";

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(FIIIIZII)[I")
	public static int[] method3078(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub5_Sub6 local10 = new Class1_Sub5_Sub6();
		local10.anInt1696 = (int) (arg0 * 4096.0F);
		local10.anInt1691 = 35;
		local10.anInt1698 = 8;
		local10.anInt1688 = 8;
		local10.anInt1694 = 4;
		local10.aBoolean119 = true;
		local10.method5801();
		Static91.method1439(2048, 1);
		local10.method1427(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIILclient!ba;III)Z")
	public static boolean method3079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class17 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg5;
		@Pc(23) int local23 = arg7 - 64;
		Static131.anIntArrayArray25[64][64] = 99;
		@Pc(34) int local34 = arg5 - 64;
		Static257.anIntArrayArray41[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static222.anIntArray437[0] = arg7;
		@Pc(51) int local51 = local42 + 1;
		Static121.anIntArray392[0] = arg5;
		@Pc(56) int[][] local56 = arg6.anIntArrayArray5;
		while (local51 != local44) {
			local9 = Static121.anIntArray392[local44];
			local7 = Static222.anIntArray437[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local23;
			@Pc(82) int local82 = local9 - local34;
			@Pc(88) int local88 = local7 - arg6.anInt365;
			@Pc(94) int local94 = local9 - arg6.anInt370;
			if (arg0 == -4) {
				if (arg3 == local7 && local9 == arg4) {
					Static315.anInt6285 = local7;
					Static100.anInt1936 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static12.method187(arg3, arg4, arg9, local7, 2, 2, arg2, local9)) {
					Static100.anInt1936 = local9;
					Static315.anInt6285 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg6.method323(2, arg9, arg1, arg4, arg3, 2, local7, local9, arg2)) {
					Static315.anInt6285 = local7;
					Static100.anInt1936 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg6.method337(arg1, 2, local7, local9, arg2, arg3, arg4, arg9)) {
					Static100.anInt1936 = local9;
					Static315.anInt6285 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg6.method340(arg4, arg0, arg8, 2, arg3, local7, local9)) {
					Static315.anInt6285 = local7;
					Static100.anInt1936 = local9;
					return true;
				}
			} else if (arg6.method329(local9, 2, arg8, arg4, local7, arg3, arg0)) {
				Static315.anInt6285 = local7;
				Static100.anInt1936 = local9;
				return true;
			}
			@Pc(246) int local246 = Static257.anIntArrayArray41[local77][local82] + 1;
			if (local77 > 0 && Static131.anIntArrayArray25[local77 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static222.anIntArray437[local51] = local7 - 1;
				Static121.anIntArray392[local51] = local9;
				Static131.anIntArrayArray25[local77 - 1][local82] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local77 - 1][local82] = local246;
			}
			if (local77 < 126 && Static131.anIntArrayArray25[local77 + 1][local82] == 0 && (local56[local88 + 2][local94] & 0x60E40000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static222.anIntArray437[local51] = local7 + 1;
				Static121.anIntArray392[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local77 + 1][local82] = 8;
				Static257.anIntArrayArray41[local77 + 1][local82] = local246;
			}
			if (local82 > 0 && Static131.anIntArrayArray25[local77][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static222.anIntArray437[local51] = local7;
				Static121.anIntArray392[local51] = local9 - 1;
				Static131.anIntArrayArray25[local77][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local77][local82 - 1] = local246;
			}
			if (local82 < 126 && Static131.anIntArrayArray25[local77][local82 + 1] == 0 && (local56[local88][local94 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static222.anIntArray437[local51] = local7;
				Static121.anIntArray392[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local77][local82 + 1] = 4;
				Static257.anIntArrayArray41[local77][local82 + 1] = local246;
			}
			if (local77 > 0 && local82 > 0 && Static131.anIntArrayArray25[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local88][local94 - 1] & 0x63E40000) == 0) {
				Static222.anIntArray437[local51] = local7 - 1;
				Static121.anIntArray392[local51] = local9 - 1;
				Static131.anIntArrayArray25[local77 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local77 - 1][local82 - 1] = local246;
			}
			if (local77 < 126 && local82 > 0 && Static131.anIntArrayArray25[local77 + 1][local82 - 1] == 0 && (local56[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local94] & 0x78E40000) == 0) {
				Static222.anIntArray437[local51] = local7 + 1;
				Static121.anIntArray392[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local77 + 1][local82 - 1] = 9;
				Static257.anIntArrayArray41[local77 + 1][local82 - 1] = local246;
			}
			if (local77 > 0 && local82 < 126 && Static131.anIntArrayArray25[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local56[local88][local94 + 2] & 0x7E240000) == 0) {
				Static222.anIntArray437[local51] = local7 - 1;
				Static121.anIntArray392[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local77 - 1][local82 + 1] = 6;
				Static257.anIntArrayArray41[local77 - 1][local82 + 1] = local246;
			}
			if (local77 < 126 && local82 < 126 && Static131.anIntArrayArray25[local77 + 1][local82 + 1] == 0 && (local56[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static222.anIntArray437[local51] = local7 + 1;
				Static121.anIntArray392[local51] = local9 + 1;
				Static131.anIntArrayArray25[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local77 + 1][local82 + 1] = local246;
			}
		}
		Static315.anInt6285 = local7;
		Static100.anInt1936 = local9;
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
	public static void method3081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(4, arg2);
		local12.method4783();
		local12.anInt5458 = arg0;
		local12.anInt5461 = arg3;
		local12.anInt5467 = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIIIZIII)V")
	public static void method3082(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!arg0 && Static177.anInt3736 == arg1 && Static232.anInt4829 == arg3 && (Static98.anInt1912 == arg2 || Static25.method408())) {
			return;
		}
		Static177.anInt3736 = arg1;
		Static98.anInt1912 = arg2;
		Static232.anInt4829 = arg3;
		if (Static25.method408()) {
			Static98.anInt1912 = 0;
		}
		if (arg4) {
			Static16.method298(28);
		} else {
			Static16.method298(25);
		}
		Static159.method5486(true, Static101.aString78, Static233.aClass29_2);
		@Pc(52) int local52 = Static92.anInt1755;
		Static92.anInt1755 = (Static177.anInt3736 - (Static43.anInt1151 >> 4)) * 8;
		@Pc(62) int local62 = Static98.anInt1911;
		Static98.anInt1911 = (Static232.anInt4829 - (Static260.anInt5348 >> 4)) * 8;
		Static173.aClass1_Sub2_Sub8_3 = Static150.method2259(Static177.anInt3736 * 8, Static232.anInt4829 * 8);
		Static37.aClass129_1 = null;
		@Pc(86) int local86 = Static92.anInt1755 - local52;
		@Pc(91) int local91 = Static98.anInt1911 - local62;
		@Pc(95) int local95;
		@Pc(105) int local105;
		if (arg4) {
			Static271.anInt5578 = 0;
			local95 = Static43.anInt1151 * 128 - 128;
			@Pc(163) int local163 = (Static260.anInt5348 - 1) * 128;
			for (local105 = 0; local105 < 32768; local105++) {
				@Pc(171) Class10_Sub1_Sub2_Sub1 local171 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local105];
				if (local171 != null) {
					local171.anInt6728 -= local86 * 128;
					local171.anInt6726 -= local91 * 128;
					if (local171.anInt6728 >= 0 && local95 >= local171.anInt6728 && local171.anInt6726 >= 0 && local163 >= local171.anInt6726) {
						@Pc(216) boolean local216 = true;
						for (@Pc(218) int local218 = 0; local218 < 10; local218++) {
							local171.anIntArray387[local218] -= local86;
							local171.anIntArray388[local218] -= local91;
							if (local171.anIntArray387[local218] < 0 || local171.anIntArray387[local218] >= Static43.anInt1151 || local171.anIntArray388[local218] < 0 || local171.anIntArray388[local218] >= Static260.anInt5348) {
								local216 = false;
							}
						}
						if (local216) {
							Static79.anIntArray672[Static271.anInt5578++] = local105;
						} else {
							Static178.aClass10_Sub1_Sub2_Sub1Array1[local105].method677(null);
							Static178.aClass10_Sub1_Sub2_Sub1Array1[local105] = null;
						}
					} else {
						Static178.aClass10_Sub1_Sub2_Sub1Array1[local105].method677(null);
						Static178.aClass10_Sub1_Sub2_Sub1Array1[local105] = null;
					}
				}
			}
		} else {
			for (local95 = 0; local95 < 32768; local95++) {
				@Pc(101) Class10_Sub1_Sub2_Sub1 local101 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local95];
				if (local101 != null) {
					for (local105 = 0; local105 < 10; local105++) {
						local101.anIntArray387[local105] -= local86;
						local101.anIntArray388[local105] -= local91;
					}
					local101.anInt6726 -= local91 * 128;
					local101.anInt6728 -= local86 * 128;
				}
			}
		}
		for (local95 = 0; local95 < 2048; local95++) {
			@Pc(316) Class10_Sub1_Sub2_Sub2 local316 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local95];
			if (local316 != null) {
				for (local105 = 0; local105 < 10; local105++) {
					local316.anIntArray387[local105] -= local86;
					local316.anIntArray388[local105] -= local91;
				}
				local316.anInt6728 -= local86 * 128;
				local316.anInt6726 -= local91 * 128;
			}
		}
		Static127.anInt2487 = arg2;
		Static127.aClass10_Sub1_Sub2_Sub2_1.method3420(arg6, Static127.anInt2487, false, arg5);
		Static79.method5804(local86, local91);
		for (@Pc(384) Class1_Sub23 local384 = (Class1_Sub23) Static271.aClass14_28.method302(); local384 != null; local384 = (Class1_Sub23) Static271.aClass14_28.method313()) {
			local384.anInt3746 -= local86;
			local384.anInt3755 -= local91;
			if (local384.anInt3746 < 0 || local384.anInt3755 < 0 || Static43.anInt1151 <= local384.anInt3746 || Static260.anInt5348 <= local384.anInt3755) {
				local384.method5796();
			}
		}
		Static58.anInt1391 = 0;
		if (Static307.anInt6146 != 0) {
			Static14.anInt229 -= local91;
			Static307.anInt6146 -= local86;
		}
		if (arg4) {
			Static231.anInt4824 -= local91;
			Static266.anInt5482 -= local91;
			Static63.anInt2655 -= local86;
			Static42.anInt1138 -= local86;
			Static4.anInt41 -= local86 * 128;
			Static177.anInt3734 -= local91 * 128;
			if (Math.abs(local86) > Static43.anInt1151 || Math.abs(local91) > Static260.anInt5348) {
				Static353.method5855();
			}
		} else if (Static246.anInt5156 == 4) {
			Static29.anInt545 -= local86 * 128;
			Static18.anInt355 -= local91 * 128;
			Static163.anInt3374 -= local91 * 128;
			Static67.anInt1459 -= local86 * 128;
		} else {
			Static246.anInt5156 = 1;
		}
		Static10.method166();
		Static329.method5542();
		Static35.aClass14_2.method305();
		Static93.aClass14_7.method305();
		aClass122_6.method2619();
		Static4.method32();
	}

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V")
	public static void method3083() {
		if (Static94.anInt1786 != 0) {
			Static229.anInt4788 -= Static94.anInt1786 * 5;
			Static94.anInt1786 = 0;
			if (Static229.anInt4788 >= Static208.anInt4355) {
				Static229.anInt4788 = Static208.anInt4355 - 1;
			} else if (Static229.anInt4788 < 0) {
				Static229.anInt4788 = 0;
			}
		}
		if (Static121.anInt4228 < 102) {
			Static121.anInt4228 += 6;
		}
		@Pc(59) int local59;
		for (@Pc(53) int local53 = 0; local53 < Static102.anInt1950; local53++) {
			local59 = Static43.anIntArray67[local53];
			@Pc(64) char local64 = (char) Static12.anIntArray9[local53];
			if (local59 == 84) {
				Static340.method5640();
			} else if (Static112.aBooleanArray11[82] && local59 == 66) {
				if (Static112.aClipboard1 != null) {
					@Pc(86) String local86 = "";
					for (@Pc(91) int local91 = Static167.aStringArray28.length - 1; local91 >= 0; local91--) {
						if (Static167.aStringArray28[local91] != null && Static167.aStringArray28[local91].length() > 0) {
							local86 = local86 + Static167.aStringArray28[local91] + '\n';
						}
					}
					Static112.aClipboard1.setContents(new StringSelection(local86), null);
				}
			} else if (Static112.aBooleanArray11[82] && local59 == 67) {
				if (Static112.aClipboard1 != null) {
					@Pc(140) Transferable local140 = Static112.aClipboard1.getContents(null);
					if (local140 != null) {
						try {
							@Pc(147) String local147 = (String) local140.getTransferData(DataFlavor.stringFlavor);
							if (local147 != null) {
								@Pc(154) String[] local154 = Static183.method3233(local147, '\n');
								if (local154.length <= 1) {
									Static206.aString164 = Static206.aString164 + local147;
								} else {
									for (@Pc(171) int local171 = 0; local171 < local154.length; local171++) {
										Static206.aString164 = local154[local171];
										Static340.method5640();
									}
								}
							}
						} catch (@Pc(190) Exception local190) {
						}
					}
				}
			} else if (local59 == 85 && Static355.anInt6792 > 0) {
				Static206.aString164 = Static206.aString164.substring(0, Static355.anInt6792 - 1) + Static206.aString164.substring(Static355.anInt6792);
				Static355.anInt6792--;
			} else if (local59 == 101 && Static355.anInt6792 < Static206.aString164.length()) {
				Static206.aString164 = Static206.aString164.substring(0, Static355.anInt6792) + Static206.aString164.substring(Static355.anInt6792 + 1);
			} else if (local59 == 96 && Static355.anInt6792 > 0) {
				Static355.anInt6792--;
			} else if (local59 == 97 && Static355.anInt6792 < Static206.aString164.length()) {
				Static355.anInt6792++;
			} else if (local59 == 102) {
				Static355.anInt6792 = 0;
			} else if (local59 == 103) {
				Static355.anInt6792 = Static206.aString164.length();
			} else if (local59 == 104 && Static176.anInt3719 < Static167.aStringArray28.length) {
				Static176.anInt3719++;
				Static46.method932();
				Static355.anInt6792 = Static206.aString164.length();
			} else if (local59 == 105 && Static176.anInt3719 > 0) {
				Static176.anInt3719--;
				Static46.method932();
				Static355.anInt6792 = Static206.aString164.length();
			} else if (Static282.method2953(local64) || local64 == ':' || local64 == ',' || local64 == ' ' || local64 == '_' || local64 == '-' || local64 == '+') {
				Static206.aString164 = Static206.aString164.substring(0, Static355.anInt6792) + (char) Static12.anIntArray9[local53] + Static206.aString164.substring(Static355.anInt6792);
				Static355.anInt6792++;
			}
		}
		Static102.anInt1950 = 0;
		for (local59 = 0; local59 < 100; local59++) {
			@Pc(409) int local409;
			if (Static263.aBooleanArray24[local59]) {
				local409 = Static221.anIntArray435[local59]++;
				if (Static221.anIntArray435[local59] > 102) {
					Static263.aBooleanArray24[local59] = false;
				}
			} else {
				local409 = Static221.anIntArray435[local59]--;
				if (Static221.anIntArray435[local59] < 0) {
					Static238.anIntArray454[local59] = (int) ((double) Static26.anInt476 * Math.random());
					Static184.anIntArray361[local59] = (int) (Math.random() * 350.0D);
					Static221.anIntArray435[local59] = 0;
					Static263.aBooleanArray24[local59] = true;
				}
			}
		}
		Static74.method1295();
	}
}

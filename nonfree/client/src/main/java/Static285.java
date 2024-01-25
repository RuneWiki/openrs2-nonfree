import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
	public static void method5604(@OriginalArg(0) int arg0) {
		if (Static203.anInt3855 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static590.aString106 == null) {
				Static171.method3118(Static278.aString57, Static135.anInt2897, Static174.aString32);
			} else {
				Static132.method2641(Static135.anInt2897);
			}
		}
		if (arg0 != 13 && Static75.aClass241_2 != null) {
			Static75.aClass241_2.method7087();
			Static75.aClass241_2 = null;
		}
		if (arg0 == 3) {
			Static553.method8011(Static332.anInt6370 != Static150.anInt3141);
		}
		if (arg0 == 7) {
			Static465.method7051(Static332.anInt6370 != Static469.anInt8688);
		}
		if (arg0 == 5) {
			if (Static590.aString106 == null) {
				Static192.method3342(Static174.aString32, Static278.aString57);
			} else {
				Static230.method3720();
			}
		} else if (arg0 == 6) {
			if (Static590.aString106 == null) {
				Static171.method3118(Static278.aString57, Static135.anInt2897, Static174.aString32);
			} else {
				Static132.method2641(Static135.anInt2897);
			}
		} else if (arg0 == 9) {
			if (Static590.aString106 == null) {
				Static171.method3118(Static278.aString57, Static135.anInt2897, Static174.aString32);
			} else {
				Static132.method2641(Static135.anInt2897);
			}
		} else if (arg0 == 12) {
			if (Static590.aString106 == null) {
				Static192.method3342(Static174.aString32, Static278.aString57);
			} else {
				Static230.method3720();
			}
		}
		if (Static473.method7114(Static203.anInt3855)) {
			Static93.aClass176_31.anInt4548 = 2;
			Static79.aClass176_28.anInt4548 = 2;
			Static49.aClass176_18.anInt4548 = 2;
			Static157.aClass176_43.anInt4548 = 2;
			Static467.aClass176_114.anInt4548 = 2;
			Static34.aClass176_11.anInt4548 = 2;
			Static586.aClass176_132.anInt4548 = 2;
		}
		if (Static473.method7114(arg0)) {
			Static271.anInt5576 = 1;
			Static177.anInt9181 = 0;
			Static186.anInt3679 = 1;
			Static149.anInt3137 = 0;
			Static318.anInt6250 = 0;
			Static136.method2695(true);
			Static93.aClass176_31.anInt4548 = 1;
			Static79.aClass176_28.anInt4548 = 1;
			Static49.aClass176_18.anInt4548 = 1;
			Static157.aClass176_43.anInt4548 = 1;
			Static467.aClass176_114.anInt4548 = 1;
			Static34.aClass176_11.anInt4548 = 1;
			Static586.aClass176_132.anInt4548 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static29.method368();
		}
		@Pc(235) boolean local235 = arg0 == 2 || Static5.method133(arg0) || Static272.method4728(arg0);
		@Pc(250) boolean local250 = Static203.anInt3855 == 2 || Static5.method133(Static203.anInt3855) || Static272.method4728(Static203.anInt3855);
		if (local250 != local235) {
			if (local235) {
				Static18.anInt281 = Static532.anInt9483;
				if (Static214.aClass4_Sub19_Sub1_1.anInt3068 == 0) {
					Static454.method6875();
				} else {
					Static226.method3714(Static55.aClass176_104, Static532.anInt9483, Static214.aClass4_Sub19_Sub1_1.anInt3068);
					Static115.method2466();
				}
				Static528.aClass329_3.method7760(false);
			} else {
				Static454.method6875();
				Static528.aClass329_3.method7760(true);
			}
		}
		if (Static473.method7114(arg0) || arg0 == 13) {
			Static440.aClass44_12.method4990();
		}
		Static203.anInt3855 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIB)V")
	public static void method5605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class4_Sub14 local6 = Static296.method5096();
		local6.aClass4_Sub11_Sub1_3.method4957(Static367.aClass140_7.anInt3740);
		local6.aClass4_Sub11_Sub1_3.method4957(arg1);
		local6.aClass4_Sub11_Sub1_3.method4957(arg0);
		local6.aClass4_Sub11_Sub1_3.method4937(arg2);
		local6.aClass4_Sub11_Sub1_3.method4937(arg3);
		Static353.method5712(local6);
		Static354.anInt6887 = 1;
		Static254.anInt4666 = 0;
		Static164.anInt3328 = -3;
		Static146.anInt3106 = 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BC)Z")
	public static boolean method5611(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BZIII)V")
	public static void method5612(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static541.anInt9603 == arg3 && arg2 == Static540.anInt5859 && (Static13.anInt231 == Static223.anInt4078 || Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000))) {
			return;
		}
		Static223.anInt4078 = Static13.anInt231;
		Static540.anInt5859 = arg2;
		Static541.anInt9603 = arg3;
		if (Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000)) {
			Static223.anInt4078 = 0;
		}
		method5604(arg1);
		Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, true, Static238.aClass114_9, Static590.aClass364_16.method8334(Static154.anInt3181));
		@Pc(54) int local54 = Static552.anInt9805;
		Static552.anInt9805 = (Static541.anInt9603 - (Static428.anInt8046 >> 4)) * 8;
		@Pc(64) int local64 = Static254.anInt4667;
		Static254.anInt4667 = (Static540.anInt5859 - (Static119.anInt2717 >> 4)) * 8;
		Static383.aClass4_Sub5_Sub8_3 = Static455.method3072(Static541.anInt9603 * 8, Static540.anInt5859 * 8);
		Static71.aClass59_1 = null;
		@Pc(95) int local95 = Static552.anInt9805 - local54;
		@Pc(99) int local99 = Static254.anInt4667 - local64;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(174) int local174;
		@Pc(280) int local280;
		if (arg1 == 11) {
			for (local280 = 0; local280 < Static436.anInt8163; local280++) {
				@Pc(286) Class4_Sub4 local286 = Static457.aClass4_Sub4Array1[local280];
				if (local286 != null) {
					@Pc(291) Class1_Sub4_Sub2_Sub1_Sub1 local291 = local286.aClass1_Sub4_Sub2_Sub1_Sub1_1;
					for (local122 = 0; local122 < 10; local122++) {
						local291.anIntArray463[local122] -= local95;
						local291.anIntArray462[local122] -= local99;
					}
					local291.anInt9934 -= local95 * 512;
					local291.anInt9935 -= local99 * 512;
				}
			}
		} else {
			Static418.anInt7866 = 0;
			@Pc(108) boolean local108 = false;
			@Pc(114) int local114 = (Static428.anInt8046 - 1) * 512;
			local120 = (Static119.anInt2717 - 1) * 512;
			for (local122 = 0; local122 < Static436.anInt8163; local122++) {
				@Pc(128) Class4_Sub4 local128 = Static457.aClass4_Sub4Array1[local122];
				if (local128 != null) {
					@Pc(133) Class1_Sub4_Sub2_Sub1_Sub1 local133 = local128.aClass1_Sub4_Sub2_Sub1_Sub1_1;
					local133.anInt9934 -= local95 * 512;
					local133.anInt9935 -= local99 * 512;
					if (local133.anInt9934 >= 0 && local114 >= local133.anInt9934 && local133.anInt9935 >= 0 && local120 >= local133.anInt9935) {
						@Pc(172) boolean local172 = true;
						for (local174 = 0; local174 < 10; local174++) {
							local133.anIntArray463[local174] -= local95;
							local133.anIntArray462[local174] -= local99;
							if (local133.anIntArray463[local174] < 0 || local133.anIntArray463[local174] >= Static428.anInt8046 || local133.anIntArray462[local174] < 0 || local133.anIntArray462[local174] >= Static119.anInt2717) {
								local172 = false;
							}
						}
						if (local172) {
							Static43.anIntArray23[Static418.anInt7866++] = local133.anInt8435;
						} else {
							local133.method4510(null);
							local128.method8379();
							local108 = true;
						}
					} else {
						local133.method4510(null);
						local108 = true;
						local128.method8379();
					}
				}
			}
			if (local108) {
				Static436.anInt8163 = Static585.aClass350_41.method8202();
				Static585.aClass350_41.method8204(Static457.aClass4_Sub4Array1);
			}
		}
		for (local280 = 0; local280 < 2048; local280++) {
			@Pc(349) Class1_Sub4_Sub2_Sub1_Sub2 local349 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local280];
			if (local349 != null) {
				for (local120 = 0; local120 < 10; local120++) {
					local349.anIntArray463[local120] -= local95;
					local349.anIntArray462[local120] -= local99;
				}
				local349.anInt9935 -= local99 * 512;
				local349.anInt9934 -= local95 * 512;
			}
		}
		@Pc(401) Class366[] local401 = Static532.aClass366Array1;
		for (local120 = 0; local120 < local401.length; local120++) {
			@Pc(409) Class366 local409 = local401[local120];
			if (local409 != null) {
				local409.anInt10233 -= local99 * 512;
				local409.anInt10231 -= local95 * 512;
			}
		}
		for (@Pc(441) Class4_Sub51 local441 = (Class4_Sub51) Static377.aClass244_51.method5963(); local441 != null; local441 = (Class4_Sub51) Static377.aClass244_51.method5965()) {
			local441.anInt10261 -= local99;
			local441.anInt10248 -= local95;
			if (Static358.anInt6981 != 4 && (local441.anInt10248 < 0 || local441.anInt10261 < 0 || Static428.anInt8046 <= local441.anInt10248 || Static119.anInt2717 <= local441.anInt10261)) {
				local441.method8379();
			}
		}
		if (Static358.anInt6981 != 4) {
			for (@Pc(500) Class4_Sub13 local500 = (Class4_Sub13) Static251.aClass350_19.method8198(); local500 != null; local500 = (Class4_Sub13) Static251.aClass350_19.method8205()) {
				@Pc(508) int local508 = (int) (local500.aLong268 & 0x3FFFL);
				@Pc(513) int local513 = local508 - Static552.anInt9805;
				local174 = (int) (local500.aLong268 >> 14 & 0x3FFFL);
				@Pc(526) int local526 = local174 - Static254.anInt4667;
				if (local513 < 0 || local526 < 0 || local513 >= Static428.anInt8046 || Static119.anInt2717 <= local526) {
					local500.method8379();
				}
			}
		}
		if (Static582.anInt10107 != 0) {
			Static582.anInt10107 -= local95;
			Static8.anInt182 -= local99;
		}
		Static268.method4511();
		if (arg1 != 11) {
			Static24.anInt387 -= local95 * 512;
			Static58.anInt969 -= local99;
			Static428.anInt8060 -= local95;
			Static465.anInt8650 -= local95;
			Static293.anInt5938 -= local99;
			Static110.anInt2624 -= local99 * 512;
			if (Math.abs(local95) > Static428.anInt8046 || Math.abs(local99) > Static119.anInt2717) {
				Static214.method3551();
			}
		} else if (Static166.anInt3419 == 4) {
			Static60.anInt983 -= local95 * 512;
			Static557.anInt1156 -= local99 * 512;
			Static413.anInt8208 -= local95 * 512;
			Static339.anInt6576 -= local99 * 512;
		} else {
			Static166.anInt3419 = 1;
			Static214.anInt3969 = -1;
			Static326.anInt6302 = -1;
		}
		Static428.method6709();
		Static37.method484();
		Static584.aClass244_62.method5962();
		Static212.aClass244_30.method5962();
		Static451.aClass136_7.method3290();
		Static429.method6717();
	}
}

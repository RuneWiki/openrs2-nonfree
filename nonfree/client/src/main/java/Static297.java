import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public static int anInt5914;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
	public static int anInt5910 = 0;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public static int anInt5912 = 0;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method4538() {
		@Pc(7) int local7 = Static69.anInt1438;
		@Pc(9) int local9 = Static146.anInt4438;
		@Pc(17) int local17 = Static163.anInt3557 - Static38.anInt950 - local7;
		@Pc(27) int local27 = Static7.anInt207 - Static270.anInt5412 - local9;
		if (local7 <= 0 && local17 <= 0 && local9 <= 0 && local27 <= 0) {
			return;
		}
		try {
			@Pc(54) Container local54;
			if (Static229.aFrame1 != null) {
				local54 = Static229.aFrame1;
			} else if (Static280.aFrame2 == null) {
				local54 = Static142.aClass112_2.anApplet1;
			} else {
				local54 = Static280.aFrame2;
			}
			@Pc(65) int local65 = 0;
			@Pc(67) int local67 = 0;
			if (local54 == Static280.aFrame2) {
				@Pc(74) Insets local74 = Static280.aFrame2.getInsets();
				local67 = local74.top;
				local65 = local74.left;
			}
			@Pc(83) Graphics local83 = local54.getGraphics();
			local83.setColor(Color.black);
			if (local7 > 0) {
				local83.fillRect(local65, local67, local7, Static7.anInt207);
			}
			if (local9 > 0) {
				local83.fillRect(local65, local67, Static163.anInt3557, local9);
			}
			if (local17 > 0) {
				local83.fillRect(Static163.anInt3557 + local65 - local17, local67, local17, Static7.anInt207);
			}
			if (local27 > 0) {
				local83.fillRect(local65, Static7.anInt207 + local67 - local27, Static163.anInt3557, local27);
			}
		} catch (@Pc(136) Exception local136) {
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public static void method4540(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = Static58.anInt1269;
		@Pc(7) int local7 = Static315.anInt6297;
		@Pc(9) int local9 = Static94.anInt2161;
		@Pc(11) int local11 = Static44.anInt1071;
		@Pc(13) int local13 = Static120.anInt6251;
		@Pc(21) int local21 = (int) Static62.aFloat16 + Static206.anInt4452 & 0x7FF;
		@Pc(24) int local24 = (int) Static27.aFloat44;
		if (local24 < Static115.anInt2485 / 256) {
			local24 = Static115.anInt2485 / 256;
		}
		if (Static103.aBooleanArray18[4] && Static225.anIntArray441[4] + 128 > local24) {
			local24 = Static225.anIntArray441[4] + 128;
		}
		Static83.method1429(local24, arg0, Static28.anInt741, Static93.method1576(Static56.aClass2_Sub4_Sub2_1.anInt2794, Static56.aClass2_Sub4_Sub2_1.anInt2846, Static185.anInt4085) - 50, local24 * 3 + 600, Static315.anInt6303, local21);
		if (local1 == Static58.anInt1269 && Static315.anInt6297 == local7 && local9 == Static94.anInt2161 && local11 == Static44.anInt1071 && Static120.anInt6251 == local13) {
			Static106.anInt2378 = 1;
			return;
		}
		Static121.anInt2627 = 10;
		Static211.anInt4570 = 10;
		Static130.anInt2879 = 10;
		@Pc(114) int local114 = Static120.anInt6251 - local13;
		if (local9 < Static94.anInt2161) {
			local9 += Static211.anInt4570 * (Static94.anInt2161 - local9) / 1000 + Static130.anInt2879;
			if (Static94.anInt2161 > local9) {
				Static94.anInt2161 = local9;
			}
		}
		Static186.anInt4094 = 10;
		if (local114 > 1024) {
			local114 -= 2048;
		}
		if (local7 < Static315.anInt6297) {
			local7 += Static130.anInt2879 + Static211.anInt4570 * (Static315.anInt6297 - local7) / 1000;
			if (Static315.anInt6297 > local7) {
				Static315.anInt6297 = local7;
			}
		}
		if (local7 > Static315.anInt6297) {
			local7 -= Static211.anInt4570 * (local7 - Static315.anInt6297) / 1000 + Static130.anInt2879;
			if (Static315.anInt6297 < local7) {
				Static315.anInt6297 = local7;
			}
		}
		if (Static44.anInt1071 > local11) {
			local11 += Static121.anInt2627 * (Static44.anInt1071 - local11) / 1000 + Static186.anInt4094;
			if (local11 < Static44.anInt1071) {
				Static44.anInt1071 = local11;
			}
		}
		if (Static44.anInt1071 < local11) {
			local11 -= Static186.anInt4094 + Static121.anInt2627 * (local11 - Static44.anInt1071) / 1000;
			if (Static44.anInt1071 < local11) {
				Static44.anInt1071 = local11;
			}
		}
		if (Static94.anInt2161 < local9) {
			local9 -= (local9 - Static94.anInt2161) * Static211.anInt4570 / 1000 + Static130.anInt2879;
			if (local9 > Static94.anInt2161) {
				Static94.anInt2161 = local9;
			}
		}
		if (local114 < -1024) {
			local114 += 2048;
		}
		if (local114 > 0) {
			local13 += local114 * Static121.anInt2627 / 1000 + Static186.anInt4094;
			local13 &= 0x7FF;
		}
		if (local114 < 0) {
			local13 -= Static186.anInt4094 + Static121.anInt2627 * -local114 / 1000;
			local13 &= 0x7FF;
		}
		if (Static58.anInt1269 > local1) {
			local1 += Static211.anInt4570 * (Static58.anInt1269 - local1) / 1000 + Static130.anInt2879;
			if (Static58.anInt1269 > local1) {
				Static58.anInt1269 = local1;
			}
		}
		if (local1 > Static58.anInt1269) {
			local1 -= (local1 - Static58.anInt1269) * Static211.anInt4570 / 1000 + Static130.anInt2879;
			if (Static58.anInt1269 < local1) {
				Static58.anInt1269 = local1;
			}
		}
		@Pc(383) int local383 = Static120.anInt6251 - local13;
		if (local383 > 1024) {
			local383 -= 2048;
		}
		if (local383 < -1024) {
			local383 += 2048;
		}
		if (local383 >= 0 || local114 <= 0 || local383 > 0 && local114 < 0) {
			Static120.anInt6251 = local13;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)I")
	public static int method4541(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public static void method4542() {
		Static14.anInt379 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static13.anInt357; local3++) {
			@Pc(10) Class9 local10 = Static41.aClass9Array1[local3];
			@Pc(14) int local14;
			if (Static47.anIntArray141 != null) {
				for (local14 = 0; local14 < Static47.anIntArray141.length; local14++) {
					if (Static47.anIntArray141[local14] != -1000000 && (local10.anInt289 <= Static47.anIntArray141[local14] || local10.anInt282 <= Static47.anIntArray141[local14]) && (local10.anInt292 <= Static24.anIntArray56[local14] || local10.anInt278 <= Static24.anIntArray56[local14]) && (local10.anInt292 >= Static149.anIntArray310[local14] || local10.anInt278 >= Static149.anIntArray310[local14]) && (local10.anInt287 <= Static99.anIntArray221[local14] || local10.anInt277 <= Static99.anIntArray221[local14]) && (local10.anInt287 >= Static211.anIntArray410[local14] || local10.anInt277 >= Static211.anIntArray410[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt295 == 1) {
				local14 = local10.anInt291 + Static145.anInt6062 - Static101.anInt152;
				if (local14 >= 0 && local14 <= Static145.anInt6062 + Static145.anInt6062) {
					local115 = local10.anInt280 + Static145.anInt6062 - Static245.anInt5022;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt299 + Static145.anInt6062 - Static245.anInt5022;
					if (local126 > Static145.anInt6062 + Static145.anInt6062) {
						local126 = Static145.anInt6062 + Static145.anInt6062;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static166.aBooleanArrayArray3[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static215.anInt4665 - local10.anInt292;
						if (local158 > 32) {
							local10.anInt297 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt297 = 2;
							local158 = -local158;
						}
						local10.anInt294 = (local10.anInt287 - Static2.anInt53 << 8) / local158;
						local10.anInt296 = (local10.anInt277 - Static2.anInt53 << 8) / local158;
						local10.anInt284 = (local10.anInt289 - Static296.anInt5905 << 8) / local158;
						local10.anInt293 = (local10.anInt282 - Static296.anInt5905 << 8) / local158;
						Static80.aClass9Array2[Static14.anInt379++] = local10;
					}
				}
			} else if (local10.anInt295 == 2) {
				local14 = local10.anInt280 + Static145.anInt6062 - Static245.anInt5022;
				if (local14 >= 0 && local14 <= Static145.anInt6062 + Static145.anInt6062) {
					local115 = local10.anInt291 + Static145.anInt6062 - Static101.anInt152;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt288 + Static145.anInt6062 - Static101.anInt152;
					if (local126 > Static145.anInt6062 + Static145.anInt6062) {
						local126 = Static145.anInt6062 + Static145.anInt6062;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static166.aBooleanArrayArray3[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static2.anInt53 - local10.anInt287;
						if (local158 > 32) {
							local10.anInt297 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt297 = 4;
							local158 = -local158;
						}
						local10.anInt290 = (local10.anInt292 - Static215.anInt4665 << 8) / local158;
						local10.anInt281 = (local10.anInt278 - Static215.anInt4665 << 8) / local158;
						local10.anInt284 = (local10.anInt289 - Static296.anInt5905 << 8) / local158;
						local10.anInt293 = (local10.anInt282 - Static296.anInt5905 << 8) / local158;
						Static80.aClass9Array2[Static14.anInt379++] = local10;
					}
				}
			} else if (local10.anInt295 == 4) {
				local14 = local10.anInt289 - Static296.anInt5905;
				if (local14 > 128) {
					local115 = local10.anInt280 + Static145.anInt6062 - Static245.anInt5022;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt299 + Static145.anInt6062 - Static245.anInt5022;
					if (local126 > Static145.anInt6062 + Static145.anInt6062) {
						local126 = Static145.anInt6062 + Static145.anInt6062;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt291 + Static145.anInt6062 - Static101.anInt152;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt288 + Static145.anInt6062 - Static101.anInt152;
						if (local158 > Static145.anInt6062 + Static145.anInt6062) {
							local158 = Static145.anInt6062 + Static145.anInt6062;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static166.aBooleanArrayArray3[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt297 = 5;
							local10.anInt290 = (local10.anInt292 - Static215.anInt4665 << 8) / local14;
							local10.anInt281 = (local10.anInt278 - Static215.anInt4665 << 8) / local14;
							local10.anInt294 = (local10.anInt287 - Static2.anInt53 << 8) / local14;
							local10.anInt296 = (local10.anInt277 - Static2.anInt53 << 8) / local14;
							Static80.aClass9Array2[Static14.anInt379++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)Lclient!jf;")
	public static Class87 method4543(@OriginalArg(1) int arg0) {
		@Pc(15) Class87 local15 = (Class87) Static10.aClass89_2.method2268((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(26) byte[] local26 = Static41.aClass168_33.method4058(arg0, 30);
		local15 = new Class87();
		if (local26 != null) {
			local15.method2054(new Class1_Sub14(local26), arg0);
		}
		Static10.aClass89_2.method2272((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IB)I")
	public static int method4544(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(CZ)Z")
	public static boolean method4545(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static214.method3431(arg0)) {
			return true;
		} else {
			@Pc(22) char[] local22 = Static234.aCharArray6;
			@Pc(24) int local24;
			@Pc(36) char local36;
			for (local24 = 0; local24 < local22.length; local24++) {
				local36 = local22[local24];
				if (arg0 == local36) {
					return true;
				}
			}
			local22 = Static3.aCharArray1;
			for (local24 = 0; local24 < local22.length; local24++) {
				local36 = local22[local24];
				if (local36 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}

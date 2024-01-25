import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!la;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Lclient!s;")
	public static final Class217 aClass217_48 = new Class217(95, -2);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z")
	public static boolean method1920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static98.anInt2009; local1++) {
			@Pc(6) Class81 local6 = Static44.aClass81Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2394 == 1) {
				local15 = local6.anInt2393 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2385 + (local6.anInt2399 * local15 >> 8);
					local37 = local6.anInt2384 + (local6.anInt2395 * local15 >> 8);
					local47 = local6.anInt2397 + (local6.anInt2392 * local15 >> 8);
					local57 = local6.anInt2403 + (local6.anInt2400 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2394 == 2) {
				local15 = arg0 - local6.anInt2393;
				if (local15 > 0) {
					local27 = local6.anInt2385 + (local6.anInt2399 * local15 >> 8);
					local37 = local6.anInt2384 + (local6.anInt2395 * local15 >> 8);
					local47 = local6.anInt2397 + (local6.anInt2392 * local15 >> 8);
					local57 = local6.anInt2403 + (local6.anInt2400 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2394 == 3) {
				local15 = local6.anInt2385 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2393 + (local6.anInt2404 * local15 >> 8);
					local37 = local6.anInt2386 + (local6.anInt2396 * local15 >> 8);
					local47 = local6.anInt2397 + (local6.anInt2392 * local15 >> 8);
					local57 = local6.anInt2403 + (local6.anInt2400 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2394 == 4) {
				local15 = arg2 - local6.anInt2385;
				if (local15 > 0) {
					local27 = local6.anInt2393 + (local6.anInt2404 * local15 >> 8);
					local37 = local6.anInt2386 + (local6.anInt2396 * local15 >> 8);
					local47 = local6.anInt2397 + (local6.anInt2392 * local15 >> 8);
					local57 = local6.anInt2403 + (local6.anInt2400 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2394 == 5) {
				local15 = arg1 - local6.anInt2397;
				if (local15 > 0) {
					local27 = local6.anInt2393 + (local6.anInt2404 * local15 >> 8);
					local37 = local6.anInt2386 + (local6.anInt2396 * local15 >> 8);
					local47 = local6.anInt2385 + (local6.anInt2399 * local15 >> 8);
					local57 = local6.anInt2384 + (local6.anInt2395 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg4 && arg8 == arg3 && arg1 == arg5 && arg7 == arg0) {
			Static145.method2443(arg4, arg1, arg8, arg0, arg2);
			return;
		}
		@Pc(36) int local36 = arg4;
		@Pc(38) int local38 = arg8;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg8 * 3;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(71) int local71 = local50 + arg1 - arg4 - local58;
		@Pc(81) int local81 = local54 + arg0 - arg8 - local62;
		@Pc(91) int local91 = local58 + local42 - local50 - local50;
		@Pc(102) int local102 = local62 + local46 - local54 - local54;
		@Pc(107) int local107 = local50 - local42;
		@Pc(112) int local112 = local54 - local46;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local122 * local114 >> 12;
			@Pc(132) int local132 = local128 * local71;
			@Pc(136) int local136 = local81 * local128;
			@Pc(140) int local140 = local122 * local91;
			@Pc(144) int local144 = local102 * local122;
			@Pc(148) int local148 = local107 * local114;
			@Pc(152) int local152 = local114 * local112;
			@Pc(162) int local162 = arg4 + (local148 + local132 + local140 >> 12);
			@Pc(172) int local172 = arg8 + (local152 + local144 + local136 >> 12);
			Static145.method2443(local36, local162, local38, local172, arg2);
			local36 = local162;
			local38 = local172;
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
	public static void method1926() {
		Static273.anInt4772 = Static203.aClass10_Sub8_Sub2_1.method2502();
		@Pc(15) int local15 = Static203.aClass10_Sub8_Sub2_1.method2502();
		@Pc(19) int local19 = Static203.aClass10_Sub8_Sub2_1.method2485();
		@Pc(28) boolean local28 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
		@Pc(32) int local32 = Static203.aClass10_Sub8_Sub2_1.method2520();
		Static210.method281();
		Static168.method2797(local15);
		Static203.aClass10_Sub8_Sub2_1.method2532();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static2.anInt7 >> 3; local48++) {
				for (local52 = 0; local52 < Static17.anInt315 >> 3; local52++) {
					local59 = Static203.aClass10_Sub8_Sub2_1.method2525(1);
					if (local59 == 1) {
						Static32.anIntArrayArrayArray1[local44][local48][local52] = Static203.aClass10_Sub8_Sub2_1.method2525(26);
					} else {
						Static32.anIntArrayArrayArray1[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static203.aClass10_Sub8_Sub2_1.method2528();
		local48 = (Static10.anInt154 - Static203.aClass10_Sub8_Sub2_1.anInt2989) / 16;
		Static372.anIntArrayArray59 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static372.anIntArrayArray59[local52][local59] = Static203.aClass10_Sub8_Sub2_1.method2459();
			}
		}
		Static378.aByteArrayArray44 = new byte[local48][];
		Static226.anIntArray421 = new int[local48];
		Static236.aByteArrayArray31 = new byte[local48][];
		Static148.aByteArrayArray21 = new byte[local48][];
		Static384.anIntArray636 = new int[local48];
		Static164.aByteArrayArray27 = null;
		Static144.anIntArray288 = new int[local48];
		Static49.anIntArray72 = new int[local48];
		Static195.anIntArray390 = new int[local48];
		Static86.aByteArrayArray13 = new byte[local48][];
		Static222.anIntArray416 = null;
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(198) int local198 = 0; local198 < Static2.anInt7 >> 3; local198++) {
				for (@Pc(202) int local202 = 0; local202 < Static17.anInt315 >> 3; local202++) {
					@Pc(212) int local212 = Static32.anIntArrayArrayArray1[local59][local198][local202];
					if (local212 != -1) {
						@Pc(222) int local222 = local212 >> 14 & 0x3FF;
						@Pc(228) int local228 = local212 >> 3 & 0x7FF;
						@Pc(239) int local239 = (local222 / 8 << 8) + (local228 / 8);
						for (@Pc(241) int local241 = 0; local241 < local48; local241++) {
							if (Static144.anIntArray288[local241] == local239) {
								local239 = -1;
								break;
							}
						}
						if (local239 != -1) {
							Static144.anIntArray288[local48] = local239;
							@Pc(273) int local273 = local239 >> 8 & 0xFF;
							@Pc(277) int local277 = local239 & 0xFF;
							Static195.anIntArray390[local48] = Static77.aClass187_32.method4278("m" + local273 + "_" + local277);
							Static384.anIntArray636[local48] = Static77.aClass187_32.method4278("l" + local273 + "_" + local277);
							Static49.anIntArray72[local48] = Static77.aClass187_32.method4278("um" + local273 + "_" + local277);
							Static226.anIntArray421[local48] = Static77.aClass187_32.method4278("ul" + local273 + "_" + local277);
							local48++;
						}
					}
				}
			}
		}
		Static344.method4660(local28, 10, local32, local19);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1927(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static163.aCharArray1[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
	public static int anInt1653;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_9;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!ic;")
	private static Class34 aClass34_774 = Static56.method816("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_773 = aClass34_774;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt1640 = 127;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Lclient!wd;")
	private static Class8_Sub20 aClass8_Sub20_23 = new Class8_Sub20(8);

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	public static int anInt1664 = 0;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
	public static int anInt1665 = 0;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "Lclient!ic;")
	public static Class34 aClass34_775 = Static56.method816("Texturen geladen)3");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method1012() {
		if (!Static32.aBoolean41) {
			return;
		}
		@Pc(11) Class8_Sub24 local11 = Static69.method1044(Static2.anInt29, Static125.anInt3001);
		if (local11 != null && local11.anObjectArray6 != null) {
			@Pc(20) Class8_Sub19 local20 = new Class8_Sub19();
			local20.anObjectArray3 = local11.anObjectArray6;
			local20.aClass8_Sub24_13 = local11;
			Static106.method1497(local20);
		}
		Static32.aBoolean41 = false;
		Static40.method608(local11);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1013() {
		Static91.anImage1 = null;
		Static39.aFontMetrics1 = null;
		Static119.aFont1 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!jf;I)V")
	public static void method1018(@OriginalArg(0) Class8_Sub1_Sub1_Sub4 arg0) {
		arg0.anInt2020 = 0;
		@Pc(7) int local7 = arg0.anInt2026 - Static21.anInt655;
		if (arg0.anInt2017 == 0) {
			arg0.anInt2022 = 1024;
		}
		@Pc(28) int local28 = arg0.anInt2058 * 128 + arg0.anInt2030 * 64;
		if (arg0.anInt2017 == 1) {
			arg0.anInt2022 = 1536;
		}
		@Pc(45) int local45 = arg0.anInt2030 * 64 + arg0.anInt2061 * 128;
		if (arg0.anInt2017 == 2) {
			arg0.anInt2022 = 0;
		}
		arg0.anInt2059 += (local45 - arg0.anInt2059) / local7;
		if (arg0.anInt2017 == 3) {
			arg0.anInt2022 = 512;
		}
		arg0.anInt2043 += (local28 - arg0.anInt2043) / local7;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!pc;B)V")
	public static void method1020(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static115.aBoolean104) {
			Static13.method227(arg0);
			return;
		}
		if (Static39.anInt964 == 1 && Static3.anInt51 >= 715 && Static74.anInt1781 >= 453) {
			Static83.aBoolean79 = !Static83.aBoolean79;
			if (Static83.aBoolean79) {
				Static92.method1327();
			} else {
				Static16.method244(Static83.aClass34_940, Static83.aClass34_929, aClass14_Sub1_9);
			}
		}
		if (Static61.anInt1587 == 5) {
			return;
		}
		Static61.anInt1586++;
		if (Static61.anInt1587 != 10) {
			return;
		}
		if (Static49.anInt1314 != 2 && Static115.anInt2594 == 0) {
			if (Static39.anInt964 == 1 && Static3.anInt51 >= 5 && Static3.anInt51 <= 105 && Static74.anInt1781 >= 463 && Static74.anInt1781 <= 498) {
				Static6.method42();
				return;
			}
			if (Static51.aClass31_1 != null) {
				Static6.method42();
			}
		}
		@Pc(110) int local110 = Static3.anInt51;
		@Pc(118) int local118 = Static74.anInt1781;
		@Pc(120) int local120 = Static39.anInt964;
		if (Static14.anInt359 == 0) {
			@Pc(503) boolean local503 = false;
			if (local120 == 1 && local110 >= 227 && local110 <= 377 && local118 >= 271 && local118 <= 311) {
				Static113.anInt2575 = 0;
				Static14.anInt359 = 3;
			}
			if (Static88.anInt2341 != 0) {
				while (Static80.method1168()) {
					if (Static21.anInt656 == 84) {
						local503 = true;
						break;
					}
				}
			}
			if (local503 || local120 == 1 && local110 >= 387 && local110 <= 537 && local118 >= 271 && local118 <= 311) {
				Static83.aClass34_943 = Static29.aClass34_443;
				Static83.aClass34_942 = Static29.aClass34_431;
				Static113.anInt2575 = 0;
				Static83.aClass34_933 = Static130.aClass34_1412;
				Static14.anInt359 = 2;
			}
		} else if (Static14.anInt359 == 2) {
			@Pc(166) short local166 = 231;
			@Pc(171) int local171 = local166 + 30;
			if (local120 == 1 && local118 >= 246 && local118 < 261) {
				Static113.anInt2575 = 0;
			}
			local171 += 15;
			if (local120 == 1 && local118 >= 261 && local118 < 276) {
				Static113.anInt2575 = 1;
			}
			local171 += 15;
			if (local120 == 1 && local110 >= 227 && local110 <= 377 && local118 >= 301 && local118 <= 341) {
				Static83.aClass34_941 = Static83.aClass34_941.method831().method842();
				if (Static83.aClass34_941.method820() == 0) {
					Static74.method1091(Static29.aClass34_415, Static29.aClass34_446, Static17.aClass34_247);
				} else if (Static83.aClass34_936.method820() == 0) {
					Static74.method1091(Static29.aClass34_428, Static29.aClass34_440, Static111.aClass34_1395);
				} else {
					Static74.method1091(Static29.aClass34_411, Static29.aClass34_434, Static82.aClass34_894);
					Static82.method1201(20);
				}
			} else {
				if (local120 == 1 && local110 >= 387 && local110 <= 537 && local118 >= 301 && local118 <= 341) {
					Static83.aClass34_941 = Static83.aClass34_940;
					Static14.anInt359 = 0;
					Static83.aClass34_936 = Static83.aClass34_940;
				}
				while (true) {
					while (Static80.method1168()) {
						@Pc(325) boolean local325 = false;
						for (@Pc(327) int local327 = 0; Static112.aClass34_1178.method820() > local327; local327++) {
							if (Static103.anInt2375 == Static112.aClass34_1178.method808(local327)) {
								local325 = true;
								break;
							}
						}
						if (Static113.anInt2575 == 0) {
							if (Static21.anInt656 == 85 && Static83.aClass34_941.method820() > 0) {
								Static83.aClass34_941 = Static83.aClass34_941.method810(Static83.aClass34_941.method820() - 1, 0);
							}
							if (Static21.anInt656 == 84 || Static21.anInt656 == 80) {
								Static113.anInt2575 = 1;
							}
							if (local325 && Static83.aClass34_941.method820() < 12) {
								Static83.aClass34_941 = Static83.aClass34_941.method803(Static103.anInt2375);
							}
						} else if (Static113.anInt2575 == 1) {
							if (Static21.anInt656 == 85 && Static83.aClass34_936.method820() > 0) {
								Static83.aClass34_936 = Static83.aClass34_936.method810(Static83.aClass34_936.method820() - 1, 0);
							}
							if (Static21.anInt656 == 84 || Static21.anInt656 == 80) {
								Static113.anInt2575 = 0;
							}
							if (Static88.anInt2341 != 0 && Static21.anInt656 == 84) {
								Static83.aClass34_941 = Static83.aClass34_941.method831().method842();
								if (Static83.aClass34_941.method820() == 0) {
									Static74.method1091(Static29.aClass34_415, Static29.aClass34_446, Static17.aClass34_247);
									return;
								}
								if (Static83.aClass34_936.method820() == 0) {
									Static74.method1091(Static29.aClass34_428, Static29.aClass34_440, Static111.aClass34_1395);
									return;
								}
								Static74.method1091(Static29.aClass34_411, Static29.aClass34_434, Static82.aClass34_894);
								Static82.method1201(20);
								return;
							}
							if (local325 && Static83.aClass34_936.method820() < 20) {
								Static83.aClass34_936 = Static83.aClass34_936.method803(Static103.anInt2375);
							}
						}
					}
					return;
				}
			}
		} else if (Static14.anInt359 == 3 && local120 == 1 && local110 >= 307 && local110 <= 457 && local118 >= 301 && local118 <= 341) {
			Static14.anInt359 = 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Z")
	public static boolean method1022() {
		@Pc(4) long local4 = Static27.method497();
		@Pc(14) int local14 = (int) (local4 - Static94.aLong75);
		if (local14 > 200) {
			local14 = 200;
		}
		Static38.anInt940 += local14;
		Static94.aLong75 = local4;
		if (Static5.anInt71 == 0 && Static4.anInt63 == 0 && Static74.anInt1786 == 0 && Static42.anInt1029 == 0) {
			return true;
		} else if (Static90.aClass25_2 == null) {
			return false;
		} else {
			try {
				if (Static38.anInt940 > 30000) {
					throw new IOException();
				}
				@Pc(67) Class8_Sub1_Sub8 local67;
				@Pc(72) Class8_Sub20 local72;
				while (Static4.anInt63 < 20 && Static42.anInt1029 > 0) {
					local67 = (Class8_Sub1_Sub8) Static80.aClass7_13.method47();
					local72 = new Class8_Sub20(4);
					local72.method1883(1);
					local72.method1887((int) local67.aLong102);
					Static90.aClass25_2.method586(4, local72.aByteArray44);
					Static20.aClass7_1.method48(local67, local67.aLong102);
					Static4.anInt63++;
					Static42.anInt1029--;
				}
				while (Static5.anInt71 < 20 && Static74.anInt1786 > 0) {
					local67 = (Class8_Sub1_Sub8) Static78.aClass60_2.method1351();
					local72 = new Class8_Sub20(4);
					local72.method1883(0);
					local72.method1887((int) local67.aLong102);
					Static90.aClass25_2.method586(4, local72.aByteArray44);
					local67.method1952();
					Static31.aClass7_2.method48(local67, local67.aLong102);
					Static74.anInt1786--;
					Static5.anInt71++;
				}
				for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
					@Pc(174) int local174 = Static90.aClass25_2.method585();
					if (local174 < 0) {
						throw new IOException();
					}
					if (local174 == 0) {
						break;
					}
					Static38.anInt940 = 0;
					@Pc(189) byte local189 = 0;
					if (Static62.aClass8_Sub1_Sub8_1 == null) {
						local189 = 8;
					} else if (Static8.anInt174 == 0) {
						local189 = 1;
					}
					@Pc(209) int local209;
					@Pc(226) int local226;
					@Pc(276) int local276;
					@Pc(291) int local291;
					if (local189 > 0) {
						local209 = local189 - aClass8_Sub20_23.anInt2853;
						if (local209 > local174) {
							local209 = local174;
						}
						Static90.aClass25_2.method589(aClass8_Sub20_23.anInt2853, local209, aClass8_Sub20_23.aByteArray44);
						if (Static116.aByte8 != 0) {
							for (local226 = 0; local226 < local209; local226++) {
								aClass8_Sub20_23.aByteArray44[local226 + aClass8_Sub20_23.anInt2853] ^= Static116.aByte8;
							}
						}
						aClass8_Sub20_23.anInt2853 += local209;
						if (aClass8_Sub20_23.anInt2853 < local189) {
							break;
						}
						if (Static62.aClass8_Sub1_Sub8_1 == null) {
							aClass8_Sub20_23.anInt2853 = 0;
							local226 = aClass8_Sub20_23.method1872();
							local276 = aClass8_Sub20_23.method1839();
							@Pc(283) long local283 = (long) ((local226 << 16) + local276);
							@Pc(287) int local287 = aClass8_Sub20_23.method1872();
							local291 = aClass8_Sub20_23.method1853();
							@Pc(297) Class8_Sub1_Sub8 local297 = (Class8_Sub1_Sub8) Static20.aClass7_1.method45(local283);
							Static124.aBoolean110 = true;
							if (local297 == null) {
								local297 = (Class8_Sub1_Sub8) Static31.aClass7_2.method45(local283);
								Static124.aBoolean110 = false;
							}
							if (local297 == null) {
								throw new IOException();
							}
							Static62.aClass8_Sub1_Sub8_1 = local297;
							@Pc(326) int local326 = local287 == 0 ? 5 : 9;
							Static48.aClass8_Sub20_36 = new Class8_Sub20(Static62.aClass8_Sub1_Sub8_1.aByte2 + local291 + local326);
							Static48.aClass8_Sub20_36.method1883(local287);
							Static48.aClass8_Sub20_36.method1873(local291);
							aClass8_Sub20_23.anInt2853 = 0;
							Static8.anInt174 = 8;
						} else if (Static8.anInt174 == 0) {
							if (aClass8_Sub20_23.aByteArray44[0] == -1) {
								Static8.anInt174 = 1;
								aClass8_Sub20_23.anInt2853 = 0;
							} else {
								Static62.aClass8_Sub1_Sub8_1 = null;
							}
						}
					} else {
						local209 = Static48.aClass8_Sub20_36.aByteArray44.length - Static62.aClass8_Sub1_Sub8_1.aByte2;
						local226 = 512 - Static8.anInt174;
						if (local209 - Static48.aClass8_Sub20_36.anInt2853 < local226) {
							local226 = local209 - Static48.aClass8_Sub20_36.anInt2853;
						}
						if (local174 < local226) {
							local226 = local174;
						}
						Static90.aClass25_2.method589(Static48.aClass8_Sub20_36.anInt2853, local226, Static48.aClass8_Sub20_36.aByteArray44);
						if (Static116.aByte8 != 0) {
							for (local276 = 0; local276 < local226; local276++) {
								Static48.aClass8_Sub20_36.aByteArray44[Static48.aClass8_Sub20_36.anInt2853 + local276] ^= Static116.aByte8;
							}
						}
						Static48.aClass8_Sub20_36.anInt2853 += local226;
						Static8.anInt174 += local226;
						if (local209 == Static48.aClass8_Sub20_36.anInt2853) {
							if (Static62.aClass8_Sub1_Sub8_1.aLong102 == 16711935L) {
								Static73.aClass8_Sub20_25 = Static48.aClass8_Sub20_36;
								for (local276 = 0; local276 < 256; local276++) {
									@Pc(560) Class14_Sub1 local560 = Static91.aClass14_Sub1Array1[local276];
									if (local560 != null) {
										Static73.aClass8_Sub20_25.anInt2853 = local276 * 8 + 5;
										local291 = Static73.aClass8_Sub20_25.method1853();
										@Pc(577) int local577 = Static73.aClass8_Sub20_25.method1853();
										local560.method1175(local291, local577);
									}
								}
							} else {
								Static100.aCRC32_2.reset();
								Static100.aCRC32_2.update(Static48.aClass8_Sub20_36.aByteArray44, 0, local209);
								local276 = (int) Static100.aCRC32_2.getValue();
								if (local276 != Static62.aClass8_Sub1_Sub8_1.anInt895) {
									try {
										Static90.aClass25_2.method588();
									} catch (@Pc(506) Exception local506) {
									}
									Static116.aByte8 = (byte) (Math.random() * 255.0D + 1.0D);
									Static84.anInt2112++;
									Static90.aClass25_2 = null;
									return false;
								}
								Static84.anInt2112 = 0;
								anInt1665 = 0;
								Static62.aClass8_Sub1_Sub8_1.aClass14_Sub1_5.method1170(Static48.aClass8_Sub20_36.aByteArray44, Static124.aBoolean110, (Static62.aClass8_Sub1_Sub8_1.aLong102 & 0xFF0000L) == 16711680L, (int) (Static62.aClass8_Sub1_Sub8_1.aLong102 & 0xFFFFL));
							}
							Static62.aClass8_Sub1_Sub8_1.method2013();
							Static62.aClass8_Sub1_Sub8_1 = null;
							Static48.aClass8_Sub20_36 = null;
							if (Static124.aBoolean110) {
								Static4.anInt63--;
							} else {
								Static5.anInt71--;
							}
							Static8.anInt174 = 0;
						} else {
							if (Static8.anInt174 != 512) {
								break;
							}
							Static8.anInt174 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(616) IOException local616) {
				try {
					Static90.aClass25_2.method588();
				} catch (@Pc(621) Exception local621) {
				}
				anInt1665++;
				Static90.aClass25_2 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!dd;)V")
	public static void method1024(@OriginalArg(1) Class14 arg0) {
		Static97.aClass14_22 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1028() {
		aClass8_Sub20_23 = null;
		aClass14_Sub1_9 = null;
		aClass34_773 = null;
		aClass34_774 = null;
		aClass34_775 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!fd;IZ)V")
	public static void method1031(@OriginalArg(0) Class25 arg0, @OriginalArg(2) boolean arg1) {
		if (Static90.aClass25_2 != null) {
			try {
				Static90.aClass25_2.method588();
			} catch (@Pc(8) Exception local8) {
			}
			Static90.aClass25_2 = null;
		}
		Static90.aClass25_2 = arg0;
		Static47.method734(arg1);
		Static8.anInt174 = 0;
		Static62.aClass8_Sub1_Sub8_1 = null;
		Static48.aClass8_Sub20_36 = null;
		aClass8_Sub20_23.anInt2853 = 0;
		while (true) {
			@Pc(33) Class8_Sub1_Sub8 local33 = (Class8_Sub1_Sub8) Static20.aClass7_1.method47();
			if (local33 == null) {
				while (true) {
					local33 = (Class8_Sub1_Sub8) Static31.aClass7_2.method47();
					if (local33 == null) {
						if (Static116.aByte8 != 0) {
							try {
								@Pc(94) Class8_Sub20 local94 = new Class8_Sub20(4);
								local94.method1883(4);
								local94.method1883(Static116.aByte8);
								local94.method1884(0);
								Static90.aClass25_2.method586(4, local94.aByteArray44);
							} catch (@Pc(117) IOException local117) {
								try {
									Static90.aClass25_2.method588();
								} catch (@Pc(122) Exception local122) {
								}
								Static90.aClass25_2 = null;
								anInt1665++;
							}
						}
						Static38.anInt940 = 0;
						Static94.aLong75 = Static27.method497();
						return;
					}
					Static78.aClass60_2.method1355(local33);
					Static58.aClass7_10.method48(local33, local33.aLong102);
					Static74.anInt1786++;
					Static5.anInt71--;
				}
			}
			Static80.aClass7_13.method48(local33, local33.aLong102);
			Static42.anInt1029++;
			Static4.anInt63--;
		}
	}
}

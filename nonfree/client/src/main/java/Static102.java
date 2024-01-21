import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_1162 = null;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Lclient!na;")
	private static Class53 aClass53_1170 = Static109.method1737("Loading ignore list");

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_1163 = aClass53_1170;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Lclient!na;")
	private static Class53 aClass53_1176 = Static109.method1737("Report abuse");

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_1164 = aClass53_1176;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt2386 = 0;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Lclient!na;")
	private static Class53 aClass53_1175 = Static109.method1737("cyan:");

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_1165 = aClass53_1175;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_1166 = Static109.method1737("::clientdrop");

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_1167 = aClass53_1175;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!na;")
	private static Class53 aClass53_1168 = Static109.method1737("Message");

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1169 = Static109.method1737("backhmid2");

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!na;")
	private static Class53 aClass53_1171 = Static109.method1737(" has logged in)3");

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_1172 = Static109.method1737("b12_full");

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_1173 = Static109.method1737("Null");

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_1174 = aClass53_1171;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "[I")
	public static int[] anIntArray318 = new int[256];

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_1177 = aClass53_1168;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBI)I")
	public static int method1671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static119.method282(arg1 - 1, arg0 + -1) + Static119.method282(arg1 - 1, arg0 - -1) + Static119.method282(arg1 + 1, arg0 + -1) + Static119.method282(arg1 + 1, arg0 + 1);
		@Pc(73) int local73 = Static119.method282(arg1, arg0 - 1) + Static119.method282(arg1, arg0 + 1) + Static119.method282(arg1 + -1, arg0) + Static119.method282(arg1 + 1, arg0);
		@Pc(78) int local78 = Static119.method282(arg1, arg0);
		return local78 / 4 + local73 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZZLclient!we;Lclient!we;)Lclient!ie;")
	public static Class3_Sub1_Sub6 method1672(@OriginalArg(0) int arg0, @OriginalArg(3) Class62 arg1, @OriginalArg(4) Class62 arg2) {
		@Pc(10) int[] local10 = arg2.method1506(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg2.method1496(local10[local14], arg0);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(60) byte[] local60 = arg1.method1496(0, local44);
				if (local60 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub6(arg2, arg1, arg0, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBLclient!bd;Lclient!je;IIII)V")
	public static void method1673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) Class39 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static107.anIntArrayArrayArray7[arg0][arg1][arg8];
		@Pc(23) int local23 = Static107.anIntArrayArrayArray7[arg0][arg1 + 1][arg8];
		@Pc(35) int local35 = Static107.anIntArrayArrayArray7[arg0][arg1 + 1][arg8 + 1];
		@Pc(45) int local45 = Static107.anIntArrayArrayArray7[arg0][arg1][arg8 + 1];
		@Pc(56) int local56 = local45 + local23 + local13 + local35 >> 2;
		@Pc(60) Class3_Sub1_Sub2 local60 = Static12.method200(arg6);
		@Pc(79) int local79 = arg1 + (arg8 << 7) + (arg6 << 14) + 1073741824;
		if (local60.anInt279 == 0) {
			local79 += Integer.MIN_VALUE;
		}
		@Pc(92) int local92 = arg5 + (arg7 << 6);
		if (local60.anInt259 == 1) {
			local92 += 256;
		}
		@Pc(121) Class3_Sub1_Sub4 local121;
		if (arg5 == 22) {
			if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
				local121 = local60.method169(local13, arg7, local35, local45, 22, local23);
			} else {
				local121 = new Class3_Sub1_Sub4_Sub3(arg6, 22, arg7, local13, local23, local35, local45, local60.anInt298, true, null);
			}
			arg4.method993(arg2, arg1, arg8, local56, local121, local79, local92);
			if (local60.aBoolean10 && local60.anInt279 == 1) {
				arg3.method139(arg8, arg1);
			}
			return;
		}
		@Pc(215) int local215;
		if (arg5 == 10 || arg5 == 11) {
			if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
				local121 = local60.method169(local13, arg7, local35, local45, 10, local23);
			} else {
				local121 = new Class3_Sub1_Sub4_Sub3(arg6, 10, arg7, local13, local23, local35, local45, local60.anInt298, true, null);
			}
			if (local121 != null) {
				@Pc(218) int local218;
				if (arg7 == 1 || arg7 == 3) {
					local215 = local60.anInt282;
					local218 = local60.anInt270;
				} else {
					local215 = local60.anInt270;
					local218 = local60.anInt282;
				}
				@Pc(228) int local228 = 0;
				if (arg5 == 11) {
					local228 += 256;
				}
				arg4.method975(arg2, arg1, arg8, local56, local215, local218, local121, local228, local79, local92);
			}
			if (local60.aBoolean10) {
				arg3.method149(local60.anInt270, arg1, local60.aBoolean17, local60.anInt282, arg8, arg7);
			}
		} else if (arg5 >= 12) {
			if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
				local121 = local60.method169(local13, arg7, local35, local45, arg5, local23);
			} else {
				local121 = new Class3_Sub1_Sub4_Sub3(arg6, arg5, arg7, local13, local23, local35, local45, local60.anInt298, true, null);
			}
			arg4.method975(arg2, arg1, arg8, local56, 1, 1, local121, 0, local79, local92);
			if (local60.aBoolean10) {
				arg3.method149(local60.anInt270, arg1, local60.aBoolean17, local60.anInt282, arg8, arg7);
			}
		} else if (arg5 == 0) {
			if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
				local121 = local60.method169(local13, arg7, local35, local45, 0, local23);
			} else {
				local121 = new Class3_Sub1_Sub4_Sub3(arg6, 0, arg7, local13, local23, local35, local45, local60.anInt298, true, null);
			}
			arg4.method991(arg2, arg1, arg8, local56, local121, null, Static16.anIntArray36[arg7], 0, local79, local92);
			if (local60.aBoolean10) {
				arg3.method141(arg5, arg1, local60.aBoolean17, arg8, arg7);
			}
		} else if (arg5 == 1) {
			if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
				local121 = local60.method169(local13, arg7, local35, local45, 1, local23);
			} else {
				local121 = new Class3_Sub1_Sub4_Sub3(arg6, 1, arg7, local13, local23, local35, local45, local60.anInt298, true, null);
			}
			arg4.method991(arg2, arg1, arg8, local56, local121, null, Static45.anIntArray152[arg7], 0, local79, local92);
			if (local60.aBoolean10) {
				arg3.method141(arg5, arg1, local60.aBoolean17, arg8, arg7);
			}
		} else {
			@Pc(478) int local478;
			@Pc(517) Class3_Sub1_Sub4 local517;
			if (arg5 == 2) {
				local478 = arg7 + 1 & 0x3;
				@Pc(502) Class3_Sub1_Sub4 local502;
				if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
					local502 = local60.method169(local13, arg7 + 4, local35, local45, 2, local23);
					local517 = local60.method169(local13, local478, local35, local45, 2, local23);
				} else {
					local502 = new Class3_Sub1_Sub4_Sub3(arg6, 2, arg7 + 4, local13, local23, local35, local45, local60.anInt298, true, null);
					local517 = new Class3_Sub1_Sub4_Sub3(arg6, 2, local478, local13, local23, local35, local45, local60.anInt298, true, null);
				}
				arg4.method991(arg2, arg1, arg8, local56, local502, local517, Static16.anIntArray36[arg7], Static16.anIntArray36[local478], local79, local92);
				if (local60.aBoolean10) {
					arg3.method141(arg5, arg1, local60.aBoolean17, arg8, arg7);
				}
			} else if (arg5 == 3) {
				if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
					local121 = local60.method169(local13, arg7, local35, local45, 3, local23);
				} else {
					local121 = new Class3_Sub1_Sub4_Sub3(arg6, 3, arg7, local13, local23, local35, local45, local60.anInt298, true, null);
				}
				arg4.method991(arg2, arg1, arg8, local56, local121, null, Static45.anIntArray152[arg7], 0, local79, local92);
				if (local60.aBoolean10) {
					arg3.method141(arg5, arg1, local60.aBoolean17, arg8, arg7);
				}
			} else if (arg5 == 9) {
				if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
					local121 = local60.method169(local13, arg7, local35, local45, arg5, local23);
				} else {
					local121 = new Class3_Sub1_Sub4_Sub3(arg6, arg5, arg7, local13, local23, local35, local45, local60.anInt298, true, null);
				}
				arg4.method975(arg2, arg1, arg8, local56, 1, 1, local121, 0, local79, local92);
				if (local60.aBoolean10) {
					arg3.method149(local60.anInt270, arg1, local60.aBoolean17, local60.anInt282, arg8, arg7);
				}
			} else {
				if (local60.aBoolean14) {
					if (arg7 == 1) {
						local478 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local478;
					} else if (arg7 == 2) {
						local478 = local45;
						local45 = local23;
						local23 = local478;
						local478 = local35;
						local35 = local13;
						local13 = local478;
					} else if (arg7 == 3) {
						local478 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local478;
					}
				}
				if (arg5 == 4) {
					if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
						local121 = local60.method169(local13, 0, local35, local45, 4, local23);
					} else {
						local121 = new Class3_Sub1_Sub4_Sub3(arg6, 4, 0, local13, local23, local35, local45, local60.anInt298, true, null);
					}
					arg4.method963(arg2, arg1, arg8, local56, local121, Static16.anIntArray36[arg7], arg7 * 512, 0, 0, local79, local92);
				} else if (arg5 == 5) {
					local478 = 16;
					local215 = arg4.method1010(arg2, arg1, arg8);
					if (local215 != 0) {
						local478 = Static12.method200(local215 >> 14 & 0x7FFF).anInt258;
					}
					if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
						local517 = local60.method169(local13, 0, local35, local45, 4, local23);
					} else {
						local517 = new Class3_Sub1_Sub4_Sub3(arg6, 4, 0, local13, local23, local35, local45, local60.anInt298, true, null);
					}
					arg4.method963(arg2, arg1, arg8, local56, local517, Static16.anIntArray36[arg7], arg7 * 512, local478 * Static5.anIntArray18[arg7], local478 * Static58.anIntArray188[arg7], local79, local92);
				} else if (arg5 == 6) {
					if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
						local121 = local60.method169(local13, 0, local35, local45, 4, local23);
					} else {
						local121 = new Class3_Sub1_Sub4_Sub3(arg6, 4, 0, local13, local23, local35, local45, local60.anInt298, true, null);
					}
					arg4.method963(arg2, arg1, arg8, local56, local121, 256, arg7, 0, 0, local79, local92);
				} else if (arg5 == 7) {
					if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
						local121 = local60.method169(local13, 0, local35, local45, 4, local23);
					} else {
						local121 = new Class3_Sub1_Sub4_Sub3(arg6, 4, 0, local13, local23, local35, local45, local60.anInt298, true, null);
					}
					arg4.method963(arg2, arg1, arg8, local56, local121, 512, arg7, 0, 0, local79, local92);
				} else if (arg5 == 8) {
					if (local60.anInt298 == -1 && local60.anIntArray24 == null) {
						local121 = local60.method169(local13, 0, local35, local45, 4, local23);
					} else {
						local121 = new Class3_Sub1_Sub4_Sub3(arg6, 4, 0, local13, local23, local35, local45, local60.anInt298, true, null);
					}
					arg4.method963(arg2, arg1, arg8, local56, local121, 768, arg7, 0, 0, local79, local92);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1674() {
		if (Static73.anInt1832 != 1) {
			return;
		}
		if (Static56.anInt1504 >= 6 && Static56.anInt1504 <= 106 && Static54.anInt2854 >= 467 && Static54.anInt2854 <= 499) {
			Static52.aBoolean50 = true;
			Static119.aBoolean25 = true;
			Static68.anInt1720 = (Static68.anInt1720 + 1) % 4;
			Static115.aClass3_Sub7_Sub1_3.method662(220);
			Static115.aClass3_Sub7_Sub1_3.method625(Static68.anInt1720);
			Static115.aClass3_Sub7_Sub1_3.method625(Static9.anInt237);
			Static115.aClass3_Sub7_Sub1_3.method625(Static88.anInt2106);
		}
		if (Static56.anInt1504 >= 135 && Static56.anInt1504 <= 235 && Static54.anInt2854 >= 467 && Static54.anInt2854 <= 499) {
			Static52.aBoolean50 = true;
			Static9.anInt237 = (Static9.anInt237 + 1) % 3;
			Static119.aBoolean25 = true;
			Static115.aClass3_Sub7_Sub1_3.method662(220);
			Static115.aClass3_Sub7_Sub1_3.method625(Static68.anInt1720);
			Static115.aClass3_Sub7_Sub1_3.method625(Static9.anInt237);
			Static115.aClass3_Sub7_Sub1_3.method625(Static88.anInt2106);
		}
		if (Static56.anInt1504 >= 273 && Static56.anInt1504 <= 373 && Static54.anInt2854 >= 467 && Static54.anInt2854 <= 499) {
			Static88.anInt2106 = (Static88.anInt2106 + 1) % 3;
			Static119.aBoolean25 = true;
			Static52.aBoolean50 = true;
			Static115.aClass3_Sub7_Sub1_3.method662(220);
			Static115.aClass3_Sub7_Sub1_3.method625(Static68.anInt1720);
			Static115.aClass3_Sub7_Sub1_3.method625(Static9.anInt237);
			Static115.aClass3_Sub7_Sub1_3.method625(Static88.anInt2106);
		}
		if (Static56.anInt1504 < 412 || Static56.anInt1504 > 512 || Static54.anInt2854 < 467 || Static54.anInt2854 > 499) {
			return;
		}
		if (Static111.anInt2556 == -1) {
			Static86.method1435();
			if (Static65.anInt1661 != -1) {
				Static35.aClass53_473 = Static35.aClass53_476;
				Static82.anInt957 = Static111.anInt2556 = Static65.anInt1661;
				Static101.aBoolean100 = false;
				return;
			}
			return;
		}
		Static73.method1234(0, Static35.aClass53_476, Static78.aClass53_883);
		if (Static20.aClass53_263 != null) {
			Static73.method1234(0, Static35.aClass53_476, Static20.aClass53_263);
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method1675() {
		aClass53_1172 = null;
		aClass53_1165 = null;
		aClass53_1170 = null;
		aClass53_1171 = null;
		aClass53_1164 = null;
		aClass53_1167 = null;
		anIntArray317 = null;
		aClass53_1162 = null;
		aClass53_1175 = null;
		aClass53_1169 = null;
		aClass53_1166 = null;
		aClass53_1168 = null;
		aClass53_1174 = null;
		aClass53_1173 = null;
		aClass53_1177 = null;
		anIntArray318 = null;
		aClass53_1176 = null;
		aClass53_1163 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Z")
	public static boolean method1676(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public static void method1677() {
		if (Static41.aClass5_1 != null) {
			@Pc(8) Class5 local8 = Static41.aClass5_1;
			synchronized (Static41.aClass5_1) {
				Static41.aClass5_1 = null;
			}
		}
	}
}

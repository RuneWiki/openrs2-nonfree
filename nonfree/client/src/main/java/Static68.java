import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!oe;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public static int anInt1654 = 0;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_850 = Static75.method1216(" x ");

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	public static int anInt1660 = 0;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	public static volatile int anInt1662 = 0;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!ad;")
	private static Class4 aClass4_853 = Static75.method1216("Hide");

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_851 = aClass4_853;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "I")
	public static int anInt1664 = 0;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_852 = Static75.method1216("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_854 = Static75.method1216("Cabbage");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1113() {
		Static42.aClass8_14.method198();
		Static76.aClass8_24.method198();
		Static54.aClass8_18.method198();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1114(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString8 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local21 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(83) String local83 = local59.substring(local65 + 1, local72);
					@Pc(87) int local87 = local83.indexOf(".java:");
					if (local87 >= 0) {
						local83 = local83.substring(0, local87) + local83.substring(local87 + 5);
						local21 = local21 + local83 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local21 = local21 + local59 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIILclient!vd;)V")
	public static void method1115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub4_Sub4 arg3) {
		Static11.aClass25_154.method1157();
		Static6.aClass3_Sub1_Sub4_Sub3_5.method1771(0, 0);
		arg3.method1852(Static29.aClass4_438, 55, 28, 16777215, true);
		if (arg1 == 0) {
			arg3.method1852(Static98.aClass4_1303, 55, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg3.method1852(Static42.aClass4_570, 55, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg3.method1852(Static86.aClass4_1127, 55, 41, 16711680, true);
		}
		if (arg1 == 3) {
			arg3.method1852(aClass4_851, 55, 41, 65535, true);
		}
		arg3.method1852(Static28.aClass4_410, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg3.method1852(Static98.aClass4_1303, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg3.method1852(Static42.aClass4_570, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg3.method1852(Static86.aClass4_1127, 184, 41, 16711680, true);
		}
		arg3.method1852(Static20.aClass4_245, 324, 28, 16777215, true);
		if (arg2 == 0) {
			arg3.method1852(Static98.aClass4_1303, 324, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg3.method1852(Static42.aClass4_570, 324, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg3.method1852(Static86.aClass4_1127, 324, 41, 16711680, true);
		}
		arg3.method1857(Static92.aClass4_1182, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(162) Graphics local162 = Static9.aCanvas1.getGraphics();
			Static11.aClass25_154.method1161(453, local162, 0);
		} catch (@Pc(170) Exception local170) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public static void method1116() {
		aClass4_850 = null;
		aClass4_852 = null;
		aClass4_853 = null;
		aClass57_1 = null;
		aClass4_854 = null;
		aClass4_851 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!jd;IIILclient!qa;IIII)V")
	public static void method1117(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class61 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21 = Static38.anIntArrayArrayArray36[arg5][arg2][arg3];
		@Pc(31) int local31 = Static38.anIntArrayArrayArray36[arg5][arg2 + 1][arg3];
		@Pc(41) int local41 = Static38.anIntArrayArrayArray36[arg5][arg2][arg3 + 1];
		@Pc(53) int local53 = Static38.anIntArrayArrayArray36[arg5][arg2 + 1][arg3 + 1];
		@Pc(64) int local64 = local53 + local21 + local31 + local41 >> 2;
		@Pc(70) int local70 = arg8 + (arg6 << 6);
		@Pc(74) Class3_Sub1_Sub5 local74 = Static38.method1911(arg0);
		@Pc(86) int local86 = (arg0 << 14) + (arg3 << 7) + arg2 + 1073741824;
		if (local74.anInt1532 == 1) {
			local70 += 256;
		}
		if (local74.anInt1524 == 0) {
			local86 += Integer.MIN_VALUE;
		}
		@Pc(125) Class3_Sub1_Sub1 local125;
		if (arg8 == 22) {
			if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
				local125 = local74.method1028(local31, local21, local41, 22, local53, arg6);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub6(arg0, 22, arg6, local21, local31, local53, local41, local74.anInt1541, true);
			}
			arg4.method1326(arg7, arg2, arg3, local64, local125, local86, local70);
			if (local74.aBoolean113 && local74.anInt1524 == 1) {
				arg1.method877(arg3, arg2);
			}
			return;
		}
		@Pc(221) int local221;
		if (arg8 == 10 || arg8 == 11) {
			if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
				local125 = local74.method1028(local31, local21, local41, 10, local53, arg6);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub6(arg0, 10, arg6, local21, local31, local53, local41, local74.anInt1541, true);
			}
			if (local125 != null) {
				@Pc(218) int local218;
				if (arg6 == 1 || arg6 == 3) {
					local221 = local74.anInt1543;
					local218 = local74.anInt1548;
				} else {
					local218 = local74.anInt1543;
					local221 = local74.anInt1548;
				}
				@Pc(231) int local231 = 0;
				if (arg8 == 11) {
					local231 += 256;
				}
				arg4.method1312(arg7, arg2, arg3, local64, local221, local218, local125, local231, local86, local70);
			}
			if (local74.aBoolean113) {
				arg1.method891(local74.aBoolean116, local74.anInt1543, arg3, arg6, arg2, local74.anInt1548);
			}
		} else if (arg8 >= 12) {
			if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
				local125 = local74.method1028(local31, local21, local41, arg8, local53, arg6);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub6(arg0, arg8, arg6, local21, local31, local53, local41, local74.anInt1541, true);
			}
			arg4.method1312(arg7, arg2, arg3, local64, 1, 1, local125, 0, local86, local70);
			if (local74.aBoolean113) {
				arg1.method891(local74.aBoolean116, local74.anInt1543, arg3, arg6, arg2, local74.anInt1548);
			}
		} else if (arg8 == 0) {
			if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
				local125 = local74.method1028(local31, local21, local41, 0, local53, arg6);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub6(arg0, 0, arg6, local21, local31, local53, local41, local74.anInt1541, true);
			}
			arg4.method1333(arg7, arg2, arg3, local64, local125, null, Static27.anIntArray75[arg6], 0, local86, local70);
			if (local74.aBoolean113) {
				arg1.method892(local74.aBoolean116, arg6, arg3, arg2, arg8);
			}
		} else if (arg8 == 1) {
			if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
				local125 = local74.method1028(local31, local21, local41, 1, local53, arg6);
			} else {
				local125 = new Class3_Sub1_Sub1_Sub6(arg0, 1, arg6, local21, local31, local53, local41, local74.anInt1541, true);
			}
			arg4.method1333(arg7, arg2, arg3, local64, local125, null, Static95.anIntArray283[arg6], 0, local86, local70);
			if (local74.aBoolean113) {
				arg1.method892(local74.aBoolean116, arg6, arg3, arg2, arg8);
			}
		} else {
			@Pc(468) int local468;
			@Pc(506) Class3_Sub1_Sub1 local506;
			if (arg8 == 2) {
				local468 = arg6 + 1 & 0x3;
				@Pc(492) Class3_Sub1_Sub1 local492;
				if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
					local492 = local74.method1028(local31, local21, local41, 2, local53, arg6 + 4);
					local506 = local74.method1028(local31, local21, local41, 2, local53, local468);
				} else {
					local492 = new Class3_Sub1_Sub1_Sub6(arg0, 2, arg6 + 4, local21, local31, local53, local41, local74.anInt1541, true);
					local506 = new Class3_Sub1_Sub1_Sub6(arg0, 2, local468, local21, local31, local53, local41, local74.anInt1541, true);
				}
				arg4.method1333(arg7, arg2, arg3, local64, local492, local506, Static27.anIntArray75[arg6], Static27.anIntArray75[local468], local86, local70);
				if (local74.aBoolean113) {
					arg1.method892(local74.aBoolean116, arg6, arg3, arg2, arg8);
				}
			} else if (arg8 == 3) {
				if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
					local125 = local74.method1028(local31, local21, local41, 3, local53, arg6);
				} else {
					local125 = new Class3_Sub1_Sub1_Sub6(arg0, 3, arg6, local21, local31, local53, local41, local74.anInt1541, true);
				}
				arg4.method1333(arg7, arg2, arg3, local64, local125, null, Static95.anIntArray283[arg6], 0, local86, local70);
				if (local74.aBoolean113) {
					arg1.method892(local74.aBoolean116, arg6, arg3, arg2, arg8);
				}
			} else if (arg8 == 9) {
				if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
					local125 = local74.method1028(local31, local21, local41, arg8, local53, arg6);
				} else {
					local125 = new Class3_Sub1_Sub1_Sub6(arg0, arg8, arg6, local21, local31, local53, local41, local74.anInt1541, true);
				}
				arg4.method1312(arg7, arg2, arg3, local64, 1, 1, local125, 0, local86, local70);
				if (local74.aBoolean113) {
					arg1.method891(local74.aBoolean116, local74.anInt1543, arg3, arg6, arg2, local74.anInt1548);
				}
			} else {
				if (local74.aBoolean114) {
					if (arg6 == 1) {
						local468 = local41;
						local41 = local53;
						local53 = local31;
						local31 = local21;
						local21 = local468;
					} else if (arg6 == 2) {
						local468 = local41;
						local41 = local31;
						local31 = local468;
						local468 = local53;
						local53 = local21;
						local21 = local468;
					} else if (arg6 == 3) {
						local468 = local41;
						local41 = local21;
						local21 = local31;
						local31 = local53;
						local53 = local468;
					}
				}
				if (arg8 == 4) {
					if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
						local125 = local74.method1028(local31, local21, local41, 4, local53, 0);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local21, local31, local53, local41, local74.anInt1541, true);
					}
					arg4.method1329(arg7, arg2, arg3, local64, local125, Static27.anIntArray75[arg6], arg6 * 512, 0, 0, local86, local70);
				} else if (arg8 == 5) {
					local468 = 16;
					local221 = arg4.method1339(arg7, arg2, arg3);
					if (local221 > 0) {
						local468 = Static38.method1911(local221 >> 14 & 0x7FFF).anInt1539;
					}
					if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
						local506 = local74.method1028(local31, local21, local41, 4, local53, 0);
					} else {
						local506 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local21, local31, local53, local41, local74.anInt1541, true);
					}
					arg4.method1329(arg7, arg2, arg3, local64, local506, Static27.anIntArray75[arg6], arg6 * 512, Static54.anIntArray180[arg6] * local468, local468 * Static104.anIntArray323[arg6], local86, local70);
				} else if (arg8 == 6) {
					if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
						local125 = local74.method1028(local31, local21, local41, 4, local53, 0);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local21, local31, local53, local41, local74.anInt1541, true);
					}
					arg4.method1329(arg7, arg2, arg3, local64, local125, 256, arg6, 0, 0, local86, local70);
				} else if (arg8 == 7) {
					if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
						local125 = local74.method1028(local31, local21, local41, 4, local53, 0);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local21, local31, local53, local41, local74.anInt1541, true);
					}
					arg4.method1329(arg7, arg2, arg3, local64, local125, 512, arg6, 0, 0, local86, local70);
				} else if (arg8 == 8) {
					if (local74.anInt1541 == -1 && local74.anIntArray215 == null) {
						local125 = local74.method1028(local31, local21, local41, 4, local53, 0);
					} else {
						local125 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local21, local31, local53, local41, local74.anInt1541, true);
					}
					arg4.method1329(arg7, arg2, arg3, local64, local125, 768, arg6, 0, 0, local86, local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!gb;Lclient!ad;)I")
	public static int method1118(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(6) int local6 = arg0.anInt627;
		arg0.method448(arg1.anInt238);
		arg0.anInt627 += Static44.aClass29_1.method634(arg1.aByteArray1, arg1.anInt238, 0, arg0.aByteArray4, arg0.anInt627);
		return arg0.anInt627 - local6;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	public static void method1119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = 2048 - arg5 & 0x7FF;
		@Pc(21) int local21 = 2048 - arg4 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg1;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(47) int local47;
		if (local14 != 0) {
			local33 = Static41.anIntArray149[local14];
			local37 = Static41.anIntArray142[local14];
			local47 = local37 * 0 - local33 * arg1 >> 16;
			local27 = local37 * arg1 + local33 * 0 >> 16;
			local25 = local47;
		}
		if (local21 != 0) {
			local33 = Static41.anIntArray149[local21];
			local37 = Static41.anIntArray142[local21];
			local47 = local37 * 0 + local33 * local27 >> 16;
			local27 = local27 * local37 - local33 * 0 >> 16;
			local23 = local47;
		}
		Static61.anInt1536 = arg2 - local25;
		Static9.anInt314 = arg0 - local27;
		Static113.anInt2853 = arg3 - local23;
		Static106.anInt2666 = arg5;
		Static47.anInt1186 = arg4;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1120() {
		if (Static12.anInt343 != 0) {
			return;
		}
		Static104.aClass4Array20[0] = Static86.aClass4_1122;
		Static22.anIntArray38[0] = 1002;
		Static4.anInt204 = 1;
		if (Static60.anInt1484 != -1) {
			Static67.anInt1650 = -1;
			Static90.anInt2817 = -1;
			Static49.method841(0, Static22.anInt496, Static60.anInt1484, 0, Static78.anInt420, 765, 503, 0);
			Static12.anInt340 = Static67.anInt1650;
			Static91.anInt2057 = Static90.anInt2817;
			return;
		}
		Static46.method1880();
		Static67.anInt1650 = -1;
		@Pc(50) boolean local50 = false;
		Static90.anInt2817 = -1;
		if (Static22.anInt496 > 4 && Static78.anInt420 > 4 && Static22.anInt496 < 516 && Static78.anInt420 < 338) {
			if (Static48.anInt1201 == -1) {
				Static20.method288();
			} else {
				Static49.method841(4, Static22.anInt496, Static48.anInt1201, 0, Static78.anInt420, 516, 338, 4);
			}
		}
		Static91.anInt2057 = Static90.anInt2817;
		Static90.anInt2817 = -1;
		Static12.anInt340 = Static67.anInt1650;
		Static67.anInt1650 = -1;
		if (Static22.anInt496 > 553 && Static78.anInt420 > 205 && Static22.anInt496 < 743 && Static78.anInt420 < 466) {
			if (Static10.anInt336 != -1) {
				Static49.method841(553, Static22.anInt496, Static10.anInt336, 1, Static78.anInt420, 743, 466, 205);
			} else if (Static13.anIntArray15[Static70.anInt1686] != -1) {
				Static49.method841(553, Static22.anInt496, Static13.anIntArray15[Static70.anInt1686], 1, Static78.anInt420, 743, 466, 205);
			}
		}
		if (Static56.anInt1400 != Static90.anInt2817) {
			Static56.anInt1400 = Static90.anInt2817;
			Static39.aBoolean74 = true;
		}
		Static90.anInt2817 = -1;
		if (Static67.anInt1650 != Static107.anInt2705) {
			Static39.aBoolean74 = true;
			Static107.anInt2705 = Static67.anInt1650;
		}
		Static67.anInt1650 = -1;
		if (Static22.anInt496 > 17 && Static78.anInt420 > 357 && Static22.anInt496 < 496 && Static78.anInt420 < 453) {
			if (Static6.anInt259 != -1) {
				Static49.method841(17, Static22.anInt496, Static6.anInt259, 2, Static78.anInt420, 496, 453, 357);
			} else if (Static77.anInt1841 != -1) {
				Static49.method841(17, Static22.anInt496, Static77.anInt1841, 3, Static78.anInt420, 496, 453, 357);
			} else if (Static78.anInt420 < 434 && Static22.anInt496 < 426) {
				Static63.method1083(Static22.anInt496 - 17, Static78.anInt420 + -357);
			}
		}
		if ((Static6.anInt259 != -1 || Static77.anInt1841 != -1) && Static110.anInt2777 != Static90.anInt2817) {
			Static86.aBoolean153 = true;
			Static110.anInt2777 = Static90.anInt2817;
		}
		if ((Static6.anInt259 != -1 || Static77.anInt1841 != -1) && Static67.anInt1650 != Static106.anInt2663) {
			Static86.aBoolean153 = true;
			Static106.anInt2663 = Static67.anInt1650;
		}
		while (!local50) {
			local50 = true;
			for (@Pc(269) int local269 = 0; local269 < Static4.anInt204 - 1; local269++) {
				if (Static22.anIntArray38[local269] < 1000 && Static22.anIntArray38[local269 + 1] > 1000) {
					local50 = false;
					@Pc(293) Class4 local293 = Static104.aClass4Array20[local269];
					Static104.aClass4Array20[local269] = Static104.aClass4Array20[local269 + 1];
					Static104.aClass4Array20[local269 + 1] = local293;
					@Pc(311) int local311 = Static22.anIntArray38[local269];
					Static22.anIntArray38[local269] = Static22.anIntArray38[local269 + 1];
					Static22.anIntArray38[local269 + 1] = local311;
					@Pc(329) int local329 = Static63.anIntArray225[local269];
					Static63.anIntArray225[local269] = Static63.anIntArray225[local269 + 1];
					Static63.anIntArray225[local269 + 1] = local329;
					@Pc(347) int local347 = Static107.anIntArray331[local269];
					Static107.anIntArray331[local269] = Static107.anIntArray331[local269 + 1];
					Static107.anIntArray331[local269 + 1] = local347;
					@Pc(365) int local365 = Static52.anIntArray176[local269];
					Static52.anIntArray176[local269] = Static52.anIntArray176[local269 + 1];
					Static52.anIntArray176[local269 + 1] = local365;
				}
			}
		}
	}
}

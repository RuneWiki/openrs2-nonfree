import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt2800;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array9;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	public static int anInt2801;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Z")
	public static boolean aBoolean151;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1254 = Static24.method441("scrollen:");

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!bc;")
	public static Class7 aClass7_6 = new Class7(32);

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!ge;")
	public static Class21 aClass21_34 = new Class21(64);

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1255 = Static24.method441("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1256 = Static24.method441("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1258 = Static24.method441("Please try using a different world)3");

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1257 = aClass65_1258;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1269 = Static24.method441(" is already on your ignore list");

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1259 = aClass65_1269;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1260 = aClass65_1258;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1268 = Static24.method441("Hidden");

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1261 = aClass65_1268;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1262 = Static24.method441("@yel@*V");

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1263 = aClass65_1258;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "[I")
	public static int[] anIntArray408 = new int[1000];

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1264 = Static24.method441("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1265 = Static24.method441("Loaded sprites");

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1266 = aClass65_1258;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1267 = Static24.method441("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1270 = aClass65_1265;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1271 = aClass65_1258;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1272 = aClass65_1258;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILclient!od;)V")
	public static void method1718(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1) {
		Static20.method404(arg1.anInt1518, arg1.anInt1562, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method1719(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString1 + " | ";
		} else {
			local10 = "";
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
					return local10 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(86) String local86 = local59.substring(local65 + 1, local72);
					@Pc(90) int local90 = local86.indexOf(".java:");
					if (local90 >= 0) {
						local86 = local86.substring(0, local90) + local86.substring(local90 + 5);
						local10 = local10 + local86 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local10 = local10 + local59 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!fc;IIIIILclient!uc;II)V")
	public static void method1720(@OriginalArg(1) Class18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class58 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = Static61.anIntArrayArrayArray6[arg3][arg5][arg4];
		@Pc(25) int local25 = Static61.anIntArrayArrayArray6[arg3][arg5 + 1][arg4 + 1];
		@Pc(35) int local35 = Static61.anIntArrayArrayArray6[arg3][arg5 + 1][arg4];
		@Pc(45) int local45 = Static61.anIntArrayArrayArray6[arg3][arg5][arg4 + 1];
		@Pc(55) int local55 = local25 + local35 + local9 + local45 >> 2;
		@Pc(64) Class2_Sub1_Sub14 local64 = Static29.method518(arg1);
		@Pc(70) int local70 = (arg7 << 6) + arg2;
		if (local64.anInt2644 == 1) {
			local70 += 256;
		}
		@Pc(88) int local88 = (arg4 << 7) + arg5 + (arg1 << 14) + 1073741824;
		if (local64.anInt2616 == 0) {
			local88 += Integer.MIN_VALUE;
		}
		@Pc(115) Class2_Sub1_Sub1 local115;
		if (arg2 == 22) {
			if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
				local115 = local64.method1613(local45, local9, arg7, 22, local25, local35);
			} else {
				local115 = new Class2_Sub1_Sub1_Sub4(arg1, 22, arg7, local9, local35, local25, local45, local64.anInt2611, true);
			}
			arg0.method582(arg8, arg5, arg4, local55, local115, local88, local70);
			if (local64.aBoolean140 && local64.anInt2616 == 1) {
				arg6.method1728(arg4, arg5);
			}
			return;
		}
		@Pc(213) int local213;
		if (arg2 == 10 || arg2 == 11) {
			if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
				local115 = local64.method1613(local45, local9, arg7, 10, local25, local35);
			} else {
				local115 = new Class2_Sub1_Sub1_Sub4(arg1, 10, arg7, local9, local35, local25, local45, local64.anInt2611, true);
			}
			if (local115 != null) {
				@Pc(210) int local210;
				if (arg7 == 1 || arg7 == 3) {
					local210 = local64.anInt2621;
					local213 = local64.anInt2634;
				} else {
					local210 = local64.anInt2634;
					local213 = local64.anInt2621;
				}
				@Pc(223) int local223 = 0;
				if (arg2 == 11) {
					local223 += 256;
				}
				arg0.method625(arg8, arg5, arg4, local55, local213, local210, local115, local223, local88, local70);
			}
			if (local64.aBoolean140) {
				arg6.method1726(local64.anInt2634, local64.anInt2621, local64.aBoolean139, arg4, arg5, arg7);
			}
		} else if (arg2 >= 12) {
			if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
				local115 = local64.method1613(local45, local9, arg7, arg2, local25, local35);
			} else {
				local115 = new Class2_Sub1_Sub1_Sub4(arg1, arg2, arg7, local9, local35, local25, local45, local64.anInt2611, true);
			}
			arg0.method625(arg8, arg5, arg4, local55, 1, 1, local115, 0, local88, local70);
			if (local64.aBoolean140) {
				arg6.method1726(local64.anInt2634, local64.anInt2621, local64.aBoolean139, arg4, arg5, arg7);
			}
		} else if (arg2 == 0) {
			if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
				local115 = local64.method1613(local45, local9, arg7, 0, local25, local35);
			} else {
				local115 = new Class2_Sub1_Sub1_Sub4(arg1, 0, arg7, local9, local35, local25, local45, local64.anInt2611, true);
			}
			arg0.method600(arg8, arg5, arg4, local55, local115, null, Static28.anIntArray112[arg7], 0, local88, local70);
			if (local64.aBoolean140) {
				arg6.method1735(arg4, arg2, arg5, local64.aBoolean139, arg7);
			}
		} else if (arg2 == 1) {
			if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
				local115 = local64.method1613(local45, local9, arg7, 1, local25, local35);
			} else {
				local115 = new Class2_Sub1_Sub1_Sub4(arg1, 1, arg7, local9, local35, local25, local45, local64.anInt2611, true);
			}
			arg0.method600(arg8, arg5, arg4, local55, local115, null, Static80.anIntArray307[arg7], 0, local88, local70);
			if (local64.aBoolean140) {
				arg6.method1735(arg4, arg2, arg5, local64.aBoolean139, arg7);
			}
		} else {
			@Pc(466) int local466;
			@Pc(504) Class2_Sub1_Sub1 local504;
			if (arg2 == 2) {
				local466 = arg7 + 1 & 0x3;
				@Pc(490) Class2_Sub1_Sub1 local490;
				if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
					local490 = local64.method1613(local45, local9, arg7 + 4, 2, local25, local35);
					local504 = local64.method1613(local45, local9, local466, 2, local25, local35);
				} else {
					local490 = new Class2_Sub1_Sub1_Sub4(arg1, 2, arg7 + 4, local9, local35, local25, local45, local64.anInt2611, true);
					local504 = new Class2_Sub1_Sub1_Sub4(arg1, 2, local466, local9, local35, local25, local45, local64.anInt2611, true);
				}
				arg0.method600(arg8, arg5, arg4, local55, local490, local504, Static28.anIntArray112[arg7], Static28.anIntArray112[local466], local88, local70);
				if (local64.aBoolean140) {
					arg6.method1735(arg4, arg2, arg5, local64.aBoolean139, arg7);
				}
			} else if (arg2 == 3) {
				if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
					local115 = local64.method1613(local45, local9, arg7, 3, local25, local35);
				} else {
					local115 = new Class2_Sub1_Sub1_Sub4(arg1, 3, arg7, local9, local35, local25, local45, local64.anInt2611, true);
				}
				arg0.method600(arg8, arg5, arg4, local55, local115, null, Static80.anIntArray307[arg7], 0, local88, local70);
				if (local64.aBoolean140) {
					arg6.method1735(arg4, arg2, arg5, local64.aBoolean139, arg7);
				}
			} else if (arg2 == 9) {
				if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
					local115 = local64.method1613(local45, local9, arg7, arg2, local25, local35);
				} else {
					local115 = new Class2_Sub1_Sub1_Sub4(arg1, arg2, arg7, local9, local35, local25, local45, local64.anInt2611, true);
				}
				arg0.method625(arg8, arg5, arg4, local55, 1, 1, local115, 0, local88, local70);
				if (local64.aBoolean140) {
					arg6.method1726(local64.anInt2634, local64.anInt2621, local64.aBoolean139, arg4, arg5, arg7);
				}
			} else {
				if (local64.aBoolean138) {
					if (arg7 == 1) {
						local466 = local45;
						local45 = local25;
						local25 = local35;
						local35 = local9;
						local9 = local466;
					} else if (arg7 == 2) {
						local466 = local45;
						local45 = local35;
						local35 = local466;
						local466 = local25;
						local25 = local9;
						local9 = local466;
					} else if (arg7 == 3) {
						local466 = local45;
						local45 = local9;
						local9 = local35;
						local35 = local25;
						local25 = local466;
					}
				}
				if (arg2 == 4) {
					if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
						local115 = local64.method1613(local45, local9, 0, 4, local25, local35);
					} else {
						local115 = new Class2_Sub1_Sub1_Sub4(arg1, 4, 0, local9, local35, local25, local45, local64.anInt2611, true);
					}
					arg0.method605(arg8, arg5, arg4, local55, local115, Static28.anIntArray112[arg7], arg7 * 512, 0, 0, local88, local70);
				} else if (arg2 == 5) {
					local213 = arg0.method581(arg8, arg5, arg4);
					local466 = 16;
					if (local213 > 0) {
						local466 = Static29.method518(local213 >> 14 & 0x7FFF).anInt2631;
					}
					if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
						local504 = local64.method1613(local45, local9, 0, 4, local25, local35);
					} else {
						local504 = new Class2_Sub1_Sub1_Sub4(arg1, 4, 0, local9, local35, local25, local45, local64.anInt2611, true);
					}
					arg0.method605(arg8, arg5, arg4, local55, local504, Static28.anIntArray112[arg7], arg7 * 512, Static92.anIntArray377[arg7] * local466, local466 * Static46.anIntArray193[arg7], local88, local70);
				} else if (arg2 == 6) {
					if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
						local115 = local64.method1613(local45, local9, 0, 4, local25, local35);
					} else {
						local115 = new Class2_Sub1_Sub1_Sub4(arg1, 4, 0, local9, local35, local25, local45, local64.anInt2611, true);
					}
					arg0.method605(arg8, arg5, arg4, local55, local115, 256, arg7, 0, 0, local88, local70);
				} else if (arg2 == 7) {
					if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
						local115 = local64.method1613(local45, local9, 0, 4, local25, local35);
					} else {
						local115 = new Class2_Sub1_Sub1_Sub4(arg1, 4, 0, local9, local35, local25, local45, local64.anInt2611, true);
					}
					arg0.method605(arg8, arg5, arg4, local55, local115, 512, arg7, 0, 0, local88, local70);
				} else if (arg2 == 8) {
					if (local64.anInt2611 == -1 && local64.anIntArray384 == null) {
						local115 = local64.method1613(local45, local9, 0, 4, local25, local35);
					} else {
						local115 = new Class2_Sub1_Sub1_Sub4(arg1, 4, 0, local9, local35, local25, local45, local64.anInt2611, true);
					}
					arg0.method605(arg8, arg5, arg4, local55, local115, 768, arg7, 0, 0, local88, local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIIIII)I")
	public static int method1721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(14) int local14 = arg3;
			arg3 = arg5;
			arg5 = local14;
		}
		if (local7 == 0) {
			return arg4;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return 1 + 7 - arg5 - arg1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method1722() {
		aClass21_34 = null;
		aClass65_1267 = null;
		aClass65_1258 = null;
		aClass65_1269 = null;
		aClass65_1261 = null;
		aClass65_1260 = null;
		aClass65_1270 = null;
		aClass65_1262 = null;
		aClass65_1265 = null;
		aClass65_1266 = null;
		aClass65_1256 = null;
		aClass2_Sub1_Sub4_Sub2Array9 = null;
		aClass65_1264 = null;
		aClass65_1255 = null;
		aClass65_1259 = null;
		aClass65_1257 = null;
		aClass7_6 = null;
		aClass65_1254 = null;
		anIntArray408 = null;
		aClass65_1268 = null;
		aClass65_1271 = null;
		aClass65_1272 = null;
		aClass65_1263 = null;
	}
}

import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "[I")
	public static int[] anIntArray508;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public static int anInt3776 = 0;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][13][13];

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
	public static int[] anIntArray506 = new int[500];

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1439 = Static169.method2903("Players");

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1438 = aClass23_1439;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!n;")
	public static Class56 aClass56_14 = new Class56();

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1440 = Static169.method2903("Choose Option");

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	public static int anInt3783 = 0;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1441 = aClass23_1440;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1442 = Static169.method2903("To create a new account you need to");

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1446 = Static169.method2903("red:");

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1443 = aClass23_1446;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "[I")
	public static int[] anIntArray507 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1444 = aClass23_1446;

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1445 = aClass23_1442;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIZIILclient!qh;ILclient!te;)V")
	public static void method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class69 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class80 arg8) {
		@Pc(9) Class1_Sub1_Sub3 local9 = Static84.method3155(arg1);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (arg4 == 1 || arg4 == 3) {
			local20 = local9.anInt656;
			local23 = local9.anInt657;
		} else {
			local23 = local9.anInt656;
			local20 = local9.anInt657;
		}
		@Pc(42) int local42;
		@Pc(40) int local40;
		if (local20 + arg2 > 104) {
			local40 = arg2 + 1;
			local42 = arg2;
		} else {
			local40 = arg2 + (local20 + 1 >> 1);
			local42 = arg2 + (local20 >> 1);
		}
		@Pc(63) int[][] local63 = Static141.anIntArrayArrayArray3[arg5];
		@Pc(83) int local83;
		@Pc(77) int local77;
		if (arg3 + local23 <= 104) {
			local77 = (local23 + 1 >> 1) + arg3;
			local83 = (local23 >> 1) + arg3;
		} else {
			local83 = arg3;
			local77 = arg3 + 1;
		}
		@Pc(117) int local117 = local63[local83][local40] + local63[local83][local42] + local63[local77][local42] + local63[local77][local40] >> 2;
		@Pc(125) int local125 = (arg3 << 7) + (local23 << 6);
		@Pc(134) int local134 = (arg2 << 7) + (local20 << 6);
		@Pc(140) int local140 = arg0 + (arg4 << 6);
		if (local9.anInt654 == 1) {
			local140 += 256;
		}
		@Pc(157) int local157 = (arg1 << 14) + (arg2 << 7) + arg3 + 1073741824;
		if (local9.anInt655 == 0) {
			local157 += Integer.MIN_VALUE;
		}
		@Pc(184) Class1_Sub1_Sub1 local184;
		if (arg0 == 22) {
			if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
				local184 = local9.method369(local125, arg4, local117, local63, local134, 22);
			} else {
				local184 = new Class1_Sub1_Sub1_Sub5(arg1, 22, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
			}
			arg8.method2691(arg7, arg3, arg2, local117, local184, local157, local140);
			if (local9.anInt644 == 1) {
				arg6.method2405(arg3, arg2);
			}
		} else if (arg0 == 10 || arg0 == 11) {
			if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
				local184 = local9.method369(local125, arg4, local117, local63, local134, 10);
			} else {
				local184 = new Class1_Sub1_Sub1_Sub5(arg1, 10, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
			}
			if (local184 != null) {
				arg8.method2683(arg7, arg3, arg2, local117, local23, local20, local184, arg0 == 11 ? 256 : 0, local157, local140);
			}
			if (local9.anInt644 != 0) {
				arg6.method2403(arg2, local9.aBoolean27, arg3, local23, local20);
			}
		} else if (arg0 >= 12) {
			if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
				local184 = local9.method369(local125, arg4, local117, local63, local134, arg0);
			} else {
				local184 = new Class1_Sub1_Sub1_Sub5(arg1, arg0, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
			}
			arg8.method2683(arg7, arg3, arg2, local117, 1, 1, local184, 0, local157, local140);
			if (local9.anInt644 != 0) {
				arg6.method2403(arg2, local9.aBoolean27, arg3, local23, local20);
			}
		} else if (arg0 == 0) {
			if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
				local184 = local9.method369(local125, arg4, local117, local63, local134, 0);
			} else {
				local184 = new Class1_Sub1_Sub1_Sub5(arg1, 0, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
			}
			arg8.method2689(arg7, arg3, arg2, local117, local184, null, Static162.anIntArray547[arg4], 0, local157, local140);
			if (local9.anInt644 != 0) {
				arg6.method2395(arg4, arg3, arg2, local9.aBoolean27, arg0);
			}
		} else if (arg0 == 1) {
			if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
				local184 = local9.method369(local125, arg4, local117, local63, local134, 1);
			} else {
				local184 = new Class1_Sub1_Sub1_Sub5(arg1, 1, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
			}
			arg8.method2689(arg7, arg3, arg2, local117, local184, null, Static55.anIntArray175[arg4], 0, local157, local140);
			if (local9.anInt644 != 0) {
				arg6.method2395(arg4, arg3, arg2, local9.aBoolean27, arg0);
			}
		} else {
			@Pc(528) Class1_Sub1_Sub1 local528;
			@Pc(499) int local499;
			if (arg0 == 2) {
				local499 = arg4 + 1 & 0x3;
				@Pc(518) Class1_Sub1_Sub1 local518;
				if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
					local518 = local9.method369(local125, arg4 + 4, local117, local63, local134, 2);
					local528 = local9.method369(local125, local499, local117, local63, local134, 2);
				} else {
					local518 = new Class1_Sub1_Sub1_Sub5(arg1, 2, arg4 + 4, arg5, arg3, arg2, local9.anInt651, true, null);
					local528 = new Class1_Sub1_Sub1_Sub5(arg1, 2, local499, arg5, arg3, arg2, local9.anInt651, true, null);
				}
				arg8.method2689(arg7, arg3, arg2, local117, local518, local528, Static162.anIntArray547[arg4], Static162.anIntArray547[local499], local157, local140);
				if (local9.anInt644 != 0) {
					arg6.method2395(arg4, arg3, arg2, local9.aBoolean27, arg0);
				}
			} else if (arg0 == 3) {
				if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
					local184 = local9.method369(local125, arg4, local117, local63, local134, 3);
				} else {
					local184 = new Class1_Sub1_Sub1_Sub5(arg1, 3, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
				}
				arg8.method2689(arg7, arg3, arg2, local117, local184, null, Static55.anIntArray175[arg4], 0, local157, local140);
				if (local9.anInt644 != 0) {
					arg6.method2395(arg4, arg3, arg2, local9.aBoolean27, arg0);
				}
			} else if (arg0 == 9) {
				if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
					local184 = local9.method369(local125, arg4, local117, local63, local134, arg0);
				} else {
					local184 = new Class1_Sub1_Sub1_Sub5(arg1, arg0, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
				}
				arg8.method2683(arg7, arg3, arg2, local117, 1, 1, local184, 0, local157, local140);
				if (local9.anInt644 != 0) {
					arg6.method2403(arg2, local9.aBoolean27, arg3, local23, local20);
				}
			} else if (arg0 == 4) {
				if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
					local184 = local9.method369(local125, arg4, local117, local63, local134, 4);
				} else {
					local184 = new Class1_Sub1_Sub1_Sub5(arg1, 4, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
				}
				arg8.method2666(arg7, arg3, arg2, local117, local184, null, Static162.anIntArray547[arg4], 0, 0, 0, local157, local140);
			} else {
				@Pc(788) int local788;
				if (arg0 == 5) {
					local499 = 16;
					local788 = arg8.method2664(arg7, arg3, arg2);
					if (local788 != 0) {
						local499 = Static84.method3155(local788 >> 14 & 0x7FFF).anInt662;
					}
					if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
						local528 = local9.method369(local125, arg4, local117, local63, local134, 4);
					} else {
						local528 = new Class1_Sub1_Sub1_Sub5(arg1, 4, arg4, arg5, arg3, arg2, local9.anInt651, true, null);
					}
					arg8.method2666(arg7, arg3, arg2, local117, local528, null, Static162.anIntArray547[arg4], 0, local499 * Static20.anIntArray90[arg4], anIntArray507[arg4] * local499, local157, local140);
				} else if (arg0 == 6) {
					local499 = 8;
					local788 = arg8.method2664(arg7, arg3, arg2);
					if (local788 != 0) {
						local499 = Static84.method3155(local788 >> 14 & 0x7FFF).anInt662 / 2;
					}
					if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
						local528 = local9.method369(local125, arg4 + 4, local117, local63, local134, 4);
					} else {
						local528 = new Class1_Sub1_Sub1_Sub5(arg1, 4, arg4 + 4, arg5, arg3, arg2, local9.anInt651, true, null);
					}
					arg8.method2666(arg7, arg3, arg2, local117, local528, null, 256, arg4, local499 * Static51.anIntArray164[arg4], local499 * Static99.anIntArray313[arg4], local157, local140);
				} else if (arg0 == 7) {
					local788 = arg4 + 2 & 0x3;
					if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
						local184 = local9.method369(local125, local788 + 4, local117, local63, local134, 4);
					} else {
						local184 = new Class1_Sub1_Sub1_Sub5(arg1, 4, local788 + 4, arg5, arg3, arg2, local9.anInt651, true, null);
					}
					arg8.method2666(arg7, arg3, arg2, local117, local184, null, 256, local788, 0, 0, local157, local140);
				} else if (arg0 == 8) {
					local788 = arg8.method2664(arg7, arg3, arg2);
					local499 = 8;
					@Pc(1029) int local1029 = arg4 + 2 & 0x3;
					if (local788 != 0) {
						local499 = Static84.method3155(local788 >> 14 & 0x7FFF).anInt662 / 2;
					}
					@Pc(1085) Class1_Sub1_Sub1 local1085;
					if (local9.anInt651 == -1 && local9.anIntArray88 == null) {
						local528 = local9.method369(local125, arg4 + 4, local117, local63, local134, 4);
						local1085 = local9.method369(local125, local1029 + 4, local117, local63, local134, 4);
					} else {
						local528 = new Class1_Sub1_Sub1_Sub5(arg1, 4, arg4 + 4, arg5, arg3, arg2, local9.anInt651, true, null);
						local1085 = new Class1_Sub1_Sub1_Sub5(arg1, 4, local1029 + 4, arg5, arg3, arg2, local9.anInt651, true, null);
					}
					arg8.method2666(arg7, arg3, arg2, local117, local528, local1085, 256, arg4, local499 * Static51.anIntArray164[arg4], Static99.anIntArray313[arg4] * local499, local157, local140);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public static void method2615() {
		aClass56_14 = null;
		aClass23_1445 = null;
		aClass23_1438 = null;
		aClass23_1442 = null;
		aClass23_1439 = null;
		anIntArray507 = null;
		aClass23_1444 = null;
		aClass23_1446 = null;
		aClass23_1441 = null;
		anIntArray508 = null;
		anIntArrayArrayArray5 = null;
		aClass23_1440 = null;
		anIntArray506 = null;
		aClass23_1443 = null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method2616(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static13.method252(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static26.aClass74_1.anApplet1 != null) {
				@Pc(103) Class63 local103 = Static26.aClass74_1.method2485(new URL(Static26.aClass74_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static101.anInt2575 + "&u=" + Static8.aLong10 + "&v1=" + Static143.aString3 + "&v2=" + Static143.aString2 + "&e=" + local7));
				while (local103.anInt3324 == 0) {
					Static35.method583(1L);
				}
				if (local103.anInt3324 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local103.anObject3;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(128) Exception local128) {
		}
	}
}

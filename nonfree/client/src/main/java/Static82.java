import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_12;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
	public static int anInt2568;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!wd;")
	public static Class82 aClass82_9 = new Class82(512);

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1092 = Static59.method1195("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1093 = aClass60_1092;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1094 = Static59.method1195("Nehmen");

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1095 = Static59.method1195("Texturen geladen)3");

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1096 = Static59.method1195("Please try again)3");

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1097 = aClass60_1096;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)Z")
	public static boolean method1654(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method1655() {
		Static79.aClass3_Sub12_Sub1_1.method1979();
		@Pc(19) int local19 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static79.aClass3_Sub12_Sub1_1.method1982(2);
		if (local27 == 0) {
			Static46.anIntArray170[Static74.anInt2399++] = 2047;
			return;
		}
		@Pc(51) int local51;
		@Pc(61) int local61;
		if (local27 == 1) {
			local51 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
			Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.method1016(false, local51);
			local61 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
			if (local61 == 1) {
				Static46.anIntArray170[Static74.anInt2399++] = 2047;
			}
			return;
		}
		@Pc(103) int local103;
		if (local27 == 2) {
			local51 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
			Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.method1016(true, local51);
			local61 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
			Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.method1016(true, local61);
			local103 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
			if (local103 == 1) {
				Static46.anIntArray170[Static74.anInt2399++] = 2047;
			}
		} else if (local27 == 3) {
			local51 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
			Static119.anInt3243 = Static79.aClass3_Sub12_Sub1_1.method1982(2);
			local61 = Static79.aClass3_Sub12_Sub1_1.method1982(7);
			local103 = Static79.aClass3_Sub12_Sub1_1.method1982(7);
			@Pc(145) int local145 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
			if (local145 == 1) {
				Static46.anIntArray170[Static74.anInt2399++] = 2047;
			}
			Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.method1015(local51 == 1, local61, local103);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!qf;")
	public static Class60 method1656(@OriginalArg(0) int arg0) {
		@Pc(3) Class60 local3 = new Class60();
		local3.aByteArray73 = new byte[arg0];
		local3.anInt2817 = 0;
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
	public static void method1657() {
		aClass60_1094 = null;
		anIntArray265 = null;
		aClass60_1097 = null;
		aClass82_9 = null;
		aClass25_Sub1_12 = null;
		aClass60_1095 = null;
		aClass60_1092 = null;
		aClass3_Sub1_Sub2_Sub3_4 = null;
		aClass60_1093 = null;
		aClass60_1096 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!mf;B)Lclient!qf;")
	public static Class60 method1658(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (!Static77.method1569(arg0, Static33.method751(arg1)) && arg1.anObjectArray14 == null) {
			return null;
		} else if (arg1.aClass60Array14 == null || arg1.aClass60Array14.length <= arg0 || arg1.aClass60Array14[arg0] == null || arg1.aClass60Array14[arg0].method1827().method1836() == 0) {
			return Static118.aBoolean116 ? Static60.method1211(new Class60[] { Static46.aClass60_635, Static65.method1341(arg0) }) : null;
		} else {
			return arg1.aClass60Array14[arg0];
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!mf;I)V")
	public static void method1659(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(8) int local8 = arg0.anInt2293;
		@Pc(99) int local99;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static51.anInt1366 == 0) {
				if (local8 == 1) {
					arg0.anInt2269 = 0;
					arg0.aClass60_969 = Static66.aClass60_895;
					return;
				}
				if (local8 == 2) {
					arg0.aClass60_969 = Static2.aClass60_66;
					arg0.anInt2269 = 0;
					return;
				}
			}
			if (Static51.anInt1366 == 1) {
				if (local8 == 1) {
					arg0.anInt2269 = 0;
					arg0.aClass60_969 = Static83.aClass60_1110;
					return;
				}
				if (local8 == 2) {
					arg0.aClass60_969 = Static2.aClass60_56;
					arg0.anInt2269 = 0;
					return;
				}
				if (local8 == 3) {
					arg0.anInt2269 = 0;
					arg0.aClass60_969 = Static39.aClass60_529;
					return;
				}
			}
			if (local8 > 700) {
				local8 -= 601;
			} else {
				local8--;
			}
			local99 = Static61.anInt1946;
			if (Static51.anInt1366 != 2) {
				local99 = 0;
			}
			if (local99 <= local8) {
				arg0.anInt2269 = 0;
				arg0.aClass60_969 = Static120.aClass60_1369;
			} else {
				arg0.aClass60_969 = Static54.aClass60Array6[local8];
				arg0.anInt2269 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local99 = Static61.anInt1946;
			if (Static51.anInt1366 != 2) {
				local99 = 0;
			}
			if (local8 >= local99) {
				arg0.anInt2269 = 0;
				arg0.aClass60_969 = Static120.aClass60_1369;
			} else {
				if (Static41.anIntArray159[local8] == 0) {
					arg0.aClass60_969 = Static60.method1211(new Class60[] { Static66.aClass60_896, Static64.aClass60_885 });
				} else if (Static41.anIntArray159[local8] >= 5000) {
					if (Static41.anIntArray159[local8] == Static46.anInt1445) {
						arg0.aClass60_969 = Static60.method1211(new Class60[] { Static96.aClass60_1184, Static61.aClass60_850, Static65.method1341(Static41.anIntArray159[local8] - 5000) });
					} else {
						arg0.aClass60_969 = Static60.method1211(new Class60[] { Static72.aClass60_976, Static61.aClass60_850, Static65.method1341(Static41.anIntArray159[local8] - 5000) });
					}
				} else if (Static46.anInt1445 == Static41.anIntArray159[local8]) {
					arg0.aClass60_969 = Static60.method1211(new Class60[] { Static96.aClass60_1184, Static74.aClass60_1015, Static65.method1341(Static41.anIntArray159[local8]) });
				} else {
					arg0.aClass60_969 = Static60.method1211(new Class60[] { Static72.aClass60_976, Static74.aClass60_1015, Static65.method1341(Static41.anIntArray159[local8]) });
				}
				arg0.anInt2269 = 1;
			}
		} else if (local8 == 203) {
			local99 = Static61.anInt1946;
			if (Static51.anInt1366 != 2) {
				local99 = 0;
			}
			arg0.anInt2284 = local99 * 15 + 20;
			if (arg0.anInt2284 <= arg0.anInt2270) {
				arg0.anInt2284 = arg0.anInt2270 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static51.anInt1366 == 0) {
				arg0.aClass60_969 = Static43.aClass60_625;
				arg0.anInt2269 = 0;
			} else if (local8 == 1 && Static51.anInt1366 == 0) {
				arg0.aClass60_969 = Static2.aClass60_66;
				arg0.anInt2269 = 0;
			} else {
				local99 = Static107.anInt3035;
				if (Static51.anInt1366 == 0) {
					local99 = 0;
				}
				if (local8 >= local99) {
					arg0.anInt2269 = 0;
					arg0.aClass60_969 = Static120.aClass60_1369;
				} else {
					arg0.aClass60_969 = Static97.method1821(Static113.aLongArray5[local8]).method1866();
					arg0.anInt2269 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt2284 = Static107.anInt3035 * 15 + 20;
			if (arg0.anInt2284 <= arg0.anInt2270) {
				arg0.anInt2284 = arg0.anInt2270 + 1;
			}
		} else if (local8 == 324) {
			if (Static12.anInt377 == -1) {
				Static12.anInt377 = arg0.anInt2299;
				Static13.anInt400 = arg0.anInt2256;
			}
			if (Static65.aClass50_2.aBoolean90) {
				arg0.anInt2299 = Static12.anInt377;
			} else {
				arg0.anInt2299 = Static13.anInt400;
			}
		} else if (local8 == 325) {
			if (Static12.anInt377 == -1) {
				Static13.anInt400 = arg0.anInt2256;
				Static12.anInt377 = arg0.anInt2299;
			}
			if (Static65.aClass50_2.aBoolean90) {
				arg0.anInt2299 = Static13.anInt400;
			} else {
				arg0.anInt2299 = Static12.anInt377;
			}
		} else if (local8 == 327) {
			arg0.anInt2259 = 150;
			arg0.anInt2302 = (int) (Math.sin((double) Static34.anInt1183 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2267 = 5;
			arg0.anInt2279 = 0;
		} else if (local8 == 328) {
			arg0.anInt2259 = 150;
			arg0.anInt2302 = (int) (Math.sin((double) Static34.anInt1183 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2267 = 5;
			arg0.anInt2279 = 1;
		} else if (local8 == 600) {
			arg0.aClass60_969 = Static60.method1211(new Class60[] { Static120.aClass60_1373, Static32.aClass60_431 });
		} else if (local8 == 620) {
			if (Static97.anInt2774 < 1) {
				arg0.aClass60_969 = Static120.aClass60_1369;
			} else if (Static3.aBoolean4) {
				arg0.aClass60_969 = Static93.aClass60_1163;
				arg0.anInt2272 = 16711680;
			} else {
				arg0.anInt2272 = 16777215;
				arg0.aClass60_969 = Static12.aClass60_159;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1660(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString1 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local10 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(88) String local88 = local64.substring(local70 + 1, local77);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local10 = local10 + local88 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] aClass5_Sub2_Sub1_Sub3Array7;

	@OriginalMember(owner = "client!bf", name = "Mb", descriptor = "I")
	public static int anInt336;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!r;")
	private static Class61 aClass61_105 = Static129.method2060("wishes to trade with you)3");

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
	public static int anInt302 = 0;

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "[I")
	public static int[] anIntArray57 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!bf", name = "Zb", descriptor = "Lclient!r;")
	private static Class61 aClass61_116 = Static129.method2060("Login");

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "Lclient!r;")
	public static Class61 aClass61_106 = aClass61_116;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "Lclient!r;")
	public static Class61 aClass61_107 = aClass61_105;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lclient!r;")
	public static Class61 aClass61_108 = Static129.method2060("mapback");

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
	public static int anInt308 = 0;

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "Lclient!r;")
	private static Class61 aClass61_109 = Static129.method2060("Connection lost)3");

	@OriginalMember(owner = "client!bf", name = "Ob", descriptor = "Lclient!r;")
	private static Class61 aClass61_115 = Static129.method2060("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "Lclient!r;")
	public static Class61 aClass61_110 = aClass61_115;

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_111 = aClass61_109;

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
	public static int anInt323 = 0;

	@OriginalMember(owner = "client!bf", name = "yb", descriptor = "Lclient!r;")
	public static Class61 aClass61_112 = Static129.method2060(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "[I")
	public static int[] anIntArray68 = new int[5];

	@OriginalMember(owner = "client!bf", name = "Cb", descriptor = "Lclient!r;")
	public static Class61 aClass61_113 = Static129.method2060("hitmarks");

	@OriginalMember(owner = "client!bf", name = "Gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_114 = Static129.method2060("sch-Utteln:");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method234() {
		aClass61_114 = null;
		aClass61_105 = null;
		anIntArray68 = null;
		aClass61_112 = null;
		aClass61_108 = null;
		aClass61_106 = null;
		aClass61_107 = null;
		anIntArray57 = null;
		aClass5_Sub2_Sub1_Sub3Array7 = null;
		aClass61_111 = null;
		aClass61_113 = null;
		aClass61_109 = null;
		aClass61_110 = null;
		aClass61_116 = null;
		aClass61_115 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method235(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(26) String local26;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			local26 = local16.aString2 + " | ";
			arg0 = local16.aThrowable1;
		} else {
			local26 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local26 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local26 = local26 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local26 = local26 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)Z")
	public static boolean method238(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	public static void method242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) Static112.aClass58_64.method1669(); local6 != null; local6 = (Class5_Sub3) Static112.aClass58_64.method1664()) {
			if (local6.anInt217 != -1 || local6.anIntArray51 != null) {
				@Pc(17) int local17 = 0;
				if (local6.anInt226 < arg3) {
					local17 = arg3 - local6.anInt226;
				} else if (local6.anInt219 > arg3) {
					local17 = local6.anInt219 - arg3;
				}
				if (local6.anInt218 < arg1) {
					local17 += arg1 - local6.anInt218;
				} else if (local6.anInt222 > arg1) {
					local17 += local6.anInt222 - arg1;
				}
				if (local6.anInt224 < local17 - 64 || Static82.anInt2264 == 0 || arg2 != local6.anInt214) {
					if (local6.aClass5_Sub5_Sub2_2 != null) {
						Static85.aClass5_Sub5_Sub4_2.method1569(local6.aClass5_Sub5_Sub2_2);
						local6.aClass5_Sub5_Sub2_2 = null;
					}
					if (local6.aClass5_Sub5_Sub2_1 != null) {
						Static85.aClass5_Sub5_Sub4_2.method1569(local6.aClass5_Sub5_Sub2_1);
						local6.aClass5_Sub5_Sub2_1 = null;
					}
				} else {
					local17 -= 64;
					if (local17 < 0) {
						local17 = 0;
					}
					@Pc(130) int local130 = (local6.anInt224 - local17) * Static82.anInt2264 / local6.anInt224;
					if (local6.aClass5_Sub5_Sub2_2 != null) {
						local6.aClass5_Sub5_Sub2_2.method810(local130);
					} else if (local6.anInt217 >= 0) {
						@Pc(148) Class53 local148 = Static138.method1537(Static82.aClass26_Sub1_15, local6.anInt217, 0);
						if (local148 != null) {
							@Pc(155) Class5_Sub21_Sub1 local155 = local148.method1538().method1700(Static115.aClass9_1);
							@Pc(160) Class5_Sub5_Sub2 local160 = Static135.method832(local155, local130);
							local160.method831(-1);
							Static85.aClass5_Sub5_Sub4_2.method1563(local160);
							local6.aClass5_Sub5_Sub2_2 = local160;
						}
					}
					if (local6.aClass5_Sub5_Sub2_1 != null) {
						local6.aClass5_Sub5_Sub2_1.method810(local130);
						if (!local6.aClass5_Sub5_Sub2_1.method2187()) {
							local6.aClass5_Sub5_Sub2_1 = null;
						}
					} else if (local6.anIntArray51 != null && (local6.anInt220 -= arg0) <= 0) {
						@Pc(208) int local208 = (int) ((double) local6.anIntArray51.length * Math.random());
						@Pc(216) Class53 local216 = Static138.method1537(Static82.aClass26_Sub1_15, local6.anIntArray51[local208], 0);
						if (local216 != null) {
							@Pc(223) Class5_Sub21_Sub1 local223 = local216.method1538().method1700(Static115.aClass9_1);
							@Pc(228) Class5_Sub5_Sub2 local228 = Static135.method832(local223, local130);
							local228.method831(0);
							Static85.aClass5_Sub5_Sub4_2.method1563(local228);
							local6.anInt220 = (int) ((double) (local6.anInt215 - local6.anInt216) * Math.random()) + local6.anInt216;
							local6.aClass5_Sub5_Sub2_1 = local228;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(JZ)V")
	public static void method257(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static45.anInt1203 >= 100 && Static40.anInt1075 != 1 || Static45.anInt1203 >= 200) {
			Static91.method1596(Static96.aClass61_746, Static48.aClass61_378, 0);
			return;
		}
		@Pc(35) Class61 local35 = Static111.method1831(arg0).method1701();
		for (@Pc(42) int local42 = 0; local42 < Static45.anInt1203; local42++) {
			if (Static70.aLongArray4[local42] == arg0) {
				Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { local35, Static124.aClass61_977 }), 0);
				return;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < Static114.anInt2962; local81++) {
			if (arg0 == Static68.aLongArray3[local81]) {
				Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { Static87.aClass61_687, local35, Static52.aClass61_426 }), 0);
				return;
			}
		}
		if (local35.method1736(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass61_877)) {
			Static91.method1596(Static96.aClass61_746, Static75.aClass61_553, 0);
			return;
		}
		Static1.aClass61Array1[Static45.anInt1203] = local35;
		Static70.aLongArray4[Static45.anInt1203] = arg0;
		Static109.anIntArray339[Static45.anInt1203] = 0;
		Static99.anIntArray327[Static45.anInt1203] = 0;
		Static95.anInt2443 = Static66.anInt1592;
		Static45.anInt1203++;
		Static1.aClass5_Sub14_Sub1_1.method1489(98);
		Static1.aClass5_Sub14_Sub1_1.method1464(arg0);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "[Lclient!su;")
	public static Class224[] aClass224Array1;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
	public static int anInt724 = 0;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "S")
	public static short aShort24 = 1;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
	public static int anInt731 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method578(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString16 + " | ";
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
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local10 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(80) String local80;
			if (local65 == -1) {
				local80 = local59;
			} else {
				local80 = local59.substring(0, local65);
			}
			local80 = local80.trim();
			local80 = local80.substring(local80.lastIndexOf(32) + 1);
			local80 = local80.substring(local80.lastIndexOf(9) + 1);
			local10 = local10 + local80;
			if (local65 != -1 && local72 != -1) {
				@Pc(125) int local125 = local59.indexOf(".java:", local65);
				if (local125 >= 0) {
					local10 = local10 + local59.substring(local125 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
	public static void method579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 < arg0) {
			Static335.method4533(arg0, arg1, arg3, Static162.anIntArrayArray58[arg2]);
		} else {
			Static335.method4533(arg3, arg1, arg0, Static162.anIntArrayArray58[arg2]);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method580(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method581(@OriginalArg(0) Class30 arg0) {
		@Pc(7) int local7 = Static104.anInt2229;
		@Pc(9) int local9 = Static171.anInt3173;
		@Pc(11) int local11 = Static346.anInt6292;
		@Pc(15) int local15 = Static434.anInt7227 - 3;
		if (Static414.aClass3_24 == null || Static157.aClass3_9 == null) {
			if (Static149.aClass166_105.method3670(Static280.anInt4897) && Static149.aClass166_105.method3670(Static94.anInt2045)) {
				Static414.aClass3_24 = arg0.method4656(Static464.method4782(Static149.aClass166_105, Static280.anInt4897, 0));
				@Pc(48) Class205 local48 = Static464.method4782(Static149.aClass166_105, Static94.anInt2045, 0);
				Static157.aClass3_9 = arg0.method4656(local48);
				local48.method4786();
				Static105.aClass3_6 = arg0.method4656(local48);
			} else {
				arg0.NA(local7, local9, local11, 20, 255 - Static129.anInt2585 << 24 | Static371.anInt6554, 1);
			}
		}
		@Pc(94) int local94;
		@Pc(92) int local92;
		if (Static414.aClass3_24 != null && Static157.aClass3_9 != null) {
			local92 = (local11 - Static157.aClass3_9.UA() * 2) / Static414.aClass3_24.UA();
			for (local94 = 0; local94 < local92; local94++) {
				Static414.aClass3_24.method5877(local7 + Static157.aClass3_9.UA() + local94 * Static414.aClass3_24.UA(), local9);
			}
			Static157.aClass3_9.method5877(local7, local9);
			Static105.aClass3_6.method5877(local7 + local11 - Static105.aClass3_6.UA(), local9);
		}
		Static245.aClass105_4.method5600(Static379.aClass242_95.method5320(Static139.anInt2670), Static45.anInt1299 | 0xFF000000, local7 + 3, -1, local9 - -14);
		arg0.NA(local7, local9 + 20, local11, local15 - 20, Static371.anInt6554 | -Static129.anInt2585 + 255 << 24, 1);
		local92 = Static284.aClass12_1.method4220();
		local94 = Static284.aClass12_1.method4219();
		@Pc(177) int local177 = 0;
		@Pc(199) int local199;
		for (@Pc(182) Class4_Sub21 local182 = (Class4_Sub21) Static126.aClass258_19.method5538(); local182 != null; local182 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
			local199 = (Static83.anInt1893 - local177 - 1) * 16 + local9 + 13 + 20;
			if (local92 > local7 && local7 + local11 > local92 && local94 > local199 - 13 && local199 + 4 > local94 && local182.aBoolean218) {
				arg0.NA(local7, local199 - 12, local11, 16, Static342.anInt6166 | 255 - Static162.anInt6355 << 24, 1);
			}
			local177++;
		}
		if ((Static362.aClass3_20 == null || Static133.aClass3_7 == null || Static277.aClass3_14 == null) && Static149.aClass166_105.method3670(Static442.anInt7380) && Static149.aClass166_105.method3670(Static174.anInt3240) && Static149.aClass166_105.method3670(Static153.anInt2913)) {
			@Pc(279) Class205 local279 = Static464.method4782(Static149.aClass166_105, Static174.anInt3240, 0);
			Static133.aClass3_7 = arg0.method4656(local279);
			local279.method4786();
			Static345.aClass3_19 = arg0.method4656(local279);
			Static362.aClass3_20 = arg0.method4656(Static464.method4782(Static149.aClass166_105, Static442.anInt7380, 0));
			@Pc(304) Class205 local304 = Static464.method4782(Static149.aClass166_105, Static153.anInt2913, 0);
			Static277.aClass3_14 = arg0.method4656(local304);
			local304.method4786();
			Static314.aClass3_15 = arg0.method4656(local304);
		}
		@Pc(370) int local370;
		@Pc(334) int local334;
		if (Static362.aClass3_20 != null && Static133.aClass3_7 != null && Static277.aClass3_14 != null) {
			local199 = (local11 - Static277.aClass3_14.UA() * 2) / Static362.aClass3_20.UA();
			for (local334 = 0; local334 < local199; local334++) {
				Static362.aClass3_20.method5877(local7 + Static277.aClass3_14.UA() + Static362.aClass3_20.UA() * local334, local15 + local9 - Static362.aClass3_20.qa());
			}
			local370 = (local15 - Static277.aClass3_14.qa() - 20) / Static133.aClass3_7.qa();
			for (@Pc(372) int local372 = 0; local372 < local370; local372++) {
				Static133.aClass3_7.method5877(local7, Static133.aClass3_7.qa() * local372 + local9 + 20);
				Static345.aClass3_19.method5877(local7 + local11 - Static345.aClass3_19.UA(), Static133.aClass3_7.qa() * local372 + (local9 - -20));
			}
			Static277.aClass3_14.method5877(local7, local9 + local15 - Static277.aClass3_14.qa());
			Static314.aClass3_15.method5877(local11 + local7 - Static277.aClass3_14.UA(), -Static277.aClass3_14.qa() + local15 + local9);
		}
		local177 = 0;
		for (@Pc(440) Class4_Sub21 local440 = (Class4_Sub21) Static126.aClass258_19.method5538(); local440 != null; local440 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
			local334 = local9 + (-local177 + Static83.anInt1893 + -1) * 16 + 33;
			local370 = Static45.anInt1299 | 0xFF000000;
			if (local7 < local92 && local7 + local11 > local92 && local334 - 13 < local94 && local94 < local334 + 4 && local440.aBoolean218) {
				local370 = Static237.anInt4356 | 0xFF000000;
			}
			@Pc(503) int[] local503 = null;
			if (Static390.method5265(local440.anInt3041)) {
				local503 = Static390.aClass204_2.method4629((int) local440.aLong82).anIntArray292;
			} else if (local440.anInt3046 != -1) {
				local503 = Static390.aClass204_2.method4629(local440.anInt3046).anIntArray292;
			} else if (Static41.method736(local440.anInt3041)) {
				@Pc(532) Class6_Sub2_Sub1_Sub2 local532 = Static176.aClass6_Sub2_Sub1_Sub2Array1[(int) local440.aLong82];
				if (local532 != null) {
					@Pc(537) Class243 local537 = local532.aClass243_1;
					if (local537.anIntArray613 != null) {
						local537 = local537.method5337(Static155.aClass149_1);
					}
					if (local537 != null) {
						local503 = local537.anIntArray610;
					}
				}
			} else if (Static286.method4000(local440.anInt3041)) {
				@Pc(573) Class71 local573;
				if (local440.anInt3041 == 1006) {
					local573 = Static2.aClass74_13.method1683((int) local440.aLong82);
				} else {
					local573 = Static2.aClass74_13.method1683((int) (local440.aLong82 >>> 32 & 0x7FFFFFFFL));
				}
				if (local573.anIntArray138 != null) {
					local573 = local573.method1626(Static155.aClass149_1);
				}
				if (local573 != null) {
					local503 = local573.anIntArray141;
				}
			}
			@Pc(607) String local607 = Static381.method5199(local440);
			if (local503 != null) {
				local607 = local607 + Static54.method5870(local503);
			}
			Static245.aClass105_4.method5606(local334, local607, local7 + 3, Static429.anIntArray630, Static208.aClass3Array9, local370);
			if (local440.aBoolean217) {
				Static241.aClass3_13.method5877(local7 + Static266.aClass215_8.method4976(local607) + 5, local334 + -12);
			}
			local177++;
		}
		Static19.method436(Static104.anInt2229, Static171.anInt3173, Static346.anInt6292, Static434.anInt7227);
	}
}

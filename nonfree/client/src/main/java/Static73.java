import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	public static int anInt1390 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method1116() {
		Static218.aClass26_27.method328();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)V")
	public static void method1121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static102.aClass114_3.method2472(Static349.aClass117_118.method2684(Static230.anInt4634));
		@Pc(26) int local26;
		for (@Pc(20) Class11_Sub14 local20 = (Class11_Sub14) Static119.aClass16_21.method193(); local20 != null; local20 = (Class11_Sub14) Static119.aClass16_21.method188()) {
			local26 = Static110.method3645(local20);
			if (local26 > local15) {
				local15 = local26;
			}
		}
		local15 += 8;
		local26 = Static13.anInt245 * 16 + 21;
		@Pc(56) int local56 = arg1 - local15 / 2;
		if (Static164.anInt3090 < local15 + local56) {
			local56 = Static164.anInt3090 - local15;
		}
		if (local56 < 0) {
			local56 = 0;
		}
		@Pc(79) int local79 = arg0;
		if (Static79.anInt5259 < arg0 + local26) {
			local79 = Static79.anInt5259 - local26;
		}
		Static204.anInt4174 = local56;
		if (local79 < 0) {
			local79 = 0;
		}
		Static45.anInt880 = (Static206.aBoolean282 ? 26 : 22) + Static13.anInt245 * 16;
		Static101.anInt1790 = local15;
		Static38.aBoolean40 = true;
		Static24.anInt452 = local79;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1122(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static313.aClass11_Sub25_Sub1_5.method2454(200);
			Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(arg0));
			Static313.aClass11_Sub25_Sub1_5.method5173(arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)I")
	public static int method1123(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return (arg0 & 0xFF80) + local37;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(CI)Z")
	public static boolean method1124(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1125(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString1 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local45));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local24 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(89) String local89;
			if (local73 == -1) {
				local89 = local67;
			} else {
				local89 = local67.substring(0, local73);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local24 = local24 + local89;
			if (local73 != -1 && local80 != -1) {
				@Pc(134) int local134 = local67.indexOf(".java:", local73);
				if (local134 >= 0) {
					local24 = local24 + local67.substring(local134 + 5, local80);
				}
			}
			local24 = local24 + ' ';
		}
	}
}

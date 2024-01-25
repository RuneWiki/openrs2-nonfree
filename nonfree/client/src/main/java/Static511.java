import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method7083(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString102 + " | ";
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
			@Pc(77) String local77;
			if (local65 == -1) {
				local77 = local59;
			} else {
				local77 = local59.substring(0, local65);
			}
			local77 = local77.trim();
			local77 = local77.substring(local77.lastIndexOf(32) + 1);
			local77 = local77.substring(local77.lastIndexOf(9) + 1);
			local10 = local10 + local77;
			if (local65 != -1 && local72 != -1) {
				@Pc(124) int local124 = local59.indexOf(".java:", local65);
				if (local124 >= 0) {
					local10 = local10 + local59.substring(local124 + 5, local72);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7084(@OriginalArg(1) String arg0) {
		return Static402.method5872(qn.class, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!hs;)I")
	public static int method7086(@OriginalArg(1) Class138 arg0) {
		if (Static185.aClass138_3 == arg0) {
			return 5890;
		} else if (arg0 == Static89.aClass138_1) {
			return 34167;
		} else if (Static457.aClass138_4 == arg0) {
			return 34168;
		} else if (arg0 == Static113.aClass138_2) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;")
	public static String method7087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(21) String local21 = arg2[arg1];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg1 + arg0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg1; local36 < local32; local36++) {
				@Pc(42) String local42 = arg2[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(61) StringBuffer local61 = new StringBuffer(local34);
			for (@Pc(63) int local63 = arg1; local63 < local32; local63++) {
				@Pc(69) String local69 = arg2[local63];
				if (local69 == null) {
					local61.append("null");
				} else {
					local61.append(local69);
				}
			}
			return local61.toString();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method7089(@OriginalArg(0) Class14 arg0) {
		Static319.aClass92_11 = Static486.method6666(true, arg0, Static84.anInt1707);
		Static435.aClass327_10 = Static585.method7761(Static84.anInt1707, arg0);
		Static101.aClass92_9 = Static486.method6666(true, arg0, Static67.anInt1401);
		Static8.aClass327_1 = Static585.method7761(Static67.anInt1401, arg0);
		Static114.aClass92_4 = Static486.method6666(true, arg0, Static573.anInt9405);
		Static555.aClass327_13 = Static585.method7761(Static573.anInt9405, arg0);
	}
}

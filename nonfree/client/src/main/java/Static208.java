import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1509 = Static161.method2452("Spieler");

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public static int anInt4081 = 0;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1510 = Static161.method2452(" loggt sich aus)3");

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1511 = Static161.method2452(" <col=00ff80>");

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	public static int anInt4083 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
	public static int method3105(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub2_Sub14 local12 = Static201.method1365(arg0);
		@Pc(15) int local15 = local12.anInt2783;
		@Pc(18) int local18 = local12.anInt2778;
		@Pc(25) int local25 = Class5_Sub1_Sub20.anIntArray209[local18 - local15];
		@Pc(28) int local28 = local12.anInt2779;
		return local25 & Static139.anIntArray309[local28] >> local15;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)V")
	public static void method3109(@OriginalArg(0) int arg0) {
		if (Static96.anInt2013 == arg0) {
			return;
		}
		if (Static96.anInt2013 == 0) {
			Static60.method1020();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static26.anInt3997 = 0;
			Static28.anInt534 = 0;
			Static41.anInt927 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static180.aClass39_4 != null) {
			Static180.aClass39_4.method1175();
			Static180.aClass39_4 = null;
		}
		if (Static96.anInt2013 == 25) {
			Static80.anInt1807 = 0;
			Static137.anInt2874 = 0;
			Static4.anInt106 = 1;
			Static52.anInt1112 = 0;
			Static65.anInt1418 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static171.method2623(Static141.aClass23_Sub1_20, Static186.aClass23_Sub1_26, Static198.aCanvas1);
		} else {
			Static58.method1001();
		}
		Static96.anInt2013 = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method3110(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString6 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(53) String local53 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local10 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(94) String local94 = local67.substring(local73 + 1, local80);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local10 = local10 + local94 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local10 = local10 + local67 + ' ';
			}
		}
	}
}

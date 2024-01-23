import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!cg;")
	public static Class22 aClass22_58;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	public static int anInt3284;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	public static int anInt3279 = 0;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public static int anInt3283 = 64;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString115 = null;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public static void method2578() {
		Static11.method228();
		Static245.method3786();
		Static284.method4446();
		Static20.method2335();
		Static284.method4445();
		Static22.method454();
		Static22.method459();
		Static288.method4503();
		Static248.method3803();
		Static81.method1392();
		Static291.method4529();
		Static297.method4134();
		Static208.method3287();
		Static33.method647();
		Static186.method2982();
		Static154.method2515();
		Static46.method930();
		Static2.method9();
		if (Static29.anInt630 != 0) {
			for (@Pc(55) int local55 = 0; local55 < Static65.aByteArrayArray16.length; local55++) {
				Static65.aByteArrayArray16[local55] = null;
			}
			Static15.anInt320 = 0;
		}
		Static125.method2042();
		Static114.method1916();
		Static138.method2224();
		Static245.method3788();
		Static246.aClass172_40.method4350();
		if (!Static251.aBoolean330) {
			((Class95_Sub1) Static283.anInterface1_1).method2450();
		}
		Static107.aClass111_6.method2889();
		Static75.aClass22_29.method678();
		Static101.aClass22_33.method678();
		Static182.aClass22_64.method678();
		Static137.aClass22_47.method678();
		Static296.aClass22_105.method678();
		Static145.aClass22_101.method678();
		Static80.aClass22_31.method678();
		Static60.aClass22_26.method678();
		Static155.aClass22_57.method678();
		Static140.aClass22_48.method678();
		Static269.aClass22_95.method678();
		Static7.aClass172_1.method4350();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2580(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static23.method525(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2581(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local6 = local11.aString29 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local6 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local53.readLine();
		while (true) {
			@Pc(64) String local64 = local53.readLine();
			if (local64 == null) {
				return local6 + "| " + local61;
			}
			@Pc(72) int local72 = local64.indexOf(40);
			@Pc(79) int local79 = local64.indexOf(41, local72 + 1);
			@Pc(84) String local84;
			if (local72 == -1) {
				local84 = local64;
			} else {
				local84 = local64.substring(0, local72);
			}
			local84 = local84.trim();
			local84 = local84.substring(local84.lastIndexOf(32) + 1);
			local84 = local84.substring(local84.lastIndexOf(9) + 1);
			local6 = local6 + local84;
			if (local72 != -1 && local79 != -1) {
				@Pc(133) int local133 = local64.indexOf(".java:", local72);
				if (local133 >= 0) {
					local6 = local6 + local64.substring(local133 + 5, local79);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public static void method2582() {
		Static94.aClass172_17.method4349(5);
		Static70.aClass172_12.method4349(5);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)Lclient!ba;")
	public static Class4_Sub2_Sub2 method2583(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub2 local10 = (Class4_Sub2_Sub2) Static198.aClass111_15.method2890((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static240.aClass22_45.method665(Static95.method1567(arg0), Static151.method2390(arg0));
		local10 = new Class4_Sub2_Sub2();
		if (local30 != null) {
			local10.method312(new Class4_Sub24(local30));
		}
		Static198.aClass111_15.method2886((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!u;)I")
	public static int method2584(@OriginalArg(1) Class13_Sub5_Sub2 arg0) {
		@Pc(8) Class185 local8 = arg0.aClass185_1;
		if (local8.anIntArray466 != null) {
			local8 = local8.method4658();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt5772;
		@Pc(32) Class33 local32 = arg0.method4212();
		if (arg0.anInt5307 == local32.anInt1156) {
			local28 = local8.anInt5789;
		} else if (local32.anInt1139 == arg0.anInt5307 || arg0.anInt5307 == local32.anInt1142 || arg0.anInt5307 == local32.anInt1140 || arg0.anInt5307 == local32.anInt1135) {
			local28 = local8.anInt5804;
		} else if (local32.anInt1157 == arg0.anInt5307 || local32.anInt1160 == arg0.anInt5307 || arg0.anInt5307 == local32.anInt1130 || local32.anInt1153 == arg0.anInt5307) {
			local28 = local8.anInt5781;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	public static void method2585() {
		Static30.aClass17_4 = new Class17();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!cg;ZII)Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 method2586(@OriginalArg(0) Class22 arg0, @OriginalArg(3) int arg1) {
		return Static225.method3549(0, arg0, arg1) ? Static74.method1262() : null;
	}
}

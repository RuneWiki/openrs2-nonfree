import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!f;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!we;")
	public static Class5_Sub1_Sub10_Sub4 aClass5_Sub1_Sub10_Sub4_2;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_546 = Static38.method736("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_547 = Static38.method736("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "[I")
	public static int[] anIntArray119 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method711(@OriginalArg(1) Class24 arg0) {
		Static118.aClass24_25 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method712() {
		aClass23_1 = null;
		aClass71_546 = null;
		aClass71_547 = null;
		aClass5_Sub1_Sub10_Sub4_2 = null;
		anIntArray119 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method713() {
		Static53.method971();
		if (Static9.anInt298 == 1) {
			Static19.aClass5_Sub1_Sub10_Sub3Array4[Static46.anInt1117 / 100].method1862(Static115.anInt2742 - 8 - 4, Static66.anInt1650 + -4 - 8);
		}
		if (Static9.anInt298 == 2) {
			Static19.aClass5_Sub1_Sub10_Sub3Array4[Static46.anInt1117 / 100 + 4].method1862(Static115.anInt2742 - 4 - 8, Static66.anInt1650 + -12);
		}
		if (Static56.anInt1451 != -1) {
			Static72.method1207(Static56.anInt1451);
			Static23.method549(512, 334, 4, Static56.anInt1451);
		}
		if (Static47.anInt1298 != -1) {
			Static72.method1207(Static47.anInt1298);
			Static23.method549(512, 334, 0, Static47.anInt1298);
		}
		Static30.method589();
		if (!Static65.aBoolean71) {
			Static1.method12();
			Static40.method539();
		} else if (Static90.anInt2998 == 0) {
			Static89.method1412();
		}
		if (Static119.anInt2958 == 1) {
			Static27.aClass5_Sub1_Sub10_Sub3_15.method1862(472, 296);
		}
		@Pc(138) int local138;
		if (Static89.aBoolean99) {
			@Pc(118) byte local118 = 20;
			Static64.aClass5_Sub1_Sub10_Sub4_6.method2037(Static74.method677(new Class71[] { Static78.aClass71_522, Static51.method962(Static69.anInt1698) }), 20, 16776960);
			local138 = local118 + 15;
			@Pc(140) int local140 = 16776960;
			@Pc(142) Runtime local142 = Runtime.getRuntime();
			@Pc(151) int local151 = (int) ((local142.totalMemory() - local142.freeMemory()) / 1024L);
			if (local151 > 32768 && Static21.aBoolean28) {
				local140 = 16711680;
			}
			if (local151 > 65536 && !Static21.aBoolean28) {
				local140 = 16711680;
			}
			Static64.aClass5_Sub1_Sub10_Sub4_6.method2037(Static74.method677(new Class71[] { Static81.aClass71_989, Static51.method962(local151), Static1.aClass71_10 }), 35, local140);
			local138 += 15;
			if (Static54.aBoolean56) {
				Static64.aClass5_Sub1_Sub10_Sub4_6.method2037(Static18.aClass71_346, 50, 16711680);
				local138 += 15;
				Static54.aBoolean56 = false;
			}
			if (Static78.aBoolean42) {
				Static64.aClass5_Sub1_Sub10_Sub4_6.method2037(Static24.aClass71_421, local138, 16711680);
				local138 += 15;
				Static78.aBoolean42 = false;
			}
			if (Static57.aBoolean61) {
				Static64.aClass5_Sub1_Sub10_Sub4_6.method2037(Static16.aClass71_322, local138, 16711680);
				local138 += 15;
				Static57.aBoolean61 = false;
			}
		}
		if (Static42.anInt1083 == 0) {
			return;
		}
		@Pc(235) int local235 = Static42.anInt1083 / 50;
		local138 = local235 / 60;
		@Pc(243) int local243 = local235 % 60;
		if (local243 >= 10) {
			Static64.aClass5_Sub1_Sub10_Sub4_6.method2033(Static74.method677(new Class71[] { Static66.aClass71_820, Static51.method962(local138), Static77.aClass71_938, Static51.method962(local243) }), 4, 329, 16776960);
		} else {
			Static64.aClass5_Sub1_Sub10_Sub4_6.method2033(Static74.method677(new Class71[] { Static66.aClass71_820, Static51.method962(local138), Static71.aClass71_854, Static51.method962(local243) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method714(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString4 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
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
					return local21 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local21 = local21 + local94 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local21 = local21 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method715() {
		if (Static116.aClass35_3 != null) {
			Static116.aClass35_3.method961();
		}
	}
}

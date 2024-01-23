import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_6;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2715(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static116.aClass1_Sub13_Sub1_48.method1887(64);
		Static116.aClass1_Sub13_Sub1_48.method1820(arg0);
		Static116.aClass1_Sub13_Sub1_48.method1821(Static282.method4276(arg1));
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIII)V")
	public static void method2716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static114.anInt2348 < 100) {
			Static214.method1171();
		}
		if (Static71.aBoolean165) {
			Static93.method1772(arg0, arg3, arg2 + arg0, arg3 - -arg1);
		} else {
			Static77.method1587(arg0, arg3, arg2 + arg0, arg3 - -arg1);
		}
		@Pc(47) int local47;
		@Pc(60) int local60;
		if (Static114.anInt2348 < 100) {
			local47 = arg0 + arg2 / 2;
			local60 = arg1 / 2 + arg3 - 18 - 20;
			if (Static71.aBoolean165) {
				Static93.method1777(arg0, arg3, arg2, arg1, 0);
				Static93.method1773(local47 - 152, local60, 304, 34, 9179409);
				Static93.method1777(local47 - 150, local60 + 2, Static114.anInt2348 * 3, 30, 9179409);
			} else {
				Static77.method1596(arg0, arg3, arg2, arg1, 0);
				Static77.method1580(local47 - 152, local60, 304, 34, 9179409);
				Static77.method1596(local47 - 150, local60 - -2, Static114.anInt2348 * 3, 30, 9179409);
			}
			Static19.aClass1_Sub5_Sub9_1.method2866(Static26.aString19, local47, local60 + 20, 16777215, -1);
			return;
		}
		Static95.anInt1985 = (int) ((float) (arg1 * 2) / Static249.aFloat100);
		Static2.anInt54 = (int) ((float) (arg2 * 2) / Static249.aFloat100);
		Static160.anInt3187 = Static54.anInt1167 - (int) ((float) arg2 / Static249.aFloat100);
		local47 = Static175.anInt3415 - (int) ((float) arg1 / Static249.aFloat100);
		Static311.anInt5591 = Static175.anInt3415 - (int) ((float) arg1 / Static249.aFloat100);
		@Pc(177) int local177 = Static54.anInt1167 - (int) ((float) arg2 / Static249.aFloat100);
		local60 = Static54.anInt1167 + (int) ((float) arg2 / Static249.aFloat100);
		@Pc(194) int local194 = (int) ((float) arg1 / Static249.aFloat100) + Static175.anInt3415;
		@Pc(215) Class96 local215;
		if (Static71.aBoolean165) {
			if (Static230.aClass1_Sub5_Sub6_Sub1_4 == null || arg2 != Static230.aClass1_Sub5_Sub6_Sub1_4.anInt3617 || arg1 != Static230.aClass1_Sub5_Sub6_Sub1_4.anInt3625) {
				Static230.aClass1_Sub5_Sub6_Sub1_4 = null;
				Static230.aClass1_Sub5_Sub6_Sub1_4 = new Class1_Sub5_Sub6_Sub1(arg2, arg1);
			}
			Static77.method1594(Static230.aClass1_Sub5_Sub6_Sub1_4.anIntArray117, arg2, arg1);
			Static249.method4637(local177, local47, local60, local194, 0, 0, arg2, arg1 + 1);
			Static249.method4639();
			local215 = Static249.method4624();
			Static179.method3038(local215, arg3, arg0);
			Static230.aClass1_Sub5_Sub6_Sub1_4.method1278();
			Static93.method1770(Static230.aClass1_Sub5_Sub6_Sub1_4.anIntArray117, arg0, arg3, arg2, arg1);
			Static77.anIntArray131 = null;
		} else {
			Static249.method4637(local177, local47, local60, local194, arg0, arg3, arg0 + arg2, arg3 + 1 - -arg1);
			Static249.method4639();
			local215 = Static249.method4624();
			Static179.method3038(local215, 0, 0);
		}
		if (Static145.anInt2809 > 0) {
			Static73.anInt1575--;
			if (Static73.anInt1575 == 0) {
				Static145.anInt2809--;
				Static73.anInt1575 = 20;
			}
		}
		if (!Static248.aBoolean415) {
			return;
		}
		@Pc(307) int local307 = arg2 + arg0 - 5;
		@Pc(314) int local314 = arg3 + arg1 - 8;
		Static238.aClass1_Sub5_Sub9_5.method2855("Fps:" + Static230.anInt4307, local307, local314, 16776960, -1);
		@Pc(330) int local330 = 16776960;
		@Pc(332) Runtime local332 = Runtime.getRuntime();
		@Pc(333) int local333 = local314 - 15;
		@Pc(342) int local342 = (int) ((local332.totalMemory() - local332.freeMemory()) / 1024L);
		if (local342 > 65536) {
			local330 = 16711680;
		}
		Static238.aClass1_Sub5_Sub9_5.method2855("Mem:" + local342 + "k", local307, local333, local330, -1);
		local314 = local333 - 15;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZZ)V")
	public static void method2717(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static199.aBoolean348) {
			Static199.aBoolean348 = arg0;
			Static179.method3041();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLclient!nm;Lclient!nm;)V")
	public static void method2718(@OriginalArg(1) Class119 arg0, @OriginalArg(2) Class119 arg1) {
		Static238.aClass119_67 = arg0;
		Static89.aClass119_38 = arg1;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2719(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString110 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(62) String local62 = local53.readLine();
		while (true) {
			@Pc(65) String local65 = local53.readLine();
			if (local65 == null) {
				return local21 + "| " + local62;
			}
			@Pc(72) int local72 = local65.indexOf(40);
			@Pc(79) int local79 = local65.indexOf(41, local72 + 1);
			@Pc(87) String local87;
			if (local72 == -1) {
				local87 = local65;
			} else {
				local87 = local65.substring(0, local72);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local21 = local21 + local87;
			if (local72 != -1 && local79 != -1) {
				@Pc(133) int local133 = local65.indexOf(".java:", local72);
				if (local133 >= 0) {
					local21 = local21 + local65.substring(local133 + 5, local79);
				}
			}
			local21 = local21 + ' ';
		}
	}
}

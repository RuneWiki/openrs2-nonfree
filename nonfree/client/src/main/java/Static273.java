import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public static int anInt5363;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "I")
	public static int anInt5369;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Z")
	public static boolean aBoolean454 = false;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString192 = "white:";

	@OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
	public static boolean aBoolean455 = true;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)V")
	public static void method4053(@OriginalArg(0) boolean arg0) {
		Static23.aBoolean40 = arg0;
		Static53.aBoolean85 = !Static158.method2553();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method4054(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString60 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local10 + "| " + local61;
			}
			@Pc(71) int local71 = local64.indexOf(40);
			@Pc(78) int local78 = local64.indexOf(41, local71 + 1);
			@Pc(83) String local83;
			if (local71 == -1) {
				local83 = local64;
			} else {
				local83 = local64.substring(0, local71);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local10 = local10 + local83;
			if (local71 != -1 && local78 != -1) {
				@Pc(131) int local131 = local64.indexOf(".java:", local71);
				if (local131 >= 0) {
					local10 = local10 + local64.substring(local131 + 5, local78);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZIBIII)V")
	public static void method4055(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg1 && arg3 == Static250.anInt4960 && Static42.anInt957 == arg4 && (Static253.anInt4999 == arg0 || Static158.method2553())) {
			return;
		}
		Static42.anInt957 = arg4;
		Static250.anInt4960 = arg3;
		Static253.anInt4999 = arg0;
		if (Static158.method2553()) {
			Static253.anInt4999 = 0;
		}
		if (arg2) {
			Static49.method774(28);
		} else {
			Static49.method774(25);
		}
		Static261.method3923(Static58.aString83, true);
		@Pc(58) int local58 = Static49.anInt1089;
		@Pc(60) int local60 = Static130.anInt2601;
		Static130.anInt2601 = arg4 * 8 - 48;
		Static49.anInt1089 = arg3 * 8 - 48;
		Static111.aClass8_Sub1_Sub2_1 = Static79.method1289(Static250.anInt4960 * 8, Static42.anInt957 * 8);
		@Pc(85) int local85 = Static49.anInt1089 - local58;
		@Pc(91) int local91 = Static130.anInt2601 - local60;
		Static104.aClass130_1 = null;
		@Pc(101) int local101;
		@Pc(110) Class36_Sub3_Sub2 local110;
		@Pc(153) int local153;
		if (arg2) {
			Static135.anInt2729 = 0;
			for (local101 = 0; local101 < 32768; local101++) {
				local110 = Static48.aClass36_Sub3_Sub2Array1[local101];
				if (local110 != null) {
					local110.anInt4117 -= local85 * 128;
					local110.anInt4118 -= local91 * 128;
					if (local110.anInt4117 >= 0 && local110.anInt4117 <= 13184 && local110.anInt4118 >= 0 && local110.anInt4118 <= 13184) {
						for (local153 = 0; local153 < 10; local153++) {
							local110.anIntArray310[local153] -= local85;
							local110.anIntArray308[local153] -= local91;
						}
						Static191.anIntArray285[Static135.anInt2729++] = local101;
					} else {
						Static48.aClass36_Sub3_Sub2Array1[local101].method3117(null);
						Static48.aClass36_Sub3_Sub2Array1[local101] = null;
					}
				}
			}
		} else {
			for (local101 = 0; local101 < 32768; local101++) {
				local110 = Static48.aClass36_Sub3_Sub2Array1[local101];
				if (local110 != null) {
					for (local153 = 0; local153 < 10; local153++) {
						local110.anIntArray310[local153] -= local85;
						local110.anIntArray308[local153] -= local91;
					}
					local110.anInt4118 -= local91 * 128;
					local110.anInt4117 -= local85 * 128;
				}
			}
		}
		for (local101 = 0; local101 < 2048; local101++) {
			@Pc(270) Class36_Sub3_Sub1 local270 = Static230.aClass36_Sub3_Sub1Array1[local101];
			if (local270 != null) {
				for (local153 = 0; local153 < 10; local153++) {
					local270.anIntArray310[local153] -= local85;
					local270.anIntArray308[local153] -= local91;
				}
				local270.anInt4117 -= local85 * 128;
				local270.anInt4118 -= local91 * 128;
			}
		}
		Static34.anInt770 = arg0;
		Static21.aClass36_Sub3_Sub1_1.method3085(arg5, arg6, false);
		@Pc(325) byte local325 = 0;
		@Pc(327) byte local327 = 1;
		@Pc(329) byte local329 = 104;
		@Pc(331) byte local331 = 0;
		@Pc(333) byte local333 = 104;
		if (local85 < 0) {
			local329 = -1;
			local327 = -1;
			local331 = 103;
		}
		@Pc(343) byte local343 = 1;
		if (local91 < 0) {
			local343 = -1;
			local333 = -1;
			local325 = 103;
		}
		for (@Pc(357) int local357 = local331; local357 != local329; local357 += local327) {
			for (@Pc(362) int local362 = local325; local362 != local333; local362 += local343) {
				@Pc(373) int local373 = local91 + local362;
				@Pc(377) int local377 = local85 + local357;
				for (@Pc(379) int local379 = 0; local379 < 4; local379++) {
					if (local377 >= 0 && local373 >= 0 && local377 < 104 && local373 < 104) {
						Static124.aClass182ArrayArrayArray1[local379][local357][local362] = Static124.aClass182ArrayArrayArray1[local379][local377][local373];
					} else {
						Static124.aClass182ArrayArrayArray1[local379][local357][local362] = null;
					}
				}
			}
		}
		for (@Pc(443) Class8_Sub9 local443 = (Class8_Sub9) Static84.aClass182_10.method4319(); local443 != null; local443 = (Class8_Sub9) Static84.aClass182_10.method4329()) {
			local443.anInt1249 -= local85;
			local443.anInt1251 -= local91;
			if (local443.anInt1249 < 0 || local443.anInt1251 < 0 || local443.anInt1249 >= 104 || local443.anInt1251 >= 104) {
				local443.method4273();
			}
		}
		if (arg2) {
			Static145.anInt2861 -= local85;
			Static185.anInt3689 -= local91 * 128;
			anInt5369 -= local91;
			Static46.anInt1044 -= local85 * 128;
			Static231.anInt4685 -= local85;
			Static197.anInt3894 -= local91;
		} else {
			Static172.anInt3428 = 1;
		}
		Static156.anInt3156 = 0;
		if (Static292.anInt5659 != 0) {
			Static292.anInt5659 -= local85;
			Static67.anInt1466 -= local91;
		}
		if (Static116.aBoolean188 && arg2 && (Math.abs(local85) > 104 || Math.abs(local91) > 104)) {
			Static293.method4282();
		}
		Static136.anInt2741 = -1;
		Static164.aClass182_13.method4317();
		Static123.aClass182_11.method4317();
	}
}

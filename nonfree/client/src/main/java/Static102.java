import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Lclient!la;")
	public static Class63 aClass63_2;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Z")
	public static boolean aBoolean181;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjava/io/File;B)V")
	public static void method2103(@OriginalArg(1) File arg0) {
		if (Static578.anObject19 == null) {
			Static591.method8123();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local14.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static578.anObject19, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method2107(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) int local16 = arg2.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local18 - local22 < local8 || local20 - local24 < local16) {
			if (local18 - local22 >= local8) {
				return -1;
			}
			if (local16 <= local20 - local24) {
				return 1;
			}
			@Pc(60) char local60;
			if (local22 == '\u0000') {
				local60 = arg0.charAt(local18++);
			} else {
				local60 = local22;
			}
			@Pc(76) char local76;
			if (local24 == '\u0000') {
				local76 = arg2.charAt(local20++);
			} else {
				local76 = local24;
			}
			local22 = Static447.method6194(local60);
			local24 = Static447.method6194(local76);
			local60 = Static494.method6511(local60, arg1);
			local76 = Static494.method6511(local76, arg1);
			if (local60 != local76 && Character.toUpperCase(local60) != Character.toUpperCase(local76)) {
				local60 = Character.toLowerCase(local60);
				local76 = Character.toLowerCase(local76);
				if (local60 != local76) {
					return Static288.method4328(arg1, local60) - Static288.method4328(arg1, local76);
				}
			}
		}
		@Pc(135) int local135 = Math.min(local8, local16);
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			if (arg1 == 2) {
				local18 = local8 - local137 - 1;
				local20 = local16 - local137 - 1;
			} else {
				local20 = local137;
				local18 = local137;
			}
			@Pc(168) char local168 = arg0.charAt(local18);
			@Pc(172) char local172 = arg2.charAt(local20);
			if (local172 != local168 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local172 != local168) {
					return Static288.method4328(arg1, local168) - Static288.method4328(arg1, local172);
				}
			}
		}
		@Pc(216) int local216 = local8 - local16;
		if (local216 != 0) {
			return local216;
		}
		for (@Pc(225) int local225 = 0; local225 < local135; local225++) {
			@Pc(231) char local231 = arg0.charAt(local225);
			@Pc(235) char local235 = arg2.charAt(local225);
			if (local235 != local231) {
				return Static288.method4328(arg1, local231) - Static288.method4328(arg1, local235);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!pn;III)V")
	public static void method2108(@OriginalArg(0) Class25_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class333 local12;
		if (arg2 < Static349.anInt6237) {
			local12 = Static189.aClass333ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass25_Sub2_Sub5_1 != null && local12.aClass25_Sub2_Sub5_1.method6643()) {
				arg0.method6654(0, Static331.anInt6010, Static68.aClass31_4, true, 0, local12.aClass25_Sub2_Sub5_1);
			}
		}
		if (arg3 < Static349.anInt6237) {
			local12 = Static189.aClass333ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass25_Sub2_Sub5_1 != null && local12.aClass25_Sub2_Sub5_1.method6643()) {
				arg0.method6654(0, 0, Static68.aClass31_4, true, Static331.anInt6010, local12.aClass25_Sub2_Sub5_1);
			}
		}
		if (arg2 < Static349.anInt6237 && arg3 < Static414.anInt7451) {
			local12 = Static189.aClass333ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass25_Sub2_Sub5_1 != null && local12.aClass25_Sub2_Sub5_1.method6643()) {
				arg0.method6654(0, Static331.anInt6010, Static68.aClass31_4, true, Static331.anInt6010, local12.aClass25_Sub2_Sub5_1);
			}
		}
		if (arg2 < Static349.anInt6237 && arg3 > 0) {
			local12 = Static189.aClass333ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass25_Sub2_Sub5_1 != null && local12.aClass25_Sub2_Sub5_1.method6643()) {
				arg0.method6654(0, Static331.anInt6010, Static68.aClass31_4, true, -Static331.anInt6010, local12.aClass25_Sub2_Sub5_1);
			}
		}
	}
}

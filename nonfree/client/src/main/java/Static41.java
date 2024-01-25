import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public static int anInt942;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt941 = 0;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[Lclient!io;")
	public static Class164[] aClass164Array1 = null;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!fca;IZ)V")
	public static void method839(@OriginalArg(0) Class11_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static90.anInt1824 >= 400) {
			return;
		}
		@Pc(12) Class236 local12 = arg0.aClass236_1;
		if (local12.anIntArray462 != null) {
			local12 = local12.method5779(Static438.aClass198_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean515) {
			return;
		}
		@Pc(32) String local32 = local12.aString67;
		if (local12.anInt6923 != 0) {
			@Pc(48) String local48 = Static499.aClass63_15 == Static230.aClass63_16 ? Static628.aClass369_30.method8475(Static377.anInt6756) : Static628.aClass369_28.method8475(Static377.anInt6756);
			local32 = local32 + Static455.method6664(local12.anInt6923, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543) + " (" + local48 + local12.anInt6923 + ")";
		}
		if (Static301.aBoolean423 && !arg1) {
			@Pc(86) Class79 local86 = Static608.anInt3500 == -1 ? null : Static584.aClass206_2.method4916(Static608.anInt3500);
			if ((Static73.anInt1590 & 0x2) != 0 && (local86 == null || local12.method5788(local86.anInt2016, Static608.anInt3500) != local86.anInt2016)) {
				Static115.method1856((long) arg0.anInt3246, Static109.aString27 + " -> <col=ffff00>" + local32, 0, (long) arg0.anInt3246, true, Static81.aString20, 10, false, 0, false, Static20.anInt623, -1);
			}
		}
		if (!arg1) {
			@Pc(144) String[] local144 = local12.lb;
			if (Static518.aBoolean640) {
				local144 = Static532.method7448(local144);
			}
			@Pc(154) int local154;
			if (local144 != null) {
				for (local154 = 4; local154 >= 0; local154--) {
					if (local144[local154] != null && (local12.aByte99 == 0 || !local144[local154].equalsIgnoreCase(Static628.aClass369_23.method8475(Static377.anInt6756)))) {
						@Pc(177) byte local177 = 0;
						if (local154 == 0) {
							local177 = 6;
						}
						@Pc(183) int local183 = Static492.anInt8385;
						if (local154 == 1) {
							local177 = 20;
						}
						if (local154 == 2) {
							local177 = 13;
						}
						if (local154 == 3) {
							local177 = 49;
						}
						if (local154 == 4) {
							local177 = 5;
						}
						if (local12.anInt6913 == local154) {
							local183 = local12.anInt6921;
						}
						if (local154 == local12.anInt6902) {
							local183 = local12.anInt6909;
						}
						Static115.method1856((long) arg0.anInt3246, "<col=ffff00>" + local32, 0, (long) arg0.anInt3246, true, local144[local154], local177, false, 0, false, local144[local154].equalsIgnoreCase(Static628.aClass369_23.method8475(Static377.anInt6756)) ? local12.anInt6887 : local183, -1);
					}
				}
			}
			if (local12.aByte99 == 1 && local144 != null) {
				for (local154 = 4; local154 >= 0; local154--) {
					if (local144[local154] != null && local144[local154].equalsIgnoreCase(Static628.aClass369_23.method8475(Static377.anInt6756))) {
						@Pc(300) short local300 = 0;
						if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543 < local12.anInt6923) {
							local300 = 2000;
						}
						@Pc(313) short local313 = 0;
						if (local154 == 0) {
							local313 = 6;
						}
						if (local154 == 1) {
							local313 = 20;
						}
						if (local154 == 2) {
							local313 = 13;
						}
						if (local154 == 3) {
							local313 = 49;
						}
						if (local154 == 4) {
							local313 = 5;
						}
						if (local313 != 0) {
							local313 += local300;
						}
						Static115.method1856((long) arg0.anInt3246, "<col=ffff00>" + local32, 0, (long) arg0.anInt3246, true, local144[local154], local313, false, 0, false, local12.anInt6887, -1);
					}
				}
			}
		}
		Static115.method1856((long) arg0.anInt3246, "<col=ffff00>" + local32, 0, (long) arg0.anInt3246, true, Static628.aClass369_22.method8475(Static377.anInt6756), 1006, false, 0, arg1, Static258.anInt10109, -1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public static synchronized void method841() {
		if (Static558.anObject16 != null) {
			return;
		}
		try {
			@Pc(14) Class local14 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local14.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(24) Object local24 = local19.invoke(null, (Object[]) null);
			@Pc(57) Method local57 = local14.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static558.anObject16 = local57.invoke(null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}

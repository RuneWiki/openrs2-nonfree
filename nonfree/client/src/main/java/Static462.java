import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
	public static int anInt7475;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "Z")
	public static boolean aBoolean531 = false;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public static void method6523() {
		Static229.method3716();
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
	public static void method6524() {
		Static81.anInt2142 = Static266.aClass183_7.anInt5064 + Static266.aClass183_7.anInt5062 + 2;
		Static97.aStringArray10 = new String[500];
		Static444.anInt7301 = Static551.aClass183_13.anInt5062 + Static551.aClass183_13.anInt5064 + 2;
		for (@Pc(24) int local24 = 0; local24 < Static97.aStringArray10.length; local24++) {
			Static97.aStringArray10[local24] = "";
		}
		Static575.method7997(Static573.aClass345_3.method7951(Static496.anInt7407));
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)V")
	public static synchronized void method6525() {
		if (Static155.anObject5 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(18) Method local18 = local13.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(23) Object local23 = local18.invoke((Object) null, (Object[]) null);
			@Pc(56) Method local56 = local13.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static155.anObject5 = local56.invoke((Object) null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}
}

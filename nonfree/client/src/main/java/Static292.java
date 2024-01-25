import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass32;

	// $FF: synthetic field
	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass33;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Z")
	public static boolean aBoolean394 = true;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	public static int anInt5309 = -1;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Z")
	public static boolean aBoolean395 = false;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public static synchronized void method4843() {
		if (Static413.anObject16 != null) {
			return;
		}
		try {
			@Pc(12) Class local12 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local12.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(31) Object local31 = local19.invoke((Object) null, (Object[]) null);
			@Pc(74) Method local74 = local12.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), aClass32 == null ? (aClass32 = Class192.a("java.lang.String")) : aClass32, aClass33 == null ? (aClass33 = Class192.a("java.lang.Class")) : aClass33);
			Static413.anObject16 = local74.invoke((Object) null, local31, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(99) Exception local99) {
			System.out.println("HeapDump setup error:");
			local99.printStackTrace();
		}
	}
}

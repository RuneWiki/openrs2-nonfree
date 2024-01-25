import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public static int anInt8007;

	// $FF: synthetic field
	@OriginalMember(owner = "client!og", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass16;

	// $FF: synthetic field
	@OriginalMember(owner = "client!og", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass17;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_12 = new Class409(3, 2);

	@OriginalMember(owner = "client!og", name = "e", descriptor = "S")
	public static short aShort112 = 1;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_77 = new Class286(32, 8);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static synchronized void method6740() {
		if (Static381.anObject19 != null) {
			return;
		}
		try {
			@Pc(12) Class local12 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(26) Method local26 = local12.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(31) Object local31 = local26.invoke((Object) null, (Object[]) null);
			@Pc(74) Method local74 = local12.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), aClass16 == null ? (aClass16 = Class269.a("java.lang.String")) : aClass16, aClass17 == null ? (aClass17 = Class269.a("java.lang.Class")) : aClass17);
			Static381.anObject19 = local74.invoke((Object) null, local31, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(99) Exception local99) {
			System.out.println("HeapDump setup error:");
			local99.printStackTrace();
		}
	}
}

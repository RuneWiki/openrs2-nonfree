import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Color;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dja", name = "k", descriptor = "Lclient!pf;")
	public static Class279 aClass279_1;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "I")
	public static int anInt2049 = -1;

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "Lclient!g;")
	public static final Class122 aClass122_5 = new Class122(1);

	@OriginalMember(owner = "client!dja", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!dja", name = "j", descriptor = "Lclient!saa;")
	public static final Class317 aClass317_1 = new Class317();

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)V")
	public static synchronized void method1720() {
		if (Static133.anObject9 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(18) Method local18 = local13.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(23) Object local23 = local18.invoke((Object) null, (Object[]) null);
			@Pc(56) Method local56 = local13.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static133.anObject9 = local56.invoke((Object) null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "(I)V")
	public static void method1721() {
		Static371.method5295();
		Static127.aClass57_3 = null;
		Static491.aClass95_11 = null;
		Static43.aClass57_1 = null;
		Static26.aClass382ArrayArray1 = null;
		Static80.aClass57_2 = null;
	}

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)V")
	public static void method1722() {
		if (Static74.aClass191_1 != null) {
			Static74.aClass191_1.method4364();
		}
		if (Static382.aThread4 == null) {
			return;
		}
		while (true) {
			try {
				Static382.aThread4.join();
				break;
			} catch (@Pc(14) InterruptedException local14) {
			}
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(Lclient!d;BLjava/awt/Canvas;Lclient!uq;I)Lclient!ha;")
	public static Class95 method1723(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Class362 arg2, @OriginalArg(4) int arg3) {
		if (!Static1.method8752()) {
			throw new RuntimeException("");
		} else if (Static634.method5642("jaggl")) {
			@Pc(34) OpenGL local34 = new OpenGL();
			@Pc(44) long local44 = local34.init(arg1, 8, 8, 8, 24, 0, arg3);
			if (local44 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(63) Class95_Sub1_Sub1 local63 = new Class95_Sub1_Sub1(local34, arg1, local44, arg0, arg2, arg3);
			local63.method8135();
			return local63;
		} else {
			throw new RuntimeException("");
		}
	}
}

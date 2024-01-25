import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gha", name = "g", descriptor = "[I")
	public static int[] anIntArray190;

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "J")
	public static long aLong100 = 1L;

	@OriginalMember(owner = "client!gha", name = "d", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_4 = new Class146(2, 4, 4, 0);

	@OriginalMember(owner = "client!gha", name = "h", descriptor = "Lclient!in;")
	public static final Class169 aClass169_99 = new Class169(25, -2);

	@OriginalMember(owner = "client!gha", name = "i", descriptor = "Z")
	public static boolean aBoolean318 = true;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3701(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static205.aClass134_33.method3906(Static204.anInt8130) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static205.aClass134_35.method3906(Static204.anInt8130) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)V")
	public static void method3703() {
		Static587.anInt10248 = -1;
		Static460.anInt11073 = 0;
		Static472.anInt8440 = -1;
		Static598.anInt10389 = -1;
	}

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V")
	public static void method3704() {
		Static578.method6241();
		Static2.method58(Static230.aClass2_Sub54_15.aClass4_Sub13_1.method3956() == 1);
		Static451.aClass34_2 = Static102.method1768(22050, 0, Static96.aClass48_5, Static641.aCanvas13);
		Static640.method9476(Static198.method3806((Class2_Sub26_Sub3) null));
		Static330.aClass34_1 = Static102.method1768(2048, 1, Static96.aClass48_5, Static641.aCanvas13);
		Static330.aClass34_1.method6325(Static270.aClass2_Sub26_Sub4_2);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)V")
	public static synchronized void method3705() {
		if (Static70.anObject2 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(19) Object local19 = local14.invoke((Object) null, (Object[]) null);
			@Pc(52) Method local52 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static70.anObject2 = local52.invoke((Object) null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(73) Exception local73) {
			System.out.println("HeapDump setup error:");
			local73.printStackTrace();
		}
	}
}

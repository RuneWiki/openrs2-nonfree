import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!dt;")
	public static Class77 aClass77_8 = null;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "[I")
	public static final int[] anIntArray782 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[F")
	public static final float[] aFloatArray85 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLjava/lang/String;IZLclient!td;Ljava/lang/String;)V")
	public static void method8817(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class333 arg3, @OriginalArg(5) String arg4) {
		if (!arg0) {
			Static330.method5177(arg4, 3, arg3);
			return;
		}
		@Pc(24) String local24;
		if (Static565.aString98.startsWith("win") && arg3.aBoolean693) {
			local24 = null;
			if (Static645.anApplet2 != null) {
				local24 = Static645.anApplet2.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(42) Class150 local42 = Static330.method5177(arg4, 0, arg3);
				Static657.aClass333_8 = arg3;
				Static522.aString87 = arg4;
				Static461.aClass150_6 = local42;
				return;
			}
		}
		if (Static565.aString98.startsWith("mac")) {
			local24 = null;
			if (Static645.anApplet2 != null) {
				local24 = Static645.anApplet2.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg2) {
				Static209.method3279(arg3, arg1, arg4, 1);
				return;
			}
		}
		Static330.method5177(arg4, 2, arg3);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	public static int method8818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static75.aShortArrayArray4 == null ? 0 : Static75.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public static synchronized void method8819() {
		if (Static314.anObject14 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(24) Object local24 = local14.invoke((Object) null, (Object[]) null);
			@Pc(57) Method local57 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static314.anObject14 = local57.invoke((Object) null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}

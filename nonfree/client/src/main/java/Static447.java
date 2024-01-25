import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public static int anInt7618;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public static int anInt7620;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_30 = new Class273(32);

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray59 = new String[100];

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_14 = new Class376(5, 16);

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray60 = new String[8];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!lh;ILclient!lh;)V")
	public static void method6737(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(2) Class5_Sub5 arg1) {
		if (arg0.aClass5_Sub5_67 != null) {
			arg0.method8952();
		}
		arg0.aClass5_Sub5_67 = arg1;
		arg0.aClass5_Sub5_66 = arg1.aClass5_Sub5_66;
		arg0.aClass5_Sub5_67.aClass5_Sub5_66 = arg0;
		arg0.aClass5_Sub5_66.aClass5_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static synchronized void method6738() {
		if (Static427.anObject19 != null) {
			return;
		}
		try {
			@Pc(14) Class local14 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local14.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(24) Object local24 = local19.invoke(null, (Object[]) null);
			@Pc(57) Method local57 = local14.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static427.anObject19 = local57.invoke(null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}

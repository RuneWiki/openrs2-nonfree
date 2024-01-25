import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!rfa;")
	public static Class268_Sub1 aClass268_Sub1_2;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_10 = new Class95(4, 1);

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public static int anInt10278 = 0;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString266 = null;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public static synchronized void method8123() {
		if (Static578.anObject19 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(19) Object local19 = local14.invoke(null, (Object[]) null);
			@Pc(52) Method local52 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static578.anObject19 = local52.invoke(null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZIIII)V")
	public static void method8124(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(23) int local23 = arg4 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(48) int local48 = local23 * (Static270.aShort60 - Static47.aShort17) / 100 + Static47.aShort17;
		if (local48 < Static277.aShort67) {
			local48 = Static277.aShort67;
		} else if (local48 > Static483.aShort105) {
			local48 = Static483.aShort105;
		}
		@Pc(74) int local74 = arg4 * local48 * 512 / (arg2 * 334);
		@Pc(108) int local108;
		@Pc(115) int local115;
		@Pc(83) short local83;
		if (local74 < Static68.aShort20) {
			local83 = Static68.aShort20;
			local48 = local83 * arg2 * 334 / (arg4 * 512);
			if (Static483.aShort105 < local48) {
				local48 = Static483.aShort105;
				local108 = arg4 * 512 * local48 / (local83 * 334);
				local115 = (arg2 - local108) / 2;
				if (arg1) {
					Static319.aClass31_11.JA();
					Static319.aClass31_11.method8094(arg0, arg3, arg4, local115, -16777216);
					Static319.aClass31_11.method8094(arg0, arg3 + arg2 - local115, arg4, local115, -16777216);
				}
				arg3 += local115;
				arg2 -= local115 * 2;
			}
		} else if (local74 > Static168.aShort46) {
			local83 = Static168.aShort46;
			local48 = local83 * arg2 * 334 / (arg4 * 512);
			if (Static277.aShort67 > local48) {
				local48 = Static277.aShort67;
				local108 = local83 * arg2 * 334 / (local48 * 512);
				local115 = (arg4 - local108) / 2;
				if (arg1) {
					Static319.aClass31_11.JA();
					Static319.aClass31_11.method8094(arg0, arg3, local115, arg2, -16777216);
					Static319.aClass31_11.method8094(arg4 + arg0 - local115, arg3, local115, arg2, -16777216);
				}
				arg0 += local115;
				arg4 -= local115 * 2;
			}
		}
		Static409.anInt1458 = (short) arg4;
		Static278.anInt5261 = arg0;
		Static122.anInt2858 = arg4 * local48 / 334;
		Static302.anInt1927 = (short) arg2;
		Static401.anInt7159 = arg3;
	}
}

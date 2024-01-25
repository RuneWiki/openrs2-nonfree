import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "J")
	public static long aLong340;

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "Lclient!ga;")
	public static Class111 aClass111_107;

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_184 = new Class81(39, 6);

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
	public static int anInt7768 = 0;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	public static void method6381() {
		if (Static359.aBoolean443) {
			return;
		}
		if (Static479.aClass1_Sub7_Sub1_1.aBoolean231) {
			Static79.aFloat37 = (int) Static79.aFloat37 - 17 & 0xFFFFFFF0;
		} else {
			Static257.aFloat111 += (-12.0F - Static257.aFloat111) / 2.0F;
		}
		Static459.aBoolean567 = true;
		Static359.aBoolean443 = true;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V")
	public static synchronized void method6382() {
		if (Static105.anObject3 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(18) Method local18 = local13.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(23) Object local23 = local18.invoke(null, (Object[]) null);
			@Pc(56) Method local56 = local13.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static105.anObject3 = local56.invoke(null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLclient!io;)Lclient!wea;")
	public static Class353 method6384(@OriginalArg(1) Class1_Sub20 arg0) {
		@Pc(12) int local12 = arg0.method4426();
		return new Class353(local12);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method6385(@OriginalArg(0) Class12 arg0) {
		arg0.da(0, 0, Static443.anInt7718, 350);
		arg0.J(0, 0, Static443.anInt7718, 350, Static132.anInt2642 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static66.anInt1575;
		@Pc(33) int local33;
		if (Static486.anInt8201 > 0) {
			local33 = 342 - Static66.anInt1575;
			@Pc(43) int local43 = local33 * local27 / (local27 + Static486.anInt8201 - 1);
			@Pc(45) int local45 = 4;
			if (Static486.anInt8201 > 1) {
				local45 = (Static486.anInt8201 - Static78.anInt1871 - 1) * (-local43 + local33) / (Static486.anInt8201 - 1) + 4;
			}
			arg0.J(Static443.anInt7718 - 16, local45, 12, local43, Static132.anInt2642 << 24 | 0x332277, 2);
			for (@Pc(84) int local84 = Static78.anInt1871; local84 < Static78.anInt1871 + local27 && Static486.anInt8201 > local84; local84++) {
				@Pc(93) String[] local93 = Static46.method1116('\b', Static35.aStringArray3[local84]);
				@Pc(102) int local102 = (Static443.anInt7718 - 8 - 16) / local93.length;
				for (@Pc(104) int local104 = 0; local104 < local93.length; local104++) {
					@Pc(113) int local113 = local102 * local104 + 8;
					arg0.da(local113, 0, local113 + local102 - 8, 350);
					Static21.aClass35_1.method4935(local113, -1, 348 - Static510.aClass13_14.anInt510 - Static41.anInt1086 - Static66.anInt1575 * (local84 + -Static78.anInt1871), Static515.method7051(local93[local104]), -16777216);
				}
			}
		}
		Static443.aClass35_11.method4943(-1, -16777216, "Build: 619", 330, Static443.anInt7718 - 25);
		arg0.da(0, 0, Static443.anInt7718, 350);
		arg0.method6443(0, 350 - Static41.anInt1086, -1, Static443.anInt7718);
		Static260.aClass35_7.method4935(10, -1, 350 - Static566.aClass13_15.anInt510 - 1, "--> " + Static515.method7051(Static140.aString28), -16777216);
		if (!Static81.aBoolean154) {
			return;
		}
		local33 = -1;
		if (Static81.anInt1910 % 30 > 15) {
			local33 = 16777215;
		}
		arg0.method6447(12, local33, Static566.aClass13_15.method463("--> " + Static515.method7051(Static140.aString28).substring(0, Static279.anInt5136)) + 10, -Static566.aClass13_15.anInt510 + 339);
	}
}

import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	public static int anInt8461;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qu", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass44;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qu", name = "f", descriptor = "Ljava/lang/Class;")
	private static Class aClass45;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
	public static synchronized void method7496() {
		if (Static654.anObject16 != null) {
			return;
		}
		try {
			@Pc(20) Class local20 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(27) Method local27 = local20.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(32) Object local32 = local27.invoke((Object) null, (Object[]) null);
			@Pc(75) Method local75 = local20.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), aClass44 == null ? (aClass44 = Class316.a("java.lang.String")) : aClass44, aClass45 == null ? (aClass45 = Class316.a("java.lang.Class")) : aClass45);
			Static654.anObject16 = local75.invoke((Object) null, local32, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(100) Exception local100) {
			System.out.println("HeapDump setup error:");
			local100.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public static void method7497() {
		Static66.aClass106_1.method6184();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static158.aLongArray21[local10] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static593.aLongArray19[local26] = 0L;
		}
		Static175.anInt10797 = 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7498(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static15.method237(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static143.anInt2455; local19++) {
			@Pc(25) String local25 = Static80.aStringArray8[local19];
			@Pc(29) String local29 = Static15.method237(local25);
			if (Static319.method4445(arg0, local29, local13, local25)) {
				Static143.anInt2455--;
				for (@Pc(42) int local42 = local19; local42 < Static143.anInt2455; local42++) {
					Static80.aStringArray8[local42] = Static80.aStringArray8[local42 + 1];
					Static180.aStringArray23[local42] = Static180.aStringArray23[local42 + 1];
					Static59.anIntArray91[local42] = Static59.anIntArray91[local42 + 1];
					Static422.aStringArray27[local42] = Static422.aStringArray27[local42 + 1];
					Static132.anIntArray162[local42] = Static132.anIntArray162[local42 + 1];
					Static147.aBooleanArray13[local42] = Static147.aBooleanArray13[local42 + 1];
					Static388.aBooleanArray28[local42] = Static388.aBooleanArray28[local42 + 1];
				}
				Static459.anInt7473 = Static602.anInt10526;
				@Pc(115) Class221 local115 = Static87.method1292();
				@Pc(121) Class2_Sub33 local121 = Static592.method8154(Static40.aClass349_14, local115.aClass48_1);
				local121.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(arg0));
				local121.aClass2_Sub20_Sub2_1.method8541(arg0);
				local115.method5173(local121);
				break;
			}
		}
	}
}

import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
	public static boolean aBoolean781 = false;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
	public static final int[] anIntArray699 = new int[50];

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean782 = true;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)[Lclient!ft;")
	public static Class125[] method8546() {
		return new Class125[] { Static624.aClass125_17, Static222.aClass125_13, Static282.aClass125_10 };
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method8548() {
		Static148.anInt2697 = 0;
		Static277.anInt4479 = 0;
		Static101.anInt2078++;
		Static283.method4092();
		Static240.method3543();
		Static620.method7580();
		@Pc(23) boolean local23 = false;
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static148.anInt2697; local25++) {
			local31 = Static242.anIntArray294[local25];
			@Pc(38) Class4_Sub45 local38 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local31);
			@Pc(41) Class3_Sub1_Sub2_Sub2_Sub2 local41 = local38.aClass3_Sub1_Sub2_Sub2_Sub2_2;
			if (Static333.aBoolean400 && Static191.method2969(local31)) {
				Static67.method1454();
			}
			if (local41.anInt9983 != Static101.anInt2078) {
				if (local41.aClass345_1.method7531()) {
					Static529.method2538(local41);
				}
				local41.method8537((Class345) null);
				local23 = true;
				local38.method9000();
			}
		}
		if (local23) {
			Static15.anInt1571 = Static597.aClass66_41.method1990();
			Static597.aClass66_41.method1986(Static238.aClass4_Sub45Array1);
		}
		if (Static583.anInt8992 != Static159.aClass4_Sub11_Sub1_1.anInt10466) {
			throw new RuntimeException("gnp1 pos:" + Static159.aClass4_Sub11_Sub1_1.anInt10466 + " psize:" + Static583.anInt8992);
		}
		for (local31 = 0; local31 < Static105.anInt2131; local31++) {
			if (Static597.aClass66_41.method1994((long) Static526.anIntArray558[local31]) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static105.anInt2131);
			}
		}
		if (Static15.anInt1571 - Static105.anInt2131 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static15.anInt1571 - Static105.anInt2131));
		}
		for (@Pc(165) int local165 = 0; local165 < Static15.anInt1571; local165++) {
			if (Static101.anInt2078 != Static238.aClass4_Sub45Array1[local165].aClass3_Sub1_Sub2_Sub2_Sub2_2.anInt9983) {
				throw new RuntimeException("gnp4 uk:" + Static238.aClass4_Sub45Array1[local165].aClass3_Sub1_Sub2_Sub2_Sub2_2.anInt9961);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public static synchronized void method8549() {
		if (Static346.anObject9 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(22) Method local22 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(27) Object local27 = local22.invoke((Object) null, (Object[]) null);
			@Pc(60) Method local60 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static346.anObject9 = local60.invoke((Object) null, local27, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(81) Exception local81) {
			System.out.println("HeapDump setup error:");
			local81.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method8550(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static330.aString58 = Static330.aString58 + arg0[0];
			Static631.anInt9864 += arg0[0].length();
			return;
		}
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			if (arg0[local36].startsWith("pause")) {
				@Pc(46) int local46 = 5;
				try {
					local46 = Integer.parseInt(arg0[local36].substring(6));
				} catch (@Pc(55) Exception local55) {
				}
				Static383.method8457("Pausing for " + local46 + " seconds...");
				Static434.aStringArray34 = arg0;
				Static643.anInt10121 = local36 + 1;
				Static349.aLong160 = (long) (local46 * 1000) + Static429.method5935();
				return;
			}
			Static330.aString58 = arg0[local36];
			Static524.method7051(false);
		}
	}
}

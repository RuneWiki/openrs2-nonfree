import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!dc;")
	public static Class70 aClass70_9;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!rg;B)V")
	public static void method2286(@OriginalArg(0) Class12_Sub2_Sub1_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt8369 - Static532.anInt8757;
		@Pc(21) int local21 = arg0.anInt8358 * 512 + arg0.method6777() * 256;
		@Pc(33) int local33 = arg0.anInt8359 * 512 + arg0.method6777() * 256;
		arg0.anInt9374 += (local21 - arg0.anInt9374) / local9;
		arg0.anInt8428 = 0;
		arg0.anInt9375 += (local33 - arg0.anInt9375) / local9;
		if (arg0.anInt8426 == 0) {
			arg0.method6763(8192);
		}
		if (arg0.anInt8426 == 1) {
			arg0.method6763(12288);
		}
		if (arg0.anInt8426 == 2) {
			arg0.method6763(0);
		}
		if (arg0.anInt8426 == 3) {
			arg0.method6763(4096);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	public static synchronized void method2287() {
		if (Static307.anObject15 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(19) Object local19 = local14.invoke(null, (Object[]) null);
			@Pc(57) Method local57 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static307.anObject15 = local57.invoke(null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(JI)V")
	public static void method2288(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static157.anInt2490 + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374;
		@Pc(15) int local15 = Static402.anInt6615 + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375;
		if (Static14.anInt328 - local10 < -2000 || Static14.anInt328 - local10 > 2000 || Static47.anInt873 - local15 < -2000 || Static47.anInt873 - local15 > 2000) {
			Static47.anInt873 = local15;
			Static14.anInt328 = local10;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		if (local10 != Static14.anInt328) {
			local54 = local10 - Static14.anInt328;
			local62 = (int) (arg0 * (long) local54 / 320L);
			if (local54 <= 0) {
				if (local62 == 0) {
					local62 = -1;
				} else if (local54 > local62) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = 1;
			} else if (local54 < local62) {
				local62 = local54;
			}
			Static14.anInt328 += local62;
		}
		if (Static47.anInt873 != local15) {
			local54 = local15 - Static47.anInt873;
			local62 = (int) (arg0 * (long) local54 / 320L);
			if (local54 > 0) {
				if (local62 == 0) {
					local62 = 1;
				} else if (local62 > local54) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = -1;
			} else if (local54 > local62) {
				local62 = local54;
			}
			Static47.anInt873 += local62;
		}
		if (!Static257.aClass2_Sub35_Sub1_1.aBoolean638) {
			Static541.aFloat128 += Static452.aFloat192 * (float) arg0 / 6.0F;
			Static313.aFloat157 += Static216.aFloat246 * (float) arg0 / 6.0F;
		}
		Static89.method1342();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!fn;IZ)V")
	public static void method2289(@OriginalArg(0) Class2_Sub3_Sub2 arg0) {
		Static382.aClass7_3.method6321(arg0);
		Static348.method5032(arg0, Static382.aClass7_3, Static391.aClass229_109, Static48.aClass229_11, Static447.aClass229_105);
	}
}

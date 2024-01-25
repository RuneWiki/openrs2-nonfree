import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "[Lclient!no;")
	public static Interface15[] anInterface15Array1;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_38 = new Class303(24, 6);

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public static final int anInt3136 = 1;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "[Lclient!ej;")
	public static final Class3_Sub7_Sub6[] aClass3_Sub7_Sub6Array2 = new Class3_Sub7_Sub6[14];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!r;)V")
	public static void method2829(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1) {
		if (!Static279.aBoolean733) {
			Static465.anInt7743 = 0;
			return;
		}
		if (Static313.aBoolean392) {
			Static403.aLong190 = Static243.aClass231_1.method6768();
		}
		Static490.anInt7997 = 0;
		Static299.anInt5092 = 0;
		Static244.anInt4331 = 0;
		@Pc(25) int[] local25 = arg1.v();
		Static326.anInt5525 = (int) ((float) local25[3] / 3.0F);
		Static505.anInt8213 = (int) ((float) local25[2] / 3.0F);
		arg1.method7407(Static41.anIntArray31);
		if ((int) ((float) Static41.anIntArray31[0] / 3.0F) != Static365.anInt6275 || Static76.anInt1726 != (int) ((float) Static41.anIntArray31[1] / 3.0F)) {
			Static365.anInt6275 = (int) ((float) Static41.anIntArray31[0] / 3.0F);
			Static76.anInt1726 = (int) ((float) Static41.anIntArray31[1] / 3.0F);
			Static216.anInt3880 = Static365.anInt6275 >> 1;
			Static469.anInt4271 = Static76.anInt1726 >> 1;
			Static128.anIntArray130 = new int[Static76.anInt1726 * Static365.anInt6275];
		}
		Static77.aClass11_1 = arg1.method7408();
		Static465.anInt7743 = 0;
		for (@Pc(102) int local102 = 0; local102 < Static118.anInt2726; local102++) {
			Static413.method5921(arg1, arg0, Static182.aClass308Array3[local102]);
		}
		for (@Pc(121) int local121 = 0; local121 < Static145.anInt3113; local121++) {
			Static413.method5921(arg1, arg0, Static88.aClass308Array1[local121]);
		}
		for (@Pc(136) int local136 = 0; local136 < Static188.anInt7665; local136++) {
			Static413.method5921(arg1, arg0, Static206.aClass308Array4[local136]);
		}
		Static328.anInt5532 = 0;
		if (Static465.anInt7743 > 0) {
			@Pc(164) int local164 = Static128.anIntArray130.length;
			@Pc(171) int local171 = local164 - local164 & 0x7;
			@Pc(173) int local173 = 0;
			while (local171 > local173) {
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
			}
			while (local164 > local173) {
				Static128.anIntArray130[local173++] = Integer.MAX_VALUE;
			}
			Static468.anInt7786 = 1;
			for (@Pc(236) int local236 = 0; local236 < Static465.anInt7743; local236++) {
				@Pc(242) Class308 local242 = Static121.aClass308Array2[local236];
				Static48.method753(local242.aShortArray126[0], local242.aShortArray127[3], local242.aShortArray126[1], local242.aShortArray127[1], local242.aShortArray128[0], local242.aShortArray128[1], local242.aShortArray128[3], local242.aShortArray126[3], local242.aShortArray127[0]);
				Static48.method753(local242.aShortArray126[1], local242.aShortArray127[3], local242.aShortArray126[2], local242.aShortArray127[2], local242.aShortArray128[1], local242.aShortArray128[2], local242.aShortArray128[3], local242.aShortArray126[3], local242.aShortArray127[1]);
			}
			Static468.anInt7786 = 2;
		}
		if (Static313.aBoolean392) {
			Static236.aLong124 = Static243.aClass231_1.method6768() - Static403.aLong190;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
	public static void method2830() {
		for (@Pc(10) Class41_Sub5 local10 = (Class41_Sub5) Static564.aClass178_23.method4161(); local10 != null; local10 = (Class41_Sub5) Static564.aClass178_23.method4161()) {
			Static566.method7612(local10);
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312)) {
			local29 = 0;
			local31 = 3;
		} else {
			local31 = Static364.anInt645;
			local29 = Static364.anInt645;
		}
		Static71.method1528();
		for (@Pc(40) int local40 = local29; local40 <= local31; local40++) {
			Static71.method1525();
			Static71.method1524(local40);
			Static71.method1532(local40);
		}
		Static71.method1529();
		Static71.method1531();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(23) String local23 = arg2[arg0];
			return local23 == null ? "null" : local23.toString();
		} else {
			@Pc(35) int local35 = arg1 + arg0;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg0; local39 < local35; local39++) {
				@Pc(45) String local45 = arg2[local39];
				if (local45 == null) {
					local37 += 4;
				} else {
					local37 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local37);
			for (@Pc(66) int local66 = arg0; local66 < local35; local66++) {
				@Pc(72) String local72 = arg2[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	public static synchronized void method2832() {
		if (Static371.anObject13 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(24) Object local24 = local14.invoke(null, (Object[]) null);
			@Pc(57) Method local57 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static371.anObject13 = local57.invoke(null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}

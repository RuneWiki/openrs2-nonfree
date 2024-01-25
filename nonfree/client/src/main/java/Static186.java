import java.awt.Container;
import java.awt.Insets;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_63 = new Class268(9, -1);

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "[I")
	public static final int[] anIntArray229 = new int[5];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	public static void method3358() {
		for (@Pc(10) Class6_Sub2_Sub20 local10 = (Class6_Sub2_Sub20) Static364.aClass8_36.method149(); local10 != null; local10 = (Class6_Sub2_Sub20) Static364.aClass8_36.method155()) {
			@Pc(15) Class20_Sub2_Sub2_Sub4 local15 = local10.aClass20_Sub2_Sub2_Sub4_1;
			if (local15.anInt9540 < Static113.anInt2243) {
				local10.method9043();
				local15.method8085();
			} else if (local15.anInt9533 <= Static113.anInt2243) {
				local15.method8092();
				if (local15.anInt9523 > 0) {
					@Pc(47) Class6_Sub46 local47 = (Class6_Sub46) Static347.aClass128_23.method3560((long) (local15.anInt9523 - 1));
					if (local47 != null) {
						@Pc(52) Class20_Sub2_Sub2_Sub1_Sub2 local52 = local47.aClass20_Sub2_Sub2_Sub1_Sub2_1;
						if (local52.anInt10725 >= 0 && Static442.anInt7975 * 512 > local52.anInt10725 && local52.anInt10729 >= 0 && local52.anInt10729 < Static284.anInt7916 * 512) {
							local15.method8090(Static138.method2248(local52.anInt10725, local15.aByte131, local52.anInt10729) - local15.anInt9518, Static113.anInt2243, local52.anInt10725, local52.anInt10729);
						}
					}
				}
				if (local15.anInt9523 < 0) {
					@Pc(109) int local109 = -local15.anInt9523 - 1;
					@Pc(118) Class20_Sub2_Sub2_Sub1_Sub1 local118;
					if (local109 == Static229.anInt4561) {
						local118 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1;
					} else {
						local118 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local109];
					}
					if (local118 != null && local118.anInt10725 >= 0 && Static442.anInt7975 * 512 > local118.anInt10725 && local118.anInt10729 >= 0 && local118.anInt10729 < Static284.anInt7916 * 512) {
						local15.method8090(Static138.method2248(local118.anInt10725, local15.aByte131, local118.anInt10729) - local15.anInt9518, Static113.anInt2243, local118.anInt10725, local118.anInt10729);
					}
				}
				local15.method8084(Static333.anInt9456);
				Static152.method4562(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static synchronized void method3359() {
		if (Static110.anObject1 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(19) Object local19 = local14.invoke((Object) null, (Object[]) null);
			@Pc(52) Method local52 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static110.anObject1 = local52.invoke((Object) null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(73) Exception local73) {
			System.out.println("HeapDump setup error:");
			local73.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3361(@OriginalArg(1) String arg0) {
		if (Class138.aString50.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class138.aString50.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class138.aString50.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public static void method3362() {
		Static296.method5101();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static476.aFrame6 != null && (arg2 != 3 || Static461.anInt8175 != arg3 || Static229.anInt4546 != arg0)) {
			Static543.method7947(Static476.aFrame6, Static529.aClass112_6);
			Static476.aFrame6 = null;
		}
		if (arg2 == 3 && Static476.aFrame6 == null) {
			Static476.aFrame6 = Static288.method5011(Static529.aClass112_6, 0, arg3, arg0);
			if (Static476.aFrame6 != null) {
				Static229.anInt4546 = arg0;
				Static461.anInt8175 = arg3;
				Static289.method5031();
			}
		}
		if (arg2 == 3 && Static476.aFrame6 == null) {
			method3363(-1, arg1, Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501(), -1, true);
			return;
		}
		@Pc(65) Container local65;
		@Pc(74) Insets local74;
		if (Static476.aFrame6 != null) {
			Static539.anInt9304 = arg0;
			local65 = Static476.aFrame6;
			Static26.anInt535 = arg3;
		} else if (Static70.aFrame3 == null) {
			if (Static42.anApplet1 == null) {
				local65 = Static4.anApplet_Sub1_5;
			} else {
				local65 = Static42.anApplet1;
			}
			Static26.anInt535 = local65.getSize().width;
			Static539.anInt9304 = local65.getSize().height;
		} else {
			local74 = Static70.aFrame3.getInsets();
			@Pc(82) int local82 = local74.left + local74.right;
			Static26.anInt535 = Static70.aFrame3.getSize().width - local82;
			@Pc(92) int local92 = local74.bottom + local74.top;
			Static539.anInt9304 = Static70.aFrame3.getSize().height - local92;
			local65 = Static70.aFrame3;
		}
		if (arg2 == 1) {
			Static356.anInt6630 = Static106.anInt2101;
			Static44.anInt873 = 0;
			Static321.anInt6137 = Static507.anInt8741;
			Static312.anInt5970 = (Static26.anInt535 - Static507.anInt8741) / 2;
		} else {
			Static340.method5775();
		}
		if (Static212.aClass35_2 != Static418.aClass35_3) {
			@Pc(147) boolean local147;
			if (Static321.anInt6137 < 1024 && Static356.anInt6630 < 768) {
				local147 = true;
			} else {
				local147 = false;
			}
		}
		if (arg4) {
			Static362.method5753();
		} else {
			Static271.aCanvas6.setSize(Static321.anInt6137, Static356.anInt6630);
			if (Static389.aBoolean497) {
				Static636.method8949(Static271.aCanvas6);
			} else {
				Static162.aClass100_7.method8769(Static271.aCanvas6, Static321.anInt6137, Static356.anInt6630);
			}
			if (local65 == Static70.aFrame3) {
				local74 = Static70.aFrame3.getInsets();
				Static271.aCanvas6.setLocation(Static312.anInt5970 + local74.left, Static44.anInt873 + local74.top);
			} else {
				Static271.aCanvas6.setLocation(Static312.anInt5970, Static44.anInt873);
			}
		}
		if (arg2 >= 2) {
			Static104.aBoolean155 = true;
		} else {
			Static104.aBoolean155 = false;
		}
		if (Static554.anInt1822 != -1) {
			Static71.method1267(true);
		}
		if (Static97.aClass29_1 != null && Static283.method5439(Static554.anInt1821)) {
			Static181.method3307();
		}
		for (@Pc(226) int local226 = 0; local226 < 100; local226++) {
			Static501.aBooleanArray46[local226] = true;
		}
		Static362.aBoolean440 = true;
	}
}

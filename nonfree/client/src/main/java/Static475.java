import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_66 = new Class154(6, 12);

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_89 = new Class349(26, -1);

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_90 = new Class349(108, -1);

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	public static int anInt5125 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLjava/io/File;Z)V")
	public static void method4438(@OriginalArg(1) File arg0) {
		if (Static307.anObject15 == null) {
			Static177.method2287();
		}
		try {
			@Pc(18) Class local18 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(39) Method local39 = local18.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local39.invoke(Static307.anObject15, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(59) Exception local59) {
			System.out.println("HeapDump error:");
			local59.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
	public static void method4440() {
		if (Static432.aClass261Array1 == null) {
			Static432.aClass261Array1 = Static400.method5484();
			Static394.aClass261_1 = Static432.aClass261Array1[0];
			Static454.aLong200 = Static362.method5133();
		}
		if (Static573.aClass264_1 == null) {
			Static506.method6590();
		}
		@Pc(23) Class261 local23 = Static394.aClass261_1;
		@Pc(26) int local26 = Static593.method7727();
		if (local23 == Static394.aClass261_1) {
			Static560.aString138 = Static394.aClass261_1.aClass159_65.method2776(Static261.anInt4297);
			if (Static394.aClass261_1.aBoolean528) {
				Static562.anInt9209 = (Static394.aClass261_1.anInt6593 - Static394.aClass261_1.anInt6597) * local26 / 100 + Static394.aClass261_1.anInt6597;
			}
			if (Static394.aClass261_1.aBoolean527) {
				Static560.aString138 = Static560.aString138 + Static562.anInt9209 + "%";
			}
		} else if (Static394.aClass261_1 == Static400.aClass261_23) {
			Static573.aClass264_1 = null;
			Static115.method1686(3);
		} else {
			Static560.aString138 = local23.aClass159_66.method2776(Static261.anInt4297);
			Static562.anInt9209 = local23.anInt6593;
			if (Static394.aClass261_1.aBoolean527) {
				Static560.aString138 = Static560.aString138 + local23.anInt6593 + "%";
			}
			if (Static394.aClass261_1.aBoolean528 || local23.aBoolean528) {
				Static454.aLong200 = Static362.method5133();
			}
		}
		if (Static573.aClass264_1 == null) {
			return;
		}
		Static573.aClass264_1.method5510(Static454.aLong200, Static560.aString138, Static394.aClass261_1, Static562.anInt9209);
		if (Static237.anInterface12Array1 == null) {
			return;
		}
		for (@Pc(135) int local135 = Static484.anInt7706 + 1; local135 < Static237.anInterface12Array1.length; local135++) {
			if (Static237.anInterface12Array1[local135].method2482() >= 100 && local135 - 1 == Static484.anInt7706 && Static540.anInt8912 >= 1 && Static573.aClass264_1.method5520()) {
				try {
					Static237.anInterface12Array1[local135].method2484();
				} catch (@Pc(165) Exception local165) {
					Static237.anInterface12Array1 = null;
					return;
				}
				Static573.aClass264_1.method5519(Static237.anInterface12Array1[local135]);
				Static484.anInt7706++;
				if (Static484.anInt7706 >= Static237.anInterface12Array1.length - 1 && Static237.anInterface12Array1.length > 1) {
					Static484.anInt7706 = Static359.aClass28_2.method555() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V")
	public static void method4441(@OriginalArg(0) int arg0) {
		Static219.aLong96 = 1000000000L / (long) arg0;
	}
}

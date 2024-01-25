import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
	public static int anInt2324;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_43 = new Class252(5, 7);

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_40 = new Class45("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_41 = new Class45("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method2230(@OriginalArg(0) Class4 arg0) {
		if (Static238.aBoolean354) {
			Static425.method6637(arg0);
		} else {
			Static453.method6977(arg0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
	public static boolean method2232() {
		@Pc(17) Hashtable local17 = new Hashtable();
		@Pc(20) Enumeration local20 = Static530.aHashtable7.keys();
		while (local20.hasMoreElements()) {
			@Pc(25) Object local25 = local20.nextElement();
			local17.put(local25, Static530.aHashtable7.get(local25));
		}
		try {
			@Pc(38) Class local38 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(41) Class local41 = Class.forName("java.lang.ClassLoader");
			@Pc(45) Field local45 = local41.getDeclaredField("nativeLibraries");
			@Pc(55) Method local55 = local38.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local55.invoke(local45, Boolean.TRUE);
			try {
				local20 = Static530.aHashtable7.keys();
				while (local20.hasMoreElements()) {
					@Pc(74) String local74 = (String) local20.nextElement();
					try {
						@Pc(79) File local79 = (File) Static311.aHashtable4.get(local74);
						@Pc(84) Class local84 = (Class) Static530.aHashtable7.get(local74);
						@Pc(90) Vector local90 = (Vector) local45.get(local84.getClassLoader());
						for (@Pc(92) int local92 = 0; local90.size() > local92; local92++) {
							try {
								@Pc(98) Object local98 = local90.elementAt(local92);
								@Pc(103) Field local103 = local98.getClass().getDeclaredField("name");
								local55.invoke(local103, Boolean.TRUE);
								try {
									@Pc(118) String local118 = (String) local103.get(local98);
									if (local118 != null && local118.equalsIgnoreCase(local79.getCanonicalPath())) {
										@Pc(130) Field local130 = local98.getClass().getDeclaredField("handle");
										@Pc(137) Method local137 = local98.getClass().getDeclaredMethod("finalize");
										local55.invoke(local130, Boolean.TRUE);
										local55.invoke(local137, Boolean.TRUE);
										try {
											local137.invoke(local98);
											local130.set(local98, Integer.valueOf(0));
											local17.remove(local74);
										} catch (@Pc(176) Throwable local176) {
										}
										local55.invoke(local137, Boolean.FALSE);
										local55.invoke(local130, Boolean.FALSE);
									}
								} catch (@Pc(198) Throwable local198) {
								}
								local55.invoke(local103, Boolean.FALSE);
							} catch (@Pc(210) Throwable local210) {
							}
						}
					} catch (@Pc(218) Throwable local218) {
					}
				}
			} catch (@Pc(224) Throwable local224) {
			}
			local55.invoke(local45, Boolean.FALSE);
		} catch (@Pc(236) Throwable local236) {
		}
		Static530.aHashtable7 = local17;
		return Static530.aHashtable7.isEmpty();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	public static void method2234() {
		Static344.aClass277_49.method7019();
		Static303.aClass277_43.method7019();
		Static8.aClass277_5.method7019();
		Static125.aClass277_21.method7019();
		Static207.aClass277_30.method7019();
	}
}

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "F")
	public static float aFloat164 = 0.0F;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	public static void method6635() {
		Static300.anInt5730 = 0;
		Static354.aClass124_32.method3265();
		Static325.aBoolean431 = false;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIII)V")
	public static void method6636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == arg2) {
			Static415.method5944(arg1, arg0, arg4, arg3);
		} else if (Static68.anInt1306 <= arg0 - arg1 && Static589.anInt9684 >= arg1 + arg0 && Static252.anInt4971 <= arg4 - arg2 && Static359.anInt6232 >= arg4 + arg2) {
			Static104.method2289(arg2, arg4, arg1, arg3, arg0);
		} else {
			Static73.method1298(arg3, arg1, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)Z")
	public static boolean method6637() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static197.aHashtable4.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static197.aHashtable4.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(57) Method local57 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local57.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static197.aHashtable4.keys();
				while (local12.hasMoreElements()) {
					@Pc(76) String local76 = (String) local12.nextElement();
					try {
						@Pc(81) File local81 = (File) Static524.aHashtable7.get(local76);
						@Pc(86) Class local86 = (Class) Static197.aHashtable4.get(local76);
						@Pc(92) Vector local92 = (Vector) local37.get(local86.getClassLoader());
						for (@Pc(94) int local94 = 0; local92.size() > local94; local94++) {
							try {
								@Pc(100) Object local100 = local92.elementAt(local94);
								@Pc(105) Field local105 = local100.getClass().getDeclaredField("name");
								local57.invoke(local105, Boolean.TRUE);
								try {
									@Pc(120) String local120 = (String) local105.get(local100);
									if (local120 != null && local120.equalsIgnoreCase(local81.getCanonicalPath())) {
										@Pc(132) Field local132 = local100.getClass().getDeclaredField("handle");
										@Pc(139) Method local139 = local100.getClass().getDeclaredMethod("finalize");
										local57.invoke(local132, Boolean.TRUE);
										local57.invoke(local139, Boolean.TRUE);
										try {
											local139.invoke(local100);
											local132.set(local100, Integer.valueOf(0));
											local9.remove(local76);
										} catch (@Pc(178) Throwable local178) {
										}
										local57.invoke(local139, Boolean.FALSE);
										local57.invoke(local132, Boolean.FALSE);
									}
								} catch (@Pc(200) Throwable local200) {
								}
								local57.invoke(local105, Boolean.FALSE);
							} catch (@Pc(212) Throwable local212) {
							}
						}
					} catch (@Pc(220) Throwable local220) {
					}
				}
			} catch (@Pc(226) Throwable local226) {
			}
			local57.invoke(local37, Boolean.FALSE);
		} catch (@Pc(238) Throwable local238) {
		}
		Static197.aHashtable4 = local9;
		return Static197.aHashtable4.isEmpty();
	}
}

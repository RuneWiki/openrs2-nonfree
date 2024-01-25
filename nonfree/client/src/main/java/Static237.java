import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt4278;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt4277 = 2;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_15 = new Class209(16);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
	public static boolean method3586() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static189.aHashtable2.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static189.aHashtable2.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static189.aHashtable2.keys();
				while (local12.hasMoreElements()) {
					@Pc(66) String local66 = (String) local12.nextElement();
					try {
						@Pc(71) File local71 = (File) Static136.aHashtable1.get(local66);
						@Pc(76) Class local76 = (Class) Static189.aHashtable2.get(local66);
						@Pc(82) Vector local82 = (Vector) local37.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(90) Object local90 = local82.elementAt(local84);
								@Pc(95) Field local95 = local90.getClass().getDeclaredField("name");
								local47.invoke(local95, Boolean.TRUE);
								try {
									@Pc(110) String local110 = (String) local95.get(local90);
									if (local110 != null && local110.equalsIgnoreCase(local71.getCanonicalPath())) {
										@Pc(122) Field local122 = local90.getClass().getDeclaredField("handle");
										@Pc(129) Method local129 = local90.getClass().getDeclaredMethod("finalize");
										local47.invoke(local122, Boolean.TRUE);
										local47.invoke(local129, Boolean.TRUE);
										try {
											local129.invoke(local90);
											local122.set(local90, Integer.valueOf(0));
											local9.remove(local66);
										} catch (@Pc(168) Throwable local168) {
										}
										local47.invoke(local129, Boolean.FALSE);
										local47.invoke(local122, Boolean.FALSE);
									}
								} catch (@Pc(190) Throwable local190) {
								}
								local47.invoke(local95, Boolean.FALSE);
							} catch (@Pc(202) Throwable local202) {
							}
						}
					} catch (@Pc(210) Throwable local210) {
					}
				}
			} catch (@Pc(216) Throwable local216) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(233) Throwable local233) {
		}
		Static189.aHashtable2 = local9;
		return Static189.aHashtable2.isEmpty();
	}
}

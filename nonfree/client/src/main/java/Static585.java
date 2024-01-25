import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wk", name = "B", descriptor = "Lclient!gi;")
	public static final Class118 aClass118_5 = new Class118();

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
	public static int anInt9650 = -1;

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "Z")
	public static boolean aBoolean712 = false;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public static void method7837() {
		Static494.aBoolean622 = true;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)Z")
	public static boolean method7838() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static156.aHashtable4.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static156.aHashtable4.get(local17));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(38) Class local38 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local38.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static156.aHashtable4.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static122.aHashtable3.get(local71);
						@Pc(81) Class local81 = (Class) Static156.aHashtable4.get(local71);
						@Pc(87) Vector local87 = (Vector) local42.get(local81.getClassLoader());
						for (@Pc(89) int local89 = 0; local89 < local87.size(); local89++) {
							try {
								@Pc(95) Object local95 = local87.elementAt(local89);
								@Pc(100) Field local100 = local95.getClass().getDeclaredField("name");
								local52.invoke(local100, Boolean.TRUE);
								try {
									@Pc(115) String local115 = (String) local100.get(local95);
									if (local115 != null && local115.equalsIgnoreCase(local76.getCanonicalPath())) {
										@Pc(127) Field local127 = local95.getClass().getDeclaredField("handle");
										@Pc(134) Method local134 = local95.getClass().getDeclaredMethod("finalize");
										local52.invoke(local127, Boolean.TRUE);
										local52.invoke(local134, Boolean.TRUE);
										try {
											local134.invoke(local95);
											local127.set(local95, Integer.valueOf(0));
											local9.remove(local71);
										} catch (@Pc(173) Throwable local173) {
										}
										local52.invoke(local134, Boolean.FALSE);
										local52.invoke(local127, Boolean.FALSE);
									}
								} catch (@Pc(195) Throwable local195) {
								}
								local52.invoke(local100, Boolean.FALSE);
							} catch (@Pc(207) Throwable local207) {
							}
						}
					} catch (@Pc(219) Throwable local219) {
					}
				}
			} catch (@Pc(225) Throwable local225) {
			}
			local52.invoke(local42, Boolean.FALSE);
		} catch (@Pc(237) Throwable local237) {
		}
		Static156.aHashtable4 = local9;
		return Static156.aHashtable4.isEmpty();
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
	public static void method7839() {
		Static432.aClass78_112.pa(Static100.anInt1766, Static86.aClass1_Sub30_Sub1_1.aBoolean476 ? Static379.anInt6760 + 256 << 2 : -1, 0);
	}
}

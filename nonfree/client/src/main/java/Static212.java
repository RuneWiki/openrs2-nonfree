import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hc", name = "Ob", descriptor = "[Lclient!km;")
	public static Class15_Sub3_Sub3[] aClass15_Sub3_Sub3Array1;

	@OriginalMember(owner = "client!hc", name = "Gb", descriptor = "Lclient!lja;")
	public static final Class217 aClass217_2 = new Class217(false);

	@OriginalMember(owner = "client!hc", name = "tb", descriptor = "Lclient!lja;")
	public static Class217 aClass217_1 = aClass217_2;

	@OriginalMember(owner = "client!hc", name = "Rb", descriptor = "Lclient!in;")
	public static final Class169 aClass169_117 = new Class169(58, -1);

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "(I)Z")
	public static boolean method4018() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(17) Enumeration local17 = Static609.aHashtable7.keys();
		while (local17.hasMoreElements()) {
			@Pc(22) Object local22 = local17.nextElement();
			local9.put(local22, Static609.aHashtable7.get(local22));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(38) Class local38 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local38.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local17 = Static609.aHashtable7.keys();
				while (local17.hasMoreElements()) {
					@Pc(71) String local71 = (String) local17.nextElement();
					try {
						@Pc(76) File local76 = (File) Static48.aHashtable1.get(local71);
						@Pc(81) Class local81 = (Class) Static609.aHashtable7.get(local71);
						@Pc(87) Vector local87 = (Vector) local42.get(local81.getClassLoader());
						for (@Pc(89) int local89 = 0; local87.size() > local89; local89++) {
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
		Static609.aHashtable7 = local9;
		return Static609.aHashtable7.isEmpty();
	}
}

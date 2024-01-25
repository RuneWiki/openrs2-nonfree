import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
	public static boolean aBoolean438;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public static int anInt6390 = 0;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "[Lclient!nda;")
	public static final Class205[] aClass205Array2 = new Class205[2048];

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Z")
	public static boolean method5326() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static144.aHashtable4.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static144.aHashtable4.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local33.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static144.aHashtable4.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static540.aHashtable7.get(local71);
						@Pc(81) Class local81 = (Class) Static144.aHashtable4.get(local71);
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
					} catch (@Pc(215) Throwable local215) {
					}
				}
			} catch (@Pc(221) Throwable local221) {
			}
			local52.invoke(local42, Boolean.FALSE);
		} catch (@Pc(233) Throwable local233) {
		}
		Static144.aHashtable4 = local9;
		return Static144.aHashtable4.isEmpty();
	}
}

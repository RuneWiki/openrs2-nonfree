import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Z")
	public static boolean method9032() {
		@Pc(15) Hashtable local15 = new Hashtable();
		@Pc(18) Enumeration local18 = Static48.aHashtable1.keys();
		while (local18.hasMoreElements()) {
			@Pc(23) Object local23 = local18.nextElement();
			local15.put(local23, Static48.aHashtable1.get(local23));
		}
		try {
			@Pc(38) Class local38 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(43) Class local43 = Class.forName("java.lang.ClassLoader");
			@Pc(49) Field local49 = local43.getDeclaredField("nativeLibraries");
			@Pc(61) Method local61 = local38.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local61.invoke(local49, Boolean.TRUE);
			try {
				local18 = Static48.aHashtable1.keys();
				while (local18.hasMoreElements()) {
					@Pc(82) String local82 = (String) local18.nextElement();
					try {
						@Pc(87) File local87 = (File) Static406.aHashtable5.get(local82);
						@Pc(92) Class local92 = (Class) Static48.aHashtable1.get(local82);
						@Pc(98) Vector local98 = (Vector) local49.get(local92.getClassLoader());
						for (@Pc(100) int local100 = 0; local100 < local98.size(); local100++) {
							try {
								@Pc(106) Object local106 = local98.elementAt(local100);
								@Pc(113) Field local113 = local106.getClass().getDeclaredField("name");
								local61.invoke(local113, Boolean.TRUE);
								try {
									@Pc(128) String local128 = (String) local113.get(local106);
									if (local128 != null && local128.equalsIgnoreCase(local87.getCanonicalPath())) {
										@Pc(144) Field local144 = local106.getClass().getDeclaredField("handle");
										@Pc(153) Method local153 = local106.getClass().getDeclaredMethod("finalize");
										local61.invoke(local144, Boolean.TRUE);
										local61.invoke(local153, Boolean.TRUE);
										try {
											local153.invoke(local106);
											local144.set(local106, Integer.valueOf(0));
											local15.remove(local82);
										} catch (@Pc(192) Throwable local192) {
										}
										local61.invoke(local153, Boolean.FALSE);
										local61.invoke(local144, Boolean.FALSE);
									}
								} catch (@Pc(214) Throwable local214) {
								}
								local61.invoke(local113, Boolean.FALSE);
							} catch (@Pc(226) Throwable local226) {
							}
						}
					} catch (@Pc(240) Throwable local240) {
					}
				}
			} catch (@Pc(246) Throwable local246) {
			}
			local61.invoke(local49, Boolean.FALSE);
		} catch (@Pc(258) Throwable local258) {
		}
		Static48.aHashtable1 = local15;
		return Static48.aHashtable1.isEmpty();
	}
}

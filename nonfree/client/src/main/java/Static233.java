import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)Z")
	public static boolean method3927() {
		@Pc(7) Hashtable local7 = new Hashtable();
		@Pc(10) Enumeration local10 = Static533.aHashtable7.keys();
		while (local10.hasMoreElements()) {
			@Pc(20) Object local20 = local10.nextElement();
			local7.put(local20, Static533.aHashtable7.get(local20));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(40) Class local40 = Class.forName("java.lang.ClassLoader");
			@Pc(46) Field local46 = local40.getDeclaredField("nativeLibraries");
			@Pc(58) Method local58 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local58.invoke(local46, Boolean.TRUE);
			try {
				local10 = Static533.aHashtable7.keys();
				while (local10.hasMoreElements()) {
					@Pc(76) String local76 = (String) local10.nextElement();
					try {
						@Pc(81) File local81 = (File) Static356.aHashtable4.get(local76);
						@Pc(86) Class local86 = (Class) Static533.aHashtable7.get(local76);
						@Pc(92) Vector local92 = (Vector) local46.get(local86.getClassLoader());
						for (@Pc(94) int local94 = 0; local94 < local92.size(); local94++) {
							try {
								@Pc(99) Object local99 = local92.elementAt(local94);
								@Pc(106) Field local106 = local99.getClass().getDeclaredField("name");
								local58.invoke(local106, Boolean.TRUE);
								try {
									@Pc(121) String local121 = (String) local106.get(local99);
									if (local121 != null && local121.equalsIgnoreCase(local81.getCanonicalPath())) {
										@Pc(137) Field local137 = local99.getClass().getDeclaredField("handle");
										@Pc(146) Method local146 = local99.getClass().getDeclaredMethod("finalize");
										local58.invoke(local137, Boolean.TRUE);
										local58.invoke(local146, Boolean.TRUE);
										try {
											local146.invoke(local99);
											local137.set(local99, Integer.valueOf(0));
											local7.remove(local76);
										} catch (@Pc(185) Throwable local185) {
										}
										local58.invoke(local146, Boolean.FALSE);
										local58.invoke(local137, Boolean.FALSE);
									}
								} catch (@Pc(207) Throwable local207) {
								}
								local58.invoke(local106, Boolean.FALSE);
							} catch (@Pc(219) Throwable local219) {
							}
						}
					} catch (@Pc(227) Throwable local227) {
					}
				}
			} catch (@Pc(233) Throwable local233) {
			}
			local58.invoke(local46, Boolean.FALSE);
		} catch (@Pc(245) Throwable local245) {
		}
		Static533.aHashtable7 = local7;
		return Static533.aHashtable7.isEmpty();
	}
}

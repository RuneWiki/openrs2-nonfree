import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Z")
	public static boolean aBoolean728 = false;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z")
	public static boolean method8567() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static241.aHashtable4.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static241.aHashtable4.get(local17));
		}
		try {
			@Pc(32) Class local32 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			@Pc(43) Field local43 = local37.getDeclaredField("nativeLibraries");
			@Pc(55) Method local55 = local32.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local55.invoke(local43, Boolean.TRUE);
			if (1558512524 != 1558512524) {
				aBoolean728 = true;
			}
			try {
				local12 = Static241.aHashtable4.keys();
				while (local12.hasMoreElements()) {
					@Pc(83) String local83 = (String) local12.nextElement();
					try {
						@Pc(88) File local88 = (File) Static326.aHashtable5.get(local83);
						@Pc(93) Class local93 = (Class) Static241.aHashtable4.get(local83);
						@Pc(99) Vector local99 = (Vector) local43.get(local93.getClassLoader());
						for (@Pc(101) int local101 = 0; local99.size() > local101; local101++) {
							try {
								@Pc(107) Object local107 = local99.elementAt(local101);
								@Pc(114) Field local114 = local107.getClass().getDeclaredField("name");
								local55.invoke(local114, Boolean.TRUE);
								try {
									@Pc(129) String local129 = (String) local114.get(local107);
									if (local129 != null && local129.equalsIgnoreCase(local88.getCanonicalPath())) {
										@Pc(145) Field local145 = local107.getClass().getDeclaredField("handle");
										@Pc(154) Method local154 = local107.getClass().getDeclaredMethod("finalize");
										local55.invoke(local145, Boolean.TRUE);
										local55.invoke(local154, Boolean.TRUE);
										try {
											local154.invoke(local107);
											local145.set(local107, Integer.valueOf(0));
											local9.remove(local83);
										} catch (@Pc(193) Throwable local193) {
										}
										local55.invoke(local154, Boolean.FALSE);
										local55.invoke(local145, Boolean.FALSE);
									}
								} catch (@Pc(215) Throwable local215) {
								}
								local55.invoke(local114, Boolean.FALSE);
							} catch (@Pc(227) Throwable local227) {
							}
						}
					} catch (@Pc(241) Throwable local241) {
					}
				}
			} catch (@Pc(247) Throwable local247) {
			}
			local55.invoke(local43, Boolean.FALSE);
		} catch (@Pc(259) Throwable local259) {
		}
		Static241.aHashtable4 = local9;
		return Static241.aHashtable4.isEmpty();
	}
}

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
	public static int anInt509 = -1;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
	public static int anInt511 = 0;

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_1 = new Class316(14, 2);

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Z")
	public static boolean method429() {
		@Pc(15) Hashtable local15 = new Hashtable();
		@Pc(18) Enumeration local18 = Static134.aHashtable1.keys();
		while (local18.hasMoreElements()) {
			@Pc(23) Object local23 = local18.nextElement();
			local15.put(local23, Static134.aHashtable1.get(local23));
		}
		try {
			@Pc(36) Class local36 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(39) Class local39 = Class.forName("java.lang.ClassLoader");
			@Pc(43) Field local43 = local39.getDeclaredField("nativeLibraries");
			@Pc(53) Method local53 = local36.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local53.invoke(local43, Boolean.TRUE);
			try {
				local18 = Static134.aHashtable1.keys();
				while (local18.hasMoreElements()) {
					@Pc(72) String local72 = (String) local18.nextElement();
					try {
						@Pc(77) File local77 = (File) Static393.aHashtable6.get(local72);
						@Pc(82) Class local82 = (Class) Static134.aHashtable1.get(local72);
						@Pc(88) Vector local88 = (Vector) local43.get(local82.getClassLoader());
						for (@Pc(90) int local90 = 0; local88.size() > local90; local90++) {
							try {
								@Pc(96) Object local96 = local88.elementAt(local90);
								@Pc(101) Field local101 = local96.getClass().getDeclaredField("name");
								local53.invoke(local101, Boolean.TRUE);
								try {
									@Pc(116) String local116 = (String) local101.get(local96);
									if (local116 != null && local116.equalsIgnoreCase(local77.getCanonicalPath())) {
										@Pc(128) Field local128 = local96.getClass().getDeclaredField("handle");
										@Pc(135) Method local135 = local96.getClass().getDeclaredMethod("finalize");
										local53.invoke(local128, Boolean.TRUE);
										local53.invoke(local135, Boolean.TRUE);
										try {
											local135.invoke(local96);
											local128.set(local96, Integer.valueOf(0));
											local15.remove(local72);
										} catch (@Pc(174) Throwable local174) {
										}
										local53.invoke(local135, Boolean.FALSE);
										local53.invoke(local128, Boolean.FALSE);
									}
								} catch (@Pc(196) Throwable local196) {
								}
								local53.invoke(local101, Boolean.FALSE);
							} catch (@Pc(208) Throwable local208) {
							}
						}
					} catch (@Pc(216) Throwable local216) {
					}
				}
			} catch (@Pc(222) Throwable local222) {
			}
			local53.invoke(local43, Boolean.FALSE);
		} catch (@Pc(234) Throwable local234) {
		}
		Static134.aHashtable1 = local15;
		return Static134.aHashtable1.isEmpty();
	}
}

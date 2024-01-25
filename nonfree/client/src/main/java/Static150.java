import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public static int anInt2781;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_135 = new Class296(10, 16);

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method2372() {
		if (Static254.aBoolean350) {
			return;
		}
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean389) {
			Static404.aFloat156 = (int) Static404.aFloat156 - 65 & 0xFFFFFF80;
		} else {
			Static71.aFloat15 += (-24.0F - Static71.aFloat15) / 2.0F;
		}
		Static282.aBoolean555 = true;
		Static254.aBoolean350 = true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
	public static boolean method2373() {
		@Pc(14) Hashtable local14 = new Hashtable();
		@Pc(17) Enumeration local17 = Static88.aHashtable1.keys();
		while (local17.hasMoreElements()) {
			@Pc(22) Object local22 = local17.nextElement();
			local14.put(local22, Static88.aHashtable1.get(local22));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(38) Class local38 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local38.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local17 = Static88.aHashtable1.keys();
				while (local17.hasMoreElements()) {
					@Pc(71) String local71 = (String) local17.nextElement();
					try {
						@Pc(76) File local76 = (File) Static341.aHashtable5.get(local71);
						@Pc(81) Class local81 = (Class) Static88.aHashtable1.get(local71);
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
											local14.remove(local71);
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
		Static88.aHashtable1 = local14;
		return Static88.aHashtable1.isEmpty();
	}
}

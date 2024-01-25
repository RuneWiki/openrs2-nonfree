import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "Lclient!jea;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_71 = new Class303(16, 8);

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "Z")
	public static boolean aBoolean512 = true;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
	public static void method5752(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(3, arg0);
		local8.method7329();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z")
	public static boolean method5755() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static10.aHashtable1.keys();
		while (local12.hasMoreElements()) {
			@Pc(22) Object local22 = local12.nextElement();
			local9.put(local22, Static10.aHashtable1.get(local22));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(38) Class local38 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local38.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static10.aHashtable1.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static487.aHashtable9.get(local71);
						@Pc(81) Class local81 = (Class) Static10.aHashtable1.get(local71);
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
		Static10.aHashtable1 = local9;
		return Static10.aHashtable1.isEmpty();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(FB)F")
	public static float method5756(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}
}

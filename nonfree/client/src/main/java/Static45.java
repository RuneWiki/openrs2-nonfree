import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Lclient!fa;")
	public static Interface9 anInterface9_1;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_14 = new Class349(104, -2);

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z")
	public static boolean method802() {
		@Pc(17) Hashtable local17 = new Hashtable();
		@Pc(20) Enumeration local20 = Static527.aHashtable6.keys();
		while (local20.hasMoreElements()) {
			@Pc(25) Object local25 = local20.nextElement();
			local17.put(local25, Static527.aHashtable6.get(local25));
		}
		try {
			@Pc(38) Class local38 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(41) Class local41 = Class.forName("java.lang.ClassLoader");
			@Pc(45) Field local45 = local41.getDeclaredField("nativeLibraries");
			@Pc(55) Method local55 = local38.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local55.invoke(local45, Boolean.TRUE);
			try {
				local20 = Static527.aHashtable6.keys();
				while (local20.hasMoreElements()) {
					@Pc(74) String local74 = (String) local20.nextElement();
					try {
						@Pc(79) File local79 = (File) Static208.aHashtable1.get(local74);
						@Pc(84) Class local84 = (Class) Static527.aHashtable6.get(local74);
						@Pc(90) Vector local90 = (Vector) local45.get(local84.getClassLoader());
						for (@Pc(92) int local92 = 0; local92 < local90.size(); local92++) {
							try {
								@Pc(98) Object local98 = local90.elementAt(local92);
								@Pc(103) Field local103 = local98.getClass().getDeclaredField("name");
								local55.invoke(local103, Boolean.TRUE);
								try {
									@Pc(118) String local118 = (String) local103.get(local98);
									if (local118 != null && local118.equalsIgnoreCase(local79.getCanonicalPath())) {
										@Pc(130) Field local130 = local98.getClass().getDeclaredField("handle");
										@Pc(137) Method local137 = local98.getClass().getDeclaredMethod("finalize");
										local55.invoke(local130, Boolean.TRUE);
										local55.invoke(local137, Boolean.TRUE);
										try {
											local137.invoke(local98);
											local130.set(local98, Integer.valueOf(0));
											local17.remove(local74);
										} catch (@Pc(176) Throwable local176) {
										}
										local55.invoke(local137, Boolean.FALSE);
										local55.invoke(local130, Boolean.FALSE);
									}
								} catch (@Pc(198) Throwable local198) {
								}
								local55.invoke(local103, Boolean.FALSE);
							} catch (@Pc(210) Throwable local210) {
							}
						}
					} catch (@Pc(222) Throwable local222) {
					}
				}
			} catch (@Pc(228) Throwable local228) {
			}
			local55.invoke(local45, Boolean.FALSE);
		} catch (@Pc(240) Throwable local240) {
		}
		Static527.aHashtable6 = local17;
		return Static527.aHashtable6.isEmpty();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V")
	public static void method806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg2, 10);
		local8.method6227();
		local8.anInt7695 = arg3;
		local8.anInt7701 = arg1;
		local8.anInt7693 = arg0;
	}
}

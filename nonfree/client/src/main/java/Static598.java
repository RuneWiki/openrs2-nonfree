import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!vg", name = "dc", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_36 = new Class274(3, 6);

	@OriginalMember(owner = "client!vg", name = "Lc", descriptor = "I")
	public static int anInt3290 = -1;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILclient!ha;IIII)V")
	public static void method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87 arg3, @OriginalArg(7) int arg4) {
		arg3.method7898(arg0, arg1, -10660793, arg2, arg4);
		arg3.method7898(16, arg1 - 2, -16777216, arg2 + 1, arg4 + 1);
		arg3.method7933(-16777216, arg2 + 18, arg0 + -19, arg1 - 2, arg4 - -1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method2768() {
		@Pc(13) Class233 local13 = Static522.aClass233_51;
		synchronized (Static522.aClass233_51) {
			Static522.aClass233_51.method5665();
		}
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)Z")
	public static boolean method2774() {
		@Pc(7) Hashtable local7 = new Hashtable();
		@Pc(10) Enumeration local10 = Static352.aHashtable5.keys();
		while (local10.hasMoreElements()) {
			@Pc(14) Object local14 = local10.nextElement();
			local7.put(local14, Static352.aHashtable5.get(local14));
		}
		try {
			@Pc(27) Class local27 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(30) Class local30 = Class.forName("java.lang.ClassLoader");
			@Pc(39) Field local39 = local30.getDeclaredField("nativeLibraries");
			@Pc(49) Method local49 = local27.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local49.invoke(local39, Boolean.TRUE);
			try {
				local10 = Static352.aHashtable5.keys();
				while (local10.hasMoreElements()) {
					@Pc(67) String local67 = (String) local10.nextElement();
					try {
						@Pc(72) File local72 = (File) Static605.aHashtable7.get(local67);
						@Pc(77) Class local77 = (Class) Static352.aHashtable5.get(local67);
						@Pc(83) Vector local83 = (Vector) local39.get(local77.getClassLoader());
						for (@Pc(85) int local85 = 0; local85 < local83.size(); local85++) {
							try {
								@Pc(90) Object local90 = local83.elementAt(local85);
								@Pc(95) Field local95 = local90.getClass().getDeclaredField("name");
								local49.invoke(local95, Boolean.TRUE);
								try {
									@Pc(110) String local110 = (String) local95.get(local90);
									if (local110 != null && local110.equalsIgnoreCase(local72.getCanonicalPath())) {
										@Pc(122) Field local122 = local90.getClass().getDeclaredField("handle");
										@Pc(129) Method local129 = local90.getClass().getDeclaredMethod("finalize");
										local49.invoke(local122, Boolean.TRUE);
										local49.invoke(local129, Boolean.TRUE);
										try {
											local129.invoke(local90);
											local122.set(local90, Integer.valueOf(0));
											local7.remove(local67);
										} catch (@Pc(168) Throwable local168) {
										}
										local49.invoke(local129, Boolean.FALSE);
										local49.invoke(local122, Boolean.FALSE);
									}
								} catch (@Pc(190) Throwable local190) {
								}
								local49.invoke(local95, Boolean.FALSE);
							} catch (@Pc(202) Throwable local202) {
							}
						}
					} catch (@Pc(214) Throwable local214) {
					}
				}
			} catch (@Pc(220) Throwable local220) {
			}
			local49.invoke(local39, Boolean.FALSE);
		} catch (@Pc(232) Throwable local232) {
		}
		Static352.aHashtable5 = local7;
		return Static352.aHashtable5.isEmpty();
	}
}

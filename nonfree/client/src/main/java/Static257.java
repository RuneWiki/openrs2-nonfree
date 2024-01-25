import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "[Lclient!ue;")
	public static final Class343[] aClass343Array4 = new Class343[6];

	@OriginalMember(owner = "client!il", name = "c", descriptor = "I")
	public static int anInt6392 = 16777215;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
	public static boolean method5456() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static648.aHashtable14.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static648.aHashtable14.get(local17));
		}
		try {
			@Pc(32) Class local32 = Class.forName("java.lang.reflect.AccessibleObject");
			if (false) {
				return true;
			}
			@Pc(44) Class local44 = Class.forName("java.lang.ClassLoader");
			@Pc(50) Field local50 = local44.getDeclaredField("nativeLibraries");
			@Pc(62) Method local62 = local32.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local62.invoke(local50, Boolean.TRUE);
			try {
				local12 = Static648.aHashtable14.keys();
				while (local12.hasMoreElements()) {
					@Pc(81) String local81 = (String) local12.nextElement();
					try {
						@Pc(86) File local86 = (File) Static357.aHashtable8.get(local81);
						@Pc(91) Class local91 = (Class) Static648.aHashtable14.get(local81);
						@Pc(97) Vector local97 = (Vector) local50.get(local91.getClassLoader());
						for (@Pc(99) int local99 = 0; local99 < local97.size(); local99++) {
							try {
								@Pc(105) Object local105 = local97.elementAt(local99);
								@Pc(112) Field local112 = local105.getClass().getDeclaredField("name");
								local62.invoke(local112, Boolean.TRUE);
								try {
									@Pc(127) String local127 = (String) local112.get(local105);
									if (local127 != null && local127.equalsIgnoreCase(local86.getCanonicalPath())) {
										@Pc(143) Field local143 = local105.getClass().getDeclaredField("handle");
										@Pc(152) Method local152 = local105.getClass().getDeclaredMethod("finalize");
										local62.invoke(local143, Boolean.TRUE);
										local62.invoke(local152, Boolean.TRUE);
										try {
											local152.invoke(local105);
											local143.set(local105, Integer.valueOf(0));
											local9.remove(local81);
										} catch (@Pc(191) Throwable local191) {
										}
										local62.invoke(local152, Boolean.FALSE);
										local62.invoke(local143, Boolean.FALSE);
									}
								} catch (@Pc(213) Throwable local213) {
								}
								local62.invoke(local112, Boolean.FALSE);
							} catch (@Pc(225) Throwable local225) {
							}
						}
					} catch (@Pc(235) Throwable local235) {
					}
				}
			} catch (@Pc(241) Throwable local241) {
			}
			local62.invoke(local50, Boolean.FALSE);
		} catch (@Pc(253) Throwable local253) {
		}
		Static648.aHashtable14 = local9;
		return Static648.aHashtable14.isEmpty();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
	public static void method5458(@OriginalArg(0) int arg0) {
		if (Static326.anIntArray324 == null || arg0 > Static326.anIntArray324.length) {
			Static326.anIntArray324 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)J")
	public static long method5459(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static242.aCalendar1.clear();
		Static242.aCalendar1.set(arg2, arg0, arg1, 12, 0, 0);
		return Static242.aCalendar1.getTime().getTime();
	}
}

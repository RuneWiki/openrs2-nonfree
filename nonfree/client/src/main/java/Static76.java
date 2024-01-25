import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
	public static int anInt1481;

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
	public static int anInt1484 = 0;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)V")
	public static void method1302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class3_Sub5_Sub20 local11 = Static447.method6065((long) arg1, 9);
		local11.method8832();
		local11.anInt10754 = arg0;
		local11.anInt10756 = arg2;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z")
	public static boolean method1304() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(16) Enumeration local16 = Static217.aHashtable12.keys();
		while (local16.hasMoreElements()) {
			@Pc(21) Object local21 = local16.nextElement();
			local9.put(local21, Static217.aHashtable12.get(local21));
		}
		try {
			@Pc(34) Class local34 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			@Pc(41) Field local41 = local37.getDeclaredField("nativeLibraries");
			@Pc(51) Method local51 = local34.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local51.invoke(local41, Boolean.TRUE);
			try {
				local16 = Static217.aHashtable12.keys();
				while (local16.hasMoreElements()) {
					@Pc(70) String local70 = (String) local16.nextElement();
					try {
						@Pc(75) File local75 = (File) Static128.aHashtable4.get(local70);
						@Pc(80) Class local80 = (Class) Static217.aHashtable12.get(local70);
						@Pc(86) Vector local86 = (Vector) local41.get(local80.getClassLoader());
						for (@Pc(88) int local88 = 0; local88 < local86.size(); local88++) {
							try {
								@Pc(94) Object local94 = local86.elementAt(local88);
								@Pc(99) Field local99 = local94.getClass().getDeclaredField("name");
								local51.invoke(local99, Boolean.TRUE);
								try {
									@Pc(114) String local114 = (String) local99.get(local94);
									if (local114 != null && local114.equalsIgnoreCase(local75.getCanonicalPath())) {
										@Pc(126) Field local126 = local94.getClass().getDeclaredField("handle");
										@Pc(133) Method local133 = local94.getClass().getDeclaredMethod("finalize");
										local51.invoke(local126, Boolean.TRUE);
										local51.invoke(local133, Boolean.TRUE);
										try {
											local133.invoke(local94);
											local126.set(local94, Integer.valueOf(0));
											local9.remove(local70);
										} catch (@Pc(172) Throwable local172) {
										}
										local51.invoke(local133, Boolean.FALSE);
										local51.invoke(local126, Boolean.FALSE);
									}
								} catch (@Pc(194) Throwable local194) {
								}
								local51.invoke(local99, Boolean.FALSE);
							} catch (@Pc(206) Throwable local206) {
							}
						}
					} catch (@Pc(218) Throwable local218) {
					}
				}
			} catch (@Pc(224) Throwable local224) {
			}
			local51.invoke(local41, Boolean.FALSE);
		} catch (@Pc(236) Throwable local236) {
		}
		Static217.aHashtable12 = local9;
		return Static217.aHashtable12.isEmpty();
	}
}

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public static int anInt2270;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Z")
	public static boolean method2021() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static607.aHashtable6.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static607.aHashtable6.get(local17));
		}
		try {
			@Pc(32) Class local32 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			@Pc(43) Field local43 = local37.getDeclaredField("nativeLibraries");
			@Pc(55) Method local55 = local32.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local55.invoke(local43, Boolean.TRUE);
			if (false) {
				return true;
			}
			try {
				local12 = Static607.aHashtable6.keys();
				while (local12.hasMoreElements()) {
					@Pc(81) String local81 = (String) local12.nextElement();
					try {
						@Pc(86) File local86 = (File) Static308.aHashtable4.get(local81);
						@Pc(91) Class local91 = (Class) Static607.aHashtable6.get(local81);
						@Pc(97) Vector local97 = (Vector) local43.get(local91.getClassLoader());
						for (@Pc(99) int local99 = 0; local97.size() > local99; local99++) {
							try {
								@Pc(105) Object local105 = local97.elementAt(local99);
								@Pc(112) Field local112 = local105.getClass().getDeclaredField("name");
								local55.invoke(local112, Boolean.TRUE);
								try {
									@Pc(127) String local127 = (String) local112.get(local105);
									if (local127 != null && local127.equalsIgnoreCase(local86.getCanonicalPath())) {
										@Pc(143) Field local143 = local105.getClass().getDeclaredField("handle");
										@Pc(152) Method local152 = local105.getClass().getDeclaredMethod("finalize");
										local55.invoke(local143, Boolean.TRUE);
										local55.invoke(local152, Boolean.TRUE);
										try {
											local152.invoke(local105);
											local143.set(local105, Integer.valueOf(0));
											local9.remove(local81);
										} catch (@Pc(191) Throwable local191) {
										}
										local55.invoke(local152, Boolean.FALSE);
										local55.invoke(local143, Boolean.FALSE);
									}
								} catch (@Pc(213) Throwable local213) {
								}
								local55.invoke(local112, Boolean.FALSE);
							} catch (@Pc(225) Throwable local225) {
							}
						}
					} catch (@Pc(239) Throwable local239) {
					}
				}
			} catch (@Pc(245) Throwable local245) {
			}
			local55.invoke(local43, Boolean.FALSE);
		} catch (@Pc(257) Throwable local257) {
		}
		Static607.aHashtable6 = local9;
		return Static607.aHashtable6.isEmpty();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIZIZ)V")
	public static void method2023(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static401.method6008(arg2, arg1, arg3, 0, arg0, Static372.aClass256_Sub1Array1.length - 1);
		Static208.anInt3615 = 0;
		Static430.aClass3_Sub46_1 = null;
	}
}

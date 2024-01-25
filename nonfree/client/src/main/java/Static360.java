import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_10 = new Class55(0, 7);

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
	public static int anInt6253 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZI)V")
	public static void method5382(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub43 local8 = Static95.method1915(arg0, arg1);
		if (local8 != null) {
			for (@Pc(19) int local19 = 0; local19 < local8.anIntArray671.length; local19++) {
				local8.anIntArray671[local19] = -1;
				local8.anIntArray672[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ha;III)V")
	public static void method5383(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static28.aClass13_87 = arg0;
		Static403.aClass299ArrayArray1 = new Class299[arg2][arg1];
		if (Static543.anIntArray653 != null) {
			Static446.aClass49_1 = Static321.method4911(Static543.anIntArray653[4], Static543.anIntArray653[2], Static543.anIntArray653[0], Static543.anIntArray653[3], Static543.anIntArray653[5], Static543.anIntArray653[1]);
		}
		Static67.aClass299_2 = new Class299();
		Static433.method6269();
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Z")
	public static boolean method5384() {
		@Pc(14) Hashtable local14 = new Hashtable();
		@Pc(17) Enumeration local17 = Static621.aHashtable7.keys();
		while (local17.hasMoreElements()) {
			@Pc(21) Object local21 = local17.nextElement();
			local14.put(local21, Static621.aHashtable7.get(local21));
		}
		try {
			@Pc(34) Class local34 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			@Pc(41) Field local41 = local37.getDeclaredField("nativeLibraries");
			@Pc(51) Method local51 = local34.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local51.invoke(local41, Boolean.TRUE);
			try {
				local17 = Static621.aHashtable7.keys();
				while (local17.hasMoreElements()) {
					@Pc(69) String local69 = (String) local17.nextElement();
					try {
						@Pc(74) File local74 = (File) Static184.aHashtable2.get(local69);
						@Pc(79) Class local79 = (Class) Static621.aHashtable7.get(local69);
						@Pc(85) Vector local85 = (Vector) local41.get(local79.getClassLoader());
						for (@Pc(87) int local87 = 0; local85.size() > local87; local87++) {
							try {
								@Pc(92) Object local92 = local85.elementAt(local87);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local51.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local74.getCanonicalPath())) {
										@Pc(124) Field local124 = local92.getClass().getDeclaredField("handle");
										@Pc(131) Method local131 = local92.getClass().getDeclaredMethod("finalize");
										local51.invoke(local124, Boolean.TRUE);
										local51.invoke(local131, Boolean.TRUE);
										try {
											local131.invoke(local92);
											local124.set(local92, Integer.valueOf(0));
											local14.remove(local69);
										} catch (@Pc(170) Throwable local170) {
										}
										local51.invoke(local131, Boolean.FALSE);
										local51.invoke(local124, Boolean.FALSE);
									}
								} catch (@Pc(192) Throwable local192) {
								}
								local51.invoke(local97, Boolean.FALSE);
							} catch (@Pc(204) Throwable local204) {
							}
						}
					} catch (@Pc(216) Throwable local216) {
					}
				}
			} catch (@Pc(222) Throwable local222) {
			}
			local51.invoke(local41, Boolean.FALSE);
		} catch (@Pc(234) Throwable local234) {
		}
		Static621.aHashtable7 = local14;
		return Static621.aHashtable7.isEmpty();
	}
}

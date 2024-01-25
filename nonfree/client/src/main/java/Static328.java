import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_89 = new Class98(38, 4);

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_90 = new Class98(3, 3);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[ILclient!en;IZB)Lclient!an;")
	public static Class16_Sub1_Sub1 method5048(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class90_Sub1 arg2, @OriginalArg(3) int arg3) {
		if (arg2.aBoolean159 || Static331.method5078(arg3) && Static331.method5078(arg0)) {
			return new Class16_Sub1_Sub1(arg2, 3553, arg3, arg0, false, arg1);
		} else if (arg2.aBoolean167) {
			return new Class16_Sub1_Sub1(arg2, 34037, arg3, arg0, false, arg1);
		} else {
			return new Class16_Sub1_Sub1(arg2, arg3, arg0, Static14.method5936(arg3), Static14.method5936(arg0), arg1);
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)Z")
	public static boolean method5050() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static426.aHashtable5.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static426.aHashtable5.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(41) Class local41 = Class.forName("java.lang.ClassLoader");
			@Pc(45) Field local45 = local41.getDeclaredField("nativeLibraries");
			@Pc(55) Method local55 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local55.invoke(local45, Boolean.TRUE);
			try {
				local12 = Static426.aHashtable5.keys();
				while (local12.hasMoreElements()) {
					@Pc(74) String local74 = (String) local12.nextElement();
					try {
						@Pc(79) File local79 = (File) Static497.aHashtable6.get(local74);
						@Pc(84) Class local84 = (Class) Static426.aHashtable5.get(local74);
						@Pc(90) Vector local90 = (Vector) local45.get(local84.getClassLoader());
						for (@Pc(92) int local92 = 0; local90.size() > local92; local92++) {
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
											local9.remove(local74);
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
					} catch (@Pc(218) Throwable local218) {
					}
				}
			} catch (@Pc(224) Throwable local224) {
			}
			local55.invoke(local45, Boolean.FALSE);
		} catch (@Pc(236) Throwable local236) {
		}
		Static426.aHashtable5 = local9;
		return Static426.aHashtable5.isEmpty();
	}
}

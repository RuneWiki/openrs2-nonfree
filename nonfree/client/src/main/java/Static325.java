import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "Lclient!dba;")
	public static Class55 aClass55_4;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_15 = new Class33(2, 14);

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
	public static int anInt6335 = -1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z")
	public static boolean method5489() {
		@Pc(7) Hashtable local7 = new Hashtable();
		@Pc(10) Enumeration local10 = Static302.aHashtable8.keys();
		while (local10.hasMoreElements()) {
			@Pc(14) Object local14 = local10.nextElement();
			local7.put(local14, Static302.aHashtable8.get(local14));
		}
		try {
			@Pc(27) Class local27 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(30) Class local30 = Class.forName("java.lang.ClassLoader");
			@Pc(34) Field local34 = local30.getDeclaredField("nativeLibraries");
			@Pc(49) Method local49 = local27.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local49.invoke(local34, Boolean.TRUE);
			try {
				local10 = Static302.aHashtable8.keys();
				while (local10.hasMoreElements()) {
					@Pc(67) String local67 = (String) local10.nextElement();
					try {
						@Pc(72) File local72 = (File) Static241.aHashtable6.get(local67);
						@Pc(77) Class local77 = (Class) Static302.aHashtable8.get(local67);
						@Pc(83) Vector local83 = (Vector) local34.get(local77.getClassLoader());
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
			local49.invoke(local34, Boolean.FALSE);
		} catch (@Pc(232) Throwable local232) {
		}
		Static302.aHashtable8 = local7;
		return Static302.aHashtable8.isEmpty();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII)V")
	public static void method5490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static459.method6750(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(37) int local37 = -1;
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (Static92.anInt2338 <= arg0 && Static341.anInt6379 >= arg0) {
			@Pc(47) int[] local47 = Static81.anIntArrayArray25[arg0];
			local56 = Static193.method3621(Static299.anInt4491, arg1 - arg5, Static95.anInt2358);
			local65 = Static193.method3621(Static299.anInt4491, arg1 + arg5, Static95.anInt2358);
			local73 = Static193.method3621(Static299.anInt4491, arg1 - local15, Static95.anInt2358);
			local81 = Static193.method3621(Static299.anInt4491, local15 + arg1, Static95.anInt2358);
			Static227.method7421(local56, arg3, local73, local47);
			Static227.method7421(local73, arg2, local81, local47);
			Static227.method7421(local81, arg3, local65, local47);
		}
		@Pc(101) int local101 = -1;
		while (local10 < local21) {
			local37 += 2;
			local101 += 2;
			local29 += local101;
			local24 += local37;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				local29 -= local26 << 1;
				Static195.anIntArray315[local26] = local10;
			}
			local10++;
			@Pc(198) int local198;
			@Pc(206) int local206;
			@Pc(217) int[] local217;
			@Pc(144) int local144;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local144 = arg0 - local21;
				local56 = arg0 + local21;
				if (local56 >= Static92.anInt2338 && Static341.anInt6379 >= local144) {
					if (local15 > local21) {
						local65 = Static195.anIntArray315[local21];
						local73 = Static193.method3621(Static299.anInt4491, arg1 + local10, Static95.anInt2358);
						local81 = Static193.method3621(Static299.anInt4491, arg1 - local10, Static95.anInt2358);
						local198 = Static193.method3621(Static299.anInt4491, local65 + arg1, Static95.anInt2358);
						local206 = Static193.method3621(Static299.anInt4491, arg1 - local65, Static95.anInt2358);
						if (Static341.anInt6379 >= local56) {
							local217 = Static81.anIntArrayArray25[local56];
							Static227.method7421(local81, arg3, local206, local217);
							Static227.method7421(local206, arg2, local198, local217);
							Static227.method7421(local198, arg3, local73, local217);
						}
						if (local144 >= Static92.anInt2338) {
							local217 = Static81.anIntArrayArray25[local144];
							Static227.method7421(local81, arg3, local206, local217);
							Static227.method7421(local206, arg2, local198, local217);
							Static227.method7421(local198, arg3, local73, local217);
						}
					} else {
						local65 = Static193.method3621(Static299.anInt4491, local10 + arg1, Static95.anInt2358);
						local73 = Static193.method3621(Static299.anInt4491, arg1 - local10, Static95.anInt2358);
						if (local56 <= Static341.anInt6379) {
							Static227.method7421(local73, arg3, local65, Static81.anIntArrayArray25[local56]);
						}
						if (Static92.anInt2338 <= local144) {
							Static227.method7421(local73, arg3, local65, Static81.anIntArrayArray25[local144]);
						}
					}
				}
			}
			local144 = arg0 - local10;
			local56 = arg0 + local10;
			if (Static92.anInt2338 <= local56 && local144 <= Static341.anInt6379) {
				local65 = arg1 + local21;
				local73 = arg1 - local21;
				if (Static95.anInt2358 <= local65 && local73 <= Static299.anInt4491) {
					local65 = Static193.method3621(Static299.anInt4491, local65, Static95.anInt2358);
					local73 = Static193.method3621(Static299.anInt4491, local73, Static95.anInt2358);
					if (local15 > local10) {
						local81 = local26 < local10 ? Static195.anIntArray315[local10] : local26;
						local198 = Static193.method3621(Static299.anInt4491, local81 + arg1, Static95.anInt2358);
						local206 = Static193.method3621(Static299.anInt4491, arg1 - local81, Static95.anInt2358);
						if (Static341.anInt6379 >= local56) {
							local217 = Static81.anIntArrayArray25[local56];
							Static227.method7421(local73, arg3, local206, local217);
							Static227.method7421(local206, arg2, local198, local217);
							Static227.method7421(local198, arg3, local65, local217);
						}
						if (Static92.anInt2338 <= local144) {
							local217 = Static81.anIntArrayArray25[local144];
							Static227.method7421(local73, arg3, local206, local217);
							Static227.method7421(local206, arg2, local198, local217);
							Static227.method7421(local198, arg3, local65, local217);
						}
					} else {
						if (local56 <= Static341.anInt6379) {
							Static227.method7421(local73, arg3, local65, Static81.anIntArrayArray25[local56]);
						}
						if (local144 >= Static92.anInt2338) {
							Static227.method7421(local73, arg3, local65, Static81.anIntArrayArray25[local144]);
						}
					}
				}
			}
		}
	}
}

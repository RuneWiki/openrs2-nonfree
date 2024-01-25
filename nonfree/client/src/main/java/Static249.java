import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_44 = new Class77(72, 1);

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString50 = null;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Z")
	public static boolean method4283() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static417.aHashtable14.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static417.aHashtable14.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(51) Method local51 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local51.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static417.aHashtable14.keys();
				while (local12.hasMoreElements()) {
					@Pc(70) String local70 = (String) local12.nextElement();
					try {
						@Pc(75) File local75 = (File) Static158.aHashtable6.get(local70);
						@Pc(80) Class local80 = (Class) Static417.aHashtable14.get(local70);
						@Pc(86) Vector local86 = (Vector) local37.get(local80.getClassLoader());
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
					} catch (@Pc(214) Throwable local214) {
					}
				}
			} catch (@Pc(220) Throwable local220) {
			}
			local51.invoke(local37, Boolean.FALSE);
		} catch (@Pc(232) Throwable local232) {
		}
		Static417.aHashtable14 = local9;
		return Static417.aHashtable14.isEmpty();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z")
	public static boolean method4284() {
		return Static222.method4058("jaclib") ? Static222.method4058("hw3d") : false;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIB)Z")
	public static boolean method4291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBIZLclient!kf;Lclient!kf;Z)I")
	public static int method4292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class23_Sub1 arg3, @OriginalArg(5) Class23_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static60.method1444(arg3, arg4, arg1, arg2);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(47) int local47 = Static60.method1444(arg3, arg4, arg0, arg5);
			return arg5 ? -local47 : local47;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qa;Lclient!jt;III)V")
	public static void method4293(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class37 local12;
		if (arg3 < Static537.anInt9566) {
			local12 = Static120.aClass37ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass30_Sub3_1 != null && local12.aClass30_Sub3_1.method7901()) {
				arg1.method7904(0, true, 0, local12.aClass30_Sub3_1, Static316.anInt6040, arg0);
			}
		}
		if (arg4 < Static537.anInt9566) {
			local12 = Static120.aClass37ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass30_Sub3_1 != null && local12.aClass30_Sub3_1.method7901()) {
				arg1.method7904(Static316.anInt6040, true, 0, local12.aClass30_Sub3_1, 0, arg0);
			}
		}
		if (arg3 < Static537.anInt9566 && arg4 < Static509.anInt9164) {
			local12 = Static120.aClass37ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass30_Sub3_1 != null && local12.aClass30_Sub3_1.method7901()) {
				arg1.method7904(Static316.anInt6040, true, 0, local12.aClass30_Sub3_1, Static316.anInt6040, arg0);
			}
		}
		if (arg3 < Static537.anInt9566 && arg4 > 0) {
			local12 = Static120.aClass37ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass30_Sub3_1 != null && local12.aClass30_Sub3_1.method7901()) {
				arg1.method7904(-Static316.anInt6040, true, 0, local12.aClass30_Sub3_1, Static316.anInt6040, arg0);
			}
		}
	}
}

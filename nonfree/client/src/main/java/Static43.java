import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)Z")
	public static boolean method607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static420.method6183(arg1, arg0) || Static93.method1446(arg0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!gq;")
	public static Class139 method608(@OriginalArg(1) int arg0) {
		@Pc(8) Class139[] local8 = Static224.method3191();
		for (@Pc(17) int local17 = 0; local17 < local8.length; local17++) {
			@Pc(22) Class139 local22 = local8[local17];
			if (arg0 == local22.anInt3234) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([I[JB)V")
	public static void method609(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static633.method8419(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
	public static boolean method610() {
		@Pc(7) Hashtable local7 = new Hashtable();
		@Pc(10) Enumeration local10 = Static552.aHashtable37.keys();
		while (local10.hasMoreElements()) {
			@Pc(14) Object local14 = local10.nextElement();
			local7.put(local14, Static552.aHashtable37.get(local14));
		}
		try {
			@Pc(27) Class local27 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(30) Class local30 = Class.forName("java.lang.ClassLoader");
			@Pc(34) Field local34 = local30.getDeclaredField("nativeLibraries");
			@Pc(44) Method local44 = local27.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local44.invoke(local34, Boolean.TRUE);
			try {
				local10 = Static552.aHashtable37.keys();
				while (local10.hasMoreElements()) {
					@Pc(70) String local70 = (String) local10.nextElement();
					try {
						@Pc(75) File local75 = (File) Static621.aHashtable35.get(local70);
						@Pc(80) Class local80 = (Class) Static552.aHashtable37.get(local70);
						@Pc(86) Vector local86 = (Vector) local34.get(local80.getClassLoader());
						for (@Pc(88) int local88 = 0; local88 < local86.size(); local88++) {
							try {
								@Pc(93) Object local93 = local86.elementAt(local88);
								@Pc(98) Field local98 = local93.getClass().getDeclaredField("name");
								local44.invoke(local98, Boolean.TRUE);
								try {
									@Pc(113) String local113 = (String) local98.get(local93);
									if (local113 != null && local113.equalsIgnoreCase(local75.getCanonicalPath())) {
										@Pc(125) Field local125 = local93.getClass().getDeclaredField("handle");
										@Pc(132) Method local132 = local93.getClass().getDeclaredMethod("finalize");
										local44.invoke(local125, Boolean.TRUE);
										local44.invoke(local132, Boolean.TRUE);
										try {
											local132.invoke(local93);
											local125.set(local93, Integer.valueOf(0));
											local7.remove(local70);
										} catch (@Pc(171) Throwable local171) {
										}
										local44.invoke(local132, Boolean.FALSE);
										local44.invoke(local125, Boolean.FALSE);
									}
								} catch (@Pc(193) Throwable local193) {
								}
								local44.invoke(local98, Boolean.FALSE);
							} catch (@Pc(205) Throwable local205) {
							}
						}
					} catch (@Pc(217) Throwable local217) {
					}
				}
			} catch (@Pc(223) Throwable local223) {
			}
			local44.invoke(local34, Boolean.FALSE);
		} catch (@Pc(235) Throwable local235) {
		}
		Static552.aHashtable37 = local7;
		return Static552.aHashtable37.isEmpty();
	}
}

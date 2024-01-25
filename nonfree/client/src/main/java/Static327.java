import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
	public static int anInt6816;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_86 = new Class276(63, 8);

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_66 = new Class230(51, 8);

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	public static int anInt6815 = 0;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_87 = new Class276(114, 4);

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "Lclient!tc;")
	public static Class305 aClass305_9 = null;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)V")
	public static void method5676() {
		if (Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823) || Static96.anInt2320 == Static212.anInt4380) {
			Static291.method4969(Static546.aClass15_16);
			if (Static484.anInt9032 != Static212.anInt4380) {
				Static573.method8192();
			}
		} else {
			Static430.method6817(11, Static368.anInt7248, Static187.anInt3746, false);
		}
	}

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "(B)Z")
	public static boolean method5677() {
		@Pc(7) Hashtable local7 = new Hashtable();
		@Pc(10) Enumeration local10 = Static507.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(14) Object local14 = local10.nextElement();
			local7.put(local14, Static507.aHashtable6.get(local14));
		}
		try {
			@Pc(27) Class local27 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(30) Class local30 = Class.forName("java.lang.ClassLoader");
			@Pc(34) Field local34 = local30.getDeclaredField("nativeLibraries");
			@Pc(44) Method local44 = local27.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local44.invoke(local34, Boolean.TRUE);
			try {
				local10 = Static507.aHashtable6.keys();
				while (local10.hasMoreElements()) {
					@Pc(62) String local62 = (String) local10.nextElement();
					try {
						@Pc(67) File local67 = (File) Static598.aHashtable7.get(local62);
						@Pc(72) Class local72 = (Class) Static507.aHashtable6.get(local62);
						@Pc(78) Vector local78 = (Vector) local34.get(local72.getClassLoader());
						for (@Pc(80) int local80 = 0; local80 < local78.size(); local80++) {
							try {
								@Pc(85) Object local85 = local78.elementAt(local80);
								@Pc(90) Field local90 = local85.getClass().getDeclaredField("name");
								local44.invoke(local90, Boolean.TRUE);
								try {
									@Pc(105) String local105 = (String) local90.get(local85);
									if (local105 != null && local105.equalsIgnoreCase(local67.getCanonicalPath())) {
										@Pc(117) Field local117 = local85.getClass().getDeclaredField("handle");
										@Pc(124) Method local124 = local85.getClass().getDeclaredMethod("finalize");
										local44.invoke(local117, Boolean.TRUE);
										local44.invoke(local124, Boolean.TRUE);
										try {
											local124.invoke(local85);
											local117.set(local85, Integer.valueOf(0));
											local7.remove(local62);
										} catch (@Pc(163) Throwable local163) {
										}
										local44.invoke(local124, Boolean.FALSE);
										local44.invoke(local117, Boolean.FALSE);
									}
								} catch (@Pc(185) Throwable local185) {
								}
								local44.invoke(local90, Boolean.FALSE);
							} catch (@Pc(197) Throwable local197) {
							}
						}
					} catch (@Pc(205) Throwable local205) {
					}
				}
			} catch (@Pc(217) Throwable local217) {
			}
			local44.invoke(local34, Boolean.FALSE);
		} catch (@Pc(229) Throwable local229) {
		}
		Static507.aHashtable6 = local7;
		return Static507.aHashtable6.isEmpty();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)I")
	public static int method5678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static415.method6701(arg0 + 91923, 4, arg1 + 45365) + (Static415.method6701(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static415.method6701(arg0, 1, arg1) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}
}

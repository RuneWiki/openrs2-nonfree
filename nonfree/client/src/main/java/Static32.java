import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!baa", name = "u", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BILclient!pe;)V")
	public static void method413(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub1 arg1) {
		if (arg1.anIntArray85 == null) {
			return;
		}
		@Pc(13) int local13 = arg1.anIntArray85[arg0 + 1];
		if (arg1.anInt1277 == local13) {
			return;
		}
		arg1.anInt1223 = 0;
		arg1.anInt1221 = 0;
		arg1.anInt1201 = 0;
		arg1.anInt1281 = arg1.anInt1280;
		arg1.anInt1211 = 1;
		arg1.anInt1277 = local13;
		if (arg1.anInt1277 != -1) {
			Static67.method1108(arg1, arg1.anInt1223, Static435.aClass298_1.method7034(arg1.anInt1277));
		}
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)Z")
	public static boolean method414() {
		return Static72.anInt1497 == 0 ? Static404.aClass5_Sub1_Sub5_2.method8295() : true;
	}

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "(B)Z")
	public static boolean method415() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static632.aHashtable7.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static632.aHashtable7.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static632.aHashtable7.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static460.aHashtable5.get(local71);
						@Pc(81) Class local81 = (Class) Static632.aHashtable7.get(local71);
						@Pc(87) Vector local87 = (Vector) local37.get(local81.getClassLoader());
						for (@Pc(89) int local89 = 0; local87.size() > local89; local89++) {
							try {
								@Pc(95) Object local95 = local87.elementAt(local89);
								@Pc(100) Field local100 = local95.getClass().getDeclaredField("name");
								local52.invoke(local100, Boolean.TRUE);
								try {
									@Pc(115) String local115 = (String) local100.get(local95);
									if (local115 != null && local115.equalsIgnoreCase(local76.getCanonicalPath())) {
										@Pc(127) Field local127 = local95.getClass().getDeclaredField("handle");
										@Pc(134) Method local134 = local95.getClass().getDeclaredMethod("finalize");
										local52.invoke(local127, Boolean.TRUE);
										local52.invoke(local134, Boolean.TRUE);
										try {
											local134.invoke(local95);
											local127.set(local95, Integer.valueOf(0));
											local9.remove(local71);
										} catch (@Pc(173) Throwable local173) {
										}
										local52.invoke(local134, Boolean.FALSE);
										local52.invoke(local127, Boolean.FALSE);
									}
								} catch (@Pc(195) Throwable local195) {
								}
								local52.invoke(local100, Boolean.FALSE);
							} catch (@Pc(207) Throwable local207) {
							}
						}
					} catch (@Pc(215) Throwable local215) {
					}
				}
			} catch (@Pc(221) Throwable local221) {
			}
			local52.invoke(local37, Boolean.FALSE);
		} catch (@Pc(233) Throwable local233) {
		}
		Static632.aHashtable7 = local9;
		return Static632.aHashtable7.isEmpty();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIII)V")
	public static void method416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg2) {
			Static200.method3542(arg1, arg2, arg4, arg3);
		} else if (arg1 - arg2 >= Static275.anInt4919 && arg1 + arg2 <= Static529.anInt9089 && Static554.anInt9362 <= arg3 - arg0 && Static62.anInt1300 >= arg0 + arg3) {
			Static167.method2475(arg3, arg0, arg4, arg2, arg1);
		} else {
			Static530.method8444(arg2, arg4, arg0, arg1, arg3);
		}
	}
}

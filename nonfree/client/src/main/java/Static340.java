import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Z")
	public static boolean aBoolean474;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!ij;ZI)V")
	public static void method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub32 local10 = (Class3_Sub32) Static497.aClass193_54.method4457(); local10 != null; local10 = (Class3_Sub32) Static497.aClass193_54.method4459()) {
			if (arg1 == local10.anInt6062 && local10.anInt6061 == arg0 << 9 && arg3 << 9 == local10.anInt6071 && arg2.anInt4778 == local10.aClass178_1.anInt4778) {
				if (local10.aClass3_Sub9_Sub2_1 != null) {
					Static557.aClass3_Sub9_Sub1_2.method1420(local10.aClass3_Sub9_Sub2_1);
					local10.aClass3_Sub9_Sub2_1 = null;
				}
				if (local10.aClass3_Sub9_Sub2_2 != null) {
					Static557.aClass3_Sub9_Sub1_2.method1420(local10.aClass3_Sub9_Sub2_2);
					local10.aClass3_Sub9_Sub2_2 = null;
				}
				local10.method8770();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Z")
	public static boolean method5163(@OriginalArg(1) int arg0) {
		if (arg0 == 53 || arg0 == 59 || arg0 == 12 || arg0 == 21 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	public static boolean method5164() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static679.aHashtable7.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static679.aHashtable7.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local33.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static679.aHashtable7.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static647.aHashtable6.get(local71);
						@Pc(81) Class local81 = (Class) Static679.aHashtable7.get(local71);
						@Pc(87) Vector local87 = (Vector) local42.get(local81.getClassLoader());
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
			local52.invoke(local42, Boolean.FALSE);
		} catch (@Pc(233) Throwable local233) {
		}
		Static679.aHashtable7 = local9;
		return Static679.aHashtable7.isEmpty();
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
	public static boolean method5165() {
		return Static54.anInt1418 != 0;
	}
}

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	public static int anInt7470;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!kw;)V")
	public static void method6491(@OriginalArg(1) Class5_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static357.anObject14 == null) {
			@Pc(9) Class98_Sub1_Sub2 local9 = new Class98_Sub1_Sub2();
			local16 = local9.method2914();
			Static357.anObject14 = Static125.method2479(local16);
		}
		if (Static540.anObject17 == null) {
			@Pc(27) Class98_Sub2_Sub2 local27 = new Class98_Sub2_Sub2();
			local16 = local27.method7058();
			Static540.anObject17 = Static125.method2479(local16);
		}
		@Pc(42) Class326 local42 = arg0.aClass326_1;
		if (local42.method8010() && Static558.anObject18 == null) {
			local16 = Static569.method8127(4.0F, 0.5F, 0.6F, 4.0F, new Class234_Sub1(419684), 16.0F);
			Static558.anObject18 = Static125.method2479(local16);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!ha;IIII)V")
	public static void method6492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		Static398.aClass5_13 = arg2;
		Static72.aClass39_3 = Static398.aClass5_13.method7552();
		Static46.aClass39_2 = Static398.aClass5_13.method7552();
		Static420.aClass39_10 = Static398.aClass5_13.method7552();
		Static613.anInterface8_1 = null;
		Static578.anInt9504 = 2;
		anInt7470 = 0;
		Static150.anInt2968 = 2;
		Static153.anInt3029 = arg3;
		Static234.anInt4427 = 1;
		Static596.anInt9751 = 0;
		Static159.anInt3138 = arg1;
		Static434.method6781(arg0, arg4);
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Z")
	public static boolean method6493() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static318.aHashtable4.keys();
		while (local12.hasMoreElements()) {
			@Pc(22) Object local22 = local12.nextElement();
			local9.put(local22, Static318.aHashtable4.get(local22));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(38) Class local38 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local38.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static318.aHashtable4.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static340.aHashtable6.get(local71);
						@Pc(81) Class local81 = (Class) Static318.aHashtable4.get(local71);
						@Pc(87) Vector local87 = (Vector) local42.get(local81.getClassLoader());
						for (@Pc(89) int local89 = 0; local89 < local87.size(); local89++) {
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
		Static318.aHashtable4 = local9;
		return Static318.aHashtable4.isEmpty();
	}
}

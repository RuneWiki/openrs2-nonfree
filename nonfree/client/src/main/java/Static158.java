import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array8;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public static int anInt3981 = 0;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
	public static void method3215(@OriginalArg(0) int arg0) {
		Static535.anInt9214 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static489.anInt8688; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static596.anInt10195; local6++) {
				if (Static405.aClass56ArrayArrayArray2[arg0][local3][local6] == null) {
					Static405.aClass56ArrayArrayArray2[arg0][local3][local6] = new Class56(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)Z")
	public static boolean method3216() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static585.aHashtable7.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static585.aHashtable7.get(local17));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(38) Class local38 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local38.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static585.aHashtable7.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static505.aHashtable6.get(local71);
						@Pc(81) Class local81 = (Class) Static585.aHashtable7.get(local71);
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
					} catch (@Pc(219) Throwable local219) {
					}
				}
			} catch (@Pc(225) Throwable local225) {
			}
			local52.invoke(local42, Boolean.FALSE);
		} catch (@Pc(237) Throwable local237) {
		}
		Static585.aHashtable7 = local9;
		return Static585.aHashtable7.isEmpty();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!ig;)V")
	public static void method3218(@OriginalArg(1) Class8_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method8565();
		Static519.aClass279Array1 = new Class279[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static519.aClass279Array1[local14] = new Class279();
			Static519.aClass279Array1[local14].anInt8488 = arg0.method8565();
			Static519.aClass279Array1[local14].aString86 = arg0.method8569();
		}
		Static46.anInt1577 = arg0.method8565();
		Static599.anInt10217 = arg0.method8565();
		Static493.anInt8729 = arg0.method8565();
		Static364.aClass98_Sub1Array2 = new Class98_Sub1[Static599.anInt10217 + 1 - Static46.anInt1577];
		for (@Pc(74) int local74 = 0; local74 < Static493.anInt8729; local74++) {
			@Pc(85) int local85 = arg0.method8565();
			@Pc(93) Class98_Sub1 local93 = Static364.aClass98_Sub1Array2[local85] = new Class98_Sub1();
			local93.anInt3669 = arg0.method8525();
			local93.anInt3678 = arg0.method8540();
			local93.anInt3682 = local85 + Static46.anInt1577;
			local93.aString40 = arg0.method8569();
			local93.aString39 = arg0.method8569();
		}
		Static315.anInt9133 = arg0.method8540();
		Static367.aBoolean490 = true;
	}
}

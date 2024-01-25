import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "Lclient!rs;")
	public static Class308 aClass308_2;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(Z)Z")
	public static boolean method7409() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static214.aHashtable2.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static214.aHashtable2.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static214.aHashtable2.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static292.aHashtable3.get(local71);
						@Pc(81) Class local81 = (Class) Static214.aHashtable2.get(local71);
						@Pc(87) Vector local87 = (Vector) local37.get(local81.getClassLoader());
						for (@Pc(89) int local89 = 0; local89 < local87.size(); local89++) {
							try {
								@Pc(95) Object local95 = local87.elementAt(local89);
								@Pc(100) Field local100 = local95.getClass().getDeclaredField("name");
								local47.invoke(local100, Boolean.TRUE);
								try {
									@Pc(115) String local115 = (String) local100.get(local95);
									if (local115 != null && local115.equalsIgnoreCase(local76.getCanonicalPath())) {
										@Pc(127) Field local127 = local95.getClass().getDeclaredField("handle");
										@Pc(134) Method local134 = local95.getClass().getDeclaredMethod("finalize");
										local47.invoke(local127, Boolean.TRUE);
										local47.invoke(local134, Boolean.TRUE);
										try {
											local134.invoke(local95);
											local127.set(local95, Integer.valueOf(0));
											local9.remove(local71);
										} catch (@Pc(173) Throwable local173) {
										}
										local47.invoke(local134, Boolean.FALSE);
										local47.invoke(local127, Boolean.FALSE);
									}
								} catch (@Pc(195) Throwable local195) {
								}
								local47.invoke(local100, Boolean.FALSE);
							} catch (@Pc(207) Throwable local207) {
							}
						}
					} catch (@Pc(219) Throwable local219) {
					}
				}
			} catch (@Pc(225) Throwable local225) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(237) Throwable local237) {
		}
		Static214.aHashtable2 = local9;
		return Static214.aHashtable2.isEmpty();
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "()V")
	public static void method7410() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static316.aClass53ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static316.aClass53ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static322.anInt5120; local6++) {
					for (local9 = 0; local9 < Class13_Sub1_Sub4_Sub1.lb; local9++) {
						if (Static316.aClass53ArrayArrayArray3[local3][local6][local9] != null) {
							Static316.aClass53ArrayArrayArray3[local3][local6][local9].method968();
						}
						Static316.aClass53ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static316.aClass53ArrayArrayArray3 = null;
		Static462.aClass76Array3 = null;
		if (Static253.aClass53ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static253.aClass53ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static322.anInt5120; local6++) {
					for (local9 = 0; local9 < Class13_Sub1_Sub4_Sub1.lb; local9++) {
						if (Static253.aClass53ArrayArrayArray2[local3][local6][local9] != null) {
							Static253.aClass53ArrayArrayArray2[local3][local6][local9].method968();
						}
						Static253.aClass53ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static253.aClass53ArrayArrayArray2 = null;
		Static313.aClass76Array1 = null;
		Static28.aClass53ArrayArrayArray1 = null;
		Static314.aClass76Array2 = null;
		Static494.aBooleanArrayArray8 = null;
		Static186.aBooleanArrayArray5 = null;
		Static541.anIntArray603 = null;
		Static215.aBooleanArrayArrayArray1 = null;
		Static248.aBooleanArrayArrayArray2 = null;
		Static317.method4253();
		if (Static335.aClass13_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static332.anInt5259; local3++) {
				Static335.aClass13_Sub1_Sub1Array1[local3] = null;
			}
			Static332.anInt5259 = 0;
		}
		if (Static597.aClass13_Sub1ArrayArray3 != null) {
			for (local3 = 0; local3 < Static369.anIntArray426[0]; local3++) {
				Static597.aClass13_Sub1ArrayArray3[0][local3] = null;
			}
			for (local6 = 0; local6 < Static369.anIntArray426[1]; local6++) {
				Static597.aClass13_Sub1ArrayArray3[1][local6] = null;
			}
			Static369.anIntArray426 = new int[2];
		}
		if (Static417.aClass13_Sub1ArrayArray2 != null) {
			for (local3 = 0; local3 < Static28.anIntArray63[0]; local3++) {
				Static417.aClass13_Sub1ArrayArray2[0][local3] = null;
			}
			for (local6 = 0; local6 < Static28.anIntArray63[1]; local6++) {
				Static417.aClass13_Sub1ArrayArray2[1][local6] = null;
			}
			Static28.anIntArray63 = new int[2];
		}
		if (Static139.aClass13_Sub1ArrayArray1 != null) {
			for (local3 = 0; local3 < Static497.anIntArray571[0]; local3++) {
				Static139.aClass13_Sub1ArrayArray1[0][local3] = null;
			}
			for (local6 = 0; local6 < Static497.anIntArray571[1]; local6++) {
				Static139.aClass13_Sub1ArrayArray1[1][local6] = null;
			}
			Static497.anIntArray571 = new int[2];
		}
		if (Static466.aClass13_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static466.aClass13_Sub1Array3.length; local3++) {
				Static466.aClass13_Sub1Array3[local3] = null;
			}
			Static508.anInt8493 = 0;
		}
		if (Static495.aClass13_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static495.aClass13_Sub1Array2.length; local3++) {
				Static495.aClass13_Sub1Array2[local3] = null;
			}
			Static478.anInt9923 = 0;
		}
		if (Static90.aClass367Array1 != null) {
			for (local3 = 0; local3 < Static389.anInt6119; local3++) {
				Static90.aClass367Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static10.anInt139; local6++) {
				for (local9 = 0; local9 < Static322.anInt5120; local9++) {
					for (@Pc(294) int local294 = 0; local294 < Class13_Sub1_Sub4_Sub1.lb; local294++) {
						Static478.aLongArrayArrayArray4[local6][local9][local294] = 0L;
					}
				}
			}
			Static389.anInt6119 = 0;
		}
		Static518.method7246();
		Static219.aClass94_4 = Static219.aClass94_3;
		Static219.aClass94_4.method1859();
		Static136.aByteArrayArray32 = null;
		Static491.anIntArrayArray50 = null;
		Static459.aShortArrayArray25 = null;
		if (Static498.aClass212Array1 != null) {
			Static430.method7070();
			Static207.aClass95_6.method6971(1);
			Static207.aClass95_6.method6982(0);
		}
		if (Static602.aClass358Array1 != null) {
			Static602.aClass358Array1 = null;
		}
		Static207.aClass95_6 = null;
	}
}

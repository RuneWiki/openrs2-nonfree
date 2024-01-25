import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "[Lclient!b;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_208 = new Class215(49, 4);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
	public static boolean method7853() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static287.aHashtable5.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static287.aHashtable5.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static287.aHashtable5.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static590.aHashtable7.get(local71);
						@Pc(81) Class local81 = (Class) Static287.aHashtable5.get(local71);
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
					} catch (@Pc(219) Throwable local219) {
					}
				}
			} catch (@Pc(225) Throwable local225) {
			}
			local52.invoke(local37, Boolean.FALSE);
		} catch (@Pc(237) Throwable local237) {
		}
		Static287.aHashtable5 = local9;
		return Static287.aHashtable5.isEmpty();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
	public static void method7854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static303.aFloat6 > Static303.aFloat5) {
			Static303.aFloat5 = (float) ((double) Static303.aFloat5 + (double) Static303.aFloat5 / 30.0D);
			if (Static303.aFloat6 < Static303.aFloat5) {
				Static303.aFloat5 = Static303.aFloat6;
			}
			Static245.method4529();
			Static303.anInt104 = (int) Static303.aFloat5 >> 1;
			Static303.aByteArrayArrayArray2 = Static88.method2462(Static303.anInt104);
		} else if (Static303.aFloat5 > Static303.aFloat6) {
			Static303.aFloat5 = (float) ((double) Static303.aFloat5 - (double) Static303.aFloat5 / 30.0D);
			if (Static303.aFloat6 > Static303.aFloat5) {
				Static303.aFloat5 = Static303.aFloat6;
			}
			Static245.method4529();
			Static303.anInt104 = (int) Static303.aFloat5 >> 1;
			Static303.aByteArrayArrayArray2 = Static88.method2462(Static303.anInt104);
		}
		if (Static535.anInt9666 != -1 && Static248.anInt5350 != -1) {
			@Pc(82) int local82 = Static535.anInt9666 - Static491.anInt9082;
			if (local82 < 2 || local82 > 2) {
				local82 /= 8;
			}
			@Pc(97) int local97 = Static248.anInt5350 - Static536.anInt9677;
			Static491.anInt9082 += local82;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static536.anInt9677 -= -local97;
			if (local82 == 0 && local97 == 0) {
				Static535.anInt9666 = -1;
				Static248.anInt5350 = -1;
			}
			Static245.method4529();
		}
		if (Static302.anInt6299 > 0) {
			Static422.anInt7962--;
			if (Static422.anInt7962 == 0) {
				Static302.anInt6299--;
				Static422.anInt7962 = 100;
			}
		} else {
			Static232.anInt5106 = -1;
			Static604.anInt10636 = -1;
		}
		if (!Static58.aBoolean730 || Static612.aClass341_69 == null) {
			return;
		}
		for (@Pc(161) Class2_Sub4 local161 = (Class2_Sub4) Static612.aClass341_69.method8524(); local161 != null; local161 = (Class2_Sub4) Static612.aClass341_69.method8519()) {
			@Pc(170) Class153 local170 = Static303.aClass248_2.method6584(local161.aClass2_Sub32_1.anInt6568);
			if (local161.method606(arg0, arg1)) {
				if (local170.aStringArray18 != null) {
					if (local170.aStringArray18[4] != null) {
						Static202.method4065(false, local170.aString50, 0, false, local170.anInt5239, -1, true, 1006, (long) local161.aClass2_Sub32_1.anInt6568, local170.aStringArray18[4], (long) local161.aClass2_Sub32_1.anInt6568, -1);
					}
					if (local170.aStringArray18[3] != null) {
						Static202.method4065(false, local170.aString50, 0, false, local170.anInt5239, -1, true, 1003, (long) local161.aClass2_Sub32_1.anInt6568, local170.aStringArray18[3], (long) local161.aClass2_Sub32_1.anInt6568, -1);
					}
					if (local170.aStringArray18[2] != null) {
						Static202.method4065(false, local170.aString50, 0, false, local170.anInt5239, -1, true, 1002, (long) local161.aClass2_Sub32_1.anInt6568, local170.aStringArray18[2], (long) local161.aClass2_Sub32_1.anInt6568, -1);
					}
					if (local170.aStringArray18[1] != null) {
						Static202.method4065(false, local170.aString50, 0, false, local170.anInt5239, -1, true, 1012, (long) local161.aClass2_Sub32_1.anInt6568, local170.aStringArray18[1], (long) local161.aClass2_Sub32_1.anInt6568, -1);
					}
					if (local170.aStringArray18[0] != null) {
						Static202.method4065(false, local170.aString50, 0, false, local170.anInt5239, -1, true, 1009, (long) local161.aClass2_Sub32_1.anInt6568, local170.aStringArray18[0], (long) local161.aClass2_Sub32_1.anInt6568, -1);
					}
				}
				if (!local161.aClass2_Sub32_1.aBoolean491) {
					local161.aClass2_Sub32_1.aBoolean491 = true;
					Static284.method5149(Static32.aClass350_2, local161.aClass2_Sub32_1.anInt6568, local170.anInt5239);
				}
				if (local161.aClass2_Sub32_1.aBoolean491) {
					Static284.method5149(Static528.aClass350_8, local161.aClass2_Sub32_1.anInt6568, local170.anInt5239);
				}
			} else if (local161.aClass2_Sub32_1.aBoolean491) {
				local161.aClass2_Sub32_1.aBoolean491 = false;
				Static284.method5149(Static306.aClass350_5, local161.aClass2_Sub32_1.anInt6568, local170.anInt5239);
			}
		}
	}
}

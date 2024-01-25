import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!nea", name = "k", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_131 = new Class44(19, -1);

	@OriginalMember(owner = "client!nea", name = "o", descriptor = "[I")
	public static int[] anIntArray526 = null;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z")
	public static boolean method5817() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static621.aHashtable8.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static621.aHashtable8.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(42) Field local42 = local33.getDeclaredField("nativeLibraries");
			@Pc(52) Method local52 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local52.invoke(local42, Boolean.TRUE);
			try {
				local12 = Static621.aHashtable8.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static32.aHashtable6.get(local71);
						@Pc(81) Class local81 = (Class) Static621.aHashtable8.get(local71);
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
		Static621.aHashtable8 = local9;
		return Static621.aHashtable8.isEmpty();
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILclient!ha;IIZ)V")
	public static void method5822(@OriginalArg(2) Class137 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static117.aClass137_46 = arg0;
		Static5.aClass26_11 = Static117.aClass137_46.method7918();
		Static378.aClass26_6 = Static117.aClass137_46.method7918();
		Static345.aClass26_5 = Static117.aClass137_46.method7918();
		Static568.anInt9807 = 100;
		Static362.anIntArray486 = null;
		Static595.anInterface23Array1 = null;
		Static599.anInt6159 = 100;
		Static453.anInt7941 = 0;
		Static586.method8376(arg2, arg1);
		Static483.anInt8667 = -1;
		Static155.anInt3058 = -1;
		Static336.anInt6341 = -1;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BILclient!mea;I)V")
	public static void method5824(@OriginalArg(1) int arg0, @OriginalArg(2) Class230 arg1, @OriginalArg(3) int arg2) {
		if (Static238.aBoolean302) {
			@Pc(18) Class341 local18 = Static597.anInt10147 == -1 ? null : Static217.aClass90_1.method2122(Static597.anInt10147);
			if (Static78.method1481(arg1).method5401() && (Static156.anInt3080 & 0x20) != 0 && (local18 == null || arg1.method5462(Static597.anInt10147, local18.anInt9931) != local18.anInt9931)) {
				Static261.method3780(0L, arg1.anInt6646, true, Static639.aString114 + " -> " + arg1.aString71, false, Static275.anInt4778, false, arg1.anInt6679, (long) (arg1.anInt6679 << 0 | arg1.anInt6663), arg1.anInt6663, Static139.aString30, 6);
			}
		}
		@Pc(90) String local90;
		for (@Pc(83) int local83 = 9; local83 >= 5; local83--) {
			local90 = Static202.method3074(local83, arg1);
			if (local90 != null) {
				Static261.method3780((long) (local83 + 1), arg1.anInt6646, true, arg1.aString71, false, Static172.method2779(arg1, local83), false, arg1.anInt6679, (long) (arg1.anInt6679 << 0 | arg1.anInt6663), arg1.anInt6663, local90, 1004);
			}
		}
		local90 = Static59.method1225(arg1);
		if (local90 != null) {
			Static261.method3780(0L, arg1.anInt6646, true, arg1.aString71, false, arg1.anInt6716, false, arg1.anInt6679, (long) (arg1.anInt6663 | arg1.anInt6679 << 0), arg1.anInt6663, local90, 5);
		}
		for (@Pc(173) int local173 = 4; local173 >= 0; local173--) {
			@Pc(180) String local180 = Static202.method3074(local173, arg1);
			if (local180 != null) {
				Static261.method3780((long) (local173 + 1), arg1.anInt6646, true, arg1.aString71, false, Static172.method2779(arg1, local173), false, arg1.anInt6679, (long) (arg1.anInt6679 << 0 | arg1.anInt6663), arg1.anInt6663, local180, 30);
			}
		}
		if (!Static78.method1481(arg1).method5403()) {
			return;
		}
		if (arg1.aString73 == null) {
			Static261.method3780(0L, arg1.anInt6646, true, "", false, -1, false, arg1.anInt6679, (long) (arg1.anInt6679 << 0 | arg1.anInt6663), arg1.anInt6663, Static514.aClass303_12.method7473(Static232.anInt4258), 3);
		} else {
			Static261.method3780(0L, arg1.anInt6646, true, "", false, -1, false, arg1.anInt6679, (long) (arg1.anInt6679 << 0 | arg1.anInt6663), arg1.anInt6663, arg1.aString73, 3);
		}
	}
}

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "[Lclient!pt;")
	public static final Class1_Sub39[] aClass1_Sub39Array1 = new Class1_Sub39[1024];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!aga;Lclient!r;ZLjava/lang/String;Lclient!la;Z)V")
	public static void method6665(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class35 arg4) {
		@Pc(12) boolean local12 = !Static212.aBoolean338 || Static278.method4290();
		if (!local12) {
			return;
		}
		@Pc(26) int local26;
		@Pc(35) int local35;
		if (Static212.aBoolean338 && local12) {
			@Pc(133) Class13 local133 = Static394.aClass13_9;
			@Pc(139) Class35 local139 = arg1.method6457(local133, Static247.aClass318Array1);
			local26 = local133.method466(null, 250, arg3);
			local35 = local133.method457(local133.anInt522, 250, arg3, null);
			@Pc(158) int local158 = Static92.aClass318_2.anInt8537;
			@Pc(162) int local162 = local158 + 4;
			local35 += local162 * 2;
			local26 += local162 * 2;
			if (local35 < Static146.anInt2806) {
				local35 = Static146.anInt2806;
			}
			if (local26 < Static239.anInt4566) {
				local26 = Static239.anInt4566;
			}
			@Pc(193) int local193 = Static374.aClass314_10.method7035(local26, Static483.anInt8133) + Static548.anInt9027;
			@Pc(201) int local201 = Static339.aClass103_14.method2391(local35, Static443.anInt7712) + Static89.anInt1987;
			arg1.method6434(Static115.aClass318_3, false).DA(local193 + Static554.aClass318_4.anInt8537, local201 - -Static554.aClass318_4.anInt8535, local26 - Static554.aClass318_4.anInt8537 * 2, -(Static554.aClass318_4.anInt8535 * 2) + local35, 1, 0, 0);
			arg1.method6434(Static554.aClass318_4, true).method7679(local193, local201);
			Static554.aClass318_4.method7071();
			arg1.method6434(Static554.aClass318_4, true).method7679(local193 + local26 - local158, local201);
			Static554.aClass318_4.method7067();
			arg1.method6434(Static554.aClass318_4, true).method7679(local26 + local193 - local158, local35 + (local201 - local158));
			Static554.aClass318_4.method7071();
			arg1.method6434(Static554.aClass318_4, true).method7679(local193, local35 + local201 - local158);
			Static554.aClass318_4.method7067();
			arg1.method6434(Static92.aClass318_2, true).method7681(local193, Static554.aClass318_4.anInt8535 + local201, local158, local35 - Static554.aClass318_4.anInt8535 * 2);
			Static92.aClass318_2.method7066();
			arg1.method6434(Static92.aClass318_2, true).method7681(local193 + Static554.aClass318_4.anInt8537, local201, local26 - Static554.aClass318_4.anInt8537 * 2, local158);
			Static92.aClass318_2.method7066();
			arg1.method6434(Static92.aClass318_2, true).method7681(local193 + local26 - local158, local201 + Static554.aClass318_4.anInt8535, local158, local35 - Static554.aClass318_4.anInt8535 * 2);
			Static92.aClass318_2.method7066();
			arg1.method6434(Static92.aClass318_2, true).method7681(local193 + Static554.aClass318_4.anInt8537, local35 + local201 - local158, local26 - Static554.aClass318_4.anInt8537 * 2, local158);
			Static92.aClass318_2.method7066();
			local139.method4952(local26 - local162 * 2, local201 - -local162, null, arg3, null, 0, 0, 0, local35 - local162 * 2, 1, Static29.anInt847 | 0xFF000000, null, local193 + local162, -1, 1);
			Static177.method1858(local201, local26, local193, local35);
		} else {
			local26 = arg0.method466(null, 250, arg3);
			local35 = arg0.method456(null, arg3, 250) * 13;
			arg1.J(6, 6, local26 + 8, local35 + 8, -16777216, 0);
			arg1.method6435(6, 6, local26 + 4 + 4, local35 + 4 + 4, -1, 0);
			arg4.method4952(local26, 10, null, arg3, null, 0, 0, 0, local35, 1, -1, null, 10, -1, 1);
			Static177.method1858(6, local26 + 8, 6, local35 + 4 + 4);
		}
		if (arg2) {
			try {
				arg1.method6416();
			} catch (@Pc(430) Exception_Sub1 local430) {
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)Z")
	public static boolean method6666() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static171.aHashtable3.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static171.aHashtable3.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static171.aHashtable3.keys();
				while (local12.hasMoreElements()) {
					@Pc(66) String local66 = (String) local12.nextElement();
					try {
						@Pc(71) File local71 = (File) Static457.aHashtable7.get(local66);
						@Pc(76) Class local76 = (Class) Static171.aHashtable3.get(local66);
						@Pc(82) Vector local82 = (Vector) local37.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(90) Object local90 = local82.elementAt(local84);
								@Pc(95) Field local95 = local90.getClass().getDeclaredField("name");
								local47.invoke(local95, Boolean.TRUE);
								try {
									@Pc(110) String local110 = (String) local95.get(local90);
									if (local110 != null && local110.equalsIgnoreCase(local71.getCanonicalPath())) {
										@Pc(122) Field local122 = local90.getClass().getDeclaredField("handle");
										@Pc(129) Method local129 = local90.getClass().getDeclaredMethod("finalize");
										local47.invoke(local122, Boolean.TRUE);
										local47.invoke(local129, Boolean.TRUE);
										try {
											local129.invoke(local90);
											local122.set(local90, Integer.valueOf(0));
											local9.remove(local66);
										} catch (@Pc(168) Throwable local168) {
										}
										local47.invoke(local129, Boolean.FALSE);
										local47.invoke(local122, Boolean.FALSE);
									}
								} catch (@Pc(190) Throwable local190) {
								}
								local47.invoke(local95, Boolean.FALSE);
							} catch (@Pc(202) Throwable local202) {
							}
						}
					} catch (@Pc(210) Throwable local210) {
					}
				}
			} catch (@Pc(224) Throwable local224) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(236) Throwable local236) {
		}
		Static171.aHashtable3 = local9;
		return Static171.aHashtable3.isEmpty();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)V")
	public static void method6667(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static480.aClass1_Sub20_Sub1_1.method3933(Static494.anInt8294) >= 15) {
				@Pc(21) int local21 = Static480.aClass1_Sub20_Sub1_1.method3924(15);
				if (local21 != 32767) {
					@Pc(28) boolean local28 = false;
					@Pc(35) Class1_Sub39 local35 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local21);
					@Pc(41) Class20_Sub2_Sub4_Sub1_Sub2 local41;
					if (local35 == null) {
						local41 = new Class20_Sub2_Sub4_Sub1_Sub2();
						local41.anInt6407 = local21;
						local35 = new Class1_Sub39(local41);
						Static131.aClass356_32.method7800((long) local21, local35);
						local28 = true;
						aClass1_Sub39Array1[Static491.anInt1754++] = local35;
					}
					local41 = local35.aClass20_Sub2_Sub4_Sub1_Sub2_2;
					Static542.anIntArray599[Static480.anInt8097++] = local21;
					local41.anInt6399 = Static81.anInt1910;
					if (local41.aClass162_1 != null && local41.aClass162_1.method3798()) {
						Static158.method2424(local41);
					}
					local41.method5359(Static183.aClass182_1.method4062(Static480.aClass1_Sub20_Sub1_1.method3924(14)));
					@Pc(109) int local109;
					if (arg0) {
						local109 = Static480.aClass1_Sub20_Sub1_1.method3924(8);
						if (local109 > 127) {
							local109 -= 256;
						}
					} else {
						local109 = Static480.aClass1_Sub20_Sub1_1.method3924(5);
						if (local109 > 15) {
							local109 -= 32;
						}
					}
					@Pc(131) int local131 = Static480.aClass1_Sub20_Sub1_1.method3924(1);
					if (local131 == 1) {
						Static509.anIntArray582[Static474.anInt1075++] = local21;
					}
					@Pc(147) int local147 = Static480.aClass1_Sub20_Sub1_1.method3924(2);
					@Pc(158) int local158 = (Static480.aClass1_Sub20_Sub1_1.method3924(3) + 4 & 0xDF600007) << 11;
					@Pc(165) int local165;
					if (arg0) {
						local165 = Static480.aClass1_Sub20_Sub1_1.method3924(8);
						if (local165 > 127) {
							local165 -= 256;
						}
					} else {
						local165 = Static480.aClass1_Sub20_Sub1_1.method3924(5);
						if (local165 > 15) {
							local165 -= 32;
						}
					}
					@Pc(187) int local187 = Static480.aClass1_Sub20_Sub1_1.method3924(1);
					local41.method5356(local41.aClass162_1.anInt4408);
					local41.anInt6410 = local41.aClass162_1.anInt4424 << 3;
					if (local28) {
						local41.method5353(true, local158);
					}
					local41.method5358(local187 == 1, local147, local41.method5349(), Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0] + local109, local165 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0]);
					if (local41.aClass162_1.method3798()) {
						Static140.method2298(local41.aByte116, null, local41, 0, local41.anIntArray437[0], local41.anIntArray436[0], null);
					}
					continue;
				}
			}
			Static480.aClass1_Sub20_Sub1_1.method3932();
			return;
		}
	}
}

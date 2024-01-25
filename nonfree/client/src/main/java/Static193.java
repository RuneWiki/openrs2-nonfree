import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	public static int anInt4170;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public static int anInt4171;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "[Lclient!tn;")
	public static Class196[] aClass196Array1;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public static int anInt4173 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!ea;B)V")
	public static void method3503(@OriginalArg(1) Class4_Sub7_Sub1 arg0) {
		while (true) {
			@Pc(14) Class4_Sub23 local14 = (Class4_Sub23) Static251.aClass130_114.method3499();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt3196; local21++) {
				if (local14.aClass51Array1[local21] != null) {
					if (local14.aClass51Array1[local21].anInt1229 == 2) {
						local14.anIntArray287[local21] = -5;
					}
					if (local14.aClass51Array1[local21].anInt1229 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass51Array2[local21] != null) {
					if (local14.aClass51Array2[local21].anInt1229 == 2) {
						local14.anIntArray287[local21] = -6;
					}
					if (local14.aClass51Array2[local21].anInt1229 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method1237(78);
			arg0.method2416(0);
			@Pc(98) int local98 = arg0.anInt2667;
			arg0.method2387(local14.anInt3197);
			for (@Pc(105) int local105 = 0; local105 < local14.anInt3196; local105++) {
				if (local14.anIntArray287[local105] == 0) {
					try {
						@Pc(126) int local126 = local14.anIntArray285[local105];
						@Pc(138) Field local138;
						@Pc(142) int local142;
						if (local126 == 0) {
							local138 = (Field) local14.aClass51Array1[local105].anObject1;
							local142 = local138.getInt(null);
							arg0.method2416(0);
							arg0.method2387(local142);
						} else if (local126 == 1) {
							local138 = (Field) local14.aClass51Array1[local105].anObject1;
							local138.setInt(null, local14.anIntArray286[local105]);
							arg0.method2416(0);
						} else if (local126 == 2) {
							local138 = (Field) local14.aClass51Array1[local105].anObject1;
							local142 = local138.getModifiers();
							arg0.method2416(0);
							arg0.method2387(local142);
						}
						@Pc(206) Method local206;
						if (local126 == 3) {
							local206 = (Method) local14.aClass51Array2[local105].anObject1;
							@Pc(211) byte[][] local211 = local14.aByteArrayArrayArray5[local105];
							@Pc(215) Object[] local215 = new Object[local211.length];
							for (@Pc(217) int local217 = 0; local217 < local211.length; local217++) {
								@Pc(229) ObjectInputStream local229 = new ObjectInputStream(new ByteArrayInputStream(local211[local217]));
								local215[local217] = local229.readObject();
							}
							@Pc(248) Object local248 = local206.invoke(null, local215);
							if (local248 == null) {
								arg0.method2416(0);
							} else if (local248 instanceof Number) {
								arg0.method2416(1);
								arg0.method2385(((Number) local248).longValue());
							} else if (local248 instanceof String) {
								arg0.method2416(2);
								arg0.method2373((String) local248);
							} else {
								arg0.method2416(4);
							}
						} else if (local126 == 4) {
							local206 = (Method) local14.aClass51Array2[local105].anObject1;
							local142 = local206.getModifiers();
							arg0.method2416(0);
							arg0.method2387(local142);
						}
					} catch (@Pc(316) ClassNotFoundException local316) {
						arg0.method2416(-10);
					} catch (@Pc(322) InvalidClassException local322) {
						arg0.method2416(-11);
					} catch (@Pc(328) StreamCorruptedException local328) {
						arg0.method2416(-12);
					} catch (@Pc(334) OptionalDataException local334) {
						arg0.method2416(-13);
					} catch (@Pc(340) IllegalAccessException local340) {
						arg0.method2416(-14);
					} catch (@Pc(346) IllegalArgumentException local346) {
						arg0.method2416(-15);
					} catch (@Pc(352) InvocationTargetException local352) {
						arg0.method2416(-16);
					} catch (@Pc(358) SecurityException local358) {
						arg0.method2416(-17);
					} catch (@Pc(364) IOException local364) {
						arg0.method2416(-18);
					} catch (@Pc(370) NullPointerException local370) {
						arg0.method2416(-19);
					} catch (@Pc(376) Exception local376) {
						arg0.method2416(-20);
					} catch (@Pc(382) Throwable local382) {
						arg0.method2416(-21);
					}
				} else {
					arg0.method2416(local14.anIntArray287[local105]);
				}
			}
			arg0.method2360(local98);
			arg0.method2392(arg0.anInt2667 - local98);
			local14.method5667();
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public static void method3507() {
		for (@Pc(3) int local3 = 0; local3 < Static234.anInt4843; local3++) {
			@Pc(17) int local17 = Static169.anIntArray331[local3]--;
			if (Static169.anIntArray331[local3] >= -10) {
				@Pc(98) Class112 local98 = Static268.aClass112Array1[local3];
				if (local98 == null) {
					local98 = Static362.method3033(Static60.aClass11_28, Static196.anIntArray362[local3], 0);
					if (local98 == null) {
						continue;
					}
					Static169.anIntArray331[local3] += local98.method3032();
					Static268.aClass112Array1[local3] = local98;
				}
				if (Static169.anIntArray331[local3] < 0) {
					@Pc(142) int local142;
					if (Static111.anIntArray236[local3] == 0) {
						local142 = Static144.anInt3226 * Static349.anIntArray540[local3] >> 8;
					} else {
						@Pc(152) int local152 = (Static111.anIntArray236[local3] & 0xFF) * 128;
						@Pc(160) int local160 = Static111.anIntArray236[local3] >> 16 & 0xFF;
						@Pc(170) int local170 = local160 * 128 + 64 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(183) int local183 = Static111.anIntArray236[local3] >> 8 & 0xFF;
						@Pc(193) int local193 = local183 * 128 + 64 - Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466;
						if (local193 < 0) {
							local193 = -local193;
						}
						@Pc(207) int local207 = local193 + local170 - 128;
						if (local207 > local152) {
							Static169.anIntArray331[local3] = -100;
							continue;
						}
						if (local207 < 0) {
							local207 = 0;
						}
						local142 = Static349.anIntArray540[local3] * Static235.anInt6709 * (local152 - local207) / local152 >> 8;
					}
					if (local142 > 0) {
						@Pc(248) Class4_Sub5_Sub1 local248 = local98.method3031().method5671(Static127.aClass118_1);
						@Pc(253) Class4_Sub13_Sub1 local253 = Static359.method1935(local248, local142);
						local253.method1940(Static115.anIntArray241[local3] - 1);
						Static337.aClass4_Sub13_Sub2_2.method2496(local253);
					}
					Static169.anIntArray331[local3] = -100;
				}
			} else {
				Static234.anInt4843--;
				for (@Pc(33) int local33 = local3; local33 < Static234.anInt4843; local33++) {
					Static196.anIntArray362[local33] = Static196.anIntArray362[local33 + 1];
					Static268.aClass112Array1[local33] = Static268.aClass112Array1[local33 + 1];
					Static115.anIntArray241[local33] = Static115.anIntArray241[local33 + 1];
					Static169.anIntArray331[local33] = Static169.anIntArray331[local33 + 1];
					Static111.anIntArray236[local33] = Static111.anIntArray236[local33 + 1];
					Static349.anIntArray540[local33] = Static349.anIntArray540[local33 + 1];
				}
				local3--;
			}
		}
		if (Static174.aBoolean320 && !Static298.method5068()) {
			if (Static147.anInt3292 != 0 && Static100.anInt2272 != -1) {
				Static298.method5067(Static20.aClass11_9, Static147.anInt3292, Static100.anInt2272);
			}
			Static174.aBoolean320 = false;
		} else if (Static147.anInt3292 != 0 && Static100.anInt2272 != -1 && !Static298.method5068()) {
			Static320.aClass4_Sub7_Sub1_3.method1237(8);
			Static320.aClass4_Sub7_Sub1_3.method2387(Static100.anInt2272);
			Static100.anInt2272 = -1;
		}
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)J")
	public static long method3509() {
		return Static258.aClass129_1.method5345();
	}
}

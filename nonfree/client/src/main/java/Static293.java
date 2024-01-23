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

public final class Static293 {

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
	public static int anInt5686;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "Z")
	public static boolean aBoolean393;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
	public static int anInt5688 = 0;

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
	public static int anInt5693 = 2301979;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4562(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < Static149.anInt2911; local13++) {
			if (arg0.equalsIgnoreCase(Static135.aStringArray15[local13])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static72.aClass13_Sub5_Sub1_1.aString148)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ta;I)V")
	public static void method4563(@OriginalArg(0) Class58_Sub2 arg0) {
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static298.anIntArray417.length; local17++) {
			Static298.anIntArray417[local17] = 0;
		}
		@Pc(41) int local41;
		for (local17 = 0; local17 < 5000; local17++) {
			local41 = (int) (Math.random() * 128.0D * (double) 256);
			Static298.anIntArray417[local41] = (int) (Math.random() * 284.0D);
		}
		@Pc(67) int local67;
		@Pc(78) int local78;
		for (local17 = 0; local17 < 20; local17++) {
			for (local41 = 1; local41 < 255; local41++) {
				for (local67 = 1; local67 < 127; local67++) {
					local78 = (local41 << 7) + local67;
					Static286.anIntArray450[local78] = (Static298.anIntArray417[local78 + 128] + Static298.anIntArray417[local78 - 128] + Static298.anIntArray417[local78 + -1] + Static298.anIntArray417[local78 + 1]) / 4;
				}
			}
			@Pc(114) int[] local114 = Static298.anIntArray417;
			Static298.anIntArray417 = Static286.anIntArray450;
			Static286.anIntArray450 = local114;
		}
		if (arg0 == null) {
			return;
		}
		local17 = 0;
		for (local41 = 0; local41 < arg0.anInt5023; local41++) {
			for (local67 = 0; local67 < arg0.anInt5028; local67++) {
				if (arg0.aByteArray59[local17++] != 0) {
					local78 = local67 + arg0.anInt5026 + 16;
					@Pc(166) int local166 = arg0.anInt5027 + local41 + 16;
					@Pc(172) int local172 = local78 + (local166 << 7);
					Static298.anIntArray417[local172] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!no;II)V")
	public static void method4565(@OriginalArg(0) Class4_Sub24_Sub1 arg0) {
		while (true) {
			@Pc(13) Class4_Sub13 local13 = (Class4_Sub13) Static30.aClass17_4.method613();
			if (local13 == null) {
				return;
			}
			@Pc(18) boolean local18 = false;
			@Pc(20) int local20;
			for (local20 = 0; local20 < local13.anInt1728; local20++) {
				if (local13.aClass119Array1[local20] != null) {
					if (local13.aClass119Array1[local20].anInt3695 == 2) {
						local13.anIntArray156[local20] = -5;
					}
					if (local13.aClass119Array1[local20].anInt3695 == 0) {
						local18 = true;
					}
				}
				if (local13.aClass119Array2[local20] != null) {
					if (local13.aClass119Array2[local20].anInt3695 == 2) {
						local13.anIntArray156[local20] = -6;
					}
					if (local13.aClass119Array2[local20].anInt3695 == 0) {
						local18 = true;
					}
				}
			}
			if (local18) {
				return;
			}
			arg0.method3123(165);
			arg0.method3116(0);
			local20 = arg0.anInt3822;
			arg0.method3066(local13.anInt1731);
			for (@Pc(116) int local116 = 0; local116 < local13.anInt1728; local116++) {
				if (local13.anIntArray156[local116] == 0) {
					try {
						@Pc(140) int local140 = local13.anIntArray157[local116];
						@Pc(157) Field local157;
						@Pc(184) int local184;
						if (local140 == 0) {
							local157 = (Field) local13.aClass119Array1[local116].anObject4;
							local184 = local157.getInt(null);
							arg0.method3116(0);
							arg0.method3066(local184);
						} else if (local140 == 1) {
							local157 = (Field) local13.aClass119Array1[local116].anObject4;
							local157.setInt(null, local13.anIntArray155[local116]);
							arg0.method3116(0);
						} else if (local140 == 2) {
							local157 = (Field) local13.aClass119Array1[local116].anObject4;
							local184 = local157.getModifiers();
							arg0.method3116(0);
							arg0.method3066(local184);
						}
						@Pc(227) Method local227;
						if (local140 == 3) {
							local227 = (Method) local13.aClass119Array2[local116].anObject4;
							@Pc(232) byte[][] local232 = local13.aByteArrayArrayArray5[local116];
							@Pc(236) Object[] local236 = new Object[local232.length];
							for (@Pc(238) int local238 = 0; local238 < local232.length; local238++) {
								@Pc(252) ObjectInputStream local252 = new ObjectInputStream(new ByteArrayInputStream(local232[local238]));
								local236[local238] = local252.readObject();
							}
							@Pc(265) Object local265 = local227.invoke(null, local236);
							if (local265 == null) {
								arg0.method3116(0);
							} else if (local265 instanceof Number) {
								arg0.method3116(1);
								arg0.method3079(((Number) local265).longValue());
							} else if (local265 instanceof String) {
								arg0.method3116(2);
								arg0.method3095((String) local265);
							} else {
								arg0.method3116(4);
							}
						} else if (local140 == 4) {
							local227 = (Method) local13.aClass119Array2[local116].anObject4;
							local184 = local227.getModifiers();
							arg0.method3116(0);
							arg0.method3066(local184);
						}
					} catch (@Pc(334) ClassNotFoundException local334) {
						arg0.method3116(-10);
					} catch (@Pc(340) InvalidClassException local340) {
						arg0.method3116(-11);
					} catch (@Pc(346) StreamCorruptedException local346) {
						arg0.method3116(-12);
					} catch (@Pc(352) OptionalDataException local352) {
						arg0.method3116(-13);
					} catch (@Pc(358) IllegalAccessException local358) {
						arg0.method3116(-14);
					} catch (@Pc(364) IllegalArgumentException local364) {
						arg0.method3116(-15);
					} catch (@Pc(370) InvocationTargetException local370) {
						arg0.method3116(-16);
					} catch (@Pc(376) SecurityException local376) {
						arg0.method3116(-17);
					} catch (@Pc(382) IOException local382) {
						arg0.method3116(-18);
					} catch (@Pc(388) NullPointerException local388) {
						arg0.method3116(-19);
					} catch (@Pc(394) Exception local394) {
						arg0.method3116(-20);
					} catch (@Pc(400) Throwable local400) {
						arg0.method3116(-21);
					}
				} else {
					arg0.method3116(local13.anIntArray156[local116]);
				}
			}
			arg0.method3078(local20);
			arg0.method3090(arg0.anInt3822 - local20);
			local13.method4690();
		}
	}
}

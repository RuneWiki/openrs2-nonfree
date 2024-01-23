import java.awt.Font;
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

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!tj;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public static int anInt415;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[I")
	public static int[] anIntArray24;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_87 = Static184.method2923("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public static int[] anIntArray23 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_88 = Static184.method2923("null");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLclient!ae;I)V")
	public static void method295(@OriginalArg(1) Class2_Sub3_Sub1 arg0) {
		while (true) {
			@Pc(14) Class2_Sub4 local14 = (Class2_Sub4) Static78.aClass108_7.method3322();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt332; local21++) {
				if (local14.aClass75Array2[local21] != null) {
					if (local14.aClass75Array2[local21].anInt3346 == 2) {
						local14.anIntArray18[local21] = -5;
					}
					if (local14.aClass75Array2[local21].anInt3346 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass75Array1[local21] != null) {
					if (local14.aClass75Array1[local21].anInt3346 == 2) {
						local14.anIntArray18[local21] = -6;
					}
					if (local14.aClass75Array1[local21].anInt3346 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method221(56);
			arg0.method208(0);
			@Pc(97) int local97 = arg0.anInt239;
			arg0.method200(local14.anInt340);
			for (@Pc(104) int local104 = 0; local104 < local14.anInt332; local104++) {
				if (local14.anIntArray18[local104] == 0) {
					try {
						@Pc(128) int local128 = local14.anIntArray16[local104];
						@Pc(137) Field local137;
						@Pc(141) int local141;
						if (local128 == 0) {
							local137 = (Field) local14.aClass75Array2[local104].anObject3;
							local141 = local137.getInt(null);
							arg0.method208(0);
							arg0.method200(local141);
						} else if (local128 == 1) {
							local137 = (Field) local14.aClass75Array2[local104].anObject3;
							local137.setInt(null, local14.anIntArray17[local104]);
							arg0.method208(0);
						} else if (local128 == 2) {
							local137 = (Field) local14.aClass75Array2[local104].anObject3;
							local141 = local137.getModifiers();
							arg0.method208(0);
							arg0.method200(local141);
						}
						@Pc(210) Method local210;
						if (local128 == 3) {
							local210 = (Method) local14.aClass75Array1[local104].anObject3;
							@Pc(235) byte[][] local235 = local14.aByteArrayArrayArray3[local104];
							@Pc(239) Object[] local239 = new Object[local235.length];
							for (@Pc(241) int local241 = 0; local241 < local235.length; local241++) {
								@Pc(253) ObjectInputStream local253 = new ObjectInputStream(new ByteArrayInputStream(local235[local241]));
								local239[local241] = local253.readObject();
							}
							@Pc(272) Object local272 = local210.invoke(null, local239);
							if (local272 == null) {
								arg0.method208(0);
							} else if (local272 instanceof Number) {
								arg0.method208(1);
								arg0.method190(((Number) local272).longValue());
							} else if (local272 instanceof Class41) {
								arg0.method208(2);
								arg0.method198((Class41) local272);
							} else {
								arg0.method208(4);
							}
						} else if (local128 == 4) {
							local210 = (Method) local14.aClass75Array1[local104].anObject3;
							local141 = local210.getModifiers();
							arg0.method208(0);
							arg0.method200(local141);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg0.method208(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg0.method208(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg0.method208(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg0.method208(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg0.method208(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg0.method208(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg0.method208(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg0.method208(-17);
					} catch (@Pc(363) IOException local363) {
						arg0.method208(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg0.method208(-19);
					} catch (@Pc(375) Exception local375) {
						arg0.method208(-20);
					} catch (@Pc(381) Throwable local381) {
						arg0.method208(-21);
					}
				} else {
					arg0.method208(local14.anIntArray18[local104]);
				}
			}
			arg0.method207(local97);
			arg0.method203(arg0.anInt239 - local97);
			local14.method3314();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!i;I)I")
	public static int method296(@OriginalArg(0) Class41 arg0) {
		return arg0.method1393() + 1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIB)V")
	public static void method297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class2_Sub16 local10 = (Class2_Sub16) Static59.aClass108_5.method3322(); local10 != null; local10 = (Class2_Sub16) Static59.aClass108_5.method3331()) {
			if (local10.anInt2977 != -1 || local10.anIntArray317 != null) {
				@Pc(22) int local22 = 0;
				if (local10.anInt2982 < arg2) {
					local22 = arg2 - local10.anInt2982;
				} else if (arg2 < local10.anInt2991) {
					local22 = local10.anInt2991 - arg2;
				}
				if (arg0 > local10.anInt2978) {
					local22 += arg0 - local10.anInt2978;
				} else if (arg0 < local10.anInt2979) {
					local22 += local10.anInt2979 - arg0;
				}
				if (local10.anInt2981 < local22 - 64 || Static198.anInt4450 == 0 || local10.anInt2985 != arg3) {
					if (local10.aClass2_Sub6_Sub2_3 != null) {
						Static200.aClass2_Sub6_Sub4_2.method3097(local10.aClass2_Sub6_Sub2_3);
						local10.aClass2_Sub6_Sub2_3 = null;
					}
					if (local10.aClass2_Sub6_Sub2_2 != null) {
						Static200.aClass2_Sub6_Sub4_2.method3097(local10.aClass2_Sub6_Sub2_2);
						local10.aClass2_Sub6_Sub2_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(137) int local137 = Static198.anInt4450 * (local10.anInt2981 - local22) / local10.anInt2981;
					if (local10.aClass2_Sub6_Sub2_3 != null) {
						local10.aClass2_Sub6_Sub2_3.method2300(local137);
					} else if (local10.anInt2977 >= 0) {
						@Pc(158) Class24 local158 = Static223.method686(Static11.aClass15_Sub1_12, local10.anInt2977, 0);
						if (local158 != null) {
							@Pc(165) Class2_Sub9_Sub1 local165 = local158.method687().method3006(Static103.aClass82_1);
							@Pc(170) Class2_Sub6_Sub2 local170 = Static226.method2307(local165, local137);
							local170.method2302(-1);
							Static200.aClass2_Sub6_Sub4_2.method3094(local170);
							local10.aClass2_Sub6_Sub2_3 = local170;
						}
					}
					if (local10.aClass2_Sub6_Sub2_2 != null) {
						local10.aClass2_Sub6_Sub2_2.method2300(local137);
						if (!local10.aClass2_Sub6_Sub2_2.method3313()) {
							local10.aClass2_Sub6_Sub2_2 = null;
						}
					} else if (local10.anIntArray317 != null && (local10.anInt2976 -= arg1) <= 0) {
						@Pc(220) int local220 = (int) ((double) local10.anIntArray317.length * Math.random());
						@Pc(228) Class24 local228 = Static223.method686(Static11.aClass15_Sub1_12, local10.anIntArray317[local220], 0);
						if (local228 != null) {
							@Pc(235) Class2_Sub9_Sub1 local235 = local228.method687().method3006(Static103.aClass82_1);
							@Pc(240) Class2_Sub6_Sub2 local240 = Static226.method2307(local235, local137);
							local240.method2302(0);
							Static200.aClass2_Sub6_Sub4_2.method3094(local240);
							local10.anInt2976 = (int) ((double) (local10.anInt2983 - local10.anInt2984) * Math.random()) + local10.anInt2984;
							local10.aClass2_Sub6_Sub2_2 = local240;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method298() {
		Static214.aClass43_25.method1469();
		Static186.aClass43_20.method1469();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lclient!k;")
	public static Class2_Sub2_Sub9 method299(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub9 local10 = (Class2_Sub2_Sub9) Static214.aClass43_25.method1464((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static35.aClass15_8.method387(Static8.method256(arg0), Static187.method2970(arg0));
		local10 = new Class2_Sub2_Sub9();
		if (local24 != null) {
			local10.method1662(new Class2_Sub3(local24));
		}
		local10.method1668();
		Static214.aClass43_25.method1462((long) arg0, local10);
		return local10;
	}
}

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

public final class Static18 {

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt566;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!m;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "[I")
	public static int[] anIntArray62;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!rd;")
	private static Class63 aClass63_389 = Static80.method1463("Use");

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_385 = aClass63_389;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_386 = Static80.method1463(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_387 = Static80.method1463("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!rd;")
	private static Class63 aClass63_390 = Static80.method1463("Add friend");

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_388 = aClass63_390;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_391 = Static80.method1463("blinken1:");

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!wa;")
	public static Class6_Sub3_Sub17 aClass6_Sub3_Sub17_2 = null;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
	public static int anInt569 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method463() {
		aClass47_1 = null;
		aClass6_Sub3_Sub17_2 = null;
		aClass63_388 = null;
		aClass63_385 = null;
		anIntArray62 = null;
		aClass63_390 = null;
		aClass63_389 = null;
		aClass63_387 = null;
		aClass63_386 = null;
		aClass63_391 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIB)V")
	public static void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static73.aClass6_Sub3_Sub3_Sub3Array4[0].method1768(arg4, arg2);
		Static73.aClass6_Sub3_Sub3_Sub3Array4[1].method1768(arg4, arg2 + arg0 - 16);
		Static121.method1976(arg4, arg2 + 16, 16, arg0 - 32, Static23.anInt2353);
		@Pc(38) int local38 = arg0 * (arg0 - 32) / arg1;
		if (local38 < 8) {
			local38 = 8;
		}
		@Pc(59) int local59 = arg3 * (arg0 - local38 - 32) / (arg1 - arg0);
		Static121.method1976(arg4, arg2 + local59 + 16, 16, local38, Static46.anInt1426);
		Static121.method1968(arg4, local59 + arg2 + 16, local38, Static36.anInt1211);
		Static121.method1968(arg4 + 1, local59 + arg2 - -16, local38, Static36.anInt1211);
		Static121.method1975(arg4, local59 + arg2 + 16, 16, Static36.anInt1211);
		Static121.method1975(arg4, arg2 + local59 + 17, 16, Static36.anInt1211);
		Static121.method1968(arg4 + 15, arg2 + 16 + local59, local38, Static31.anInt1031);
		Static121.method1968(arg4 + 14, arg2 + (17 - -local59), local38 - 1, Static31.anInt1031);
		Static121.method1975(arg4, local38 + arg2 + local59 + 15, 16, Static31.anInt1031);
		Static121.method1975(arg4 + 1, local38 + arg2 + 14 + local59, 15, Static31.anInt1031);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!la;)V")
	public static void method465(@OriginalArg(2) Class6_Sub4_Sub1 arg0) {
		while (true) {
			@Pc(15) Class6_Sub12 local15 = (Class6_Sub12) Static114.aClass1_11.method3();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2237; local22++) {
				if (local15.aClass20Array1[local22] != null) {
					if (local15.aClass20Array1[local22].anInt931 == 2) {
						local15.anIntArray252[local22] = -5;
					}
					if (local15.aClass20Array1[local22].anInt931 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass20Array2[local22] != null) {
					if (local15.aClass20Array2[local22].anInt931 == 2) {
						local15.anIntArray252[local22] = -6;
					}
					if (local15.aClass20Array2[local22].anInt931 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1347(169);
			arg0.method1330(0);
			@Pc(97) int local97 = arg0.anInt1949;
			arg0.method1292(local15.anInt2239);
			for (@Pc(104) int local104 = 0; local104 < local15.anInt2237; local104++) {
				if (local15.anIntArray252[local104] == 0) {
					try {
						@Pc(125) int local125 = local15.anIntArray254[local104];
						@Pc(140) Field local140;
						@Pc(170) int local170;
						if (local125 == 0) {
							local140 = (Field) local15.aClass20Array1[local104].anObject2;
							local170 = local140.getInt(null);
							arg0.method1330(0);
							arg0.method1292(local170);
						} else if (local125 == 1) {
							local140 = (Field) local15.aClass20Array1[local104].anObject2;
							local140.setInt(null, local15.anIntArray253[local104]);
							arg0.method1330(0);
						} else if (local125 == 2) {
							local140 = (Field) local15.aClass20Array1[local104].anObject2;
							local170 = local140.getModifiers();
							arg0.method1330(0);
							arg0.method1292(local170);
						}
						@Pc(220) Method local220;
						if (local125 == 3) {
							@Pc(213) byte[][] local213 = local15.aByteArrayArrayArray63[local104];
							local220 = (Method) local15.aClass20Array2[local104].anObject2;
							@Pc(224) Object[] local224 = new Object[local213.length];
							for (@Pc(226) int local226 = 0; local226 < local213.length; local226++) {
								@Pc(238) ObjectInputStream local238 = new ObjectInputStream(new ByteArrayInputStream(local213[local226]));
								local224[local226] = local238.readObject();
							}
							@Pc(257) Object local257 = local220.invoke(null, local224);
							if (local257 == null) {
								arg0.method1330(0);
							} else if (local257 instanceof Number) {
								arg0.method1330(1);
								arg0.method1331(((Number) local257).longValue());
							} else if (local257 instanceof Class63) {
								arg0.method1330(2);
								arg0.method1315((Class63) local257);
							} else {
								arg0.method1330(4);
							}
						} else if (local125 == 4) {
							local220 = (Method) local15.aClass20Array2[local104].anObject2;
							local170 = local220.getModifiers();
							arg0.method1330(0);
							arg0.method1292(local170);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method1330(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method1330(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method1330(-12);
					} catch (@Pc(347) OptionalDataException local347) {
						arg0.method1330(-13);
					} catch (@Pc(355) IllegalAccessException local355) {
						arg0.method1330(-14);
					} catch (@Pc(361) IllegalArgumentException local361) {
						arg0.method1330(-15);
					} catch (@Pc(367) InvocationTargetException local367) {
						arg0.method1330(-16);
					} catch (@Pc(375) SecurityException local375) {
						arg0.method1330(-17);
					} catch (@Pc(381) IOException local381) {
						arg0.method1330(-18);
					} catch (@Pc(389) NullPointerException local389) {
						arg0.method1330(-19);
					} catch (@Pc(395) Exception local395) {
						arg0.method1330(-20);
					} catch (@Pc(403) Throwable local403) {
						arg0.method1330(-21);
					}
				} else {
					arg0.method1330(local15.anIntArray252[local104]);
				}
			}
			arg0.method1308(local97);
			arg0.method1316(arg0.anInt1949 - local97);
			local15.method2123();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method466() {
		@Pc(9) int local9 = Static57.anInt1726 * 128 + 64;
		@Pc(15) int local15 = Static87.anInt2410 * 128 + 64;
		@Pc(24) int local24 = Static110.method2038(Static101.anInt2810, local15, local9) - Static87.anInt2409;
		if (local9 > Static41.anInt1273) {
			Static41.anInt1273 += Static34.anInt1162 * (local9 - Static41.anInt1273) / 1000 + Static80.anInt2170;
			if (Static41.anInt1273 > local9) {
				Static41.anInt1273 = local9;
			}
		}
		if (local15 > Static4.anInt45) {
			Static4.anInt45 += Static80.anInt2170 + Static34.anInt1162 * (local15 - Static4.anInt45) / 1000;
			if (local15 < Static4.anInt45) {
				Static4.anInt45 = local15;
			}
		}
		if (Static41.anInt1273 > local9) {
			Static41.anInt1273 -= (Static41.anInt1273 - local9) * Static34.anInt1162 / 1000 + Static80.anInt2170;
			if (Static41.anInt1273 < local9) {
				Static41.anInt1273 = local9;
			}
		}
		local9 = Static97.anInt2725 * 128 + 64;
		if (local15 < Static4.anInt45) {
			Static4.anInt45 -= Static34.anInt1162 * (Static4.anInt45 - local15) / 1000 + Static80.anInt2170;
			if (Static4.anInt45 < local15) {
				Static4.anInt45 = local15;
			}
		}
		if (Static34.anInt1163 < local24) {
			Static34.anInt1163 += Static34.anInt1162 * (local24 - Static34.anInt1163) / 1000 + Static80.anInt2170;
			if (local24 < Static34.anInt1163) {
				Static34.anInt1163 = local24;
			}
		}
		local15 = Static54.anInt1633 * 128 + 64;
		if (Static34.anInt1163 > local24) {
			Static34.anInt1163 -= Static80.anInt2170 + Static34.anInt1162 * (Static34.anInt1163 - local24) / 1000;
			if (Static34.anInt1163 < local24) {
				Static34.anInt1163 = local24;
			}
		}
		local24 = Static110.method2038(Static101.anInt2810, local15, local9) - Static89.anInt2479;
		@Pc(198) int local198 = local24 - Static34.anInt1163;
		@Pc(203) int local203 = local15 - Static4.anInt45;
		@Pc(208) int local208 = local9 - Static41.anInt1273;
		@Pc(219) int local219 = (int) Math.sqrt((double) (local208 * local208 + local203 * local203));
		@Pc(230) int local230 = (int) (Math.atan2((double) local198, (double) local219) * 325.949D) & 0x7FF;
		@Pc(241) int local241 = (int) (Math.atan2((double) local208, (double) local203) * -325.949D) & 0x7FF;
		@Pc(246) int local246 = local241 - Static94.anInt2627;
		if (local246 > 1024) {
			local246 -= 2048;
		}
		if (local230 < 128) {
			local230 = 128;
		}
		if (local230 > 383) {
			local230 = 383;
		}
		if (local246 < -1024) {
			local246 += 2048;
		}
		if (local246 > 0) {
			Static94.anInt2627 += Static116.anInt3157 + local246 * Static91.anInt2575 / 1000;
			Static94.anInt2627 &= 0x7FF;
		}
		if (Static35.anInt1172 < local230) {
			Static35.anInt1172 += Static116.anInt3157 + (local230 - Static35.anInt1172) * Static91.anInt2575 / 1000;
			if (Static35.anInt1172 > local230) {
				Static35.anInt1172 = local230;
			}
		}
		if (local230 < Static35.anInt1172) {
			Static35.anInt1172 -= Static91.anInt2575 * (Static35.anInt1172 - local230) / 1000 + Static116.anInt3157;
			if (local230 > Static35.anInt1172) {
				Static35.anInt1172 = local230;
			}
		}
		if (local246 < 0) {
			Static94.anInt2627 -= -local246 * Static91.anInt2575 / 1000 + Static116.anInt3157;
			Static94.anInt2627 &= 0x7FF;
		}
		@Pc(354) int local354 = local241 - Static94.anInt2627;
		if (local354 > 1024) {
			local354 -= 2048;
		}
		if (local354 < -1024) {
			local354 += 2048;
		}
		if (local354 < 0 && local246 > 0 || local354 > 0 && local246 < 0) {
			Static94.anInt2627 = local241;
		}
	}
}

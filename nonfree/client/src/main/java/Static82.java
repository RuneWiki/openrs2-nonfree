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

public final class Static82 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static int anInt1780;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[Lclient!fa;")
	public static Class41_Sub1[] aClass41_Sub1Array2;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[Lclient!co;")
	public static Class25[] aClass25Array2;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!lh;I)V")
	public static void method1388(@OriginalArg(1) Class1_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(20) Class1_Sub23 local20 = (Class1_Sub23) Static225.aClass61_25.method1835();
			if (local20 == null) {
				return;
			}
			@Pc(26) boolean local26 = false;
			@Pc(28) int local28;
			for (local28 = 0; local28 < local20.anInt3628; local28++) {
				if (local20.aClass116Array1[local28] != null) {
					if (local20.aClass116Array1[local28].anInt3812 == 2) {
						local20.anIntArray322[local28] = -5;
					}
					if (local20.aClass116Array1[local28].anInt3812 == 0) {
						local26 = true;
					}
				}
				if (local20.aClass116Array2[local28] != null) {
					if (local20.aClass116Array2[local28].anInt3812 == 2) {
						local20.anIntArray322[local28] = -6;
					}
					if (local20.aClass116Array2[local28].anInt3812 == 0) {
						local26 = true;
					}
				}
			}
			if (local26) {
				return;
			}
			arg0.method2697(148);
			arg0.method2655(0);
			local28 = arg0.anInt3264;
			arg0.method2659(local20.anInt3629);
			for (@Pc(123) int local123 = 0; local123 < local20.anInt3628; local123++) {
				if (local20.anIntArray322[local123] == 0) {
					try {
						@Pc(153) int local153 = local20.anIntArray325[local123];
						@Pc(165) Field local165;
						@Pc(169) int local169;
						if (local153 == 0) {
							local165 = (Field) local20.aClass116Array1[local123].anObject5;
							local169 = local165.getInt(null);
							arg0.method2655(0);
							arg0.method2659(local169);
						} else if (local153 == 1) {
							local165 = (Field) local20.aClass116Array1[local123].anObject5;
							local165.setInt(null, local20.anIntArray324[local123]);
							arg0.method2655(0);
						} else if (local153 == 2) {
							local165 = (Field) local20.aClass116Array1[local123].anObject5;
							local169 = local165.getModifiers();
							arg0.method2655(0);
							arg0.method2659(local169);
						}
						@Pc(233) Method local233;
						if (local153 == 3) {
							local233 = (Method) local20.aClass116Array2[local123].anObject5;
							@Pc(238) byte[][] local238 = local20.aByteArrayArrayArray19[local123];
							@Pc(242) Object[] local242 = new Object[local238.length];
							for (@Pc(244) int local244 = 0; local244 < local238.length; local244++) {
								@Pc(258) ObjectInputStream local258 = new ObjectInputStream(new ByteArrayInputStream(local238[local244]));
								local242[local244] = local258.readObject();
							}
							@Pc(271) Object local271 = local233.invoke(null, local242);
							if (local271 == null) {
								arg0.method2655(0);
							} else if (local271 instanceof Number) {
								arg0.method2655(1);
								arg0.method2673(((Number) local271).longValue());
							} else if (local271 instanceof String) {
								arg0.method2655(2);
								arg0.method2628((String) local271);
							} else {
								arg0.method2655(4);
							}
						} else if (local153 == 4) {
							local233 = (Method) local20.aClass116Array2[local123].anObject5;
							local169 = local233.getModifiers();
							arg0.method2655(0);
							arg0.method2659(local169);
						}
					} catch (@Pc(339) ClassNotFoundException local339) {
						arg0.method2655(-10);
					} catch (@Pc(345) InvalidClassException local345) {
						arg0.method2655(-11);
					} catch (@Pc(351) StreamCorruptedException local351) {
						arg0.method2655(-12);
					} catch (@Pc(357) OptionalDataException local357) {
						arg0.method2655(-13);
					} catch (@Pc(363) IllegalAccessException local363) {
						arg0.method2655(-14);
					} catch (@Pc(369) IllegalArgumentException local369) {
						arg0.method2655(-15);
					} catch (@Pc(375) InvocationTargetException local375) {
						arg0.method2655(-16);
					} catch (@Pc(381) SecurityException local381) {
						arg0.method2655(-17);
					} catch (@Pc(387) IOException local387) {
						arg0.method2655(-18);
					} catch (@Pc(393) NullPointerException local393) {
						arg0.method2655(-19);
					} catch (@Pc(399) Exception local399) {
						arg0.method2655(-20);
					} catch (@Pc(405) Throwable local405) {
						arg0.method2655(-21);
					}
				} else {
					arg0.method2655(local20.anIntArray322[local123]);
				}
			}
			arg0.method2685(local28);
			arg0.method2641(arg0.anInt3264 - local28);
			local20.method4441();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BI)Lclient!bn;")
	public static Class1_Sub2_Sub1_Sub2 method1389(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) Class1_Sub2_Sub1_Sub2 local24 = new Class1_Sub2_Sub1_Sub2(arg0, Static268.anIntArray461, Static289.anIntArray543, Static31.anIntArray78, Static44.anIntArray97, Static268.aByteArrayArray13);
			Static91.method1595();
			return local24;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	public static void method1390() {
		Static140.aClass135_14.method3317();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)V")
	public static void method1391(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub11 local10 = new Class1_Sub11(arg0);
		local10.anInt3264 = arg0.length - 2;
		Static199.anInt4056 = local10.method2691();
		Static130.aBooleanArray29 = new boolean[Static199.anInt4056];
		Static268.aByteArrayArray13 = new byte[Static199.anInt4056][];
		Static289.anIntArray543 = new int[Static199.anInt4056];
		Static268.anIntArray461 = new int[Static199.anInt4056];
		Static31.anIntArray78 = new int[Static199.anInt4056];
		Static23.aByteArrayArray3 = new byte[Static199.anInt4056][];
		Static44.anIntArray97 = new int[Static199.anInt4056];
		local10.anInt3264 = arg0.length - Static199.anInt4056 * 8 - 7;
		Static60.anInt1268 = local10.method2691();
		Static267.anInt5199 = local10.method2691();
		@Pc(68) int local68 = (local10.method2690() & 0xFF) + 1;
		@Pc(70) int local70;
		for (local70 = 0; local70 < Static199.anInt4056; local70++) {
			Static268.anIntArray461[local70] = local10.method2691();
		}
		for (local70 = 0; local70 < Static199.anInt4056; local70++) {
			Static289.anIntArray543[local70] = local10.method2691();
		}
		for (local70 = 0; local70 < Static199.anInt4056; local70++) {
			Static31.anIntArray78[local70] = local10.method2691();
		}
		for (local70 = 0; local70 < Static199.anInt4056; local70++) {
			Static44.anIntArray97[local70] = local10.method2691();
		}
		local10.anInt3264 = arg0.length - Static199.anInt4056 * 8 - (local68 + -1) * 3 - 7;
		Static133.anIntArray266 = new int[local68];
		@Pc(163) int local163;
		for (local163 = 1; local163 < local68; local163++) {
			Static133.anIntArray266[local163] = local10.method2681();
			if (Static133.anIntArray266[local163] == 0) {
				Static133.anIntArray266[local163] = 1;
			}
		}
		local10.anInt3264 = 0;
		for (local163 = 0; local163 < Static199.anInt4056; local163++) {
			@Pc(203) int local203 = Static31.anIntArray78[local163];
			@Pc(207) int local207 = Static44.anIntArray97[local163];
			@Pc(211) int local211 = local203 * local207;
			@Pc(214) byte[] local214 = new byte[local211];
			@Pc(216) boolean local216 = false;
			Static268.aByteArrayArray13[local163] = local214;
			@Pc(223) byte[] local223 = new byte[local211];
			Static23.aByteArrayArray3[local163] = local223;
			@Pc(231) int local231 = local10.method2690();
			@Pc(240) int local240;
			if ((local231 & 0x1) == 0) {
				for (local240 = 0; local240 < local211; local240++) {
					local214[local240] = local10.method2663();
				}
				if ((local231 & 0x2) != 0) {
					for (local240 = 0; local240 < local211; local240++) {
						@Pc(276) byte local276 = local223[local240] = local10.method2663();
						local216 |= local276 != -1;
					}
				}
			} else {
				local240 = 0;
				label97: while (true) {
					@Pc(303) int local303;
					if (local240 >= local203) {
						if ((local231 & 0x2) == 0) {
							break;
						}
						local240 = 0;
						while (true) {
							if (local240 >= local203) {
								break label97;
							}
							for (local303 = 0; local303 < local207; local303++) {
								@Pc(364) byte local364 = local223[local303 * local203 + local240] = local10.method2663();
								local216 |= local364 != -1;
							}
							local240++;
						}
					}
					for (local303 = 0; local303 < local207; local303++) {
						local214[local240 + local303 * local203] = local10.method2663();
					}
					local240++;
				}
			}
			Static130.aBooleanArray29[local163] = local216;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZIIII)V")
	public static void method1392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static244.anInt4843 = arg1;
		Static57.anInt1261 = arg3;
		Static76.anInt1612 = arg4;
		Static219.anInt4351 = arg2;
		Static186.anInt3847 = arg0;
		if (Static57.anInt1261 >= 100) {
			@Pc(30) int local30 = Static76.anInt1612 * 128 + 64;
			@Pc(36) int local36 = Static244.anInt4843 * 128 + 64;
			@Pc(45) int local45 = Static20.method383(local30, Static140.anInt3034, local36) - Static219.anInt4351;
			@Pc(50) int local50 = local45 - Static297.anInt5618;
			@Pc(55) int local55 = local36 - Static69.anInt1504;
			@Pc(60) int local60 = local30 - Static239.anInt4738;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local55 * local55));
			Static134.anInt2950 = (int) (Math.atan2((double) local50, (double) local71) * 325.949D) & 0x7FF;
			Static91.anInt2040 = (int) (Math.atan2((double) local55, (double) local60) * -325.949D) & 0x7FF;
			if (Static134.anInt2950 < 128) {
				Static134.anInt2950 = 128;
			}
			if (Static134.anInt2950 > 383) {
				Static134.anInt2950 = 383;
			}
		}
		Static220.anInt4376 = 2;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lclient!vm;")
	public static Class1_Sub2_Sub21 method1393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(10) Class1_Sub2_Sub21 local10 = (Class1_Sub2_Sub21) Static241.aClass70_16.method2074(); local10 != null; local10 = (Class1_Sub2_Sub21) Static241.aClass70_16.method2079()) {
			if (local10.aBoolean427 && local10.method4286(arg1, arg0)) {
				return local10;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)I")
	public static int method1394() {
		return 2;
	}
}

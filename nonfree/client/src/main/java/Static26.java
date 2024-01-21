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

public final class Static26 {

	@OriginalMember(owner = "client!e", name = "b", descriptor = "[[[Lclient!pb;")
	public static Class61[][][] aClass61ArrayArrayArray1 = new Class61[4][104][104];

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!ja;")
	private static Class39 aClass39_374 = Static28.method504("button near the top of that page)3");

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_373 = aClass39_374;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_375 = Static28.method504("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_376 = Static28.method504("null");

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_377 = Static28.method504(" )2>");

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!ja;")
	public static Class39 aClass39_378 = Static28.method504("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_379 = Static28.method504("Fallen lassen");

	@OriginalMember(owner = "client!e", name = "z", descriptor = "[I")
	public static int[] anIntArray67 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!e", name = "C", descriptor = "Lclient!ja;")
	public static Class39 aClass39_380 = Static28.method504("T");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!pd;Lclient!pd;Lclient!pd;I)V")
	public static void method432(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class20 arg2) {
		Static24.aClass20_13 = arg0;
		Static100.aClass20_50 = arg2;
		Static2.aClass20_1 = arg1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method433() {
		if (Static49.aClass69_3 != null) {
			Static49.aClass69_3.method1859();
			Static49.aClass69_3 = null;
		}
		Static117.method2041();
		Static101.aClass43_1.method1120();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static109.aClass81Array1[local18].method2220();
		}
		System.gc();
		Static16.method258();
		Static50.aBoolean69 = false;
		Static19.anInt518 = -1;
		Static96.method1759();
		Static54.method966(10);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method434() {
		while (true) {
			if (Static35.aClass4_Sub16_Sub1_1.method1493(Static97.anInt2446) >= 11) {
				@Pc(18) int local18 = Static35.aClass4_Sub16_Sub1_1.method1500(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local18] == null) {
						local25 = true;
						Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local18] = new Class4_Sub2_Sub1_Sub1_Sub1();
						if (Static92.aClass4_Sub16Array2[local18] != null) {
							Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local18].method1794(Static92.aClass4_Sub16Array2[local18]);
						}
					}
					Static116.anIntArray312[Static122.anInt3021++] = local18;
					@Pc(63) Class4_Sub2_Sub1_Sub1_Sub1 local63 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local18];
					local63.anInt2681 = Static71.anInt1738;
					@Pc(73) int local73 = Static35.aClass4_Sub16_Sub1_1.method1500(5);
					@Pc(78) int local78 = Static35.aClass4_Sub16_Sub1_1.method1500(5);
					if (local73 > 15) {
						local73 -= 32;
					}
					@Pc(89) int local89 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
					if (local78 > 15) {
						local78 -= 32;
					}
					@Pc(100) int local100 = Static128.anIntArray361[Static35.aClass4_Sub16_Sub1_1.method1500(3)];
					if (local25) {
						local63.anInt2644 = local63.anInt2670 = local100;
					}
					@Pc(115) int local115 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
					if (local115 == 1) {
						Static35.anIntArray101[Static30.anInt785++] = local18;
					}
					local63.method1913(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0] + local73, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0] - -local78, local89 == 1);
					continue;
				}
			}
			Static35.aClass4_Sub16_Sub1_1.method1491();
			return;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BILclient!o;)V")
	public static void method435(@OriginalArg(2) Class4_Sub16_Sub1 arg0) {
		while (true) {
			@Pc(18) Class4_Sub22 local18 = (Class4_Sub22) Static10.aClass61_1.method1628();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt3020; local25++) {
				if (local18.aClass16Array1[local25] != null) {
					if (local18.aClass16Array1[local25].anInt441 == 2) {
						local18.anIntArray323[local25] = -5;
					}
					if (local18.aClass16Array1[local25].anInt441 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass16Array2[local25] != null) {
					if (local18.aClass16Array2[local25].anInt441 == 2) {
						local18.anIntArray323[local25] = -6;
					}
					if (local18.aClass16Array2[local25].anInt441 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method1499(245);
			arg0.method1459(0);
			@Pc(98) int local98 = arg0.anInt2019;
			arg0.method1489(local18.anInt3022);
			for (@Pc(105) int local105 = 0; local105 < local18.anInt3020; local105++) {
				if (local18.anIntArray323[local105] == 0) {
					try {
						@Pc(129) int local129 = local18.anIntArray321[local105];
						@Pc(138) Field local138;
						@Pc(142) int local142;
						if (local129 == 0) {
							local138 = (Field) local18.aClass16Array1[local105].anObject2;
							local142 = local138.getInt(null);
							arg0.method1459(0);
							arg0.method1489(local142);
						} else if (local129 == 1) {
							local138 = (Field) local18.aClass16Array1[local105].anObject2;
							local138.setInt(null, local18.anIntArray322[local105]);
							arg0.method1459(0);
						} else if (local129 == 2) {
							local138 = (Field) local18.aClass16Array1[local105].anObject2;
							local142 = local138.getModifiers();
							arg0.method1459(0);
							arg0.method1489(local142);
						}
						@Pc(206) Method local206;
						if (local129 == 3) {
							local206 = (Method) local18.aClass16Array2[local105].anObject2;
							@Pc(211) byte[][] local211 = local18.aByteArrayArrayArray6[local105];
							@Pc(215) Object[] local215 = new Object[local211.length];
							for (@Pc(217) int local217 = 0; local217 < local211.length; local217++) {
								@Pc(229) ObjectInputStream local229 = new ObjectInputStream(new ByteArrayInputStream(local211[local217]));
								local215[local217] = local229.readObject();
							}
							@Pc(248) Object local248 = local206.invoke(null, local215);
							if (local248 == null) {
								arg0.method1459(0);
							} else if (local248 instanceof Number) {
								arg0.method1459(1);
								arg0.method1457(((Number) local248).longValue());
							} else if (local248 instanceof Class39) {
								arg0.method1459(2);
								arg0.method1470((Class39) local248);
							} else {
								arg0.method1459(4);
							}
						} else if (local129 == 4) {
							local206 = (Method) local18.aClass16Array2[local105].anObject2;
							local142 = local206.getModifiers();
							arg0.method1459(0);
							arg0.method1489(local142);
						}
					} catch (@Pc(316) ClassNotFoundException local316) {
						arg0.method1459(-10);
					} catch (@Pc(322) InvalidClassException local322) {
						arg0.method1459(-11);
					} catch (@Pc(328) StreamCorruptedException local328) {
						arg0.method1459(-12);
					} catch (@Pc(334) OptionalDataException local334) {
						arg0.method1459(-13);
					} catch (@Pc(340) IllegalAccessException local340) {
						arg0.method1459(-14);
					} catch (@Pc(346) IllegalArgumentException local346) {
						arg0.method1459(-15);
					} catch (@Pc(352) InvocationTargetException local352) {
						arg0.method1459(-16);
					} catch (@Pc(358) SecurityException local358) {
						arg0.method1459(-17);
					} catch (@Pc(364) IOException local364) {
						arg0.method1459(-18);
					} catch (@Pc(370) NullPointerException local370) {
						arg0.method1459(-19);
					} catch (@Pc(376) Exception local376) {
						arg0.method1459(-20);
					} catch (@Pc(382) Throwable local382) {
						arg0.method1459(-21);
					}
				} else {
					arg0.method1459(local18.anIntArray323[local105]);
				}
			}
			arg0.method1447(local98);
			arg0.method1482(arg0.anInt2019 - local98);
			local18.method2189();
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method436() {
		aClass39_379 = null;
		aClass39_376 = null;
		aClass39_377 = null;
		aClass39_375 = null;
		aClass61ArrayArrayArray1 = null;
		aClass39_374 = null;
		aClass39_373 = null;
		aClass39_380 = null;
		aClass39_378 = null;
		anIntArray67 = null;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static void method437() {
		Static32.aClass12_22.method233();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB)I")
	public static int method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(36) int local36 = Static47.method771(arg0 + 45365, 4, arg1 + 91923) + (Static47.method771(arg0 - -10294, 2, arg1 + 37821) + -128 >> 1) + (Static47.method771(arg0, 1, arg1) - 128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public static void method439(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static50.aBoolean69) {
			Static59.method1057();
		} else if (arg0 != -1 && Static19.anInt518 != arg0 && Static116.anInt2896 != 0 && !Static50.aBoolean69) {
			Static15.method245(0, Static116.anInt2896, arg0, Static29.aClass20_Sub1_3);
		}
		Static19.anInt518 = arg0;
	}
}

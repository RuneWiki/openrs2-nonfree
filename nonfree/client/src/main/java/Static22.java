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

public final class Static22 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
	public static int[] anIntArray90;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!sd;")
	public static Class2 aClass2_4;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt705 = 0;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "I")
	public static int anInt715 = 1;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_311 = Static56.method972("backright1");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B[Lclient!ae;)[Lclient!ae;")
	public static Class5[] method439(@OriginalArg(1) Class5[] arg0) {
		@Pc(8) Class5[] local8 = new Class5[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static75.method1261(new Class5[] { Static96.method1319(local10), Static47.aClass5_623 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static75.method1261(new Class5[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!bf;Lclient!bf;)I")
	public static int method444(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1869(Static88.aClass5_1020, Static5.aClass5_110)) {
			local5++;
		}
		if (arg1.method1869(Static88.aClass5_1020, Static89.aClass5_1045)) {
			local5++;
		}
		if (arg1.method1869(Static88.aClass5_1020, Static32.aClass5_420)) {
			local5++;
		}
		if (arg1.method1869(Static88.aClass5_1020, Static106.aClass5_1236)) {
			local5++;
		}
		if (arg1.method1869(Static88.aClass5_1020, Static18.aClass5_287)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method446() {
		anIntArray90 = null;
		anIntArray91 = null;
		aFont1 = null;
		aClass3_Sub1_Sub2_Sub4_3 = null;
		aClass2_4 = null;
		aClass5_311 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!sb;)V")
	public static void method447(@OriginalArg(2) Class3_Sub6_Sub1 arg0) {
		while (true) {
			@Pc(14) Class3_Sub7 local14 = (Class3_Sub7) Static17.aClass51_4.method1316();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt1823; local21++) {
				if (local14.aClass58Array1[local21] != null) {
					if (local14.aClass58Array1[local21].anInt2474 == 2) {
						local14.anIntArray204[local21] = -5;
					}
					if (local14.aClass58Array1[local21].anInt2474 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass58Array2[local21] != null) {
					if (local14.aClass58Array2[local21].anInt2474 == 2) {
						local14.anIntArray204[local21] = -6;
					}
					if (local14.aClass58Array2[local21].anInt2474 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method1645(194);
			arg0.method1608(0);
			@Pc(94) int local94 = arg0.anInt2416;
			arg0.method1611(local14.anInt1813);
			for (@Pc(101) int local101 = 0; local101 < local14.anInt1823; local101++) {
				if (local14.anIntArray204[local101] == 0) {
					try {
						@Pc(125) int local125 = local14.anIntArray205[local101];
						@Pc(140) Field local140;
						@Pc(166) int local166;
						if (local125 == 0) {
							local140 = (Field) local14.aClass58Array1[local101].anObject4;
							local166 = local140.getInt(null);
							arg0.method1608(0);
							arg0.method1611(local166);
						} else if (local125 == 1) {
							local140 = (Field) local14.aClass58Array1[local101].anObject4;
							local140.setInt(null, local14.anIntArray206[local101]);
							arg0.method1608(0);
						} else if (local125 == 2) {
							local140 = (Field) local14.aClass58Array1[local101].anObject4;
							local166 = local140.getModifiers();
							arg0.method1608(0);
							arg0.method1611(local166);
						}
						@Pc(207) Method local207;
						if (local125 == 3) {
							local207 = (Method) local14.aClass58Array2[local101].anObject4;
							@Pc(212) byte[][] local212 = local14.aByteArrayArrayArray4[local101];
							@Pc(216) Object[] local216 = new Object[local212.length];
							for (@Pc(218) int local218 = 0; local218 < local212.length; local218++) {
								@Pc(230) ObjectInputStream local230 = new ObjectInputStream(new ByteArrayInputStream(local212[local218]));
								local216[local218] = local230.readObject();
							}
							@Pc(249) Object local249 = local207.invoke(null, local216);
							if (local249 == null) {
								arg0.method1608(0);
							} else if (local249 instanceof Number) {
								arg0.method1608(1);
								arg0.method1606(((Number) local249).longValue());
							} else if (local249 instanceof Class5) {
								arg0.method1608(2);
								arg0.method1637((Class5) local249);
							} else {
								arg0.method1608(4);
							}
						} else if (local125 == 4) {
							local207 = (Method) local14.aClass58Array2[local101].anObject4;
							local166 = local207.getModifiers();
							arg0.method1608(0);
							arg0.method1611(local166);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg0.method1608(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg0.method1608(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg0.method1608(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg0.method1608(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg0.method1608(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg0.method1608(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg0.method1608(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg0.method1608(-17);
					} catch (@Pc(363) IOException local363) {
						arg0.method1608(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg0.method1608(-19);
					} catch (@Pc(375) Exception local375) {
						arg0.method1608(-20);
					} catch (@Pc(381) Throwable local381) {
						arg0.method1608(-21);
					}
				} else {
					arg0.method1608(local14.anIntArray204[local101]);
				}
			}
			arg0.method1594(local94);
			arg0.method1619(arg0.anInt2416 - local94);
			local14.method1966();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method449() {
		if (Static3.anInt292 == 0) {
			return;
		}
		@Pc(18) int local18 = 0;
		if (Static69.anInt1818 != 0) {
			local18 = 1;
		}
		for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
			if (Static3.aClass5Array2[local24] != null) {
				@Pc(34) int local34 = Static16.anIntArray64[local24];
				@Pc(38) Class5 local38 = Static89.aClass5Array15[local24];
				if (local38 != null && local38.method139(Static58.aClass5_775)) {
					local38 = local38.method159(5);
				}
				if (local38 != null && local38.method139(Static91.aClass5_1071)) {
					local38 = local38.method159(5);
				}
				if ((local34 == 3 || local34 == 7) && (local34 == 7 || Static12.anInt479 == 0 || Static12.anInt479 == 1 && Static4.method134(local38))) {
					@Pc(90) int local90 = 329 - local18 * 13;
					if (Static100.anInt2512 > 4 && Static49.anInt1325 - 4 > local90 + -10 && Static49.anInt1325 - 4 <= local90 + 3) {
						@Pc(134) int local134 = Static88.aClass3_Sub1_Sub2_Sub1_3.method267(Static75.method1261(new Class5[] { Static101.aClass5_1156, Static115.aClass5_1354, local38, Static3.aClass5Array2[local24] })) + 25;
						if (local134 > 450) {
							local134 = 450;
						}
						if (Static100.anInt2512 < local134 + 4) {
							if (Static7.anInt363 >= 1) {
								Static4.method129(0, Static51.aClass5_1095, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local38 }), 0, 2009);
							}
							Static4.method129(0, Static19.aClass5_302, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local38 }), 0, 2021);
							Static4.method129(0, Static73.aClass5_867, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, local38 }), 0, 2031);
						}
					}
					local18++;
					if (local18 >= 5) {
						return;
					}
				}
				if ((local34 == 5 || local34 == 6) && Static12.anInt479 < 2) {
					local18++;
					if (local18 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I")
	public static int method450() {
		return 19;
	}
}

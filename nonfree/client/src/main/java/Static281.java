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

public final class Static281 {

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Lclient!ek;")
	public static Class42 aClass42_102;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!jj;")
	public static Class87 aClass87_8;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
	public static int anInt5558;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
	public static int anInt5559;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	public static int anInt5549 = 0;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5551 = 0;

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
	public static int anInt5563 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method4394() {
		Static110.method1876();
		Static150.method2672();
		Static6.method116();
		Static186.aClass106_6.method2985();
		Static282.aClass50_1 = new Class50();
		((Class104_Sub1) Static1.anInterface3_1).method4156();
		Static289.method4480();
		Static212.aClass156Array1 = new Class156[255];
		Static212.anInt4342 = 0;
		Static129.method2379();
		Static266.method4177();
		Static264.method4158();
		Static65.method1194(false);
		Static99.method1714();
		Static5.method3851();
		for (@Pc(48) int local48 = 0; local48 < 2048; local48++) {
			@Pc(57) Class15_Sub2_Sub2 local57 = Static188.aClass15_Sub2_Sub2Array41[local48];
			if (local57 != null) {
				local57.anObject7 = null;
			}
		}
		if (Static116.aBoolean184) {
			Static266.method4175();
			Static107.method1821(Static60.aBoolean96);
			Static97.method1681();
		}
		Static55.method1078(Static121.aClass42_32, Static256.aClass42_79);
		Static253.method3982(Static121.aClass42_32);
		Static155.aClass2_Sub8_Sub1_8 = null;
		Static30.aClass2_Sub8_Sub1_4 = null;
		Static50.aClass2_Sub8_Sub1_5 = null;
		Static255.aClass2_Sub8_Sub1_12 = null;
		Static26.aClass2_Sub8_Sub1_10 = null;
		if (Static64.anInt1561 == 5) {
			Static257.method4042(Static121.aClass42_32);
		}
		if (Static64.anInt1561 == 10) {
			Static268.method4232(false);
		}
		if (Static64.anInt1561 == 30) {
			Static305.method4624(25);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!ih;)V")
	public static void method4395(@OriginalArg(2) Class2_Sub16_Sub1 arg0) {
		while (true) {
			@Pc(17) Class2_Sub6 local17 = (Class2_Sub6) Static184.aClass44_20.method1352();
			if (local17 == null) {
				return;
			}
			@Pc(24) boolean local24 = false;
			@Pc(26) int local26;
			for (local26 = 0; local26 < local17.anInt407; local26++) {
				if (local17.aClass111Array1[local26] != null) {
					if (local17.aClass111Array1[local26].anInt3788 == 2) {
						local17.anIntArray52[local26] = -5;
					}
					if (local17.aClass111Array1[local26].anInt3788 == 0) {
						local24 = true;
					}
				}
				if (local17.aClass111Array2[local26] != null) {
					if (local17.aClass111Array2[local26].anInt3788 == 2) {
						local17.anIntArray52[local26] = -6;
					}
					if (local17.aClass111Array2[local26].anInt3788 == 0) {
						local24 = true;
					}
				}
			}
			if (local24) {
				return;
			}
			arg0.method2198(120);
			arg0.method2168(0);
			local26 = arg0.anInt2789;
			arg0.method2186(local17.anInt408);
			for (@Pc(118) int local118 = 0; local118 < local17.anInt407; local118++) {
				if (local17.anIntArray52[local118] == 0) {
					try {
						@Pc(146) int local146 = local17.anIntArray53[local118];
						@Pc(158) Field local158;
						@Pc(162) int local162;
						if (local146 == 0) {
							local158 = (Field) local17.aClass111Array1[local118].anObject4;
							local162 = local158.getInt(null);
							arg0.method2168(0);
							arg0.method2186(local162);
						} else if (local146 == 1) {
							local158 = (Field) local17.aClass111Array1[local118].anObject4;
							local158.setInt(null, local17.anIntArray54[local118]);
							arg0.method2168(0);
						} else if (local146 == 2) {
							local158 = (Field) local17.aClass111Array1[local118].anObject4;
							local162 = local158.getModifiers();
							arg0.method2168(0);
							arg0.method2186(local162);
						}
						@Pc(227) Method local227;
						if (local146 == 3) {
							local227 = (Method) local17.aClass111Array2[local118].anObject4;
							@Pc(232) byte[][] local232 = local17.aByteArrayArrayArray4[local118];
							@Pc(236) Object[] local236 = new Object[local232.length];
							for (@Pc(238) int local238 = 0; local238 < local232.length; local238++) {
								@Pc(256) ObjectInputStream local256 = new ObjectInputStream(new ByteArrayInputStream(local232[local238]));
								local236[local238] = local256.readObject();
							}
							@Pc(269) Object local269 = local227.invoke(null, local236);
							if (local269 == null) {
								arg0.method2168(0);
							} else if (local269 instanceof Number) {
								arg0.method2168(1);
								arg0.method2144(((Number) local269).longValue());
							} else if (local269 instanceof String) {
								arg0.method2168(2);
								arg0.method2153((String) local269);
							} else {
								arg0.method2168(4);
							}
						} else if (local146 == 4) {
							local227 = (Method) local17.aClass111Array2[local118].anObject4;
							local162 = local227.getModifiers();
							arg0.method2168(0);
							arg0.method2186(local162);
						}
					} catch (@Pc(335) ClassNotFoundException local335) {
						arg0.method2168(-10);
					} catch (@Pc(341) InvalidClassException local341) {
						arg0.method2168(-11);
					} catch (@Pc(347) StreamCorruptedException local347) {
						arg0.method2168(-12);
					} catch (@Pc(353) OptionalDataException local353) {
						arg0.method2168(-13);
					} catch (@Pc(359) IllegalAccessException local359) {
						arg0.method2168(-14);
					} catch (@Pc(365) IllegalArgumentException local365) {
						arg0.method2168(-15);
					} catch (@Pc(371) InvocationTargetException local371) {
						arg0.method2168(-16);
					} catch (@Pc(377) SecurityException local377) {
						arg0.method2168(-17);
					} catch (@Pc(383) IOException local383) {
						arg0.method2168(-18);
					} catch (@Pc(389) NullPointerException local389) {
						arg0.method2168(-19);
					} catch (@Pc(395) Exception local395) {
						arg0.method2168(-20);
					} catch (@Pc(401) Throwable local401) {
						arg0.method2168(-21);
					}
				} else {
					arg0.method2168(local17.anIntArray52[local118]);
				}
			}
			arg0.method2194(local26);
			arg0.method2131(arg0.anInt2789 - local26);
			local17.method4743();
		}
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(III)V")
	public static void method4397() {
		for (@Pc(1) int local1 = 0; local1 < Static46.anInt1155; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static38.anInt954; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static232.anInt4680; local11++) {
					@Pc(22) Class2_Sub13 local22 = Static52.aClass2_Sub13ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class122 local27 = local22.aClass122_1;
						if (local27 != null && local27.aClass15_3.method4278()) {
							Static5.method3850(local27.aClass15_3, local1, local6, local11, 1, 1);
							if (local27.aClass15_2 != null && local27.aClass15_2.method4278()) {
								Static5.method3850(local27.aClass15_2, local1, local6, local11, 1, 1);
								local27.aClass15_3.method4279(local27.aClass15_2, 0, 0, 0, false);
								local27.aClass15_2 = local27.aClass15_2.method4280();
							}
							local27.aClass15_3 = local27.aClass15_3.method4280();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt1544; local83++) {
							@Pc(92) Class170 local92 = local22.aClass170Array1[local83];
							if (local92 != null && local92.aClass15_9.method4278()) {
								Static5.method3850(local92.aClass15_9, local1, local6, local11, local92.anInt5435 + 1 - local92.anInt5433, local92.anInt5448 - local92.anInt5437 + 1);
								local92.aClass15_9 = local92.aClass15_9.method4280();
							}
						}
						@Pc(131) Class191 local131 = local22.aClass191_1;
						if (local131 != null && local131.aClass15_10.method4278()) {
							Static101.method1740(local131.aClass15_10, local1, local6, local11);
							local131.aClass15_10 = local131.aClass15_10.method4280();
						}
					}
				}
			}
		}
	}
}

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

public final class Static74 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public static int anInt1678;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Lclient!ul;")
	public static Class246 aClass246_48;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "Lclient!js;")
	public static Class14_Sub1 aClass14_Sub1_3;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_15 = new Class179(7, 6);

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_16 = new Class179(25, 7);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public static void method1491() {
		Static127.method2242(false);
		if (Static87.anInt1874 >= 0 && Static87.anInt1874 != 0) {
			Static178.method2844(Static87.anInt1874);
			Static87.anInt1874 = -1;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBILclient!ul;)Lclient!tp;")
	public static Class236 method1492(@OriginalArg(0) int arg0, @OriginalArg(3) Class246 arg1) {
		@Pc(9) byte[] local9 = arg1.method5477(arg0, 0);
		return local9 == null ? null : new Class236(local9);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!ad;)Ljava/lang/String;")
	public static String method1493(@OriginalArg(1) Class1_Sub3 arg0) {
		return arg0.aString1 == null || arg0.aString1.length() <= 0 ? arg0.aString2 : arg0.aString2 + Static343.aClass7_151.method331(Static341.anInt5770) + arg0.aString1;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!ah;I)V")
	public static void method1495(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5_Sub1 arg1) {
		while (true) {
			@Pc(14) Class1_Sub40 local14 = (Class1_Sub40) Static4.aClass181_1.method4112();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt6376; local21++) {
				if (local14.aClass9Array2[local21] != null) {
					if (local14.aClass9Array2[local21].anInt368 == 2) {
						local14.anIntArray588[local21] = -5;
					}
					if (local14.aClass9Array2[local21].anInt368 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass9Array1[local21] != null) {
					if (local14.aClass9Array1[local21].anInt368 == 2) {
						local14.anIntArray588[local21] = -6;
					}
					if (local14.aClass9Array1[local21].anInt368 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg1.method317(arg0);
			arg1.method5396(0);
			@Pc(103) int local103 = arg1.anInt6475;
			arg1.method5417(local14.anInt6371);
			for (@Pc(110) int local110 = 0; local110 < local14.anInt6376; local110++) {
				if (local14.anIntArray588[local110] == 0) {
					try {
						@Pc(131) int local131 = local14.anIntArray587[local110];
						@Pc(143) Field local143;
						@Pc(147) int local147;
						if (local131 == 0) {
							local143 = (Field) local14.aClass9Array2[local110].anObject2;
							local147 = local143.getInt(null);
							arg1.method5396(0);
							arg1.method5417(local147);
						} else if (local131 == 1) {
							local143 = (Field) local14.aClass9Array2[local110].anObject2;
							local143.setInt(null, local14.anIntArray589[local110]);
							arg1.method5396(0);
						} else if (local131 == 2) {
							local143 = (Field) local14.aClass9Array2[local110].anObject2;
							local147 = local143.getModifiers();
							arg1.method5396(0);
							arg1.method5417(local147);
						}
						@Pc(220) Method local220;
						if (local131 == 3) {
							local220 = (Method) local14.aClass9Array1[local110].anObject2;
							@Pc(245) byte[][] local245 = local14.aByteArrayArrayArray17[local110];
							@Pc(249) Object[] local249 = new Object[local245.length];
							for (@Pc(251) int local251 = 0; local251 < local245.length; local251++) {
								@Pc(263) ObjectInputStream local263 = new ObjectInputStream(new ByteArrayInputStream(local245[local251]));
								local249[local251] = local263.readObject();
							}
							@Pc(278) Object local278 = local220.invoke(null, local249);
							if (local278 == null) {
								arg1.method5396(0);
							} else if (local278 instanceof Number) {
								arg1.method5396(1);
								arg1.method5358(((Number) local278).longValue());
							} else if (local278 instanceof String) {
								arg1.method5396(2);
								arg1.method5385((String) local278);
							} else {
								arg1.method5396(4);
							}
						} else if (local131 == 4) {
							local220 = (Method) local14.aClass9Array1[local110].anObject2;
							local147 = local220.getModifiers();
							arg1.method5396(0);
							arg1.method5417(local147);
						}
					} catch (@Pc(325) ClassNotFoundException local325) {
						arg1.method5396(-10);
					} catch (@Pc(331) InvalidClassException local331) {
						arg1.method5396(-11);
					} catch (@Pc(337) StreamCorruptedException local337) {
						arg1.method5396(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg1.method5396(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg1.method5396(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg1.method5396(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg1.method5396(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg1.method5396(-17);
					} catch (@Pc(375) IOException local375) {
						arg1.method5396(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg1.method5396(-19);
					} catch (@Pc(387) Exception local387) {
						arg1.method5396(-20);
					} catch (@Pc(393) Throwable local393) {
						arg1.method5396(-21);
					}
				} else {
					arg1.method5396(local14.anIntArray588[local110]);
				}
			}
			arg1.method5392(local103);
			arg1.method5364(arg1.anInt6475 - local103);
			local14.method6020();
		}
	}
}

import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ci", name = "ub", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!ci", name = "db", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ci", name = "hb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_356 = Static32.method683("event_opbase");

	@OriginalMember(owner = "client!ci", name = "jb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_357 = Static32.method683("leuchten2:");

	@OriginalMember(owner = "client!ci", name = "nb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_358 = Static32.method683("scrollen:");

	@OriginalMember(owner = "client!ci", name = "qb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_359 = Static32.method683("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ci", name = "tb", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!ci", name = "xb", descriptor = "[I")
	public static int[] anIntArray52 = new int[128];

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
	public static void method503() {
		anIntArray52 = null;
		aClass49_357 = null;
		aBigInteger1 = null;
		aClass49_356 = null;
		aClass49_358 = null;
		aClass49_359 = null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;Lclient!ke;BII)Lclient!ah;")
	public static Class5 method504(@OriginalArg(0) Component arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static22.anInt472 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class5 local33 = (Class5) Class.forName("Class5_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray210 = new int[(Static149.aBoolean131 ? 2 : 1) * 256];
			local33.anInt2226 = arg3;
			local33.method1800(arg0);
			local33.anInt2229 = (arg3 & -1024) + 1024;
			if (local33.anInt2229 > 16384) {
				local33.anInt2229 = 16384;
			}
			local33.method1788(local33.anInt2229);
			if (Static50.anInt1147 > 0 && Static176.aClass36_1 == null) {
				Static176.aClass36_1 = new Class36();
				Static176.aClass36_1.aClass45_2 = arg1;
				arg1.method1479(Static176.aClass36_1, Static50.anInt1147);
			}
			if (Static176.aClass36_1 != null) {
				if (Static176.aClass36_1.aClass5Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static176.aClass36_1.aClass5Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class5_Sub2 local114 = new Class5_Sub2(arg1, arg2);
				local114.anIntArray210 = new int[(Static149.aBoolean131 ? 2 : 1) * 256];
				local114.anInt2226 = arg3;
				local114.method1800(arg0);
				local114.anInt2229 = 16384;
				local114.method1788(local114.anInt2229);
				if (Static50.anInt1147 > 0 && Static176.aClass36_1 == null) {
					Static176.aClass36_1 = new Class36();
					Static176.aClass36_1.aClass45_2 = arg1;
					arg1.method1479(Static176.aClass36_1, Static50.anInt1147);
				}
				if (Static176.aClass36_1 != null) {
					if (Static176.aClass36_1.aClass5Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static176.aClass36_1.aClass5Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(184) Throwable local184) {
				return new Class5();
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
	public static int method506(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLclient!wa;)V")
	public static void method507(@OriginalArg(2) Class2_Sub13_Sub1 arg0) {
		while (true) {
			@Pc(14) Class2_Sub24 local14 = (Class2_Sub24) Static182.aClass81_15.method2682();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt3678; local21++) {
				if (local14.aClass16Array1[local21] != null) {
					if (local14.aClass16Array1[local21].anInt749 == 2) {
						local14.anIntArray324[local21] = -5;
					}
					if (local14.aClass16Array1[local21].anInt749 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass16Array2[local21] != null) {
					if (local14.aClass16Array2[local21].anInt749 == 2) {
						local14.anIntArray324[local21] = -6;
					}
					if (local14.aClass16Array2[local21].anInt749 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2976(157);
			arg0.method2932(0);
			@Pc(97) int local97 = arg0.anInt3940;
			arg0.method2952(local14.anInt3677);
			for (@Pc(104) int local104 = 0; local104 < local14.anInt3678; local104++) {
				if (local14.anIntArray324[local104] == 0) {
					try {
						@Pc(128) int local128 = local14.anIntArray325[local104];
						@Pc(143) Field local143;
						@Pc(169) int local169;
						if (local128 == 0) {
							local143 = (Field) local14.aClass16Array1[local104].anObject1;
							local169 = local143.getInt(null);
							arg0.method2932(0);
							arg0.method2952(local169);
						} else if (local128 == 1) {
							local143 = (Field) local14.aClass16Array1[local104].anObject1;
							local143.setInt(null, local14.anIntArray326[local104]);
							arg0.method2932(0);
						} else if (local128 == 2) {
							local143 = (Field) local14.aClass16Array1[local104].anObject1;
							local169 = local143.getModifiers();
							arg0.method2932(0);
							arg0.method2952(local169);
						}
						@Pc(208) Method local208;
						if (local128 == 3) {
							local208 = (Method) local14.aClass16Array2[local104].anObject1;
							@Pc(213) byte[][] local213 = local14.aByteArrayArrayArray8[local104];
							@Pc(217) Object[] local217 = new Object[local213.length];
							for (@Pc(219) int local219 = 0; local219 < local213.length; local219++) {
								@Pc(231) ObjectInputStream local231 = new ObjectInputStream(new ByteArrayInputStream(local213[local219]));
								local217[local219] = local231.readObject();
							}
							@Pc(246) Object local246 = local208.invoke(null, local217);
							if (local246 == null) {
								arg0.method2932(0);
							} else if (local246 instanceof Number) {
								arg0.method2932(1);
								arg0.method2956(((Number) local246).longValue());
							} else if (local246 instanceof Class49) {
								arg0.method2932(2);
								arg0.method2949((Class49) local246);
							} else {
								arg0.method2932(4);
							}
						} else if (local128 == 4) {
							local208 = (Method) local14.aClass16Array2[local104].anObject1;
							local169 = local208.getModifiers();
							arg0.method2932(0);
							arg0.method2952(local169);
						}
					} catch (@Pc(314) ClassNotFoundException local314) {
						arg0.method2932(-10);
					} catch (@Pc(320) InvalidClassException local320) {
						arg0.method2932(-11);
					} catch (@Pc(326) StreamCorruptedException local326) {
						arg0.method2932(-12);
					} catch (@Pc(332) OptionalDataException local332) {
						arg0.method2932(-13);
					} catch (@Pc(338) IllegalAccessException local338) {
						arg0.method2932(-14);
					} catch (@Pc(344) IllegalArgumentException local344) {
						arg0.method2932(-15);
					} catch (@Pc(350) InvocationTargetException local350) {
						arg0.method2932(-16);
					} catch (@Pc(356) SecurityException local356) {
						arg0.method2932(-17);
					} catch (@Pc(362) IOException local362) {
						arg0.method2932(-18);
					} catch (@Pc(368) NullPointerException local368) {
						arg0.method2932(-19);
					} catch (@Pc(374) Exception local374) {
						arg0.method2932(-20);
					} catch (@Pc(380) Throwable local380) {
						arg0.method2932(-21);
					}
				} else {
					arg0.method2932(local14.anIntArray324[local104]);
				}
			}
			arg0.method2966(local97);
			arg0.method2929(arg0.anInt3940 - local97);
			local14.method3007();
		}
	}
}

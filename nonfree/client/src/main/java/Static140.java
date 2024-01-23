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

public final class Static140 {

	@OriginalMember(owner = "client!n", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!n", name = "M", descriptor = "J")
	public static long aLong30;

	@OriginalMember(owner = "client!n", name = "S", descriptor = "Z")
	private static boolean aBoolean64;

	@OriginalMember(owner = "client!n", name = "T", descriptor = "Z")
	private static boolean aBoolean65;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "[Lclient!lh;")
	public static Class74[] aClass74Array2 = new Class74[50];

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public static int anInt679 = 0;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "[S")
	public static short[] aShortArray13 = new short[] { 32, 37, 31, 44, 49, 2, 15, 22 };

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_234 = Static231.method3737("::fps ");

	@OriginalMember(owner = "client!n", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[104][104];

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!sc;")
	public static Class107 aClass107_235 = Static231.method3737(":");

	@OriginalMember(owner = "client!n", name = "J", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!eg;)V")
	public static void method657(@OriginalArg(1) Class5_Sub5 arg0) {
		@Pc(8) int local8 = arg0.anInt3042 - Static128.anInt2802;
		if (arg0.anInt3003 == 0) {
			arg0.anInt2994 = 1024;
		}
		arg0.anInt3019 = 0;
		@Pc(30) int local30 = arg0.anInt3033 * 128 + arg0.anInt2997 * 64;
		arg0.anInt3021 += (local30 - arg0.anInt3021) / local8;
		@Pc(52) int local52 = arg0.anInt2997 * 64 + arg0.anInt3015 * 128;
		if (arg0.anInt3003 == 1) {
			arg0.anInt2994 = 1536;
		}
		arg0.anInt3044 += (local52 - arg0.anInt3044) / local8;
		if (arg0.anInt3003 == 2) {
			arg0.anInt2994 = 0;
		}
		if (arg0.anInt3003 == 3) {
			arg0.anInt2994 = 512;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!re;I)V")
	public static void method658(@OriginalArg(1) Class1_Sub26_Sub1 arg0) {
		while (true) {
			@Pc(14) Class1_Sub10 local14 = (Class1_Sub10) Static114.aClass120_13.method3564();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt1556; local21++) {
				if (local14.aClass84Array1[local21] != null) {
					if (local14.aClass84Array1[local21].anInt3171 == 2) {
						local14.anIntArray135[local21] = -5;
					}
					if (local14.aClass84Array1[local21].anInt3171 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass84Array2[local21] != null) {
					if (local14.aClass84Array2[local21].anInt3171 == 2) {
						local14.anIntArray135[local21] = -6;
					}
					if (local14.aClass84Array2[local21].anInt3171 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method3000(255);
			arg0.method2967(0);
			@Pc(92) int local92 = arg0.anInt4021;
			arg0.method2973(local14.anInt1560);
			for (@Pc(99) int local99 = 0; local99 < local14.anInt1556; local99++) {
				if (local14.anIntArray135[local99] == 0) {
					try {
						@Pc(120) int local120 = local14.anIntArray134[local99];
						@Pc(139) Field local139;
						@Pc(142) int local142;
						if (local120 == 0) {
							local139 = (Field) local14.aClass84Array1[local99].anObject4;
							local142 = local139.getInt(null);
							arg0.method2967(0);
							arg0.method2973(local142);
						} else if (local120 == 1) {
							local139 = (Field) local14.aClass84Array1[local99].anObject4;
							local139.setInt(null, local14.anIntArray137[local99]);
							arg0.method2967(0);
						} else if (local120 == 2) {
							local139 = (Field) local14.aClass84Array1[local99].anObject4;
							local142 = local139.getModifiers();
							arg0.method2967(0);
							arg0.method2973(local142);
						}
						@Pc(206) Method local206;
						if (local120 == 3) {
							local206 = (Method) local14.aClass84Array2[local99].anObject4;
							@Pc(231) byte[][] local231 = local14.aByteArrayArrayArray5[local99];
							@Pc(235) Object[] local235 = new Object[local231.length];
							for (@Pc(237) int local237 = 0; local237 < local231.length; local237++) {
								@Pc(249) ObjectInputStream local249 = new ObjectInputStream(new ByteArrayInputStream(local231[local237]));
								local235[local237] = local249.readObject();
							}
							@Pc(264) Object local264 = local206.invoke(null, local235);
							if (local264 == null) {
								arg0.method2967(0);
							} else if (local264 instanceof Number) {
								arg0.method2967(1);
								arg0.method2940(((Number) local264).longValue());
							} else if (local264 instanceof Class107) {
								arg0.method2967(2);
								arg0.method2979((Class107) local264);
							} else {
								arg0.method2967(4);
							}
						} else if (local120 == 4) {
							local206 = (Method) local14.aClass84Array2[local99].anObject4;
							local142 = local206.getModifiers();
							arg0.method2967(0);
							arg0.method2973(local142);
						}
					} catch (@Pc(307) ClassNotFoundException local307) {
						arg0.method2967(-10);
					} catch (@Pc(313) InvalidClassException local313) {
						arg0.method2967(-11);
					} catch (@Pc(319) StreamCorruptedException local319) {
						arg0.method2967(-12);
					} catch (@Pc(325) OptionalDataException local325) {
						arg0.method2967(-13);
					} catch (@Pc(331) IllegalAccessException local331) {
						arg0.method2967(-14);
					} catch (@Pc(337) IllegalArgumentException local337) {
						arg0.method2967(-15);
					} catch (@Pc(343) InvocationTargetException local343) {
						arg0.method2967(-16);
					} catch (@Pc(349) SecurityException local349) {
						arg0.method2967(-17);
					} catch (@Pc(355) IOException local355) {
						arg0.method2967(-18);
					} catch (@Pc(361) NullPointerException local361) {
						arg0.method2967(-19);
					} catch (@Pc(367) Exception local367) {
						arg0.method2967(-20);
					} catch (@Pc(373) Throwable local373) {
						arg0.method2967(-21);
					}
				} else {
					arg0.method2967(local14.anIntArray135[local99]);
				}
			}
			arg0.method2935(local92);
			arg0.method2982(arg0.anInt4021 - local92);
			local14.method3735();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III[B)Lclient!sc;")
	public static Class107 method661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class107 local9 = new Class107();
		local9.anInt4186 = 0;
		local9.aByteArray55 = new byte[arg1];
		for (@Pc(18) int local18 = arg0; local18 < arg0 + arg1; local18++) {
			if (arg2[local18] != 0) {
				local9.aByteArray55[local9.anInt4186++] = arg2[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZB)V")
	public static void method666(@OriginalArg(0) boolean arg0) {
		Static30.method587();
		if (Static178.anInt3884 != 30 && Static178.anInt3884 != 25) {
			return;
		}
		Static185.anInt4913++;
		if (Static185.anInt4913 < 50 && !arg0) {
			return;
		}
		Static185.anInt4913 = 0;
		if (!Static191.aBoolean371 && Static167.aClass82_3 != null) {
			Static193.aClass1_Sub26_Sub1_2.method3000(120);
			try {
				Static167.aClass82_3.method2399(Static193.aClass1_Sub26_Sub1_2.anInt4021, Static193.aClass1_Sub26_Sub1_2.aByteArray52);
				Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
			} catch (@Pc(57) IOException local57) {
				Static191.aBoolean371 = true;
			}
		}
		Static30.method587();
	}
}

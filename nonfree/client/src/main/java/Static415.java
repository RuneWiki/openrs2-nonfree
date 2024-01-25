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

public final class Static415 {

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array22;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_200 = new Class102(61, -1);

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
	public static int anInt6793 = 0;

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
	public static int anInt6794 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)I")
	public static int method5239(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local13 >> 12;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!nf;)V")
	public static void method5242(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13_Sub2 arg1) {
		while (true) {
			@Pc(14) Class2_Sub19 local14 = (Class2_Sub19) Static233.aClass156_57.method3155();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt2173; local21++) {
				if (local14.aClass91Array1[local21] != null) {
					if (local14.aClass91Array1[local21].anInt2446 == 2) {
						local14.anIntArray163[local21] = -5;
					}
					if (local14.aClass91Array1[local21].anInt2446 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass91Array2[local21] != null) {
					if (local14.aClass91Array2[local21].anInt2446 == 2) {
						local14.anIntArray163[local21] = -6;
					}
					if (local14.aClass91Array2[local21].anInt2446 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg1.method3611(arg0);
			arg1.method3602(0);
			@Pc(103) int local103 = arg1.anInt4347;
			arg1.method3569(local14.anInt2177);
			for (@Pc(110) int local110 = 0; local110 < local14.anInt2173; local110++) {
				if (local14.anIntArray163[local110] == 0) {
					try {
						@Pc(131) int local131 = local14.anIntArray165[local110];
						@Pc(143) Field local143;
						@Pc(147) int local147;
						if (local131 == 0) {
							local143 = (Field) local14.aClass91Array1[local110].anObject3;
							local147 = local143.getInt(null);
							arg1.method3602(0);
							arg1.method3569(local147);
						} else if (local131 == 1) {
							local143 = (Field) local14.aClass91Array1[local110].anObject3;
							local143.setInt(null, local14.anIntArray164[local110]);
							arg1.method3602(0);
						} else if (local131 == 2) {
							local143 = (Field) local14.aClass91Array1[local110].anObject3;
							local147 = local143.getModifiers();
							arg1.method3602(0);
							arg1.method3569(local147);
						}
						@Pc(218) Method local218;
						if (local131 == 3) {
							local218 = (Method) local14.aClass91Array2[local110].anObject3;
							@Pc(243) byte[][] local243 = local14.aByteArrayArrayArray2[local110];
							@Pc(247) Object[] local247 = new Object[local243.length];
							for (@Pc(249) int local249 = 0; local249 < local243.length; local249++) {
								@Pc(261) ObjectInputStream local261 = new ObjectInputStream(new ByteArrayInputStream(local243[local249]));
								local247[local249] = local261.readObject();
							}
							@Pc(276) Object local276 = local218.invoke(null, local247);
							if (local276 == null) {
								arg1.method3602(0);
							} else if (local276 instanceof Number) {
								arg1.method3602(1);
								arg1.method3570(((Number) local276).longValue());
							} else if (local276 instanceof String) {
								arg1.method3602(2);
								arg1.method3590((String) local276);
							} else {
								arg1.method3602(4);
							}
						} else if (local131 == 4) {
							local218 = (Method) local14.aClass91Array2[local110].anObject3;
							local147 = local218.getModifiers();
							arg1.method3602(0);
							arg1.method3569(local147);
						}
					} catch (@Pc(319) ClassNotFoundException local319) {
						arg1.method3602(-10);
					} catch (@Pc(325) InvalidClassException local325) {
						arg1.method3602(-11);
					} catch (@Pc(331) StreamCorruptedException local331) {
						arg1.method3602(-12);
					} catch (@Pc(337) OptionalDataException local337) {
						arg1.method3602(-13);
					} catch (@Pc(343) IllegalAccessException local343) {
						arg1.method3602(-14);
					} catch (@Pc(349) IllegalArgumentException local349) {
						arg1.method3602(-15);
					} catch (@Pc(355) InvocationTargetException local355) {
						arg1.method3602(-16);
					} catch (@Pc(361) SecurityException local361) {
						arg1.method3602(-17);
					} catch (@Pc(367) IOException local367) {
						arg1.method3602(-18);
					} catch (@Pc(373) NullPointerException local373) {
						arg1.method3602(-19);
					} catch (@Pc(379) Exception local379) {
						arg1.method3602(-20);
					} catch (@Pc(385) Throwable local385) {
						arg1.method3602(-21);
					}
				} else {
					arg1.method3602(local14.anIntArray163[local110]);
				}
			}
			arg1.method3579(local103);
			arg1.method3562(arg1.anInt4347 - local103);
			local14.method5703();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
	public static void method5248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass3_Sub2_3 != null) {
			local7.aClass3_Sub2_3 = null;
		}
		if (local7.aClass3_Sub2_2 != null) {
			local7.aClass3_Sub2_2 = null;
		}
	}
}

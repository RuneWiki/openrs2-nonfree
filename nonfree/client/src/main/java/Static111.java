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

public final class Static111 {

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!th;")
	public static Class168 aClass168_83;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[[Lclient!ua;")
	public static Class1_Sub28[][] aClass1_Sub28ArrayArray1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString146 = "M";

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString147 = "scroll:";

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt2434 = 0;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!vl;")
	public static Class186 aClass186_7 = new Class186(32);

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
	public static int[] anIntArray257 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method1805() {
		Static166.aClass89_23.method2266();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ji;BI)V")
	public static void method1806(@OriginalArg(0) Class1_Sub14_Sub1 arg0) {
		while (true) {
			@Pc(16) Class1_Sub29 local16 = (Class1_Sub29) Static58.aClass26_11.method666();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			@Pc(23) int local23;
			for (local23 = 0; local23 < local16.anInt5864; local23++) {
				if (local16.aClass47Array2[local23] != null) {
					if (local16.aClass47Array2[local23].anInt1417 == 2) {
						local16.anIntArray527[local23] = -5;
					}
					if (local16.aClass47Array2[local23].anInt1417 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass47Array1[local23] != null) {
					if (local16.aClass47Array1[local23].anInt1417 == 2) {
						local16.anIntArray527[local23] = -6;
					}
					if (local16.aClass47Array1[local23].anInt1417 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method2252(155);
			arg0.method2191(0);
			local23 = arg0.anInt3000;
			arg0.method2236(local16.anInt5862);
			for (@Pc(115) int local115 = 0; local115 < local16.anInt5864; local115++) {
				if (local16.anIntArray527[local115] == 0) {
					try {
						@Pc(146) int local146 = local16.anIntArray526[local115];
						@Pc(158) Field local158;
						@Pc(162) int local162;
						if (local146 == 0) {
							local158 = (Field) local16.aClass47Array2[local115].anObject2;
							local162 = local158.getInt(null);
							arg0.method2191(0);
							arg0.method2236(local162);
						} else if (local146 == 1) {
							local158 = (Field) local16.aClass47Array2[local115].anObject2;
							local158.setInt(null, local16.anIntArray528[local115]);
							arg0.method2191(0);
						} else if (local146 == 2) {
							local158 = (Field) local16.aClass47Array2[local115].anObject2;
							local162 = local158.getModifiers();
							arg0.method2191(0);
							arg0.method2236(local162);
						}
						@Pc(237) Method local237;
						if (local146 == 3) {
							local237 = (Method) local16.aClass47Array1[local115].anObject2;
							@Pc(262) byte[][] local262 = local16.aByteArrayArrayArray18[local115];
							@Pc(266) Object[] local266 = new Object[local262.length];
							for (@Pc(268) int local268 = 0; local268 < local262.length; local268++) {
								@Pc(282) ObjectInputStream local282 = new ObjectInputStream(new ByteArrayInputStream(local262[local268]));
								local266[local268] = local282.readObject();
							}
							@Pc(295) Object local295 = local237.invoke(null, local266);
							if (local295 == null) {
								arg0.method2191(0);
							} else if (local295 instanceof Number) {
								arg0.method2191(1);
								arg0.method2193(((Number) local295).longValue());
							} else if (local295 instanceof String) {
								arg0.method2191(2);
								arg0.method2188((String) local295);
							} else {
								arg0.method2191(4);
							}
						} else if (local146 == 4) {
							local237 = (Method) local16.aClass47Array1[local115].anObject2;
							local162 = local237.getModifiers();
							arg0.method2191(0);
							arg0.method2236(local162);
						}
					} catch (@Pc(339) ClassNotFoundException local339) {
						arg0.method2191(-10);
					} catch (@Pc(345) InvalidClassException local345) {
						arg0.method2191(-11);
					} catch (@Pc(351) StreamCorruptedException local351) {
						arg0.method2191(-12);
					} catch (@Pc(357) OptionalDataException local357) {
						arg0.method2191(-13);
					} catch (@Pc(363) IllegalAccessException local363) {
						arg0.method2191(-14);
					} catch (@Pc(369) IllegalArgumentException local369) {
						arg0.method2191(-15);
					} catch (@Pc(375) InvocationTargetException local375) {
						arg0.method2191(-16);
					} catch (@Pc(381) SecurityException local381) {
						arg0.method2191(-17);
					} catch (@Pc(387) IOException local387) {
						arg0.method2191(-18);
					} catch (@Pc(393) NullPointerException local393) {
						arg0.method2191(-19);
					} catch (@Pc(399) Exception local399) {
						arg0.method2191(-20);
					} catch (@Pc(405) Throwable local405) {
						arg0.method2191(-21);
					}
				} else {
					arg0.method2191(local16.anIntArray527[local115]);
				}
			}
			arg0.method2204(local23);
			arg0.method2218(arg0.anInt3000 - local23);
			local16.method4767();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[Ljava/lang/Object;I[JI)V")
	public static void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg0; local46++) {
			if (arg3[local46] < (long) (local46 & 0x1) + local20) {
				@Pc(68) long local68 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local68;
				@Pc(82) Object local82 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local82;
			}
		}
		arg3[arg0] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method1807(local16 - 1, arg1, arg2, arg3);
		method1807(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)[F")
	public static float[] method1808() {
		@Pc(13) float local13 = Static180.method2909() + Static180.method2904();
		@Pc(15) int local15 = Static180.method2906();
		Static301.aFloatArray21[3] = 1.0F;
		@Pc(28) float local28 = (float) (local15 >> 8 & 0xFF) / 255.0F;
		@Pc(37) float local37 = (float) (local15 >> 16 & 0xFF) / 255.0F;
		@Pc(44) float local44 = (float) (local15 & 0xFF) / 255.0F;
		@Pc(46) float local46 = 0.58823526F;
		Static301.aFloatArray21[1] = local46 * Static287.aFloatArray30[1] * local28 * local13;
		Static301.aFloatArray21[2] = local13 * Static287.aFloatArray30[2] * local44 * local46;
		Static301.aFloatArray21[0] = local13 * local46 * local37 * Static287.aFloatArray30[0];
		return Static301.aFloatArray21;
	}
}

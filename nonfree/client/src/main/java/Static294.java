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

public final class Static294 {

	@OriginalMember(owner = "client!op", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!op", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)V")
	public static void method4022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static18.aClass1_Sub28_Sub1_1.method5347(arg0);
		Static18.aClass1_Sub28_Sub1_1.method5393(arg1);
		Static18.aClass1_Sub28_Sub1_1.method5393(arg2);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method4023() {
		Static383.aClass34_11.Q(Static459.anInt7336, Static453.aClass136_Sub1_1.aBoolean496 ? Static176.anInt1041 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(II)I")
	public static int method4025(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!kh;)V")
	public static void method4027(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub28_Sub1 arg1) {
		while (true) {
			@Pc(14) Class1_Sub20 local14 = (Class1_Sub20) Static423.aClass227_39.method4967();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt2497; local21++) {
				if (local14.aClass232Array1[local21] != null) {
					if (local14.aClass232Array1[local21].anInt6402 == 2) {
						local14.anIntArray169[local21] = -5;
					}
					if (local14.aClass232Array1[local21].anInt6402 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass232Array2[local21] != null) {
					if (local14.aClass232Array2[local21].anInt6402 == 2) {
						local14.anIntArray169[local21] = -6;
					}
					if (local14.aClass232Array2[local21].anInt6402 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg1.method3078(arg0);
			arg1.method5398(0);
			@Pc(104) int local104 = arg1.anInt6812;
			arg1.method5347(local14.anInt2498);
			for (@Pc(113) int local113 = 0; local113 < local14.anInt2497; local113++) {
				if (local14.anIntArray169[local113] == 0) {
					try {
						@Pc(137) int local137 = local14.anIntArray170[local113];
						@Pc(149) Field local149;
						@Pc(153) int local153;
						if (local137 == 0) {
							local149 = (Field) local14.aClass232Array1[local113].anObject8;
							local153 = local149.getInt(null);
							arg1.method5398(0);
							arg1.method5347(local153);
						} else if (local137 == 1) {
							local149 = (Field) local14.aClass232Array1[local113].anObject8;
							local149.setInt(null, local14.anIntArray168[local113]);
							arg1.method5398(0);
						} else if (local137 == 2) {
							local149 = (Field) local14.aClass232Array1[local113].anObject8;
							local153 = local149.getModifiers();
							arg1.method5398(0);
							arg1.method5347(local153);
						}
						@Pc(222) Method local222;
						if (local137 == 3) {
							local222 = (Method) local14.aClass232Array2[local113].anObject8;
							@Pc(247) byte[][] local247 = local14.aByteArrayArrayArray8[local113];
							@Pc(251) Object[] local251 = new Object[local247.length];
							for (@Pc(253) int local253 = 0; local253 < local247.length; local253++) {
								@Pc(265) ObjectInputStream local265 = new ObjectInputStream(new ByteArrayInputStream(local247[local253]));
								local251[local253] = local265.readObject();
							}
							@Pc(280) Object local280 = local222.invoke(null, local251);
							if (local280 == null) {
								arg1.method5398(0);
							} else if (local280 instanceof Number) {
								arg1.method5398(1);
								arg1.method5371(((Number) local280).longValue());
							} else if (local280 instanceof String) {
								arg1.method5398(2);
								arg1.method5364((String) local280);
							} else {
								arg1.method5398(4);
							}
						} else if (local137 == 4) {
							local222 = (Method) local14.aClass232Array2[local113].anObject8;
							local153 = local222.getModifiers();
							arg1.method5398(0);
							arg1.method5347(local153);
						}
					} catch (@Pc(323) ClassNotFoundException local323) {
						arg1.method5398(-10);
					} catch (@Pc(329) InvalidClassException local329) {
						arg1.method5398(-11);
					} catch (@Pc(335) StreamCorruptedException local335) {
						arg1.method5398(-12);
					} catch (@Pc(341) OptionalDataException local341) {
						arg1.method5398(-13);
					} catch (@Pc(347) IllegalAccessException local347) {
						arg1.method5398(-14);
					} catch (@Pc(353) IllegalArgumentException local353) {
						arg1.method5398(-15);
					} catch (@Pc(359) InvocationTargetException local359) {
						arg1.method5398(-16);
					} catch (@Pc(365) SecurityException local365) {
						arg1.method5398(-17);
					} catch (@Pc(371) IOException local371) {
						arg1.method5398(-18);
					} catch (@Pc(377) NullPointerException local377) {
						arg1.method5398(-19);
					} catch (@Pc(383) Exception local383) {
						arg1.method5398(-20);
					} catch (@Pc(389) Throwable local389) {
						arg1.method5398(-21);
					}
				} else {
					arg1.method5398(local14.anIntArray169[local113]);
				}
			}
			arg1.method5365(local104);
			arg1.method5352(arg1.anInt6812 - local104);
			local14.method5915();
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(IIII)I")
	public static int method4029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}

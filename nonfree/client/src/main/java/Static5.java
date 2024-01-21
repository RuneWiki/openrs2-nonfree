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

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "I", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "I")
	public static int anInt123 = -1;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_67 = Static161.method2452("Please try again)3");

	@OriginalMember(owner = "client!af", name = "P", descriptor = "Lclient!dc;")
	public static Class20 aClass20_66 = aClass20_67;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIII)V")
	public static void method127(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class106 local13 = local7.aClass106_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4089;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class57 local58 = local7.aClass57_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt2169;
		@Pc(67) int local67 = local58.anInt2170;
		@Pc(70) int local70 = local58.anInt2168;
		@Pc(73) int local73 = local58.anInt2167;
		@Pc(77) int[] local77 = Static172.anIntArrayArray38[local23];
		@Pc(81) int[] local81 = Static44.anIntArrayArray12[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
	public static int method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (arg1 + local3) / arg0 - local3;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!vf;IB)V")
	public static void method130(@OriginalArg(0) Class5_Sub6_Sub1 arg0) {
		while (true) {
			@Pc(14) Class5_Sub27 local14 = (Class5_Sub27) Static143.aClass91_13.method2684();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt4224; local21++) {
				if (local14.aClass65Array2[local21] != null) {
					if (local14.aClass65Array2[local21].anInt2446 == 2) {
						local14.anIntArray430[local21] = -5;
					}
					if (local14.aClass65Array2[local21].anInt2446 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass65Array1[local21] != null) {
					if (local14.aClass65Array1[local21].anInt2446 == 2) {
						local14.anIntArray430[local21] = -6;
					}
					if (local14.aClass65Array1[local21].anInt2446 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method3087(120);
			arg0.method3061(0);
			@Pc(100) int local100 = arg0.anInt4050;
			arg0.method3030(local14.anInt4222);
			for (@Pc(109) int local109 = 0; local109 < local14.anInt4224; local109++) {
				if (local14.anIntArray430[local109] == 0) {
					try {
						@Pc(133) int local133 = local14.anIntArray432[local109];
						@Pc(150) Field local150;
						@Pc(153) int local153;
						if (local133 == 0) {
							local150 = (Field) local14.aClass65Array2[local109].anObject3;
							local153 = local150.getInt(null);
							arg0.method3061(0);
							arg0.method3030(local153);
						} else if (local133 == 1) {
							local150 = (Field) local14.aClass65Array2[local109].anObject3;
							local150.setInt(null, local14.anIntArray429[local109]);
							arg0.method3061(0);
						} else if (local133 == 2) {
							local150 = (Field) local14.aClass65Array2[local109].anObject3;
							local153 = local150.getModifiers();
							arg0.method3061(0);
							arg0.method3030(local153);
						}
						@Pc(223) Method local223;
						if (local133 == 3) {
							local223 = (Method) local14.aClass65Array1[local109].anObject3;
							@Pc(248) byte[][] local248 = local14.aByteArrayArrayArray16[local109];
							@Pc(252) Object[] local252 = new Object[local248.length];
							for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
								@Pc(266) ObjectInputStream local266 = new ObjectInputStream(new ByteArrayInputStream(local248[local254]));
								local252[local254] = local266.readObject();
							}
							@Pc(285) Object local285 = local223.invoke(null, local252);
							if (local285 == null) {
								arg0.method3061(0);
							} else if (local285 instanceof Number) {
								arg0.method3061(1);
								arg0.method3037(((Number) local285).longValue());
							} else if (local285 instanceof Class20) {
								arg0.method3061(2);
								arg0.method3047((Class20) local285);
							} else {
								arg0.method3061(4);
							}
						} else if (local133 == 4) {
							local223 = (Method) local14.aClass65Array1[local109].anObject3;
							local153 = local223.getModifiers();
							arg0.method3061(0);
							arg0.method3030(local153);
						}
					} catch (@Pc(328) ClassNotFoundException local328) {
						arg0.method3061(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg0.method3061(-11);
					} catch (@Pc(340) StreamCorruptedException local340) {
						arg0.method3061(-12);
					} catch (@Pc(346) OptionalDataException local346) {
						arg0.method3061(-13);
					} catch (@Pc(352) IllegalAccessException local352) {
						arg0.method3061(-14);
					} catch (@Pc(358) IllegalArgumentException local358) {
						arg0.method3061(-15);
					} catch (@Pc(364) InvocationTargetException local364) {
						arg0.method3061(-16);
					} catch (@Pc(370) SecurityException local370) {
						arg0.method3061(-17);
					} catch (@Pc(376) IOException local376) {
						arg0.method3061(-18);
					} catch (@Pc(382) NullPointerException local382) {
						arg0.method3061(-19);
					} catch (@Pc(388) Exception local388) {
						arg0.method3061(-20);
					} catch (@Pc(394) Throwable local394) {
						arg0.method3061(-21);
					}
				} else {
					arg0.method3061(local14.anIntArray430[local109]);
				}
			}
			arg0.method3032(local100);
			arg0.method3078(arg0.anInt4050 - local100);
			local14.method3207();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method131(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class5_Sub20 local10 = (Class5_Sub20) Static94.aClass75_10.method2067(); local10 != null; local10 = (Class5_Sub20) Static94.aClass75_10.method2066()) {
			if ((local10.aLong253 >> 48 & 0xFFFFL) == (long) arg0) {
				local10.method3207();
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)V")
	public static void method132(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static210.aBoolean58) {
			Static85.method1457();
		} else if (arg0 != -1 && (Static160.anInt3233 != arg0 || !Static90.method1501()) && Static46.anInt1037 != 0 && !Static210.aBoolean58) {
			Static90.method1499(arg0, Static59.aClass23_Sub1_7, Static46.anInt1037);
		}
		Static160.anInt3233 = arg0;
	}
}

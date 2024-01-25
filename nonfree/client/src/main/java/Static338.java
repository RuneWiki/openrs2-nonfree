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

public final class Static338 {

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "[I")
	public static int[] anIntArray660;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public static int anInt6530;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Z")
	public static boolean aBoolean538 = true;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!wf;II)V")
	public static void method5608(@OriginalArg(0) Class1_Sub21_Sub2 arg0) {
		while (true) {
			@Pc(17) Class1_Sub37 local17 = (Class1_Sub37) Static26.aClass14_1.method302();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt5191; local24++) {
				if (local17.aClass193Array1[local24] != null) {
					if (local17.aClass193Array1[local24].anInt5986 == 2) {
						local17.anIntArray484[local24] = -5;
					}
					if (local17.aClass193Array1[local24].anInt5986 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass193Array2[local24] != null) {
					if (local17.aClass193Array2[local24].anInt5986 == 2) {
						local17.anIntArray484[local24] = -6;
					}
					if (local17.aClass193Array2[local24].anInt5986 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method5757(127);
			arg0.method5718(0);
			@Pc(105) int local105 = arg0.anInt6611;
			arg0.method5702(local17.anInt5187);
			for (@Pc(112) int local112 = 0; local112 < local17.anInt5191; local112++) {
				if (local17.anIntArray484[local112] == 0) {
					try {
						@Pc(136) int local136 = local17.anIntArray482[local112];
						@Pc(153) Field local153;
						@Pc(156) int local156;
						if (local136 == 0) {
							local153 = (Field) local17.aClass193Array1[local112].anObject7;
							local156 = local153.getInt(null);
							arg0.method5718(0);
							arg0.method5702(local156);
						} else if (local136 == 1) {
							local153 = (Field) local17.aClass193Array1[local112].anObject7;
							local153.setInt(null, local17.anIntArray483[local112]);
							arg0.method5718(0);
						} else if (local136 == 2) {
							local153 = (Field) local17.aClass193Array1[local112].anObject7;
							local156 = local153.getModifiers();
							arg0.method5718(0);
							arg0.method5702(local156);
						}
						@Pc(221) Method local221;
						if (local136 == 3) {
							local221 = (Method) local17.aClass193Array2[local112].anObject7;
							@Pc(226) byte[][] local226 = local17.aByteArrayArrayArray8[local112];
							@Pc(230) Object[] local230 = new Object[local226.length];
							for (@Pc(232) int local232 = 0; local232 < local226.length; local232++) {
								@Pc(244) ObjectInputStream local244 = new ObjectInputStream(new ByteArrayInputStream(local226[local232]));
								local230[local232] = local244.readObject();
							}
							@Pc(263) Object local263 = local221.invoke(null, local230);
							if (local263 == null) {
								arg0.method5718(0);
							} else if (local263 instanceof Number) {
								arg0.method5718(1);
								arg0.method5744(((Number) local263).longValue());
							} else if (local263 instanceof String) {
								arg0.method5718(2);
								arg0.method5752((String) local263);
							} else {
								arg0.method5718(4);
							}
						} else if (local136 == 4) {
							local221 = (Method) local17.aClass193Array2[local112].anObject7;
							local156 = local221.getModifiers();
							arg0.method5718(0);
							arg0.method5702(local156);
						}
					} catch (@Pc(335) ClassNotFoundException local335) {
						arg0.method5718(-10);
					} catch (@Pc(343) InvalidClassException local343) {
						arg0.method5718(-11);
					} catch (@Pc(351) StreamCorruptedException local351) {
						arg0.method5718(-12);
					} catch (@Pc(357) OptionalDataException local357) {
						arg0.method5718(-13);
					} catch (@Pc(365) IllegalAccessException local365) {
						arg0.method5718(-14);
					} catch (@Pc(371) IllegalArgumentException local371) {
						arg0.method5718(-15);
					} catch (@Pc(377) InvocationTargetException local377) {
						arg0.method5718(-16);
					} catch (@Pc(383) SecurityException local383) {
						arg0.method5718(-17);
					} catch (@Pc(389) IOException local389) {
						arg0.method5718(-18);
					} catch (@Pc(395) NullPointerException local395) {
						arg0.method5718(-19);
					} catch (@Pc(401) Exception local401) {
						arg0.method5718(-20);
					} catch (@Pc(407) Throwable local407) {
						arg0.method5718(-21);
					}
				} else {
					arg0.method5718(local17.anIntArray484[local112]);
				}
			}
			arg0.method5692(local105);
			arg0.method5750(arg0.anInt6611 - local105);
			local17.method5796();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class175 method5610(@OriginalArg(0) int arg0) {
		@Pc(15) Class175 local15 = (Class175) Static194.aClass37_64.method915((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static100.aClass134_45.method3009(arg0, 4);
		local15 = new Class175();
		if (local25 != null) {
			local15.method4571(arg0, new Class1_Sub21(local25));
		}
		local15.method4566(arg0);
		Static194.aClass37_64.method922((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)V")
	public static void method5614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static60.anInt1399 && arg1 <= Static138.anInt6334) {
			@Pc(15) int local15 = Static54.method1088(Static41.anInt1131, arg0, Static165.anInt3409);
			@Pc(21) int local21 = Static54.method1088(Static41.anInt1131, arg3, Static165.anInt3409);
			Static124.method1991(arg2, local15, arg1, local21);
		}
	}
}

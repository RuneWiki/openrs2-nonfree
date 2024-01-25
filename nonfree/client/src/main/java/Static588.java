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

public final class Static588 {

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	public static int anInt2860;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "J")
	public static long aLong81;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public static int anInt2856 = 0;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([FIIIFIFIIIIFI)V")
	public static void method2586(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg11 - arg5;
		@Pc(21) int local21 = arg7 - arg3;
		@Pc(25) int local25 = arg9 - arg2;
		@Pc(46) float local46 = (float) local21 * arg0[0] + (float) local5 * arg0[1] + arg0[2] * (float) local25;
		@Pc(67) float local67 = arg0[5] * (float) local25 + (float) local5 * arg0[4] + (float) local21 * arg0[3];
		@Pc(88) float local88 = (float) local5 * arg0[7] + arg0[6] * (float) local21 + arg0[8] * (float) local25;
		@Pc(99) float local99;
		@Pc(106) float local106;
		if (arg1 == 0) {
			local99 = local46 + arg4 + 0.5F;
			local106 = arg10 + 0.5F - local88;
		} else if (arg1 == 1) {
			local99 = arg4 + local46 + 0.5F;
			local106 = local88 + arg10 + 0.5F;
		} else if (arg1 == 2) {
			local106 = arg6 + 0.5F - local67;
			local99 = arg4 + 0.5F - local46;
		} else if (arg1 == 3) {
			local99 = arg4 + local46 + 0.5F;
			local106 = arg6 + 0.5F - local67;
		} else if (arg1 == 4) {
			local99 = local88 + arg10 + 0.5F;
			local106 = arg6 + 0.5F - local67;
		} else {
			local106 = arg6 + 0.5F - local67;
			local99 = arg10 + 0.5F - local88;
		}
		@Pc(219) float local219;
		if (arg8 == 1) {
			local219 = local99;
			local99 = -local106;
			local106 = local219;
		} else if (arg8 == 2) {
			local99 = -local99;
			local106 = -local106;
		} else if (arg8 == 3) {
			local219 = local99;
			local99 = local106;
			local106 = -local219;
		}
		Static302.aFloat178 = local106;
		Static556.aFloat222 = local99;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLclient!bw;)V")
	public static void method2587(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		@Pc(10) Class3_Sub8 local10 = (Class3_Sub8) Static511.aClass130_51.method3543();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt691; local17++) {
			if (local10.aClass192Array2[local17] != null) {
				if (local10.aClass192Array2[local17].anInt5186 == 2) {
					local10.anIntArray71[local17] = -5;
				}
				if (local10.aClass192Array2[local17].anInt5186 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass192Array1[local17] != null) {
				if (local10.aClass192Array1[local17].anInt5186 == 2) {
					local10.anIntArray71[local17] = -6;
				}
				if (local10.aClass192Array1[local17].anInt5186 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(85) int local85 = arg0.anInt3520;
		arg0.method3101(local10.anInt693);
		for (@Pc(92) int local92 = 0; local92 < local10.anInt691; local92++) {
			if (local10.anIntArray71[local92] == 0) {
				try {
					@Pc(116) int local116 = local10.anIntArray70[local92];
					@Pc(125) Field local125;
					@Pc(129) int local129;
					if (local116 == 0) {
						local125 = (Field) local10.aClass192Array2[local92].anObject30;
						local129 = local125.getInt(null);
						arg0.method3079(0);
						arg0.method3101(local129);
					} else if (local116 == 1) {
						local125 = (Field) local10.aClass192Array2[local92].anObject30;
						local125.setInt(null, local10.anIntArray69[local92]);
						arg0.method3079(0);
					} else if (local116 == 2) {
						local125 = (Field) local10.aClass192Array2[local92].anObject30;
						local129 = local125.getModifiers();
						arg0.method3079(0);
						arg0.method3101(local129);
					}
					@Pc(197) Method local197;
					if (local116 == 3) {
						local197 = (Method) local10.aClass192Array1[local92].anObject30;
						@Pc(202) byte[][] local202 = local10.aByteArrayArrayArray1[local92];
						@Pc(206) Object[] local206 = new Object[local202.length];
						for (@Pc(208) int local208 = 0; local208 < local202.length; local208++) {
							@Pc(220) ObjectInputStream local220 = new ObjectInputStream(new ByteArrayInputStream(local202[local208]));
							local206[local208] = local220.readObject();
						}
						@Pc(235) Object local235 = local197.invoke(null, local206);
						if (local235 == null) {
							arg0.method3079(0);
						} else if (local235 instanceof Number) {
							arg0.method3079(1);
							arg0.method3124(((Number) local235).longValue());
						} else if (local235 instanceof String) {
							arg0.method3079(2);
							arg0.method3136((String) local235);
						} else {
							arg0.method3079(4);
						}
					} else if (local116 == 4) {
						local197 = (Method) local10.aClass192Array1[local92].anObject30;
						local129 = local197.getModifiers();
						arg0.method3079(0);
						arg0.method3101(local129);
					}
				} catch (@Pc(301) ClassNotFoundException local301) {
					arg0.method3079(-10);
				} catch (@Pc(307) InvalidClassException local307) {
					arg0.method3079(-11);
				} catch (@Pc(313) StreamCorruptedException local313) {
					arg0.method3079(-12);
				} catch (@Pc(319) OptionalDataException local319) {
					arg0.method3079(-13);
				} catch (@Pc(325) IllegalAccessException local325) {
					arg0.method3079(-14);
				} catch (@Pc(331) IllegalArgumentException local331) {
					arg0.method3079(-15);
				} catch (@Pc(337) InvocationTargetException local337) {
					arg0.method3079(-16);
				} catch (@Pc(343) SecurityException local343) {
					arg0.method3079(-17);
				} catch (@Pc(349) IOException local349) {
					arg0.method3079(-18);
				} catch (@Pc(355) NullPointerException local355) {
					arg0.method3079(-19);
				} catch (@Pc(361) Exception local361) {
					arg0.method3079(-20);
				} catch (@Pc(367) Throwable local367) {
					arg0.method3079(-21);
				}
			} else {
				arg0.method3079(local10.anIntArray71[local92]);
			}
		}
		arg0.method3073(local85);
		local10.method7812();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!r;ZBI)Lclient!la;")
	public static Class117 method2589(@OriginalArg(0) Class43 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class197 local9 = Static88.method1976(arg1, arg2, arg0);
		return local9 == null ? null : local9.aClass117_2;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z")
	public static boolean method2590(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}

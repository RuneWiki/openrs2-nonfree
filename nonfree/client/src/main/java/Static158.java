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

public final class Static158 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	public static int anInt3271 = 0;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Lclient!df;")
	public static Class22 aClass22_1 = new Class22();

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!mi;")
	public static Class75 aClass75_17 = new Class75();

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1076 = Static186.method3527("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
	public static int[] anIntArray349 = new int[100];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!md;BI)V")
	public static void method2635(@OriginalArg(0) Class1_Sub17_Sub1 arg0) {
		while (true) {
			@Pc(14) Class1_Sub27 local14 = (Class1_Sub27) Static124.aClass75_12.method2239();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt4193; local21++) {
				if (local14.aClass116Array1[local21] != null) {
					if (local14.aClass116Array1[local21].anInt4156 == 2) {
						local14.anIntArray481[local21] = -5;
					}
					if (local14.aClass116Array1[local21].anInt4156 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass116Array2[local21] != null) {
					if (local14.aClass116Array2[local21].anInt4156 == 2) {
						local14.anIntArray481[local21] = -6;
					}
					if (local14.aClass116Array2[local21].anInt4156 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2182(162);
			arg0.method2175(0);
			@Pc(95) int local95 = arg0.anInt2656;
			arg0.method2124(local14.anInt4197);
			for (@Pc(102) int local102 = 0; local102 < local14.anInt4193; local102++) {
				if (local14.anIntArray481[local102] == 0) {
					try {
						@Pc(123) int local123 = local14.anIntArray479[local102];
						@Pc(132) Field local132;
						@Pc(136) int local136;
						if (local123 == 0) {
							local132 = (Field) local14.aClass116Array1[local102].anObject5;
							local136 = local132.getInt(null);
							arg0.method2175(0);
							arg0.method2124(local136);
						} else if (local123 == 1) {
							local132 = (Field) local14.aClass116Array1[local102].anObject5;
							local132.setInt(null, local14.anIntArray480[local102]);
							arg0.method2175(0);
						} else if (local123 == 2) {
							local132 = (Field) local14.aClass116Array1[local102].anObject5;
							local136 = local132.getModifiers();
							arg0.method2175(0);
							arg0.method2124(local136);
						}
						@Pc(207) Method local207;
						if (local123 == 3) {
							local207 = (Method) local14.aClass116Array2[local102].anObject5;
							@Pc(232) byte[][] local232 = local14.aByteArrayArrayArray12[local102];
							@Pc(236) Object[] local236 = new Object[local232.length];
							for (@Pc(238) int local238 = 0; local238 < local232.length; local238++) {
								@Pc(250) ObjectInputStream local250 = new ObjectInputStream(new ByteArrayInputStream(local232[local238]));
								local236[local238] = local250.readObject();
							}
							@Pc(269) Object local269 = local207.invoke(null, local236);
							if (local269 == null) {
								arg0.method2175(0);
							} else if (local269 instanceof Number) {
								arg0.method2175(1);
								arg0.method2171(((Number) local269).longValue());
							} else if (local269 instanceof Class50) {
								arg0.method2175(2);
								arg0.method2174((Class50) local269);
							} else {
								arg0.method2175(4);
							}
						} else if (local123 == 4) {
							local207 = (Method) local14.aClass116Array2[local102].anObject5;
							local136 = local207.getModifiers();
							arg0.method2175(0);
							arg0.method2124(local136);
						}
					} catch (@Pc(312) ClassNotFoundException local312) {
						arg0.method2175(-10);
					} catch (@Pc(320) InvalidClassException local320) {
						arg0.method2175(-11);
					} catch (@Pc(326) StreamCorruptedException local326) {
						arg0.method2175(-12);
					} catch (@Pc(332) OptionalDataException local332) {
						arg0.method2175(-13);
					} catch (@Pc(340) IllegalAccessException local340) {
						arg0.method2175(-14);
					} catch (@Pc(346) IllegalArgumentException local346) {
						arg0.method2175(-15);
					} catch (@Pc(352) InvocationTargetException local352) {
						arg0.method2175(-16);
					} catch (@Pc(358) SecurityException local358) {
						arg0.method2175(-17);
					} catch (@Pc(366) IOException local366) {
						arg0.method2175(-18);
					} catch (@Pc(372) NullPointerException local372) {
						arg0.method2175(-19);
					} catch (@Pc(378) Exception local378) {
						arg0.method2175(-20);
					} catch (@Pc(384) Throwable local384) {
						arg0.method2175(-21);
					}
				} else {
					arg0.method2175(local14.anIntArray481[local102]);
				}
			}
			arg0.method2145(local95);
			arg0.method2179(arg0.anInt2656 - local95);
			local14.method3525();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!rh;I)V")
	public static void method2636(@OriginalArg(0) Class78_Sub1 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static141.anIntArray428.length; local9++) {
			Static141.anIntArray428[local9] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static141.anIntArray428[local32] = (int) (Math.random() * 284.0D);
		}
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(63) int local63;
		for (local32 = 0; local32 < 20; local32++) {
			for (local51 = 1; local51 < 255; local51++) {
				for (local55 = 1; local55 < 127; local55++) {
					local63 = local55 + (local51 << 7);
					Static91.anIntArray463[local63] = (Static141.anIntArray428[local63 + 1] + Static141.anIntArray428[local63 - 1] + Static141.anIntArray428[local63 - 128] + Static141.anIntArray428[local63 - -128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static141.anIntArray428;
			Static141.anIntArray428 = Static91.anIntArray463;
			Static91.anIntArray463 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local51 = 0;
		for (local55 = 0; local55 < arg0.anInt3818; local55++) {
			for (local63 = 0; local63 < arg0.anInt3817; local63++) {
				if (arg0.aByteArray53[local51++] != 0) {
					@Pc(145) int local145 = arg0.anInt3809 + local55 + 16;
					@Pc(152) int local152 = local63 + arg0.anInt3813 + 16;
					@Pc(158) int local158 = local152 + (local145 << 7);
					Static141.anIntArray428[local158] = 0;
				}
			}
		}
	}
}

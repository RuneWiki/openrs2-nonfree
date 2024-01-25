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

public final class Static204 {

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
	public static int anInt3987;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "Lclient!oj;")
	public static Class243 aClass243_5;

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_104 = new Class363(23, 0);

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
	public static int anInt3988 = -60;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "[I")
	public static int[] anIntArray238 = new int[2];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ks;)V")
	public static void method3309(@OriginalArg(1) Class2_Sub15_Sub2 arg0) {
		@Pc(17) Class2_Sub48 local17 = (Class2_Sub48) Static96.aClass8_12.method210();
		if (local17 == null) {
			return;
		}
		@Pc(22) boolean local22 = false;
		for (@Pc(24) int local24 = 0; local24 < local17.anInt9286; local24++) {
			if (local17.aClass347Array1[local24] != null) {
				if (local17.aClass347Array1[local24].anInt9172 == 2) {
					local17.anIntArray670[local24] = -5;
				}
				if (local17.aClass347Array1[local24].anInt9172 == 0) {
					local22 = true;
				}
			}
			if (local17.aClass347Array2[local24] != null) {
				if (local17.aClass347Array2[local24].anInt9172 == 2) {
					local17.anIntArray670[local24] = -6;
				}
				if (local17.aClass347Array2[local24].anInt9172 == 0) {
					local22 = true;
				}
			}
		}
		if (local22) {
			return;
		}
		@Pc(93) int local93 = arg0.anInt5241;
		arg0.method4288(local17.anInt9285);
		for (@Pc(100) int local100 = 0; local100 < local17.anInt9286; local100++) {
			if (local17.anIntArray670[local100] == 0) {
				try {
					@Pc(124) int local124 = local17.anIntArray671[local100];
					@Pc(133) Field local133;
					@Pc(137) int local137;
					if (local124 == 0) {
						local133 = (Field) local17.aClass347Array1[local100].anObject49;
						local137 = local133.getInt(null);
						arg0.method4333(0);
						arg0.method4288(local137);
					} else if (local124 == 1) {
						local133 = (Field) local17.aClass347Array1[local100].anObject49;
						local133.setInt(null, local17.anIntArray672[local100]);
						arg0.method4333(0);
					} else if (local124 == 2) {
						local133 = (Field) local17.aClass347Array1[local100].anObject49;
						local137 = local133.getModifiers();
						arg0.method4333(0);
						arg0.method4288(local137);
					}
					@Pc(210) Method local210;
					if (local124 == 3) {
						local210 = (Method) local17.aClass347Array2[local100].anObject49;
						@Pc(237) byte[][] local237 = local17.aByteArrayArrayArray48[local100];
						@Pc(241) Object[] local241 = new Object[local237.length];
						for (@Pc(243) int local243 = 0; local243 < local237.length; local243++) {
							@Pc(255) ObjectInputStream local255 = new ObjectInputStream(new ByteArrayInputStream(local237[local243]));
							local241[local243] = local255.readObject();
						}
						@Pc(274) Object local274 = local210.invoke(null, local241);
						if (local274 == null) {
							arg0.method4333(0);
						} else if (local274 instanceof Number) {
							arg0.method4333(1);
							arg0.method4318(((Number) local274).longValue());
						} else if (local274 instanceof String) {
							arg0.method4333(2);
							arg0.method4313((String) local274);
						} else {
							arg0.method4333(4);
						}
					} else if (local124 == 4) {
						local210 = (Method) local17.aClass347Array2[local100].anObject49;
						local137 = local210.getModifiers();
						arg0.method4333(0);
						arg0.method4288(local137);
					}
				} catch (@Pc(319) ClassNotFoundException local319) {
					arg0.method4333(-10);
				} catch (@Pc(325) InvalidClassException local325) {
					arg0.method4333(-11);
				} catch (@Pc(331) StreamCorruptedException local331) {
					arg0.method4333(-12);
				} catch (@Pc(337) OptionalDataException local337) {
					arg0.method4333(-13);
				} catch (@Pc(343) IllegalAccessException local343) {
					arg0.method4333(-14);
				} catch (@Pc(349) IllegalArgumentException local349) {
					arg0.method4333(-15);
				} catch (@Pc(355) InvocationTargetException local355) {
					arg0.method4333(-16);
				} catch (@Pc(361) SecurityException local361) {
					arg0.method4333(-17);
				} catch (@Pc(367) IOException local367) {
					arg0.method4333(-18);
				} catch (@Pc(373) NullPointerException local373) {
					arg0.method4333(-19);
				} catch (@Pc(379) Exception local379) {
					arg0.method4333(-20);
				} catch (@Pc(385) Throwable local385) {
					arg0.method4333(-21);
				}
			} else {
				arg0.method4333(local17.anIntArray670[local100]);
			}
		}
		arg0.method4285(local93);
		local17.method7966();
	}
}

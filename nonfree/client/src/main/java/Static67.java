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

public final class Static67 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!cj;")
	public static final Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "Lclient!cj;")
	public static final Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Lclient!cj;")
	public static final Class56 aClass56_3 = new Class56();

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Lclient!cj;")
	public static final Class56 aClass56_4 = new Class56();

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Z")
	public static boolean aBoolean133 = true;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_7 = new Class364(1, 3);

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public static int anInt1837 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!oo;)V")
	public static void method1643(@OriginalArg(1) Class3_Sub26_Sub1 arg0) {
		@Pc(10) Class3_Sub47 local10 = (Class3_Sub47) Static431.aClass244_56.method5572();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt8339; local17++) {
			if (local10.aClass309Array1[local17] != null) {
				if (local10.aClass309Array1[local17].anInt8650 == 2) {
					local10.anIntArray491[local17] = -5;
				}
				if (local10.aClass309Array1[local17].anInt8650 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass309Array2[local17] != null) {
				if (local10.aClass309Array2[local17].anInt8650 == 2) {
					local10.anIntArray491[local17] = -6;
				}
				if (local10.aClass309Array2[local17].anInt8650 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(80) int local80 = arg0.anInt8703;
		arg0.method6826(local10.anInt8338);
		for (@Pc(87) int local87 = 0; local87 < local10.anInt8339; local87++) {
			if (local10.anIntArray491[local87] == 0) {
				try {
					@Pc(111) int local111 = local10.anIntArray490[local87];
					@Pc(126) Field local126;
					@Pc(156) int local156;
					if (local111 == 0) {
						local126 = (Field) local10.aClass309Array1[local87].anObject15;
						local156 = local126.getInt(null);
						arg0.method6809(0);
						arg0.method6826(local156);
					} else if (local111 == 1) {
						local126 = (Field) local10.aClass309Array1[local87].anObject15;
						local126.setInt(null, local10.anIntArray493[local87]);
						arg0.method6809(0);
					} else if (local111 == 2) {
						local126 = (Field) local10.aClass309Array1[local87].anObject15;
						local156 = local126.getModifiers();
						arg0.method6809(0);
						arg0.method6826(local156);
					}
					@Pc(200) Method local200;
					if (local111 == 3) {
						local200 = (Method) local10.aClass309Array2[local87].anObject15;
						@Pc(225) byte[][] local225 = local10.aByteArrayArrayArray18[local87];
						@Pc(229) Object[] local229 = new Object[local225.length];
						for (@Pc(231) int local231 = 0; local231 < local225.length; local231++) {
							@Pc(243) ObjectInputStream local243 = new ObjectInputStream(new ByteArrayInputStream(local225[local231]));
							local229[local231] = local243.readObject();
						}
						@Pc(262) Object local262 = local200.invoke(null, local229);
						if (local262 == null) {
							arg0.method6809(0);
						} else if (local262 instanceof Number) {
							arg0.method6809(1);
							arg0.method6782(((Number) local262).longValue());
						} else if (local262 instanceof String) {
							arg0.method6809(2);
							arg0.method6772((String) local262);
						} else {
							arg0.method6809(4);
						}
					} else if (local111 == 4) {
						local200 = (Method) local10.aClass309Array2[local87].anObject15;
						local156 = local200.getModifiers();
						arg0.method6809(0);
						arg0.method6826(local156);
					}
				} catch (@Pc(307) ClassNotFoundException local307) {
					arg0.method6809(-10);
				} catch (@Pc(313) InvalidClassException local313) {
					arg0.method6809(-11);
				} catch (@Pc(319) StreamCorruptedException local319) {
					arg0.method6809(-12);
				} catch (@Pc(325) OptionalDataException local325) {
					arg0.method6809(-13);
				} catch (@Pc(331) IllegalAccessException local331) {
					arg0.method6809(-14);
				} catch (@Pc(339) IllegalArgumentException local339) {
					arg0.method6809(-15);
				} catch (@Pc(345) InvocationTargetException local345) {
					arg0.method6809(-16);
				} catch (@Pc(351) SecurityException local351) {
					arg0.method6809(-17);
				} catch (@Pc(357) IOException local357) {
					arg0.method6809(-18);
				} catch (@Pc(365) NullPointerException local365) {
					arg0.method6809(-19);
				} catch (@Pc(371) Exception local371) {
					arg0.method6809(-20);
				} catch (@Pc(379) Throwable local379) {
					arg0.method6809(-21);
				}
			} else {
				arg0.method6809(local10.anIntArray491[local87]);
			}
		}
		arg0.method6815(local80);
		local10.method8128();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)I")
	public static int method1644(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static557.anInt6112 - 1; local3++) {
			if (arg0 < Static264.anIntArray238[local3] + Static396.anIntArray393[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static557.anInt6112 - 1;
		}
		return local1;
	}
}

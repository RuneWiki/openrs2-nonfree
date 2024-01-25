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

public final class Static339 {

	@OriginalMember(owner = "client!me", name = "J", descriptor = "I")
	public static int anInt6715;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "Lclient!wo;")
	public static final Class375 aClass375_6 = new Class375();

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!dfa;Z)V")
	public static void method5620(@OriginalArg(0) Class3_Sub15_Sub1 arg0) {
		@Pc(10) Class3_Sub52 local10 = (Class3_Sub52) Static614.aClass276_64.method6907();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt10553; local17++) {
			if (local10.aClass376Array1[local17] != null) {
				if (local10.aClass376Array1[local17].anInt10510 == 2) {
					local10.anIntArray633[local17] = -5;
				}
				if (local10.aClass376Array1[local17].anInt10510 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass376Array2[local17] != null) {
				if (local10.aClass376Array2[local17].anInt10510 == 2) {
					local10.anIntArray633[local17] = -6;
				}
				if (local10.aClass376Array2[local17].anInt10510 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(83) int local83 = arg0.anInt10282;
		arg0.method8419(local10.anInt10551);
		for (@Pc(90) int local90 = 0; local90 < local10.anInt10553; local90++) {
			if (local10.anIntArray633[local90] == 0) {
				try {
					@Pc(111) int local111 = local10.anIntArray634[local90];
					@Pc(126) Field local126;
					@Pc(154) int local154;
					if (local111 == 0) {
						local126 = (Field) local10.aClass376Array1[local90].anObject19;
						local154 = local126.getInt(null);
						arg0.method8448(0);
						arg0.method8419(local154);
					} else if (local111 == 1) {
						local126 = (Field) local10.aClass376Array1[local90].anObject19;
						local126.setInt(null, local10.anIntArray632[local90]);
						arg0.method8448(0);
					} else if (local111 == 2) {
						local126 = (Field) local10.aClass376Array1[local90].anObject19;
						local154 = local126.getModifiers();
						arg0.method8448(0);
						arg0.method8419(local154);
					}
					@Pc(193) Method local193;
					if (local111 == 3) {
						local193 = (Method) local10.aClass376Array2[local90].anObject19;
						@Pc(198) byte[][] local198 = local10.aByteArrayArrayArray19[local90];
						@Pc(202) Object[] local202 = new Object[local198.length];
						for (@Pc(204) int local204 = 0; local204 < local198.length; local204++) {
							@Pc(216) ObjectInputStream local216 = new ObjectInputStream(new ByteArrayInputStream(local198[local204]));
							local202[local204] = local216.readObject();
						}
						@Pc(231) Object local231 = local193.invoke(null, local202);
						if (local231 == null) {
							arg0.method8448(0);
						} else if (local231 instanceof Number) {
							arg0.method8448(1);
							arg0.method8411(((Number) local231).longValue());
						} else if (local231 instanceof String) {
							arg0.method8448(2);
							arg0.method8417((String) local231);
						} else {
							arg0.method8448(4);
						}
					} else if (local111 == 4) {
						local193 = (Method) local10.aClass376Array2[local90].anObject19;
						local154 = local193.getModifiers();
						arg0.method8448(0);
						arg0.method8419(local154);
					}
				} catch (@Pc(297) ClassNotFoundException local297) {
					arg0.method8448(-10);
				} catch (@Pc(303) InvalidClassException local303) {
					arg0.method8448(-11);
				} catch (@Pc(309) StreamCorruptedException local309) {
					arg0.method8448(-12);
				} catch (@Pc(315) OptionalDataException local315) {
					arg0.method8448(-13);
				} catch (@Pc(321) IllegalAccessException local321) {
					arg0.method8448(-14);
				} catch (@Pc(327) IllegalArgumentException local327) {
					arg0.method8448(-15);
				} catch (@Pc(333) InvocationTargetException local333) {
					arg0.method8448(-16);
				} catch (@Pc(339) SecurityException local339) {
					arg0.method8448(-17);
				} catch (@Pc(345) IOException local345) {
					arg0.method8448(-18);
				} catch (@Pc(351) NullPointerException local351) {
					arg0.method8448(-19);
				} catch (@Pc(357) Exception local357) {
					arg0.method8448(-20);
				} catch (@Pc(363) Throwable local363) {
					arg0.method8448(-21);
				}
			} else {
				arg0.method8448(local10.anIntArray633[local90]);
			}
		}
		arg0.method8457(local83);
		local10.method8671();
	}
}

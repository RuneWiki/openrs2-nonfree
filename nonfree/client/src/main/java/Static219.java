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

public final class Static219 {

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	public static int anInt4600;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1563 = Static64.method1101("K");

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1564 = aClass51_1563;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1565 = Static64.method1101(":tradereq:");

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1566 = Static64.method1101("<col=ff7000>");

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "S")
	public static short aShort31 = 256;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1567 = aClass51_1563;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
	public static void method3609(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class1_Sub15 local14 = (Class1_Sub15) Static73.aClass102_9.method3086(); local14 != null; local14 = (Class1_Sub15) Static73.aClass102_9.method3087()) {
			if ((local14.aLong170 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method3758();
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!wi;I)V")
	public static void method3610(@OriginalArg(1) Class1_Sub16_Sub1 arg0) {
		while (true) {
			@Pc(14) Class1_Sub25 local14 = (Class1_Sub25) Static102.aClass105_12.method3120();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt4681; local21++) {
				if (local14.aClass38Array1[local21] != null) {
					if (local14.aClass38Array1[local21].anInt1236 == 2) {
						local14.anIntArray374[local21] = -5;
					}
					if (local14.aClass38Array1[local21].anInt1236 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass38Array2[local21] != null) {
					if (local14.aClass38Array2[local21].anInt1236 == 2) {
						local14.anIntArray374[local21] = -6;
					}
					if (local14.aClass38Array2[local21].anInt1236 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method3823(236);
			arg0.method3765(0);
			@Pc(92) int local92 = arg0.anInt4860;
			arg0.method3808(local14.anInt4682);
			for (@Pc(99) int local99 = 0; local99 < local14.anInt4681; local99++) {
				if (local14.anIntArray374[local99] == 0) {
					try {
						@Pc(122) int local122 = local14.anIntArray371[local99];
						@Pc(134) Field local134;
						@Pc(138) int local138;
						if (local122 == 0) {
							local134 = (Field) local14.aClass38Array1[local99].anObject3;
							local138 = local134.getInt(null);
							arg0.method3765(0);
							arg0.method3808(local138);
						} else if (local122 == 1) {
							local134 = (Field) local14.aClass38Array1[local99].anObject3;
							local134.setInt(null, local14.anIntArray370[local99]);
							arg0.method3765(0);
						} else if (local122 == 2) {
							local134 = (Field) local14.aClass38Array1[local99].anObject3;
							local138 = local134.getModifiers();
							arg0.method3765(0);
							arg0.method3808(local138);
						}
						@Pc(211) Method local211;
						if (local122 == 3) {
							local211 = (Method) local14.aClass38Array2[local99].anObject3;
							@Pc(236) byte[][] local236 = local14.aByteArrayArrayArray14[local99];
							@Pc(240) Object[] local240 = new Object[local236.length];
							for (@Pc(242) int local242 = 0; local242 < local236.length; local242++) {
								@Pc(254) ObjectInputStream local254 = new ObjectInputStream(new ByteArrayInputStream(local236[local242]));
								local240[local242] = local254.readObject();
							}
							@Pc(269) Object local269 = local211.invoke(null, local240);
							if (local269 == null) {
								arg0.method3765(0);
							} else if (local269 instanceof Number) {
								arg0.method3765(1);
								arg0.method3786(((Number) local269).longValue());
							} else if (local269 instanceof Class51) {
								arg0.method3765(2);
								arg0.method3810((Class51) local269);
							} else {
								arg0.method3765(4);
							}
						} else if (local122 == 4) {
							local211 = (Method) local14.aClass38Array2[local99].anObject3;
							local138 = local211.getModifiers();
							arg0.method3765(0);
							arg0.method3808(local138);
						}
					} catch (@Pc(312) ClassNotFoundException local312) {
						arg0.method3765(-10);
					} catch (@Pc(320) InvalidClassException local320) {
						arg0.method3765(-11);
					} catch (@Pc(326) StreamCorruptedException local326) {
						arg0.method3765(-12);
					} catch (@Pc(332) OptionalDataException local332) {
						arg0.method3765(-13);
					} catch (@Pc(338) IllegalAccessException local338) {
						arg0.method3765(-14);
					} catch (@Pc(344) IllegalArgumentException local344) {
						arg0.method3765(-15);
					} catch (@Pc(350) InvocationTargetException local350) {
						arg0.method3765(-16);
					} catch (@Pc(356) SecurityException local356) {
						arg0.method3765(-17);
					} catch (@Pc(364) IOException local364) {
						arg0.method3765(-18);
					} catch (@Pc(372) NullPointerException local372) {
						arg0.method3765(-19);
					} catch (@Pc(378) Exception local378) {
						arg0.method3765(-20);
					} catch (@Pc(384) Throwable local384) {
						arg0.method3765(-21);
					}
				} else {
					arg0.method3765(local14.anIntArray374[local99]);
				}
			}
			arg0.method3782(local92);
			arg0.method3816(arg0.anInt4860 - local92);
			local14.method3758();
		}
	}
}

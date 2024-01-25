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

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!ak;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString3 = "Connecting to update server";

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method44() {
		if (Static289.aClass81_7.method2951()) {
			Static16.method280();
			Static289.aClass81_7.method3006(Static354.aCanvas5);
			Static205.method5709();
		} else {
			Static334.method5541(Static13.anInt232);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method45(@OriginalArg(1) String arg0) {
		if (Static233.aClass183Array1 != null) {
			Static131.aClass6_Sub10_Sub1_2.method2886(84);
			Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(arg0));
			Static131.aClass6_Sub10_Sub1_2.method3966(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!dp;B)V")
	public static void method47(@OriginalArg(0) Class53 arg0) {
		Static119.aClass53_67 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!jh;)V")
	public static void method48(@OriginalArg(2) Class6_Sub10_Sub1 arg0) {
		while (true) {
			@Pc(14) Class6_Sub7 local14 = (Class6_Sub7) Static260.aClass211_29.method5594();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt967; local21++) {
				if (local14.aClass196Array1[local21] != null) {
					if (local14.aClass196Array1[local21].anInt5851 == 2) {
						local14.anIntArray105[local21] = -5;
					}
					if (local14.aClass196Array1[local21].anInt5851 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass196Array2[local21] != null) {
					if (local14.aClass196Array2[local21].anInt5851 == 2) {
						local14.anIntArray105[local21] = -6;
					}
					if (local14.aClass196Array2[local21].anInt5851 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2886(230);
			arg0.method3968(0);
			@Pc(106) int local106 = arg0.anInt4188;
			arg0.method3976(local14.anInt965);
			for (@Pc(113) int local113 = 0; local113 < local14.anInt967; local113++) {
				if (local14.anIntArray105[local113] == 0) {
					try {
						@Pc(134) int local134 = local14.anIntArray106[local113];
						@Pc(146) Field local146;
						@Pc(174) int local174;
						if (local134 == 0) {
							local146 = (Field) local14.aClass196Array1[local113].anObject8;
							local174 = local146.getInt(null);
							arg0.method3968(0);
							arg0.method3976(local174);
						} else if (local134 == 1) {
							local146 = (Field) local14.aClass196Array1[local113].anObject8;
							local146.setInt(null, local14.anIntArray104[local113]);
							arg0.method3968(0);
						} else if (local134 == 2) {
							local146 = (Field) local14.aClass196Array1[local113].anObject8;
							local174 = local146.getModifiers();
							arg0.method3968(0);
							arg0.method3976(local174);
						}
						@Pc(220) Method local220;
						if (local134 == 3) {
							local220 = (Method) local14.aClass196Array2[local113].anObject8;
							@Pc(245) byte[][] local245 = local14.aByteArrayArrayArray3[local113];
							@Pc(249) Object[] local249 = new Object[local245.length];
							for (@Pc(251) int local251 = 0; local251 < local245.length; local251++) {
								@Pc(263) ObjectInputStream local263 = new ObjectInputStream(new ByteArrayInputStream(local245[local251]));
								local249[local251] = local263.readObject();
							}
							@Pc(278) Object local278 = local220.invoke(null, local249);
							if (local278 == null) {
								arg0.method3968(0);
							} else if (local278 instanceof Number) {
								arg0.method3968(1);
								arg0.method3970(((Number) local278).longValue());
							} else if (local278 instanceof String) {
								arg0.method3968(2);
								arg0.method3966((String) local278);
							} else {
								arg0.method3968(4);
							}
						} else if (local134 == 4) {
							local220 = (Method) local14.aClass196Array2[local113].anObject8;
							local174 = local220.getModifiers();
							arg0.method3968(0);
							arg0.method3976(local174);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method3968(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method3968(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method3968(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method3968(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method3968(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg0.method3968(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg0.method3968(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg0.method3968(-17);
					} catch (@Pc(369) IOException local369) {
						arg0.method3968(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg0.method3968(-19);
					} catch (@Pc(381) Exception local381) {
						arg0.method3968(-20);
					} catch (@Pc(387) Throwable local387) {
						arg0.method3968(-21);
					}
				} else {
					arg0.method3968(local14.anIntArray105[local113]);
				}
			}
			arg0.method3973(local106);
			arg0.method3988(arg0.anInt4188 - local106);
			local14.method5756();
		}
	}
}

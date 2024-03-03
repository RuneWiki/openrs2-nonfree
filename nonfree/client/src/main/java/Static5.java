import java.awt.Frame;
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

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!cc;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public static int anInt105;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILclient!ml;II)Ljava/awt/Frame;", line = 203)
	public static Frame method85(@OriginalArg(0) int arg0, @OriginalArg(3) Class152 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method3766()) {
			return null;
		}
		@Pc(24) Class169[] local24 = Static103.method2267(arg1);
		if (local24 == null) {
			return null;
		}
		@Pc(30) boolean local30 = false;
		for (@Pc(32) int local32 = 0; local32 < local24.length; local32++) {
			if (local24[local32].anInt4676 == arg2 && local24[local32].anInt4675 == arg0 && (!local30 || arg3 < local24[local32].anInt4678)) {
				arg3 = local24[local32].anInt4678;
				local30 = true;
			}
		}
		if (!local30) {
			return null;
		}
		@Pc(98) Class32 local98 = arg1.method3750(arg2, arg0, arg3);
		while (local98.anInt992 == 0) {
			Static214.method4024(10L);
		}
		@Pc(110) Frame local110 = (Frame) local98.anObject2;
		if (local110 == null) {
			return null;
		} else if (local98.anInt992 == 2) {
			Static17.method4216(local110, arg1);
			return null;
		} else {
			return local110;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(DI)V", line = 276)
	public static void method86(@OriginalArg(0) double arg0) {
		if (Class78_Sub1.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Class2_Sub2_Sub7.anIntArray145[local7] = local19 > 255 ? 255 : local19;
		}
		Class78_Sub1.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!qg;I)V", line = 328)
	public static void method88(@OriginalArg(1) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(16) Class2_Sub42 local16 = (Class2_Sub42) Class223.aClass135_37.method3552();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.anInt7141; local23++) {
				if (local16.aClass32Array1[local23] != null) {
					if (local16.aClass32Array1[local23].anInt992 == 2) {
						local16.anIntArray491[local23] = -5;
					}
					if (local16.aClass32Array1[local23].anInt992 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass32Array2[local23] != null) {
					if (local16.aClass32Array2[local23].anInt992 == 2) {
						local16.anIntArray491[local23] = -6;
					}
					if (local16.aClass32Array2[local23].anInt992 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method4868(arg1);
			arg0.method4843(0);
			@Pc(106) int local106 = arg0.anInt5289;
			arg0.method4814(local16.anInt7143);
			for (@Pc(113) int local113 = 0; local113 < local16.anInt7141; local113++) {
				if (local16.anIntArray491[local113] == 0) {
					try {
						@Pc(137) int local137 = local16.anIntArray493[local113];
						@Pc(146) Field local146;
						@Pc(150) int local150;
						if (local137 == 0) {
							local146 = (Field) local16.aClass32Array1[local113].anObject2;
							local150 = local146.getInt(null);
							arg0.method4843(0);
							arg0.method4814(local150);
						} else if (local137 == 1) {
							local146 = (Field) local16.aClass32Array1[local113].anObject2;
							local146.setInt(null, local16.anIntArray492[local113]);
							arg0.method4843(0);
						} else if (local137 == 2) {
							local146 = (Field) local16.aClass32Array1[local113].anObject2;
							local150 = local146.getModifiers();
							arg0.method4843(0);
							arg0.method4814(local150);
						}
						@Pc(218) Method local218;
						if (local137 == 3) {
							local218 = (Method) local16.aClass32Array2[local113].anObject2;
							@Pc(223) byte[][] local223 = local16.aByteArrayArrayArray17[local113];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(260) Object local260 = local218.invoke(null, local227);
							if (local260 == null) {
								arg0.method4843(0);
							} else if (local260 instanceof Number) {
								arg0.method4843(1);
								arg0.method4833(((Number) local260).longValue());
							} else if (local260 instanceof String) {
								arg0.method4843(2);
								arg0.method4823((String) local260);
							} else {
								arg0.method4843(4);
							}
						} else if (local137 == 4) {
							local218 = (Method) local16.aClass32Array2[local113].anObject2;
							local150 = local218.getModifiers();
							arg0.method4843(0);
							arg0.method4814(local150);
						}
					} catch (@Pc(328) ClassNotFoundException local328) {
						arg0.method4843(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg0.method4843(-11);
					} catch (@Pc(340) StreamCorruptedException local340) {
						arg0.method4843(-12);
					} catch (@Pc(348) OptionalDataException local348) {
						arg0.method4843(-13);
					} catch (@Pc(354) IllegalAccessException local354) {
						arg0.method4843(-14);
					} catch (@Pc(362) IllegalArgumentException local362) {
						arg0.method4843(-15);
					} catch (@Pc(368) InvocationTargetException local368) {
						arg0.method4843(-16);
					} catch (@Pc(374) SecurityException local374) {
						arg0.method4843(-17);
					} catch (@Pc(380) IOException local380) {
						arg0.method4843(-18);
					} catch (@Pc(386) NullPointerException local386) {
						arg0.method4843(-19);
					} catch (@Pc(392) Exception local392) {
						arg0.method4843(-20);
					} catch (@Pc(398) Throwable local398) {
						arg0.method4843(-21);
					}
				} else {
					arg0.method4843(local16.anIntArray491[local113]);
				}
			}
			arg0.method4803(local106);
			arg0.method4862(arg0.anInt5289 - local106);
			local16.method6469();
		}
	}
}

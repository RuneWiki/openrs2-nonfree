import java.awt.Component;
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

public final class Static59 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!kb;")
	public static Class41 aClass41_8;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!bd;")
	public static Class7 aClass7_6 = new Class7(32);

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!af;")
	private static Class5 aClass5_724 = Static45.method1937("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_725 = Static45.method1937(" )2> ");

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt1397 = 0;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_726 = aClass5_724;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!af;")
	private static Class5 aClass5_733 = Static45.method1937("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_727 = aClass5_733;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!af;")
	private static Class5 aClass5_731 = Static45.method1937("as it was used to break our rules)3");

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_728 = aClass5_731;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!af;")
	private static Class5 aClass5_729 = Static45.method1937("Loading)3)3)3");

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	public static int anInt1402 = 0;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_730 = aClass5_729;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Lclient!af;")
	public static Class5 aClass5_732 = Static45.method1937(" weitere Optionen");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!af;Lclient!kb;Lclient!af;I)Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 method1058(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class5 arg2) {
		@Pc(15) int local15 = arg1.method1724(arg0);
		@Pc(23) int local23 = arg1.method1698(arg2, local15);
		return Static51.method898(local23, arg1, local15);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ua;II)V")
	public static void method1059(@OriginalArg(0) Class1_Sub20_Sub1 arg0) {
		while (true) {
			@Pc(14) Class1_Sub10 local14 = (Class1_Sub10) Static104.aClass53_12.method1442();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt1388; local21++) {
				if (local14.aClass51Array2[local21] != null) {
					if (local14.aClass51Array2[local21].anInt1880 == 2) {
						local14.anIntArray228[local21] = -5;
					}
					if (local14.aClass51Array2[local21].anInt1880 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass51Array1[local21] != null) {
					if (local14.aClass51Array1[local21].anInt1880 == 2) {
						local14.anIntArray228[local21] = -6;
					}
					if (local14.aClass51Array1[local21].anInt1880 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2108(44);
			arg0.method2081(0);
			@Pc(106) int local106 = arg0.anInt2951;
			arg0.method2092(local14.anInt1391);
			for (@Pc(113) int local113 = 0; local113 < local14.anInt1388; local113++) {
				if (local14.anIntArray228[local113] == 0) {
					try {
						@Pc(137) int local137 = local14.anIntArray227[local113];
						@Pc(157) Field local157;
						@Pc(160) int local160;
						if (local137 == 0) {
							local157 = (Field) local14.aClass51Array2[local113].anObject2;
							local160 = local157.getInt(null);
							arg0.method2081(0);
							arg0.method2092(local160);
						} else if (local137 == 1) {
							local157 = (Field) local14.aClass51Array2[local113].anObject2;
							local157.setInt(null, local14.anIntArray226[local113]);
							arg0.method2081(0);
						} else if (local137 == 2) {
							local157 = (Field) local14.aClass51Array2[local113].anObject2;
							local160 = local157.getModifiers();
							arg0.method2081(0);
							arg0.method2092(local160);
						}
						@Pc(224) Method local224;
						if (local137 == 3) {
							local224 = (Method) local14.aClass51Array1[local113].anObject2;
							@Pc(249) byte[][] local249 = local14.aByteArrayArrayArray3[local113];
							@Pc(253) Object[] local253 = new Object[local249.length];
							for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
								@Pc(267) ObjectInputStream local267 = new ObjectInputStream(new ByteArrayInputStream(local249[local255]));
								local253[local255] = local267.readObject();
							}
							@Pc(286) Object local286 = local224.invoke(null, local253);
							if (local286 == null) {
								arg0.method2081(0);
							} else if (local286 instanceof Number) {
								arg0.method2081(1);
								arg0.method2078(((Number) local286).longValue());
							} else if (local286 instanceof Class5) {
								arg0.method2081(2);
								arg0.method2054((Class5) local286);
							} else {
								arg0.method2081(4);
							}
						} else if (local137 == 4) {
							local224 = (Method) local14.aClass51Array1[local113].anObject2;
							local160 = local224.getModifiers();
							arg0.method2081(0);
							arg0.method2092(local160);
						}
					} catch (@Pc(329) ClassNotFoundException local329) {
						arg0.method2081(-10);
					} catch (@Pc(335) InvalidClassException local335) {
						arg0.method2081(-11);
					} catch (@Pc(341) StreamCorruptedException local341) {
						arg0.method2081(-12);
					} catch (@Pc(347) OptionalDataException local347) {
						arg0.method2081(-13);
					} catch (@Pc(353) IllegalAccessException local353) {
						arg0.method2081(-14);
					} catch (@Pc(359) IllegalArgumentException local359) {
						arg0.method2081(-15);
					} catch (@Pc(365) InvocationTargetException local365) {
						arg0.method2081(-16);
					} catch (@Pc(371) SecurityException local371) {
						arg0.method2081(-17);
					} catch (@Pc(377) IOException local377) {
						arg0.method2081(-18);
					} catch (@Pc(383) NullPointerException local383) {
						arg0.method2081(-19);
					} catch (@Pc(389) Exception local389) {
						arg0.method2081(-20);
					} catch (@Pc(395) Throwable local395) {
						arg0.method2081(-21);
					}
				} else {
					arg0.method2081(local14.anIntArray228[local113]);
				}
			}
			arg0.method2097(local106);
			arg0.method2098(arg0.anInt2951 - local106);
			local14.method2220();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([Lclient!af;III)Lclient!af;")
	public static Class5 method1060(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[local9 + arg2] == null) {
				arg0[local9 + arg2] = Static26.aClass5_371;
			}
			local7 += arg0[local9 + arg2].anInt178;
		}
		@Pc(42) int local42 = 0;
		@Pc(45) byte[] local45 = new byte[local7];
		@Pc(63) Class5 local63;
		for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
			local63 = arg0[local55 + arg2];
			Static138.method1878(local63.aByteArray2, 0, local45, local42, local63.anInt178);
			local42 += local63.anInt178;
		}
		local63 = new Class5();
		local63.anInt178 = local7;
		local63.aByteArray2 = local45;
		return local63;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I")
	public static int method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILclient!nb;)V")
	public static void method1062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub4_Sub2_Sub1 arg2) {
		@Pc(9) int local9;
		if ((arg1 & 0x80) != 0) {
			local9 = Static79.aClass1_Sub20_Sub1_2.method2106();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(17) Class1_Sub20 local17 = new Class1_Sub20(local12);
			Static79.aClass1_Sub20_Sub1_2.method2076(local12, local9);
			Static97.aClass1_Sub20Array1[arg0] = local17;
			arg2.method1410(local17);
		}
		@Pc(46) int local46;
		if ((arg1 & 0x10) != 0) {
			local9 = Static79.aClass1_Sub20_Sub1_2.method2053();
			local46 = Static79.aClass1_Sub20_Sub1_2.method2084();
			arg2.method2157(Static131.anInt3270, local46, local9);
			arg2.anInt3058 = Static131.anInt3270 + 300;
			arg2.anInt3082 = Static79.aClass1_Sub20_Sub1_2.method2106();
			arg2.anInt3057 = Static79.aClass1_Sub20_Sub1_2.method2084();
		}
		if ((arg1 & 0x200) != 0) {
			arg2.anInt3059 = Static79.aClass1_Sub20_Sub1_2.method2087();
			local9 = Static79.aClass1_Sub20_Sub1_2.method2067();
			arg2.anInt3042 = local9 >> 16;
			if (arg2.anInt3059 == 65535) {
				arg2.anInt3059 = -1;
			}
			arg2.anInt3067 = 0;
			arg2.anInt3065 = 0;
			arg2.anInt3085 = (local9 & 0xFFFF) + Static131.anInt3270;
			if (Static131.anInt3270 < arg2.anInt3085) {
				arg2.anInt3065 = -1;
			}
		}
		if ((arg1 & 0x20) != 0) {
			arg2.anInt3038 = Static79.aClass1_Sub20_Sub1_2.method2069();
			arg2.anInt3081 = Static79.aClass1_Sub20_Sub1_2.method2091();
		}
		if ((arg1 & 0x1) != 0) {
			local9 = Static79.aClass1_Sub20_Sub1_2.method2100();
			local46 = Static79.aClass1_Sub20_Sub1_2.method2084();
			@Pc(161) int local161 = Static79.aClass1_Sub20_Sub1_2.method2084();
			@Pc(164) int local164 = Static79.aClass1_Sub20_Sub1_2.anInt2951;
			if (arg2.aClass5_985 != null && arg2.aClass74_1 != null) {
				@Pc(177) long local177 = arg2.aClass5_985.method193();
				@Pc(179) boolean local179 = false;
				if (local46 <= 1) {
					for (@Pc(184) int local184 = 0; local184 < Static92.anInt2321; local184++) {
						if (local177 == Static38.aLongArray1[local184]) {
							local179 = true;
							break;
						}
					}
				}
				if (!local179 && Static41.anInt1059 == 0) {
					Static48.aClass1_Sub20_2.anInt2951 = 0;
					Static79.aClass1_Sub20_Sub1_2.method2076(Static48.aClass1_Sub20_2.aByteArray36, local161);
					Static48.aClass1_Sub20_2.anInt2951 = 0;
					@Pc(235) Class5 local235 = Static4.method163(Static87.method2228(Static48.aClass1_Sub20_2).method213());
					arg2.aClass5_1372 = local235.method194();
					arg2.anInt3091 = local9 >> 8;
					arg2.anInt3045 = local9 & 0xFF;
					arg2.anInt3076 = 150;
					if (local46 == 2 || local46 == 3) {
						Static50.method893(local235, 1, Static100.method1696(new Class5[] { Static80.aClass5_992, arg2.aClass5_985 }));
					} else if (local46 == 1) {
						Static50.method893(local235, 1, Static100.method1696(new Class5[] { Static91.aClass5_1094, arg2.aClass5_985 }));
					} else {
						Static50.method893(local235, 2, arg2.aClass5_985);
					}
				}
			}
			Static79.aClass1_Sub20_Sub1_2.anInt2951 = local161 + local164;
		}
		if ((arg1 & 0x4) != 0) {
			local9 = Static79.aClass1_Sub20_Sub1_2.method2087();
			if (local9 == 65535) {
				local9 = -1;
			}
			local46 = Static79.aClass1_Sub20_Sub1_2.method2053();
			Static85.method1502(arg2, local46, local9);
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt3039 = Static79.aClass1_Sub20_Sub1_2.method2087();
			if (arg2.anInt3039 == 65535) {
				arg2.anInt3039 = -1;
			}
		}
		if ((arg1 & 0x100) != 0) {
			arg2.anInt3071 = Static79.aClass1_Sub20_Sub1_2.method2106();
			arg2.anInt3090 = Static79.aClass1_Sub20_Sub1_2.method2070();
			arg2.anInt3052 = Static79.aClass1_Sub20_Sub1_2.method2084();
			arg2.anInt3040 = Static79.aClass1_Sub20_Sub1_2.method2070();
			arg2.anInt3072 = Static79.aClass1_Sub20_Sub1_2.method2100() + Static131.anInt3270;
			arg2.anInt3074 = Static79.aClass1_Sub20_Sub1_2.method2100() + Static131.anInt3270;
			arg2.anInt3069 = Static79.aClass1_Sub20_Sub1_2.method2106();
			arg2.anInt3047 = 1;
			arg2.anInt3061 = 0;
		}
		if ((arg1 & 0x400) != 0) {
			local9 = Static79.aClass1_Sub20_Sub1_2.method2053();
			local46 = Static79.aClass1_Sub20_Sub1_2.method2053();
			arg2.method2157(Static131.anInt3270, local46, local9);
			arg2.anInt3058 = Static131.anInt3270 + 300;
			arg2.anInt3082 = Static79.aClass1_Sub20_Sub1_2.method2084();
			arg2.anInt3057 = Static79.aClass1_Sub20_Sub1_2.method2070();
		}
		if ((arg1 & 0x8) == 0) {
			return;
		}
		arg2.aClass5_1372 = Static79.aClass1_Sub20_Sub1_2.method2101();
		if (arg2.aClass5_1372.method202(0) == 126) {
			arg2.aClass5_1372 = arg2.aClass5_1372.method184(1);
			Static50.method893(arg2.aClass5_1372, 2, arg2.aClass5_985);
		} else if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1 == arg2) {
			Static50.method893(arg2.aClass5_1372, 2, arg2.aClass5_985);
		}
		arg2.anInt3076 = 150;
		arg2.anInt3045 = 0;
		arg2.anInt3091 = 0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method1063() {
		aClass5_733 = null;
		aClass5_729 = null;
		aClass5_727 = null;
		aClass5_728 = null;
		aClass7_6 = null;
		aClass5_731 = null;
		aClass41_8 = null;
		aClass5_725 = null;
		aClass5_724 = null;
		aClass5_732 = null;
		aClass5_726 = null;
		aClass5_730 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1064() {
		Static107.aBoolean103 = false;
		Static79.aBoolean64 = false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1065(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static93.aClass18_1);
		arg0.removeMouseMotionListener(Static93.aClass18_1);
		arg0.removeFocusListener(Static93.aClass18_1);
		Static19.anInt648 = 0;
	}
}

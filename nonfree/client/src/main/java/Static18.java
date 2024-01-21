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

public final class Static18 {

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!oc;")
	public static Class56 aClass56_17;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_2;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!uc;")
	public static Class77 aClass77_3;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!ve;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	public static int anInt522 = 0;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_238 = Static78.method1313("Verbindung mit");

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	public static int anInt523 = 0;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!fc;")
	public static Class25 aClass25_239 = Static78.method1313("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!fc;")
	private static Class25 aClass25_240 = Static78.method1313("yellow:");

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_241 = aClass25_240;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_242 = Static78.method1313("Menge eingeben:");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_243 = Static78.method1313("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_244 = aClass25_240;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt541 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ob;Lclient!ob;)Lclient!ob;")
	public static Class1_Sub2_Sub14 method424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub14 arg2, @OriginalArg(4) Class1_Sub2_Sub14 arg3) {
		@Pc(27) Class1_Sub2_Sub14 local27 = Static47.method972(arg1, arg2.anInt1923, arg2.anInt1949, 0, arg2.anInt1957, arg2.anInt1911, Static56.aClass1_Sub2_Sub14ArrayArray1[arg2.anInt1937 >> 16], 0, arg2.anInt1937, arg0, arg3);
		if (local27 == null) {
			if (arg2.aClass1_Sub2_Sub14Array2 != null) {
				local27 = Static47.method972(arg1, arg2.anInt1923, arg2.anInt1949, 0, arg2.anInt1957, arg2.anInt1911, arg2.aClass1_Sub2_Sub14Array2, 0, arg2.anInt1937, arg0, arg3);
			}
			return local27;
		} else {
			return local27;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ac;[Lclient!od;[B)V")
	public static void method425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) Class62[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(6) Class1_Sub5 local6 = new Class1_Sub5(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local6.method674();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local6.method674();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(44) int local44 = local24 >> 12;
				@Pc(50) int local50 = local24 >> 6 & 0x3F;
				@Pc(54) int local54 = local6.method672();
				@Pc(58) int local58 = local54 >> 2;
				@Pc(62) int local62 = local54 & 0x3;
				@Pc(66) int local66 = local50 + arg0;
				@Pc(70) int local70 = local40 + arg1;
				if (local66 > 0 && local70 > 0 && local66 < 103 && local70 < 103) {
					@Pc(87) Class62 local87 = null;
					@Pc(89) int local89 = local44;
					if ((Static116.aByteArrayArrayArray7[1][local66][local70] & 0x2) == 2) {
						local89 = local44 - 1;
					}
					if (local89 >= 0) {
						local87 = arg3[local89];
					}
					Static81.method1377(local70, local58, local66, local62, local44, local87, arg2, local12);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!q;I)V")
	public static void method429(@OriginalArg(0) Class1_Sub2_Sub3_Sub4 arg0) {
		arg0.anInt2795 = arg0.anInt2835;
		if (arg0.anInt2839 == 0) {
			arg0.anInt2798 = 0;
			return;
		}
		if (arg0.anInt2810 != -1 && arg0.anInt2829 == 0) {
			@Pc(31) Class1_Sub2_Sub17 local31 = Static34.method755(arg0.anInt2810);
			if (arg0.anInt2806 > 0 && local31.anInt2354 == 0) {
				arg0.anInt2798++;
				return;
			}
			if (arg0.anInt2806 <= 0 && local31.anInt2358 == 0) {
				arg0.anInt2798++;
				return;
			}
		}
		@Pc(75) int local75 = arg0.anInt2834 * 64 + arg0.anIntArray484[arg0.anInt2839 - 1] * 128;
		@Pc(78) int local78 = arg0.anInt2832;
		@Pc(81) int local81 = arg0.anInt2827;
		@Pc(96) int local96 = arg0.anIntArray485[arg0.anInt2839 - 1] * 128 + arg0.anInt2834 * 64;
		if (local75 - local78 > 256 || local75 - local78 < -256 || local96 - local81 > 256 || local96 - local81 < -256) {
			arg0.anInt2832 = local75;
			arg0.anInt2827 = local96;
			return;
		}
		if (local78 >= local75) {
			if (local78 <= local75) {
				if (local96 > local81) {
					arg0.anInt2809 = 1024;
				} else if (local96 < local81) {
					arg0.anInt2809 = 0;
				}
			} else if (local81 < local96) {
				arg0.anInt2809 = 768;
			} else if (local81 > local96) {
				arg0.anInt2809 = 256;
			} else {
				arg0.anInt2809 = 512;
			}
		} else if (local96 > local81) {
			arg0.anInt2809 = 1280;
		} else if (local96 < local81) {
			arg0.anInt2809 = 1792;
		} else {
			arg0.anInt2809 = 1536;
		}
		@Pc(219) int local219 = arg0.anInt2809 - arg0.anInt2819 & 0x7FF;
		if (local219 > 1024) {
			local219 -= 2048;
		}
		@Pc(230) int local230 = arg0.anInt2788;
		@Pc(232) int local232 = 4;
		@Pc(234) boolean local234 = true;
		if (local219 >= -256 && local219 <= 256) {
			local230 = arg0.anInt2799;
		} else if (local219 >= 256 && local219 < 768) {
			local230 = arg0.anInt2825;
		} else if (local219 >= -768 && local219 <= -256) {
			local230 = arg0.anInt2833;
		}
		if (local230 == -1) {
			local230 = arg0.anInt2799;
		}
		arg0.anInt2795 = local230;
		if (arg0 instanceof Class1_Sub2_Sub3_Sub4_Sub1) {
			local234 = ((Class1_Sub2_Sub3_Sub4_Sub1) arg0).aClass1_Sub2_Sub13_1.aBoolean81;
		}
		if (local234) {
			if (arg0.anInt2809 != arg0.anInt2819 && arg0.anInt2818 == -1 && arg0.anInt2815 != 0) {
				local232 = 2;
			}
			if (arg0.anInt2839 > 2) {
				local232 = 6;
			}
			if (arg0.anInt2839 > 3) {
				local232 = 8;
			}
			if (arg0.anInt2798 > 0 && arg0.anInt2839 > 1) {
				arg0.anInt2798--;
				local232 = 8;
			}
		} else {
			if (arg0.anInt2839 > 1) {
				local232 = 6;
			}
			if (arg0.anInt2839 > 2) {
				local232 = 8;
			}
			if (arg0.anInt2798 > 0 && arg0.anInt2839 > 1) {
				arg0.anInt2798--;
				local232 = 8;
			}
		}
		if (arg0.aBooleanArray13[arg0.anInt2839 - 1]) {
			local232 <<= 0x1;
		}
		if (local96 > local81) {
			arg0.anInt2827 += local232;
			if (arg0.anInt2827 > local96) {
				arg0.anInt2827 = local96;
			}
		} else if (local96 < local81) {
			arg0.anInt2827 -= local232;
			if (local96 > arg0.anInt2827) {
				arg0.anInt2827 = local96;
			}
		}
		if (local78 < local75) {
			arg0.anInt2832 += local232;
			if (arg0.anInt2832 > local75) {
				arg0.anInt2832 = local75;
			}
		} else if (local78 > local75) {
			arg0.anInt2832 -= local232;
			if (local75 > arg0.anInt2832) {
				arg0.anInt2832 = local75;
			}
		}
		if (local232 >= 8 && arg0.anInt2799 == arg0.anInt2795 && arg0.anInt2796 != -1) {
			arg0.anInt2795 = arg0.anInt2796;
		}
		if (local75 == arg0.anInt2832 && local96 == arg0.anInt2827) {
			if (arg0.anInt2806 > 0) {
				arg0.anInt2806--;
			}
			arg0.anInt2839--;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
	public static boolean method430(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	public static void method431() {
		aClass25_241 = null;
		aClass56_Sub1_2 = null;
		aClass77_3 = null;
		aClass57_1 = null;
		aClass25_239 = null;
		aClass25_238 = null;
		aClass25_240 = null;
		aClass25_243 = null;
		aClass25_242 = null;
		aClass56_17 = null;
		aClass25_244 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ee;I)V")
	public static void method432(@OriginalArg(1) Class1_Sub5_Sub1 arg0) {
		while (true) {
			@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static25.aClass2_3.method22();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt1108; local21++) {
				if (local14.aClass50Array2[local21] != null) {
					if (local14.aClass50Array2[local21].anInt1485 == 2) {
						local14.anIntArray202[local21] = -5;
					}
					if (local14.aClass50Array2[local21].anInt1485 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass50Array1[local21] != null) {
					if (local14.aClass50Array1[local21].anInt1485 == 2) {
						local14.anIntArray202[local21] = -6;
					}
					if (local14.aClass50Array1[local21].anInt1485 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method688(107);
			arg0.method676(0);
			@Pc(97) int local97 = arg0.anInt792;
			arg0.method633(local14.anInt1102);
			for (@Pc(104) int local104 = 0; local104 < local14.anInt1108; local104++) {
				if (local14.anIntArray202[local104] == 0) {
					try {
						@Pc(128) int local128 = local14.anIntArray204[local104];
						@Pc(143) Field local143;
						@Pc(146) int local146;
						if (local128 == 0) {
							local143 = (Field) local14.aClass50Array2[local104].anObject4;
							local146 = local143.getInt(null);
							arg0.method676(0);
							arg0.method633(local146);
						} else if (local128 == 1) {
							local143 = (Field) local14.aClass50Array2[local104].anObject4;
							local143.setInt(null, local14.anIntArray203[local104]);
							arg0.method676(0);
						} else if (local128 == 2) {
							local143 = (Field) local14.aClass50Array2[local104].anObject4;
							local146 = local143.getModifiers();
							arg0.method676(0);
							arg0.method633(local146);
						}
						@Pc(207) Method local207;
						if (local128 == 3) {
							local207 = (Method) local14.aClass50Array1[local104].anObject4;
							@Pc(212) byte[][] local212 = local14.aByteArrayArrayArray4[local104];
							@Pc(216) Object[] local216 = new Object[local212.length];
							for (@Pc(218) int local218 = 0; local218 < local212.length; local218++) {
								@Pc(230) ObjectInputStream local230 = new ObjectInputStream(new ByteArrayInputStream(local212[local218]));
								local216[local218] = local230.readObject();
							}
							@Pc(249) Object local249 = local207.invoke(null, local216);
							if (local249 == null) {
								arg0.method676(0);
							} else if (local249 instanceof Number) {
								arg0.method676(1);
								arg0.method640(((Number) local249).longValue());
							} else if (local249 instanceof Class25) {
								arg0.method676(2);
								arg0.method637((Class25) local249);
							} else {
								arg0.method676(4);
							}
						} else if (local128 == 4) {
							local207 = (Method) local14.aClass50Array1[local104].anObject4;
							local146 = local207.getModifiers();
							arg0.method676(0);
							arg0.method633(local146);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg0.method676(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg0.method676(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg0.method676(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg0.method676(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg0.method676(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg0.method676(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg0.method676(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg0.method676(-17);
					} catch (@Pc(363) IOException local363) {
						arg0.method676(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg0.method676(-19);
					} catch (@Pc(375) Exception local375) {
						arg0.method676(-20);
					} catch (@Pc(381) Throwable local381) {
						arg0.method676(-21);
					}
				} else {
					arg0.method676(local14.anIntArray202[local104]);
				}
			}
			arg0.method658(local97);
			arg0.method638(arg0.anInt792 - local97);
			local14.method2024();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	public static void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local15 = 0; local15 < 8; local15++) {
				Static7.anIntArrayArrayArray3[arg2][arg0 + local3][local15 + arg1] = 0;
			}
		}
		if (arg0 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static7.anIntArrayArrayArray3[arg2][arg0][local15 + arg1] = Static7.anIntArrayArrayArray3[arg2][arg0 - 1][arg1 + local15];
			}
		}
		if (arg1 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static7.anIntArrayArrayArray3[arg2][local15 + arg0][arg1] = Static7.anIntArrayArrayArray3[arg2][local15 + arg0][arg1 - 1];
			}
		}
		if (arg0 > 0 && Static7.anIntArrayArrayArray3[arg2][arg0 - 1][arg1] != 0) {
			Static7.anIntArrayArrayArray3[arg2][arg0][arg1] = Static7.anIntArrayArrayArray3[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static7.anIntArrayArrayArray3[arg2][arg0][arg1 - 1] != 0) {
			Static7.anIntArrayArrayArray3[arg2][arg0][arg1] = Static7.anIntArrayArrayArray3[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static7.anIntArrayArrayArray3[arg2][arg0 - 1][arg1 - 1] != 0) {
			Static7.anIntArrayArrayArray3[arg2][arg0][arg1] = Static7.anIntArrayArrayArray3[arg2][arg0 - 1][arg1 - 1];
		}
	}
}

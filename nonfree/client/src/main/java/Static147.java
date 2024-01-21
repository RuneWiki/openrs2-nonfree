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

public final class Static147 {

	@OriginalMember(owner = "client!re", name = "J", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!re", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_22 = new Class25(64);

	@OriginalMember(owner = "client!re", name = "L", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1328 = Static49.method1293(" ");

	@OriginalMember(owner = "client!re", name = "X", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1330 = Static49.method1293("Please try again)3");

	@OriginalMember(owner = "client!re", name = "U", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1329 = aClass70_1330;

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1331 = Static49.method1293("Benutzername: ");

	@OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
	public static int anInt3873 = 0;

	@OriginalMember(owner = "client!re", name = "kb", descriptor = "I")
	public static int anInt3874 = 0;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)Z")
	public static boolean method2877(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!f;BI)V")
	public static void method2883(@OriginalArg(0) Class1_Sub9_Sub1 arg0) {
		while (true) {
			@Pc(18) Class1_Sub18 local18 = (Class1_Sub18) Static154.aClass4_15.method174();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt3056; local25++) {
				if (local18.aClass18Array2[local25] != null) {
					if (local18.aClass18Array2[local25].anInt1403 == 2) {
						local18.anIntArray299[local25] = -5;
					}
					if (local18.aClass18Array2[local25].anInt1403 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass18Array1[local25] != null) {
					if (local18.aClass18Array1[local25].anInt1403 == 2) {
						local18.anIntArray299[local25] = -6;
					}
					if (local18.aClass18Array1[local25].anInt1403 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method1283(127);
			arg0.method1260(0);
			@Pc(99) int local99 = arg0.anInt1592;
			arg0.method1259(local18.anInt3057);
			for (@Pc(106) int local106 = 0; local106 < local18.anInt3056; local106++) {
				if (local18.anIntArray299[local106] == 0) {
					try {
						@Pc(130) int local130 = local18.anIntArray298[local106];
						@Pc(142) Field local142;
						@Pc(170) int local170;
						if (local130 == 0) {
							local142 = (Field) local18.aClass18Array2[local106].anObject2;
							local170 = local142.getInt(null);
							arg0.method1260(0);
							arg0.method1259(local170);
						} else if (local130 == 1) {
							local142 = (Field) local18.aClass18Array2[local106].anObject2;
							local142.setInt(null, local18.anIntArray297[local106]);
							arg0.method1260(0);
						} else if (local130 == 2) {
							local142 = (Field) local18.aClass18Array2[local106].anObject2;
							local170 = local142.getModifiers();
							arg0.method1260(0);
							arg0.method1259(local170);
						}
						@Pc(214) Method local214;
						if (local130 == 3) {
							local214 = (Method) local18.aClass18Array1[local106].anObject2;
							@Pc(239) byte[][] local239 = local18.aByteArrayArrayArray7[local106];
							@Pc(243) Object[] local243 = new Object[local239.length];
							for (@Pc(245) int local245 = 0; local245 < local239.length; local245++) {
								@Pc(257) ObjectInputStream local257 = new ObjectInputStream(new ByteArrayInputStream(local239[local245]));
								local243[local245] = local257.readObject();
							}
							@Pc(272) Object local272 = local214.invoke(null, local243);
							if (local272 == null) {
								arg0.method1260(0);
							} else if (local272 instanceof Number) {
								arg0.method1260(1);
								arg0.method1263(((Number) local272).longValue());
							} else if (local272 instanceof Class70) {
								arg0.method1260(2);
								arg0.method1232((Class70) local272);
							} else {
								arg0.method1260(4);
							}
						} else if (local130 == 4) {
							local214 = (Method) local18.aClass18Array1[local106].anObject2;
							local170 = local214.getModifiers();
							arg0.method1260(0);
							arg0.method1259(local170);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg0.method1260(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg0.method1260(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg0.method1260(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg0.method1260(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg0.method1260(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg0.method1260(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg0.method1260(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg0.method1260(-17);
					} catch (@Pc(363) IOException local363) {
						arg0.method1260(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg0.method1260(-19);
					} catch (@Pc(375) Exception local375) {
						arg0.method1260(-20);
					} catch (@Pc(381) Throwable local381) {
						arg0.method1260(-21);
					}
				} else {
					arg0.method1260(local18.anIntArray299[local106]);
				}
			}
			arg0.method1246(local99);
			arg0.method1249(arg0.anInt1592 - local99);
			local18.method3499();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ig;II)I")
	public static int method2884(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray21 == null || arg0.anIntArrayArray21.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray21[arg1];
			@Pc(26) int local26 = 0;
			@Pc(35) int local35 = 0;
			@Pc(37) byte local37 = 0;
			while (true) {
				@Pc(42) int local42 = local24[local35++];
				@Pc(44) byte local44 = 0;
				@Pc(46) int local46 = 0;
				if (local42 == 0) {
					return local26;
				}
				if (local42 == 15) {
					local44 = 1;
				}
				if (local42 == 1) {
					local46 = Static85.anIntArray246[local24[local35++]];
				}
				if (local42 == 2) {
					local46 = Static164.anIntArray407[local24[local35++]];
				}
				if (local42 == 16) {
					local44 = 2;
				}
				if (local42 == 3) {
					local46 = Static10.anIntArray24[local24[local35++]];
				}
				@Pc(108) int local108;
				@Pc(119) Class39 local119;
				@Pc(124) int local124;
				@Pc(137) int local137;
				if (local42 == 4) {
					local108 = local24[local35++] << 16;
					@Pc(115) int local115 = local108 + local24[local35++];
					local119 = Static128.method3227(local115);
					local124 = local24[local35++];
					if (local124 != -1 && (!Static90.method1963(local124).aBoolean7 || Static133.aBoolean136)) {
						for (local137 = 0; local137 < local119.anIntArray228.length; local137++) {
							if (local124 + 1 == local119.anIntArray228[local137]) {
								local46 += local119.anIntArray231[local137];
							}
						}
					}
				}
				if (local42 == 17) {
					local44 = 3;
				}
				if (local42 == 5) {
					local46 = Static133.anIntArray330[local24[local35++]];
				}
				if (local42 == 6) {
					local46 = Class1_Sub2_Sub8.anIntArray44[Static164.anIntArray407[local24[local35++]] - 1];
				}
				if (local42 == 7) {
					local46 = Static133.anIntArray330[local24[local35++]] * 100 / 46875;
				}
				if (local42 == 8) {
					local46 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1293;
				}
				if (local42 == 9) {
					for (local108 = 0; local108 < 25; local108++) {
						if (Static113.aBooleanArray15[local108]) {
							local46 += Static164.anIntArray407[local108];
						}
					}
				}
				if (local42 == 10) {
					local108 = local24[local35++] << 16;
					local108 += local24[local35++];
					local119 = Static128.method3227(local108);
					local124 = local24[local35++];
					if (local124 != -1 && (!Static90.method1963(local124).aBoolean7 || Static133.aBoolean136)) {
						for (local137 = 0; local137 < local119.anIntArray228.length; local137++) {
							if (local124 + 1 == local119.anIntArray228[local137]) {
								local46 = 999999999;
								break;
							}
						}
					}
				}
				if (local42 == 11) {
					local46 = Static54.anInt1755;
				}
				if (local42 == 12) {
					local46 = Static37.anInt1313;
				}
				if (local42 == 13) {
					local108 = Static133.anIntArray330[local24[local35++]];
					@Pc(340) int local340 = local24[local35++];
					local46 = (0x1 << local340 & local108) == 0 ? 0 : 1;
				}
				if (local42 == 14) {
					local108 = local24[local35++];
					local46 = Static79.method1809(local108);
				}
				if (local42 == 18) {
					local46 = (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 >> 7) + Static154.anInt4068;
				}
				if (local42 == 19) {
					local46 = Static64.anInt987 + (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 >> 7);
				}
				if (local42 == 20) {
					local46 = local24[local35++];
				}
				if (local44 == 0) {
					if (local37 == 0) {
						local26 += local46;
					}
					if (local37 == 1) {
						local26 -= local46;
					}
					if (local37 == 2 && local46 != 0) {
						local26 /= local46;
					}
					if (local37 == 3) {
						local26 *= local46;
					}
					local37 = 0;
				} else {
					local37 = local44;
				}
			}
		} catch (@Pc(437) Exception local437) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public static void method2887() {
		aClass70_1329 = null;
		aClass70_1328 = null;
		aClass70_1330 = null;
		aClass25_22 = null;
		anIntArray366 = null;
		aClass70_1331 = null;
	}
}

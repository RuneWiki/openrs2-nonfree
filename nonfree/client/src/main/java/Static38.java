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

public final class Static38 {

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!pb;")
	public static Class31 aClass31_18;

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
	public static int anInt947;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_12;

	@OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
	public static int anInt950;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "Lclient!mc;")
	public static Class42 aClass42_509 = Static23.method501("::");

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "Lclient!kc;")
	public static Class37 aClass37_15 = new Class37(500);

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_510 = Static23.method501("Offline");

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "Lclient!mc;")
	private static Class42 aClass42_511 = Static23.method501(" from your friend list first");

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "[I")
	public static int[] anIntArray130 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_513 = Static23.method501("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "Lclient!mc;")
	public static Class42 aClass42_512 = aClass42_513;

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
	public static int anInt948 = 0;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_514 = aClass42_511;

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "[I")
	public static int[] anIntArray131 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_515 = Static23.method501("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_516 = Static23.method501("shake:");

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_517 = aClass42_516;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ib;B)V")
	public static void method641(@OriginalArg(0) Class1_Sub1_Sub8_Sub1 arg0) {
		arg0.anInt2563 = arg0.anInt2567;
		if (arg0.anInt2603 == 0) {
			arg0.anInt2594 = 0;
			return;
		}
		if (arg0.anInt2601 != -1 && arg0.anInt2570 == 0) {
			@Pc(31) Class1_Sub1_Sub14 local31 = Static30.method574(arg0.anInt2601);
			if (arg0.anInt2569 > 0 && local31.anInt2318 == 0) {
				arg0.anInt2594++;
				return;
			}
			if (arg0.anInt2569 <= 0 && local31.anInt2327 == 0) {
				arg0.anInt2594++;
				return;
			}
		}
		@Pc(63) int local63 = arg0.anInt2576;
		@Pc(66) int local66 = arg0.anInt2583;
		@Pc(86) int local86 = arg0.anInt2599 * 64 + arg0.anIntArray393[arg0.anInt2603 - 1] * 128;
		@Pc(101) int local101 = arg0.anInt2599 * 64 + arg0.anIntArray395[arg0.anInt2603 - 1] * 128;
		if (local101 - local63 > 256 || local101 - local63 < -256 || local86 - local66 > 256 || local86 - local66 < -256) {
			arg0.anInt2576 = local101;
			arg0.anInt2583 = local86;
			return;
		}
		@Pc(138) int local138 = 4;
		@Pc(141) int local141 = arg0.anInt2556;
		if (local101 <= local63) {
			if (local101 < local63) {
				if (local66 < local86) {
					arg0.anInt2606 = 768;
				} else if (local66 > local86) {
					arg0.anInt2606 = 256;
				} else {
					arg0.anInt2606 = 512;
				}
			} else if (local66 < local86) {
				arg0.anInt2606 = 1024;
			} else if (local86 < local66) {
				arg0.anInt2606 = 0;
			}
		} else if (local66 < local86) {
			arg0.anInt2606 = 1280;
		} else if (local66 <= local86) {
			arg0.anInt2606 = 1536;
		} else {
			arg0.anInt2606 = 1792;
		}
		@Pc(228) int local228 = arg0.anInt2606 - arg0.anInt2564 & 0x7FF;
		if (arg0.anInt2606 != arg0.anInt2564 && arg0.anInt2590 == -1 && arg0.anInt2577 != 0) {
			local138 = 2;
		}
		if (arg0.anInt2603 > 2) {
			local138 = 6;
		}
		if (local228 > 1024) {
			local228 -= 2048;
		}
		if (arg0.anInt2603 > 3) {
			local138 = 8;
		}
		if (local228 >= -256 && local228 <= 256) {
			local141 = arg0.anInt2578;
		} else if (local228 >= 256 && local228 < 768) {
			local141 = arg0.anInt2552;
		} else if (local228 >= -768 && local228 <= -256) {
			local141 = arg0.anInt2561;
		}
		if (arg0.anInt2594 > 0 && arg0.anInt2603 > 1) {
			arg0.anInt2594--;
			local138 = 8;
		}
		if (local141 == -1) {
			local141 = arg0.anInt2578;
		}
		arg0.anInt2563 = local141;
		if (arg0.aBooleanArray17[arg0.anInt2603 - 1]) {
			local138 <<= 0x1;
		}
		if (local138 >= 8 && arg0.anInt2563 == arg0.anInt2578 && arg0.anInt2592 != -1) {
			arg0.anInt2563 = arg0.anInt2592;
		}
		if (local63 < local101) {
			arg0.anInt2576 += local138;
			if (local101 < arg0.anInt2576) {
				arg0.anInt2576 = local101;
			}
		} else if (local101 < local63) {
			arg0.anInt2576 -= local138;
			if (arg0.anInt2576 < local101) {
				arg0.anInt2576 = local101;
			}
		}
		if (local66 < local86) {
			arg0.anInt2583 += local138;
			if (arg0.anInt2583 > local86) {
				arg0.anInt2583 = local86;
			}
		} else if (local66 > local86) {
			arg0.anInt2583 -= local138;
			if (local86 > arg0.anInt2583) {
				arg0.anInt2583 = local86;
			}
		}
		if (local101 != arg0.anInt2576 || local86 != arg0.anInt2583) {
			return;
		}
		arg0.anInt2603--;
		if (arg0.anInt2569 > 0) {
			arg0.anInt2569--;
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!mc;")
	public static Class42 method642(@OriginalArg(1) int arg0) {
		return Static98.method1710(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!oa;II)V")
	public static void method643(@OriginalArg(0) Class1_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(17) Class1_Sub4 local17 = (Class1_Sub4) Static48.aClass22_9.method515();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt810; local24++) {
				if (local17.aClass59Array1[local24] != null) {
					if (local17.aClass59Array1[local24].anInt2522 == 2) {
						local17.anIntArray96[local24] = -5;
					}
					if (local17.aClass59Array1[local24].anInt2522 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass59Array2[local24] != null) {
					if (local17.aClass59Array2[local24].anInt2522 == 2) {
						local17.anIntArray96[local24] = -6;
					}
					if (local17.aClass59Array2[local24].anInt2522 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method1236(19);
			arg0.method1185(0);
			@Pc(99) int local99 = arg0.anInt1692;
			arg0.method1218(local17.anInt812);
			for (@Pc(106) int local106 = 0; local106 < local17.anInt810; local106++) {
				if (local17.anIntArray96[local106] == 0) {
					try {
						@Pc(130) int local130 = local17.anIntArray93[local106];
						@Pc(145) Field local145;
						@Pc(148) int local148;
						if (local130 == 0) {
							local145 = (Field) local17.aClass59Array1[local106].anObject3;
							local148 = local145.getInt(null);
							arg0.method1185(0);
							arg0.method1218(local148);
						} else if (local130 == 1) {
							local145 = (Field) local17.aClass59Array1[local106].anObject3;
							local145.setInt(null, local17.anIntArray95[local106]);
							arg0.method1185(0);
						} else if (local130 == 2) {
							local145 = (Field) local17.aClass59Array1[local106].anObject3;
							local148 = local145.getModifiers();
							arg0.method1185(0);
							arg0.method1218(local148);
						}
						@Pc(207) Method local207;
						if (local130 == 3) {
							local207 = (Method) local17.aClass59Array2[local106].anObject3;
							@Pc(212) byte[][] local212 = local17.aByteArrayArrayArray3[local106];
							@Pc(216) Object[] local216 = new Object[local212.length];
							for (@Pc(218) int local218 = 0; local218 < local212.length; local218++) {
								@Pc(230) ObjectInputStream local230 = new ObjectInputStream(new ByteArrayInputStream(local212[local218]));
								local216[local218] = local230.readObject();
							}
							@Pc(249) Object local249 = local207.invoke(null, local216);
							if (local249 == null) {
								arg0.method1185(0);
							} else if (local249 instanceof Number) {
								arg0.method1185(1);
								arg0.method1193(((Number) local249).longValue());
							} else if (local249 instanceof Class42) {
								arg0.method1185(2);
								arg0.method1204((Class42) local249);
							} else {
								arg0.method1185(4);
							}
						} else if (local130 == 4) {
							local207 = (Method) local17.aClass59Array2[local106].anObject3;
							local148 = local207.getModifiers();
							arg0.method1185(0);
							arg0.method1218(local148);
						}
					} catch (@Pc(317) ClassNotFoundException local317) {
						arg0.method1185(-10);
					} catch (@Pc(323) InvalidClassException local323) {
						arg0.method1185(-11);
					} catch (@Pc(329) StreamCorruptedException local329) {
						arg0.method1185(-12);
					} catch (@Pc(335) OptionalDataException local335) {
						arg0.method1185(-13);
					} catch (@Pc(341) IllegalAccessException local341) {
						arg0.method1185(-14);
					} catch (@Pc(347) IllegalArgumentException local347) {
						arg0.method1185(-15);
					} catch (@Pc(353) InvocationTargetException local353) {
						arg0.method1185(-16);
					} catch (@Pc(359) SecurityException local359) {
						arg0.method1185(-17);
					} catch (@Pc(365) IOException local365) {
						arg0.method1185(-18);
					} catch (@Pc(371) NullPointerException local371) {
						arg0.method1185(-19);
					} catch (@Pc(377) Exception local377) {
						arg0.method1185(-20);
					} catch (@Pc(383) Throwable local383) {
						arg0.method1185(-21);
					}
				} else {
					arg0.method1185(local17.anIntArray96[local106]);
				}
			}
			arg0.method1184(local99);
			arg0.method1230(arg0.anInt1692 - local99);
			local17.method1825();
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method644() {
		aClass42_511 = null;
		aClass33_Sub1_12 = null;
		aClass42_514 = null;
		aClass42_509 = null;
		anIntArray130 = null;
		aClass42_513 = null;
		aClass42_517 = null;
		aClass37_15 = null;
		anIntArray131 = null;
		aClass42_515 = null;
		aClass42_512 = null;
		aClass42_516 = null;
		aClass31_18 = null;
		aClass42_510 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIILclient!qc;III)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static28.aBoolean40) {
			Static107.anInt2710 = 32;
		} else {
			Static107.anInt2710 = 0;
		}
		Static28.aBoolean40 = false;
		if (arg1 >= arg0 && arg0 + 16 > arg1 && arg2 >= arg7 && arg7 + 16 > arg2) {
			if (arg5 == 1) {
				Static89.aBoolean132 = true;
			}
			arg4.anInt2152 -= Static21.anInt667 * 4;
			if (arg5 == 2 || arg5 == 3) {
				Static28.aBoolean41 = true;
			}
		} else if (arg0 <= arg1 && arg1 < arg0 + 16 && arg6 + arg7 - 16 <= arg2 && arg7 + arg6 > arg2) {
			arg4.anInt2152 += Static21.anInt667 * 4;
			if (arg5 == 2 || arg5 == 3) {
				Static28.aBoolean41 = true;
			}
			if (arg5 == 1) {
				Static89.aBoolean132 = true;
				return;
			}
		} else if (arg0 - Static107.anInt2710 <= arg1 && arg0 + Static107.anInt2710 + 16 > arg1 && arg7 + 16 <= arg2 && arg2 < arg6 + arg7 - 16 && Static21.anInt667 > 0) {
			if (arg5 == 2 || arg5 == 3) {
				Static28.aBoolean41 = true;
			}
			if (arg5 == 1) {
				Static89.aBoolean132 = true;
			}
			@Pc(173) int local173 = (arg6 - 32) * arg6 / arg3;
			Static28.aBoolean40 = true;
			if (local173 < 8) {
				local173 = 8;
			}
			@Pc(191) int local191 = arg2 - arg7 - local173 / 2 - 16;
			@Pc(197) int local197 = arg6 - local173 - 32;
			arg4.anInt2152 = (arg3 - arg6) * local191 / local197;
		} else {
			return;
		}
	}
}

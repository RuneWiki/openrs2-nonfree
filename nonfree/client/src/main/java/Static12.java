import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt526 = 0;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	public static int[] anIntArray76 = new int[] { 0, 0, 0, -1, 0, 0, 0, 8, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0, 0, 14, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 6, 0, 2, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, -2, -2, 0, 5, 0, 10, 0, 0, 0, 5, 7, 0, 0, 1, 0, 0, 15, 2, -1, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -1, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 4, 0, 2, 0, -2, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 6, 0, 6, 4, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 10, 0, -2, 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 1, 0, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 4, 0, 0, 0, 0, 2, 5, 0, 3, 0, 0, 4 };

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt527 = 0;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_169 = Static56.method1206("You last logged in @red@");

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public static int anInt537 = 0;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_170 = Static56.method1206("Loading textures )2 ");

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	public static int anInt540 = 0;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!lc;")
	public static Class31 aClass31_171 = Static56.method1206("redstone1");

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	public static int anInt542 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ib;)V")
	public static void method364(@OriginalArg(1) Class2_Sub1_Sub4_Sub6 arg0) {
		arg0.anInt1988 = arg0.anInt2007;
		if (arg0.anInt2000 == 0) {
			arg0.anInt1989 = 0;
			return;
		}
		if (arg0.anInt2014 != -1 && arg0.anInt1986 == 0) {
			@Pc(32) Class2_Sub1_Sub10 local32 = Static54.method1158(arg0.anInt2014);
			if (arg0.anInt1996 > 0 && local32.anInt2096 == 0) {
				arg0.anInt1989++;
				return;
			}
			if (arg0.anInt1996 <= 0 && local32.anInt2106 == 0) {
				arg0.anInt1989++;
				return;
			}
		}
		@Pc(64) int local64 = arg0.anInt2006;
		@Pc(79) int local79 = arg0.anIntArray281[arg0.anInt2000 - 1] * 128 + arg0.anInt1994 * 64;
		@Pc(82) int local82 = arg0.anInt2011;
		@Pc(98) int local98 = arg0.anIntArray285[arg0.anInt2000 - 1] * 128 + arg0.anInt1994 * 64;
		if (local79 - local64 > 256 || local79 - local64 < -256 || local98 - local82 > 256 || local98 - local82 < -256) {
			arg0.anInt2011 = local98;
			arg0.anInt2006 = local79;
			return;
		}
		if (local64 < local79) {
			if (local98 > local82) {
				arg0.anInt2023 = 1280;
			} else if (local98 < local82) {
				arg0.anInt2023 = 1792;
			} else {
				arg0.anInt2023 = 1536;
			}
		} else if (local64 <= local79) {
			if (local82 < local98) {
				arg0.anInt2023 = 1024;
			} else {
				arg0.anInt2023 = 0;
			}
		} else if (local82 < local98) {
			arg0.anInt2023 = 768;
		} else if (local82 <= local98) {
			arg0.anInt2023 = 512;
		} else {
			arg0.anInt2023 = 256;
		}
		@Pc(212) int local212 = arg0.anInt2023 - arg0.anInt1991 & 0x7FF;
		@Pc(215) int local215 = arg0.anInt2022;
		if (local212 > 1024) {
			local212 -= 2048;
		}
		if (local212 >= -256 && local212 <= 256) {
			local215 = arg0.anInt2003;
		} else if (local212 >= 256 && local212 < 768) {
			local215 = arg0.anInt1984;
		} else if (local212 >= -768 && local212 <= -256) {
			local215 = arg0.anInt2039;
		}
		if (local215 == -1) {
			local215 = arg0.anInt2003;
		}
		arg0.anInt1988 = local215;
		@Pc(268) int local268 = 4;
		if (arg0.anInt1991 != arg0.anInt2023 && arg0.anInt2019 == -1 && arg0.anInt2029 != 0) {
			local268 = 2;
		}
		if (arg0.anInt2000 > 2) {
			local268 = 6;
		}
		if (arg0.anInt2000 > 3) {
			local268 = 8;
		}
		if (arg0.anInt1989 > 0 && arg0.anInt2000 > 1) {
			arg0.anInt1989--;
			local268 = 8;
		}
		if (arg0.aBooleanArray47[arg0.anInt2000 - 1]) {
			local268 <<= 0x1;
		}
		if (local79 > local64) {
			arg0.anInt2006 += local268;
			if (arg0.anInt2006 > local79) {
				arg0.anInt2006 = local79;
			}
		} else if (local64 > local79) {
			arg0.anInt2006 -= local268;
			if (local79 > arg0.anInt2006) {
				arg0.anInt2006 = local79;
			}
		}
		if (local268 >= 8 && arg0.anInt2003 == arg0.anInt1988 && arg0.anInt2025 != -1) {
			arg0.anInt1988 = arg0.anInt2025;
		}
		if (local82 < local98) {
			arg0.anInt2011 += local268;
			if (local98 < arg0.anInt2011) {
				arg0.anInt2011 = local98;
			}
		} else if (local98 < local82) {
			arg0.anInt2011 -= local268;
			if (local98 > arg0.anInt2011) {
				arg0.anInt2011 = local98;
			}
		}
		if (local79 != arg0.anInt2006 || local98 != arg0.anInt2011) {
			return;
		}
		arg0.anInt2000--;
		if (arg0.anInt1996 > 0) {
			arg0.anInt1996--;
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method365() {
		aClass31_170 = null;
		anIntArray76 = null;
		aClass31_171 = null;
		aClass31_169 = null;
		anIntArray77 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIB)V")
	public static void method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(8) int local8 = arg3; local8 <= arg1 + arg3; local8++) {
			for (@Pc(12) int local12 = arg2; local12 <= arg2 + arg0; local12++) {
				if (local12 >= 0 && local12 < 104 && local8 >= 0 && local8 < 104) {
					Static77.aByteArrayArrayArray30[0][local12][local8] = 127;
					if (local12 == arg2 && local12 > 0) {
						Static16.anIntArrayArrayArray1[0][local12][local8] = Static16.anIntArrayArrayArray1[0][local12 - 1][local8];
					}
					if (arg0 + arg2 == local12 && local12 < 103) {
						Static16.anIntArrayArrayArray1[0][local12][local8] = Static16.anIntArrayArrayArray1[0][local12 + 1][local8];
					}
					if (local8 == arg3 && local8 > 0) {
						Static16.anIntArrayArrayArray1[0][local12][local8] = Static16.anIntArrayArrayArray1[0][local12][local8 - 1];
					}
					if (arg1 + arg3 == local8 && local8 < 103) {
						Static16.anIntArrayArrayArray1[0][local12][local8] = Static16.anIntArrayArrayArray1[0][local12][local8 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method367() {
		Static30.aClass9_12.method861();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lclient!vc;")
	public static Class7 method368() {
		try {
			return (Class7) Class.forName("Class7_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class7_Sub1();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZZLclient!cc;)V")
	public static void method369(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class11_Sub1 arg2) {
		@Pc(7) Class36 local7 = Static77.aClass36_7;
		synchronized (Static77.aClass36_7) {
			@Pc(11) boolean local11 = false;
			@Pc(16) Class2_Sub5 local16;
			for (local16 = (Class2_Sub5) Static77.aClass36_7.method1365(); local16 != null; local16 = (Class2_Sub5) Static77.aClass36_7.method1361()) {
				if (local16.anInt786 == arg0 && arg2 == local16.aClass11_Sub1_4) {
					if (local16.anInt797 == 1) {
						return;
					}
					if (local16.anInt797 == 0) {
						local11 = true;
					}
				}
				if (local16.anInt797 == 2) {
					local11 = true;
				}
			}
			if (arg1 && !local11 && Static82.aBoolean120) {
				arg2.aByteArrayArray3[arg0] = arg2.aClass25_1.method1071(arg0);
				if (arg2.aByteArrayArray3[arg0] == null) {
					arg2.aBooleanArray11[arg0] = false;
				}
				return;
			}
			local16 = new Class2_Sub5();
			local16.anInt797 = 1;
			local16.aClass11_Sub1_4 = arg2;
			local16.anInt786 = arg0;
			Static77.aClass36_7.method1362(local16);
		}
		Static50.method349();
	}
}

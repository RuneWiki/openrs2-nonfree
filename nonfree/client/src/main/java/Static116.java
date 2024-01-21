import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ve", name = "pb", descriptor = "Lclient!ie;")
	public static Class35 aClass35_3;

	@OriginalMember(owner = "client!ve", name = "sb", descriptor = "I")
	public static int anInt2808;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "J")
	public static long aLong109 = 0L;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1336 = Static38.method736("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1334 = aClass71_1336;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1335 = Static38.method736("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!ve", name = "zb", descriptor = "I")
	public static int anInt2814 = 1;

	@OriginalMember(owner = "client!ve", name = "Bb", descriptor = "[I")
	public static int[] anIntArray285 = new int[2048];

	@OriginalMember(owner = "client!ve", name = "Cb", descriptor = "I")
	public static int anInt2816 = 0;

	@OriginalMember(owner = "client!ve", name = "Eb", descriptor = "[I")
	public static int[] anIntArray286 = new int[500];

	@OriginalMember(owner = "client!ve", name = "Gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1337 = Static38.method736("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ve", name = "Jb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1338 = Static38.method736("Absender:");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIII)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static7.aClass43_1.method1072(arg2, arg3, arg0);
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(38) int local38;
		@Pc(31) int local31;
		@Pc(63) int local63;
		@Pc(48) int local48;
		if (local11 != 0) {
			local23 = Static7.aClass43_1.method1059(arg2, arg3, arg0, local11);
			local29 = local23 >> 6 & 0x3;
			local31 = arg4;
			@Pc(34) int[] local34 = Static79.aClass5_Sub1_Sub10_Sub3_35.anIntArray281;
			local38 = local23 & 0x1F;
			if (local11 > 0) {
				local31 = arg1;
			}
			local48 = local11 >> 14 & 0x7FFF;
			local63 = arg3 * 4 + (-arg0 + 103) * 512 * 4 + 24624;
			@Pc(67) Class5_Sub1_Sub15 local67 = Static97.method1606(local48);
			if (local67.anInt2560 == -1) {
				if (local38 == 0 || local38 == 2) {
					if (local29 == 0) {
						local34[local63] = local31;
						local34[local63 + 512] = local31;
						local34[local63 + 1024] = local31;
						local34[local63 + 1536] = local31;
					} else if (local29 == 1) {
						local34[local63] = local31;
						local34[local63 + 1] = local31;
						local34[local63 + 2] = local31;
						local34[local63 + 3] = local31;
					} else if (local29 == 2) {
						local34[local63 + 3] = local31;
						local34[local63 + 515] = local31;
						local34[local63 + 1024 + 3] = local31;
						local34[local63 + 3 + 1536] = local31;
					} else if (local29 == 3) {
						local34[local63 + 1536] = local31;
						local34[local63 + 1 + 1536] = local31;
						local34[local63 + 1536 + 2] = local31;
						local34[local63 + 3 + 1536] = local31;
					}
				}
				if (local38 == 3) {
					if (local29 == 0) {
						local34[local63] = local31;
					} else if (local29 == 1) {
						local34[local63 + 3] = local31;
					} else if (local29 == 2) {
						local34[local63 + 1536 + 3] = local31;
					} else if (local29 == 3) {
						local34[local63 + 1536] = local31;
					}
				}
				if (local38 == 2) {
					if (local29 == 3) {
						local34[local63] = local31;
						local34[local63 + 512] = local31;
						local34[local63 + 1024] = local31;
						local34[local63 + 1536] = local31;
					} else if (local29 == 0) {
						local34[local63] = local31;
						local34[local63 + 1] = local31;
						local34[local63 + 2] = local31;
						local34[local63 + 3] = local31;
					} else if (local29 == 1) {
						local34[local63 + 3] = local31;
						local34[local63 + 3 + 512] = local31;
						local34[local63 + 1024 + 3] = local31;
						local34[local63 + 1536 + 3] = local31;
					} else if (local29 == 2) {
						local34[local63 + 1536] = local31;
						local34[local63 + 1 + 1536] = local31;
						local34[local63 + 2 + 1536] = local31;
						local34[local63 + 3 + 1536] = local31;
					}
				}
			} else {
				@Pc(77) Class5_Sub1_Sub10_Sub1 local77 = Static68.aClass5_Sub1_Sub10_Sub1Array7[local67.anInt2560];
				if (local77 != null) {
					@Pc(90) int local90 = (local67.anInt2572 * 4 - local77.anInt1351) / 2;
					@Pc(101) int local101 = (local67.anInt2559 * 4 - local77.anInt1350) / 2;
					local77.method921(arg3 * 4 + local101 + 48, (-arg0 + 104 + -local67.anInt2572) * 4 + 48 + local90);
				}
			}
		}
		local11 = Static7.aClass43_1.method1079(arg2, arg3, arg0);
		if (local11 != 0) {
			local23 = Static7.aClass43_1.method1059(arg2, arg3, arg0, local11);
			local31 = local11 >> 14 & 0x7FFF;
			local38 = local23 & 0x1F;
			@Pc(464) Class5_Sub1_Sub15 local464 = Static97.method1606(local31);
			local29 = local23 >> 6 & 0x3;
			@Pc(505) int local505;
			if (local464.anInt2560 != -1) {
				@Pc(577) Class5_Sub1_Sub10_Sub1 local577 = Static68.aClass5_Sub1_Sub10_Sub1Array7[local464.anInt2560];
				if (local577 != null) {
					local48 = (local464.anInt2559 * 4 - local577.anInt1350) / 2;
					local505 = (local464.anInt2572 * 4 - local577.anInt1351) / 2;
					local577.method921(arg3 * 4 + local48 + 48, local505 + (48 - -((-arg0 + 104 + -local464.anInt2572) * 4)));
				}
			} else if (local38 == 9) {
				@Pc(483) int[] local483 = Static79.aClass5_Sub1_Sub10_Sub3_35.anIntArray281;
				local63 = 15658734;
				if (local11 > 0) {
					local63 = 15597568;
				}
				local505 = arg3 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
				if (local29 == 0 || local29 == 2) {
					local483[local505 + 1536] = local63;
					local483[local505 + 1024 + 1] = local63;
					local483[local505 + 2 + 512] = local63;
					local483[local505 + 3] = local63;
				} else {
					local483[local505] = local63;
					local483[local505 + 1 + 512] = local63;
					local483[local505 + 1024 + 2] = local63;
					local483[local505 + 3 + 1536] = local63;
				}
			}
		}
		local11 = Static7.aClass43_1.method1098(arg2, arg3, arg0);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(651) Class5_Sub1_Sub15 local651 = Static97.method1606(local23);
		if (local651.anInt2560 == -1) {
			return;
		}
		@Pc(661) Class5_Sub1_Sub10_Sub1 local661 = Static68.aClass5_Sub1_Sub10_Sub1Array7[local651.anInt2560];
		if (local661 != null) {
			local31 = (local651.anInt2559 * 4 - local661.anInt1350) / 2;
			@Pc(685) int local685 = (local651.anInt2572 * 4 - local661.anInt1351) / 2;
			local661.method921(local31 + arg3 * 4 + 48, local685 + (-arg0 + 104 + -local651.anInt2572) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	public static void method1890() {
		@Pc(12) Object local12 = Static50.anObject2;
		synchronized (Static50.anObject2) {
			if (Static9.anInt301 != 0) {
				Static9.anInt301 = 1;
				try {
					Static50.anObject2.wait();
				} catch (@Pc(25) InterruptedException local25) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
	public static void method1892() {
		aClass71_1338 = null;
		anIntArray286 = null;
		aByteArrayArray10 = null;
		aClass71_1335 = null;
		anIntArray285 = null;
		aClass35_3 = null;
		aClass71_1334 = null;
		aClass71_1336 = null;
		aClass71_1337 = null;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V")
	public static void method1893() {
		if (!Static33.aBoolean40) {
			return;
		}
		@Pc(11) Class5_Sub1_Sub11 local11 = Static23.method550(Static100.anInt2363, Static10.anInt308);
		if (local11 != null && local11.anObjectArray9 != null) {
			Static53.method972(0, null, local11.anObjectArray9, 0, 0, local11);
		}
		Static33.aBoolean40 = false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZLclient!ha;)Z")
	public static boolean method1896(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class29 arg1) {
		Static40.anInt717 = 20;
		try {
			Static119.aClass11_1 = (Class11) Class.forName("Class11_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(21) Throwable local21) {
			@Pc(25) Interface1 local25 = arg1.method780();
			if (local25 != null) {
				Static119.aClass11_1 = new Class11_Sub1_Sub2(arg1, local25);
				return true;
			} else if (arg0) {
				Static119.aClass11_1 = new Class11_Sub2(arg1);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1898(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static29.method580(local18) : local18;
		} else if (arg1 instanceof Class19) {
			@Pc(32) Class19 local32 = (Class19) arg1;
			return local32.method983();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Lclient!dc;")
	public static Class5_Sub1_Sub5 method1900(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1_Sub5 local10 = (Class5_Sub1_Sub5) Static3.aClass54_2.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static88.method1398(Static64.aClass24_22, Static103.aClass24_21, arg0);
		if (local10 != null) {
			Static3.aClass54_2.method1399(local10, (long) arg0);
		}
		return local10;
	}
}

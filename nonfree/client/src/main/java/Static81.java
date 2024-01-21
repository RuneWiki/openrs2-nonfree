import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "Z")
	public static boolean aBoolean147;

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_29;

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
	public static int anInt1904;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1070 = Static75.method1216("@whi@ )4 ");

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1071 = Static75.method1216("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
	public static int[] anIntArray243 = new int[2000];

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "[Lclient!tb;")
	public static Class64_Sub1[] aClass64_Sub1Array1 = new Class64_Sub1[256];

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
	public static int anInt1896 = -1;

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
	public static int anInt1899 = 0;

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1072 = Static75.method1216("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLclient!rc;)I")
	public static int method1281(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub14 arg1) {
		if (arg1.anIntArrayArray21 == null || arg0 >= arg1.anIntArrayArray21.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray21[arg0];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(33) int local33 = 0;
				@Pc(38) int local38 = local20[local24++];
				@Pc(40) byte local40 = 0;
				if (local38 == 0) {
					return local22;
				}
				if (local38 == 1) {
					local33 = Static63.anIntArray226[local20[local24++]];
				}
				if (local38 == 2) {
					local33 = Static85.anIntArray261[local20[local24++]];
				}
				if (local38 == 3) {
					local33 = Static27.anIntArray76[local20[local24++]];
				}
				@Pc(91) int local91;
				@Pc(102) Class3_Sub1_Sub14 local102;
				@Pc(107) int local107;
				@Pc(119) int local119;
				if (local38 == 4) {
					local91 = local20[local24++] << 16;
					@Pc(98) int local98 = local91 + local20[local24++];
					local102 = Static47.method828(local98);
					local107 = local20[local24++];
					if (local107 != -1 && (!Static3.method1550(local107).aBoolean47 || Static13.aBoolean23)) {
						for (local119 = 0; local119 < local102.anIntArray274.length; local119++) {
							if (local102.anIntArray274[local119] == local107 + 1) {
								local33 += local102.anIntArray272[local119];
							}
						}
					}
				}
				if (local38 == 5) {
					local33 = Static106.anIntArray329[local20[local24++]];
				}
				if (local38 == 15) {
					local40 = 1;
				}
				if (local38 == 16) {
					local40 = 2;
				}
				if (local38 == 6) {
					local33 = Class62.anIntArray264[Static85.anIntArray261[local20[local24++]] - 1];
				}
				if (local38 == 7) {
					local33 = Static106.anIntArray329[local20[local24++]] * 100 / 46875;
				}
				if (local38 == 17) {
					local40 = 3;
				}
				if (local38 == 8) {
					local33 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2351;
				}
				if (local38 == 9) {
					for (local91 = 0; local91 < 25; local91++) {
						if (Static6.aBooleanArray3[local91]) {
							local33 += Static85.anIntArray261[local91];
						}
					}
				}
				if (local38 == 10) {
					local91 = local20[local24++] << 16;
					local91 += local20[local24++];
					local102 = Static47.method828(local91);
					local107 = local20[local24++];
					if (local107 != -1 && (!Static3.method1550(local107).aBoolean47 || Static13.aBoolean23)) {
						for (local119 = 0; local119 < local102.anIntArray274.length; local119++) {
							if (local102.anIntArray274[local119] == local107 + 1) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local38 == 11) {
					local33 = Static103.anInt2532;
				}
				if (local38 == 12) {
					local33 = Static78.anInt438;
				}
				if (local38 == 13) {
					local91 = Static106.anIntArray329[local20[local24++]];
					@Pc(333) int local333 = local20[local24++];
					local33 = (local91 & 0x1 << local333) == 0 ? 0 : 1;
				}
				if (local38 == 14) {
					local91 = local20[local24++];
					local33 = Static1.method3(local91);
				}
				if (local38 == 18) {
					local33 = (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 >> 7) + Static43.anInt1144;
				}
				if (local38 == 19) {
					local33 = (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 >> 7) + Static93.anInt2429;
				}
				if (local38 == 20) {
					local33 = local20[local24++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local22 += local33;
					}
					if (local31 == 1) {
						local22 -= local33;
					}
					if (local31 == 2 && local33 != 0) {
						local22 /= local33;
					}
					if (local31 == 3) {
						local22 *= local33;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(436) Exception local436) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)I")
	public static int method1282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static11.aByteArrayArrayArray55[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static11.aByteArrayArrayArray55[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public static void method1283() {
		aClass3_Sub1_Sub4_Sub3_29 = null;
		aClass4_1070 = null;
		aClass4_1071 = null;
		aClass4_1072 = null;
		anIntArray243 = null;
		aClass64_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lclient!nc;")
	public static Class3_Sub1_Sub7 method1285(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub1_Sub7 local11 = (Class3_Sub1_Sub7) Static107.aClass8_31.method195((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static90.aClass64_81.method1625(16, arg0);
		local11 = new Class3_Sub1_Sub7();
		if (local25 != null) {
			local11.method1135(new Class3_Sub4(local25));
		}
		Static107.aClass8_31.method199((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub12 local7 = null;
		for (@Pc(14) Class3_Sub12 local14 = (Class3_Sub12) Static67.aClass20_8.method308(); local14 != null; local14 = (Class3_Sub12) Static67.aClass20_8.method309()) {
			if (arg5 == local14.anInt2770 && local14.anInt2776 == arg8 && local14.anInt2767 == arg0 && local14.anInt2774 == arg7) {
				local7 = local14;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub12();
			local7.anInt2770 = arg5;
			local7.anInt2767 = arg0;
			local7.anInt2776 = arg8;
			local7.anInt2774 = arg7;
			Static103.method1695(local7);
			Static67.aClass20_8.method304(local7);
		}
		local7.anInt2778 = arg1;
		local7.anInt2779 = arg2;
		local7.anInt2780 = arg6;
		local7.anInt2766 = arg4;
		local7.anInt2773 = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qc;")
	public static RuntimeException_Sub1 method1287(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString8 = local12.aString8 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}

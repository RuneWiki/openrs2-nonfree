import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public static int anInt2171;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt2173;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_25;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt2169 = 0;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public static int anInt2170 = 0;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_697 = Static186.method3527("Welt");

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "[B")
	public static byte[] aByteArray33 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method1724() {
		Static66.method999(Static54.aClass93_35);
		Static150.anInt3122++;
		if (Static7.aBoolean6 && Static10.aBoolean9) {
			@Pc(24) int local24 = Static117.anInt2301;
			local24 -= Static27.anInt540;
			if (local24 < Static33.anInt627) {
				local24 = Static33.anInt627;
			}
			@Pc(35) int local35 = Static110.anInt2205;
			if (Static53.aClass93_34.anInt3600 + Static33.anInt627 < local24 + Static54.aClass93_35.anInt3600) {
				local24 = Static33.anInt627 + Static53.aClass93_34.anInt3600 - Static54.aClass93_35.anInt3600;
			}
			@Pc(59) int local59 = local24 - Static70.anInt1325;
			@Pc(62) int local62 = Static54.aClass93_35.anInt3648;
			local35 -= Static155.anInt3202;
			@Pc(74) int local74 = Static53.aClass93_34.anInt3653 + local24 - Static33.anInt627;
			if (Static165.anInt2676 > local35) {
				local35 = Static165.anInt2676;
			}
			if (local35 + Static54.aClass93_35.anInt3620 > Static165.anInt2676 + Static53.aClass93_34.anInt3620) {
				local35 = Static53.aClass93_34.anInt3620 + Static165.anInt2676 - Static54.aClass93_35.anInt3620;
			}
			@Pc(110) int local110 = local35 + Static53.aClass93_34.anInt3608 - Static165.anInt2676;
			@Pc(114) int local114 = local35 - Static179.anInt3724;
			if (Static54.aClass93_35.anInt3630 < Static150.anInt3122 && (local62 < local59 || -local62 > local59 || local114 > local62 || local114 < -local62)) {
				Static200.aBoolean189 = true;
			}
			if (Static54.aClass93_35.anObjectArray5 != null && Static200.aBoolean189) {
				@Pc(151) Class1_Sub29 local151 = new Class1_Sub29();
				local151.anObjectArray33 = Static54.aClass93_35.anObjectArray5;
				local151.aClass93_119 = Static54.aClass93_35;
				local151.anInt4353 = local74;
				local151.anInt4357 = local110;
				Static144.method2381(local151);
			}
			if (Static64.anInt1281 == 0) {
				if (Static200.aBoolean189) {
					if (Static54.aClass93_35.anObjectArray15 != null) {
						@Pc(186) Class1_Sub29 local186 = new Class1_Sub29();
						local186.aClass93_119 = Static54.aClass93_35;
						local186.anInt4357 = local110;
						local186.anObjectArray33 = Static54.aClass93_35.anObjectArray15;
						local186.anInt4353 = local74;
						local186.aClass93_120 = Static93.aClass93_58;
						Static144.method2381(local186);
					}
					if (Static93.aClass93_58 != null && Static35.method550(Static54.aClass93_35) != null) {
						Static32.aClass1_Sub17_Sub1_1.method2182(77);
						Static32.aClass1_Sub17_Sub1_1.method2124(Static54.aClass93_35.anInt3603);
						Static32.aClass1_Sub17_Sub1_1.method2151(Static93.aClass93_58.anInt3614);
						Static32.aClass1_Sub17_Sub1_1.method2124(Static93.aClass93_58.anInt3603);
						Static32.aClass1_Sub17_Sub1_1.method2136(Static54.aClass93_35.anInt3614);
					}
				} else if ((Static92.anInt1866 == 1 || Static7.method126(Static193.anInt3035 - 1)) && Static193.anInt3035 > 2) {
					Static97.method1525();
				} else if (Static193.anInt3035 > 0) {
					Static224.method67(Static193.anInt3035 - 1);
				}
				Static54.aClass93_35 = null;
			}
		} else if (Static150.anInt3122 > 1) {
			Static54.aClass93_35 = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)Z")
	public static boolean method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(16) Class18 local16 = Static148.method2487(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local16.method598(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIB)I")
	public static int method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray140.length; local31++) {
				if (local12.anIntArray142[local31] == arg0) {
					local29 += local12.anIntArray140[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
	public static void method1729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static42.anInt924; local7++) {
			if (Static135.anIntArray296[local7] + Static118.anIntArray258[local7] > arg2 && arg2 + arg1 > Static118.anIntArray258[local7] && arg0 < Static75.anIntArray124[local7] + Static189.anIntArray440[local7] && Static75.anIntArray124[local7] < arg3 + arg0) {
				Static222.aBooleanArray28[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
	public static int method1730(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBI)I")
	public static int method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BB)I")
	public static int method1733(@OriginalArg(0) byte arg0) {
		if (arg0 >= 65 && arg0 <= 90) {
			return arg0 - 65;
		} else if (arg0 >= 97 && arg0 <= 122) {
			return arg0 + 26 - 97;
		} else if (arg0 >= 48 && arg0 <= 57) {
			return arg0 + 52 - 48;
		} else if (arg0 == 43) {
			return 62;
		} else if (arg0 == 42) {
			return 62;
		} else if (arg0 == 47) {
			return 63;
		} else if (arg0 == 45) {
			return 63;
		} else {
			return -1;
		}
	}
}

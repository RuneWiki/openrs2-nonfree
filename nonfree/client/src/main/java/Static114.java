import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_63 = new Class131(35, 3);

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_34 = new Class237(74, 4);

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_16 = new Class27(8);

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[S")
	public static final short[] aShortArray40 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZBLclient!tf;)V")
	public static void method1702(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class26_Sub2_Sub2_Sub1 arg1) {
		if (Static82.anInt1627 >= 400) {
			return;
		}
		if (Static196.aClass26_Sub2_Sub2_Sub1_1 != arg1) {
			@Pc(186) String local186;
			@Pc(104) int local104;
			if (arg1.anInt6640 == 0) {
				@Pc(60) boolean local60 = true;
				if (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6651 != -1 && arg1.anInt6651 != -1) {
					@Pc(83) int local83 = arg1.anInt6652 >= Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652 ? arg1.anInt6652 : Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652;
					@Pc(94) int local94 = arg1.anInt6651 <= Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6651 ? arg1.anInt6651 : Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6651;
					local104 = local94 + local83 * 10 / 100 + 5;
					@Pc(111) int local111 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652 - arg1.anInt6652;
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local111 > local104) {
						local60 = false;
					}
				}
				@Pc(138) String local138 = Static96.aClass145_1 == Static248.aClass145_2 ? Static132.aClass84_32.method1678(Static167.anInt3118) : Static440.aClass84_101.method1678(Static167.anInt3118);
				if (arg1.anInt6664 > arg1.anInt6652) {
					local186 = arg1.method5252() + (local60 ? Static161.method2441(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652, arg1.anInt6652) : "<col=ffffff>") + " (" + local138 + arg1.anInt6652 + "+" + (arg1.anInt6664 - arg1.anInt6652) + ")";
				} else {
					local186 = arg1.method5252() + (local60 ? Static161.method2441(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652, arg1.anInt6652) : "<col=ffffff>") + " (" + local138 + arg1.anInt6652 + ")";
				}
			} else {
				local186 = arg1.method5252() + " (" + Static93.aClass84_27.method1678(Static167.anInt3118) + arg1.anInt6640 + ")";
			}
			if (Static138.aBoolean128) {
				if (!arg0 && (Static333.anInt5795 & 0x8) != 0) {
					Static423.method5681(0, 0, (long) arg1.anInt7097, 21, Static370.anInt6307, -1, false, Static254.aString36 + " -> <col=ffffff>" + local186, Static233.aString33, true);
				}
			} else if (arg0) {
				Static423.method5681(0, 0, 0L, -1, -1, 0, true, "", "<col=cccccc>" + local186, false);
			} else {
				for (@Pc(303) int local303 = 7; local303 >= 0; local303--) {
					if (Static386.aStringArray50[local303] != null) {
						@Pc(311) short local311 = 0;
						if (Static288.aClass145_3 == Static248.aClass145_2 && Static386.aStringArray50[local303].equalsIgnoreCase(Static86.aClass84_22.method1678(Static167.anInt3118))) {
							if (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652 < arg1.anInt6652) {
								local311 = 2000;
							}
							if (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6635 != 0 && arg1.anInt6635 != 0) {
								if (arg1.anInt6635 == Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6635) {
									local311 = 2000;
								} else {
									local311 = 0;
								}
							}
						} else if (Static271.aBooleanArray17[local303]) {
							local311 = 2000;
						}
						@Pc(372) short local372 = (short) (local311 + Static336.aShortArray81[local303]);
						local104 = Static266.anIntArray387[local303] == -1 ? Static449.anInt7703 : Static266.anIntArray387[local303];
						Static423.method5681(0, 0, (long) arg1.anInt7097, local372, local104, -1, false, "<col=ffffff>" + local186, Static386.aStringArray50[local303], true);
					}
				}
			}
			if (!arg0) {
				for (@Pc(422) Class1_Sub8 local422 = (Class1_Sub8) Static8.aClass266_2.method6000(); local422 != null; local422 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
					if (local422.anInt1758 == 8) {
						local422.aString12 = "<col=ffffff>" + local186;
						break;
					}
				}
			}
		} else if (Static138.aBoolean128 && (Static333.anInt5795 & 0x10) != 0) {
			Static423.method5681(0, 0, 0L, 51, Static370.anInt6307, -1, false, Static254.aString36 + " -> <col=ffffff>" + Static340.aClass84_80.method1678(Static167.anInt3118), Static233.aString33, true);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)I")
	public static int method1703() {
		if (Static442.aClass219_14 == null) {
			if (!Static108.aBoolean111 && Static82.anInt1627 > 0) {
				if (Static40.aBoolean27 && Static102.aClass163_1.method3809(81) && Static82.anInt1627 > 2) {
					return ((Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262.aClass1_262).anInt1756;
				}
				return ((Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262).anInt1756;
			}
			@Pc(18) int local18 = Static16.aClass228_1.method5485();
			@Pc(22) int local22 = Static16.aClass228_1.method5486();
			@Pc(24) int local24 = Static309.anInt2246;
			@Pc(26) int local26 = Static24.anInt543;
			@Pc(28) int local28 = Static49.anInt5921;
			if (local18 > local24 && local28 + local24 > local18) {
				@Pc(46) int local46 = -1;
				@Pc(65) int local65;
				for (@Pc(48) int local48 = 0; local48 < Static82.anInt1627; local48++) {
					if (Static45.aBoolean35) {
						local65 = local26 + (Static82.anInt1627 + (-1 - local48)) * 16 + 33;
						if (local22 > local65 - 13 && local65 + 3 >= local22) {
							local46 = local48;
						}
					} else {
						local65 = local26 + (Static82.anInt1627 - local48 + -1) * 16 + 31;
						if (local65 - 13 < local22 && local65 + 3 >= local22) {
							local46 = local48;
						}
					}
				}
				if (local46 != -1) {
					local65 = 0;
					@Pc(131) Class93 local131 = new Class93(Static8.aClass266_2);
					for (@Pc(136) Class1_Sub8 local136 = (Class1_Sub8) local131.method1880(); local136 != null; local136 = (Class1_Sub8) local131.method1882()) {
						if (local65++ == local46) {
							return local136.anInt1756;
						}
					}
				}
			}
		}
		return -1;
	}
}

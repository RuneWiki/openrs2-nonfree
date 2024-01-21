import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_576 = Static38.method685("<img=0>");

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_577 = Static38.method685(":assistreq:");

	@OriginalMember(owner = "client!je", name = "l", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public static int anInt1827 = 0;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean67 = true;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLclient!wa;)I")
	public static int method1167(@OriginalArg(0) int arg0, @OriginalArg(2) Class87 arg1) {
		if (arg1.anIntArrayArray73 == null || arg0 >= arg1.anIntArrayArray73.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray73[arg0];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(37) int local37 = 0;
				@Pc(42) int local42 = local24[local33++];
				@Pc(44) byte local44 = 0;
				if (local42 == 0) {
					return local31;
				}
				if (local42 == 15) {
					local44 = 1;
				}
				if (local42 == 1) {
					local37 = Static155.anIntArray385[local24[local33++]];
				}
				if (local42 == 2) {
					local37 = Static95.anIntArray178[local24[local33++]];
				}
				if (local42 == 3) {
					local37 = Static56.anIntArray226[local24[local33++]];
				}
				@Pc(98) int local98;
				@Pc(109) Class87 local109;
				@Pc(114) int local114;
				@Pc(127) int local127;
				if (local42 == 4) {
					local98 = local24[local33++] << 16;
					@Pc(105) int local105 = local98 + local24[local33++];
					local109 = Static57.method940(local105);
					local114 = local24[local33++];
					if (local114 != -1 && (!Static92.method1502(local114).aBoolean79 || Static19.aBoolean17)) {
						for (local127 = 0; local127 < local109.anIntArray396.length; local127++) {
							if (local114 + 1 == local109.anIntArray396[local127]) {
								local37 += local109.anIntArray399[local127];
							}
						}
					}
				}
				if (local42 == 16) {
					local44 = 2;
				}
				if (local42 == 17) {
					local44 = 3;
				}
				if (local42 == 5) {
					local37 = Static11.anIntArray9[local24[local33++]];
				}
				if (local42 == 6) {
					local37 = Class56.anIntArray215[Static95.anIntArray178[local24[local33++]] - 1];
				}
				if (local42 == 7) {
					local37 = Static11.anIntArray9[local24[local33++]] * 100 / 46875;
				}
				if (local42 == 8) {
					local37 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt941;
				}
				if (local42 == 9) {
					for (local98 = 0; local98 < 25; local98++) {
						if (Static155.aBooleanArray20[local98]) {
							local37 += Static95.anIntArray178[local98];
						}
					}
				}
				if (local42 == 10) {
					local98 = local24[local33++] << 16;
					local98 += local24[local33++];
					local109 = Static57.method940(local98);
					local114 = local24[local33++];
					if (local114 != -1 && (!Static92.method1502(local114).aBoolean79 || Static19.aBoolean17)) {
						for (local127 = 0; local127 < local109.anIntArray396.length; local127++) {
							if (local114 + 1 == local109.anIntArray396[local127]) {
								local37 = 999999999;
								break;
							}
						}
					}
				}
				if (local42 == 11) {
					local37 = Static135.anInt3141;
				}
				if (local42 == 12) {
					local37 = Static139.anInt3260;
				}
				if (local42 == 13) {
					local98 = Static11.anIntArray9[local24[local33++]];
					@Pc(319) int local319 = local24[local33++];
					local37 = (0x1 << local319 & local98) == 0 ? 0 : 1;
				}
				if (local42 == 14) {
					local98 = local24[local33++];
					local37 = Static182.method2812(local98);
				}
				if (local42 == 18) {
					local37 = Static2.anInt66 + (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 >> 7);
				}
				if (local42 == 19) {
					local37 = Static176.anInt4061 + (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 >> 7);
				}
				if (local42 == 20) {
					local37 = local24[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local31 += local37;
					}
					if (local35 == 1) {
						local31 -= local37;
					}
					if (local35 == 2 && local37 != 0) {
						local31 /= local37;
					}
					if (local35 == 3) {
						local31 *= local37;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(423) Exception local423) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
	public static int method1168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub17 local18 = (Class2_Sub17) Static89.aClass16_7.method479((long) arg0);
		if (local18 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local18.anIntArray239.length) {
			return local18.anIntArray239[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)I")
	public static int method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = arg1 / arg2;
		@Pc(28) int local28 = Static65.method1036(local7, local23);
		@Pc(40) int local40 = Static65.method1036(local7 + 1, local23);
		@Pc(47) int local47 = Static65.method1036(local7, local23 + 1);
		@Pc(56) int local56 = Static65.method1036(local7 + 1, local23 - -1);
		@Pc(63) int local63 = Static8.method98(local28, local13, local40, arg2);
		@Pc(70) int local70 = Static8.method98(local47, local13, local56, arg2);
		return Static8.method98(local63, local19, local70, arg2);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public static void method1170(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub17 local10 = (Class2_Sub17) Static89.aClass16_7.method479((long) arg0);
		if (local10 != null) {
			local10.method2808();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method1172() {
		aLongArray2 = null;
		aClass6_577 = null;
		anIntArray121 = null;
		aClass6_576 = null;
	}
}

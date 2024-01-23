import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bk", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!bk", name = "Z", descriptor = "Lclient!c;")
	public static Class17 aClass17_3 = new Class17();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)Lclient!fb;")
	public static Class49 method554(@OriginalArg(0) int arg0) {
		@Pc(10) Class49 local10 = (Class49) Static51.aClass172_10.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static284.aClass22_99.method665(3, arg0);
		local10 = new Class49();
		if (local20 != null) {
			local10.method1232(new Class4_Sub24(local20));
		}
		Static51.aClass172_10.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!qe;BIII)V")
	public static void method558(@OriginalArg(0) Class13_Sub5_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static72.aClass13_Sub5_Sub1_1 == arg0 || Static286.anInt5602 >= 400) {
			return;
		}
		@Pc(144) String local144;
		if (arg0.anInt4450 == 0) {
			@Pc(23) boolean local23 = true;
			if (Static72.aClass13_Sub5_Sub1_1.anInt4465 != -1 && arg0.anInt4465 != -1) {
				@Pc(43) int local43 = arg0.anInt4452 < Static72.aClass13_Sub5_Sub1_1.anInt4452 ? Static72.aClass13_Sub5_Sub1_1.anInt4452 : arg0.anInt4452;
				@Pc(58) int local58 = Static72.aClass13_Sub5_Sub1_1.anInt4465 >= arg0.anInt4465 ? arg0.anInt4465 : Static72.aClass13_Sub5_Sub1_1.anInt4465;
				@Pc(68) int local68 = local43 * 10 / 100 + local58 + 5;
				@Pc(75) int local75 = Static72.aClass13_Sub5_Sub1_1.anInt4452 - arg0.anInt4452;
				if (local75 < 0) {
					local75 = -local75;
				}
				if (local75 > local68) {
					local23 = false;
				}
			}
			@Pc(102) String local102 = Static122.anInt2465 == 1 ? Static47.aString37 : Static98.aString75;
			if (arg0.anInt4451 <= arg0.anInt4452) {
				local144 = arg0.method3494() + (local23 ? Static84.method1417(Static72.aClass13_Sub5_Sub1_1.anInt4452, arg0.anInt4452) : "<col=ffffff>") + " (" + local102 + arg0.anInt4452 + ")";
			} else {
				local144 = arg0.method3494() + (local23 ? Static84.method1417(Static72.aClass13_Sub5_Sub1_1.anInt4452, arg0.anInt4452) : "<col=ffffff>") + " (" + local102 + arg0.anInt4452 + "+" + (arg0.anInt4451 - arg0.anInt4452) + ")";
			}
		} else {
			local144 = arg0.method3494() + " (" + Static41.aString32 + arg0.anInt4450 + ")";
		}
		@Pc(272) int local272;
		if (Static116.anInt5523 == 1) {
			Static140.method2241((short) 57, Static137.aString92 + " -> <col=ffffff>" + local144, Static118.aString86, Static303.anInt5779, (long) arg3, arg1, arg2);
		} else if (!Static145.aBoolean386) {
			for (local272 = 7; local272 >= 0; local272--) {
				if (Static188.aStringArray35[local272] != null) {
					@Pc(290) short local290 = 0;
					if (Static122.anInt2465 == 0 && Static188.aStringArray35[local272].equalsIgnoreCase(Static31.aString26)) {
						if (arg0.anInt4452 > Static72.aClass13_Sub5_Sub1_1.anInt4452) {
							local290 = 2000;
						}
						if (Static72.aClass13_Sub5_Sub1_1.anInt4462 != 0 && arg0.anInt4462 != 0) {
							if (Static72.aClass13_Sub5_Sub1_1.anInt4462 == arg0.anInt4462) {
								local290 = 2000;
							} else {
								local290 = 0;
							}
						}
					} else if (aBooleanArray11[local272]) {
						local290 = 2000;
					}
					@Pc(346) short local346 = Static131.aShortArray27[local272];
					@Pc(351) short local351 = (short) (local346 + local290);
					Static140.method2241(local351, "<col=ffffff>" + local144, Static188.aStringArray35[local272], Static47.anIntArray114[local272], (long) arg3, arg1, arg2);
				}
			}
		} else if ((Static282.anInt5536 & 0x8) != 0) {
			Static140.method2241((short) 22, Static160.aString115 + " -> <col=ffffff>" + local144, Static201.aString139, Static43.anInt871, (long) arg3, arg1, arg2);
		}
		for (local272 = 0; local272 < Static286.anInt5602; local272++) {
			if (Static256.aShortArray81[local272] == 15) {
				Static156.aStringArray21[local272] = "<col=ffffff>" + local144;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method561(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
			@Pc(33) int local33 = arg1[local18 + arg0] & 0xFF;
			if (local33 != 0) {
				if (local33 >= 128 && local33 < 160) {
					@Pc(53) char local53 = Static162.aCharArray2[local33 - 128];
					if (local53 == '\u0000') {
						local53 = '?';
					}
					local33 = local53;
				}
				local8[local10++] = (char) local33;
			}
		}
		return new String(local8, 0, local10);
	}
}

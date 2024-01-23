import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Lclient!db;")
	public static Class31 aClass31_17 = new Class31(64);

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt1931 = 0;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public static int anInt1932 = 0;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public static int anInt1933 = -1;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString59 = "cyan:";

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString60 = "skill: ";

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZII)V")
	public static void method1648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(1, arg1);
		local8.method1859();
		local8.anInt2282 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
	public static void method1649(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = Static241.anInt4977;
		if (arg0 == 0) {
			local3 = 1;
		}
		@Pc(10) int local10;
		@Pc(28) Class6_Sub6_Sub2 local28;
		@Pc(80) int local80;
		@Pc(174) int local174;
		@Pc(192) int local192;
		@Pc(204) int local204;
		@Pc(209) int local209;
		@Pc(102) int local102;
		for (local10 = 0; local10 < local3; local10++) {
			if (arg0 == 0) {
				local28 = Static28.aClass6_Sub6_Sub2_1;
			} else {
				local28 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local10]];
			}
			if (local28 != null && local28.method3514()) {
				@Pc(46) int local46 = local28.method3509();
				if (arg0 == 0 || local46 == arg0) {
					@Pc(75) int local75;
					if (local46 == 1) {
						if ((local28.anInt4562 & 0x7F) == 64 && (local28.anInt4569 & 0x7F) == 64) {
							local75 = local28.anInt4562 >> 7;
							local80 = local28.anInt4569 >> 7;
							if (local75 >= 0 && local75 < 104 && local80 >= 0 && local80 < 104) {
								local102 = Static232.anIntArrayArray39[local75][local80]++;
							}
						}
					} else if (((local46 & 0x1) != 0 || (local28.anInt4562 & 0x7F) == 0 && (local28.anInt4569 & 0x7F) == 0) && ((local46 & 0x1) != 1 || (local28.anInt4562 & 0x7F) == 64 && (local28.anInt4569 & 0x7F) == 64)) {
						local80 = local28.anInt4569 - local46 * 64 >> 7;
						local75 = local28.anInt4562 - local46 * 64 >> 7;
						local174 = local75 + local28.method3509();
						if (local75 < 0) {
							local75 = 0;
						}
						if (local174 > 104) {
							local174 = 104;
						}
						local192 = local28.method3509() + local80;
						if (local192 > 104) {
							local192 = 104;
						}
						if (local80 < 0) {
							local80 = 0;
						}
						for (local204 = local75; local204 < local174; local204++) {
							for (local209 = local80; local209 < local192; local209++) {
								local102 = Static232.anIntArrayArray39[local204][local209]++;
							}
						}
					}
				}
			}
		}
		label222: for (local10 = 0; local10 < local3; local10++) {
			@Pc(256) long local256;
			if (arg0 == 0) {
				local256 = 8791798054912L;
				local28 = Static28.aClass6_Sub6_Sub2_1;
			} else {
				local256 = (long) Static143.anIntArray331[local10] << 32;
				local28 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local10]];
			}
			if (local28 != null && local28.method3514()) {
				local80 = local28.method3509();
				if (arg0 == 0 || local80 == arg0) {
					local28.aBoolean344 = false;
					local28.aBoolean339 = true;
					if ((Static294.aBoolean443 && Static241.anInt4977 > 200 || Static241.anInt4977 > 50) && arg0 != 0 && local28.anInt4544 == local28.method3503().anInt2197) {
						local28.aBoolean344 = true;
					}
					if (local80 == 1) {
						if ((local28.anInt4562 & 0x7F) == 64 && (local28.anInt4569 & 0x7F) == 64) {
							local174 = local28.anInt4562 >> 7;
							local192 = local28.anInt4569 >> 7;
							if (local174 < 0 || local174 >= 104 || local192 < 0 || local192 >= 104) {
								continue;
							}
							if (Static232.anIntArrayArray39[local174][local192] > 1) {
								local102 = Static232.anIntArrayArray39[local174][local192]--;
								continue;
							}
						}
					} else if ((local80 & 0x1) == 0 && (local28.anInt4562 & 0x7F) == 0 && (local28.anInt4569 & 0x7F) == 0 || (local80 & 0x1) == 1 && (local28.anInt4562 & 0x7F) == 64 && (local28.anInt4569 & 0x7F) == 0) {
						local174 = local28.anInt4562 - local80 * 64 >> 7;
						local192 = local28.anInt4569 - local80 * 64 >> 7;
						local204 = local80 + local174;
						if (local204 > 104) {
							local204 = 104;
						}
						if (local174 < 0) {
							local174 = 0;
						}
						@Pc(406) boolean local406 = true;
						local209 = local80 + local192;
						if (local209 > 104) {
							local209 = 104;
						}
						if (local192 < 0) {
							local192 = 0;
						}
						@Pc(425) int local425;
						@Pc(430) int local430;
						for (local425 = local174; local425 < local204; local425++) {
							for (local430 = local192; local430 < local209; local430++) {
								if (Static232.anIntArrayArray39[local425][local430] <= 1) {
									local406 = false;
									break;
								}
							}
						}
						if (local406) {
							local425 = local174;
							while (true) {
								if (local425 >= local204) {
									continue label222;
								}
								for (local430 = local192; local430 < local209; local430++) {
									local102 = Static232.anIntArrayArray39[local425][local430]--;
								}
								local425++;
							}
						}
					}
					if (local28.anObject6 == null || local28.anInt4534 > Static261.anInt5259 || Static261.anInt5259 >= local28.anInt4518) {
						local28.aBoolean339 = false;
						local28.anInt4533 = Static124.method1919(Static159.anInt2978, local28.anInt4562, local28.anInt4569);
						Static279.method4292(Static159.anInt2978, local28.anInt4562, local28.anInt4569, local28.anInt4533, (local80 - 1) * 64 + 60, local28, local28.anInt4511, local256, local28.aBoolean340);
					} else {
						local28.aBoolean344 = false;
						local28.aBoolean339 = false;
						local28.anInt4533 = Static124.method1919(Static159.anInt2978, local28.anInt4562, local28.anInt4569);
						Static63.method1052(Static159.anInt2978, local28.anInt4562, local28.anInt4569, local28.anInt4533, local28, local28.anInt4511, local256, local28.anInt4556, local28.anInt4504, local28.anInt4547, local28.anInt4540);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)I")
	public static int method1650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Lclient!bc;")
	public static Class1 aClass1_33;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1705 = Static120.method1824("glow1:");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1702 = aClass80_1705;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1703 = aClass80_1705;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1704 = Static120.method1824(":chalreq:");

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!af;")
	public static final Class5 aClass5_64 = new Class5(50);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public static int anInt4403 = 0;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public static int anInt4405 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!bc;ZIILclient!bc;)Lclient!e;")
	public static Class3_Sub1_Sub6 method3099(@OriginalArg(0) Class1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class1 arg2) {
		@Pc(10) int[] local10 = arg0.method36(arg1);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(34) byte[] local34 = arg0.method59(arg1, local10[local14]);
			if (local34 == null) {
				local12 = false;
			} else {
				@Pc(54) int local54 = local34[1] & 0xFF | (local34[0] & 0xFF) << 8;
				@Pc(70) byte[] local70 = arg2.method59(local54, 0);
				if (local70 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub6(arg0, arg2, arg1, false);
		} catch (@Pc(96) Exception local96) {
			return null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!bc;)[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] method3100(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		return Static73.method1102(arg1, arg0) ? Static157.method2499() : null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZI)I")
	public static int method3102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = 256 - arg0;
		return ((arg1 & 0xFF00) * local4 + arg0 * (arg2 & 0xFF00) & 0xFF0000) + (local4 * (arg1 & 0xFF00FF) + (arg0 * (arg2 & 0xFF00FF)) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!ve;II)V")
	public static void method3103(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub4_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1 == arg1 || Static173.anInt3892 >= 400) {
			return;
		}
		@Pc(63) Class80 local63;
		if (arg1.anInt4333 == 0) {
			local63 = Static154.method2467(new Class80[] { arg1.aClass80_1689, Static184.method2972(arg1.anInt4341, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4341), Static71.aClass80_612, Static47.aClass80_400, Static83.method1219(arg1.anInt4341), Static154.aClass80_1335 });
		} else {
			local63 = Static154.method2467(new Class80[] { arg1.aClass80_1689, Static71.aClass80_612, Static19.aClass80_142, Static83.method1219(arg1.anInt4333), Static154.aClass80_1335 });
		}
		@Pc(168) int local168;
		if (Static7.anInt221 == 1) {
			Static16.method273((short) 58, (long) arg0, Static17.aClass80_131, arg2, Static154.method2467(new Class80[] { Static134.aClass80_1289, Static116.aClass80_1741, local63 }), arg3);
		} else if (!Static162.aBoolean147) {
			for (local168 = 7; local168 >= 0; local168--) {
				if (Static122.aClass80Array19[local168] != null) {
					@Pc(180) short local180 = 0;
					if (Static44.anInt1010 == 0 && Static122.aClass80Array19[local168].method2432(Static54.aClass80_465)) {
						if (arg1.anInt4341 > Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4341) {
							local180 = 2000;
						}
						if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4346 != 0 && arg1.anInt4346 != 0) {
							if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4346 == arg1.anInt4346) {
								local180 = 2000;
							} else {
								local180 = 0;
							}
						}
					} else if (Static139.aBooleanArray17[local168]) {
						local180 = 2000;
					}
					@Pc(237) short local237 = Static131.aShortArray54[local168];
					@Pc(242) short local242 = (short) (local237 + local180);
					Static16.method273(local242, (long) arg0, Static122.aClass80Array19[local168], arg2, Static154.method2467(new Class80[] { Static141.aClass80_1179, local63 }), arg3);
				}
			}
		} else if ((Static33.anInt778 & 0x8) == 8) {
			Static16.method273((short) 21, (long) arg0, Static44.aClass80_376, arg2, Static154.method2467(new Class80[] { Static38.aClass80_309, Static116.aClass80_1741, local63 }), arg3);
		}
		for (local168 = 0; local168 < Static173.anInt3892; local168++) {
			if (Static160.aShortArray46[local168] == 30) {
				Static18.aClass80Array5[local168] = Static154.method2467(new Class80[] { Static141.aClass80_1179, local63 });
				return;
			}
		}
	}
}

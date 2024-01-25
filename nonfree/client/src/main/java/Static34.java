import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_32 = new Class92(16, 8);

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public static int anInt927 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public static void method816(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(5, arg0);
		local8.method1563();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
	public static int method818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Z")
	public static boolean method820(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 2 || arg0 == 57 || arg0 == 48 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public static void method827() {
		Static258.aClipboard4 = null;
		Static226.aBoolean334 = false;
		Static357.method5085();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!bm;IIIIIZI)Z")
	public static boolean method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class23 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg6;
		@Pc(7) int local7 = arg7;
		@Pc(16) int local16 = arg6 - 64;
		@Pc(26) int local26 = arg7 - 64;
		Static184.anIntArrayArray30[64][64] = 99;
		Static438.anIntArrayArray65[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static342.anIntArray456[0] = arg6;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static209.anIntArray314[0] = arg7;
		@Pc(54) int[][] local54 = arg3.anIntArrayArray4;
		while (local46 != local49) {
			local7 = Static209.anIntArray314[local46];
			local5 = Static342.anIntArray456[local46];
			@Pc(69) int local69 = local5 - arg3.anInt923;
			@Pc(74) int local74 = local5 - local16;
			@Pc(79) int local79 = local7 - local26;
			@Pc(85) int local85 = local7 - arg3.anInt926;
			local46 = local46 + 1 & 0xFFF;
			if (arg1 == -4) {
				if (local5 == arg4 && arg5 == local7) {
					Static402.anInt7002 = local7;
					Static304.anInt5567 = local5;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static79.method1399(arg4, arg5, arg0, arg9, 1, local5, 1, local7)) {
					Static402.anInt7002 = local7;
					Static304.anInt5567 = local5;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg3.method817(arg4, local5, arg2, 1, 1, arg0, arg5, local7, arg9)) {
					Static402.anInt7002 = local7;
					Static304.anInt5567 = local5;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg3.method823(arg5, arg2, local5, local7, arg4, arg0, 1, arg9)) {
					Static304.anInt5567 = local5;
					Static402.anInt7002 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg3.method831(arg1, arg4, arg8, local7, 1, local5, arg5)) {
					Static304.anInt5567 = local5;
					Static402.anInt7002 = local7;
					return true;
				}
			} else if (arg3.method819(1, arg5, arg8, local7, arg4, local5, arg1)) {
				Static304.anInt5567 = local5;
				Static402.anInt7002 = local7;
				return true;
			}
			@Pc(246) int local246 = Static438.anIntArrayArray65[local74][local79] + 1;
			if (local74 > 0 && Static184.anIntArrayArray30[local74 - 1][local79] == 0 && (local54[local69 - 1][local85] & 0x42240000) == 0) {
				Static342.anIntArray456[local49] = local5 - 1;
				Static209.anIntArray314[local49] = local7;
				local49 = local49 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local74 - 1][local79] = 2;
				Static438.anIntArrayArray65[local74 - 1][local79] = local246;
			}
			if (local74 < 127 && Static184.anIntArrayArray30[local74 + 1][local79] == 0 && (local54[local69 + 1][local85] & 0x60240000) == 0) {
				Static342.anIntArray456[local49] = local5 + 1;
				Static209.anIntArray314[local49] = local7;
				local49 = local49 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local74 + 1][local79] = 8;
				Static438.anIntArrayArray65[local74 + 1][local79] = local246;
			}
			if (local79 > 0 && Static184.anIntArrayArray30[local74][local79 - 1] == 0 && (local54[local69][local85 - 1] & 0x40A40000) == 0) {
				Static342.anIntArray456[local49] = local5;
				Static209.anIntArray314[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local74][local79 - 1] = 1;
				Static438.anIntArrayArray65[local74][local79 - 1] = local246;
			}
			if (local79 < 127 && Static184.anIntArrayArray30[local74][local79 + 1] == 0 && (local54[local69][local85 + 1] & 0x48240000) == 0) {
				Static342.anIntArray456[local49] = local5;
				Static209.anIntArray314[local49] = local7 + 1;
				Static184.anIntArrayArray30[local74][local79 + 1] = 4;
				local49 = local49 + 1 & 0xFFF;
				Static438.anIntArrayArray65[local74][local79 + 1] = local246;
			}
			if (local74 > 0 && local79 > 0 && Static184.anIntArrayArray30[local74 - 1][local79 - 1] == 0 && (local54[local69 - 1][local85 - 1] & 0x43A40000) == 0 && (local54[local69 - 1][local85] & 0x42240000) == 0 && (local54[local69][local85 - 1] & 0x40A40000) == 0) {
				Static342.anIntArray456[local49] = local5 - 1;
				Static209.anIntArray314[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local74 - 1][local79 - 1] = 3;
				Static438.anIntArrayArray65[local74 - 1][local79 - 1] = local246;
			}
			if (local74 < 127 && local79 > 0 && Static184.anIntArrayArray30[local74 + 1][local79 - 1] == 0 && (local54[local69 + 1][local85 - 1] & 0x60E40000) == 0 && (local54[local69 + 1][local85] & 0x60240000) == 0 && (local54[local69][local85 - 1] & 0x40A40000) == 0) {
				Static342.anIntArray456[local49] = local5 + 1;
				Static209.anIntArray314[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local74 + 1][local79 - 1] = 9;
				Static438.anIntArrayArray65[local74 + 1][local79 - 1] = local246;
			}
			if (local74 > 0 && local79 < 127 && Static184.anIntArrayArray30[local74 - 1][local79 + 1] == 0 && (local54[local69 - 1][local85 + 1] & 0x4E240000) == 0 && (local54[local69 - 1][local85] & 0x42240000) == 0 && (local54[local69][local85 + 1] & 0x48240000) == 0) {
				Static342.anIntArray456[local49] = local5 - 1;
				Static209.anIntArray314[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static184.anIntArrayArray30[local74 - 1][local79 + 1] = 6;
				Static438.anIntArrayArray65[local74 - 1][local79 + 1] = local246;
			}
			if (local74 < 127 && local79 < 127 && Static184.anIntArrayArray30[local74 + 1][local79 + 1] == 0 && (local54[local69 + 1][local85 + 1] & 0x78240000) == 0 && (local54[local69 + 1][local85] & 0x60240000) == 0 && (local54[local69][local85 + 1] & 0x48240000) == 0) {
				Static342.anIntArray456[local49] = local5 + 1;
				Static209.anIntArray314[local49] = local7 + 1;
				Static184.anIntArrayArray30[local74 + 1][local79 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static438.anIntArrayArray65[local74 + 1][local79 + 1] = local246;
			}
		}
		Static304.anInt5567 = local5;
		Static402.anInt7002 = local7;
		return false;
	}
}

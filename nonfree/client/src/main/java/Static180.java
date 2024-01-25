import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_5 = new Class129(0, 1);

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "[Lclient!lw;")
	public static final Class193_Sub1[] aClass193_Sub1Array1 = new Class193_Sub1[37];

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIILclient!jn;B)Z")
	public static boolean method3383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub4_Sub5 arg3) {
		if (!Static211.aBoolean331 || !Static260.aBoolean441) {
			return false;
		} else if (Static8.anInt519 < 100) {
			return false;
		} else if (Static267.method4826(arg0, arg2, arg1)) {
			@Pc(34) int local34 = arg1 << Static606.anInt10280;
			@Pc(38) int local38 = arg2 << Static606.anInt10280;
			@Pc(48) int local48 = Static148.aClass245Array1[arg0].method7583(arg2, arg1) - 1;
			@Pc(54) int local54 = local48 + arg3.method8425();
			if (arg3.aShort128 == 1) {
				if (!Static447.method6818(local54, local34, local38, local48, Static190.anInt4138 + local38, local54, local38, local34, local34)) {
					return false;
				} else if (Static447.method6818(local54, local34, local38, local48, Static190.anInt4138 + local38, local48, local38 + Static190.anInt4138, local34, local34)) {
					Static210.anInt4555++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort128 == 2) {
				if (!Static447.method6818(local54, local34, Static190.anInt4138 + local38, local48, Static190.anInt4138 + local38, local54, Static190.anInt4138 + local38, local34 - -Static190.anInt4138, local34)) {
					return false;
				} else if (Static447.method6818(local48, Static190.anInt4138 + local34, local38 + Static190.anInt4138, local48, local38 + Static190.anInt4138, local54, local38 + Static190.anInt4138, local34 - -Static190.anInt4138, local34)) {
					Static210.anInt4555++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort128 == 4) {
				if (!Static447.method6818(local54, local34 + Static190.anInt4138, local38, local48, Static190.anInt4138 + local38, local54, local38, Static190.anInt4138 + local34, Static190.anInt4138 + local34)) {
					return false;
				} else if (Static447.method6818(local54, Static190.anInt4138 + local34, local38, local48, local38 + Static190.anInt4138, local48, Static190.anInt4138 + local38, local34 - -Static190.anInt4138, Static190.anInt4138 + local34)) {
					Static210.anInt4555++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort128 == 8) {
				if (!Static447.method6818(local54, local34, local38, local48, local38, local54, local38, Static190.anInt4138 + local34, local34)) {
					return false;
				} else if (Static447.method6818(local48, local34 + Static190.anInt4138, local38, local48, local38, local54, local38, Static190.anInt4138 + local34, local34)) {
					Static210.anInt4555++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort128 == 16) {
				if (Static406.method6366(local48, Static375.anInt7139, local54, Static375.anInt7139, Static375.anInt7139 + local38, local34)) {
					Static210.anInt4555++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort128 == 32) {
				if (Static406.method6366(local48, Static375.anInt7139, local54, Static375.anInt7139, local38 + Static375.anInt7139, Static375.anInt7139 + local34)) {
					Static210.anInt4555++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort128 == 64) {
				if (Static406.method6366(local48, Static375.anInt7139, local54, Static375.anInt7139, local38, local34 + Static375.anInt7139)) {
					Static210.anInt4555++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort128 != 128) {
				return true;
			} else if (Static406.method6366(local48, Static375.anInt7139, local54, Static375.anInt7139, local38, local34)) {
				Static210.anInt4555++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIII)V")
	public static void method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(99) Class186 local99 = Static26.aClass186ArrayArrayArray1[arg1][arg2][arg3];
			if (local99 != null) {
				if (arg0 == 1) {
					local99.aShort64 = 0;
				} else if (arg0 == 2) {
					local99.aShort62 = 0;
				}
			}
			Static507.method7291();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static201.anInt7302; local27++) {
			@Pc(33) Class169 local33 = Static170.aClass169Array1[local27];
			if (arg0 == local33.aByte70 && arg2 == local33.aShort54 && local33.aShort55 == arg3 || arg2 == local33.aShort56 && local33.aShort55 == arg3) {
				if (Static201.anInt7302 != local27) {
					Static653.method6535(Static170.aClass169Array1, local27 + 1, Static170.aClass169Array1, local27, Static170.aClass169Array1.length - local27 - 1);
				}
				Static201.anInt7302--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)Lclient!lha;")
	public static Class186 method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static26.aClass186ArrayArrayArray1[0][arg1][arg2] != null && Static26.aClass186ArrayArrayArray1[0][arg1][arg2].aClass186_1 != null;
			if (local28 && arg0 >= Static618.anInt10427 - 1) {
				return null;
			}
			Static274.method4877(arg0, arg1, arg2);
		}
		return Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt6885;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!jj;")
	public static Class98 aClass98_10;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt6884 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V")
	public static void method5932(@OriginalArg(0) int arg0) {
		Static197.anInt3863 = arg0;
		Static250.aClass119_154.method3304();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
	public static void method5933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg1 + arg0; local7++) {
			for (local11 = arg3; local11 < arg3 + arg4; local11++) {
				if (local11 >= 0 && Static95.anInt6381 > local11 && local7 >= 0 && local7 < Static237.anInt4532) {
					Static109.anIntArrayArrayArray3[arg2][local11][local7] = arg2 <= 0 ? 0 : Static109.anIntArrayArrayArray3[arg2 - 1][local11][local7] - 240;
				}
			}
		}
		if (arg3 > 0 && arg3 < Static95.anInt6381) {
			for (local11 = arg0 + 1; local11 < arg1 + arg0; local11++) {
				if (local11 >= 0 && Static237.anInt4532 > local11) {
					Static109.anIntArrayArrayArray3[arg2][arg3][local11] = Static109.anIntArrayArrayArray3[arg2][arg3 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && arg0 < Static237.anInt4532) {
			for (local11 = arg3 + 1; local11 < arg3 + arg4; local11++) {
				if (local11 >= 0 && local11 < Static95.anInt6381) {
					Static109.anIntArrayArrayArray3[arg2][local11][arg0] = Static109.anIntArrayArrayArray3[arg2][local11][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || Static95.anInt6381 <= arg3 || Static237.anInt4532 <= arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 > 0 && Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0] != 0) {
				Static109.anIntArrayArrayArray3[arg2][arg3][arg0] = Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && Static109.anIntArrayArrayArray3[arg2][arg3][arg0 - 1] != 0) {
				Static109.anIntArrayArrayArray3[arg2][arg3][arg0] = Static109.anIntArrayArrayArray3[arg2][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0 - 1] != 0) {
				Static109.anIntArrayArrayArray3[arg2][arg3][arg0] = Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0] != Static109.anIntArrayArrayArray3[arg2 - 1][arg3 - 1][arg0]) {
			Static109.anIntArrayArrayArray3[arg2][arg3][arg0] = Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && Static109.anIntArrayArrayArray3[arg2 - 1][arg3][arg0 - 1] != Static109.anIntArrayArrayArray3[arg2][arg3][arg0 - 1]) {
			Static109.anIntArrayArrayArray3[arg2][arg3][arg0] = Static109.anIntArrayArrayArray3[arg2][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0 - 1] != Static109.anIntArrayArrayArray3[arg2 - 1][arg3 - 1][arg0 - 1]) {
			Static109.anIntArrayArrayArray3[arg2][arg3][arg0] = Static109.anIntArrayArrayArray3[arg2][arg3 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILclient!kl;)V")
	public static void method5934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62_Sub3 arg3) {
		if (Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static65.method1493(arg0, arg1, arg2);
		}
		Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2].aClass62_Sub3_1 = arg3;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBILclient!js;)V")
	public static void method5935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class105 arg2) {
		Static122.aClass105ArrayArray3[arg0][arg1] = arg2;
	}
}

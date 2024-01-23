import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "[Lclient!ih;")
	public static Class75[] aClass75Array2;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "Lclient!gi;")
	public static Class59 aClass59_2;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public static int anInt1336 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)I")
	public static int method1136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		} else {
			@Pc(22) int local22 = 128 - arg2;
			@Pc(40) int local40 = local22 * (arg1 >>> 7 & 0x1FE01FE) + (arg0 >>> 7 & 0x1FE01FE) * arg2 & 0xFF00FF00;
			@Pc(55) int local55 = local22 * (arg1 & 0xFF00FF) + arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00;
			return (local55 >> 7) + local40;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z")
	public static boolean method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static168.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static151.anInt2970) {
			return false;
		} else if (local7 == Static151.anInt2970) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static190.method3149(local22 + 1, Static154.anIntArrayArrayArray5[arg0][arg1][arg2], local26 + 1) && Static190.method3149(local22 + 128 - 1, Static154.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local26 + 1) && Static190.method3149(local22 + 128 - 1, Static154.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static190.method3149(local22 + 1, Static154.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static168.anIntArrayArrayArray8[arg0][arg1][arg2] = Static151.anInt2970;
				return true;
			} else {
				Static168.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static151.anInt2970;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(CILjava/lang/StringBuffer;I)Ljava/lang/StringBuffer;")
	public static StringBuffer method1138(@OriginalArg(2) StringBuffer arg0) {
		@Pc(4) int local4 = arg0.length();
		arg0.setLength(0);
		for (@Pc(21) int local21 = local4; local21 < 0; local21++) {
			arg0.setCharAt(local21, ' ');
		}
		return arg0;
	}
}

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Lclient!wo;")
	public static Class250 aClass250_1;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_46 = new Class48(0, -1);

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_47 = new Class48(18, 8);

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[5];

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "Lclient!o;")
	public static final Class169 aClass169_66 = new Class169("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V")
	public static void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static75.anInt1459; local8++) {
			@Pc(14) Rectangle local14 = Class198.aRectangleArray1[local8];
			if (arg2 < local14.width + local14.x && local14.x < arg1 + arg2 && local14.height + local14.y > arg0 && arg3 + arg0 > local14.y) {
				Static96.aBooleanArray9[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z")
	public static boolean method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static248.anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -Static252.anInt4374) {
			return false;
		} else if (local7 == Static252.anInt4374) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static365.anInt5876;
			@Pc(26) int local26 = arg2 << Static365.anInt5876;
			if (Static251.method3878(local22 + 1, Static229.aClass42Array3[arg0].method3060(arg1, arg2), local26 + 1) && Static251.method3878(local22 + Static53.anInt1116 - 1, Static229.aClass42Array3[arg0].method3060(arg1 + 1, arg2), local26 + 1) && Static251.method3878(local22 + Static53.anInt1116 - 1, Static229.aClass42Array3[arg0].method3060(arg1 + 1, arg2 + 1), local26 + Static53.anInt1116 - 1) && Static251.method3878(local22 + 1, Static229.aClass42Array3[arg0].method3060(arg1, arg2 + 1), local26 + Static53.anInt1116 - 1)) {
				Static248.anIntArrayArrayArray12[arg0][arg1][arg2] = Static252.anInt4374;
				return true;
			} else {
				Static248.anIntArrayArrayArray12[arg0][arg1][arg2] = -Static252.anInt4374;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static140.method5231(arg1, Static264.anInt4589, Static194.anInt3448);
		@Pc(17) int local17 = Static140.method5231(arg4, Static264.anInt4589, Static194.anInt3448);
		@Pc(23) int local23 = Static140.method5231(arg6, Static98.anInt1774, Static372.anInt1561);
		@Pc(29) int local29 = Static140.method5231(arg2, Static98.anInt1774, Static372.anInt1561);
		@Pc(37) int local37 = Static140.method5231(arg1 + arg5, Static264.anInt4589, Static194.anInt3448);
		@Pc(46) int local46 = Static140.method5231(arg4 - arg5, Static264.anInt4589, Static194.anInt3448);
		for (@Pc(56) int local56 = local11; local56 < local37; local56++) {
			Static382.method5419(Static369.anIntArrayArray35[local56], local23, local29, arg0);
		}
		for (@Pc(76) int local76 = local17; local76 > local46; local76--) {
			Static382.method5419(Static369.anIntArrayArray35[local76], local23, local29, arg0);
		}
		@Pc(98) int local98 = Static140.method5231(arg6 + arg5, Static98.anInt1774, Static372.anInt1561);
		@Pc(107) int local107 = Static140.method5231(arg2 - arg5, Static98.anInt1774, Static372.anInt1561);
		for (@Pc(109) int local109 = local37; local109 <= local46; local109++) {
			@Pc(115) int[] local115 = Static369.anIntArrayArray35[local109];
			Static382.method5419(local115, local23, local98, arg0);
			Static382.method5419(local115, local98, local107, arg3);
			Static382.method5419(local115, local107, local29, arg0);
		}
	}
}

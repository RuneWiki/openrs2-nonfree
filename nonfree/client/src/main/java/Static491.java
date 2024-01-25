import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII)V")
	public static void method6548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(14) int local14 = arg3 - arg0;
		if (local10 == 0) {
			if (local14 != 0) {
				Static428.method6591(arg3, arg0, arg1, arg2);
			}
		} else if (local14 == 0) {
			Static545.method7798(arg2, arg4, arg0, arg1);
		} else {
			@Pc(43) int local43 = (local14 << 12) / local10;
			@Pc(52) int local52 = arg0 - (arg2 * local43 >> 12);
			@Pc(69) int local69;
			@Pc(67) int local67;
			if (Static7.anInt8119 > arg4) {
				local67 = local52 + (Static7.anInt8119 * local43 >> 12);
				local69 = Static7.anInt8119;
			} else if (arg4 <= Static34.anInt603) {
				local67 = arg3;
				local69 = arg4;
			} else {
				local67 = (local43 * Static34.anInt603 >> 12) + local52;
				local69 = Static34.anInt603;
			}
			@Pc(106) int local106;
			@Pc(114) int local114;
			if (arg2 < Static7.anInt8119) {
				local106 = Static7.anInt8119;
				local114 = local52 + (Static7.anInt8119 * local43 >> 12);
			} else if (Static34.anInt603 < arg2) {
				local106 = Static34.anInt603;
				local114 = (Static34.anInt603 * local43 >> 12) + local52;
			} else {
				local114 = arg0;
				local106 = arg2;
			}
			if (local114 < Static328.anInt6154) {
				local114 = Static328.anInt6154;
				local106 = (Static328.anInt6154 - local52 << 12) / local43;
			} else if (Static394.anInt7462 < local114) {
				local106 = (Static394.anInt7462 - local52 << 12) / local43;
				local114 = Static394.anInt7462;
			}
			if (local67 < Static328.anInt6154) {
				local69 = (Static328.anInt6154 - local52 << 12) / local43;
				local67 = Static328.anInt6154;
			} else if (Static394.anInt7462 < local67) {
				local69 = (Static394.anInt7462 - local52 << 12) / local43;
				local67 = Static394.anInt7462;
			}
			Static493.method7267(local106, arg1, local69, local114, local67);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
	public static void method6549() {
		if (Static281.aClass104_1 != null) {
			Static281.aClass104_1.method7807();
		}
		if (Static465.aClass104_2 != null) {
			Static465.aClass104_2.method7807();
		}
	}
}

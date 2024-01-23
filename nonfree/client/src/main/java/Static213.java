import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public static int anInt4465;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString225 = "K";

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
	public static int anInt4460 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method3619(@OriginalArg(1) Class84 arg0) {
		Static111.aClass84_48 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!mn;B)V")
	public static void method3620(@OriginalArg(0) Class115 arg0) {
		@Pc(11) Class115 local11 = Static15.method321(arg0);
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (local11 == null) {
			local19 = Static20.anInt1235;
			local16 = Static257.anInt5343;
		} else {
			local16 = local11.anInt3555;
			local19 = local11.anInt3487;
		}
		Static14.method309(false, arg0, local19, local16);
		Static229.method4361(arg0, local16, local19);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method3622() {
		Static146.aClass46_25.method1068(5);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static26.anInt551 + arg0 * Static239.anInt4868 >> 16;
		@Pc(19) int local19 = arg3 * Static239.anInt4868 - arg0 * Static26.anInt551 >> 16;
		@Pc(29) int local29 = arg1 * Static17.anInt431 + local19 * Static278.anInt5805 >> 16;
		@Pc(39) int local39 = arg1 * Static278.anInt5805 - local19 * Static17.anInt431 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static17.anInt431 + local19 * Static278.anInt5805 >> 16;
		@Pc(76) int local76 = arg2 * Static278.anInt5805 - local19 * Static17.anInt431 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static107.anInt2320 && local87 < Static107.anInt2320) {
			return false;
		} else if (local50 > Static176.anInt3789 && local87 > Static176.anInt3789) {
			return false;
		} else if (local56 < Static260.anInt5417 && local93 < Static260.anInt5417) {
			return false;
		} else {
			return local56 <= Static212.anInt4456 || local93 <= Static212.anInt4456;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIB)I")
	public static int method3625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = arg2 & 0xF;
		@Pc(34) int local34 = local15 >= 4 ? (local15 == 12 || local15 == 14 ? arg0 : arg3) : arg1;
		@Pc(43) int local43 = local15 >= 8 ? arg1 : arg0;
		return ((local15 & 0x2) == 0 ? local34 : -local34) + ((local15 & 0x1) == 0 ? local43 : -local43);
	}
}

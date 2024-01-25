import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!uaa", name = "p", descriptor = "Lclient!ov;")
	public static Class258 aClass258_1;

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "Z")
	public static boolean aBoolean651 = true;

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "[I")
	public static final int[] anIntArray546 = new int[3];

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIIIII)V")
	public static void method7392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(18) int local18 = arg2 * arg2;
		@Pc(22) int local22 = arg3 * arg3;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg3 << 1;
		@Pc(43) int local43 = local26 + (1 - local34) * local18;
		@Pc(51) int local51 = local22 - local30 * (local34 - 1);
		@Pc(55) int local55 = local18 << 2;
		@Pc(59) int local59 = local22 << 2;
		@Pc(67) int local67 = local26 * 3;
		@Pc(75) int local75 = local30 * ((arg3 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = local55 * (arg3 - 1);
		Static238.method3886(Static442.anIntArrayArray48[arg4], arg2 + arg0, arg1, arg0 - arg2);
		while (local14 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local67;
					local51 += local81;
					local7++;
					local81 += local59;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local43 += local67;
				local51 += local81;
				local81 += local59;
				local7++;
				local67 += local59;
			}
			local43 += -local87;
			local51 += -local75;
			local87 -= local55;
			local75 -= local55;
			local14--;
			@Pc(174) int local174 = arg4 - local14;
			@Pc(178) int local178 = local14 + arg4;
			@Pc(183) int local183 = arg0 + local7;
			@Pc(188) int local188 = arg0 - local7;
			Static238.method3886(Static442.anIntArrayArray48[local174], local183, arg1, local188);
			Static238.method3886(Static442.anIntArrayArray48[local178], local183, arg1, local188);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
	public static void method7393() {
		Static274.anInt5755 = 1;
		Static313.anInt6277 = -1;
		if (Static67.aString22 == null) {
			Static582.method8145(35);
		} else {
			@Pc(29) Class4_Sub13 local29 = new Class4_Sub13(Static61.method1377(Static499.method6523(Static67.aString22)));
			@Pc(33) long local33 = local29.method7026();
			Static26.aLong18 = local29.method7026();
			Static200.method3273(true, Static244.method7176(local33), "");
		}
	}
}

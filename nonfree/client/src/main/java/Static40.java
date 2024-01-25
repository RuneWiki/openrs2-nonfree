import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "Lclient!iba;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "Lclient!cb;")
	public static Class50 aClass50_7;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)Lclient!rr;")
	public static Class313 method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static129.aClass313ArrayArrayArray7[0][arg1][arg2] != null && Static129.aClass313ArrayArrayArray7[0][arg1][arg2].aClass313_1 != null;
			if (local28 && arg0 >= Static202.anInt3256 - 1) {
				return null;
			}
			Static116.method1852(arg0, arg1, arg2);
		}
		return Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIZ)V")
	public static void method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static439.method6578(arg0 + arg2, Static361.anInt6317, Static651.anInt10267);
		@Pc(31) int local31 = Static439.method6578(arg2 - arg0, Static361.anInt6317, Static651.anInt10267);
		Static343.method5202(local31, Static286.anIntArrayArray42[arg1], arg3, local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(87) int local87;
			@Pc(96) int local96;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg1 - local9;
				local69 = local9 + arg1;
				if (local69 >= Static128.anInt2200 && local65 <= Static380.anInt6585) {
					local87 = Static439.method6578(arg2 + local7, Static361.anInt6317, Static651.anInt10267);
					local96 = Static439.method6578(arg2 - local7, Static361.anInt6317, Static651.anInt10267);
					if (Static380.anInt6585 >= local69) {
						Static343.method5202(local96, Static286.anIntArrayArray42[local69], arg3, local87);
					}
					if (local65 >= Static128.anInt2200) {
						Static343.method5202(local96, Static286.anIntArrayArray42[local65], arg3, local87);
					}
				}
			}
			local7++;
			local65 = arg1 - local7;
			local69 = local7 + arg1;
			if (Static128.anInt2200 <= local69 && local65 <= Static380.anInt6585) {
				local87 = Static439.method6578(arg2 + local9, Static361.anInt6317, Static651.anInt10267);
				local96 = Static439.method6578(arg2 - local9, Static361.anInt6317, Static651.anInt10267);
				if (Static380.anInt6585 >= local69) {
					Static343.method5202(local96, Static286.anIntArrayArray42[local69], arg3, local87);
				}
				if (local65 >= Static128.anInt2200) {
					Static343.method5202(local96, Static286.anIntArrayArray42[local65], arg3, local87);
				}
			}
		}
	}
}

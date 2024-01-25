import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dja", name = "s", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!dja", name = "u", descriptor = "Lclient!mp;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!dja", name = "n", descriptor = "I")
	public static final int anInt2220 = 1;

	@OriginalMember(owner = "client!dja", name = "p", descriptor = "I")
	public static int anInt2222 = 0;

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)V")
	public static void method2050() {
		Static367.aClass3_Sub11_Sub14_4 = new Class3_Sub11_Sub14(Static601.aClass346_6.method8440(Static609.anInt9834), "", Static21.anInt510, 1004, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBIIII)V")
	public static void method2052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg4;
		@Pc(18) int local18 = arg0 * arg0;
		@Pc(22) int local22 = arg4 * arg4;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg4 << 1;
		@Pc(43) int local43 = local26 + local18 * (1 - local34);
		@Pc(52) int local52 = local22 - (local34 - 1) * local30;
		@Pc(56) int local56 = local18 << 2;
		@Pc(60) int local60 = local22 << 2;
		@Pc(68) int local68 = local26 * 3;
		@Pc(76) int local76 = ((arg4 << 1) - 3) * local30;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = (arg4 - 1) * local56;
		Static483.method7014(Static392.anIntArrayArray39[arg3], arg2 - arg0, arg0 + arg2, arg1);
		while (local14 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local52 += local82;
					local43 += local68;
					local82 += local60;
					local68 += local60;
					local12++;
				}
			}
			if (local52 < 0) {
				local43 += local68;
				local52 += local82;
				local82 += local60;
				local68 += local60;
				local12++;
			}
			local52 += -local76;
			local43 += -local88;
			local76 -= local56;
			local88 -= local56;
			local14--;
			@Pc(175) int local175 = arg3 - local14;
			@Pc(180) int local180 = arg3 + local14;
			@Pc(184) int local184 = local12 + arg2;
			@Pc(189) int local189 = arg2 - local12;
			Static483.method7014(Static392.anIntArrayArray39[local175], local189, local184, arg1);
			Static483.method7014(Static392.anIntArrayArray39[local180], local189, local184, arg1);
		}
	}
}

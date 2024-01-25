import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
	public static int anInt4525;

	@OriginalMember(owner = "client!nq", name = "Z", descriptor = "Lclient!wo;")
	public static Class216 aClass216_70;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "Z")
	public static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!nq", name = "db", descriptor = "I")
	public static int anInt4537 = 99;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!uo;IIBI)V")
	public static void method4078(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg1.method2226(arg3, arg2, arg3 + arg0, arg4 + arg2);
		arg1.method2191(-16777216, arg3, arg0, arg2, arg4);
		if (Static243.anInt4977 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static79.anInt4165 / (float) Static79.anInt4158;
		@Pc(38) int local38 = arg0;
		@Pc(40) int local40 = arg4;
		if (local36 < 1.0F) {
			local40 = (int) (local36 * (float) arg0);
		} else {
			local38 = (int) ((float) arg4 / local36);
		}
		@Pc(66) int local66 = arg3 + (arg0 - local38) / 2;
		@Pc(80) int local80 = arg2 + (arg4 - local40) / 2;
		if (Static141.aClass5_29 == null || arg0 != Static141.aClass5_29.method3629() || arg4 != Static141.aClass5_29.method3623()) {
			Static79.method3762(Static79.anInt4162, Static79.anInt4157 + Static79.anInt4165, Static79.anInt4162 + Static79.anInt4158, Static79.anInt4157, local66, local80, local66 + local38, local80 - -local40);
			Static79.method3749(arg1);
			Static141.aClass5_29 = arg1.method2219(local66, local80, local38, local40, false);
		}
		Static141.aClass5_29.method3621(local66, local80);
		@Pc(133) int local133 = Static31.anInt1091 * local38 / Static79.anInt4158;
		@Pc(139) int local139 = Static115.anInt2634 * local40 / Static79.anInt4165;
		@Pc(147) int local147 = local38 * Static106.anInt2535 / Static79.anInt4158 + local66;
		@Pc(162) int local162 = local80 + local40 - local139 - local40 * Static320.anInt5325 / Static79.anInt4165;
		@Pc(164) int local164 = -1996554240;
		if (Static8.anInt5875 == 1) {
			local164 = -1996488705;
		}
		arg1.method2241(local147, local162, local133, local139, local164, 1);
		arg1.method2200(local147, local162, local133, local139, local164, 0);
		if (Static339.anInt6507 <= 0) {
			return;
		}
		@Pc(196) int local196;
		if (Static139.anInt4713 <= 50) {
			local196 = Static139.anInt4713 * 5;
		} else {
			local196 = 500 - Static139.anInt4713 * 5;
		}
		for (@Pc(210) Class1_Sub27 local210 = (Class1_Sub27) Static79.aClass16_24.method410(); local210 != null; local210 = (Class1_Sub27) Static79.aClass16_24.method419()) {
			@Pc(217) Class139 local217 = Static255.method4606(local210.anInt4777);
			if (Static356.method5684(local217)) {
				@Pc(235) int local235;
				@Pc(246) int local246;
				if (local210.anInt4777 == Static128.anInt6686) {
					local235 = local66 + local210.anInt4779 * local38 / Static79.anInt4158;
					local246 = local80 + (Static79.anInt4165 - local210.anInt4774) * local40 / Static79.anInt4165;
					arg1.method2191(local196 << 24 | 0xFFFF00, local235 - 2, 4, local246 - 2, 4);
				} else if (Static259.anInt2903 != -1 && Static259.anInt2903 == local217.anInt4246) {
					local235 = local38 * local210.anInt4779 / Static79.anInt4158 + local66;
					local246 = (Static79.anInt4165 - local210.anInt4774) * local40 / Static79.anInt4165 + local80;
					arg1.method2191(local196 << 24 | 0xFFFF00, local235 - 2, 4, local246 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
	public static void method4079() {
		Static97.aClass12Array12 = null;
		Static118.method2492(0, 0, -1, Static89.anInt2231, 0, Static271.anInt5530, Static194.anInt4145, 0);
		if (Static97.aClass12Array12 != null) {
			Static34.method849(0, -1412584499, Static271.anInt5530, Static285.aClass12_12.anInt451, Static97.aClass12Array12, Static194.anInt4144, 0, Static194.anInt4145, Static135.anInt2981);
			Static97.aClass12Array12 = null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!aq;)V")
	public static void method4081(@OriginalArg(1) Class12 arg0) {
		@Pc(12) Class12 local12 = Static286.method4906(arg0);
		@Pc(16) int local16;
		@Pc(18) int local18;
		if (local12 == null) {
			local16 = Static194.anInt4145;
			local18 = Static271.anInt5530;
		} else {
			local16 = local12.lb;
			local18 = local12.anInt446;
		}
		Static14.method387(false, local18, local16, arg0);
		Static5.method196(arg0, local16, local18);
	}
}

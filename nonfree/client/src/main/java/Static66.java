import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!fs;")
	public static Class76 aClass76_70;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!ya;III)V")
	public static void method4399(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.OA(arg2, arg3, arg2 + arg0, arg4 + arg3);
		arg1.method4293(arg2, arg0, arg3, -16777216, arg4);
		if (Static69.anInt3429 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static148.anInt5733 / (float) Static148.anInt5729;
		@Pc(35) int local35 = arg0;
		@Pc(37) int local37 = arg4;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg0);
		} else {
			local35 = (int) ((float) arg4 / local33);
		}
		@Pc(64) int local64 = arg2 + (arg0 - local35) / 2;
		@Pc(73) int local73 = arg3 + (arg4 - local37) / 2;
		if (Static229.aClass57_18 == null || arg0 != Static229.aClass57_18.la() || Static229.aClass57_18.ma() != arg4) {
			Static148.method4513(Static148.anInt5732, Static148.anInt5724 + Static148.anInt5733, Static148.anInt5732 - -Static148.anInt5729, Static148.anInt5724, local64, local73, local64 + local35, local73 - -local37);
			Static148.method4508(arg1);
			Static229.aClass57_18 = arg1.method4280(local64, local73, local35, local37, false);
		}
		Static229.aClass57_18.method5534(local64, local73);
		@Pc(127) int local127 = Static17.anInt220 * local35 / Static148.anInt5729;
		@Pc(133) int local133 = Static384.anInt6470 * local37 / Static148.anInt5733;
		@Pc(149) int local149 = Static188.anInt5352 * local35 / Static148.anInt5729 + local64;
		@Pc(163) int local163 = local37 + local73 - local133 - Static455.anInt5537 * local37 / Static148.anInt5733;
		@Pc(165) int local165 = -1996554240;
		if (Static317.aClass121_2 == Static393.aClass121_3) {
			local165 = -1996488705;
		}
		arg1.O(local149, local163, local127, local133, local165, 1);
		arg1.method4312(local149, local163, local127, local133, local165, 0);
		if (Static140.anInt2835 <= 0) {
			return;
		}
		@Pc(202) int local202;
		if (Static274.anInt5136 > 50) {
			local202 = (100 - Static274.anInt5136) * 5;
		} else {
			local202 = Static274.anInt5136 * 5;
		}
		for (@Pc(213) Class4_Sub3 local213 = (Class4_Sub3) Static148.aClass183_41.method4140(); local213 != null; local213 = (Class4_Sub3) Static148.aClass183_41.method4144()) {
			@Pc(221) Class157 local221 = Static148.aClass182_3.method4124(local213.anInt234);
			if (Static428.method5473(local221)) {
				@Pc(247) int local247;
				@Pc(259) int local259;
				if (local213.anInt234 == Static85.anInt1763) {
					local247 = local64 + local213.anInt233 * local35 / Static148.anInt5729;
					local259 = local37 * (Static148.anInt5733 - local213.anInt228) / Static148.anInt5733 + local73;
					arg1.method4293(local247 - 2, 4, local259 - 2, local202 << 24 | 0xFFFF00, 4);
				} else if (Static402.anInt6662 != -1 && Static402.anInt6662 == local221.anInt4919) {
					local247 = local64 + local213.anInt233 * local35 / Static148.anInt5729;
					local259 = local37 * (Static148.anInt5733 - local213.anInt228) / Static148.anInt5733 + local73;
					arg1.method4293(local247 - 2, 4, local259 - 2, local202 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method4403() {
		Static208.aClass102_11.method2699();
	}
}

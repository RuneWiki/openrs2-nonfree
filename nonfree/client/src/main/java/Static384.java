import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!st", name = "o", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!st", name = "u", descriptor = "Z")
	public static volatile boolean aBoolean487 = true;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!l;Lclient!qa;IIIB)V")
	public static void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static165.anInt3267 < 100) {
			Static37.method698(arg2, arg1);
		}
		arg2.w(arg4, arg5, arg0 + arg4, arg3 + arg5);
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (Static165.anInt3267 < 100) {
			local32 = arg4 + arg0 / 2;
			local42 = arg3 / 2 + arg5 - 18 - 20;
			arg2.M(arg4, arg5, arg0, arg3, -16777216, 0);
			arg2.method2074(local32 - 152, local42, 304, 34, Static457.aColorArray3[Static35.anInt622].getRGB(), 0);
			arg2.M(local32 - 150, local42 + 2, Static165.anInt3267 * 3, 30, Static25.aColorArray1[Static35.anInt622].getRGB(), 0);
			Static247.aClass18_2.method5772(Static194.aColorArray2[Static35.anInt622].getRGB(), local32, local42 + 20, Static133.aClass21_34.method362(Static168.anInt3290), -1);
			return;
		}
		@Pc(106) int local106 = Static97.anInt2096 - (int) ((float) arg0 / Static425.aFloat64);
		local32 = Static241.anInt4715 + (int) ((float) arg3 / Static425.aFloat64);
		local42 = (int) ((float) arg0 / Static425.aFloat64) + Static97.anInt2096;
		Static421.anInt7288 = (int) ((float) (arg3 * 2) / Static425.aFloat64);
		Static69.anInt1699 = Static241.anInt4715 - (int) ((float) arg3 / Static425.aFloat64);
		@Pc(153) int local153 = Static241.anInt4715 - (int) ((float) arg3 / Static425.aFloat64);
		Static332.anInt5920 = Static97.anInt2096 - (int) ((float) arg0 / Static425.aFloat64);
		Static399.anInt7065 = (int) ((float) (arg0 * 2) / Static425.aFloat64);
		Static425.method3284(Static425.anInt3657 + local106, local32 + Static425.anInt3658, Static425.anInt3657 + local42, local153 - -Static425.anInt3658, arg4, arg5, arg4 + arg0, arg5 - -arg3 - -1);
		Static425.method3289(arg2);
		@Pc(200) Class91 local200 = Static425.method3271(arg2);
		Static177.method3241(arg2, local200);
		if (Static355.anInt6248 > 0) {
			Static399.anInt7064--;
			if (Static399.anInt7064 == 0) {
				Static355.anInt6248--;
				Static399.anInt7064 = 20;
			}
		}
		if (!Static244.aBoolean318) {
			return;
		}
		@Pc(234) int local234 = arg0 + arg4 - 5;
		@Pc(241) int local241 = arg5 + arg3 - 8;
		Static330.aClass18_3.method5759("Fps:" + Static286.anInt5318, local241, 16776960, local234);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static330.aClass18_3.method5759("Mem:" + local268 + "k", local256, local270, local234);
		local241 = local256 - 15;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)Lclient!bl;")
	public static Class11_Sub2 method5418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub2_1;
	}
}

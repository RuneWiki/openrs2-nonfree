import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	public static int anInt5727;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILclient!jg;B)V")
	public static void method4904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub22 arg4) {
		if (arg4.anInt3060 == -1 && arg4.anIntArray267 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg2 > arg4.anInt3057) {
			local15 = arg2 - arg4.anInt3057;
		} else if (arg4.anInt3052 > arg2) {
			local15 = arg4.anInt3052 - arg2;
		}
		@Pc(48) int local48 = arg4.anInt3048 * Static114.anInt4335 >> 8;
		if (arg4.anInt3059 < arg3) {
			local15 += arg3 - arg4.anInt3059;
		} else if (arg4.anInt3050 > arg3) {
			local15 += arg4.anInt3050 - arg3;
		}
		if (arg4.anInt3055 == 0 || arg4.anInt3055 < local15 - 64 || Static114.anInt4335 == 0 || arg4.anInt3058 != arg1) {
			if (arg4.aClass1_Sub1_Sub2_2 != null) {
				Static145.aClass1_Sub1_Sub4_1.method5037(arg4.aClass1_Sub1_Sub2_2);
				arg4.aClass1_Sub1_Sub2_2 = null;
			}
			if (arg4.aClass1_Sub1_Sub2_1 != null) {
				Static145.aClass1_Sub1_Sub4_1.method5037(arg4.aClass1_Sub1_Sub2_1);
				arg4.aClass1_Sub1_Sub2_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(136) int local136 = local48 * (arg4.anInt3055 - local15) / arg4.anInt3055;
		if (arg4.aClass1_Sub1_Sub2_2 != null) {
			arg4.aClass1_Sub1_Sub2_2.method4050(local136);
		} else if (arg4.anInt3060 >= 0) {
			@Pc(153) Class77 local153 = Static364.method2070(Static309.aClass216_93, arg4.anInt3060, 0);
			if (local153 != null) {
				@Pc(160) Class1_Sub15_Sub1 local160 = local153.method2069().method5363(Static278.aClass95_1);
				@Pc(165) Class1_Sub1_Sub2 local165 = Static370.method4057(local160, local136);
				local165.method4049(-1);
				Static145.aClass1_Sub1_Sub4_1.method5040(local165);
				arg4.aClass1_Sub1_Sub2_2 = local165;
			}
		}
		if (arg4.aClass1_Sub1_Sub2_1 != null) {
			arg4.aClass1_Sub1_Sub2_1.method4050(local136);
			if (arg4.aClass1_Sub1_Sub2_1.method5627()) {
				return;
			}
			arg4.aClass1_Sub1_Sub2_1 = null;
		} else if (arg4.anIntArray267 != null && (arg4.anInt3047 -= arg0) <= 0) {
			@Pc(202) int local202 = (int) (Math.random() * (double) arg4.anIntArray267.length);
			@Pc(210) Class77 local210 = Static364.method2070(Static309.aClass216_93, arg4.anIntArray267[local202], 0);
			if (local210 != null) {
				@Pc(217) Class1_Sub15_Sub1 local217 = local210.method2069().method5363(Static278.aClass95_1);
				@Pc(222) Class1_Sub1_Sub2 local222 = Static370.method4057(local217, local136);
				local222.method4049(0);
				Static145.aClass1_Sub1_Sub4_1.method5040(local222);
				arg4.anInt3047 = arg4.anInt3054 + (int) ((double) (arg4.anInt3056 - arg4.anInt3054) * Math.random());
				arg4.aClass1_Sub1_Sub2_1 = local222;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)I")
	public static int method4905() {
		return ((Static80.anInt2078 == 0 ? 0 : 1) << 20) + ((Static129.aBoolean269 ? 1 : 0) << 13) + ((Static163.anInt3549 & 0x3) << 11) + ((Static282.aBoolean648 ? 1 : 0) << 10) + ((Static336.aBoolean628 ? 1 : 0) << 9) + ((Static111.aBoolean254 ? 1 : 0) << 8) + ((Static221.aBoolean435 ? 1 : 0) << 4) + ((Static17.aBoolean55 ? 1 : 0) << 3) + (Static13.anInt489 & 0x7) + ((Static84.aBoolean195 ? 1 : 0) << 5) + ((Static125.aBoolean268 ? 1 : 0) << 6) + ((Static304.aBoolean580 ? 1 : 0) << 15) + ((Static306.aBoolean584 ? 1 : 0) << 16) + (Static324.anInt6232 << 17) + ((Static259.aBoolean281 ? 1 : 0) << 19) + ((Static167.anInt3605 == 0 ? 0 : 1) << 21) + ((Static114.anInt4335 == 0 ? 0 : 1) << 22) + (Static144.method2876() << 23) + (Static323.anInt6216 << 25) + ((Static348.aBoolean657 ? 1 : 0) << 27) + (Static204.anInt4306 << 28);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!aq;I)Lclient!aq;")
	public static Class12 method4906(@OriginalArg(0) Class12 arg0) {
		if (arg0.anInt459 != -1) {
			return Static9.method319(arg0.anInt459);
		}
		@Pc(20) int local20 = arg0.anInt465 >>> 16;
		@Pc(25) Class100 local25 = new Class100(Static351.aClass197_33);
		for (@Pc(30) Class1_Sub37 local30 = (Class1_Sub37) local25.method2753(); local30 != null; local30 = (Class1_Sub37) local25.method2754()) {
			if (local30.anInt6281 == local20) {
				return Static9.method319((int) local30.aLong213);
			}
		}
		return null;
	}
}

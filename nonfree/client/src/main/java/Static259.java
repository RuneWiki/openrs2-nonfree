import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "[I")
	public static final int[] anIntArray335 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "J")
	public static long aLong119 = 0L;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBIIIII)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static376.anInt7071 <= arg3 - arg4 && Class179_Sub2.lb >= arg4 + arg3 && arg5 - arg4 >= Static96.anInt2302 && Static289.anInt5545 >= arg5 + arg4) {
			Static292.method4796(arg2, arg0, arg5, arg4, arg1, arg3);
		} else {
			Static388.method6096(arg1, arg4, arg0, arg2, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIBILclient!oa;)V")
	public static void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9 arg4) {
		arg4.ca(arg0, arg3, arg0 + arg1, arg2 + arg3);
		arg4.method5409(arg2, arg1, -16777216, arg3, arg0);
		if (Static297.anInt4703 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static461.anInt53 / (float) Static461.anInt52;
		@Pc(36) int local36 = arg1;
		@Pc(38) int local38 = arg2;
		if (local34 < 1.0F) {
			local38 = (int) ((float) arg1 * local34);
		} else {
			local36 = (int) ((float) arg2 / local34);
		}
		@Pc(65) int local65 = arg3 + (arg2 - local38) / 2;
		@Pc(74) int local74 = arg0 + (arg1 - local36) / 2;
		if (Static549.aClass66_38 == null || Static549.aClass66_38.QA() != arg1 || Static549.aClass66_38.b() != arg2) {
			Static461.method87(Static461.anInt57, Static461.anInt58 + Static461.anInt53, Static461.anInt57 + Static461.anInt52, Static461.anInt58, local74, local65, local36 + local74, local38 + local65);
			Static461.method100(arg4);
			Static549.aClass66_38 = arg4.method5454(local74, local65, local36, local38, false);
		}
		Static549.aClass66_38.method8066(local74, local65);
		@Pc(121) int local121 = Static288.anInt5497 * local36 / Static461.anInt52;
		@Pc(127) int local127 = local38 * Static183.anInt4068 / Static461.anInt53;
		@Pc(140) int local140 = Static409.anInt7647 * local36 / Static461.anInt52 + local74;
		@Pc(154) int local154 = local65 + local38 - local38 * Static473.anInt8687 / Static461.anInt53 - local127;
		@Pc(156) int local156 = -1996554240;
		if (Static38.aClass162_1 == Static303.aClass162_2) {
			local156 = -1996488705;
		}
		arg4.C(local140, local154, local121, local127, local156, 1);
		arg4.method5436(local140, local154, local121, local127, local156, 0);
		if (Static137.anInt2914 <= 0) {
			return;
		}
		@Pc(191) int local191;
		if (Static447.anInt8208 > 50) {
			local191 = 500 - Static447.anInt8208 * 5;
		} else {
			local191 = Static447.anInt8208 * 5;
		}
		for (@Pc(202) Class6_Sub7 local202 = (Class6_Sub7) Static461.aClass211_2.method5183(); local202 != null; local202 = (Class6_Sub7) Static461.aClass211_2.method5177()) {
			@Pc(210) Class137 local210 = Static461.aClass42_2.method1147(local202.anInt1365);
			if (Static19.method1016(local210)) {
				@Pc(231) int local231;
				@Pc(244) int local244;
				if (Static221.anInt4650 == local202.anInt1365) {
					local231 = local36 * local202.anInt1361 / Static461.anInt52 + local74;
					local244 = local65 + (Static461.anInt53 - local202.anInt1366) * local38 / Static461.anInt53;
					arg4.method5409(4, 4, local191 << 24 | 0xFFFF00, local244 - 2, local231 - 2);
				} else if (Static339.anInt6292 != -1 && local210.anInt4326 == Static339.anInt6292) {
					local231 = local74 + local36 * local202.anInt1361 / Static461.anInt52;
					local244 = local65 + local38 * (Static461.anInt53 - local202.anInt1366) / Static461.anInt53;
					arg4.method5409(4, 4, local191 << 24 | 0xFFFF00, local244 - 2, local231 + -2);
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "[Lclient!oq;")
	public static Class2_Sub1[] aClass2_Sub1Array3;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public static int anInt6309;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public static void method5331() {
		Static109.aClass321ArrayArray1 = new Class321[Static582.aClass8_127.method279()][];
		Static202.aClass321ArrayArray2 = new Class321[Static582.aClass8_127.method279()][];
		Static643.aBooleanArray35 = new boolean[Static582.aClass8_127.method279()];
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ha;IIII)V")
	public static void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg2, arg3, arg2 + arg0, arg3 - -arg4);
		arg1.method7512(arg4, arg0, arg2, arg3, -16777216);
		if (Static115.anInt2066 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static528.anInt5369 / (float) Static528.anInt5364;
		@Pc(36) int local36 = arg0;
		@Pc(38) int local38 = arg4;
		if (local34 < 1.0F) {
			local38 = (int) ((float) arg0 * local34);
		} else {
			local36 = (int) ((float) arg4 / local34);
		}
		@Pc(69) int local69 = arg2 + (arg0 - local36) / 2;
		@Pc(77) int local77 = arg3 + (arg4 - local38) / 2;
		if (Static161.aClass9_20 == null || Static161.aClass9_20.method8938() != arg0 || arg4 != Static161.aClass9_20.method8918()) {
			Static528.method4530(Static528.anInt5361, Static528.anInt5369 + Static528.anInt5366, Static528.anInt5361 - -Static528.anInt5364, Static528.anInt5366, local69, local77, local69 + local36, local77 - -local38);
			Static528.method4535(arg1);
			Static161.aClass9_20 = arg1.method7476(local69, local77, local36, local38, false);
		}
		Static161.aClass9_20.method8920(local69, local77);
		@Pc(130) int local130 = Static340.anInt5881 * local36 / Static528.anInt5364;
		@Pc(136) int local136 = local38 * Static630.anInt6216 / Static528.anInt5369;
		@Pc(145) int local145 = local69 + Static262.anInt6203 * local36 / Static528.anInt5364;
		@Pc(160) int local160 = local77 + local38 - local136 - local38 * Static71.anInt1358 / Static528.anInt5369;
		@Pc(162) int local162 = -1996554240;
		if (Static457.aClass176_6 == Static427.aClass176_5) {
			local162 = -1996488705;
		}
		arg1.aa(local145, local160, local130, local136, local162, 1);
		arg1.method7481(local145, local160, local130, local136, local162, 0);
		if (Static30.anInt677 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static600.anInt9797 <= 50) {
			local195 = Static600.anInt9797 * 5;
		} else {
			local195 = 500 - Static600.anInt9797 * 5;
		}
		for (@Pc(209) Class6_Sub24 local209 = (Class6_Sub24) Static528.aClass362_26.method8538(); local209 != null; local209 = (Class6_Sub24) Static528.aClass362_26.method8530()) {
			@Pc(217) Class318 local217 = Static528.aClass280_3.method6911(local209.anInt3909);
			if (Static452.method6552(local217)) {
				@Pc(234) int local234;
				@Pc(246) int local246;
				if (local209.anInt3909 == Static645.anInt10427) {
					local234 = local69 + local36 * local209.anInt3903 / Static528.anInt5364;
					local246 = local77 + (Static528.anInt5369 - local209.anInt3910) * local38 / Static528.anInt5369;
					arg1.method7512(4, 4, local234 - 2, local246 + -2, local195 << 24 | 0xFFFF00);
				} else if (Static64.anInt1190 != -1 && Static64.anInt1190 == local217.anInt8700) {
					local234 = local36 * local209.anInt3903 / Static528.anInt5364 + local69;
					local246 = local77 + (Static528.anInt5369 - local209.anInt3910) * local38 / Static528.anInt5369;
					arg1.method7512(4, 4, local234 - 2, local246 + -2, local195 << 24 | 0xFFFF00);
				}
			}
		}
	}
}

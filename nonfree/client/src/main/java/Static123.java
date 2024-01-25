import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
	public static int anInt2950;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_151 = new Class159("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
	public static int anInt2949 = -1;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)I")
	public static int method2570(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static void method2571() {
		Static243.aClass47_10.method2662(((float) Static305.anInt6786 * 0.1F + 0.7F) * 1.1523438F);
		Static243.aClass47_10.method2746(Static40.anInt1098, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static243.aClass47_10.method2703(Static24.anInt495, -1);
		Static243.aClass47_10.method2739(Static6.aClass81_1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIILclient!vq;I)V")
	public static void method2572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class47 arg3, @OriginalArg(5) int arg4) {
		arg3.method2709(arg2, arg1, arg0 + arg2, arg1 + arg4);
		arg3.method2687(arg2, -16777216, arg0, arg1, arg4);
		if (Static72.anInt1882 < 100) {
			return;
		}
		@Pc(41) float local41 = (float) Static54.anInt4747 / (float) Static54.anInt4749;
		@Pc(43) int local43 = arg0;
		@Pc(45) int local45 = arg4;
		if (local41 < 1.0F) {
			local45 = (int) ((float) arg0 * local41);
		} else {
			local43 = (int) ((float) arg4 / local41);
		}
		@Pc(72) int local72 = arg2 + (arg0 - local43) / 2;
		@Pc(80) int local80 = arg1 + (arg4 - local45) / 2;
		if (Static297.aClass58_38 == null || arg0 != Static297.aClass58_38.method4279() || Static297.aClass58_38.method4274() != arg4) {
			Static54.method4155(Static54.anInt4745, Static54.anInt4747 + Static54.anInt4748, Static54.anInt4745 + Static54.anInt4749, Static54.anInt4748, local72, local80, local72 + local43, local80 + local45);
			Static54.method4169(arg3);
			Static297.aClass58_38 = arg3.method2733(local72, local80, local43, local45, false);
		}
		Static297.aClass58_38.method4269(local72, local80);
		@Pc(132) int local132 = Static205.anInt4310 * local43 / Static54.anInt4749;
		@Pc(138) int local138 = Static331.anInt6341 * local45 / Static54.anInt4747;
		@Pc(147) int local147 = local72 + Static73.anInt2036 * local43 / Static54.anInt4749;
		@Pc(161) int local161 = local80 + local45 - local138 - Static193.anInt4280 * local45 / Static54.anInt4747;
		@Pc(163) int local163 = -1996554240;
		if (Static330.anInt6312 == 1) {
			local163 = -1996488705;
		}
		arg3.method2682(local147, local161, local132, local138, local163, 1);
		arg3.method2759(local147, local161, local132, local138, local163, 0);
		if (Static33.anInt820 <= 0) {
			return;
		}
		@Pc(200) int local200;
		if (Static273.anInt5435 <= 50) {
			local200 = Static273.anInt5435 * 5;
		} else {
			local200 = (100 - Static273.anInt5435) * 5;
		}
		for (@Pc(214) Class4_Sub3 local214 = (Class4_Sub3) Static54.aClass116_40.method3270(); local214 != null; local214 = (Class4_Sub3) Static54.aClass116_40.method3272()) {
			@Pc(221) Class136 local221 = Static11.method223(local214.anInt210);
			if (Static218.method3956(local221)) {
				@Pc(238) int local238;
				@Pc(249) int local249;
				if (Static289.anInt5645 == local214.anInt210) {
					local238 = local214.anInt209 * local43 / Static54.anInt4749 + local72;
					local249 = local80 + (Static54.anInt4747 - local214.anInt212) * local45 / Static54.anInt4747;
					arg3.method2687(local238 - 2, local200 << 24 | 0xFFFF00, 4, local249 - 2, 4);
				} else if (Static138.anInt2999 != -1 && Static138.anInt2999 == local221.anInt4248) {
					local238 = local214.anInt209 * local43 / Static54.anInt4749 + local72;
					local249 = local80 + local45 * (Static54.anInt4747 - local214.anInt212) / Static54.anInt4747;
					arg3.method2687(local238 - 2, local200 << 24 | 0xFFFF00, 4, local249 - 2, 4);
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rja", name = "h", descriptor = "I")
	public static int anInt8668;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "I")
	public static int anInt8665 = 0;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)V")
	public static void method7341() {
		if (Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 0 && Static576.anInt9136 != Static407.anInt6944) {
			Static271.method4330(11, Static660.anInt10217, false, Static279.anInt5230);
		} else {
			Static102.method2009(Static582.aClass16_12);
			if (Static576.anInt9136 != Static265.anInt9359) {
				Static541.method7490();
			}
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIII)I")
	public static int method7342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 / arg2;
		@Pc(21) int local21 = arg0 & arg2 - 1;
		@Pc(25) int local25 = arg1 / arg2;
		@Pc(31) int local31 = arg2 - 1 & arg1;
		@Pc(36) int local36 = Static348.method5244(local15, local25);
		@Pc(43) int local43 = Static348.method5244(local15 + 1, local25);
		@Pc(50) int local50 = Static348.method5244(local15, local25 + 1);
		@Pc(59) int local59 = Static348.method5244(local15 + 1, local25 - -1);
		@Pc(66) int local66 = Static364.method5419(local21, arg2, local43, local36);
		@Pc(73) int local73 = Static364.method5419(local21, arg2, local59, local50);
		return Static364.method5419(local31, arg2, local73, local66);
	}
}

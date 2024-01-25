import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "Lclient!bm;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
	public static int anInt4513 = 0;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIII)V")
	public static void method4066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = Static230.aClass2_Sub54_15.lb.method7520() * arg2 >> 8;
		if (arg1 == -1 && !Static239.aBoolean367) {
			Static13.method7473();
		} else if (arg1 != -1 && (arg1 != Static143.anInt2682 || !Static604.method9048()) && local8 != 0 && !Static239.aBoolean367) {
			Static403.method6617(arg1, Static502.aClass124_105, local8, arg0);
			Static451.method7283();
		}
		if (arg1 != Static143.anInt2682) {
			Static134.aClass2_Sub26_Sub3_3 = null;
		}
		Static143.anInt2682 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLclient!d;Lclient!gga;)V")
	public static void method4068(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class124 arg1) {
		Static153.aClass124_42 = arg1;
		Static94.anInterface3_1 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
	public static void method4070(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static255.anInt4904 != 1) {
			return;
		}
		@Pc(15) int local15 = arg2 / Static532.anInt9333;
		@Pc(19) int local19 = arg3 / Static532.anInt9333;
		@Pc(27) int local27 = arg1 / Static341.anInt6402;
		@Pc(31) int local31 = arg0 / Static341.anInt6402;
		if (Static19.anInt353 <= local15 || local19 < 0 || Static395.anInt7388 <= local27 || local31 < 0) {
			return;
		}
		if (local15 < 0) {
			local15 = 0;
		}
		if (Static395.anInt7388 <= local31) {
			local31 = Static395.anInt7388 - 1;
		}
		if (local27 < 0) {
			local27 = 0;
		}
		if (Static19.anInt353 <= local19) {
			local19 = Static19.anInt353 - 1;
		}
		for (@Pc(84) int local84 = local27; local84 <= local31; local84++) {
			@Pc(95) int local95 = Static340.method5709(Static395.anInt7388, local84 + Static7.anInt133) * Static19.anInt353;
			for (@Pc(97) int local97 = local15; local97 <= local19; local97++) {
				@Pc(108) int local108 = Static340.method5709(Static19.anInt353, Static130.anInt2508 + local97) + local95;
				Static282.anIntArray265[local108] = Static468.anInt8414;
			}
		}
	}
}

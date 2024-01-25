import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method8403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16;
		if (Static268.method3778(arg4)) {
			local16 = 0;
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			if (Static392.aBoolean549) {
				local44 = Static173.anInt2991;
				local48 = Static482.anInt7719;
				local16 = Static265.anInt4125;
				local46 = Static161.anInt2716;
				local50 = Static449.anInt7290;
				Static449.anInt7290 = 1;
			}
			if (Static39.aClass273ArrayArray1[arg4] == null) {
				Static41.method2946(arg3, arg2, -1, arg0, arg5 < 0, arg6, arg5, Static581.aClass273ArrayArray2[arg4], arg1, arg7);
			} else {
				Static41.method2946(arg3, arg2, -1, arg0, arg5 < 0, arg6, arg5, Static39.aClass273ArrayArray1[arg4], arg1, arg7);
			}
			if (Static392.aBoolean549) {
				if (arg5 >= 0 && Static449.anInt7290 == 2) {
					Static5.method72(Static482.anInt7719, Static173.anInt2991, Static161.anInt2716, Static265.anInt4125);
				}
				Static482.anInt7719 = local48;
				Static265.anInt4125 = local16;
				Static173.anInt2991 = local44;
				Static449.anInt7290 = local50;
				Static161.anInt2716 = local46;
			}
		} else if (arg5 == -1) {
			for (local16 = 0; local16 < 100; local16++) {
				Static537.aBooleanArray25[local16] = true;
			}
		} else {
			Static537.aBooleanArray25[arg5] = true;
		}
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(ZII)Z")
	public static boolean method8404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}

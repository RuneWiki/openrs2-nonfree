import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jea", name = "B", descriptor = "I")
	public static int anInt3857;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method3589(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (local10 << 5) + arg0.charAt(local19) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZIIIII)V")
	public static void method3590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(23) int local23;
		if (Static172.method3336(arg7, (byte) -31)) {
			local23 = 0;
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			if (Static93.aBoolean113) {
				local44 = Static4.anInt22;
				local23 = Static113.anInt2235;
				local48 = Static401.anInt6900;
				local50 = Static611.anInt9666;
				local46 = Static373.anInt6281;
				Static611.anInt9666 = 1;
			}
			if (Static431.aClass381ArrayArray1[arg7] == null) {
				Static184.method3454(arg1, -1, arg6, arg5, arg0, arg3, arg3 < 0, arg2, arg4, Static686.aClass381ArrayArray2[arg7]);
			} else {
				Static184.method3454(arg1, -1, arg6, arg5, arg0, arg3, arg3 < 0, arg2, arg4, Static431.aClass381ArrayArray1[arg7]);
			}
			if (Static93.aBoolean113) {
				if (arg3 >= 0 && Static611.anInt9666 == 2) {
					Static494.method3707(Static4.anInt22, Static113.anInt2235, Static401.anInt6900, Static373.anInt6281);
				}
				Static373.anInt6281 = local46;
				Static4.anInt22 = local44;
				Static401.anInt6900 = local48;
				Static611.anInt9666 = local50;
				Static113.anInt2235 = local23;
			}
		} else if (arg3 == -1) {
			for (local23 = 0; local23 < 100; local23++) {
				Static72.aBooleanArray5[local23] = true;
			}
		} else {
			Static72.aBooleanArray5[arg3] = true;
		}
	}
}

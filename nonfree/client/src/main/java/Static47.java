import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!co", name = "V", descriptor = "I")
	public static int anInt1277;

	@OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
	public static int anInt1282;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(BI)V")
	public static void method950(@OriginalArg(1) int arg0) {
		Static261.anInt5266 = arg0;
		Static327.aClass198_230.method5213();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
	public static void method952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= Static5.anInt2965 && arg4 <= Static220.anInt6565 && arg3 >= Static349.anInt6619 && arg1 <= Static195.anInt4097) {
			if (arg0 == 1) {
				Static292.method4891(arg4, arg1, arg2, arg5, arg3);
			} else {
				Static108.method2355(arg5, arg2, arg3, arg1, arg0, arg4);
			}
		} else if (arg0 == 1) {
			Static342.method5468(arg4, arg3, arg2, arg5, arg1);
		} else {
			Static198.method3725(arg5, arg2, arg3, arg4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
	public static void method955() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static298.aBooleanArray26[local7] = false;
		}
		Static23.anInt459 = 0;
		Static29.anInt636 = Static240.anInt4829;
		Static354.anInt6741 = Static199.anInt4137;
		Static356.anInt6792 = Static112.anInt2705;
		Static9.anInt215 = -1;
		Static25.anInt538 = Static129.anInt3039;
		Static30.anInt779 = 0;
		Static349.anInt6620 = -1;
		Static104.anInt2631 = Static217.anInt4437;
		Static173.anInt3688 = Static337.anInt6445;
		Static353.anInt2640 = 5;
	}
}

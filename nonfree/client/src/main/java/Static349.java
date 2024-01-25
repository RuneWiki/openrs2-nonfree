import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt6364;

	@OriginalMember(owner = "client!rm", name = "bb", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)I")
	public static int method4992(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(38) int local38 = (local19 * arg0 >> 12) + 40960;
		return local13 * local38 >> 12;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!hh;IIZII)V")
	public static void method4993(@OriginalArg(1) Class109 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static85.anInt1527 = 0;
		Static386.anInt6855 = 2;
		Static105.anInt2081 = arg2;
		Static25.anInt424 = 1;
		Static289.aClass109_67 = arg0;
		Static67.aBoolean107 = false;
		Static428.anInt7488 = arg1;
	}
}

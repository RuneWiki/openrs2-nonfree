import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array6;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_831 = Static200.method3116("cookieprefix");

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	public static int anInt2541 = 0;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "Lclient!kh;")
	public static Class60 aClass60_832 = Static200.method3116("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "[I")
	public static int[] anIntArray320 = new int[256];

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_833 = Static200.method3116("welle:");

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	public static int anInt2542 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
	public static void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(20) int local20 = -1;
		@Pc(28) int local28 = Static107.method1863(Static214.anInt4572, arg3 + arg1, Static130.anInt2847);
		@Pc(36) int local36 = Static107.method1863(Static214.anInt4572, arg3 - arg1, Static130.anInt2847);
		Static104.method1768(local36, local28, arg0, Static148.anIntArrayArray78[arg2]);
		@Pc(47) int local47 = -arg1;
		while (local9 > local7) {
			local20 += 2;
			local47 += local20;
			@Pc(62) int local62;
			@Pc(66) int local66;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local47 > 0) {
				local9--;
				local62 = arg2 - local9;
				local66 = arg2 + local9;
				local47 -= local9 << 1;
				if (local66 >= Static141.anInt3163 && local62 <= Static200.anInt4273) {
					local91 = Static107.method1863(Static214.anInt4572, arg3 + local7, Static130.anInt2847);
					local100 = Static107.method1863(Static214.anInt4572, arg3 - local7, Static130.anInt2847);
					if (Static200.anInt4273 >= local66) {
						Static104.method1768(local100, local91, arg0, Static148.anIntArrayArray78[local66]);
					}
					if (local62 >= Static141.anInt3163) {
						Static104.method1768(local100, local91, arg0, Static148.anIntArrayArray78[local62]);
					}
				}
			}
			local7++;
			local62 = arg2 - local7;
			local66 = local7 + arg2;
			if (Static141.anInt3163 <= local66 && local62 <= Static200.anInt4273) {
				local91 = Static107.method1863(Static214.anInt4572, arg3 + local9, Static130.anInt2847);
				local100 = Static107.method1863(Static214.anInt4572, arg3 - local9, Static130.anInt2847);
				if (local66 <= Static200.anInt4273) {
					Static104.method1768(local100, local91, arg0, Static148.anIntArrayArray78[local66]);
				}
				if (local62 >= Static141.anInt3163) {
					Static104.method1768(local100, local91, arg0, Static148.anIntArrayArray78[local62]);
				}
			}
		}
	}
}

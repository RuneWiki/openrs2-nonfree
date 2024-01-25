import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "[I")
	public static final int[] anIntArray53 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_16 = new Class40(33, 6);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I")
	public static int method530(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIB)I")
	public static int method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(22) int local22 = local7 < 8 ? arg2 : arg0;
		@Pc(37) int local37 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg2 : arg1) : arg0;
		return ((local7 & 0x1) == 0 ? local22 : -local22) + ((local7 & 0x2) == 0 ? local37 : -local37);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
	public static void method533() {
		if (Static243.method6089(Static146.anInt2581) || Static21.method291(Static146.anInt2581)) {
			Static260.method3644(5000, Static220.anInt3753 >> 12, Static388.anInt6921 >> 12);
		} else {
			@Pc(16) int local16 = Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] >> 3;
			@Pc(23) int local23 = Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0] >> 3;
			if (local16 >= 0 && local16 < Static301.anInt4912 >> 3 && local23 >= 0 && Static473.anInt7969 >> 3 > local23) {
				Static260.method3644(5000, local23, local16);
			} else {
				Static260.method3644(0, Static473.anInt7969 >> 4, Static301.anInt4912 >> 4);
			}
		}
		Static563.method7689();
		Static142.method2147();
		Static345.method5203();
		Static252.method3567();
	}
}

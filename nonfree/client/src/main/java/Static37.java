import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
	public static int anInt736 = 0;

	@OriginalMember(owner = "client!bga", name = "t", descriptor = "I")
	public static int anInt737 = 0;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBIIII)V")
	public static void method649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg0;
		@Pc(13) int local13 = arg2 - arg4;
		if (local9 == 0) {
			if (local13 != 0) {
				Static246.method4175(arg4, arg1, arg0, arg2);
			}
		} else if (local13 == 0) {
			Static442.method6256(arg4, arg1, arg3, arg0);
		} else {
			@Pc(49) int local49 = (local13 << 12) / local9;
			@Pc(58) int local58 = arg4 - (local49 * arg0 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (Static68.anInt1306 > arg3) {
				local73 = (local49 * Static68.anInt1306 >> 12) + local58;
				local75 = Static68.anInt1306;
			} else if (arg3 > Static589.anInt9684) {
				local73 = (Static589.anInt9684 * local49 >> 12) + local58;
				local75 = Static589.anInt9684;
			} else {
				local75 = arg3;
				local73 = arg2;
			}
			@Pc(104) int local104;
			@Pc(106) int local106;
			if (arg0 < Static68.anInt1306) {
				local104 = Static68.anInt1306;
				local106 = (Static68.anInt1306 * local49 >> 12) + local58;
			} else if (arg0 <= Static589.anInt9684) {
				local104 = arg0;
				local106 = arg4;
			} else {
				local106 = local58 + (Static589.anInt9684 * local49 >> 12);
				local104 = Static589.anInt9684;
			}
			if (local73 < Static252.anInt4971) {
				local75 = (Static252.anInt4971 - local58 << 12) / local49;
				local73 = Static252.anInt4971;
			} else if (Static359.anInt6232 < local73) {
				local75 = (Static359.anInt6232 - local58 << 12) / local49;
				local73 = Static359.anInt6232;
			}
			if (Static252.anInt4971 > local106) {
				local106 = Static252.anInt4971;
				local104 = (Static252.anInt4971 - local58 << 12) / local49;
			} else if (local106 > Static359.anInt6232) {
				local106 = Static359.anInt6232;
				local104 = (Static359.anInt6232 - local58 << 12) / local49;
			}
			Static298.method4646(arg1, local75, local73, local104, local106);
		}
	}
}

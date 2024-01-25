import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array15;

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Lclient!mt;")
	public static Class237 aClass237_2;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "[S")
	public static short[] aShortArray95 = new short[256];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIBI)V")
	public static void method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static483.anInt8236 != 1) {
			return;
		}
		@Pc(13) int local13 = arg3 / Static408.anInt7120;
		@Pc(17) int local17 = arg2 / Static408.anInt7120;
		@Pc(21) int local21 = arg0 / Static252.anInt4593;
		@Pc(30) int local30 = arg1 / Static252.anInt4593;
		if (local13 >= Static6.anInt95 || local17 < 0 || Static28.anInt358 <= local21 || local30 < 0) {
			return;
		}
		if (local30 >= Static28.anInt358) {
			local30 = Static28.anInt358 - 1;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (Static6.anInt95 <= local17) {
			local17 = Static6.anInt95 - 1;
		}
		for (@Pc(82) int local82 = local21; local82 <= local30; local82++) {
			@Pc(94) int local94 = Static536.method7903(Static28.anInt358, local82 + Static444.anInt7581) * Static6.anInt95;
			for (@Pc(96) int local96 = local13; local96 <= local17; local96++) {
				@Pc(107) int local107 = local94 + Static536.method7903(Static6.anInt95, Static110.anInt2062 + local96);
				Static641.anIntArray604[local107] = Static182.anInt3238;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIII)V")
	public static void method6336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1 * Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288() >> 8;
		if (local16 == 0 || arg2 == -1) {
			return;
		}
		if (!Static342.aBoolean544 && Static281.anInt5925 != -1 && Static15.method551() && !Static314.method5261()) {
			Static606.aClass6_Sub4_Sub2_3 = Static154.method3064();
			@Pc(44) Class6_Sub4_Sub2 local44 = Static176.method3379(Static606.aClass6_Sub4_Sub2_3);
			Static560.method7886(local44);
		}
		Static406.method6373(Static119.aClass223_40, local16, arg2);
		Static578.method8030(255, -1);
		Static342.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
	public static void method6337() {
		Static203.anInt4459 = 0;
		Static341.anInt6795 = 0;
		Static267.anInt5761 = 0;
		Static354.anInt6879 = 0;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)Z")
	public static boolean method6339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static160.method3123(arg1, arg0)) {
			return Static246.method4413(arg1, arg0) | (arg0 & 0xB000) != 0 | Static151.method3035(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static27.method743(arg0, arg1) | Static33.method795(arg1, arg0));
		} else {
			return false;
		}
	}
}

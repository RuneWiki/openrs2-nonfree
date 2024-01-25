import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "Z")
	public static boolean aBoolean610 = false;

	@OriginalMember(owner = "client!tj", name = "W", descriptor = "[[I")
	public static final int[][] anIntArrayArray81 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7078(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (arg0.charAt(local12) - local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!be;I)V")
	public static void method7081(@OriginalArg(1) Class30_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static409.anInt7683 < arg0.anInt4141) {
			Static111.method2304(arg0);
		} else if (arg0.anInt4148 >= Static409.anInt7683) {
			Static351.method5494(arg0);
		} else {
			Static145.method2869(false, arg0);
			local9 = Static115.anInt2673;
			local7 = Static77.anInt1792;
		}
		if (arg0.anInt9418 < 128 || arg0.anInt9416 < 128 || Static37.anInt7512 * 128 - 128 <= arg0.anInt9418 || arg0.anInt9416 >= (Static329.anInt6247 - 1) * 128) {
			arg0.anInt4141 = 0;
			local9 = 0;
			local7 = -1;
			arg0.anInt4157 = -1;
			arg0.anInt4138 = -1;
			arg0.anInt4148 = 0;
			arg0.anInt4126 = -1;
			arg0.anInt9418 = arg0.anIntArray316[0] * 128 + arg0.method3591() * 64;
			arg0.anInt9416 = arg0.anIntArray317[0] * 128 + arg0.method3591() * 64;
			arg0.method3587();
		}
		if (arg0 == Static440.aClass30_Sub1_Sub1_Sub1_2 && (arg0.anInt9418 < 1536 || arg0.anInt9416 < 1536 || (Static37.anInt7512 - 12) * 128 <= arg0.anInt9418 || arg0.anInt9416 >= Static329.anInt6247 * 128 - 1536)) {
			local7 = -1;
			arg0.anInt4157 = -1;
			arg0.anInt4148 = 0;
			arg0.anInt4141 = 0;
			arg0.anInt4138 = -1;
			local9 = 0;
			arg0.anInt4126 = -1;
			arg0.anInt9418 = arg0.anIntArray316[0] * 128 + arg0.method3591() * 64;
			arg0.anInt9416 = arg0.anIntArray317[0] * 128 + arg0.method3591() * 64;
			arg0.method3587();
		}
		@Pc(214) int local214 = Static482.method7217(arg0);
		Static464.method6944(arg0, local214, local7, local9);
		Static228.method4110(arg0);
	}
}

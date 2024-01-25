import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
	public static boolean aBoolean513;

	@OriginalMember(owner = "client!od", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	public static int anInt7107;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "S")
	public static short aShort82 = 1;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
	public static void method6265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class351 local28 = Static567.aClass351ArrayArrayArray4[local9][arg0][arg1] = Static567.aClass351ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class105 local33 = local28.aClass105_3; local33 != null; local33 = local33.aClass105_1) {
					@Pc(37) Class9_Sub2_Sub1 local37 = local33.aClass9_Sub2_Sub1_1;
					if (local37.aShort126 == arg0 && local37.aShort124 == arg1) {
						local37.aByte127--;
					}
				}
				if (local28.aClass9_Sub2_Sub4_1 != null) {
					local28.aClass9_Sub2_Sub4_1.aByte127--;
				}
				if (local28.aClass9_Sub2_Sub3_2 != null) {
					local28.aClass9_Sub2_Sub3_2.aByte127--;
				}
				if (local28.aClass9_Sub2_Sub3_1 != null) {
					local28.aClass9_Sub2_Sub3_1.aByte127--;
				}
				if (local28.aClass9_Sub2_Sub5_1 != null) {
					local28.aClass9_Sub2_Sub5_1.aByte127--;
				}
				if (local28.aClass9_Sub2_Sub5_2 != null) {
					local28.aClass9_Sub2_Sub5_2.aByte127--;
				}
			}
		}
		if (Static567.aClass351ArrayArrayArray4[0][arg0][arg1] == null) {
			Static567.aClass351ArrayArrayArray4[0][arg0][arg1] = new Class351(0);
			Static567.aClass351ArrayArrayArray4[0][arg0][arg1].aByte118 = 1;
		}
		Static567.aClass351ArrayArrayArray4[0][arg0][arg1].aClass351_1 = local7;
		Static567.aClass351ArrayArrayArray4[3][arg0][arg1] = null;
	}
}

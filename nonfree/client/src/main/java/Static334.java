import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Lclient!cp;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	public static int anInt5362;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	public static int anInt5383;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!lea;")
	public static final Class223 aClass223_7 = new Class223();

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
	public static int anInt5381 = 100;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "Lclient!nt;")
	public static Class270 aClass270_10 = null;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	public static void method4815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class364 local28 = Static448.aClass364ArrayArrayArray2[local9][arg0][arg1] = Static448.aClass364ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class181 local33 = local28.aClass181_3; local33 != null; local33 = local33.aClass181_2) {
					@Pc(37) Class9_Sub1_Sub1 local37 = local33.aClass9_Sub1_Sub1_1;
					if (local37.aShort123 == arg0 && local37.aShort120 == arg1) {
						local37.aByte139--;
					}
				}
				if (local28.aClass9_Sub1_Sub4_1 != null) {
					local28.aClass9_Sub1_Sub4_1.aByte139--;
				}
				if (local28.aClass9_Sub1_Sub2_2 != null) {
					local28.aClass9_Sub1_Sub2_2.aByte139--;
				}
				if (local28.aClass9_Sub1_Sub2_1 != null) {
					local28.aClass9_Sub1_Sub2_1.aByte139--;
				}
				if (local28.aClass9_Sub1_Sub3_2 != null) {
					local28.aClass9_Sub1_Sub3_2.aByte139--;
				}
				if (local28.aClass9_Sub1_Sub3_1 != null) {
					local28.aClass9_Sub1_Sub3_1.aByte139--;
				}
			}
		}
		if (Static448.aClass364ArrayArrayArray2[0][arg0][arg1] == null) {
			Static448.aClass364ArrayArrayArray2[0][arg0][arg1] = new Class364(0);
			Static448.aClass364ArrayArrayArray2[0][arg0][arg1].aByte135 = 1;
		}
		Static448.aClass364ArrayArrayArray2[0][arg0][arg1].aClass364_1 = local7;
		Static448.aClass364ArrayArrayArray2[3][arg0][arg1] = null;
	}
}

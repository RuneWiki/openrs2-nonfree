import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "Lclient!ri;")
	public static Class284 aClass284_126;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Lclient!cf;")
	public static final Class51 aClass51_15 = new Class51();

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLclient!ri;)V")
	public static void method6158(@OriginalArg(1) Class284 arg0) {
		Static235.anInt4718 = 0;
		Static345.anInt6222 = 0;
		Static344.aClass269_5 = new Class269();
		Static520.aClass25_Sub5_Sub1_Sub1Array2 = new Class25_Sub5_Sub1_Sub1[1024];
		Static541.aClass25_Sub7Array1 = new Class25_Sub7[Static357.anIntArray353[Static80.anInt2134] + 1];
		Static447.anInt7896 = 0;
		Static520.anInt9166 = 0;
		Static139.method4612(arg0);
		Static531.method7275(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
	public static void method6159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class333 local28 = Static189.aClass333ArrayArrayArray1[local9][arg0][arg1] = Static189.aClass333ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class147 local33 = local28.aClass147_3; local33 != null; local33 = local33.aClass147_2) {
					@Pc(37) Class25_Sub2_Sub2 local37 = local33.aClass25_Sub2_Sub2_1;
					if (local37.aShort106 == arg0 && local37.aShort107 == arg1) {
						local37.aByte117--;
					}
				}
				if (local28.aClass25_Sub2_Sub5_1 != null) {
					local28.aClass25_Sub2_Sub5_1.aByte117--;
				}
				if (local28.aClass25_Sub2_Sub3_2 != null) {
					local28.aClass25_Sub2_Sub3_2.aByte117--;
				}
				if (local28.aClass25_Sub2_Sub3_1 != null) {
					local28.aClass25_Sub2_Sub3_1.aByte117--;
				}
				if (local28.aClass25_Sub2_Sub1_2 != null) {
					local28.aClass25_Sub2_Sub1_2.aByte117--;
				}
				if (local28.aClass25_Sub2_Sub1_1 != null) {
					local28.aClass25_Sub2_Sub1_1.aByte117--;
				}
			}
		}
		if (Static189.aClass333ArrayArrayArray1[0][arg0][arg1] == null) {
			Static189.aClass333ArrayArrayArray1[0][arg0][arg1] = new Class333(0);
			Static189.aClass333ArrayArrayArray1[0][arg0][arg1].aByte127 = 1;
		}
		Static189.aClass333ArrayArrayArray1[0][arg0][arg1].aClass333_1 = local7;
		Static189.aClass333ArrayArrayArray1[3][arg0][arg1] = null;
	}
}

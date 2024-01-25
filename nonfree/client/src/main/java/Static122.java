import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!qc;")
	public static Class2_Sub35 aClass2_Sub35_1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public static int anInt2063 = -1;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	public static int anInt2065 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Z")
	public static boolean method1961(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static405.anInt7034; local1 < Static180.anInt3181; local1++) {
			@Pc(6) Class36[][] local6 = Static175.aClass36ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static30.anInt535; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static308.anInt5540 + local9;
				@Pc(18) int local18 = Static308.anInt5540 - local9;
				if (local14 >= Static152.anInt2787 || local18 < Static352.anInt6218) {
					for (@Pc(27) int local27 = -Static30.anInt535; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static109.anInt1838 + local27;
						@Pc(36) int local36 = Static109.anInt1838 - local27;
						@Pc(48) Class36 local48;
						if (local14 >= Static152.anInt2787) {
							if (local32 >= Static371.anInt6494) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean31) {
									Static241.aBoolean268 = arg0;
									Static45.aClass20_1.method5680(local48);
									Static45.aClass20_1.method5682();
								}
							}
							if (local36 < Static450.anInt7752) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean31) {
									Static241.aBoolean268 = arg0;
									Static45.aClass20_1.method5680(local48);
									Static45.aClass20_1.method5682();
								}
							}
						}
						if (local18 < Static352.anInt6218) {
							if (local32 >= Static371.anInt6494) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean31) {
									Static241.aBoolean268 = arg0;
									Static45.aClass20_1.method5680(local48);
									Static45.aClass20_1.method5682();
								}
							}
							if (local36 < Static450.anInt7752) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean31) {
									Static241.aBoolean268 = arg0;
									Static45.aClass20_1.method5680(local48);
									Static45.aClass20_1.method5682();
								}
							}
						}
						if (Static346.anInt6124 == 0) {
							if (Static457.aBoolean511) {
								Static45.aClass20_1.method5678(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}

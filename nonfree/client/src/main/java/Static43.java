import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "Lclient!cj;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "Z")
	public static boolean aBoolean56 = true;

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_17 = new Class240(13, 8);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	public static void method785() {
		for (@Pc(12) int local12 = 0; local12 < Static217.anInt10315; local12++) {
			@Pc(18) Class51 local18 = Static2.aClass51Array1[local12];
			if (local18.aByte16 == 3) {
				if (local18.aClass3_Sub12_Sub4_1 == null) {
					local18.anInt1398 = Integer.MIN_VALUE;
				} else {
					Static156.aClass3_Sub12_Sub1_1.method1766(local18.aClass3_Sub12_Sub4_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z[[I)V")
	public static void method787(@OriginalArg(1) int[][] arg0) {
		Static276.anIntArrayArray32 = arg0;
	}
}

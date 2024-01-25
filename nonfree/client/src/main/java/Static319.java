import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!mca", name = "B", descriptor = "Lclient!dc;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(7500);

	@OriginalMember(owner = "client!mca", name = "F", descriptor = "[I")
	public static final int[] anIntArray2 = new int[4096];

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
	public static void method55(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub5_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class83 local8 = Static444.aClass83Array7[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static253.anInt4651; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static182.anInt3633; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static145.anInt3093;
							@Pc(32) int local32 = local12 << Static145.anInt3093;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class83 local41 = Static444.aClass83Array7[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7217(local12, local15) - local41.method7217(local12, local15);
									@Pc(71) int local71 = local8.method7217(local12, local15 + 1) - local41.method7217(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7217(local12 + 1, local15 + 1) - local41.method7217(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7217(local12 + 1, local15) - local41.method7217(local12 + 1, local15);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Z")
	public static boolean aBoolean260;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
	public static int anInt3846 = -1;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
	public static int anInt3852 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIII)V")
	public static void method3228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class1_Sub2_Sub18 local17 = Static160.method2756(arg0, arg1, arg2);
		if (local17 == null) {
			return;
		}
		Static140.anIntArray464 = new int[local17.anInt4572];
		Static75.aStringArray7 = new String[local17.anInt4575];
		if (local17.anInt4571 == 15 || local17.anInt4571 == 17 || local17.anInt4571 == 16) {
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (Static74.aClass66_16 != null) {
				local51 = Static74.aClass66_16.anInt2174;
				local49 = Static74.aClass66_16.anInt2135;
			}
			Static140.anIntArray464[0] = Static247.anInt4467 - local49;
			Static140.anIntArray464[1] = Static222.anInt4105 - local51;
		}
		Static172.method2906(local17, 200000);
	}
}

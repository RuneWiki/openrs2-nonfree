import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_138 = new Class286(78, -1);

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "[I")
	public static final int[] anIntArray523 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZB)V")
	public static void method6513(@OriginalArg(0) boolean arg0) {
		Static405.anInt7060 = 0;
		Static230.anInt4315 = 0;
		Static306.method4567();
		Static349.method5210(arg0);
		Static356.method5276();
		@Pc(22) boolean local22 = false;
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static230.anInt4315; local24++) {
			local30 = Static25.anIntArray38[local24];
			@Pc(37) Class2_Sub32 local37 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local30);
			@Pc(40) Class6_Sub1_Sub1_Sub1_Sub1 local40 = local37.aClass6_Sub1_Sub1_Sub1_Sub1_1;
			if (Static167.aBoolean291 && Static385.method5664(local30)) {
				Static128.method2159();
			}
			if (Static412.anInt575 != local40.anInt7348) {
				if (local40.aClass86_1.method1577()) {
					Static121.method1779(local40);
				}
				local40.method159(null);
				local22 = true;
				local37.method7966();
			}
		}
		if (local22) {
			Static31.anInt820 = Static544.aClass162_40.method3524();
			Static544.aClass162_40.method3520(Static223.aClass2_Sub32Array1);
		}
		if (Static133.aClass2_Sub15_Sub2_1.anInt5241 != Static65.anInt1500) {
			throw new RuntimeException("gnp1 pos:" + Static133.aClass2_Sub15_Sub2_1.anInt5241 + " psize:" + Static65.anInt1500);
		}
		for (local30 = 0; local30 < Static416.anInt7186; local30++) {
			if (Static544.aClass162_40.method3519((long) Static169.anIntArray198[local30]) == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static416.anInt7186);
			}
		}
	}
}

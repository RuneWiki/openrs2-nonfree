import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static723 {

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[6][];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)V")
	public static void method9425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static2.anInt10935;
		@Pc(7) int local7 = Class19_Sub1_Sub3_Sub1.lb;
		if (Static178.aBoolean264) {
			local5 += Static448.method6652();
			local7 += Static143.method2382();
		}
		@Pc(39) Class9 local39;
		if (Static290.anInt5227 == 1) {
			local39 = Static527.aClass9Array35[Static139.anInt2624 / 100];
			local39.method8617(local5 - 8, local7 + -8);
			Static30.method402(local7 - 8, local5 - 8 - -local39.method8619(), local5 - 8, local7 - 8 + local39.method8613());
		}
		if (Static290.anInt5227 == 2) {
			local39 = Static527.aClass9Array35[Static139.anInt2624 / 100 + 4];
			local39.method8617(local5 - 8, local7 + -8);
			Static30.method402(local7 - 8, local5 - -local39.method8619() + -8, local5 - 8, local39.method8613() + local7 + -8);
		}
		Static447.method6619();
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)V")
	public static void method9428() {
		Static658.aClass136_48.method3505();
		Static290.aClass357_26.method8403();
		Static310.anInt5522 = 0;
		Static261.anInt4814 = 0;
		Static246.anInt4581 = 1;
		if (Static379.aBoolean535) {
			Static379.aBoolean535 = false;
			Static232.aShort54 = Static464.aShort115;
			Static424.aShort97 = Static249.aShort113;
			Static454.aShort112 = Static11.aShort1;
			Static134.aShort20 = Static246.aShort60;
		}
		Static154.aClass11Array1 = null;
		Static612.aClass10Array1 = null;
		Static106.aClass297Array1 = null;
		Static154.aClass234Array1 = null;
	}
}

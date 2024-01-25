import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Lclient!hd;")
	public static Class112 aClass112_4;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	public static int anInt9322;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_93 = new Class243(30, 3);

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
	public static final int[] anIntArray757 = new int[2048];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
	public static void method7745(@OriginalArg(0) boolean arg0) {
		Static36.anInt644 = 0;
		Static411.anInt7662 = 0;
		Static425.method5862();
		Static461.method6989(arg0);
		Static428.method6593();
		@Pc(23) boolean local23 = false;
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static411.anInt7662; local25++) {
			local31 = Static8.anIntArray17[local25];
			@Pc(38) Class2_Sub11 local38 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local31);
			@Pc(41) Class1_Sub1_Sub2_Sub2 local41 = local38.aClass1_Sub1_Sub2_Sub2_1;
			if (Static452.aBoolean600 && Static379.method5201(local31)) {
				Static340.method5355();
			}
			if (Static115.anInt2326 != local41.anInt5049) {
				if (local41.aClass12_1.method457()) {
					Static501.method7364(local41);
				}
				local41.method4401(null);
				local38.method7802();
				local23 = true;
			}
		}
		if (local23) {
			Static61.anInt1174 = Static71.aClass127_13.method3209();
			Static71.aClass127_13.method3207(Static539.aClass2_Sub11Array1);
		}
		if (Static472.anInt8247 != Static70.aClass2_Sub29_Sub2_1.anInt6132) {
			throw new RuntimeException("gnp1 pos:" + Static70.aClass2_Sub29_Sub2_1.anInt6132 + " psize:" + Static472.anInt8247);
		}
		for (local31 = 0; local31 < Static520.anInt1936; local31++) {
			if (Static71.aClass127_13.method3205((long) Static24.anIntArray39[local31]) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static520.anInt1936);
			}
		}
	}
}

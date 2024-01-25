import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!rfa", name = "K", descriptor = "Lclient!bka;")
	public static Class9 aClass9_29;

	@OriginalMember(owner = "client!rfa", name = "L", descriptor = "[Lclient!fv;")
	public static Class19_Sub4_Sub1_Sub1[] aClass19_Sub4_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "Lclient!ela;")
	public static final Class96 aClass96_5 = new Class96();

	@OriginalMember(owner = "client!rfa", name = "I", descriptor = "[I")
	public static final int[] anIntArray505 = new int[3];

	@OriginalMember(owner = "client!rfa", name = "H", descriptor = "Lclient!uj;")
	public static final Class371 aClass371_9 = new Class371("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!rfa", name = "G", descriptor = "Z")
	public static boolean aBoolean675 = false;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(B)V")
	public static void method7759() {
		Static517.anInt8809++;
		Static303.anInt5468 = 0;
		Static48.anInt822 = 0;
		Static159.method2547();
		Static691.method9073();
		Static203.method3019();
		@Pc(21) boolean local21 = false;
		@Pc(38) int local38;
		for (@Pc(30) int local30 = 0; local30 < Static303.anInt5468; local30++) {
			local38 = Static629.anIntArray581[local30];
			@Pc(45) Class3_Sub13 local45 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local38);
			@Pc(48) Class19_Sub1_Sub3_Sub2_Sub1 local48 = local45.aClass19_Sub1_Sub3_Sub2_Sub1_2;
			if (local48.anInt7815 != Static517.anInt8809) {
				if (Static555.aBoolean678 && Static627.method8490(local38)) {
					Static49.method652();
				}
				if (local48.aClass18_1.method411()) {
					Static46.method629(local48);
				}
				local48.method3434((Class18) null);
				local45.method9446();
				local21 = true;
			}
		}
		if (local21) {
			Static32.anInt518 = Static612.aClass136_44.method3504();
			Static612.aClass136_44.method3502(Static95.aClass3_Sub13Array1);
		}
		if (Static532.aClass400_3.anInt11061 != Static532.aClass400_3.aClass3_Sub28_Sub2_2.anInt6241) {
			throw new RuntimeException("gnp1 pos:" + Static532.aClass400_3.aClass3_Sub28_Sub2_2.anInt6241 + " psize:" + Static532.aClass400_3.anInt11061);
		}
		for (local38 = 0; local38 < Static337.anInt5854; local38++) {
			if (Static612.aClass136_44.method3503((long) Static101.anIntArray95[local38]) == null) {
				throw new RuntimeException("gnp2 pos:" + local38 + " size:" + Static337.anInt5854);
			}
		}
		if (Static32.anInt518 - Static337.anInt5854 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static32.anInt518 - Static337.anInt5854));
		}
		for (@Pc(211) int local211 = 0; local211 < Static32.anInt518; local211++) {
			if (Static517.anInt8809 != Static95.aClass3_Sub13Array1[local211].aClass19_Sub1_Sub3_Sub2_Sub1_2.anInt7815) {
				throw new RuntimeException("gnp4 uk:" + Static95.aClass3_Sub13Array1[local211].aClass19_Sub1_Sub3_Sub2_Sub1_2.anInt7796);
			}
		}
	}
}

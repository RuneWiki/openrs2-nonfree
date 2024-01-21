import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!t", name = "xc", descriptor = "I")
	public static int anInt2933;

	@OriginalMember(owner = "client!t", name = "Oc", descriptor = "Lclient!qb;")
	public static Class58 aClass58_64 = new Class58();

	@OriginalMember(owner = "client!t", name = "Vc", descriptor = "Lclient!r;")
	public static Class61 aClass61_878 = Static129.method2060("http:)4)4");

	@OriginalMember(owner = "client!t", name = "Wc", descriptor = "Lclient!r;")
	public static Class61 aClass61_879 = Static129.method2060("<col=ffb000>");

	@OriginalMember(owner = "client!t", name = "ad", descriptor = "Lclient!r;")
	public static Class61 aClass61_882 = Static129.method2060("");

	@OriginalMember(owner = "client!t", name = "Yc", descriptor = "Lclient!r;")
	public static Class61 aClass61_880 = aClass61_882;

	@OriginalMember(owner = "client!t", name = "Zc", descriptor = "Lclient!r;")
	public static Class61 aClass61_881 = aClass61_882;

	@OriginalMember(owner = "client!t", name = "bd", descriptor = "Lclient!r;")
	public static Class61 aClass61_883 = aClass61_882;

	@OriginalMember(owner = "client!t", name = "cd", descriptor = "Lclient!r;")
	public static Class61 aClass61_884 = aClass61_882;

	@OriginalMember(owner = "client!t", name = "dd", descriptor = "Lclient!r;")
	public static Class61 aClass61_885 = aClass61_882;

	@OriginalMember(owner = "client!t", name = "ed", descriptor = "Lclient!ge;")
	public static Class29 aClass29_24 = new Class29(64);

	@OriginalMember(owner = "client!t", name = "fd", descriptor = "Lclient!r;")
	public static Class61 aClass61_886 = aClass61_882;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V")
	public static void method1863() {
		aClass61_880 = null;
		aClass61_878 = null;
		aClass58_64 = null;
		aClass61_884 = null;
		aClass61_885 = null;
		aClass61_883 = null;
		aClass61_882 = null;
		aClass61_886 = null;
		aClass61_879 = null;
		aClass61_881 = null;
		aClass29_24 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!ea;)V")
	public static void method1864(@OriginalArg(1) Class5_Sub2_Sub2_Sub3 arg0) {
		if (Static58.anInt1422 == arg0.anInt2905 || arg0.anInt2903 == -1 || arg0.anInt2904 != 0 || arg0.anInt2926 + 1 > Static106.method1769(arg0.anInt2903).anIntArray396[arg0.anInt2880]) {
			@Pc(42) int local42 = arg0.anInt2905 - arg0.anInt2911;
			@Pc(48) int local48 = Static58.anInt1422 - arg0.anInt2911;
			@Pc(58) int local58 = arg0.anInt2892 * 64 + arg0.anInt2891 * 128;
			@Pc(68) int local68 = arg0.anInt2892 * 64 + arg0.anInt2881 * 128;
			@Pc(78) int local78 = arg0.anInt2892 * 64 + arg0.anInt2887 * 128;
			arg0.anInt2912 = (local78 * (local42 - local48) + local48 * local68) / local42;
			@Pc(103) int local103 = arg0.anInt2883 * 128 + arg0.anInt2892 * 64;
			arg0.anInt2875 = (local48 * local103 + (local42 - local48) * local58) / local42;
		}
		arg0.anInt2894 = 0;
		if (arg0.anInt2925 == 0) {
			arg0.anInt2909 = 1024;
		}
		if (arg0.anInt2925 == 1) {
			arg0.anInt2909 = 1536;
		}
		if (arg0.anInt2925 == 2) {
			arg0.anInt2909 = 0;
		}
		if (arg0.anInt2925 == 3) {
			arg0.anInt2909 = 512;
		}
		arg0.anInt2919 = arg0.anInt2909;
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(I)V")
	public static void method1865() {
		if (!Static44.aBoolean37) {
			return;
		}
		Static36.aClass5_Sub2_Sub1_Sub3_3 = null;
		Static85.anIntArray293 = null;
		Static12.aClass5_Sub2_Sub1_Sub3Array7 = null;
		Static107.anIntArray338 = null;
		Static32.anIntArray154 = null;
		Static22.aClass5_Sub2_Sub1_Sub3_2 = null;
		Static121.aClass5_Sub2_Sub1_Sub3Array35 = null;
		Static105.aClass5_Sub2_Sub1_Sub3Array42 = null;
		Static39.anIntArray174 = null;
		Static97.aClass5_Sub2_Sub1_Sub4_6 = null;
		Static43.anIntArray180 = null;
		Static54.aClass5_Sub2_Sub1_Sub4_4 = null;
		Static32.aClass5_Sub2_Sub1_Sub4_3 = null;
		Static82.aClass5_Sub2_Sub1_Sub3_5 = null;
		Static108.aClass5_Sub2_Sub1_Sub3Array2 = null;
		Static20.aClass5_Sub2_Sub1_Sub3_1 = null;
		Static28.aClass5_Sub2_Sub1_Sub3Array16 = null;
		Static25.aClass5_Sub2_Sub1_Sub4_2 = null;
		Static13.aClass5_Sub2_Sub1_Sub4Array2 = null;
		Static133.anIntArray448 = null;
		Static55.anIntArray208 = null;
		Static25.anIntArray127 = null;
		Static11.method203();
		Static34.method678(true);
		Static44.aBoolean37 = false;
	}
}

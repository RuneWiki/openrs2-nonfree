import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "B")
	public static byte aByte55;

	@OriginalMember(owner = "client!lca", name = "B", descriptor = "Lclient!bea;")
	public static Class5_Sub2_Sub5 aClass5_Sub2_Sub5_2;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_49 = new Class236(51, 4);

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
	public static int anInt5393 = 10;

	@OriginalMember(owner = "client!lca", name = "w", descriptor = "Lclient!ne;")
	public static final Class206 aClass206_3 = new Class206();

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
	public static int anInt5394 = 0;

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_14 = new Class212(8, 4);

	@OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
	public static int anInt5395 = -2;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V")
	public static void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 7);
		local12.method1327();
		local12.anInt1437 = arg1;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!bda;Z)I")
	public static int method4515(@OriginalArg(0) Class15_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt839;
		@Pc(17) Class281 local17 = arg0.method4026();
		if (arg0.aBoolean299) {
			local8 = arg0.anInt834;
		} else if (local17.anInt8093 == arg0.anInt4725 || local17.anInt8117 == arg0.anInt4725 || local17.anInt8113 == arg0.anInt4725 || arg0.anInt4725 == local17.anInt8121) {
			local8 = arg0.anInt841;
		} else if (arg0.anInt4725 == local17.anInt8124 || arg0.anInt4725 == local17.anInt8099 || arg0.anInt4725 == local17.anInt8116 || local17.anInt8098 == arg0.anInt4725) {
			local8 = arg0.anInt847;
		}
		return local8;
	}
}

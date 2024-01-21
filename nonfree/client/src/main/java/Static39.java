import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public static int anInt1048;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array3;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public static int anInt1046 = 0;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!od;")
	public static Class60 aClass60_392 = Static41.method597("(U");

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_393 = Static41.method597("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "I")
	public static int anInt1049 = 0;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_394 = Static41.method597("p12_full");

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public static int anInt1051 = 0;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public static volatile int anInt1052 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)I")
	public static int method580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class4_Sub17 local11 = (Class4_Sub17) Static75.aClass75_8.method1896((long) arg0);
		if (local11 == null) {
			return 0;
		} else if (arg1 >= 0 && local11.anIntArray321.length > arg1) {
			return local11.anIntArray321[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method581() {
		anIntArray108 = null;
		anIntArray107 = null;
		aClass60_393 = null;
		aClass60_394 = null;
		aClass4_Sub3_Sub6_Sub2Array3 = null;
		aClass60_392 = null;
		aByteArrayArray5 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
	public static boolean method582() {
		return Static9.anInt112 == 0 ? Static30.aClass4_Sub1_Sub1_1.method97() : true;
	}
}

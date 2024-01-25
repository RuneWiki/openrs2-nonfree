import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static382 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt7177;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	public static final int anInt7173 = 1407;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_79 = new Class181(4, 3);

	@OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
	public static final int[] anIntArray504 = new int[32];

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method6025() {
		Static298.method4854(Static221.aClass181_54);
		Static547.aClass6_Sub26_Sub2_2.method4950(Static298.method4852(), -81849);
		Static547.aClass6_Sub26_Sub2_2.method4962(Static228.anInt4744);
		Static547.aClass6_Sub26_Sub2_2.method4962(Static180.anInt4051);
		Static547.aClass6_Sub26_Sub2_2.method4950(Static104.aClass6_Sub6_Sub1_4.anInt1166, -81849);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!jo;[ILclient!jo;)V")
	public static void method6026(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class168 arg2) {
		if (arg1 != null) {
			Static139.anIntArray225 = arg1;
		}
		Static394.aClass168_92 = arg0;
		Static194.aClass168_50 = arg2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lclient!cw;")
	public static Class61 method6027(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static237.aClass61Array1[arg0] : null;
	}
}

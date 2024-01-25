import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	public static int anInt1438;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!qs;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt1440;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[I")
	public static final int[] anIntArray100 = new int[4096];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!lm;Lclient!lm;)V")
	public static void method1193(@OriginalArg(1) Class134 arg0, @OriginalArg(2) Class134 arg1) {
		Static30.aClass134_13 = arg1;
		Static302.aClass134_133 = arg0;
		Static149.anInt3070 = Static302.aClass134_133.method3020(3);
	}
}

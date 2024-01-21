import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!hd", name = "jb", descriptor = "Lclient!ke;")
	public static Class43 aClass43_18;

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lclient!o;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_633 = Static146.method2172("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_634 = Static146.method2172("::");

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "[I")
	public static int[] anIntArray256 = new int[32];

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_635 = Static146.method2172("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lclient!ua;")
	public static Class82 aClass82_23 = new Class82(64);

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "Lclient!sg;")
	public static Class77 aClass77_636 = Static146.method2172("lila:");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!bg;IIIB)V")
	public static void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static160.anInt4572 + Static28.anInt832 & 0x7FF;
		@Pc(21) int local21 = arg0 * arg0 + arg4 * arg4;
		if (local21 > 6400) {
			return;
		}
		@Pc(31) int local31 = Class2_Sub2_Sub3_Sub1.anIntArray50[local12];
		@Pc(39) int local39 = local31 * 256 / (Static130.anInt3166 + 256);
		@Pc(43) int local43 = Class2_Sub2_Sub3_Sub1.anIntArray52[local12];
		@Pc(51) int local51 = local43 * 256 / (Static130.anInt3166 + 256);
		@Pc(61) int local61 = arg4 * local39 + arg0 * local51 >> 16;
		@Pc(72) int local72 = arg4 * local51 - local39 * arg0 >> 16;
		if (local21 > 2500) {
			arg1.method387(Static100.aClass2_Sub2_Sub3_Sub3_2, local61 + arg2 + 4 + 94 - arg1.anInt572 / 2, -(arg1.anInt569 / 2) + -local72 + arg3 - -79);
		} else {
			arg1.method401(local61 + arg2 + 4 + 94 - arg1.anInt572 / 2, -local72 + -4 + (arg3 + 83 - arg1.anInt569 / 2));
		}
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
	public static void method1148() {
		aClass18_1 = null;
		aClass77_636 = null;
		aClass82_23 = null;
		aClass77_635 = null;
		anIntArray256 = null;
		aClass77_634 = null;
		aClass77_633 = null;
		aClass43_18 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLclient!ke;Lclient!ke;)V")
	public static void method1149(@OriginalArg(1) Class43 arg0, @OriginalArg(2) Class43 arg1) {
		Static76.aClass43_19 = arg1;
		Static58.aClass43_16 = arg0;
		Static11.anInt309 = Static58.aClass43_16.method2223(3);
	}
}

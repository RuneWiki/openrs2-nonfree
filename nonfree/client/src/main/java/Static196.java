import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!uf", name = "W", descriptor = "B")
	public static byte aByte13;

	@OriginalMember(owner = "client!uf", name = "H", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_20 = new Class84(5);

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
	public static int anInt3834 = 0;

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1441 = Static161.method2452(":");

	@OriginalMember(owner = "client!uf", name = "T", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1442 = Static161.method2452("VOLL");

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "[I")
	public static final int[] anIntArray405 = new int[2000];

	@OriginalMember(owner = "client!uf", name = "V", descriptor = "[I")
	public static final int[] anIntArray406 = new int[100];

	@OriginalMember(owner = "client!uf", name = "X", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1443 = null;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)I")
	public static int method2907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class5_Sub2_Sub11 method2908(@OriginalArg(1) int arg0) {
		@Pc(18) Class5_Sub2_Sub11 local18 = (Class5_Sub2_Sub11) Static1.aClass8_3.method227((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static82.aClass23_33.method738(Static29.method453(arg0), Static183.method2772(arg0));
		local18 = new Class5_Sub2_Sub11();
		local18.anInt2335 = arg0;
		if (local32 != null) {
			local18.method1775(new Class5_Sub6(local32));
		}
		local18.method1774();
		if (local18.anInt2356 != -1) {
			local18.method1768(method2908(local18.anInt2356), method2908(local18.anInt2361));
		}
		if (local18.anInt2326 != -1) {
			local18.method1781(method2908(local18.anInt2326), method2908(local18.anInt2313));
		}
		if (!Static141.aBoolean126 && local18.aBoolean99) {
			local18.aBoolean98 = false;
			local18.anInt2347 = 0;
			local18.aClass20Array18 = null;
			local18.aClass20_861 = Static97.aClass20_772;
			local18.aClass20Array17 = null;
		}
		Static1.aClass8_3.method232((long) arg0, local18);
		return local18;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[[[Lclient!bf;")
	private static Class5_Sub3[][][] aClass5_Sub3ArrayArrayArray1;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public static int anInt2372;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public static int anInt2383;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_870 = Static161.method2452("Please enter your password)3");

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_871 = Static161.method2452("Versteckt");

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public static volatile int anInt2375 = 0;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_877 = Static161.method2452("No response from server)3");

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!dc;")
	public static Class20 aClass20_872 = aClass20_877;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_873 = Static161.method2452("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_878 = Static161.method2452("Players");

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!dc;")
	public static Class20 aClass20_874 = aClass20_878;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Lclient!dc;")
	public static Class20 aClass20_875 = aClass20_870;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_876 = Static161.method2452("::rect_debug");

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	public static int anInt2385 = -1;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_879 = Static161.method2452("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_880 = Static161.method2452(")1 ");

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = 2048 - arg1 & 0x7FF;
		@Pc(12) int local12 = 2048 - arg3 & 0x7FF;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(22) int local22 = arg4;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (local6 != 0) {
			local28 = Class80.anIntArray324[local6];
			local32 = Class80.anIntArray327[local6];
			local39 = local28 * -arg4 >> 16;
			local22 = arg4 * local32 >> 16;
			local14 = local39;
		}
		if (local12 != 0) {
			local28 = Class80.anIntArray324[local12];
			local32 = Class80.anIntArray327[local12];
			local39 = local22 * local28 >> 16;
			local16 = local39;
			local22 = local22 * local32 >> 16;
		}
		Static23.anInt398 = arg3;
		Static104.anInt2182 = arg0 - local22;
		Static4.anInt109 = arg5 - local16;
		Static146.anInt3026 = arg2 - local14;
		Static80.anInt1806 = arg1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Lclient!u;")
	public static Class5_Sub2_Sub23 method1824(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub2_Sub23 local8 = (Class5_Sub2_Sub23) Static142.aClass8_28.method227((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static130.aClass23_Sub1_16.method738(0, arg0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class5_Sub2_Sub23();
		@Pc(47) Class5_Sub6 local47 = new Class5_Sub6(local22);
		local47.anInt4050 = local47.aByteArray56.length - 2;
		@Pc(58) int local58 = local47.method3077();
		@Pc(66) int local66 = local47.aByteArray56.length - local58 - 14;
		local47.anInt4050 = local66;
		@Pc(73) int local73 = local47.method3073();
		local8.anInt3774 = local47.method3077();
		local8.anInt3771 = local47.method3077();
		local8.anInt3772 = local47.method3077();
		local8.anInt3773 = local47.method3077();
		@Pc(97) int local97 = local47.method3062();
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (local97 > 0) {
			local8.aClass75Array1 = new Class75[local97];
			for (local105 = 0; local105 < local97; local105++) {
				local111 = local47.method3077();
				@Pc(118) Class75 local118 = new Class75(Static213.method3129(local111));
				local8.aClass75Array1[local105] = local118;
				while (local111-- > 0) {
					@Pc(129) int local129 = local47.method3073();
					@Pc(135) int local135 = local47.method3073();
					local118.method2069(new Class5_Sub20(local135), (long) local129);
				}
			}
		}
		local47.anInt4050 = 0;
		local8.aClass20_1399 = local47.method3052();
		local8.anIntArray401 = new int[local73];
		local8.aClass20Array29 = new Class20[local73];
		local8.anIntArray400 = new int[local73];
		local105 = 0;
		while (local66 > local47.anInt4050) {
			local111 = local47.method3077();
			if (local111 == 3) {
				local8.aClass20Array29[local105] = local47.method3027();
			} else if (local111 >= 100 || local111 == 21 || local111 == 38 || local111 == 39) {
				local8.anIntArray401[local105] = local47.method3062();
			} else {
				local8.anIntArray401[local105] = local47.method3073();
			}
			local8.anIntArray400[local105++] = local111;
		}
		Static142.aClass8_28.method232((long) arg0, local8);
		return local8;
	}
}

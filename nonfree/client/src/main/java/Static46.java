import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lclient!ak;")
	public static Class8 aClass8_3 = new Class8(64);

	@OriginalMember(owner = "client!dk", name = "hb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_306 = Static231.method3737("Ok");

	@OriginalMember(owner = "client!dk", name = "fb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_304 = aClass107_306;

	@OriginalMember(owner = "client!dk", name = "gb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_305 = Static231.method3737("lila:");

	@OriginalMember(owner = "client!dk", name = "ib", descriptor = "I")
	public static int anInt1029 = 0;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
	public static void method906() {
		Static186.aClass61_72.method1697();
		Static188.aClass61_73.method1697();
		Static110.aClass61_44.method1697();
	}

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
	public static void method907() {
		for (@Pc(12) int local12 = 0; local12 < Static189.anInt4167; local12++) {
			@Pc(18) int local18 = Static12.anIntArray35[local12];
			@Pc(22) Class5_Sub5_Sub2 local22 = Static33.aClass5_Sub5_Sub2Array1[local18];
			@Pc(26) int local26 = Static194.aClass1_Sub26_Sub1_3.method2945();
			@Pc(39) int local39;
			if ((local26 & 0x40) != 0) {
				local22.anInt3045 = Static194.aClass1_Sub26_Sub1_3.method2964();
				local39 = Static194.aClass1_Sub26_Sub1_3.method2981();
				local22.anInt3029 = (local39 & 0xFFFF) + Static128.anInt2802;
				local22.anInt3038 = 0;
				local22.anInt3050 = 0;
				if (local22.anInt3045 == 65535) {
					local22.anInt3045 = -1;
				}
				if (Static128.anInt2802 < local22.anInt3029) {
					local22.anInt3038 = -1;
				}
				local22.anInt3043 = local39 >> 16;
			}
			if ((local26 & 0x20) != 0) {
				local22.aClass107_826 = Static194.aClass1_Sub26_Sub1_3.method2978();
				local22.anInt2998 = 100;
			}
			@Pc(102) int local102;
			if ((local26 & 0x2) != 0) {
				local39 = Static194.aClass1_Sub26_Sub1_3.method2968();
				local102 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local22.method2312(local102, local39, Static128.anInt2802);
			}
			if ((local26 & 0x4) != 0) {
				local39 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local102 = Static194.aClass1_Sub26_Sub1_3.method2968();
				local22.method2312(local102, local39, Static128.anInt2802);
				local22.anInt3010 = Static128.anInt2802 + 300;
				local22.anInt3051 = Static194.aClass1_Sub26_Sub1_3.method2942();
			}
			if ((local26 & 0x10) != 0) {
				local39 = Static194.aClass1_Sub26_Sub1_3.method2977();
				if (local39 == 65535) {
					local39 = -1;
				}
				local102 = Static194.aClass1_Sub26_Sub1_3.method2942();
				Static66.method1216(local22, local102, local39);
			}
			if ((local26 & 0x8) != 0) {
				local22.anInt3025 = Static194.aClass1_Sub26_Sub1_3.method2964();
				if (local22.anInt3025 == 65535) {
					local22.anInt3025 = -1;
				}
			}
			if ((local26 & 0x1) != 0) {
				local22.anInt3011 = Static194.aClass1_Sub26_Sub1_3.method2977();
				local22.anInt3026 = Static194.aClass1_Sub26_Sub1_3.method2987();
			}
			if ((local26 & 0x80) != 0) {
				if (local22.aClass30_1.method868()) {
					Static190.method3100(local22);
				}
				local22.aClass30_1 = Static139.method2340(Static194.aClass1_Sub26_Sub1_3.method2987());
				local22.anInt2997 = local22.aClass30_1.anInt961;
				local22.anInt3022 = local22.aClass30_1.anInt973;
				local22.anInt3030 = local22.aClass30_1.anInt957;
				local22.anInt3052 = local22.aClass30_1.anInt992;
				local22.anInt3020 = local22.aClass30_1.anInt983;
				local22.anInt3004 = local22.aClass30_1.anInt979;
				local22.anInt3035 = local22.aClass30_1.anInt967;
				local22.anInt3007 = local22.aClass30_1.anInt985;
				local22.anInt3037 = local22.aClass30_1.anInt977;
				if (local22.aClass30_1.method868()) {
					Static194.method3159(null, local22, null, 0, local22.anIntArray260[0], Static191.anInt4237, local22.anIntArray256[0]);
				}
			}
		}
	}
}

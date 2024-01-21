import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1725 = Static32.method683("Loading)3)3)3");

	@OriginalMember(owner = "client!ja", name = "R", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1726 = aClass49_1725;

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1727 = Static32.method683(")1p");

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
	public static int anInt3951 = 10;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
	public static void method2915() {
		aClass49_1725 = null;
		aClass49_1726 = null;
		aClass49_1727 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!bg;Lclient!bg;B)I")
	public static int method2927(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2062(Static117.aClass49_1123, Static129.aClass49_1268)) {
			local5++;
		}
		if (arg1.method2062(Static73.aClass49_796, Static129.aClass49_1268)) {
			local5++;
		}
		if (arg1.method2062(Static78.aClass49_843, Static129.aClass49_1268)) {
			local5++;
		}
		if (arg1.method2062(Static19.aClass49_261, Static129.aClass49_1268)) {
			local5++;
		}
		if (arg1.method2062(Static180.aClass49_1732, Static129.aClass49_1268)) {
			local5++;
		}
		if (arg1.method2062(Static143.aClass49_1381, Static129.aClass49_1268)) {
			local5++;
		}
		arg1.method2062(Static95.aClass49_976, Static129.aClass49_1268);
		arg1.method2062(Static157.aClass49_1548, Static129.aClass49_1268);
		arg1.method2062(Static164.aClass49_1626, Static129.aClass49_1268);
		arg1.method2062(Static99.aClass49_1010, Static129.aClass49_1268);
		arg1.method2062(Static180.aClass49_1730, Static129.aClass49_1268);
		return local5;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)I")
	public static int method2928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = Integer.MAX_VALUE & (local16 * 15731 * local16 + 789221) * local16 + 1376312589;
		return local30 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIB)V")
	public static void method2965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static133.anInt3713 < 2 && Static124.anInt2746 == 0 && !Static108.aBoolean93) {
			return;
		}
		@Pc(49) Class49 local49;
		if (Static124.anInt2746 == 1 && Static133.anInt3713 < 2) {
			local49 = Static33.method692(new Class49[] { Static64.aClass49_696, Static31.aClass49_427, Static180.aClass49_1728, Static151.aClass49_1469 });
		} else if (Static108.aBoolean93 && Static133.anInt3713 < 2) {
			local49 = Static33.method692(new Class49[] { Static103.aClass49_1026, Static31.aClass49_427, Static150.aClass49_1450, Static151.aClass49_1469 });
		} else {
			local49 = Static101.method1743(Static133.anInt3713 - 1);
		}
		if (Static133.anInt3713 > 2) {
			local49 = Static33.method692(new Class49[] { local49, Static46.aClass49_530, Static48.method882(Static133.anInt3713 - 2), Static162.aClass49_1613 });
		}
		@Pc(131) int local131 = Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1.method613(local49, arg1 + 4, arg0 + 15, Static82.aRandom1, Static82.anInt1769);
		Static170.method2828(15, arg0, arg1 + 4, Static42.aClass2_Sub2_Sub2_Sub1_Sub1_1.method614(local49) - -local131);
	}
}

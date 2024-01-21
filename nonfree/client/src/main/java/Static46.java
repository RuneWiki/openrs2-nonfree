import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	public static int anInt4756;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "[I")
	public static int[] anIntArray432;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Lclient!ge;")
	public static Class24 aClass24_38;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas38;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1241 = Static8.method128("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1237 = aClass18_1241;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	public static int anInt4762 = 0;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1238 = Static8.method128("AUS");

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "[I")
	public static int[] anIntArray433 = new int[32];

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1239 = Static8.method128("mapfunction");

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1240 = Static8.method128("Please use a different world)3");

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1242 = aClass18_1240;

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1243 = aClass18_1240;

	@OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
	public static int anInt4775 = 0;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method3204() {
		anIntArray433 = null;
		aCanvas38 = null;
		aClass18_1241 = null;
		aClass18_1242 = null;
		aClass18_1239 = null;
		anIntArray432 = null;
		aClass18_1243 = null;
		aClass18_1240 = null;
		aClass18_1237 = null;
		aClass24_38 = null;
		aClass18_1238 = null;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
	public static void method3208() {
		if (Static178.aClass20_14 != null || Static41.aClass20_4 != null) {
			return;
		}
		@Pc(17) int local17 = Static145.anInt4043;
		@Pc(26) int local26;
		@Pc(28) int local28;
		@Pc(79) int local79;
		if (Static149.aBoolean185) {
			if (local17 != 1) {
				local26 = Static154.anInt4252;
				local28 = Static9.anInt293;
				if (local26 < Static124.anInt3518 - 10 || Static124.anInt3518 + Static132.anInt3760 + 10 < local26 || Static110.anInt3236 - 10 > local28 || Static32.anInt1094 + Static110.anInt3236 + 10 < local28) {
					Static149.aBoolean185 = false;
					Static41.method817(Static132.anInt3760, Static124.anInt3518, Static110.anInt3236, Static32.anInt1094);
				}
			}
			if (local17 == 1) {
				local28 = Static110.anInt3236;
				local26 = Static124.anInt3518;
				@Pc(77) int local77 = Static74.anInt2247;
				local79 = Static132.anInt3760;
				@Pc(81) int local81 = Static91.anInt2764;
				@Pc(83) int local83 = -1;
				for (@Pc(85) int local85 = 0; local85 < Static80.anInt2478; local85++) {
					@Pc(100) int local100 = (Static80.anInt2478 - local85 - 1) * 15 + local28 + 31;
					if (local26 < local77 && local79 + local26 > local77 && local100 - 13 < local81 && local100 + 3 > local81) {
						local83 = local85;
					}
				}
				if (local83 != -1) {
					Static32.method698(local83);
				}
				Static149.aBoolean185 = false;
				Static41.method817(Static132.anInt3760, Static124.anInt3518, Static110.anInt3236, Static32.anInt1094);
				return;
			}
			return;
		}
		if (local17 == 1 && Static80.anInt2478 > 0) {
			local26 = Static114.anIntArray288[Static80.anInt2478 - 1];
			if (local26 == 37 || local26 == 39 || local26 == 41 || local26 == 58 || local26 == 21 || local26 == 38 || local26 == 30 || local26 == 12 || local26 == 43 || local26 == 57 || local26 == 5 || local26 == 1005) {
				local79 = Static130.anIntArray332[Static80.anInt2478 - 1];
				local28 = Static123.anIntArray311[Static80.anInt2478 - 1];
				@Pc(231) Class20 local231 = Static84.method1826(local79);
				if (method3209(Static36.method758(local231)) || Static95.method2079(Static36.method758(local231))) {
					Static161.anInt4407 = 0;
					Static157.aBoolean191 = false;
					if (Static178.aClass20_14 != null) {
						Static152.method2858(Static178.aClass20_14);
					}
					Static178.aClass20_14 = Static84.method1826(local79);
					anInt4775 = local28;
					Static59.anInt800 = Static74.anInt2247;
					Static122.anInt3467 = Static91.anInt2764;
					Static152.method2858(Static178.aClass20_14);
					return;
				}
			}
		}
		if (local17 == 1 && (Static8.anInt219 == 1 && Static80.anInt2478 > 2 || Static177.method3180(Static80.anInt2478 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static80.anInt2478 > 0) {
			Static32.method698(Static80.anInt2478 - 1);
		}
		if (local17 != 2 || Static80.anInt2478 <= 0) {
			return;
		}
		Static132.method2562();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
	private static boolean method3209(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)Z")
	public static boolean method3211() {
		return Static41.anInt1326 == 0 ? Static47.aClass1_Sub5_Sub3_12.method1231() : true;
	}
}

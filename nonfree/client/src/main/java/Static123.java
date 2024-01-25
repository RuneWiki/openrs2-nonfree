import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	public static int anInt2595 = 0;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public static int anInt2598 = 0;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	public static int anInt2600 = 127;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "S")
	public static short aShort31 = 320;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
	public static void method2410() {
		Static309.method5251();
		Static168.method3161();
		Static227.method3913();
		Static168.method3162();
		Static155.method3612();
		Static7.method233();
		Static4.method29();
		Static175.method3303();
		Static195.method3510();
		Static80.method4351();
		Static134.method2574();
		Static207.method3694();
		Static150.method2871();
		Static306.method5233();
		Static135.method2575();
		Static321.method5424();
		Static110.method2186();
		Static134.method2573();
		Static95.method5589();
		Static126.method2445();
		Static10.method303();
		Static35.method852();
		if (Static54.anInt1335 != 0) {
			for (@Pc(56) int local56 = 0; local56 < Static269.aByteArrayArray17.length; local56++) {
				Static269.aByteArrayArray17[local56] = null;
			}
			Static230.anInt4506 = 0;
		}
		Static257.method4468();
		Static39.method888();
		Static266.method4534();
		Static30.method752();
		Static270.method4585();
		Static223.aClass66_77.method1933();
		Static15.aClass59_1.method4815();
		Static338.aClass215_7.method5688();
		Static251.method4407();
		Static177.aClass170_50.method4561();
		Static350.aClass170_123.method4561();
		Static65.aClass170_36.method4561();
		Static309.aClass170_103.method4561();
		Static101.aClass170_44.method4561();
		Static2.aClass170_1.method4561();
		Static305.aClass170_102.method4561();
		Static276.aClass170_91.method4561();
		Static317.aClass170_114.method4561();
		Static247.aClass170_74.method4561();
		Static98.aClass170_42.method4561();
		Static226.aClass170_80.method4561();
		Static262.aClass170_90.method4561();
		Static202.aClass170_75.method4561();
		Static51.aClass170_13.method4561();
		Static92.aClass170_40.method4561();
		Static303.aClass170_101.method4561();
		Static101.aClass170_46.method4561();
		Static145.aClass170_118.method4561();
		Static176.aClass170_34.method4561();
		Static310.aClass170_107.method4561();
		Static183.aClass170_65.method4561();
		Static332.aClass170_119.method4561();
		Static117.aClass170_52.method4561();
		Static336.aClass170_94.method4561();
		Static297.aClass170_98.method4561();
		Static250.aClass170_89.method4561();
		Static130.aClass170_55.method4561();
		Static134.aClass170_59.method4561();
		Static21.aClass66_102.method1933();
		Static259.aClass66_57.method1933();
		Static95.aClass66_105.method1933();
		Static156.aClass66_54.method1933();
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
	public static void method2411() {
		@Pc(15) Class117 local15 = null;
		try {
			@Pc(19) Class60 local19 = Static202.aClass10_3.method309();
			while (local19.anInt1838 == 0) {
				Static105.method2138(1L);
			}
			if (local19.anInt1838 == 1) {
				local15 = (Class117) local19.anObject2;
				@Pc(44) Class5_Sub1 local44 = new Class5_Sub1(Static140.anInt2796 * 6 + 3);
				local44.method1886(1);
				local44.method1870(Static140.anInt2796);
				for (@Pc(54) int local54 = 0; local54 < Static286.anIntArray412.length; local54++) {
					if (Static161.aBooleanArray15[local54]) {
						local44.method1870(local54);
						local44.method1851(Static286.anIntArray412[local54]);
					}
				}
				local15.method3256(local44.anInt2029, 0, local44.aByteArray18);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local15 != null) {
				local15.method3260();
			}
		} catch (@Pc(96) Exception local96) {
		}
		Static287.aLong190 = Static284.method4783();
		Static236.aBoolean334 = false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)Lclient!ma;")
	public static Class5_Sub9_Sub15 method2413(@OriginalArg(1) int arg0) {
		@Pc(18) Class5_Sub9_Sub15 local18 = (Class5_Sub9_Sub15) Static173.aClass66_79.method1939((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static75.aClass170_26.method4584(26, arg0);
		local18 = new Class5_Sub9_Sub15();
		if (local28 != null) {
			local18.method3393(new Class5_Sub1(local28));
		}
		Static173.aClass66_79.method1936((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ra;Lclient!ra;Lclient!ra;Lclient!ra;Z)V")
	public static void method2414(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) Class170 arg2, @OriginalArg(3) Class170 arg3) {
		Static190.aClass170_72 = arg0;
		Static327.aClass170_117 = arg1;
		Static36.aClass170_6 = arg3;
		Static352.aClass170_124 = arg2;
		Static348.aClass96ArrayArray1 = new Class96[Static327.aClass170_117.method4581()][];
		Static225.aBooleanArray17 = new boolean[Static327.aClass170_117.method4581()];
	}
}

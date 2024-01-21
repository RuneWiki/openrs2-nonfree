import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!d", name = "Kb", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_10;

	@OriginalMember(owner = "client!d", name = "Ob", descriptor = "Lclient!fd;")
	public static Class21 aClass21_3;

	@OriginalMember(owner = "client!d", name = "Lb", descriptor = "I")
	public static int anInt857 = 1;

	@OriginalMember(owner = "client!d", name = "Mb", descriptor = "[I")
	public static int[] anIntArray49 = new int[100];

	@OriginalMember(owner = "client!d", name = "Pb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_218 = Static8.method128("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!d", name = "Tb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_219 = aClass18_218;

	@OriginalMember(owner = "client!d", name = "Vb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_220 = Static8.method128("Einloggen");

	@OriginalMember(owner = "client!d", name = "ac", descriptor = "I")
	public static int anInt867 = 0;

	@OriginalMember(owner = "client!d", name = "cc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_221 = Static8.method128("<col=ffff00>");

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class20 local8 = Static168.method3089(arg1, arg0);
		if (local8 != null && local8.anObjectArray16 != null) {
			@Pc(17) Class1_Sub10 local17 = new Class1_Sub10();
			local17.aClass20_6 = local8;
			local17.anObjectArray28 = local8.anObjectArray16;
			Static97.method2118(local17);
		}
		Static122.anInt3449 = arg2;
		Static52.anInt1677 = arg0;
		Static21.aBoolean19 = true;
		Static73.anInt1884 = arg1;
		Static152.method2858(local8);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!ee;Z)V")
	public static void method558(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg0.anInt1188;
		@Pc(15) int local15 = (int) arg0.aLong139;
		arg0.method3198();
		if (arg1) {
			Static132.method2565(local11);
		}
		Static120.method2353(local11);
		@Pc(32) Class20 local32 = Static84.method1826(local15);
		if (local32 != null) {
			Static152.method2858(local32);
		}
		Static149.aBoolean185 = false;
		Static80.anInt2478 = 0;
		Static41.method817(Static132.anInt3760, Static124.anInt3518, Static110.anInt3236, Static32.anInt1094);
		if (Static73.anInt1882 != -1) {
			Static58.method1198(Static73.anInt1882, 1);
		}
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "(II)Lclient!ea;")
	public static Class18 method560(@OriginalArg(0) int arg0) {
		@Pc(16) Class18 local16 = Static132.method2564(arg0);
		for (@Pc(22) int local22 = local16.method747() - 3; local22 > 0; local22 -= 3) {
			local16 = Static144.method2735(new Class18[] { local16.method744(0, local22), Static27.aClass18_233, local16.method733(local22) });
		}
		if (local16.method747() > 9) {
			return Static144.method2735(new Class18[] { Static153.aClass18_1077, local16.method744(0, local16.method747() - 8), Static136.aClass18_970, Static132.aClass18_948, local16, Static5.aClass18_73 });
		} else if (local16.method747() > 6) {
			return Static144.method2735(new Class18[] { Static170.aClass18_1197, local16.method744(0, local16.method747() - 4), Static61.aClass18_457, Static132.aClass18_948, local16, Static5.aClass18_73 });
		} else {
			return Static144.method2735(new Class18[] { Static45.aClass18_373, local16, Static121.aClass18_871 });
		}
	}

	@OriginalMember(owner = "client!d", name = "v", descriptor = "(I)V")
	public static void method561() {
		aClass16_Sub1_10 = null;
		aClass18_220 = null;
		aClass18_218 = null;
		anIntArray49 = null;
		aClass21_3 = null;
		aClass18_219 = null;
		aClass18_221 = null;
	}
}

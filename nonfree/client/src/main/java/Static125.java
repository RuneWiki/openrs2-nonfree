import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
	public static int[] anIntArray493;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
	public static int[] anIntArray494 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1682 = Static106.method1849("Spieler");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!he;B)Z")
	public static boolean method2012(@OriginalArg(0) Class1_Sub10 arg0) {
		if (arg0.anIntArray197 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray197.length; local19++) {
			@Pc(26) int local26 = Static122.method1993(arg0, local19);
			@Pc(31) int local31 = arg0.anIntArray202[local19];
			if (arg0.anIntArray197[local19] == 2) {
				if (local26 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray197[local19] == 3) {
				if (local31 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray197[local19] == 4) {
				if (local26 == local31) {
					return false;
				}
			} else if (local31 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIBI)V")
	public static void method2013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static96.aClass1_Sub1_Sub2_Sub3Array10[0].method997(arg2, arg3);
		Static96.aClass1_Sub1_Sub2_Sub3Array10[1].method997(arg2, arg3 + arg0 - 16);
		Static115.method1670(arg2, arg3 + 16, 16, arg0 - 32, Static132.anInt2925);
		@Pc(43) int local43 = (arg0 - 32) * arg0 / arg4;
		if (local43 < 8) {
			local43 = 8;
		}
		@Pc(62) int local62 = (arg0 - local43 - 32) * arg1 / (arg4 - arg0);
		Static115.method1670(arg2, local62 + arg3 + 16, 16, local43, Static129.anInt2919);
		Static115.method1671(arg2, local62 + arg3 + 16, local43, Static8.anInt341);
		Static115.method1671(arg2 + 1, arg3 - (-16 - local62), local43, Static8.anInt341);
		Static115.method1676(arg2, local62 + arg3 + 16, 16, Static8.anInt341);
		Static115.method1676(arg2, arg3 + local62 + 17, 16, Static8.anInt341);
		Static115.method1671(arg2 + 15, local62 + arg3 + 16, local43, Static53.anInt1743);
		Static115.method1671(arg2 + 14, arg3 + 17 + local62, local43 - 1, Static53.anInt1743);
		Static115.method1676(arg2, arg3 + local62 + local43 + 15, 16, Static53.anInt1743);
		Static115.method1676(arg2 + 1, arg3 + 14 - -local62 - -local43, 15, Static53.anInt1743);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method2014() {
		anIntArray493 = null;
		anIntArray494 = null;
		aClass66_1682 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
	public static int method2015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg1;
		return (arg1 * (arg0 & 0xFF00) + local13 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local13 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZIIIII)V")
	public static void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static51.method1090(arg6)) {
			Static2.method49(arg4, -1, arg1, arg2, Static100.aClass1_Sub10ArrayArray1[arg6], arg3, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public static void method2017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static28.anInt734 == 2) {
			Static111.method1873((Static4.anInt192 - Static48.anInt1496 << 7) + Static85.anInt2251, Static27.anInt728 * 2, (Static90.anInt1841 - Static52.anInt1603 << 7) + Static101.anInt2504);
			if (Static13.anInt454 > -1 && Static22.anInt636 % 20 < 10) {
				Static83.aClass1_Sub1_Sub2_Sub1Array48[0].method250(Static13.anInt454 + arg0 - 12, arg1 + (Static104.anInt2558 - 28));
			}
		}
	}
}

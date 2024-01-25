import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!f;")
	public static Class49 aClass49_12;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_36 = new Class254();

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_147 = new Class151("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_167 = new Class214(98, 6);

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt4656 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3692(@OriginalArg(0) String arg0) {
		if (!Static360.aBoolean498) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static31.anInt624;
		@Pc(14) int[] local14 = Static363.anIntArray373;
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			@Pc(30) Class20_Sub3_Sub3_Sub1 local30 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local14[local22]];
			if (local30 != null && local30 != Static239.aClass20_Sub3_Sub3_Sub1_1 && local30.aString48 != null && local30.aString48.equalsIgnoreCase(arg0)) {
				Static5.method94(Static87.aClass137_79);
				Static75.aClass1_Sub11_Sub1_1.method4492(Static234.anInt3782);
				Static75.aClass1_Sub11_Sub1_1.method4464(Static364.anInt6148);
				Static75.aClass1_Sub11_Sub1_1.method4464(local14[local22]);
				Static75.aClass1_Sub11_Sub1_1.method4443(0);
				Static75.aClass1_Sub11_Sub1_1.method4474(Static315.anInt5215);
				local10 = true;
				Static308.method4012(local30.anIntArray369[0], local30.method4678(), local30.anIntArray370[0], local30.method4678(), true, 0, 0, -2);
				break;
			}
		}
		if (!local10) {
			Static360.method4660(Static214.aClass151_224.method3122(Static188.anInt3028) + arg0);
		}
		if (Static360.aBoolean498) {
			Static172.method2334();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lclient!cn;")
	public static Class1_Sub7 method3693() {
		if (Static114.aClass254_45 == null || Static60.aClass172_1 == null) {
			return null;
		}
		Static60.aClass172_1.method3437(Static114.aClass254_45);
		@Pc(23) Class1_Sub7 local23 = (Class1_Sub7) Static60.aClass172_1.method3434();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class56 local33 = Static114.aClass101_4.method2104(local23.anInt969);
			return local33 != null && local33.aBoolean116 && local33.method1234(Static114.anInterface11_2) ? local23 : Static215.method2851();
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method3694() {
		if (Static296.anInt4979 < 0) {
			return;
		}
		@Pc(11) long local11 = Static232.method3058();
		Static296.anInt4979 = (int) ((long) Static296.anInt4979 + Static326.aLong162 - local11);
		if (Static296.anInt4979 > 0) {
			@Pc(31) int local31 = (Static296.anInt4979 << 8) / Static359.anInt5969;
			@Pc(36) int local36 = 255 - local31;
			@Pc(41) float local41 = (float) local31 / 255.0F;
			@Pc(45) float local45 = 1.0F - local41;
			Static308.anInt5126 = (local36 * (Static34.aClass210_1.anInt5573 & 0xFF00) + local31 * (Static137.anInt2326 & 0xFF00) & 0xFF0000) + ((Static137.anInt2326 & 0xFF00FF) * local31 + (Static34.aClass210_1.anInt5573 & 0xFF00FF) * local36 & 0xFF00FF00) >>> 8;
			Static354.anInt5870 = (local31 * (Static380.anInt6319 & 0xFF00) + local36 * (Static34.aClass210_1.anInt5575 & 0xFF00) & 0xFF0000) + (local36 * (Static34.aClass210_1.anInt5575 & 0xFF00FF) + (Static380.anInt6319 & 0xFF00FF) * local31 & 0xFF00FF00) >>> 8;
			Static85.aFloat74 = local45 * (Static34.aClass210_1.aFloat83 - Static14.aFloat1) + Static14.aFloat1;
			Static320.aFloat78 = Static316.aFloat77 + (Static34.aClass210_1.aFloat82 - Static316.aFloat77) * local45;
			Static22.aFloat4 = local45 * (Static34.aClass210_1.aFloat84 - Static171.aFloat37) + Static171.aFloat37;
			Static121.anInt2075 = local31 * Static237.anInt3845 + Static34.aClass210_1.anInt5576 * local36 >> 8;
			Static109.aFloat28 = Static177.aFloat39 + (Static34.aClass210_1.aFloat81 - Static177.aFloat39) * local45;
			Static84.aFloat24 = local45 * (Static34.aClass210_1.aFloat79 - Static149.aFloat101) + Static149.aFloat101;
			Static453.aFloat102 = Static368.aFloat88 + local45 * (Static34.aClass210_1.aFloat80 - Static368.aFloat88);
			if (Static103.aClass9_1 != Static34.aClass210_1.aClass9_5) {
				Static252.aClass9_3 = Static38.aClass128_9.method3579(Static103.aClass9_1, Static34.aClass210_1.aClass9_5, local45, Static252.aClass9_3);
			}
		} else {
			Static22.aFloat4 = Static34.aClass210_1.aFloat84;
			Static85.aFloat74 = Static34.aClass210_1.aFloat83;
			Static121.anInt2075 = Static34.aClass210_1.anInt5576;
			Static252.aClass9_3 = Static34.aClass210_1.aClass9_5;
			Static354.anInt5870 = Static34.aClass210_1.anInt5575;
			Static84.aFloat24 = Static34.aClass210_1.aFloat79;
			Static453.aFloat102 = Static34.aClass210_1.aFloat80;
			Static109.aFloat28 = Static34.aClass210_1.aFloat81;
			Static308.anInt5126 = Static34.aClass210_1.anInt5573;
			Static296.anInt4979 = -1;
			Static320.aFloat78 = Static34.aClass210_1.aFloat82;
		}
		Static326.aLong162 = local11;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method3696() {
		Static321.aClass31_4.method3802();
		Static210.aClass26_1.method571();
		if (Static19.aClass103_1 != null) {
			Static19.aClass103_1.method2127(Static226.aCanvas9);
		}
		Static389.aClient4.method782();
		Static226.aCanvas9.setBackground(Color.black);
		Static118.anInt2025 = -1;
		Static321.aClass31_4 = Static414.method5162(Static226.aCanvas9);
		Static210.aClass26_1 = Static175.method2290(Static226.aCanvas9);
		if (Static19.aClass103_1 != null) {
			Static19.aClass103_1.method2125(Static226.aCanvas9);
		}
	}
}

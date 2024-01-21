import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lclient!ja;")
	public static Class1_Sub11[] aClass1_Sub11Array1;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!rd;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Z")
	public static boolean aBoolean3;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!sf;")
	public static Class5 aClass5_6;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	public static int anInt117;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!sc;")
	private static Class66 aClass66_111 = Static106.method1849("Close");

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!sc;")
	private static Class66 aClass66_112 = Static106.method1849("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_113 = Static106.method1849("(U(Y");

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_114 = aClass66_111;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!sc;")
	private static Class66 aClass66_117 = Static106.method1849("skill)2");

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_115 = aClass66_117;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!sc;")
	private static Class66 aClass66_122 = Static106.method1849("Loaded input handler");

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!sc;")
	public static Class66 aClass66_118 = aClass66_122;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!sc;")
	public static Class66 aClass66_119 = Static106.method1849("Stufe)2");

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!sc;")
	public static Class66 aClass66_120 = aClass66_112;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!sc;")
	public static Class66 aClass66_121 = Static106.method1849("Standort");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method76() {
		for (@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static52.aClass65_22.method1803(); local10 != null; local10 = (Class1_Sub22) Static52.aClass65_22.method1801()) {
			@Pc(15) int local15 = local10.anInt2781;
			if (Static51.method1090(local15)) {
				@Pc(23) Class1_Sub10[] local23 = Static100.aClass1_Sub10ArrayArray1[local15];
				@Pc(25) boolean local25 = true;
				for (@Pc(27) int local27 = 0; local27 < local23.length; local27++) {
					if (local23[local27] != null) {
						local25 = local23[local27].aBoolean54;
						break;
					}
				}
				if (!local25) {
					@Pc(51) int local51 = (int) local10.aLong130;
					@Pc(57) Class1_Sub10 local57 = Static38.method2002(local51);
					if (local57 != null) {
						Static70.method537(local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method77() {
		aClass66_115 = null;
		aClass66_113 = null;
		aClass66_114 = null;
		aClass5_6 = null;
		aClass66_119 = null;
		aClass66_118 = null;
		aClass6_1 = null;
		aClass66_117 = null;
		aClass66_120 = null;
		aClass66_122 = null;
		aClass66_112 = null;
		aClass1_Sub11Array1 = null;
		aClass66_111 = null;
		aClass66_121 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static125.anInt2869 != 0 && Static125.anInt2869 != 3 || Static97.anInt2474 != 1) {
			return;
		}
		@Pc(31) int local31 = Static35.anInt866 - arg1 - 25;
		@Pc(38) int local38 = Static6.anInt308 - arg0 - 5;
		if (local31 < 0 || local38 < 0 || local31 >= 146 || local38 >= 151) {
			return;
		}
		local38 -= 75;
		@Pc(60) int local60 = Static38.anInt2851 + Static75.anInt2076 & 0x7FF;
		local31 -= 73;
		@Pc(65) int local65 = Class1_Sub1_Sub2_Sub4.anIntArray399[local60];
		@Pc(73) int local73 = local65 * (Static70.anInt712 + 256) >> 8;
		@Pc(77) int local77 = Class1_Sub1_Sub2_Sub4.anIntArray397[local60];
		@Pc(85) int local85 = local77 * (Static70.anInt712 + 256) >> 8;
		@Pc(96) int local96 = local85 * local38 - local31 * local73 >> 11;
		@Pc(107) int local107 = local38 * local73 + local85 * local31 >> 11;
		@Pc(114) int local114 = local107 + Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 >> 7;
		@Pc(122) int local122 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 - local96 >> 7;
		@Pc(142) boolean local142 = Static35.method633(local114, 0, 0, 0, 1, local122, 0, true, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
		if (!local142) {
			return;
		}
		Static127.aClass1_Sub12_Sub1_2.method1197(local31);
		Static127.aClass1_Sub12_Sub1_2.method1197(local38);
		Static127.aClass1_Sub12_Sub1_2.method1175(Static75.anInt2076);
		Static127.aClass1_Sub12_Sub1_2.method1197(57);
		Static127.aClass1_Sub12_Sub1_2.method1197(Static38.anInt2851);
		Static127.aClass1_Sub12_Sub1_2.method1197(Static70.anInt712);
		Static127.aClass1_Sub12_Sub1_2.method1197(89);
		Static127.aClass1_Sub12_Sub1_2.method1175(Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261);
		Static127.aClass1_Sub12_Sub1_2.method1175(Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271);
		Static127.aClass1_Sub12_Sub1_2.method1197(Static121.anInt2820);
		Static127.aClass1_Sub12_Sub1_2.method1197(63);
		return;
	}
}

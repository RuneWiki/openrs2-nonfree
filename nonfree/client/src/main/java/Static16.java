import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
	public static boolean aBoolean20;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array14;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public static int anInt490;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public static int anInt481 = 0;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt485 = 1;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!sc;")
	public static Class66 aClass66_306 = Static106.method1849("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_307 = Static106.method1849("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public static int anInt487 = 0;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!sc;")
	private static Class66 aClass66_310 = Static106.method1849("Loaded textures");

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_308 = aClass66_310;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_309 = Static106.method1849("<col=ff3000>");

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "Lclient!sc;")
	public static Class66 aClass66_311 = Static106.method1849("Hidden)2");

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!sc;")
	private static Class66 aClass66_313 = Static106.method1849("Login");

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!sc;")
	public static Class66 aClass66_312 = aClass66_313;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method412() {
		aShortArrayArray2 = null;
		aClass66_313 = null;
		aShortArrayArray1 = null;
		anIntArray81 = null;
		aClass66_311 = null;
		aClass66_307 = null;
		aClass1_Sub1_Sub2_Sub1Array14 = null;
		aClass66_306 = null;
		aClass66_312 = null;
		aClass66_310 = null;
		aClass66_309 = null;
		aClass66_308 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method413() {
		@Pc(7) int local7 = Static80.anInt2176;
		@Pc(9) int local9 = Static79.anInt2166;
		@Pc(11) int local11 = Static124.anInt2863;
		@Pc(13) int local13 = Static73.anInt2120;
		Static115.method1670(local9, local7, local11, local13, 6116423);
		Static115.method1670(local9 + 1, local7 + 1, local11 - 2, 16, 0);
		Static115.method1662(local9 + 1, local7 + 18, local11 - 2, local13 + -19, 0);
		Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method790(Static98.aClass66_1381, local9 + 3, local7 + 14, 6116423, -1);
		@Pc(60) int local60 = Static50.anInt1542;
		@Pc(62) int local62 = Static13.anInt462;
		for (@Pc(64) int local64 = 0; local64 < Static5.anInt228; local64++) {
			@Pc(79) int local79 = (Static5.anInt228 - local64 - 1) * 15 + local7 + 31;
			@Pc(81) int local81 = 16777215;
			if (local9 < local60 && local60 < local9 + local11 && local62 > local79 - 13 && local62 < local79 + 3) {
				local81 = 16776960;
			}
			Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method790(Static32.method621(local64), local9 + 3, local79, local81, 0);
		}
		Static27.method550(Static124.anInt2863, Static80.anInt2176, Static73.anInt2120, Static79.anInt2166);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)I")
	public static int method414(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method416() {
		Static81.aClass60_63.method1747();
		Static1.aClass60_7.method1747();
		Static13.aClass60_25.method1747();
	}
}

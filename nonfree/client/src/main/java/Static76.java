import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public static int anInt2094;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "[Lclient!k;")
	public static Class36[] aClass36Array1 = new Class36[50];

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
	public static int anInt2092 = 1;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!he;")
	private static Class26 aClass26_1075 = Static6.method100("Please contact customer support)3");

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "[I")
	public static int[] anIntArray206 = new int[2048];

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static int anInt2098 = 0;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_1076 = aClass26_1075;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_1077 = Static6.method100("<img=0>");

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_1078 = Static6.method100("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	public static int anInt2100 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
	public static void method1355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg1;
		@Pc(15) int[] local15 = new int[4];
		local15[0] = arg0;
		@Pc(21) int local21 = 1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static35.anIntArray130[local28] != arg1) {
				local8[local21] = Static35.anIntArray130[local28];
				local15[local21] = Static106.anIntArray341[local28];
				local21++;
			}
		}
		Static106.anIntArray341 = local15;
		Static35.anIntArray130 = local8;
		Static104.method1941(Static106.anIntArray341, Static21.aClass10Array1.length - 1, Static35.anIntArray130, 0, Static21.aClass10Array1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(JB)V")
	public static void method1356(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static44.anInt1362 >= 100) {
			Static67.method1915(Static5.aClass26_1744, Static22.aClass26_415, 0);
			return;
		}
		@Pc(29) Class26 local29 = Static111.method2010(arg0).method853();
		for (@Pc(31) int local31 = 0; local31 < Static44.anInt1362; local31++) {
			if (Static14.aLongArray1[local31] == arg0) {
				Static67.method1915(Static119.method2136(new Class26[] { local29, Static71.aClass26_1007 }), Static22.aClass26_415, 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static133.anInt568; local66++) {
			if (arg0 == Static105.aLongArray8[local66]) {
				Static67.method1915(Static119.method2136(new Class26[] { Static88.aClass26_1278, local29, Static63.aClass26_957 }), Static22.aClass26_415, 0);
				return;
			}
		}
		if (local29.method816(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass26_393)) {
			Static67.method1915(Static42.aClass26_694, Static22.aClass26_415, 0);
		} else {
			Static14.aLongArray1[Static44.anInt1362++] = arg0;
			Static3.anInt81 = Static71.anInt2023;
			Static107.aClass3_Sub11_Sub1_3.method1029(102);
			Static107.aClass3_Sub11_Sub1_3.method1020(arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] method1357() {
		@Pc(8) Class3_Sub1_Sub4_Sub1[] local8 = new Class3_Sub1_Sub4_Sub1[Static78.anInt2101];
		for (@Pc(16) int local16 = 0; local16 < Static78.anInt2101; local16++) {
			@Pc(26) Class3_Sub1_Sub4_Sub1 local26 = local8[local16] = new Class3_Sub1_Sub4_Sub1();
			local26.anInt508 = Static88.anInt2448;
			local26.anInt506 = Static53.anInt1619;
			local26.anInt507 = Static57.anIntArray169[local16];
			local26.anInt510 = Static58.anIntArray173[local16];
			local26.anInt509 = Static51.anIntArray157[local16];
			local26.anInt511 = Static46.anIntArray148[local16];
			local26.anIntArray60 = Static110.anIntArray351;
			local26.aByteArray2 = Static117.aByteArrayArray19[local16];
		}
		Static67.method1913();
		return local8;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public static void method1358() {
		aClass26_1076 = null;
		aClass26_1078 = null;
		aClass26_1075 = null;
		aClass26_1077 = null;
		aClass36Array1 = null;
		anIntArray206 = null;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)I")
	public static int method1359() {
		@Pc(17) int local17 = Static110.method2006(Static10.anInt282, Static54.anInt1624, Static132.anInt3270);
		return local17 - Static79.anInt2157 >= 800 || (Static74.aByteArrayArrayArray5[Static132.anInt3270][Static10.anInt282 >> 7][Static54.anInt1624 >> 7] & 0x4) == 0 ? 3 : Static132.anInt3270;
	}
}

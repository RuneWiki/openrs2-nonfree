import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
	public static long aLong70;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_54;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!g;")
	public static Class26 aClass26_20;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_1229 = Static72.method1077("Spieler");

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!u;")
	private static Class74 aClass74_1230 = Static72.method1077("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1231 = aClass74_1230;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_1232 = Static72.method1077("Entfernen");

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_1233 = Static72.method1077("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1265() {
		aClass74_1233 = null;
		aClass26_20 = null;
		aClass26_Sub1_54 = null;
		aClass74_1231 = null;
		aClass74_1230 = null;
		aClass74_1229 = null;
		aClass74_1232 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([BIII)Lclient!u;")
	public static Class74 method1266(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class74 local12 = new Class74();
		local12.aByteArray38 = new byte[arg1];
		local12.anInt2481 = 0;
		for (@Pc(21) int local21 = arg2; local21 < arg2 + arg1; local21++) {
			if (arg0[local21] != 0) {
				local12.aByteArray38[local12.anInt2481++] = arg0[local21];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)I")
	public static int method1267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class2_Sub12 local6 = (Class2_Sub12) Static87.aClass58_36.method1307((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local6.anIntArray157.length) {
			return local6.anIntArray157[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public static void method1268() {
		if (Static101.aClass2_Sub2_Sub17_3 == null) {
			return;
		}
		@Pc(13) Class2_Sub2_Sub17 local13 = Static101.aClass2_Sub2_Sub17_3;
		@Pc(17) Class2_Sub2_Sub17 local17 = Static15.method354(local13);
		if (local17 == null) {
			Static101.aClass2_Sub2_Sub17_3 = null;
			return;
		}
		Static109.anInt2399++;
		@Pc(28) int local28 = Static46.anInt1062;
		@Pc(30) int local30 = Static62.anInt1414;
		if (Static67.anInt1478 == 0) {
			local28 -= 4;
			local30 -= 4;
		}
		if (Static67.anInt1478 == 1) {
			local28 -= 553;
			local30 -= 205;
		}
		if (Static67.anInt1478 == 2) {
			local28 -= 17;
			local30 -= 357;
		}
		local28 -= Static81.anInt1791;
		local30 -= Static4.anInt56;
		@Pc(65) int[] local65 = Static40.method665(local17);
		if (local65[0] > local28) {
			local28 = local65[0];
		}
		if (local28 + local13.anInt2810 > local65[0] + local17.anInt2810) {
			local28 = local17.anInt2810 + local65[0] - local13.anInt2810;
		}
		if (local65[1] > local30) {
			local30 = local65[1];
		}
		if (local13.anInt2829 + local30 > local17.anInt2829 + local65[1]) {
			local30 = local17.anInt2829 + local65[1] - local13.anInt2829;
		}
		@Pc(140) int local140 = local17.anInt2836 + local30 - local65[1];
		@Pc(151) int local151 = local28 + local17.anInt2832 - local65[0];
		@Pc(163) Class2_Sub2_Sub17 local163 = Static89.aClass2_Sub2_Sub17ArrayArray1[local13.anInt2794 >> 16][local13.anInt2803 & 0xFFFF];
		@Pc(167) int[] local167 = Static40.method665(local163);
		@Pc(177) int local177 = local163.anInt2832 + local28 - local167[0];
		@Pc(188) int local188 = local30 + local163.anInt2836 - local167[1];
		@Pc(194) int local194 = local177 - local13.anInt2780;
		@Pc(200) int local200 = local188 - local13.anInt2834;
		if (local13.anInt2770 >= local194 && -local13.anInt2770 <= local194 && local200 <= local13.anInt2770 && local200 >= -local13.anInt2770 && !Static38.aBoolean34) {
			local140 -= local200;
			local151 -= local194;
		} else if (local13.anInt2768 < Static109.anInt2399 || Static38.aBoolean34) {
			Static38.aBoolean34 = true;
		} else {
			local140 -= local200;
			local151 -= local194;
		}
		if (Static101.aClass2_Sub2_Sub17_3.anObjectArray21 != null && Static38.aBoolean34) {
			Static45.method732(local13, local13.anObjectArray21, local140, 0, null, local151);
		}
		if (Static52.anInt1256 != 0) {
			return;
		}
		if (Static38.aBoolean34) {
			@Pc(313) Class2_Sub2_Sub17 local313 = Static111.method1681(Static81.anInt1791 + local151, Static4.anInt56 + local140, local17, local13);
			if (Static101.aClass2_Sub2_Sub17_3.anObjectArray10 != null) {
				Static45.method732(local13, local13.anObjectArray10, local140, 0, local313, local151);
			}
			if (local313 != null && Static9.method228(local13) != null) {
				Static128.aClass2_Sub10_Sub1_3.method1533(245);
				Static128.aClass2_Sub10_Sub1_3.method1504(local313.anInt2782);
				Static128.aClass2_Sub10_Sub1_3.method1492(local13.anInt2794);
				Static128.aClass2_Sub10_Sub1_3.method1492(local313.anInt2794);
				Static128.aClass2_Sub10_Sub1_3.method1482(local13.anInt2782);
			}
		} else {
			if (Static101.aClass2_Sub2_Sub17_3.anObjectArray19 != null) {
				Static45.method732(local13, local13.anObjectArray19, local140, 0, null, local151);
			}
			if ((Static128.anInt2901 == 1 || Static6.method113(Static112.anInt2421 - 1)) && Static112.anInt2421 > 2) {
				Static103.method1586();
			} else if (Static112.anInt2421 > 0) {
				Static29.method522(Static112.anInt2421 - 1);
			}
		}
		Static101.aClass2_Sub2_Sub17_3 = null;
		return;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!g;)V")
	public static void method1269(@OriginalArg(1) Class26 arg0) {
		Static124.aClass26_31 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;II)V")
	public static void method1270(@OriginalArg(0) Class2_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static19.method420(arg1, arg0.anInt2673, arg0.anInt2672);
	}
}

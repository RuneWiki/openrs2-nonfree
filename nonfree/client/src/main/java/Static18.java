import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!d", name = "f", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_5;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!vc;")
	private static Class71 aClass71_342 = Static38.method736("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_343 = Static38.method736("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!vc;")
	public static Class71 aClass71_344 = aClass71_342;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_345 = Static38.method736("");

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!pb;")
	public static Class52 aClass52_4 = new Class52();

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_346 = Static38.method736("Side panel redrawn");

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!vc;")
	private static Class71 aClass71_352 = Static38.method736("Checking for updates )2 ");

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_347 = aClass71_352;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!vc;")
	private static Class71 aClass71_350 = Static38.method736("green:");

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_348 = aClass71_350;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_349 = Static38.method736("Error connecting to server)3");

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_351 = aClass71_349;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_353 = Static38.method736("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method484() {
		aClass71_344 = null;
		aClass71_351 = null;
		aClass71_353 = null;
		aClass71_345 = null;
		aClass71_342 = null;
		aClass71_350 = null;
		aClass71_343 = null;
		aClass71_346 = null;
		aClass71_347 = null;
		anIntArray77 = null;
		aClass71_348 = null;
		aClass52_4 = null;
		aClass71_352 = null;
		aClass24_Sub1_5 = null;
		aClass71_349 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method485() {
		@Pc(9) int local9 = Static35.aClass5_Sub1_Sub10_Sub4_2.method2032(Static64.aClass71_1226);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static49.anInt1394; local11++) {
			local19 = Static35.aClass5_Sub1_Sub10_Sub4_2.method2031(Static24.aClass71Array8[local11]);
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static49.anInt1394 * 15 + 21;
		@Pc(80) int local80;
		@Pc(99) int local99;
		if (Static30.anInt800 > 4 && Static32.anInt847 > 4 && Static30.anInt800 < 516 && Static32.anInt847 < 338) {
			Static65.aBoolean71 = true;
			Static90.anInt2998 = 0;
			Static61.anInt1559 = Static49.anInt1394 * 15 + 22;
			Static100.anInt2365 = local9;
			local80 = Static30.anInt800 - local9 / 2 - 4;
			if (local9 + local80 > 512) {
				local80 = 512 - local9;
			}
			if (local80 < 0) {
				local80 = 0;
			}
			Static114.anInt2680 = local80;
			local99 = Static32.anInt847 - 4;
			if (local19 + local99 > 334) {
				local99 = 334 - local19;
			}
			if (local99 < 0) {
				local99 = 0;
			}
			Static38.anInt1025 = local99;
		}
		if (Static30.anInt800 > 553 && Static32.anInt847 > 205 && Static30.anInt800 < 743 && Static32.anInt847 < 466) {
			Static65.aBoolean71 = true;
			Static90.anInt2998 = 1;
			Static100.anInt2365 = local9;
			Static61.anInt1559 = Static49.anInt1394 * 15 + 22;
			local99 = Static32.anInt847 - 205;
			if (local99 < 0) {
				local99 = 0;
			} else if (local99 + local19 > 261) {
				local99 = 261 - local19;
			}
			Static38.anInt1025 = local99;
			local80 = Static30.anInt800 - local9 / 2 - 553;
			if (local80 < 0) {
				local80 = 0;
			} else if (local80 + local9 > 190) {
				local80 = 190 - local9;
			}
			Static114.anInt2680 = local80;
		}
		if (Static30.anInt800 <= 17 || Static32.anInt847 <= 357 || Static30.anInt800 >= 496 || Static32.anInt847 >= 453) {
			return;
		}
		Static65.aBoolean71 = true;
		Static100.anInt2365 = local9;
		Static61.anInt1559 = Static49.anInt1394 * 15 + 22;
		Static90.anInt2998 = 2;
		local80 = Static30.anInt800 - local9 / 2 - 17;
		if (local80 < 0) {
			local80 = 0;
		} else if (local80 + local9 > 479) {
			local80 = 479 - local9;
		}
		local99 = Static32.anInt847 - 357;
		Static114.anInt2680 = local80;
		if (local99 < 0) {
			local99 = 0;
		} else if (local99 + local19 > 96) {
			local99 = 96 - local19;
		}
		Static38.anInt1025 = local99;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method486(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static104.anInt3014 > 0) {
			local21 = Static79.aByteArrayArray7[--Static104.anInt3014];
			Static79.aByteArrayArray7[Static104.anInt3014] = null;
			return local21;
		} else if (arg0 == 5000 && Static77.anInt1914 > 0) {
			local21 = Static95.aByteArrayArray9[--Static77.anInt1914];
			Static95.aByteArrayArray9[Static77.anInt1914] = null;
			return local21;
		} else if (arg0 == 30000 && Static74.anInt907 > 0) {
			local21 = Static2.aByteArrayArray6[--Static74.anInt907];
			Static2.aByteArrayArray6[Static74.anInt907] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZI)Z")
	public static boolean method487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}
}

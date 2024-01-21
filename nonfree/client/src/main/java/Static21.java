import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public static int anInt611;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!jb;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_474 = Static72.method1077("@cr2@");

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!u;")
	private static Class74 aClass74_479 = Static72.method1077("Members only world");

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_475 = aClass74_479;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	public static int anInt612 = 0;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_476 = Static72.method1077("@or3@");

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "[Lclient!ie;")
	public static Class36[] aClass36Array1 = new Class36[50];

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "Lclient!u;")
	private static Class74 aClass74_477 = Static72.method1077("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_478 = aClass74_477;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	public static int anInt616 = 78;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	public static int anInt619 = 0;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
	public static void method455(@OriginalArg(0) int arg0) {
		Static117.anInt2524 += arg0 * 128;
		@Pc(31) int local31;
		if (Static117.anInt2524 > Static5.anIntArray8.length) {
			Static117.anInt2524 -= Static5.anIntArray8.length;
			local31 = (int) (Math.random() * 12.0D);
			Static126.method1918(Static53.aClass2_Sub2_Sub1_Sub1Array7[local31]);
		}
		local31 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local75 = Static32.anIntArray96[local42 + local31] - arg0 * Static5.anIntArray8[Static5.anIntArray8.length - 1 & local31 - -Static117.anInt2524] / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static32.anIntArray96[local31++] = local75;
		}
		@Pc(103) int local103;
		@Pc(105) int local105;
		@Pc(112) int local112;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local103 = local75 * 128;
			for (local105 = 0; local105 < 128; local105++) {
				local112 = (int) (Math.random() * 100.0D);
				if (local112 < 50 && local105 > 10 && local105 < 118) {
					Static32.anIntArray96[local105 + local103] = 255;
				} else {
					Static32.anIntArray96[local103 + local105] = 0;
				}
			}
		}
		if (Static91.anInt1910 > 0) {
			Static91.anInt1910 -= arg0 * 4;
		}
		if (Static100.anInt2208 > 0) {
			Static100.anInt2208 -= arg0 * 4;
		}
		if (Static91.anInt1910 == 0 && Static100.anInt2208 == 0) {
			local103 = (int) ((double) (2000 / arg0) * Math.random());
			if (local103 == 0) {
				Static91.anInt1910 = 1024;
			}
			if (local103 == 1) {
				Static100.anInt2208 = 1024;
			}
		}
		for (local103 = 0; local103 < 256 - arg0; local103++) {
			Static104.anIntArray407[local103] = Static104.anIntArray407[local103 + arg0];
		}
		for (local105 = 256 - arg0; local105 < 256; local105++) {
			Static104.anIntArray407[local105] = (int) (Math.sin((double) Static41.anInt963 / 14.0D) * 16.0D + Math.sin((double) Static41.anInt963 / 15.0D) * 14.0D + Math.sin((double) Static41.anInt963 / 16.0D) * 12.0D);
			Static41.anInt963++;
		}
		Static27.anInt672 += arg0;
		local112 = ((Static107.anInt2338 & 0x1) + arg0) / 2;
		if (local112 <= 0) {
			return;
		}
		@Pc(292) int local292;
		@Pc(299) int local299;
		for (@Pc(283) int local283 = 0; local283 < Static27.anInt672 * 100; local283++) {
			local292 = (int) (Math.random() * 124.0D) + 2;
			local299 = (int) (Math.random() * 128.0D) + 128;
			Static32.anIntArray96[local292 + (local299 << 7)] = 192;
		}
		Static27.anInt672 = 0;
		@Pc(326) int local326;
		@Pc(329) int local329;
		for (local292 = 0; local292 < 256; local292++) {
			local299 = 0;
			local326 = local292 * 128;
			for (local329 = -local112; local329 < 128; local329++) {
				if (local329 + local112 < 128) {
					local299 += Static32.anIntArray96[local112 + local326 + local329];
				}
				if (local329 - local112 - 1 >= 0) {
					local299 -= Static32.anIntArray96[local329 + local326 - local112 - 1];
				}
				if (local329 >= 0) {
					Static51.anIntArray313[local326 + local329] = local299 / (local112 * 2 + 1);
				}
			}
		}
		for (local299 = 0; local299 < 128; local299++) {
			local326 = 0;
			for (local329 = -local112; local329 < 256; local329++) {
				@Pc(409) int local409 = local329 * 128;
				if (local112 + local329 < 256) {
					local326 += Static51.anIntArray313[local409 + local299 + local112 * 128];
				}
				if (local329 - local112 - 1 >= 0) {
					local326 -= Static51.anIntArray313[local409 + local299 - (local112 + 1) * 128];
				}
				if (local329 >= 0) {
					Static32.anIntArray96[local409 + local299] = local326 / (local112 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method456() {
		if (!Static6.aBoolean7) {
			return;
		}
		@Pc(19) Class2_Sub2_Sub17 local19 = Static23.method478(Static46.anInt1060, Static40.anInt956);
		if (local19 != null && local19.anObjectArray5 != null) {
			Static45.method732(local19, local19.anObjectArray5, 0, 0, null, 0);
		}
		Static6.aBoolean7 = false;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	public static void method457() {
		aClass74_479 = null;
		aClass74_474 = null;
		aClass74_477 = null;
		aClass74_478 = null;
		aClass37_2 = null;
		aClass74_475 = null;
		aClass36Array1 = null;
		aClass74_476 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!g;Lclient!v;Lclient!g;Lclient!g;)Z")
	public static boolean method458(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class2_Sub16_Sub2 arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class26 arg3) {
		Static12.aClass2_Sub16_Sub2_1 = arg1;
		Static34.aClass26_5 = arg3;
		Static52.aClass26_11 = arg2;
		Static81.aClass26_19 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public static void method459() {
		Static75.aClass16_58.method485();
	}
}

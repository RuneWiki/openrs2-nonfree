import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_7;

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "Lclient!d;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
	public static int anInt565;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
	private static int anInt571;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!wb;")
	public static Class65[] aClass65Array4 = new Class65[100];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!wb;")
	private static Class65 aClass65_263 = Static24.method441("level)2");

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	public static int anInt551 = 500;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "Lclient!wb;")
	public static Class65 aClass65_264 = aClass65_263;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Lclient!wb;")
	public static Class65 aClass65_265 = Static24.method441("m");

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "Lclient!wb;")
	public static Class65 aClass65_266 = Static24.method441("mapscene");

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!wb;")
	public static Class65 aClass65_267 = Static24.method441("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B[Lclient!wb;)[Lclient!wb;")
	public static Class65[] method346(@OriginalArg(1) Class65[] arg0) {
		@Pc(14) Class65[] local14 = new Class65[5];
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			local14[local16] = Static13.method282(new Class65[] { Static93.method1617(local16), Static17.aClass65_274 });
			if (arg0 != null && arg0[local16] != null) {
				local14[local16] = Static13.method282(new Class65[] { local14[local16], arg0[local16] });
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public static void method356() {
		@Pc(9) int local9 = Static38.aClass2_Sub1_Sub4_Sub4_1.method1839(Static17.aClass65_268);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static24.anInt719; local11++) {
			local19 = Static38.aClass2_Sub1_Sub4_Sub4_1.method1822(Static89.aClass65Array12[local11]);
			if (local19 > local9) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static24.anInt719 * 15 + 21;
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (Static89.anInt2559 > 4 && Static32.anInt1044 > 4 && Static89.anInt2559 < 516 && Static32.anInt1044 < 338) {
			Static51.aBoolean83 = true;
			Static32.anInt1055 = Static24.anInt719 * 15 + 22;
			local78 = Static89.anInt2559 - local9 / 2 - 4;
			Static99.anInt2540 = 0;
			local84 = Static32.anInt1044 - 4;
			Static101.anInt2788 = local9;
			if (local78 + local9 > 512) {
				local78 = 512 - local9;
			}
			if (local19 + local84 > 334) {
				local84 = 334 - local19;
			}
			if (local84 < 0) {
				local84 = 0;
			}
			if (local78 < 0) {
				local78 = 0;
			}
			Static61.anInt1849 = local84;
			Static16.anInt489 = local78;
		}
		if (Static89.anInt2559 > 553 && Static32.anInt1044 > 205 && Static89.anInt2559 < 743 && Static32.anInt1044 < 466) {
			Static99.anInt2540 = 1;
			Static51.aBoolean83 = true;
			Static32.anInt1055 = Static24.anInt719 * 15 + 22;
			Static101.anInt2788 = local9;
			local84 = Static32.anInt1044 - 205;
			local78 = Static89.anInt2559 - local9 / 2 - 553;
			if (local84 < 0) {
				local84 = 0;
			} else if (local84 + local19 > 261) {
				local84 = 261 - local19;
			}
			if (local78 < 0) {
				local78 = 0;
			} else if (local78 + local9 > 190) {
				local78 = 190 - local9;
			}
			Static16.anInt489 = local78;
			Static61.anInt1849 = local84;
		}
		if (Static89.anInt2559 <= 17 || Static32.anInt1044 <= 357 || Static89.anInt2559 >= 496 || Static32.anInt1044 >= 453) {
			return;
		}
		local78 = Static89.anInt2559 - local9 / 2 - 17;
		Static99.anInt2540 = 2;
		if (local78 < 0) {
			local78 = 0;
		} else if (local9 + local78 > 479) {
			local78 = 479 - local9;
		}
		Static51.aBoolean83 = true;
		Static16.anInt489 = local78;
		Static32.anInt1055 = Static24.anInt719 * 15 + 22;
		Static101.anInt2788 = local9;
		local84 = Static32.anInt1044 - 357;
		if (local84 < 0) {
			local84 = 0;
		} else if (local19 + local84 > 96) {
			local84 = 96 - local19;
		}
		Static61.anInt1849 = local84;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)I")
	public static int method359() {
		return Static35.anInt1184++;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
	public static void method360() {
		aClass65_267 = null;
		aClass65_266 = null;
		aClass65_265 = null;
		aClass2_Sub1_Sub4_Sub3_7 = null;
		aClass65_264 = null;
		aClass65Array4 = null;
		aClass14_2 = null;
		aClass65_263 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
	public static void method361(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static93.anInt2629; local16++) {
			if (arg0 == Static52.aLongArray6[local16]) {
				Static19.aBoolean99 = true;
				Static93.anInt2629--;
				for (@Pc(36) int local36 = local16; local36 < Static93.anInt2629; local36++) {
					Static52.aLongArray6[local36] = Static52.aLongArray6[local36 + 1];
				}
				Static12.aClass2_Sub8_Sub1_8.method1425(82);
				Static12.aClass2_Sub8_Sub1_8.method1389(arg0);
				return;
			}
		}
	}
}

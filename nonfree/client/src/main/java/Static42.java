import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_10;

	@OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
	public static int anInt1208;

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
	public static int anInt1195 = 0;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lclient!id;")
	public static Class34 aClass34_572 = Static9.method266("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
	public static final int anInt1199 = 50;

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lclient!id;")
	public static Class34 aClass34_573 = Static9.method266("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "Lclient!id;")
	public static Class34 aClass34_574 = Static9.method266("b12_full");

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lclient!id;")
	private static Class34 aClass34_575 = Static9.method266("Login server offline)3");

	@OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lclient!id;")
	public static Class34 aClass34_576 = aClass34_575;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIII)Z")
	public static boolean method714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static39.aClass44_1.method1138(anInt1208, arg0, arg1, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(28) int local28 = local18 & 0x1F;
		@Pc(34) int local34 = local18 >> 6 & 0x3;
		if (local28 == 10 || local28 == 11 || local28 == 22) {
			@Pc(51) Class1_Sub1_Sub16 local51 = Static28.method2008(local11);
			@Pc(54) int local54 = local51.anInt2966;
			@Pc(65) int local65;
			@Pc(62) int local62;
			if (local34 == 0 || local34 == 2) {
				local62 = local51.anInt2946;
				local65 = local51.anInt2962;
			} else {
				local62 = local51.anInt2962;
				local65 = local51.anInt2946;
			}
			if (local34 != 0) {
				local54 = (local54 << local34 & 0xF) + (local54 >> 4 - local34);
			}
			Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, local62, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, arg0, true, local54, arg1, 0, local65);
		} else {
			Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], local28 + 1, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 2, arg0, true, 0, arg1, local34, 0);
		}
		Static102.anInt2587 = Static118.anInt2830;
		Static8.anInt446 = 0;
		Static9.anInt458 = 2;
		Static124.anInt2986 = Static119.anInt2832;
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lclient!id;")
	public static Class34 method717(@OriginalArg(0) int arg0) {
		@Pc(9) Class34 local9 = Static85.method1456(arg0);
		for (@Pc(15) int local15 = local9.method982() - 3; local15 > 0; local15 -= 3) {
			local9 = Static91.method1554(new Class34[] { local9.method962(local15, 0), Static36.aClass34_494, local9.method956(local15) });
		}
		if (local9.method982() > 9) {
			return Static91.method1554(new Class34[] { Static89.aClass34_979, local9.method962(local9.method982() - 8, 0), Static41.aClass34_555, Static109.aClass34_1580, local9, Static37.aClass34_505 });
		} else if (local9.method982() > 6) {
			return Static91.method1554(new Class34[] { Static62.aClass34_785, local9.method962(local9.method982() - 4, 0), Static66.aClass34_820, Static109.aClass34_1580, local9, Static37.aClass34_505 });
		} else {
			return Static91.method1554(new Class34[] { Static120.aClass34_1466, local9, Static87.aClass34_1154 });
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)V")
	public static void method718(@OriginalArg(0) int arg0) {
		Static132.anInt3162 += arg0 * 128;
		@Pc(27) int local27;
		if (Static44.anIntArray126.length < Static132.anInt3162) {
			Static132.anInt3162 -= Static44.anIntArray126.length;
			local27 = (int) (Math.random() * 12.0D);
			Static97.method1643(Static123.aClass1_Sub1_Sub2_Sub2Array10[local27]);
		}
		local27 = 0;
		@Pc(38) int local38 = arg0 * 128;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(71) int local71;
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local71 = Static49.anIntArray152[local38 + local27] - Static44.anIntArray126[Static132.anInt3162 + local27 & Static44.anIntArray126.length + -1] * arg0 / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static49.anIntArray152[local27++] = local71;
		}
		@Pc(98) int local98;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local98 = local71 * 128;
			for (local100 = 0; local100 < 128; local100++) {
				local107 = (int) (Math.random() * 100.0D);
				if (local107 < 50 && local100 > 10 && local100 < 118) {
					Static49.anIntArray152[local100 + local98] = 255;
				} else {
					Static49.anIntArray152[local98 + local100] = 0;
				}
			}
		}
		if (Static39.anInt1145 > 0) {
			Static39.anInt1145 -= arg0 * 4;
		}
		if (Static109.anInt3087 > 0) {
			Static109.anInt3087 -= arg0 * 4;
		}
		if (Static39.anInt1145 == 0 && Static109.anInt3087 == 0) {
			local98 = (int) ((double) (2000 / arg0) * Math.random());
			if (local98 == 0) {
				Static39.anInt1145 = 1024;
			}
			if (local98 == 1) {
				Static109.anInt3087 = 1024;
			}
		}
		for (local98 = 0; local98 < 256 - arg0; local98++) {
			Static95.anIntArray311[local98] = Static95.anIntArray311[arg0 + local98];
		}
		for (local100 = 256 - arg0; local100 < 256; local100++) {
			Static95.anIntArray311[local100] = (int) (Math.sin((double) Static13.anInt576 / 14.0D) * 16.0D + Math.sin((double) Static13.anInt576 / 15.0D) * 14.0D + Math.sin((double) Static13.anInt576 / 16.0D) * 12.0D);
			Static13.anInt576++;
		}
		Static9.anInt459 += arg0;
		local107 = ((Static73.anInt1947 & 0x1) + arg0) / 2;
		if (local107 <= 0) {
			return;
		}
		@Pc(288) int local288;
		@Pc(295) int local295;
		for (@Pc(279) int local279 = 0; local279 < Static9.anInt459 * 100; local279++) {
			local288 = (int) (Math.random() * 124.0D) + 2;
			local295 = (int) (Math.random() * 128.0D) + 128;
			Static49.anIntArray152[(local295 << 7) + local288] = 192;
		}
		Static9.anInt459 = 0;
		@Pc(321) int local321;
		@Pc(324) int local324;
		for (local288 = 0; local288 < 256; local288++) {
			local295 = 0;
			local321 = local288 * 128;
			for (local324 = -local107; local324 < 128; local324++) {
				if (local107 + local324 < 128) {
					local295 += Static49.anIntArray152[local107 + local321 + local324];
				}
				if (local324 - local107 - 1 >= 0) {
					local295 -= Static49.anIntArray152[local324 + local321 - local107 - 1];
				}
				if (local324 >= 0) {
					Static76.anIntArray237[local321 + local324] = local295 / (local107 * 2 + 1);
				}
			}
		}
		for (local295 = 0; local295 < 128; local295++) {
			local321 = 0;
			for (local324 = -local107; local324 < 256; local324++) {
				@Pc(400) int local400 = local324 * 128;
				if (local107 + local324 < 256) {
					local321 += Static76.anIntArray237[local107 * 128 + local295 + local400];
				}
				if (local324 - local107 - 1 >= 0) {
					local321 -= Static76.anIntArray237[local400 + local295 - local107 * 128 - 128];
				}
				if (local324 >= 0) {
					Static49.anIntArray152[local400 + local295] = local321 / (local107 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public static void method722() {
		aClass34_576 = null;
		aClass35_Sub1_10 = null;
		aClass34_575 = null;
		aClass34_573 = null;
		aClass34_574 = null;
		aClass34_572 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZBZIZ)Lclient!pa;")
	public static Class35_Sub1 method725(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class33 local1 = null;
		if (Static61.aClass17_4 != null) {
			local1 = new Class33(arg2, Static61.aClass17_4, Static4.aClass17Array1[arg2], 1000000);
		}
		return new Class35_Sub1(local1, Static114.aClass33_4, arg2, arg1, arg3, arg0);
	}
}

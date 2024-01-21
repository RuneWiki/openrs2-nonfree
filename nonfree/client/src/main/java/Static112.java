import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3 aClass2_Sub2_Sub3_Sub3_3;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!qf;")
	public static Class66 aClass66_9;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!wc;")
	public static Class2_Sub22 aClass2_Sub22_1 = new Class2_Sub22(0, 0);

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1058 = Static146.method2172(" ");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1057 = aClass77_1058;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public static int anInt2797 = 0;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1059 = Static146.method2172("Benutzen");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method1993() {
		@Pc(16) int local16;
		if (Static158.anInt3916 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static158.anInt3916 > 768) {
					Static27.anIntArray104[local16] = Static179.method2999(Static134.anIntArray480[local16], Static159.anIntArray569[local16], 1024 - Static158.anInt3916);
				} else if (Static158.anInt3916 <= 256) {
					Static27.anIntArray104[local16] = Static179.method2999(Static159.anIntArray569[local16], Static134.anIntArray480[local16], 256 - Static158.anInt3916);
				} else {
					Static27.anIntArray104[local16] = Static134.anIntArray480[local16];
				}
			}
		} else if (Static138.anInt3343 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static138.anInt3343 > 768) {
					Static27.anIntArray104[local16] = Static179.method2999(Static1.anIntArray1[local16], Static159.anIntArray569[local16], 1024 - Static138.anInt3343);
				} else if (Static138.anInt3343 <= 256) {
					Static27.anIntArray104[local16] = Static179.method2999(Static159.anIntArray569[local16], Static1.anIntArray1[local16], 256 - Static138.anInt3343);
				} else {
					Static27.anIntArray104[local16] = Static1.anIntArray1[local16];
				}
			}
		} else {
			for (local16 = 0; local16 < 256; local16++) {
				Static27.anIntArray104[local16] = Static159.anIntArray569[local16];
			}
		}
		local16 = 0;
		@Pc(163) int local163 = Static141.aClass2_Sub2_Sub3_Sub2_6.anInt567 * 9;
		@Pc(165) int local165 = 0;
		@Pc(182) int local182;
		@Pc(195) int local195;
		@Pc(202) int local202;
		@Pc(208) int local208;
		@Pc(220) int local220;
		@Pc(225) int local225;
		for (@Pc(167) int local167 = 1; local167 < 255; local167++) {
			local182 = Static170.anIntArray600[local167] * (256 - local167) / 256 + 22;
			if (local182 < 0) {
				local182 = 0;
			}
			local16 += local182;
			for (local195 = local182; local195 < 128; local195++) {
				local202 = Static16.anIntArray72[local16++];
				local208 = Static141.aClass2_Sub2_Sub3_Sub2_6.anIntArray81[local163++];
				if (local202 == 0) {
					Static48.aClass2_Sub2_Sub3_Sub2_1.anIntArray81[local165++] = local208;
				} else {
					local220 = local202;
					local225 = 256 - local202;
					local202 = Static27.anIntArray104[local202];
					Static48.aClass2_Sub2_Sub3_Sub2_1.anIntArray81[local165++] = ((local208 & 0xFF00FF) * local225 + (local202 & 0xFF00FF) * local220 & 0xFF00FF00) + ((local202 & 0xFF00) * local220 + (local225 * (local208 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			for (local202 = 0; local202 < local182; local202++) {
				Static48.aClass2_Sub2_Sub3_Sub2_1.anIntArray81[local165++] = Static141.aClass2_Sub2_Sub3_Sub2_6.anIntArray81[local163++];
			}
			local163 += Static141.aClass2_Sub2_Sub3_Sub2_6.anInt567 - 128;
		}
		Static48.aClass2_Sub2_Sub3_Sub2_1.method389(0, 9);
		local165 = 0;
		local163 = Static141.aClass2_Sub2_Sub3_Sub2_6.anInt567 * 9 + 128;
		local16 = 0;
		for (local182 = 1; local182 < 255; local182++) {
			local195 = (256 - local182) * Static170.anIntArray600[local182] / 256 + 22;
			if (local195 < 0) {
				local195 = 0;
			}
			for (local202 = 0; local202 < local195; local202++) {
				@Pc(350) int local350 = local165++;
				local163--;
				Static124.aClass2_Sub2_Sub3_Sub2_5.anIntArray81[local350] = Static141.aClass2_Sub2_Sub3_Sub2_6.anIntArray81[local163];
			}
			for (local208 = local195; local208 < 128; local208++) {
				local220 = Static16.anIntArray72[local16++];
				local163--;
				local225 = Static141.aClass2_Sub2_Sub3_Sub2_6.anIntArray81[local163];
				if (local220 == 0) {
					Static124.aClass2_Sub2_Sub3_Sub2_5.anIntArray81[local165++] = local225;
				} else {
					@Pc(384) int local384 = local220;
					@Pc(389) int local389 = 256 - local220;
					local220 = Static27.anIntArray104[local220];
					Static124.aClass2_Sub2_Sub3_Sub2_5.anIntArray81[local165++] = (local389 * (local225 & 0xFF00) + (local220 & 0xFF00) * local384 & 0xFF0000) + ((local225 & 0xFF00FF) * local389 + local384 * (local220 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local163 += Static141.aClass2_Sub2_Sub3_Sub2_6.anInt567 + 128;
			local16 += local195;
		}
		Static124.aClass2_Sub2_Sub3_Sub2_5.method389(637, 9);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Lclient!sg;")
	public static Class77 method1994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return Static107.aClass77_1022;
		} else if (local8 < -6) {
			return Static155.aClass77_1318;
		} else if (local8 < -3) {
			return Static50.aClass77_538;
		} else if (local8 < 0) {
			return Static33.aClass77_386;
		} else if (local8 > 9) {
			return Static100.aClass77_334;
		} else if (local8 > 6) {
			return Static153.aClass77_1301;
		} else if (local8 > 3) {
			return Static178.aClass77_1543;
		} else if (local8 > 0) {
			return Static114.aClass77_1070;
		} else {
			return Static101.aClass77_975;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method1995() {
		aClass2_Sub22_1 = null;
		aClass66_9 = null;
		aClass77_1058 = null;
		aClass77_1059 = null;
		aClass77_1057 = null;
		aClass2_Sub2_Sub3_Sub3_3 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIIII)V")
	public static void method1996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static2.anInt97 == 1) {
			Static84.aClass2_Sub2_Sub3_Sub2Array9[Static94.anInt2407 / 100].method401(Static58.anInt1518 - 8, Static105.anInt2571 - 8);
		}
		if (Static2.anInt97 == 2) {
			Static84.aClass2_Sub2_Sub3_Sub2Array9[Static94.anInt2407 / 100 + 4].method401(Static58.anInt1518 - 8, Static105.anInt2571 - 8);
		}
		Static178.method2972();
		if (!Static8.aBoolean11) {
			return;
		}
		@Pc(51) int local51 = arg2 + 512 - 5;
		@Pc(55) int local55 = arg1 + 20;
		Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3.method1266(Static146.method2168(new Class77[] { Static127.aClass77_1126, Static2.method61(Static139.anInt3370) }), local51, local55, 16776960, -1);
		@Pc(76) int local76 = local55 + 15;
		@Pc(78) int local78 = 16776960;
		@Pc(80) Runtime local80 = Runtime.getRuntime();
		@Pc(89) int local89 = (int) ((local80.totalMemory() - local80.freeMemory()) / 1024L);
		if (local89 > 32768 && Static92.aBoolean101) {
			local78 = 16711680;
		}
		if (local89 > 65536 && !Static92.aBoolean101) {
			local78 = 16711680;
		}
		Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3.method1266(Static146.method2168(new Class77[] { Static177.aClass77_1534, Static2.method61(local89), Static72.aClass77_776 }), local51, local76, local78, -1);
		local55 = local76 + 15;
	}
}

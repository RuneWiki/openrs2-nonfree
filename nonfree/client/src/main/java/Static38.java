import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_7;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_10;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public static int anInt1141;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!na;")
	private static Class53 aClass53_498 = Static109.method1737("Enter your username (V password)3");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_496 = aClass53_498;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!na;")
	private static Class53 aClass53_497 = Static109.method1737("Prepared visibility map");

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public static int anInt1139 = 0;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "J")
	public static long aLong43 = 0L;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_499 = aClass53_497;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!ud;")
	public static Class77 aClass77_4 = new Class77(32);

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public static int anInt1146 = 1;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!na;")
	public static Class53 aClass53_500 = Static109.method1737("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method778() {
		aClass53_500 = null;
		aClass53_496 = null;
		aFontMetrics1 = null;
		aClass62_Sub1_7 = null;
		aClass53_499 = null;
		aClass3_Sub1_Sub5_Sub3_10 = null;
		aClass53_497 = null;
		aClass53_498 = null;
		aClass77_4 = null;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
	public static void method780() {
		@Pc(13) int local13;
		if (Static123.anInt2862 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static123.anInt2862 > 768) {
					Static43.anIntArray147[local13] = Static30.method672(1024 - Static123.anInt2862, Static71.anIntArray227[local13], Static15.anIntArray33[local13]);
				} else if (Static123.anInt2862 > 256) {
					Static43.anIntArray147[local13] = Static71.anIntArray227[local13];
				} else {
					Static43.anIntArray147[local13] = Static30.method672(256 - Static123.anInt2862, Static15.anIntArray33[local13], Static71.anIntArray227[local13]);
				}
			}
		} else if (Static111.anInt2582 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static111.anInt2582 > 768) {
					Static43.anIntArray147[local13] = Static30.method672(1024 - Static111.anInt2582, Static102.anIntArray317[local13], Static15.anIntArray33[local13]);
				} else if (Static111.anInt2582 > 256) {
					Static43.anIntArray147[local13] = Static102.anIntArray317[local13];
				} else {
					Static43.anIntArray147[local13] = Static30.method672(256 - Static111.anInt2582, Static15.anIntArray33[local13], Static102.anIntArray317[local13]);
				}
			}
		} else {
			for (local13 = 0; local13 < 256; local13++) {
				Static43.anIntArray147[local13] = Static15.anIntArray33[local13];
			}
		}
		Static84.method1317(0, 9, 128, 263);
		local13 = 0;
		Static117.aClass3_Sub1_Sub5_Sub4_35.method1330(0, 0);
		Static84.method1321();
		@Pc(167) int local167 = 6885;
		@Pc(182) int local182;
		@Pc(186) int local186;
		@Pc(196) int local196;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(212) int local212;
		@Pc(217) int local217;
		for (@Pc(169) int local169 = 1; local169 < 255; local169++) {
			local182 = (256 - local169) * Static102.anIntArray318[local169] / 256;
			local186 = local182 + 22;
			if (local186 < 0) {
				local186 = 0;
			}
			local13 += local186;
			for (local196 = local186; local196 < 128; local196++) {
				local203 = Static106.anIntArray322[local13++];
				if (local203 == 0) {
					local167++;
				} else {
					local207 = local203;
					local212 = 256 - local203;
					local217 = Static122.aClass27_47.anIntArray299[local167];
					local203 = Static43.anIntArray147[local203];
					Static122.aClass27_47.anIntArray299[local167++] = ((local217 & 0xFF00FF) * local212 + local207 * (local203 & 0xFF00FF) & 0xFF00FF00) + (local207 * (local203 & 0xFF00) + (local212 * (local217 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local167 += local186 + 765 - 128;
		}
		local13 = 0;
		local167 = 7546;
		Static84.method1317(637, 9, 765, 263);
		Static82.aClass3_Sub1_Sub5_Sub4_14.method1330(382, 0);
		Static84.method1321();
		for (local182 = 1; local182 < 255; local182++) {
			local186 = (256 - local182) * Static102.anIntArray318[local182] / 256;
			local167 += local186;
			local196 = 103 - local186;
			for (local203 = 0; local203 < local196; local203++) {
				local207 = Static106.anIntArray322[local13++];
				if (local207 == 0) {
					local167++;
				} else {
					local212 = local207;
					local217 = 256 - local207;
					@Pc(358) int local358 = Static122.aClass27_47.anIntArray299[local167];
					local207 = Static43.anIntArray147[local207];
					Static122.aClass27_47.anIntArray299[local167++] = (local212 * (local207 & 0xFF00) + (local358 & 0xFF00) * local217 & 0xFF0000) + (local212 * (local207 & 0xFF00FF) + (local217 * (local358 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local167 += 765 - local186 - local196;
			local13 += 128 - local196;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) Static49.aClass11_7.method189();
		@Pc(14) Class3_Sub16 local14 = null;
		while (local12 != null) {
			if (arg3 == local12.anInt2493 && local12.anInt2507 == arg0 && local12.anInt2496 == arg1 && arg5 == local12.anInt2504) {
				local14 = local12;
				break;
			}
			local12 = (Class3_Sub16) Static49.aClass11_7.method187();
		}
		if (local14 == null) {
			local14 = new Class3_Sub16();
			local14.anInt2493 = arg3;
			local14.anInt2507 = arg0;
			local14.anInt2496 = arg1;
			local14.anInt2504 = arg5;
			Static113.method1806(local14);
			Static49.aClass11_7.method190(local14);
		}
		local14.anInt2509 = arg6;
		local14.anInt2508 = arg4;
		local14.anInt2510 = arg2;
		local14.anInt2503 = arg7;
		local14.anInt2498 = arg8;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Lclient!vb;")
	public static Class3_Sub1_Sub15 method782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class3_Sub1_Sub15 local3 = Static30.method666(arg1);
		if (arg0 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass3_Sub1_Sub15Array2 == null || arg0 >= local3.aClass3_Sub1_Sub15Array2.length) {
			return null;
		} else {
			return local3.aClass3_Sub1_Sub15Array2[arg0];
		}
	}
}

import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!ia;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!ef;")
	public static Class16 aClass16_15;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_163 = Static6.method100("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
	public static int[] anIntArray33 = new int[1000];

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_164 = Static6.method100("::noclip");

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Lclient!he;")
	private static Class26 aClass26_165 = Static6.method100("Loading )2 please wait)3");

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!he;")
	private static Class26 aClass26_166 = Static6.method100("This world is full)3");

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_167 = aClass26_165;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_168 = Static6.method100("(Y<)4col>");

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_169 = aClass26_166;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
	public static boolean method171(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!fb;)V")
	public static void method172(@OriginalArg(1) Class3_Sub1_Sub5_Sub1 arg0) {
		if (Static4.anInt136 == arg0.anInt2742 || arg0.anInt2738 == -1 || arg0.anInt2695 != 0 || arg0.anInt2704 + 1 > Static111.method2009(arg0.anInt2738).anIntArray374[arg0.anInt2708]) {
			@Pc(34) int local34 = Static4.anInt136 - arg0.anInt2696;
			@Pc(40) int local40 = arg0.anInt2742 - arg0.anInt2696;
			@Pc(50) int local50 = arg0.anInt2712 * 64 + arg0.anInt2709 * 128;
			@Pc(60) int local60 = arg0.anInt2712 * 64 + arg0.anInt2740 * 128;
			@Pc(70) int local70 = arg0.anInt2739 * 128 + arg0.anInt2712 * 64;
			@Pc(80) int local80 = arg0.anInt2712 * 64 + arg0.anInt2703 * 128;
			arg0.anInt2733 = (local70 * local34 + (local40 - local34) * local50) / local40;
			arg0.anInt2731 = ((local40 - local34) * local60 + local34 * local80) / local40;
		}
		if (arg0.anInt2713 == 0) {
			arg0.anInt2691 = 1024;
		}
		if (arg0.anInt2713 == 1) {
			arg0.anInt2691 = 1536;
		}
		if (arg0.anInt2713 == 2) {
			arg0.anInt2691 = 0;
		}
		arg0.anInt2730 = 0;
		if (arg0.anInt2713 == 3) {
			arg0.anInt2691 = 512;
		}
		arg0.anInt2692 = arg0.anInt2691;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method173() {
		@Pc(14) int local14;
		if (Static69.anInt2515 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static69.anInt2515 > 768) {
					Static119.anIntArray380[local14] = Static79.method1390(Static106.anIntArray344[local14], 1024 - Static69.anInt2515, Static130.anIntArray407[local14]);
				} else if (Static69.anInt2515 <= 256) {
					Static119.anIntArray380[local14] = Static79.method1390(Static130.anIntArray407[local14], 256 - Static69.anInt2515, Static106.anIntArray344[local14]);
				} else {
					Static119.anIntArray380[local14] = Static130.anIntArray407[local14];
				}
			}
		} else if (Static76.anInt2098 <= 0) {
			for (local14 = 0; local14 < 256; local14++) {
				Static119.anIntArray380[local14] = Static106.anIntArray344[local14];
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static76.anInt2098 > 768) {
					Static119.anIntArray380[local14] = Static79.method1390(Static106.anIntArray344[local14], 1024 - Static76.anInt2098, Static2.anIntArray3[local14]);
				} else if (Static76.anInt2098 <= 256) {
					Static119.anIntArray380[local14] = Static79.method1390(Static2.anIntArray3[local14], 256 - Static76.anInt2098, Static106.anIntArray344[local14]);
				} else {
					Static119.anIntArray380[local14] = Static2.anIntArray3[local14];
				}
			}
		}
		local14 = 0;
		Static77.method2218(0, 9, 128, 263);
		Static109.aClass3_Sub1_Sub4_Sub3_5.method1749(0, 0);
		Static77.method2225();
		@Pc(165) int local165 = 6885;
		@Pc(179) int local179;
		@Pc(183) int local183;
		@Pc(196) int local196;
		@Pc(203) int local203;
		@Pc(218) int local218;
		@Pc(216) int local216;
		@Pc(227) int local227;
		for (@Pc(167) int local167 = 1; local167 < 255; local167++) {
			local179 = (256 - local167) * Static6.anIntArray12[local167] / 256;
			local183 = local179 + 22;
			if (local183 < 0) {
				local183 = 0;
			}
			local14 += local183;
			for (local196 = local183; local196 < 128; local196++) {
				local203 = Static124.anIntArray384[local14++];
				if (local203 == 0) {
					local165++;
				} else {
					local216 = 256 - local203;
					local218 = local203;
					local203 = Static119.anIntArray380[local203];
					local227 = Static102.aClass6_1.anIntArray147[local165];
					Static102.aClass6_1.anIntArray147[local165++] = ((local227 & 0xFF00FF) * local216 + local218 * (local203 & 0xFF00FF) & 0xFF00FF00) + ((local203 & 0xFF00) * local218 + (local227 & 0xFF00) * local216 & 0xFF0000) >> 8;
				}
			}
			local165 += local183 + 637;
		}
		local165 = 7546;
		local14 = 0;
		Static77.method2218(637, 9, 765, 263);
		Static55.aClass3_Sub1_Sub4_Sub3_2.method1749(382, 0);
		Static77.method2225();
		for (local179 = 1; local179 < 255; local179++) {
			local183 = (256 - local179) * Static6.anIntArray12[local179] / 256;
			local196 = 103 - local183;
			local165 += local183;
			for (local203 = 0; local203 < local196; local203++) {
				local218 = Static124.anIntArray384[local14++];
				if (local218 == 0) {
					local165++;
				} else {
					local216 = local218;
					@Pc(343) int local343 = Static102.aClass6_1.anIntArray147[local165];
					local227 = 256 - local218;
					local218 = Static119.anIntArray380[local218];
					Static102.aClass6_1.anIntArray147[local165++] = (local227 * (local343 & 0xFF00FF) + (local218 & 0xFF00FF) * local216 & 0xFF00FF00) + ((local343 & 0xFF00) * local227 + (local218 & 0xFF00) * local216 & 0xFF0000) >> 8;
				}
			}
			local14 += 128 - local196;
			local165 += 765 - local183 - local196;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	public static void method174() {
		aClass26_167 = null;
		aClass26_166 = null;
		aClass26_169 = null;
		aClass26_168 = null;
		aClass26_164 = null;
		aFontMetrics1 = null;
		aClass26_165 = null;
		aClass16_15 = null;
		aClass27_1 = null;
		aClass26_163 = null;
		anIntArray33 = null;
	}
}

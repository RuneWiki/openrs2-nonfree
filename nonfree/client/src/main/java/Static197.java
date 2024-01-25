import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	public static int anInt5439 = 64;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
	public static int anInt5441 = 0;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method4784() {
		if (Static642.anInt10087 < 0) {
			return;
		}
		@Pc(9) long local9 = Static429.method5935();
		Static642.anInt10087 = (int) ((long) Static642.anInt10087 + Static177.aLong99 - local9);
		if (Static642.anInt10087 > 0) {
			@Pc(25) int local25 = (Static642.anInt10087 << 8) / Static627.anInt9834;
			@Pc(30) int local30 = 255 - local25;
			@Pc(35) float local35 = (float) local25 / 255.0F;
			Static149.anInt2725 = (local30 * (Static544.aClass113_2.anInt2893 & 0xFF00) + local25 * (Static467.anInt8242 & 0xFF00) & 0xFF0000) + (local25 * (Static467.anInt8242 & 0xFF00FF) + local30 * (Static544.aClass113_2.anInt2893 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(71) float local71 = 1.0F - local35;
			Static490.aFloat236 = local71 * (Static544.aClass113_2.aFloat61 - Static358.aFloat119) + Static358.aFloat119;
			Static669.aFloat238 = local71 * (Static544.aClass113_2.aFloat62 - Static521.aFloat194) + Static521.aFloat194;
			Static437.aFloat231 = local71 * (Static544.aClass113_2.aFloat60 - Static547.aFloat199) + Static547.aFloat199;
			Static590.aFloat206 = local71 * (Static544.aClass113_2.aFloat63 - Static387.aFloat123) + Static387.aFloat123;
			Static177.anInt3089 = local25 * Static185.anInt3160 + local30 * Static544.aClass113_2.anInt2894 >> 8;
			Static401.anInt5840 = (local30 * (Static544.aClass113_2.anInt2889 & 0xFF00) + (Static313.anInt4886 & 0xFF00) * local25 & 0xFF0000) + (local25 * (Static313.anInt4886 & 0xFF00FF) + (local30 * (Static544.aClass113_2.anInt2889 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static429.aFloat159 = local71 * (Static544.aClass113_2.aFloat64 - Static453.aFloat183) + Static453.aFloat183;
			Static615.aFloat209 = Static137.aFloat56 + (Static544.aClass113_2.aFloat65 - Static137.aFloat56) * local71;
			if (Static322.aClass68_3 != Static544.aClass113_2.aClass68_1) {
				Static412.aClass68_4 = Static449.aClass33_11.method8138(Static322.aClass68_3, Static544.aClass113_2.aClass68_1, local71, Static412.aClass68_4);
			}
		} else {
			Static615.aFloat209 = Static544.aClass113_2.aFloat65;
			Static642.anInt10087 = -1;
			Static437.aFloat231 = Static544.aClass113_2.aFloat60;
			Static401.anInt5840 = Static544.aClass113_2.anInt2889;
			Static412.aClass68_4 = Static544.aClass113_2.aClass68_1;
			Static429.aFloat159 = Static544.aClass113_2.aFloat64;
			Static490.aFloat236 = Static544.aClass113_2.aFloat61;
			Static669.aFloat238 = Static544.aClass113_2.aFloat62;
			Static590.aFloat206 = Static544.aClass113_2.aFloat63;
			Static177.anInt3089 = Static544.aClass113_2.anInt2894;
			Static149.anInt2725 = Static544.aClass113_2.anInt2893;
		}
		Static177.aLong99 = local9;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB)V")
	public static void method4788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 1);
		local9.method3955();
		local9.anInt4427 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
	public static boolean method4790(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg2 && arg1 == arg5 && arg0 == arg4 && arg8 == arg3) {
			Static356.method4764(arg2, arg5, arg3, arg4, arg6);
			return;
		}
		@Pc(36) int local36 = arg2;
		@Pc(38) int local38 = arg5;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg0 * 3;
		@Pc(62) int local62 = arg8 * 3;
		@Pc(73) int local73 = arg4 + local50 - local58 - arg2;
		@Pc(83) int local83 = arg3 + local54 - local62 - arg5;
		@Pc(93) int local93 = local42 + local58 - local50 - local50;
		@Pc(102) int local102 = local46 + local62 - local54 - local54;
		@Pc(106) int local106 = local50 - local42;
		@Pc(110) int local110 = local54 - local46;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local120 * local112 >> 12;
			@Pc(130) int local130 = local73 * local126;
			@Pc(134) int local134 = local126 * local83;
			@Pc(138) int local138 = local93 * local120;
			@Pc(142) int local142 = local102 * local120;
			@Pc(146) int local146 = local106 * local112;
			@Pc(150) int local150 = local112 * local110;
			@Pc(160) int local160 = (local146 + local138 + local130 >> 12) + arg2;
			@Pc(170) int local170 = arg5 + (local150 + local142 + local134 >> 12);
			Static356.method4764(local36, local38, local170, local160, arg6);
			local36 = local160;
			local38 = local170;
		}
	}
}

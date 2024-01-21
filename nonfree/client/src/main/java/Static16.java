import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_4;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "Lclient!we;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "Lclient!ef;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array5;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!c;")
	public static Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "[I")
	public static int[] anIntArray36 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "[Lclient!ob;")
	public static Class3_Sub7[] aClass3_Sub7Array1 = new Class3_Sub7[2048];

	@OriginalMember(owner = "client!ce", name = "ib", descriptor = "Lclient!na;")
	public static Class53 aClass53_144 = Static109.method1737("@gr1@");

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "Lclient!na;")
	private static Class53 aClass53_145 = Static109.method1737("Drop");

	@OriginalMember(owner = "client!ce", name = "mb", descriptor = "Lclient!na;")
	public static Class53 aClass53_146 = aClass53_145;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
	public static void method236() {
		Static66.aFont1 = null;
		Static38.aFontMetrics1 = null;
		Static108.anImage4 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!vb;I)Lclient!vb;")
	public static Class3_Sub1_Sub15 method237(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		@Pc(24) Class3_Sub1_Sub15 local24 = Static90.method1465(arg0);
		if (local24 == null) {
			local24 = arg0.aClass3_Sub1_Sub15_5;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!we;III)[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] method240(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static35.method756(arg1, arg2, arg0) ? Static104.method1751() : null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBZIIIIIII)Z")
	public static boolean method242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
			for (local16 = 0; local16 < 104; local16++) {
				Static52.anIntArrayArray7[local12][local16] = 0;
				Static68.anIntArrayArray13[local12][local16] = 99999999;
			}
		}
		local16 = arg5;
		Static52.anIntArrayArray7[arg5][arg10] = 99;
		Static68.anIntArrayArray13[arg5][arg10] = 0;
		@Pc(54) int local54 = arg10;
		@Pc(56) byte local56 = 0;
		@Pc(58) boolean local58 = false;
		@Pc(60) int local60 = 0;
		Static50.anIntArray403[0] = arg5;
		@Pc(67) int local67 = local56 + 1;
		Static109.anIntArray332[0] = arg10;
		@Pc(72) int local72 = Static50.anIntArray403.length;
		@Pc(77) int[][] local77 = Static90.aClass9Array1[Static72.anInt1813].anIntArrayArray1;
		@Pc(195) int local195;
		while (local60 != local67) {
			local54 = Static109.anIntArray332[local60];
			local16 = Static50.anIntArray403[local60];
			local60 = (local60 + 1) % local72;
			if (arg6 == local16 && arg0 == local54) {
				local58 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static90.aClass9Array1[Static72.anInt1813].method136(arg2, local54, local16, arg0, arg9 - 1, arg6)) {
					local58 = true;
					break;
				}
				if (arg9 < 10 && Static90.aClass9Array1[Static72.anInt1813].method134(local16, local54, arg6, arg2, arg9 - 1, arg0)) {
					local58 = true;
					break;
				}
			}
			if (arg7 != 0 && arg1 != 0 && Static90.aClass9Array1[Static72.anInt1813].method142(local16, arg7, arg1, local54, arg6, arg0, arg8)) {
				local58 = true;
				break;
			}
			local195 = Static68.anIntArrayArray13[local16][local54] + 1;
			if (local16 > 0 && Static52.anIntArrayArray7[local16 - 1][local54] == 0 && (local77[local16 - 1][local54] & 0x1280108) == 0) {
				Static50.anIntArray403[local67] = local16 - 1;
				Static109.anIntArray332[local67] = local54;
				Static52.anIntArrayArray7[local16 - 1][local54] = 2;
				Static68.anIntArrayArray13[local16 - 1][local54] = local195;
				local67 = (local67 + 1) % local72;
			}
			if (local16 < 103 && Static52.anIntArrayArray7[local16 + 1][local54] == 0 && (local77[local16 + 1][local54] & 0x1280180) == 0) {
				Static50.anIntArray403[local67] = local16 + 1;
				Static109.anIntArray332[local67] = local54;
				Static52.anIntArrayArray7[local16 + 1][local54] = 8;
				Static68.anIntArrayArray13[local16 + 1][local54] = local195;
				local67 = (local67 + 1) % local72;
			}
			if (local54 > 0 && Static52.anIntArrayArray7[local16][local54 - 1] == 0 && (local77[local16][local54 - 1] & 0x1280102) == 0) {
				Static50.anIntArray403[local67] = local16;
				Static109.anIntArray332[local67] = local54 - 1;
				local67 = (local67 + 1) % local72;
				Static52.anIntArrayArray7[local16][local54 - 1] = 1;
				Static68.anIntArrayArray13[local16][local54 - 1] = local195;
			}
			if (local54 < 103 && Static52.anIntArrayArray7[local16][local54 + 1] == 0 && (local77[local16][local54 + 1] & 0x1280120) == 0) {
				Static50.anIntArray403[local67] = local16;
				Static109.anIntArray332[local67] = local54 + 1;
				local67 = (local67 + 1) % local72;
				Static52.anIntArrayArray7[local16][local54 + 1] = 4;
				Static68.anIntArrayArray13[local16][local54 + 1] = local195;
			}
			if (local16 > 0 && local54 > 0 && Static52.anIntArrayArray7[local16 - 1][local54 - 1] == 0 && (local77[local16 - 1][local54 - 1] & 0x128010E) == 0 && (local77[local16 - 1][local54] & 0x1280108) == 0 && (local77[local16][local54 - 1] & 0x1280102) == 0) {
				Static50.anIntArray403[local67] = local16 - 1;
				Static109.anIntArray332[local67] = local54 - 1;
				Static52.anIntArrayArray7[local16 - 1][local54 - 1] = 3;
				local67 = (local67 + 1) % local72;
				Static68.anIntArrayArray13[local16 - 1][local54 - 1] = local195;
			}
			if (local16 < 103 && local54 > 0 && Static52.anIntArrayArray7[local16 + 1][local54 - 1] == 0 && (local77[local16 + 1][local54 - 1] & 0x1280183) == 0 && (local77[local16 + 1][local54] & 0x1280180) == 0 && (local77[local16][local54 - 1] & 0x1280102) == 0) {
				Static50.anIntArray403[local67] = local16 + 1;
				Static109.anIntArray332[local67] = local54 - 1;
				Static52.anIntArrayArray7[local16 + 1][local54 - 1] = 9;
				local67 = (local67 + 1) % local72;
				Static68.anIntArrayArray13[local16 + 1][local54 - 1] = local195;
			}
			if (local16 > 0 && local54 < 103 && Static52.anIntArrayArray7[local16 - 1][local54 + 1] == 0 && (local77[local16 - 1][local54 + 1] & 0x1280138) == 0 && (local77[local16 - 1][local54] & 0x1280108) == 0 && (local77[local16][local54 + 1] & 0x1280120) == 0) {
				Static50.anIntArray403[local67] = local16 - 1;
				Static109.anIntArray332[local67] = local54 + 1;
				Static52.anIntArrayArray7[local16 - 1][local54 + 1] = 6;
				local67 = (local67 + 1) % local72;
				Static68.anIntArrayArray13[local16 - 1][local54 + 1] = local195;
			}
			if (local16 < 103 && local54 < 103 && Static52.anIntArrayArray7[local16 + 1][local54 + 1] == 0 && (local77[local16 + 1][local54 + 1] & 0x12801E0) == 0 && (local77[local16 + 1][local54] & 0x1280180) == 0 && (local77[local16][local54 + 1] & 0x1280120) == 0) {
				Static50.anIntArray403[local67] = local16 + 1;
				Static109.anIntArray332[local67] = local54 + 1;
				local67 = (local67 + 1) % local72;
				Static52.anIntArrayArray7[local16 + 1][local54 + 1] = 12;
				Static68.anIntArrayArray13[local16 + 1][local54 + 1] = local195;
			}
		}
		Static22.anInt716 = 0;
		@Pc(817) int local817;
		@Pc(822) int local822;
		@Pc(829) int local829;
		if (!local58) {
			if (!arg3) {
				return false;
			}
			local195 = 1000;
			local817 = 100;
			for (local822 = arg6 - 10; local822 <= arg6 + 10; local822++) {
				for (local829 = arg0 - 10; local829 <= arg0 + 10; local829++) {
					if (local822 >= 0 && local829 >= 0 && local822 < 104 && local829 < 104 && Static68.anIntArrayArray13[local822][local829] < 100) {
						@Pc(858) int local858 = 0;
						@Pc(860) int local860 = 0;
						if (local822 < arg6) {
							local858 = arg6 - local822;
						} else if (arg6 + arg7 - 1 < local822) {
							local858 = local822 + 1 - arg6 - arg7;
						}
						if (arg0 > local829) {
							local860 = arg0 - local829;
						} else if (local829 > arg0 + arg1 - 1) {
							local860 = local829 + 1 - arg1 - arg0;
						}
						@Pc(919) int local919 = local858 * local858 + local860 * local860;
						if (local919 < local195 || local919 == local195 && local817 > Static68.anIntArrayArray13[local822][local829]) {
							local195 = local919;
							local54 = local829;
							local817 = Static68.anIntArrayArray13[local822][local829];
							local16 = local822;
						}
					}
				}
			}
			if (local195 == 1000) {
				return false;
			}
			if (local16 == arg5 && arg10 == local54) {
				return false;
			}
			Static22.anInt716 = 1;
		}
		@Pc(996) byte local996 = 0;
		Static50.anIntArray403[0] = local16;
		local60 = local996 + 1;
		Static109.anIntArray332[0] = local54;
		local195 = local817 = Static52.anIntArrayArray7[local16][local54];
		while (arg5 != local16 || arg10 != local54) {
			if (local195 != local817) {
				local817 = local195;
				Static50.anIntArray403[local60] = local16;
				Static109.anIntArray332[local60++] = local54;
			}
			if ((local195 & 0x1) != 0) {
				local54++;
			} else if ((local195 & 0x4) != 0) {
				local54--;
			}
			if ((local195 & 0x2) != 0) {
				local16++;
			} else if ((local195 & 0x8) != 0) {
				local16--;
			}
			local195 = Static52.anIntArrayArray7[local16][local54];
		}
		if (local60 > 0) {
			local72 = local60;
			if (local60 > 25) {
				local72 = 25;
			}
			local60--;
			@Pc(1091) int local1091 = Static50.anIntArray403[local60];
			local822 = Static109.anIntArray332[local60];
			if (arg4 == 0) {
				Static115.aClass3_Sub7_Sub1_3.method662(57);
				Static115.aClass3_Sub7_Sub1_3.method625(local72 + local72 + 3);
			}
			if (arg4 == 1) {
				Static115.aClass3_Sub7_Sub1_3.method662(13);
				Static115.aClass3_Sub7_Sub1_3.method625(local72 + local72 + 17);
			}
			if (arg4 == 2) {
				Static115.aClass3_Sub7_Sub1_3.method662(11);
				Static115.aClass3_Sub7_Sub1_3.method625(local72 + local72 + 3);
			}
			Static59.anInt1551 = Static109.anIntArray332[0];
			Static68.anInt1730 = Static50.anIntArray403[0];
			for (local829 = 1; local829 < local72; local829++) {
				local60--;
				Static115.aClass3_Sub7_Sub1_3.method618(Static50.anIntArray403[local60] - local1091);
				Static115.aClass3_Sub7_Sub1_3.method621(Static109.anIntArray332[local60] - local822);
			}
			Static115.aClass3_Sub7_Sub1_3.method640(Static80.anInt2029 + local1091);
			Static115.aClass3_Sub7_Sub1_3.method621(Static37.aBooleanArray11[82] ? 1 : 0);
			Static115.aClass3_Sub7_Sub1_3.method644(local822 + Static4.anInt145);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public static void method243() {
		aClass62_Sub1_4 = null;
		anIntArray36 = null;
		aClass53Array5 = null;
		aClass53_145 = null;
		aClass3_Sub7Array1 = null;
		aClass11_1 = null;
		aClass22_3 = null;
		aClass62_1 = null;
		aClass53_144 = null;
		aClass53_146 = null;
	}
}

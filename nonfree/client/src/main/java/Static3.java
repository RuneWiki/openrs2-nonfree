import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1062 = Static231.method3737("Members only world");

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1061 = aClass107_1062;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt3933 = 0;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public static int anInt3934 = 0;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1063 = Static231.method3737("::rect_debug");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)I")
	public static int method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 << 13 ^ local10;
		@Pc(35) int local35 = (local16 * 15731 * local16 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBLclient!o;)V")
	public static void method2854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class86 arg2) {
		if (Static25.anInt490 != 0 && Static25.anInt490 != 3 || !arg2.method2433()) {
			return;
		}
		@Pc(29) int local29 = arg2.anIntArray280[arg1];
		if (local29 > arg0 || local29 + arg2.anIntArray283[arg1] < arg0) {
			return;
		}
		@Pc(57) int local57 = arg1 - arg2.anInt3270 / 2;
		@Pc(63) int local63 = Static123.anInt2690 + Static79.anInt1741 & 0x7FF;
		@Pc(70) int local70 = arg0 - arg2.anInt3280 / 2;
		@Pc(74) int local74 = Class45.anIntArray156[local63];
		@Pc(78) int local78 = Class45.anIntArray159[local63];
		@Pc(86) int local86 = (Static174.anInt3796 + 256) * local74 >> 8;
		@Pc(94) int local94 = local78 * (Static174.anInt3796 + 256) >> 8;
		@Pc(105) int local105 = local94 * local57 + local70 * local86 >> 11;
		@Pc(112) int local112 = local105 + Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7;
		@Pc(123) int local123 = local86 * local57 - local94 * local70 >> 11;
		@Pc(131) int local131 = Static204.aClass5_Sub5_Sub1_2.anInt3044 - local123 >> 7;
		if (Static156.anInt3417 > 0 && Static132.aBooleanArray19[82] && Static132.aBooleanArray19[81]) {
			Static132.method2195(Static152.anInt3377 + local131, Static191.anInt4237, local112 + Static36.anInt764);
			return;
		}
		@Pc(172) boolean local172 = Static119.method2054(0, local131, 0, local112, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, true, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 1);
		if (!local172) {
			return;
		}
		Static193.aClass1_Sub26_Sub1_2.method2967(local70);
		Static193.aClass1_Sub26_Sub1_2.method2967(local57);
		Static193.aClass1_Sub26_Sub1_2.method2963(Static79.anInt1741);
		Static193.aClass1_Sub26_Sub1_2.method2967(57);
		Static193.aClass1_Sub26_Sub1_2.method2967(Static123.anInt2690);
		Static193.aClass1_Sub26_Sub1_2.method2967(Static174.anInt3796);
		Static193.aClass1_Sub26_Sub1_2.method2967(89);
		Static193.aClass1_Sub26_Sub1_2.method2963(Static204.aClass5_Sub5_Sub1_2.anInt3021);
		Static193.aClass1_Sub26_Sub1_2.method2963(Static204.aClass5_Sub5_Sub1_2.anInt3044);
		Static193.aClass1_Sub26_Sub1_2.method2967(Static36.anInt763);
		Static193.aClass1_Sub26_Sub1_2.method2967(63);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZIIILclient!vf;B)V")
	public static void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub26 arg6) {
		@Pc(22) int local22;
		if (arg0 < 0 || arg0 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local22 = arg6.method2945();
				if (local22 == 0) {
					break;
				}
				if (local22 == 1) {
					arg6.method2945();
					break;
				}
				if (local22 <= 49) {
					arg6.method2945();
				}
			}
			return;
		}
		Static221.aByteArrayArrayArray14[arg2][arg0][arg5] = 0;
		while (true) {
			local22 = arg6.method2945();
			if (local22 == 0) {
				if (arg2 == 0) {
					Static166.anIntArrayArrayArray11[0][arg0][arg5] = -Static66.method1217(arg3 + arg5 + 556238, arg1 + 932731 + arg0) * 8;
				} else {
					Static166.anIntArrayArrayArray11[arg2][arg0][arg5] = Static166.anIntArrayArrayArray11[arg2 - 1][arg0][arg5] - 240;
				}
				break;
			}
			if (local22 == 1) {
				@Pc(142) int local142 = arg6.method2945();
				if (local142 == 1) {
					local142 = 0;
				}
				if (arg2 == 0) {
					Static166.anIntArrayArrayArray11[0][arg0][arg5] = -local142 * 8;
				} else {
					Static166.anIntArrayArrayArray11[arg2][arg0][arg5] = Static166.anIntArrayArrayArray11[arg2 - 1][arg0][arg5] - local142 * 8;
				}
				break;
			}
			if (local22 <= 49) {
				Static129.aByteArrayArrayArray9[arg2][arg0][arg5] = arg6.method2992();
				Static23.aByteArrayArrayArray2[arg2][arg0][arg5] = (byte) ((local22 - 2) / 4);
				Static140.aByteArrayArrayArray4[arg2][arg0][arg5] = (byte) (local22 + arg4 - 2 & 0x3);
			} else if (local22 <= 81) {
				Static221.aByteArrayArrayArray14[arg2][arg0][arg5] = (byte) (local22 - 49);
			} else {
				Static213.aByteArrayArrayArray13[arg2][arg0][arg5] = (byte) (local22 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLclient!jb;)I")
	public static int method2857(@OriginalArg(1) Class28 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method824(Static192.anInt4251)) {
			local5++;
		}
		if (arg0.method824(Static112.anInt2481)) {
			local5++;
		}
		if (arg0.method824(Static194.anInt4291)) {
			local5++;
		}
		if (arg0.method824(Static113.anInt2492)) {
			local5++;
		}
		if (arg0.method824(Static184.anInt4143)) {
			local5++;
		}
		if (arg0.method824(Static87.anInt1915)) {
			local5++;
		}
		if (arg0.method824(Static219.anInt4794)) {
			local5++;
		}
		if (arg0.method824(Static18.anInt381)) {
			local5++;
		}
		if (arg0.method824(Static228.anInt4954)) {
			local5++;
		}
		if (arg0.method824(Static37.anInt768)) {
			local5++;
		}
		if (arg0.method824(Static81.anInt1776)) {
			local5++;
		}
		if (arg0.method824(Static52.anInt1318)) {
			local5++;
		}
		if (arg0.method824(Static156.anInt3427)) {
			local5++;
		}
		local5++;
		if (arg0.method824(Static194.anInt4292)) {
			local5++;
		}
		if (arg0.method824(Static215.anInt4671)) {
			local5++;
		}
		return local5;
	}
}

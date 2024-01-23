import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
	public static int anInt4826;

	@OriginalMember(owner = "client!vd", name = "eb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1303 = Static231.method3737("http:)4)4advert)3runescape)3com)4banner)3ws?size=729");

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1300 = aClass107_1303;

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
	public static int anInt4822 = 0;

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1301 = Static231.method3737(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!vd", name = "cb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1302 = Static231.method3737("cookiehost");

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(IB)V")
	public static void method3623(@OriginalArg(0) int arg0) {
		Static80.anInt1769 += arg0 * 128;
		@Pc(20) int local20;
		if (Static80.anInt1769 > Static163.anIntArray311.length) {
			local20 = (int) (Math.random() * 12.0D);
			Static80.anInt1769 -= Static163.anIntArray311.length;
			Static195.method3186(Static63.aClass64_Sub1Array3[local20]);
		}
		local20 = 0;
		@Pc(42) int local42 = (256 - arg0) * 128;
		@Pc(46) int local46 = arg0 * 128;
		@Pc(71) int local71;
		for (@Pc(48) int local48 = 0; local48 < local42; local48++) {
			local71 = Static2.anIntArray2[local46 + local20] - arg0 * Static163.anIntArray311[Static163.anIntArray311.length - 1 & Static80.anInt1769 + local20] / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static2.anIntArray2[local20++] = local71;
		}
		@Pc(104) int local104;
		@Pc(106) int local106;
		@Pc(113) int local113;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local104 = local71 * 128;
			for (local106 = 0; local106 < 128; local106++) {
				local113 = (int) (Math.random() * 100.0D);
				if (local113 < 50 && local106 > 10 && local106 < 118) {
					Static2.anIntArray2[local106 + local104] = 255;
				} else {
					Static2.anIntArray2[local104 + local106] = 0;
				}
			}
		}
		for (local104 = 0; local104 < 256 - arg0; local104++) {
			Static24.anIntArray44[local104] = Static24.anIntArray44[local104 + arg0];
		}
		for (local106 = 256 - arg0; local106 < 256; local106++) {
			Static24.anIntArray44[local106] = (int) (Math.sin((double) Static139.anInt3092 / 14.0D) * 16.0D + Math.sin((double) Static139.anInt3092 / 15.0D) * 14.0D + Math.sin((double) Static139.anInt3092 / 16.0D) * 12.0D);
			Static139.anInt3092++;
		}
		Static138.anInt3055 += arg0;
		local113 = ((Static128.anInt2802 & 0x1) + arg0) / 2;
		if (local113 <= 0) {
			return;
		}
		@Pc(243) int local243;
		@Pc(250) int local250;
		for (@Pc(234) int local234 = 0; local234 < Static138.anInt3055; local234++) {
			local243 = (int) (Math.random() * 124.0D) + 2;
			local250 = (int) (Math.random() * 128.0D) + 128;
			Static2.anIntArray2[(local250 << 7) + local243] = 192;
		}
		Static138.anInt3055 = 0;
		@Pc(272) int local272;
		@Pc(277) int local277;
		for (local243 = 0; local243 < 256; local243++) {
			local272 = local243 * 128;
			local250 = 0;
			for (local277 = -local113; local277 < 128; local277++) {
				if (local277 + local113 < 128) {
					local250 += Static2.anIntArray2[local113 + local277 + local272];
				}
				if (local277 - local113 - 1 >= 0) {
					local250 -= Static2.anIntArray2[local277 + local272 - local113 - 1];
				}
				if (local277 >= 0) {
					Static22.anIntArray43[local272 + local277] = local250 / (local113 * 2 + 1);
				}
			}
		}
		for (local250 = 0; local250 < 128; local250++) {
			local272 = 0;
			for (local277 = -local113; local277 < 256; local277++) {
				@Pc(362) int local362 = local277 * 128;
				if (local277 + local113 < 256) {
					local272 += Static22.anIntArray43[local250 + local362 + local113 * 128];
				}
				if (local277 - local113 - 1 >= 0) {
					local272 -= Static22.anIntArray43[local250 + local362 - local113 * 128 - 128];
				}
				if (local277 >= 0) {
					Static2.anIntArray2[local362 + local250] = local272 / (local113 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vf;I)V")
	public static void method3624(@OriginalArg(0) Class1_Sub26 arg0) {
		while (arg0.anInt4021 < arg0.aByteArray52.length) {
			@Pc(9) boolean local9 = false;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			if (arg0.method2945() == 1) {
				local13 = arg0.method2945();
				local9 = true;
				local11 = arg0.method2945();
			}
			@Pc(34) int local34 = arg0.method2945();
			@Pc(38) int local38 = arg0.method2945();
			@Pc(44) int local44 = local34 * 64 - Static101.anInt2179;
			@Pc(56) int local56 = Static64.anInt1525 + Static152.anInt3375 - local38 * 64 - 1;
			@Pc(81) byte local81;
			@Pc(75) int local75;
			if (local44 >= 0 && local56 - 63 >= 0 && Static170.anInt3706 > local44 + 63 && local56 < Static152.anInt3375) {
				local75 = local44 >> 6;
				@Pc(114) int local114 = local56 >> 6;
				for (@Pc(116) int local116 = 0; local116 < 64; local116++) {
					for (@Pc(120) int local120 = 0; local120 < 64; local120++) {
						if (!local9 || local116 >= local13 * 8 && local13 * 8 + 8 > local116 && local11 * 8 <= local120 && local120 < local11 * 8 + 8) {
							local81 = arg0.method2992();
							if (local81 != 0) {
								if (Static81.aByteArrayArrayArray6[local75][local114] == null) {
									Static81.aByteArrayArrayArray6[local75][local114] = new byte[4096];
								}
								Static81.aByteArrayArrayArray6[local75][local114][local116 + (63 - local120 << 6)] = local81;
								@Pc(198) byte local198 = arg0.method2992();
								if (Static150.aByteArrayArrayArray10[local75][local114] == null) {
									Static150.aByteArrayArrayArray10[local75][local114] = new byte[4096];
								}
								Static150.aByteArrayArrayArray10[local75][local114][local116 + (63 - local120 << 6)] = local198;
							}
						}
					}
				}
			} else {
				for (local75 = 0; local75 < (local9 ? 64 : 4096); local75++) {
					local81 = arg0.method2992();
					if (local81 != 0) {
						arg0.anInt4021++;
					}
				}
			}
		}
	}
}

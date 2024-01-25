import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
	public static int anInt4491;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_88 = new Class56(0, -2);

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[J")
	public static final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBIII)V")
	public static void method3898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg0);
		@Pc(17) int local17 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg3);
		@Pc(23) int local23 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1);
		@Pc(29) int local29 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg4);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static583.method7816(Static158.anIntArrayArray66[local31], arg2, local23, local29);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public static void method3899() {
		Static39.anInt749 = 0;
		@Pc(11) int local11 = Static532.aClass3_Sub11_Sub1_2.method5204();
		@Pc(15) int local15 = Static532.aClass3_Sub11_Sub1_2.method5205();
		@Pc(19) int local19 = Static532.aClass3_Sub11_Sub1_2.method5205();
		@Pc(30) boolean local30 = Static532.aClass3_Sub11_Sub1_2.method5204() == 1;
		Static13.method4619();
		Static261.method3996(local11);
		@Pc(43) int local43 = (Static292.anInt4974 - Static532.aClass3_Sub11_Sub1_2.anInt6128) / 16;
		Static189.anIntArrayArray81 = new int[local43][4];
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (@Pc(53) int local53 = 0; local53 < 4; local53++) {
				Static189.anIntArrayArray81[local49][local53] = Static532.aClass3_Sub11_Sub1_2.method5186();
			}
		}
		Static308.aByteArrayArray13 = new byte[local43][];
		Static403.anIntArray428 = new int[local43];
		Static274.aByteArrayArray12 = new byte[local43][];
		Static551.aByteArrayArray22 = new byte[local43][];
		Static299.anIntArray289 = new int[local43];
		Static450.anIntArray623 = new int[local43];
		Static73.anIntArray77 = new int[local43];
		Static529.anIntArray557 = new int[local43];
		Static346.aByteArrayArray18 = null;
		Static401.aByteArrayArray20 = new byte[local43][];
		Static58.anIntArray60 = null;
		local43 = 0;
		for (@Pc(120) int local120 = (local15 - (Static54.anInt1038 >> 4)) / 8; local120 <= (local15 + (Static54.anInt1038 >> 4)) / 8; local120++) {
			for (@Pc(131) int local131 = (local19 - (Static140.anInt3026 >> 4)) / 8; local131 <= ((Static140.anInt3026 >> 4) + local19) / 8; local131++) {
				Static403.anIntArray428[local43] = (local120 << 8) + local131;
				Static450.anIntArray623[local43] = Static99.aClass322_36.method6823("m" + local120 + "_" + local131);
				Static73.anIntArray77[local43] = Static99.aClass322_36.method6823("l" + local120 + "_" + local131);
				Static529.anIntArray557[local43] = Static99.aClass322_36.method6823("um" + local120 + "_" + local131);
				Static299.anIntArray289[local43] = Static99.aClass322_36.method6823("ul" + local120 + "_" + local131);
				local43++;
			}
		}
		Static272.method4138(11, local15, local30, local19);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)I")
	public static int method3900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(26) int local26 = ((arg0 & 0xFF00) * arg1 & 0xFF0000 | (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return local26 + (((arg2 & 0xFF00) * local8 & 0xFF0000 | local8 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IC)B")
	public static byte method3901(@OriginalArg(1) char arg0) {
		@Pc(26) byte local26;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local26 = (byte) arg0;
		} else if (arg0 == '€') {
			local26 = -128;
		} else if (arg0 == '‚') {
			local26 = -126;
		} else if (arg0 == 'ƒ') {
			local26 = -125;
		} else if (arg0 == '„') {
			local26 = -124;
		} else if (arg0 == '…') {
			local26 = -123;
		} else if (arg0 == '†') {
			local26 = -122;
		} else if (arg0 == '‡') {
			local26 = -121;
		} else if (arg0 == 'ˆ') {
			local26 = -120;
		} else if (arg0 == '‰') {
			local26 = -119;
		} else if (arg0 == 'Š') {
			local26 = -118;
		} else if (arg0 == '‹') {
			local26 = -117;
		} else if (arg0 == 'Œ') {
			local26 = -116;
		} else if (arg0 == 'Ž') {
			local26 = -114;
		} else if (arg0 == '‘') {
			local26 = -111;
		} else if (arg0 == '’') {
			local26 = -110;
		} else if (arg0 == '“') {
			local26 = -109;
		} else if (arg0 == '”') {
			local26 = -108;
		} else if (arg0 == '•') {
			local26 = -107;
		} else if (arg0 == '–') {
			local26 = -106;
		} else if (arg0 == '—') {
			local26 = -105;
		} else if (arg0 == '˜') {
			local26 = -104;
		} else if (arg0 == '™') {
			local26 = -103;
		} else if (arg0 == 'š') {
			local26 = -102;
		} else if (arg0 == '›') {
			local26 = -101;
		} else if (arg0 == 'œ') {
			local26 = -100;
		} else if (arg0 == 'ž') {
			local26 = -98;
		} else if (arg0 == 'Ÿ') {
			local26 = -97;
		} else {
			local26 = 63;
		}
		return local26;
	}
}

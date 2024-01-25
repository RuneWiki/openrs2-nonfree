import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)V")
	public static void method4207() {
		Static231.anInt4426 = -1;
		Static119.anInt2324 = -1;
		Static58.method725(0, -126);
		@Pc(22) int local22;
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static362.anInt8653 >> 3; local18++) {
				for (local22 = 0; local22 < Static206.anInt11291 >> 3; local22++) {
					Static486.anIntArrayArrayArray6[local14][local18][local22] = -1;
				}
			}
		}
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(91) int local91;
		@Pc(94) int local94;
		@Pc(97) int local97;
		@Pc(100) int local100;
		@Pc(103) int local103;
		@Pc(106) int local106;
		for (@Pc(61) Class3_Sub39 local61 = (Class3_Sub39) Static290.aClass357_26.method8391(); local61 != null; local61 = (Class3_Sub39) Static290.aClass357_26.method8392()) {
			local22 = local61.anInt8036;
			@Pc(78) boolean local78 = (local22 & 0x1) == 1;
			local83 = local61.anInt8046 >> 3;
			local88 = local61.anInt8038 >> 3;
			local91 = local61.anInt8037;
			local94 = local61.anInt8039;
			local97 = local61.anInt8044;
			local100 = local61.anInt8041;
			local103 = local61.anInt8043;
			local106 = local61.anInt8035;
			@Pc(108) int local108 = 0;
			@Pc(110) int local110 = 0;
			@Pc(112) byte local112 = 1;
			@Pc(114) byte local114 = 1;
			if (local22 == 1) {
				local110 = local103 - 1;
				local112 = -1;
			} else if (local22 == 2) {
				local110 = local103 - 1;
				local112 = -1;
				local114 = -1;
				local108 = local106 - 1;
			} else if (local22 == 3) {
				local112 = 1;
				local114 = -1;
				local108 = local106 - 1;
			}
			for (@Pc(165) int local165 = local88; local165 < local88 + local106; local165++) {
				@Pc(169) int local169 = local110;
				@Pc(171) int local171 = local83;
				while (local103 + local83 > local171) {
					if (local78) {
						Static486.anIntArrayArrayArray6[local100][local91 + local108][local169 + local94] = (local97 << 24) + (local171 << 14) + (local165 << 3) + (local22 << 1);
					} else {
						Static486.anIntArrayArrayArray6[local100][local91 + local169][local108 + local94] = (local22 << 1) + (local97 << 24) + (local171 << 14) + (local165 << 3);
					}
					local171++;
					local169 += local112;
				}
				local108 += local114;
			}
		}
		local22 = Static316.anIntArrayArray36.length;
		Static551.aByteArrayArray18 = null;
		Static83.anIntArray86 = new int[local22];
		Static504.anIntArray469 = new int[local22];
		Static423.aByteArrayArray9 = new byte[local22][];
		Static74.aByteArrayArray2 = new byte[local22][];
		Static718.anIntArray638 = new int[local22];
		Static46.anIntArray54 = new int[local22];
		Static257.aByteArrayArray8 = new byte[local22][];
		Static423.anIntArray399 = null;
		Static484.aByteArrayArray13 = new byte[local22][];
		Static23.anIntArray13 = new int[local22];
		local22 = 0;
		for (@Pc(320) Class3_Sub39 local320 = (Class3_Sub39) Static290.aClass357_26.method8391(); local320 != null; local320 = (Class3_Sub39) Static290.aClass357_26.method8392()) {
			local83 = local320.anInt8046 >>> -750432477;
			local88 = local320.anInt8038 >>> 3;
			local91 = local83 + local320.anInt8043;
			if ((local91 & 0x7) == 0) {
				local91--;
			}
			local91 >>>= 0x3;
			local94 = local88 + local320.anInt8035;
			if ((local94 & 0x7) == 0) {
				local94--;
			}
			local94 >>>= 0x3;
			for (local97 = local83 >>> 3; local97 <= local91; local97++) {
				label82: for (local100 = local88 >>> 3; local100 <= local94; local100++) {
					local103 = local97 << 8 | local100;
					for (local106 = 0; local106 < local22; local106++) {
						if (Static46.anIntArray54[local106] == local103) {
							continue label82;
						}
					}
					Static46.anIntArray54[local22] = local103;
					Static718.anIntArray638[local22] = Static397.aClass221_113.method5096("m" + local97 + "_" + local100);
					Static504.anIntArray469[local22] = Static397.aClass221_113.method5096("l" + local97 + "_" + local100);
					Static23.anIntArray13[local22] = Static397.aClass221_113.method5096("um" + local97 + "_" + local100);
					Static83.anIntArray86[local22] = Static397.aClass221_113.method5096("ul" + local97 + "_" + local100);
					local22++;
				}
			}
		}
		Static101.anIntArrayArray10 = Static316.anIntArrayArray36;
		Static316.anIntArrayArray36 = null;
		Static524.method7459(Static206.anInt11291 >> 4, false, Static362.anInt8653 >> 4, 12);
	}
}

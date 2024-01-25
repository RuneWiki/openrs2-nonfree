import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III[BBLjava/lang/String;)I")
	public static int method9572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) String arg3) {
		@Pc(9) int local9 = arg1;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(19) char local19 = arg3.charAt(local11);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				arg2[arg0 + local11] = (byte) local19;
			} else if (local19 == '€') {
				arg2[arg0 + local11] = -128;
			} else if (local19 == '‚') {
				arg2[local11 + arg0] = -126;
			} else if (local19 == 'ƒ') {
				arg2[arg0 + local11] = -125;
			} else if (local19 == '„') {
				arg2[local11 + arg0] = -124;
			} else if (local19 == '…') {
				arg2[arg0 + local11] = -123;
			} else if (local19 == '†') {
				arg2[arg0 + local11] = -122;
			} else if (local19 == '‡') {
				arg2[local11 + arg0] = -121;
			} else if (local19 == 'ˆ') {
				arg2[arg0 + local11] = -120;
			} else if (local19 == '‰') {
				arg2[arg0 + local11] = -119;
			} else if (local19 == 'Š') {
				arg2[local11 + arg0] = -118;
			} else if (local19 == '‹') {
				arg2[arg0 + local11] = -117;
			} else if (local19 == 'Œ') {
				arg2[arg0 + local11] = -116;
			} else if (local19 == 'Ž') {
				arg2[local11 + arg0] = -114;
			} else if (local19 == '‘') {
				arg2[local11 + arg0] = -111;
			} else if (local19 == '’') {
				arg2[local11 + arg0] = -110;
			} else if (local19 == '“') {
				arg2[arg0 + local11] = -109;
			} else if (local19 == '”') {
				arg2[local11 + arg0] = -108;
			} else if (local19 == '•') {
				arg2[local11 + arg0] = -107;
			} else if (local19 == '–') {
				arg2[local11 + arg0] = -106;
			} else if (local19 == '—') {
				arg2[arg0 + local11] = -105;
			} else if (local19 == '˜') {
				arg2[arg0 + local11] = -104;
			} else if (local19 == '™') {
				arg2[local11 + arg0] = -103;
			} else if (local19 == 'š') {
				arg2[arg0 + local11] = -102;
			} else if (local19 == '›') {
				arg2[local11 + arg0] = -101;
			} else if (local19 == 'œ') {
				arg2[local11 + arg0] = -100;
			} else if (local19 == 'ž') {
				arg2[local11 + arg0] = -98;
			} else if (local19 == 'Ÿ') {
				arg2[arg0 + local11] = -97;
			} else {
				arg2[arg0 + local11] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!aa;IIILclient!ha;ILclient!nt;)V")
	public static void method9581(@OriginalArg(1) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class22 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class270 arg7) {
		@Pc(17) Class198 local17 = Static47.aClass111_3.method2739(arg2);
		if (local17 == null || !local17.aBoolean338 || !local17.method4667(Static380.aClass127_1)) {
			return;
		}
		@Pc(43) int local43;
		if (local17.anIntArray376 != null) {
			@Pc(41) int[] local41 = new int[local17.anIntArray376.length];
			@Pc(68) int local68;
			@Pc(72) int local72;
			for (local43 = 0; local43 < local41.length / 2; local43++) {
				@Pc(57) int local57;
				if (Static262.anInt4081 == 4) {
					local57 = (int) Static382.aFloat40 & 0x3FFF;
				} else {
					local57 = (int) Static382.aFloat40 + Static194.anInt3310 & 0x3FFF;
				}
				local68 = Class3_Sub7_Sub17_Sub1.anIntArray549[local57];
				local72 = Class3_Sub7_Sub17_Sub1.anIntArray548[local57];
				if (Static262.anInt4081 != 4) {
					local72 = local72 * 256 / (Static402.anInt6239 + 256);
					local68 = local68 * 256 / (Static402.anInt6239 + 256);
				}
				local41[local43 * 2] = (local68 * (local17.anIntArray376[local43 * 2 + 1] * 4 + arg0) + local72 * (local17.anIntArray376[local43 * 2] * 4 + arg3) >> 14) + arg4 + arg7.anInt7015 / 2;
				local41[local43 * 2 + 1] = arg7.anInt7045 / 2 + arg6 - ((arg0 + local17.anIntArray376[local43 * 2 + 1] * 4) * local72 - local68 * (local17.anIntArray376[local43 * 2] * 4 + arg3) >> 14);
			}
			@Pc(191) Class252 local191 = arg7.method6017(arg5);
			if (local191 != null) {
				Static399.method5393(arg5, local41, local17.anInt5155, local191.anIntArray489, local191.anIntArray490);
			}
			if (local17.anInt5123 > 0) {
				@Pc(227) int local227;
				@Pc(235) int local235;
				@Pc(243) int local243;
				@Pc(262) int local262;
				@Pc(274) int local274;
				for (local68 = 0; local68 < local41.length / 2 - 1; local68++) {
					local72 = local41[local68 * 2];
					local227 = local41[local68 * 2 + 1];
					local235 = local41[local68 * 2 + 2];
					local243 = local41[local68 * 2 + 3];
					if (local235 < local72) {
						local262 = local72;
						local72 = local235;
						local274 = local227;
						local235 = local262;
						local227 = local243;
						local243 = local274;
					} else if (local235 == local72 && local243 < local227) {
						local262 = local227;
						local227 = local243;
						local243 = local262;
					}
					arg5.method9390(local72, local227, local235, local243, local17.anIntArray375[local17.aByteArray47[local68] & 0xFF], arg1, arg4, arg6, local17.anInt5123, local17.anInt5150, local17.anInt5138);
				}
				local72 = local41[local41.length - 2];
				local227 = local41[local41.length - 1];
				local235 = local41[0];
				local243 = local41[1];
				if (local72 > local235) {
					local262 = local72;
					local72 = local235;
					local274 = local227;
					local227 = local243;
					local235 = local262;
					local243 = local274;
				} else if (local72 == local235 && local227 > local243) {
					local262 = local227;
					local227 = local243;
					local243 = local262;
				}
				arg5.method9390(local72, local227, local235, local243, local17.anIntArray375[local17.aByteArray47[local17.aByteArray47.length - 1] & 0xFF], arg1, arg4, arg6, local17.anInt5123, local17.anInt5150, local17.anInt5138);
			} else {
				for (local68 = 0; local68 < local41.length / 2 - 1; local68++) {
					arg5.method9341(local41[local68 * 2], local41[local68 * 2 + 1], local41[local68 * 2 + 2], local41[local68 * 2 + 1 + 2], local17.anIntArray375[local17.aByteArray47[local68] & 0xFF], arg1, arg4, arg6);
				}
				arg5.method9341(local41[local41.length - 2], local41[local41.length - 1], local41[0], local41[1], local17.anIntArray375[local17.aByteArray47[local17.aByteArray47.length - 1] & 0xFF], arg1, arg4, arg6);
			}
		}
		@Pc(511) Class178 local511 = null;
		if (local17.anInt5156 != -1) {
			local511 = local17.method4675(arg5, false);
			if (local511 != null) {
				Static687.method9072(arg3, arg1, arg4, local511, arg7, arg6, arg0);
			}
		}
		if (local17.aString62 == null) {
			return;
		}
		local43 = 0;
		if (local511 != null) {
			local43 = local511.method7618();
		}
		@Pc(546) Class57 local546 = Static607.aClass57_12;
		@Pc(548) Class169 local548 = Static286.aClass169_5;
		if (local17.anInt5126 == 1) {
			local548 = Static52.aClass169_1;
			local546 = Static480.aClass57_9;
		}
		if (local17.anInt5126 == 2) {
			local548 = Static677.aClass169_12;
			local546 = Static561.aClass57_10;
		}
		Static660.method8621(local546, arg1, arg7, arg4, local17.aString62, local548, arg6, arg3, local43, local17.anInt5147, arg0);
		return;
	}
}

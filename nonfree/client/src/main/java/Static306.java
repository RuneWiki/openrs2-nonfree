import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lo", name = "O", descriptor = "[[[Lclient!fba;")
	public static Class100[][][] aClass100ArrayArrayArray1;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
	public static int anInt5575 = 0;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)V")
	public static void method4730() {
		@Pc(5) Class223 local5 = Static291.aClass223_42;
		synchronized (Static291.aClass223_42) {
			Static291.aClass223_42.method4941();
		}
		local5 = Static52.aClass223_7;
		synchronized (Static52.aClass223_7) {
			Static52.aClass223_7.method4941();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
	public static void method4732() {
		if (Static18.anIntArray203 != null) {
			return;
		}
		Static18.anIntArray203 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(38) float local38 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(78) float local78 = local66 - (float) local69;
				@Pc(84) float local84 = (1.0F - local47) * local56;
				@Pc(93) float local93 = (1.0F - local78 * local47) * local56;
				@Pc(103) float local103 = (1.0F - (1.0F - local78) * local47) * local56;
				if (local73 == 0) {
					local60 = local103;
					local62 = local84;
					local58 = local56;
				} else if (local73 == 1) {
					local60 = local56;
					local58 = local93;
					local62 = local84;
				} else if (local73 == 2) {
					local60 = local56;
					local62 = local103;
					local58 = local84;
				} else if (local73 == 3) {
					local62 = local56;
					local58 = local84;
					local60 = local93;
				} else if (local73 == 4) {
					local60 = local84;
					local62 = local56;
					local58 = local103;
				} else if (local73 == 5) {
					local58 = local56;
					local62 = local93;
					local60 = local84;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(197) int local197 = (int) (local58 * 256.0F);
				@Pc(202) int local202 = (int) (local60 * 256.0F);
				@Pc(207) int local207 = (int) (local62 * 256.0F);
				@Pc(219) int local219 = local207 + (local202 << 8) + (local197 << 16) - 16777216;
				Static18.anIntArray203[local22++] = local219;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII[FII)V")
	public static void method4734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static422.method6062(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static422.method6062(arg1)) {
			@Pc(37) int local37 = Static257.method4279(6408);
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg1 > arg4 ? arg4 : arg1;
			@Pc(54) int local54 = arg4 >> 1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(60) float[] local60 = arg3;
			@Pc(71) float[] local71 = new float[local58 * local54 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg4, arg1, 0, 6408, 5126, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(91) int local91 = local37 * arg4;
				@Pc(93) float[] local93 = local71;
				for (@Pc(95) int local95 = 0; local95 < local37; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local95 + local91;
					for (@Pc(107) int local107 = 0; local107 < local58; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local54; local111++) {
							@Pc(117) float local117 = local60[local101];
							local101 += local37;
							@Pc(127) float local127 = local117 + local60[local101];
							@Pc(133) float local133 = local127 + local60[local105];
							local101 += local37;
							local105 += local37;
							@Pc(147) float local147 = local133 + local60[local105];
							local105 += local37;
							local71[local99] = local147 * 0.25F;
							local99 += local37;
						}
						local101 += local91;
						local105 += local91;
					}
				}
				local71 = local60;
				arg1 = local58;
				local60 = local93;
				arg4 = local54;
				local39++;
				local50 >>= 0x1;
				local58 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZIIILclient!ii;)Ljava/awt/Frame;")
	public static Frame method4735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class161 arg3) {
		if (!arg3.method3816()) {
			return null;
		}
		@Pc(25) Class242[] local25 = Static352.method7379(arg3);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg2 == local25[local33].anInt6163 && local25[local33].anInt6170 == arg1 && (!local31 || arg0 < local25[local33].anInt6161)) {
				arg0 = local25[local33].anInt6161;
				local31 = true;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(99) Class299 local99 = arg3.method3828(arg1, arg0, arg2);
		while (local99.anInt7985 == 0) {
			Static55.method845(10L);
		}
		@Pc(114) Frame local114 = (Frame) local99.anObject41;
		if (local114 == null) {
			return null;
		} else if (local99.anInt7985 == 2) {
			Static159.method3159(local114, arg3);
			return null;
		} else {
			return local114;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method4736(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString222 = null;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIIIIBI)V")
	public static void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class1_Sub40 local7 = new Class1_Sub40();
		local7.anInt5969 = arg0;
		local7.anInt5980 = arg11;
		local7.anInt5973 = arg7;
		local7.anInt5976 = arg4;
		local7.anInt5974 = arg10;
		local7.anInt5972 = arg3;
		local7.anInt5975 = arg9;
		local7.anInt5977 = arg5;
		local7.anInt5979 = arg2;
		local7.anInt5970 = arg8;
		local7.anInt5971 = arg1;
		local7.anInt5983 = arg6;
		Static274.aClass14_29.method300(local7);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
	public static int method4982(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg3;
		for (@Pc(23) int local23 = 0; local23 < local10; local23++) {
			@Pc(31) char local31 = arg2.charAt(local23);
			if (local31 > '\u0000' && local31 < '\u0080' || !(local31 < ' ' || local31 > 'ÿ')) {
				arg0[arg1 + local23] = (byte) local31;
			} else if (local31 == '€') {
				arg0[arg1 + local23] = -128;
			} else if (local31 == '‚') {
				arg0[arg1 + local23] = -126;
			} else if (local31 == 'ƒ') {
				arg0[arg1 + local23] = -125;
			} else if (local31 == '„') {
				arg0[local23 + arg1] = -124;
			} else if (local31 == '…') {
				arg0[arg1 + local23] = -123;
			} else if (local31 == '†') {
				arg0[arg1 + local23] = -122;
			} else if (local31 == '‡') {
				arg0[arg1 + local23] = -121;
			} else if (local31 == 'ˆ') {
				arg0[local23 + arg1] = -120;
			} else if (local31 == '‰') {
				arg0[local23 + arg1] = -119;
			} else if (local31 == 'Š') {
				arg0[arg1 + local23] = -118;
			} else if (local31 == '‹') {
				arg0[local23 + arg1] = -117;
			} else if (local31 == 'Œ') {
				arg0[local23 + arg1] = -116;
			} else if (local31 == 'Ž') {
				arg0[local23 + arg1] = -114;
			} else if (local31 == '‘') {
				arg0[arg1 + local23] = -111;
			} else if (local31 == '’') {
				arg0[arg1 + local23] = -110;
			} else if (local31 == '“') {
				arg0[local23 + arg1] = -109;
			} else if (local31 == '”') {
				arg0[local23 + arg1] = -108;
			} else if (local31 == '•') {
				arg0[local23 + arg1] = -107;
			} else if (local31 == '–') {
				arg0[local23 + arg1] = -106;
			} else if (local31 == '—') {
				arg0[local23 + arg1] = -105;
			} else if (local31 == '˜') {
				arg0[arg1 + local23] = -104;
			} else if (local31 == '™') {
				arg0[local23 + arg1] = -103;
			} else if (local31 == 'š') {
				arg0[local23 + arg1] = -102;
			} else if (local31 == '›') {
				arg0[arg1 + local23] = -101;
			} else if (local31 == 'œ') {
				arg0[arg1 + local23] = -100;
			} else if (local31 == 'ž') {
				arg0[arg1 + local23] = -98;
			} else if (local31 == 'Ÿ') {
				arg0[local23 + arg1] = -97;
			} else {
				arg0[arg1 + local23] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I")
	public static int method4983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg1;
		@Pc(31) int local31 = (arg1 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return ((local13 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * local13 & 0xFF0000) >>> 8) + local31;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public static void method4984() {
		if (Static94.anIntArray150 != null) {
			return;
		}
		Static94.anIntArray150 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(42) float local42 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(51) float local51 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(53) int local53 = 0; local53 < 128; local53++) {
				@Pc(60) float local60 = (float) local53 / 128.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(70) float local70 = local42 / 60.0F;
				@Pc(73) int local73 = (int) local70;
				@Pc(77) int local77 = local73 % 6;
				@Pc(83) float local83 = (float) -local73 + local70;
				@Pc(90) float local90 = local60 * (1.0F - local51);
				@Pc(98) float local98 = local60 * (1.0F - local51 * local83);
				@Pc(108) float local108 = (1.0F - local51 * (1.0F - local83)) * local60;
				if (local77 == 0) {
					local64 = local108;
					local66 = local90;
					local62 = local60;
				} else if (local77 == 1) {
					local66 = local90;
					local64 = local60;
					local62 = local98;
				} else if (local77 == 2) {
					local66 = local108;
					local62 = local90;
					local64 = local60;
				} else if (local77 == 3) {
					local62 = local90;
					local64 = local98;
					local66 = local60;
				} else if (local77 == 4) {
					local62 = local108;
					local66 = local60;
					local64 = local90;
				} else if (local77 == 5) {
					local62 = local60;
					local66 = local98;
					local64 = local90;
				}
				local62 = (float) Math.pow((double) local62, local20);
				local64 = (float) Math.pow((double) local64, local20);
				local66 = (float) Math.pow((double) local66, local20);
				@Pc(201) int local201 = (int) (local62 * 256.0F);
				@Pc(206) int local206 = (int) (local64 * 256.0F);
				@Pc(211) int local211 = (int) (local66 * 256.0F);
				@Pc(223) int local223 = local211 + (local206 << 8) + (local201 << 16) - 16777216;
				Static94.anIntArray150[local22++] = local223;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBI)V")
	public static void method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static347.aClass83ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 << 14 | arg2 << 28 | arg1);
		@Pc(25) Class1_Sub17 local25 = (Class1_Sub17) Static98.aClass207_12.method5555(local19);
		if (local25 == null) {
			Static163.method2861(arg2, arg1, arg0);
			return;
		}
		@Pc(41) Class1_Sub16 local41 = (Class1_Sub16) local25.aClass14_8.method302();
		if (local41 == null) {
			Static163.method2861(arg2, arg1, arg0);
			return;
		}
		@Pc(55) Class10_Sub5_Sub1 local55 = (Class10_Sub5_Sub1) Static163.method2861(arg2, arg1, arg0);
		if (local55 == null) {
			local55 = new Class10_Sub5_Sub1();
		} else {
			local55.anInt2781 = local55.anInt2776 = -1;
		}
		local55.anInt2775 = local41.anInt1909;
		local55.anInt2784 = local41.anInt1908;
		label44: while (true) {
			@Pc(83) Class1_Sub16 local83 = (Class1_Sub16) local25.aClass14_8.method313();
			if (local83 == null) {
				break;
			}
			if (local83.anInt1909 != local55.anInt2775) {
				local55.anInt2781 = local83.anInt1909;
				local55.anInt2773 = local83.anInt1908;
				while (true) {
					@Pc(104) Class1_Sub16 local104 = (Class1_Sub16) local25.aClass14_8.method313();
					if (local104 == null) {
						break label44;
					}
					if (local104.anInt1909 != local55.anInt2775 && local104.anInt1909 != local55.anInt2781) {
						local55.anInt2779 = local104.anInt1908;
						local55.anInt2776 = local104.anInt1909;
					}
				}
			}
		}
		@Pc(153) int local153 = Static352.method5834((arg0 << 7) + 64, (arg1 << 7) + 64, arg2);
		Static59.method1140(arg2, arg1, arg0, local153, local55);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method4986() {
		for (@Pc(6) Class7_Sub7 local6 = (Class7_Sub7) Static116.aClass122_2.method2626(); local6 != null; local6 = (Class7_Sub7) Static116.aClass122_2.method2630()) {
			local6.method2823();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ud;IILclient!ps;BIII)V")
	public static void method4987(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg5 * arg5 + arg0 * arg0;
		if (local13 > arg3) {
			return;
		}
		@Pc(27) int local27 = Math.min(arg4.anInt4991 / 2, arg4.anInt4935 / 2);
		if (local13 <= local27 * local27) {
			Static319.method2792(arg4, arg6, arg7, arg0, Static344.aClass8Array15[arg2], arg1, arg5);
			return;
		}
		local27 -= 10;
		@Pc(43) int local43;
		if (Static246.anInt5156 == 4) {
			local43 = (int) Static143.aFloat21 & 0x3FFF;
		} else {
			local43 = (int) Static143.aFloat21 + Static86.anInt1648 & 0x3FFF;
		}
		@Pc(57) int local57 = Class1_Sub5_Sub15.anIntArray335[local43];
		@Pc(61) int local61 = Class1_Sub5_Sub15.anIntArray333[local43];
		if (Static246.anInt5156 != 4) {
			local57 = local57 * 256 / (Static260.anInt5347 + 256);
			local61 = local61 * 256 / (Static260.anInt5347 + 256);
		}
		@Pc(90) int local90 = local57 * arg5 + local61 * arg0 >> 15;
		@Pc(101) int local101 = local61 * arg5 - arg0 * local57 >> 15;
		@Pc(107) double local107 = Math.atan2((double) local90, (double) local101);
		@Pc(114) int local114 = (int) (Math.sin(local107) * (double) local27);
		@Pc(121) int local121 = (int) ((double) local27 * Math.cos(local107));
		Static173.aClass8Array7[arg2].method4379((float) arg4.anInt4991 / 2.0F + (float) arg6 + (float) local114, (float) -local121 + (float) arg7 + (float) arg4.anInt4935 / 2.0F, 4096, (int) (-local107 / 6.283185307179586D * 65535.0D));
	}
}

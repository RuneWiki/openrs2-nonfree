import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!il", name = "H", descriptor = "I")
	public static int anInt4228;

	@OriginalMember(owner = "client!il", name = "K", descriptor = "Lclient!qga;")
	public static Class270 aClass270_1;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!pfa;ILjava/lang/String;Z)Lclient!sf;")
	public static Class303 method3707(@OriginalArg(0) Class251 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.method5764(arg1);
		if (local10 == -1) {
			return new Class303(0);
		}
		@Pc(23) int[] local23 = arg0.method5752(local10);
		@Pc(29) Class303 local29 = new Class303(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		while (true) {
			while (local31 < local29.anInt8095) {
				@Pc(47) Class6_Sub21 local47 = new Class6_Sub21(arg0.method5772(local23[local33++], local10));
				@Pc(53) int local53 = local47.method6036();
				@Pc(57) int local57 = local47.method6003();
				@Pc(61) int local61 = local47.method6069();
				if (!arg2 && local61 == 1) {
					local29.anInt8095--;
				} else {
					local29.anIntArray596[local31] = local53;
					local29.anIntArray597[local31] = local57;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method3708(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg0.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(75) char local75;
			if (local19 == '\u0000') {
				local75 = arg1.charAt(local15++);
			} else {
				local75 = local19;
			}
			local17 = Static513.method7111(local62);
			local19 = Static513.method7111(local75);
			local62 = Static139.method2743(arg2, local62);
			local75 = Static139.method2743(arg2, local75);
			if (local75 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local75)) {
				local62 = Character.toLowerCase(local62);
				local75 = Character.toLowerCase(local75);
				if (local75 != local62) {
					return Static288.method4676(local62, arg2) - Static288.method4676(local75, arg2);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg2 == 2) {
				local13 = local8 - local145 - 1;
				local15 = local11 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(174) char local174 = arg0.charAt(local13);
			@Pc(178) char local178 = arg1.charAt(local15);
			if (local174 != local178 && Character.toUpperCase(local174) != Character.toUpperCase(local178)) {
				local174 = Character.toLowerCase(local174);
				local178 = Character.toLowerCase(local178);
				if (local178 != local174) {
					return Static288.method4676(local174, arg2) - Static288.method4676(local178, arg2);
				}
			}
		}
		@Pc(224) int local224 = local8 - local11;
		if (local224 != 0) {
			return local224;
		}
		for (@Pc(233) int local233 = 0; local233 < local143; local233++) {
			@Pc(239) char local239 = arg0.charAt(local233);
			@Pc(243) char local243 = arg1.charAt(local233);
			if (local243 != local239) {
				return Static288.method4676(local239, arg2) - Static288.method4676(local243, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3710(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local11[local21] = (byte) local27;
			} else if (local27 == '€') {
				local11[local21] = -128;
			} else if (local27 == '‚') {
				local11[local21] = -126;
			} else if (local27 == 'ƒ') {
				local11[local21] = -125;
			} else if (local27 == '„') {
				local11[local21] = -124;
			} else if (local27 == '…') {
				local11[local21] = -123;
			} else if (local27 == '†') {
				local11[local21] = -122;
			} else if (local27 == '‡') {
				local11[local21] = -121;
			} else if (local27 == 'ˆ') {
				local11[local21] = -120;
			} else if (local27 == '‰') {
				local11[local21] = -119;
			} else if (local27 == 'Š') {
				local11[local21] = -118;
			} else if (local27 == '‹') {
				local11[local21] = -117;
			} else if (local27 == 'Œ') {
				local11[local21] = -116;
			} else if (local27 == 'Ž') {
				local11[local21] = -114;
			} else if (local27 == '‘') {
				local11[local21] = -111;
			} else if (local27 == '’') {
				local11[local21] = -110;
			} else if (local27 == '“') {
				local11[local21] = -109;
			} else if (local27 == '”') {
				local11[local21] = -108;
			} else if (local27 == '•') {
				local11[local21] = -107;
			} else if (local27 == '–') {
				local11[local21] = -106;
			} else if (local27 == '—') {
				local11[local21] = -105;
			} else if (local27 == '˜') {
				local11[local21] = -104;
			} else if (local27 == '™') {
				local11[local21] = -103;
			} else if (local27 == 'š') {
				local11[local21] = -102;
			} else if (local27 == '›') {
				local11[local21] = -101;
			} else if (local27 == 'œ') {
				local11[local21] = -100;
			} else if (local27 == 'ž') {
				local11[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local11[local21] = -97;
			} else {
				local11[local21] = 63;
			}
		}
		return local11;
	}
}

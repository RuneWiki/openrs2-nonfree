import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	public static int anInt3069;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Lclient!mg;")
	public static Class160 aClass160_23;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "Lclient!mg;")
	public static Class160 aClass160_24;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
	public static final int[] anIntArray271 = new int[1000];

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "Lclient!wa;")
	public static final Class258 aClass258_4 = new Class258("WIP", 2);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method2424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg4 && arg2 == arg5 && arg3 == arg7 && arg6 == arg1) {
			Static312.method4390(arg7, arg6, arg4, arg5, arg0);
			return;
		}
		@Pc(27) int local27 = arg4;
		@Pc(29) int local29 = arg5;
		@Pc(33) int local33 = arg4 * 3;
		@Pc(37) int local37 = arg5 * 3;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg2 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg1 * 3;
		@Pc(63) int local63 = arg7 + local41 - arg4 - local49;
		@Pc(72) int local72 = arg6 + local45 - local53 - arg5;
		@Pc(82) int local82 = local33 + local49 - local41 - local41;
		@Pc(91) int local91 = local37 + local53 - local45 - local45;
		@Pc(95) int local95 = local41 - local33;
		@Pc(99) int local99 = local45 - local37;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local101 * local109 >> 12;
			@Pc(119) int local119 = local63 * local115;
			@Pc(123) int local123 = local115 * local72;
			@Pc(127) int local127 = local82 * local109;
			@Pc(131) int local131 = local91 * local109;
			@Pc(135) int local135 = local101 * local95;
			@Pc(139) int local139 = local99 * local101;
			@Pc(149) int local149 = arg4 + (local135 + local127 + local119 >> 12);
			@Pc(160) int local160 = arg5 + (local123 + local131 + local139 >> 12);
			Static312.method4390(local149, local160, local27, local29, arg0);
			local27 = local149;
			local29 = local160;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method2425(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(30) char local30 = arg0.charAt(local24);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				local11[local24] = (byte) local30;
			} else if (local30 == '€') {
				local11[local24] = -128;
			} else if (local30 == '‚') {
				local11[local24] = -126;
			} else if (local30 == 'ƒ') {
				local11[local24] = -125;
			} else if (local30 == '„') {
				local11[local24] = -124;
			} else if (local30 == '…') {
				local11[local24] = -123;
			} else if (local30 == '†') {
				local11[local24] = -122;
			} else if (local30 == '‡') {
				local11[local24] = -121;
			} else if (local30 == 'ˆ') {
				local11[local24] = -120;
			} else if (local30 == '‰') {
				local11[local24] = -119;
			} else if (local30 == 'Š') {
				local11[local24] = -118;
			} else if (local30 == '‹') {
				local11[local24] = -117;
			} else if (local30 == 'Œ') {
				local11[local24] = -116;
			} else if (local30 == 'Ž') {
				local11[local24] = -114;
			} else if (local30 == '‘') {
				local11[local24] = -111;
			} else if (local30 == '’') {
				local11[local24] = -110;
			} else if (local30 == '“') {
				local11[local24] = -109;
			} else if (local30 == '”') {
				local11[local24] = -108;
			} else if (local30 == '•') {
				local11[local24] = -107;
			} else if (local30 == '–') {
				local11[local24] = -106;
			} else if (local30 == '—') {
				local11[local24] = -105;
			} else if (local30 == '˜') {
				local11[local24] = -104;
			} else if (local30 == '™') {
				local11[local24] = -103;
			} else if (local30 == 'š') {
				local11[local24] = -102;
			} else if (local30 == '›') {
				local11[local24] = -101;
			} else if (local30 == 'œ') {
				local11[local24] = -100;
			} else if (local30 == 'ž') {
				local11[local24] = -98;
			} else if (local30 == 'Ÿ') {
				local11[local24] = -97;
			} else {
				local11[local24] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)V")
	public static void method2432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static8.anInt223 <= arg0 - arg4 && arg0 + arg4 <= Static184.anInt3600 && Static430.anInt7123 <= arg3 - arg4 && Static181.anInt3543 >= arg3 + arg4) {
			Static35.method595(arg5, arg2, arg0, arg4, arg1, arg3);
		} else {
			Static52.method887(arg4, arg2, arg5, arg0, arg1, arg3);
		}
	}
}

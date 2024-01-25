import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZC)I")
	public static int method1698(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([BIIIILjava/lang/String;)I")
	public static int method1699(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(23) int local23 = 0; local23 < local10; local23++) {
			@Pc(31) char local31 = arg3.charAt(local23);
			if (local31 > '\u0000' && local31 < '\u0080' || !(local31 < ' ' || local31 > 'ÿ')) {
				arg0[local23 + arg2] = (byte) local31;
			} else if (local31 == '€') {
				arg0[local23 + arg2] = -128;
			} else if (local31 == '‚') {
				arg0[local23 + arg2] = -126;
			} else if (local31 == 'ƒ') {
				arg0[local23 + arg2] = -125;
			} else if (local31 == '„') {
				arg0[local23 + arg2] = -124;
			} else if (local31 == '…') {
				arg0[arg2 + local23] = -123;
			} else if (local31 == '†') {
				arg0[arg2 + local23] = -122;
			} else if (local31 == '‡') {
				arg0[arg2 + local23] = -121;
			} else if (local31 == 'ˆ') {
				arg0[local23 + arg2] = -120;
			} else if (local31 == '‰') {
				arg0[arg2 + local23] = -119;
			} else if (local31 == 'Š') {
				arg0[arg2 + local23] = -118;
			} else if (local31 == '‹') {
				arg0[arg2 + local23] = -117;
			} else if (local31 == 'Œ') {
				arg0[local23 + arg2] = -116;
			} else if (local31 == 'Ž') {
				arg0[arg2 + local23] = -114;
			} else if (local31 == '‘') {
				arg0[arg2 + local23] = -111;
			} else if (local31 == '’') {
				arg0[arg2 + local23] = -110;
			} else if (local31 == '“') {
				arg0[local23 + arg2] = -109;
			} else if (local31 == '”') {
				arg0[arg2 + local23] = -108;
			} else if (local31 == '•') {
				arg0[local23 + arg2] = -107;
			} else if (local31 == '–') {
				arg0[arg2 + local23] = -106;
			} else if (local31 == '—') {
				arg0[local23 + arg2] = -105;
			} else if (local31 == '˜') {
				arg0[arg2 + local23] = -104;
			} else if (local31 == '™') {
				arg0[arg2 + local23] = -103;
			} else if (local31 == 'š') {
				arg0[arg2 + local23] = -102;
			} else if (local31 == '›') {
				arg0[arg2 + local23] = -101;
			} else if (local31 == 'œ') {
				arg0[local23 + arg2] = -100;
			} else if (local31 == 'ž') {
				arg0[arg2 + local23] = -98;
			} else if (local31 == 'Ÿ') {
				arg0[local23 + arg2] = -97;
			} else {
				arg0[local23 + arg2] = 63;
			}
		}
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 6)
	public static void method5838() {
		if (Class98.aBoolean187) {
			return;
		}
		Class98.aBoolean187 = true;
		Class2_Sub13.aBoolean156 = true;
		if (Static203.aClass177_Sub1_2.aBoolean351) {
			Class28.aFloat27 = (int) Class28.aFloat27 + 47 & 0xFFFFFFF0;
		} else {
			Class198.aFloat67 += (12.0F - Class198.aFloat67) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BILjava/lang/String;[BII)I", line = 46)
	public static int method5840(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(22) char local22 = arg1.charAt(local15);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				arg2[local15 + arg3] = (byte) local22;
			} else if (local22 == '€') {
				arg2[local15 + arg3] = -128;
			} else if (local22 == '‚') {
				arg2[arg3 + local15] = -126;
			} else if (local22 == 'ƒ') {
				arg2[arg3 + local15] = -125;
			} else if (local22 == '„') {
				arg2[local15 + arg3] = -124;
			} else if (local22 == '…') {
				arg2[arg3 + local15] = -123;
			} else if (local22 == '†') {
				arg2[arg3 + local15] = -122;
			} else if (local22 == '‡') {
				arg2[arg3 + local15] = -121;
			} else if (local22 == 'ˆ') {
				arg2[local15 + arg3] = -120;
			} else if (local22 == '‰') {
				arg2[local15 + arg3] = -119;
			} else if (local22 == 'Š') {
				arg2[arg3 + local15] = -118;
			} else if (local22 == '‹') {
				arg2[local15 + arg3] = -117;
			} else if (local22 == 'Œ') {
				arg2[local15 + arg3] = -116;
			} else if (local22 == 'Ž') {
				arg2[local15 + arg3] = -114;
			} else if (local22 == '‘') {
				arg2[local15 + arg3] = -111;
			} else if (local22 == '’') {
				arg2[local15 + arg3] = -110;
			} else if (local22 == '“') {
				arg2[arg3 + local15] = -109;
			} else if (local22 == '”') {
				arg2[local15 + arg3] = -108;
			} else if (local22 == '•') {
				arg2[local15 + arg3] = -107;
			} else if (local22 == '–') {
				arg2[local15 + arg3] = -106;
			} else if (local22 == '—') {
				arg2[local15 + arg3] = -105;
			} else if (local22 == '˜') {
				arg2[local15 + arg3] = -104;
			} else if (local22 == '™') {
				arg2[arg3 + local15] = -103;
			} else if (local22 == 'š') {
				arg2[local15 + arg3] = -102;
			} else if (local22 == '›') {
				arg2[arg3 + local15] = -101;
			} else if (local22 == 'œ') {
				arg2[arg3 + local15] = -100;
			} else if (local22 == 'ž') {
				arg2[arg3 + local15] = -98;
			} else if (local22 == 'Ÿ') {
				arg2[local15 + arg3] = -97;
			} else {
				arg2[local15 + arg3] = 63;
			}
		}
		return local8;
	}
}

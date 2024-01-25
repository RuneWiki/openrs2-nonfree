import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "Lclient!wi;")
	public static final Class376 aClass376_4 = new Class376();

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "[I")
	public static final int[] anIntArray325 = new int[14];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLclient!vi;Lclient!vi;II)I")
	public static int method5197(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class354_Sub1 arg1, @OriginalArg(2) Class354_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg2.anInt9770;
			local12 = arg1.anInt9770;
			if (!arg0) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static513.method7471(Static455.anInt7738, arg2.method8311().aString96, arg1.method8311().aString96);
		} else if (arg3 == 3) {
			if (arg2.aString99.equals("-")) {
				if (arg1.aString99.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString99.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static513.method7471(Static455.anInt7738, arg2.aString99, arg1.aString99);
			}
		} else if (arg3 == 4) {
			if (arg2.method8306()) {
				return arg1.method8306() ? 0 : 1;
			} else if (arg1.method8306()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method8308()) {
				return arg1.method8308() ? 0 : 1;
			} else if (arg1.method8308()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method8305()) {
				return arg1.method8305() ? 0 : 1;
			} else if (arg1.method8305()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method8307()) {
				return arg1.method8307() ? 0 : 1;
			} else if (arg1.method8307()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg2.anInt9775;
			local12 = arg1.anInt9775;
			if (arg0) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt9773 - arg1.anInt9773;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIB[BLjava/lang/String;I)I")
	public static int method5198(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(20) int local20 = arg0;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(30) char local30 = arg2.charAt(local22);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg1[local22 + arg3] = (byte) local30;
			} else if (local30 == '€') {
				arg1[arg3 + local22] = -128;
			} else if (local30 == '‚') {
				arg1[arg3 + local22] = -126;
			} else if (local30 == 'ƒ') {
				arg1[local22 + arg3] = -125;
			} else if (local30 == '„') {
				arg1[arg3 + local22] = -124;
			} else if (local30 == '…') {
				arg1[local22 + arg3] = -123;
			} else if (local30 == '†') {
				arg1[local22 + arg3] = -122;
			} else if (local30 == '‡') {
				arg1[arg3 + local22] = -121;
			} else if (local30 == 'ˆ') {
				arg1[arg3 + local22] = -120;
			} else if (local30 == '‰') {
				arg1[local22 + arg3] = -119;
			} else if (local30 == 'Š') {
				arg1[local22 + arg3] = -118;
			} else if (local30 == '‹') {
				arg1[arg3 + local22] = -117;
			} else if (local30 == 'Œ') {
				arg1[arg3 + local22] = -116;
			} else if (local30 == 'Ž') {
				arg1[arg3 + local22] = -114;
			} else if (local30 == '‘') {
				arg1[arg3 + local22] = -111;
			} else if (local30 == '’') {
				arg1[arg3 + local22] = -110;
			} else if (local30 == '“') {
				arg1[arg3 + local22] = -109;
			} else if (local30 == '”') {
				arg1[arg3 + local22] = -108;
			} else if (local30 == '•') {
				arg1[local22 + arg3] = -107;
			} else if (local30 == '–') {
				arg1[arg3 + local22] = -106;
			} else if (local30 == '—') {
				arg1[arg3 + local22] = -105;
			} else if (local30 == '˜') {
				arg1[local22 + arg3] = -104;
			} else if (local30 == '™') {
				arg1[arg3 + local22] = -103;
			} else if (local30 == 'š') {
				arg1[arg3 + local22] = -102;
			} else if (local30 == '›') {
				arg1[arg3 + local22] = -101;
			} else if (local30 == 'œ') {
				arg1[local22 + arg3] = -100;
			} else if (local30 == 'ž') {
				arg1[local22 + arg3] = -98;
			} else if (local30 == 'Ÿ') {
				arg1[arg3 + local22] = -97;
			} else {
				arg1[arg3 + local22] = 63;
			}
		}
		return local20;
	}
}

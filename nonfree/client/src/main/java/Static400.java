import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!mka", name = "c", descriptor = "Z")
	public static boolean aBoolean558;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(IB)Z")
	public static boolean method5897(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(IBI)Z")
	public static boolean method5898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static669.method9119(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static180.method5443(arg0, arg1) | Static401.method5914(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static671.method9143(arg0, arg1) | Static46.method603(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(IIIB[BLjava/lang/String;)I")
	public static int method5899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(24) char local24 = arg3.charAt(local12);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg2[local12 + arg0] = (byte) local24;
			} else if (local24 == '€') {
				arg2[local12 + arg0] = -128;
			} else if (local24 == '‚') {
				arg2[arg0 + local12] = -126;
			} else if (local24 == 'ƒ') {
				arg2[local12 + arg0] = -125;
			} else if (local24 == '„') {
				arg2[arg0 + local12] = -124;
			} else if (local24 == '…') {
				arg2[arg0 + local12] = -123;
			} else if (local24 == '†') {
				arg2[local12 + arg0] = -122;
			} else if (local24 == '‡') {
				arg2[arg0 + local12] = -121;
			} else if (local24 == 'ˆ') {
				arg2[arg0 + local12] = -120;
			} else if (local24 == '‰') {
				arg2[arg0 + local12] = -119;
			} else if (local24 == 'Š') {
				arg2[local12 + arg0] = -118;
			} else if (local24 == '‹') {
				arg2[local12 + arg0] = -117;
			} else if (local24 == 'Œ') {
				arg2[local12 + arg0] = -116;
			} else if (local24 == 'Ž') {
				arg2[arg0 + local12] = -114;
			} else if (local24 == '‘') {
				arg2[local12 + arg0] = -111;
			} else if (local24 == '’') {
				arg2[arg0 + local12] = -110;
			} else if (local24 == '“') {
				arg2[arg0 + local12] = -109;
			} else if (local24 == '”') {
				arg2[local12 + arg0] = -108;
			} else if (local24 == '•') {
				arg2[local12 + arg0] = -107;
			} else if (local24 == '–') {
				arg2[arg0 + local12] = -106;
			} else if (local24 == '—') {
				arg2[local12 + arg0] = -105;
			} else if (local24 == '˜') {
				arg2[local12 + arg0] = -104;
			} else if (local24 == '™') {
				arg2[arg0 + local12] = -103;
			} else if (local24 == 'š') {
				arg2[arg0 + local12] = -102;
			} else if (local24 == '›') {
				arg2[arg0 + local12] = -101;
			} else if (local24 == 'œ') {
				arg2[local12 + arg0] = -100;
			} else if (local24 == 'ž') {
				arg2[arg0 + local12] = -98;
			} else if (local24 == 'Ÿ') {
				arg2[local12 + arg0] = -97;
			} else {
				arg2[arg0 + local12] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Z)I")
	public static int method5900() {
		return Static240.anInt10701 == 1 ? Static368.anInt5900 : 0;
	}
}

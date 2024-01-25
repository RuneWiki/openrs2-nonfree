import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_77 = new Class211(69, -2);

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public static final int anInt3140 = 1406;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZII)I")
	public static int method2545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg2 >> 2 & 0x3F) << 10) + ((arg1 >> 5 << 7) + (arg0 >> 1));
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2546(@OriginalArg(0) String arg0) {
		return Static333.method4458(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;II[BII)I")
	public static int method2548(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = arg3;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(19) char local19 = arg0.charAt(local11);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				arg2[local11 + arg1] = (byte) local19;
			} else if (local19 == '€') {
				arg2[arg1 + local11] = -128;
			} else if (local19 == '‚') {
				arg2[local11 + arg1] = -126;
			} else if (local19 == 'ƒ') {
				arg2[local11 + arg1] = -125;
			} else if (local19 == '„') {
				arg2[local11 + arg1] = -124;
			} else if (local19 == '…') {
				arg2[local11 + arg1] = -123;
			} else if (local19 == '†') {
				arg2[local11 + arg1] = -122;
			} else if (local19 == '‡') {
				arg2[arg1 + local11] = -121;
			} else if (local19 == 'ˆ') {
				arg2[local11 + arg1] = -120;
			} else if (local19 == '‰') {
				arg2[arg1 + local11] = -119;
			} else if (local19 == 'Š') {
				arg2[local11 + arg1] = -118;
			} else if (local19 == '‹') {
				arg2[arg1 + local11] = -117;
			} else if (local19 == 'Œ') {
				arg2[local11 + arg1] = -116;
			} else if (local19 == 'Ž') {
				arg2[arg1 + local11] = -114;
			} else if (local19 == '‘') {
				arg2[local11 + arg1] = -111;
			} else if (local19 == '’') {
				arg2[local11 + arg1] = -110;
			} else if (local19 == '“') {
				arg2[local11 + arg1] = -109;
			} else if (local19 == '”') {
				arg2[arg1 + local11] = -108;
			} else if (local19 == '•') {
				arg2[local11 + arg1] = -107;
			} else if (local19 == '–') {
				arg2[local11 + arg1] = -106;
			} else if (local19 == '—') {
				arg2[local11 + arg1] = -105;
			} else if (local19 == '˜') {
				arg2[arg1 + local11] = -104;
			} else if (local19 == '™') {
				arg2[arg1 + local11] = -103;
			} else if (local19 == 'š') {
				arg2[arg1 + local11] = -102;
			} else if (local19 == '›') {
				arg2[local11 + arg1] = -101;
			} else if (local19 == 'œ') {
				arg2[local11 + arg1] = -100;
			} else if (local19 == 'ž') {
				arg2[local11 + arg1] = -98;
			} else if (local19 == 'Ÿ') {
				arg2[local11 + arg1] = -97;
			} else {
				arg2[arg1 + local11] = 63;
			}
		}
		return local9;
	}
}

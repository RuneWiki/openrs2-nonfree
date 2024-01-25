import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jq", name = "rb", descriptor = "Lclient!ml;")
	public static final Class199 aClass199_6 = new Class199("WTRC", 1);

	@OriginalMember(owner = "client!jq", name = "xb", descriptor = "[I")
	public static final int[] anIntArray309 = new int[4096];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[BILjava/lang/String;II)I")
	public static int method4121(@OriginalArg(1) byte[] arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg1.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg0[arg3 + local12] = (byte) local20;
			} else if (local20 == '€') {
				arg0[local12 + arg3] = -128;
			} else if (local20 == '‚') {
				arg0[local12 + arg3] = -126;
			} else if (local20 == 'ƒ') {
				arg0[arg3 + local12] = -125;
			} else if (local20 == '„') {
				arg0[arg3 + local12] = -124;
			} else if (local20 == '…') {
				arg0[local12 + arg3] = -123;
			} else if (local20 == '†') {
				arg0[local12 + arg3] = -122;
			} else if (local20 == '‡') {
				arg0[arg3 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg0[arg3 + local12] = -120;
			} else if (local20 == '‰') {
				arg0[arg3 + local12] = -119;
			} else if (local20 == 'Š') {
				arg0[local12 + arg3] = -118;
			} else if (local20 == '‹') {
				arg0[local12 + arg3] = -117;
			} else if (local20 == 'Œ') {
				arg0[arg3 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg0[local12 + arg3] = -114;
			} else if (local20 == '‘') {
				arg0[arg3 + local12] = -111;
			} else if (local20 == '’') {
				arg0[arg3 + local12] = -110;
			} else if (local20 == '“') {
				arg0[local12 + arg3] = -109;
			} else if (local20 == '”') {
				arg0[arg3 + local12] = -108;
			} else if (local20 == '•') {
				arg0[arg3 + local12] = -107;
			} else if (local20 == '–') {
				arg0[arg3 + local12] = -106;
			} else if (local20 == '—') {
				arg0[local12 + arg3] = -105;
			} else if (local20 == '˜') {
				arg0[arg3 + local12] = -104;
			} else if (local20 == '™') {
				arg0[local12 + arg3] = -103;
			} else if (local20 == 'š') {
				arg0[local12 + arg3] = -102;
			} else if (local20 == '›') {
				arg0[arg3 + local12] = -101;
			} else if (local20 == 'œ') {
				arg0[arg3 + local12] = -100;
			} else if (local20 == 'ž') {
				arg0[arg3 + local12] = -98;
			} else if (local20 == 'Ÿ') {
				arg0[local12 + arg3] = -97;
			} else {
				arg0[local12 + arg3] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBLclient!gp;I)Lclient!rl;")
	public static Class256 method4123(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(17) byte[] local17 = arg1.method2962(0, arg0);
		return local17 == null ? null : new Class256(local17);
	}
}

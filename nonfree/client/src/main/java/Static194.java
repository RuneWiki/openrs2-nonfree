import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	public static int anInt3515;

	@OriginalMember(owner = "client!gfa", name = "k", descriptor = "Lclient!c;")
	public static Class3_Sub5_Sub4 aClass3_Sub5_Sub4_1;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "Lclient!hja;")
	public static final Class147 aClass147_3 = new Class147();

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "[I")
	public static final int[] anIntArray183 = new int[1000];

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "([BIILjava/lang/String;BI)I")
	public static int method3005(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg3.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg0[arg2 + local12] = (byte) local20;
			} else if (local20 == '€') {
				arg0[local12 + arg2] = -128;
			} else if (local20 == '‚') {
				arg0[arg2 + local12] = -126;
			} else if (local20 == 'ƒ') {
				arg0[local12 + arg2] = -125;
			} else if (local20 == '„') {
				arg0[arg2 + local12] = -124;
			} else if (local20 == '…') {
				arg0[local12 + arg2] = -123;
			} else if (local20 == '†') {
				arg0[arg2 + local12] = -122;
			} else if (local20 == '‡') {
				arg0[local12 + arg2] = -121;
			} else if (local20 == 'ˆ') {
				arg0[arg2 + local12] = -120;
			} else if (local20 == '‰') {
				arg0[local12 + arg2] = -119;
			} else if (local20 == 'Š') {
				arg0[local12 + arg2] = -118;
			} else if (local20 == '‹') {
				arg0[arg2 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg0[arg2 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg0[local12 + arg2] = -114;
			} else if (local20 == '‘') {
				arg0[arg2 + local12] = -111;
			} else if (local20 == '’') {
				arg0[arg2 + local12] = -110;
			} else if (local20 == '“') {
				arg0[local12 + arg2] = -109;
			} else if (local20 == '”') {
				arg0[arg2 + local12] = -108;
			} else if (local20 == '•') {
				arg0[arg2 + local12] = -107;
			} else if (local20 == '–') {
				arg0[arg2 + local12] = -106;
			} else if (local20 == '—') {
				arg0[local12 + arg2] = -105;
			} else if (local20 == '˜') {
				arg0[arg2 + local12] = -104;
			} else if (local20 == '™') {
				arg0[arg2 + local12] = -103;
			} else if (local20 == 'š') {
				arg0[arg2 + local12] = -102;
			} else if (local20 == '›') {
				arg0[arg2 + local12] = -101;
			} else if (local20 == 'œ') {
				arg0[arg2 + local12] = -100;
			} else if (local20 == 'ž') {
				arg0[arg2 + local12] = -98;
			} else if (local20 == 'Ÿ') {
				arg0[local12 + arg2] = -97;
			} else {
				arg0[local12 + arg2] = 63;
			}
		}
		return local10;
	}
}

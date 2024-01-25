import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!va;")
	public static Class4_Sub42 aClass4_Sub42_2;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_152 = new Class22(48, 3);

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	public static int anInt3423 = 0;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_72 = new Class83("M", "M", "M", "M");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;IIII[B)I")
	public static int method2843(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg0.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg3[local12 + arg2] = (byte) local20;
			} else if (local20 == '€') {
				arg3[arg2 + local12] = -128;
			} else if (local20 == '‚') {
				arg3[local12 + arg2] = -126;
			} else if (local20 == 'ƒ') {
				arg3[local12 + arg2] = -125;
			} else if (local20 == '„') {
				arg3[arg2 + local12] = -124;
			} else if (local20 == '…') {
				arg3[local12 + arg2] = -123;
			} else if (local20 == '†') {
				arg3[arg2 + local12] = -122;
			} else if (local20 == '‡') {
				arg3[arg2 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg3[arg2 + local12] = -120;
			} else if (local20 == '‰') {
				arg3[arg2 + local12] = -119;
			} else if (local20 == 'Š') {
				arg3[arg2 + local12] = -118;
			} else if (local20 == '‹') {
				arg3[arg2 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg3[local12 + arg2] = -116;
			} else if (local20 == 'Ž') {
				arg3[local12 + arg2] = -114;
			} else if (local20 == '‘') {
				arg3[local12 + arg2] = -111;
			} else if (local20 == '’') {
				arg3[arg2 + local12] = -110;
			} else if (local20 == '“') {
				arg3[local12 + arg2] = -109;
			} else if (local20 == '”') {
				arg3[local12 + arg2] = -108;
			} else if (local20 == '•') {
				arg3[arg2 + local12] = -107;
			} else if (local20 == '–') {
				arg3[local12 + arg2] = -106;
			} else if (local20 == '—') {
				arg3[arg2 + local12] = -105;
			} else if (local20 == '˜') {
				arg3[local12 + arg2] = -104;
			} else if (local20 == '™') {
				arg3[local12 + arg2] = -103;
			} else if (local20 == 'š') {
				arg3[local12 + arg2] = -102;
			} else if (local20 == '›') {
				arg3[local12 + arg2] = -101;
			} else if (local20 == 'œ') {
				arg3[arg2 + local12] = -100;
			} else if (local20 == 'ž') {
				arg3[local12 + arg2] = -98;
			} else if (local20 == 'Ÿ') {
				arg3[local12 + arg2] = -97;
			} else {
				arg3[local12 + arg2] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z")
	public static boolean method2845(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}

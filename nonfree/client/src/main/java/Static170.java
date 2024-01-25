import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ij", name = "Q", descriptor = "J")
	public static long aLong116;

	@OriginalMember(owner = "client!ij", name = "V", descriptor = "[Lclient!is;")
	public static Class113[] aClass113Array2;

	@OriginalMember(owner = "client!ij", name = "bb", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
	public static int anInt3346 = 0;

	@OriginalMember(owner = "client!ij", name = "Y", descriptor = "[I")
	public static final int[] anIntArray272 = new int[32];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B[Lclient!tf;IIZI)V")
	public static void method2988(@OriginalArg(1) Class240[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(13) Class240 local13 = arg0[local5];
			if (local13 != null && local13.anInt6917 == arg2) {
				Static110.method2180(local13, arg4, arg1, arg3);
				Static184.method3358(arg1, arg4, local13);
				if (local13.anInt6839 - local13.anInt6904 < local13.anInt6897) {
					local13.anInt6897 = local13.anInt6839 - local13.anInt6904;
				}
				if (local13.anInt6897 < 0) {
					local13.anInt6897 = 0;
				}
				if (local13.anInt6845 > local13.anInt6926 - local13.anInt6894) {
					local13.anInt6845 = local13.anInt6926 - local13.anInt6894;
				}
				if (local13.anInt6845 < 0) {
					local13.anInt6845 = 0;
				}
				if (local13.anInt6873 == 0) {
					Static354.method5123(local13, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Z")
	public static boolean method2989() {
		return Static352.anInt6233 > 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(CI)B")
	public static byte method2991(@OriginalArg(0) char arg0) {
		@Pc(25) byte local25;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local25 = (byte) arg0;
		} else if (arg0 == '€') {
			local25 = -128;
		} else if (arg0 == '‚') {
			local25 = -126;
		} else if (arg0 == 'ƒ') {
			local25 = -125;
		} else if (arg0 == '„') {
			local25 = -124;
		} else if (arg0 == '…') {
			local25 = -123;
		} else if (arg0 == '†') {
			local25 = -122;
		} else if (arg0 == '‡') {
			local25 = -121;
		} else if (arg0 == 'ˆ') {
			local25 = -120;
		} else if (arg0 == '‰') {
			local25 = -119;
		} else if (arg0 == 'Š') {
			local25 = -118;
		} else if (arg0 == '‹') {
			local25 = -117;
		} else if (arg0 == 'Œ') {
			local25 = -116;
		} else if (arg0 == 'Ž') {
			local25 = -114;
		} else if (arg0 == '‘') {
			local25 = -111;
		} else if (arg0 == '’') {
			local25 = -110;
		} else if (arg0 == '“') {
			local25 = -109;
		} else if (arg0 == '”') {
			local25 = -108;
		} else if (arg0 == '•') {
			local25 = -107;
		} else if (arg0 == '–') {
			local25 = -106;
		} else if (arg0 == '—') {
			local25 = -105;
		} else if (arg0 == '˜') {
			local25 = -104;
		} else if (arg0 == '™') {
			local25 = -103;
		} else if (arg0 == 'š') {
			local25 = -102;
		} else if (arg0 == '›') {
			local25 = -101;
		} else if (arg0 == 'œ') {
			local25 = -100;
		} else if (arg0 == 'ž') {
			local25 = -98;
		} else if (arg0 == 'Ÿ') {
			local25 = -97;
		} else {
			local25 = 63;
		}
		return local25;
	}
}

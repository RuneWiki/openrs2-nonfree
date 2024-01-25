import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "Lclient!wv;")
	public static Class395 aClass395_4;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_80 = new Class305(72, 3);

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_199 = new Class359(63, 9);

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "Z")
	public static boolean aBoolean732 = false;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "J")
	public static final long aLong242 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([BIILjava/lang/String;II)I")
	public static int method7307(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(17) char local17 = arg2.charAt(local10);
			if (local17 > '\u0000' && local17 < '\u0080' || !(local17 < ' ' || local17 > 'ÿ')) {
				arg0[local10 + arg3] = (byte) local17;
			} else if (local17 == '€') {
				arg0[arg3 + local10] = -128;
			} else if (local17 == '‚') {
				arg0[local10 + arg3] = -126;
			} else if (local17 == 'ƒ') {
				arg0[arg3 + local10] = -125;
			} else if (local17 == '„') {
				arg0[arg3 + local10] = -124;
			} else if (local17 == '…') {
				arg0[local10 + arg3] = -123;
			} else if (local17 == '†') {
				arg0[local10 + arg3] = -122;
			} else if (local17 == '‡') {
				arg0[local10 + arg3] = -121;
			} else if (local17 == 'ˆ') {
				arg0[local10 + arg3] = -120;
			} else if (local17 == '‰') {
				arg0[local10 + arg3] = -119;
			} else if (local17 == 'Š') {
				arg0[local10 + arg3] = -118;
			} else if (local17 == '‹') {
				arg0[arg3 + local10] = -117;
			} else if (local17 == 'Œ') {
				arg0[local10 + arg3] = -116;
			} else if (local17 == 'Ž') {
				arg0[local10 + arg3] = -114;
			} else if (local17 == '‘') {
				arg0[local10 + arg3] = -111;
			} else if (local17 == '’') {
				arg0[arg3 + local10] = -110;
			} else if (local17 == '“') {
				arg0[arg3 + local10] = -109;
			} else if (local17 == '”') {
				arg0[local10 + arg3] = -108;
			} else if (local17 == '•') {
				arg0[local10 + arg3] = -107;
			} else if (local17 == '–') {
				arg0[local10 + arg3] = -106;
			} else if (local17 == '—') {
				arg0[local10 + arg3] = -105;
			} else if (local17 == '˜') {
				arg0[arg3 + local10] = -104;
			} else if (local17 == '™') {
				arg0[arg3 + local10] = -103;
			} else if (local17 == 'š') {
				arg0[arg3 + local10] = -102;
			} else if (local17 == '›') {
				arg0[local10 + arg3] = -101;
			} else if (local17 == 'œ') {
				arg0[local10 + arg3] = -100;
			} else if (local17 == 'ž') {
				arg0[local10 + arg3] = -98;
			} else if (local17 == 'Ÿ') {
				arg0[local10 + arg3] = -97;
			} else {
				arg0[local10 + arg3] = 63;
			}
		}
		return local8;
	}
}

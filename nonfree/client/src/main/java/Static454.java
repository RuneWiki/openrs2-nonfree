import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lclient!qaa;")
	public static Class271 aClass271_4;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
	public static int anInt8653;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIII)Lclient!pa;")
	public static Class112 method6669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 76724863L ^ (long) arg2 * 32147369L ^ (long) arg4 * 475427L ^ (long) arg5 * 67481L ^ (long) arg3 * 97549L ^ (long) arg1 * 986053L;
		@Pc(39) Class112 local39 = (Class112) Static503.aClass167_55.method3966(local33);
		if (local39 == null) {
			local39 = Static25.aClass7_1.method7829(arg5, arg3, arg4, arg1, arg2, arg0);
			Static503.aClass167_55.method3974(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[BIIILjava/lang/String;)I")
	public static int method6672(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg3.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg0[arg2 + local12] = (byte) local20;
			} else if (local20 == '€') {
				arg0[local12 + arg2] = -128;
			} else if (local20 == '‚') {
				arg0[local12 + arg2] = -126;
			} else if (local20 == 'ƒ') {
				arg0[arg2 + local12] = -125;
			} else if (local20 == '„') {
				arg0[local12 + arg2] = -124;
			} else if (local20 == '…') {
				arg0[local12 + arg2] = -123;
			} else if (local20 == '†') {
				arg0[arg2 + local12] = -122;
			} else if (local20 == '‡') {
				arg0[arg2 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg0[arg2 + local12] = -120;
			} else if (local20 == '‰') {
				arg0[local12 + arg2] = -119;
			} else if (local20 == 'Š') {
				arg0[local12 + arg2] = -118;
			} else if (local20 == '‹') {
				arg0[local12 + arg2] = -117;
			} else if (local20 == 'Œ') {
				arg0[arg2 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg0[local12 + arg2] = -114;
			} else if (local20 == '‘') {
				arg0[local12 + arg2] = -111;
			} else if (local20 == '’') {
				arg0[arg2 + local12] = -110;
			} else if (local20 == '“') {
				arg0[local12 + arg2] = -109;
			} else if (local20 == '”') {
				arg0[local12 + arg2] = -108;
			} else if (local20 == '•') {
				arg0[arg2 + local12] = -107;
			} else if (local20 == '–') {
				arg0[local12 + arg2] = -106;
			} else if (local20 == '—') {
				arg0[arg2 + local12] = -105;
			} else if (local20 == '˜') {
				arg0[local12 + arg2] = -104;
			} else if (local20 == '™') {
				arg0[arg2 + local12] = -103;
			} else if (local20 == 'š') {
				arg0[arg2 + local12] = -102;
			} else if (local20 == '›') {
				arg0[arg2 + local12] = -101;
			} else if (local20 == 'œ') {
				arg0[local12 + arg2] = -100;
			} else if (local20 == 'ž') {
				arg0[arg2 + local12] = -98;
			} else if (local20 == 'Ÿ') {
				arg0[local12 + arg2] = -97;
			} else {
				arg0[arg2 + local12] = 63;
			}
		}
		return local10;
	}
}

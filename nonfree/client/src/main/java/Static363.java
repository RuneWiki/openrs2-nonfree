import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
	public static int anInt6463;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_130 = new Class92(81, 8);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[BIIILjava/lang/String;)I")
	public static int method5361(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(9) int local9 = arg1;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(19) char local19 = arg3.charAt(local11);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				arg0[local11 + arg2] = (byte) local19;
			} else if (local19 == '€') {
				arg0[arg2 + local11] = -128;
			} else if (local19 == '‚') {
				arg0[arg2 + local11] = -126;
			} else if (local19 == 'ƒ') {
				arg0[arg2 + local11] = -125;
			} else if (local19 == '„') {
				arg0[arg2 + local11] = -124;
			} else if (local19 == '…') {
				arg0[arg2 + local11] = -123;
			} else if (local19 == '†') {
				arg0[local11 + arg2] = -122;
			} else if (local19 == '‡') {
				arg0[arg2 + local11] = -121;
			} else if (local19 == 'ˆ') {
				arg0[arg2 + local11] = -120;
			} else if (local19 == '‰') {
				arg0[arg2 + local11] = -119;
			} else if (local19 == 'Š') {
				arg0[arg2 + local11] = -118;
			} else if (local19 == '‹') {
				arg0[local11 + arg2] = -117;
			} else if (local19 == 'Œ') {
				arg0[local11 + arg2] = -116;
			} else if (local19 == 'Ž') {
				arg0[arg2 + local11] = -114;
			} else if (local19 == '‘') {
				arg0[arg2 + local11] = -111;
			} else if (local19 == '’') {
				arg0[local11 + arg2] = -110;
			} else if (local19 == '“') {
				arg0[arg2 + local11] = -109;
			} else if (local19 == '”') {
				arg0[local11 + arg2] = -108;
			} else if (local19 == '•') {
				arg0[arg2 + local11] = -107;
			} else if (local19 == '–') {
				arg0[arg2 + local11] = -106;
			} else if (local19 == '—') {
				arg0[local11 + arg2] = -105;
			} else if (local19 == '˜') {
				arg0[local11 + arg2] = -104;
			} else if (local19 == '™') {
				arg0[local11 + arg2] = -103;
			} else if (local19 == 'š') {
				arg0[local11 + arg2] = -102;
			} else if (local19 == '›') {
				arg0[local11 + arg2] = -101;
			} else if (local19 == 'œ') {
				arg0[local11 + arg2] = -100;
			} else if (local19 == 'ž') {
				arg0[arg2 + local11] = -98;
			} else if (local19 == 'Ÿ') {
				arg0[arg2 + local11] = -97;
			} else {
				arg0[local11 + arg2] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!um;BLclient!eq;)V")
	public static void method5365(@OriginalArg(2) Class244 arg0, @OriginalArg(4) Class66 arg1) {
		Static173.aClass244_15.method5969();
		if (Static245.aBoolean292) {
			return;
		}
		for (@Pc(20) Class6_Sub32 local20 = (Class6_Sub32) arg0.method5976(); local20 != null; local20 = (Class6_Sub32) arg0.method5964()) {
			@Pc(28) Class260 local28 = Static7.aClass169_6.method3948(local20.anInt5707);
			if (Static224.method3364(local28)) {
				@Pc(42) boolean local42 = Static356.method5276(local28, local20, arg1);
				if (local42) {
					Static317.method1912(local20, arg1, local28);
				}
			}
		}
	}
}

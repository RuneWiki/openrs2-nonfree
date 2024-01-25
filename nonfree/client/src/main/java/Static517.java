import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "Lclient!vj;")
	public static Class305 aClass305_447;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	public static int anInt9160;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "[S")
	public static short[] aShortArray148;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_12 = new Class308(1);

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_13 = new Class308(2);

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_14 = new Class308(4);

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_15 = new Class308(1);

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_16 = new Class308(2);

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_17 = new Class308(4);

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_18 = new Class308(2);

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "Lclient!vp;")
	public static final Class308 aClass308_19 = new Class308(4);

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_134 = new Class252(65, 7);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
	public static int method7910(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(20) int local20 = arg1;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(30) char local30 = arg2.charAt(local22);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg0[arg3 + local22] = (byte) local30;
			} else if (local30 == '€') {
				arg0[local22 + arg3] = -128;
			} else if (local30 == '‚') {
				arg0[arg3 + local22] = -126;
			} else if (local30 == 'ƒ') {
				arg0[arg3 + local22] = -125;
			} else if (local30 == '„') {
				arg0[local22 + arg3] = -124;
			} else if (local30 == '…') {
				arg0[arg3 + local22] = -123;
			} else if (local30 == '†') {
				arg0[local22 + arg3] = -122;
			} else if (local30 == '‡') {
				arg0[arg3 + local22] = -121;
			} else if (local30 == 'ˆ') {
				arg0[local22 + arg3] = -120;
			} else if (local30 == '‰') {
				arg0[arg3 + local22] = -119;
			} else if (local30 == 'Š') {
				arg0[local22 + arg3] = -118;
			} else if (local30 == '‹') {
				arg0[arg3 + local22] = -117;
			} else if (local30 == 'Œ') {
				arg0[arg3 + local22] = -116;
			} else if (local30 == 'Ž') {
				arg0[local22 + arg3] = -114;
			} else if (local30 == '‘') {
				arg0[arg3 + local22] = -111;
			} else if (local30 == '’') {
				arg0[local22 + arg3] = -110;
			} else if (local30 == '“') {
				arg0[arg3 + local22] = -109;
			} else if (local30 == '”') {
				arg0[local22 + arg3] = -108;
			} else if (local30 == '•') {
				arg0[arg3 + local22] = -107;
			} else if (local30 == '–') {
				arg0[arg3 + local22] = -106;
			} else if (local30 == '—') {
				arg0[local22 + arg3] = -105;
			} else if (local30 == '˜') {
				arg0[local22 + arg3] = -104;
			} else if (local30 == '™') {
				arg0[arg3 + local22] = -103;
			} else if (local30 == 'š') {
				arg0[local22 + arg3] = -102;
			} else if (local30 == '›') {
				arg0[local22 + arg3] = -101;
			} else if (local30 == 'œ') {
				arg0[local22 + arg3] = -100;
			} else if (local30 == 'ž') {
				arg0[local22 + arg3] = -98;
			} else if (local30 == 'Ÿ') {
				arg0[arg3 + local22] = -97;
			} else {
				arg0[local22 + arg3] = 63;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I")
	public static int method7911(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method7912(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!dn;IB)Lclient!fc;")
	public static Class96 method7914(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1890(arg1);
		return local13 == null ? null : new Class96(local13);
	}
}

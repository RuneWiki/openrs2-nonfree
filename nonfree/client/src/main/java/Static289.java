import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lclient!vh;")
	public static Class253 aClass253_2;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_1 = new Class20(14, 1);

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!oj", name = "O", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_2 = new Class20(15, 4);

	@OriginalMember(owner = "client!oj", name = "Q", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_3 = new Class20(16, -2);

	@OriginalMember(owner = "client!oj", name = "R", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_4 = new Class20(17, 0);

	@OriginalMember(owner = "client!oj", name = "S", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_5 = new Class20(18, -2);

	@OriginalMember(owner = "client!oj", name = "T", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_6 = new Class20(20, 6);

	@OriginalMember(owner = "client!oj", name = "U", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_7 = new Class20(21, 8);

	@OriginalMember(owner = "client!oj", name = "V", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_8 = new Class20(22, -2);

	@OriginalMember(owner = "client!oj", name = "W", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_9 = new Class20(23, 4);

	@OriginalMember(owner = "client!oj", name = "X", descriptor = "Lclient!ba;")
	public static final Class20 aClass20_10 = new Class20(24, -1);

	@OriginalMember(owner = "client!oj", name = "Z", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_83 = new Class186(45, 0);

	@OriginalMember(owner = "client!oj", name = "ab", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_84 = new Class186(88, -1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method4310(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)Z")
	public static boolean method4312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}

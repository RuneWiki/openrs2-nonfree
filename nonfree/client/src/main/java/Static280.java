import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "Lclient!g;")
	public static Class83 aClass83_98;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_78 = new Class183(3, -1);

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
	public static int anInt5248 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	public static byte[] method4691(@OriginalArg(1) String arg0) {
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

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!ab;)Lclient!ab;")
	public static Class3 method4693(@OriginalArg(1) Class3 arg0) {
		if (arg0.anInt87 != -1) {
			return Static380.method5987(arg0.anInt87);
		}
		@Pc(27) int local27 = arg0.anInt94 >>> 16;
		@Pc(32) Class216 local32 = new Class216(Static273.aClass243_20);
		for (@Pc(37) Class2_Sub26 local37 = (Class2_Sub26) local32.method5412(); local37 != null; local37 = (Class2_Sub26) local32.method5409()) {
			if (local27 == local37.anInt4145) {
				return Static380.method5987((int) local37.aLong213);
			}
		}
		return null;
	}
}

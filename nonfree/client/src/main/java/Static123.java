import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "Lclient!hd;")
	public static Class110 aClass110_6;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_38 = new Class146(26, 8);

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean150 = Boolean.FALSE;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method1734(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZLclient!ya;Lclient!qn;)V")
	public static void method1735(@OriginalArg(1) Class135 arg0, @OriginalArg(2) Class211 arg1) {
		if (Static89.aBoolean120) {
			return;
		}
		arg0.p(0);
		Static65.aClass95_9 = arg0.method5379(Static465.method4474(arg1, Static187.anInt3443));
		Static65.aClass95_9.method5821((Static345.anInt5723 - Static65.aClass95_9.j()) / 2, (Static120.anInt2134 - Static65.aClass95_9.T()) / 2);
		Static223.aClass95_10 = arg0.method5379(Static465.method4474(arg1, Static343.anInt5691));
		Static223.aClass95_10.method5821((Static345.anInt5723 - Static223.aClass95_10.j()) / 2, 18);
		Static89.aBoolean120 = true;
	}
}

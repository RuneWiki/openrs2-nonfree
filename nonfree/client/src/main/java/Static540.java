import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!qh;)Lclient!wo;")
	public static Class364 method7111(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(7) Class364 local7 = new Class364();
		local7.anInt9356 = arg0.method3109();
		local7.aClass3_Sub3_Sub17_1 = Static459.aClass290_1.method6377(local7.anInt9356);
		return local7;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(JI)V")
	public static void method7112(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static92.anInt2289;
		@Pc(15) int local15;
		@Pc(23) int local23;
		if (local7 != Static45.anInt998) {
			local15 = local7 - Static45.anInt998;
			local23 = (int) ((long) local15 * arg0 / 320L);
			if (local15 > 0) {
				if (local23 == 0) {
					local23 = 1;
				} else if (local23 > local15) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = -1;
			} else if (local15 > local23) {
				local23 = local15;
			}
			Static45.anInt998 += local23;
		}
		@Pc(65) int local65 = Static383.anInt6591;
		if (!Static278.aClass3_Sub13_Sub1_1.lb) {
			Static439.aFloat151 += (float) arg0 * Static443.aFloat152 / 40.0F * 8.0F;
			Static527.aFloat183 += Static4.aFloat1 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local65 != Static498.anInt7926) {
			local15 = local65 - Static498.anInt7926;
			local23 = (int) (arg0 * (long) local15 / 320L);
			if (local15 > 0) {
				if (local23 == 0) {
					local23 = 1;
				} else if (local15 < local23) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = -1;
			} else if (local23 < local15) {
				local23 = local15;
			}
			Static498.anInt7926 += local23;
		}
		Static89.method2014();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method7116(@OriginalArg(0) String arg0) {
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
}

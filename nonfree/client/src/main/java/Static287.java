import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_8 = new Class163(4, -1);

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_79 = new Class194(64, -1);

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public static int anInt4470 = 0;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
	public static int anInt4471 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	public static void method3551() {
		@Pc(5) int local5 = 0;
		if (Static216.aClass1_Sub1_1.method3579(Static146.anInt2644)) {
			local5 = 55;
		}
		if (!Static216.aClass1_Sub1_1.aBoolean312) {
			local5 |= 0x40;
		}
		Static168.method3853(local5);
		Static398.aClass256_4.method5775(local5);
		Static306.aClass67_3.method1454(local5);
		Static196.aClass180_1.method3719(local5);
		Static3.aClass203_1.method4364(local5);
		Static140.method2005(local5);
		Static16.method273(local5);
		Static316.method3902(local5);
		Static255.method3303(local5);
		Static338.method4373();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method3553(@OriginalArg(0) String arg0) {
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
}

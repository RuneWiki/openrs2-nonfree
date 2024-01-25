import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "[I")
	public static final int[] anIntArray387 = new int[4];

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
	public static int anInt4640 = 0;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
	public static int anInt4643 = 0;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BC)B")
	public static byte method3522(@OriginalArg(1) char arg0) {
		@Pc(21) byte local21;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local21 = (byte) arg0;
		} else if (arg0 == '€') {
			local21 = -128;
		} else if (arg0 == '‚') {
			local21 = -126;
		} else if (arg0 == 'ƒ') {
			local21 = -125;
		} else if (arg0 == '„') {
			local21 = -124;
		} else if (arg0 == '…') {
			local21 = -123;
		} else if (arg0 == '†') {
			local21 = -122;
		} else if (arg0 == '‡') {
			local21 = -121;
		} else if (arg0 == 'ˆ') {
			local21 = -120;
		} else if (arg0 == '‰') {
			local21 = -119;
		} else if (arg0 == 'Š') {
			local21 = -118;
		} else if (arg0 == '‹') {
			local21 = -117;
		} else if (arg0 == 'Œ') {
			local21 = -116;
		} else if (arg0 == 'Ž') {
			local21 = -114;
		} else if (arg0 == '‘') {
			local21 = -111;
		} else if (arg0 == '’') {
			local21 = -110;
		} else if (arg0 == '“') {
			local21 = -109;
		} else if (arg0 == '”') {
			local21 = -108;
		} else if (arg0 == '•') {
			local21 = -107;
		} else if (arg0 == '–') {
			local21 = -106;
		} else if (arg0 == '—') {
			local21 = -105;
		} else if (arg0 == '˜') {
			local21 = -104;
		} else if (arg0 == '™') {
			local21 = -103;
		} else if (arg0 == 'š') {
			local21 = -102;
		} else if (arg0 == '›') {
			local21 = -101;
		} else if (arg0 == 'œ') {
			local21 = -100;
		} else if (arg0 == 'ž') {
			local21 = -98;
		} else if (arg0 == 'Ÿ') {
			local21 = -97;
		} else {
			local21 = 63;
		}
		return local21;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILclient!tl;)Ljava/lang/String;")
	public static String method3524(@OriginalArg(2) Class4_Sub30 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4844();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt6244 += Static203.aClass68_1.method1588(0, local7, local15, arg0.anInt6244, arg0.aByteArray79);
			return Static166.method2458(local15, 0, local7);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3525(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local8 + local10);
		for (@Pc(52) int local52 = 0; local52 < local8; local52++) {
			@Pc(58) char local58 = arg0.charAt(local52);
			if (local58 == '<') {
				local45.append("<lt>");
			} else if (local58 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local58);
			}
		}
		return local45.toString();
	}
}

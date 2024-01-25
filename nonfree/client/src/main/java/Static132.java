import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(CZ)B")
	public static byte method3029(@OriginalArg(0) char arg0) {
		@Pc(38) byte local38;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local38 = (byte) arg0;
		} else if (arg0 == '€') {
			local38 = -128;
		} else if (arg0 == '‚') {
			local38 = -126;
		} else if (arg0 == 'ƒ') {
			local38 = -125;
		} else if (arg0 == '„') {
			local38 = -124;
		} else if (arg0 == '…') {
			local38 = -123;
		} else if (arg0 == '†') {
			local38 = -122;
		} else if (arg0 == '‡') {
			local38 = -121;
		} else if (arg0 == 'ˆ') {
			local38 = -120;
		} else if (arg0 == '‰') {
			local38 = -119;
		} else if (arg0 == 'Š') {
			local38 = -118;
		} else if (arg0 == '‹') {
			local38 = -117;
		} else if (arg0 == 'Œ') {
			local38 = -116;
		} else if (arg0 == 'Ž') {
			local38 = -114;
		} else if (arg0 == '‘') {
			local38 = -111;
		} else if (arg0 == '’') {
			local38 = -110;
		} else if (arg0 == '“') {
			local38 = -109;
		} else if (arg0 == '”') {
			local38 = -108;
		} else if (arg0 == '•') {
			local38 = -107;
		} else if (arg0 == '–') {
			local38 = -106;
		} else if (arg0 == '—') {
			local38 = -105;
		} else if (arg0 == '˜') {
			local38 = -104;
		} else if (arg0 == '™') {
			local38 = -103;
		} else if (arg0 == 'š') {
			local38 = -102;
		} else if (arg0 == '›') {
			local38 = -101;
		} else if (arg0 == 'œ') {
			local38 = -100;
		} else if (arg0 == 'ž') {
			local38 = -98;
		} else if (arg0 == 'Ÿ') {
			local38 = -97;
		} else {
			local38 = 63;
		}
		return local38;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!ea;)Z")
	public static boolean method3030(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		Static216.aClass30_7.method4652(arg1.anIntArray150[arg0], arg1.anIntArray151[arg0], arg1.anIntArray149[arg0], Static442.anIntArray540);
		@Pc(22) int local22 = Static442.anIntArray540[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray33[arg0] = (short) (Static288.anInt6151 + Static442.anIntArray540[0] * Static390.anInt7498 / local22);
			arg1.aShortArray31[arg0] = (short) (Static360.anInt7140 * Static442.anIntArray540[1] / local22 + Static559.anInt10083);
			arg1.aShortArray32[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public static void method3031() {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			Static403.aBooleanArray18[local15] = true;
		}
	}
}

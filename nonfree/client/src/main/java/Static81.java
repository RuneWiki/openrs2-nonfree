import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
	public static int anInt2136;

	@OriginalMember(owner = "client!cn", name = "U", descriptor = "I")
	public static int anInt2142;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lclient!sl;Z)V")
	public static void method1770(@OriginalArg(0) Class2_Sub17 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static24.anInt502; local9++) {
			@Pc(14) int local14 = arg0.method2853();
			@Pc(18) int local18 = arg0.method2825();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static614.aClass362_Sub1Array2[local14] != null) {
				Static614.aClass362_Sub1Array2[local14].anInt10277 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZC)B")
	public static byte method1771(@OriginalArg(1) char arg0) {
		@Pc(22) byte local22;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local22 = (byte) arg0;
		} else if (arg0 == '€') {
			local22 = -128;
		} else if (arg0 == '‚') {
			local22 = -126;
		} else if (arg0 == 'ƒ') {
			local22 = -125;
		} else if (arg0 == '„') {
			local22 = -124;
		} else if (arg0 == '…') {
			local22 = -123;
		} else if (arg0 == '†') {
			local22 = -122;
		} else if (arg0 == '‡') {
			local22 = -121;
		} else if (arg0 == 'ˆ') {
			local22 = -120;
		} else if (arg0 == '‰') {
			local22 = -119;
		} else if (arg0 == 'Š') {
			local22 = -118;
		} else if (arg0 == '‹') {
			local22 = -117;
		} else if (arg0 == 'Œ') {
			local22 = -116;
		} else if (arg0 == 'Ž') {
			local22 = -114;
		} else if (arg0 == '‘') {
			local22 = -111;
		} else if (arg0 == '’') {
			local22 = -110;
		} else if (arg0 == '“') {
			local22 = -109;
		} else if (arg0 == '”') {
			local22 = -108;
		} else if (arg0 == '•') {
			local22 = -107;
		} else if (arg0 == '–') {
			local22 = -106;
		} else if (arg0 == '—') {
			local22 = -105;
		} else if (arg0 == '˜') {
			local22 = -104;
		} else if (arg0 == '™') {
			local22 = -103;
		} else if (arg0 == 'š') {
			local22 = -102;
		} else if (arg0 == '›') {
			local22 = -101;
		} else if (arg0 == 'œ') {
			local22 = -100;
		} else if (arg0 == 'ž') {
			local22 = -98;
		} else if (arg0 == 'Ÿ') {
			local22 = -97;
		} else {
			local22 = 63;
		}
		return local22;
	}
}

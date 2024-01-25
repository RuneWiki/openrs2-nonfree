import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_22 = new Class238();

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method2507(@OriginalArg(1) Class2_Sub34 arg0) {
		if (arg0.aByteArray77.length - arg0.anInt8188 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method6904();
		if (local18 < 0 || local18 > 1 || arg0.aByteArray77.length - arg0.anInt8188 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method6884();
		if (local45 * 6 > arg0.aByteArray77.length - arg0.anInt8188) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local45; local63++) {
			@Pc(70) int local70 = arg0.method6884();
			@Pc(74) int local74 = arg0.method6865();
			if (Static608.anIntArray246.length > local70 && Static276.aBooleanArray33[local70] && (Static339.aClass128_1.method3293(local70).aChar2 != '1' || local74 >= -1 && local74 <= 1)) {
				Static608.anIntArray246[local70] = local74;
			}
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IC)B")
	public static byte method2512(@OriginalArg(1) char arg0) {
		@Pc(25) byte local25;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local25 = (byte) arg0;
		} else if (arg0 == '€') {
			local25 = -128;
		} else if (arg0 == '‚') {
			local25 = -126;
		} else if (arg0 == 'ƒ') {
			local25 = -125;
		} else if (arg0 == '„') {
			local25 = -124;
		} else if (arg0 == '…') {
			local25 = -123;
		} else if (arg0 == '†') {
			local25 = -122;
		} else if (arg0 == '‡') {
			local25 = -121;
		} else if (arg0 == 'ˆ') {
			local25 = -120;
		} else if (arg0 == '‰') {
			local25 = -119;
		} else if (arg0 == 'Š') {
			local25 = -118;
		} else if (arg0 == '‹') {
			local25 = -117;
		} else if (arg0 == 'Œ') {
			local25 = -116;
		} else if (arg0 == 'Ž') {
			local25 = -114;
		} else if (arg0 == '‘') {
			local25 = -111;
		} else if (arg0 == '’') {
			local25 = -110;
		} else if (arg0 == '“') {
			local25 = -109;
		} else if (arg0 == '”') {
			local25 = -108;
		} else if (arg0 == '•') {
			local25 = -107;
		} else if (arg0 == '–') {
			local25 = -106;
		} else if (arg0 == '—') {
			local25 = -105;
		} else if (arg0 == '˜') {
			local25 = -104;
		} else if (arg0 == '™') {
			local25 = -103;
		} else if (arg0 == 'š') {
			local25 = -102;
		} else if (arg0 == '›') {
			local25 = -101;
		} else if (arg0 == 'œ') {
			local25 = -100;
		} else if (arg0 == 'ž') {
			local25 = -98;
		} else if (arg0 == 'Ÿ') {
			local25 = -97;
		} else {
			local25 = 63;
		}
		return local25;
	}
}

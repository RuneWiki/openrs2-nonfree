import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	public static int anInt3817;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!mo;")
	public static Class143 aClass143_75;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public static volatile int anInt3818 = 0;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Z")
	public static boolean aBoolean242 = true;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(CB)B")
	public static byte method3545(@OriginalArg(0) char arg0) {
		@Pc(31) byte local31;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local31 = (byte) arg0;
		} else if (arg0 == '€') {
			local31 = -128;
		} else if (arg0 == '‚') {
			local31 = -126;
		} else if (arg0 == 'ƒ') {
			local31 = -125;
		} else if (arg0 == '„') {
			local31 = -124;
		} else if (arg0 == '…') {
			local31 = -123;
		} else if (arg0 == '†') {
			local31 = -122;
		} else if (arg0 == '‡') {
			local31 = -121;
		} else if (arg0 == 'ˆ') {
			local31 = -120;
		} else if (arg0 == '‰') {
			local31 = -119;
		} else if (arg0 == 'Š') {
			local31 = -118;
		} else if (arg0 == '‹') {
			local31 = -117;
		} else if (arg0 == 'Œ') {
			local31 = -116;
		} else if (arg0 == 'Ž') {
			local31 = -114;
		} else if (arg0 == '‘') {
			local31 = -111;
		} else if (arg0 == '’') {
			local31 = -110;
		} else if (arg0 == '“') {
			local31 = -109;
		} else if (arg0 == '”') {
			local31 = -108;
		} else if (arg0 == '•') {
			local31 = -107;
		} else if (arg0 == '–') {
			local31 = -106;
		} else if (arg0 == '—') {
			local31 = -105;
		} else if (arg0 == '˜') {
			local31 = -104;
		} else if (arg0 == '™') {
			local31 = -103;
		} else if (arg0 == 'š') {
			local31 = -102;
		} else if (arg0 == '›') {
			local31 = -101;
		} else if (arg0 == 'œ') {
			local31 = -100;
		} else if (arg0 == 'ž') {
			local31 = -98;
		} else if (arg0 == 'Ÿ') {
			local31 = -97;
		} else {
			local31 = 63;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZIIIII)Z")
	public static boolean method3546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(14) int local14 = arg4; local14 <= arg3; local14++) {
			for (@Pc(18) int local18 = arg0; local18 <= arg1; local18++) {
				if (Static134.anIntArrayArray45[local14][local18] == arg2 && Static353.anIntArrayArray97[local14][local18] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}

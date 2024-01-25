import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!qt", name = "Q", descriptor = "[I")
	public static final int[] anIntArray567 = new int[3];

	@OriginalMember(owner = "client!qt", name = "S", descriptor = "I")
	public static final int anInt7322 = 2;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(CI)B")
	public static byte method5971(@OriginalArg(0) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIII)V")
	public static void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static73.anInt1454 = arg2;
		Static159.anInt3262 = arg4;
		Static164.anInt3309 = arg3;
		Static107.anInt2340 = arg1;
		Static484.anInt8947 = arg0;
		if (Static73.anInt1454 >= 100) {
			@Pc(31) int local31 = Static164.anInt3309 * 128 + 64;
			@Pc(37) int local37 = Static484.anInt8947 * 128 + 64;
			@Pc(46) int local46 = Static191.method5464(local31, local37, Static367.anInt6860) - Static159.anInt3262;
			@Pc(51) int local51 = local31 - Static367.anInt6861;
			@Pc(56) int local56 = local46 - Static182.anInt3520;
			@Pc(60) int local60 = local37 - Static364.anInt6817;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local51 * local51));
			Static180.anInt3500 = (int) (Math.atan2((double) local56, (double) local71) * 2607.5945876176133D) & 0x3FFF;
			Static141.anInt2910 = (int) (Math.atan2((double) local51, (double) local60) * -2607.5945876176133D) & 0x3FFF;
			Static530.anInt8939 = 0;
			if (Static180.anInt3500 < 1024) {
				Static180.anInt3500 = 1024;
			}
			if (Static180.anInt3500 > 3072) {
				Static180.anInt3500 = 3072;
			}
		}
		Static166.anInt3343 = 2;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
	public static void method5973() {
		if (Static118.anInt2542 == 6) {
			Static118.anInt2542 = 7;
		}
	}
}

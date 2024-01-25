import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
	public static int anInt5823;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	public static int anInt5824;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_151 = new Class158("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_81 = new Class177(70, -1);

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)Z")
	public static boolean method4461(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBIII)V")
	public static void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - arg3;
		@Pc(13) int local13 = arg1 - arg2;
		if (local8 == 0) {
			if (local13 != 0) {
				Static370.method5158(arg2, arg1, arg0, arg3);
			}
		} else if (local13 == 0) {
			Static432.method5786(arg3, arg4, arg0, arg2);
		} else {
			@Pc(44) int local44 = (local13 << 12) / local8;
			@Pc(53) int local53 = arg2 - (local44 * arg3 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (Static105.anInt2417 > arg3) {
				local73 = local53 + (Static105.anInt2417 * local44 >> 12);
				local75 = Static105.anInt2417;
			} else if (Static70.anInt1843 >= arg3) {
				local73 = arg2;
				local75 = arg3;
			} else {
				local75 = Static70.anInt1843;
				local73 = local53 + (Static70.anInt1843 * local44 >> 12);
			}
			@Pc(110) int local110;
			@Pc(118) int local118;
			if (arg4 < Static105.anInt2417) {
				local110 = Static105.anInt2417;
				local118 = local53 + (Static105.anInt2417 * local44 >> 12);
			} else if (arg4 > Static70.anInt1843) {
				local110 = Static70.anInt1843;
				local118 = (local44 * Static70.anInt1843 >> 12) + local53;
			} else {
				local118 = arg1;
				local110 = arg4;
			}
			if (local73 < Static362.anInt6654) {
				local75 = (Static362.anInt6654 - local53 << 12) / local44;
				local73 = Static362.anInt6654;
			} else if (Static164.anInt6595 < local73) {
				local75 = (Static164.anInt6595 - local53 << 12) / local44;
				local73 = Static164.anInt6595;
			}
			if (Static362.anInt6654 > local118) {
				local110 = (Static362.anInt6654 - local53 << 12) / local44;
				local118 = Static362.anInt6654;
			} else if (local118 > Static164.anInt6595) {
				local110 = (Static164.anInt6595 - local53 << 12) / local44;
				local118 = Static164.anInt6595;
			}
			Static217.method3382(local75, local118, local110, arg0, local73);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method4464(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(12) int local12 = arg2.indexOf(arg0); local12 != -1; local12 = arg2.indexOf(arg0, local12 + arg1.length())) {
			arg2 = arg2.substring(0, local12) + arg1 + arg2.substring(arg0.length() + local12);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I[BIII)I")
	public static int method4465(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = arg3;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(26) char local26 = arg0.charAt(local19);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				arg1[local19 + arg2] = (byte) local26;
			} else if (local26 == '€') {
				arg1[arg2 + local19] = -128;
			} else if (local26 == '‚') {
				arg1[arg2 + local19] = -126;
			} else if (local26 == 'ƒ') {
				arg1[arg2 + local19] = -125;
			} else if (local26 == '„') {
				arg1[local19 + arg2] = -124;
			} else if (local26 == '…') {
				arg1[arg2 + local19] = -123;
			} else if (local26 == '†') {
				arg1[arg2 + local19] = -122;
			} else if (local26 == '‡') {
				arg1[arg2 + local19] = -121;
			} else if (local26 == 'ˆ') {
				arg1[local19 + arg2] = -120;
			} else if (local26 == '‰') {
				arg1[arg2 + local19] = -119;
			} else if (local26 == 'Š') {
				arg1[local19 + arg2] = -118;
			} else if (local26 == '‹') {
				arg1[arg2 + local19] = -117;
			} else if (local26 == 'Œ') {
				arg1[arg2 + local19] = -116;
			} else if (local26 == 'Ž') {
				arg1[arg2 + local19] = -114;
			} else if (local26 == '‘') {
				arg1[local19 + arg2] = -111;
			} else if (local26 == '’') {
				arg1[local19 + arg2] = -110;
			} else if (local26 == '“') {
				arg1[arg2 + local19] = -109;
			} else if (local26 == '”') {
				arg1[arg2 + local19] = -108;
			} else if (local26 == '•') {
				arg1[arg2 + local19] = -107;
			} else if (local26 == '–') {
				arg1[arg2 + local19] = -106;
			} else if (local26 == '—') {
				arg1[local19 + arg2] = -105;
			} else if (local26 == '˜') {
				arg1[arg2 + local19] = -104;
			} else if (local26 == '™') {
				arg1[arg2 + local19] = -103;
			} else if (local26 == 'š') {
				arg1[arg2 + local19] = -102;
			} else if (local26 == '›') {
				arg1[local19 + arg2] = -101;
			} else if (local26 == 'œ') {
				arg1[arg2 + local19] = -100;
			} else if (local26 == 'ž') {
				arg1[arg2 + local19] = -98;
			} else if (local26 == 'Ÿ') {
				arg1[arg2 + local19] = -97;
			} else {
				arg1[arg2 + local19] = 63;
			}
		}
		return local7;
	}
}

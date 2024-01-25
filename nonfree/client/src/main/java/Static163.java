import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
	public static int anInt3666 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V")
	public static void method3036(@OriginalArg(1) int arg0) {
		if (Static606.anInt9911 == 1) {
			Static552.anInt9113 = arg0;
		} else if (Static606.anInt9911 == 2) {
			Static451.anInt7928 = arg0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!ud;)Lclient!cn;")
	public static Class57 method3037(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(7) String local7 = arg0.method6903();
		@Pc(14) Class174 local14 = Static534.method7469()[arg0.method6904()];
		@Pc(21) Class176 local21 = Static85.method1548()[arg0.method6904()];
		@Pc(25) int local25 = arg0.method6856();
		@Pc(34) int local34 = arg0.method6856();
		@Pc(38) int local38 = arg0.method6904();
		@Pc(42) int local42 = arg0.method6904();
		@Pc(46) int local46 = arg0.method6904();
		@Pc(50) int local50 = arg0.method6884();
		@Pc(54) int local54 = arg0.method6884();
		@Pc(58) int local58 = arg0.method6865();
		@Pc(62) int local62 = arg0.method6865();
		@Pc(66) int local66 = arg0.method6865();
		return new Class57(local7, local14, local21, local25, local34, local38, local42, local46, local50, local54, local58, local62, local66);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3038(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Z")
	public static boolean method3043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB[BLjava/lang/String;I)I")
	public static int method3044(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(14) int local14 = arg0;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(23) char local23 = arg2.charAt(local16);
			if (local23 > '\u0000' && local23 < '\u0080' || !(local23 < ' ' || local23 > 'ÿ')) {
				arg1[arg3 + local16] = (byte) local23;
			} else if (local23 == '€') {
				arg1[arg3 + local16] = -128;
			} else if (local23 == '‚') {
				arg1[arg3 + local16] = -126;
			} else if (local23 == 'ƒ') {
				arg1[local16 + arg3] = -125;
			} else if (local23 == '„') {
				arg1[local16 + arg3] = -124;
			} else if (local23 == '…') {
				arg1[arg3 + local16] = -123;
			} else if (local23 == '†') {
				arg1[arg3 + local16] = -122;
			} else if (local23 == '‡') {
				arg1[arg3 + local16] = -121;
			} else if (local23 == 'ˆ') {
				arg1[arg3 + local16] = -120;
			} else if (local23 == '‰') {
				arg1[local16 + arg3] = -119;
			} else if (local23 == 'Š') {
				arg1[arg3 + local16] = -118;
			} else if (local23 == '‹') {
				arg1[arg3 + local16] = -117;
			} else if (local23 == 'Œ') {
				arg1[arg3 + local16] = -116;
			} else if (local23 == 'Ž') {
				arg1[local16 + arg3] = -114;
			} else if (local23 == '‘') {
				arg1[arg3 + local16] = -111;
			} else if (local23 == '’') {
				arg1[local16 + arg3] = -110;
			} else if (local23 == '“') {
				arg1[local16 + arg3] = -109;
			} else if (local23 == '”') {
				arg1[arg3 + local16] = -108;
			} else if (local23 == '•') {
				arg1[arg3 + local16] = -107;
			} else if (local23 == '–') {
				arg1[arg3 + local16] = -106;
			} else if (local23 == '—') {
				arg1[arg3 + local16] = -105;
			} else if (local23 == '˜') {
				arg1[local16 + arg3] = -104;
			} else if (local23 == '™') {
				arg1[arg3 + local16] = -103;
			} else if (local23 == 'š') {
				arg1[arg3 + local16] = -102;
			} else if (local23 == '›') {
				arg1[local16 + arg3] = -101;
			} else if (local23 == 'œ') {
				arg1[local16 + arg3] = -100;
			} else if (local23 == 'ž') {
				arg1[arg3 + local16] = -98;
			} else if (local23 == 'Ÿ') {
				arg1[arg3 + local16] = -97;
			} else {
				arg1[arg3 + local16] = 63;
			}
		}
		return local14;
	}
}

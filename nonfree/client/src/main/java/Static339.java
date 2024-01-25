import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	public static int anInt5688;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	public static int anInt5693;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Lclient!uu;")
	public static Class250 aClass250_84;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public static int anInt5690 = 0;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public static int anInt5691 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;IIBI[B)I")
	public static int method4722(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg0.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg3[arg1 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg3[arg1 + local17] = -128;
			} else if (local25 == '‚') {
				arg3[arg1 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg3[local17 + arg1] = -125;
			} else if (local25 == '„') {
				arg3[local17 + arg1] = -124;
			} else if (local25 == '…') {
				arg3[local17 + arg1] = -123;
			} else if (local25 == '†') {
				arg3[local17 + arg1] = -122;
			} else if (local25 == '‡') {
				arg3[arg1 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg3[arg1 + local17] = -120;
			} else if (local25 == '‰') {
				arg3[arg1 + local17] = -119;
			} else if (local25 == 'Š') {
				arg3[arg1 + local17] = -118;
			} else if (local25 == '‹') {
				arg3[arg1 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg3[local17 + arg1] = -116;
			} else if (local25 == 'Ž') {
				arg3[local17 + arg1] = -114;
			} else if (local25 == '‘') {
				arg3[arg1 + local17] = -111;
			} else if (local25 == '’') {
				arg3[local17 + arg1] = -110;
			} else if (local25 == '“') {
				arg3[local17 + arg1] = -109;
			} else if (local25 == '”') {
				arg3[local17 + arg1] = -108;
			} else if (local25 == '•') {
				arg3[local17 + arg1] = -107;
			} else if (local25 == '–') {
				arg3[arg1 + local17] = -106;
			} else if (local25 == '—') {
				arg3[local17 + arg1] = -105;
			} else if (local25 == '˜') {
				arg3[local17 + arg1] = -104;
			} else if (local25 == '™') {
				arg3[arg1 + local17] = -103;
			} else if (local25 == 'š') {
				arg3[arg1 + local17] = -102;
			} else if (local25 == '›') {
				arg3[arg1 + local17] = -101;
			} else if (local25 == 'œ') {
				arg3[arg1 + local17] = -100;
			} else if (local25 == 'ž') {
				arg3[local17 + arg1] = -98;
			} else if (local25 == 'Ÿ') {
				arg3[arg1 + local17] = -97;
			} else {
				arg3[local17 + arg1] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V")
	public static void method4724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(12) Class36[] local12 = Static138.aClass36Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class36 local20 = local12[local14];
			if (local20 != null && local20.anInt1123 == 2) {
				Static31.method578(arg2 >> 1, local20.anInt1121, local20.anInt1126, local20.anInt1125 * 2, local20.anInt1120, arg1 >> 1);
				if (Static90.anIntArray75[0] > -1 && Static172.anInt3107 % 20 < 10) {
					Static93.aClass2Array4[local20.anInt1119].method5829(Static90.anIntArray75[0] + arg0 - 12, arg3 + -28 + Static90.anIntArray75[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
	public static void method4725() {
		@Pc(1) Class268 local1 = Static232.aClass268_33;
		synchronized (Static232.aClass268_33) {
			Static232.aClass268_33.method6160();
		}
	}
}

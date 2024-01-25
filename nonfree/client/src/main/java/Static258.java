import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public static int anInt5197;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!uq;")
	public static Class127 aClass127_1;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public static int anInt5208 = 0;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray140 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
	public static int anInt5209 = 2;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I")
	public static int method4489() {
		return Static74.anInt1921;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;[BBII)I")
	public static int method4491(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(9) int local9 = arg0;
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(24) char local24 = arg1.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg2[local16 + arg3] = (byte) local24;
			} else if (local24 == '€') {
				arg2[arg3 + local16] = -128;
			} else if (local24 == '‚') {
				arg2[arg3 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg2[arg3 + local16] = -125;
			} else if (local24 == '„') {
				arg2[arg3 + local16] = -124;
			} else if (local24 == '…') {
				arg2[local16 + arg3] = -123;
			} else if (local24 == '†') {
				arg2[local16 + arg3] = -122;
			} else if (local24 == '‡') {
				arg2[arg3 + local16] = -121;
			} else if (local24 == 'ˆ') {
				arg2[local16 + arg3] = -120;
			} else if (local24 == '‰') {
				arg2[arg3 + local16] = -119;
			} else if (local24 == 'Š') {
				arg2[local16 + arg3] = -118;
			} else if (local24 == '‹') {
				arg2[arg3 + local16] = -117;
			} else if (local24 == 'Œ') {
				arg2[arg3 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg2[arg3 + local16] = -114;
			} else if (local24 == '‘') {
				arg2[local16 + arg3] = -111;
			} else if (local24 == '’') {
				arg2[local16 + arg3] = -110;
			} else if (local24 == '“') {
				arg2[arg3 + local16] = -109;
			} else if (local24 == '”') {
				arg2[arg3 + local16] = -108;
			} else if (local24 == '•') {
				arg2[local16 + arg3] = -107;
			} else if (local24 == '–') {
				arg2[local16 + arg3] = -106;
			} else if (local24 == '—') {
				arg2[arg3 + local16] = -105;
			} else if (local24 == '˜') {
				arg2[local16 + arg3] = -104;
			} else if (local24 == '™') {
				arg2[arg3 + local16] = -103;
			} else if (local24 == 'š') {
				arg2[arg3 + local16] = -102;
			} else if (local24 == '›') {
				arg2[local16 + arg3] = -101;
			} else if (local24 == 'œ') {
				arg2[arg3 + local16] = -100;
			} else if (local24 == 'ž') {
				arg2[local16 + arg3] = -98;
			} else if (local24 == 'Ÿ') {
				arg2[arg3 + local16] = -97;
			} else {
				arg2[arg3 + local16] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!tj;Z)V")
	public static void method4492(@OriginalArg(0) Class193 arg0) {
		Static225.anInt4567 = arg0.method5066("p11_full");
		Static281.anInt5557 = arg0.method5066("p12_full");
		Static97.anInt2524 = arg0.method5066("b12_full");
		Static170.anInt3632 = arg0.method5066("hitmarks");
		Static40.anInt1100 = arg0.method5066("hitbar_default");
		Static166.anInt3582 = arg0.method5066("timerbar_default");
		Static204.anInt4277 = arg0.method5066("headicons_pk");
		Static119.anInt2859 = arg0.method5066("headicons_prayer");
		Static47.anInt1277 = arg0.method5066("hint_headicons");
		Static11.anInt246 = arg0.method5066("hint_mapmarkers");
		Static184.anInt3881 = arg0.method5066("mapflag");
		Static203.anInt4233 = arg0.method5066("cross");
		Static306.anInt5904 = arg0.method5066("mapdots");
		Static254.anInt2747 = arg0.method5066("scrollbar");
		Static48.anInt1290 = arg0.method5066("name_icons");
		Static146.anInt2896 = arg0.method5066("floorshadows");
		Static239.anInt4795 = arg0.method5066("compass");
		Static194.anInt4052 = arg0.method5066("hint_mapedge");
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIII)V")
	public static void method4493(@OriginalArg(0) boolean arg0) {
		Static2.anInt51 = 2;
		Static314.aBoolean451 = arg0;
		Static251.anInt5134 = 22050;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
	public static void method4494() {
		Static244.aClass198_176.method5202(5);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
	public static void method4498() {
		Static183.method3522();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static16.aClass170Array1[local19].method4593();
		}
		Static294.method4911();
		Static33.method566();
		System.gc();
	}
}

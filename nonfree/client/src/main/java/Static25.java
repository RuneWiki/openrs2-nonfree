import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public static int anInt475;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "[I")
	public static final int[] anIntArray36 = new int[500];

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	public static int anInt481 = 0;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	public static final int[] anIntArray37 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
	public static void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static441.method6337(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg4;
		@Pc(27) int local27 = -arg4;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static503.anIntArrayArray12[arg3];
		@Pc(49) int local49 = arg1 - local15;
		@Pc(53) int local53 = arg1 + local15;
		Static455.method6536(local49, arg1 - arg4, arg2, local44);
		Static455.method6536(local53, local49, arg0, local44);
		Static455.method6536(arg4 + arg1, local53, arg2, local44);
		while (local10 < local24) {
			local34 += 2;
			local40 += 2;
			local32 += local40;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static305.anIntArray471[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(129) int[] local129;
			@Pc(135) int[] local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(183) int local183;
			@Pc(187) int local187;
			@Pc(192) int local192;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local15 <= local24) {
					local129 = Static503.anIntArrayArray12[arg3 + local24];
					local135 = Static503.anIntArrayArray12[arg3 - local24];
					local139 = local10 + arg1;
					local144 = arg1 - local10;
					Static455.method6536(local139, local144, arg2, local129);
					Static455.method6536(local139, local144, arg2, local135);
				} else {
					local129 = Static503.anIntArrayArray12[local24 + arg3];
					local135 = Static503.anIntArrayArray12[arg3 - local24];
					local139 = Static305.anIntArray471[local24];
					local144 = local10 + arg1;
					local183 = arg1 - local10;
					local187 = arg1 + local139;
					local192 = arg1 - local139;
					Static455.method6536(local192, local183, arg2, local129);
					Static455.method6536(local187, local192, arg0, local129);
					Static455.method6536(local144, local187, arg2, local129);
					Static455.method6536(local192, local183, arg2, local135);
					Static455.method6536(local187, local192, arg0, local135);
					Static455.method6536(local144, local187, arg2, local135);
				}
			}
			local129 = Static503.anIntArrayArray12[arg3 + local10];
			local135 = Static503.anIntArrayArray12[arg3 - local10];
			local139 = arg1 + local24;
			local144 = arg1 - local24;
			if (local10 >= local15) {
				Static455.method6536(local139, local144, arg2, local129);
				Static455.method6536(local139, local144, arg2, local135);
			} else {
				local183 = local29 >= local10 ? local29 : Static305.anIntArray471[local10];
				local187 = local183 + arg1;
				local192 = arg1 - local183;
				Static455.method6536(local192, local144, arg2, local129);
				Static455.method6536(local187, local192, arg0, local129);
				Static455.method6536(local139, local187, arg2, local129);
				Static455.method6536(local192, local144, arg2, local135);
				Static455.method6536(local187, local192, arg0, local135);
				Static455.method6536(local139, local187, arg2, local135);
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)[Lclient!nd;")
	public static Class210[] method397() {
		return new Class210[] { Static67.aClass210_1, Static278.aClass210_8, Static80.aClass210_4 };
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIILjava/lang/String;BI)I")
	public static int method398(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg2.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg0[local12 + arg3] = (byte) local20;
			} else if (local20 == '€') {
				arg0[local12 + arg3] = -128;
			} else if (local20 == '‚') {
				arg0[arg3 + local12] = -126;
			} else if (local20 == 'ƒ') {
				arg0[arg3 + local12] = -125;
			} else if (local20 == '„') {
				arg0[local12 + arg3] = -124;
			} else if (local20 == '…') {
				arg0[local12 + arg3] = -123;
			} else if (local20 == '†') {
				arg0[local12 + arg3] = -122;
			} else if (local20 == '‡') {
				arg0[arg3 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg0[arg3 + local12] = -120;
			} else if (local20 == '‰') {
				arg0[arg3 + local12] = -119;
			} else if (local20 == 'Š') {
				arg0[arg3 + local12] = -118;
			} else if (local20 == '‹') {
				arg0[local12 + arg3] = -117;
			} else if (local20 == 'Œ') {
				arg0[arg3 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg0[arg3 + local12] = -114;
			} else if (local20 == '‘') {
				arg0[local12 + arg3] = -111;
			} else if (local20 == '’') {
				arg0[arg3 + local12] = -110;
			} else if (local20 == '“') {
				arg0[arg3 + local12] = -109;
			} else if (local20 == '”') {
				arg0[arg3 + local12] = -108;
			} else if (local20 == '•') {
				arg0[arg3 + local12] = -107;
			} else if (local20 == '–') {
				arg0[local12 + arg3] = -106;
			} else if (local20 == '—') {
				arg0[local12 + arg3] = -105;
			} else if (local20 == '˜') {
				arg0[local12 + arg3] = -104;
			} else if (local20 == '™') {
				arg0[arg3 + local12] = -103;
			} else if (local20 == 'š') {
				arg0[arg3 + local12] = -102;
			} else if (local20 == '›') {
				arg0[local12 + arg3] = -101;
			} else if (local20 == 'œ') {
				arg0[arg3 + local12] = -100;
			} else if (local20 == 'ž') {
				arg0[arg3 + local12] = -98;
			} else if (local20 == 'Ÿ') {
				arg0[local12 + arg3] = -97;
			} else {
				arg0[arg3 + local12] = 63;
			}
		}
		return local10;
	}
}

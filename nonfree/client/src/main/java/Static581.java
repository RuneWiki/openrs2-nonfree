import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Lclient!sba;")
	public static final Class297 aClass297_39 = new Class297(64);

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "[I")
	public static final int[] anIntArray581 = new int[5];

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_323 = new Class123(85, 8);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIII)V")
	public static void method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static47.method1179(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static570.anIntArrayArray100[arg2];
		@Pc(45) int local45 = arg3 - local15;
		Static504.method6755(arg1, local45, local40, arg3 - arg0);
		@Pc(58) int local58 = local15 + arg3;
		Static504.method6755(arg5, local58, local40, local45);
		Static504.method6755(arg1, arg0 + arg3, local40, local58);
		while (local10 < local24) {
			local36 += 2;
			local34 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static33.anIntArray23[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(127) int[] local127;
			@Pc(133) int[] local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(184) int local184;
			@Pc(188) int local188;
			@Pc(192) int local192;
			if (local27 >= 0) {
				local24--;
				if (local15 <= local24) {
					local127 = Static570.anIntArrayArray100[local24 + arg2];
					local133 = Static570.anIntArrayArray100[arg2 - local24];
					local138 = arg3 + local10;
					local143 = arg3 - local10;
					Static504.method6755(arg1, local138, local127, local143);
					Static504.method6755(arg1, local138, local133, local143);
				} else {
					local127 = Static570.anIntArrayArray100[arg2 + local24];
					local133 = Static570.anIntArrayArray100[arg2 - local24];
					local138 = Static33.anIntArray23[local24];
					local143 = local10 + arg3;
					local184 = arg3 - local10;
					local188 = local138 + arg3;
					local192 = arg3 - local138;
					Static504.method6755(arg1, local192, local127, local184);
					Static504.method6755(arg5, local188, local127, local192);
					Static504.method6755(arg1, local143, local127, local188);
					Static504.method6755(arg1, local192, local133, local184);
					Static504.method6755(arg5, local188, local133, local192);
					Static504.method6755(arg1, local143, local133, local188);
				}
				local27 -= local24 << 1;
			}
			local127 = Static570.anIntArrayArray100[arg2 + local10];
			local133 = Static570.anIntArrayArray100[arg2 - local10];
			local138 = local24 + arg3;
			local143 = arg3 - local24;
			if (local10 >= local15) {
				Static504.method6755(arg1, local138, local127, local143);
				Static504.method6755(arg1, local138, local133, local143);
			} else {
				local184 = local10 > local29 ? Static33.anIntArray23[local10] : local29;
				local188 = local184 + arg3;
				local192 = arg3 - local184;
				Static504.method6755(arg1, local192, local127, local143);
				Static504.method6755(arg5, local188, local127, local192);
				Static504.method6755(arg1, local138, local127, local188);
				Static504.method6755(arg1, local192, local133, local143);
				Static504.method6755(arg5, local188, local133, local192);
				Static504.method6755(arg1, local138, local133, local188);
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([BLjava/lang/String;IIBI)I")
	public static int method7906(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[local17 + arg2] = (byte) local25;
			} else if (local25 == '€') {
				arg0[local17 + arg2] = -128;
			} else if (local25 == '‚') {
				arg0[arg2 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg0[arg2 + local17] = -125;
			} else if (local25 == '„') {
				arg0[local17 + arg2] = -124;
			} else if (local25 == '…') {
				arg0[local17 + arg2] = -123;
			} else if (local25 == '†') {
				arg0[arg2 + local17] = -122;
			} else if (local25 == '‡') {
				arg0[local17 + arg2] = -121;
			} else if (local25 == 'ˆ') {
				arg0[local17 + arg2] = -120;
			} else if (local25 == '‰') {
				arg0[local17 + arg2] = -119;
			} else if (local25 == 'Š') {
				arg0[local17 + arg2] = -118;
			} else if (local25 == '‹') {
				arg0[local17 + arg2] = -117;
			} else if (local25 == 'Œ') {
				arg0[local17 + arg2] = -116;
			} else if (local25 == 'Ž') {
				arg0[local17 + arg2] = -114;
			} else if (local25 == '‘') {
				arg0[arg2 + local17] = -111;
			} else if (local25 == '’') {
				arg0[arg2 + local17] = -110;
			} else if (local25 == '“') {
				arg0[arg2 + local17] = -109;
			} else if (local25 == '”') {
				arg0[local17 + arg2] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg2] = -107;
			} else if (local25 == '–') {
				arg0[arg2 + local17] = -106;
			} else if (local25 == '—') {
				arg0[arg2 + local17] = -105;
			} else if (local25 == '˜') {
				arg0[arg2 + local17] = -104;
			} else if (local25 == '™') {
				arg0[arg2 + local17] = -103;
			} else if (local25 == 'š') {
				arg0[arg2 + local17] = -102;
			} else if (local25 == '›') {
				arg0[local17 + arg2] = -101;
			} else if (local25 == 'œ') {
				arg0[arg2 + local17] = -100;
			} else if (local25 == 'ž') {
				arg0[local17 + arg2] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local17 + arg2] = -97;
			} else {
				arg0[local17 + arg2] = 63;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZLclient!ri;)Lclient!f;")
	public static Class73 method7907(@OriginalArg(0) int arg0, @OriginalArg(2) Class284 arg1) {
		@Pc(15) Class73 local15 = (Class73) Static116.aClass342_46.method7684((long) arg0);
		if (local15 == null) {
			if (Static579.aBoolean695) {
				local15 = Static319.aClass31_11.method8086(Static607.method8165(arg1, arg0), true);
			} else {
				local15 = Static576.method7814(arg1.method6357(arg0));
			}
			Static116.aClass342_46.method7683(local15, (long) arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZIZ)V")
	public static void method7908(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class3_Sub44 local8 = Static470.method6424(arg1, arg0);
		if (local8 != null) {
			local8.method8128();
		}
	}
}

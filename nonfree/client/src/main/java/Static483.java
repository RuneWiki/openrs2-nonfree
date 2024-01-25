import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "[Lclient!dr;")
	public static Class79[] aClass79Array3;

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
	public static int anInt8395 = 0;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II[I[II)V")
	public static void method7047(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local21;
		@Pc(35) int local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		@Pc(53) int local53 = local21 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg3; local55++) {
			if (arg2[local55] < local21 + (local55 & local53)) {
				@Pc(73) int local73 = arg2[local55];
				arg2[local55] = arg2[local17];
				arg2[local17] = local73;
				@Pc(87) int local87 = arg1[local55];
				arg1[local55] = arg1[local17];
				arg1[local17++] = local87;
			}
		}
		arg2[arg3] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method7047(arg0, arg1, arg2, local17 - 1);
		method7047(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BIIII)V")
	public static void method7048(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static356.anInt6028 = arg1;
		Static280.anInt5114 = 0;
		Static316.anInt6313 = arg0;
		Static85.anInt1313 = 0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BZ)V")
	public static void method7049(@OriginalArg(1) boolean arg0) {
		@Pc(7) Class400[] local7 = Static532.aClass400Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(18) Class400 local18 = local7[local9];
			local18.method9229();
		}
		Static21.method9147();
		Static299.method5787();
		Static362.method7254();
		for (@Pc(33) int local33 = 0; local33 < 4; local33++) {
			Static678.aClass360Array5[local33].method8481();
		}
		Static650.method8735(false);
		System.gc();
		Static503.method7214();
		Static578.aBoolean688 = false;
		Static491.anInt8476 = -1;
		Static203.method3017();
		Static587.method8079(true);
		Static681.method8987(3);
		Static400.method6004();
		Static165.method2648();
		if (arg0) {
			Static638.method8657(13);
			return;
		}
		Static638.method8657(3);
		try {
			Static733.method8728(Static395.anApplet1, "loggedout");
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V")
	public static void method7051() {
		if (Static23.method361(Static178.anInt3225)) {
			if (Static532.aClass400_2.aClass255_2 == null) {
				Static638.method8657(5);
			} else {
				Static638.method8657(7);
			}
		} else if (Static178.anInt3225 == 5 || Static178.anInt3225 == 6) {
			Static638.method8657(3);
		} else if (Static178.anInt3225 == 13) {
			Static638.method8657(3);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
	public static int method7052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) String arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			@Pc(28) char local28 = arg3.charAt(local18);
			if (local28 > '\u0000' && local28 < '\u0080' || !(local28 < ' ' || local28 > 'ÿ')) {
				arg2[arg1 + local18] = (byte) local28;
			} else if (local28 == '€') {
				arg2[local18 + arg1] = -128;
			} else if (local28 == '‚') {
				arg2[arg1 + local18] = -126;
			} else if (local28 == 'ƒ') {
				arg2[arg1 + local18] = -125;
			} else if (local28 == '„') {
				arg2[arg1 + local18] = -124;
			} else if (local28 == '…') {
				arg2[local18 + arg1] = -123;
			} else if (local28 == '†') {
				arg2[arg1 + local18] = -122;
			} else if (local28 == '‡') {
				arg2[local18 + arg1] = -121;
			} else if (local28 == 'ˆ') {
				arg2[local18 + arg1] = -120;
			} else if (local28 == '‰') {
				arg2[arg1 + local18] = -119;
			} else if (local28 == 'Š') {
				arg2[local18 + arg1] = -118;
			} else if (local28 == '‹') {
				arg2[local18 + arg1] = -117;
			} else if (local28 == 'Œ') {
				arg2[arg1 + local18] = -116;
			} else if (local28 == 'Ž') {
				arg2[arg1 + local18] = -114;
			} else if (local28 == '‘') {
				arg2[local18 + arg1] = -111;
			} else if (local28 == '’') {
				arg2[local18 + arg1] = -110;
			} else if (local28 == '“') {
				arg2[arg1 + local18] = -109;
			} else if (local28 == '”') {
				arg2[local18 + arg1] = -108;
			} else if (local28 == '•') {
				arg2[local18 + arg1] = -107;
			} else if (local28 == '–') {
				arg2[arg1 + local18] = -106;
			} else if (local28 == '—') {
				arg2[local18 + arg1] = -105;
			} else if (local28 == '˜') {
				arg2[local18 + arg1] = -104;
			} else if (local28 == '™') {
				arg2[local18 + arg1] = -103;
			} else if (local28 == 'š') {
				arg2[arg1 + local18] = -102;
			} else if (local28 == '›') {
				arg2[arg1 + local18] = -101;
			} else if (local28 == 'œ') {
				arg2[local18 + arg1] = -100;
			} else if (local28 == 'ž') {
				arg2[local18 + arg1] = -98;
			} else if (local28 == 'Ÿ') {
				arg2[local18 + arg1] = -97;
			} else {
				arg2[local18 + arg1] = 63;
			}
		}
		return local10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!qd", name = "fc", descriptor = "I")
	public static int anInt7345;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	public static int anInt7299 = 0;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIII)I")
	public static int method6225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIILjava/lang/String;ZI)I")
	public static int method6235(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		@Pc(9) int local9 = arg3;
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(24) char local24 = arg2.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg0[local16 + arg1] = (byte) local24;
			} else if (local24 == '€') {
				arg0[local16 + arg1] = -128;
			} else if (local24 == '‚') {
				arg0[arg1 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg0[arg1 + local16] = -125;
			} else if (local24 == '„') {
				arg0[local16 + arg1] = -124;
			} else if (local24 == '…') {
				arg0[local16 + arg1] = -123;
			} else if (local24 == '†') {
				arg0[local16 + arg1] = -122;
			} else if (local24 == '‡') {
				arg0[local16 + arg1] = -121;
			} else if (local24 == 'ˆ') {
				arg0[arg1 + local16] = -120;
			} else if (local24 == '‰') {
				arg0[arg1 + local16] = -119;
			} else if (local24 == 'Š') {
				arg0[arg1 + local16] = -118;
			} else if (local24 == '‹') {
				arg0[arg1 + local16] = -117;
			} else if (local24 == 'Œ') {
				arg0[local16 + arg1] = -116;
			} else if (local24 == 'Ž') {
				arg0[local16 + arg1] = -114;
			} else if (local24 == '‘') {
				arg0[local16 + arg1] = -111;
			} else if (local24 == '’') {
				arg0[arg1 + local16] = -110;
			} else if (local24 == '“') {
				arg0[arg1 + local16] = -109;
			} else if (local24 == '”') {
				arg0[arg1 + local16] = -108;
			} else if (local24 == '•') {
				arg0[local16 + arg1] = -107;
			} else if (local24 == '–') {
				arg0[local16 + arg1] = -106;
			} else if (local24 == '—') {
				arg0[arg1 + local16] = -105;
			} else if (local24 == '˜') {
				arg0[local16 + arg1] = -104;
			} else if (local24 == '™') {
				arg0[arg1 + local16] = -103;
			} else if (local24 == 'š') {
				arg0[local16 + arg1] = -102;
			} else if (local24 == '›') {
				arg0[local16 + arg1] = -101;
			} else if (local24 == 'œ') {
				arg0[local16 + arg1] = -100;
			} else if (local24 == 'ž') {
				arg0[local16 + arg1] = -98;
			} else if (local24 == 'Ÿ') {
				arg0[arg1 + local16] = -97;
			} else {
				arg0[arg1 + local16] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLclient!vr;)V")
	public static void method6236(@OriginalArg(1) Class2_Sub52 arg0) {
		if (Static28.aClass53ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface25 local8 = null;
		if (arg0.anInt9837 == 0) {
			local8 = (Interface25) Static166.method1427(arg0.anInt9836, arg0.anInt9843, arg0.anInt9838);
		}
		if (arg0.anInt9837 == 1) {
			local8 = (Interface25) Static330.method5563(arg0.anInt9836, arg0.anInt9843, arg0.anInt9838);
		}
		if (arg0.anInt9837 == 2) {
			local8 = (Interface25) Static245.method3380(arg0.anInt9836, arg0.anInt9843, arg0.anInt9838, vea.class);
		}
		if (arg0.anInt9837 == 3) {
			local8 = (Interface25) Static629.method8438(arg0.anInt9836, arg0.anInt9843, arg0.anInt9838);
		}
		if (local8 == null) {
			arg0.anInt9844 = 0;
			arg0.anInt9841 = -1;
			arg0.anInt9835 = 0;
		} else {
			arg0.anInt9841 = local8.method8425();
			arg0.anInt9844 = local8.method8421();
			arg0.anInt9835 = local8.method8420();
		}
	}
}

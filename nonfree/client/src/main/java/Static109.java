import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fh", name = "vb", descriptor = "Lclient!rp;")
	public static Class223 aClass223_9;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "F")
	public static float aFloat75 = 0.0F;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5003(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIILclient!wg;)V")
	public static void method5014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub3_Sub1_Sub2 arg2) {
		if (arg0 == arg2.anInt7365 && arg0 != -1) {
			@Pc(77) Class119 local77 = Static170.aClass125_3.method2389(arg0);
			@Pc(80) int local80 = local77.anInt3012;
			if (local80 == 1) {
				arg2.anInt7373 = 0;
				arg2.anInt7375 = 0;
				arg2.anInt7382 = 1;
				arg2.anInt7358 = 0;
				arg2.anInt7359 = arg1;
				Static334.method4419(arg2.anInt7339, local77, arg2.aByte99, false, arg2.anInt7375, arg2.anInt7343);
			}
			if (local80 == 2) {
				arg2.anInt7358 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt7365 == -1 || Static170.aClass125_3.method2389(arg0).anInt2999 >= Static170.aClass125_3.method2389(arg2.anInt7365).anInt2999) {
			arg2.anInt7373 = 0;
			arg2.anInt7358 = 0;
			arg2.anInt7359 = arg1;
			arg2.anInt7365 = arg0;
			arg2.anInt7382 = 1;
			arg2.anInt7428 = arg2.anInt7427;
			arg2.anInt7375 = 0;
			if (arg2.anInt7365 != -1) {
				Static334.method4419(arg2.anInt7339, Static170.aClass125_3.method2389(arg2.anInt7365), arg2.aByte99, false, arg2.anInt7375, arg2.anInt7343);
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[BILjava/lang/String;)I")
	public static int method5034(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(9) int local9 = arg2;
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(24) char local24 = arg3.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg1[arg0 + local16] = (byte) local24;
			} else if (local24 == '€') {
				arg1[local16 + arg0] = -128;
			} else if (local24 == '‚') {
				arg1[arg0 + local16] = -126;
			} else if (local24 == 'ƒ') {
				arg1[local16 + arg0] = -125;
			} else if (local24 == '„') {
				arg1[local16 + arg0] = -124;
			} else if (local24 == '…') {
				arg1[arg0 + local16] = -123;
			} else if (local24 == '†') {
				arg1[arg0 + local16] = -122;
			} else if (local24 == '‡') {
				arg1[arg0 + local16] = -121;
			} else if (local24 == 'ˆ') {
				arg1[arg0 + local16] = -120;
			} else if (local24 == '‰') {
				arg1[local16 + arg0] = -119;
			} else if (local24 == 'Š') {
				arg1[local16 + arg0] = -118;
			} else if (local24 == '‹') {
				arg1[arg0 + local16] = -117;
			} else if (local24 == 'Œ') {
				arg1[arg0 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg1[arg0 + local16] = -114;
			} else if (local24 == '‘') {
				arg1[local16 + arg0] = -111;
			} else if (local24 == '’') {
				arg1[local16 + arg0] = -110;
			} else if (local24 == '“') {
				arg1[local16 + arg0] = -109;
			} else if (local24 == '”') {
				arg1[arg0 + local16] = -108;
			} else if (local24 == '•') {
				arg1[local16 + arg0] = -107;
			} else if (local24 == '–') {
				arg1[local16 + arg0] = -106;
			} else if (local24 == '—') {
				arg1[arg0 + local16] = -105;
			} else if (local24 == '˜') {
				arg1[local16 + arg0] = -104;
			} else if (local24 == '™') {
				arg1[local16 + arg0] = -103;
			} else if (local24 == 'š') {
				arg1[arg0 + local16] = -102;
			} else if (local24 == '›') {
				arg1[arg0 + local16] = -101;
			} else if (local24 == 'œ') {
				arg1[arg0 + local16] = -100;
			} else if (local24 == 'ž') {
				arg1[local16 + arg0] = -98;
			} else if (local24 == 'Ÿ') {
				arg1[local16 + arg0] = -97;
			} else {
				arg1[local16 + arg0] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(Z)V")
	public static void method5062() {
		Static119.method4569(10);
		Static360.method4758();
		System.gc();
	}
}

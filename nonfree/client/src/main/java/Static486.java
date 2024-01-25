import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
	public static int anInt8421 = 0;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[6][];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "()V")
	public static void method7255() {
		for (@Pc(1) int local1 = Static132.anInt2524; local1 < Static535.anInt9275; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static544.anInt9353; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static608.anInt10072; local7++) {
					@Pc(16) Class97 local16 = Static272.aClass97ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class20_Sub2_Sub1 local21 = local16.aClass20_Sub2_Sub1_1;
						@Pc(24) Class20_Sub2_Sub1 local24 = local16.aClass20_Sub2_Sub1_2;
						if (local21 != null && local21.method9011()) {
							Static113.method1880(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method9011()) {
								Static113.method1880(local24, local1, local4, local7, 1, 1);
								local24.method9018(local21, false, 0, Static565.aClass100_15, 0, 0);
								local24.method9017();
							}
							local21.method9017();
						}
						for (@Pc(68) Class196 local68 = local16.aClass196_2; local68 != null; local68 = local68.aClass196_3) {
							@Pc(72) Class20_Sub2_Sub2 local72 = local68.aClass20_Sub2_Sub2_1;
							if (local72 != null && local72.method9011()) {
								Static113.method1880(local72, local1, local4, local7, local72.aShort125 + 1 - local72.aShort124, local72.aShort122 - local72.aShort123 + 1);
								local72.method9017();
							}
						}
						@Pc(108) Class20_Sub2_Sub5 local108 = local16.aClass20_Sub2_Sub5_1;
						if (local108 != null && local108.method9011()) {
							Static602.method8461(local108, local1, local4, local7);
							local108.method9017();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIILclient!wh;)Lclient!iba;")
	public static Class3_Sub2_Sub1 method7256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class100_Sub3 arg3) {
		if (arg3.aBoolean709 || Static316.method5292(arg0) && Static316.method5292(arg1)) {
			return new Class3_Sub2_Sub1(arg3, 3553, arg2, arg0, arg1);
		} else if (arg3.aBoolean710) {
			return new Class3_Sub2_Sub1(arg3, 34037, arg2, arg0, arg1);
		} else {
			return new Class3_Sub2_Sub1(arg3, arg2, arg0, arg1, Static567.method8129(arg0), Static567.method8129(arg1));
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III[[[BIIIILclient!ha;IIII)V")
	public static void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg8 == 0 || arg0 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg8 = 1;
			arg4 = arg4 + 1 & 0x3;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg4 = arg4 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg4 = arg4 + 3 & 0x3;
			arg8 = 8;
		}
		arg7.Q(arg11, arg6, arg5, arg9, arg10, arg3, arg2[arg8 - 1][arg4], arg0, arg1);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIII)V")
	public static void method7258(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static197.aByteArrayArrayArray24 = new byte[4][arg1][arg0];
	}
}

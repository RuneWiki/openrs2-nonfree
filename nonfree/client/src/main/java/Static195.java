import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Lclient!ya;")
	public static Class49 aClass49_5;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "[[[Lclient!hg;")
	public static Class106[][][] aClass106ArrayArrayArray2;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
	public static final int[] anIntArray331 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "[I")
	public static int[] anIntArray333 = new int[2];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI[B)[B")
	public static byte[] method3065(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static457.method683(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
	public static void method3066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass3_Sub5_1 != null) {
			local7.aClass3_Sub5_1 = null;
		}
		if (local7.aClass3_Sub5_2 != null) {
			local7.aClass3_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZII)I")
	public static int method3067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(21) int local21 = 128 - arg2;
		@Pc(35) int local35 = local21 * (arg0 & 0x7F) + arg2 * (arg1 & 0x7F) >> 7;
		@Pc(50) int local50 = (arg0 & 0x380) * local21 + arg2 * (arg1 & 0x380) >> 7;
		@Pc(64) int local64 = (arg1 & 0xFC00) * arg2 + (arg0 & 0xFC00) * local21 >> 7;
		return local35 & 0x7F | local64 & 0xFC00 | local50 & 0x380;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
	public static void method3068(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static40.anInt755 = arg0;
		Static159.aString38 = arg1;
		Static217.aString44 = arg2;
		if (Static159.aString38.equals("") || Static217.aString44.equals("")) {
			Static378.anInt6415 = 3;
		} else if (Static375.anInt5832 == -1) {
			Static275.anInt5055 = 1;
			Static378.anInt6415 = -3;
			Static248.anInt4700 = 0;
			Static127.anInt2764 = 0;
			@Pc(44) Class2_Sub23 local44 = new Class2_Sub23(128);
			local44.method5449(10);
			local44.method5506((int) (Math.random() * 9.9999999E7D));
			local44.method5450(Static346.method4767(Static159.aString38));
			local44.method5506((int) (Math.random() * 9.9999999E7D));
			local44.method5496(Static217.aString44);
			local44.method5506((int) (Math.random() * 9.9999999E7D));
			local44.method5510(Static100.aBigInteger2, Static57.aBigInteger1);
			Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
			Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_10.anInt6576);
			Static424.aClass2_Sub23_Sub2_1.method5449(local44.anInt6952 + 2);
			Static424.aClass2_Sub23_Sub2_1.method5502(591);
			Static424.aClass2_Sub23_Sub2_1.method5462(local44.anInt6952, local44.aByteArray130);
		} else {
			Static54.method892();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ya;)V")
	public static void method3069(@OriginalArg(0) Class49 arg0) {
		for (@Pc(1) int local1 = Static190.anInt3695; local1 < Static254.anInt4782; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static42.anInt4340; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static386.anInt6463; local7++) {
					@Pc(16) Class106 local16 = Static440.aClass106ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class3_Sub5 local21 = local16.aClass3_Sub5_1;
						@Pc(24) Class3_Sub5 local24 = local16.aClass3_Sub5_2;
						if (local21 != null && local21.method5135()) {
							Static163.method5142(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5135()) {
								Static163.method5142(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5136(arg0, 0, false, local21, 0, 0);
								local24.method5144();
							}
							local21.method5144();
						}
						for (@Pc(70) Class4 local70 = local16.aClass4_3; local70 != null; local70 = local70.aClass4_1) {
							@Pc(74) Class3_Sub2 local74 = local70.aClass3_Sub2_1;
							if (local74 != null && local74.method5135()) {
								Static163.method5142(arg0, local74, local1, local4, local7, local74.aShort87 + 1 - local74.aShort85, local74.aShort88 - local74.aShort86 + 1);
								local74.method5144();
							}
						}
						@Pc(111) Class3_Sub1 local111 = local16.aClass3_Sub1_2;
						if (local111 != null && local111.method5135()) {
							Static440.method5701(arg0, local111, local1, local4, local7);
							local111.method5144();
						}
					}
				}
			}
		}
	}
}

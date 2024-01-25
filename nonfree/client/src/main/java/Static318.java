import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!l", name = "N", descriptor = "I")
	public static int anInt5441;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	public static void method4869() {
		Static437.aClass100_10.method8591(Static456.aFloat148, Static475.aFloat213, Static369.aFloat134);
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "(I)V")
	public static void method4870(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static549.anInt8710 == 2) {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[0]);
				Static312.aClass291Array1[1].method6563(Static57.aClass287Array1[1]);
			} else if (Static549.anInt8710 == 3) {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[0]);
				Static312.aClass291Array1[1].method6563(Static57.aClass287Array1[1]);
				Static312.aClass291Array1[2].method6563(Static57.aClass287Array1[2]);
			} else {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[0]);
				Static312.aClass291Array1[1].method6563(Static57.aClass287Array1[1]);
				Static312.aClass291Array1[2].method6563(Static57.aClass287Array1[2]);
				Static312.aClass291Array1[3].method6563(Static57.aClass287Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static549.anInt8710 == 2) {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[2]);
			} else if (Static549.anInt8710 == 3) {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[3]);
				Static312.aClass291Array1[1].method6563(Static57.aClass287Array1[4]);
			} else {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[4]);
				Static312.aClass291Array1[1].method6563(Static57.aClass287Array1[5]);
				Static312.aClass291Array1[2].method6563(Static57.aClass287Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static549.anInt8710 == 2) {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[3]);
				return;
			}
			if (Static549.anInt8710 == 3) {
				Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[5]);
				return;
			}
			Static312.aClass291Array1[0].method6563(Static57.aClass287Array1[7]);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)I")
	public static int method4871(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 25) {
			method4871(-42, (byte) 73);
		}
		@Pc(19) byte local19;
		if (arg0 > 12000) {
			local19 = 4;
			Static188.method9006();
		} else if (arg0 > 5000) {
			local19 = 3;
			Static84.method1341();
		} else if (arg0 <= 2000) {
			Static388.method5742();
			local19 = 1;
		} else {
			Static277.method4480();
			local19 = 2;
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != 2) {
			Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 2);
			Static462.method6506(false, 2);
		}
		Static111.method1655();
		return local19;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	public static void method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static655.method9011(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg5;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg4;
		@Pc(23) int local23 = -arg4;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(36) int[] local36 = Static120.anIntArrayArray18[arg0];
		@Pc(40) int local40 = arg1 - local14;
		Static161.method2977(arg1 - arg4, arg2, local40, local36, -121);
		@Pc(52) int local52 = arg1 + local14;
		Static161.method2977(local40, arg3, local52, local36, -123);
		Static161.method2977(local52, arg2, arg1 + arg4, local36, -119);
		while (local10 < local20) {
			local30 += 2;
			local32 += 2;
			local23 += local30;
			local28 += local32;
			if (local28 >= 0 && local25 >= 1) {
				Static352.anIntArray340[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(121) int[] local121;
			@Pc(128) int[] local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(178) int local178;
			@Pc(182) int local182;
			@Pc(187) int local187;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				if (local20 >= local14) {
					local121 = Static120.anIntArrayArray18[local20 + arg0];
					local128 = Static120.anIntArrayArray18[arg0 - local20];
					local133 = arg1 + local10;
					local138 = arg1 - local10;
					Static161.method2977(local138, arg2, local133, local121, -128);
					Static161.method2977(local138, arg2, local133, local128, -116);
				} else {
					local121 = Static120.anIntArrayArray18[arg0 + local20];
					local128 = Static120.anIntArrayArray18[arg0 - local20];
					local133 = Static352.anIntArray340[local20];
					local138 = local10 + arg1;
					local178 = arg1 - local10;
					local182 = local133 + arg1;
					local187 = arg1 - local133;
					Static161.method2977(local178, arg2, local187, local121, -106);
					Static161.method2977(local187, arg3, local182, local121, -124);
					Static161.method2977(local182, arg2, local138, local121, -121);
					Static161.method2977(local178, arg2, local187, local128, -111);
					Static161.method2977(local187, arg3, local182, local128, -118);
					Static161.method2977(local182, arg2, local138, local128, -109);
				}
			}
			local121 = Static120.anIntArrayArray18[arg0 + local10];
			local128 = Static120.anIntArrayArray18[arg0 - local10];
			local133 = arg1 + local20;
			local138 = arg1 - local20;
			if (local14 > local10) {
				local178 = local25 >= local10 ? local25 : Static352.anIntArray340[local10];
				local182 = local178 + arg1;
				local187 = arg1 - local178;
				Static161.method2977(local138, arg2, local187, local121, -123);
				Static161.method2977(local187, arg3, local182, local121, -120);
				Static161.method2977(local182, arg2, local133, local121, -122);
				Static161.method2977(local138, arg2, local187, local128, -110);
				Static161.method2977(local187, arg3, local182, local128, -125);
				Static161.method2977(local182, arg2, local133, local128, -106);
			} else {
				Static161.method2977(local138, arg2, local133, local121, -125);
				Static161.method2977(local138, arg2, local133, local128, -112);
			}
		}
		if (-89 < -117) {
			method4871(-56, (byte) -117);
		}
	}
}

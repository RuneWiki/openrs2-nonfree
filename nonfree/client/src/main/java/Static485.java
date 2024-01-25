import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	public static int anInt8591;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	public static int anInt8586 = -1;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "Z")
	public static boolean aBoolean557 = false;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean558 = true;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IBI)I")
	public static int method6807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!fa;ILclient!oa;IILclient!faa;III)V")
	public static void method6814(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class336 local15 = Static358.aClass320_3.method7209(arg1);
		if (local15 == null || !local15.aBoolean660 || !local15.method7783(Static65.aClass51_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray708 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray708.length];
			@Pc(49) int local49;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static60.anInt1008 == 4) {
					local49 = (int) Static562.aFloat14 & 0x3FFF;
				} else {
					local49 = Static63.anInt1086 + (int) Static562.aFloat14 & 0x3FFF;
				}
				@Pc(60) int local60 = Class22.anIntArray20[local49];
				@Pc(64) int local64 = Class22.anIntArray19[local49];
				if (Static60.anInt1008 != 4) {
					local60 = local60 * 256 / (Static213.anInt4015 + 256);
					local64 = local64 * 256 / (Static213.anInt4015 + 256);
				}
				local33[local35 * 2] = arg5.anInt2690 / 2 + arg6 + (local60 * (local15.anIntArray708[local35 * 2 + 1] * 4 + arg4) + (local15.anIntArray708[local35 * 2] * 4 + arg7) * local64 >> 14);
				local33[local35 * 2 + 1] = arg3 + arg5.anInt2670 / 2 - ((arg4 + local15.anIntArray708[local35 * 2 + 1] * 4) * local64 - local60 * (arg7 + local15.anIntArray708[local35 * 2] * 4) >> 14);
			}
			Static579.method7903(arg2, local33, local15.anInt9771, arg5.anIntArray275, arg5.anIntArray277);
			for (local49 = 0; local49 < local33.length / 2 - 1; local49++) {
				arg2.method7520(local33[local49 * 2], local33[local49 * 2 + 1], local33[(local49 + 1) * 2], local33[(local49 + 1) * 2 + 1], local15.anInt9776, arg0, arg6, arg3);
			}
			arg2.method7520(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt9776, arg0, arg6, arg3);
		}
		@Pc(272) Class71 local272 = null;
		if (local15.anInt9766 != -1) {
			local272 = local15.method7788(false, arg2);
			if (local272 != null) {
				Static509.method5847(arg6, local272, arg7, arg0, arg4, arg5, arg3);
			}
		}
		if (local15.aString89 == null) {
			return;
		}
		local35 = 0;
		if (local272 != null) {
			local35 = local272.b();
		}
		@Pc(306) Class82 local306 = Static266.aClass82_4;
		@Pc(308) Class202 local308 = Static557.aClass202_14;
		if (local15.anInt9762 == 1) {
			local306 = Static75.aClass82_1;
			local308 = Static166.aClass202_9;
		}
		if (local15.anInt9762 == 2) {
			local306 = Static264.aClass82_3;
			local308 = Static479.aClass202_13;
		}
		Static94.method5252(local15.aString89, arg7, local308, local35, local306, arg0, arg4, arg6, local15.anInt9743, arg5, arg3);
		return;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)V")
	public static void method6816() {
		if (Static431.aClass189_2 != null) {
			Static431.aClass189_2.method4941();
		}
		if (Static271.aClass189_1 != null) {
			Static271.aClass189_1.method4941();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I")
	public static int method6818(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!w;III[Z)Z")
	public static boolean method6822(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static205.aClass46Array1 != Static480.aClass46Array2) {
			@Pc(11) int local11 = Static496.aClass46Array4[arg1].sa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class46 local18 = Static496.aClass46Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.sa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method7968(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.aa(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}

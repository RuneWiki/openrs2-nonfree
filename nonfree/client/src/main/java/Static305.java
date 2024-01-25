import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!ph;)I")
	public static int method4244(@OriginalArg(1) Class187 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4282(Static217.anInt4143)) {
			local5++;
		}
		if (arg0.method4282(Static31.anInt521)) {
			local5++;
		}
		if (arg0.method4282(Static157.anInt3177)) {
			local5++;
		}
		if (arg0.method4282(Static142.anInt2891)) {
			local5++;
		}
		if (arg0.method4282(Static211.anInt4098)) {
			local5++;
		}
		if (arg0.method4282(Static265.anInt4700)) {
			local5++;
		}
		if (arg0.method4282(Static63.anInt1162)) {
			local5++;
		}
		if (arg0.method4282(Static352.anInt6041)) {
			local5++;
		}
		if (arg0.method4282(Static13.anInt5111)) {
			local5++;
		}
		if (arg0.method4282(Static254.anInt4573)) {
			local5++;
		}
		if (arg0.method4282(Static15.anInt298)) {
			local5++;
		}
		if (arg0.method4282(Static40.anInt655)) {
			local5++;
		}
		if (arg0.method4282(Static304.anInt5294)) {
			local5++;
		}
		if (arg0.method4282(Static199.anInt4069)) {
			local5++;
		}
		if (arg0.method4282(Static212.anInt4111)) {
			local5++;
		}
		if (arg0.method4282(Static320.anInt5510)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
	public static void method4245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static181.aByteArrayArrayArray15 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIILclient!ta;Lclient!za;Lclient!gh;I)V")
	public static void method4246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) Class50 arg5, @OriginalArg(7) Class89 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class208 local10 = Static300.aClass88_3.method2268(arg7);
		if (local10 == null || !local10.aBoolean389 || !local10.method4759(Static329.aClass201_9)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray574 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray574.length];
			@Pc(44) int local44;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static157.anInt3176 == 4) {
					local44 = (int) Static149.aFloat53 & 0x3FFF;
				} else {
					local44 = Static419.anInt7040 + (int) Static149.aFloat53 & 0x3FFF;
				}
				@Pc(55) int local55 = Class250.anIntArray675[local44];
				@Pc(59) int local59 = Class250.anIntArray674[local44];
				if (Static157.anInt3176 != 4) {
					local55 = local55 * 256 / (Static394.anInt6667 + 256);
					local59 = local59 * 256 / (Static394.anInt6667 + 256);
				}
				local28[local30 * 2] = arg6.anInt2703 / 2 + arg1 + ((arg3 + local10.anIntArray574[local30 * 2] * 4) * local59 + (local10.anIntArray574[local30 * 2 + 1] * 4 + arg0) * local55 >> 15);
				local28[local30 * 2 + 1] = arg6.anInt2682 / 2 + arg2 - ((local10.anIntArray574[local30 * 2 + 1] * 4 + arg0) * local59 - local55 * (arg3 + local10.anIntArray574[local30 * 2] * 4) >> 15);
			}
			Static303.method4220(arg5, local28, local10.anInt6020, arg6.anIntArray272, arg6.anIntArray270);
			for (local44 = 0; local44 < local28.length / 2 - 1; local44++) {
				arg5.method5857(local28[local44 * 2], local28[local44 * 2 + 1], local28[local44 * 2 + 2], local28[(local44 + 1) * 2 + 1], local10.anInt6009, arg4, arg1, arg2);
			}
			arg5.method5857(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt6009, arg4, arg1, arg2);
		}
		@Pc(260) Class80 local260 = null;
		if (local10.anInt6000 != -1) {
			local260 = local10.method4752(false, arg5);
			if (local260 != null) {
				Static201.method3168(arg6, arg2, arg1, arg0, arg3, local260, arg4);
			}
		}
		if (local10.aString55 == null) {
			return;
		}
		local30 = 0;
		if (local260 != null) {
			local30 = local260.ZA();
		}
		@Pc(294) Class57 local294 = Static383.aClass57_5;
		@Pc(296) Class79 local296 = Static38.aClass79_1;
		if (local10.anInt5993 == 1) {
			local294 = Static114.aClass57_4;
			local296 = Static320.aClass79_5;
		}
		if (local10.anInt5993 == 2) {
			local296 = Static450.aClass79_10;
			local294 = Static330.aClass57_3;
		}
		Static59.method1024(arg0, arg4, local296, arg2, arg3, arg1, local30, arg6, local10.anInt5991, local294, local10.aString55);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static432.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static85.anInt7651) {
			return false;
		} else if (local7 == Static85.anInt7651) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static286.anInt5018;
			@Pc(26) int local26 = arg2 << Static286.anInt5018;
			if (Static330.method1920(local22 + 1, Static332.aClass154Array3[arg0].ua(arg1, arg2), local26 + 1) && Static330.method1920(local22 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1 + 1, arg2), local26 + 1) && Static330.method1920(local22 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1 + 1, arg2 + 1), local26 + Static335.anInt5671 - 1) && Static330.method1920(local22 + 1, Static332.aClass154Array3[arg0].ua(arg1, arg2 + 1), local26 + Static335.anInt5671 - 1) && Static330.method1920(local22 + Static437.anInt7214, Static332.aClass154Array3[arg0].ua(arg1, arg2), local26 + 1) && Static330.method1920(local22 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1 + 1, arg2), local26 + Static437.anInt7214) && Static330.method1920(local22 + Static437.anInt7214, Static332.aClass154Array3[arg0].ua(arg1, arg2 + 1), local26 + Static335.anInt5671 - 1) && Static330.method1920(local22 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1, arg2), local26 + Static437.anInt7214) && Static330.method1920(local22 + Static437.anInt7214, Static332.aClass154Array3[arg0].ua(arg1, arg2), local26 + Static437.anInt7214)) {
				Static432.anIntArrayArrayArray8[arg0][arg1][arg2] = Static85.anInt7651;
				return true;
			} else {
				Static432.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static85.anInt7651;
				return false;
			}
		}
	}
}

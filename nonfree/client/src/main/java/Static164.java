import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[5][5000];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIILclient!qm;)V")
	public static void method2494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub6_Sub2 arg2) {
		if (arg0 == arg2.anInt4572 && arg0 != -1) {
			@Pc(22) Class133 local22 = Static262.method4031(arg0);
			@Pc(25) int local25 = local22.anInt4021;
			if (local25 == 1) {
				arg2.anInt4570 = 0;
				arg2.anInt4549 = 1;
				arg2.anInt4516 = 0;
				arg2.anInt4506 = arg1;
				arg2.anInt4557 = 0;
				Static128.method1976(Static28.aClass6_Sub6_Sub2_1 == arg2, local22, arg2.anInt4569, arg2.anInt4570, arg2.anInt4562);
			}
			if (local25 == 2) {
				arg2.anInt4557 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt4572 == -1 || Static262.method4031(arg0).anInt4013 >= Static262.method4031(arg2.anInt4572).anInt4013) {
			arg2.anInt4516 = 0;
			arg2.anInt4581 = arg2.anInt4558;
			arg2.anInt4549 = 1;
			arg2.anInt4506 = arg1;
			arg2.anInt4570 = 0;
			arg2.anInt4572 = arg0;
			arg2.anInt4557 = 0;
			if (arg2.anInt4572 != -1) {
				Static128.method1976(Static28.aClass6_Sub6_Sub2_1 == arg2, Static262.method4031(arg2.anInt4572), arg2.anInt4569, arg2.anInt4570, arg2.anInt4562);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)[Lclient!rg;")
	public static Class48_Sub2[] method2496() {
		@Pc(16) Class48_Sub2[] local16 = new Class48_Sub2[Static105.anInt1963];
		for (@Pc(18) int local18 = 0; local18 < Static105.anInt1963; local18++) {
			local16[local18] = new Class48_Sub2(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local18], Static134.anIntArray306[local18], Static49.anIntArray135[local18], Static113.anIntArray273[local18], Static299.aByteArrayArray15[local18], Static158.anIntArray366);
		}
		Static247.method3867();
		return local16;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public static void method2497() {
		if (Static57.aFloat32 > Static243.aFloat145) {
			Static243.aFloat145 = (float) ((double) Static243.aFloat145 + (double) Static243.aFloat145 / 30.0D);
			if (Static57.aFloat32 < Static243.aFloat145) {
				Static243.aFloat145 = Static57.aFloat32;
			}
			Static125.method1921();
		} else if (Static243.aFloat145 > Static57.aFloat32) {
			Static243.aFloat145 = (float) ((double) Static243.aFloat145 - (double) Static243.aFloat145 / 30.0D);
			if (Static57.aFloat32 > Static243.aFloat145) {
				Static243.aFloat145 = Static57.aFloat32;
			}
			Static125.method1921();
		}
		if (Static269.anInt5391 == -1 || Static274.anInt5464 == -1) {
			return;
		}
		@Pc(65) int local65 = Static269.anInt5391 - Static36.anInt4790;
		if (local65 < 2 || local65 > 2) {
			local65 >>= 0x4;
		}
		@Pc(84) int local84 = Static274.anInt5464 - Static33.anInt717;
		Static36.anInt4790 += local65;
		if (local84 < 2 || local84 > 2) {
			local84 >>= 0x4;
		}
		if (local65 == 0 && local84 == 0) {
			Static274.anInt5464 = -1;
			Static269.anInt5391 = -1;
		}
		Static33.anInt717 += local84;
		Static125.method1921();
	}
}

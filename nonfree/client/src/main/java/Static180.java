import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
	public static int anInt3389;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
	public static int anInt3395;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	public static void method3128() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static339.aClass114Array1[local7] = null;
		}
		if (-107 != -107) {
			anInt3395 = -18;
		}
		Static405.anInt10896 = 0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method3129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg2);
		@Pc(17) int local17 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg1);
		@Pc(23) int local23 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4);
		@Pc(31) int local31 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg5);
		@Pc(42) int local42 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg2 + arg0);
		@Pc(53) int local53 = Static236.method3740(Static319.anInt5445, Static573.anInt8986, arg1 - arg0);
		for (@Pc(55) int local55 = local11; local55 < local42; local55++) {
			Static161.method2977(local23, arg3, local31, Static120.anIntArrayArray18[local55], -125);
		}
		for (@Pc(73) int local73 = local17; local73 > local53; local73--) {
			Static161.method2977(local23, arg3, local31, Static120.anIntArrayArray18[local73], -124);
		}
		@Pc(103) int local103 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 + arg4);
		@Pc(112) int local112 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg5 - arg0);
		for (@Pc(114) int local114 = local42; local114 <= local53; local114++) {
			@Pc(122) int[] local122 = Static120.anIntArrayArray18[local114];
			Static161.method2977(local23, arg3, local103, local122, -120);
			Static161.method2977(local112, arg3, local31, local122, -127);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BIIII)V")
	public static void method3130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static171.anInt5360; local7++) {
			@Pc(13) Rectangle local13 = Class147.aRectangleArray1[local7];
			if (local13.x + local13.width > arg0 && arg0 + arg3 > local13.x && local13.y + local13.height > arg1 && arg2 + arg1 > local13.y) {
				Static528.aBooleanArray23[local7] = true;
			}
		}
		Static395.method5811(arg1, arg3 + arg0, arg2 + arg1, arg0);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIILclient!tda;IIIIIILclient!jk;I)V")
	public static void method3131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class346 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class189 arg9, @OriginalArg(11) int arg10) {
		Static110.anInt9538 = arg8;
		Static405.anInt10900 = arg1;
		Static531.anInt8698 = arg6;
		Static420.aClass362_3 = null;
		Static69.aClass362_1 = null;
		Static375.aClass346_11 = arg3;
		Static341.anInt5702 = arg7;
		Static516.anInt8203 = arg0;
		Static320.anInt5471 = arg2;
		Static288.aClass362_2 = null;
		Static494.anInt7988 = arg4;
		Static194.anInt10628 = arg10;
		Static19.anInt245 = arg5;
		Static237.aClass189_7 = arg9;
		Static108.method1616();
		Static381.aBoolean424 = true;
	}
}

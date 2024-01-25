import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
	public static int anInt5919;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard2;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
	public static int anInt5917 = 2;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Z")
	public static boolean aBoolean526 = true;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BBILclient!je;I)V")
	public static void method5008(@OriginalArg(2) int arg0, @OriginalArg(3) Class1_Sub2_Sub3_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(33) int local33 = Static63.method1316(arg0, Static177.aClass1_Sub2_Sub3_Sub1_1.method5787(), Static17.anIntArray31, 0, Static300.anIntArray460, arg2, 0, Static182.aClass61Array2[arg1.aByte77], 0, -4, true, arg1.anIntArray534[0], 0, arg1.anIntArray535[0]);
		if (local33 >= 1) {
			for (@Pc(41) int local41 = 0; local41 < local33 - 1; local41++) {
				arg1.method2967(Static17.anIntArray31[local41], (byte) 2, Static300.anIntArray460[local41]);
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public static void method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(20) int local20 = -arg3;
		@Pc(22) int local22 = -1;
		Static115.method2278(Static364.anIntArrayArray57[arg0], arg3 + arg1, arg2, arg1 - arg3);
		while (local7 < local9) {
			local22 += 2;
			local7++;
			local20 += local22;
			if (local20 >= 0) {
				local9--;
				local20 -= local9 << 1;
				@Pc(61) int[] local61 = Static364.anIntArrayArray57[local9 + arg0];
				@Pc(68) int[] local68 = Static364.anIntArrayArray57[arg0 - local9];
				@Pc(72) int local72 = arg1 + local7;
				@Pc(77) int local77 = arg1 - local7;
				Static115.method2278(local61, local72, arg2, local77);
				Static115.method2278(local68, local72, arg2, local77);
			}
			@Pc(93) int local93 = local9 + arg1;
			@Pc(97) int local97 = arg1 - local9;
			@Pc(103) int[] local103 = Static364.anIntArrayArray57[local7 + arg0];
			@Pc(110) int[] local110 = Static364.anIntArrayArray57[arg0 - local7];
			Static115.method2278(local103, local93, arg2, local97);
			Static115.method2278(local110, local93, arg2, local97);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lclient!kp;")
	public static Class1_Sub3 method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub3_2;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!ef;)Lclient!j;")
	public static Class18_Sub4 method5012(@OriginalArg(1) Class2_Sub12 arg0) {
		return new Class18_Sub4(arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3163(), arg0.method3124());
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!on;ILclient!on;ZZII)I")
	public static int method5013(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(15) int local15 = Static330.method5385(arg2, arg1, arg0, arg4);
		if (local15 != 0) {
			return arg4 ? -local15 : local15;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static330.method5385(arg2, arg5, arg0, arg3);
			return arg3 ? -local39 : local39;
		}
	}
}

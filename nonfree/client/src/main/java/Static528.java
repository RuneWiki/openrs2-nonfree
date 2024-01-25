import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	public static int anInt8991;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Lclient!vp;")
	public static Class348 aClass348_1 = new Class348();

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
	public static int anInt8988 = -1;

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "[I")
	public static final int[] anIntArray683 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIII)Z")
	public static boolean method7383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static246.method4173(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static41.anInt810;
			@Pc(14) int local14 = arg2 << Static41.anInt810;
			return Static452.method6398(local10 + 1, Static112.aClass16Array3[arg0].JA(arg1, arg2) + arg3, local14 + 1) && Static452.method6398(local10 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1 + 1, arg2) + arg3, local14 + 1) && Static452.method6398(local10 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1 + 1, arg2 + 1) + arg3, local14 + Static514.anInt8839 - 1) && Static452.method6398(local10 + 1, Static112.aClass16Array3[arg0].JA(arg1, arg2 + 1) + arg3, local14 + Static514.anInt8839 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
	public static void method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 + arg5;
		@Pc(14) int local14 = arg3 - arg1;
		for (@Pc(16) int local16 = arg5; local16 < local9; local16++) {
			Static336.method5023(arg0, arg4, Static383.anIntArrayArray62[local16], arg2);
		}
		for (@Pc(32) int local32 = arg3; local32 > local14; local32--) {
			Static336.method5023(arg0, arg4, Static383.anIntArrayArray62[local32], arg2);
		}
		@Pc(56) int local56 = arg1 + arg2;
		@Pc(61) int local61 = arg4 - arg1;
		for (@Pc(63) int local63 = local9; local63 <= local14; local63++) {
			@Pc(69) int[] local69 = Static383.anIntArrayArray62[local63];
			Static336.method5023(arg0, local56, local69, arg2);
			Static336.method5023(arg0, arg4, local69, local61);
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)[Lclient!lj;")
	public static Class210[] method7386() {
		return new Class210[] { Static514.aClass210_13, Static371.aClass210_8, Static444.aClass210_10, Static310.aClass210_7, Static165.aClass210_4, Static27.aClass210_1, Static577.aClass210_14, Static499.aClass210_12, Static94.aClass210_3, Static297.aClass210_5, Static86.aClass210_2, Static463.aClass210_11, Static444.aClass210_9, Static307.aClass210_6 };
	}
}

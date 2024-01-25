import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
	public static int anInt6527;

	@OriginalMember(owner = "client!wn", name = "P", descriptor = "[I")
	public static int[] anIntArray810;

	@OriginalMember(owner = "client!wn", name = "G", descriptor = "[I")
	public static final int[] anIntArray809 = new int[4096];

	@OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
	public static int anInt6534 = 0;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
	public static int anInt6535 = 999999;

	@OriginalMember(owner = "client!wn", name = "V", descriptor = "[Lclient!lo;")
	public static final Class121[] aClass121Array2 = new Class121[14];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5703(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(II)Ljava/lang/String;")
	public static String method5704(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = Static216.method3969(Static291.anInt5657, arg6, Static49.anInt1124);
		@Pc(21) int local21 = Static216.method3969(Static291.anInt5657, arg1, Static49.anInt1124);
		@Pc(27) int local27 = Static216.method3969(Static251.anInt6512, arg4, Static106.anInt2157);
		@Pc(33) int local33 = Static216.method3969(Static251.anInt6512, arg0, Static106.anInt2157);
		@Pc(41) int local41 = Static216.method3969(Static291.anInt5657, arg6 + arg2, Static49.anInt1124);
		@Pc(51) int local51 = Static216.method3969(Static291.anInt5657, arg1 - arg2, Static49.anInt1124);
		for (@Pc(53) int local53 = local15; local53 < local41; local53++) {
			Static97.method1784(local27, Static327.anIntArrayArray63[local53], arg3, local33);
		}
		for (@Pc(73) int local73 = local21; local73 > local51; local73--) {
			Static97.method1784(local27, Static327.anIntArrayArray63[local73], arg3, local33);
		}
		@Pc(95) int local95 = Static216.method3969(Static251.anInt6512, arg2 + arg4, Static106.anInt2157);
		@Pc(104) int local104 = Static216.method3969(Static251.anInt6512, arg0 - arg2, Static106.anInt2157);
		for (@Pc(106) int local106 = local41; local106 <= local51; local106++) {
			@Pc(112) int[] local112 = Static327.anIntArrayArray63[local106];
			Static97.method1784(local27, local112, arg3, local95);
			Static97.method1784(local95, local112, arg5, local104);
			Static97.method1784(local104, local112, arg3, local33);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBIIIII)V")
	public static void method5706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg3) {
			Static207.method3719(arg5, arg6, arg0, arg2, arg4, arg1);
		} else if (arg6 - arg0 >= Static106.anInt2157 && Static251.anInt6512 >= arg0 + arg6 && Static49.anInt1124 <= arg1 - arg3 && arg1 + arg3 <= Static291.anInt5657) {
			Static214.method3950(arg6, arg3, arg2, arg5, arg4, arg1, arg0);
		} else {
			Static186.method3617(arg5, arg1, arg0, arg4, arg2, arg6, arg3);
		}
	}
}

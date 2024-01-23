import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	public static int anInt1325;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int anInt1322 = 50;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "[I")
	public static int[] anIntArray120 = new int[anInt1322];

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_377 = Static184.method2923(":chalreq:");

	@OriginalMember(owner = "client!t", name = "q", descriptor = "[I")
	public static int[] anIntArray121 = new int[anInt1322];

	@OriginalMember(owner = "client!t", name = "r", descriptor = "I")
	public static int anInt1324 = 0;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "[I")
	public static int[] anIntArray122 = new int[anInt1322];

	@OriginalMember(owner = "client!t", name = "t", descriptor = "[I")
	public static int[] anIntArray123 = new int[anInt1322];

	@OriginalMember(owner = "client!t", name = "u", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array17 = new Class41[anInt1322];

	@OriginalMember(owner = "client!t", name = "x", descriptor = "Lclient!i;")
	public static Class41 aClass41_378 = Static184.method2923("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!t", name = "y", descriptor = "[I")
	public static int[] anIntArray124 = new int[anInt1322];

	@OriginalMember(owner = "client!t", name = "z", descriptor = "[I")
	public static int[] anIntArray125 = new int[anInt1322];

	@OriginalMember(owner = "client!t", name = "B", descriptor = "[I")
	public static int[] anIntArray126 = new int[anInt1322];

	@OriginalMember(owner = "client!t", name = "C", descriptor = "I")
	public static int anInt1328 = 0;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V")
	public static void method923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass78_1 = null;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIBIII)V")
	public static void method924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg3 + 1;
		Static204.method3147(arg0, arg4, arg1, Static3.anIntArrayArray1[arg3]);
		@Pc(21) int local21 = arg2 - 1;
		Static204.method3147(arg0, arg4, arg1, Static3.anIntArrayArray1[arg2]);
		for (@Pc(25) int local25 = local12; local25 <= local21; local25++) {
			@Pc(31) int[] local31 = Static3.anIntArrayArray1[local25];
			local31[arg0] = local31[arg1] = arg4;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIIIIZII)Z")
	public static boolean method925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (Static213.aClass12_Sub3_Sub1_1.anInt3932 == 2) {
			return Static94.method1638(arg8, arg10, arg5, arg0, arg4, arg6, arg1, arg3, arg9, arg7, arg2);
		} else if (Static213.aClass12_Sub3_Sub1_1.anInt3932 > 2) {
			return Static214.method3268(arg5, arg3, Static213.aClass12_Sub3_Sub1_1.anInt3932, arg6, arg2, arg4, arg1, arg8, arg10, arg7, arg9, arg0);
		} else {
			return Static86.method1535(arg2, arg6, arg10, arg4, arg3, arg0, arg1, arg5, arg7, arg9, arg8);
		}
	}
}

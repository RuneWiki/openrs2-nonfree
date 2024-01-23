import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
	public static int[] anIntArray18 = new int[64];

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString19 = "Unable to find ";

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)I")
	public static int method286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg1;
			arg1 = local16;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public static void method287(@OriginalArg(1) int arg0) {
		@Pc(4) Class2_Sub3_Sub16 local4 = Static119.method2204(arg0, 1);
		local4.method2719();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public static void method289() {
		Static25.method4642();
		Static183.method3142();
		Static213.method3622();
		Static186.method3172();
		Static281.method4666();
		Static98.method1890();
		Static76.method1380();
		Static13.method292();
		Static265.method4421();
		Static142.method2524();
		Static217.method3666();
		Static170.method2926();
		Static221.method3713();
		Static243.method3059();
		Static75.method1371();
		Static166.method2868();
		Static173.method2983();
		Static110.method2044();
		Static86.method1625();
		Static260.method4336();
		Static75.aClass46_11.method1068(5);
		Static97.aClass46_12.method1068(5);
	}
}

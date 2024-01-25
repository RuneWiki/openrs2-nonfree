import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	public static int anInt6610;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "Lclient!ok;")
	public static Class147 aClass147_9;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Lclient!am;")
	public static Class11 aClass11_149;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
	public static int anInt6606 = -1;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "[S")
	public static final short[] aShortArray114 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
	public static int anInt6613 = 0;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	public static int anInt6617 = -1;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)Z")
	public static boolean method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static284.method4849(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static75.method1392(local10 + 1, Static307.aClass26Array3[arg0].method4996(arg1, arg2) + arg3, local14 + 1) && Static75.method1392(local10 + 128 - 1, Static307.aClass26Array3[arg0].method4996(arg1 + 1, arg2) + arg3, local14 + 1) && Static75.method1392(local10 + 128 - 1, Static307.aClass26Array3[arg0].method4996(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static75.method1392(local10 + 1, Static307.aClass26Array3[arg0].method4996(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(JI)V")
	public static void method5481(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static232.method3958(arg0 - 1L);
			Static232.method3958(1L);
		} else {
			Static232.method3958(arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	public static void method5482() {
		Static218.method3769();
		Static37.method718();
		Static230.method3935();
		Static235.method5581();
		Static126.method2524();
		Static303.method2701();
		Static266.method4649();
		Static297.method5045();
		Static177.method4970();
		Static35.method660();
		Static327.method5372();
		Static298.method5063();
		Static154.method2986();
		Static189.method3434();
		Static156.method3022();
		Static330.method5400();
		Static137.method2728();
		Static72.method1358();
		Static325.method5352();
		Static247.method4273();
		Static129.method2605();
		Static17.method351();
		Static235.method5582();
		Static296.aClass154_90.method4212();
		Static14.aClass154_6.method4212();
		Static46.aClass154_14.method4212();
		Static83.aClass154_27.method4212();
		Static97.aClass154_34.method4212();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!jj;Lclient!jj;IZIZ)I")
	public static int method5483(@OriginalArg(0) int arg0, @OriginalArg(1) Class83_Sub1 arg1, @OriginalArg(2) Class83_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static3.method28(arg4, arg2, arg0, arg1);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = Static3.method28(arg5, arg2, arg3, arg1);
			return arg5 ? -local31 : local31;
		}
	}
}

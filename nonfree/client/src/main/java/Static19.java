import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_121 = Static184.method2923("overlay)3dat");

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(JB)V")
	public static void method344(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static175.method2827(arg0 - 1L);
			Static175.method2827(1L);
		} else {
			Static175.method2827(arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method345(@OriginalArg(1) Class2_Sub6 arg0) {
		if (arg0.aClass2_Sub9_5 != null) {
			arg0.aClass2_Sub9_5.anInt4356 = 0;
		}
		arg0.aBoolean276 = false;
		for (@Pc(23) Class2_Sub6 local23 = arg0.method3091(); local23 != null; local23 = arg0.method3086()) {
			method345(local23);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)[Lclient!rc;")
	public static Class2_Sub2_Sub16[] method346() {
		@Pc(8) Class2_Sub2_Sub16[] local8 = new Class2_Sub2_Sub16[Static154.anInt3619];
		for (@Pc(10) int local10 = 0; local10 < Static154.anInt3619; local10++) {
			@Pc(20) int local20 = Static60.anIntArray498[local10] * Static89.anIntArray224[local10];
			@Pc(23) int[] local23 = new int[local20];
			@Pc(27) byte[] local27 = Static102.aByteArrayArray6[local10];
			for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
				local23[local29] = Static25.anIntArray494[local27[local29] & 0xFF];
			}
			local8[local10] = new Class2_Sub2_Sub16_Sub1(Static14.anInt415, Static114.anInt2772, Static219.anIntArray501[local10], Static120.anIntArray310[local10], Static89.anIntArray224[local10], Static60.anIntArray498[local10], local23);
		}
		Static212.method3255();
		return local8;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIB)V")
	public static void method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg3);
		@Pc(22) int local22 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg0);
		@Pc(28) int local28 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg2);
		@Pc(34) int local34 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4);
		@Pc(42) int local42 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg3 + arg1);
		@Pc(51) int local51 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg0 - arg1);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static204.method3147(local28, arg5, local34, Static3.anIntArrayArray1[local53]);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static204.method3147(local28, arg5, local34, Static3.anIntArrayArray1[local73]);
		}
		@Pc(99) int local99 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 + arg2);
		@Pc(107) int local107 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 - arg1);
		for (@Pc(109) int local109 = local42; local109 <= local51; local109++) {
			@Pc(115) int[] local115 = Static3.anIntArrayArray1[local109];
			Static204.method3147(local28, arg5, local99, local115);
			Static204.method3147(local107, arg5, local34, local115);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public static int method348(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ea;I)Lclient!i;")
	public static Class41 method349(@OriginalArg(0) Class2_Sub3 arg0) {
		return Static68.method1243(arg0);
	}
}

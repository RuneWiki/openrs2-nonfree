import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "[Lclient!vfa;")
	public static Class357[] aClass357Array1;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public static int anInt1784;

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
	public static int anInt1785;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "[Lclient!co;")
	public static Class59[] aClass59Array1 = new Class59[50];

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)V")
	public static void method1651(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static535.aClass156ArrayArrayArray2 = Static573.aClass156ArrayArrayArray3;
			Static299.aClass40Array1 = Static327.aClass40Array2;
		} else {
			Static535.aClass156ArrayArrayArray2 = Static138.aClass156ArrayArrayArray1;
			Static299.aClass40Array1 = Static492.aClass40Array3;
		}
		Static36.anInt662 = Static535.aClass156ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZZLclient!rs;IBLclient!rs;I)I")
	public static int method1653(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class166_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class166_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static431.method798(arg2, arg4, arg1, arg3);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = Static431.method798(arg2, arg4, arg0, arg5);
			return arg0 ? -local35 : local35;
		}
	}
}

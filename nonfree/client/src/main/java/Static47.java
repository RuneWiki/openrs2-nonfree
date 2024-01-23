import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public static int anInt5867;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	public static int anInt5870;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	public static int anInt5866 = 0;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!db;")
	public static Class31 aClass31_45 = new Class31(64);

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt5868 = 64;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public static int anInt5869 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!va;")
	public static Class1_Sub2_Sub20 method4517(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub20 local10 = (Class1_Sub2_Sub20) Static124.aClass64_16.method1471((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static278.aClass7_225.method253(arg0, 11);
		local10 = new Class1_Sub2_Sub20();
		if (local26 != null) {
			local10.method4265(new Class1_Sub18(local26));
		}
		Static124.aClass64_16.method1466(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	public static void method4518(@OriginalArg(0) int arg0) {
		Static188.aClass1_Sub2_Sub13_2 = (Class1_Sub2_Sub13) Static45.aClass22_3.method633((long) arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method4520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}

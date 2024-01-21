import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bi", name = "ab", descriptor = "Lclient!ga;")
	public static Class30 aClass30_9;

	@OriginalMember(owner = "client!bi", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_204 = Static169.method2903("mapfunction");

	@OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
	public static int anInt531 = 0;

	@OriginalMember(owner = "client!bi", name = "hb", descriptor = "[I")
	public static int[] anIntArray74 = new int[50];

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IB)Lclient!ba;")
	public static Class1_Sub1_Sub2 method305(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub2 local6 = (Class1_Sub1_Sub2) Static177.aClass79_29.method2657((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static14.aClass30_8.method1301(5, arg0);
		local6 = new Class1_Sub1_Sub2();
		if (local27 != null) {
			local6.method210(new Class1_Sub8(local27));
		}
		Static177.aClass79_29.method2658((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([Lclient!qh;II[BIII)V")
	public static void method306(@OriginalArg(0) Class69[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg4 > 0 && arg4 + local7 < 103 && arg5 + local11 > 0 && local11 + arg5 < 103) {
						arg0[local3].anIntArrayArray33[local7 + arg4][local11 + arg5] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(88) Class1_Sub8 local88 = new Class1_Sub8(arg2);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
					Static115.method2046(local106 + arg5, local88, 0, arg3, arg1, arg4 + local102, local11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	public static void method307() {
		anIntArray74 = null;
		aClass30_9 = null;
		aClass23_204 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!jd;")
	public static Class61 aClass61_62 = new Class61(4);

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_944 = Static231.method3737("floorshadows");

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
	public static int[] anIntArray309 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_945 = Static231.method3737("Versteckt");

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public static int anInt3539 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILclient!af;IJIIII)Z")
	public static boolean method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static224.method3666(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIIB)V")
	public static void method2605(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1--;
		@Pc(8) int local8 = arg3 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg1 < local11) {
			@Pc(20) int local20 = arg1 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg2;
			arg1 = local50 + 1;
			arg0[arg1] = arg2;
		}
		while (arg1 < local8) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!o;II)V")
	public static void method2606(@OriginalArg(1) int arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static25.anInt490 >= 3) {
			Static205.method3247(arg0, arg2, arg1.anIntArray280, arg1.anIntArray283);
		} else {
			((Class1_Sub2_Sub2_Sub1) Static158.aClass1_Sub2_Sub2_68).method210(arg0, arg2, arg1.anInt3280, arg1.anInt3270, Static158.aClass1_Sub2_Sub2_68.anInt209 / 2, Static158.aClass1_Sub2_Sub2_68.anInt208 / 2, Static79.anInt1741, arg1.anIntArray280, arg1.anIntArray283);
		}
		Static175.aBooleanArray24[arg3] = true;
	}
}

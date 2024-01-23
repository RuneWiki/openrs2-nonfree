import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
	public static int anInt4722;

	@OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
	public static int anInt4727;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1639 = Static200.method3116(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!wg", name = "eb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1641 = Static200.method3116("Please wait)3)3)3");

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1640 = aClass60_1641;

	@OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
	public static int anInt4729 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILclient!f;)V")
	public static void method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class9_Sub4_Sub1 arg2) {
		if (arg1 == arg2.anInt3896 && arg1 != -1) {
			@Pc(90) Class1_Sub1_Sub21 local90 = Static74.method1343(arg1);
			@Pc(93) int local93 = local90.anInt3434;
			if (local93 == 1) {
				arg2.anInt3948 = 0;
				arg2.anInt3906 = arg0;
				arg2.anInt3899 = 0;
				arg2.anInt3924 = 0;
				Static90.method1562(arg2.anInt3925, arg2.anInt3948, arg2 == Static84.aClass9_Sub4_Sub1_2, local90, arg2.anInt3903);
			}
			if (local93 == 2) {
				arg2.anInt3924 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3896 == -1 || Static74.method1343(arg1).anInt3440 >= Static74.method1343(arg2.anInt3896).anInt3440) {
			arg2.anInt3943 = arg2.anInt3946;
			arg2.anInt3906 = arg0;
			arg2.anInt3948 = 0;
			arg2.anInt3924 = 0;
			arg2.anInt3896 = arg1;
			arg2.anInt3899 = 0;
			if (arg2.anInt3896 == -1) {
				return;
			}
			Static90.method1562(arg2.anInt3925, arg2.anInt3948, arg2 == Static84.aClass9_Sub4_Sub1_2, Static74.method1343(arg2.anInt3896), arg2.anInt3903);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)Lclient!bb;")
	public static Class1_Sub1_Sub2 method3519(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = (Class1_Sub1_Sub2) Static45.aClass39_7.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static97.aClass7_19.method3242(16, arg0);
		local10 = new Class1_Sub1_Sub2();
		if (local20 != null) {
			local10.method241(new Class1_Sub9(local20));
		}
		Static45.aClass39_7.method1152((long) arg0, local10);
		return local10;
	}
}

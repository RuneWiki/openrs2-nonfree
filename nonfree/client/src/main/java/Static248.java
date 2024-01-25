import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!iea", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public static void method3935() {
		Static405.aClass102_32 = null;
		Static371.aClass102_24 = null;
		Static454.aClass102_33 = null;
		Static369.aClass102_9 = null;
		Static359.aClass102Array17 = null;
		Static636.aClass102_38 = null;
		Static520.aClass102_31 = null;
		Static606.aClass102_36 = null;
		Static505.aClass102_35 = null;
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(Lclient!fca;I)Lclient!mea;")
	public static Class84_Sub1_Sub1 method3938(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(7) Class84_Sub1 local7 = Static571.method7725(arg0);
		@Pc(11) int local11 = arg0.method4869();
		return new Class84_Sub1_Sub1(local7.aClass92_13, local7.aClass65_17, local7.anInt10347, local7.anInt10345, local7.anInt10343, local7.anInt10342, local7.anInt10344, local7.anInt10346, local7.anInt10349, local7.anInt6458, local7.anInt6450, local7.anInt6451, local7.anInt6449, local7.anInt6453, local7.anInt6452, local11);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)Z")
	public static boolean method3939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static555.method7593(arg1, arg0) || Static179.method2975(arg1, arg0) || Static204.method3247(arg0, arg1);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)Lclient!ufa;")
	public static Class354 method3941(@OriginalArg(0) int arg0) {
		@Pc(10) Class354 local10 = (Class354) Static323.aClass279_32.method6631((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static239.aClass143_59.method3125(arg0, 0);
		local10 = new Class354();
		if (local20 != null) {
			local10.method8008(new Class3_Sub17(local20), arg0);
		}
		Static323.aClass279_32.method6635(local10, (long) arg0);
		return local10;
	}
}

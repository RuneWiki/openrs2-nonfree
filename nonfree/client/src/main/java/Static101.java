import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString58 = "M";

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	public static int anInt1926 = 0;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "[C")
	public static char[] aCharArray7 = new char[128];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg0) {
			Static264.method1814(arg6, arg2, arg3, arg5, arg1, arg4);
		} else if (arg4 - arg3 >= Static245.anInt1237 && Static28.anInt606 >= arg4 + arg3 && Static24.anInt556 <= arg5 - arg0 && Static284.anInt5643 >= arg5 + arg0) {
			Static122.method1909(arg6, arg0, arg3, arg4, arg5, arg2, arg1);
		} else {
			Static205.method3214(arg0, arg3, arg5, arg4, arg6, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
	public static int method1644(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)[Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1[] method1646() {
		@Pc(8) Class1_Sub2_Sub2_Sub1[] local8 = new Class1_Sub2_Sub2_Sub1[Static105.anInt1963];
		for (@Pc(18) int local18 = 0; local18 < Static105.anInt1963; local18++) {
			@Pc(33) int local33 = Static113.anIntArray273[local18] * Static49.anIntArray135[local18];
			@Pc(37) byte[] local37 = Static299.aByteArrayArray15[local18];
			@Pc(40) int[] local40 = new int[local33];
			for (@Pc(42) int local42 = 0; local42 < local33; local42++) {
				local40[local42] = Static158.anIntArray366[local37[local42] & 0xFF];
			}
			local8[local18] = new Class1_Sub2_Sub2_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local18], Static134.anIntArray306[local18], Static49.anIntArray135[local18], Static113.anIntArray273[local18], local40);
		}
		Static247.method3867();
		return local8;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)J")
	public static long method1647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass63_1 == null ? 0L : local7.aClass63_1.aLong55;
	}
}

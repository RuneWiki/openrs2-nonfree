import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "[[Lclient!kd;")
	public static Class1_Sub20[][] aClass1_Sub20ArrayArray1;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	public static int anInt106;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	public static int anInt107;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "[Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1[] aClass1_Sub2_Sub14_Sub1Array1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!e;")
	public static Class1_Sub8 aClass1_Sub8_1 = new Class1_Sub8(0, -1);

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	public static int anInt108 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	public static void method71(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static273.method4577();
		} else if (arg0 == 2) {
			Static183.method3309();
		} else if (arg0 == 3) {
			Static291.method4763();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = arg0 - arg5;
		@Pc(13) int local13 = arg2 - arg7;
		@Pc(22) int local22 = (arg3 - arg6 << 16) / local4;
		@Pc(31) int local31 = (arg4 - arg1 << 16) / local13;
		Static117.method1919(arg2, arg7, arg6, local31, arg1, local22, arg5, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	public static int anInt4845;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	public static int anInt4846;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!ug;")
	public static final Class1_Sub28 aClass1_Sub28_5 = new Class1_Sub28(new byte[5000]);

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean546 = Boolean.FALSE;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZI)I")
	public static int method3786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 / arg2;
		@Pc(18) int local18 = arg2 - 1 & arg0;
		@Pc(22) int local22 = arg1 / arg2;
		@Pc(28) int local28 = arg2 - 1 & arg1;
		@Pc(33) int local33 = Static254.method3662(local12, local22);
		@Pc(40) int local40 = Static254.method3662(local12 + 1, local22);
		@Pc(47) int local47 = Static254.method3662(local12, local22 + 1);
		@Pc(56) int local56 = Static254.method3662(local12 + 1, local22 - -1);
		@Pc(63) int local63 = Static140.method2141(local40, arg2, local33, local18);
		@Pc(70) int local70 = Static140.method2141(local56, arg2, local47, local18);
		return Static140.method2141(local70, arg2, local63, local28);
	}
}

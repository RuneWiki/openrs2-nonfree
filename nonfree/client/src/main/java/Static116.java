import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
	public static int anInt3312;

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
	public static int anInt3315;

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "Lclient!kia;")
	public static final Class201 aClass201_5 = new Class201("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
	public static int anInt3318 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[IILclient!ffa;[I)Lclient!tc;")
	public static Class1_Sub2 method2923(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class57_Sub2 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg0];
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg1[local12] + local12 * arg2;
			for (@Pc(24) int local24 = 0; local24 < arg4[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class1_Sub2(arg3, arg2, arg0, local10);
	}
}

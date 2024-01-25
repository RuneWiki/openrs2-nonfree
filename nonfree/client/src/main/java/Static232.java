import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBI)V")
	public static void method3612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub5_Sub13 local15 = Static208.method3306(arg1, 5);
		local15.method4547();
		local15.anInt5641 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
	public static boolean method3613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static37.method605(arg0, arg1) | (arg1 & 0x2000) != 0 | Static374.method5050(arg1, arg0)) & Static83.method1622(arg1, arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V")
	public static void method3614(@OriginalArg(1) int arg0) {
		Static216.anInt6006 = 1000 / arg0;
	}
}

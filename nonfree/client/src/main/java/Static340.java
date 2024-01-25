import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!od", name = "u", descriptor = "I")
	public static int anInt6354;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	public static int anInt6358;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	public static int anInt6357 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)V")
	public static void method5510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(9, arg1);
		local12.method4919();
		local12.anInt5680 = arg0;
		local12.anInt5686 = arg2;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IC)Z")
	public static boolean method5511(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}

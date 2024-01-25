import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	public static int anInt7729;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static final int anInt7726 = 1406;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	public static void method6423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub11 local15 = Static541.method7520(16, arg1);
		local15.method4946();
		local15.anInt5822 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Z")
	public static boolean method6426(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}

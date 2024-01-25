import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public static int anInt5901;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
	public static final boolean aBoolean442 = false;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Z")
	public static boolean method4909(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(21) Class350 local21 = Static619.aClass281_4.method6734(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local21.method8087(arg1);
	}
}

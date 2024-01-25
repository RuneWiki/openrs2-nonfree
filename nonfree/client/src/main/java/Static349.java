import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	public static int anInt6186 = 0;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public static void method5088() {
		for (@Pc(10) Class4_Sub36 local10 = (Class4_Sub36) Static190.aClass91_25.method2584(); local10 != null; local10 = (Class4_Sub36) Static190.aClass91_25.method2586()) {
			if (local10.anInt6584 == -1) {
				local10.anInt6596 = 0;
				if (local10.anInt6592 >= 0 && local10.anInt6587 >= 0 && local10.anInt6592 < Static193.anInt3853 && Static301.anInt5585 > local10.anInt6587) {
					Static295.method4511(local10);
				}
			} else {
				local10.method6330();
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Z")
	public static boolean method5093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}

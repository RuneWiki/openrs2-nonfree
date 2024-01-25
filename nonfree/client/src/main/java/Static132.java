import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!ika;Z)V")
	public static void method2344(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method2048(255);
			if (local18 == 0) {
				Static481.anInt7534 = arg0.method2028(-14795);
				Static226.anInt3688 = arg0.method2028(-14795);
			} else if (local18 == 255) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)I")
	public static int method2345(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}

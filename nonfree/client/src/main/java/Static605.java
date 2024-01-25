import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	public static int anInt9946;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Lclient!wm;")
	public static Class390 aClass390_117;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "[Lclient!s;")
	public static Class109[] aClass109Array5;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt9948 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!mc;I)Lclient!ln;")
	public static Class218 method8279(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) int local7 = arg0.method7860();
		return new Class218(local7);
	}
}

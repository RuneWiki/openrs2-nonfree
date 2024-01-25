import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static426 {

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	public static int anInt6943 = 0;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "Z")
	public static boolean aBoolean567 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
	public static boolean method5317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static62.method968(arg1, arg0) || Static6.method105(arg0, arg1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static612 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public static void method8364() {
		Static250.method6648(255, -1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)Z")
	public static boolean method8368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static379.method5970(arg0, arg1) || Static57.method7333(arg1, arg0);
	}
}

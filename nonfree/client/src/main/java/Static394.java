import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	public static int anInt7291;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt7289 = 0;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
	public static void method5913(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class14_Sub50 local8 = Static250.method3683(arg0, arg1);
		if (local8 != null) {
			local8.method9315();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt635 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
	public static void method473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class4_Sub2_Sub21 local16 = Static39.method4121(arg0, 4);
		local16.method4360();
		local16.anInt5492 = arg1;
		local16.anInt5502 = arg2;
		local16.anInt5495 = arg3;
	}
}

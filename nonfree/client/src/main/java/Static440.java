import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	public static int anInt7325;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
	public static int anInt7328;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_262 = new Class56(26, 12);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public static void method5861(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(10, arg0);
		local8.method5523();
	}
}

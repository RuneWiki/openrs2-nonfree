import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public static int anInt6449;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_13 = new Class131(13, 0, 1, 0);

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt6448 = -1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
	public static boolean aBoolean570 = false;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!uaa;)V")
	public static void method5374(@OriginalArg(1) Class345 arg0) {
		@Pc(11) Class345 local11 = Static17.method233(arg0);
		@Pc(19) int local19;
		@Pc(16) int local16;
		if (local11 == null) {
			local19 = Static32.anInt510;
			local16 = Static79.anInt1140;
		} else {
			local16 = local11.anInt9606;
			local19 = local11.anInt9649;
		}
		Static89.method1860(local16, local19, false, arg0);
		Static209.method7259(arg0, local19, local16);
	}
}

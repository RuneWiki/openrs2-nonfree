import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	public static int anInt6750;

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "Lclient!wk;")
	public static Class264 aClass264_41;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "[I")
	public static int[] anIntArray592;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "[S")
	public static final short[] aShortArray101 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!jb;I)Lclient!jb;")
	public static Class126 method5245(@OriginalArg(0) Class126 arg0) {
		if (arg0.anInt3405 != -1) {
			return Static53.method1056(arg0.anInt3405);
		}
		@Pc(19) int local19 = arg0.anInt3397 >>> 16;
		@Pc(24) Class267 local24 = new Class267(Static391.aClass196_37);
		for (@Pc(29) Class4_Sub4 local29 = (Class4_Sub4) local24.method5795(); local29 != null; local29 = (Class4_Sub4) local24.method5793()) {
			if (local29.anInt573 == local19) {
				return Static53.method1056((int) local29.aLong225);
			}
		}
		return null;
	}
}

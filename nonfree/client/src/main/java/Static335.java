import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "[Lclient!gs;")
	public static Class13_Sub1_Sub1[] aClass13_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
	public static int anInt5343;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IB)Z")
	public static boolean method4545(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Lclient!eaa;")
	public static Class80 method4546(@OriginalArg(1) int arg0) {
		@Pc(8) Class80[] local8 = Static558.method7646();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class80 local16 = local8[local10];
			if (arg0 == local16.anInt2104) {
				return local16;
			}
		}
		return null;
	}
}

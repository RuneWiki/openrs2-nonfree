import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
	public static int anInt1253;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "Lclient!sv;")
	public static final Class340 aClass340_1 = new Class340();

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	public static int anInt1255 = -2;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lclient!tu;")
	public static Class356 method1292(@OriginalArg(0) int arg0) {
		@Pc(8) Class356[] local8 = Static548.method7290();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class356 local21 = local8[local15];
			if (local21.anInt9084 == arg0) {
				return local21;
			}
		}
		return null;
	}
}

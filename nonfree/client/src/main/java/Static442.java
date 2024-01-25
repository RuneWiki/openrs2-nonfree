import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!qs", name = "F", descriptor = "Lclient!db;")
	public static final Class64 aClass64_372 = new Class64(93, -1);

	@OriginalMember(owner = "client!qs", name = "L", descriptor = "Z")
	public static final boolean aBoolean534 = false;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public static void method6256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static252.anInt4971 <= arg0 && arg0 <= Static359.anInt6232) {
			@Pc(23) int local23 = Static572.method7817(Static68.anInt1306, arg3, Static589.anInt9684);
			@Pc(29) int local29 = Static572.method7817(Static68.anInt1306, arg2, Static589.anInt9684);
			Static235.method4044(local23, local29, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)Z")
	public static boolean method6257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static440.method6237(arg0, arg1) | Static59.method859(arg0, arg1) | Static354.method5231(arg0, arg1)) & Static401.method5810(arg1, arg0);
	}
}

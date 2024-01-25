import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!uu;")
	public static Class250 aClass250_63;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZII)V")
	public static void method3569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class57 local9 = Static76.aClass57ArrayArray1[arg1][arg0];
		Static67.method1248(arg2, local9 == null ? Static71.aClass57_1 : local9);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method3578() {
		Static148.anInt2688 = Static251.aClass124_14.anInt3604 + Static251.aClass124_14.anInt3597 + 2;
		Static130.anInt2355 = Static298.aClass124_11.anInt3597 + Static298.aClass124_11.anInt3604 + 2;
		Static363.aStringArray39 = new String[500];
		for (@Pc(34) int local34 = 0; local34 < Static363.aStringArray39.length; local34++) {
			Static363.aStringArray39[local34] = "";
		}
	}
}

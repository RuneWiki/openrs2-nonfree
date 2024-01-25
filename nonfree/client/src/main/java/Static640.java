import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!oe;")
	public static final Class249 aClass249_15 = new Class249();

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "[I")
	public static final int[] anIntArray693 = new int[4];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Lclient!sha;")
	public static Class321 method8748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class321 local15 = Static286.method4134(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass321Array1 == null || local15.aClass321Array1.length <= arg1) {
			return null;
		} else {
			return local15.aClass321Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIB)V")
	public static void method8749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg2, 9);
		local9.method7976();
		local9.anInt9463 = arg0;
		local9.anInt9466 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!qs;")
	public static Class211 aClass211_2;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public static int anInt82;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_3 = new Class263(58, -1);

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
	public static int anInt83 = 0;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIZIII)V")
	public static void method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static181.anInt3929 = arg0;
		Static272.anInt5269 = arg1;
		Static83.anInt2025 = arg5;
		Static342.anInt6261 = arg4;
		Static259.anInt5010 = arg2;
		if (arg3 && Static83.anInt2025 >= 100) {
			Static78.anInt1973 = Static272.anInt5269 * 128 + 64;
			Static378.anInt6885 = Static342.anInt6261 * 128 + 64;
			Static107.anInt2426 = Static227.method3475(Static378.anInt6885, Static78.anInt1973, Static426.anInt1486) - Static259.anInt5010;
		}
		Static21.anInt6762 = 2;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZLclient!hd;Lclient!hd;ZII)I")
	public static int method69(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class103_Sub1 arg1, @OriginalArg(3) Class103_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static347.method4916(arg2, arg0, arg1, arg5);
		if (local15 != 0) {
			return arg0 ? -local15 : local15;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static347.method4916(arg2, arg3, arg1, arg4);
			return arg3 ? -local36 : local36;
		}
	}
}

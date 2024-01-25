import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt6354;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt6355;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "I")
	public static int anInt6358;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt6352 = 104;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public static int anInt6353 = 0;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public static int anInt6356 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLclient!vh;IZ)V")
	public static void method5623(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub40 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt6233;
		@Pc(12) int local12 = (int) arg1.aLong218;
		arg1.method5803();
		if (arg0) {
			Static132.method2686(local8);
		}
		Static126.method2450(local8);
		@Pc(34) Class96 local34 = Static121.method2396(local12);
		if (local34 != null) {
			Static336.method4719(local34);
		}
		Static171.method3254();
		if (!arg2 && Static207.anInt4106 != -1) {
			Static55.method1183(1, Static207.anInt4106);
		}
		@Pc(55) Class124 local55 = new Class124(Static265.aClass42_53);
		for (@Pc(60) Class5_Sub40 local60 = (Class5_Sub40) local55.method3323(); local60 != null; local60 = (Class5_Sub40) local55.method3324()) {
			if (!local60.method5802()) {
				local60 = (Class5_Sub40) local55.method3323();
				if (local60 == null) {
					return;
				}
			}
			if (local60.anInt6229 == 3) {
				@Pc(84) int local84 = (int) local60.aLong218;
				if (local84 >>> 16 == local8) {
					method5623(true, local60, arg2);
				}
			}
		}
	}
}

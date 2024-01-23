import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!o", name = "S", descriptor = "Lclient!i;")
	private static Class41 aClass41_873 = Static184.method2923("button near the top of that page)3");

	@OriginalMember(owner = "client!o", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_872 = aClass41_873;

	@OriginalMember(owner = "client!o", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_874 = Static184.method2923("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!o", name = "W", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[104][104];

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_875 = Static184.method2923("mem=");

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II[Lclient!i;I[S)V")
	public static void method2188(@OriginalArg(1) int arg0, @OriginalArg(2) Class41[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(11) int local11 = (arg0 + arg2) / 2;
		@Pc(15) Class41 local15 = arg1[local11];
		arg1[local11] = arg1[arg2];
		@Pc(23) int local23 = arg0;
		arg1[arg2] = local15;
		@Pc(31) short local31 = arg3[local11];
		arg3[local11] = arg3[arg2];
		arg3[arg2] = local31;
		for (@Pc(43) int local43 = arg0; local43 < arg2; local43++) {
			if (local15 == null || arg1[local43] != null && arg1[local43].method1414(local15) < (local43 & 0x1)) {
				@Pc(69) Class41 local69 = arg1[local43];
				arg1[local43] = arg1[local23];
				arg1[local23] = local69;
				@Pc(83) short local83 = arg3[local43];
				arg3[local43] = arg3[local23];
				arg3[local23++] = local83;
			}
		}
		arg1[arg2] = arg1[local23];
		arg1[local23] = local15;
		arg3[arg2] = arg3[local23];
		arg3[local23] = local31;
		method2188(arg0, arg1, local23 - 1, arg3);
		method2188(local23 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!nb;Lclient!nb;ILclient!nb;)V")
	public static void method2189(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) Class15 arg2) {
		Static96.anInt2364 = arg1.method414(Static36.aClass41_268);
		Static136.anInt3160 = arg2.method414(Static56.aClass41_462);
		Static91.anInt2268 = arg2.method414(Static31.aClass41_216);
		Static142.anInt3255 = arg2.method414(Static102.aClass41_738);
		Static217.anInt4760 = arg2.method414(Static18.aClass41_117);
		Static135.anInt3150 = arg2.method414(Static80.aClass41_613);
		Static13.anInt408 = arg2.method414(Static202.aClass41_549);
		Static7.anInt319 = arg2.method414(Static188.aClass41_1143);
		Static84.anInt2160 = arg2.method414(Static43.aClass41_373);
		Static106.anInt2584 = arg2.method414(Static6.aClass41_59);
		Static200.anInt4495 = arg2.method414(Static78.aClass41_601);
		Static75.anInt3787 = arg0.method414(Static105.aClass41_752);
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)I")
	public static int method2191() {
		@Pc(9) int local9 = Static212.method3261(Static69.anInt1817, Static163.anInt3822, Static134.anInt3147);
		return local9 - Static94.anInt2320 >= 800 || (Static102.aByteArrayArrayArray7[Static134.anInt3147][Static69.anInt1817 >> 7][Static163.anInt3822 >> 7] & 0x4) == 0 ? 3 : Static134.anInt3147;
	}
}

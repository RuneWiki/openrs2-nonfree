import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "Z")
	public static boolean aBoolean700;

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "Z")
	public static boolean aBoolean701;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_118 = new Class154(39, 2);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([BBI[BIIIII)V")
	public static void method6712(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg1++;
				arg0[local28] += arg2[arg3++];
				@Pc(40) int local40 = arg1++;
				arg0[local40] += arg2[arg3++];
				@Pc(52) int local52 = arg1++;
				arg0[local52] += arg2[arg3++];
				@Pc(64) int local64 = arg1++;
				arg0[local64] += arg2[arg3++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local28 = arg1++;
				arg0[local28] += arg2[arg3++];
			}
			arg1 += arg6;
			arg3 += arg7;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIZIII)V")
	public static void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static274.anInt4738 = arg4;
		Static388.anInt6396 = arg2;
		Static452.anInt7231 = arg0;
		Static259.anInt4284 = arg5;
		Static334.anInt9531 = arg1;
		if (arg3 && Static452.anInt7231 >= 100) {
			Static285.anInt2206 = Static388.anInt6396 * 512 + 256;
			Static469.anInt7519 = Static259.anInt4284 * 512 + 256;
			Static151.anInt2436 = Static24.method347(Static469.anInt7519, Static285.anInt2206, Static402.anInt6620) - Static334.anInt9531;
		}
		Static203.anInt2978 = -1;
		Static148.anInt2359 = -1;
		Static489.anInt7763 = 2;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V")
	public static void method6714(@OriginalArg(1) int arg0) {
		Static570.method7432(Static229.aClass159_14.method2776(Static261.anInt4297), arg0);
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(III)Z")
	public static boolean method6717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static116.method1699(arg1, arg0) | (arg0 & 0x800) != 0 || Static540.method7100(arg1, arg0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!gk;Z)Lclient!ru;")
	public static Class213 method6719(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method4518();
		@Pc(19) Class322 local19 = Static30.method394()[arg0.method4464()];
		@Pc(30) Class347 local30 = Static226.method2754()[arg0.method4464()];
		@Pc(34) int local34 = arg0.method4478();
		@Pc(38) int local38 = arg0.method4478();
		return new Class213(local7, local19, local30, local34, local38);
	}
}

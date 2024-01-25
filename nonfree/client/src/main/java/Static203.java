import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "Lclient!qs;")
	public static Class96 aClass96_2;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	public static int anInt3587;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	public static int anInt3590;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_20 = new Class85();

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "[I")
	public static int[] anIntArray321 = new int[2];

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BJ)V")
	public static void method2904(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIII)V")
	public static void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static289.method3844(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(29) int local29 = local15;
		@Pc(43) int local43 = -local15;
		@Pc(45) int local45 = -1;
		@Pc(47) int local47 = -1;
		@Pc(51) int[] local51 = Static353.anIntArrayArray48[arg4];
		@Pc(56) int local56 = arg1 - local15;
		@Pc(60) int local60 = local15 + arg1;
		Static404.method5769(local51, arg1 - arg2, local56, arg3);
		Static404.method5769(local51, local56, local60, arg5);
		Static404.method5769(local51, local60, arg2 + arg1, arg3);
		while (local24 > local10) {
			local47 += 2;
			local45 += 2;
			local27 += local45;
			local43 += local47;
			if (local43 >= 0 && local29 >= 1) {
				Static424.anIntArray597[local29] = local10;
				local29--;
				local43 -= local29 << 1;
			}
			local10++;
			@Pc(130) int[] local130;
			@Pc(136) int[] local136;
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(184) int local184;
			@Pc(188) int local188;
			@Pc(193) int local193;
			if (local27 >= 0) {
				local24--;
				if (local15 <= local24) {
					local130 = Static353.anIntArrayArray48[arg4 + local24];
					local136 = Static353.anIntArrayArray48[arg4 - local24];
					local140 = arg1 + local10;
					local145 = arg1 - local10;
					Static404.method5769(local130, local145, local140, arg3);
					Static404.method5769(local136, local145, local140, arg3);
				} else {
					local130 = Static353.anIntArrayArray48[arg4 + local24];
					local136 = Static353.anIntArrayArray48[arg4 - local24];
					local140 = Static424.anIntArray597[local24];
					local145 = local10 + arg1;
					local184 = arg1 - local10;
					local188 = local140 + arg1;
					local193 = arg1 - local140;
					Static404.method5769(local130, local184, local193, arg3);
					Static404.method5769(local130, local193, local188, arg5);
					Static404.method5769(local130, local188, local145, arg3);
					Static404.method5769(local136, local184, local193, arg3);
					Static404.method5769(local136, local193, local188, arg5);
					Static404.method5769(local136, local188, local145, arg3);
				}
				local27 -= local24 << 1;
			}
			local130 = Static353.anIntArrayArray48[local10 + arg4];
			local136 = Static353.anIntArrayArray48[arg4 - local10];
			local140 = arg1 + local24;
			local145 = arg1 - local24;
			if (local10 < local15) {
				local184 = local29 < local10 ? Static424.anIntArray597[local10] : local29;
				local188 = local184 + arg1;
				local193 = arg1 - local184;
				Static404.method5769(local130, local145, local193, arg3);
				Static404.method5769(local130, local193, local188, arg5);
				Static404.method5769(local130, local188, local140, arg3);
				Static404.method5769(local136, local145, local193, arg3);
				Static404.method5769(local136, local193, local188, arg5);
				Static404.method5769(local136, local188, local140, arg3);
			} else {
				Static404.method5769(local130, local145, local140, arg3);
				Static404.method5769(local136, local145, local140, arg3);
			}
		}
	}
}

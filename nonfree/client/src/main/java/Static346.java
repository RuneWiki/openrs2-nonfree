import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Z")
	public static boolean aBoolean415;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public static int anInt6595;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Z")
	public static boolean aBoolean416 = false;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V")
	public static void method5506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg0) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local29;
		@Pc(43) Object local43 = arg2[local23];
		arg2[local23] = arg2[arg0];
		arg2[arg0] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg0; local62++) {
			if (local29 + (local60 & local62) > arg3[local62]) {
				@Pc(77) int local77 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25] = local77;
				@Pc(91) Object local91 = arg2[local62];
				arg2[local62] = arg2[local25];
				arg2[local25++] = local91;
			}
		}
		arg3[arg0] = arg3[local25];
		arg3[local25] = local29;
		arg2[arg0] = arg2[local25];
		arg2[local25] = local43;
		method5506(local25 - 1, arg1, arg2, arg3);
		method5506(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIIFIII)[I")
	public static int[] method5507(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub1_Sub38 local10 = new Class3_Sub1_Sub38();
		local10.anInt9300 = 4;
		local10.anInt9303 = (int) (arg0 * 4096.0F);
		local10.anInt9308 = 8;
		local10.anInt9307 = 8;
		local10.anInt9302 = 35;
		local10.aBoolean681 = true;
		local10.method7786();
		Static166.method5704(2048, 1);
		local10.method7692(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(JJ)J")
	public static long method5508(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}

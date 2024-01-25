import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "Z")
	public static boolean aBoolean299 = true;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIJIILclient!tf;Lclient!i;II)V")
	public static void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class240 arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg3 * arg3 + arg7 * arg7;
		if ((long) local11 > arg2) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg4.anInt6904 / 2, arg4.anInt6894 / 2);
		if (local31 * local31 >= local11) {
			Static351.method5117(arg5, arg3, arg0, arg7, arg6, arg4, Static29.aClass2Array46[arg1]);
			return;
		}
		local31 -= 10;
		@Pc(47) int local47;
		if (Static275.anInt5173 == 4) {
			local47 = (int) Static322.aFloat82 & 0x3FFF;
		} else {
			local47 = Static53.anInt4624 + (int) Static322.aFloat82 & 0x3FFF;
		}
		@Pc(58) int local58 = Class4_Sub13.anIntArray497[local47];
		@Pc(62) int local62 = Class4_Sub13.anIntArray496[local47];
		if (Static275.anInt5173 != 4) {
			local58 = local58 * 256 / (Static437.anInt7473 + 256);
			local62 = local62 * 256 / (Static437.anInt7473 + 256);
		}
		@Pc(94) int local94 = local58 * arg7 + local62 * arg3 >> 15;
		@Pc(105) int local105 = local62 * arg7 - local58 * arg3 >> 15;
		@Pc(111) double local111 = Math.atan2((double) local94, (double) local105);
		@Pc(118) int local118 = (int) (Math.sin(local111) * (double) local31);
		@Pc(125) int local125 = (int) ((double) local31 * Math.cos(local111));
		Static168.aClass2Array23[arg1].method5920((float) local118 + (float) arg4.anInt6904 / 2.0F + (float) arg0, (float) -local125 + (float) arg6 + (float) arg4.anInt6894 / 2.0F, 4096, (int) (-local111 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Lclient!tf;")
	public static Class240 method3929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class240 local7 = Static92.method1820(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass240Array2 == null || arg1 >= local7.aClass240Array2.length) {
			return null;
		} else {
			return local7.aClass240Array2[arg1];
		}
	}
}

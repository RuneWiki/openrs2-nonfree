import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_7 = new Class186(90, 8);

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	public static int anInt507 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!be;Lclient!ig;ZIIILclient!tq;I)V")
	public static void method409(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class239 arg5, @OriginalArg(7) int arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static9.anInt164 == 4) {
			local14 = (int) Static397.aFloat99 & 0x3FFF;
		} else {
			local14 = Static71.anInt1484 + (int) Static397.aFloat99 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg5.anInt6435 / 2, arg5.anInt6408 / 2) + 10;
		@Pc(47) int local47 = arg2 * arg2 + arg3 * arg3;
		if (local47 > local39 * local39) {
			return;
		}
		@Pc(61) int local61 = Class6_Sub1_Sub18.anIntArray642[local14];
		@Pc(65) int local65 = Class6_Sub1_Sub18.anIntArray643[local14];
		if (Static9.anInt164 != 4) {
			local61 = local61 * 256 / (Static393.anInt5623 + 256);
			local65 = local65 * 256 / (Static393.anInt5623 + 256);
		}
		@Pc(94) int local94 = arg3 * local65 + arg2 * local61 >> 15;
		@Pc(104) int local104 = arg2 * local65 - local61 * arg3 >> 15;
		arg1.method5662(local94 + arg4 + arg5.anInt6435 / 2 - arg1.method5654() / 2, arg6 - -(arg5.anInt6408 / 2) + (-local104 - arg1.method5655() / 2), arg0, arg4, arg6);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)I")
	public static int method411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg0;
			arg0 = arg4;
			arg4 = local14;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg2;
		} else {
			return 1 + 7 - arg4 - arg3;
		}
	}
}

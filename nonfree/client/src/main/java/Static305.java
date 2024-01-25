import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Z")
	public static boolean aBoolean409;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	public static int anInt5631;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "[I")
	public static final int[] anIntArray559 = new int[1000];

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_35 = new Class313(260);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4808(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILclient!pa;Lclient!pe;ILjava/lang/String;IIIZLclient!jq;Lclient!ra;)V")
	public static void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class232 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class156 arg9, @OriginalArg(11) Class67 arg10) {
		@Pc(21) int local21;
		if (Static448.anInt7701 == 4) {
			local21 = (int) Static404.aFloat156 & 0x3FFF;
		} else {
			local21 = (int) Static404.aFloat156 + Static265.anInt5084 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg9.anInt4732 / 2, arg9.anInt4673 / 2) + 10;
		@Pc(49) int local49 = arg0 * arg0 + arg4 * arg4;
		if (local40 * local40 < local49) {
			return;
		}
		@Pc(59) int local59 = Class310.anIntArray827[local21];
		@Pc(63) int local63 = Class310.anIntArray826[local21];
		if (Static448.anInt7701 != 4) {
			local63 = local63 * 256 / (Static316.anInt5814 + 256);
			local59 = local59 * 256 / (Static316.anInt5814 + 256);
		}
		@Pc(92) int local92 = local59 * arg4 + local63 * arg0 >> 14;
		@Pc(103) int local103 = local63 * arg4 - arg0 * local59 >> 14;
		@Pc(110) int local110 = arg3.method5438(null, 100, arg5);
		@Pc(116) int local116 = local92 - local110 / 2;
		@Pc(124) int local124 = arg3.method5437(arg5, null);
		if (local116 >= -arg9.anInt4732 && local116 <= arg9.anInt4732 && -arg9.anInt4673 <= local103 && local103 <= arg9.anInt4673) {
			arg10.method7488(arg9.anInt4673 / 2 + arg6 - local103 - arg8 - local124, arg5, 0, arg1, arg7, null, 50, arg2, arg9.anInt4732 / 2 + arg7 + local116, null, arg6, 0, local110);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIII)V")
	public static void method4812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg0 + 1;
		Static424.method6216(arg2, arg3, arg4, Static447.anIntArrayArray99[arg0]);
		@Pc(21) int local21 = arg1 - 1;
		Static424.method6216(arg2, arg3, arg4, Static447.anIntArrayArray99[arg1]);
		for (@Pc(29) int local29 = local8; local29 <= local21; local29++) {
			@Pc(35) int[] local35 = Static447.anIntArrayArray99[local29];
			local35[arg4] = local35[arg2] = arg3;
		}
	}
}

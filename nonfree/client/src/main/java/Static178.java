import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!he", name = "A", descriptor = "I")
	public static int anInt3810;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "I")
	public static int anInt3816;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_57 = new Class6(91, 3);

	@OriginalMember(owner = "client!he", name = "N", descriptor = "[I")
	public static final int[] anIntArray292 = new int[5];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static95.anInt2358 <= arg5 && arg6 <= Static299.anInt4491 && Static92.anInt2338 <= arg0 && Static341.anInt6379 >= arg4) {
			Static114.method6190(arg2, arg4, arg1, arg0, arg5, arg6, arg3);
		} else {
			Static372.method5699(arg5, arg6, arg0, arg1, arg4, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILclient!vp;IIILclient!pa;Lclient!ra;ILjava/lang/String;Lclient!lg;)V")
	public static void method3419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class309 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class23 arg6, @OriginalArg(8) Class27 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Class177 arg10) {
		@Pc(15) int local15;
		if (Static464.anInt8003 == 4) {
			local15 = (int) Static443.aFloat151 & 0x3FFF;
		} else {
			local15 = Static96.anInt2375 + (int) Static443.aFloat151 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg3.anInt8790 / 2, arg3.anInt8752 / 2) + 10;
		@Pc(41) int local41 = arg2 * arg2 + arg4 * arg4;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(51) int local51 = Class307.anIntArray744[local15];
		@Pc(55) int local55 = Class307.anIntArray743[local15];
		if (Static464.anInt8003 != 4) {
			local55 = local55 * 256 / (Static189.anInt4000 + 256);
			local51 = local51 * 256 / (Static189.anInt4000 + 256);
		}
		@Pc(84) int local84 = arg2 * local51 + arg4 * local55 >> 15;
		@Pc(95) int local95 = arg2 * local55 - local51 * arg4 >> 15;
		@Pc(106) int local106 = arg10.method4663(arg9, null, 100);
		@Pc(114) int local114 = arg10.method4668(arg9, null);
		@Pc(120) int local120 = local84 - local106 / 2;
		if (-arg3.anInt8790 <= local120 && arg3.anInt8790 >= local120 && -arg3.anInt8752 <= local95 && local95 <= arg3.anInt8752) {
			arg7.method7806(null, local106, 50, arg0, 0, null, arg3.anInt8790 / 2 + local120 + arg5, arg6, arg1, 0, arg5, arg0 + arg3.anInt8752 / 2 - arg8 - local95 - local114, arg9);
		}
	}
}

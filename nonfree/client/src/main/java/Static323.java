import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
	public static int anInt6498;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "[S")
	public static short[] aShortArray93 = new short[256];

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!us;")
	public static final Class344 aClass344_78 = new Class344(52, 5);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZBI)V")
	public static void method5442(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub17 local8 = Static77.method3511(arg0, arg1);
		if (local8 != null) {
			local8.method8671();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!da;IILjava/lang/String;ILclient!tba;Lclient!aa;ILclient!gaa;II)V")
	public static void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class315 arg6, @OriginalArg(7) Class1 arg7, @OriginalArg(9) Class108 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static516.anInt9019 == 4) {
			local11 = (int) Static502.aFloat230 & 0x3FFF;
		} else {
			local11 = (int) Static502.aFloat230 + Static30.anInt575 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg8.anInt4067 / 2, arg8.anInt4037 / 2) + 10;
		@Pc(41) int local41 = arg2 * arg2 + arg10 * arg10;
		if (local41 > local32 * local32) {
			return;
		}
		@Pc(55) int local55 = Class3_Sub1_Sub2.anIntArray84[local11];
		@Pc(59) int local59 = Class3_Sub1_Sub2.anIntArray85[local11];
		if (Static516.anInt9019 != 4) {
			local55 = local55 * 256 / (Static127.anInt3186 + 256);
			local59 = local59 * 256 / (Static127.anInt3186 + 256);
		}
		@Pc(95) int local95 = arg10 * local55 + local59 * arg2 >> 14;
		@Pc(106) int local106 = local59 * arg10 - local55 * arg2 >> 14;
		@Pc(113) int local113 = arg6.method7566(null, 100, arg4);
		@Pc(119) int local119 = local95 - local113 / 2;
		@Pc(127) int local127 = arg6.method7569(null, arg4, 100, 0);
		if (local119 >= -arg8.anInt4067 && arg8.anInt4067 >= local119 && local106 >= -arg8.anInt4037 && local106 <= arg8.anInt4037) {
			arg1.method5857(arg8.anInt4067 / 2 + local119 + arg9, local113, 0, 0, arg7, 50, arg0, arg4, null, 0, null, arg5 + arg8.anInt4037 / 2 - local127 - local106 - arg3, 1, arg9, arg5);
		}
	}
}

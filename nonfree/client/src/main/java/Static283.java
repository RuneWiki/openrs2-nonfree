import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method4640() {
		Static365.aClass155_1.method4040();
		Static164.aClass173_1.method6490();
		Static111.aClient1.method1345();
		Static32.aCanvas3.setBackground(Color.black);
		Static414.anInt7243 = -1;
		Static365.aClass155_1 = Static164.method3124(Static32.aCanvas3);
		Static164.aClass173_1 = Static541.method5641(Static32.aCanvas3);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILclient!ta;Lclient!rr;ILclient!ub;Ljava/lang/String;IIILclient!fa;B)V")
	public static void method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) Class292 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class327 arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86 arg10) {
		@Pc(15) int local15;
		if (Static346.anInt6215 == 4) {
			local15 = (int) Static428.aFloat160 & 0x3FFF;
		} else {
			local15 = Static185.anInt3860 + (int) Static428.aFloat160 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg3.anInt7963 / 2, arg3.anInt7912 / 2) + 10;
		@Pc(42) int local42 = arg9 * arg9 + arg8 * arg8;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(56) int local56 = Class6_Sub2_Sub7.anIntArray178[local15];
		@Pc(60) int local60 = Class6_Sub2_Sub7.anIntArray177[local15];
		if (Static346.anInt6215 != 4) {
			local60 = local60 * 256 / (Static291.anInt5446 + 256);
			local56 = local56 * 256 / (Static291.anInt5446 + 256);
		}
		@Pc(89) int local89 = local60 * arg8 + local56 * arg9 >> 14;
		@Pc(108) int local108 = local60 * arg9 - arg8 * local56 >> 14;
		@Pc(115) int local115 = arg5.method7189(100, arg6, null);
		@Pc(121) int local121 = local89 - local115 / 2;
		@Pc(131) int local131 = arg5.method7188(0, 100, arg6, null);
		if (local121 >= -arg3.anInt7963 && local121 <= arg3.anInt7963 && -arg3.anInt7912 <= local108 && local108 <= arg3.anInt7912) {
			arg2.method6401(arg1, arg4, arg6, 50, 0, null, arg4 + local121 + arg3.anInt7963 / 2, null, 0, arg0 + arg3.anInt7912 / 2 - local131 - local108 - arg7, local115, 1, arg0, 0, arg10);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)I")
	public static int method4642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = local12 << 1 | arg0 & 0x1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local12;
	}
}

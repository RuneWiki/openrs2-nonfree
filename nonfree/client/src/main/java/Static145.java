import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	public static void method2628() {
		if (Static206.anInt3642 == 2) {
			Static138.method2151(3);
		} else if (Static206.anInt3642 == 6) {
			Static138.method2151(7);
		} else if (Static206.anInt3642 == 9) {
			Static138.method2151(10);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;Lclient!go;Lclient!ma;IILclient!du;IILclient!la;III)V")
	public static void method2629(@OriginalArg(0) String arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class57 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class63 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static9.anInt60 == 4) {
			local13 = (int) Static97.aFloat52 & 0x3FFF;
		} else {
			local13 = Static436.anInt7298 + (int) Static97.aFloat52 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg1.anInt2595 / 2, arg1.anInt2638 / 2) + 10;
		@Pc(43) int local43 = arg7 * arg7 + arg6 * arg6;
		if (local34 * local34 < local43) {
			return;
		}
		@Pc(61) int local61 = Class22_Sub7.anIntArray411[local13];
		@Pc(65) int local65 = Class22_Sub7.anIntArray410[local13];
		if (Static9.anInt60 != 4) {
			local61 = local61 * 256 / (Static3.anInt11 + 256);
			local65 = local65 * 256 / (Static3.anInt11 + 256);
		}
		@Pc(95) int local95 = arg6 * local61 + local65 * arg7 >> 15;
		@Pc(106) int local106 = arg6 * local65 - arg7 * local61 >> 15;
		@Pc(113) int local113 = arg5.method1390(100, null, arg0);
		@Pc(121) int local121 = arg5.method1386(null, arg0);
		@Pc(127) int local127 = local95 - local113 / 2;
		if (-arg1.anInt2595 <= local127 && local127 <= arg1.anInt2595 && -arg1.anInt2638 <= local106 && arg1.anInt2638 >= local106) {
			arg8.method4587(null, 0, arg10, 50, 0, arg9, arg4, arg10 + arg1.anInt2638 / 2 - local121 - arg3 - local106, null, local113, arg2, arg1.anInt2595 / 2 + arg4 + local127, arg0);
		}
	}
}

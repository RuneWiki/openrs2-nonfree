import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "[I")
	public static final int[] anIntArray498 = new int[32];

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
	public static int anInt8165 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
	public static void method7057() {
		Static240.aClass353_1 = new Class353(8);
		Static41.anInt770 = 0;
		for (@Pc(21) Class9_Sub8 local21 = (Class9_Sub8) Static76.aClass139_2.method3198(); local21 != null; local21 = (Class9_Sub8) Static76.aClass139_2.method3205()) {
			local21.method5935();
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!uv;IBLclient!ej;Lclient!aa;ILjava/lang/String;Lclient!da;II)V")
	public static void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class344 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class93 arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) Class63 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15;
		if (Static471.anInt8064 == 4) {
			local15 = (int) Static170.aFloat71 & 0x3FFF;
		} else {
			local15 = (int) Static170.aFloat71 + Static579.anInt9458 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg2.anInt9546 / 2, arg2.anInt9602 / 2) + 10;
		@Pc(42) int local42 = arg6 * arg6 + arg1 * arg1;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(61) int local61 = Class3_Sub13.anIntArray147[local15];
		@Pc(65) int local65 = Class3_Sub13.anIntArray146[local15];
		if (Static471.anInt8064 != 4) {
			local61 = local61 * 256 / (Static296.anInt5883 + 256);
			local65 = local65 * 256 / (Static296.anInt5883 + 256);
		}
		@Pc(97) int local97 = arg1 * local61 + arg6 * local65 >> 14;
		@Pc(108) int local108 = arg1 * local65 - local61 * arg6 >> 14;
		@Pc(115) int local115 = arg4.method2316((Class103[]) null, arg7, 100);
		@Pc(121) int local121 = local97 - local115 / 2;
		@Pc(129) int local129 = arg4.method2314(100, 0, arg7, (Class103[]) null);
		if (-arg2.anInt9546 <= local121 && arg2.anInt9546 >= local121 && -arg2.anInt9602 <= local108 && arg2.anInt9602 >= local108) {
			arg8.method7749(0, 1, 0, arg0, (int[]) null, 50, arg5, local121 + arg9 + arg2.anInt9546 / 2, arg7, arg9, local115, (Class103[]) null, 0, arg2.anInt9602 / 2 + arg10 - local108 - arg3 - local129, arg10);
		}
	}
}

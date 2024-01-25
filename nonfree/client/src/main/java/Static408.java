import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt7067;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!li;")
	public static Class3_Sub5_Sub1 aClass3_Sub5_Sub1_118;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Lclient!dt;")
	public static Class61 aClass61_3;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_233 = new Class92(44, -1);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!qa;Lclient!ea;ILclient!eo;IIIII)V")
	public static void method5485(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class68 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) Class223 local10 = aClass61_3.method1426(arg6);
		if (local10 == null || !local10.aBoolean468 || !local10.method5283(Static369.aClass11_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray484 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray484.length];
			@Pc(44) int local44;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static107.anInt2382 == 4) {
					local44 = (int) Static235.aFloat60 & 0x3FFF;
				} else {
					local44 = (int) Static235.aFloat60 + Static397.anInt6876 & 0x3FFF;
				}
				@Pc(55) int local55 = Applet_Sub1.anIntArray85[local44];
				@Pc(59) int local59 = Applet_Sub1.anIntArray87[local44];
				if (Static107.anInt2382 != 4) {
					local55 = local55 * 256 / (Static317.anInt5759 + 256);
					local59 = local59 * 256 / (Static317.anInt5759 + 256);
				}
				local28[local30 * 2] = arg3.anInt2178 / 2 + arg7 + (local55 * (arg4 + local10.anIntArray484[local30 * 2 + 1] * 4) + local59 * (local10.anIntArray484[local30 * 2] * 4 + arg2) >> 15);
				local28[local30 * 2 + 1] = arg5 + arg3.lb / 2 - ((local10.anIntArray484[local30 * 2 + 1] * 4 + arg4) * local59 - (arg2 + local10.anIntArray484[local30 * 2] * 4) * local55 >> 15);
			}
			Static387.method5274(arg0, local28, local10.anInt6734, arg3.anIntArray191, arg3.anIntArray194);
			for (local44 = 0; local44 < local28.length / 2 - 1; local44++) {
				arg0.method2603(local28[local44 * 2], local28[local44 * 2 + 1], local28[local44 * 2 + 2], local28[local44 * 2 + 1 + 2], local10.anInt6727, arg1, arg7, arg5);
			}
			arg0.method2603(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt6727, arg1, arg7, arg5);
		}
		@Pc(266) Class22 local266 = null;
		if (local10.anInt6703 != -1) {
			local266 = local10.method5279(false, arg0);
			if (local266 != null) {
				Static263.method3974(arg7, arg1, arg4, arg2, arg3, arg5, local266);
			}
		}
		if (local10.aString61 == null) {
			return;
		}
		local30 = 0;
		if (local266 != null) {
			local30 = local266.qa();
		}
		@Pc(300) Class65 local300 = Static183.aClass65_3;
		@Pc(302) Class179 local302 = Static87.aClass179_7;
		if (local10.anInt6719 == 1) {
			local302 = Static230.aClass179_11;
			local300 = Static277.aClass65_5;
		}
		if (local10.anInt6719 == 2) {
			local300 = Static399.aClass65_7;
			local302 = Static222.aClass179_10;
		}
		Static400.method5404(local10.aString61, arg3, local300, arg4, local10.anInt6715, local30, arg5, local302, arg1, arg7, arg2);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public static void method5487(@OriginalArg(0) int arg0) {
		if (arg0 == Static441.anInt7511) {
			return;
		}
		Static399.anInt6923 = Static127.anInt2696 = Static308.anIntArray418[arg0];
		Static158.method2737();
		Static192.anIntArrayArrayArray11 = new int[4][Static399.anInt6923 >> 3][Static127.anInt2696 >> 3];
		Static321.anIntArrayArray46 = new int[Static399.anInt6923][Static127.anInt2696];
		Static417.anIntArrayArray56 = new int[Static399.anInt6923][Static127.anInt2696];
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			Static389.aClass23Array1[local38] = Static178.method3009(Static399.anInt6923, Static127.anInt2696);
		}
		Static344.aByteArrayArrayArray16 = new byte[4][Static399.anInt6923][Static127.anInt2696];
		Static455.method4734(Static399.anInt6923, Static127.anInt2696);
		Static322.method4688(Static266.aClass75_7, Static127.anInt2696 >> 3, Static399.anInt6923 >> 3);
		Static441.anInt7511 = arg0;
	}
}

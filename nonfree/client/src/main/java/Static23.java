import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt561;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_237 = Static187.method3089("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_238 = Static187.method3089("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public static int anInt563 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method443() {
		for (@Pc(7) int local7 = 0; local7 < Static147.anInt2991; local7++) {
			@Pc(13) int local13 = Static111.anIntArray183[local7];
			@Pc(17) Class8_Sub3_Sub2 local17 = Static177.aClass8_Sub3_Sub2Array1[local13];
			@Pc(21) int local21 = Static18.aClass1_Sub14_Sub1_2.method3010();
			@Pc(34) int local34;
			if ((local21 & 0x8) != 0) {
				local17.anInt3564 = Static18.aClass1_Sub14_Sub1_2.method3023();
				local34 = Static18.aClass1_Sub14_Sub1_2.method3052();
				local17.anInt3591 = local34 >> 16;
				local17.anInt3579 = Static155.anInt2981 + (local34 & 0xFFFF);
				local17.anInt3608 = 0;
				if (Static155.anInt2981 < local17.anInt3579) {
					local17.anInt3608 = -1;
				}
				local17.anInt3619 = 0;
				if (local17.anInt3564 == 65535) {
					local17.anInt3564 = -1;
				}
			}
			@Pc(81) int local81;
			if ((local21 & 0x20) != 0) {
				local34 = Static18.aClass1_Sub14_Sub1_2.method3023();
				local81 = Static18.aClass1_Sub14_Sub1_2.method3010();
				if (local34 == 65535) {
					local34 = -1;
				}
				if (local17.anInt3575 == local34 && local34 != -1) {
					@Pc(103) Class1_Sub3_Sub20 local103 = Static84.method1279(local34);
					@Pc(106) int local106 = local103.anInt3405;
					if (local106 == 1) {
						local17.anInt3605 = 0;
						local17.anInt3570 = 0;
						local17.anInt3620 = 0;
						local17.anInt3589 = local81;
						Static109.method1646(local103, local17.anInt3570, false, local17.anInt3600, local17.anInt3606);
					}
					if (local106 == 2) {
						local17.anInt3620 = 0;
					}
				} else if (local34 == -1 || local17.anInt3575 == -1 || Static84.method1279(local34).anInt3386 >= Static84.method1279(local17.anInt3575).anInt3386) {
					local17.anInt3620 = 0;
					local17.anInt3605 = 0;
					local17.anInt3589 = local81;
					local17.anInt3609 = local17.anInt3578;
					local17.anInt3575 = local34;
					local17.anInt3570 = 0;
					if (local17.anInt3575 != -1) {
						Static109.method1646(Static84.method1279(local17.anInt3575), local17.anInt3570, false, local17.anInt3600, local17.anInt3606);
					}
				}
			}
			if ((local21 & 0x80) != 0) {
				local17.anInt3582 = Static18.aClass1_Sub14_Sub1_2.method3034();
				if (local17.anInt3582 == 65535) {
					local17.anInt3582 = -1;
				}
			}
			if ((local21 & 0x10) != 0) {
				local34 = Static18.aClass1_Sub14_Sub1_2.method3036();
				local81 = Static18.aClass1_Sub14_Sub1_2.method3028();
				local17.method2683(Static155.anInt2981, local34, local81);
			}
			if ((local21 & 0x4) != 0) {
				local17.anInt3587 = Static18.aClass1_Sub14_Sub1_2.method3034();
				local17.anInt3603 = Static18.aClass1_Sub14_Sub1_2.method3023();
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass1_Sub3_Sub13_1 = Static27.method494(Static18.aClass1_Sub14_Sub1_2.method3023());
				local17.anInt3597 = local17.aClass1_Sub3_Sub13_1.anInt2248;
				local17.anInt3601 = local17.aClass1_Sub3_Sub13_1.anInt2250;
				local17.anInt3610 = local17.aClass1_Sub3_Sub13_1.anInt2258;
				local17.anInt3571 = local17.aClass1_Sub3_Sub13_1.anInt2253;
				local17.anInt3583 = local17.aClass1_Sub3_Sub13_1.anInt2256;
				local17.anInt3576 = local17.aClass1_Sub3_Sub13_1.anInt2260;
				local17.anInt3565 = local17.aClass1_Sub3_Sub13_1.anInt2251;
				local17.anInt3574 = local17.aClass1_Sub3_Sub13_1.anInt2263;
				local17.anInt3602 = local17.aClass1_Sub3_Sub13_1.anInt2262;
			}
			if ((local21 & 0x1) != 0) {
				local17.aClass92_1718 = Static18.aClass1_Sub14_Sub1_2.method3022();
				local17.anInt3621 = 100;
			}
			if ((local21 & 0x2) != 0) {
				local34 = Static18.aClass1_Sub14_Sub1_2.method3036();
				local81 = Static18.aClass1_Sub14_Sub1_2.method3028();
				local17.method2683(Static155.anInt2981, local34, local81);
				local17.anInt3599 = Static155.anInt2981 + 300;
				local17.anInt3612 = Static18.aClass1_Sub14_Sub1_2.method3036();
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
	public static int method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static191.method3129(4, arg0 + 91923, arg1 + 45365) + (Static191.method3129(2, arg0 + 37821, arg1 + 10294) - 128 >> 1) + (Static191.method3129(1, arg0, arg1) + -128 >> 2) - 128;
		local42 = (int) ((double) local42 * 0.3D) + 35;
		if (local42 < 10) {
			local42 = 10;
		} else if (local42 > 60) {
			local42 = 60;
		}
		return local42;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILclient!e;IJIIII)Z")
	public static boolean method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static110.method1656(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}

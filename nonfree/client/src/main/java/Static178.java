import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_57 = new Class337(39, 6);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IBIII)V")
	public static void method2713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(98) Class217 local98 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
			if (local98 != null) {
				if (arg3 == 1) {
					local98.aShort75 = 0;
				} else if (arg3 == 2) {
					local98.aShort77 = 0;
				}
			}
			Static84.method1390();
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static239.anInt4416; local17++) {
			@Pc(23) Class34 local23 = Static8.aClass34Array4[local17];
			if (local23.aByte32 == arg3 && arg1 == local23.aShort20 && local23.aShort21 == arg2 || local23.aShort23 == arg1 && local23.aShort21 == arg2) {
				if (local17 != Static239.anInt4416) {
					Static652.method4545(Static8.aClass34Array4, local17 + 1, Static8.aClass34Array4, local17, Static8.aClass34Array4.length - local17 - 1);
				}
				Static239.anInt4416--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IC)Z")
	public static boolean method2714(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZ)V")
	public static void method2715() {
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub6_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub6_2);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub12_2);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub12_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub20_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub2_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub10_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub7_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub21_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub26_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub29_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub16_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub17_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub25_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub23_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub23_2);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub9_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub28_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub3_1);
		Static136.method2007();
		Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub27_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub1_1);
		Static542.method7940();
		Static507.method7588();
		Static532.aBoolean663 = true;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILclient!ofa;)V")
	public static void method2717(@OriginalArg(1) Class5_Sub22 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static85.anInt1713; local3++) {
			@Pc(9) int local9 = arg0.method5947();
			@Pc(13) int local13 = arg0.method5968();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static51.aClass33_Sub1Array1[local9] != null) {
				Static51.aClass33_Sub1Array1[local9].anInt6148 = local13;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "Lclient!gj;")
	public static Class143 aClass143_2;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)V")
	public static void method96() {
		if (!Static15.aBoolean18) {
			Static15.aBoolean18 = true;
			Static226.aBoolean494 = true;
			Static112.aFloat74 += (-24.0F - Static112.aFloat74) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!kh;ILjava/lang/String;Lclient!da;Lclient!aa;IBIILclient!kc;II)V")
	public static void method97(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class202 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(20) int local20;
		if (Static378.anInt6662 == 4) {
			local20 = (int) Static204.aFloat82 & 0x3FFF;
		} else {
			local20 = (int) Static204.aFloat82 + Static56.anInt1426 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg0.anInt5639 / 2, arg0.anInt5630 / 2) + 10;
		@Pc(47) int local47 = arg9 * arg9 + arg6 * arg6;
		if (local39 * local39 < local47) {
			return;
		}
		@Pc(61) int local61 = Class3_Sub7_Sub2.anIntArray171[local20];
		@Pc(65) int local65 = Class3_Sub7_Sub2.anIntArray170[local20];
		if (Static378.anInt6662 != 4) {
			local61 = local61 * 256 / (Static433.anInt7606 + 256);
			local65 = local65 * 256 / (Static433.anInt7606 + 256);
		}
		@Pc(94) int local94 = arg6 * local65 + local61 * arg9 >> 14;
		@Pc(105) int local105 = local65 * arg9 - arg6 * local61 >> 14;
		@Pc(112) int local112 = arg8.method4626(100, (Class102[]) null, arg2);
		@Pc(122) int local122 = arg8.method4625((Class102[]) null, 0, arg2, 100);
		@Pc(128) int local128 = local94 - local112 / 2;
		if (-arg0.anInt5639 <= local128 && local128 <= arg0.anInt5639 && -arg0.anInt5630 <= local105 && arg0.anInt5630 >= local105) {
			arg3.method7452(arg2, arg0.anInt5630 / 2 + arg10 - arg5 - local105 - local122, 1, local112, arg4, arg1, arg10, 0, 50, 0, 0, (int[]) null, (Class102[]) null, arg1 + local128 + arg0.anInt5639 / 2, arg7);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIII)V")
	public static void method98(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		if (Static378.anInt6662 == 2) {
			Static206.anInt3821 = local7;
			Static118.anInt2323 = local3;
			Static260.anInt4898 = 0;
		}
		Static204.aFloat82 = (float) local7;
		Static461.aFloat178 = (float) local3;
		Static99.method1965();
		Static226.aBoolean494 = true;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "()V")
	public static void method99() {
		for (@Pc(1) int local1 = Static111.anInt10340; local1 < Static373.anInt6613; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static410.anInt6962; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static315.anInt5894; local7++) {
					@Pc(16) Class247 local16 = Static332.aClass247ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class23_Sub2_Sub5 local21 = local16.aClass23_Sub2_Sub5_1;
						@Pc(24) Class23_Sub2_Sub5 local24 = local16.aClass23_Sub2_Sub5_2;
						if (local21 != null && local21.method8607()) {
							Static175.method2926(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8607()) {
								Static175.method2926(local24, local1, local4, local7, 1, 1);
								local24.method8596(Static486.aClass16_8, local21, 0, 0, false, 0);
								local24.method8592();
							}
							local21.method8592();
						}
						for (@Pc(68) Class85 local68 = local16.aClass85_3; local68 != null; local68 = local68.aClass85_1) {
							@Pc(72) Class23_Sub2_Sub1 local72 = local68.aClass23_Sub2_Sub1_1;
							if (local72 != null && local72.method8607()) {
								Static175.method2926(local72, local1, local4, local7, local72.aShort125 + 1 - local72.aShort123, local72.aShort122 - local72.aShort124 + 1);
								local72.method8592();
							}
						}
						@Pc(108) Class23_Sub2_Sub3 local108 = local16.aClass23_Sub2_Sub3_1;
						if (local108 != null && local108.method8607()) {
							Static131.method2269(local108, local1, local4, local7);
							local108.method8592();
						}
					}
				}
			}
		}
	}
}

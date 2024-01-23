import java.awt.Frame;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!im", name = "o", descriptor = "I")
	public static int anInt2925 = 0;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	public static int anInt2926 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BILclient!g;)I")
	public static int method2292(@OriginalArg(1) int arg0, @OriginalArg(2) Class56 arg1) {
		if (arg1.anIntArrayArray5 == null || arg1.anIntArrayArray5.length <= arg0) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray5[arg0];
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local29++];
				@Pc(38) byte local38 = 0;
				@Pc(40) int local40 = 0;
				if (local36 == 0) {
					return local22;
				}
				if (local36 == 15) {
					local38 = 1;
				}
				if (local36 == 1) {
					local40 = Static264.anIntArray496[local20[local29++]];
				}
				if (local36 == 16) {
					local38 = 2;
				}
				if (local36 == 2) {
					local40 = Static27.anIntArray526[local20[local29++]];
				}
				if (local36 == 3) {
					local40 = Static194.anIntArray406[local20[local29++]];
				}
				if (local36 == 17) {
					local38 = 3;
				}
				@Pc(113) int local113;
				@Pc(124) Class56 local124;
				@Pc(129) int local129;
				@Pc(141) int local141;
				if (local36 == 4) {
					local113 = local20[local29++] << 16;
					@Pc(120) int local120 = local113 + local20[local29++];
					local124 = Static38.method715(local120);
					local129 = local20[local29++];
					if (local129 != -1 && (!Static87.method1546(local129).aBoolean146 || Static108.aBoolean163)) {
						for (local141 = 0; local141 < local124.anIntArray178.length; local141++) {
							if (local124.anIntArray178[local141] == local129 + 1) {
								local40 += local124.anIntArray180[local141];
							}
						}
					}
				}
				if (local36 == 5) {
					local40 = Static64.anIntArray134[local20[local29++]];
				}
				if (local36 == 6) {
					local40 = Class13_Sub4.anIntArray529[Static27.anIntArray526[local20[local29++]] - 1];
				}
				if (local36 == 7) {
					local40 = Static64.anIntArray134[local20[local29++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local40 = Static22.aClass15_Sub2_Sub2_1.anInt5382;
				}
				if (local36 == 9) {
					for (local113 = 0; local113 < 25; local113++) {
						if (Static100.aBooleanArray7[local113]) {
							local40 += Static27.anIntArray526[local113];
						}
					}
				}
				if (local36 == 10) {
					local113 = local20[local29++] << 16;
					local113 += local20[local29++];
					local124 = Static38.method715(local113);
					local129 = local20[local29++];
					if (local129 != -1 && (!Static87.method1546(local129).aBoolean146 || Static108.aBoolean163)) {
						for (local141 = 0; local141 < local124.anIntArray178.length; local141++) {
							if (local124.anIntArray178[local141] == local129 + 1) {
								local40 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local40 = Static69.anInt3038;
				}
				if (local36 == 12) {
					local40 = Static33.anInt878;
				}
				if (local36 == 13) {
					local113 = Static64.anIntArray134[local20[local29++]];
					@Pc(343) int local343 = local20[local29++];
					local40 = (0x1 << local343 & local113) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local113 = local20[local29++];
					local40 = Static191.method3295(local113);
				}
				if (local36 == 18) {
					local40 = Static160.anInt5159 + (Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7);
				}
				if (local36 == 19) {
					local40 = (Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7) + Static234.anInt4705;
				}
				if (local36 == 20) {
					local40 = local20[local29++];
				}
				if (local38 == 0) {
					if (local31 == 0) {
						local22 += local40;
					}
					if (local31 == 1) {
						local22 -= local40;
					}
					if (local31 == 2 && local40 != 0) {
						local22 /= local40;
					}
					if (local31 == 3) {
						local22 *= local40;
					}
					local31 = 0;
				} else {
					local31 = local38;
				}
			}
		} catch (@Pc(444) Exception local444) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)V")
	public static void method2293(@OriginalArg(1) int arg0) {
		if (!Static261.aBoolean343) {
			arg0 = -1;
		}
		if (Static10.anInt151 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class30 local21 = Static151.method2697(arg0);
			@Pc(25) Class2_Sub8_Sub1_Sub1 local25 = local21.method817();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Static164.aClass102_2.method2886(local25.anInt5516, Static227.aCanvas1, local25.method2778(), new Point(local21.anInt1122, local21.anInt1123), local25.anInt5520);
				Static10.anInt151 = arg0;
			}
		}
		if (arg0 == -1 && Static10.anInt151 != -1) {
			Static164.aClass102_2.method2886(-1, Static227.aCanvas1, null, new Point(), -1);
			Static10.anInt151 = -1;
		}
	}
}

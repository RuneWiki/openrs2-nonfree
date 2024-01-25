import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
	public static final int anInt4852 = 1337;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/util/Random;IB)I")
	public static int method4083(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static99.method4914(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static145.method2485(arg1, local45);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public static void method4084() {
		for (@Pc(7) int local7 = 0; local7 < Static418.aClass219ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static418.aClass219ArrayArray1[local7].length; local11++) {
				Static418.aClass219ArrayArray1[local7][local11] = Static253.aClass219_4;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static409.aClass101ArrayArrayArray3 == null) {
			Static126.aClass66_5.method5035(arg0, arg3, -16777216, arg2, arg1);
		} else if (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >= 0 && Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 < Static181.anInt3574 * 128 && Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >= 0 && Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 < Static117.anInt2450 * 128) {
			Static347.anInt6264++;
			if (Static302.aClass3_Sub2_Sub1_Sub2_2 != null && Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 + 64 - Static302.aClass3_Sub2_Sub1_Sub2_2.method5521() * 64 >> 7 == Static114.anInt5655 && Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 - (Static302.aClass3_Sub2_Sub1_Sub2_2.method5521() - 1) * 64 >> 7 == Static346.anInt6243) {
				Static346.anInt6243 = -1;
				Static114.anInt5655 = -1;
				Static97.method1811();
			}
			Static265.method4076();
			if (!arg4) {
				Static117.method2028();
			}
			Static355.method5272();
			Static6.method204(arg2, true, arg3, arg0, arg1);
			@Pc(121) int local121 = Static331.anInt5767;
			@Pc(123) int local123 = Static115.anInt2442;
			@Pc(125) int local125 = Static335.anInt5839;
			@Pc(127) int local127 = Static423.anInt7585;
			@Pc(133) int local133;
			@Pc(166) int local166;
			if (Static429.anInt7656 == 1) {
				local133 = (int) Static165.aFloat28;
				if (Static98.anInt6274 >> 8 > local133) {
					local133 = Static98.anInt6274 >> 8;
				}
				if (Static412.aBooleanArray26[4] && local133 < Static29.anIntArray48[4] + 128) {
					local133 = Static29.anIntArray48[4] + 128;
				}
				local166 = Static176.anInt3528 + (int) Static265.aFloat51 & 0x3FFF;
				Static200.method3111(local166, Static390.anInt6891, local123, (local133 >> 3) * 3 + 600 << 0, Static221.method3331(Static388.anInt6870, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202) - 50, local133, Static14.anInt435);
			} else if (Static429.anInt7656 == 4) {
				local133 = (int) Static165.aFloat28;
				if (Static98.anInt6274 >> 8 > local133) {
					local133 = Static98.anInt6274 >> 8;
				}
				if (Static412.aBooleanArray26[4] && local133 < Static29.anIntArray48[4] + 128) {
					local133 = Static29.anIntArray48[4] + 128;
				}
				local166 = (int) Static265.aFloat51 & 0x3FFF;
				Static200.method3111(local166, Static390.anInt6891, local123, (local133 >> 3) * 3 + 600 << 0, Static221.method3331(Static388.anInt6870, Static202.anInt3800, Static261.anInt4746) - 50, local133, Static14.anInt435);
			} else if (Static429.anInt7656 == 5) {
				Static47.method1026(local123);
			}
			local133 = Static157.anInt3220;
			local166 = Static367.anInt6653;
			@Pc(276) int local276 = Static229.anInt4187;
			@Pc(278) int local278 = Static328.anInt5668;
			@Pc(280) int local280 = Static260.anInt4728;
			@Pc(323) int local323;
			for (@Pc(282) int local282 = 0; local282 < 5; local282++) {
				if (Static412.aBooleanArray26[local282]) {
					local323 = (int) (Math.random() * (double) (Static383.anIntArray469[local282] * 2 + 1) - (double) Static383.anIntArray469[local282] + Math.sin((double) Static21.anIntArray26[local282] / 100.0D * (double) Static194.anIntArray237[local282]) * (double) Static29.anIntArray48[local282]);
					if (local282 == 3) {
						Static260.anInt4728 = local323 + Static260.anInt4728 & 0x3FFF;
					}
					if (local282 == 1) {
						Static367.anInt6653 += local323;
					}
					if (local282 == 2) {
						Static229.anInt4187 += local323;
					}
					if (local282 == 4) {
						Static328.anInt5668 += local323;
						if (Static328.anInt5668 < 1024) {
							Static328.anInt5668 = 1024;
						} else if (Static328.anInt5668 > 3072) {
							Static328.anInt5668 = 3072;
						}
					}
					if (local282 == 0) {
						Static157.anInt3220 += local323;
					}
				}
			}
			if (Static157.anInt3220 < 0) {
				Static157.anInt3220 = 0;
			}
			if ((Static229.anInt4189 << 7) - 1 < Static157.anInt3220) {
				Static157.anInt3220 = (Static229.anInt4189 << 7) - 1;
			}
			if (Static229.anInt4187 < 0) {
				Static229.anInt4187 = 0;
			}
			if (Static229.anInt4187 > (Static61.anInt1698 << 7) - 1) {
				Static229.anInt4187 = (Static61.anInt1698 << 7) - 1;
			}
			Static186.method3006();
			Static118.method2055();
			Static126.aClass66_5.method5044(local125, local127, local125 + local121, local123 + local127);
			Static126.aClass66_5.method4990();
			local323 = Static191.anInt3693;
			if (Static249.aClass107_1 == null) {
				Static126.aClass66_5.method5045(local323);
			} else {
				Static249.aClass107_1.method2640(Static328.anInt5668, Static292.anInt5205 << 3, local125, local323, Static260.anInt4728, local121, Static126.aClass66_5, local127, local123);
			}
			Static280.method4210();
			Static382.aClass5_4.method3833(Static157.anInt3220, Static367.anInt6653, Static229.anInt4187, -Static328.anInt5668 & 0x3FFF, -Static260.anInt4728 & 0x3FFF, -Static251.anInt6446 & 0x3FFF);
			Static126.aClass66_5.method5071(Static382.aClass5_4);
			Static126.aClass66_5.method5003(local125 + local121 / 2, local127 - -(local123 / 2), Static177.anInt7405 << 1, Static177.anInt7405 << 1);
			Static146.method2490(local127 + local123 / 2, Static177.anInt7405 << 1, Static177.anInt7405 << 1, local121 / 2 + local125);
			Static52.method1202(Static157.anInt3220, Static229.anInt4187, -Static260.anInt4728 & 0x3FFF, -Static328.anInt5668 & 0x3FFF, Static367.anInt6653, -Static251.anInt6446 & 0x3FFF);
			@Pc(548) byte local548 = Static291.aClass28_Sub1_1.method830(Static294.anInt5208) == 2 ? (byte) Static347.anInt6264 : 1;
			Static176.method2927(Static126.aClass66_5, Static66.anInt1741, Static143.anInt2942, Static382.aClass5_4, Static157.anInt3220, Static367.anInt6653, Static229.anInt4187, Static112.aByteArrayArrayArray4, Static332.anIntArray390, Static263.anIntArray322, Static368.anIntArray396, Static280.anIntArray336, Static222.anIntArray293, Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 + 1, local548, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7, !Static291.aClass28_Sub1_1.aBoolean80);
			Static280.method4210();
			if (Static217.anInt3941 == 30) {
				Static275.method4147(local125, local127, local123, local121);
				Static348.method5212(local127, local125, local123, local121);
				Static414.method5833(local127, local123, local125, local121);
				Static4.method6463(local127, local123, local121, local125);
			}
			Static181.method2961();
			Static367.anInt6653 = local166;
			Static157.anInt3220 = local133;
			Static260.anInt4728 = local280;
			Static229.anInt4187 = local276;
			Static328.anInt5668 = local278;
			if (Static65.aBoolean150 && Static443.aClass227_3.method5573() == 0) {
				Static65.aBoolean150 = false;
			}
			if (Static65.aBoolean150) {
				Static126.aClass66_5.method5035(local121, local127, -16777216, local125, local123);
				Static134.method2374(Static35.aClass29_1, Static54.aClass267_20.method6581(Static161.anInt3239), false);
			}
		} else {
			Static126.aClass66_5.method5035(arg0, arg3, -16777216, arg2, arg1);
		}
	}
}

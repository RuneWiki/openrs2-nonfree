import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method7967() {
		if (!Static162.aBoolean266) {
			return;
		}
		@Pc(12) Class381 local12 = Static347.method5333(Static607.anInt9574, Static227.anInt4416);
		if (local12 != null && local12.anObjectArray9 != null) {
			@Pc(23) Class6_Sub53 local23 = new Class6_Sub53();
			local23.aClass381_11 = local12;
			local23.anObjectArray3 = local12.anObjectArray9;
			Static301.method4842(local23);
		}
		Static270.anInt5047 = -1;
		Static162.aBoolean266 = false;
		Static475.anInt8093 = -1;
		if (local12 != null) {
			Static168.method3312(local12);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)I")
	public static int method7968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 4095 - arg1;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lclient!naa;")
	public static Class243 method7969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static334.aClass243ArrayArrayArray2[0][arg1][arg2] != null && Static334.aClass243ArrayArrayArray2[0][arg1][arg2].aClass243_1 != null;
			if (local33 && arg0 >= Static66.anInt802 - 1) {
				return null;
			}
			Static334.method5176(arg0, arg1, arg2);
		}
		return Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBI)I")
	public static int method7970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static226.anInt4403 == -1) {
			return 1;
		}
		if (arg0 != Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431()) {
			Static29.method338(Static50.aClass43_13.method596(Static601.anInt9518), arg0, true);
			if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != arg0) {
				return -1;
			}
		}
		try {
			@Pc(47) Dimension local47 = Static4.aCanvas1.getSize();
			Static562.method7944(Static507.aClass53_16, Static50.aClass43_13.method596(Static601.anInt9518), Static180.aClass67_5, Static202.aClass75_5, true);
			@Pc(63) Class316 local63 = Static347.method5332(Static226.anInt4403, Static517.aClass223_100);
			@Pc(66) long local66 = Static549.method7758();
			Static202.aClass75_5.la();
			Static373.aClass109_5.method4606(0, Static430.anInt3928, 0);
			Static202.aClass75_5.method6695(Static373.aClass109_5);
			Static202.aClass75_5.DA(local47.width / 2, local47.height / 2, 512, 512);
			Static202.aClass75_5.xa(1.0F);
			Static202.aClass75_5.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(113) Class54 local113 = Static202.aClass75_5.method6688(local63, 2048, 64, 64, 768);
			@Pc(115) int local115 = 0;
			label41: for (@Pc(117) int local117 = 0; local117 < 500; local117++) {
				Static202.aClass75_5.GA(0);
				Static202.aClass75_5.ya();
				for (@Pc(128) int local128 = 15; local128 >= 0; local128--) {
					for (@Pc(132) int local132 = 0; local132 <= local128; local132++) {
						Static635.aClass109_12.method4606((int) (((float) local132 - (float) local128 / 2.0F) * (float) Static234.anInt4537), 0, Static234.anInt4537 * (local128 + 1));
						local115++;
						local113.method7401(Static635.aClass109_12, (Class60_Sub10) null, 0);
						if ((long) arg1 <= Static549.method7758() - local66) {
							break label41;
						}
					}
				}
			}
			Static202.aClass75_5.method6645();
			@Pc(214) long local214 = (long) (local115 * 1000) / (Static549.method7758() - local66);
			Static202.aClass75_5.GA(0);
			Static202.aClass75_5.ya();
			return (int) local214;
		} catch (@Pc(225) Throwable local225) {
			local225.printStackTrace();
			return -1;
		}
	}
}

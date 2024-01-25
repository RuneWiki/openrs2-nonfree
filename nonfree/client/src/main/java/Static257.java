import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	public static int anInt4521;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public static int anInt4520 = 0;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "[B")
	public static final byte[] aByteArray76 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIZ)I")
	public static int method4004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class2_Sub1 local18 = Static72.method4067(arg0, arg2);
		if (local18 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local18.anIntArray15.length; local32++) {
				if (local18.anIntArray14[local32] == arg1) {
					local30 += local18.anIntArray15[local32];
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!kk;)V")
	public static void method4005(@OriginalArg(1) Class2_Sub16 arg0) {
		if (arg0.aByteArray112.length - arg0.anInt6145 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5350();
		if (local21 < 0 || local21 > 15) {
			return;
		}
		@Pc(36) byte local36;
		if (local21 == 15) {
			local36 = 37;
		} else if (local21 == 14) {
			local36 = 36;
		} else if (local21 == 13) {
			local36 = 35;
		} else if (local21 == 12) {
			local36 = 34;
		} else if (local21 == 11) {
			local36 = 33;
		} else if (local21 == 10) {
			local36 = 32;
		} else if (local21 == 9) {
			local36 = 31;
		} else if (local21 == 8) {
			local36 = 30;
		} else if (local21 == 7) {
			local36 = 29;
		} else if (local21 == 6) {
			local36 = 28;
		} else if (local21 == 5) {
			local36 = 28;
		} else if (local21 == 4) {
			local36 = 24;
		} else if (local21 == 3) {
			local36 = 23;
		} else if (local21 == 2) {
			local36 = 22;
		} else if (local21 == 1) {
			local36 = 23;
		} else {
			local36 = 19;
		}
		if (local36 > arg0.aByteArray112.length - arg0.anInt6145) {
			return;
		}
		Static3.anInt131 = arg0.method5350();
		if (Static3.anInt131 < 1) {
			Static3.anInt131 = 1;
		} else if (Static3.anInt131 > 4) {
			Static3.anInt131 = 4;
		}
		Static127.method2517(arg0.method5350() == 1);
		Static272.aBoolean352 = arg0.method5350() == 1;
		Static349.aBoolean351 = arg0.method5350() == 1;
		Static6.aBoolean21 = arg0.method5350() == 1;
		Static116.anInt2496 = arg0.method5350() == 1 ? 1 : 0;
		Static10.aBoolean424 = arg0.method5350() == 1;
		Static187.aBoolean270 = arg0.method5350() == 1;
		Static178.aBoolean265 = arg0.method5350() == 1;
		Static202.anInt3721 = arg0.method5350();
		if (Static202.anInt3721 > 2) {
			Static202.anInt3721 = 2;
		}
		if (local21 < 2) {
			Static212.aBoolean293 = arg0.method5350() == 1;
			arg0.method5350();
		} else {
			Static212.aBoolean293 = arg0.method5350() == 1;
		}
		Static385.aBoolean467 = arg0.method5350() == 1;
		Static58.aBoolean89 = arg0.method5350() == 1;
		Static132.anInt2709 = arg0.method5350();
		if (Static132.anInt2709 > 2) {
			Static132.anInt2709 = 2;
		}
		Static131.anInt2686 = Static132.anInt2709;
		Static343.aBoolean422 = arg0.method5350() == 1;
		Static143.anInt2862 = arg0.method5350();
		if (Static143.anInt2862 > 127) {
			Static143.anInt2862 = 127;
		}
		Static322.anInt5529 = arg0.method5350();
		Static330.anInt5659 = arg0.method5350();
		if (Static330.anInt5659 > 127) {
			Static330.anInt5659 = 127;
		}
		if (local21 >= 1) {
			Static364.anInt6192 = arg0.method5312();
			Static132.anInt2711 = arg0.method5312();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method5350();
		}
		@Pc(403) int local403;
		if (local21 >= 4) {
			local403 = arg0.method5350();
			if (local403 < 0 || local403 > 2) {
				local403 = 0;
			}
			if (Static253.anInt4468 < 96) {
				local403 = 0;
			}
			Static133.method2603(local403);
		}
		if (local21 >= 5) {
			Static80.anInt1467 = arg0.method5346();
		}
		local403 = 0;
		if (local21 >= 6) {
			Static213.anInt3866 = local403 = arg0.method5350();
		}
		if (Static213.anInt3866 != 1 && Static213.anInt3866 != 2) {
			Static213.anInt3866 = 2;
		}
		if (local21 >= 7) {
			Static214.aBoolean294 = arg0.method5350() == 1;
		}
		if (local21 >= 8) {
			Static207.aBoolean371 = arg0.method5350() == 1;
		}
		if (local21 >= 9) {
			Static81.anInt1473 = arg0.method5350();
		}
		if (Static81.anInt1473 < 0 || Static81.anInt1473 > Static6.method149(Static253.anInt4468)) {
			Static81.anInt1473 = 0;
		}
		if (local21 >= 10) {
			Static262.aBoolean340 = arg0.method5350() != 0;
		}
		if (local21 >= 11) {
			Static278.aBoolean357 = arg0.method5350() != 0;
		}
		if (local21 >= 12) {
			Static116.anInt2496 = arg0.method5350();
		}
		if (Static116.anInt2496 < 0 || Static116.anInt2496 > 2) {
			Static116.anInt2496 = 1;
		}
		if (local21 >= 13) {
			Static358.aBoolean142 = arg0.method5350() == 1;
		}
		if (local21 >= 14) {
			Static182.anInt3879 = arg0.method5350();
		} else if (local403 == 0) {
			Static182.anInt3879 = 2;
		} else {
			Static182.anInt3879 = 1;
		}
		if (Static182.anInt3879 < 0 || Static182.anInt3879 > 3) {
			Static182.anInt3879 = 2;
		}
		if (local21 >= 15) {
			Static29.anInt617 = arg0.method5350();
			if (Static29.anInt617 < 0 || Static29.anInt617 > 4) {
				Static29.anInt617 = Static168.anInt3226 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILclient!dc;)J")
	public static long method4006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface2 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(12) long local12 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(23) Class172 local23 = Static221.aClass118_6.method2858(arg2.method5651());
		@Pc(44) long local44 = (long) (arg2.method5654() << 14 | arg1 | arg0 << 7 | arg2.method5650() << 20 | 0x40000000);
		if (local23.anInt4140 == 0) {
			local44 |= local14;
		}
		if (local23.anInt4111 == 1) {
			local44 |= local5;
		}
		if (local23.aBoolean316) {
			local44 |= local12;
		}
		return local44 | (long) arg2.method5651() << 32;
	}
}

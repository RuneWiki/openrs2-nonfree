import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZILclient!bj;I)V")
	public static void method1153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class36 local13 = arg2.method4014();
		@Pc(23) int local23 = arg2.anInt4340 - arg2.aClass251_7.anInt6475 & 0x3FFF;
		if (arg3 == -1) {
			if (local23 != 0 || arg2.anInt4370 > 25) {
				arg2.aBoolean340 = false;
				if (arg1 < 0 && local13.anInt680 != -1) {
					arg2.anInt4333 = local13.anInt680;
				} else if (arg1 <= 0 || local13.anInt660 == -1) {
					arg2.anInt4333 = local13.anInt663;
				} else {
					arg2.anInt4333 = local13.anInt660;
				}
			} else if (!arg2.aBoolean340 || !local13.method617(arg2.anInt4333)) {
				arg2.anInt4333 = local13.method618();
				arg2.aBoolean340 = arg2.anInt4333 != -1;
			}
		} else if (arg2.anInt4347 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(116) int local116 = Static81.anIntArray163[arg0] - arg2.aClass251_7.anInt6475 & 0x3FFF;
			arg2.aBoolean340 = false;
			if (arg3 == 2 && local13.anInt684 != -1) {
				if (local116 > 2048 && local116 <= 6144 && local13.anInt696 != -1) {
					arg2.anInt4333 = local13.anInt696;
				} else if (local116 >= 10240 && local116 < 14336 && local13.anInt659 != -1) {
					arg2.anInt4333 = local13.anInt659;
				} else if (local116 <= 6144 || local116 >= 10240 || local13.anInt665 == -1) {
					arg2.anInt4333 = local13.anInt684;
				} else {
					arg2.anInt4333 = local13.anInt665;
				}
			} else if (arg3 == 0 && local13.anInt686 != -1) {
				if (local116 > 2048 && local116 <= 6144 && local13.anInt685 != -1) {
					arg2.anInt4333 = local13.anInt685;
				} else if (local116 >= 10240 && local116 < 14336 && local13.anInt697 != -1) {
					arg2.anInt4333 = local13.anInt697;
				} else if (local116 <= 6144 || local116 >= 10240 || local13.anInt664 == -1) {
					arg2.anInt4333 = local13.anInt686;
				} else {
					arg2.anInt4333 = local13.anInt664;
				}
			} else if (local116 > 2048 && local116 <= 6144 && local13.anInt700 != -1) {
				arg2.anInt4333 = local13.anInt700;
			} else if (local116 >= 10240 && local116 < 14336 && local13.anInt662 != -1) {
				arg2.anInt4333 = local13.anInt662;
			} else if (local116 <= 6144 || local116 >= 10240 || local13.anInt693 == -1) {
				arg2.anInt4333 = local13.anInt663;
			} else {
				arg2.anInt4333 = local13.anInt693;
			}
		} else if (local23 == 0 && arg2.anInt4370 <= 25) {
			arg2.aBoolean340 = false;
			if (arg3 == 2 && local13.anInt684 != -1) {
				arg2.anInt4333 = local13.anInt684;
			} else if (arg3 == 0 && local13.anInt686 != -1) {
				arg2.anInt4333 = local13.anInt686;
			} else {
				arg2.anInt4333 = local13.anInt663;
			}
		} else {
			if (arg3 == 2 && local13.anInt684 != -1) {
				if (arg1 < 0 && local13.anInt676 != -1) {
					arg2.anInt4333 = local13.anInt676;
				} else if (arg1 <= 0 || local13.anInt675 == -1) {
					arg2.anInt4333 = local13.anInt684;
				} else {
					arg2.anInt4333 = local13.anInt675;
				}
			} else if (arg3 == 0 && local13.anInt686 != -1) {
				if (arg1 < 0 && local13.anInt666 != -1) {
					arg2.anInt4333 = local13.anInt666;
				} else if (arg1 <= 0 || local13.anInt698 == -1) {
					arg2.anInt4333 = local13.anInt686;
				} else {
					arg2.anInt4333 = local13.anInt698;
				}
			} else if (arg1 < 0 && local13.anInt667 != -1) {
				arg2.anInt4333 = local13.anInt667;
			} else if (arg1 <= 0 || local13.anInt691 == -1) {
				arg2.anInt4333 = local13.anInt663;
			} else {
				arg2.anInt4333 = local13.anInt691;
			}
			arg2.aBoolean340 = false;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V")
	public static void method1154(@OriginalArg(1) int arg0) {
		Static246.anInt4423 = arg0;
		Static179.anInt3177 = 3;
		Static384.anInt6421 = -1;
		Static296.anInt5113 = 100;
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
	public static void method1155() {
		if (Static389.aBoolean501) {
			return;
		}
		if (Static164.aClass154_Sub1_1.aBoolean466) {
			Static352.aFloat68 = (int) Static352.aFloat68 + 191 & 0xFFFFFF80;
		} else {
			Static37.aFloat7 += (24.0F - Static37.aFloat7) / 2.0F;
		}
		Static389.aBoolean501 = true;
		Static55.aBoolean64 = true;
	}
}

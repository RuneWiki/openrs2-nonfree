import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "Lclient!uq;")
	public static Class362 aClass362_120;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)I")
	public static int method6986() {
		if (Static264.aClass265_8 == null) {
			if (!Static532.aBoolean580 && Static562.aClass3_Sub5_Sub18_7 != null) {
				return Static562.aClass3_Sub5_Sub18_7.anInt9211;
			}
			@Pc(22) int local22 = Static627.aClass48_1.method7512();
			@Pc(26) int local26 = Static627.aClass48_1.method7511();
			@Pc(56) int local56;
			@Pc(58) int local58;
			@Pc(70) int local70;
			@Pc(135) Class3_Sub5_Sub18 local135;
			if (Static599.aBoolean544) {
				@Pc(130) Class85 local130;
				if (Static517.anInt8133 < local22 && Static532.anInt8336 + Static517.anInt8133 > local22) {
					local56 = -1;
					for (local58 = 0; local58 < Static610.anInt10153; local58++) {
						if (Static653.aBoolean735) {
							local70 = local58 * 16 + Static508.anInt8006 + 33;
							if (local70 - 13 < local26 && local26 <= local70 + 3) {
								local56 = local58;
							}
						} else {
							local70 = local58 * 16 + Static508.anInt8006 + 31;
							if (local70 - 13 < local26 && local26 <= local70 + 3) {
								local56 = local58;
							}
						}
					}
					if (local56 != -1) {
						local70 = 0;
						local130 = new Class85(Static287.aClass243_9);
						for (@Pc(238) Class3_Sub5_Sub13 local238 = (Class3_Sub5_Sub13) local130.method1735(); local238 != null; local238 = (Class3_Sub5_Sub13) local130.method1736()) {
							if (local70++ == local56) {
								return ((Class3_Sub5_Sub18) local238.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66).anInt9211;
							}
						}
					}
				} else if (Static352.aClass3_Sub5_Sub13_1 != null && Static453.anInt7304 < local22 && local22 < Static473.anInt7547 + Static453.anInt7304) {
					local56 = -1;
					for (local58 = 0; local58 < Static352.aClass3_Sub5_Sub13_1.anInt6245; local58++) {
						if (Static653.aBoolean735) {
							local70 = Static3.anInt15 + local58 * 16 + 33;
							if (local70 - 13 < local26 && local70 + 3 >= local26) {
								local56 = local58;
							}
						} else {
							local70 = local58 * 16 + Static3.anInt15 + 31;
							if (local26 > local70 - 13 && local70 + 3 >= local26) {
								local56 = local58;
							}
						}
					}
					if (local56 != -1) {
						local70 = 0;
						local130 = new Class85(Static352.aClass3_Sub5_Sub13_1.aClass243_10);
						for (local135 = (Class3_Sub5_Sub18) local130.method1735(); local135 != null; local135 = (Class3_Sub5_Sub18) local130.method1736()) {
							if (local56 == local70++) {
								return local135.anInt9211;
							}
						}
					}
				}
			} else if (local22 > Static517.anInt8133 && Static532.anInt8336 + Static517.anInt8133 > local22) {
				local56 = -1;
				for (local58 = 0; local58 < Static166.anInt3037; local58++) {
					if (Static653.aBoolean735) {
						local70 = Static508.anInt8006 + (Static166.anInt3037 - local58 - 1) * 16 + 33;
						if (local70 - 13 < local26 && local70 + 3 >= local26) {
							local56 = local58;
						}
					} else {
						local70 = Static508.anInt8006 + (Static166.anInt3037 - local58 - 1) * 16 + 31;
						if (local26 > local70 - 13 && local70 + 3 >= local26) {
							local56 = local58;
						}
					}
				}
				if (local56 != -1) {
					local70 = 0;
					@Pc(359) Class178 local359 = new Class178(Static582.aClass302_69);
					for (local135 = (Class3_Sub5_Sub18) local359.method4057(); local135 != null; local135 = (Class3_Sub5_Sub18) local359.method4058()) {
						if (local56 == local70++) {
							return local135.anInt9211;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIILclient!cf;)V")
	public static void method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34_Sub1_Sub2 arg3) {
		@Pc(4) Class368 local4 = Static172.method2744(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass34_Sub1_Sub2_1 = arg3;
		@Pc(16) int local16 = Static582.aClass35Array3 == Static368.aClass35Array1 ? 1 : 0;
		if (arg3.method7845()) {
			if (arg3.method7853()) {
				arg3.aClass34_Sub1_23 = Static218.aClass34_Sub1Array2[local16];
				Static218.aClass34_Sub1Array2[local16] = arg3;
				return;
			}
			arg3.aClass34_Sub1_23 = Static368.aClass34_Sub1Array3[local16];
			Static368.aClass34_Sub1Array3[local16] = arg3;
			Static182.aBoolean246 = true;
			return;
		}
		arg3.aClass34_Sub1_23 = Static392.aClass34_Sub1Array4[local16];
		Static392.aClass34_Sub1Array4[local16] = arg3;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!ofa;IILclient!ha;)V")
	public static void method6989(@OriginalArg(1) Class265 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3) {
		for (@Pc(19) int local19 = 63; local19 >= 0; local19--) {
			@Pc(37) int local37 = (local19 & 0x3F) << 10 | 0x380 | 0x3F;
			Static253.method3817(true, false);
			@Pc(45) int local45 = Static537.anIntArray457[local37];
			Static84.method1335(false, true);
			arg3.aa(arg2, ((63 - local19) * arg0.anInt6997 >> 6) + arg1, arg0.anInt7024, (arg0.anInt6997 >> 6) + 1, local45, 0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
	public static int anInt1217 = 0;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_14 = new Class218(85, 3);

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_15 = new Class218(10, 2);

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
	public static void method1275() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static443.aBoolean515) {
			if (Static227.aBoolean318) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if ((float) local7 > Static667.aFloat212) {
			Static667.aFloat212 = (float) local7;
		}
		if ((float) local9 < Static667.aFloat212) {
			Static667.aFloat212 = (float) local9;
		}
		while (Static618.aFloat207 >= 16384.0F) {
			Static618.aFloat207 -= 16384.0F;
		}
		while (Static618.aFloat207 < 0.0F) {
			Static618.aFloat207 += 16384.0F;
		}
		@Pc(62) int local62 = Static474.anInt7824 >> 9;
		@Pc(66) int local66 = Static350.anInt5703 >> 9;
		@Pc(74) int local74 = Static168.method3058(Static309.anInt5138, Static474.anInt7824, Static350.anInt5703);
		@Pc(76) int local76 = 0;
		@Pc(104) int local104;
		if (local62 > 3 && local66 > 3 && Static158.anInt927 - 4 > local62 && Static515.anInt8292 - 4 > local66) {
			for (local104 = local62 - 4; local104 <= local62 + 4; local104++) {
				for (@Pc(110) int local110 = local66 - 4; local110 <= local66 + 4; local110++) {
					@Pc(114) int local114 = Static309.anInt5138;
					if (local114 < 3 && Static488.method7052(local104, local110)) {
						local114++;
					}
					@Pc(127) int local127 = 0;
					if (Static239.aClass73_Sub1_1.aByteArrayArrayArray8 != null && Static239.aClass73_Sub1_1.aByteArrayArrayArray8[local114] != null) {
						local127 = (Static239.aClass73_Sub1_1.aByteArrayArrayArray8[local114][local104][local110] & 0xFF) * 8 << 2;
					}
					if (Static121.aClass21Array2 != null && Static121.aClass21Array2[local114] != null) {
						@Pc(169) int local169 = local127 + local74 - Static121.aClass21Array2[local114].method7973(local104, local110);
						if (local76 < local169) {
							local76 = local169;
						}
					}
				}
			}
		}
		local104 = (local76 >> 2) * 1536;
		if (local104 > 786432) {
			local104 = 786432;
		}
		if (local104 < 262144) {
			local104 = 262144;
		}
		if (Static106.anInt2202 < local104) {
			Static106.anInt2202 += (local104 - Static106.anInt2202) / 24;
		} else if (local104 < Static106.anInt2202) {
			Static106.anInt2202 += (local104 - Static106.anInt2202) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(B)Lclient!fi;")
	public static Class102 method1276() {
		try {
			return new Class102_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class102) Class.forName("Class102_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class102_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILclient!hj;III)V")
	public static void method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 < 1 || arg1 < 1 || Static158.anInt927 - 2 < arg4 || Static515.anInt8292 - 2 < arg1) {
			return;
		}
		if (Static15.aClass164ArrayArrayArray5 == null) {
			return;
		}
		@Pc(42) Interface11 local42 = Static239.aClass73_Sub1_1.method1817(arg0, arg3, arg4, arg1);
		if (local42 == null) {
			return;
		}
		if (local42 instanceof Class28_Sub1_Sub1_Sub5) {
			((Class28_Sub1_Sub1_Sub5) local42).method9223(arg2);
		} else if (local42 instanceof Class28_Sub1_Sub3_Sub1) {
			((Class28_Sub1_Sub3_Sub1) local42).method5857(arg2);
		} else if (local42 instanceof Class28_Sub1_Sub4_Sub1) {
			((Class28_Sub1_Sub4_Sub1) local42).method8241(arg2);
		} else if (local42 instanceof Class28_Sub1_Sub2_Sub1) {
			((Class28_Sub1_Sub2_Sub1) local42).method3200(arg2);
		}
	}
}

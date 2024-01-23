import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!fh;")
	public static Class58 aClass58_79;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
	public static boolean aBoolean277 = false;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "[S")
	public static short[] aShortArray74 = new short[256];

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	public static int anInt3920 = -1;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString231 = "flash3:";

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBIZ)I")
	public static int method3261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class4_Sub18 local12 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local12.anIntArray385.length; local26++) {
			if (local12.anIntArray385[local26] >= 0 && Static188.anInt6076 > local12.anIntArray385[local26]) {
				@Pc(61) Class165 local61 = Static287.method4398(local12.anIntArray385[local26]);
				if (local61.aClass85_22 != null) {
					@Pc(72) Class4_Sub32 local72 = (Class4_Sub32) local61.aClass85_22.method1845((long) arg0);
					if (local72 != null) {
						if (arg2) {
							local19 += local72.anInt5435 * local12.anIntArray386[local26];
						} else {
							local19 += local72.anInt5435;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public static void method3262() {
		if (Static22.anInt331 < 0) {
			Static22.anInt331 = 0;
			Static229.anInt4394 = -1;
			Static16.anInt929 = -1;
		}
		if (Static22.anInt331 > Static121.anInt2965) {
			Static22.anInt331 = Static121.anInt2965;
			Static16.anInt929 = -1;
			Static229.anInt4394 = -1;
		}
		if (Static275.anInt5232 < 0) {
			Static229.anInt4394 = -1;
			Static275.anInt5232 = 0;
			Static16.anInt929 = -1;
		}
		if (Static121.anInt2960 < Static275.anInt5232) {
			Static16.anInt929 = -1;
			Static229.anInt4394 = -1;
			Static275.anInt5232 = Static121.anInt2960;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIZLclient!fh;)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class58 arg2) {
		Static63.anInt1244 = 0;
		Static287.anInt5392 = arg0;
		Static107.anInt5398 = 10000;
		Static310.anInt6026 = arg1;
		Static85.aClass58_42 = arg2;
		Static242.aBoolean322 = false;
		Static227.anInt4358 = 1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public static void method3265() {
		if (Static198.aFloat147 < 128.0F) {
			Static198.aFloat147 = 128.0F;
		}
		@Pc(12) int local12 = Static289.anInt5413 >> 7;
		if (Static198.aFloat147 > 383.0F) {
			Static198.aFloat147 = 383.0F;
		}
		while (Static202.aFloat97 >= 2048.0F) {
			Static202.aFloat97 -= 2048.0F;
		}
		@Pc(33) int local33 = Static127.anInt2496 >> 7;
		@Pc(35) int local35 = 0;
		while (Static202.aFloat97 < 0.0F) {
			Static202.aFloat97 += 2048.0F;
		}
		@Pc(63) int local63 = Static33.method522(Static127.anInt2496, Static289.anInt5413, Static281.anInt5335);
		@Pc(85) int local85;
		if (local12 > 3 && local33 > 3 && local12 < 100 && local33 < 100) {
			for (local85 = local12 - 4; local85 <= local12 + 4; local85++) {
				for (@Pc(98) int local98 = local33 - 4; local98 <= local33 + 4; local98++) {
					@Pc(109) int local109 = Static281.anInt5335;
					if (local109 < 3 && (Static174.aByteArrayArrayArray17[1][local85][local98] & 0x2) == 2) {
						local109++;
					}
					@Pc(148) int local148 = local63 + (Static174.aByteArrayArrayArray16[local109][local85][local98] & 0xFF) * 8 - Static243.anIntArrayArrayArray13[local109][local85][local98];
					if (local148 > local35) {
						local35 = local148;
					}
				}
			}
		}
		local85 = local35 * 192;
		if (local85 > 98048) {
			local85 = 98048;
		}
		if (local85 < 32768) {
			local85 = 32768;
		}
		if (local85 > Static38.anInt626) {
			Static38.anInt626 += (local85 - Static38.anInt626) / 24;
		} else if (Static38.anInt626 > local85) {
			Static38.anInt626 += (local85 - Static38.anInt626) / 80;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public static void method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class4_Sub19 local30 = Static6.aClass4_Sub19ArrayArrayArray1[local9][arg0][arg1] = Static6.aClass4_Sub19ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt3552--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt3554; local40++) {
					@Pc(49) Class33 local49 = local30.aClass33Array3[local40];
					if ((local49.aLong38 >> 29 & 0x3L) == 2L && local49.anInt824 == arg0 && local49.anInt826 == arg1) {
						local49.anInt819--;
					}
				}
			}
		}
		if (Static6.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1] == null) {
			Static6.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1] = new Class4_Sub19(0, arg0, arg1);
		}
		Static6.aClass4_Sub19ArrayArrayArray1[0][arg0][arg1].aClass4_Sub19_1 = local7;
		Static6.aClass4_Sub19ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I")
	public static int method3270(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
	public static void method3271() {
		Static33.aClass26_6.method515();
	}
}

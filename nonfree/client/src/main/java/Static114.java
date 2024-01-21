import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!gf;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 aClass1_Sub1_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1546 = Static106.method1849("Loading interfaces )2 ");

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1547 = aClass66_1546;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public static int anInt2711 = -1;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	public static int anInt2712 = 0;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1548 = Static106.method1849("leuchten1:");

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1549 = Static106.method1849("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1550 = Static106.method1849(")1j");

	@OriginalMember(owner = "client!te", name = "k", descriptor = "[J")
	public static long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method1923() {
		aClass1_Sub1_Sub2_Sub2_Sub1_4 = null;
		aClass66_1547 = null;
		aClass66_1548 = null;
		aClass66_1549 = null;
		aClass66_1546 = null;
		aClass66_1550 = null;
		aLongArray9 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILclient!hd;)V")
	public static void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub5_Sub2 arg2) {
		if (arg0 == arg2.anInt1266 && arg0 != -1) {
			@Pc(19) int local19 = Static56.method1247(arg0).anInt2658;
			if (local19 == 1) {
				arg2.anInt1293 = 0;
				arg2.anInt1246 = 0;
				arg2.anInt1257 = arg1;
				arg2.anInt1259 = 0;
			}
			if (local19 == 2) {
				arg2.anInt1293 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt1266 == -1 || Static56.method1247(arg0).anInt2659 >= Static56.method1247(arg2.anInt1266).anInt2659) {
			arg2.anInt1266 = arg0;
			arg2.anInt1257 = arg1;
			arg2.anInt1246 = 0;
			arg2.anInt1284 = arg2.anInt1237;
			arg2.anInt1259 = 0;
			arg2.anInt1293 = 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method1925() {
		Static34.aClass60_10.method1747();
		Static8.aClass60_23.method1747();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
	public static int method1926() {
		@Pc(12) int local12 = 3;
		if (Static131.anInt2696 < 310) {
			@Pc(21) int local21 = Static122.anInt2830 >> 7;
			@Pc(25) int local25 = Static1.anInt70 >> 7;
			@Pc(30) int local30 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 >> 7;
			if ((Static87.aByteArrayArrayArray15[Static22.anInt635][local21][local25] & 0x4) != 0) {
				local12 = Static22.anInt635;
			}
			@Pc(50) int local50;
			if (local30 <= local21) {
				local50 = local21 - local30;
			} else {
				local50 = local30 - local21;
			}
			@Pc(62) int local62 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 >> 7;
			@Pc(74) int local74;
			if (local25 < local62) {
				local74 = local62 - local25;
			} else {
				local74 = local25 - local62;
			}
			@Pc(93) int local93;
			@Pc(95) int local95;
			if (local74 < local50) {
				local93 = local74 * 65536 / local50;
				local95 = 32768;
				while (local30 != local21) {
					if (local30 > local21) {
						local21++;
					} else if (local21 > local30) {
						local21--;
					}
					if ((Static87.aByteArrayArrayArray15[Static22.anInt635][local21][local25] & 0x4) != 0) {
						local12 = Static22.anInt635;
					}
					local95 += local93;
					if (local95 >= 65536) {
						if (local25 < local62) {
							local25++;
						} else if (local25 > local62) {
							local25--;
						}
						if ((Static87.aByteArrayArrayArray15[Static22.anInt635][local21][local25] & 0x4) != 0) {
							local12 = Static22.anInt635;
						}
						local95 -= 65536;
					}
				}
			} else {
				local95 = 32768;
				local93 = local50 * 65536 / local74;
				while (local25 != local62) {
					local95 += local93;
					if (local25 < local62) {
						local25++;
					} else if (local25 > local62) {
						local25--;
					}
					if ((Static87.aByteArrayArrayArray15[Static22.anInt635][local21][local25] & 0x4) != 0) {
						local12 = Static22.anInt635;
					}
					if (local95 >= 65536) {
						if (local30 > local21) {
							local21++;
						} else if (local30 < local21) {
							local21--;
						}
						local95 -= 65536;
						if ((Static87.aByteArrayArrayArray15[Static22.anInt635][local21][local25] & 0x4) != 0) {
							local12 = Static22.anInt635;
						}
					}
				}
			}
		}
		if ((Static87.aByteArrayArrayArray15[Static22.anInt635][Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 >> 7][Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 >> 7] & 0x4) != 0) {
			local12 = Static22.anInt635;
		}
		return local12;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!sf;Lclient!sf;Lclient!sf;I)V")
	public static void method1927(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class5 arg2) {
		Static18.aClass5_18 = arg2;
		Static63.aClass5_56 = arg1;
		Static4.aClass5_7 = arg0;
	}
}

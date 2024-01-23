import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_795 = Static184.method2923("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!id;")
	public static Class43 aClass43_11 = new Class43(64);

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_796 = Static184.method2923("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!wi;")
	public static Class108 aClass108_10 = new Class108();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method1955(@OriginalArg(0) int arg0) {
		if (arg0 == Static203.anInt4533) {
			return;
		}
		if (Static203.anInt4533 == 0) {
			Static119.method2006();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static103.anInt2513 = 0;
			Static5.anInt276 = 0;
			Static173.anInt4080 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static78.aClass63_2 != null) {
			Static78.aClass63_2.method2043();
			Static78.aClass63_2 = null;
		}
		if (Static203.anInt4533 == 25) {
			Static99.anInt2417 = 0;
			Static179.anInt4149 = 0;
			Static131.anInt3009 = 1;
			Static128.anInt2989 = 1;
			Static173.anInt4078 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static163.method2659(Static8.aClass15_Sub1_10, Static139.aCanvas1, Static200.aClass15_Sub1_125);
		} else {
			Static178.method2846();
		}
		Static203.anInt4533 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
	public static int method1957(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static208.method3220(arg0);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
	public static int method1959() {
		@Pc(13) int local13 = 3;
		if (Static183.anInt1325 < 310) {
			@Pc(22) int local22 = Static69.anInt1817 >> 7;
			@Pc(26) int local26 = Static163.anInt3822 >> 7;
			@Pc(31) int local31 = Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7;
			if ((Static102.aByteArrayArrayArray7[Static134.anInt3147][local22][local26] & 0x4) != 0) {
				local13 = Static134.anInt3147;
			}
			@Pc(51) int local51;
			if (local22 < local31) {
				local51 = local31 - local22;
			} else {
				local51 = local22 - local31;
			}
			@Pc(62) int local62 = Static213.aClass12_Sub3_Sub1_1.anInt3949 >> 7;
			@Pc(70) int local70;
			if (local62 > local26) {
				local70 = local62 - local26;
			} else {
				local70 = local26 - local62;
			}
			@Pc(90) int local90;
			@Pc(92) int local92;
			if (local70 >= local51) {
				local90 = local51 * 65536 / local70;
				local92 = 32768;
				while (local62 != local26) {
					if (local62 > local26) {
						local26++;
					} else if (local26 > local62) {
						local26--;
					}
					local92 += local90;
					if ((Static102.aByteArrayArrayArray7[Static134.anInt3147][local22][local26] & 0x4) != 0) {
						local13 = Static134.anInt3147;
					}
					if (local92 >= 65536) {
						local92 -= 65536;
						if (local31 > local22) {
							local22++;
						} else if (local31 < local22) {
							local22--;
						}
						if ((Static102.aByteArrayArrayArray7[Static134.anInt3147][local22][local26] & 0x4) != 0) {
							local13 = Static134.anInt3147;
						}
					}
				}
			} else {
				local90 = local70 * 65536 / local51;
				local92 = 32768;
				while (local22 != local31) {
					if (local22 < local31) {
						local22++;
					} else if (local22 > local31) {
						local22--;
					}
					local92 += local90;
					if ((Static102.aByteArrayArrayArray7[Static134.anInt3147][local22][local26] & 0x4) != 0) {
						local13 = Static134.anInt3147;
					}
					if (local92 >= 65536) {
						if (local26 < local62) {
							local26++;
						} else if (local26 > local62) {
							local26--;
						}
						if ((Static102.aByteArrayArrayArray7[Static134.anInt3147][local22][local26] & 0x4) != 0) {
							local13 = Static134.anInt3147;
						}
						local92 -= 65536;
					}
				}
			}
		}
		if ((Static102.aByteArrayArrayArray7[Static134.anInt3147][Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7][Static213.aClass12_Sub3_Sub1_1.anInt3949 >> 7] & 0x4) != 0) {
			local13 = Static134.anInt3147;
		}
		return local13;
	}
}

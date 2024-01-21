import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt169;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public static int anInt177;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_7;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_92 = Static2.method59("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt168 = 0;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt170 = 0;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt172 = 0;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_94 = Static2.method59("Loading config )2 ");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_93 = aClass80_94;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "J")
	public static long aLong8 = 0L;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
	public static int method104() {
		@Pc(13) int local13 = 3;
		if (Static82.anInt3082 < 310) {
			@Pc(20) int local20 = Static53.anInt1647 >> 7;
			@Pc(24) int local24 = Static42.anInt1257 >> 7;
			@Pc(29) int local29 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 >> 7;
			@Pc(34) int local34 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 >> 7;
			@Pc(42) int local42;
			if (local34 <= local24) {
				local42 = local24 - local34;
			} else {
				local42 = local34 - local24;
			}
			@Pc(60) int local60;
			if (local29 > local20) {
				local60 = local29 - local20;
			} else {
				local60 = local20 - local29;
			}
			if ((Static108.aByteArrayArrayArray7[Static16.anInt444][local20][local24] & 0x4) != 0) {
				local13 = Static16.anInt444;
			}
			@Pc(95) int local95;
			@Pc(97) int local97;
			if (local60 > local42) {
				local95 = local42 * 65536 / local60;
				local97 = 32768;
				while (local20 != local29) {
					local97 += local95;
					if (local29 > local20) {
						local20++;
					} else if (local29 < local20) {
						local20--;
					}
					if ((Static108.aByteArrayArrayArray7[Static16.anInt444][local20][local24] & 0x4) != 0) {
						local13 = Static16.anInt444;
					}
					if (local97 >= 65536) {
						local97 -= 65536;
						if (local34 > local24) {
							local24++;
						} else if (local34 < local24) {
							local24--;
						}
						if ((Static108.aByteArrayArrayArray7[Static16.anInt444][local20][local24] & 0x4) != 0) {
							local13 = Static16.anInt444;
						}
					}
				}
			} else {
				local95 = local60 * 65536 / local42;
				local97 = 32768;
				while (local24 != local34) {
					if (local24 < local34) {
						local24++;
					} else if (local24 > local34) {
						local24--;
					}
					if ((Static108.aByteArrayArrayArray7[Static16.anInt444][local20][local24] & 0x4) != 0) {
						local13 = Static16.anInt444;
					}
					local97 += local95;
					if (local97 >= 65536) {
						local97 -= 65536;
						if (local29 > local20) {
							local20++;
						} else if (local20 > local29) {
							local20--;
						}
						if ((Static108.aByteArrayArrayArray7[Static16.anInt444][local20][local24] & 0x4) != 0) {
							local13 = Static16.anInt444;
						}
					}
				}
			}
		}
		if ((Static108.aByteArrayArrayArray7[Static16.anInt444][Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 >> 7][Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 >> 7] & 0x4) != 0) {
			local13 = Static16.anInt444;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JB)V")
	public static void method105(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method106() {
		aClass80_92 = null;
		aClass2_Sub1_Sub9_Sub3_7 = null;
		aClass80_93 = null;
		aClass80_94 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!wi", name = "gb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2608 = Static118.method2249("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!wi", name = "hb", descriptor = "I")
	public static int anInt4461 = 0;

	@OriginalMember(owner = "client!wi", name = "kb", descriptor = "I")
	public static final int anInt4464 = 5063219;

	@OriginalMember(owner = "client!wi", name = "pb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2609 = Static118.method2249("<br>(X100(U(Y");

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V")
	public static void method3315() {
		@Pc(13) int local13 = Static94.anInt2345 - (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
		@Pc(22) int local22 = Static94.anInt2345 + (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
		if (local13 < 0) {
			Static119.anInt2954 = -1;
			Static94.anInt2345 = (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
			Static90.anInt4438 = -1;
		}
		@Pc(50) int local50 = Static23.anInt692 - (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
		if (local22 > Static190.anInt4160) {
			Static90.anInt4438 = -1;
			Static94.anInt2345 = Static190.anInt4160 - (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
			Static119.anInt2954 = -1;
		}
		@Pc(81) int local81 = Static23.anInt692 + (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
		if (local50 < 0) {
			Static23.anInt692 = (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
			Static119.anInt2954 = -1;
			Static90.anInt4438 = -1;
		}
		if (Static25.anInt737 < local81) {
			Static90.anInt4438 = -1;
			Static23.anInt692 = Static25.anInt737 - (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
			Static119.anInt2954 = -1;
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)I")
	public static int method3316(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)I")
	public static int method3317(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "(B)Z")
	public static boolean method3319() {
		try {
			if (Static191.anInt4167 == 2) {
				if (Static16.aClass1_Sub11_1 == null) {
					Static16.aClass1_Sub11_1 = Static214.method1340(Static62.aClass60_14, Static163.anInt3686, Static42.anInt1110);
					if (Static16.aClass1_Sub11_1 == null) {
						return false;
					}
				}
				if (Static31.aClass50_1 == null) {
					Static31.aClass50_1 = new Class50(Static52.aClass60_11, Static172.aClass60_32);
				}
				if (Static63.aClass1_Sub6_Sub2_1.method2071(Static31.aClass50_1, Static74.aClass60_17, Static16.aClass1_Sub11_1)) {
					Static63.aClass1_Sub6_Sub2_1.method2078();
					Static63.aClass1_Sub6_Sub2_1.method2070(Static200.anInt4299);
					Static63.aClass1_Sub6_Sub2_1.method2057(Static16.aClass1_Sub11_1, Static70.aBoolean78);
					Static62.aClass60_14 = null;
					Static191.anInt4167 = 0;
					Static16.aClass1_Sub11_1 = null;
					Static31.aClass50_1 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static63.aClass1_Sub6_Sub2_1.method2048();
			Static62.aClass60_14 = null;
			Static31.aClass50_1 = null;
			Static16.aClass1_Sub11_1 = null;
			Static191.anInt4167 = 0;
		}
		return false;
	}
}

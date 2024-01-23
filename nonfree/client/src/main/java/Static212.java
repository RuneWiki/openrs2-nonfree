import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
	public static int anInt4630;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Lclient!hc;")
	public static Class51 aClass51_68;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
	public static int anInt4622 = 0;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Lclient!lc;")
	public static Class79 aClass79_31 = new Class79(32);

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "[I")
	public static int[] anIntArray355 = new int[2];

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
	public static int anInt4628 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!hc;B)V")
	public static void method3501(@OriginalArg(0) Class51 arg0) {
		Static255.aClass51_82 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
	public static void method3502() {
		Static57.aClass79_7.method2487();
		Static247.aClass79_37.method2487();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public static int method3503(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
	public static void method3504() {
		Static236.aClass79_35.method2489();
		Static166.aClass79_25.method2489();
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
	public static void method3505() {
		try {
			if (Static143.anInt3473 == 1) {
				@Pc(12) int local12 = Static13.aClass1_Sub4_Sub2_1.method1221();
				if (local12 > 0 && Static13.aClass1_Sub4_Sub2_1.method1241()) {
					local12 -= Static77.anInt2101;
					if (local12 < 0) {
						local12 = 0;
					}
					Static13.aClass1_Sub4_Sub2_1.method1239(local12);
					return;
				}
				Static13.aClass1_Sub4_Sub2_1.method1220();
				Static13.aClass1_Sub4_Sub2_1.method1216();
				if (Static39.aClass51_14 == null) {
					Static143.anInt3473 = 0;
				} else {
					Static143.anInt3473 = 2;
				}
				Static251.aClass1_Sub26_2 = null;
				Static184.aClass149_1 = null;
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static13.aClass1_Sub4_Sub2_1.method1220();
			Static39.aClass51_14 = null;
			Static184.aClass149_1 = null;
			Static251.aClass1_Sub26_2 = null;
			Static143.anInt3473 = 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)V")
	public static void method3506() {
		@Pc(7) Class147 local7 = Static240.aClass147_1;
		synchronized (Static240.aClass147_1) {
			Static148.anInt413++;
			Static33.anInt5180 = Static143.anInt3471;
			@Pc(31) int local31;
			if (Static12.anInt503 >= 0) {
				while (Static246.anInt5268 != Static12.anInt503) {
					local31 = Static44.anIntArray101[Static246.anInt5268];
					Static246.anInt5268 = Static246.anInt5268 + 1 & 0x7F;
					if (local31 < 0) {
						Static124.aBooleanArray7[~local31] = false;
					} else {
						Static124.aBooleanArray7[local31] = true;
					}
				}
			} else {
				for (local31 = 0; local31 < 112; local31++) {
					Static124.aBooleanArray7[local31] = false;
				}
				Static12.anInt503 = Static246.anInt5268;
			}
			Static143.anInt3471 = Static118.anInt3084;
		}
	}
}

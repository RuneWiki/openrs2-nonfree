import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1227 = Static177.method3050("p11_full");

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1228 = Static177.method3050("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1229 = Static177.method3050("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1230 = Static177.method3050(")1");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method2450() {
		if (!Static64.aBoolean76) {
			Static3.anInt86 = 1;
			Static83.aClass46Array15[0] = Static93.aClass46_863;
			Static11.aShortArray5[0] = 1003;
			Static166.aClass46Array24[0] = Static3.aClass46_44;
		}
		if (Static174.anInt3902 != -1) {
			Static165.method2753(Static174.anInt3902);
		}
		for (@Pc(30) int local30 = 0; local30 < Static59.anInt1457; local30++) {
			if (Static50.aBooleanArray8[local30]) {
				Static38.aBooleanArray5[local30] = true;
			}
			Static153.aBooleanArray14[local30] = Static50.aBooleanArray8[local30];
			Static50.aBooleanArray8[local30] = false;
		}
		Static175.anInt3926 = -1;
		Static123.anInt2971 = -1;
		Static140.anInt3262 = Static142.anInt3325;
		Static143.aClass1_43 = null;
		if (Static174.anInt3902 != -1) {
			Static59.anInt1457 = 0;
			Static83.method1678(0, 503, Static174.anInt3902, 765, 0, 0, 0, -1);
		}
		Static145.method2929();
		Static186.method3141();
		if (Static64.aBoolean76) {
			Static76.method3014();
		} else if (Static123.anInt2971 != -1) {
			Static28.method495(Static123.anInt2971, Static175.anInt3926);
		}
		if (Static127.anInt3025 == 3) {
			for (@Pc(111) int local111 = 0; local111 < Static59.anInt1457; local111++) {
				if (Static153.aBooleanArray14[local111]) {
					Static145.method2931(Static121.anIntArray275[local111], Static167.anIntArray362[local111], Static66.anIntArray165[local111], Static180.anIntArray432[local111], 16711935, 128);
				} else if (Static38.aBooleanArray5[local111]) {
					Static145.method2931(Static121.anIntArray275[local111], Static167.anIntArray362[local111], Static66.anIntArray165[local111], Static180.anIntArray432[local111], 16711680, 128);
				}
			}
		}
		Static116.method2121(Static73.anInt1873, Static68.anInt1847, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832);
		Static68.anInt1847 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!nh;Z)V")
	public static void method2455(@OriginalArg(0) Class62 arg0) {
		Static33.aClass62_9 = arg0;
		Static10.anInt355 = Static33.aClass62_9.method2865(16);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3 method2456() {
		@Pc(8) Class4_Sub1_Sub7_Sub3 local8 = new Class4_Sub1_Sub7_Sub3();
		local8.anInt3484 = Static107.anIntArray248[0];
		local8.anInt3482 = Static35.anIntArray81[0];
		local8.anInt3483 = Static137.anInt3248;
		local8.anIntArray327 = Static110.anIntArray253;
		local8.anInt3485 = Static137.anIntArray312[0];
		local8.anInt3486 = Static131.anInt3136;
		local8.aByteArray39 = Static12.aByteArrayArray1[0];
		local8.anInt3487 = Static55.anIntArray147[0];
		Static130.method2308();
		return local8;
	}
}

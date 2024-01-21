import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!td;")
	public static Class54 aClass54_25;

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
	public static int anInt1832;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_874 = Static87.method1648("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static int anInt1815 = -1;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public static final int anInt1823 = 20;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
	public static int[] anIntArray308 = new int[128];

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public static int anInt1825 = 0;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!hb;")
	public static Class27 aClass27_875 = Static87.method1648("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
	public static int anInt1829 = 0;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_876 = Static87.method1648("Registrierter Benutzer");

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "[J")
	public static long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!hb;")
	public static Class27 aClass27_877 = Static87.method1648("mapfunction");

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "Lclient!hb;")
	private static Class27 aClass27_878 = Static87.method1648("Message");

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "Lclient!hb;")
	public static Class27 aClass27_879 = aClass27_878;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1273() {
		aClass27_874 = null;
		aClass27_876 = null;
		aClass27_878 = null;
		aClass54_25 = null;
		anIntArray308 = null;
		aClass27_875 = null;
		aClass27_877 = null;
		anIntArray307 = null;
		aLongArray10 = null;
		aClass27_879 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V")
	public static void method1274() {
		Static43.method903(null, 0, false, 10);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!jb;Ljava/awt/Component;I)Lclient!ab;")
	public static Class3_Sub1_Sub1 method1275(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Component arg1) {
		Static42.method893(arg1, arg0);
		@Pc(15) Class3_Sub1_Sub1 local15 = new Class3_Sub1_Sub1();
		Static11.method1866(local15);
		return local15;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1276() {
		if (aBoolean94 && Static13.anInt767 != Static68.anInt1747) {
			Static102.method1832(Static13.anInt762, Static68.anInt1747, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], Static106.anInt831, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0]);
		} else if (Static68.anInt1747 != Static87.anInt2341) {
			Static87.anInt2341 = Static68.anInt1747;
			Static109.method1438(Static68.anInt1747);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ja;B)V")
	public static void method1277(@OriginalArg(0) Class3_Sub3_Sub1_Sub4 arg0) {
		arg0.anInt2390 = arg0.anInt2410;
		if (arg0.anInt2405 == 0) {
			arg0.anInt2387 = 0;
			return;
		}
		if (arg0.anInt2430 != -1 && arg0.anInt2388 == 0) {
			@Pc(37) Class3_Sub3_Sub14 local37 = Static16.method298(arg0.anInt2430);
			if (arg0.anInt2420 > 0 && local37.anInt2616 == 0) {
				arg0.anInt2387++;
				return;
			}
			if (arg0.anInt2420 <= 0 && local37.anInt2607 == 0) {
				arg0.anInt2387++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt2408;
		@Pc(72) int local72 = arg0.anInt2399;
		@Pc(93) int local93 = arg0.anInt2435 * 64 + arg0.anIntArray357[arg0.anInt2405 - 1] * 128;
		@Pc(108) int local108 = arg0.anIntArray359[arg0.anInt2405 - 1] * 128 + arg0.anInt2435 * 64;
		if (local108 - local69 > 256 || local108 - local69 < -256 || local93 - local72 > 256 || local93 - local72 < -256) {
			arg0.anInt2408 = local108;
			arg0.anInt2399 = local93;
			return;
		}
		if (local69 < local108) {
			if (local93 > local72) {
				arg0.anInt2422 = 1280;
			} else if (local72 > local93) {
				arg0.anInt2422 = 1792;
			} else {
				arg0.anInt2422 = 1536;
			}
		} else if (local69 > local108) {
			if (local93 > local72) {
				arg0.anInt2422 = 768;
			} else if (local72 <= local93) {
				arg0.anInt2422 = 512;
			} else {
				arg0.anInt2422 = 256;
			}
		} else if (local93 > local72) {
			arg0.anInt2422 = 1024;
		} else if (local72 > local93) {
			arg0.anInt2422 = 0;
		}
		@Pc(219) int local219 = arg0.anInt2398;
		@Pc(228) int local228 = arg0.anInt2422 - arg0.anInt2432 & 0x7FF;
		if (local228 > 1024) {
			local228 -= 2048;
		}
		if (local228 >= -256 && local228 <= 256) {
			local219 = arg0.anInt2411;
		} else if (local228 >= 256 && local228 < 768) {
			local219 = arg0.anInt2375;
		} else if (local228 >= -768 && local228 <= -256) {
			local219 = arg0.anInt2431;
		}
		if (local219 == -1) {
			local219 = arg0.anInt2411;
		}
		@Pc(279) int local279 = 4;
		arg0.anInt2390 = local219;
		if (arg0.anInt2432 != arg0.anInt2422 && arg0.anInt2403 == -1 && arg0.anInt2401 != 0) {
			local279 = 2;
		}
		if (arg0.anInt2405 > 2) {
			local279 = 6;
		}
		if (arg0.anInt2405 > 3) {
			local279 = 8;
		}
		if (arg0.anInt2387 > 0 && arg0.anInt2405 > 1) {
			arg0.anInt2387--;
			local279 = 8;
		}
		if (arg0.aBooleanArray12[arg0.anInt2405 - 1]) {
			local279 <<= 0x1;
		}
		if (local69 < local108) {
			arg0.anInt2408 += local279;
			if (arg0.anInt2408 > local108) {
				arg0.anInt2408 = local108;
			}
		} else if (local69 > local108) {
			arg0.anInt2408 -= local279;
			if (local108 > arg0.anInt2408) {
				arg0.anInt2408 = local108;
			}
		}
		if (local279 >= 8 && arg0.anInt2411 == arg0.anInt2390 && arg0.anInt2418 != -1) {
			arg0.anInt2390 = arg0.anInt2418;
		}
		if (local72 < local93) {
			arg0.anInt2399 += local279;
			if (local93 < arg0.anInt2399) {
				arg0.anInt2399 = local93;
			}
		} else if (local93 < local72) {
			arg0.anInt2399 -= local279;
			if (arg0.anInt2399 < local93) {
				arg0.anInt2399 = local93;
			}
		}
		if (local108 == arg0.anInt2408 && local93 == arg0.anInt2399) {
			if (arg0.anInt2420 > 0) {
				arg0.anInt2420--;
			}
			arg0.anInt2405--;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Lclient!le;")
	public static Class3_Sub3_Sub5 method1278(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub5 local10 = (Class3_Sub3_Sub5) Static47.aClass21_17.method658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static28.aClass54_14.method1615(16, arg0);
		local10 = new Class3_Sub3_Sub5();
		if (local20 != null) {
			local10.method1141(new Class3_Sub11(local20));
		}
		Static47.aClass21_17.method660(local10, (long) arg0);
		return local10;
	}
}

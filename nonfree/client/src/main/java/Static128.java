import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!se;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!p", name = "D", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1114 = Static177.method3050(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!p", name = "I", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1116 = Static177.method3050("wave2:");

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1115 = aClass46_1116;

	@OriginalMember(owner = "client!p", name = "M", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1118 = Static177.method3050("Loading )2 please wait)3");

	@OriginalMember(owner = "client!p", name = "J", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1117 = aClass46_1118;

	@OriginalMember(owner = "client!p", name = "P", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1119 = Static177.method3050("Fps:");

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
	public static int anInt3049 = 0;

	@OriginalMember(owner = "client!p", name = "S", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1120 = aClass46_1116;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	public static void method2253() {
		Static107.anInt2652 = 0;
		Static89.anInt2295 = -1;
		Static55.anInt1368 = -1;
		Static132.anInt3166 = 0;
		Static40.anInt1045 = -1;
		Static3.anInt86 = 0;
		Static123.anInt2973 = 0;
		Static64.aBoolean76 = false;
		Static4.anInt2846 = 0;
		Static90.aClass4_Sub11_Sub1_1.anInt1597 = 0;
		Static3.anInt83 = -1;
		Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
		Static27.anInt743 = 0;
		for (@Pc(40) int local40 = 0; local40 < Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1.length; local40++) {
			if (Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local40] != null) {
				Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local40].anInt2799 = -1;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1.length; local62++) {
			if (Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local62] != null) {
				Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local62].anInt2799 = -1;
			}
		}
		Static184.method3172();
		Static187.method3168(30);
		for (@Pc(89) int local89 = 0; local89 < 100; local89++) {
			Static50.aBooleanArray8[local89] = true;
		}
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] method2254() {
		@Pc(9) Class4_Sub1_Sub7_Sub2[] local9 = new Class4_Sub1_Sub7_Sub2[Static26.anInt653];
		for (@Pc(15) int local15 = 0; local15 < Static26.anInt653; local15++) {
			@Pc(21) Class4_Sub1_Sub7_Sub2 local21 = new Class4_Sub1_Sub7_Sub2();
			local21.anInt3407 = Static131.anInt3136;
			local21.anInt3408 = Static137.anInt3248;
			local21.anInt3409 = Static137.anIntArray312[local15];
			local21.anInt3406 = Static55.anIntArray147[local15];
			local21.anInt3405 = Static107.anIntArray248[local15];
			local21.anInt3404 = Static35.anIntArray81[local15];
			@Pc(53) int local53 = local21.anInt3405 * local21.anInt3404;
			@Pc(57) byte[] local57 = Static12.aByteArrayArray1[local15];
			local21.anIntArray323 = new int[local53];
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				local21.anIntArray323[local63] = Static110.anIntArray253[local57[local63] & 0xFF];
			}
			local9[local15] = local21;
		}
		Static130.method2308();
		return local9;
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V")
	public static void method2258() {
		for (@Pc(6) Class4_Sub24 local6 = (Class4_Sub24) Static121.aClass11_12.method274(); local6 != null; local6 = (Class4_Sub24) Static121.aClass11_12.method271()) {
			if (local6.aClass4_Sub2_Sub2_1 != null) {
				Static50.aClass4_Sub2_Sub1_1.method1074(local6.aClass4_Sub2_Sub2_1);
				local6.aClass4_Sub2_Sub2_1 = null;
			}
			if (local6.aClass4_Sub2_Sub2_2 != null) {
				Static50.aClass4_Sub2_Sub1_1.method1074(local6.aClass4_Sub2_Sub2_2);
				local6.aClass4_Sub2_Sub2_2 = null;
			}
		}
		Static121.aClass11_12.method280();
	}
}

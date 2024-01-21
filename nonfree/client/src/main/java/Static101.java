import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_963 = Static187.method3089("Lade Texturen )2 ");

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_964 = Static187.method3089("Loaded wordpack");

	@OriginalMember(owner = "client!kc", name = "fb", descriptor = "[Lclient!ka;")
	public static final Class1_Sub14[] aClass1_Sub14Array1 = new Class1_Sub14[2048];

	@OriginalMember(owner = "client!kc", name = "gb", descriptor = "[I")
	public static final int[] anIntArray166 = new int[32];

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_965 = Static187.method3089(")2");

	@OriginalMember(owner = "client!kc", name = "jb", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_10 = new Class20();

	@OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_966 = aClass92_964;

	@OriginalMember(owner = "client!kc", name = "pb", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!kc", name = "zb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_970 = Static187.method3089("Please use a different world)3");

	@OriginalMember(owner = "client!kc", name = "vb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_967 = aClass92_970;

	@OriginalMember(owner = "client!kc", name = "wb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_968 = Static187.method3089("Angreifen");

	@OriginalMember(owner = "client!kc", name = "xb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_969 = aClass92_970;

	@OriginalMember(owner = "client!kc", name = "yb", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_15 = new Class47(64);

	@OriginalMember(owner = "client!kc", name = "Ab", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_971 = Static187.method3089("cookieprefix");

	@OriginalMember(owner = "client!kc", name = "Bb", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!kc", name = "Cb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_972 = Static187.method3089("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!kc", name = "Db", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_973 = Static187.method3089("leuchten2:");

	@OriginalMember(owner = "client!kc", name = "Eb", descriptor = "J")
	public static volatile long aLong113 = 0L;

	@OriginalMember(owner = "client!kc", name = "Fb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_974 = Static187.method3089("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!kc", name = "Gb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_975 = aClass92_972;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	public static void method1519() {
		if (Static94.aDouble10 > Static203.aDouble11) {
			Static203.aDouble11 += Static203.aDouble11 / 30.0D;
			if (Static203.aDouble11 > Static94.aDouble10) {
				Static203.aDouble11 = Static94.aDouble10;
			}
			Static18.method408();
		} else if (Static203.aDouble11 > Static94.aDouble10) {
			Static203.aDouble11 -= Static203.aDouble11 / 30.0D;
			if (Static94.aDouble10 > Static203.aDouble11) {
				Static203.aDouble11 = Static94.aDouble10;
			}
			Static18.method408();
		}
		if (Static110.anInt2386 == -1 || Static193.anInt3062 == -1) {
			return;
		}
		@Pc(53) int local53 = Static193.anInt3062 - Static111.anInt2402;
		@Pc(58) int local58 = Static110.anInt2386 - Static155.anInt2984;
		if (local58 < 2 || local58 > 2) {
			local58 >>= 0x4;
		}
		Static155.anInt2984 += local58;
		if (local53 < 2 || local53 > 2) {
			local53 >>= 0x4;
		}
		if (local58 == 0 && local53 == 0) {
			Static110.anInt2386 = -1;
			Static193.anInt3062 = -1;
		}
		Static111.anInt2402 += local53;
		Static18.method408();
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
	public static void method1521() {
		Static158.anInt3294 = 0;
		Static147.anInt2991 = 0;
		Static192.method3136();
		Static44.method2108();
		Static23.method443();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static158.anInt3294; local22++) {
			local28 = Static38.anIntArray80[local22];
			if (Static177.aClass8_Sub3_Sub2Array1[local28].anInt3595 != Static155.anInt2981) {
				Static177.aClass8_Sub3_Sub2Array1[local28].aClass1_Sub3_Sub13_1 = null;
				Static177.aClass8_Sub3_Sub2Array1[local28] = null;
			}
		}
		if (Static63.anInt3562 != Static18.aClass1_Sub14_Sub1_2.anInt4061) {
			throw new RuntimeException("gnp1 pos:" + Static18.aClass1_Sub14_Sub1_2.anInt4061 + " psize:" + Static63.anInt3562);
		}
		for (local28 = 0; local28 < Static153.anInt3186; local28++) {
			if (Static177.aClass8_Sub3_Sub2Array1[Static103.anIntArray167[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static153.anInt3186);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
	public static void method1524() {
		@Pc(10) int local10 = Static114.anInt2464 + Static15.aClass8_Sub3_Sub1_1.anInt3600;
		if (Static5.aBooleanArray2[96]) {
			Static126.anInt2632 += (-Static126.anInt2632 - 24) / 2;
		} else if (Static5.aBooleanArray2[97]) {
			Static126.anInt2632 += (24 - Static126.anInt2632) / 2;
		} else {
			Static126.anInt2632 /= 2;
		}
		@Pc(49) int local49 = Static27.anInt618 + Static15.aClass8_Sub3_Sub1_1.anInt3606;
		Static106.anInt2306 += Static126.anInt2632 / 2;
		if (Static1.anInt57 - local10 < -500 || Static1.anInt57 - local10 > 500 || Static203.anInt4428 - local49 < -500 || Static203.anInt4428 - local49 > 500) {
			Static203.anInt4428 = local49;
			Static1.anInt57 = local10;
		}
		if (Static5.aBooleanArray2[98]) {
			Static90.anInt1945 += (12 - Static90.anInt1945) / 2;
		} else if (Static5.aBooleanArray2[99]) {
			Static90.anInt1945 += (-Static90.anInt1945 - 12) / 2;
		} else {
			Static90.anInt1945 /= 2;
		}
		Static129.anInt2670 += Static90.anInt1945 / 2;
		if (local49 != Static203.anInt4428) {
			Static203.anInt4428 += (local49 - Static203.anInt4428) / 16;
		}
		if (Static1.anInt57 != local10) {
			Static1.anInt57 += (local10 - Static1.anInt57) / 16;
		}
		Static117.method1725();
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(B)V")
	public static void method1525() {
		for (@Pc(7) int local7 = 0; local7 < Static147.anInt2991; local7++) {
			@Pc(13) int local13 = Static111.anIntArray183[local7];
			@Pc(17) Class8_Sub3_Sub1 local17 = Static47.aClass8_Sub3_Sub1Array1[local13];
			@Pc(21) int local21 = Static18.aClass1_Sub14_Sub1_2.method3010();
			if ((local21 & 0x4) != 0) {
				local21 += Static18.aClass1_Sub14_Sub1_2.method3010() << 8;
			}
			Static126.method1852(local21, local13, local17);
		}
	}
}

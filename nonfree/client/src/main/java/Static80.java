import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!qa", name = "Bb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2269 = Static94.method1596("yellow:");

	@OriginalMember(owner = "client!qa", name = "ub", descriptor = "Lclient!a;")
	public static Class1 aClass1_2266 = aClass1_2269;

	@OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
	public static int anInt2126 = 0;

	@OriginalMember(owner = "client!qa", name = "Eb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2271 = Static94.method1596("Hide");

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2267 = aClass1_2271;

	@OriginalMember(owner = "client!qa", name = "xb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2268 = Static94.method1596("button near the top of that page)3");

	@OriginalMember(owner = "client!qa", name = "zb", descriptor = "I")
	public static volatile int anInt2128 = 0;

	@OriginalMember(owner = "client!qa", name = "Ab", descriptor = "[I")
	public static int[] anIntArray274 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qa", name = "Cb", descriptor = "I")
	public static int anInt2129 = 0;

	@OriginalMember(owner = "client!qa", name = "Db", descriptor = "Lclient!a;")
	public static Class1 aClass1_2270 = aClass1_2268;

	@OriginalMember(owner = "client!qa", name = "Fb", descriptor = "Z")
	public static volatile boolean aBoolean119 = true;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!nb;Z)V")
	public static void method1483(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0) {
		@Pc(15) int local15 = arg0.anInt2746 * 128 + arg0.anInt2722 * 64;
		@Pc(21) int local21 = arg0.anInt2736 - Static69.anInt2806;
		if (arg0.anInt2704 == 0) {
			arg0.anInt2711 = 1024;
		}
		if (arg0.anInt2704 == 1) {
			arg0.anInt2711 = 1536;
		}
		if (arg0.anInt2704 == 2) {
			arg0.anInt2711 = 0;
		}
		@Pc(55) int local55 = arg0.anInt2722 * 64 + arg0.anInt2712 * 128;
		arg0.anInt2724 += (local15 - arg0.anInt2724) / local21;
		if (arg0.anInt2704 == 3) {
			arg0.anInt2711 = 512;
		}
		arg0.anInt2705 = 0;
		arg0.anInt2717 += (local55 - arg0.anInt2717) / local21;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public static void method1484() {
		aClass1_2269 = null;
		aClass1_2268 = null;
		aClass1_2271 = null;
		aClass1_2270 = null;
		aClass1_2266 = null;
		anIntArray274 = null;
		aClass1_2267 = null;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public static void method1485() {
		for (@Pc(7) int local7 = 0; local7 < Static67.anInt2767; local7++) {
			@Pc(13) int local13 = Static45.anIntArray156[local7];
			@Pc(17) Class2_Sub1_Sub1_Sub1_Sub1 local17 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local13];
			@Pc(21) int local21 = Static13.aClass2_Sub3_Sub1_1.method791();
			if ((local21 & 0x2) != 0) {
				local21 += Static13.aClass2_Sub3_Sub1_1.method791() << 8;
			}
			Static4.method191(local17, local21, local13);
		}
	}
}

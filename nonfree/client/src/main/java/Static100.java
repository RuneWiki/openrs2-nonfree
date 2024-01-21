import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
	public static int anInt2534;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	public static int anInt2542;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] aClass4_Sub1_Sub7_Sub3Array10;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "[I")
	public static final int[] anIntArray236 = new int[256];

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_912 = Static177.method3050("(U0a )2 via: ");

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "[I")
	public static final int[] anIntArray237 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_913 = Static177.method3050("");

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_914 = Static177.method3050("Loading title screen )2 ");

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "Lclient!jd;")
	public static Class46 aClass46_915 = aClass46_914;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_916 = Static177.method3050("<col=80ff00>");

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "[I")
	public static final int[] anIntArray238 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!h;I)Lclient!jd;")
	public static Class46 method1915(@OriginalArg(0) Class4_Sub11 arg0) {
		return Static152.method2608(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
	public static void method1916(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static87.anInt2219; local7++) {
			@Pc(18) long local18 = (long) Static35.anIntArray82[local7] << 32 | 0x20000000L;
			@Pc(24) Class4_Sub1_Sub1_Sub1_Sub2 local24 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[Static35.anIntArray82[local7]];
			if (local24 != null && local24.method2111() && local24.aClass4_Sub1_Sub11_1.aBoolean99 == arg0 && local24.aClass4_Sub1_Sub11_1.method1738()) {
				@Pc(51) int local51 = local24.anInt2832 >> 7;
				@Pc(56) int local56 = local24.anInt2803 >> 7;
				if (local51 >= 0 && local51 < 104 && local56 >= 0 && local56 < 104) {
					if (local24.anInt2805 == 1 && (local24.anInt2832 & 0x7F) == 64 && (local24.anInt2803 & 0x7F) == 64) {
						if (Static98.anIntArrayArray18[local51][local56] == Static113.anInt2757) {
							continue;
						}
						Static98.anIntArrayArray18[local51][local56] = Static113.anInt2757;
					}
					if (!local24.aClass4_Sub1_Sub11_1.aBoolean98) {
						local18 |= Long.MIN_VALUE;
					}
					local24.anInt2834 = Static106.method1998(local24.anInt2832 + local24.anInt2805 * 64 - 64, Static73.anInt1873, local24.anInt2803 + local24.anInt2805 * 64 - 64);
					Static101.method1950(Static73.anInt1873, local24.anInt2832, local24.anInt2803, local24.anInt2834, local24.anInt2805 * 64 - 4, local24, local24.anInt2822, local18, local24.aBoolean120);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
	public static int method1919(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}

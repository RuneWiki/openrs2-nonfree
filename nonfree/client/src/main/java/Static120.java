import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!te;")
	public static Class1_Sub3_Sub21 aClass1_Sub3_Sub21_1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[S")
	public static final short[] aShortArray21 = new short[500];

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1178 = Static187.method3089("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt2555 = 0;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1179 = Static187.method3089("World");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1182 = Static187.method3089("Login server offline)3");

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1180 = aClass92_1182;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1181 = aClass92_1178;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1183 = aClass92_1179;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static volatile int anInt2556 = 0;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1184 = Static187.method3089("gr-Un:");

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1185 = aClass92_1179;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1186 = Static187.method3089("<col=40ff00>");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public static void method1758() {
		for (@Pc(1) int local1 = 0; local1 < Static163.anInt3629; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static115.anInt2477; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static160.anInt3334; local7++) {
					@Pc(16) Class1_Sub17 local16 = Static179.aClass1_Sub17ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class48 local21 = local16.aClass48_1;
						if (local21 != null && local21.aClass8_4.method2671()) {
							Static140.method2081(local21.aClass8_4, local1, local4, local7, 1, 1);
							if (local21.aClass8_5 != null && local21.aClass8_5.method2671()) {
								Static140.method2081(local21.aClass8_5, local1, local4, local7, 1, 1);
								local21.aClass8_4.method2674(local21.aClass8_5, 0, 0, 0, false);
								local21.aClass8_5 = local21.aClass8_5.method2669();
							}
							local21.aClass8_4 = local21.aClass8_4.method2669();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt2380; local77++) {
							@Pc(83) Class16 local83 = local16.aClass16Array3[local77];
							if (local83 != null && local83.aClass8_2.method2671()) {
								Static140.method2081(local83.aClass8_2, local1, local4, local7, local83.anInt547 + 1 - local83.anInt536, local83.anInt537 - local83.anInt540 + 1);
								local83.aClass8_2 = local83.aClass8_2.method2669();
							}
						}
						@Pc(125) Class5 local125 = local16.aClass5_1;
						if (local125 != null && local125.aClass8_1.method2671()) {
							Static132.method1965(local125.aClass8_1, local1, local4, local7);
							local125.aClass8_1 = local125.aClass8_1.method2669();
						}
					}
				}
			}
		}
	}
}

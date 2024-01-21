import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 aClass2_Sub1_Sub7_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
	public static int anInt2295;

	@OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
	public static int anInt2287 = 0;

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
	public static int anInt2288 = 1;

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_607 = Static158.method3034("wave2:");

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "Lclient!ob;")
	public static Class60 aClass60_605 = aClass60_607;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_606 = Static158.method3034("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_608 = aClass60_607;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
	public static int anInt2294 = 0;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(III)V")
	public static void method1831() {
		for (@Pc(1) int local1 = 0; local1 < Static98.anInt2864; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static146.anInt3815; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static193.anInt4611; local7++) {
					@Pc(16) Class2_Sub17 local16 = Static118.aClass2_Sub17ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class74 local21 = local16.aClass74_1;
						if (local21 != null && local21.aClass2_Sub1_Sub1_10.method3178()) {
							Static1.method5(local21.aClass2_Sub1_Sub1_10, local1, local4, local7, 1, 1);
							if (local21.aClass2_Sub1_Sub1_9 != null && local21.aClass2_Sub1_Sub1_9.method3178()) {
								Static1.method5(local21.aClass2_Sub1_Sub1_9, local1, local4, local7, 1, 1);
								local21.aClass2_Sub1_Sub1_10.method3176(local21.aClass2_Sub1_Sub1_9, 0, 0, 0, false);
								local21.aClass2_Sub1_Sub1_9 = local21.aClass2_Sub1_Sub1_9.method3177();
							}
							local21.aClass2_Sub1_Sub1_10 = local21.aClass2_Sub1_Sub1_10.method3177();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt3604; local77++) {
							@Pc(83) Class6 local83 = local16.aClass6Array2[local77];
							if (local83 != null && local83.aClass2_Sub1_Sub1_1.method3178()) {
								Static1.method5(local83.aClass2_Sub1_Sub1_1, local1, local4, local7, local83.anInt292 + 1 - local83.anInt299, local83.anInt300 - local83.anInt291 + 1);
								local83.aClass2_Sub1_Sub1_1 = local83.aClass2_Sub1_Sub1_1.method3177();
							}
						}
						@Pc(125) Class52 local125 = local16.aClass52_1;
						if (local125 != null && local125.aClass2_Sub1_Sub1_7.method3178()) {
							Static149.method2964(local125.aClass2_Sub1_Sub1_7, local1, local4, local7);
							local125.aClass2_Sub1_Sub1_7 = local125.aClass2_Sub1_Sub1_7.method3177();
						}
					}
				}
			}
		}
	}
}

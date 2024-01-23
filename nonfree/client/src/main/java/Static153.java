import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
	public static int anInt3581;

	@OriginalMember(owner = "client!ph", name = "V", descriptor = "Lclient!i;")
	private static Class41 aClass41_970 = Static184.method2923(" has logged in)3");

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_968 = aClass41_970;

	@OriginalMember(owner = "client!ph", name = "U", descriptor = "Lclient!i;")
	private static Class41 aClass41_969 = Static184.method2923("Bad session id)3");

	@OriginalMember(owner = "client!ph", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_971 = aClass41_969;

	@OriginalMember(owner = "client!ph", name = "ab", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array53 = new Class41[1000];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!i;II)V")
	public static void method2491(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		Static131.aClass2_Sub3_Sub1_2.method221(40);
		Static131.aClass2_Sub3_Sub1_2.method158(arg0.method1419());
		Static131.aClass2_Sub3_Sub1_2.method208(arg1);
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
	public static void method2492() {
		for (@Pc(8) int local8 = -1; local8 < Static50.anInt2126; local8++) {
			@Pc(15) int local15;
			if (local8 == -1) {
				local15 = 2047;
			} else {
				local15 = Static156.anIntArray386[local8];
			}
			@Pc(25) Class12_Sub3_Sub1 local25 = Static216.aClass12_Sub3_Sub1Array1[local15];
			if (local25 != null) {
				Static67.method1228(local25.anInt3932, local25);
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	public static void method2493() {
		for (@Pc(1) int local1 = 0; local1 < Static10.anInt369; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static44.anInt1331; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static59.anInt1642; local7++) {
					@Pc(16) Class2_Sub7 local16 = Static27.aClass2_Sub7ArrayArrayArray4[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class71 local21 = local16.aClass71_1;
						if (local21 != null && local21.aClass12_5.method2716()) {
							Static215.method3281(local21.aClass12_5, local1, local4, local7, 1, 1);
							if (local21.aClass12_6 != null && local21.aClass12_6.method2716()) {
								Static215.method3281(local21.aClass12_6, local1, local4, local7, 1, 1);
								local21.aClass12_5.method2714(local21.aClass12_6, 0, 0, 0, false);
								local21.aClass12_6 = local21.aClass12_6.method2713();
							}
							local21.aClass12_5 = local21.aClass12_5.method2713();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt1382; local77++) {
							@Pc(83) Class51 local83 = local16.aClass51Array1[local77];
							if (local83 != null && local83.aClass12_4.method2716()) {
								Static215.method3281(local83.aClass12_4, local1, local4, local7, local83.anInt2312 + 1 - local83.anInt2305, local83.anInt2307 - local83.anInt2308 + 1);
								local83.aClass12_4 = local83.aClass12_4.method2713();
							}
						}
						@Pc(125) Class78 local125 = local16.aClass78_1;
						if (local125 != null && local125.aClass12_7.method2716()) {
							Static134.method2150(local125.aClass12_7, local1, local4, local7);
							local125.aClass12_7 = local125.aClass12_7.method2713();
						}
					}
				}
			}
		}
	}
}

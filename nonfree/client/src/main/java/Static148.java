import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_10;

	@OriginalMember(owner = "client!sa", name = "qb", descriptor = "Lclient!vb;")
	public static Class82 aClass82_59;

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1196 = Static120.method2057("Welcome to RuneScape");

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1197 = Static120.method2057("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1198 = Static120.method2057(":clanreq:");

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
	public static volatile int anInt3297 = 0;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1202 = Static120.method2057("Please wait)3)3)3");

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1199 = aClass81_1202;

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
	public static int anInt3302 = 0;

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1200 = Static120.method2057("<br>");

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1201 = aClass81_1196;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
	public static void method2525() {
		aClass81_1202 = null;
		aClass81_1197 = null;
		aClass82_59 = null;
		aClass81_1200 = null;
		aClass1_Sub2_Sub2_Sub3_10 = null;
		aClass81_1199 = null;
		aClass81_1201 = null;
		aClass81_1196 = null;
		aClass81_1198 = null;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method2526() {
		@Pc(10) int local10 = Static21.aClass1_Sub8_Sub1_1.method375(8);
		@Pc(19) int local19;
		if (local10 < Static25.anInt645) {
			for (local19 = local10; local19 < Static25.anInt645; local19++) {
				Static45.anIntArray94[Static158.anInt3590++] = Static176.anIntArray423[local19];
			}
		}
		if (Static25.anInt645 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static25.anInt645 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(64) int local64 = Static176.anIntArray423[local19];
			@Pc(68) Class1_Sub2_Sub1_Sub3_Sub1 local68 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local64];
			@Pc(75) int local75 = Static21.aClass1_Sub8_Sub1_1.method375(1);
			if (local75 == 0) {
				Static176.anIntArray423[Static25.anInt645++] = local64;
				local68.anInt3022 = Static142.anInt3104;
			} else {
				@Pc(100) int local100 = Static21.aClass1_Sub8_Sub1_1.method375(2);
				if (local100 == 0) {
					Static176.anIntArray423[Static25.anInt645++] = local64;
					local68.anInt3022 = Static142.anInt3104;
					Static90.anIntArray221[Static77.anInt1829++] = local64;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local100 == 1) {
						Static176.anIntArray423[Static25.anInt645++] = local64;
						local68.anInt3022 = Static142.anInt3104;
						local144 = Static21.aClass1_Sub8_Sub1_1.method375(3);
						local68.method2358(local144, false);
						local154 = Static21.aClass1_Sub8_Sub1_1.method375(1);
						if (local154 == 1) {
							Static90.anIntArray221[Static77.anInt1829++] = local64;
						}
					} else if (local100 == 2) {
						Static176.anIntArray423[Static25.anInt645++] = local64;
						local68.anInt3022 = Static142.anInt3104;
						local144 = Static21.aClass1_Sub8_Sub1_1.method375(3);
						local68.method2358(local144, true);
						local154 = Static21.aClass1_Sub8_Sub1_1.method375(3);
						local68.method2358(local154, true);
						@Pc(206) int local206 = Static21.aClass1_Sub8_Sub1_1.method375(1);
						if (local206 == 1) {
							Static90.anIntArray221[Static77.anInt1829++] = local64;
						}
					} else if (local100 == 3) {
						Static45.anIntArray94[Static158.anInt3590++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
	public static void method2528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) ((arg0 << 16) + arg1);
		@Pc(16) Class1_Sub2_Sub10 local16 = (Class1_Sub2_Sub10) Static71.aClass5_5.method134(local6);
		if (local16 != null) {
			Static2.aClass71_1.method2255(local16);
		}
	}
}

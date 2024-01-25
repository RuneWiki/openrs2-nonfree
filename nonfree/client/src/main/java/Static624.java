import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!tj;")
	public static Class328 aClass328_9;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public static int anInt10280;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "[I")
	public static final int[] anIntArray626 = new int[13];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method8684() {
		Static587.aClass136_6.method3669();
		Static154.aClass321_2.method7952();
		Static195.aClass58_1.method1516();
		Static283.aClass210_2.method5631();
		Static563.aClass346_2.method8201();
		Static266.aClass138_1.method3733();
		Static294.aClass373_2.method8740();
		Static436.aClass292_2.method7396();
		Static230.aClass233_3.method6391();
		Static40.aClass245_1.method6515();
		Static511.aClass34_1.method801();
		Static592.aClass304_4.method7756();
		Static184.aClass337_2.method8117();
		Static568.aClass37_1.method861();
		Static26.aClass179_1.method5152();
		Static25.aClass355_1.method8457();
		Static22.aClass354_1.method8451();
		Static595.aClass92_1.method2346();
		Static131.aClass74_1.method1977();
		Static576.aClass324_2.method7965();
		Static504.aClass335_6.method8113();
		Static495.method7407();
		Static595.method8359();
		Static599.method8443();
		Static232.method4001();
		Static303.method5149();
		Static137.aClass166_16.method4802();
		Static31.aClass166_2.method4802();
		Static417.aClass166_40.method4802();
		Static450.aClass166_43.method4802();
		Static244.aClass166_25.method4802();
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method8686() {
		if (Static554.anInt1822 == -1) {
			return;
		}
		@Pc(12) int local12 = Static429.aClass71_1.method7701();
		@Pc(16) int local16 = Static429.aClass71_1.method7702();
		@Pc(23) Class6_Sub15 local23 = (Class6_Sub15) Static334.aClass8_33.method149();
		if (local23 != null) {
			local12 = local23.method8383();
			local16 = local23.method8387();
		}
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		if (Static389.aBoolean497) {
			local35 = Static240.method4161();
			local37 = Static452.method6945();
		}
		Static76.method1322(local35 + local12, Static356.anInt6630 + local37, local35 + Static321.anInt6137, local37, local37, Static554.anInt1822, local16, local35, local35, local12, local37 + local16);
		if (Static176.aClass302_57 != null) {
			Static450.method6940(local12 + local35, local37 + local16);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Z")
	public static boolean method8687(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 4 || arg0 == 22 || arg0 == 2 || arg0 == 11 || arg0 == 46 || arg0 == 16;
	}
}

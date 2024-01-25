import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	public static int anInt6945;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_107 = new Class231(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	public static int anInt6946 = -1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIBII)V")
	public static void method5625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(14) int local14 = -1;
		Static73.method1404(Static347.anIntArrayArray54[arg0], arg1 + arg2, arg3, arg2 - arg1);
		while (local9 > local7) {
			local14 += 2;
			local7++;
			local12 += local14;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(53) int[] local53 = Static347.anIntArrayArray54[arg0 + local9];
				@Pc(59) int[] local59 = Static347.anIntArrayArray54[arg0 - local9];
				@Pc(63) int local63 = local7 + arg2;
				@Pc(68) int local68 = arg2 - local7;
				Static73.method1404(local53, local63, arg3, local68);
				Static73.method1404(local59, local63, arg3, local68);
			}
			@Pc(87) int local87 = arg2 + local9;
			@Pc(91) int local91 = arg2 - local9;
			@Pc(97) int[] local97 = Static347.anIntArrayArray54[arg0 + local7];
			@Pc(103) int[] local103 = Static347.anIntArrayArray54[arg0 - local7];
			Static73.method1404(local97, local87, arg3, local91);
			Static73.method1404(local103, local87, arg3, local91);
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Z")
	public static boolean method5627() {
		try {
			return Static290.method4315();
		} catch (@Pc(14) IOException local14) {
			Static109.method1806();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static106.aClass186_44 == null ? -1 : Static106.aClass186_44.method4264()) + "," + (Static314.aClass186_127 == null ? -1 : Static314.aClass186_127.method4264()) + "," + (Static325.aClass186_94 == null ? -1 : Static325.aClass186_94.method4264()) + " - " + Static337.anInt5664 + "," + (Static206.anInt3592 + Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0]) + "," + (Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0] + Static99.anInt1814) + " - ";
			for (@Pc(80) int local80 = 0; local80 < Static337.anInt5664 && local80 < 50; local80++) {
				local78 = local78 + Static55.aClass6_Sub15_Sub1_1.aByteArray51[local80] + ",";
			}
			Static40.method799(local19, local78);
			Static44.method825();
			return true;
		}
	}
}

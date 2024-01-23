import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "Lclient!ca;")
	public static Class16 aClass16_2 = new Class16(500);

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_456 = Static184.method2923(" loggt sich ein)3");

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "[Lclient!he;")
	public static Class12_Sub6[] aClass12_Sub6Array1 = new Class12_Sub6[4];

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lclient!i;")
	public static Class41 aClass41_457 = Static184.method2923("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!i;IBLclient!i;Lclient!i;)V")
	public static void method1078(@OriginalArg(0) Class41 arg0, @OriginalArg(3) Class41 arg1, @OriginalArg(4) Class41 arg2) {
		Static104.method1777(arg1, -1, arg0, 9, arg2);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!nb;Lclient!nb;Lclient!i;ILclient!i;)Lclient!cc;")
	public static Class2_Sub2_Sub4 method1079(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(4) Class41 arg3) {
		@Pc(8) int local8 = arg1.method414(arg3);
		@Pc(19) int local19 = arg1.method416(arg2, local8);
		return Static93.method1629(local19, arg0, local8, arg1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Z")
	public static boolean method1081(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
	public static void method1082() {
		Static198.anInt4444 = 0;
		Static170.anInt3986 = 0;
		Static2.method51();
		Static77.method1422();
		Static173.method2811();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static198.anInt4444; local19++) {
			local25 = Static48.anIntArray131[local19];
			if (Static199.aClass12_Sub3_Sub2Array1[local25].anInt3912 != Static103.anInt2511) {
				Static199.aClass12_Sub3_Sub2Array1[local25].aClass2_Sub2_Sub12_1 = null;
				Static199.aClass12_Sub3_Sub2Array1[local25] = null;
			}
		}
		if (Static202.anInt1733 != Static204.aClass2_Sub3_Sub1_3.anInt239) {
			throw new RuntimeException("gnp1 pos:" + Static204.aClass2_Sub3_Sub1_3.anInt239 + " psize:" + Static202.anInt1733);
		}
		for (local25 = 0; local25 < Static50.anInt2134; local25++) {
			if (Static199.aClass12_Sub3_Sub2Array1[Static23.anIntArray47[local25]] == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static50.anInt2134);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZIIILclient!k;)V")
	public static void method1083(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub2_Sub9 arg4) {
		if (Static156.anInt3673 >= 50 || (arg4.anIntArrayArray21 == null || arg4.anIntArrayArray21.length < 1 || arg2 >= arg4.anIntArrayArray21.length || arg4.anIntArrayArray21[arg2] == null)) {
			return;
		}
		@Pc(47) int local47 = arg4.anIntArrayArray21[arg2][0];
		@Pc(51) int local51 = local47 >> 8;
		@Pc(57) int local57 = local47 >> 4 & 0x7;
		@Pc(61) int local61 = local47 & 0xF;
		@Pc(78) int local78;
		if (arg4.anIntArrayArray21[arg2].length > 1) {
			local78 = (int) (Math.random() * (double) arg4.anIntArrayArray21[arg2].length);
			if (local78 > 0) {
				local51 = arg4.anIntArrayArray21[arg2][local78];
			}
		}
		if (local61 == 0) {
			if (arg0) {
				Static80.method1467(local57, 0, local51);
			}
		} else if (Static198.anInt4450 != 0) {
			Static23.anIntArray46[Static156.anInt3673] = local51;
			Static96.anIntArray238[Static156.anInt3673] = local57;
			Static7.anIntArray14[Static156.anInt3673] = 0;
			local78 = (arg3 - 64) / 128;
			Static210.aClass24Array1[Static156.anInt3673] = null;
			@Pc(128) int local128 = (arg1 - 64) / 128;
			Static130.anIntArray409[Static156.anInt3673] = (local78 << 16) + (local128 << 8) + local61;
			Static156.anInt3673++;
		}
	}
}

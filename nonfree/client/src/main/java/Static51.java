import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "Lclient!kda;")
	public static Class160 aClass160_93;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
	public static int anInt7926 = 0;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "Lclient!h;")
	public static final Class114 aClass114_150 = new Class114("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public static void method6738(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class309 local8 = Static210.method3818(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray6 != null) {
			@Pc(18) Class1_Sub40 local18 = new Class1_Sub40();
			local18.aClass309_10 = local8;
			local18.anObjectArray5 = local8.anObjectArray6;
			local18.anInt6958 = arg3;
			local18.aString63 = arg1;
			Static387.method5838(local18);
		}
		if (anInt7926 != 9 || !Static62.method1740(local8).method7986(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static444.method6416(Static206.aClass186_67);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 2) {
			Static444.method6416(Static287.aClass186_80);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 3) {
			Static444.method6416(Static228.aClass186_114);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 4) {
			Static444.method6416(Static42.aClass186_14);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 5) {
			Static444.method6416(Static464.aClass186_109);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 6) {
			Static444.method6416(Static258.aClass186_73);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 7) {
			Static444.method6416(Static530.aClass186_116);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 8) {
			Static444.method6416(Static110.aClass186_37);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 9) {
			Static444.method6416(Static262.aClass186_75);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
		if (arg3 == 10) {
			Static444.method6416(Static395.aClass186_94);
			Static436.method6380(arg0, local8.anInt8735, arg2);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)Lclient!faa;")
	public static Class47_Sub2_Sub3 method6739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class206 local11 = Static313.aClass206ArrayArrayArray2[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class47_Sub2_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class168 local22 = local11.aClass168_2; local22 != null; local22 = local22.aClass168_1) {
			@Pc(31) Class47_Sub2 local31 = local22.aClass47_Sub2_2;
			if (local31 instanceof Class47_Sub2_Sub3) {
				@Pc(37) Class47_Sub2_Sub3 local37 = (Class47_Sub2_Sub3) local31;
				@Pc(47) int local47 = (local37.method4350() - 1) * 64 + 60;
				@Pc(54) int local54 = local37.anInt8189 - local47 >> 7;
				@Pc(62) int local62 = local37.anInt8191 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt8189 + local47 >> 7;
				@Pc(77) int local77 = local37.anInt8191 + local47 >> 7;
				if (local54 <= arg1 && arg0 >= local62 && local70 >= arg1 && local77 >= arg0) {
					@Pc(115) int local115 = (local77 + 1 - arg0) * (-arg1 + local70 + 1);
					if (local19 < local115) {
						local17 = local37;
						local19 = local115;
					}
				}
			}
		}
		return local17;
	}
}

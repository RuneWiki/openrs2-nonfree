import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
	public static int anInt9487;

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
	public static int anInt9483 = 0;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;Lclient!ha;BLclient!rt;Lclient!da;Z)V")
	public static void method8319(@OriginalArg(0) String arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(3) Class324 arg2, @OriginalArg(4) Class59 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(12) boolean local12 = !Static349.aBoolean512 || Static638.method9416();
		if (!local12) {
			return;
		}
		@Pc(31) int local31;
		@Pc(40) int local40;
		if (Static349.aBoolean512 && local12) {
			@Pc(142) Class324 local142 = Static228.aClass324_7;
			@Pc(148) Class59 local148 = arg1.method8146(local142, Static271.aClass67Array1);
			local31 = local142.method8177(250, arg0, (Class71[]) null);
			local40 = local142.method8178(250, arg0, (Class71[]) null, local142.anInt9270);
			@Pc(167) int local167 = Static623.aClass67_2.anInt1761;
			@Pc(171) int local171 = local167 + 4;
			local31 += local171 * 2;
			local40 += local171 * 2;
			if (Static29.anInt500 > local31) {
				local31 = Static29.anInt500;
			}
			if (local40 < Static573.anInt10002) {
				local40 = Static573.anInt10002;
			}
			@Pc(201) int local201 = Static598.aClass236_11.method6431(local31, Static26.anInt458) + Static367.anInt6940;
			@Pc(209) int local209 = Static576.aClass103_11.method3186(Static340.anInt6390, local40) + Static300.anInt9851;
			if (Static450.aBoolean606) {
				local201 += Static106.method1934();
				local209 += Static207.method3926();
			}
			arg1.method8063(Static655.aClass67_3, false).method7698(local201 + Static315.aClass67_1.anInt1761, local209 - -Static315.aClass67_1.anInt1759, local31 - Static315.aClass67_1.anInt1761 * 2, -(Static315.aClass67_1.anInt1759 * 2) + local40, 1, 0, 0);
			arg1.method8063(Static315.aClass67_1, true).method7703(local201, local209);
			Static315.aClass67_1.method1686();
			arg1.method8063(Static315.aClass67_1, true).method7703(local201 + local31 - local167, local209);
			Static315.aClass67_1.method1695();
			arg1.method8063(Static315.aClass67_1, true).method7703(local31 + local201 - local167, local209 + local40 + -local167);
			Static315.aClass67_1.method1686();
			arg1.method8063(Static315.aClass67_1, true).method7703(local201, local40 + local209 - local167);
			Static315.aClass67_1.method1695();
			arg1.method8063(Static623.aClass67_2, true).method7701(local201, local209 + Static315.aClass67_1.anInt1759, local167, local40 - Static315.aClass67_1.anInt1759 * 2);
			Static623.aClass67_2.method1696();
			arg1.method8063(Static623.aClass67_2, true).method7701(Static315.aClass67_1.anInt1761 + local201, local209, local31 - Static315.aClass67_1.anInt1761 * 2, local167);
			Static623.aClass67_2.method1696();
			arg1.method8063(Static623.aClass67_2, true).method7701(local201 + local31 - local167, local209 - -Static315.aClass67_1.anInt1759, local167, local40 - Static315.aClass67_1.anInt1759 * 2);
			Static623.aClass67_2.method1696();
			arg1.method8063(Static623.aClass67_2, true).method7701(local201 + Static315.aClass67_1.anInt1761, local40 + local209 + -local167, local31 - Static315.aClass67_1.anInt1761 * 2, local167);
			Static623.aClass67_2.method1696();
			local148.method9576(1, arg0, Static560.anInt9730 | 0xFF000000, local31 - local171 * 2, local201 - -local171, 0, 1, local40 - local171 * 2, 0, (Class1) null, -1, 0, (int[]) null, local171 + local209, (Class71[]) null);
			Static427.method7014(local31, local209, local201, local40);
		} else {
			local31 = arg2.method8177(250, arg0, (Class71[]) null);
			local40 = arg2.method8183(arg0, (Class71[]) null, 250) * 13;
			arg1.aa(6, 6, local31 + 4 + 4, local40 + 4 + 4, -16777216, 0);
			arg1.method8129(6, 6, local31 + 8, local40 + 4 - -4, -1, 0);
			arg3.method9576(1, arg0, -1, local31, 10, 0, 1, local40, 0, (Class1) null, -1, 0, (int[]) null, 10, (Class71[]) null);
			Static427.method7014(local31 + 4 + 4, 6, 6, local40 + 4 + 4);
		}
		if (!arg4) {
			return;
		}
		try {
			if (Static450.aBoolean606) {
				Static215.method9562();
			} else {
				arg1.method8142();
			}
		} catch (@Pc(450) Exception_Sub1 local450) {
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	public static void method8321() {
		if (Static214.aClass2_Sub1_Sub19_1 != null) {
			Static214.aClass2_Sub1_Sub19_1 = null;
			Static427.method7014(Static100.anInt1550, Static659.anInt11274, Static429.anInt7876, Static31.anInt534);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method8322(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub52 local12 = Static311.method5098(Static153.aClass341_37, Static125.aClass179_1);
		local12.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(arg0) + 1);
		local12.aClass2_Sub8_Sub2_2.method5212(arg0);
		local12.aClass2_Sub8_Sub2_2.method5225(arg1);
		Static38.method791(local12);
	}
}

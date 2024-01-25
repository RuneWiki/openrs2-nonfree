import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
	public static boolean aBoolean64;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_26 = new Class25(32, 2);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public static void method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) Static463.aClass181_52.method3972(); local6 != null; local6 = (Class2_Sub3) Static463.aClass181_52.method3975()) {
			Static309.method4439(local6, arg1, arg0, arg3, arg2);
		}
		for (@Pc(31) Class2_Sub3 local31 = (Class2_Sub3) Static294.aClass181_27.method3972(); local31 != null; local31 = (Class2_Sub3) Static294.aClass181_27.method3975()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class101 local40 = local31.aClass11_Sub5_Sub2_Sub2_1.method6218();
			if (local31.aClass11_Sub5_Sub2_Sub2_1.aBoolean514) {
				local35 = 0;
			} else if (local40.anInt2614 == local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663 || local40.anInt2629 == local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663 || local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663 == local40.anInt2627 || local40.anInt2643 == local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663) {
				local35 = 2;
			} else if (local40.anInt2608 == local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663 || local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663 == local40.anInt2619 || local40.anInt2651 == local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663 || local31.aClass11_Sub5_Sub2_Sub2_1.anInt7663 == local40.anInt2654) {
				local35 = 3;
			}
			if (local31.anInt338 != local35) {
				@Pc(131) int local131 = Static442.method5943(local31.aClass11_Sub5_Sub2_Sub2_1);
				if (local31.anInt349 != local131) {
					if (local31.aClass2_Sub8_Sub4_2 != null) {
						Static414.aClass2_Sub8_Sub1_2.method1041(local31.aClass2_Sub8_Sub4_2);
						local31.aClass2_Sub8_Sub4_2 = null;
					}
					local31.anInt349 = local131;
				}
				local31.anInt338 = local35;
			}
			local31.anInt345 = local31.aClass11_Sub5_Sub2_Sub2_1.anInt7626;
			local31.anInt350 = local31.aClass11_Sub5_Sub2_Sub2_1.anInt7626 + (local31.aClass11_Sub5_Sub2_Sub2_1.method6215() << 6);
			local31.anInt348 = local31.aClass11_Sub5_Sub2_Sub2_1.anInt7622;
			local31.anInt340 = local31.aClass11_Sub5_Sub2_Sub2_1.anInt7622 + (local31.aClass11_Sub5_Sub2_Sub2_1.method6215() << 6);
			Static309.method4439(local31, arg1, arg0, arg3, arg2);
		}
		for (@Pc(217) Class2_Sub3 local217 = (Class2_Sub3) Static271.aClass220_24.method5096(); local217 != null; local217 = (Class2_Sub3) Static271.aClass220_24.method5098()) {
			@Pc(221) byte local221 = 1;
			@Pc(226) Class101 local226 = local217.aClass11_Sub5_Sub2_Sub1_1.method6218();
			if (local217.aClass11_Sub5_Sub2_Sub1_1.aBoolean514) {
				local221 = 0;
			} else if (local226.anInt2614 == local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663 || local226.anInt2629 == local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663 || local226.anInt2627 == local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663 || local226.anInt2643 == local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663) {
				local221 = 2;
			} else if (local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663 == local226.anInt2608 || local226.anInt2619 == local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663 || local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663 == local226.anInt2651 || local217.aClass11_Sub5_Sub2_Sub1_1.anInt7663 == local226.anInt2654) {
				local221 = 3;
			}
			if (local217.anInt338 != local221) {
				@Pc(321) int local321 = Static363.method5111(local217.aClass11_Sub5_Sub2_Sub1_1);
				if (local321 != local217.anInt349) {
					if (local217.aClass2_Sub8_Sub4_2 != null) {
						Static414.aClass2_Sub8_Sub1_2.method1041(local217.aClass2_Sub8_Sub4_2);
						local217.aClass2_Sub8_Sub4_2 = null;
					}
					local217.anInt349 = local321;
				}
				local217.anInt338 = local221;
			}
			local217.anInt345 = local217.aClass11_Sub5_Sub2_Sub1_1.anInt7626;
			local217.anInt350 = local217.aClass11_Sub5_Sub2_Sub1_1.anInt7626 + (local217.aClass11_Sub5_Sub2_Sub1_1.method6215() << 6);
			local217.anInt348 = local217.aClass11_Sub5_Sub2_Sub1_1.anInt7622;
			local217.anInt340 = local217.aClass11_Sub5_Sub2_Sub1_1.anInt7622 + (local217.aClass11_Sub5_Sub2_Sub1_1.method6215() << 6);
			Static309.method4439(local217, arg1, arg0, arg3, arg2);
		}
	}
}

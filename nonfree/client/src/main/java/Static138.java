import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_41 = new Class146(81, 2);

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!up;")
	public static final Class250 aClass250_10 = new Class250(11, 14);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public static void method1970() {
		if (Static288.aBoolean350) {
			return;
		}
		Static444.method5916(Static458.aClass75ArrayArrayArray5);
		if (Static221.aClass75ArrayArrayArray3 != null) {
			Static444.method5916(Static221.aClass75ArrayArrayArray3);
		}
		Static288.aBoolean350 = true;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIB)V")
	public static void method1973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class4_Sub22 local10 = (Class4_Sub22) Static125.aClass244_10.method5263(); local10 != null; local10 = (Class4_Sub22) Static125.aClass244_10.method5271()) {
			Static445.method5924(arg2, local10, arg3, arg0, arg1);
		}
		for (@Pc(40) Class4_Sub22 local40 = (Class4_Sub22) Static273.aClass244_23.method5263(); local40 != null; local40 = (Class4_Sub22) Static273.aClass244_23.method5271()) {
			@Pc(44) byte local44 = 1;
			@Pc(51) Class42 local51 = local40.aClass8_Sub3_Sub1_Sub2_1.method5892();
			if (local40.aClass8_Sub3_Sub1_Sub2_1.aBoolean519) {
				local44 = 0;
			} else if (local51.anInt1010 == local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 || local51.anInt1027 == local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 || local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 == local51.anInt1029 || local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 == local51.anInt1015) {
				local44 = 2;
			} else if (local51.anInt1009 == local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 || local51.anInt1037 == local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 || local51.anInt1025 == local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 || local40.aClass8_Sub3_Sub1_Sub2_1.anInt7389 == local51.anInt1048) {
				local44 = 3;
			}
			if (local44 != local40.anInt3849) {
				@Pc(142) int local142 = Static332.method4391(local40.aClass8_Sub3_Sub1_Sub2_1);
				if (local142 != local40.anInt3851) {
					if (local40.aClass4_Sub14_Sub4_2 != null) {
						Static406.aClass4_Sub14_Sub2_2.method2420(local40.aClass4_Sub14_Sub4_2);
						local40.aClass4_Sub14_Sub4_2 = null;
					}
					local40.anInt3851 = local142;
				}
				local40.anInt3849 = local44;
			}
			local40.anInt3852 = local40.aClass8_Sub3_Sub1_Sub2_1.anInt7339;
			local40.anInt3860 = local40.aClass8_Sub3_Sub1_Sub2_1.anInt7339 + (local40.aClass8_Sub3_Sub1_Sub2_1.method5894() << 6);
			local40.anInt3854 = local40.aClass8_Sub3_Sub1_Sub2_1.anInt7343;
			local40.anInt3859 = local40.aClass8_Sub3_Sub1_Sub2_1.anInt7343 + (local40.aClass8_Sub3_Sub1_Sub2_1.method5894() << 6);
			Static445.method5924(arg2, local40, arg3, arg0, arg1);
		}
		for (@Pc(217) Class4_Sub22 local217 = (Class4_Sub22) Static381.aClass67_4.method1428(); local217 != null; local217 = (Class4_Sub22) Static381.aClass67_4.method1424()) {
			@Pc(221) byte local221 = 1;
			@Pc(226) Class42 local226 = local217.aClass8_Sub3_Sub1_Sub1_1.method5892();
			if (local217.aClass8_Sub3_Sub1_Sub1_1.aBoolean519) {
				local221 = 0;
			} else if (local226.anInt1010 == local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389 || local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389 == local226.anInt1027 || local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389 == local226.anInt1029 || local226.anInt1015 == local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389) {
				local221 = 2;
			} else if (local226.anInt1009 == local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389 || local226.anInt1037 == local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389 || local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389 == local226.anInt1025 || local226.anInt1048 == local217.aClass8_Sub3_Sub1_Sub1_1.anInt7389) {
				local221 = 3;
			}
			if (local221 != local217.anInt3849) {
				@Pc(321) int local321 = Static407.method5531(local217.aClass8_Sub3_Sub1_Sub1_1);
				if (local217.anInt3851 != local321) {
					if (local217.aClass4_Sub14_Sub4_2 != null) {
						Static406.aClass4_Sub14_Sub2_2.method2420(local217.aClass4_Sub14_Sub4_2);
						local217.aClass4_Sub14_Sub4_2 = null;
					}
					local217.anInt3851 = local321;
				}
				local217.anInt3849 = local221;
			}
			local217.anInt3852 = local217.aClass8_Sub3_Sub1_Sub1_1.anInt7339;
			local217.anInt3860 = local217.aClass8_Sub3_Sub1_Sub1_1.anInt7339 + (local217.aClass8_Sub3_Sub1_Sub1_1.method5894() << 6);
			local217.anInt3854 = local217.aClass8_Sub3_Sub1_Sub1_1.anInt7343;
			local217.anInt3859 = local217.aClass8_Sub3_Sub1_Sub1_1.anInt7343 + (local217.aClass8_Sub3_Sub1_Sub1_1.method5894() << 6);
			Static445.method5924(arg2, local217, arg3, arg0, arg1);
		}
	}
}

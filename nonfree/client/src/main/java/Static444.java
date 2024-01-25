import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Z")
	public static boolean aBoolean429;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Lclient!eg;")
	public static Class59 aClass59_3;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!ga;")
	public static Class82 aClass82_23 = null;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	public static void method5197() {
		@Pc(5) int local5 = 0;
		if (Static39.aClass79_Sub1_1.method1939(Static402.anInt6656)) {
			local5 = 55;
		}
		if (!Static39.aClass79_Sub1_1.aBoolean161) {
			local5 |= 0x40;
		}
		Static43.method4694(local5);
		Static9.aClass149_1.method3576(local5);
		Static158.aClass272_1.method6280(local5);
		Static118.aClass19_1.method396(local5);
		Static387.aClass201_2.method4773(local5);
		Static242.method3496(local5);
		Static169.method6285(local5);
		Static328.method4557(local5);
		Static330.method4584(local5);
		Static409.method5642();
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V")
	public static void method5198() {
		Static463.method6297(Static296.aClass82_16);
		Static254.anInt5710++;
		if (Static184.aBoolean255 && Static280.aBoolean333) {
			@Pc(26) int local26 = Static171.aClass50_1.method4993();
			@Pc(30) int local30 = Static171.aClass50_1.method4989();
			local30 -= Static317.anInt5362;
			local26 -= Static233.anInt3984;
			if (local26 < Static1.anInt7721) {
				local26 = Static1.anInt7721;
			}
			if (local30 < Static201.anInt3586) {
				local30 = Static201.anInt3586;
			}
			if (Static1.anInt7721 + Static260.aClass82_22.anInt2192 < Static296.aClass82_16.anInt2192 + local26) {
				local26 = Static260.aClass82_22.anInt2192 + Static1.anInt7721 - Static296.aClass82_16.anInt2192;
			}
			if (Static296.aClass82_16.anInt2216 + local30 > Static201.anInt3586 - -Static260.aClass82_22.anInt2216) {
				local30 = Static201.anInt3586 + Static260.aClass82_22.anInt2216 - Static296.aClass82_16.anInt2216;
			}
			@Pc(109) int local109 = Static260.aClass82_22.anInt2245 + local26 - Static1.anInt7721;
			@Pc(117) int local117 = local30 + Static260.aClass82_22.anInt2263 - Static201.anInt3586;
			@Pc(132) Class3_Sub15 local132;
			if (Static171.aClass50_1.method4997()) {
				if (Static254.anInt5710 > Static296.aClass82_16.anInt2241) {
					@Pc(212) int local212 = local26 - Static244.anInt4150;
					@Pc(217) int local217 = local30 - Static365.anInt6194;
					if (local212 > Static296.aClass82_16.anInt2195 || local212 < -Static296.aClass82_16.anInt2195 || local217 > Static296.aClass82_16.anInt2195 || -Static296.aClass82_16.anInt2195 > local217) {
						Static170.aBoolean243 = true;
					}
				}
				if (Static296.aClass82_16.anObjectArray31 != null && Static170.aBoolean243) {
					local132 = new Class3_Sub15();
					local132.anInt1786 = local117;
					local132.anInt1787 = local109;
					local132.aClass82_1 = Static296.aClass82_16;
					local132.anObjectArray3 = Static296.aClass82_16.anObjectArray31;
					Static219.method3217(local132);
				}
			} else {
				if (Static170.aBoolean243) {
					Static178.method2853();
					if (Static296.aClass82_16.anObjectArray32 != null) {
						local132 = new Class3_Sub15();
						local132.aClass82_2 = Static225.aClass82_14;
						local132.anInt1787 = local109;
						local132.aClass82_1 = Static296.aClass82_16;
						local132.anInt1786 = local117;
						local132.anObjectArray3 = Static296.aClass82_16.anObjectArray32;
						Static219.method3217(local132);
					}
					if (Static225.aClass82_14 != null && Static54.method1054(Static296.aClass82_16) != null) {
						Static12.method201(Static296.aClass82_16, Static225.aClass82_14);
					}
				} else if ((Static29.anInt5767 == 1 || Static383.method5318()) && Static276.anInt4608 > 2) {
					Static2.method53(Static233.anInt3984 + Static244.anInt4150, Static317.anInt5362 - -Static365.anInt6194);
				} else if (Static383.method5321()) {
					Static2.method53(Static244.anInt4150 + Static233.anInt3984, Static365.anInt6194 + Static317.anInt5362);
				}
				Static296.aClass82_16 = null;
			}
		} else if (Static254.anInt5710 > 1) {
			Static296.aClass82_16 = null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[B[BIII)V")
	public static void method5199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg5++;
				arg3[local26] += arg4[arg1++];
				@Pc(38) int local38 = arg5++;
				arg3[local38] += arg4[arg1++];
				@Pc(50) int local50 = arg5++;
				arg3[local50] += arg4[arg1++];
				@Pc(62) int local62 = arg5++;
				arg3[local62] += arg4[arg1++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg5++;
				arg3[local26] += arg4[arg1++];
			}
			arg1 += arg7;
			arg5 += arg6;
		}
	}
}

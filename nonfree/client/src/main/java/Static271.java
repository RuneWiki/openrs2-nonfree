import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!dh;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIII)V")
	public static void method4329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg3, 10);
		local9.method1712();
		local9.anInt1782 = arg1;
		local9.anInt1789 = arg2;
		local9.anInt1790 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZI)V")
	public static void method4330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && Static660.anInt10217 == arg1 && arg3 == Static279.anInt5230 && (Static576.anInt9136 == Static407.anInt6944 || Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 1)) {
			return;
		}
		Static279.anInt5230 = arg3;
		Static407.anInt6944 = Static576.anInt9136;
		Static660.anInt10217 = arg1;
		if (Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 1) {
			Static407.anInt6944 = 0;
		}
		Static482.method6863(arg0);
		Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_13.method7694(Static319.anInt5939), true);
		@Pc(64) int local64 = Static417.anInt7047;
		@Pc(66) int local66 = Static347.anInt7851;
		Static417.anInt7047 = (Static660.anInt10217 - (Static251.anInt4680 >> 4)) * 8;
		Static347.anInt7851 = (Static279.anInt5230 - (Static406.anInt6924 >> 4)) * 8;
		Static438.aClass3_Sub6_Sub13_1 = Static574.method7092(Static660.anInt10217 * 8, Static279.anInt5230 * 8);
		Static17.aClass121_1 = null;
		@Pc(98) int local98 = Static417.anInt7047 - local64;
		@Pc(102) int local102 = Static347.anInt7851 - local66;
		@Pc(107) int local107;
		@Pc(120) int local120;
		@Pc(237) int local237;
		@Pc(184) int local184;
		if (arg0 == 11) {
			for (local107 = 0; local107 < Static609.anInt6433; local107++) {
				@Pc(113) Class3_Sub11 local113 = Static43.aClass3_Sub11Array1[local107];
				if (local113 != null) {
					@Pc(118) Class23_Sub2_Sub1_Sub2_Sub2 local118 = local113.aClass23_Sub2_Sub1_Sub2_Sub2_1;
					for (local120 = 0; local120 < 10; local120++) {
						local118.anIntArray659[local120] -= local98;
						local118.anIntArray660[local120] -= local102;
					}
					local118.anInt10108 -= local98 * 512;
					local118.anInt10109 -= local102 * 512;
				}
			}
		} else {
			@Pc(170) boolean local170 = false;
			Static308.anInt5687 = 0;
			@Pc(178) int local178 = Static251.anInt4680 * 512 - 512;
			local184 = (Static406.anInt6924 - 1) * 512;
			for (local120 = 0; local120 < Static609.anInt6433; local120++) {
				@Pc(192) Class3_Sub11 local192 = Static43.aClass3_Sub11Array1[local120];
				if (local192 != null) {
					@Pc(197) Class23_Sub2_Sub1_Sub2_Sub2 local197 = local192.aClass23_Sub2_Sub1_Sub2_Sub2_1;
					local197.anInt10109 -= local102 * 512;
					local197.anInt10108 -= local98 * 512;
					if (local197.anInt10108 >= 0 && local178 >= local197.anInt10108 && local197.anInt10109 >= 0 && local197.anInt10109 <= local184) {
						@Pc(235) boolean local235 = true;
						for (local237 = 0; local237 < 10; local237++) {
							local197.anIntArray659[local237] -= local98;
							local197.anIntArray660[local237] -= local102;
							if (local197.anIntArray659[local237] < 0 || local197.anIntArray659[local237] >= Static251.anInt4680 || local197.anIntArray660[local237] < 0 || Static406.anInt6924 <= local197.anIntArray660[local237]) {
								local235 = false;
							}
						}
						if (local235) {
							Static390.anIntArray424[Static308.anInt5687++] = local197.anInt10180;
						} else {
							local197.method8636((Class5) null);
							local192.method8770();
							local170 = true;
						}
					} else {
						local197.method8636((Class5) null);
						local192.method8770();
						local170 = true;
					}
				}
			}
			if (local170) {
				Static609.anInt6433 = Static500.aClass62_40.method1688();
				Static500.aClass62_40.method1687(Static43.aClass3_Sub11Array1);
			}
		}
		for (local107 = 0; local107 < 2048; local107++) {
			@Pc(355) Class23_Sub2_Sub1_Sub2_Sub1 local355 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local107];
			if (local355 != null) {
				for (local184 = 0; local184 < 10; local184++) {
					local355.anIntArray659[local184] -= local98;
					local355.anIntArray660[local184] -= local102;
				}
				local355.anInt10108 -= local98 * 512;
				local355.anInt10109 -= local102 * 512;
			}
		}
		@Pc(407) Class70[] local407 = Static110.aClass70Array1;
		for (local184 = 0; local184 < local407.length; local184++) {
			@Pc(415) Class70 local415 = local407[local184];
			if (local415 != null) {
				local415.anInt2017 -= local102 * 512;
				local415.anInt2018 -= local98 * 512;
			}
		}
		@Pc(447) Class3_Sub49 local447;
		for (local447 = (Class3_Sub49) Static462.aClass193_48.method4457(); local447 != null; local447 = (Class3_Sub49) Static462.aClass193_48.method4459()) {
			local447.anInt8924 -= local102;
			local447.anInt8929 -= local98;
			if (Static176.anInt3321 != 4 && (local447.anInt8929 < 0 || local447.anInt8924 < 0 || local447.anInt8929 >= Static251.anInt4680 || local447.anInt8924 >= Static406.anInt6924)) {
				local447.method8770();
			}
		}
		for (local447 = (Class3_Sub49) Static647.aClass193_70.method4457(); local447 != null; local447 = (Class3_Sub49) Static647.aClass193_70.method4459()) {
			local447.anInt8924 -= local102;
			local447.anInt8929 -= local98;
			if (Static176.anInt3321 != 4 && (local447.anInt8929 < 0 || local447.anInt8924 < 0 || local447.anInt8929 >= Static251.anInt4680 || local447.anInt8924 >= Static406.anInt6924)) {
				local447.method8770();
			}
		}
		if (Static176.anInt3321 != 4) {
			for (@Pc(563) Class3_Sub24 local563 = (Class3_Sub24) Static421.aClass62_32.method1680(); local563 != null; local563 = (Class3_Sub24) Static421.aClass62_32.method1681()) {
				@Pc(571) int local571 = (int) (local563.aLong309 & 0x3FFFL);
				@Pc(575) int local575 = local571 - Static417.anInt7047;
				local237 = (int) (local563.aLong309 >> 14 & 0x3FFFL);
				@Pc(587) int local587 = local237 - Static347.anInt7851;
				if (local575 < 0 || local587 < 0 || Static251.anInt4680 <= local575 || Static406.anInt6924 <= local587) {
					local563.method8770();
				}
			}
		}
		if (Static75.anInt1704 != 0) {
			Static75.anInt1704 -= local98;
			Static217.anInt4007 -= local102;
		}
		Static667.method8675();
		if (arg0 != 11) {
			Static108.anInt2245 -= local102;
			Static663.anInt10236 -= local102 * 512;
			Static480.anInt8125 -= local102;
			Static97.anInt2082 -= local98 * 512;
			Static215.anInt6266 -= local98;
			Static409.anInt6761 -= local98;
			if (Math.abs(local98) > Static251.anInt4680 || Math.abs(local102) > Static406.anInt6924) {
				Static225.method3512();
			}
		} else if (Static378.anInt6662 == 4) {
			Static429.anInt7552 -= local98 * 512;
			Static647.anInt9959 -= local102 * 512;
			Static276.anInt5174 -= local102 * 512;
			Static140.anInt2658 -= local98 * 512;
		} else {
			Static18.anInt682 = -1;
			Static65.anInt1581 = -1;
			Static378.anInt6662 = 1;
		}
		Static455.method6555();
		Static542.method7494();
		Static514.aClass193_56.method4458();
		Static607.aClass193_65.method4458();
		Static408.aClass105_9.method2445();
		Static289.method7945();
	}
}

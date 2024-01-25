import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!rha", name = "S", descriptor = "I")
	public static int anInt8570 = -50;

	@OriginalMember(owner = "client!rha", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString91 = "";

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IB)V")
	public static void method7280(@OriginalArg(0) int arg0) {
		Static338.anInt9520 = arg0;
		Static493.aClass265_54.method6568();
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZIIII)V")
	public static void method7281(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0 && Static216.anInt3459 == arg3 && arg1 == Static544.anInt8919 && (Static458.anInt7955 == Static326.anInt5965 || Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 1)) {
			return;
		}
		Static544.anInt8919 = arg1;
		Static326.anInt5965 = Static458.anInt7955;
		Static216.anInt3459 = arg3;
		if (Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 1) {
			Static326.anInt5965 = 0;
		}
		Static42.method560(arg2);
		Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, true, Static49.aClass42_12.method730(Static259.anInt4113));
		@Pc(64) int local64 = Static454.anInt7910;
		@Pc(66) int local66 = Static48.anInt750;
		Static454.anInt7910 = (Static216.anInt3459 - (Static124.anInt2150 >> 4)) * 8;
		Static48.anInt750 = (Static544.anInt8919 - (Static64.anInt1015 >> 4)) * 8;
		Static415.aClass5_Sub2_Sub18_3 = Static407.method5512(Static216.anInt3459 * 8, Static544.anInt8919 * 8);
		Static652.aClass79_3 = null;
		@Pc(97) int local97 = Static454.anInt7910 - local64;
		@Pc(102) int local102 = Static48.anInt750 - local66;
		@Pc(123) int local123;
		@Pc(125) int local125;
		@Pc(173) int local173;
		@Pc(274) int local274;
		if (arg2 == 11) {
			for (local274 = 0; local274 < Static562.anInt9155; local274++) {
				@Pc(279) Class5_Sub34 local279 = Static278.aClass5_Sub34Array1[local274];
				if (local279 != null) {
					@Pc(284) Class41_Sub1_Sub1_Sub3_Sub1 local284 = local279.aClass41_Sub1_Sub1_Sub3_Sub1_1;
					for (local125 = 0; local125 < 10; local125++) {
						local284.anIntArray528[local125] -= local97;
						local284.anIntArray527[local125] -= local102;
					}
					local284.anInt10366 -= local97 * 512;
					local284.anInt10367 -= local102 * 512;
				}
			}
		} else {
			@Pc(109) boolean local109 = false;
			Static386.anInt6720 = 0;
			@Pc(117) int local117 = Static124.anInt2150 * 512 - 512;
			local123 = Static64.anInt1015 * 512 - 512;
			for (local125 = 0; local125 < Static562.anInt9155; local125++) {
				@Pc(130) Class5_Sub34 local130 = Static278.aClass5_Sub34Array1[local125];
				if (local130 != null) {
					@Pc(135) Class41_Sub1_Sub1_Sub3_Sub1 local135 = local130.aClass41_Sub1_Sub1_Sub3_Sub1_1;
					local135.anInt10366 -= local97 * 512;
					local135.anInt10367 -= local102 * 512;
					if (local135.anInt10366 >= 0 && local135.anInt10366 <= local117 && local135.anInt10367 >= 0 && local135.anInt10367 <= local123) {
						@Pc(171) boolean local171 = true;
						for (local173 = 0; local173 < 10; local173++) {
							local135.anIntArray528[local173] -= local97;
							local135.anIntArray527[local173] -= local102;
							if (local135.anIntArray528[local173] < 0 || local135.anIntArray528[local173] >= Static124.anInt2150 || local135.anIntArray527[local173] < 0 || local135.anIntArray527[local173] >= Static64.anInt1015) {
								local171 = false;
							}
						}
						if (local171) {
							Static662.anIntArray600[Static386.anInt6720++] = local135.anInt9469;
						} else {
							local135.method4716((Class311) null);
							local109 = true;
							local130.method8829();
						}
					} else {
						local135.method4716((Class311) null);
						local109 = true;
						local130.method8829();
					}
				}
			}
			if (local109) {
				Static562.anInt9155 = Static223.aClass335_19.method7767();
				Static223.aClass335_19.method7771(Static278.aClass5_Sub34Array1);
			}
		}
		for (local274 = 0; local274 < 2048; local274++) {
			@Pc(340) Class41_Sub1_Sub1_Sub3_Sub2 local340 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local274];
			if (local340 != null) {
				for (local123 = 0; local123 < 10; local123++) {
					local340.anIntArray528[local123] -= local97;
					local340.anIntArray527[local123] -= local102;
				}
				local340.anInt10367 -= local102 * 512;
				local340.anInt10366 -= local97 * 512;
			}
		}
		@Pc(389) Class358[] local389 = Static217.aClass358Array1;
		for (local123 = 0; local123 < local389.length; local123++) {
			@Pc(399) Class358 local399 = local389[local123];
			if (local399 != null) {
				local399.anInt9742 -= local102 * 512;
				local399.anInt9737 -= local97 * 512;
			}
		}
		@Pc(427) Class5_Sub47 local427;
		for (local427 = (Class5_Sub47) Static59.aClass124_60.method2572(); local427 != null; local427 = (Class5_Sub47) Static59.aClass124_60.method2569()) {
			local427.anInt9031 -= local102;
			local427.anInt9036 -= local97;
			if (Static566.anInt9293 != 4 && (local427.anInt9036 < 0 || local427.anInt9031 < 0 || Static124.anInt2150 <= local427.anInt9036 || local427.anInt9031 >= Static64.anInt1015)) {
				local427.method8829();
			}
		}
		for (local427 = (Class5_Sub47) Static227.aClass124_36.method2572(); local427 != null; local427 = (Class5_Sub47) Static227.aClass124_36.method2569()) {
			local427.anInt9031 -= local102;
			local427.anInt9036 -= local97;
			if (Static566.anInt9293 != 4 && (local427.anInt9036 < 0 || local427.anInt9031 < 0 || local427.anInt9036 >= Static124.anInt2150 || Static64.anInt1015 <= local427.anInt9031)) {
				local427.method8829();
			}
		}
		if (Static566.anInt9293 != 4) {
			for (@Pc(529) Class5_Sub24 local529 = (Class5_Sub24) Static109.aClass335_12.method7768(); local529 != null; local529 = (Class5_Sub24) Static109.aClass335_12.method7777()) {
				@Pc(536) int local536 = (int) (local529.aLong329 & 0x3FFFL);
				@Pc(541) int local541 = local536 - Static454.anInt7910;
				local173 = (int) (local529.aLong329 >> 14 & 0x3FFFL);
				@Pc(554) int local554 = local173 - Static48.anInt750;
				if (local541 < 0 || local554 < 0 || local541 >= Static124.anInt2150 || local554 >= Static64.anInt1015) {
					local529.method8829();
				}
			}
		}
		if (Static443.anInt7790 != 0) {
			Static154.anInt2536 -= local102;
			Static443.anInt7790 -= local97;
		}
		Static570.method7817();
		if (arg2 != 11) {
			Static345.anInt6197 -= local97;
			Static570.anInt9347 -= local97 * 512;
			Static293.anInt4550 -= local102;
			Static105.anInt1868 -= local102 * 512;
			Static144.anInt10373 -= local102;
			Static514.anInt8683 -= local97;
			if (Math.abs(local97) > Static124.anInt2150 || Math.abs(local102) > Static64.anInt1015) {
				Static3.method39();
			}
		} else if (Static133.anInt2254 == 4) {
			Static476.anInt8263 -= local97 * 512;
			Static602.anInt9872 -= local102 * 512;
			Static171.anInt2825 -= local97 * 512;
			Static170.anInt2808 -= local102 * 512;
		} else {
			Static67.anInt1033 = -1;
			Static297.anInt571 = -1;
			Static133.anInt2254 = 1;
		}
		Static556.method7639();
		Static191.method2757();
		Static614.aClass124_99.method2567();
		Static97.aClass124_11.method2567();
		Static261.aClass102_2.method2053();
		Static673.method8787();
	}
}

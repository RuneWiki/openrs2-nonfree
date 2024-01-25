import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!sga", name = "q", descriptor = "[I")
	public static int[] anIntArray595;

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "Lclient!taa;")
	public static final Class315 aClass315_3 = new Class315();

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "[I")
	public static final int[] anIntArray594 = new int[25];

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZIIII)V")
	public static void method7251(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg1 == Static415.anInt7580 && arg3 == Static127.anInt2955 && (Static576.anInt9519 == Static16.anInt308 || Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 1)) {
			return;
		}
		Static576.anInt9519 = Static16.anInt308;
		Static127.anInt2955 = arg3;
		Static415.anInt7580 = arg1;
		if (Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 1) {
			Static576.anInt9519 = 0;
		}
		Static51.method997(arg2);
		Static86.method1555(Static600.aClass87_15, true, Static628.aClass369_12.method8475(Static377.anInt6756), Static428.aClass64_11, Static305.aClass114_29);
		@Pc(62) int local62 = Static451.anInt7933;
		@Pc(64) int local64 = Static470.anInt8063;
		Static451.anInt7933 = (Static415.anInt7580 - (Static3.anInt46 >> 4)) * 8;
		Static470.anInt8063 = (Static127.anInt2955 - (Static270.anInt5194 >> 4)) * 8;
		Static103.aClass2_Sub5_Sub19_1 = Static292.method7052(Static415.anInt7580 * 8, Static127.anInt2955 * 8);
		Static318.aClass313_2 = null;
		@Pc(97) int local97 = Static451.anInt7933 - local62;
		@Pc(102) int local102 = Static470.anInt8063 - local64;
		@Pc(121) int local121;
		@Pc(123) int local123;
		@Pc(187) int local187;
		@Pc(282) int local282;
		if (arg2 == 11) {
			for (local282 = 0; local282 < Static225.anInt4616; local282++) {
				@Pc(287) Class2_Sub51 local287 = Static86.aClass2_Sub51Array1[local282];
				if (local287 != null) {
					@Pc(292) Class11_Sub1_Sub1_Sub2_Sub2 local292 = local287.aClass11_Sub1_Sub1_Sub2_Sub2_2;
					for (local123 = 0; local123 < 10; local123++) {
						local292.anIntArray232[local123] -= local97;
						local292.anIntArray233[local123] -= local102;
					}
					local292.anInt9925 -= local97 * 512;
					local292.anInt9929 -= local102 * 512;
				}
			}
		} else {
			@Pc(107) boolean local107 = false;
			Static228.anInt4647 = 0;
			@Pc(115) int local115 = Static3.anInt46 * 512 - 512;
			local121 = Static270.anInt5194 * 512 - 512;
			for (local123 = 0; local123 < Static225.anInt4616; local123++) {
				@Pc(128) Class2_Sub51 local128 = Static86.aClass2_Sub51Array1[local123];
				if (local128 != null) {
					@Pc(133) Class11_Sub1_Sub1_Sub2_Sub2 local133 = local128.aClass11_Sub1_Sub1_Sub2_Sub2_2;
					local133.anInt9925 -= local97 * 512;
					local133.anInt9929 -= local102 * 512;
					if (local133.anInt9925 >= 0 && local115 >= local133.anInt9925 && local133.anInt9929 >= 0 && local133.anInt9929 <= local121) {
						@Pc(185) boolean local185 = true;
						for (local187 = 0; local187 < 10; local187++) {
							local133.anIntArray232[local187] -= local97;
							local133.anIntArray233[local187] -= local102;
							if (local133.anIntArray232[local187] < 0 || local133.anIntArray232[local187] >= Static3.anInt46 || local133.anIntArray233[local187] < 0 || Static270.anInt5194 <= local133.anIntArray233[local187]) {
								local185 = false;
							}
						}
						if (local185) {
							Static160.anIntArray256[Static228.anInt4647++] = local133.anInt3246;
						} else {
							local133.method2785(null);
							local128.method8599();
							local107 = true;
						}
					} else {
						local133.method2785(null);
						local128.method8599();
						local107 = true;
					}
				}
			}
			if (local107) {
				Static225.anInt4616 = Static357.aClass222_23.method5473();
				Static357.aClass222_23.method5466(Static86.aClass2_Sub51Array1);
			}
		}
		for (local282 = 0; local282 < 2048; local282++) {
			@Pc(348) Class11_Sub1_Sub1_Sub2_Sub1 local348 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local282];
			if (local348 != null) {
				for (local121 = 0; local121 < 10; local121++) {
					local348.anIntArray232[local121] -= local97;
					local348.anIntArray233[local121] -= local102;
				}
				local348.anInt9925 -= local97 * 512;
				local348.anInt9929 -= local102 * 512;
			}
		}
		@Pc(397) Class60[] local397 = Static388.aClass60Array1;
		for (local121 = 0; local121 < local397.length; local121++) {
			@Pc(404) Class60 local404 = local397[local121];
			if (local404 != null) {
				local404.anInt1602 -= local97 * 512;
				local404.anInt1600 -= local102 * 512;
			}
		}
		for (@Pc(432) Class2_Sub3 local432 = (Class2_Sub3) Static234.aClass238_27.method5833(); local432 != null; local432 = (Class2_Sub3) Static234.aClass238_27.method5838()) {
			local432.anInt296 -= local97;
			local432.anInt286 -= local102;
			if (Static462.anInt8018 != 4 && (local432.anInt296 < 0 || local432.anInt286 < 0 || Static3.anInt46 <= local432.anInt296 || Static270.anInt5194 <= local432.anInt286)) {
				local432.method8599();
			}
		}
		if (Static462.anInt8018 != 4) {
			for (@Pc(490) Class2_Sub44 local490 = (Class2_Sub44) Static64.aClass222_5.method5474(); local490 != null; local490 = (Class2_Sub44) Static64.aClass222_5.method5472()) {
				@Pc(497) int local497 = (int) (local490.aLong287 & 0x3FFFL);
				@Pc(502) int local502 = local497 - Static451.anInt7933;
				local187 = (int) (local490.aLong287 >> 14 & 0x3FFFL);
				@Pc(515) int local515 = local187 - Static470.anInt8063;
				if (local502 < 0 || local515 < 0 || Static3.anInt46 <= local502 || Static270.anInt5194 <= local515) {
					local490.method8599();
				}
			}
		}
		if (Static129.anInt2985 != 0) {
			Static271.anInt5226 -= local102;
			Static129.anInt2985 -= local97;
		}
		Static188.method3423();
		if (arg2 != 11) {
			Static244.anInt4842 -= local97;
			Static556.anInt9172 -= local97;
			Static395.anInt3530 -= local102 * 512;
			Static307.anInt5655 -= local102;
			Static53.anInt1153 -= local97 * 512;
			Static597.anInt9840 -= local102;
			if (Math.abs(local97) > Static3.anInt46 || Math.abs(local102) > Static270.anInt5194) {
				Static57.method1058();
			}
		} else if (Static2.anInt31 == 4) {
			Static61.anInt1274 -= local102 * 512;
			Static215.anInt4487 -= local97 * 512;
			Static57.anInt1181 -= local102 * 512;
			Static85.anInt1773 -= local97 * 512;
		} else {
			Static644.anInt10296 = -1;
			Static23.anInt718 = -1;
			Static2.anInt31 = 1;
		}
		Static448.method6632();
		Static266.method4304();
		Static147.aClass238_25.method5841();
		Static280.aClass238_29.method5841();
		Static18.aClass143_1.method3537();
		Static275.method4410();
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(II)Z")
	public static boolean method7253(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Z")
	public static boolean aBoolean45;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
	public static final int[] anIntArray56 = new int[1024];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZBIZI)V")
	public static void method737(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static422.anInt7272 == arg1 && Static442.anInt7524 == arg3 && (Static367.anInt6555 == Static124.anInt2688 || Static123.aClass21_Sub1_1.method787(Static347.anInt6318))) {
			return;
		}
		Static422.anInt7272 = arg1;
		Static367.anInt6555 = Static124.anInt2688;
		Static442.anInt7524 = arg3;
		if (Static123.aClass21_Sub1_1.method787(Static347.anInt6318)) {
			Static367.anInt6555 = 0;
		}
		if (arg2) {
			Static293.method2805(28);
		} else {
			Static293.method2805(25);
		}
		Static373.method5170(Static277.aClass65_5, true, Static427.aClass175_237.method4201(Static216.anInt4257));
		@Pc(56) int local56 = Static108.anInt3458;
		Static108.anInt3458 = (Static422.anInt7272 - (Static399.anInt6923 >> 4)) * 8;
		@Pc(75) int local75 = Static339.anInt6223;
		Static339.anInt6223 = (Static442.anInt7524 - (Static127.anInt2696 >> 4)) * 8;
		Static213.aClass3_Sub3_Sub5_2 = Static210.method5874(Static422.anInt7272 * 8, Static442.anInt7524 * 8);
		Static17.aClass226_1 = null;
		@Pc(99) int local99 = Static108.anInt3458 - local56;
		@Pc(104) int local104 = Static339.anInt6223 - local75;
		@Pc(108) int local108;
		@Pc(117) int local117;
		if (arg2) {
			Static453.anInt7682 = 0;
			local108 = Static399.anInt6923 * 128 - 128;
			@Pc(173) int local173 = (Static127.anInt2696 - 1) * 128;
			for (local117 = 0; local117 < 32768; local117++) {
				@Pc(180) Class1_Sub3_Sub3_Sub2 local180 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local117];
				if (local180 != null) {
					local180.anInt6055 -= local104 * 128;
					local180.anInt6053 -= local99 * 128;
					if (local180.anInt6053 >= 0 && local180.anInt6053 <= local108 && local180.anInt6055 >= 0 && local180.anInt6055 <= local173) {
						@Pc(229) boolean local229 = true;
						for (@Pc(231) int local231 = 0; local231 < 10; local231++) {
							local180.anIntArray453[local231] -= local99;
							local180.anIntArray454[local231] -= local104;
							if (local180.anIntArray453[local231] < 0 || local180.anIntArray453[local231] >= Static399.anInt6923 || local180.anIntArray454[local231] < 0 || Static127.anInt2696 <= local180.anIntArray454[local231]) {
								local229 = false;
							}
						}
						if (local229) {
							anIntArray56[Static453.anInt7682++] = local117;
						} else {
							Static451.aClass1_Sub3_Sub3_Sub2Array1[local117].method4854(null);
							Static451.aClass1_Sub3_Sub3_Sub2Array1[local117] = null;
						}
					} else {
						Static451.aClass1_Sub3_Sub3_Sub2Array1[local117].method4854(null);
						Static451.aClass1_Sub3_Sub3_Sub2Array1[local117] = null;
					}
				}
			}
		} else {
			for (local108 = 0; local108 < 32768; local108++) {
				@Pc(113) Class1_Sub3_Sub3_Sub2 local113 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local108];
				if (local113 != null) {
					for (local117 = 0; local117 < 10; local117++) {
						local113.anIntArray453[local117] -= local99;
						local113.anIntArray454[local117] -= local104;
					}
					local113.anInt6053 -= local99 * 128;
					local113.anInt6055 -= local104 * 128;
				}
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(308) Class1_Sub3_Sub3_Sub1 local308 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local108];
			if (local308 != null) {
				for (local117 = 0; local117 < 10; local117++) {
					local308.anIntArray453[local117] -= local99;
					local308.anIntArray454[local117] -= local104;
				}
				local308.anInt6053 -= local99 * 128;
				local308.anInt6055 -= local104 * 128;
			}
		}
		@Pc(355) Class125[] local355 = Static370.aClass125Array1;
		for (local117 = 0; local117 < local355.length; local117++) {
			@Pc(362) Class125 local362 = local355[local117];
			if (local362 != null) {
				local362.anInt3864 -= local104 * 128;
				local362.anInt3866 -= local99 * 128;
			}
		}
		Static217.method3471(local99, local104);
		for (@Pc(398) Class3_Sub15 local398 = (Class3_Sub15) Static342.aClass229_39.method5328(); local398 != null; local398 = (Class3_Sub15) Static342.aClass229_39.method5325()) {
			local398.anInt2014 -= local104;
			local398.anInt2022 -= local99;
			if (Static197.anInt4304 != 3 && (local398.anInt2022 < 0 || local398.anInt2014 < 0 || local398.anInt2022 >= Static399.anInt6923 || Static127.anInt2696 <= local398.anInt2014)) {
				local398.method5987();
			}
		}
		if (Static388.anInt6735 != 0) {
			Static116.anInt6680 -= local104;
			Static388.anInt6735 -= local99;
		}
		Static102.method583();
		if (arg2) {
			Static267.anInt5000 -= local104;
			Static283.anInt5199 -= local104;
			Static398.anInt6901 -= local99 * 128;
			Static400.anInt6966 -= local99;
			Static243.anInt4634 -= local99;
			Static80.anInt1722 -= local104 * 128;
			if (Math.abs(local99) > Static399.anInt6923 || Math.abs(local104) > Static127.anInt2696) {
				Static373.method5169();
			}
		} else if (Static107.anInt2382 == 4) {
			Static222.anInt4311 -= local99 * 128;
			Static358.anInt5918 -= local104 * 128;
			Static288.anInt5279 -= local99 * 128;
			Static334.anInt6158 -= local104 * 128;
		} else {
			Static107.anInt2382 = 1;
		}
		Static40.method5991();
		Static338.method1145();
		Static324.aClass229_4.method5326();
		Static144.aClass229_24.method5326();
		Static56.aClass40_1.method1194();
		Static325.method4722();
	}
}

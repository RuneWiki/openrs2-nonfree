import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dq", name = "J", descriptor = "Lclient!gl;")
	public static Class2 aClass2_2;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
	public static int anInt1526;

	@OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
	public static int anInt1530;

	@OriginalMember(owner = "client!dq", name = "R", descriptor = "I")
	public static int anInt1529 = 0;

	@OriginalMember(owner = "client!dq", name = "S", descriptor = "[I")
	public static int[] anIntArray110 = new int[2];

	@OriginalMember(owner = "client!dq", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZBIIZIII)V")
	public static void method1496(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg3 && arg2 == Static217.anInt4356 && Static31.anInt735 == arg6 && (Static125.anInt2720 == arg1 || Static96.method2208())) {
			return;
		}
		Static125.anInt2720 = arg1;
		Static31.anInt735 = arg6;
		Static217.anInt4356 = arg2;
		if (Static96.method2208()) {
			Static125.anInt2720 = 0;
		}
		if (arg0) {
			Static67.method1662(28);
		} else {
			Static67.method1662(25);
		}
		Static162.method3226(Static84.aString78, true, Static245.aClass30_7);
		@Pc(61) int local61 = Static151.anInt3234;
		@Pc(63) int local63 = Static251.anInt3170;
		Static151.anInt3234 = (Static217.anInt4356 - (Static195.anInt3965 >> 4)) * 8;
		Static251.anInt3170 = (Static31.anInt735 - (Static298.anInt5716 >> 4)) * 8;
		Static166.aClass14_Sub2_Sub14_1 = Static241.method5058(Static217.anInt4356 * 8, Static31.anInt735 * 8);
		Static112.aClass163_1 = null;
		@Pc(95) int local95 = Static151.anInt3234 - local61;
		@Pc(100) int local100 = Static251.anInt3170 - local63;
		@Pc(110) int local110;
		@Pc(118) int local118;
		if (arg0) {
			Static315.anInt6456 = 0;
			local110 = (Static195.anInt3965 - 1) * 128;
			@Pc(116) int local116 = (Static298.anInt5716 - 1) * 128;
			for (local118 = 0; local118 < 32768; local118++) {
				@Pc(124) Class10_Sub3_Sub3_Sub1 local124 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local118];
				if (local124 != null) {
					local124.anInt5908 -= local100 * 128;
					local124.anInt5910 -= local95 * 128;
					if (local124.anInt5910 >= 0 && local110 >= local124.anInt5910 && local124.anInt5908 >= 0 && local124.anInt5908 <= local116) {
						@Pc(168) boolean local168 = true;
						for (@Pc(170) int local170 = 0; local170 < 10; local170++) {
							local124.anIntArray535[local170] -= local95;
							local124.anIntArray536[local170] -= local100;
							if (local124.anIntArray535[local170] < 0 || local124.anIntArray535[local170] >= Static195.anInt3965 || local124.anIntArray536[local170] < 0 || Static298.anInt5716 <= local124.anIntArray536[local170]) {
								local168 = false;
							}
						}
						if (local168) {
							Static98.anIntArray205[Static315.anInt6456++] = local118;
						} else {
							Static266.aClass10_Sub3_Sub3_Sub1Array1[local118].method4957(null);
							Static266.aClass10_Sub3_Sub3_Sub1Array1[local118] = null;
						}
					} else {
						Static266.aClass10_Sub3_Sub3_Sub1Array1[local118].method4957(null);
						Static266.aClass10_Sub3_Sub3_Sub1Array1[local118] = null;
					}
				}
			}
		} else {
			for (local110 = 0; local110 < 32768; local110++) {
				@Pc(272) Class10_Sub3_Sub3_Sub1 local272 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local110];
				if (local272 != null) {
					for (local118 = 0; local118 < 10; local118++) {
						local272.anIntArray535[local118] -= local95;
						local272.anIntArray536[local118] -= local100;
					}
					local272.anInt5910 -= local95 * 128;
					local272.anInt5908 -= local100 * 128;
				}
			}
		}
		for (local110 = 0; local110 < 2048; local110++) {
			@Pc(328) Class10_Sub3_Sub3_Sub2 local328 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local110];
			if (local328 != null) {
				for (local118 = 0; local118 < 10; local118++) {
					local328.anIntArray535[local118] -= local95;
					local328.anIntArray536[local118] -= local100;
				}
				local328.anInt5910 -= local95 * 128;
				local328.anInt5908 -= local100 * 128;
			}
		}
		Static219.anInt4400 = arg1;
		Static173.aClass10_Sub3_Sub3_Sub2_1.method5378(arg4, false, arg5, Static219.anInt4400);
		Static79.method1951(local95, local100);
		for (@Pc(394) Class14_Sub6 local394 = (Class14_Sub6) Static93.aClass18_8.method459(); local394 != null; local394 = (Class14_Sub6) Static93.aClass18_8.method453()) {
			local394.anInt867 -= local95;
			local394.anInt874 -= local100;
			if (local394.anInt867 < 0 || local394.anInt874 < 0 || local394.anInt867 >= Static195.anInt3965 || local394.anInt874 >= Static298.anInt5716) {
				local394.method5986();
			}
		}
		if (Static140.anInt2984 != 0) {
			Static213.anInt4250 -= local100;
			Static140.anInt2984 -= local95;
		}
		Static58.anInt1401 = 0;
		if (arg0) {
			Static215.anInt4291 -= local100;
			Static141.anInt2986 -= local100 * 128;
			Static124.anInt2717 -= local95 * 128;
			Static341.anInt6533 -= local95;
			Static162.anInt3405 -= local100;
			Static273.anInt5190 -= local95;
			if (Math.abs(local95) > Static195.anInt3965 || Math.abs(local100) > Static298.anInt5716) {
				Static159.method3098();
			}
		} else if (Static205.anInt4115 == 4) {
			Static41.anInt982 -= local95 * 128;
			Static141.anInt2992 -= local100 * 128;
			Static17.anInt349 -= local95 * 128;
			Static340.anInt6526 -= local100 * 128;
		} else {
			Static205.anInt4115 = 1;
		}
		Static188.method3593();
		Static255.method4392();
		Static54.aClass18_4.method461();
		Static69.aClass18_5.method461();
		Static242.aClass126_5.method3398();
		Static327.method5627();
	}

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
	public static void method1498() {
		@Pc(8) int[] local8 = new int[Static178.anInt3666];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static178.anInt3666; local12++) {
			@Pc(18) Class220 local18 = Static296.method5066(local12);
			if (local18.anInt6694 >= 0 || local18.anInt6709 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static294.anIntArray515 = new int[local10];
		for (@Pc(50) int local50 = 0; local50 < local10; local50++) {
			Static294.anIntArray515[local50] = local8[local50];
		}
	}
}

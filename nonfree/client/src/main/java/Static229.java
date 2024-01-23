import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public static int anInt4845;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public static int anInt4846;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V")
	public static void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static65.method1138(arg5);
		@Pc(10) int local10 = 0;
		@Pc(19) int local19 = arg5 - arg3;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(29) int local29 = arg5;
		@Pc(31) int local31 = local19;
		@Pc(33) int local33 = -1;
		@Pc(36) int local36 = -local19;
		@Pc(39) int local39 = -arg5;
		@Pc(41) int local41 = -1;
		@Pc(45) int[] local45 = Static121.anIntArrayArray33[arg0];
		@Pc(50) int local50 = arg1 - local19;
		Static98.method3942(local50, local45, arg4, arg1 - arg5);
		@Pc(65) int local65 = local19 + arg1;
		Static98.method3942(local65, local45, arg2, local50);
		Static98.method3942(arg1 + arg5, local45, arg4, local65);
		while (local29 > local10) {
			local41 += 2;
			local33 += 2;
			local39 += local33;
			local36 += local41;
			if (local36 >= 0 && local31 >= 1) {
				Static126.anIntArray277[local31] = local10;
				local31--;
				local36 -= local31 << 1;
			}
			local10++;
			@Pc(129) int[] local129;
			@Pc(140) int[] local140;
			@Pc(133) int local133;
			@Pc(145) int local145;
			@Pc(183) int local183;
			@Pc(191) int local191;
			@Pc(196) int local196;
			if (local39 >= 0) {
				local29--;
				if (local29 >= local19) {
					local129 = Static121.anIntArrayArray33[local29 + arg0];
					local133 = arg1 + local10;
					local140 = Static121.anIntArrayArray33[arg0 - local29];
					local145 = arg1 - local10;
					Static98.method3942(local133, local129, arg4, local145);
					Static98.method3942(local133, local140, arg4, local145);
				} else {
					local140 = Static121.anIntArrayArray33[arg0 - local29];
					local129 = Static121.anIntArrayArray33[local29 + arg0];
					local133 = Static126.anIntArray277[local29];
					local183 = arg1 - local10;
					local145 = local10 + arg1;
					local191 = arg1 + local133;
					local196 = arg1 - local133;
					Static98.method3942(local196, local129, arg4, local183);
					Static98.method3942(local191, local129, arg2, local196);
					Static98.method3942(local145, local129, arg4, local191);
					Static98.method3942(local196, local140, arg4, local183);
					Static98.method3942(local191, local140, arg2, local196);
					Static98.method3942(local145, local140, arg4, local191);
				}
				local39 -= local29 << 1;
			}
			local129 = Static121.anIntArrayArray33[arg0 + local10];
			local140 = Static121.anIntArrayArray33[arg0 - local10];
			local145 = arg1 - local29;
			local133 = local29 + arg1;
			if (local19 > local10) {
				local183 = local10 > local31 ? Static126.anIntArray277[local10] : local31;
				local191 = arg1 + local183;
				local196 = arg1 - local183;
				Static98.method3942(local196, local129, arg4, local145);
				Static98.method3942(local191, local129, arg2, local196);
				Static98.method3942(local133, local129, arg4, local191);
				Static98.method3942(local196, local140, arg4, local145);
				Static98.method3942(local191, local140, arg2, local196);
				Static98.method3942(local133, local140, arg4, local191);
			} else {
				Static98.method3942(local133, local129, arg4, local145);
				Static98.method3942(local133, local140, arg4, local145);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public static void method3620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class1_Sub2 local30 = Static7.aClass1_Sub2ArrayArrayArray1[local9][arg0][arg1] = Static7.aClass1_Sub2ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt47--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt45; local40++) {
					@Pc(49) Class7 local49 = local30.aClass7Array1[local40];
					if ((local49.aLong7 >> 29 & 0x3L) == 2L && local49.anInt214 == arg0 && local49.anInt220 == arg1) {
						local49.anInt222--;
					}
				}
			}
		}
		if (Static7.aClass1_Sub2ArrayArrayArray1[0][arg0][arg1] == null) {
			Static7.aClass1_Sub2ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub2(0, arg0, arg1);
		}
		Static7.aClass1_Sub2ArrayArrayArray1[0][arg0][arg1].aClass1_Sub2_1 = local7;
		Static7.aClass1_Sub2ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIZIIIIZ)V")
	public static void method3621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg2 && Static288.anInt5790 == arg3 && arg4 == Static279.anInt5604 && (arg0 == Static204.anInt4430 || Static241.method3782())) {
			return;
		}
		Static279.anInt5604 = arg4;
		Static288.anInt5790 = arg3;
		Static204.anInt4430 = arg0;
		if (Static241.method3782()) {
			Static204.anInt4430 = 0;
		}
		if (arg6) {
			Static112.method1823(28);
		} else {
			Static112.method1823(25);
		}
		Static182.method2957(Static115.aString149, true);
		@Pc(59) int local59 = Static217.anInt4673;
		Static217.anInt4673 = (arg4 - 6) * 8;
		@Pc(67) int local67 = Static159.anInt3527;
		Static159.anInt3527 = (arg3 - 6) * 8;
		Static186.aClass1_Sub3_Sub15_3 = Static268.method2006(Static288.anInt5790 * 8, Static279.anInt5604 * 8);
		@Pc(85) int local85 = Static159.anInt3527 - local67;
		Static309.aClass174_3 = null;
		@Pc(94) int local94 = Static217.anInt4673 - local59;
		@Pc(102) int local102;
		@Pc(109) Class2_Sub4_Sub1 local109;
		@Pc(159) int local159;
		if (arg6) {
			Static147.anInt3287 = 0;
			for (local102 = 0; local102 < 32768; local102++) {
				local109 = Static105.aClass2_Sub4_Sub1Array1[local102];
				if (local109 != null) {
					local109.anInt2794 -= local94 * 128;
					local109.anInt2846 -= local85 * 128;
					if (local109.anInt2846 >= 0 && local109.anInt2846 <= 13184 && local109.anInt2794 >= 0 && local109.anInt2794 <= 13184) {
						for (local159 = 0; local159 < 10; local159++) {
							local109.anIntArray283[local159] -= local85;
							local109.anIntArray286[local159] -= local94;
						}
						Static100.anIntArray224[Static147.anInt3287++] = local102;
					} else {
						Static105.aClass2_Sub4_Sub1Array1[local102].method1239(null);
						Static105.aClass2_Sub4_Sub1Array1[local102] = null;
					}
				}
			}
		} else {
			for (local102 = 0; local102 < 32768; local102++) {
				local109 = Static105.aClass2_Sub4_Sub1Array1[local102];
				if (local109 != null) {
					for (local159 = 0; local159 < 10; local159++) {
						local109.anIntArray283[local159] -= local85;
						local109.anIntArray286[local159] -= local94;
					}
					local109.anInt2846 -= local85 * 128;
					local109.anInt2794 -= local94 * 128;
				}
			}
		}
		for (local102 = 0; local102 < 2048; local102++) {
			@Pc(263) Class2_Sub4_Sub2 local263 = Static155.aClass2_Sub4_Sub2Array1[local102];
			if (local263 != null) {
				for (local159 = 0; local159 < 10; local159++) {
					local263.anIntArray283[local159] -= local85;
					local263.anIntArray286[local159] -= local94;
				}
				local263.anInt2794 -= local94 * 128;
				local263.anInt2846 -= local85 * 128;
			}
		}
		@Pc(312) byte local312 = 0;
		@Pc(314) byte local314 = 104;
		Static185.anInt4085 = arg0;
		@Pc(318) byte local318 = 1;
		Static56.aClass2_Sub4_Sub2_1.method2110(arg5, arg1, false);
		if (local85 < 0) {
			local314 = -1;
			local318 = -1;
			local312 = 103;
		}
		@Pc(337) byte local337 = 0;
		@Pc(339) byte local339 = 104;
		@Pc(341) byte local341 = 1;
		if (local94 < 0) {
			local341 = -1;
			local339 = -1;
			local337 = 103;
		}
		for (@Pc(355) int local355 = local312; local355 != local314; local355 += local318) {
			for (@Pc(364) int local364 = local337; local364 != local339; local364 += local341) {
				@Pc(371) int local371 = local85 + local355;
				@Pc(375) int local375 = local364 + local94;
				for (@Pc(377) int local377 = 0; local377 < 4; local377++) {
					if (local371 >= 0 && local375 >= 0 && local371 < 104 && local375 < 104) {
						Static20.aClass26ArrayArrayArray1[local377][local355][local364] = Static20.aClass26ArrayArrayArray1[local377][local371][local375];
					} else {
						Static20.aClass26ArrayArrayArray1[local377][local355][local364] = null;
					}
				}
			}
		}
		for (@Pc(446) Class1_Sub4 local446 = (Class1_Sub4) Static122.aClass26_26.method666(); local446 != null; local446 = (Class1_Sub4) Static122.aClass26_26.method672()) {
			local446.anInt903 -= local85;
			local446.anInt917 -= local94;
			if (local446.anInt903 < 0 || local446.anInt917 < 0 || local446.anInt903 >= 104 || local446.anInt917 >= 104) {
				local446.method4767();
			}
		}
		Static168.anInt3772 = 0;
		if (Static280.anInt5624 != 0) {
			Static259.anInt5240 -= local94;
			Static280.anInt5624 -= local85;
		}
		if (arg6) {
			Static222.anInt4708 -= local94;
			Static82.anInt1930 -= local85;
			Static94.anInt2161 -= local94 * 128;
			Static206.anInt4454 -= local94;
			Static58.anInt1269 -= local85 * 128;
			Static49.anInt1170 -= local85;
		} else if (Static106.anInt2378 == 4) {
			Static23.anInt641 -= local94 * 128;
			Static28.anInt741 -= local85 * 128;
			Static109.anInt2425 -= local85 * 128;
			Static315.anInt6303 -= local94 * 128;
		} else {
			Static106.anInt2378 = 1;
		}
		if (Static294.aBoolean367 && arg6 && (Math.abs(local85) > 104 || Math.abs(local94) > 104)) {
			Static170.method2761();
		}
		Static222.method3480();
		Static250.aClass26_48.method667();
		Static315.aClass26_61.method667();
		Static42.method867();
	}
}

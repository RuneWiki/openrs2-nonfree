import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)I")
	public static int method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static22.anIntArrayArray12 == null ? 0 : Static22.anIntArrayArray12[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!vq;Z)V")
	public static void method3980(@OriginalArg(0) Class47 arg0) {
		@Pc(7) int local7 = Static70.anInt1838;
		@Pc(9) int local9 = Static127.anInt3018;
		@Pc(11) int local11 = Static302.anInt5773;
		@Pc(15) int local15 = Static184.anInt3880 - 3;
		if (Static85.aClass58_10 == null || Static340.aClass58_45 == null) {
			if (Static316.aClass193_99.method5064(Static335.anInt6408) && Static316.aClass193_99.method5064(Static351.anInt6675)) {
				Static85.aClass58_10 = arg0.method2677(Static362.method3098(Static316.aClass193_99, Static335.anInt6408, 0));
				@Pc(44) Class110 local44 = Static362.method3098(Static316.aClass193_99, Static351.anInt6675, 0);
				Static340.aClass58_45 = arg0.method2677(local44);
				local44.method3085();
				Static117.aClass58_15 = arg0.method2677(local44);
			} else {
				arg0.method2682(local7, local9, local11, 20, 255 - Static97.anInt2520 << 24 | Static213.anInt4405, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static85.aClass58_10 != null && Static340.aClass58_45 != null) {
			local88 = (local11 - Static340.aClass58_45.method4279() * 2) / Static85.aClass58_10.method4279();
			for (local90 = 0; local90 < local88; local90++) {
				Static85.aClass58_10.method4269(local7 + Static340.aClass58_45.method4279() + local90 * Static85.aClass58_10.method4279(), local9);
			}
			Static340.aClass58_45.method4269(local7, local9);
			Static117.aClass58_15.method4269(local7 + local11 - Static117.aClass58_15.method4279(), local9);
		}
		Static282.aClass51_4.method4237(Static243.anInt5990 | 0xFF000000, -1, local7 + 3, Static212.aClass159_150.method4311(Static180.anInt3835), local9 + 14);
		arg0.method2682(local7, local9 + 20, local11, local15 - 20, 255 - Static97.anInt2520 << 24 | Static213.anInt4405, 1);
		local88 = Static258.aClass127_1.method3588();
		local90 = Static258.aClass127_1.method3595();
		@Pc(190) int local190;
		for (@Pc(172) int local172 = 0; local172 < Static105.anInt2645; local172++) {
			local190 = local9 + (Static105.anInt2645 - 1 - local172) * 16 + 20 + 13;
			if (local88 > local7 && local7 + local11 > local88 && local190 - 13 < local90 && local190 + 4 > local90) {
				arg0.method2682(local7, local190 - 12, local11, 16, Static98.anInt2538 | 255 - Static255.anInt5172 << 24, 1);
			}
		}
		if ((Static86.aClass58_11 == null || Static312.aClass58_41 == null || Static209.aClass58_27 == null) && Static316.aClass193_99.method5064(Static147.anInt3295) && Static316.aClass193_99.method5064(Static285.anInt5607) && Static316.aClass193_99.method5064(Static47.anInt1282)) {
			@Pc(259) Class110 local259 = Static362.method3098(Static316.aClass193_99, Static285.anInt5607, 0);
			Static312.aClass58_41 = arg0.method2677(local259);
			local259.method3085();
			Static205.aClass58_26 = arg0.method2677(local259);
			Static86.aClass58_11 = arg0.method2677(Static362.method3098(Static316.aClass193_99, Static147.anInt3295, 0));
			@Pc(284) Class110 local284 = Static362.method3098(Static316.aClass193_99, Static47.anInt1282, 0);
			Static209.aClass58_27 = arg0.method2677(local284);
			local284.method3085();
			Static166.aClass58_22 = arg0.method2677(local284);
		}
		@Pc(356) int local356;
		@Pc(358) int local358;
		if (Static86.aClass58_11 != null && Static312.aClass58_41 != null && Static209.aClass58_27 != null) {
			local190 = (local11 - Static209.aClass58_27.method4279() * 2) / Static86.aClass58_11.method4279();
			for (@Pc(315) int local315 = 0; local315 < local190; local315++) {
				Static86.aClass58_11.method4269(local7 + Static209.aClass58_27.method4279() + local315 * Static86.aClass58_11.method4279(), local9 - -local15 + -Static86.aClass58_11.method4274());
			}
			local356 = (local15 - Static209.aClass58_27.method4274() - 20) / Static312.aClass58_41.method4274();
			for (local358 = 0; local358 < local356; local358++) {
				Static312.aClass58_41.method4269(local7, local358 * Static312.aClass58_41.method4274() + local9 + 20);
				Static205.aClass58_26.method4269(local11 + local7 - Static205.aClass58_26.method4279(), Static312.aClass58_41.method4274() * local358 + 20 + local9);
			}
			Static209.aClass58_27.method4269(local7, local9 + local15 - Static209.aClass58_27.method4274());
			Static166.aClass58_22.method4269(local7 + local11 - Static209.aClass58_27.method4279(), local9 - -local15 - Static209.aClass58_27.method4274());
		}
		local190 = 0;
		for (@Pc(425) Class4_Sub39 local425 = (Class4_Sub39) Static58.aClass116_7.method3270(); local425 != null; local425 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
			local356 = local9 + (Static105.anInt2645 + -1 + -local190) * 16 + 33;
			local358 = Static243.anInt5990 | 0xFF000000;
			if (local88 > local7 && local88 < local7 + local11 && local90 > local356 - 13 && local90 < local356 + 4) {
				local358 = Static34.anInt966 | 0xFF000000;
			}
			@Pc(478) int[] local478 = null;
			if (Static152.method3020(local425.anInt5716)) {
				local478 = Static177.method3465((int) local425.aLong184).anIntArray496;
			} else if (Static304.method4987(local425.anInt5716)) {
				@Pc(525) Class8_Sub1_Sub2_Sub2 local525 = Static169.aClass8_Sub1_Sub2_Sub2Array1[(int) local425.aLong184];
				if (local525 != null) {
					local478 = local525.aClass141_1.anIntArray377;
				}
			} else if (Static183.method3518(local425.anInt5716)) {
				if (local425.anInt5716 == 1004) {
					local478 = Static113.method2380((int) local425.aLong184).anIntArray21;
				} else {
					local478 = Static113.method2380((int) (local425.aLong184 >>> 32 & 0x7FFFFFFFL)).anIntArray21;
				}
			}
			@Pc(547) String local547 = Static218.method3959(local425);
			if (local478 != null) {
				local547 = local547 + Static184.method3524(local478);
			}
			Static282.aClass51_4.method4235(local356, local7 + 3, Static312.anIntArray475, Static225.aClass58Array87, local358, local547);
			local190++;
		}
		Static1.method4523(Static70.anInt1838, Static302.anInt5773, Static127.anInt3018, Static184.anInt3880);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public static int anInt5120;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public static int anInt5123;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	public static volatile int anInt5122 = 0;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "[I")
	public static final int[] anIntArray466 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!e;I[[IZ)V")
	public static void method4580(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) boolean arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			@Pc(23) int[][] local23;
			@Pc(25) int local25;
			@Pc(29) int local29;
			if (arg2 == null) {
				local23 = null;
			} else {
				local23 = new int[Static195.anInt3965 + 1][Static298.anInt5716 + 1];
				for (local25 = 0; local25 <= Static298.anInt5716; local25++) {
					for (local29 = 0; local29 <= Static195.anInt3965; local29++) {
						local23[local29][local25] = Static1.anIntArrayArrayArray12[local11][local29][local25] - arg2[local29][local25];
					}
				}
			}
			local25 = 0;
			local29 = 0;
			if (!arg3) {
				if (Static9.aBoolean10) {
					local25 = 2;
				}
				if (Static185.aBoolean242) {
					local29 = 8;
				}
				if (Static109.anInt2428 != 0) {
					if (local11 == 0 || Static127.anInt2786 >= 96) {
						local29 |= 0x10;
					}
					local25 |= 0x1;
				}
			}
			if (Static9.aBoolean10) {
				local29 |= 0x7;
			}
			@Pc(126) Class114 local126 = arg0.method5150(Static195.anInt3965, Static298.anInt5716, Static1.anIntArrayArrayArray12[local11], local23, local25, local29);
			Static311.method5700(local11, local126);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLclient!mo;)V")
	public static void method4581(@OriginalArg(1) Class143 arg0) {
		Static221.aClass143_82 = arg0;
		Static223.anInt5822 = Static221.aClass143_82.method3732(4);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z")
	public static boolean method4583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static302.aBoolean409) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static182.aClass146ArrayArray1[local18] == null || Static182.aClass146ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class146 local40 = Static182.aClass146ArrayArray1[local18][local22];
		@Pc(52) Class14_Sub23 local52;
		if (arg0 == -1 && local40.anInt4135 == 0) {
			for (local52 = (Class14_Sub23) Static95.aClass18_9.method459(); local52 != null; local52 = (Class14_Sub23) Static95.aClass18_9.method453()) {
				if (local52.anInt4355 == 29 || local52.anInt4355 == 1004 || local52.anInt4355 == 46 || local52.anInt4355 == 37 || local52.anInt4355 == 25) {
					for (@Pc(83) Class146 local83 = Static273.method4632(local52.anInt4350); local83 != null; local83 = Static78.method1945(local83)) {
						if (local83.anInt4214 == local40.anInt4214) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class14_Sub23) Static95.aClass18_9.method459(); local52 != null; local52 = (Class14_Sub23) Static95.aClass18_9.method453()) {
				if (arg0 == local52.anInt4351 && local52.anInt4350 == local40.anInt4214 && (local52.anInt4355 == 29 || local52.anInt4355 == 1004 || local52.anInt4355 == 46 || local52.anInt4355 == 37 || local52.anInt4355 == 25)) {
					return true;
				}
			}
		}
		return false;
	}
}

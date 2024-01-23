import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "[S")
	public static short[] aShortArray51;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "[J")
	public static long[] aLongArray6 = new long[500];

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString85 = "wave2:";

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method1971(@OriginalArg(0) long arg0) {
		return Static45.method819(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!og;I)V")
	public static void method1972(@OriginalArg(0) Class127 arg0) {
		@Pc(4) int local4 = arg0.anInt3566;
		if (local4 == 324) {
			if (Static129.anInt3880 == -1) {
				Static169.anInt3103 = arg0.anInt3616;
				Static129.anInt3880 = arg0.anInt3630;
			}
			if (Static10.aClass149_1.aBoolean390) {
				arg0.anInt3630 = Static129.anInt3880;
			} else {
				arg0.anInt3630 = Static169.anInt3103;
			}
		} else if (local4 == 325) {
			if (Static129.anInt3880 == -1) {
				Static129.anInt3880 = arg0.anInt3630;
				Static169.anInt3103 = arg0.anInt3616;
			}
			if (Static10.aClass149_1.aBoolean390) {
				arg0.anInt3630 = Static169.anInt3103;
			} else {
				arg0.anInt3630 = Static129.anInt3880;
			}
		} else if (local4 == 327) {
			arg0.anInt3577 = 150;
			arg0.anInt3620 = (int) (Math.sin((double) Static261.anInt5259 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3592 = 5;
			arg0.anInt3560 = -1;
		} else if (local4 == 328) {
			if (Static28.aClass6_Sub6_Sub2_1.aString147 == null) {
				arg0.anInt3560 = 0;
			} else {
				arg0.anInt3577 = 150;
				arg0.anInt3620 = (int) (Math.sin((double) Static261.anInt5259 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3592 = 5;
				arg0.anInt3560 = ((int) Static136.method2158(Static28.aClass6_Sub6_Sub2_1.aString147) << 11) + 2047;
				arg0.anInt3569 = 0;
				arg0.anInt3623 = Static28.aClass6_Sub6_Sub2_1.anInt4544;
				arg0.anInt3581 = Static28.aClass6_Sub6_Sub2_1.anInt4526;
				arg0.anInt3624 = Static28.aClass6_Sub6_Sub2_1.anInt4507;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1973(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() <= 9) {
			return local8.length() > 6 ? " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static191.aString131 + " (" + local8 + ")</col>" : " <col=ffff00>" + local8 + "</col>";
		} else {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static101.aString58 + " (" + local8 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
	public static void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static174.anInt3201 = arg3;
		Static253.anInt5155 = arg4;
		Static93.anInt1772 = arg1;
		Static53.anInt1117 = arg2;
		Static156.anInt1710 = arg0;
		if (Static174.anInt3201 >= 100) {
			@Pc(22) int local22 = Static53.anInt1117 * 128 + 64;
			@Pc(28) int local28 = Static253.anInt5155 * 128 + 64;
			@Pc(36) int local36 = Static124.method1919(Static159.anInt2978, local28, local22) - Static93.anInt1772;
			@Pc(41) int local41 = local28 - Static182.anInt3398;
			@Pc(46) int local46 = local36 - Static185.anInt3457;
			@Pc(50) int local50 = local22 - Static68.anInt4743;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local41 * local41 + local50 * local50));
			Static77.anInt1548 = (int) (Math.atan2((double) local46, (double) local62) * 325.949D) & 0x7FF;
			Static56.anInt1177 = (int) (-325.949D * Math.atan2((double) local41, (double) local50)) & 0x7FF;
			if (Static77.anInt1548 < 128) {
				Static77.anInt1548 = 128;
			}
			if (Static77.anInt1548 > 383) {
				Static77.anInt1548 = 383;
			}
		}
		Static109.anInt2057 = 2;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZLclient!pi;III)V")
	public static void method1976(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static25.anInt2862 >= 50 || (arg1 == null || arg1.anIntArrayArray31 == null || arg3 >= arg1.anIntArrayArray31.length || arg1.anIntArrayArray31[arg3] == null)) {
			return;
		}
		@Pc(39) int local39 = arg1.anIntArrayArray31[arg3][0];
		@Pc(45) int local45 = local39 >> 5 & 0x7;
		@Pc(49) int local49 = local39 & 0x1F;
		@Pc(53) int local53 = local39 >> 8;
		@Pc(70) int local70;
		if (arg1.anIntArrayArray31[arg3].length > 1) {
			local70 = (int) ((double) arg1.anIntArrayArray31[arg3].length * Math.random());
			if (local70 > 0) {
				local53 = arg1.anIntArrayArray31[arg3][local70];
			}
		}
		if (local49 == 0) {
			if (arg0) {
				Static274.method4193(local45, 0, local53, 255);
			}
		} else if (Static267.anInt5346 != 0) {
			Static55.anIntArray139[Static25.anInt2862] = local53;
			local70 = (arg4 - 64) / 128;
			Static237.anIntArray360[Static25.anInt2862] = local45;
			Static207.anIntArray471[Static25.anInt2862] = 0;
			Static221.aClass44Array1[Static25.anInt2862] = null;
			Static282.anIntArray689[Static25.anInt2862] = 255;
			@Pc(132) int local132 = (arg2 - 64) / 128;
			Static93.anIntArray237[Static25.anInt2862] = local49 + (local70 << 16) + (local132 << 8);
			Static25.anInt2862++;
		}
	}
}

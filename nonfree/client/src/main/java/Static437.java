import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "[I")
	public static int[] anIntArray569;

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "Z")
	public static boolean aBoolean516;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	public static int anInt7470 = 0;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_47 = new Class229();

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_250 = new Class92(43, 8);

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
	public static void method5855() {
		Static408.method5487(Static123.aClass21_Sub1_1.anInt866);
		@Pc(15) int local15 = (Static398.anInt6901 >> 10) + (Static108.anInt3458 >> 3);
		Static124.anInt2688 = Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 = 0;
		@Pc(28) int local28 = (Static339.anInt6223 >> 3) + (Static80.anInt1722 >> 10);
		Static113.aClass1_Sub3_Sub3_Sub1_4.method3933(8, 8);
		Static303.aByteArrayArray17 = new byte[18][];
		Static265.aByteArrayArray14 = new byte[18][];
		Static20.anIntArray43 = new int[18];
		Static289.anIntArray407 = new int[18];
		Static104.aByteArrayArray9 = new byte[18][];
		Static244.anIntArrayArray37 = new int[18][4];
		Static277.anIntArray351 = new int[18];
		Static144.anIntArray241 = new int[18];
		Static445.aByteArrayArray25 = new byte[18][];
		Static57.aByteArrayArray4 = new byte[18][];
		anIntArray569 = new int[18];
		Static363.anIntArray466 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(85) int local85 = (local15 - (Static399.anInt6923 >> 4)) / 8; local85 <= ((Static399.anInt6923 >> 4) + local15) / 8; local85++) {
			for (local95 = (local28 - (Static127.anInt2696 >> 4)) / 8; local95 <= ((Static127.anInt2696 >> 4) + local28) / 8; local95++) {
				@Pc(103) int local103 = (local85 << 8) + local95;
				Static289.anIntArray407[local76] = local103;
				Static277.anIntArray351[local76] = Static93.aClass56_22.method1368("m" + local85 + "_" + local95);
				Static20.anIntArray43[local76] = Static93.aClass56_22.method1368("l" + local85 + "_" + local95);
				Static363.anIntArray466[local76] = Static93.aClass56_22.method1368("n" + local85 + "_" + local95);
				anIntArray569[local76] = Static93.aClass56_22.method1368("um" + local85 + "_" + local95);
				Static144.anIntArray241[local76] = Static93.aClass56_22.method1368("ul" + local85 + "_" + local95);
				if (Static363.anIntArray466[local76] == -1) {
					Static277.anIntArray351[local76] = -1;
					Static20.anIntArray43[local76] = -1;
					anIntArray569[local76] = -1;
					Static144.anIntArray241[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static363.anIntArray466.length; local95++) {
			Static363.anIntArray466[local95] = -1;
			Static277.anIntArray351[local95] = -1;
			Static20.anIntArray43[local95] = -1;
			anIntArray569[local95] = -1;
			Static144.anIntArray241[local95] = -1;
		}
		Static29.method737(false, local15, true, local28);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIII)V")
	public static void method5857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static400.anInt6964 = arg1;
		Static283.anInt5199 = arg3;
		Static419.anInt7236 = arg2;
		Static319.anInt5771 = arg0;
		Static400.anInt6966 = arg4;
		if (Static400.anInt6964 >= 100) {
			@Pc(26) int local26 = Static400.anInt6966 * 128 + 64;
			@Pc(32) int local32 = Static283.anInt5199 * 128 + 64;
			@Pc(41) int local41 = Static124.method2209(Static124.anInt2688, local26, local32) - Static319.anInt5771;
			@Pc(46) int local46 = local26 - Static398.anInt6901;
			@Pc(51) int local51 = local41 - Static422.anInt7281;
			@Pc(56) int local56 = local32 - Static80.anInt1722;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local46 * local46));
			Static141.anInt3177 = (int) (Math.atan2((double) local51, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static430.anInt7326 = (int) (Math.atan2((double) local46, (double) local56) * -2607.5945876176133D) & 0x3FFF;
			Static285.anInt5234 = 0;
			if (Static141.anInt3177 < 1024) {
				Static141.anInt3177 = 1024;
			}
			if (Static141.anInt3177 > 3072) {
				Static141.anInt3177 = 3072;
			}
		}
		Static107.anInt2382 = 2;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5858(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + (((long) arg0.charAt(local10)) - local8);
		}
		return local8;
	}
}

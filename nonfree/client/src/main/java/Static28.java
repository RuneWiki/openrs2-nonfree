import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt524;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!lc;")
	public static Class98 aClass98_17;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[S")
	public static short[] aShortArray3;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!te;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_2;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt528 = 1;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static int anInt529 = 0;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "I")
	public static int anInt530 = -1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method434() {
		Static49.aClass33_9.method843();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method435(@OriginalArg(0) String arg0) {
		if (Static83.aClass4_Sub16Array3 == null) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) long local15 = Static34.method491(arg0);
		if (local15 == 0L) {
			return;
		}
		while (local11 < Static83.aClass4_Sub16Array3.length && Static83.aClass4_Sub16Array3[local11].aLong200 != local15) {
			local11++;
		}
		if (local11 < Static83.aClass4_Sub16Array3.length && Static83.aClass4_Sub16Array3[local11] != null) {
			Static142.aClass4_Sub17_Sub1_3.method1905(101);
			Static142.aClass4_Sub17_Sub1_3.method1891(Static83.aClass4_Sub16Array3[local11].aLong200);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!en;IIIII)V")
	public static void method436(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static114.anInt2478) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static247.anInt4706) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static24.anInt439 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class4_Sub11 local71 = Static127.aClass4_Sub11ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static250.anIntArrayArrayArray13[local17][local28][local39] + Static250.anIntArrayArrayArray13[local17][local28 + 1][local39] + Static250.anIntArrayArrayArray13[local17][local28][local39 + 1] + Static250.anIntArrayArrayArray13[local17][local28 + 1][local39 + 1]) / 4 - (Static250.anIntArrayArrayArray13[arg1][arg2][arg3] + Static250.anIntArrayArrayArray13[arg1][arg2 + 1][arg3] + Static250.anIntArrayArrayArray13[arg1][arg2][arg3 + 1] + Static250.anIntArrayArrayArray13[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class43 local161 = local71.aClass43_1;
									if (local161 != null) {
										if (local161.aClass12_5.method3351()) {
											arg0.method3356(local161.aClass12_5, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass12_4 != null && local161.aClass12_4.method3351()) {
											arg0.method3356(local161.aClass12_4, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt1054; local232++) {
										@Pc(241) Class173 local241 = local71.aClass173Array1[local232];
										if (local241 != null && local241.aClass12_10.method3351() && (local28 == local241.anInt5149 || local28 == local3) && (local39 == local241.anInt5157 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt5163 + 1 - local241.anInt5149;
											@Pc(278) int local278 = local241.anInt5158 + 1 - local241.anInt5157;
											arg0.method3356(local241.aClass12_10, (local241.anInt5149 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt5157 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method437() {
		aClass4_Sub2_Sub1_2 = null;
		aClass162_1 = null;
		aClass98_17 = null;
		aShortArray3 = null;
		aString8 = null;
	}
}

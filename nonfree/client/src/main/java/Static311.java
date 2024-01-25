import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "Z")
	public static boolean aBoolean389;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_13 = new Class273(16);

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "F")
	public static float aFloat95 = 0.0F;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4808(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static174.aClass120_33.method2690(Static266.anInt4796) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static174.aClass120_35.method2690(Static266.anInt4796) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	public static void method4809() {
		Static257.aClass5_Sub22_Sub1_1.method2658();
		@Pc(13) int local13 = Static257.aClass5_Sub22_Sub1_1.method2655(8);
		@Pc(22) int local22;
		if (Static280.anInt4989 > local13) {
			for (local22 = local13; local22 < Static280.anInt4989; local22++) {
				Static551.anIntArray511[Static222.anInt4155++] = Static209.anIntArray198[local22];
			}
		}
		if (Static280.anInt4989 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static280.anInt4989 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(69) int local69 = Static209.anIntArray198[local22];
			@Pc(77) Class4_Sub2_Sub1_Sub1_Sub2 local77 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) local69)).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			@Pc(82) int local82 = Static257.aClass5_Sub22_Sub1_1.method2655(1);
			if (local82 == 0) {
				Static209.anIntArray198[Static280.anInt4989++] = local69;
				local77.anInt1230 = Static622.anInt10382;
			} else {
				@Pc(105) int local105 = Static257.aClass5_Sub22_Sub1_1.method2655(2);
				if (local105 == 0) {
					Static209.anIntArray198[Static280.anInt4989++] = local69;
					local77.anInt1230 = Static622.anInt10382;
					Static435.anIntArray405[Static58.anInt1145++] = local69;
				} else {
					@Pc(149) int local149;
					@Pc(159) int local159;
					if (local105 == 1) {
						Static209.anIntArray198[Static280.anInt4989++] = local69;
						local77.anInt1230 = Static622.anInt10382;
						local149 = Static257.aClass5_Sub22_Sub1_1.method2655(3);
						local77.method1040(1, local149);
						local159 = Static257.aClass5_Sub22_Sub1_1.method2655(1);
						if (local159 == 1) {
							Static435.anIntArray405[Static58.anInt1145++] = local69;
						}
					} else if (local105 == 2) {
						Static209.anIntArray198[Static280.anInt4989++] = local69;
						local77.anInt1230 = Static622.anInt10382;
						if (Static257.aClass5_Sub22_Sub1_1.method2655(1) == 1) {
							local149 = Static257.aClass5_Sub22_Sub1_1.method2655(3);
							local77.method1040(2, local149);
							local159 = Static257.aClass5_Sub22_Sub1_1.method2655(3);
							local77.method1040(2, local159);
						} else {
							local149 = Static257.aClass5_Sub22_Sub1_1.method2655(3);
							local77.method1040(0, local149);
						}
						local149 = Static257.aClass5_Sub22_Sub1_1.method2655(1);
						if (local149 == 1) {
							Static435.anIntArray405[Static58.anInt1145++] = local69;
						}
					} else if (local105 == 3) {
						Static551.anIntArray511[Static222.anInt4155++] = local69;
					}
				}
			}
		}
	}
}

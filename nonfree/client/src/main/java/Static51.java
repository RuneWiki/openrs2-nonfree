import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
	public static int anInt1360;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_845 = Static118.method2249("Loading sprites )2 ");

	@OriginalMember(owner = "client!ej", name = "M", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_846 = Static118.method2249("null");

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_847 = Static118.method2249("Loaded config");

	@OriginalMember(owner = "client!ej", name = "T", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_848 = Static118.method2249("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!ej", name = "V", descriptor = "Lclient!oc;")
	public static Class65 aClass65_850 = aClass65_845;

	@OriginalMember(owner = "client!ej", name = "Y", descriptor = "Lclient!oc;")
	public static Class65 aClass65_851 = aClass65_847;

	@OriginalMember(owner = "client!ej", name = "Z", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_852 = Static118.method2249("Standort");

	@OriginalMember(owner = "client!ej", name = "bb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_853 = null;

	@OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
	public static int anInt1367 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZI)V")
	public static void method892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) Static131.aClass91_13.method3148(); local15 != null; local15 = (Class1_Sub5) Static131.aClass91_13.method3150()) {
			if (local15.anInt653 != -1 || local15.anIntArray67 != null) {
				@Pc(26) int local26 = 0;
				if (local15.anInt657 < arg0) {
					local26 = arg0 - local15.anInt657;
				} else if (local15.anInt643 > arg0) {
					local26 = local15.anInt643 - arg0;
				}
				if (local15.anInt644 < arg2) {
					local26 += arg2 - local15.anInt644;
				} else if (local15.anInt648 > arg2) {
					local26 += local15.anInt648 - arg2;
				}
				if (local26 - 64 > local15.anInt638 || Static53.anInt1436 == 0 || local15.anInt640 != arg1) {
					if (local15.aClass1_Sub6_Sub3_1 != null) {
						Static93.aClass1_Sub6_Sub1_1.method2000(local15.aClass1_Sub6_Sub3_1);
						local15.aClass1_Sub6_Sub3_1 = null;
					}
					if (local15.aClass1_Sub6_Sub3_2 != null) {
						Static93.aClass1_Sub6_Sub1_1.method2000(local15.aClass1_Sub6_Sub3_2);
						local15.aClass1_Sub6_Sub3_2 = null;
					}
				} else {
					local26 -= 64;
					if (local26 < 0) {
						local26 = 0;
					}
					@Pc(148) int local148 = Static53.anInt1436 * (local15.anInt638 - local26) / local15.anInt638;
					if (local15.aClass1_Sub6_Sub3_1 != null) {
						local15.aClass1_Sub6_Sub3_1.method2192(local148);
					} else if (local15.anInt653 >= 0) {
						@Pc(166) Class84 local166 = Static218.method2937(Static52.aClass60_Sub1_55, local15.anInt653, 0);
						if (local166 != null) {
							@Pc(173) Class1_Sub19_Sub1 local173 = local166.method2938().method2171(Static171.aClass43_1);
							@Pc(178) Class1_Sub6_Sub3 local178 = Static216.method2203(local173, local148);
							local178.method2184(-1);
							Static93.aClass1_Sub6_Sub1_1.method1995(local178);
							local15.aClass1_Sub6_Sub3_1 = local178;
						}
					}
					if (local15.aClass1_Sub6_Sub3_2 != null) {
						local15.aClass1_Sub6_Sub3_2.method2192(local148);
						if (!local15.aClass1_Sub6_Sub3_2.method3296()) {
							local15.aClass1_Sub6_Sub3_2 = null;
						}
					} else if (local15.anIntArray67 != null && (local15.anInt656 -= arg3) <= 0) {
						@Pc(212) int local212 = (int) ((double) local15.anIntArray67.length * Math.random());
						@Pc(220) Class84 local220 = Static218.method2937(Static52.aClass60_Sub1_55, local15.anIntArray67[local212], 0);
						if (local220 != null) {
							@Pc(227) Class1_Sub19_Sub1 local227 = local220.method2938().method2171(Static171.aClass43_1);
							@Pc(232) Class1_Sub6_Sub3 local232 = Static216.method2203(local227, local148);
							local232.method2184(0);
							Static93.aClass1_Sub6_Sub1_1.method1995(local232);
							local15.aClass1_Sub6_Sub3_2 = local232;
							local15.anInt656 = (int) ((double) (local15.anInt655 - local15.anInt651) * Math.random()) + local15.anInt651;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[III)V")
	public static void method893(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(10) int local10 = arg2 - 1;
		@Pc(13) int local13 = local10 - 7;
		while (local13 > arg3) {
			@Pc(16) int local16 = arg3 + 1;
			arg1[local16] = arg0;
			@Pc(21) int local21 = local16 + 1;
			arg1[local21] = arg0;
			@Pc(26) int local26 = local21 + 1;
			arg1[local26] = arg0;
			@Pc(31) int local31 = local26 + 1;
			arg1[local31] = arg0;
			@Pc(36) int local36 = local31 + 1;
			arg1[local36] = arg0;
			@Pc(41) int local41 = local36 + 1;
			arg1[local41] = arg0;
			@Pc(46) int local46 = local41 + 1;
			arg1[local46] = arg0;
			arg3 = local46 + 1;
			arg1[arg3] = arg0;
		}
		while (arg3 < local10) {
			arg3++;
			arg1[arg3] = arg0;
		}
	}
}

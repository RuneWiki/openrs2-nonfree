import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public static int anInt4869 = 0;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[I")
	public static final int[] anIntArray394 = new int[32];

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_96 = new Class44(110, 7);

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public static void method4068() {
		Static631.method8821(false);
		if (Static347.anInt6430 >= 0 && Static347.anInt6430 != 0) {
			Static155.method2506(Static347.anInt6430, false);
			Static347.anInt6430 = -1;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([IILclient!fb;I)V")
	public static void method4071(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class12_Sub2_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) boolean local17;
		@Pc(19) int local19;
		if (arg1.anIntArray234 != null) {
			local17 = true;
			for (local19 = 0; local19 < arg1.anIntArray234.length; local19++) {
				if (arg1.anIntArray234[local19] != arg0[local19]) {
					local17 = false;
					break;
				}
			}
			if (local17 && arg1.anInt2921 != -1) {
				@Pc(55) Class275 local55 = Static501.aClass191_2.method4322(arg1.anInt2921);
				@Pc(58) int local58 = local55.anInt7920;
				if (local58 == 1) {
					arg1.anInt2900 = arg2;
					arg1.anInt2958 = 1;
					arg1.anInt2920 = 0;
					arg1.anInt2902 = 0;
					arg1.anInt2898 = 0;
					if (!arg1.aBoolean221) {
						Static51.method1064(arg1, local55, arg1.anInt2902);
					}
				}
				if (local58 == 2) {
					arg1.anInt2920 = 0;
				}
			}
		}
		local17 = true;
		for (local19 = 0; local19 < arg0.length; local19++) {
			if (arg0[local19] != -1) {
				local17 = false;
			}
			if (arg1.anIntArray234 == null || arg1.anIntArray234[local19] == -1 || Static501.aClass191_2.method4322(arg0[local19]).anInt7930 >= Static501.aClass191_2.method4322(arg1.anIntArray234[local19]).anInt7930) {
				arg1.anIntArray234 = arg0;
				arg1.anInt2900 = arg2;
				break;
			}
		}
		if (local17) {
			arg1.anInt2900 = arg2;
			arg1.anIntArray234 = arg0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!al;Lclient!al;)V")
	public static void method4072(@OriginalArg(1) Class14_Sub3 arg0, @OriginalArg(2) Class14_Sub3 arg1) {
		if (arg1.aClass14_Sub3_66 != null) {
			arg1.method9253();
		}
		arg1.aClass14_Sub3_67 = arg0;
		arg1.aClass14_Sub3_66 = arg0.aClass14_Sub3_66;
		arg1.aClass14_Sub3_66.aClass14_Sub3_67 = arg1;
		arg1.aClass14_Sub3_67.aClass14_Sub3_66 = arg1;
	}
}

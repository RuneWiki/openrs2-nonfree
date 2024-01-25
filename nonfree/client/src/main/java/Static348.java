import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Z")
	public static boolean aBoolean440;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
	public static int anInt6439;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_8 = new Class352(11, 0, 1, 2);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!mea;I)V")
	public static void method5322(@OriginalArg(0) Class230 arg0) {
		if (!Static238.aBoolean302) {
			return;
		}
		if (arg0.anObjectArray24 != null) {
			@Pc(18) Class230 local18 = Static572.method8204(Static639.anInt10686, Static402.anInt10315);
			if (local18 != null) {
				@Pc(24) Class14_Sub55 local24 = new Class14_Sub55();
				local24.aClass230_14 = arg0;
				local24.anObjectArray33 = arg0.anObjectArray24;
				local24.aClass230_13 = local18;
				Static632.method8830(local24);
			}
		}
		@Pc(46) Class14_Sub19 local46 = Static286.method4081(Static205.aClass394_1, Static218.aClass100_64);
		local46.aClass14_Sub29_Sub1_1.method5861(arg0.anInt6663);
		local46.aClass14_Sub29_Sub1_1.method5875(Static402.anInt10315);
		local46.aClass14_Sub29_Sub1_1.method5859(Static639.anInt10686);
		local46.aClass14_Sub29_Sub1_1.method5859(Static68.anInt1565);
		local46.aClass14_Sub29_Sub1_1.method5892(arg0.anInt6679);
		local46.aClass14_Sub29_Sub1_1.method5871(arg0.anInt6646);
		Static576.method8234(local46);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!av;I[II)V")
	public static void method5324(@OriginalArg(0) Class12_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray234 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray234.length; local8++) {
				if (arg2[local8] != arg0.anIntArray234[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt2921 != -1) {
				@Pc(44) Class275 local44 = Static501.aClass191_2.method4322(arg0.anInt2921);
				@Pc(47) int local47 = local44.anInt7920;
				if (local47 == 1) {
					arg0.anInt2958 = 1;
					arg0.anInt2902 = 0;
					arg0.anInt2900 = arg1;
					arg0.anInt2920 = 0;
					arg0.anInt2898 = 0;
					if (!arg0.aBoolean221) {
						Static51.method1064(arg0, local44, arg0.anInt2902);
					}
				}
				if (local47 == 2) {
					arg0.anInt2920 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray234 == null || arg0.anIntArray234[local8] == -1 || Static501.aClass191_2.method4322(arg2[local8]).anInt7930 >= Static501.aClass191_2.method4322(arg0.anIntArray234[local8]).anInt7930) {
				arg0.anInt2966 = arg0.anInt2964;
				arg0.anIntArray234 = arg2;
				arg0.anInt2900 = arg1;
			}
		}
		if (local6) {
			arg0.anInt2966 = arg0.anInt2964;
			arg0.anInt2900 = arg1;
			arg0.anIntArray234 = arg2;
		}
	}
}

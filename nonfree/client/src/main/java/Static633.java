import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!v", name = "t", descriptor = "[Lclient!rha;")
	public static final Class312[] aClass312Array31 = new Class312[16];

	@OriginalMember(owner = "client!v", name = "o", descriptor = "I")
	public static int anInt10642 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLclient!nh;)V")
	public static void method9092(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub3_Sub3 arg1) {
		if (arg1.anIntArray198 == null) {
			return;
		}
		@Pc(9) int local9 = arg1.anIntArray198[arg0 + 1];
		if (local9 != arg1.aClass181_8.method8959()) {
			arg1.aClass181_8.method8944(local9, arg1.aClass181_8.method8960());
			arg1.anInt3297 = arg1.anInt3298;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!haa;IIIII)V")
	public static void method9095(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static59.anInt987) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static654.anInt10715) {
						for (@Pc(35) int local35 = local11; local35 <= local15; local35++) {
							if (local35 >= 0 && local35 < Static180.anInt2928 && (!local1 || local23 >= local7 || local35 >= local15 || local35 < arg3 && local23 != arg2)) {
								@Pc(77) Class89 local77 = Static63.aClass89ArrayArrayArray1[local17][local23][local35];
								if (local77 != null) {
									@Pc(163) int local163 = (Static258.aClass159Array1[local17].method8207(local35, local23) + Static258.aClass159Array1[local17].method8207(local35, local23 + 1) + Static258.aClass159Array1[local17].method8207(local35 + 1, local23) + Static258.aClass159Array1[local17].method8207(local35 + 1, local23 + 1)) / 4 - (Static258.aClass159Array1[arg1].method8207(arg3, arg2) + Static258.aClass159Array1[arg1].method8207(arg3, arg2 + 1) + Static258.aClass159Array1[arg1].method8207(arg3 + 1, arg2) + Static258.aClass159Array1[arg1].method8207(arg3 + 1, arg2 + 1)) / 4;
									@Pc(166) Class4_Sub3_Sub1 local166 = local77.aClass4_Sub3_Sub1_1;
									@Pc(169) Class4_Sub3_Sub1 local169 = local77.aClass4_Sub3_Sub1_2;
									if (local166 != null && local166.method9483()) {
										arg0.method9480(Static554.aClass144_12, (local23 - arg2) * Static391.anInt6813 + (1 - arg4) * Static193.anInt9749, (local35 - arg3) * Static391.anInt6813 + (1 - arg5) * Static193.anInt9749, local1, local166, local163);
									}
									if (local169 != null && local169.method9483()) {
										arg0.method9480(Static554.aClass144_12, (local23 - arg2) * Static391.anInt6813 + (1 - arg4) * Static193.anInt9749, (local35 - arg3) * Static391.anInt6813 + (1 - arg5) * Static193.anInt9749, local1, local169, local163);
									}
									for (@Pc(250) Class58 local250 = local77.aClass58_2; local250 != null; local250 = local250.aClass58_1) {
										@Pc(254) Class4_Sub3_Sub3 local254 = local250.aClass4_Sub3_Sub3_1;
										if (local254 != null && local254.method9483() && (local23 == local254.aShort108 || local23 == local3) && (local35 == local254.aShort109 || local35 == local11)) {
											@Pc(294) int local294 = local254.aShort107 + 1 - local254.aShort108;
											@Pc(302) int local302 = local254.aShort110 + 1 - local254.aShort109;
											arg0.method9480(Static554.aClass144_12, (local254.aShort108 - arg2) * Static391.anInt6813 + (local294 - arg4) * Static193.anInt9749, (local254.aShort109 - arg3) * Static391.anInt6813 + (local302 - arg5) * Static193.anInt9749, local1, local254, local163);
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

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method9096(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 9);
		local9.method4001();
	}
}

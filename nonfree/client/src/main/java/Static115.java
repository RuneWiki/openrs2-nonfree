import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "Lclient!jd;")
	public static Class84 aClass84_50;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
	public static int anInt2461;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
	public static int anInt2459 = -1;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I")
	public static int method2111() {
		return Static186.anInt3937 == 0 ? 0 : Static44.anInterface2Array1[Static186.anInt3937].method4854();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([Lclient!mn;IB)V")
	public static void method2112(@OriginalArg(0) Class115[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(20) Class115 local20 = arg0[local12];
			if (local20 != null && local20.anInt3525 == arg1 && (!local20.aBoolean291 || !Static35.method701(local20))) {
				if (local20.anInt3538 == 0) {
					if (!local20.aBoolean291 && Static35.method701(local20) && Static109.aClass115_10 != local20) {
						continue;
					}
					method2112(arg0, local20.anInt3552);
					if (local20.aClass115Array1 != null) {
						method2112(local20.aClass115Array1, local20.anInt3552);
					}
					@Pc(74) Class2_Sub15 local74 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local20.anInt3552);
					if (local74 != null) {
						Static170.method2925(local74.anInt2424);
					}
				}
				if (local20.anInt3538 == 6) {
					@Pc(105) int local105;
					if (local20.anInt3490 != -1 || local20.anInt3472 != -1) {
						@Pc(100) boolean local100 = Static262.method4939(local20);
						if (local100) {
							local105 = local20.anInt3472;
						} else {
							local105 = local20.anInt3490;
						}
						if (local105 != -1) {
							@Pc(119) Class15 local119 = Static35.method706(local105);
							if (local119 != null) {
								local20.anInt3478 += Static37.anInt906;
								while (local119.anIntArray28[local20.anInt3474] < local20.anInt3478) {
									local20.anInt3478 -= local119.anIntArray28[local20.anInt3474];
									local20.anInt3474++;
									if (local20.anInt3474 >= local119.anIntArray26.length) {
										local20.anInt3474 -= local119.anInt430;
										if (local20.anInt3474 < 0 || local119.anIntArray26.length <= local20.anInt3474) {
											local20.anInt3474 = 0;
										}
									}
									local20.anInt3507 = local20.anInt3474 + 1;
									if (local20.anInt3507 >= local119.anIntArray26.length) {
										local20.anInt3507 -= local119.anInt430;
										if (local20.anInt3507 < 0 || local20.anInt3507 >= local119.anIntArray26.length) {
											local20.anInt3507 = -1;
										}
									}
									Static298.method4263(local20);
								}
							}
						}
					}
					if (local20.anInt3554 != 0 && !local20.aBoolean291) {
						@Pc(237) int local237 = local20.anInt3554 >> 16;
						@Pc(241) int local241 = local237 * Static37.anInt906;
						local20.anInt3557 = local20.anInt3557 + local241 & 0x7FF;
						local105 = local20.anInt3554 << 16 >> 16;
						local105 *= Static37.anInt906;
						local20.anInt3480 = local20.anInt3480 + local105 & 0x7FF;
						Static298.method4263(local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ge;Lclient!ge;)V")
	public static void method2114(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0.aClass2_Sub3_69 != null) {
			arg0.method4613();
		}
		arg0.aClass2_Sub3_68 = arg1.aClass2_Sub3_68;
		arg0.aClass2_Sub3_69 = arg1;
		arg0.aClass2_Sub3_69.aClass2_Sub3_68 = arg0;
		arg0.aClass2_Sub3_68.aClass2_Sub3_69 = arg0;
	}
}

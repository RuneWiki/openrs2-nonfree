import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt1155;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!pf;")
	public static final Class266 aClass266_1 = new Class266();

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!dm;")
	public static final Class75 aClass75_2 = new Class75();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBIZ)V")
	public static void method903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static242.aClass118_21.method2595((long) arg0) != null) {
			return;
		}
		if (Static629.aBoolean741) {
			@Pc(29) Class2_Sub21 local29 = new Class2_Sub21(arg0, new Class209_Sub1(4096, Static342.aClass380_83, arg0), arg1, arg2);
			local29.aClass209_Sub1_1.method4361(Static395.aStringArray33[Static483.anInt7694]);
			Static242.aClass118_21.method2601(local29, (long) arg0);
		} else {
			Static235.method3206(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	public static void method904() {
		for (@Pc(1) int local1 = Static458.anInt7383; local1 < Static10.anInt139; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static322.anInt5120; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Class13_Sub1_Sub4_Sub1.lb; local7++) {
					@Pc(16) Class53 local16 = Static28.aClass53ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class13_Sub1_Sub4 local21 = local16.aClass13_Sub1_Sub4_1;
						@Pc(24) Class13_Sub1_Sub4 local24 = local16.aClass13_Sub1_Sub4_2;
						if (local21 != null && local21.method8404()) {
							Static78.method1104(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8404()) {
								Static78.method1104(local24, local1, local4, local7, 1, 1);
								local24.method8410(0, false, 0, Static207.aClass95_6, 0, local21);
								local24.method8414();
							}
							local21.method8414();
						}
						for (@Pc(68) Class325 local68 = local16.aClass325_1; local68 != null; local68 = local68.aClass325_3) {
							@Pc(72) Class13_Sub1_Sub1 local72 = local68.aClass13_Sub1_Sub1_1;
							if (local72 != null && local72.method8404()) {
								Static78.method1104(local72, local1, local4, local7, local72.aShort120 + 1 - local72.aShort117, local72.aShort118 - local72.aShort119 + 1);
								local72.method8414();
							}
						}
						@Pc(108) Class13_Sub1_Sub2 local108 = local16.aClass13_Sub1_Sub2_1;
						if (local108 != null && local108.method8404()) {
							Static218.method8361(local108, local1, local4, local7);
							local108.method8414();
						}
					}
				}
			}
		}
	}
}

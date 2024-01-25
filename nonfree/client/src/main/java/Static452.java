import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_52 = new Class111();

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_97 = new Class208(4, -1);

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	public static int anInt7956 = -1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ac;)Lclient!cca;")
	public static Class36 method6353(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(7) String local7 = arg0.method7951();
		@Pc(14) Class259 local14 = Static179.method2831()[arg0.method7974()];
		@Pc(21) Class216 local21 = Static570.method7672()[arg0.method7974()];
		@Pc(25) int local25 = arg0.method7975();
		@Pc(29) int local29 = arg0.method7975();
		@Pc(33) int local33 = arg0.method7974();
		@Pc(37) int local37 = arg0.method7974();
		@Pc(41) int local41 = arg0.method7974();
		@Pc(45) int local45 = arg0.method7945();
		@Pc(49) int local49 = arg0.method7945();
		@Pc(53) int local53 = arg0.method7940();
		@Pc(57) int local57 = arg0.method7940();
		@Pc(66) int local66 = arg0.method7940();
		return new Class36(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57, local66);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	public static void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class360 local28 = Static568.aClass360ArrayArrayArray22[local9][arg0][arg1] = Static568.aClass360ArrayArrayArray22[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class21 local33 = local28.aClass21_4; local33 != null; local33 = local33.aClass21_1) {
					@Pc(37) Class11_Sub1_Sub1 local37 = local33.aClass11_Sub1_Sub1_1;
					if (local37.aShort90 == arg0 && local37.aShort88 == arg1) {
						local37.aByte113--;
					}
				}
				if (local28.aClass11_Sub1_Sub4_1 != null) {
					local28.aClass11_Sub1_Sub4_1.aByte113--;
				}
				if (local28.aClass11_Sub1_Sub3_1 != null) {
					local28.aClass11_Sub1_Sub3_1.aByte113--;
				}
				if (local28.aClass11_Sub1_Sub3_2 != null) {
					local28.aClass11_Sub1_Sub3_2.aByte113--;
				}
				if (local28.aClass11_Sub1_Sub5_2 != null) {
					local28.aClass11_Sub1_Sub5_2.aByte113--;
				}
				if (local28.aClass11_Sub1_Sub5_1 != null) {
					local28.aClass11_Sub1_Sub5_1.aByte113--;
				}
			}
		}
		if (Static568.aClass360ArrayArrayArray22[0][arg0][arg1] == null) {
			Static568.aClass360ArrayArrayArray22[0][arg0][arg1] = new Class360(0);
			Static568.aClass360ArrayArrayArray22[0][arg0][arg1].aByte129 = 1;
		}
		Static568.aClass360ArrayArrayArray22[0][arg0][arg1].aClass360_1 = local7;
		Static568.aClass360ArrayArrayArray22[3][arg0][arg1] = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "[I")
	public static int[] anIntArray741;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZC)Z")
	public static boolean method8572(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!rca;)I")
	public static int method8574(@OriginalArg(1) Class2_Sub34_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method6925(2);
		@Pc(23) int local23;
		if (local10 == 0) {
			local23 = 0;
		} else if (local10 == 1) {
			local23 = arg0.method6925(5);
		} else if (local10 == 2) {
			local23 = arg0.method6925(8);
		} else {
			local23 = arg0.method6925(11);
		}
		return local23;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public static void method8575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class217 local28 = Static440.aClass217ArrayArrayArray3[local9][arg0][arg1] = Static440.aClass217ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class61 local33 = local28.aClass61_2; local33 != null; local33 = local33.aClass61_1) {
					@Pc(37) Class11_Sub1_Sub1 local37 = local33.aClass11_Sub1_Sub1_1;
					if (local37.aShort95 == arg0 && local37.aShort97 == arg1) {
						local37.aByte124--;
					}
				}
				if (local28.aClass11_Sub1_Sub4_1 != null) {
					local28.aClass11_Sub1_Sub4_1.aByte124--;
				}
				if (local28.aClass11_Sub1_Sub2_1 != null) {
					local28.aClass11_Sub1_Sub2_1.aByte124--;
				}
				if (local28.aClass11_Sub1_Sub2_2 != null) {
					local28.aClass11_Sub1_Sub2_2.aByte124--;
				}
				if (local28.aClass11_Sub1_Sub3_1 != null) {
					local28.aClass11_Sub1_Sub3_1.aByte124--;
				}
				if (local28.aClass11_Sub1_Sub3_2 != null) {
					local28.aClass11_Sub1_Sub3_2.aByte124--;
				}
			}
		}
		if (Static440.aClass217ArrayArrayArray3[0][arg0][arg1] == null) {
			Static440.aClass217ArrayArrayArray3[0][arg0][arg1] = new Class217(0);
			Static440.aClass217ArrayArrayArray3[0][arg0][arg1].aByte91 = 1;
		}
		Static440.aClass217ArrayArrayArray3[0][arg0][arg1].aClass217_1 = local7;
		Static440.aClass217ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lclient!nd;")
	public static Class2_Sub36 method8576() {
		if (Static292.aClass238_57 == null || Static525.aClass211_1 == null) {
			return null;
		}
		Static525.aClass211_1.method5219(Static292.aClass238_57);
		@Pc(18) Class2_Sub36 local18 = (Class2_Sub36) Static525.aClass211_1.method5217();
		if (local18 == null) {
			return null;
		} else {
			@Pc(36) Class105 local36 = Static292.aClass248_4.method6347(local18.anInt6596);
			return local36 != null && local36.aBoolean281 && local36.method2791(Static292.anInterface5_2) ? local18 : Static245.method4035();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIB)V")
	public static void method8577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static512.anInt8594 = arg1;
		Static96.anInt1898 = arg0;
		Static73.anInt1585 = arg3;
		Static544.anInt9049 = arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
	public static int anInt9898;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
	public static int anInt9900;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)Lclient!lga;")
	public static Class2_Sub32 method8240() {
		if (Static303.aClass341_2 == null || Static475.aClass56_4 == null) {
			return null;
		}
		Static475.aClass56_4.method2109(Static303.aClass341_2);
		@Pc(18) Class2_Sub32 local18 = (Class2_Sub32) Static475.aClass56_4.method2108();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class153 local28 = Static303.aClass248_2.method6584(local18.anInt6568);
			return local28 != null && local28.aBoolean387 && local28.method4493(Static303.anInterface6_2) ? local18 : Static134.method3055();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
	public static int method8241(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8242(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static71.anInt3990;
		@Pc(9) int[] local9 = Static549.anIntArray643;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class3_Sub1_Sub3_Sub3_Sub2 local25 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local9[local17]];
			if (local25 != null && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 != local25 && local25.aString64 != null && local25.aString64.equalsIgnoreCase(arg1)) {
				local15 = true;
				@Pc(54) Class2_Sub52 local54;
				if (arg0 == 1) {
					local54 = Static130.method3019(Static352.aClass94_69, Static361.aClass183_1);
					local54.aClass2_Sub11_Sub2_7.method8345(local9[local17]);
					local54.aClass2_Sub11_Sub2_7.method8370(0);
					Static96.method2563(local54);
				} else if (arg0 == 4) {
					local54 = Static130.method3019(Static255.aClass94_52, Static361.aClass183_1);
					local54.aClass2_Sub11_Sub2_7.method8333(local9[local17]);
					local54.aClass2_Sub11_Sub2_7.method8391(0);
					Static96.method2563(local54);
				} else if (arg0 == 5) {
					local54 = Static130.method3019(Static263.aClass94_55, Static361.aClass183_1);
					local54.aClass2_Sub11_Sub2_7.method8331(local9[local17]);
					local54.aClass2_Sub11_Sub2_7.method8374(0);
					Static96.method2563(local54);
				} else if (arg0 == 6) {
					local54 = Static130.method3019(Static553.aClass94_100, Static361.aClass183_1);
					local54.aClass2_Sub11_Sub2_7.method8374(0);
					local54.aClass2_Sub11_Sub2_7.method8331(local9[local17]);
					Static96.method2563(local54);
				} else if (arg0 == 7) {
					local54 = Static130.method3019(Static332.aClass94_67, Static361.aClass183_1);
					local54.aClass2_Sub11_Sub2_7.method8331(local9[local17]);
					local54.aClass2_Sub11_Sub2_7.method8391(0);
					Static96.method2563(local54);
				}
				break;
			}
		}
		if (!local15) {
			Static271.method9045(Static588.aClass351_23.method8691(Static476.anInt8915) + arg1);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!db;)V")
	public static void method8243(@OriginalArg(1) Class2_Sub6_Sub3 arg0) {
		if (Static65.aBoolean754) {
			return;
		}
		arg0.method9253();
		Static298.anInt6262--;
		if (!arg0.aBoolean220) {
			@Pc(82) long local82 = arg0.aLong60;
			@Pc(88) Class2_Sub6_Sub21 local88;
			for (local88 = (Class2_Sub6_Sub21) Static89.aClass99_22.method3056(local82); local88 != null && !local88.aString106.equals(arg0.aString21); local88 = (Class2_Sub6_Sub21) Static89.aClass99_22.method3052()) {
			}
			if (local88 != null && local88.method8938(arg0)) {
				Static532.method8012(local88);
			}
			return;
		}
		for (@Pc(27) Class2_Sub6_Sub21 local27 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6008(); local27 != null; local27 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6000()) {
			if (local27.aString106.equals(arg0.aString21)) {
				@Pc(37) boolean local37 = false;
				for (@Pc(43) Class2_Sub6_Sub3 local43 = (Class2_Sub6_Sub3) local27.aClass211_12.method6008(); local43 != null; local43 = (Class2_Sub6_Sub3) local27.aClass211_12.method6000()) {
					if (arg0 == local43) {
						if (local27.method8938(arg0)) {
							Static532.method8012(local27);
						}
						local37 = true;
						break;
					}
				}
				if (local37) {
					return;
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	public static int anInt7172;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
	public static int anInt7173;

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
	public static int anInt7174;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "Lclient!wp;")
	public static final Class273 aClass273_5 = new Class273();

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_94 = new Class212(55, 3);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
	public static void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class113 local3 = new Class113();
		local3.anInt3441 = arg1 >> Static391.anInt6797;
		local3.anInt3439 = arg2 >> Static391.anInt6797;
		local3.anInt3451 = arg3 >> Static391.anInt6797;
		local3.anInt3446 = arg4 >> Static391.anInt6797;
		local3.anInt3450 = arg0;
		local3.anInt3444 = arg1;
		local3.anInt3437 = arg2;
		local3.anInt3453 = arg3;
		local3.anInt3445 = arg4;
		local3.anInt3448 = arg5;
		local3.anInt3438 = arg6;
		Static114.aClass113Array1[Static20.anInt7227++] = local3;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!iu;I)V")
	public static void method5721(@OriginalArg(0) Class4_Sub20_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method3235();
		@Pc(18) int local18;
		@Pc(48) int local48;
		for (@Pc(12) int local12 = 0; local12 < Static402.anInt7091; local12++) {
			local18 = Static144.anIntArray244[local12];
			if ((Static260.aByteArray65[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static260.aByteArray65[local18] = (byte) (Static260.aByteArray65[local18] | 0x2);
				} else {
					local48 = arg0.method3245(1);
					if (local48 == 0) {
						local7 = Static241.method4022(arg0);
						Static260.aByteArray65[local18] = (byte) (Static260.aByteArray65[local18] | 0x2);
					} else {
						Static38.method778(arg0, local18);
					}
				}
			}
		}
		arg0.method3240();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3235();
		@Pc(125) int local125;
		for (local18 = 0; local18 < Static402.anInt7091; local18++) {
			local48 = Static144.anIntArray244[local18];
			if ((Static260.aByteArray65[local48] & 0x1) != 0) {
				if (local7 > 0) {
					Static260.aByteArray65[local48] = (byte) (Static260.aByteArray65[local48] | 0x2);
					local7--;
				} else {
					local125 = arg0.method3245(1);
					if (local125 == 0) {
						local7 = Static241.method4022(arg0);
						Static260.aByteArray65[local48] = (byte) (Static260.aByteArray65[local48] | 0x2);
					} else {
						Static38.method778(arg0, local48);
					}
				}
			}
		}
		arg0.method3240();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3235();
		@Pc(209) int local209;
		for (local48 = 0; local48 < Static321.anInt5399; local48++) {
			local125 = Static62.anIntArray114[local48];
			if ((Static260.aByteArray65[local125] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static260.aByteArray65[local125] = (byte) (Static260.aByteArray65[local125] | 0x2);
				} else {
					local209 = arg0.method3245(1);
					if (local209 == 0) {
						local7 = Static241.method4022(arg0);
						Static260.aByteArray65[local125] = (byte) (Static260.aByteArray65[local125] | 0x2);
					} else if (Static237.method3991(local125, arg0)) {
						Static260.aByteArray65[local125] = (byte) (Static260.aByteArray65[local125] | 0x2);
					}
				}
			}
		}
		arg0.method3240();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3235();
		for (local125 = 0; local125 < Static321.anInt5399; local125++) {
			local209 = Static62.anIntArray114[local125];
			if ((Static260.aByteArray65[local209] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static260.aByteArray65[local209] = (byte) (Static260.aByteArray65[local209] | 0x2);
				} else {
					@Pc(302) int local302 = arg0.method3245(1);
					if (local302 == 0) {
						local7 = Static241.method4022(arg0);
						Static260.aByteArray65[local209] = (byte) (Static260.aByteArray65[local209] | 0x2);
					} else if (Static237.method3991(local209, arg0)) {
						Static260.aByteArray65[local209] = (byte) (Static260.aByteArray65[local209] | 0x2);
					}
				}
			}
		}
		arg0.method3240();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static402.anInt7091 = 0;
		Static321.anInt5399 = 0;
		for (local209 = 1; local209 < 2048; local209++) {
			Static260.aByteArray65[local209] = (byte) (Static260.aByteArray65[local209] >> 1);
			@Pc(379) Class11_Sub5_Sub2_Sub1 local379 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local209];
			if (local379 == null) {
				Static62.anIntArray114[Static321.anInt5399++] = local209;
			} else {
				Static144.anIntArray244[Static402.anInt7091++] = local209;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method5722() {
		if (Static30.aClass30_3.method2048()) {
			Static30.aClass30_3.method2043(Static409.aCanvas7);
			Static58.method1269();
			Static30.aClass30_3.method2047(Static409.aCanvas7);
			Static30.aClass30_3.method2073(Static409.aCanvas7);
		} else {
			Static391.method5496(Static192.anInt3828);
		}
		Static208.method3674();
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method5723() {
		for (@Pc(7) int local7 = 0; local7 < Static398.aByteArrayArrayArray17.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static398.aByteArrayArrayArray17[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static398.aByteArrayArrayArray17[0][0].length; local15++) {
					Static398.aByteArrayArrayArray17[local7][local11][local15] = 0;
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	public static int anInt608;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static int anInt601 = -2;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!hp;)V")
	public static void method571(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(9) int local9 = arg0.method5361();
		Static26.aClass131Array1 = new Class131[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static26.aClass131Array1[local14] = new Class131();
			Static26.aClass131Array1[local14].anInt3574 = arg0.method5361();
			Static26.aClass131Array1[local14].aString26 = arg0.method5406();
		}
		Static18.anInt3463 = arg0.method5361();
		Static204.anInt7303 = arg0.method5361();
		Static210.anInt3953 = arg0.method5361();
		Static444.aClass91_Sub1Array2 = new Class91_Sub1[Static204.anInt7303 + 1 - Static18.anInt3463];
		for (@Pc(66) int local66 = 0; local66 < Static210.anInt3953; local66++) {
			@Pc(72) int local72 = arg0.method5361();
			@Pc(80) Class91_Sub1 local80 = Static444.aClass91_Sub1Array2[local72] = new Class91_Sub1();
			local80.anInt2658 = arg0.method5366();
			local80.anInt2651 = arg0.method5407();
			local80.anInt2662 = local72 + Static18.anInt3463;
			local80.aString20 = arg0.method5406();
			local80.aString21 = arg0.method5406();
		}
		Static52.anInt5267 = arg0.method5407();
		Static43.aBoolean46 = true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)[Lclient!kl;")
	public static Class137[] method576() {
		return new Class137[] { Static45.aClass137_10, Static64.aClass137_3, Static176.aClass137_8, Static312.aClass137_9, Static102.aClass137_5, Static83.aClass137_4 };
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method577(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		arg0.method312();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static155.anInt2952; local12++) {
			local18 = Static381.anIntArray619[local12];
			if ((Static130.aByteArray48[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static130.aByteArray48[local18] = (byte) (Static130.aByteArray48[local18] | 0x2);
				} else {
					local46 = arg0.method316(1);
					if (local46 == 0) {
						local10 = Static217.method3375(arg0);
						Static130.aByteArray48[local18] = (byte) (Static130.aByteArray48[local18] | 0x2);
					} else {
						Static58.method1256(local18, arg0);
					}
				}
			}
		}
		arg0.method313();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method312();
		@Pc(129) int local129;
		for (local18 = 0; local18 < Static155.anInt2952; local18++) {
			local46 = Static381.anIntArray619[local18];
			if ((Static130.aByteArray48[local46] & 0x1) != 0) {
				if (local10 > 0) {
					Static130.aByteArray48[local46] = (byte) (Static130.aByteArray48[local46] | 0x2);
					local10--;
				} else {
					local129 = arg0.method316(1);
					if (local129 == 0) {
						local10 = Static217.method3375(arg0);
						Static130.aByteArray48[local46] = (byte) (Static130.aByteArray48[local46] | 0x2);
					} else {
						Static58.method1256(local46, arg0);
					}
				}
			}
		}
		arg0.method313();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method312();
		@Pc(209) int local209;
		for (local46 = 0; local46 < Static152.anInt2904; local46++) {
			local129 = Static186.anIntArray299[local46];
			if ((Static130.aByteArray48[local129] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static130.aByteArray48[local129] = (byte) (Static130.aByteArray48[local129] | 0x2);
				} else {
					local209 = arg0.method316(1);
					if (local209 == 0) {
						local10 = Static217.method3375(arg0);
						Static130.aByteArray48[local129] = (byte) (Static130.aByteArray48[local129] | 0x2);
					} else if (Static364.method4980(local129, arg0)) {
						Static130.aByteArray48[local129] = (byte) (Static130.aByteArray48[local129] | 0x2);
					}
				}
			}
		}
		arg0.method313();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method312();
		for (local129 = 0; local129 < Static152.anInt2904; local129++) {
			local209 = Static186.anIntArray299[local129];
			if ((Static130.aByteArray48[local209] & 0x1) == 0) {
				if (local10 > 0) {
					Static130.aByteArray48[local209] = (byte) (Static130.aByteArray48[local209] | 0x2);
					local10--;
				} else {
					@Pc(302) int local302 = arg0.method316(1);
					if (local302 == 0) {
						local10 = Static217.method3375(arg0);
						Static130.aByteArray48[local209] = (byte) (Static130.aByteArray48[local209] | 0x2);
					} else if (Static364.method4980(local209, arg0)) {
						Static130.aByteArray48[local209] = (byte) (Static130.aByteArray48[local209] | 0x2);
					}
				}
			}
		}
		arg0.method313();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static155.anInt2952 = 0;
		Static152.anInt2904 = 0;
		for (local209 = 1; local209 < 2048; local209++) {
			Static130.aByteArray48[local209] = (byte) (Static130.aByteArray48[local209] >> 1);
			@Pc(370) Class31_Sub2_Sub1_Sub1 local370 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local209];
			if (local370 == null) {
				Static186.anIntArray299[Static152.anInt2904++] = local209;
			} else {
				Static381.anIntArray619[Static155.anInt2952++] = local209;
			}
		}
	}
}

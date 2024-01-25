import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V")
	public static void method600(@OriginalArg(1) int arg0) {
		if (Static598.anInt9831 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static248.aString61 == null) {
				Static102.method2243(Static321.aString71, Static64.anInt1206, Static39.aString11);
			} else {
				Static578.method7861(Static64.anInt1206);
			}
		}
		if (arg0 != 13 && Static559.aClass45_2 != null) {
			Static559.aClass45_2.method839();
			Static559.aClass45_2 = null;
		}
		if (arg0 == 3) {
			Static452.method6401(Static249.anInt4945 != Static228.anInt4681);
		}
		if (arg0 == 7) {
			Static592.method7964(Static249.anInt4945 != Static185.anInt8672);
		}
		if (arg0 == 5) {
			if (Static248.aString61 == null) {
				Static199.method3565(Static321.aString71, Static39.aString11);
			} else {
				Static461.method6472();
			}
		} else if (arg0 == 6) {
			if (Static248.aString61 == null) {
				Static102.method2243(Static321.aString71, Static64.anInt1206, Static39.aString11);
			} else {
				Static578.method7861(Static64.anInt1206);
			}
		} else if (arg0 == 9) {
			if (Static248.aString61 == null) {
				Static102.method2243(Static321.aString71, Static64.anInt1206, Static39.aString11);
			} else {
				Static578.method7861(Static64.anInt1206);
			}
		} else if (arg0 == 12) {
			if (Static248.aString61 == null) {
				Static199.method3565(Static321.aString71, Static39.aString11);
			} else {
				Static461.method6472();
			}
		}
		if (Static308.method4764(Static598.anInt9831)) {
			Static483.aClass31_104.anInt775 = 2;
			Static577.aClass31_122.anInt775 = 2;
			Static592.aClass31_124.anInt775 = 2;
			Static577.aClass31_123.anInt775 = 2;
			Static478.aClass31_103.anInt775 = 2;
			Static408.aClass31_90.anInt775 = 2;
			Static485.aClass31_105.anInt775 = 2;
		}
		if (Static308.method4764(arg0)) {
			Static180.anInt3829 = 1;
			Static383.anInt6777 = 1;
			Static407.anInt7051 = 0;
			Static483.anInt8144 = 0;
			Static505.anInt8749 = 0;
			Static245.method4153(true);
			Static483.aClass31_104.anInt775 = 1;
			Static577.aClass31_122.anInt775 = 1;
			Static592.aClass31_124.anInt775 = 1;
			Static577.aClass31_123.anInt775 = 1;
			Static478.aClass31_103.anInt775 = 1;
			Static408.aClass31_90.anInt775 = 1;
			Static485.aClass31_105.anInt775 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static525.method7327();
		}
		@Pc(234) boolean local234 = arg0 == 2 || Static440.method6236(arg0) || Static69.method1224(arg0);
		@Pc(249) boolean local249 = Static598.anInt9831 == 2 || Static440.method6236(Static598.anInt9831) || Static69.method1224(Static598.anInt9831);
		if (local234 != local249) {
			if (local234) {
				Static416.anInt7187 = Static491.anInt8563;
				if (Static189.aClass4_Sub2_Sub1_1.anInt9278 == 0) {
					Static291.method4570();
				} else {
					Static67.method1112(Static189.aClass4_Sub2_Sub1_1.anInt9278, Static491.anInt8563, Static291.aClass31_66);
				}
				Static160.aClass207_1.method4639(false);
			} else {
				Static291.method4570();
				Static160.aClass207_1.method4639(true);
			}
		}
		if (Static308.method4764(arg0) || arg0 == 13) {
			Static185.aClass66_14.method6784();
		}
		Static598.anInt9831 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public static void method601() {
		@Pc(12) int local12 = Static475.aByteArrayArray33.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			if (Static475.aByteArrayArray33[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static353.anInt6156; local24++) {
					if (Static380.anIntArray543[local14] == Static555.anIntArray702[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static555.anIntArray702[Static353.anInt6156] = Static380.anIntArray543[local14];
					local22 = Static353.anInt6156++;
				}
				@Pc(71) Class4_Sub9 local71 = new Class4_Sub9(Static475.aByteArrayArray33[local14]);
				@Pc(73) int local73 = 0;
				while (Static475.aByteArrayArray33[local14].length > local71.anInt7219 && local73 < 511 && Static428.anInt7363 < 1023) {
					@Pc(94) int local94 = local73++ << 6 | local22;
					@Pc(98) int local98 = local71.method5982();
					@Pc(102) int local102 = local98 >> 14;
					@Pc(108) int local108 = local98 >> 7 & 0x3F;
					@Pc(112) int local112 = local98 & 0x3F;
					@Pc(125) int local125 = local108 + (Static380.anIntArray543[local14] >> 8) * 64 - Static373.anInt6695;
					@Pc(137) int local137 = local112 + (Static380.anIntArray543[local14] & 0xFF) * 64 - Static6.anInt97;
					@Pc(144) Class54 local144 = Static401.aClass345_2.method7602(local71.method5982());
					@Pc(151) Class4_Sub50 local151 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local94);
					if (local151 == null && (local144.aByte20 & 0x1) > 0 && Static312.anInt9775 == local102 && local125 >= 0 && local125 + local144.anInt1260 < Static38.anInt740 && local137 >= 0 && Static38.anInt741 > local137 + local144.anInt1260) {
						@Pc(185) Class10_Sub1_Sub2_Sub1 local185 = new Class10_Sub1_Sub2_Sub1();
						local185.anInt8531 = local94;
						@Pc(193) Class4_Sub50 local193 = new Class4_Sub50(local185);
						Static106.aClass183_8.method4282((long) local94, local193);
						Static161.aClass4_Sub50Array1[Static566.anInt9466++] = local193;
						Static444.anIntArray617[Static428.anInt7363++] = local94;
						local185.anInt8497 = Static237.anInt7561;
						local185.method3531(local144);
						local185.method7028(local185.aClass54_1.anInt1260);
						local185.anInt8513 = local185.aClass54_1.anInt1291 << 3;
						local185.method7033(local185.aClass54_1.aByte24 + 4 << 11 & 0x3F11, true);
						local185.method3524(local185.method7021(), local102, local125, true, local137);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(II)I")
	public static int method603(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}

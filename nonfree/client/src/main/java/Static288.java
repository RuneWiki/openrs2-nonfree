import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
	public static int anInt5007;

	@OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
	public static int anInt5009;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_110 = new Class205(22, -1);

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_76 = new Class11(38, -1);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ae;IIILclient!vc;)V")
	public static void method4374(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class63 arg3) {
		@Pc(14) Class165 local14 = arg0.method83(arg3);
		if (local14 == null) {
			return;
		}
		arg3.method1958(arg1, arg2, arg0.anInt101 + arg1, arg2 - -arg0.anInt113);
		if (Static233.anInt4156 == 2 || Static233.anInt4156 == 5 || Static348.aClass18_26 == null) {
			arg3.method1977(local14, arg1, arg2);
			return;
		}
		@Pc(64) int local64;
		@Pc(54) int local54;
		@Pc(51) int local51;
		@Pc(61) int local61;
		if (Static79.anInt4624 == 4) {
			local61 = 4096;
			local54 = Static295.anInt5082;
			local64 = Static290.anInt5046;
			local51 = (int) -Static127.aFloat41 & 0x3FFF;
		} else {
			local51 = (int) -Static127.aFloat41 + Static190.anInt3567 & 0x3FFF;
			local54 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386;
			local61 = 4096 - Static30.anInt643 * 16;
			local64 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390;
		}
		@Pc(91) int local91 = local64 / 32 + 208 + 48 - Static246.anInt4374 * 2;
		@Pc(110) int local110 = Static185.anInt3485 * 4 + 48 - local54 / 32 - (Static185.anInt3485 + -104) * 2;
		Static348.aClass18_26.method4568((float) arg1 + (float) arg0.anInt101 / 2.0F, (float) arg2 + (float) arg0.anInt113 / 2.0F, (float) local91, (float) local110, local61, local51 << 2, local14, arg1, arg2);
		@Pc(161) int local161;
		@Pc(170) int local170;
		@Pc(181) int local181;
		@Pc(192) int local192;
		for (@Pc(144) Class2_Sub14 local144 = (Class2_Sub14) Static104.aClass30_14.method694(); local144 != null; local144 = (Class2_Sub14) Static104.aClass30_14.method682()) {
			@Pc(149) int local149 = local144.anInt1455;
			local161 = (Static47.aClass209_1.anIntArray1006[local149] >> 14 & 0x3FFF) - Static28.anInt606;
			local170 = (Static47.aClass209_1.anIntArray1006[local149] & 0x3FFF) - Static319.anInt5425;
			local181 = local161 * 4 + 2 - local64 / 32;
			local192 = local170 * 4 + 2 - local54 / 32;
			Static341.method5003(arg3, local181, arg1, local192, local14, arg0, arg2, Static47.aClass209_1.anIntArray1007[local149]);
		}
		for (local161 = 0; local161 < Static113.anInt2428; local161++) {
			local170 = Static168.anIntArray641[local161] * 4 + 2 - local64 / 32;
			local181 = Static26.anIntArray115[local161] * 4 + 2 - local54 / 32;
			@Pc(247) Class172 local247 = Static221.aClass118_6.method2858(Static128.anIntArray535[local161]);
			if (local247.anIntArray801 != null) {
				local247 = local247.method3775(Static321.aClass211_1);
				if (local247 == null || local247.anInt4105 == -1) {
					continue;
				}
			}
			Static341.method5003(arg3, local170, arg1, local181, local14, arg0, arg2, local247.anInt4105);
		}
		for (@Pc(284) Class2_Sub28 local284 = (Class2_Sub28) Static94.aClass246_6.method5606(); local284 != null; local284 = (Class2_Sub28) Static94.aClass246_6.method5614()) {
			local181 = (int) (local284.aLong209 >> 28 & 0x3L);
			if (Static63.anInt1264 == local181) {
				local192 = (int) (local284.aLong209 & 0x3FFFL) * 4 + 2 - local64 / 32;
				@Pc(328) int local328 = (int) (local284.aLong209 >> 14 & 0x3FFFL) * 4 + 2 - local54 / 32;
				Static35.method636(local192, local14, arg2, Static265.aClass18Array11[0], local328, arg1, arg0);
			}
		}
		@Pc(398) int local398;
		for (local181 = 0; local181 < Static171.anInt3311; local181++) {
			@Pc(356) Class1_Sub5_Sub1_Sub2 local356 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local181]];
			if (local356 != null && local356.method5563() && Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 == local356.aByte69) {
				@Pc(370) Class133 local370 = local356.aClass133_1;
				if (local370 != null && local370.anIntArray653 != null) {
					local370 = local370.method3094(Static321.aClass211_1);
				}
				if (local370 != null && local370.aBoolean261 && local370.aBoolean262) {
					local398 = local356.anInt6390 / 32 - local64 / 32;
					@Pc(408) int local408 = local356.anInt6386 / 32 - local54 / 32;
					if (local370.anInt3356 == -1) {
						Static35.method636(local398, local14, arg2, Static265.aClass18Array11[1], local408, arg1, arg0);
					} else {
						Static341.method5003(arg3, local398, arg1, local408, local14, arg0, arg2, local370.anInt3356);
					}
				}
			}
		}
		local192 = Static335.anInt5738;
		@Pc(445) int[] local445 = Static242.anIntArray933;
		@Pc(483) int local483;
		@Pc(493) int local493;
		@Pc(497) int local497;
		for (local398 = 0; local398 < local192; local398++) {
			@Pc(455) Class1_Sub5_Sub1_Sub1 local455 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local445[local398]];
			if (local455 != null && local455.method2247() && Static206.aClass1_Sub5_Sub1_Sub1_1 != local455 && local455.aByte69 == Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69) {
				local483 = local455.anInt6390 / 32 - local64 / 32;
				local493 = local455.anInt6386 / 32 - local54 / 32;
				@Pc(495) boolean local495 = false;
				for (local497 = 0; local497 < Static121.anInt2600; local497++) {
					if (local455.aString24.equals(Static174.aStringArray82[local497]) && Static249.anIntArray1341[local497] != 0) {
						local495 = true;
						break;
					}
				}
				@Pc(527) boolean local527 = false;
				for (@Pc(529) int local529 = 0; local529 < Static19.anInt436; local529++) {
					if (local455.aString24.equals(Static372.aClass234Array1[local529].aString60)) {
						local527 = true;
						break;
					}
				}
				@Pc(549) boolean local549 = false;
				if (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2267 != 0 && local455.anInt2267 != 0 && Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2267 == local455.anInt2267) {
					local549 = true;
				}
				if (local495) {
					Static35.method636(local483, local14, arg2, Static265.aClass18Array11[3], local493, arg1, arg0);
				} else if (local527) {
					Static35.method636(local483, local14, arg2, Static265.aClass18Array11[5], local493, arg1, arg0);
				} else if (local549) {
					Static35.method636(local483, local14, arg2, Static265.aClass18Array11[4], local493, arg1, arg0);
				} else {
					Static35.method636(local483, local14, arg2, Static265.aClass18Array11[2], local493, arg1, arg0);
				}
			}
		}
		@Pc(638) Class141[] local638 = Static335.aClass141Array1;
		@Pc(730) int local730;
		for (local483 = 0; local483 < local638.length; local483++) {
			@Pc(646) Class141 local646 = local638[local483];
			if (local646 != null && local646.anInt3559 != 0 && Static253.anInt4469 % 20 < 10) {
				@Pc(699) int local699;
				if (local646.anInt3559 == 1 && local646.anInt3561 >= 0 && Static299.aClass1_Sub5_Sub1_Sub2Array1.length > local646.anInt3561) {
					@Pc(677) Class1_Sub5_Sub1_Sub2 local677 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local646.anInt3561];
					if (local677 != null) {
						local497 = local677.anInt6390 / 32 - local64 / 32;
						local699 = local677.anInt6386 / 32 - local54 / 32;
						Static311.method4582(local646.anInt3554, local497, arg1, arg0, local699, local14, 360000, arg2);
					}
				}
				if (local646.anInt3559 == 2) {
					local730 = (local646.anInt3557 - Static28.anInt606) * 4 + 2 - local64 / 32;
					local497 = (local646.anInt3563 - Static319.anInt5425) * 4 + 2 - local54 / 32;
					local699 = local646.anInt3560 * 4;
					local699 *= local699;
					Static311.method4582(local646.anInt3554, local730, arg1, arg0, local497, local14, local699, arg2);
				}
				if (local646.anInt3559 == 10 && local646.anInt3561 >= 0 && Static125.aClass1_Sub5_Sub1_Sub1Array1.length > local646.anInt3561) {
					@Pc(784) Class1_Sub5_Sub1_Sub1 local784 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local646.anInt3561];
					if (local784 != null) {
						local497 = local784.anInt6390 / 32 - local64 / 32;
						local699 = local784.anInt6386 / 32 - local54 / 32;
						Static311.method4582(local646.anInt3554, local497, arg1, arg0, local699, local14, 360000, arg2);
					}
				}
			}
		}
		if (Static79.anInt4624 == 4) {
			return;
		}
		if (Static60.anInt1159 != 0) {
			local493 = Static60.anInt1159 * 4 + Static206.aClass1_Sub5_Sub1_Sub1_1.method5547() * 2 + 2 - local64 / 32 - 2;
			local730 = Static358.anInt2084 * 4 + (Static206.aClass1_Sub5_Sub1_Sub1_1.method5547() - 1) * 2 + 2 - local54 / 32;
			Static35.method636(local493, local14, arg2, Static34.aClass18Array1[Static331.aBoolean415 ? 1 : 0], local730, arg1, arg0);
		}
		arg3.method1951(arg2 + arg0.anInt113 / 2 - 1, 3, 3, -1, arg0.anInt101 / 2 + arg1 - 1);
		return;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!ln;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Lclient!at;")
	public static Class16 aClass16_18 = null;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public static int anInt5710 = 0;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
	public static final int anInt5713 = 1338;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
	public static void method4488() {
		Static208.anInt3488 = 0;
		Static147.aClass64Array1 = new Class64[50];
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public static void method4489() {
		@Pc(7) Class178 local7 = null;
		try {
			@Pc(13) Class91 local13 = Static79.aClass183_2.method3921("2", true);
			while (local13.anInt2446 == 0) {
				Static429.method5376(1L);
			}
			if (local13.anInt2446 == 1) {
				local7 = (Class178) local13.anObject3;
				@Pc(38) Class2_Sub13 local38 = new Class2_Sub13(Static39.anInt748 * 6 + 3);
				local38.method3602(1);
				local38.method3568(Static39.anInt748);
				for (@Pc(48) int local48 = 0; local48 < Static400.anIntArray551.length; local48++) {
					if (Static270.aBooleanArray18[local48]) {
						local38.method3568(local48);
						local38.method3569(Static400.anIntArray551[local48]);
					}
				}
				local7.method3782(local38.anInt4347, local38.aByteArray52, 0);
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method3779();
			}
		} catch (@Pc(98) Exception local98) {
		}
		Static446.aLong221 = Static110.method1702();
		Static255.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!za;Z)V")
	public static void method4490(@OriginalArg(0) Class163 arg0) {
		@Pc(7) int local7 = Static275.anInt4524;
		@Pc(9) int local9 = Static253.anInt4058;
		@Pc(11) int local11 = Static246.anInt3972;
		@Pc(13) int local13 = Static429.anInt6935;
		arg0.method5545(local13, -10660793, local11, local9, local7);
		arg0.method5545(16, -16777216, local11 - 2, local9 - -1, local7 + 1);
		arg0.method5504(-16777216, local11 - 2, local9 + 18, local13 - 19, local7 + 1);
		Static143.aClass92_3.method4512(local9 + 14, local7 + 3, Static445.aClass134_104.method2720(Static331.anInt5597), -10660793, -1);
		@Pc(72) int local72 = Static376.aClass203_1.method4918();
		@Pc(76) int local76 = Static376.aClass203_1.method4925();
		@Pc(78) int local78 = 0;
		for (@Pc(88) Class2_Sub46 local88 = (Class2_Sub46) Static261.aClass156_13.method3155(); local88 != null; local88 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			@Pc(104) int local104 = local9 + (-local78 + -1 + Static137.anInt6647) * 16 + 31;
			@Pc(106) short local106 = -1;
			if (local7 < local72 && local72 < local11 + local7 && local104 - 13 < local76 && local104 + 3 > local76 && local88.aBoolean530) {
				local106 = -256;
			}
			@Pc(143) int[] local143 = null;
			if (Static388.method3886(local88.anInt7283)) {
				local143 = Static384.aClass164_2.method3458((int) local88.aLong226).anIntArray500;
			} else if (local88.anInt7282 != -1) {
				local143 = Static384.aClass164_2.method3458(local88.anInt7282).anIntArray500;
			} else if (Static346.method4610(local88.anInt7283)) {
				@Pc(167) Class2_Sub28 local167 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local88.aLong226);
				if (local167 != null) {
					@Pc(172) Class3_Sub4_Sub1_Sub1 local172 = local167.aClass3_Sub4_Sub1_Sub1_1;
					@Pc(175) Class245 local175 = local172.aClass245_1;
					if (local175.anIntArray560 != null) {
						local175 = local175.method5205(Static138.aClass268_1);
					}
					if (local175 != null) {
						local143 = local175.anIntArray561;
					}
				}
			} else if (Static181.method2510(local88.anInt7283)) {
				@Pc(211) Class192 local211;
				if (local88.anInt7283 == 1009) {
					local211 = Static50.aClass190_1.method4218((int) local88.aLong226);
				} else {
					local211 = Static50.aClass190_1.method4218((int) (local88.aLong226 >>> 32 & 0x7FFFFFFFL));
				}
				if (local211.anIntArray434 != null) {
					local211 = local211.method4228(Static138.aClass268_1);
				}
				if (local211 != null) {
					local143 = local211.anIntArray436;
				}
			}
			@Pc(253) String local253 = Static359.method4734(local88);
			if (local143 != null) {
				local253 = local253 + Static186.method5106(local143);
			}
			Static143.aClass92_3.method4503(Static181.anIntArray245, local7 + 3, Static271.aClass13Array14, local106, local253, local104);
			if (local88.aBoolean531) {
				Static143.aClass13_11.method5668(local7 + Static241.aClass141_5.method2914(local253) + 5, local104 + -12);
			}
			local78++;
		}
		Static79.method1167(Static246.anInt3972, Static275.anInt4524, Static429.anInt6935, Static253.anInt4058);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)C")
	public static char method4491(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(44) char local44 = Static243.aCharArray2[local12 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local12 = local44;
		}
		return (char) local12;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_34 = new Class230(67, 0);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!cda;Z)V")
	public static void method2903(@OriginalArg(0) Class3_Sub7_Sub1 arg0) {
		arg0.method1500();
		@Pc(8) int local8 = 0;
		@Pc(15) int local15;
		@Pc(42) int local42;
		for (@Pc(10) int local10 = 0; local10 < Static455.anInt8611; local10++) {
			local15 = Static492.anIntArray589[local10];
			if ((Static241.aByteArray60[local15] & 0x1) == 0) {
				if (local8 > 0) {
					local8--;
					Static241.aByteArray60[local15] = (byte) (Static241.aByteArray60[local15] | 0x2);
				} else {
					local42 = arg0.method1499(1);
					if (local42 == 0) {
						local8 = Static3.method213(arg0);
						Static241.aByteArray60[local15] = (byte) (Static241.aByteArray60[local15] | 0x2);
					} else {
						Static122.method2427(local15, arg0);
					}
				}
			}
		}
		arg0.method1491();
		if (local8 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1500();
		@Pc(120) int local120;
		for (local15 = 0; local15 < Static455.anInt8611; local15++) {
			local42 = Static492.anIntArray589[local15];
			if ((Static241.aByteArray60[local42] & 0x1) != 0) {
				if (local8 > 0) {
					local8--;
					Static241.aByteArray60[local42] = (byte) (Static241.aByteArray60[local42] | 0x2);
				} else {
					local120 = arg0.method1499(1);
					if (local120 == 0) {
						local8 = Static3.method213(arg0);
						Static241.aByteArray60[local42] = (byte) (Static241.aByteArray60[local42] | 0x2);
					} else {
						Static122.method2427(local42, arg0);
					}
				}
			}
		}
		arg0.method1491();
		if (local8 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1500();
		@Pc(192) int local192;
		for (local42 = 0; local42 < Static355.anInt5529; local42++) {
			local120 = Static335.anIntArray447[local42];
			if ((Static241.aByteArray60[local120] & 0x1) != 0) {
				if (local8 > 0) {
					Static241.aByteArray60[local120] = (byte) (Static241.aByteArray60[local120] | 0x2);
					local8--;
				} else {
					local192 = arg0.method1499(1);
					if (local192 == 0) {
						local8 = Static3.method213(arg0);
						Static241.aByteArray60[local120] = (byte) (Static241.aByteArray60[local120] | 0x2);
					} else if (Static237.method4125(local120, arg0)) {
						Static241.aByteArray60[local120] = (byte) (Static241.aByteArray60[local120] | 0x2);
					}
				}
			}
		}
		arg0.method1491();
		if (local8 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1500();
		for (local120 = 0; local120 < Static355.anInt5529; local120++) {
			local192 = Static335.anIntArray447[local120];
			if ((Static241.aByteArray60[local192] & 0x1) == 0) {
				if (local8 > 0) {
					Static241.aByteArray60[local192] = (byte) (Static241.aByteArray60[local192] | 0x2);
					local8--;
				} else {
					@Pc(280) int local280 = arg0.method1499(1);
					if (local280 == 0) {
						local8 = Static3.method213(arg0);
						Static241.aByteArray60[local192] = (byte) (Static241.aByteArray60[local192] | 0x2);
					} else if (Static237.method4125(local192, arg0)) {
						Static241.aByteArray60[local192] = (byte) (Static241.aByteArray60[local192] | 0x2);
					}
				}
			}
		}
		arg0.method1491();
		if (local8 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static455.anInt8611 = 0;
		Static355.anInt5529 = 0;
		for (local192 = 1; local192 < 2048; local192++) {
			Static241.aByteArray60[local192] = (byte) (Static241.aByteArray60[local192] >> 1);
			@Pc(349) Class2_Sub2_Sub1_Sub1 local349 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local192];
			if (local349 == null) {
				Static335.anIntArray447[Static355.anInt5529++] = local192;
			} else {
				Static492.anIntArray589[Static455.anInt8611++] = local192;
			}
		}
	}
}

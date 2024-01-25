import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static int anInt8894 = -1;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static final int anInt8898 = 1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)I")
	public static int method7199() {
		return Static129.anInt2578;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public static void method7201(@OriginalArg(0) boolean arg0) {
		Static241.method3589(arg0, Static349.anInt6422, Static165.anInt3165, Static594.anInt9806);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!mw;)V")
	public static void method7202(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4996();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static75.anInt1461; local12++) {
			local18 = Static167.anIntArray145[local12];
			if ((Static344.aByteArray65[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static344.aByteArray65[local18] = (byte) (Static344.aByteArray65[local18] | 0x2);
				} else {
					local46 = arg0.method4994(1);
					if (local46 == 0) {
						local7 = Static437.method6204(arg0);
						Static344.aByteArray65[local18] = (byte) (Static344.aByteArray65[local18] | 0x2);
					} else {
						Static318.method4731(local18, arg0);
					}
				}
			}
		}
		arg0.method4997();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4996();
		@Pc(125) int local125;
		for (local18 = 0; local18 < Static75.anInt1461; local18++) {
			local46 = Static167.anIntArray145[local18];
			if ((Static344.aByteArray65[local46] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static344.aByteArray65[local46] = (byte) (Static344.aByteArray65[local46] | 0x2);
				} else {
					local125 = arg0.method4994(1);
					if (local125 == 0) {
						local7 = Static437.method6204(arg0);
						Static344.aByteArray65[local46] = (byte) (Static344.aByteArray65[local46] | 0x2);
					} else {
						Static318.method4731(local46, arg0);
					}
				}
			}
		}
		arg0.method4997();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4996();
		@Pc(216) int local216;
		for (local46 = 0; local46 < Static525.anInt8937; local46++) {
			local125 = Static547.anIntArray578[local46];
			if ((Static344.aByteArray65[local125] & 0x1) != 0) {
				if (local7 > 0) {
					Static344.aByteArray65[local125] = (byte) (Static344.aByteArray65[local125] | 0x2);
					local7--;
				} else {
					local216 = arg0.method4994(1);
					if (local216 == 0) {
						local7 = Static437.method6204(arg0);
						Static344.aByteArray65[local125] = (byte) (Static344.aByteArray65[local125] | 0x2);
					} else if (Static587.method7878(local125, arg0)) {
						Static344.aByteArray65[local125] = (byte) (Static344.aByteArray65[local125] | 0x2);
					}
				}
			}
		}
		arg0.method4997();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4996();
		for (local125 = 0; local125 < Static525.anInt8937; local125++) {
			local216 = Static547.anIntArray578[local125];
			if ((Static344.aByteArray65[local216] & 0x1) == 0) {
				if (local7 > 0) {
					Static344.aByteArray65[local216] = (byte) (Static344.aByteArray65[local216] | 0x2);
					local7--;
				} else {
					@Pc(299) int local299 = arg0.method4994(1);
					if (local299 == 0) {
						local7 = Static437.method6204(arg0);
						Static344.aByteArray65[local216] = (byte) (Static344.aByteArray65[local216] | 0x2);
					} else if (Static587.method7878(local216, arg0)) {
						Static344.aByteArray65[local216] = (byte) (Static344.aByteArray65[local216] | 0x2);
					}
				}
			}
		}
		arg0.method4997();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static525.anInt8937 = 0;
		Static75.anInt1461 = 0;
		for (local216 = 1; local216 < 2048; local216++) {
			Static344.aByteArray65[local216] = (byte) (Static344.aByteArray65[local216] >> 1);
			@Pc(370) Class11_Sub1_Sub1_Sub3_Sub1 local370 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local216];
			if (local370 == null) {
				Static547.anIntArray578[Static525.anInt8937++] = local216;
			} else {
				Static167.anIntArray145[Static75.anInt1461++] = local216;
			}
		}
	}
}

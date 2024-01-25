import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!tw;I)V")
	public static void method2015(@OriginalArg(0) Class2_Sub20_Sub2 arg0) {
		arg0.method8607();
		@Pc(10) int local10 = 0;
		@Pc(20) int local20;
		@Pc(55) int local55;
		for (@Pc(12) int local12 = 0; local12 < Static268.anInt4162; local12++) {
			local20 = Static597.anIntArray677[local12];
			if ((Static384.aByteArray84[local20] & 0x1) == 0) {
				if (local10 > 0) {
					Static384.aByteArray84[local20] = (byte) (Static384.aByteArray84[local20] | 0x2);
					local10--;
				} else {
					local55 = arg0.method8608(1);
					if (local55 == 0) {
						local10 = Static625.method8450(arg0);
						Static384.aByteArray84[local20] = (byte) (Static384.aByteArray84[local20] | 0x2);
					} else {
						Static720.method9581(arg0, local20);
					}
				}
			}
		}
		arg0.method8605();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method8607();
		@Pc(148) int local148;
		for (local20 = 0; local20 < Static268.anInt4162; local20++) {
			local55 = Static597.anIntArray677[local20];
			if ((Static384.aByteArray84[local55] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static384.aByteArray84[local55] = (byte) (Static384.aByteArray84[local55] | 0x2);
				} else {
					local148 = arg0.method8608(1);
					if (local148 == 0) {
						local10 = Static625.method8450(arg0);
						Static384.aByteArray84[local55] = (byte) (Static384.aByteArray84[local55] | 0x2);
					} else {
						Static720.method9581(arg0, local55);
					}
				}
			}
		}
		arg0.method8605();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method8607();
		@Pc(217) int local217;
		@Pc(252) int local252;
		for (local148 = 0; local148 < Static261.anInt10709; local148++) {
			local217 = Static347.anIntArray375[local148];
			if ((Static384.aByteArray84[local217] & 0x1) != 0) {
				if (local10 > 0) {
					Static384.aByteArray84[local217] = (byte) (Static384.aByteArray84[local217] | 0x2);
					local10--;
				} else {
					local252 = arg0.method8608(1);
					if (local252 == 0) {
						local10 = Static625.method8450(arg0);
						Static384.aByteArray84[local217] = (byte) (Static384.aByteArray84[local217] | 0x2);
					} else if (Static599.method8211(arg0, local217)) {
						Static384.aByteArray84[local217] = (byte) (Static384.aByteArray84[local217] | 0x2);
					}
				}
			}
		}
		arg0.method8605();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method8607();
		for (local217 = 0; local217 < Static261.anInt10709; local217++) {
			local252 = Static347.anIntArray375[local217];
			if ((Static384.aByteArray84[local252] & 0x1) == 0) {
				if (local10 > 0) {
					Static384.aByteArray84[local252] = (byte) (Static384.aByteArray84[local252] | 0x2);
					local10--;
				} else {
					@Pc(356) int local356 = arg0.method8608(1);
					if (local356 == 0) {
						local10 = Static625.method8450(arg0);
						Static384.aByteArray84[local252] = (byte) (Static384.aByteArray84[local252] | 0x2);
					} else if (Static599.method8211(arg0, local252)) {
						Static384.aByteArray84[local252] = (byte) (Static384.aByteArray84[local252] | 0x2);
					}
				}
			}
		}
		arg0.method8605();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static268.anInt4162 = 0;
		Static261.anInt10709 = 0;
		for (local252 = 1; local252 < 2048; local252++) {
			Static384.aByteArray84[local252] = (byte) (Static384.aByteArray84[local252] >> 1);
			@Pc(440) Class4_Sub2_Sub1_Sub2_Sub1 local440 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local252];
			if (local440 == null) {
				Static347.anIntArray375[Static261.anInt10709++] = local252;
			} else {
				Static597.anIntArray677[Static268.anInt4162++] = local252;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public static void method2016() {
		Static587.aClass145_12.L(Static366.anInt5876, Static650.aClass2_Sub30_29.aClass11_Sub7_1.method2014() == 1 ? Static521.anInt8289 + 256 << 2 : -1, 0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "[Lclient!bca;")
	public static final Class4_Sub5_Sub2[] aClass4_Sub5_Sub2Array2 = new Class4_Sub5_Sub2[14];

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	public static int anInt8124 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!dc;)V")
	public static void method6757(@OriginalArg(1) Class4_Sub11_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method1531();
		@Pc(23) int local23;
		@Pc(51) int local51;
		for (@Pc(12) int local12 = 0; local12 < Static413.anInt8212; local12++) {
			local23 = Static229.anIntArray201[local12];
			if ((Static270.aByteArray58[local23] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static270.aByteArray58[local23] = (byte) (Static270.aByteArray58[local23] | 0x2);
				} else {
					local51 = arg0.method1530(1);
					if (local51 == 0) {
						local7 = Static529.method7679(arg0);
						Static270.aByteArray58[local23] = (byte) (Static270.aByteArray58[local23] | 0x2);
					} else {
						Static178.method3227(local23, arg0);
					}
				}
			}
		}
		arg0.method1537();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1531();
		@Pc(132) int local132;
		for (local23 = 0; local23 < Static413.anInt8212; local23++) {
			local51 = Static229.anIntArray201[local23];
			if ((Static270.aByteArray58[local51] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static270.aByteArray58[local51] = (byte) (Static270.aByteArray58[local51] | 0x2);
				} else {
					local132 = arg0.method1530(1);
					if (local132 == 0) {
						local7 = Static529.method7679(arg0);
						Static270.aByteArray58[local51] = (byte) (Static270.aByteArray58[local51] | 0x2);
					} else {
						Static178.method3227(local51, arg0);
					}
				}
			}
		}
		arg0.method1537();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1531();
		@Pc(214) int local214;
		for (local51 = 0; local51 < Static244.anInt4461; local51++) {
			local132 = Static288.anIntArray538[local51];
			if ((Static270.aByteArray58[local132] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static270.aByteArray58[local132] = (byte) (Static270.aByteArray58[local132] | 0x2);
				} else {
					local214 = arg0.method1530(1);
					if (local214 == 0) {
						local7 = Static529.method7679(arg0);
						Static270.aByteArray58[local132] = (byte) (Static270.aByteArray58[local132] | 0x2);
					} else if (Static52.method682(local132, arg0)) {
						Static270.aByteArray58[local132] = (byte) (Static270.aByteArray58[local132] | 0x2);
					}
				}
			}
		}
		arg0.method1537();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1531();
		for (local132 = 0; local132 < Static244.anInt4461; local132++) {
			local214 = Static288.anIntArray538[local132];
			if ((Static270.aByteArray58[local214] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static270.aByteArray58[local214] = (byte) (Static270.aByteArray58[local214] | 0x2);
				} else {
					@Pc(310) int local310 = arg0.method1530(1);
					if (local310 == 0) {
						local7 = Static529.method7679(arg0);
						Static270.aByteArray58[local214] = (byte) (Static270.aByteArray58[local214] | 0x2);
					} else if (Static52.method682(local214, arg0)) {
						Static270.aByteArray58[local214] = (byte) (Static270.aByteArray58[local214] | 0x2);
					}
				}
			}
		}
		arg0.method1537();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static244.anInt4461 = 0;
		Static413.anInt8212 = 0;
		for (local214 = 1; local214 < 2048; local214++) {
			Static270.aByteArray58[local214] = (byte) (Static270.aByteArray58[local214] >> 1);
			@Pc(377) Class1_Sub4_Sub2_Sub1_Sub2 local377 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local214];
			if (local377 == null) {
				Static288.anIntArray538[Static244.anInt4461++] = local214;
			} else {
				Static229.anIntArray201[Static413.anInt8212++] = local214;
			}
		}
	}
}

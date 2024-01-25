import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!lk;)V")
	public static void method5695(@OriginalArg(1) Class3_Sub28_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method5343();
		@Pc(20) int local20;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static558.anInt9284; local12++) {
			local20 = Static408.anIntArray393[local12];
			if ((Static418.aByteArray58[local20] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static418.aByteArray58[local20] = (byte) (Static418.aByteArray58[local20] | 0x2);
				} else {
					local49 = arg0.method5344(1);
					if (local49 == 0) {
						local7 = Static638.method8658(arg0);
						Static418.aByteArray58[local20] = (byte) (Static418.aByteArray58[local20] | 0x2);
					} else {
						Static333.method4982(arg0, local20);
					}
				}
			}
		}
		arg0.method5346();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5343();
		@Pc(159) int local159;
		for (local20 = 0; local20 < Static558.anInt9284; local20++) {
			local49 = Static408.anIntArray393[local20];
			if ((Static418.aByteArray58[local49] & 0x1) != 0) {
				if (local7 > 0) {
					Static418.aByteArray58[local49] = (byte) (Static418.aByteArray58[local49] | 0x2);
					local7--;
				} else {
					local159 = arg0.method5344(1);
					if (local159 == 0) {
						local7 = Static638.method8658(arg0);
						Static418.aByteArray58[local49] = (byte) (Static418.aByteArray58[local49] | 0x2);
					} else {
						Static333.method4982(arg0, local49);
					}
				}
			}
		}
		arg0.method5346();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5343();
		@Pc(255) int local255;
		for (local49 = 0; local49 < Static629.anInt10192; local49++) {
			local159 = Static660.anIntArray591[local49];
			if ((Static418.aByteArray58[local159] & 0x1) != 0) {
				if (local7 > 0) {
					Static418.aByteArray58[local159] = (byte) (Static418.aByteArray58[local159] | 0x2);
					local7--;
				} else {
					local255 = arg0.method5344(1);
					if (local255 == 0) {
						local7 = Static638.method8658(arg0);
						Static418.aByteArray58[local159] = (byte) (Static418.aByteArray58[local159] | 0x2);
					} else if (Static414.method6154(arg0, local159)) {
						Static418.aByteArray58[local159] = (byte) (Static418.aByteArray58[local159] | 0x2);
					}
				}
			}
		}
		arg0.method5346();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5343();
		for (local159 = 0; local159 < Static629.anInt10192; local159++) {
			local255 = Static660.anIntArray591[local159];
			if ((Static418.aByteArray58[local255] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static418.aByteArray58[local255] = (byte) (Static418.aByteArray58[local255] | 0x2);
				} else {
					@Pc(366) int local366 = arg0.method5344(1);
					if (local366 == 0) {
						local7 = Static638.method8658(arg0);
						Static418.aByteArray58[local255] = (byte) (Static418.aByteArray58[local255] | 0x2);
					} else if (Static414.method6154(arg0, local255)) {
						Static418.aByteArray58[local255] = (byte) (Static418.aByteArray58[local255] | 0x2);
					}
				}
			}
		}
		arg0.method5346();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static629.anInt10192 = 0;
		Static558.anInt9284 = 0;
		for (local255 = 1; local255 < 2048; local255++) {
			Static418.aByteArray58[local255] = (byte) (Static418.aByteArray58[local255] >> 1);
			@Pc(447) Class19_Sub1_Sub3_Sub2_Sub2 local447 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local255];
			if (local447 == null) {
				Static660.anIntArray591[Static629.anInt10192++] = local255;
			} else {
				Static408.anIntArray393[Static558.anInt9284++] = local255;
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZI)Z")
	public static boolean method5697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}

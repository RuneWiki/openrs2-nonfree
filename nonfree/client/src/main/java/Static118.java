import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
	public static int anInt2485 = -1;

	@OriginalMember(owner = "client!fq", name = "U", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_129 = new Class123(4, 1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!md;)V")
	public static void method2053(@OriginalArg(1) Class6_Sub1_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method3791();
		@Pc(18) int local18;
		@Pc(48) int local48;
		for (@Pc(12) int local12 = 0; local12 < Static95.anInt2186; local12++) {
			local18 = Static178.anIntArray542[local12];
			if ((Static356.aByteArray79[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static356.aByteArray79[local18] = (byte) (Static356.aByteArray79[local18] | 0x2);
				} else {
					local48 = arg0.method3803(1);
					if (local48 == 0) {
						local7 = Static119.method5701(arg0);
						Static356.aByteArray79[local18] = (byte) (Static356.aByteArray79[local18] | 0x2);
					} else {
						Static172.method2859(arg0, local18);
					}
				}
			}
		}
		arg0.method3801();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3791();
		@Pc(131) int local131;
		for (local18 = 0; local18 < Static95.anInt2186; local18++) {
			local48 = Static178.anIntArray542[local18];
			if ((Static356.aByteArray79[local48] & 0x1) != 0) {
				if (local7 > 0) {
					Static356.aByteArray79[local48] = (byte) (Static356.aByteArray79[local48] | 0x2);
					local7--;
				} else {
					local131 = arg0.method3803(1);
					if (local131 == 0) {
						local7 = Static119.method5701(arg0);
						Static356.aByteArray79[local48] = (byte) (Static356.aByteArray79[local48] | 0x2);
					} else {
						Static172.method2859(arg0, local48);
					}
				}
			}
		}
		arg0.method3801();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3791();
		@Pc(213) int local213;
		for (local48 = 0; local48 < Static276.anInt4962; local48++) {
			local131 = Static223.anIntArray294[local48];
			if ((Static356.aByteArray79[local131] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static356.aByteArray79[local131] = (byte) (Static356.aByteArray79[local131] | 0x2);
				} else {
					local213 = arg0.method3803(1);
					if (local213 == 0) {
						local7 = Static119.method5701(arg0);
						Static356.aByteArray79[local131] = (byte) (Static356.aByteArray79[local131] | 0x2);
					} else if (Static380.method5653(arg0, local131)) {
						Static356.aByteArray79[local131] = (byte) (Static356.aByteArray79[local131] | 0x2);
					}
				}
			}
		}
		arg0.method3801();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3791();
		for (local131 = 0; local131 < Static276.anInt4962; local131++) {
			local213 = Static223.anIntArray294[local131];
			if ((Static356.aByteArray79[local213] & 0x1) == 0) {
				if (local7 > 0) {
					Static356.aByteArray79[local213] = (byte) (Static356.aByteArray79[local213] | 0x2);
					local7--;
				} else {
					@Pc(306) int local306 = arg0.method3803(1);
					if (local306 == 0) {
						local7 = Static119.method5701(arg0);
						Static356.aByteArray79[local213] = (byte) (Static356.aByteArray79[local213] | 0x2);
					} else if (Static380.method5653(arg0, local213)) {
						Static356.aByteArray79[local213] = (byte) (Static356.aByteArray79[local213] | 0x2);
					}
				}
			}
		}
		arg0.method3801();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static95.anInt2186 = 0;
		Static276.anInt4962 = 0;
		for (local213 = 1; local213 < 2048; local213++) {
			Static356.aByteArray79[local213] = (byte) (Static356.aByteArray79[local213] >> 1);
			@Pc(380) Class3_Sub2_Sub1_Sub2 local380 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local213];
			if (local380 == null) {
				Static223.anIntArray294[Static276.anInt4962++] = local213;
			} else {
				Static178.anIntArray542[Static95.anInt2186++] = local213;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(B)V")
	public static void method2055() {
		if (Static217.anInt3941 == 10 || Static217.anInt3941 == 28) {
			Static93.method1659(Static157.anInt3220 >> 10, 5000, Static229.anInt4187 >> 10);
		} else {
			@Pc(25) int local25 = Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray458[0] >> 3;
			@Pc(32) int local32 = Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray459[0] >> 3;
			if (local25 >= 0 && Static181.anInt3574 >> 3 > local25 && local32 >= 0 && local32 < Static117.anInt2450 >> 3) {
				Static93.method1659(local25, 5000, local32);
			} else {
				Static93.method1659(Static181.anInt3574 >> 4, 0, Static117.anInt2450 >> 4);
			}
		}
		Static224.method3365();
		Static232.method3568();
		Static431.method6285();
		Static77.method1513();
	}
}

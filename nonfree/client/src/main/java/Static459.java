import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qha", name = "J", descriptor = "Lclient!cn;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!qha", name = "N", descriptor = "[I")
	public static final int[] anIntArray555 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!ua;)V")
	public static void method7169(@OriginalArg(1) Class2_Sub11_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method8407();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static71.anInt3990; local12++) {
			local18 = Static549.anIntArray643[local12];
			if ((Static143.aByteArray113[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static143.aByteArray113[local18] = (byte) (Static143.aByteArray113[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method8400(1);
					if (local46 == 0) {
						local7 = Static253.method8223(arg0);
						Static143.aByteArray113[local18] = (byte) (Static143.aByteArray113[local18] | 0x2);
					} else {
						Static632.method9172(local18, arg0);
					}
				}
			}
		}
		arg0.method8402();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method8407();
		@Pc(130) int local130;
		for (local18 = 0; local18 < Static71.anInt3990; local18++) {
			local46 = Static549.anIntArray643[local18];
			if ((Static143.aByteArray113[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static143.aByteArray113[local46] = (byte) (Static143.aByteArray113[local46] | 0x2);
					local7--;
				} else {
					local130 = arg0.method8400(1);
					if (local130 == 0) {
						local7 = Static253.method8223(arg0);
						Static143.aByteArray113[local46] = (byte) (Static143.aByteArray113[local46] | 0x2);
					} else {
						Static632.method9172(local46, arg0);
					}
				}
			}
		}
		arg0.method8402();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method8407();
		@Pc(208) int local208;
		for (local46 = 0; local46 < Static329.anInt6646; local46++) {
			local130 = Static274.anIntArray338[local46];
			if ((Static143.aByteArray113[local130] & 0x1) != 0) {
				if (local7 > 0) {
					Static143.aByteArray113[local130] = (byte) (Static143.aByteArray113[local130] | 0x2);
					local7--;
				} else {
					local208 = arg0.method8400(1);
					if (local208 == 0) {
						local7 = Static253.method8223(arg0);
						Static143.aByteArray113[local130] = (byte) (Static143.aByteArray113[local130] | 0x2);
					} else if (Static495.method7668(local130, arg0)) {
						Static143.aByteArray113[local130] = (byte) (Static143.aByteArray113[local130] | 0x2);
					}
				}
			}
		}
		arg0.method8402();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method8407();
		for (local130 = 0; local130 < Static329.anInt6646; local130++) {
			local208 = Static274.anIntArray338[local130];
			if ((Static143.aByteArray113[local208] & 0x1) == 0) {
				if (local7 > 0) {
					Static143.aByteArray113[local208] = (byte) (Static143.aByteArray113[local208] | 0x2);
					local7--;
				} else {
					@Pc(299) int local299 = arg0.method8400(1);
					if (local299 == 0) {
						local7 = Static253.method8223(arg0);
						Static143.aByteArray113[local208] = (byte) (Static143.aByteArray113[local208] | 0x2);
					} else if (Static495.method7668(local208, arg0)) {
						Static143.aByteArray113[local208] = (byte) (Static143.aByteArray113[local208] | 0x2);
					}
				}
			}
		}
		arg0.method8402();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static71.anInt3990 = 0;
		Static329.anInt6646 = 0;
		for (local208 = 1; local208 < 2048; local208++) {
			Static143.aByteArray113[local208] = (byte) (Static143.aByteArray113[local208] >> 1);
			@Pc(374) Class3_Sub1_Sub3_Sub3_Sub2 local374 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local208];
			if (local374 == null) {
				Static274.anIntArray338[Static329.anInt6646++] = local208;
			} else {
				Static549.anIntArray643[Static71.anInt3990++] = local208;
			}
		}
	}
}

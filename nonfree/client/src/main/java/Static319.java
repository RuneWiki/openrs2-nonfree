import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
	public static int anInt6113;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_52 = new Class208(32, 7);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V")
	public static void method5323(@OriginalArg(0) int arg0) {
		if (Static155.anInt2829 == 1) {
			Static28.anInt5437 = arg0;
		} else if (Static155.anInt2829 == 2) {
			Static576.anInt4602 = arg0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!vt;I)V")
	public static void method5324(@OriginalArg(0) Class6_Sub40_Sub2 arg0) {
		arg0.method8618();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static530.anInt8592; local12++) {
			local18 = Static551.anIntArray576[local12];
			if ((Static431.aByteArray89[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static431.aByteArray89[local18] = (byte) (Static431.aByteArray89[local18] | 0x2);
				} else {
					local43 = arg0.method8619(1);
					if (local43 == 0) {
						local10 = Static193.method3445(arg0);
						Static431.aByteArray89[local18] = (byte) (Static431.aByteArray89[local18] | 0x2);
					} else {
						Static104.method1718(local18, arg0);
					}
				}
			}
		}
		arg0.method8631();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method8618();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static530.anInt8592; local18++) {
			local43 = Static551.anIntArray576[local18];
			if ((Static431.aByteArray89[local43] & 0x1) != 0) {
				if (local10 > 0) {
					Static431.aByteArray89[local43] = (byte) (Static431.aByteArray89[local43] | 0x2);
					local10--;
				} else {
					local124 = arg0.method8619(1);
					if (local124 == 0) {
						local10 = Static193.method3445(arg0);
						Static431.aByteArray89[local43] = (byte) (Static431.aByteArray89[local43] | 0x2);
					} else {
						Static104.method1718(local43, arg0);
					}
				}
			}
		}
		arg0.method8631();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method8618();
		@Pc(198) int local198;
		for (local43 = 0; local43 < Static203.anInt4060; local43++) {
			local124 = Static18.anIntArray12[local43];
			if ((Static431.aByteArray89[local124] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static431.aByteArray89[local124] = (byte) (Static431.aByteArray89[local124] | 0x2);
				} else {
					local198 = arg0.method8619(1);
					if (local198 == 0) {
						local10 = Static193.method3445(arg0);
						Static431.aByteArray89[local124] = (byte) (Static431.aByteArray89[local124] | 0x2);
					} else if (Static123.method2042(arg0, local124)) {
						Static431.aByteArray89[local124] = (byte) (Static431.aByteArray89[local124] | 0x2);
					}
				}
			}
		}
		arg0.method8631();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method8618();
		for (local124 = 0; local124 < Static203.anInt4060; local124++) {
			local198 = Static18.anIntArray12[local124];
			if ((Static431.aByteArray89[local198] & 0x1) == 0) {
				if (local10 > 0) {
					Static431.aByteArray89[local198] = (byte) (Static431.aByteArray89[local198] | 0x2);
					local10--;
				} else {
					@Pc(292) int local292 = arg0.method8619(1);
					if (local292 == 0) {
						local10 = Static193.method3445(arg0);
						Static431.aByteArray89[local198] = (byte) (Static431.aByteArray89[local198] | 0x2);
					} else if (Static123.method2042(arg0, local198)) {
						Static431.aByteArray89[local198] = (byte) (Static431.aByteArray89[local198] | 0x2);
					}
				}
			}
		}
		arg0.method8631();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static530.anInt8592 = 0;
		Static203.anInt4060 = 0;
		for (local198 = 1; local198 < 2048; local198++) {
			Static431.aByteArray89[local198] = (byte) (Static431.aByteArray89[local198] >> 1);
			@Pc(364) Class20_Sub2_Sub2_Sub1_Sub1 local364 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local198];
			if (local364 == null) {
				Static18.anIntArray12[Static203.anInt4060++] = local198;
			} else {
				Static551.anIntArray576[Static530.anInt8592++] = local198;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "[Lclient!jia;")
	public static Class28_Sub3_Sub1_Sub1[] aClass28_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_10 = new Class300(4);

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
	public static int anInt2650 = 0;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2374(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static253.anInt4604; local9++) {
			if (arg0.equalsIgnoreCase(Static326.aStringArray31[local9])) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!tia;)V")
	public static void method2375(@OriginalArg(1) Class5_Sub41_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method7869();
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static105.anInt2258; local12++) {
			local18 = Static321.anIntArray339[local12];
			if ((Static199.aByteArray29[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static199.aByteArray29[local18] = (byte) (Static199.aByteArray29[local18] | 0x2);
					local7--;
				} else {
					local49 = arg0.method7871(1);
					if (local49 == 0) {
						local7 = Static524.method7413(arg0);
						Static199.aByteArray29[local18] = (byte) (Static199.aByteArray29[local18] | 0x2);
					} else {
						Static93.method1914(local18, arg0);
					}
				}
			}
		}
		arg0.method7878();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method7869();
		@Pc(130) int local130;
		for (local18 = 0; local18 < Static105.anInt2258; local18++) {
			local49 = Static321.anIntArray339[local18];
			if ((Static199.aByteArray29[local49] & 0x1) != 0) {
				if (local7 > 0) {
					Static199.aByteArray29[local49] = (byte) (Static199.aByteArray29[local49] | 0x2);
					local7--;
				} else {
					local130 = arg0.method7871(1);
					if (local130 == 0) {
						local7 = Static524.method7413(arg0);
						Static199.aByteArray29[local49] = (byte) (Static199.aByteArray29[local49] | 0x2);
					} else {
						Static93.method1914(local49, arg0);
					}
				}
			}
		}
		arg0.method7878();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method7869();
		@Pc(213) int local213;
		for (local49 = 0; local49 < Static139.anInt2696; local49++) {
			local130 = Static442.anIntArray431[local49];
			if ((Static199.aByteArray29[local130] & 0x1) != 0) {
				if (local7 > 0) {
					Static199.aByteArray29[local130] = (byte) (Static199.aByteArray29[local130] | 0x2);
					local7--;
				} else {
					local213 = arg0.method7871(1);
					if (local213 == 0) {
						local7 = Static524.method7413(arg0);
						Static199.aByteArray29[local130] = (byte) (Static199.aByteArray29[local130] | 0x2);
					} else if (Static591.method8114(arg0, local130)) {
						Static199.aByteArray29[local130] = (byte) (Static199.aByteArray29[local130] | 0x2);
					}
				}
			}
		}
		arg0.method7878();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method7869();
		for (local130 = 0; local130 < Static139.anInt2696; local130++) {
			local213 = Static442.anIntArray431[local130];
			if ((Static199.aByteArray29[local213] & 0x1) == 0) {
				if (local7 > 0) {
					Static199.aByteArray29[local213] = (byte) (Static199.aByteArray29[local213] | 0x2);
					local7--;
				} else {
					@Pc(305) int local305 = arg0.method7871(1);
					if (local305 == 0) {
						local7 = Static524.method7413(arg0);
						Static199.aByteArray29[local213] = (byte) (Static199.aByteArray29[local213] | 0x2);
					} else if (Static591.method8114(arg0, local213)) {
						Static199.aByteArray29[local213] = (byte) (Static199.aByteArray29[local213] | 0x2);
					}
				}
			}
		}
		arg0.method7878();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static105.anInt2258 = 0;
		Static139.anInt2696 = 0;
		for (local213 = 1; local213 < 2048; local213++) {
			Static199.aByteArray29[local213] = (byte) (Static199.aByteArray29[local213] >> 1);
			@Pc(377) Class28_Sub1_Sub4_Sub2_Sub2 local377 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local213];
			if (local377 == null) {
				Static442.anIntArray431[Static139.anInt2696++] = local213;
			} else {
				Static321.anIntArray339[Static105.anInt2258++] = local213;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_64 = new Class145(18, 8);

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_65 = new Class145(8, 7);

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIII)V")
	public static void method3610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static372.aByteArrayArrayArray3 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Z")
	public static boolean method3611() {
		@Pc(5) boolean local5 = true;
		if (Static274.aClass139_4 == null) {
			if (Static497.aClass238_223.method5568(Static441.anInt7237)) {
				Static274.aClass139_4 = Static654.method3450(Static497.aClass238_223, Static441.anInt7237);
			} else {
				local5 = false;
			}
		}
		if (Static221.aClass139_3 == null) {
			if (Static497.aClass238_223.method5568(Static247.anInt4759)) {
				Static221.aClass139_3 = Static654.method3450(Static497.aClass238_223, Static247.anInt4759);
			} else {
				local5 = false;
			}
		}
		if (Static513.aClass139_7 == null) {
			if (Static497.aClass238_223.method5568(Static82.anInt2148)) {
				Static513.aClass139_7 = Static654.method3450(Static497.aClass238_223, Static82.anInt2148);
			} else {
				local5 = false;
			}
		}
		if (Static307.aClass183_8 == null) {
			if (Static419.aClass238_210.method5568(Static79.anInt2089)) {
				Static307.aClass183_8 = Static427.method6221(Static79.anInt2089, Static419.aClass238_210);
			} else {
				local5 = false;
			}
		}
		if (Static121.aClass139Array1 == null) {
			if (Static497.aClass238_223.method5568(Static79.anInt2089)) {
				Static121.aClass139Array1 = Static654.method3454(Static497.aClass238_223, Static79.anInt2089);
			} else {
				local5 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Z")
	public static boolean method3612(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLclient!ei;)V")
	public static void method3614(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		arg0.method2461();
		@Pc(8) int local8 = 0;
		@Pc(15) int local15;
		@Pc(47) int local47;
		for (@Pc(10) int local10 = 0; local10 < Static649.anInt10495; local10++) {
			local15 = Static426.anIntArray476[local10];
			if ((Static306.aByteArray45[local15] & 0x1) == 0) {
				if (local8 > 0) {
					local8--;
					Static306.aByteArray45[local15] = (byte) (Static306.aByteArray45[local15] | 0x2);
				} else {
					local47 = arg0.method2456(1);
					if (local47 == 0) {
						local8 = Static274.method4470(arg0);
						Static306.aByteArray45[local15] = (byte) (Static306.aByteArray45[local15] | 0x2);
					} else {
						Static639.method8762(arg0, local15);
					}
				}
			}
		}
		arg0.method2455();
		if (local8 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2461();
		@Pc(125) int local125;
		for (local15 = 0; local15 < Static649.anInt10495; local15++) {
			local47 = Static426.anIntArray476[local15];
			if ((Static306.aByteArray45[local47] & 0x1) != 0) {
				if (local8 > 0) {
					local8--;
					Static306.aByteArray45[local47] = (byte) (Static306.aByteArray45[local47] | 0x2);
				} else {
					local125 = arg0.method2456(1);
					if (local125 == 0) {
						local8 = Static274.method4470(arg0);
						Static306.aByteArray45[local47] = (byte) (Static306.aByteArray45[local47] | 0x2);
					} else {
						Static639.method8762(arg0, local47);
					}
				}
			}
		}
		arg0.method2455();
		if (local8 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2461();
		@Pc(206) int local206;
		for (local47 = 0; local47 < Static277.anInt5108; local47++) {
			local125 = Static292.anIntArray335[local47];
			if ((Static306.aByteArray45[local125] & 0x1) != 0) {
				if (local8 > 0) {
					Static306.aByteArray45[local125] = (byte) (Static306.aByteArray45[local125] | 0x2);
					local8--;
				} else {
					local206 = arg0.method2456(1);
					if (local206 == 0) {
						local8 = Static274.method4470(arg0);
						Static306.aByteArray45[local125] = (byte) (Static306.aByteArray45[local125] | 0x2);
					} else if (Static234.method3744(local125, arg0)) {
						Static306.aByteArray45[local125] = (byte) (Static306.aByteArray45[local125] | 0x2);
					}
				}
			}
		}
		arg0.method2455();
		if (local8 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2461();
		for (local125 = 0; local125 < Static277.anInt5108; local125++) {
			local206 = Static292.anIntArray335[local125];
			if ((Static306.aByteArray45[local206] & 0x1) == 0) {
				if (local8 > 0) {
					Static306.aByteArray45[local206] = (byte) (Static306.aByteArray45[local206] | 0x2);
					local8--;
				} else {
					@Pc(287) int local287 = arg0.method2456(1);
					if (local287 == 0) {
						local8 = Static274.method4470(arg0);
						Static306.aByteArray45[local206] = (byte) (Static306.aByteArray45[local206] | 0x2);
					} else if (Static234.method3744(local206, arg0)) {
						Static306.aByteArray45[local206] = (byte) (Static306.aByteArray45[local206] | 0x2);
					}
				}
			}
		}
		arg0.method2455();
		if (local8 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static277.anInt5108 = 0;
		Static649.anInt10495 = 0;
		for (local206 = 1; local206 < 2048; local206++) {
			Static306.aByteArray45[local206] = (byte) (Static306.aByteArray45[local206] >> 1);
			@Pc(354) Class16_Sub1_Sub1_Sub3_Sub2 local354 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local206];
			if (local354 == null) {
				Static292.anIntArray335[Static277.anInt5108++] = local206;
			} else {
				Static426.anIntArray476[Static649.anInt10495++] = local206;
			}
		}
	}
}

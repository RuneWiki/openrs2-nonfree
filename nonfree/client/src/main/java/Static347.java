import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
	public static final int anInt5971 = 52;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)Lclient!kga;")
	public static Class12_Sub2_Sub2 method5019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null || local7.aClass12_Sub2_Sub2_1 == null ? null : local7.aClass12_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!ps;BI)Ljava/lang/String;")
	public static String method5020(@OriginalArg(0) Class273 arg0, @OriginalArg(2) int arg1) {
		if (!Static70.method1164(arg0).method2771(arg1) && arg0.anObjectArray10 == null) {
			return null;
		} else if (arg0.aStringArray34 == null || arg1 >= arg0.aStringArray34.length || arg0.aStringArray34[arg1] == null || arg0.aStringArray34[arg1].trim().length() == 0) {
			return Static440.aBoolean582 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray34[arg1];
		}
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(III)Z")
	public static boolean method5021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static131.method1767(arg1, arg0) | Static19.method290(arg0, arg1) | Static23.method329(arg0, arg1)) & Static154.method2106(arg1, arg0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLclient!lr;)V")
	public static void method5022(@OriginalArg(1) Class2_Sub7_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4530();
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static84.anInt9548; local12++) {
			local18 = Static520.anIntArray555[local12];
			if ((Static440.aByteArray67[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static440.aByteArray67[local18] = (byte) (Static440.aByteArray67[local18] | 0x2);
				} else {
					local43 = arg0.method4535(1);
					if (local43 == 0) {
						local7 = Static46.method820(arg0);
						Static440.aByteArray67[local18] = (byte) (Static440.aByteArray67[local18] | 0x2);
					} else {
						Static484.method6234(arg0, local18);
					}
				}
			}
		}
		arg0.method4524();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4530();
		@Pc(122) int local122;
		for (local18 = 0; local18 < Static84.anInt9548; local18++) {
			local43 = Static520.anIntArray555[local18];
			if ((Static440.aByteArray67[local43] & 0x1) != 0) {
				if (local7 > 0) {
					Static440.aByteArray67[local43] = (byte) (Static440.aByteArray67[local43] | 0x2);
					local7--;
				} else {
					local122 = arg0.method4535(1);
					if (local122 == 0) {
						local7 = Static46.method820(arg0);
						Static440.aByteArray67[local43] = (byte) (Static440.aByteArray67[local43] | 0x2);
					} else {
						Static484.method6234(arg0, local43);
					}
				}
			}
		}
		arg0.method4524();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4530();
		@Pc(206) int local206;
		for (local43 = 0; local43 < Static235.anInt3892; local43++) {
			local122 = Static295.anIntArray338[local43];
			if ((Static440.aByteArray67[local122] & 0x1) != 0) {
				if (local7 > 0) {
					Static440.aByteArray67[local122] = (byte) (Static440.aByteArray67[local122] | 0x2);
					local7--;
				} else {
					local206 = arg0.method4535(1);
					if (local206 == 0) {
						local7 = Static46.method820(arg0);
						Static440.aByteArray67[local122] = (byte) (Static440.aByteArray67[local122] | 0x2);
					} else if (Static42.method726(arg0, local122)) {
						Static440.aByteArray67[local122] = (byte) (Static440.aByteArray67[local122] | 0x2);
					}
				}
			}
		}
		arg0.method4524();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4530();
		for (local122 = 0; local122 < Static235.anInt3892; local122++) {
			local206 = Static295.anIntArray338[local122];
			if ((Static440.aByteArray67[local206] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static440.aByteArray67[local206] = (byte) (Static440.aByteArray67[local206] | 0x2);
				} else {
					@Pc(290) int local290 = arg0.method4535(1);
					if (local290 == 0) {
						local7 = Static46.method820(arg0);
						Static440.aByteArray67[local206] = (byte) (Static440.aByteArray67[local206] | 0x2);
					} else if (Static42.method726(arg0, local206)) {
						Static440.aByteArray67[local206] = (byte) (Static440.aByteArray67[local206] | 0x2);
					}
				}
			}
		}
		arg0.method4524();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static235.anInt3892 = 0;
		Static84.anInt9548 = 0;
		for (local206 = 1; local206 < 2048; local206++) {
			Static440.aByteArray67[local206] = (byte) (Static440.aByteArray67[local206] >> 1);
			@Pc(367) Class12_Sub2_Sub1_Sub4_Sub1 local367 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local206];
			if (local367 == null) {
				Static295.anIntArray338[Static235.anInt3892++] = local206;
			} else {
				Static520.anIntArray555[Static84.anInt9548++] = local206;
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!rg;IIIII)V")
	public static void method5023(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub2_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		Static448.method1155(0, arg2, arg1.aByte128, arg3, arg0, arg1.anInt9374, arg1.anInt9375);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIZI)V")
	public static void method5024(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static48.anInt898 = arg1;
		Static89.anInt1576 = arg0;
		Static130.anInt2131 = 0;
		Static275.anInt4756 = 0;
	}
}

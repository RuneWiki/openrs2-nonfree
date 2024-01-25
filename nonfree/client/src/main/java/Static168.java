import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
	public static int anInt3222;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	public static int anInt3226 = 1;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "[I")
	public static final int[] anIntArray641 = new int[1000];

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
	public static final int anInt3227 = 12;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class4 local14 = Static164.method2913(arg3, arg0);
		if (local14 == null) {
			return;
		}
		if (local14.anObjectArray27 != null) {
			@Pc(24) Class2_Sub22 local24 = new Class2_Sub22();
			local24.anInt2770 = arg2;
			local24.anObjectArray33 = local14.anObjectArray27;
			local24.aClass4_15 = local14;
			local24.aString28 = arg1;
			Static256.method4003(local24);
		}
		@Pc(41) boolean local41 = true;
		if (local14.anInt133 != 0) {
			local41 = Static184.method3166(local14);
		}
		if (!local41 || !Static45.method784(local14).method634(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static216.method3597(Static203.aClass11_63);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 2) {
			Static216.method3597(Static206.aClass11_64);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 3) {
			Static216.method3597(Static251.aClass11_70);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 4) {
			Static216.method3597(Static44.aClass11_13);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 5) {
			Static216.method3597(Static369.aClass11_91);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 6) {
			Static216.method3597(Static364.aClass11_88);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 7) {
			Static216.method3597(Static132.aClass11_46);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 8) {
			Static216.method3597(Static353.aClass11_86);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 9) {
			Static216.method3597(Static323.aClass11_82);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
		if (arg2 == 10) {
			Static216.method3597(Static335.aClass11_84);
			Static164.method2914(arg0, arg3, local14.anInt58);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIZLclient!ml;Lclient!ml;I)I")
	public static int method2961(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class138_Sub1 arg4, @OriginalArg(5) Class138_Sub1 arg5) {
		@Pc(17) int local17 = Static131.method2587(arg2, arg4, arg3, arg5);
		if (local17 != 0) {
			return arg3 ? -local17 : local17;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(41) int local41 = Static131.method2587(arg0, arg4, arg1, arg5);
			return arg1 ? -local41 : local41;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)Z")
	public static boolean method2962(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static119.anInt2585; local1 < Static12.anInt311; local1++) {
			@Pc(6) Class251[][] local6 = Static64.aClass251ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static309.anInt5190; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static322.anInt5531 + local9;
				@Pc(18) int local18 = Static322.anInt5531 - local9;
				if (local14 >= Static351.anInt6590 || local18 < Static292.anInt5075) {
					for (@Pc(27) int local27 = -Static309.anInt5190; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static314.anInt5359 + local27;
						@Pc(36) int local36 = Static314.anInt5359 - local27;
						@Pc(48) Class251 local48;
						if (local14 >= Static351.anInt6590) {
							if (local32 >= client.lb) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean475) {
									Static144.aBoolean214 = arg0;
									Static305.aClass29_1.method4191(local48);
									Static305.aClass29_1.method4188();
								}
							}
							if (local36 < Static333.anInt5691) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean475) {
									Static144.aBoolean214 = arg0;
									Static305.aClass29_1.method4191(local48);
									Static305.aClass29_1.method4188();
								}
							}
						}
						if (local18 < Static292.anInt5075) {
							if (local32 >= client.lb) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean475) {
									Static144.aBoolean214 = arg0;
									Static305.aClass29_1.method4191(local48);
									Static305.aClass29_1.method4188();
								}
							}
							if (local36 < Static333.anInt5691) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean475) {
									Static144.aBoolean214 = arg0;
									Static305.aClass29_1.method4191(local48);
									Static305.aClass29_1.method4188();
								}
							}
						}
						if (Static24.anInt527 == 0) {
							if (Static31.aBoolean56) {
								Static305.aClass29_1.method4194(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!nl;B)V")
	public static void method2963(@OriginalArg(0) Class171 arg0) {
		Static289.anInt5021 = 0;
		Static319.anInt5426 = 0;
		Static71.aClass154_2 = new Class154();
		Static299.aClass10_Sub8_Sub1_Sub1Array2 = new Class10_Sub8_Sub1_Sub1[1024];
		Static350.method3442(arg0);
		Static223.method3674(arg0);
	}
}

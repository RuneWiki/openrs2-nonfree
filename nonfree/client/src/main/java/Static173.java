import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	public static int anInt3204;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_75 = new Class7("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
	public static int anInt3208 = 100;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLclient!hp;)V")
	public static void method2780(@OriginalArg(1) Class1_Sub5 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static210.anInt3953; local7++) {
			@Pc(13) int local13 = arg0.method5361();
			@Pc(17) int local17 = arg0.method5362();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static444.aClass91_Sub1Array2[local13] != null) {
				Static444.aClass91_Sub1Array2[local13].anInt2654 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!js;I[[B)V")
	public static void method2781(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt3467; local14++) {
			Static435.method5771();
			for (@Pc(22) int local22 = 0; local22 < Static195.anInt3537 >> 3; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static118.anInt2419 >> 3; local26++) {
					@Pc(30) boolean local30 = false;
					@Pc(38) int local38 = Static411.anIntArrayArrayArray14[local14][local22][local26];
					if (local38 != -1) {
						@Pc(47) int local47 = local38 >> 24 & 0x3;
						if (!arg0.aBoolean210 || local47 == 0) {
							@Pc(58) int local58 = local38 >> 1 & 0x3;
							@Pc(64) int local64 = local38 >> 14 & 0x3FF;
							@Pc(70) int local70 = local38 >> 3 & 0x7FF;
							@Pc(81) int local81 = (local64 / 8 << 8) + (local70 / 8);
							for (@Pc(83) int local83 = 0; local83 < Static266.anIntArray627.length; local83++) {
								if (Static266.anIntArray627[local83] == local81 && arg1[local83] != null) {
									@Pc(105) Class1_Sub5 local105 = new Class1_Sub5(arg1[local83]);
									arg0.method2993(local47, Static125.aClass188Array1, local70, local105, local22 * 8, local64, local26 * 8, local58, local14);
									arg0.method3008(local14, local47, local105, local64, local22 * 8, local12[0] == -1 ? local12 : null, Static415.aClass39_11, local58, local70, local26 * 8);
									local30 = true;
									break;
								}
							}
						}
					}
					if (!local30) {
						arg0.method3002(8, 8, local22 * 8, local26 * 8, local14);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static432.aClass171_1 = Static303.aClass161_1.method3748(Static117.aClass142_1, local12[3], local12[2], local12[1], local12[0]);
			Static422.anInt6824 = local12[4];
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2782(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static459.method4507(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static313.anInt5409; local23++) {
			@Pc(33) String local33 = Static22.aStringArray6[local23];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static459.method4507(local33);
			if (local33 != null && local33.equals(local18)) {
				Static313.anInt5409--;
				for (@Pc(57) int local57 = local23; local57 < Static313.anInt5409; local57++) {
					Static22.aStringArray6[local57] = Static22.aStringArray6[local57 + 1];
					Static172.aStringArray22[local57] = Static172.aStringArray22[local57 + 1];
					Static83.anIntArray147[local57] = Static83.anIntArray147[local57 + 1];
					Static356.aStringArray38[local57] = Static356.aStringArray38[local57 + 1];
					Static75.anIntArray128[local57] = Static75.anIntArray128[local57 + 1];
					Static386.aBooleanArray45[local57] = Static386.aBooleanArray45[local57 + 1];
				}
				Static254.anInt4601 = Static319.anInt4221;
				Static193.method2984(Static132.aClass179_27);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(arg0));
				Static92.aClass1_Sub5_Sub1_1.method5385(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public static void method2783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub2_Sub6 local10 = Static371.method5808(15, 0);
		local10.method1778();
		local10.anInt2056 = arg0;
		local10.anInt2055 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)Lclient!hf;")
	public static Class102 method2785(@OriginalArg(1) int arg0) {
		@Pc(15) Class102 local15 = (Class102) Static308.aClass134_41.method3266((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static12.aClass246_14.method5477(1, arg0);
		local15 = new Class102();
		local15.anInt2796 = arg0;
		if (local25 != null) {
			local15.method2400(new Class1_Sub5(local25));
		}
		local15.method2401();
		if (local15.anInt2791 == 2 && Static30.aClass96_9.method2335((long) arg0) == null) {
			Static30.aClass96_9.method2341((long) arg0, new Class1_Sub43(Static293.anInt5128));
			Static361.aClass102Array1[Static293.anInt5128++] = local15;
		}
		Static308.aClass134_41.method3263((long) arg0, local15);
		return local15;
	}
}

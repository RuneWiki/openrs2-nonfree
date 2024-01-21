import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_613 = Static146.method2172("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!hb", name = "jb", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!hb", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_614 = Static146.method2172("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!hb", name = "nb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_615 = Static146.method2172("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!hb", name = "rb", descriptor = "I")
	public static int anInt1574 = 0;

	@OriginalMember(owner = "client!hb", name = "sb", descriptor = "[I")
	public static int[] anIntArray239 = new int[50];

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
	public static void method1093() {
		Static81.aClass82_34.method2698();
		Static111.aClass82_43.method2698();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!vg;IB)V")
	public static void method1094(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub6_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt4399 == arg0 && arg0 != -1) {
			@Pc(57) int local57 = Static140.method2333(arg0).anInt3724;
			if (local57 == 1) {
				arg1.anInt4408 = 0;
				arg1.anInt4394 = 0;
				arg1.anInt4406 = 0;
				arg1.anInt4376 = arg2;
			}
			if (local57 == 2) {
				arg1.anInt4408 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4399 == -1 || Static140.method2333(arg0).anInt3730 >= Static140.method2333(arg1.anInt4399).anInt3730) {
			arg1.anInt4399 = arg0;
			arg1.anInt4376 = arg2;
			arg1.anInt4406 = 0;
			arg1.anInt4408 = 0;
			arg1.anInt4394 = 0;
			arg1.anInt4421 = arg1.anInt4403;
		}
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)V")
	public static void method1095() {
		aClass77_613 = null;
		aClass77_615 = null;
		aBooleanArray6 = null;
		aClass77_614 = null;
		anIntArray239 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!sg;IZ)V")
	public static void method1096(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		Static124.aClass2_Sub18_Sub1_3.method2398(237);
		Static124.aClass2_Sub18_Sub1_3.method2393(arg0.method2531());
		Static124.aClass2_Sub18_Sub1_3.method2388(arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method1097() {
		Static180.aClass82_65.method2698();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)V")
	public static void method1098(@OriginalArg(0) boolean arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static145.anInt3533; local9++) {
			@Pc(16) Class2_Sub2_Sub1_Sub6_Sub2 local16 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[Static160.anIntArray643[local9]];
			@Pc(24) int local24 = (Static160.anIntArray643[local9] << 14) + 536870912;
			if (local16 != null && local16.method2916() && local16.aClass2_Sub2_Sub16_1.aBoolean156 == arg0 && local16.aClass2_Sub2_Sub16_1.method2611()) {
				@Pc(49) int local49 = local16.anInt4385 >> 7;
				@Pc(54) int local54 = local16.anInt4400 >> 7;
				if (local54 >= 0 && local54 < 104 && local49 >= 0 && local49 < 104) {
					if (local16.anInt4409 == 1 && (local16.anInt4400 & 0x7F) == 64 && (local16.anInt4385 & 0x7F) == 64) {
						if (Static128.anInt3108 == Static105.anIntArrayArray20[local54][local49]) {
							continue;
						}
						Static105.anIntArrayArray20[local54][local49] = Static128.anInt3108;
					}
					if (!local16.aClass2_Sub2_Sub16_1.aBoolean155) {
						local24 += Integer.MIN_VALUE;
					}
					Static172.aClass60_1.method2091(Static54.anInt1472, local16.anInt4400, local16.anInt4385, Static161.method2725(local16.anInt4409 * 64 + local16.anInt4400 - 64, Static54.anInt1472, (local16.anInt4409 - 1) * 64 + local16.anInt4385), (local16.anInt4409 - 1) * 64 + 60, local16, local16.anInt4415, local24, local16.aBoolean180);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
	public static void method1100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = 2048 - arg0 & 0x7FF;
		@Pc(20) int local20 = arg4;
		@Pc(27) int local27 = 2048 - arg3 & 0x7FF;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(51) int local51;
		if (local27 != 0) {
			local36 = Class2_Sub2_Sub3_Sub1.anIntArray50[local27];
			local40 = Class2_Sub2_Sub3_Sub1.anIntArray52[local27];
			local51 = local40 * 0 - local36 * arg4 >> 16;
			local20 = local36 * 0 + local40 * arg4 >> 16;
			local5 = local51;
		}
		if (local14 != 0) {
			local36 = Class2_Sub2_Sub3_Sub1.anIntArray50[local14];
			local40 = Class2_Sub2_Sub3_Sub1.anIntArray52[local14];
			local51 = local36 * local20 + local40 * 0 >> 16;
			local20 = local40 * local20 - local36 * 0 >> 16;
			local7 = local51;
		}
		Static155.anInt3844 = arg0;
		Static160.anInt4578 = arg1 - local5;
		Static7.anInt215 = arg2 - local7;
		Static121.anInt2979 = arg5 - local20;
		Static130.anInt3165 = arg3;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!ke;Lclient!ke;)Lclient!hg;")
	public static Class2_Sub2_Sub3_Sub4_Sub1 method1101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) Class43 arg3) {
		return Static152.method2595(arg1, arg0, arg3) ? Static11.method178(arg2.method2205(arg0, arg1)) : null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
	public static void method1102() {
		Static170.aByteArrayArray10 = null;
		Static178.anIntArray637 = null;
		Static37.anIntArray175 = null;
		Static160.anIntArray642 = null;
		Static173.anIntArray623 = null;
		Static2.anIntArray15 = null;
	}
}

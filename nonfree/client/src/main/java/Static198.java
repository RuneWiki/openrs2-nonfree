import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!og", name = "kb", descriptor = "Lclient!ib;")
	public static Class4_Sub3_Sub10 aClass4_Sub3_Sub10_6;

	@OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
	public static int anInt5852;

	@OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
	public static int anInt5844 = 50;

	@OriginalMember(owner = "client!og", name = "db", descriptor = "F")
	public static float aFloat147 = 128.0F;

	@OriginalMember(owner = "client!og", name = "gb", descriptor = "[J")
	public static long[] aLongArray57 = new long[1000];

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)Lclient!ro;")
	public static Class4_Sub3_Sub17 method4740(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub17 local6 = (Class4_Sub3_Sub17) Static98.aClass40_10.method889((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static63.aClass58_36.method1372(26, arg0);
		local6 = new Class4_Sub3_Sub17();
		if (local21 != null) {
			local6.method3838(new Class4_Sub10(local21));
		}
		Static98.aClass40_10.method888((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
	public static void method4741() {
		for (@Pc(3) int local3 = 0; local3 < Static237.anInt4458; local3++) {
			@Pc(10) int local10 = Static124.anIntArray217[local3]--;
			if (Static124.anIntArray217[local3] >= -10) {
				@Pc(89) Class7 local89 = Static169.aClass7Array1[local3];
				if (local89 == null) {
					local89 = Static317.method106(Static258.aClass58_92, Static157.anIntArray294[local3], 0);
					if (local89 == null) {
						continue;
					}
					Static124.anIntArray217[local3] += local89.method105();
					Static169.aClass7Array1[local3] = local89;
				}
				if (Static124.anIntArray217[local3] < 0) {
					@Pc(223) int local223;
					if (Static282.anIntArray601[local3] == 0) {
						local223 = Static10.anIntArray21[local3] * Static171.anInt3315 >> 8;
					} else {
						@Pc(137) int local137 = (Static282.anIntArray601[local3] & 0xFF) * 128;
						@Pc(145) int local145 = Static282.anIntArray601[local3] >> 16 & 0xFF;
						@Pc(155) int local155 = local145 * 128 + 64 - Static154.aClass53_Sub1_Sub1_2.anInt3974;
						if (local155 < 0) {
							local155 = -local155;
						}
						@Pc(171) int local171 = Static282.anIntArray601[local3] >> 8 & 0xFF;
						@Pc(181) int local181 = local171 * 128 + 64 - Static154.aClass53_Sub1_Sub1_2.anInt4002;
						if (local181 < 0) {
							local181 = -local181;
						}
						@Pc(192) int local192 = local181 + local155 - 128;
						if (local137 < local192) {
							Static124.anIntArray217[local3] = -100;
							continue;
						}
						if (local192 < 0) {
							local192 = 0;
						}
						local223 = (local137 - local192) * Static208.anInt4120 * Static10.anIntArray21[local3] / local137 >> 8;
					}
					if (local223 > 0) {
						@Pc(240) Class4_Sub8_Sub1 local240 = local89.method107().method3351(Static297.aClass173_1);
						@Pc(245) Class4_Sub6_Sub4 local245 = Static322.method3398(local240, local223);
						local245.method3372(Static298.anIntArray629[local3] - 1);
						Static211.aClass4_Sub6_Sub3_2.method2687(local245);
					}
					Static124.anIntArray217[local3] = -100;
				}
			} else {
				Static237.anInt4458--;
				for (@Pc(24) int local24 = local3; local24 < Static237.anInt4458; local24++) {
					Static157.anIntArray294[local24] = Static157.anIntArray294[local24 + 1];
					Static169.aClass7Array1[local24] = Static169.aClass7Array1[local24 + 1];
					Static298.anIntArray629[local24] = Static298.anIntArray629[local24 + 1];
					Static124.anIntArray217[local24] = Static124.anIntArray217[local24 + 1];
					Static282.anIntArray601[local24] = Static282.anIntArray601[local24 + 1];
					Static10.anIntArray21[local24] = Static10.anIntArray21[local24 + 1];
				}
				local3--;
			}
		}
		if (Static153.aBoolean210 && !Static88.method1550()) {
			if (Static24.anInt344 != 0 && Static254.anInt4845 != -1) {
				Static204.method3264(Static24.anInt344, Static254.anInt4845, Static278.aClass58_98);
			}
			Static153.aBoolean210 = false;
		} else if (Static24.anInt344 != 0 && Static254.anInt4845 != -1 && !Static88.method1550()) {
			Static110.aClass4_Sub10_Sub1_1.method4687(250);
			Static110.aClass4_Sub10_Sub1_1.method4654(Static254.anInt4845);
			Static254.anInt4845 = -1;
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(B)V")
	private static void method4742() {
		Static113.aClass26_22.method515();
		Static13.aClass26_2.method515();
		Static195.aClass26_39.method515();
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(IIIIII)V")
	public static void method4743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 + 1;
		Static99.method1656(Static220.anIntArrayArray36[arg3], arg0, arg1, arg2);
		@Pc(18) int local18 = arg4 - 1;
		Static99.method1656(Static220.anIntArrayArray36[arg4], arg0, arg1, arg2);
		for (@Pc(31) int local31 = local9; local31 <= local18; local31++) {
			@Pc(42) int[] local42 = Static220.anIntArrayArray36[local31];
			local42[arg1] = local42[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	private static void method4744() {
		Static127.aClass26_24.method515();
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(B)V")
	public static void method4746() {
		method4744();
		Static204.method3271();
		Static207.method3342();
		Static291.method4437();
		method4742();
		Static35.method556();
		Static129.method1970();
		Static73.method1203();
		Static249.method3953();
		Static111.method1794();
		Static137.method2049();
		Static148.method2366();
		Static190.method3006();
		Static220.method3315();
		Static124.method1926();
		Static278.method4333();
		Static5.method91();
		Static72.method1172();
		Static130.method1975();
		Static68.method1066();
		Static105.method1714();
		Static25.aClass26_5.method515();
		Static18.aClass26_3.method515();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	public static int anInt2565;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "[I")
	public static final int[] anIntArray280 = new int[14];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!l;Lclient!qs;B)V")
	public static void method1865(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class211 arg1) {
		Static56.aClass211_17 = arg1;
		Static260.anInterface7_9 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lclient!ec;")
	public static Class68 method1866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class68 local12 = Static300.method4351(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass68Array2 == null || local12.aClass68Array2.length <= arg1) {
			return null;
		} else {
			return local12.aClass68Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)[Lclient!vi;")
	public static Class256[] method1867() {
		return new Class256[] { Static319.aClass256_5, Static303.aClass256_7, Static66.aClass256_3 };
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	public static void method1868() {
		Static365.aClass251_6.method5607();
		Static331.aClass191_5.method4339();
		Static19.aClass143_1.method3314();
		Static455.aClass161_4.method3625();
		Static300.aClass44_2.method1004();
		Static43.aClass57_1.method1415();
		Static107.aClass239_1.method5418();
		Static145.aClass63_1.method1527();
		Static303.aClass152_1.method3463();
		Static204.aClass46_1.method1075();
		Static241.aClass258_1.method5776();
		Static163.aClass170_2.method3742();
		Static420.aClass84_2.method1800();
		Static53.aClass32_1.method722();
		Static201.aClass5_1.method57();
		Static106.aClass53_1.method1333();
		Static100.aClass42_1.method903();
		Static447.aClass270_1.method6167();
		Static60.aClass133_1.method3161();
		Static257.aClass115_1.method2702();
		Static341.method4802();
		Static418.method5682();
		Static434.method5789();
		Static75.method1403();
		Static434.aClass91_99.method1998(5);
		Static276.aClass91_73.method1998(5);
		Static300.aClass91_77.method1998(5);
		Static329.aClass91_83.method1998(5);
		Static178.aClass91_52.method1998(5);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!za;IIII)V")
	public static void method1869(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg1.ba(arg3, arg0, arg3 + arg2, arg4 + arg0);
		arg1.method5941(arg0, arg2, arg3, arg4, -16777216);
		if (Static2.anInt48 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static377.anInt5031 / (float) Static377.anInt5032;
		@Pc(38) int local38 = arg2;
		@Pc(40) int local40 = arg4;
		if (local36 < 1.0F) {
			local40 = (int) (local36 * (float) arg2);
		} else {
			local38 = (int) ((float) arg4 / local36);
		}
		@Pc(66) int local66 = arg0 + (arg4 - local40) / 2;
		@Pc(74) int local74 = arg3 + (arg2 - local38) / 2;
		if (Static114.aClass137_4 == null || arg2 != Static114.aClass137_4.YA() || arg4 != Static114.aClass137_4.ZA()) {
			Static377.method3867(Static377.anInt5040, Static377.anInt5031 + Static377.anInt5030, Static377.anInt5032 + Static377.anInt5040, Static377.anInt5030, local74, local66, local74 + local38, local40 + local66);
			Static377.method3866(arg1);
			Static114.aClass137_4 = arg1.method5931(local74, local66, local38, local40, false);
		}
		Static114.aClass137_4.method5708(local74, local66);
		@Pc(121) int local121 = Static54.anInt1417 * local38 / Static377.anInt5032;
		@Pc(127) int local127 = local40 * Static223.anInt4456 / Static377.anInt5031;
		@Pc(135) int local135 = local74 + Static119.anInt2649 * local38 / Static377.anInt5032;
		@Pc(149) int local149 = local40 + local66 - local127 - local40 * Static249.anInt4828 / Static377.anInt5031;
		@Pc(151) int local151 = -1996554240;
		if (Static266.aClass272_3 == Static268.aClass272_4) {
			local151 = -1996488705;
		}
		arg1.P(local135, local149, local121, local127, local151, 1);
		arg1.method5958(local135, local149, local121, local127, local151, 0);
		if (Static305.anInt5723 <= 0) {
			return;
		}
		@Pc(186) int local186;
		if (Static9.anInt3081 > 50) {
			local186 = (100 - Static9.anInt3081) * 5;
		} else {
			local186 = Static9.anInt3081 * 5;
		}
		for (@Pc(197) Class1_Sub28 local197 = (Class1_Sub28) Static377.aClass203_40.method4548(); local197 != null; local197 = (Class1_Sub28) Static377.aClass203_40.method4545()) {
			@Pc(205) Class47 local205 = Static377.aClass170_4.method3739(local197.anInt4940);
			if (Static175.method2966(local205)) {
				@Pc(238) int local238;
				@Pc(250) int local250;
				if (local197.anInt4940 == Static140.anInt3084) {
					local238 = local197.anInt4938 * local38 / Static377.anInt5032 + local74;
					local250 = local66 + (Static377.anInt5031 - local197.anInt4936) * local40 / Static377.anInt5031;
					arg1.method5941(local250 - 2, 4, local238 - 2, 4, local186 << 24 | 0xFFFF00);
				} else if (Static331.anInt6090 != -1 && local205.anInt1531 == Static331.anInt6090) {
					local238 = local38 * local197.anInt4938 / Static377.anInt5032 + local74;
					local250 = (Static377.anInt5031 - local197.anInt4936) * local40 / Static377.anInt5031 + local66;
					arg1.method5941(local250 - 2, 4, local238 - 2, 4, local186 << 24 | 0xFFFF00);
				}
			}
		}
	}
}

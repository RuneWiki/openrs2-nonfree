import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_20 = new Class340();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lclient!el;")
	public static Class100 method2540(@OriginalArg(1) int arg0) {
		@Pc(10) Class100 local10 = (Class100) Static625.aClass359_66.method8517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static85.aClass223_20.method5267(arg0, 1);
		local10 = new Class100();
		local10.anInt2657 = arg0;
		if (local21 != null) {
			local10.method2611(new Class6_Sub15(local21));
		}
		local10.method2608();
		if (local10.anInt2656 == 2 && Static460.aClass74_52.method1401((long) arg0) == null) {
			Static460.aClass74_52.method1399(new Class6_Sub6(Static140.anInt2886), (long) arg0);
			Static35.aClass100Array1[Static140.anInt2886++] = local10;
		}
		Static625.aClass359_66.method8515((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public static void method2541() {
		Static688.aClass359_70.method8511();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)V")
	public static void method2542(@OriginalArg(1) long arg0) {
		if (Static334.aClass243ArrayArrayArray2 != null) {
			if (Static526.anInt8626 == 1 || Static526.anInt8626 == 5) {
				Static350.method5365(arg0);
			} else if (Static526.anInt8626 == 4) {
				Static471.method7098(arg0);
			}
		}
		Static67.method819((long) Static141.anInt8737, Static202.aClass75_5);
		if (Static635.anInt9910 != -1) {
			Static450.method6930(Static635.anInt9910);
		}
		for (@Pc(61) int local61 = 0; local61 < Static149.anInt3119; local61++) {
			if (Static72.aBooleanArray5[local61]) {
				Static411.aBooleanArray22[local61] = true;
			}
			Static400.aBooleanArray21[local61] = Static72.aBooleanArray5[local61];
			Static72.aBooleanArray5[local61] = false;
		}
		Static337.anInt5765 = Static141.anInt8737;
		Static616.method8499((Class381) null, -1, -1);
		Static581.method8106((Class381) null, -1, -1);
		if (Static635.anInt9910 != -1) {
			Static149.anInt3119 = 0;
			Static542.method7709();
		}
		Static202.aClass75_5.la();
		Static25.method326(Static202.aClass75_5);
		@Pc(126) int local126 = Static30.method350();
		if (local126 == -1) {
			local126 = Static475.anInt8093;
		}
		if (local126 == -1) {
			local126 = Static269.anInt5037;
		}
		Static608.method8373(local126);
		@Pc(146) int local146 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) << 8;
		Static527.method7561(local146 + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 + local146, Static2.anInt3, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135);
		Static2.anInt3 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZI)V")
	public static void method2543(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class232[] local10 = Static236.aClass232Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class232 local18 = local10[local12];
			if (local18 != null && local18.anInt6164 == 2) {
				Static211.method3846(local18.anInt6174, local18.anInt6163 * 2, arg1 >> 1, local18.anInt6161, local18.anInt6167, arg3 >> 1);
				if (Static609.anIntArray627[0] > -1 && Static141.anInt8737 % 20 < 10) {
					@Pc(73) Class49 local73 = Static323.aClass49Array7[local18.anInt6162];
					@Pc(81) int local81 = arg2 + Static609.anIntArray627[0] - 12;
					@Pc(89) int local89 = arg0 + Static609.anIntArray627[1] - 28;
					local73.method8997(local81, local89);
					Static494.method3707(local89, local81, local89 + local73.method8987(), local73.method8991() + local81);
				}
			}
		}
	}
}

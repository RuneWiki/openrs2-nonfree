import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "[F")
	public static final float[] aFloatArray87 = new float[4];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!kn;II)V")
	public static void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub32 arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg0 << 14 | arg3 << 28);
		@Pc(22) Class3_Sub25 local22 = (Class3_Sub25) Static39.aClass25_8.method426(local16);
		if (local22 == null) {
			local22 = new Class3_Sub25();
			Static39.aClass25_8.method434(local16, local22);
			local22.aClass216_44.method5449(arg2);
			return;
		}
		@Pc(45) Class259 local45 = Static298.aClass132_1.method3062(arg2.anInt5954);
		@Pc(48) int local48 = local45.anInt7349;
		if (local45.anInt7370 == 1) {
			local48 *= arg2.anInt5957 + 1;
		}
		for (@Pc(73) Class3_Sub32 local73 = (Class3_Sub32) local22.aClass216_44.method5457(); local73 != null; local73 = (Class3_Sub32) local22.aClass216_44.method5458()) {
			local45 = Static298.aClass132_1.method3062(local73.anInt5954);
			@Pc(84) int local84 = local45.anInt7349;
			if (local45.anInt7370 == 1) {
				local84 *= local73.anInt5957 + 1;
			}
			if (local84 < local48) {
				Static609.method8336(local73, arg2);
				return;
			}
		}
		local22.aClass216_44.method5449(arg2);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIII)V")
	public static void method7251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) int local22 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg2);
		@Pc(28) int local28 = Static632.method8535(Static596.anInt9703, Static298.anInt5919, arg0);
		@Pc(34) int local34 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg4);
		@Pc(40) int local40 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg1);
		for (@Pc(42) int local42 = local22; local42 <= local28; local42++) {
			Static82.method1400(arg3, local34, local40, Static71.anIntArrayArray5[local42]);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BZ)V")
	public static void method7252() {
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub13_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub13_2);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub8_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub8_2);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub29_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub7_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub1_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub18_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub16_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub10_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub2_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub28_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub6_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub27_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub26_2);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub3_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub11_1);
		Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub25_1);
		Static578.method8094();
		Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub20_1);
		Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub14_1);
		Static408.method6354();
		Static183.method2986();
		Static264.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class9_Sub6 local6 = (Class9_Sub6) Static169.aClass139_4.method3198(); local6 != null; local6 = (Class9_Sub6) Static169.aClass139_4.method3205()) {
			if (Static304.anInt8391 >= local6.anInt6074) {
				local6.method8593();
			} else {
				Static360.method5785((local6.anInt6071 << 9) + 256, (local6.anInt6072 << 9) + 256, local6.anInt6076 * 2, arg1 >> 1, local6.anInt6069, arg3 >> 1);
				Static374.aClass63_9.method7754(local6.aString45, arg2 + Static272.anIntArray292[1], local6.anInt6070 | 0xFF000000, 0, arg0 + Static272.anIntArray292[0]);
			}
		}
	}
}

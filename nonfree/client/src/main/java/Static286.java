import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public static int anInt4991;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_7 = new Class146(5, 4);

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_66 = new Class84("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method4043() {
		Static288.method4075();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static170.aClass112Array1[local8].method2686();
		}
		Static209.method6067();
		Static95.method1501();
		System.gc();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZI)V")
	public static void method4044(@OriginalArg(1) boolean arg0) {
		Static202.anInt3664++;
		Static303.method4335();
		if (arg0) {
			Static158.anInt2676++;
			Static237.method3519();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!qa;IILclient!ia;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4045(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static233.aClass109_7 = arg0;
		Static365.anInt6212 = arg1;
		Static253.aClass18_5 = arg3;
		Static306.aBoolean360 = Static233.aClass109_7.method4755() > 0;
		Static384.anInt6665 = arg4 >> Static139.anInt2355;
		Static379.anInt6498 = arg6 >> Static139.anInt2355;
		Static251.anInt4514 = arg4;
		Static424.anInt7347 = arg6;
		Static223.anInt4013 = arg5;
		Static1.anInt149 = Static384.anInt6665 - Static11.anInt315;
		if (Static1.anInt149 < 0) {
			Static145.anInt2469 = -Static1.anInt149;
			Static1.anInt149 = 0;
		} else {
			Static145.anInt2469 = 0;
		}
		Static179.anInt3236 = Static379.anInt6498 - Static11.anInt315;
		if (Static179.anInt3236 < 0) {
			Static58.anInt1250 = -Static179.anInt3236;
			Static179.anInt3236 = 0;
		} else {
			Static58.anInt1250 = 0;
		}
		Static160.anInt2750 = Static384.anInt6665 + Static11.anInt315;
		if (Static160.anInt2750 > Static377.anInt6467) {
			Static160.anInt2750 = Static377.anInt6467;
		}
		Static333.anInt5793 = Static379.anInt6498 + Static11.anInt315;
		if (Static333.anInt5793 > Static378.anInt6480) {
			Static333.anInt5793 = Static378.anInt6480;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static11.anInt315 + Static11.anInt315 + 2; local74++) {
			for (local77 = 0; local77 < Static11.anInt315 + Static11.anInt315 + 2; local77++) {
				local84 = Static384.anInt6665 + local74 - Static11.anInt315;
				local90 = Static379.anInt6498 + local77 - Static11.anInt315;
				if (local84 >= 0 && local90 >= 0 && local84 < Static377.anInt6467 && local90 < Static378.anInt6480) {
					@Pc(104) int local104 = local84 << Static139.anInt2355;
					@Pc(108) int local108 = local90 << Static139.anInt2355;
					@Pc(124) int local124 = Static328.aClass136Array3[Static328.aClass136Array3.length - 1].I(local84, local90) - (0x3E8 << Static139.anInt2355 - 7);
					@Pc(144) int local144 = Static160.aClass136Array2 == null ? Static328.aClass136Array3[0].I(local84, local90) + Static337.anInt7424 : Static160.aClass136Array2[0].I(local84, local90) + Static337.anInt7424;
					Static420.aBooleanArrayArray6[local74][local77] = Static233.aClass109_7.SA(local104, local124, local108, local104, local144, local108);
				} else {
					Static420.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static11.anInt315 + Static11.anInt315 + 1; local77++) {
			for (local84 = 0; local84 < Static11.anInt315 + Static11.anInt315 + 1; local84++) {
				Static250.aBooleanArrayArray3[local77][local84] = Static420.aBooleanArrayArray6[local77][local84] || Static420.aBooleanArrayArray6[local77 + 1][local84] || Static420.aBooleanArrayArray6[local77][local84 + 1] || Static420.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static383.anIntArray543 = arg8;
		Static349.anIntArray92 = arg9;
		Static356.anIntArray485 = arg10;
		Static4.anIntArray5 = arg11;
		Static284.anIntArray400 = arg12;
		Static322.method4532();
		Static115.method1708();
		for (@Pc(260) Class39_Sub4 local260 = (Class39_Sub4) Static146.aClass188_4.method4534(); local260 != null; local260 = (Class39_Sub4) Static146.aClass188_4.method4530()) {
			local260.method5616();
			Static254.method3736(local260);
		}
		if (Static306.aBoolean360) {
			for (local90 = 0; local90 < Static139.anInt2353; local90++) {
				Static110.aClass124Array2[local90].method2892(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static233.aClass109_7.method4708(0);
			if (Static66.aClass54_1 == null || Static66.aClass54_1 instanceof Class54_Sub1) {
				Static66.aClass54_1 = new Class54_Sub2();
			}
		} else if (Static66.aClass54_1 == null || Static66.aClass54_1 instanceof Class54_Sub2) {
			Static66.aClass54_1 = new Class54_Sub1();
		}
		Static66.aClass54_1.method4343(arg2);
		Static66.aClass54_1.method4337();
		if (Static87.aClass211ArrayArrayArray1 != null) {
			Static126.method1875(true);
			Static66.aClass54_1.method4339(22);
			Static83.method5720(arg2, null, 0, (byte) 0, arg15, arg16);
			Static66.aClass54_1.method4337();
			Static66.aClass54_1.method4339(23);
			Static126.method1875(false);
		}
		Static83.method5720(arg2, arg7, arg13, arg14, arg15, arg16);
		Static66.aClass54_1.method4337();
		Static66.aClass54_1.method4340();
		Static66.aClass54_1.method4337();
		if (arg2 > 1) {
			Static233.aClass109_7.method4725(0);
		}
		Static233.aClass109_7.method4726(0, null);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!lh;)V")
	public static void method4046(@OriginalArg(1) Class1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.method4096();
		Static311.aClass10Array1 = new Class10[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static311.aClass10Array1[local14] = new Class10();
			Static311.aClass10Array1[local14].anInt317 = arg0.method4096();
			Static311.aClass10Array1[local14].aString2 = arg0.method4109();
		}
		Static185.anInt3367 = arg0.method4096();
		Static324.anInt5682 = arg0.method4096();
		Static116.anInt2032 = arg0.method4096();
		Static4.aClass196_Sub1Array1 = new Class196_Sub1[Static324.anInt5682 + 1 - Static185.anInt3367];
		for (@Pc(66) int local66 = 0; local66 < Static116.anInt2032; local66++) {
			@Pc(72) int local72 = arg0.method4096();
			@Pc(80) Class196_Sub1 local80 = Static4.aClass196_Sub1Array1[local72] = new Class196_Sub1();
			local80.anInt7417 = arg0.method4130();
			local80.anInt7422 = arg0.method4087();
			local80.anInt7431 = local72 + Static185.anInt3367;
			local80.aString63 = arg0.method4109();
			local80.aString62 = arg0.method4109();
		}
		Static233.anInt4178 = arg0.method4087();
		Static144.aBoolean133 = true;
	}
}

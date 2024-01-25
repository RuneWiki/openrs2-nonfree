import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
	public static int method2737() {
		return 15;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/lang/String;ZI)V")
	public static void method2738(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static510.method6922();
		if (arg2 == 0) {
			Static153.aClass22_4 = Static645.method8480(Static508.aCanvas8, Static240.anInterface4_11, Static580.aClass3_Sub22_24.aClass21_Sub6_2.method3188() * 2, Static58.aClass182_12, 0);
			if (arg0 != null) {
				Static153.aClass22_4.GA(0);
				@Pc(181) Class169 local181 = Static613.method7850(Static506.anInt8059, Static652.aClass182_33);
				@Pc(190) Class57 local190 = Static153.aClass22_4.method9353(local181, Static735.method8277(Static218.aClass182_59, Static506.anInt8059), true);
				Static598.method7697();
				Static472.method6430(Static153.aClass22_4, true, local190, local181, arg0);
			}
		} else {
			@Pc(9) Class22 local9 = null;
			@Pc(37) Class57 local37;
			if (arg0 != null) {
				local9 = Static645.method8480(Static508.aCanvas8, Static240.anInterface4_11, 0, Static58.aClass182_12, 0);
				local9.GA(0);
				@Pc(28) Class169 local28 = Static613.method7850(Static506.anInt8059, Static652.aClass182_33);
				local37 = local9.method9353(local28, Static735.method8277(Static218.aClass182_59, Static506.anInt8059), true);
				Static598.method7697();
				Static472.method6430(local9, true, local37, local28, arg0);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static153.aClass22_4 = Static645.method8480(Static508.aCanvas8, Static240.anInterface4_11, Static580.aClass3_Sub22_24.aClass21_Sub6_2.method3188() * 2, Static58.aClass182_12, arg2);
					if (arg0 != null) {
						local9.GA(0);
						@Pc(70) Class169 local70 = Static613.method7850(Static506.anInt8059, Static652.aClass182_33);
						@Pc(79) Class57 local79 = local9.method9353(local70, Static735.method8277(Static218.aClass182_59, Static506.anInt8059), true);
						Static598.method7697();
						Static472.method6430(local9, true, local79, local70, arg0);
					}
					if (Static153.aClass22_4.method9392()) {
						@Pc(93) boolean local93 = true;
						try {
							local93 = Static12.aClass3_Sub39_12.anInt5861 > 256;
						} catch (@Pc(104) Throwable local104) {
						}
						@Pc(110) Class3_Sub16 local110;
						if (local93) {
							local110 = Static153.aClass22_4.method9329(146800640);
						} else {
							local110 = Static153.aClass22_4.method9329(104857600);
						}
						Static153.aClass22_4.method9331(local110);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(121) Throwable local121) {
					@Pc(126) int local126 = Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620();
					if (local126 == 2) {
						Static234.aBoolean236 = true;
					}
					Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub28_2);
					method2738(arg0, arg1, local126);
					@Pc(147) Object local147 = null;
					var14 = false;
				} finally {
					if (var14) {
						local37 = null;
						if (local9 != null) {
							try {
								local9.method9397();
							} catch (@Pc(363) Throwable local363) {
							}
						}
					}
				}
				if (local9 != null) {
					try {
						local9.method9397();
					} catch (@Pc(343) Throwable local343) {
					}
				}
				return;
			}
			local37 = null;
			if (local9 != null) {
				try {
					local9.method9397();
				} catch (@Pc(353) Throwable local353) {
				}
			}
		}
		Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8619(!arg1);
		Static580.aClass3_Sub22_24.method2423(arg2, Static580.aClass3_Sub22_24.aClass21_Sub28_2);
		Static504.method6879();
		Static153.aClass22_4.method9343();
		Static153.aClass22_4.X(32);
		Static158.aClass58_1 = Static153.aClass22_4.method9376();
		Static598.aClass58_9 = Static153.aClass22_4.method9376();
		Static648.method8530();
		Static153.aClass22_4.method9374(Static580.aClass3_Sub22_24.aClass21_Sub24_1.method7393() == 1);
		if (Static153.aClass22_4.method9380()) {
			Static451.method5965(Static580.aClass3_Sub22_24.aClass21_Sub19_1.method5679() == 1);
		}
		Static256.method2679(Static153.aClass22_4, Static646.anInt9979 >> 3, Static497.anInt7926 >> 3);
		Static509.method6646();
		Static298.aClass192Array1 = null;
		Static569.aBoolean580 = false;
		Static477.aBoolean507 = true;
		Static248.method3510();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method2742(@OriginalArg(0) Class9_Sub6 arg0) {
		arg0.aClass9_Sub1_18 = null;
		@Pc(12) int local12 = arg0.aClass9_Sub9Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass9_Sub9Array1[local14].aBoolean719 = false;
		}
		@Pc(34) Class319[] local34 = Class163.aClass319Array1;
		synchronized (Class163.aClass319Array1) {
			if (local12 < Class163.aClass319Array1.length && Static636.anIntArray711[local12] < 200) {
				Class163.aClass319Array1[local12].method7196(arg0);
				@Pc(65) int local65 = Static636.anIntArray711[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method2743() {
		@Pc(7) int local7 = Static607.anInt9201;
		@Pc(9) int[] local9 = Static384.anIntArray436;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class9_Sub1_Sub1_Sub2_Sub1 local19 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static126.method2307(false, local19);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIBLclient!ha;)V")
	public static void method2745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class22 arg4) {
		arg4.method9378(arg1, arg2, -10660793, arg0, arg3);
		arg4.method9378(arg1 + 1, arg2 + 1, -16777216, 16, arg3 - 2);
		arg4.method9399(arg3 - 2, arg0 + -19, -16777216, arg2 + 1, arg1 + 18);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "Lclient!vl;")
	public static Class263 aClass263_27;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!za;)V")
	public static void method4280(@OriginalArg(1) Class117 arg0) {
		if (Static76.anInt1078 < 2 && !Static290.aBoolean449 || Static364.aClass107_13 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static290.aBoolean449 && Static76.anInt1078 < 2) {
			local41 = Static28.aString5 + Static343.aClass142_85.method3118(Static63.anInt981) + Static392.aString62 + " ->";
		} else if (Static53.aBoolean106 && Static269.aClass53_1.method3910(81) && Static76.anInt1078 > 2) {
			local41 = Static95.method5204((Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268.aClass1_268);
		} else {
			@Pc(58) Class1_Sub10 local58 = (Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268;
			local41 = Static95.method5204(local58);
			@Pc(64) int[] local64 = null;
			if (Static189.method2734(local58.anInt1057)) {
				local64 = Static285.aClass226_2.method4788((int) local58.aLong31).anIntArray274;
			} else if (local58.anInt1050 != -1) {
				local64 = Static285.aClass226_2.method4788(local58.anInt1050).anIntArray274;
			} else if (Static463.method5977(local58.anInt1057)) {
				@Pc(97) Class1_Sub44 local97 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local58.aLong31);
				if (local97 != null) {
					@Pc(102) Class11_Sub1_Sub3_Sub1 local102 = local97.aClass11_Sub1_Sub3_Sub1_2;
					@Pc(105) Class272 local105 = local102.aClass272_1;
					if (local105.anIntArray543 != null) {
						local105 = local105.method5900(Static32.aClass4_1);
					}
					if (local105 != null) {
						local64 = local105.anIntArray542;
					}
				}
			} else if (Static319.method4209(local58.anInt1057)) {
				@Pc(139) Class87 local139;
				if (local58.anInt1057 == 1002) {
					local139 = Static86.aClass248_7.method5246((int) local58.aLong31);
				} else {
					local139 = Static86.aClass248_7.method5246((int) (local58.aLong31 >>> 32 & 0x7FFFFFFFL));
				}
				if (local139.anIntArray170 != null) {
					local139 = local139.method1571(Static32.aClass4_1);
				}
				if (local139 != null) {
					local64 = local139.anIntArray168;
				}
			}
			if (local64 != null) {
				local41 = local41 + Static237.method3379(local64);
			}
		}
		if (Static76.anInt1078 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static76.anInt1078 - 2) + Static53.aClass142_10.method3118(Static63.anInt981);
		}
		if (Static446.aClass107_16 != null) {
			@Pc(225) Class137 local225 = Static446.aClass107_16.method2103(arg0);
			if (local225 == null) {
				local225 = Static17.aClass137_5;
			}
			local225.method4600(Static446.aClass107_16.anInt2648, Static446.aClass107_16.anInt2606, Static446.aClass107_16.anInt2658, Static307.anInt5107, Static446.aClass107_16.anInt2667, local41, Static446.aClass107_16.anInt2641, Static91.aClass85Array5, Static42.anInt630, Static138.anIntArray185, Static385.anIntArray459, Static446.aClass107_16.anInt2584, Static182.anInt3404, Static21.aRandom1);
			Static171.method2271(Static385.anIntArray459[1], Static385.anIntArray459[0], Static385.anIntArray459[3], Static385.anIntArray459[2]);
		} else if (Static261.aClass107_12 != null && Static59.aClass148_1 == Static94.aClass148_3) {
			@Pc(290) int local290 = Static17.aClass137_5.method4592(local41, Static42.anInt630, Static138.anIntArray185, Static21.aRandom1, Static441.anInt4982 + 4, Static61.anInt7288 + 16, Static91.aClass85Array5);
			Static171.method2271(Static61.anInt7288, Static441.anInt4982 + 4, 16, local290 + Static15.aClass252_5.method5291(local41));
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	public static void method4282() {
		Static40.aClass85Array2 = null;
		Static20.aClass85Array1 = null;
		Static458.aClass85Array15 = null;
		Static299.aClass85Array10 = null;
		Static300.aClass137_7 = null;
		Static17.aClass137_5 = null;
		Static277.aClass85Array9 = null;
		Static311.aClass85Array11 = null;
		Static63.aClass85Array3 = null;
		Static90.aClass85Array4 = null;
		Static273.aClass85Array8 = null;
		Static377.aClass85Array12 = null;
		Static97.aClass85Array6 = null;
		Static398.aClass85Array13 = null;
		Static51.aClass85_6 = null;
		Static464.aClass137_8 = null;
		Static366.aClass85_19 = null;
		Static251.aClass85Array7 = null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)B")
	public static byte method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}

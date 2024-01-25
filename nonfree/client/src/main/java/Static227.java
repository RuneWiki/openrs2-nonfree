import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	public static int anInt4402;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_134 = new Class272(92, 6);

	@OriginalMember(owner = "client!in", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[128][128];

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!sl;")
	public static Class310 aClass310_15 = new Class310(8);

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Lclient!mea;")
	public static Class211 aClass211_1 = null;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLclient!r;)V")
	public static void method3891(@OriginalArg(1) Class43 arg0) {
		if (Static151.anInt3123 < 2 && !Static380.aBoolean537 || Static265.aClass203_82 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static380.aBoolean537 && Static151.anInt3123 < 2) {
			local42 = Static484.aString107 + Static48.aClass33_34.method797(Static131.anInt2839) + Static466.aString125 + " ->";
		} else if (Static522.aBoolean641 && Static478.aClass127_1.method3276(81) && Static151.anInt3123 > 2) {
			local42 = Static581.method7689((Class3_Sub44) Static187.aClass130_15.aClass3_121.aClass3_286.aClass3_286);
		} else {
			@Pc(49) Class3_Sub44 local49 = (Class3_Sub44) Static187.aClass130_15.aClass3_121.aClass3_286;
			local42 = Static581.method7689(local49);
			@Pc(55) int[] local55 = null;
			if (Static336.method5142(local49.anInt7685)) {
				local55 = Static517.aClass145_1.method3798((int) local49.aLong219).anIntArray646;
			} else if (local49.anInt7688 != -1) {
				local55 = Static517.aClass145_1.method3798(local49.anInt7688).anIntArray646;
			} else if (Static505.method2637(local49.anInt7685)) {
				@Pc(78) Class3_Sub39 local78 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local49.aLong219);
				if (local78 != null) {
					@Pc(83) Class9_Sub1_Sub1_Sub2_Sub1 local83 = local78.aClass9_Sub1_Sub1_Sub2_Sub1_2;
					@Pc(86) Class294 local86 = local83.aClass294_1;
					if (local86.anIntArray588 != null) {
						local86 = local86.method6429(Static427.aClass56_1);
					}
					if (local86 != null) {
						local55 = local86.lb;
					}
				}
			} else if (Static377.method5578(local49.anInt7685)) {
				@Pc(122) Class23 local122;
				if (local49.anInt7685 == 1001) {
					local122 = Static476.aClass69_5.method2181((int) local49.aLong219);
				} else {
					local122 = Static476.aClass69_5.method2181((int) (local49.aLong219 >>> 32 & 0x7FFFFFFFL));
				}
				if (local122.anIntArray78 != null) {
					local122 = local122.method587(Static427.aClass56_1);
				}
				if (local122 != null) {
					local55 = local122.anIntArray79;
				}
			}
			if (local55 != null) {
				local42 = local42 + Static480.method6570(local55);
			}
		}
		if (Static151.anInt3123 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static151.anInt3123 - 2) + Static48.aClass33_27.method797(Static131.anInt2839);
		}
		if (Static87.aClass203_34 != null) {
			@Pc(259) Class117 local259 = Static87.aClass203_34.method4770(arg0);
			if (local259 == null) {
				local259 = Static480.aClass117_9;
			}
			local259.method7661(Static400.anInt6817, Static87.aClass203_34.anInt5454, Static87.aClass203_34.anInt5485, Static87.aClass203_34.anInt5450, local42, Static372.anInt6335, Static87.aClass203_34.anInt5456, Static187.aClass46Array6, Static87.aClass203_34.anInt5476, Static403.anInt6866, Static518.anIntArray627, Static370.anIntArray501, Static203.aRandom1, Static87.aClass203_34.anInt5513);
			Static482.method6578(Static518.anIntArray627[3], Static518.anIntArray627[0], Static518.anIntArray627[2], Static518.anIntArray627[1]);
		} else if (Static589.aClass203_149 != null && aClass211_1 == Static250.aClass211_2) {
			@Pc(240) int local240 = Static480.aClass117_9.method7658(Static24.anInt579 + 16, local42, Static187.aClass46Array6, Static574.anInt9173 + 4, Static403.anInt6866, Static203.aRandom1, Static370.anIntArray501);
			Static482.method6578(16, Static574.anInt9173 + 4, local240 + Static159.aClass58_7.method1767(local42), Static24.anInt579);
			return;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
	public static int method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static218.aByteArrayArray12 == null ? 0 : Static218.aByteArrayArray12[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public static void method3894() {
		Static31.aClass305_1.method6569();
		Static545.aClass201_5.method4716();
		Static107.aClass352_2.method7550();
		Static476.aClass69_5.method2180();
		Static510.aClass284_2.method6284();
		Static517.aClass145_1.method3789();
		Static330.aClass279_2.method6215();
		Static547.aClass248_2.method5706();
		Static165.aClass212_1.method5094();
		Static157.aClass195_1.method4538();
		Static363.aClass135_1.method3665();
		Static453.aClass348_3.method7403();
		Static191.aClass168_2.method4064();
		Static268.aClass79_1.method2478();
		Static69.aClass118_1.method3018();
		Static257.aClass182_1.method4392();
		Static125.aClass349_1.method7444();
		Static483.aClass2_1.method11();
		Static172.aClass219_1.method5181();
		Static405.aClass71_1.method2254();
		Static499.method6736();
		Static549.method7335();
		Static521.method6935();
		Static494.method6680();
		Static98.method2125();
		Static421.aClass10_45.method262();
		Static582.aClass10_67.method262();
		Static209.aClass10_58.method262();
		Static450.aClass10_48.method262();
		Static149.aClass10_14.method262();
	}
}

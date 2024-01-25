import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "Lclient!sca;")
	public static Class1_Sub12_Sub3 aClass1_Sub12_Sub3_2;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)V")
	public static void method6418() {
		@Pc(1) Class316 local1 = Static505.aClass316_61;
		synchronized (Static505.aClass316_61) {
			Static505.aClass316_61.method7791(5);
		}
		local1 = Static140.aClass316_16;
		synchronized (Static140.aClass316_16) {
			Static140.aClass316_16.method7791(5);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method6419(@OriginalArg(1) Class9 arg0) {
		if (Static267.anInt5167 < 2 && !Static382.aBoolean440 || Static279.aClass309_6 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static382.aBoolean440 && Static267.anInt5167 < 2) {
			local36 = Static433.aString72 + Static341.aClass114_124.method3330(Static315.anInt5993) + Static469.aString69 + " ->";
		} else if (Static179.aBoolean243 && Static126.aClass60_1.method5384(81) && Static267.anInt5167 > 2) {
			local36 = Static255.method4303((Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284.aClass1_284);
		} else {
			@Pc(55) Class1_Sub50 local55 = (Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284;
			local36 = Static255.method4303(local55);
			@Pc(61) int[] local61 = null;
			if (Static34.method1308(local55.anInt8983)) {
				local61 = Static454.aClass153_2.method4007((int) local55.aLong236).anIntArray410;
			} else if (local55.anInt8980 != -1) {
				local61 = Static454.aClass153_2.method4007(local55.anInt8980).anIntArray410;
			} else if (Static270.method4524(local55.anInt8983)) {
				@Pc(147) Class1_Sub10 local147 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local55.aLong236);
				if (local147 != null) {
					@Pc(152) Class47_Sub2_Sub3_Sub1 local152 = local147.aClass47_Sub2_Sub3_Sub1_2;
					@Pc(155) Class238 local155 = local152.aClass238_1;
					if (local155.anIntArray511 != null) {
						local155 = local155.method5866(Static343.aClass286_1);
					}
					if (local155 != null) {
						local61 = local155.anIntArray509;
					}
				}
			} else if (Static460.method6777(local55.anInt8983)) {
				@Pc(116) Class288 local116;
				if (local55.anInt8983 == 1012) {
					local116 = Static365.aClass194_6.method5084((int) local55.aLong236);
				} else {
					local116 = Static365.aClass194_6.method5084((int) (local55.aLong236 >>> 32 & 0x7FFFFFFFL));
				}
				if (local116.anIntArray650 != null) {
					local116 = local116.method7065(Static343.aClass286_1);
				}
				if (local116 != null) {
					local61 = local116.anIntArray649;
				}
			}
			if (local61 != null) {
				local36 = local36 + Static300.method5019(local61);
			}
		}
		if (Static267.anInt5167 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static267.anInt5167 - 2) + Static246.aClass114_97.method3330(Static315.anInt5993);
		}
		if (Static130.aClass309_5 != null) {
			@Pc(221) Class27 local221 = Static130.aClass309_5.method7383(arg0);
			if (local221 == null) {
				local221 = Static106.aClass27_3;
			}
			local221.method7819(Static130.aClass309_5.anInt8798, Static420.anIntArray577, Static130.aClass309_5.anInt8793, local36, Static130.aClass309_5.anInt8770, Static36.anInt1327, Static60.anIntArray157, Static130.aClass309_5.anInt8790, Static274.aClass12Array17, Static130.aClass309_5.anInt8729, Static167.anInt3664, Static130.aClass309_5.anInt8752, Static99.anInt2445, Static102.aRandom1);
			Static520.method7425(Static60.anIntArray157[0], Static60.anIntArray157[1], Static60.anIntArray157[3], Static60.anIntArray157[2]);
		} else if (Static77.aClass309_3 != null && Static152.aClass37_1 == Static538.aClass37_4) {
			@Pc(287) int local287 = Static106.aClass27_3.method7807(Static313.anInt5978 + 16, Static102.aRandom1, Static274.aClass12Array17, Static145.anInt3324 + 4, Static420.anIntArray577, local36, Static167.anInt3664);
			Static520.method7425(Static145.anInt3324 + 4, Static313.anInt5978, 16, Static159.aClass177_3.method4664(local36) + local287);
		}
	}
}

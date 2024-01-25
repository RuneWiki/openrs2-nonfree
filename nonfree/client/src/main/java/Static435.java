import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public static int anInt7628;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_104 = new Class376(24, 7);

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public static void method6375() {
		if (Static582.aClass16_12.method8197()) {
			Static582.aClass16_12.method8144(Static469.aCanvas11);
			Static360.method5392();
			if (Static649.aBoolean735) {
				Static6.method67(Static469.aCanvas11);
			} else {
				@Pc(18) Dimension local18 = Static469.aCanvas11.getSize();
				Static582.aClass16_12.method8184(Static469.aCanvas11, local18.width, local18.height);
			}
			Static582.aClass16_12.method8173(Static469.aCanvas11);
		} else {
			Static422.method6016(false, Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402());
		}
		Static517.method7334();
		Static674.aBoolean763 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZLclient!ha;II)V")
	public static void method6376(@OriginalArg(0) int arg0, @OriginalArg(3) Class16 arg1, @OriginalArg(4) int arg2) {
		Static535.aClass16_10 = arg1;
		Static576.aClass25_8 = Static535.aClass16_10.method8178();
		Static177.aClass25_1 = Static535.aClass16_10.method8178();
		Static273.aClass25_3 = Static535.aClass16_10.method8178();
		Static489.anInt8294 = 100;
		Static418.anInt7055 = 0;
		Static575.anInt9134 = 100;
		Static256.anIntArray322 = null;
		Static560.anInterface8Array1 = null;
		Static113.method2117(arg0, arg2);
		Static660.anInt10216 = -1;
		Static267.anInt5037 = -1;
		Static164.anInt3010 = -1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!od;)Ljava/lang/String;")
	public static String method6378(@OriginalArg(1) Class3_Sub6_Sub16 arg0) {
		if (arg0.aString96 == null || arg0.aString96.length() == 0) {
			return arg0.aString97 == null || arg0.aString97.length() <= 0 ? arg0.aString95 : arg0.aString95 + Static569.aClass335_33.method7694(Static319.anInt5939) + arg0.aString97;
		} else if (arg0.aString97 == null || arg0.aString97.length() <= 0) {
			return arg0.aString95 + Static569.aClass335_33.method7694(Static319.anInt5939) + arg0.aString96;
		} else {
			return arg0.aString95 + Static569.aClass335_33.method7694(Static319.anInt5939) + arg0.aString97 + Static569.aClass335_33.method7694(Static319.anInt5939) + arg0.aString96;
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public static void method6379() {
		Static412.anInt6978 = 0;
		@Pc(13) int local13 = (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >> 9) + Static417.anInt7047;
		@Pc(25) int local25 = Static347.anInt7851 + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >> 9);
		if (local13 >= 3053 && local13 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static412.anInt6978 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static412.anInt6978 = 1;
		}
		if (Static412.anInt6978 == 1 && local13 >= 3139 && local13 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static412.anInt6978 = 0;
		}
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Lclient!dk;")
	public static Class54 aClass54_78;

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
	public static int anInt4592 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method3742(@OriginalArg(0) Class163 arg0) {
		if (Static137.anInt6647 < 2 && !Static215.aBoolean217 || Static336.aClass16_18 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static215.aBoolean217 && Static137.anInt6647 < 2) {
			local42 = Static76.aString45 + Static154.aClass134_52.method2720(Static331.anInt5597) + Static408.aString205 + " ->";
		} else if (Static245.aBoolean275 && Static218.aClass181_1.method3865(81) && Static137.anInt6647 > 2) {
			local42 = Static359.method4734((Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263.aClass2_263);
		} else {
			@Pc(71) Class2_Sub46 local71 = (Class2_Sub46) Static261.aClass156_13.aClass2_159.aClass2_263;
			local42 = Static359.method4734(local71);
			@Pc(77) int[] local77 = null;
			if (Static388.method3886(local71.anInt7283)) {
				local77 = Static384.aClass164_2.method3458((int) local71.aLong226).anIntArray500;
			} else if (local71.anInt7282 != -1) {
				local77 = Static384.aClass164_2.method3458(local71.anInt7282).anIntArray500;
			} else if (Static346.method4610(local71.anInt7283)) {
				@Pc(109) Class2_Sub28 local109 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local71.aLong226);
				if (local109 != null) {
					@Pc(114) Class3_Sub4_Sub1_Sub1 local114 = local109.aClass3_Sub4_Sub1_Sub1_1;
					@Pc(117) Class245 local117 = local114.aClass245_1;
					if (local117.anIntArray560 != null) {
						local117 = local117.method5205(Static138.aClass268_1);
					}
					if (local117 != null) {
						local77 = local117.anIntArray561;
					}
				}
			} else if (Static181.method2510(local71.anInt7283)) {
				@Pc(155) Class192 local155;
				if (local71.anInt7283 == 1009) {
					local155 = Static50.aClass190_1.method4218((int) local71.aLong226);
				} else {
					local155 = Static50.aClass190_1.method4218((int) (local71.aLong226 >>> 32 & 0x7FFFFFFFL));
				}
				if (local155.anIntArray434 != null) {
					local155 = local155.method4228(Static138.aClass268_1);
				}
				if (local155 != null) {
					local77 = local155.anIntArray436;
				}
			}
			if (local77 != null) {
				local42 = local42 + Static186.method5106(local77);
			}
		}
		if (Static137.anInt6647 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static137.anInt6647 - 2) + Static13.aClass134_9.method2720(Static331.anInt5597);
		}
		if (Static332.aClass16_17 != null) {
			@Pc(266) Class92 local266 = Static332.aClass16_17.method249(arg0);
			if (local266 == null) {
				local266 = Static143.aClass92_3;
			}
			local266.method4507(Static332.aClass16_17.anInt260, Static332.aClass16_17.anInt294, local42, Static332.aClass16_17.anInt275, Static332.aClass16_17.anInt300, Static351.anInt5968, Static332.aClass16_17.anInt285, Static271.aClass13Array14, Static113.anInt2094, Static332.aClass16_17.anInt270, Static250.aRandom1, Static181.anIntArray245, Static7.anInt126, Static359.anIntArray523);
			Static403.method5083(Static359.anIntArray523[0], Static359.anIntArray523[2], Static359.anIntArray523[3], Static359.anIntArray523[1]);
		} else if (Static258.aClass16_12 != null && Static193.aClass4_2 == Static118.aClass4_1) {
			@Pc(245) int local245 = Static143.aClass92_3.method4506(Static271.aClass13Array14, Static181.anIntArray245, Static396.anInt7304 + 16, local42, Static250.aRandom1, Static7.anInt126, Static447.anInt7168 + 4);
			Static403.method5083(Static447.anInt7168 + 4, local245 + Static241.aClass141_5.method2914(local42), 16, Static396.anInt7304);
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BZ)V")
	public static void method3745(@OriginalArg(1) boolean arg0) {
		Static123.method5625();
		if (!Static343.method4586(Static290.anInt4777)) {
			return;
		}
		Static415.anInt6793++;
		if (Static415.anInt6793 < 50 && !arg0) {
			return;
		}
		Static415.anInt6793 = 0;
		if (!Static141.aBoolean165 && Static375.aClass160_3 != null) {
			Static29.method451(Static452.aClass102_219);
			try {
				Static375.aClass160_3.method3210(Static456.aClass2_Sub13_Sub2_2.anInt4347, Static456.aClass2_Sub13_Sub2_2.aByteArray52);
				Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
			} catch (@Pc(54) IOException local54) {
				Static141.aBoolean165 = true;
			}
		}
		Static123.method5625();
	}
}

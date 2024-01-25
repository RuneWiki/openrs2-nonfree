import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "S")
	public static short aShort43 = 320;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_3 = new Class307(1, 2);

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method2464(@OriginalArg(0) Class44 arg0) {
		if (Static339.anInt6583 < 2 && !Static418.aBoolean541 || Static317.aClass225_54 != null) {
			return;
		}
		@Pc(34) String local34;
		if (Static418.aBoolean541 && Static339.anInt6583 < 2) {
			local34 = Static152.aString28 + Static590.aClass364_36.method8334(Static154.anInt3181) + Static551.aString95 + " ->";
		} else if (Static89.aBoolean156 && Static584.aClass154_1.method3569(81) && Static339.anInt6583 > 2) {
			local34 = Static464.method7047((Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286.aClass4_286);
		} else {
			@Pc(63) Class4_Sub39 local63 = (Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286;
			local34 = Static464.method7047(local63);
			@Pc(69) int[] local69 = null;
			if (Static504.method7403(local63.anInt8541)) {
				local69 = Static521.aClass273_2.method6712((int) local63.aLong219).anIntArray364;
			} else if (local63.anInt8545 != -1) {
				local69 = Static521.aClass273_2.method6712(local63.anInt8545).anIntArray364;
			} else if (Static114.method7979(local63.anInt8541)) {
				@Pc(101) Class4_Sub4 local101 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local63.aLong219);
				if (local101 != null) {
					@Pc(106) Class1_Sub4_Sub2_Sub1_Sub1 local106 = local101.aClass1_Sub4_Sub2_Sub1_Sub1_1;
					@Pc(109) Class283 local109 = local106.aClass283_1;
					if (local109.anIntArray453 != null) {
						local109 = local109.method6834(Static45.aClass148_1);
					}
					if (local109 != null) {
						local69 = local109.anIntArray451;
					}
				}
			} else if (Static52.method683(local63.anInt8541)) {
				@Pc(143) Class101 local143;
				if (local63.anInt8541 == 1011) {
					local143 = Static204.aClass139_8.method3309((int) local63.aLong219);
				} else {
					local143 = Static204.aClass139_8.method3309((int) (local63.aLong219 >>> 32 & 0x7FFFFFFFL));
				}
				if (local143.anIntArray140 != null) {
					local143 = local143.method2710(Static45.aClass148_1);
				}
				if (local143 != null) {
					local69 = local143.anIntArray135;
				}
			}
			if (local69 != null) {
				local34 = local34 + Static67.method1095(local69);
			}
		}
		if (Static339.anInt6583 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static339.anInt6583 - 2) + Static590.aClass364_29.method8334(Static154.anInt3181);
		}
		if (Static109.aClass225_10 != null) {
			@Pc(262) Class58 local262 = Static109.aClass225_10.method5517(arg0);
			if (local262 == null) {
				local262 = Static552.aClass58_14;
			}
			local262.method8154(Static109.aClass225_10.anInt6533, Static109.aClass225_10.anInt6529, local34, Static109.aClass225_10.anInt6560, Static109.aClass225_10.anInt6505, Static536.aRandom1, Static421.anInt7924, Static71.anInt1237, Static500.aClass78Array18, Static567.anInt9950, Static109.aClass225_10.anInt6479, Static109.aClass225_10.anInt6521, Static12.anIntArray10, Static245.anIntArray227);
			Static82.method1377(Static245.anIntArray227[1], Static245.anIntArray227[2], Static245.anIntArray227[3], Static245.anIntArray227[0]);
		} else if (Static584.aClass225_51 != null && Static248.aClass92_2 == Static438.aClass92_4) {
			@Pc(243) int local243 = Static552.aClass58_14.method8160(Static421.anInt7924, Static12.anIntArray10, Static500.aClass78Array18, local34, Static536.aRandom1, Static435.anInt8160 + 4, Static44.anInt579 + 16);
			Static82.method1377(Static44.anInt579, Static314.aClass114_11.method2950(local34) + local243, 16, Static435.anInt8160 + 4);
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method2466() {
		Static542.method7871(-1, 255);
	}
}

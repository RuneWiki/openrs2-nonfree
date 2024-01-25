import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Lclient!dha;")
	public static final Class73 aClass73_1 = new Class73();

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public static int anInt426 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)V")
	public static void method439(@OriginalArg(1) byte arg0) {
		if (Static539.aByteArrayArrayArray17 == null) {
			Static539.aByteArrayArrayArray17 = new byte[4][Static26.anInt462][Static445.anInt6140];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static26.anInt462; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static445.anInt6140; local22++) {
					Static539.aByteArrayArrayArray17[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!d;Lclient!ha;)V")
	public static void method440(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class137 arg1) {
		if (Static498.aClass14_Sub3_Sub16_3 == null) {
			return;
		}
		if (Static156.anInt3087 < 10) {
			if (!Static498.aClass386_108.method9194(Static498.aClass14_Sub3_Sub16_3.aString92)) {
				Static156.anInt3087 = Static298.aClass386_71.method9191(Static498.aClass14_Sub3_Sub16_3.aString92) / 10;
				return;
			}
			Static40.method1458();
			Static156.anInt3087 = 10;
		}
		if (Static156.anInt3087 == 10) {
			Static498.anInt8796 = Static498.aClass14_Sub3_Sub16_3.anInt9293 >> 6 << 6;
			Static498.anInt8795 = Static498.aClass14_Sub3_Sub16_3.anInt9287 >> 6 << 6;
			Static498.anInt8794 = (Static498.aClass14_Sub3_Sub16_3.anInt9284 >> 6 << 6) + 64 - Static498.anInt8796;
			Static498.anInt8801 = (Static498.aClass14_Sub3_Sub16_3.anInt9296 >> 6 << 6) + 64 - Static498.anInt8795;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static498.aClass14_Sub3_Sub16_3.method7676(local76, Static329.anInt6225 + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >> 9), Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, Static202.anInt3755 + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >> 9))) {
				local78 = local76[1] - Static498.anInt8795;
				local80 = local76[2] - Static498.anInt8796;
			}
			if (!Static541.aBoolean700 && local78 >= 0 && local78 < Static498.anInt8801 && local80 >= 0 && Static498.anInt8794 > local80) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static397.anInt7311 = local78;
				Static517.anInt9046 = local80;
			} else if (Static12.anInt94 == -1 || Static526.anInt9138 == -1) {
				Static498.aClass14_Sub3_Sub16_3.method7680(Static498.aClass14_Sub3_Sub16_3.anInt9282 >> 14 & 0x3FFF, local76, Static498.aClass14_Sub3_Sub16_3.anInt9282 & 0x3FFF);
				Static517.anInt9046 = local76[2] - Static498.anInt8796;
				Static397.anInt7311 = local76[1] - Static498.anInt8795;
			} else {
				Static498.aClass14_Sub3_Sub16_3.method7680(Static12.anInt94, local76, Static526.anInt9138);
				if (local76 != null) {
					Static517.anInt9046 = local76[2] - Static498.anInt8796;
					Static397.anInt7311 = local76[1] - Static498.anInt8795;
				}
				Static541.aBoolean700 = false;
				Static526.anInt9138 = -1;
				Static12.anInt94 = -1;
			}
			if (Static498.aClass14_Sub3_Sub16_3.anInt9281 == 37) {
				Static498.aFloat216 = 3.0F;
				Static498.aFloat217 = 3.0F;
			} else if (Static498.aClass14_Sub3_Sub16_3.anInt9281 == 50) {
				Static498.aFloat216 = 4.0F;
				Static498.aFloat217 = 4.0F;
			} else if (Static498.aClass14_Sub3_Sub16_3.anInt9281 == 75) {
				Static498.aFloat216 = 6.0F;
				Static498.aFloat217 = 6.0F;
			} else if (Static498.aClass14_Sub3_Sub16_3.anInt9281 == 100) {
				Static498.aFloat216 = 8.0F;
				Static498.aFloat217 = 8.0F;
			} else if (Static498.aClass14_Sub3_Sub16_3.anInt9281 == 200) {
				Static498.aFloat216 = 16.0F;
				Static498.aFloat217 = 16.0F;
			} else {
				Static498.aFloat216 = 8.0F;
				Static498.aFloat217 = 8.0F;
			}
			Static498.anInt8791 = (int) Static498.aFloat216 >> 1;
			Static498.aByteArrayArrayArray10 = Static243.method3622(Static498.anInt8791);
			Static27.method617();
			Static498.method7312();
			Static461.aClass262_48 = new Class262();
			Static498.anInt8792 += (int) (Math.random() * 5.0D) - 2;
			if (Static498.anInt8792 < -8) {
				Static498.anInt8792 = -8;
			}
			if (Static498.anInt8792 > 8) {
				Static498.anInt8792 = 8;
			}
			Static498.anInt8793 += (int) (Math.random() * 5.0D) - 2;
			if (Static498.anInt8793 < -16) {
				Static498.anInt8793 = -16;
			}
			if (Static498.anInt8793 > 16) {
				Static498.anInt8793 = 16;
			}
			Static498.method7305(arg0, Static498.anInt8792 >> 2 << 10, Static498.anInt8793 >> 1);
			Static498.aClass116_4.method2789(1024, 256);
			Static498.aClass83_5.method2076(256, 256);
			Static498.aClass13_5.method85(4096);
			Static427.aClass225_1.method5330(256);
			Static156.anInt3087 = 20;
		} else if (Static156.anInt3087 == 20) {
			Static221.method6307(true);
			Static498.method7292(arg1, Static498.anInt8792, Static498.anInt8793);
			Static156.anInt3087 = 60;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 60) {
			if (Static498.aClass386_108.method9209(Static498.aClass14_Sub3_Sub16_3.aString92 + "_staticelements")) {
				if (!Static498.aClass386_108.method9194(Static498.aClass14_Sub3_Sub16_3.aString92 + "_staticelements")) {
					return;
				}
				Static498.aClass294_2 = Static262.method3787(Static498.aClass386_108, Static498.aClass14_Sub3_Sub16_3.aString92 + "_staticelements", Static377.aBoolean495);
			} else {
				Static498.aClass294_2 = new Class294(0);
			}
			Static498.method7297();
			Static156.anInt3087 = 70;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 70) {
			Static222.aClass124_6 = new Class124(arg1, 11, true, Static68.aCanvas2);
			Static156.anInt3087 = 73;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 73) {
			Static177.aClass124_4 = new Class124(arg1, 12, true, Static68.aCanvas2);
			Static156.anInt3087 = 76;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 76) {
			Static218.aClass124_5 = new Class124(arg1, 14, true, Static68.aCanvas2);
			Static156.anInt3087 = 79;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 79) {
			Static104.aClass124_1 = new Class124(arg1, 17, true, Static68.aCanvas2);
			Static156.anInt3087 = 82;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 82) {
			Static125.aClass124_3 = new Class124(arg1, 19, true, Static68.aCanvas2);
			Static156.anInt3087 = 85;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 85) {
			Static115.aClass124_2 = new Class124(arg1, 22, true, Static68.aCanvas2);
			Static156.anInt3087 = 88;
			Static221.method6307(true);
			Static38.method849();
		} else if (Static156.anInt3087 == 88) {
			Static358.aClass124_7 = new Class124(arg1, 26, true, Static68.aCanvas2);
			Static156.anInt3087 = 91;
			Static221.method6307(true);
			Static38.method849();
		} else {
			Static625.aClass124_8 = new Class124(arg1, 30, true, Static68.aCanvas2);
			Static156.anInt3087 = 100;
			Static221.method6307(true);
			Static38.method849();
			System.gc();
		}
	}
}

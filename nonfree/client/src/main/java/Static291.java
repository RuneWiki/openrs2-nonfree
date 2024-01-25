import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_54 = new Class77(52, 2);

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_161 = new Class88("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!qa;Lclient!n;)V")
	public static void method4730(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Interface11 arg1) {
		if (Static2.aClass12_Sub4_Sub7_2 == null) {
			return;
		}
		if (Static22.anInt9607 < 10) {
			if (!Static2.aClass16_75.method419(Static2.aClass12_Sub4_Sub7_2.aString29)) {
				Static22.anInt9607 = Static224.aClass16_108.method382(Static2.aClass12_Sub4_Sub7_2.aString29) / 10;
				return;
			}
			Static101.method2099();
			Static22.anInt9607 = 10;
		}
		if (Static22.anInt9607 == 10) {
			Static2.anInt5914 = Static2.aClass12_Sub4_Sub7_2.anInt3097 >> 6 << 6;
			Static2.anInt5916 = Static2.aClass12_Sub4_Sub7_2.anInt3091 >> 6 << 6;
			Static2.anInt5911 = (Static2.aClass12_Sub4_Sub7_2.anInt3089 >> 6 << 6) - (Static2.anInt5916 - 64);
			Static2.anInt5920 = (Static2.aClass12_Sub4_Sub7_2.anInt3092 >> 6 << 6) + 64 - Static2.anInt5914;
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static2.aClass12_Sub4_Sub7_2.method2807(Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99, (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7) + Static61.anInt1459, local73, Static203.anInt4534 + (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7))) {
				local75 = local73[1] - Static2.anInt5916;
				local77 = local73[2] - Static2.anInt5914;
			}
			if (!Static381.aBoolean523 && local75 >= 0 && Static2.anInt5911 > local75 && local77 >= 0 && local77 < Static2.anInt5920) {
				local75 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static404.anInt7598 = local77;
				Static153.anInt3358 = local75;
			} else if (Static248.anInt5102 == -1 || Static414.anInt7740 == -1) {
				Static2.aClass12_Sub4_Sub7_2.method2806(local73, Static2.aClass12_Sub4_Sub7_2.anInt3098 & 0x3FFF, Static2.aClass12_Sub4_Sub7_2.anInt3098 >> 14 & 0x3FFF);
				Static404.anInt7598 = local73[2] - Static2.anInt5914;
				Static153.anInt3358 = local73[1] - Static2.anInt5916;
			} else {
				Static2.aClass12_Sub4_Sub7_2.method2806(local73, Static414.anInt7740, Static248.anInt5102);
				Static414.anInt7740 = -1;
				Static248.anInt5102 = -1;
				if (local73 != null) {
					Static153.anInt3358 = local73[1] - Static2.anInt5916;
					Static404.anInt7598 = local73[2] - Static2.anInt5914;
				}
				Static381.aBoolean523 = false;
			}
			if (Static2.aClass12_Sub4_Sub7_2.anInt3086 == 37) {
				Static2.aFloat123 = 3.0F;
				Static2.aFloat122 = 3.0F;
			} else if (Static2.aClass12_Sub4_Sub7_2.anInt3086 == 50) {
				Static2.aFloat123 = 4.0F;
				Static2.aFloat122 = 4.0F;
			} else if (Static2.aClass12_Sub4_Sub7_2.anInt3086 == 75) {
				Static2.aFloat123 = 6.0F;
				Static2.aFloat122 = 6.0F;
			} else if (Static2.aClass12_Sub4_Sub7_2.anInt3086 == 100) {
				Static2.aFloat123 = 8.0F;
				Static2.aFloat122 = 8.0F;
			} else if (Static2.aClass12_Sub4_Sub7_2.anInt3086 == 200) {
				Static2.aFloat123 = 16.0F;
				Static2.aFloat122 = 16.0F;
			} else {
				Static2.aFloat123 = 8.0F;
				Static2.aFloat122 = 8.0F;
			}
			Static2.anInt5909 = (int) Static2.aFloat123 >> 1;
			Static2.aByteArrayArrayArray17 = Static83.method1858(Static2.anInt5909);
			Static505.method7495();
			Static2.method4934();
			Static284.aClass73_46 = new Class73();
			Static2.anInt5908 += (int) (Math.random() * 5.0D) - 2;
			if (Static2.anInt5908 < -8) {
				Static2.anInt5908 = -8;
			}
			if (Static2.anInt5908 > 8) {
				Static2.anInt5908 = 8;
			}
			Static2.anInt5910 += (int) (Math.random() * 5.0D) - 2;
			if (Static2.anInt5910 < -16) {
				Static2.anInt5910 = -16;
			}
			if (Static2.anInt5910 > 16) {
				Static2.anInt5910 = 16;
			}
			Static2.method4943(arg1, Static2.anInt5908 >> 2 << 10, Static2.anInt5910 >> 1);
			Static2.aClass93_5.method2476(1024, 256);
			Static2.aClass292_3.method7211(256, 256);
			Static2.aClass155_3.method4067(4096);
			Static64.aClass296_10.method7293(256);
			Static22.anInt9607 = 20;
		} else if (Static22.anInt9607 == 20) {
			Static431.method6594(true);
			Static2.method4938(arg0, Static2.anInt5908, Static2.anInt5910);
			Static22.anInt9607 = 60;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 60) {
			if (Static2.aClass16_75.method390(Static2.aClass12_Sub4_Sub7_2.aString29 + "_staticelements")) {
				if (!Static2.aClass16_75.method419(Static2.aClass12_Sub4_Sub7_2.aString29 + "_staticelements")) {
					return;
				}
				Static2.aClass159_3 = Static530.method7862(Static2.aClass12_Sub4_Sub7_2.aString29 + "_staticelements", Static105.aBoolean204, Static2.aClass16_75);
			} else {
				Static2.aClass159_3 = new Class159(0);
			}
			Static2.method4945();
			Static22.anInt9607 = 70;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 70) {
			Static22.aClass17_46 = new Class17(arg0, 11, true, Static301.aCanvas11);
			Static22.anInt9607 = 73;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 73) {
			Static443.aClass17_38 = new Class17(arg0, 12, true, Static301.aCanvas11);
			Static22.anInt9607 = 76;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 76) {
			Static88.aClass17_5 = new Class17(arg0, 14, true, Static301.aCanvas11);
			Static22.anInt9607 = 79;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 79) {
			Static407.aClass17_35 = new Class17(arg0, 17, true, Static301.aCanvas11);
			Static22.anInt9607 = 82;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 82) {
			Static168.aClass17_43 = new Class17(arg0, 19, true, Static301.aCanvas11);
			Static22.anInt9607 = 85;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 85) {
			Static287.aClass17_27 = new Class17(arg0, 22, true, Static301.aCanvas11);
			Static22.anInt9607 = 88;
			Static431.method6594(true);
			Static403.method6323();
		} else if (Static22.anInt9607 == 88) {
			Static20.aClass17_1 = new Class17(arg0, 26, true, Static301.aCanvas11);
			Static22.anInt9607 = 91;
			Static431.method6594(true);
			Static403.method6323();
		} else {
			Static310.aClass17_44 = new Class17(arg0, 30, true, Static301.aCanvas11);
			Static22.anInt9607 = 100;
			Static431.method6594(true);
			Static403.method6323();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!daa;Z)Lclient!po;")
	public static Class182_Sub2 method4731(@OriginalArg(0) Class12_Sub8 arg0) {
		return new Class182_Sub2(arg0.method5217(), arg0.method5217(), arg0.method5217(), arg0.method5217(), arg0.method5195(), arg0.method5195(), arg0.method5216());
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Z")
	public static boolean method4732(@OriginalArg(1) int arg0) {
		if (Static126.aBooleanArray46[arg0]) {
			return true;
		} else if (Static314.aClass16_78.method412(arg0)) {
			@Pc(23) int local23 = Static314.aClass16_78.method399(arg0);
			if (local23 == 0) {
				Static126.aBooleanArray46[arg0] = true;
				return true;
			}
			if (Static71.aClass198ArrayArray1[arg0] == null) {
				Static71.aClass198ArrayArray1[arg0] = new Class198[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static71.aClass198ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static314.aClass16_78.method408(arg0, local45);
					if (local59 != null) {
						@Pc(71) Class198 local71 = Static71.aClass198ArrayArray1[arg0][local45] = new Class198();
						local71.anInt5739 = local45 + (arg0 << 16);
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method4805(new Class12_Sub8(local59));
					}
				}
			}
			Static126.aBooleanArray46[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

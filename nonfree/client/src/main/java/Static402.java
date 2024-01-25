import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "Lclient!me;")
	public static final Class211 aClass211_65 = new Class211(50);

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "Lclient!uaa;")
	public static final Class320 aClass320_10 = new Class320("RC", 1);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Z")
	public static boolean method8391(@OriginalArg(1) int arg0) {
		if (Static318.aBooleanArray27[arg0]) {
			return true;
		} else if (Static543.aClass254_130.method6397(arg0)) {
			@Pc(21) int local21 = Static543.aClass254_130.method6396(arg0);
			if (local21 == 0) {
				Static318.aBooleanArray27[arg0] = true;
				return true;
			}
			if (Static108.aClass305ArrayArray1[arg0] == null) {
				Static108.aClass305ArrayArray1[arg0] = new Class305[local21];
			}
			for (@Pc(48) int local48 = 0; local48 < local21; local48++) {
				if (Static108.aClass305ArrayArray1[arg0][local48] == null) {
					@Pc(61) byte[] local61 = Static543.aClass254_130.method6401(arg0, local48);
					if (local61 != null) {
						@Pc(73) Class305 local73 = Static108.aClass305ArrayArray1[arg0][local48] = new Class305();
						local73.anInt9167 = (arg0 << 16) + local48;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method7483(new Class3_Sub7(local61));
					}
				}
			}
			Static318.aBooleanArray27[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(JI)V")
	public static void method8392(@OriginalArg(0) long arg0) {
		if (Static580.aClass125ArrayArrayArray3 != null) {
			if (Static267.anInt5668 == 1 || Static267.anInt5668 == 5) {
				Static302.method5017(arg0);
			} else if (Static267.anInt5668 == 4) {
				Static34.method1073(arg0);
			}
		}
		Static533.method7862(Static546.aClass15_16, (long) Static129.anInt10429);
		if (Static25.anInt779 != -1) {
			Static101.method2147(Static25.anInt779);
		}
		for (@Pc(43) int local43 = 0; local43 < Static377.anInt7315; local43++) {
			if (Static518.aBooleanArray37[local43]) {
				Static52.aBooleanArray4[local43] = true;
			}
			Static296.aBooleanArray20[local43] = Static518.aBooleanArray37[local43];
			Static518.aBooleanArray37[local43] = false;
		}
		Static243.anInt5076 = Static129.anInt10429;
		if (Static546.aClass15_16.method5289()) {
			Static109.aBoolean199 = true;
		}
		if (Static25.anInt779 != -1) {
			Static377.anInt7315 = 0;
			Static123.method2495();
		}
		Static546.aClass15_16.F();
		Static281.method4852(Static546.aClass15_16);
		@Pc(89) int local89 = Static422.method6755();
		if (local89 == -1) {
			local89 = Static68.anInt1810;
		}
		if (local89 == -1) {
			local89 = Static395.anInt4652;
		}
		Static310.method5164(local89);
		Static220.method3785(Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396, Static377.anInt7320, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103);
		Static377.anInt7320 = 0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8393(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static67.method8230(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < Static403.anInt7927; local28++) {
			@Pc(33) String local33 = Class21_Sub3.lb[local28];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static67.method8230(local33);
			if (local33 != null && local33.equals(local18)) {
				Static403.anInt7927--;
				for (@Pc(57) int local57 = local28; local57 < Static403.anInt7927; local57++) {
					Class21_Sub3.lb[local57] = Class21_Sub3.lb[local57 + 1];
					Static197.aStringArray16[local57] = Static197.aStringArray16[local57 + 1];
					Static406.aStringArray28[local57] = Static406.aStringArray28[local57 + 1];
					Static199.aStringArray18[local57] = Static199.aStringArray18[local57 + 1];
					Static420.aBooleanArray31[local57] = Static420.aBooleanArray31[local57 + 1];
				}
				Static257.anInt5521 = Static509.anInt9418;
				@Pc(117) Class3_Sub9 local117 = Static587.method8316(Static187.aClass40_2, Static345.aClass230_69);
				local117.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(arg0));
				local117.aClass3_Sub7_Sub1_1.method6516(arg0);
				Static230.method3933(local117);
				return;
			}
		}
	}
}

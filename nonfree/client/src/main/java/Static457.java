import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!jo;")
	public static Class168 aClass168_105;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!pi;ZI)V")
	public static void method7112(@OriginalArg(0) Class11_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static205.anInt4369 >= 400) {
			return;
		}
		if (arg0 != Static350.aClass11_Sub1_Sub1_Sub2_4) {
			@Pc(166) String local166;
			@Pc(102) int local102;
			if (arg0.anInt7463 == 0) {
				@Pc(57) boolean local57 = true;
				if (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7454 != -1 && arg0.anInt7454 != -1) {
					@Pc(80) int local80 = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453 <= arg0.anInt7453 ? arg0.anInt7453 : Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453;
					@Pc(91) int local91 = arg0.anInt7454 <= Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7454 ? arg0.anInt7454 : Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7454;
					local102 = local80 * 10 / 100 + local91 + 5;
					@Pc(108) int local108 = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453 - arg0.anInt7453;
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local108 > local102) {
						local57 = false;
					}
				}
				@Pc(131) String local131 = Static38.aClass162_1 == Static303.aClass162_2 ? Static222.aClass152_75.method4002(Static286.anInt5468) : Static222.aClass152_73.method4002(Static286.anInt5468);
				if (arg0.anInt7453 >= arg0.anInt7443) {
					local166 = arg0.method6223() + (local57 ? Static453.method6920(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453, arg0.anInt7453) : "<col=ffffff>") + " (" + local131 + arg0.anInt7453 + ")";
				} else {
					local166 = arg0.method6223() + (local57 ? Static453.method6920(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453, arg0.anInt7453) : "<col=ffffff>") + " (" + local131 + arg0.anInt7453 + "+" + (arg0.anInt7443 - arg0.anInt7453) + ")";
				}
			} else if (arg0.anInt7463 == -1) {
				local166 = arg0.method6223();
			} else {
				local166 = arg0.method6223() + " (" + Static222.aClass152_74.method4002(Static286.anInt5468) + arg0.anInt7463 + ")";
			}
			if (Static25.aBoolean80 && !arg1 && (Static429.anInt7864 & 0x8) != 0) {
				Static232.method4112(false, -1, Static568.aString113 + " -> <col=ffffff>" + local166, 0, true, 0, (long) arg0.anInt7392, Static467.aString104, 4, Static567.anInt7672);
			}
			if (arg1) {
				Static232.method4112(true, 0, "", 0, false, 0, 0L, "<col=cccccc>" + local166, -1, -1);
			} else {
				for (@Pc(302) int local302 = 7; local302 >= 0; local302--) {
					if (Static301.aStringArray31[local302] != null) {
						@Pc(310) short local310 = 0;
						if (Static476.aClass162_3 == Static38.aClass162_1 && Static301.aStringArray31[local302].equalsIgnoreCase(Static222.aClass152_68.method4002(Static286.anInt5468))) {
							if (arg0.anInt7453 > Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453) {
								local310 = 2000;
							}
							if (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7466 != 0 && arg0.anInt7466 != 0) {
								if (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7466 == arg0.anInt7466) {
									local310 = 2000;
								} else {
									local310 = 0;
								}
							}
						} else if (Static194.aBooleanArray12[local302]) {
							local310 = 2000;
						}
						@Pc(361) short local361 = (short) (local310 + Static163.aShortArray36[local302]);
						local102 = Static396.anIntArray529[local302] == -1 ? Static553.anInt9423 : Static396.anIntArray529[local302];
						Static232.method4112(false, -1, "<col=ffffff>" + local166, 0, true, 0, (long) arg0.anInt7392, Static301.aStringArray31[local302], local361, local102);
					}
				}
			}
			if (!arg1) {
				for (@Pc(408) Class6_Sub42 local408 = (Class6_Sub42) Static207.aClass211_29.method5183(); local408 != null; local408 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
					if (local408.anInt8285 == 9) {
						local408.aString101 = "<col=ffffff>" + local166;
						break;
					}
				}
			}
		} else if (Static25.aBoolean80 && (Static429.anInt7864 & 0x10) != 0) {
			Static232.method4112(false, -1, Static568.aString113 + " -> <col=ffffff>" + Static222.aClass152_82.method4002(Static286.anInt5468), 0, true, 0, 0L, Static467.aString104, 49, Static567.anInt7672);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method7114() {
		for (@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) Static284.aClass211_39.method5183(); local6 != null; local6 = (Class6_Sub2) Static284.aClass211_39.method5177()) {
			if (local6.aBoolean35) {
				local6.method636();
			}
		}
		for (@Pc(35) Class6_Sub2 local35 = (Class6_Sub2) Static299.aClass211_43.method5183(); local35 != null; local35 = (Class6_Sub2) Static299.aClass211_43.method5177()) {
			if (local35.aBoolean35) {
				local35.method636();
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
	public static boolean method7117(@OriginalArg(0) int arg0) {
		if (Static87.aBooleanArray7[arg0]) {
			return true;
		} else if (Static313.aClass168_109.method4446(arg0)) {
			@Pc(28) int local28 = Static313.aClass168_109.method4443(arg0);
			if (local28 == 0) {
				Static87.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static336.aClass93ArrayArray2[arg0] == null) {
				Static336.aClass93ArrayArray2[arg0] = new Class93[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static336.aClass93ArrayArray2[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static313.aClass168_109.method4435(local50, arg0);
					if (local64 != null) {
						@Pc(76) Class93 local76 = Static336.aClass93ArrayArray2[arg0][local50] = new Class93();
						local76.anInt2790 = (arg0 << 16) + local50;
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method2502(new Class6_Sub26(local64));
					}
				}
			}
			Static87.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!iaa;)V")
	public static void method7118(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static367.aClass318_1 != null) {
			@Pc(20) int local20;
			try {
				Static367.aClass318_1.method7606(0L);
				Static367.aClass318_1.method7604(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4939(24, local8);
	}
}

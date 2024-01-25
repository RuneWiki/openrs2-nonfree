import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
	public static int anInt6156;

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
	public static int anInt6157;

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
	public static void method5152() {
		if (!Static506.aBoolean659) {
			return;
		}
		@Pc(11) Class245 local11 = Static80.method1631(Static508.anInt8865, Static448.anInt8198);
		if (local11 != null && local11.anObjectArray27 != null) {
			@Pc(20) Class3_Sub21 local20 = new Class3_Sub21();
			local20.anObjectArray4 = local11.anObjectArray27;
			local20.aClass245_8 = local11;
			Static60.method1227(local20);
		}
		Static506.aBoolean659 = false;
		Static7.anInt488 = -1;
		Static113.anInt2478 = -1;
		if (local11 != null) {
			Static31.method809(local11);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IBZI)V")
	public static void method5153(@OriginalArg(2) boolean arg0) {
		Static466.anInt8389 = 2;
		Static8.aBoolean56 = arg0;
		Static361.anInt6755 = 22050;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
	public static void method5154() {
		if (Static422.anInt8667 == -1) {
			return;
		}
		@Pc(14) int local14 = Static35.aClass54_1.method4074();
		@Pc(18) int local18 = Static35.aClass54_1.method4071();
		@Pc(27) Class3_Sub19 local27 = (Class3_Sub19) Static71.aClass71_16.method2089();
		if (local27 != null) {
			local14 = local27.method4956();
			local18 = local27.method4957();
		}
		Static110.method2116(0, 0, 0, local14, local18, 0, Static412.anInt7547, Static422.anInt8667, Static480.anInt8652);
		if (Static303.aClass245_11 != null) {
			Static126.method2230(local18, local14);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZILclient!eca;)V")
	public static void method5155(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class6_Sub1_Sub2_Sub1 arg1) {
		if (Static179.anInt4933 >= 400) {
			return;
		}
		if (arg1 != Static111.aClass6_Sub1_Sub2_Sub1_3) {
			@Pc(171) String local171;
			@Pc(102) int local102;
			if (arg1.anInt2309 == 0) {
				@Pc(53) boolean local53 = true;
				if (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2291 != -1 && arg1.anInt2291 != -1) {
					@Pc(76) int local76 = arg1.anInt2302 >= Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302 ? arg1.anInt2302 : Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302;
					@Pc(91) int local91 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2291 < arg1.anInt2291 ? Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2291 : arg1.anInt2291;
					local102 = local91 + local76 * 10 / 100 + 5;
					@Pc(109) int local109 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302 - arg1.anInt2302;
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local109 > local102) {
						local53 = false;
					}
				}
				@Pc(136) String local136 = Static222.aClass44_2 == Static332.aClass44_4 ? Static98.aClass67_30.method1934(Static193.anInt7803) : Static464.aClass67_137.method1934(Static193.anInt7803);
				if (arg1.anInt2284 <= arg1.anInt2302) {
					local171 = arg1.method2052() + (local53 ? Static275.method4763(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302, arg1.anInt2302) : "<col=ffffff>") + " (" + local136 + arg1.anInt2302 + ")";
				} else {
					local171 = arg1.method2052() + (local53 ? Static275.method4763(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302, arg1.anInt2302) : "<col=ffffff>") + " (" + local136 + arg1.anInt2302 + "+" + (arg1.anInt2284 - arg1.anInt2302) + ")";
				}
			} else if (arg1.anInt2309 == -1) {
				local171 = arg1.method2052();
			} else {
				local171 = arg1.method2052() + " (" + Static359.aClass67_107.method1934(Static193.anInt7803) + arg1.anInt2309 + ")";
			}
			if (Static506.aBoolean659 && !arg0 && (Static170.anInt3907 & 0x8) != 0) {
				Static507.method7642(true, Static117.aString29 + " -> <col=ffffff>" + local171, -1, Static88.aString19, Static46.anInt1080, 0, 0, false, 46, (long) arg1.anInt8587);
			}
			if (arg0) {
				Static507.method7642(false, "", 0, "<col=cccccc>" + local171, -1, 0, 0, true, -1, 0L);
			} else {
				for (@Pc(310) int local310 = 7; local310 >= 0; local310--) {
					if (Static521.aStringArray50[local310] != null) {
						@Pc(318) short local318 = 0;
						if (Static222.aClass44_2 == Static8.aClass44_1 && Static521.aStringArray50[local310].equalsIgnoreCase(Static298.aClass67_152.method1934(Static193.anInt7803))) {
							if (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302 < arg1.anInt2302) {
								local318 = 2000;
							}
							if (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2318 != 0 && arg1.anInt2318 != 0) {
								if (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2318 == arg1.anInt2318) {
									local318 = 2000;
								} else {
									local318 = 0;
								}
							}
						} else if (Static184.aBooleanArray21[local310]) {
							local318 = 2000;
						}
						@Pc(382) short local382 = (short) (Static393.aShortArray180[local310] + local318);
						local102 = Static486.anIntArray673[local310] == -1 ? Static182.anInt4203 : Static486.anIntArray673[local310];
						Static507.method7642(true, "<col=ffffff>" + local171, -1, Static521.aStringArray50[local310], local102, 0, 0, false, local382, (long) arg1.anInt8587);
					}
				}
			}
			if (!arg0) {
				for (@Pc(429) Class3_Sub11 local429 = (Class3_Sub11) Static255.aClass71_43.method2089(); local429 != null; local429 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
					if (local429.anInt1419 == 21) {
						local429.aString16 = "<col=ffffff>" + local171;
						return;
					}
				}
			}
		} else if (Static506.aBoolean659 && (Static170.anInt3907 & 0x10) != 0) {
			Static507.method7642(true, Static117.aString29 + " -> <col=ffffff>" + Static85.aClass67_25.method1934(Static193.anInt7803), -1, Static88.aString19, Static46.anInt1080, 0, 0, false, 45, 0L);
		}
	}
}

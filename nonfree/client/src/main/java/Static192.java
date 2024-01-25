import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
	public static int anInt3868;

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
	public static int anInt3871;

	@OriginalMember(owner = "client!ma", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "[I")
	public static final int[] anIntArray291 = new int[1000];

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
	public static void method3608(@OriginalArg(1) int arg0) {
		Static215.anInt4292 = arg0;
		Static368.anInt7056 = 3;
		Static105.anInt2414 = -1;
		Static227.anInt4587 = 100;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	public static void method3609() {
		@Pc(5) Class21 local5 = Static110.aClass21_71;
		synchronized (Static110.aClass21_71) {
			Static110.aClass21_71.method844(5);
		}
		local5 = Static161.aClass21_91;
		synchronized (Static161.aClass21_91) {
			Static161.aClass21_91.method844(5);
		}
		local5 = Static168.aClass21_97;
		synchronized (Static168.aClass21_97) {
			Static168.aClass21_97.method844(5);
		}
		local5 = Static300.aClass21_152;
		synchronized (Static300.aClass21_152) {
			Static300.aClass21_152.method844(5);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
	public static void method3610(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg0, 16);
		local13.method3481();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3611(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static195.anInt3948 >= 100 && !Static285.aBoolean359 || Static195.anInt3948 >= 200) {
			Static91.method6076(Static242.aClass106_171.method2927(Static254.anInt5172));
			return;
		}
		@Pc(29) String local29 = Static267.method4817(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static195.anInt3948; local34++) {
			@Pc(42) String local42 = Static267.method4817(Static247.aStringArray29[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static91.method6076(arg0 + Static361.aClass106_234.method2927(Static254.anInt5172));
				return;
			}
			if (Static160.aStringArray14[local34] != null) {
				local72 = Static267.method4817(Static160.aStringArray14[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static91.method6076(arg0 + Static361.aClass106_234.method2927(Static254.anInt5172));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static216.anInt4293; local104++) {
			local72 = Static267.method4817(Static150.aStringArray32[local104]);
			if (local72 != null && local72.equals(local29)) {
				Static91.method6076(Static268.aClass106_183.method2927(Static254.anInt5172) + arg0 + Static248.aClass106_175.method2927(Static254.anInt5172));
				return;
			}
			if (Static322.aStringArray39[local104] != null) {
				@Pc(149) String local149 = Static267.method4817(Static322.aStringArray39[local104]);
				if (local149 != null && local149.equals(local29)) {
					Static91.method6076(Static268.aClass106_183.method2927(Static254.anInt5172) + arg0 + Static248.aClass106_175.method2927(Static254.anInt5172));
					return;
				}
			}
		}
		if (Static267.method4817(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63).equals(local29)) {
			Static91.method6076(Static312.aClass106_208.method2927(Static254.anInt5172));
		} else {
			Static280.method5009(Static127.aClass18_94);
			Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(arg0));
			Static339.aClass1_Sub7_Sub2_4.method2106(arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!fp;IIII)V")
	public static void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg1.method4566(arg0, arg3, arg0 + arg4, arg2 + arg3);
		arg1.method4639(arg3, arg0, arg2, -16777216, arg4);
		if (Static141.anInt3042 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static269.anInt3321 / (float) Static269.anInt3324;
		@Pc(38) int local38 = arg4;
		@Pc(40) int local40 = arg2;
		if (local36 < 1.0F) {
			local40 = (int) ((float) arg4 * local36);
		} else {
			local38 = (int) ((float) arg2 / local36);
		}
		@Pc(66) int local66 = arg0 + (arg4 - local38) / 2;
		@Pc(75) int local75 = arg3 + (arg2 - local40) / 2;
		if (Static53.aClass4_5 == null || Static53.aClass4_5.method5962() != arg4 || Static53.aClass4_5.method5952() != arg2) {
			Static269.method3039(Static269.anInt3320, Static269.anInt3314 + Static269.anInt3321, Static269.anInt3324 + Static269.anInt3320, Static269.anInt3314, local66, local75, local38 + local66, local40 + local75);
			Static269.method3061(arg1);
			Static53.aClass4_5 = arg1.method4612(local66, local75, local38, local40, false);
		}
		Static53.aClass4_5.method5948(local66, local75);
		@Pc(123) int local123 = Static120.anInt2631 * local38 / Static269.anInt3324;
		@Pc(133) int local133 = local40 * Static64.anInt6831 / Static269.anInt3321;
		@Pc(141) int local141 = Static87.anInt1922 * local38 / Static269.anInt3324 + local66;
		@Pc(155) int local155 = local40 + local75 - local133 - local40 * Static13.anInt335 / Static269.anInt3321;
		@Pc(157) int local157 = -1996554240;
		if (Static285.aClass81_4 == Static215.aClass81_2) {
			local157 = -1996488705;
		}
		arg1.method4653(local141, local155, local123, local133, local157, 1);
		arg1.method4645(local141, local155, local123, local133, local157, 0);
		if (Static368.anInt7056 <= 0) {
			return;
		}
		@Pc(190) int local190;
		if (Static227.anInt4587 <= 50) {
			local190 = Static227.anInt4587 * 5;
		} else {
			local190 = (100 - Static227.anInt4587) * 5;
		}
		for (@Pc(204) Class1_Sub17 local204 = (Class1_Sub17) Static269.aClass42_21.method1543(); local204 != null; local204 = (Class1_Sub17) Static269.aClass42_21.method1551()) {
			@Pc(213) Class194 local213 = Static226.method4184(local204.anInt1640);
			if (Static284.method5723(local213)) {
				@Pc(243) int local243;
				@Pc(255) int local255;
				if (local204.anInt1640 == Static215.anInt4292) {
					local243 = local204.anInt1641 * local38 / Static269.anInt3324 + local66;
					local255 = local40 * (Static269.anInt3321 - local204.anInt1651) / Static269.anInt3321 + local75;
					arg1.method4639(local255 - 2, local243 + -2, 4, local190 << 24 | 0xFFFF00, 4);
				} else if (Static105.anInt2414 != -1 && Static105.anInt2414 == local213.anInt5848) {
					local243 = local38 * local204.anInt1641 / Static269.anInt3324 + local66;
					local255 = local75 + local40 * (Static269.anInt3321 - local204.anInt1651) / Static269.anInt3321;
					arg1.method4639(local255 - 2, local243 - 2, 4, local190 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}
}

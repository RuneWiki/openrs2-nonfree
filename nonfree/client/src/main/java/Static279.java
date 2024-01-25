import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	public static int anInt4906;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public static void method3929() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static71.anInt1410; local9++) {
			for (@Pc(15) int local15 = 0; local15 < Static471.anInt8012; local15++) {
				if (Static501.method7000(true, local9, local15, local7, Static292.aClass39ArrayArrayArray2)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!r;Lclient!wba;III)V")
	public static void method3930(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class353 arg1) {
		Static497.aClass353_44.method7680();
		if (Static333.aBoolean449) {
			return;
		}
		for (@Pc(21) Class1_Sub32 local21 = (Class1_Sub32) arg1.method7677(); local21 != null; local21 = (Class1_Sub32) arg1.method7687()) {
			@Pc(29) Class310 local29 = Static226.aClass273_2.method5840(local21.anInt5300);
			if (Static245.method3670(local29)) {
				@Pc(43) boolean local43 = Static65.method1178(arg0, local29, local21);
				if (local43) {
					Static473.method6472(local21, arg0, local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method3931(@OriginalArg(0) Class134 arg0) {
		if (Static337.anInt8004 < 2 && !Static573.aBoolean740 || Static93.aClass341_8 != null) {
			return;
		}
		@Pc(40) String local40;
		if (Static573.aBoolean740 && Static337.anInt8004 < 2) {
			local40 = Static302.aString46 + Static568.aClass351_36.method7651(Static307.anInt5279) + Static593.aString101 + " ->";
		} else if (Static197.aBoolean491 && Static137.aClass295_1.method7719(81) && Static337.anInt8004 > 2) {
			local40 = Static243.method3634((Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286.aClass1_286);
		} else {
			@Pc(59) Class1_Sub51 local59 = (Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286;
			local40 = Static243.method3634(local59);
			@Pc(65) int[] local65 = null;
			if (Static195.method2977(local59.anInt9638)) {
				local65 = Static175.aClass114_4.method2217((int) local59.aLong302).anIntArray503;
			} else if (local59.anInt9643 != -1) {
				local65 = Static175.aClass114_4.method2217(local59.anInt9643).anIntArray503;
			} else if (Static416.method5728(local59.anInt9638)) {
				@Pc(96) Class1_Sub42 local96 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local59.aLong302);
				if (local96 != null) {
					@Pc(101) Class8_Sub3_Sub3_Sub1_Sub2 local101 = local96.aClass8_Sub3_Sub3_Sub1_Sub2_2;
					@Pc(104) Class20 local104 = local101.aClass20_1;
					if (local104.anIntArray40 != null) {
						local104 = local104.method284(Static430.aClass321_1);
					}
					if (local104 != null) {
						local65 = local104.anIntArray39;
					}
				}
			} else if (Static270.method3853(local59.anInt9638)) {
				@Pc(142) Class95 local142;
				if (local59.anInt9638 == 1001) {
					local142 = Static518.aClass96_4.method1925((int) local59.aLong302);
				} else {
					local142 = Static518.aClass96_4.method1925((int) (local59.aLong302 >>> 32 & 0x7FFFFFFFL));
				}
				if (local142.anIntArray208 != null) {
					local142 = local142.method1922(Static430.aClass321_1);
				}
				if (local142 != null) {
					local65 = local142.anIntArray207;
				}
			}
			if (local65 != null) {
				local40 = local40 + Static31.method424(local65);
			}
		}
		if (Static337.anInt8004 > 2) {
			local40 = local40 + "<col=ffffff> / " + (Static337.anInt8004 - 2) + Static568.aClass351_29.method7651(Static307.anInt5279);
		}
		if (Static497.aClass341_16 != null) {
			@Pc(231) Class64 local231 = Static497.aClass341_16.method7575(arg0);
			if (local231 == null) {
				local231 = Static418.aClass64_11;
			}
			local231.method6609(Static360.aRandom3, Static497.aClass341_16.anInt9240, Static497.aClass341_16.anInt9282, Static497.aClass341_16.anInt9318, Static248.anIntArray358, Static485.anInt8173, Static497.aClass341_16.anInt9300, Static104.aClass22Array5, Static497.aClass341_16.anInt9248, Static497.aClass341_16.anInt9303, Static550.anIntArray689, local40, Static247.anInt4537, Static410.anInt7111);
			Static14.method148(Static248.anIntArray358[1], Static248.anIntArray358[0], Static248.anIntArray358[3], Static248.anIntArray358[2]);
		} else if (Static64.aClass341_5 != null && Static184.aClass195_1 == Static246.aClass195_2) {
			@Pc(296) int local296 = Static418.aClass64_11.method6610(Static104.aClass22Array5, Static302.anInt5240 + 16, Static360.aRandom3, Static410.anInt7111, Static202.anInt4030 + 4, Static550.anIntArray689, local40);
			Static14.method148(Static302.anInt5240, Static202.anInt4030 + 4, 16, local296 + Static373.aClass334_13.method7354(local40));
		}
	}
}

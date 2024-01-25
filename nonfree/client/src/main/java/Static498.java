import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	public static int anInt9232;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
	public static int anInt9231 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZIIII)V")
	public static void method7726(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static232.aFrame1 != null && (arg3 != 3 || arg1 != Static122.anInt10527 || arg4 != Static345.anInt6919)) {
			Static265.method4893(Static232.aFrame1, Static268.aClass370_3);
			Static232.aFrame1 = null;
		}
		if (arg3 == 3 && Static232.aFrame1 == null) {
			Static232.aFrame1 = Static320.method5564(arg4, arg1, Static268.aClass370_3, 0);
			if (Static232.aFrame1 != null) {
				Static122.anInt10527 = arg1;
				Static345.anInt6919 = arg4;
				Static318.method5531();
			}
		}
		if (arg3 == 3 && Static232.aFrame1 == null) {
			method7726(true, -1, arg2, Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919(), -1);
			return;
		}
		@Pc(77) Container local77;
		@Pc(102) Insets local102;
		if (Static232.aFrame1 != null) {
			Static330.anInt6688 = arg4;
			Static584.anInt5338 = arg1;
			local77 = Static232.aFrame1;
		} else if (Static255.aFrame2 == null) {
			if (Static334.anApplet2 == null) {
				local77 = Static297.anApplet_Sub1_1;
			} else {
				local77 = Static334.anApplet2;
			}
			Static584.anInt5338 = local77.getSize().width;
			Static330.anInt6688 = local77.getSize().height;
		} else {
			local102 = Static255.aFrame2.getInsets();
			@Pc(108) int local108 = -local102.left;
			Static584.anInt5338 = Static255.aFrame2.getSize().width + local108 - local102.right;
			@Pc(123) int local123 = local102.top + local102.bottom;
			Static330.anInt6688 = Static255.aFrame2.getSize().height - local123;
			local77 = Static255.aFrame2;
		}
		if (arg3 == 1) {
			Static81.anInt2497 = Static326.anInt6591;
			Static423.anInt7984 = Static467.anInt8715;
			Static57.anInt1928 = (Static584.anInt5338 - Static326.anInt6591) / 2;
			Static110.anInt3008 = 0;
		} else {
			Static190.method3911();
		}
		if (Static448.aClass107_7 != Static193.aClass107_2) {
			@Pc(161) boolean local161;
			if (Static81.anInt2497 < 1024 && Static423.anInt7984 < 768) {
				local161 = true;
			} else {
				local161 = false;
			}
		}
		if (arg0) {
			Static634.method9197();
		} else {
			Static639.aCanvas10.setSize(Static81.anInt2497, Static423.anInt7984);
			if (Static487.aBoolean676) {
				Static502.method7993(Static639.aCanvas10);
			} else {
				Static186.aClass20_4.method7272(Static639.aCanvas10, Static81.anInt2497, Static423.anInt7984);
			}
			if (Static255.aFrame2 == local77) {
				local102 = Static255.aFrame2.getInsets();
				Static639.aCanvas10.setLocation(Static57.anInt1928 + local102.left, local102.top - -Static110.anInt3008);
			} else {
				Static639.aCanvas10.setLocation(Static57.anInt1928, Static110.anInt3008);
			}
		}
		if (arg3 < 2) {
			Static172.aBoolean306 = false;
		} else {
			Static172.aBoolean306 = true;
		}
		if (Static475.anInt10143 != -1) {
			Static527.method9032(true);
		}
		if (Static272.aClass116_1 != null && Static104.method2676(Static529.anInt9623)) {
			Static101.method2659();
		}
		for (@Pc(235) int local235 = 0; local235 < 100; local235++) {
			Static403.aBooleanArray18[local235] = true;
		}
		Static249.aBoolean394 = true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IC)Z")
	public static boolean method7727(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public static void method7728() {
		try {
			@Pc(16) int local16;
			if (Static614.anInt10750 == 1) {
				local16 = Static341.aClass2_Sub8_Sub3_4.method5786();
				if (local16 > 0 && Static341.aClass2_Sub8_Sub3_4.method5802()) {
					local16 -= Static436.anInt8106;
					if (local16 < 0) {
						local16 = 0;
					}
					Static341.aClass2_Sub8_Sub3_4.method5803(local16);
					return;
				}
				Static341.aClass2_Sub8_Sub3_4.method5819();
				Static341.aClass2_Sub8_Sub3_4.method5809();
				Static393.aClass138_1 = null;
				if (Static42.aClass157_33 == null) {
					Static614.anInt10750 = 0;
				} else {
					Static614.anInt10750 = 2;
				}
				Static605.aClass2_Sub14_11 = null;
			}
			if (Static614.anInt10750 == 3) {
				local16 = Static341.aClass2_Sub8_Sub3_4.method5786();
				if (local16 < Static267.anInt5676 && Static341.aClass2_Sub8_Sub3_4.method5802()) {
					local16 += Static92.anInt2680;
					if (local16 > Static267.anInt5676) {
						local16 = Static267.anInt5676;
					}
					Static341.aClass2_Sub8_Sub3_4.method5803(local16);
				} else {
					Static92.anInt2680 = 0;
					Static614.anInt10750 = 0;
				}
			}
		} catch (@Pc(101) Exception local101) {
			local101.printStackTrace();
			Static341.aClass2_Sub8_Sub3_4.method5819();
			Static42.aClass157_33 = null;
			Static605.aClass2_Sub14_11 = null;
			Static603.aClass2_Sub8_Sub3_5 = null;
			Static393.aClass138_1 = null;
			Static614.anInt10750 = 0;
		}
	}
}

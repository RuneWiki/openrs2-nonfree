import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	public static int anInt5651;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIIIB)V")
	public static void method5065(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static95.aFrame1 != null && (arg4 != 3 || arg3 != Static12.anInt146 || arg2 != Static192.anInt7406)) {
			Static35.method561(Static95.aFrame1, Static681.aClass349_6);
			Static95.aFrame1 = null;
		}
		if (arg4 == 3 && Static95.aFrame1 == null) {
			Static95.aFrame1 = Static258.method4239(arg3, 0, Static681.aClass349_6, arg2);
			if (Static95.aFrame1 != null) {
				Static192.anInt7406 = arg2;
				Static12.anInt146 = arg3;
				Static111.method1655();
			}
		}
		if (arg4 == 3 && Static95.aFrame1 == null) {
			method5065(true, arg1, -1, -1, Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610());
			return;
		}
		@Pc(99) Container local99;
		@Pc(116) Insets local116;
		if (Static95.aFrame1 != null) {
			local99 = Static95.aFrame1;
			Static166.anInt3250 = arg3;
			Static249.anInt4342 = arg2;
		} else if (Static207.aFrame2 == null) {
			if (Static265.anApplet2 == null) {
				local99 = Static597.anApplet_Sub1_1;
			} else {
				local99 = Static265.anApplet2;
			}
			Static166.anInt3250 = local99.getSize().width;
			Static249.anInt4342 = local99.getSize().height;
		} else {
			local116 = Static207.aFrame2.getInsets();
			Static166.anInt3250 = Static207.aFrame2.getSize().width - local116.left - local116.right;
			@Pc(134) int local134 = local116.bottom + local116.top;
			Static249.anInt4342 = Static207.aFrame2.getSize().height - local134;
			local99 = Static207.aFrame2;
		}
		if (arg4 == 1) {
			Static304.anInt5288 = (Static166.anInt3250 - Static592.anInt9548) / 2;
			Static517.anInt8215 = 0;
			Static85.anInt9921 = Static592.anInt9548;
			Static256.anInt4629 = Static401.anInt6745;
		} else {
			Static37.method8306();
		}
		if (Static387.aClass242_8 != Static670.aClass242_7) {
			@Pc(186) boolean local186;
			if (Static85.anInt9921 < 1024 && Static256.anInt4629 < 768) {
				local186 = true;
			} else {
				local186 = false;
			}
		}
		if (arg0) {
			Static595.method8191();
		} else {
			Static357.aCanvas8.setSize(Static85.anInt9921, Static256.anInt4629);
			if (Static377.aBoolean419) {
				Static553.method7513(Static357.aCanvas8);
			} else {
				Static273.aClass100_6.method8614(Static357.aCanvas8, Static85.anInt9921, Static256.anInt4629);
			}
			if (local99 == Static207.aFrame2) {
				local116 = Static207.aFrame2.getInsets();
				Static357.aCanvas8.setLocation(local116.left + Static304.anInt5288, Static517.anInt8215 + local116.top);
			} else {
				Static357.aCanvas8.setLocation(Static304.anInt5288, Static517.anInt8215);
			}
		}
		if (arg4 >= 2) {
			Static149.aBoolean219 = true;
		} else {
			Static149.aBoolean219 = false;
		}
		if (Static381.anInt6411 != -1) {
			Static417.method6129(true);
		}
		if (Static4.aClass389_17.aClass50_2 != null && Static372.method5547(Static652.anInt10664)) {
			Static18.method271();
		}
		for (@Pc(280) int local280 = 0; local280 < 100; local280++) {
			Static325.aBooleanArray15[local280] = true;
		}
		Static538.aBoolean565 = true;
	}
}

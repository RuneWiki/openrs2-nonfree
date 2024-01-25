import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "Lclient!de;")
	public static final Class70 aClass70_6 = new Class70();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIII)V")
	public static void method9121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static628.aFrame3 != null && (arg3 != 3 || Static398.anInt7332 != arg1 || arg0 != Static383.anInt7041)) {
			Static100.method1801(Static628.aFrame3, Static234.aClass333_5);
			Static628.aFrame3 = null;
		}
		if (arg3 == 3 && Static628.aFrame3 == null) {
			Static628.aFrame3 = Static494.method7323(Static234.aClass333_5, 0, arg0, arg1);
			if (Static628.aFrame3 != null) {
				Static398.anInt7332 = arg1;
				Static383.anInt7041 = arg0;
				Static169.method2762();
			}
		}
		if (arg3 == 3 && Static628.aFrame3 == null) {
			method9121(-1, -1, true, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081(), arg4);
			return;
		}
		@Pc(83) Container local83;
		@Pc(100) Insets local100;
		if (Static628.aFrame3 != null) {
			local83 = Static628.aFrame3;
			Static69.anInt1570 = arg1;
			Static572.anInt9840 = arg0;
		} else if (Static339.aFrame2 == null) {
			if (Static645.anApplet2 == null) {
				local83 = Static164.anApplet_Sub1_1;
			} else {
				local83 = Static645.anApplet2;
			}
			Static69.anInt1570 = local83.getSize().width;
			Static572.anInt9840 = local83.getSize().height;
		} else {
			local100 = Static339.aFrame2.getInsets();
			Static69.anInt1570 = Static339.aFrame2.getSize().width - local100.left - local100.right;
			Static572.anInt9840 = Static339.aFrame2.getSize().height - local100.top - local100.bottom;
			local83 = Static339.aFrame2;
		}
		if (arg3 == 1) {
			Static639.anInt10685 = Static297.anInt5240;
			Static535.anInt9235 = (Static69.anInt1570 - Static258.anInt4461) / 2;
			Static406.anInt7435 = 0;
			Static561.anInt9759 = Static258.anInt4461;
		} else {
			Static437.method6437();
		}
		if (Static420.aClass240_5 != Static513.aClass240_7) {
			@Pc(164) boolean local164;
			if (Static561.anInt9759 < 1024 && Static639.anInt10685 < 768) {
				local164 = true;
			} else {
				local164 = false;
			}
		}
		if (arg2) {
			Static349.method5325();
		} else {
			Static68.aCanvas2.setSize(Static561.anInt9759, Static639.anInt10685);
			if (Static128.aBoolean202) {
				Static127.method2103(Static68.aCanvas2);
			} else {
				Static677.aClass137_47.method7898(Static68.aCanvas2, Static561.anInt9759, Static639.anInt10685);
			}
			if (Static339.aFrame2 == local83) {
				local100 = Static339.aFrame2.getInsets();
				Static68.aCanvas2.setLocation(Static535.anInt9235 + local100.left, Static406.anInt7435 + local100.top);
			} else {
				Static68.aCanvas2.setLocation(Static535.anInt9235, Static406.anInt7435);
			}
		}
		if (arg3 < 2) {
			Static24.aBoolean32 = false;
		} else {
			Static24.aBoolean32 = true;
		}
		if (Static563.anInt9769 != -1) {
			Static552.method7778(true);
		}
		if (Static258.aClass97_2 != null && Static177.method2836(Static430.anInt7691)) {
			Static615.method8633();
		}
		for (@Pc(240) int local240 = 0; local240 < 100; local240++) {
			Static446.aBooleanArray18[local240] = true;
		}
		Static43.aBoolean92 = true;
	}
}

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_70 = new Class269(62, 3);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIBII)V")
	public static void method6005(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static275.aFrame2 != null && (arg3 != 3 || arg1 != Static457.anInt7976 || Static44.anInt970 != arg2)) {
			Static360.method5509(Static375.aClass359_4, Static275.aFrame2);
			Static275.aFrame2 = null;
		}
		if (arg3 == 3 && Static275.aFrame2 == null) {
			Static275.aFrame2 = Static282.method4460(Static375.aClass359_4, arg1, arg2, 0);
			if (Static275.aFrame2 != null) {
				Static457.anInt7976 = arg1;
				Static44.anInt970 = arg2;
				Static209.method3628();
			}
		}
		if (arg3 == 3 && Static275.aFrame2 == null) {
			method6005(true, -1, -1, Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189(), arg4);
			return;
		}
		@Pc(73) Container local73;
		@Pc(97) Insets local97;
		if (Static275.aFrame2 != null) {
			Static547.anInt9285 = arg2;
			local73 = Static275.aFrame2;
			Static519.anInt8672 = arg1;
		} else if (Static503.aFrame3 == null) {
			if (Static234.anApplet2 == null) {
				local73 = Static493.anApplet_Sub1_1;
			} else {
				local73 = Static234.anApplet2;
			}
			Static519.anInt8672 = local73.getSize().width;
			Static547.anInt9285 = local73.getSize().height;
		} else {
			local97 = Static503.aFrame3.getInsets();
			@Pc(103) int local103 = -local97.right;
			Static519.anInt8672 = Static503.aFrame3.getSize().width + local103 - local97.left;
			@Pc(117) int local117 = local97.bottom + local97.top;
			Static547.anInt9285 = Static503.aFrame3.getSize().height - local117;
			local73 = Static503.aFrame3;
		}
		if (arg3 == 1) {
			Static571.anInt9399 = Static386.anInt6961;
			Static386.anInt6957 = 0;
			Static480.anInt8253 = (Static519.anInt8672 - Static386.anInt6961) / 2;
			Static585.anInt9606 = Static135.anInt3053;
		} else {
			Static587.method8111();
		}
		if (Static267.aClass86_7 != Static95.aClass86_5) {
			@Pc(154) boolean local154;
			if (Static571.anInt9399 < 1024 && Static585.anInt9606 < 768) {
				local154 = true;
			} else {
				local154 = false;
			}
		}
		if (arg0) {
			Static24.method590();
		} else {
			Static147.aCanvas5.setSize(Static571.anInt9399, Static585.anInt9606);
			if (Static558.aBoolean680) {
				Static362.method5517(Static147.aCanvas5);
			} else {
				Static600.aClass87_15.method7924(Static147.aCanvas5, Static571.anInt9399, Static585.anInt9606);
			}
			if (Static503.aFrame3 == local73) {
				local97 = Static503.aFrame3.getInsets();
				Static147.aCanvas5.setLocation(local97.left + Static480.anInt8253, Static386.anInt6957 + local97.top);
			} else {
				Static147.aCanvas5.setLocation(Static480.anInt8253, Static386.anInt6957);
			}
		}
		if (arg3 < 2) {
			Static402.aBoolean478 = false;
		} else {
			Static402.aBoolean478 = true;
		}
		if (Static387.anInt6978 != -1) {
			Static146.method2807(true);
		}
		if (Static439.aClass210_1 != null && Static86.method1553(Static538.anInt8985)) {
			Static501.method7137();
		}
		for (@Pc(228) int local228 = 0; local228 < 100; local228++) {
			Static618.aBooleanArray50[local228] = true;
		}
		Static85.aBoolean151 = true;
	}
}

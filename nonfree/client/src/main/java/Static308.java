import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZB)V")
	public static void method4788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static147.aFrame1 != null && (arg2 != 3 || Static480.aClass6_Sub37_Sub1_1.anInt6057 != arg3 || Static480.aClass6_Sub37_Sub1_1.anInt6066 != arg1)) {
			Static158.method2320(Static152.aClass57_4, Static147.aFrame1);
			Static147.aFrame1 = null;
		}
		if (arg2 == 3 && Static147.aFrame1 == null) {
			Static147.aFrame1 = Static376.method5516(Static152.aClass57_4, arg3, arg1, 0);
			if (Static147.aFrame1 != null) {
				Static480.aClass6_Sub37_Sub1_1.anInt6066 = arg1;
				Static480.aClass6_Sub37_Sub1_1.anInt6057 = arg3;
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
			}
		}
		if (arg2 == 3 && Static147.aFrame1 == null) {
			method4788(arg0, -1, Static480.aClass6_Sub37_Sub1_1.anInt6045, -1, true);
			return;
		}
		@Pc(83) Container local83;
		@Pc(90) Insets local90;
		if (Static147.aFrame1 != null) {
			Static544.anInt9196 = arg3;
			Static371.anInt6408 = arg1;
			local83 = Static147.aFrame1;
		} else if (Static183.aFrame2 == null) {
			if (Static189.anApplet4 == null) {
				local83 = Static2.anApplet_Sub1_1;
			} else {
				local83 = Static189.anApplet4;
			}
			Static544.anInt9196 = local83.getSize().width;
			Static371.anInt6408 = local83.getSize().height;
		} else {
			local90 = Static183.aFrame2.getInsets();
			Static544.anInt9196 = Static183.aFrame2.getSize().width - local90.left - local90.right;
			Static371.anInt6408 = Static183.aFrame2.getSize().height - local90.bottom - local90.top;
			local83 = Static183.aFrame2;
		}
		if (arg2 == 1) {
			Static141.anInt2538 = 0;
			Static502.anInt8364 = Static282.anInt4679;
			Static411.anInt7204 = (Static544.anInt9196 - Static282.anInt4679) / 2;
			Static476.anInt8045 = Static381.anInt6587;
		} else {
			Static201.method5199();
		}
		if (Static376.aClass287_6 != Static192.aClass287_3) {
			@Pc(168) boolean local168;
			if (Static502.anInt8364 < 1024 && Static476.anInt8045 < 768) {
				local168 = true;
			} else {
				local168 = false;
			}
		}
		if (arg4) {
			Static229.method3374();
		} else {
			Static34.aCanvas15.setSize(Static502.anInt8364, Static476.anInt8045);
			Static176.aClass121_5.method7156(Static34.aCanvas15);
			if (Static183.aFrame2 == local83) {
				local90 = Static183.aFrame2.getInsets();
				Static34.aCanvas15.setLocation(local90.left + Static411.anInt7204, local90.top - -Static141.anInt2538);
			} else {
				Static34.aCanvas15.setLocation(Static411.anInt7204, Static141.anInt2538);
			}
		}
		if (arg2 >= 2) {
			Static456.aBoolean533 = true;
		} else {
			Static456.aBoolean533 = false;
		}
		if (Static487.anInt8139 != -1) {
			Static59.method46(true);
		}
		if (Static225.aClass71_1 != null && Static179.method2711(Static146.anInt2581)) {
			Static507.method6978();
		}
		for (@Pc(236) int local236 = 0; local236 < 100; local236++) {
			Static258.aBooleanArray27[local236] = true;
		}
		Static506.aBoolean578 = true;
	}
}

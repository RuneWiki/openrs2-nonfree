import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
	public static int anInt9313;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIIIII)V")
	public static void method7701(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static255.aFrame3 != null && (arg2 != 3 || arg1 != Static479.aClass1_Sub7_Sub1_1.anInt3117 || arg4 != Static479.aClass1_Sub7_Sub1_1.anInt3089)) {
			Static67.method1437(Static246.aClass114_10, Static255.aFrame3);
			Static255.aFrame3 = null;
		}
		if (arg2 == 3 && Static255.aFrame3 == null) {
			Static255.aFrame3 = Static75.method1617(arg4, 0, Static246.aClass114_10, arg1);
			if (Static255.aFrame3 != null) {
				Static479.aClass1_Sub7_Sub1_1.anInt3089 = arg4;
				Static479.aClass1_Sub7_Sub1_1.anInt3117 = arg1;
				Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
			}
		}
		if (arg2 == 3 && Static255.aFrame3 == null) {
			method7701(true, -1, Static479.aClass1_Sub7_Sub1_1.anInt3097, arg3, -1);
			return;
		}
		@Pc(104) Container local104;
		@Pc(82) Insets local82;
		if (Static255.aFrame3 != null) {
			Static20.anInt611 = arg4;
			Static309.anInt5589 = arg1;
			local104 = Static255.aFrame3;
		} else if (Static208.aFrame4 == null) {
			if (Static412.anApplet1 == null) {
				local104 = Static229.anApplet_Sub1_20;
			} else {
				local104 = Static412.anApplet1;
			}
			Static309.anInt5589 = local104.getSize().width;
			Static20.anInt611 = local104.getSize().height;
		} else {
			local82 = Static208.aFrame4.getInsets();
			@Pc(90) int local90 = local82.left + local82.right;
			Static309.anInt5589 = Static208.aFrame4.getSize().width - local90;
			Static20.anInt611 = Static208.aFrame4.getSize().height - local82.top - local82.bottom;
			local104 = Static208.aFrame4;
		}
		if (arg2 == 1) {
			Static443.anInt7718 = Static483.anInt8133;
			Static300.anInt5516 = Static443.anInt7712;
			Static393.anInt6807 = (Static309.anInt5589 - Static483.anInt8133) / 2;
			Static377.anInt6644 = 0;
		} else {
			Static241.method3956();
		}
		if (Static122.aClass218_4 != Static253.aClass218_6) {
			@Pc(164) boolean local164;
			if (Static443.anInt7718 < 1024 && Static300.anInt5516 < 768) {
				local164 = true;
			} else {
				local164 = false;
			}
		}
		if (arg0) {
			Static25.method617();
		} else {
			Static26.aCanvas3.setSize(Static443.anInt7718, Static300.anInt5516);
			Static136.aClass12_8.method6395(Static26.aCanvas3);
			if (Static208.aFrame4 == local104) {
				local82 = Static208.aFrame4.getInsets();
				Static26.aCanvas3.setLocation(local82.left + Static393.anInt6807, local82.top - -Static377.anInt6644);
			} else {
				Static26.aCanvas3.setLocation(Static393.anInt6807, Static377.anInt6644);
			}
		}
		if (arg2 >= 2) {
			Static126.aBoolean476 = true;
		} else {
			Static126.aBoolean476 = false;
		}
		if (Static219.anInt4263 != -1) {
			Static261.method4073(true);
		}
		if (Static400.aClass75_3 != null && Static304.method4711(Static177.anInt2101)) {
			Static567.method7642();
		}
		for (@Pc(232) int local232 = 0; local232 < 100; local232++) {
			Static510.aBooleanArray29[local232] = true;
		}
		Static327.aBoolean420 = true;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
	public static boolean method7702(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}

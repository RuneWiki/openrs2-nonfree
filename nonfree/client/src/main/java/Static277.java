import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_134 = new Class102(52, 4);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public static void method3721() {
		if (Static300.aFrame4 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static261.aFrame3 == null) {
			local12 = Static79.aClass183_2.anApplet1;
		} else {
			local12 = Static261.aFrame3;
		}
		Static155.anInt2673 = local12.getSize().width;
		Static324.anInt5540 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (Static261.aFrame3 == local12) {
			local31 = Static261.aFrame3.getInsets();
			Static155.anInt2673 -= local31.right + local31.left;
			Static324.anInt5540 -= local31.top + local31.bottom;
		}
		if (Static284.method3772() == 1) {
			Static314.anInt5426 = Static18.anInt3419;
			Static287.anInt4720 = 0;
			Static7.anInt125 = (Static155.anInt2673 - Static90.anInt1755) / 2;
			Static141.anInt2513 = Static90.anInt1755;
		} else if (Static177.anInt3052 < 96 && Static288.anInt4743 == 0) {
			@Pc(75) int local75 = Static155.anInt2673 > 1024 ? 1024 : Static155.anInt2673;
			@Pc(84) int local84 = Static324.anInt5540 > 768 ? 768 : Static324.anInt5540;
			Static141.anInt2513 = local75;
			Static7.anInt125 = (Static155.anInt2673 - local75) / 2;
			Static287.anInt4720 = 0;
			Static314.anInt5426 = local84;
		} else {
			Static287.anInt4720 = 0;
			Static7.anInt125 = 0;
			Static141.anInt2513 = Static155.anInt2673;
			Static314.anInt5426 = Static324.anInt5540;
		}
		if (Static260.aClass258_7 != Static60.aClass258_1) {
			@Pc(134) boolean local134;
			if (Static141.anInt2513 < 1024 && Static314.anInt5426 < 768) {
				local134 = true;
			} else {
				local134 = false;
			}
		}
		Static286.aCanvas4.setSize(Static141.anInt2513, Static314.anInt5426);
		if (Static82.aClass163_1 != null) {
			Static82.aClass163_1.method5519(Static286.aCanvas4);
		}
		if (local12 == Static261.aFrame3) {
			local31 = Static261.aFrame3.getInsets();
			Static286.aCanvas4.setLocation(Static7.anInt125 + local31.left, local31.top + Static287.anInt4720);
		} else {
			Static286.aCanvas4.setLocation(Static7.anInt125, Static287.anInt4720);
		}
		if (Static142.anInt2523 != -1) {
			Static129.method1930(true);
		}
		Static61.method903();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLclient!za;J)V")
	public static void method3722(@OriginalArg(1) Class163 arg0, @OriginalArg(2) long arg1) {
		Static28.anInt558 = Static164.anInt4842;
		Static420.anInt6869 = 0;
		Static164.anInt4842 = 0;
		@Pc(23) long local23 = Static110.method1702();
		for (@Pc(28) Class21_Sub2 local28 = (Class21_Sub2) Static343.aClass93_6.method2080(); local28 != null; local28 = (Class21_Sub2) Static343.aClass93_6.method2081()) {
			if (local28.method631(arg0, arg1)) {
				Static420.anInt6869++;
			}
		}
		if (Static75.aBoolean114 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static343.aClass93_6.method2082() + ", running: " + Static420.anInt6869 + ". Particles: " + Static164.anInt4842 + ". Time taken: " + (Static110.method1702() - local23) + "ms");
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILclient!bp;Lclient!bp;)V")
	public static void method3723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub3 arg3, @OriginalArg(4) Class3_Sub3 arg4) {
		@Pc(4) Class270 local4 = Static62.method926(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub3_2 = arg3;
			local4.aClass3_Sub3_3 = arg4;
		}
	}
}

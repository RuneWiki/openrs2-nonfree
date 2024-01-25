import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!en", name = "j", descriptor = "Lclient!ij;")
	public static Class93 aClass93_27;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "I")
	public static int anInt1458 = -1;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "[I")
	public static final int[] anIntArray118 = new int[250];

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	public static int anInt1460 = -2;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method1401() {
		Static174.aClass2_1.method1431();
		Static316.aClass118_3.method4049();
		if (Static142.aClass79_1 != null) {
			Static142.aClass79_1.method4267(Static102.aCanvas3);
		}
		Static138.aClient1.method695();
		Static102.aCanvas3.setBackground(Color.black);
		Static70.anInt1368 = -1;
		Static174.aClass2_1 = Static87.method1564(Static102.aCanvas3);
		Static316.aClass118_3 = Static179.method3201(Static102.aCanvas3);
		if (Static142.aClass79_1 != null) {
			Static142.aClass79_1.method4264(Static102.aCanvas3);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
	public static int method1402(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static316.method4312(arg0);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)V")
	public static void method1403(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 6);
		local8.method856();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	public static void method1405() {
		if (Static110.aFrame4 != null) {
			return;
		}
		@Pc(11) Container local11;
		if (Static60.aFrame3 == null) {
			local11 = Static182.aClass139_5.anApplet1;
		} else {
			local11 = Static60.aFrame3;
		}
		Static1.anInt9 = local11.getSize().width;
		Static32.anInt632 = local11.getSize().height;
		@Pc(28) Insets local28;
		if (local11 == Static60.aFrame3) {
			local28 = Static60.aFrame3.getInsets();
			Static1.anInt9 -= local28.left + local28.right;
			Static32.anInt632 -= local28.bottom + local28.top;
		}
		if (Static101.method1804() == 1) {
			Static134.anInt2040 = 0;
			Static168.anInt3376 = 765;
			Static84.anInt4252 = (Static1.anInt9 - 765) / 2;
			Static256.anInt5066 = 503;
		} else if (Static345.anInt6645 < 96 && Static342.anInt6605 == 0) {
			@Pc(68) int local68 = Static1.anInt9 <= 1024 ? Static1.anInt9 : 1024;
			Static168.anInt3376 = local68;
			Static84.anInt4252 = (Static1.anInt9 - local68) / 2;
			@Pc(84) int local84 = Static32.anInt632 > 768 ? 768 : Static32.anInt632;
			Static256.anInt5066 = local84;
			Static134.anInt2040 = 0;
		} else {
			Static84.anInt4252 = 0;
			Static134.anInt2040 = 0;
			Static168.anInt3376 = Static1.anInt9;
			Static256.anInt5066 = Static32.anInt632;
		}
		if (Static351.anInt6735 != 0) {
			@Pc(124) boolean local124;
			if (Static168.anInt3376 < 1024 && Static256.anInt5066 < 768) {
				local124 = true;
			} else {
				local124 = false;
			}
		}
		Static102.aCanvas3.setSize(Static168.anInt3376, Static256.anInt5066);
		if (Static236.aClass55_9 != null) {
			Static236.aClass55_9.method5171();
		}
		if (Static60.aFrame3 == local11) {
			local28 = Static60.aFrame3.getInsets();
			Static102.aCanvas3.setLocation(Static84.anInt4252 + local28.left, local28.top - -Static134.anInt2040);
		} else {
			Static102.aCanvas3.setLocation(Static84.anInt4252, Static134.anInt2040);
		}
		if (Static32.anInt628 != -1) {
			Static43.method6040(true);
		}
		Static1.method2();
	}
}

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[[Lclient!ria;")
	public static Class303[][] aClass303ArrayArray1;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!hm;")
	public static final Class151 aClass151_6 = new Class151(3, 2);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZIIII)V")
	public static void method4310(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static18.aFrame1 != null && (arg3 != 3 || Static222.anInt4146 != arg1 || arg2 != Static604.anInt9993)) {
			Static554.method7826(Static18.aFrame1, Static265.aClass286_3);
			Static18.aFrame1 = null;
		}
		if (arg3 == 3 && Static18.aFrame1 == null) {
			Static18.aFrame1 = Static146.method2608(arg2, Static265.aClass286_3, arg1, 0);
			if (Static18.aFrame1 != null) {
				Static222.anInt4146 = arg1;
				Static604.anInt9993 = arg2;
				Static531.method7366();
			}
		}
		if (arg3 == 3 && Static18.aFrame1 == null) {
			method4310(true, -1, -1, Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520(), arg4);
			return;
		}
		@Pc(75) Container local75;
		@Pc(90) Insets local90;
		if (Static18.aFrame1 != null) {
			Static16.anInt323 = arg2;
			local75 = Static18.aFrame1;
			Static334.anInt5861 = arg1;
		} else if (Static80.aFrame2 == null) {
			if (Static107.anApplet1 == null) {
				local75 = Static253.anApplet_Sub1_1;
			} else {
				local75 = Static107.anApplet1;
			}
			Static334.anInt5861 = local75.getSize().width;
			Static16.anInt323 = local75.getSize().height;
		} else {
			local90 = Static80.aFrame2.getInsets();
			Static334.anInt5861 = Static80.aFrame2.getSize().width - local90.left - local90.right;
			Static16.anInt323 = Static80.aFrame2.getSize().height - local90.top - local90.bottom;
			local75 = Static80.aFrame2;
		}
		if (arg3 == 1) {
			Static1.anInt8341 = (Static334.anInt5861 - Static143.anInt2998) / 2;
			Static500.anInt8002 = 0;
			Class16_Sub1_Sub5_Sub1.lb = Static143.anInt2998;
			Static71.anInt1925 = Static478.anInt7732;
		} else {
			Static92.method1891();
		}
		if (Static242.aClass373_4 != Static392.aClass373_6) {
			@Pc(151) boolean local151;
			if (Class16_Sub1_Sub5_Sub1.lb < 1024 && Static71.anInt1925 < 768) {
				local151 = true;
			} else {
				local151 = false;
			}
		}
		if (arg0) {
			Static366.method5448();
		} else {
			Static150.aCanvas4.setSize(Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
			if (Static148.aBoolean241) {
				Static316.method4868(Static150.aCanvas4);
			} else {
				Static141.aClass13_27.method8131(Static150.aCanvas4, Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
			}
			if (Static80.aFrame2 == local75) {
				local90 = Static80.aFrame2.getInsets();
				Static150.aCanvas4.setLocation(local90.left + Static1.anInt8341, local90.top - -Static500.anInt8002);
			} else {
				Static150.aCanvas4.setLocation(Static1.anInt8341, Static500.anInt8002);
			}
		}
		if (arg3 >= 2) {
			Static107.aBoolean189 = true;
		} else {
			Static107.aBoolean189 = false;
		}
		if (Static592.anInt9857 != -1) {
			Static403.method6011(true);
		}
		if (Static341.aClass22_4 != null && Static19.method522(Static454.anInt7416)) {
			Static516.method7302();
		}
		for (@Pc(226) int local226 = 0; local226 < 100; local226++) {
			Static377.aBooleanArray14[local226] = true;
		}
		Static201.aBoolean297 = true;
	}
}

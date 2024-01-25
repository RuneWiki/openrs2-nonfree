import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!ha;")
	public static Class13 aClass13_27;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "Lclient!av;")
	public static final Class25 aClass25_1 = new Class25(false);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!av;")
	public static Class25 aClass25_2 = aClass25_1;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!hm;")
	public static final Class151 aClass151_3 = new Class151(1, 2);

	@OriginalMember(owner = "client!es", name = "g", descriptor = "F")
	public static float aFloat60 = 1.0F;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
	public static final int[] anIntArray192 = new int[32];

	@OriginalMember(owner = "client!es", name = "j", descriptor = "I")
	public static int anInt2982 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public static void method2564(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub52 local10 = (Class2_Sub52) Static560.aClass323_36.method7484((long) arg0);
		if (local10 != null) {
			local10.aClass161_Sub1_1.method3862();
			Static2.method57(local10.anInt10449, local10.aBoolean762);
			local10.method8920();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public static void method2565() {
		@Pc(7) client local7 = Static509.aClient1;
		synchronized (Static509.aClient1) {
			if (Static18.aFrame1 == null) {
				@Pc(23) Container local23;
				if (Static80.aFrame2 != null) {
					local23 = Static80.aFrame2;
				} else if (Static107.anApplet1 == null) {
					local23 = Static253.anApplet_Sub1_1;
				} else {
					local23 = Static107.anApplet1;
				}
				Static334.anInt5861 = local23.getSize().width;
				Static16.anInt323 = local23.getSize().height;
				@Pc(47) Insets local47;
				if (local23 == Static80.aFrame2) {
					local47 = Static80.aFrame2.getInsets();
					Static334.anInt5861 -= local47.right + local47.left;
					Static16.anInt323 -= local47.bottom + local47.top;
				}
				if (Static402.method6006() == 1) {
					Static1.anInt8341 = (Static334.anInt5861 - Static143.anInt2998) / 2;
					Static500.anInt8002 = 0;
					Static71.anInt1925 = Static478.anInt7732;
					Class16_Sub1_Sub5_Sub1.lb = Static143.anInt2998;
				} else {
					Static92.method1891();
				}
				if (Static242.aClass373_4 != Static392.aClass373_6) {
					@Pc(97) boolean local97;
					if (Class16_Sub1_Sub5_Sub1.lb < 1024 && Static71.anInt1925 < 768) {
						local97 = true;
					} else {
						local97 = false;
					}
				}
				Static150.aCanvas4.setSize(Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
				if (aClass13_27 != null) {
					if (Static148.aBoolean241) {
						Static316.method4868(Static150.aCanvas4);
					} else {
						aClass13_27.method8131(Static150.aCanvas4, Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
					}
				}
				if (local23 == Static80.aFrame2) {
					local47 = Static80.aFrame2.getInsets();
					Static150.aCanvas4.setLocation(Static1.anInt8341 + local47.left, local47.top - -Static500.anInt8002);
				} else {
					Static150.aCanvas4.setLocation(Static1.anInt8341, Static500.anInt8002);
				}
				if (Static592.anInt9857 != -1) {
					Static403.method6011(true);
				}
				Static123.method2208();
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Z")
	public static boolean method2567() {
		Static406.anInt6903++;
		Static441.aBoolean524 = true;
		return true;
	}
}

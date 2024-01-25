import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	public static int anInt156;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	public static int anInt155 = 0;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString11 = "Take";

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString12 = "Discard";

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public static void method142() {
		if (Static191.anInt3822 == 0) {
			return;
		}
		try {
			if (++Static259.anInt5012 > 1500) {
				if (Static193.aClass61_1 != null) {
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
				}
				if (Static251.anInt6256 >= 1) {
					Static191.anInt3822 = 0;
					Static346.anInt6535 = -5;
					return;
				}
				if (Static129.anInt2832 == Static221.anInt4410) {
					Static221.anInt4410 = Static4.anInt75;
				} else {
					Static221.anInt4410 = Static129.anInt2832;
				}
				Static191.anInt3822 = 1;
				Static259.anInt5012 = 0;
				Static251.anInt6256++;
			}
			if (Static191.anInt3822 == 1) {
				Static233.aClass99_8 = Static116.aClass21_4.method380(Static221.anInt4410, Static56.aString109);
				Static191.anInt3822 = 2;
			}
			@Pc(120) int local120;
			if (Static191.anInt3822 == 2) {
				if (Static233.aClass99_8.anInt2836 == 2) {
					throw new IOException();
				}
				if (Static233.aClass99_8.anInt2836 != 1) {
					return;
				}
				Static193.aClass61_1 = new Class61((Socket) Static233.aClass99_8.anObject2, Static116.aClass21_4);
				Static233.aClass99_8 = null;
				Static193.aClass61_1.method1377(Static29.aClass7_Sub3_Sub2_1.aByteArray33, Static29.aClass7_Sub3_Sub2_1.anInt3005);
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				local120 = Static193.aClass61_1.method1382();
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				if (local120 != 101) {
					Static191.anInt3822 = 0;
					Static346.anInt6535 = local120;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
					return;
				}
				Static191.anInt3822 = 3;
			}
			if (Static191.anInt3822 == 3 && Static193.aClass61_1.method1372() >= 2) {
				local120 = Static193.aClass61_1.method1382() << 8 | Static193.aClass61_1.method1382();
				Static48.method4690(local120);
				if (Static65.anInt1630 == -1) {
					Static346.anInt6535 = 6;
					Static191.anInt3822 = 0;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
				} else {
					Static191.anInt3822 = 0;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
					Static314.method5101();
				}
			}
		} catch (@Pc(197) IOException local197) {
			if (Static193.aClass61_1 != null) {
				Static193.aClass61_1.method1376();
				Static193.aClass61_1 = null;
			}
			if (Static251.anInt6256 < 1) {
				Static259.anInt5012 = 0;
				Static251.anInt6256++;
				if (Static221.anInt4410 == Static129.anInt2832) {
					Static221.anInt4410 = Static4.anInt75;
				} else {
					Static221.anInt4410 = Static129.anInt2832;
				}
				Static191.anInt3822 = 1;
			} else {
				Static346.anInt6535 = -4;
				Static191.anInt3822 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method143() {
		Static319.aClass146_1 = new Class146(8);
		Static177.anInt3631 = 0;
		for (@Pc(15) Class36_Sub3 local15 = (Class36_Sub3) Static111.aClass191_2.method4862(); local15 != null; local15 = (Class36_Sub3) Static111.aClass191_2.method4869()) {
			local15.method2179();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
	public static void method144() {
		Static96.method1987(Static41.anInt1075);
	}
}

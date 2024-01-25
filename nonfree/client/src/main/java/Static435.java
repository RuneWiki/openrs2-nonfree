import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
	public static int anInt7845;

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "[I")
	public static int[] anIntArray479;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "Lclient!ew;")
	public static final Class99 aClass99_20 = new Class99();

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	public static int anInt7846 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIIII)V")
	public static void method6793(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static4.aFrame1 != null && (arg2 != 3 || Static227.anInt4277 != arg4 || arg3 != Static75.anInt1790)) {
			Static261.method4323(Static205.aClass138_2, Static4.aFrame1);
			Static4.aFrame1 = null;
		}
		if (arg2 == 3 && Static4.aFrame1 == null) {
			Static4.aFrame1 = Static153.method2808(0, arg3, Static205.aClass138_2, arg4);
			if (Static4.aFrame1 != null) {
				Static227.anInt4277 = arg4;
				Static75.anInt1790 = arg3;
				Static108.method2177();
			}
		}
		if (arg2 == 3 && Static4.aFrame1 == null) {
			method6793(true, arg1, Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086(), -1, -1);
			return;
		}
		@Pc(75) Container local75;
		@Pc(92) Insets local92;
		if (Static4.aFrame1 != null) {
			local75 = Static4.aFrame1;
			Static73.anInt1757 = arg3;
			Static463.anInt7087 = arg4;
		} else if (Static209.aFrame3 == null) {
			if (Static504.anApplet2 == null) {
				local75 = Static128.anApplet_Sub1_1;
			} else {
				local75 = Static504.anApplet2;
			}
			Static463.anInt7087 = local75.getSize().width;
			Static73.anInt1757 = local75.getSize().height;
		} else {
			local92 = Static209.aFrame3.getInsets();
			@Pc(98) int local98 = -local92.left;
			Static463.anInt7087 = Static209.aFrame3.getSize().width + local98 - local92.right;
			Static73.anInt1757 = Static209.aFrame3.getSize().height - local92.bottom - local92.top;
			local75 = Static209.aFrame3;
		}
		if (arg2 == 1) {
			Static603.anInt9836 = 0;
			Static349.anInt6748 = (Static463.anInt7087 - Static612.anInt9912) / 2;
			Static109.anInt2357 = Static612.anInt9912;
			Static330.anInt6165 = Static90.anInt2181;
		} else {
			Static276.method4490();
		}
		if (Static2.aClass135_1 != Static42.aClass135_2) {
			@Pc(160) boolean local160;
			if (Static109.anInt2357 < 1024 && Static330.anInt6165 < 768) {
				local160 = true;
			} else {
				local160 = false;
			}
		}
		if (arg0) {
			Static1.method8296();
		} else {
			Static364.aCanvas13.setSize(Static109.anInt2357, Static330.anInt6165);
			if (Static219.aBoolean285) {
				Static312.method5142(Static364.aCanvas13);
			} else {
				Static323.aClass5_9.method7554(Static364.aCanvas13, Static109.anInt2357, Static330.anInt6165);
			}
			if (local75 == Static209.aFrame3) {
				local92 = Static209.aFrame3.getInsets();
				Static364.aCanvas13.setLocation(local92.left + Static349.anInt6748, Static603.anInt9836 + local92.top);
			} else {
				Static364.aCanvas13.setLocation(Static349.anInt6748, Static603.anInt9836);
			}
		}
		if (arg2 < 2) {
			Static550.aBoolean530 = false;
		} else {
			Static550.aBoolean530 = true;
		}
		if (Static307.anInt5465 != -1) {
			Static422.method6616(true);
		}
		if (Static413.aClass230_1 != null && Static2.method22(Static485.anInt8420)) {
			Static48.method1426();
		}
		for (@Pc(243) int local243 = 0; local243 < 100; local243++) {
			Static477.aBooleanArray21[local243] = true;
		}
		Static20.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V")
	public static void method6794() {
		for (@Pc(13) int local13 = 0; local13 < Static393.anInt7276; local13++) {
			@Pc(19) Class371 local19 = Static508.aClass371Array1[local13];
			if (local19.aByte129 == 3) {
				if (local19.aClass3_Sub7_Sub3_4 == null) {
					local19.anInt10065 = Integer.MIN_VALUE;
				} else {
					Static204.aClass3_Sub7_Sub1_1.method1621(local19.aClass3_Sub7_Sub3_4);
				}
			}
		}
	}
}

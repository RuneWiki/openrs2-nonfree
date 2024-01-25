import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Lclient!qk;")
	public static Class195 aClass195_2;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_36 = new Class183();

	@OriginalMember(owner = "client!op", name = "r", descriptor = "J")
	public static long aLong177 = -1L;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "Lclient!qt;")
	public static Class199 aClass199_8 = null;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "[I")
	public static final int[] anIntArray343 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!op", name = "C", descriptor = "I")
	public static int anInt5255 = 0;

	@OriginalMember(owner = "client!op", name = "D", descriptor = "[I")
	public static final int[] anIntArray344 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIBIZI)V")
	public static void method4020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static320.aFrame3 != null && (arg0 != 3 || arg2 != Static323.aClass50_Sub1_1.anInt3431 || Static323.aClass50_Sub1_1.anInt3450 != arg4)) {
			Static446.method5620(Static206.aClass66_4, Static320.aFrame3);
			Static320.aFrame3 = null;
		}
		if (arg0 == 3 && Static320.aFrame3 == null) {
			Static320.aFrame3 = Static8.method86(arg2, Static206.aClass66_4, arg4, 0);
			if (Static320.aFrame3 != null) {
				Static323.aClass50_Sub1_1.anInt3431 = arg2;
				Static323.aClass50_Sub1_1.anInt3450 = arg4;
				Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
			}
		}
		if (arg0 == 3 && Static320.aFrame3 == null) {
			method4020(Static323.aClass50_Sub1_1.anInt3447, arg1, -1, true, -1);
			return;
		}
		@Pc(78) Container local78;
		@Pc(91) Insets local91;
		if (Static320.aFrame3 != null) {
			Static17.anInt222 = arg4;
			local78 = Static320.aFrame3;
			Static425.anInt7000 = arg2;
		} else if (Static226.aFrame1 == null) {
			local78 = Static206.aClass66_4.anApplet1;
			Static425.anInt7000 = local78.getSize().width;
			Static17.anInt222 = local78.getSize().height;
		} else {
			local91 = Static226.aFrame1.getInsets();
			Static425.anInt7000 = Static226.aFrame1.getSize().width - local91.left - local91.right;
			@Pc(108) int local108 = -local91.bottom;
			Static17.anInt222 = Static226.aFrame1.getSize().height + local108 - local91.top;
			local78 = Static226.aFrame1;
		}
		@Pc(166) int local166;
		if (arg0 == 1) {
			Static303.anInt5363 = 0;
			Static302.anInt5346 = Static157.anInt3148;
			Static230.anInt4424 = (Static425.anInt7000 - Static353.anInt6121) / 2;
			Static141.anInt2881 = Static353.anInt6121;
		} else if (Static70.anInt1503 < 96 && Static177.anInt2973 == 0) {
			local166 = Static425.anInt7000 > 1024 ? 1024 : Static425.anInt7000;
			@Pc(173) int local173 = Static17.anInt222 > 768 ? 768 : Static17.anInt222;
			Static230.anInt4424 = (Static425.anInt7000 - local166) / 2;
			Static141.anInt2881 = local166;
			Static302.anInt5346 = local173;
			Static303.anInt5363 = 0;
		} else {
			Static141.anInt2881 = Static425.anInt7000;
			Static303.anInt5363 = 0;
			Static302.anInt5346 = Static17.anInt222;
			Static230.anInt4424 = 0;
		}
		if (Static104.aClass219_2 != Static373.aClass219_6) {
			@Pc(196) boolean local196;
			if (Static141.anInt2881 < 1024 && Static302.anInt5346 < 768) {
				local196 = true;
			} else {
				local196 = false;
			}
		}
		if (arg3) {
			Static349.method4711();
		} else {
			Static273.aCanvas5.setSize(Static141.anInt2881, Static302.anInt5346);
			Static122.aClass19_16.method4272(Static273.aCanvas5);
			if (local78 == Static226.aFrame1) {
				local91 = Static226.aFrame1.getInsets();
				Static273.aCanvas5.setLocation(local91.left + Static230.anInt4424, local91.top - -Static303.anInt5363);
			} else {
				Static273.aCanvas5.setLocation(Static230.anInt4424, Static303.anInt5363);
			}
		}
		if (arg0 >= 2) {
			Static41.aBoolean76 = true;
		} else {
			Static41.aBoolean76 = false;
		}
		if (Static334.anInt5766 != -1) {
			Static327.method4422(true);
		}
		if (Static125.aClass11_5 != null && (Static403.anInt6667 == 30 || Static403.anInt6667 == 25)) {
			Static1.method5();
		}
		for (local166 = 0; local166 < 100; local166++) {
			Static416.aBooleanArray21[local166] = true;
		}
		Static100.aBoolean189 = true;
	}
}

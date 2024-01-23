import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!bi;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 aClass4_Sub2_Sub4_Sub2_7;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString97 = "Discard";

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString98 = "Loading defaults - ";

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZB)V")
	public static void method2327(@OriginalArg(0) boolean arg0) {
		Static65.method4575();
		if (Static204.anInt4047 != 30 && Static204.anInt4047 != 25) {
			return;
		}
		Static126.anInt2531++;
		if (Static126.anInt2531 < 50 && !arg0) {
			return;
		}
		Static126.anInt2531 = 0;
		if (!Static243.aBoolean300 && Static261.aClass91_3 != null) {
			Static175.aClass4_Sub24_Sub1_1.method3123(188);
			try {
				Static261.aClass91_3.method2303(Static175.aClass4_Sub24_Sub1_1.anInt3822, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
				Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
			} catch (@Pc(59) IOException local59) {
				Static243.aBoolean300 = true;
			}
		}
		Static65.method4575();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!lg;)V")
	public static void method2329(@OriginalArg(1) Class97 arg0) {
		@Pc(7) Class97 local7 = Static103.method1689(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static292.anInt5674;
			local12 = Static189.anInt5672;
		} else {
			local12 = local7.anInt3201;
			local15 = local7.anInt3190;
		}
		Static112.method1884(arg0, local15, local12, false);
		Static301.method4635(arg0, local12, local15);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	public static void method2330(@OriginalArg(0) int arg0) {
		Static268.anInt5348 = arg0;
		Static39.method723(3);
		Static39.method723(4);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIB)I")
	public static int method2332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return arg1;
		} else if (local8 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method2333() {
		@Pc(7) int local7 = Static268.anInt5346;
		@Pc(14) int local14 = Static162.anInt3312 - local7 - Static189.anInt5672;
		@Pc(19) int local19 = Static303.anInt5768;
		@Pc(27) int local27 = Static242.anInt4775 - Static292.anInt5674 - local19;
		if (local7 <= 0 && local14 <= 0 && local19 <= 0 && local27 <= 0) {
			return;
		}
		try {
			@Pc(55) Container local55;
			if (Static250.aFrame2 != null) {
				local55 = Static250.aFrame2;
			} else if (Static32.aFrame1 == null) {
				local55 = Static95.aClass184_3.anApplet1;
			} else {
				local55 = Static32.aFrame1;
			}
			@Pc(65) int local65 = 0;
			@Pc(67) int local67 = 0;
			if (local55 == Static32.aFrame1) {
				@Pc(74) Insets local74 = Static32.aFrame1.getInsets();
				local65 = local74.left;
				local67 = local74.top;
			}
			@Pc(83) Graphics local83 = local55.getGraphics();
			local83.setColor(Color.black);
			if (local7 > 0) {
				local83.fillRect(local65, local67, local7, Static242.anInt4775);
			}
			if (local19 > 0) {
				local83.fillRect(local65, local67, Static162.anInt3312, local19);
			}
			if (local14 > 0) {
				local83.fillRect(local65 + Static162.anInt3312 - local14, local67, local14, Static242.anInt4775);
			}
			if (local27 > 0) {
				local83.fillRect(local65, local67 + Static242.anInt4775 - local27, Static162.anInt3312, local27);
			}
		} catch (@Pc(146) Exception local146) {
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method2335() {
		Static53.aClass172_11.method4350();
		Static286.aClass172_47.method4350();
		Static253.aClass172_41.method4350();
		Static288.aClass172_48.method4350();
	}
}

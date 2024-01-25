import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!la;")
	public static Class207 aClass207_30;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "J")
	public static long aLong70;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_29 = new Class46(46, -1);

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt2453 = 1;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_30 = new Class46(31, 16);

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt2455 = -1;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	public static int anInt2456 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZIIB)V")
	public static void method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static323.aFrame2 != null && (arg4 != 3 || Static181.anInt3228 != arg1 || arg3 != Static224.anInt4192)) {
			Static548.method7984(Static323.aFrame2, Static470.aClass100_14);
			Static323.aFrame2 = null;
		}
		if (arg4 == 3 && Static323.aFrame2 == null) {
			Static323.aFrame2 = Static36.method541(0, Static470.aClass100_14, arg3, arg1);
			if (Static323.aFrame2 != null) {
				Static181.anInt3228 = arg1;
				Static224.anInt4192 = arg3;
				Static273.method4418();
			}
		}
		if (arg4 == 3 && Static323.aFrame2 == null) {
			method2037(arg0, -1, true, -1, Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208());
			return;
		}
		@Pc(71) Container local71;
		@Pc(88) Insets local88;
		if (Static323.aFrame2 != null) {
			Static312.anInt10525 = arg1;
			local71 = Static323.aFrame2;
			Static28.anInt359 = arg3;
		} else if (Static190.aFrame1 == null) {
			if (Static7.anApplet1 == null) {
				local71 = Static580.anApplet_Sub1_1;
			} else {
				local71 = Static7.anApplet1;
			}
			Static312.anInt10525 = local71.getSize().width;
			Static28.anInt359 = local71.getSize().height;
		} else {
			local88 = Static190.aFrame1.getInsets();
			@Pc(94) int local94 = -local88.right;
			Static312.anInt10525 = Static190.aFrame1.getSize().width + local94 - local88.left;
			Static28.anInt359 = Static190.aFrame1.getSize().height - local88.top - local88.bottom;
			local71 = Static190.aFrame1;
		}
		if (arg4 == 1) {
			Static246.anInt4491 = (Static312.anInt10525 - Static79.anInt1667) / 2;
			Static345.anInt5827 = Static79.anInt1667;
			Static147.anInt2574 = 0;
			Static408.anInt7118 = Static627.anInt10422;
		} else {
			Static604.method8676();
		}
		if (Static211.aClass15_2 != Static517.aClass15_8) {
			@Pc(154) boolean local154;
			if (Static345.anInt5827 < 1024 && Static408.anInt7118 < 768) {
				local154 = true;
			} else {
				local154 = false;
			}
		}
		if (arg2) {
			Static46.method798();
		} else {
			Static83.aCanvas14.setSize(Static345.anInt5827, Static408.anInt7118);
			if (Static428.aBoolean526) {
				Static240.method4003(Static83.aCanvas14);
			} else {
				Static213.aClass133_5.method7276(Static83.aCanvas14, Static345.anInt5827, Static408.anInt7118);
			}
			if (Static190.aFrame1 == local71) {
				local88 = Static190.aFrame1.getInsets();
				Static83.aCanvas14.setLocation(local88.left + Static246.anInt4491, Static147.anInt2574 + local88.top);
			} else {
				Static83.aCanvas14.setLocation(Static246.anInt4491, Static147.anInt2574);
			}
		}
		if (arg4 >= 2) {
			Static384.aBoolean456 = true;
		} else {
			Static384.aBoolean456 = false;
		}
		if (Static337.anInt5727 != -1) {
			Static555.method8083(true);
		}
		if (Static495.aClass170_2 != null && Static75.method1290(Static151.anInt2620)) {
			Static243.method4021();
		}
		for (@Pc(229) int local229 = 0; local229 < 100; local229++) {
			Static264.aBooleanArray16[local229] = true;
		}
		Static48.aBoolean60 = true;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I")
	public static int method2038() {
		return Static436.anInt7500;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2041(@OriginalArg(0) String arg0) {
		Static412.method6340("", 0, arg0, "", "", 4);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)V")
	public static void method2046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static573.method2154(arg0, arg1);
	}
}

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "[[[Lclient!rg;")
	public static Class255[][][] aClass255ArrayArrayArray3;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "[I")
	public static final int[] anIntArray606 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
	public static final int anInt6014 = 0;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Z")
	public static boolean aBoolean434 = true;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)J")
	public static long method5095() {
		return Static404.aClass39_7.method4913();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIZI)V")
	public static void method5096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static193.aFrame8 != null && (arg3 != 3 || Static544.aClass1_Sub22_Sub1_1.anInt5455 != arg1 || arg0 != Static544.aClass1_Sub22_Sub1_1.anInt5456)) {
			Static433.method6290(Static193.aFrame8, Static466.aClass102_4);
			Static193.aFrame8 = null;
		}
		if (arg3 == 3 && Static193.aFrame8 == null) {
			Static193.aFrame8 = Static487.method6666(0, Static466.aClass102_4, arg0, arg1);
			if (Static193.aFrame8 != null) {
				Static544.aClass1_Sub22_Sub1_1.anInt5456 = arg0;
				Static544.aClass1_Sub22_Sub1_1.anInt5455 = arg1;
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
			}
		}
		if (arg3 == 3 && Static193.aFrame8 == null) {
			method5096(-1, -1, arg2, Static544.aClass1_Sub22_Sub1_1.anInt5429, true);
			return;
		}
		@Pc(81) Container local81;
		@Pc(92) Insets local92;
		if (Static193.aFrame8 != null) {
			local81 = Static193.aFrame8;
			Static128.anInt1835 = arg0;
			Static399.anInt7190 = arg1;
		} else if (Static224.aFrame6 == null) {
			local81 = Static466.aClass102_4.anApplet1;
			Static399.anInt7190 = local81.getSize().width;
			Static128.anInt1835 = local81.getSize().height;
		} else {
			local92 = Static224.aFrame6.getInsets();
			@Pc(98) int local98 = -local92.left;
			Static399.anInt7190 = Static224.aFrame6.getSize().width + local98 - local92.right;
			Static128.anInt1835 = Static224.aFrame6.getSize().height - local92.bottom - local92.top;
			local81 = Static224.aFrame6;
		}
		@Pc(156) int local156;
		if (arg3 == 1) {
			Static350.anInt6255 = Static134.anInt2646;
			Static83.anInt1567 = Static397.anInt7131;
			Static81.anInt1466 = (Static399.anInt7190 - Static397.anInt7131) / 2;
			Static376.anInt6875 = 0;
		} else if (Static17.anInt454 < 96 && Static374.anInt6861 == 0) {
			local156 = Static399.anInt7190 <= 1024 ? Static399.anInt7190 : 1024;
			@Pc(163) int local163 = Static128.anInt1835 > 768 ? 768 : Static128.anInt1835;
			Static81.anInt1466 = (Static399.anInt7190 - local156) / 2;
			Static83.anInt1567 = local156;
			Static376.anInt6875 = 0;
			Static350.anInt6255 = local163;
		} else {
			Static83.anInt1567 = Static399.anInt7190;
			Static350.anInt6255 = Static128.anInt1835;
			Static376.anInt6875 = 0;
			Static81.anInt1466 = 0;
		}
		if (Static71.aClass21_1 != Static145.aClass21_4) {
			@Pc(202) boolean local202;
			if (Static83.anInt1567 < 1024 && Static350.anInt6255 < 768) {
				local202 = true;
			} else {
				local202 = false;
			}
		}
		if (arg4) {
			Static359.method5343();
		} else {
			Static105.aCanvas3.setSize(Static83.anInt1567, Static350.anInt6255);
			Static513.aClass122_10.method7278(Static105.aCanvas3);
			if (Static224.aFrame6 == local81) {
				local92 = Static224.aFrame6.getInsets();
				Static105.aCanvas3.setLocation(Static81.anInt1466 + local92.left, local92.top - -Static376.anInt6875);
			} else {
				Static105.aCanvas3.setLocation(Static81.anInt1466, Static376.anInt6875);
			}
		}
		if (arg3 >= 2) {
			Static359.aBoolean458 = true;
		} else {
			Static359.aBoolean458 = false;
		}
		if (Static170.anInt3050 != -1) {
			Static465.method6533(true);
		}
		if (Static402.aClass56_2 != null && Static64.method1156(Static268.anInt5100)) {
			Static176.method2654();
		}
		for (local156 = 0; local156 < 100; local156++) {
			Static3.aBooleanArray1[local156] = true;
		}
		Static336.aBoolean435 = true;
	}
}

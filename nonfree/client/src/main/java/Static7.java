import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "B", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!ada", name = "E", descriptor = "[I")
	public static final int[] anIntArray7 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(IB)Z")
	public static boolean method90(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 > -108) {
			anIntArray6 = null;
		}
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!ha;IIII)V")
	public static void method91(@OriginalArg(1) Class75 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static409.aClass75_13 = arg0;
		Static604.aClass109_11 = Static409.aClass75_13.method6709();
		Static47.aClass109_1 = Static409.aClass75_13.method6709();
		Static568.aClass109_13 = Static409.aClass75_13.method6709();
		Static163.anInt3412 = 100;
		Static273.anIntArray276 = null;
		Static290.anInt10204 = 0;
		Static25.anInterface24Array1 = null;
		Static105.anInt2096 = 100;
		Static340.method5225(arg1, arg2);
		Static500.anInt8393 = -1;
		Static150.anInt3123 = -1;
		Static35.anInt464 = -1;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZIIII)V")
	public static void method92(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static221.aFrame1 != null && (arg4 != 3 || Static448.anInt7755 != arg3 || Static177.anInt3581 != arg2)) {
			Static665.method8842(Static221.aFrame1, Static651.aClass122_38);
			Static221.aFrame1 = null;
		}
		if (arg4 == 3 && Static221.aFrame1 == null) {
			Static221.aFrame1 = Static464.method7030(arg3, 0, Static651.aClass122_38, arg2);
			if (Static221.aFrame1 != null) {
				Static177.anInt3581 = arg2;
				Static448.anInt7755 = arg3;
				Static392.method6007();
			}
		}
		if (arg4 == 3 && Static221.aFrame1 == null) {
			method92(arg0, true, -1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279());
			return;
		}
		@Pc(92) Container local92;
		@Pc(125) Insets local125;
		if (Static221.aFrame1 != null) {
			local92 = Static221.aFrame1;
			Static542.anInt8800 = arg2;
			Static238.anInt4606 = arg3;
		} else if (Static637.aFrame3 == null) {
			if (Static371.anApplet1 == null) {
				local92 = Static34.anApplet_Sub1_1;
			} else {
				local92 = Static371.anApplet1;
			}
			Static238.anInt4606 = local92.getSize().width;
			Static542.anInt8800 = local92.getSize().height;
		} else {
			local125 = Static637.aFrame3.getInsets();
			@Pc(131) int local131 = -local125.left;
			Static238.anInt4606 = Static637.aFrame3.getSize().width + local131 - local125.right;
			@Pc(143) int local143 = -local125.bottom;
			Static542.anInt8800 = Static637.aFrame3.getSize().height + local143 - local125.top;
			local92 = Static637.aFrame3;
		}
		if (arg4 == 1) {
			Static535.anInt4128 = Static339.anInt5789;
			Static274.anInt3226 = Static48.anInt6772;
			Static494.anInt4031 = 0;
			Static409.anInt7136 = (Static238.anInt4606 - Static339.anInt5789) / 2;
		} else {
			Static431.method6568();
		}
		if (Static520.aClass352_8 != Static41.aClass352_2) {
			@Pc(193) boolean local193;
			if (Static535.anInt4128 < 1024 && Static274.anInt3226 < 768) {
				local193 = true;
			} else {
				local193 = false;
			}
		}
		if (arg1) {
			Static333.method5170();
		} else {
			Static4.aCanvas1.setSize(Static535.anInt4128, Static274.anInt3226);
			if (Static93.aBoolean113) {
				Static320.method5028(Static4.aCanvas1);
			} else {
				Static202.aClass75_5.method6668(Static4.aCanvas1, Static535.anInt4128, Static274.anInt3226);
			}
			if (local92 == Static637.aFrame3) {
				local125 = Static637.aFrame3.getInsets();
				Static4.aCanvas1.setLocation(local125.left + Static409.anInt7136, local125.top + Static494.anInt4031);
			} else {
				Static4.aCanvas1.setLocation(Static409.anInt7136, Static494.anInt4031);
			}
		}
		if (arg4 >= 2) {
			Static318.aBoolean411 = true;
		} else {
			Static318.aBoolean411 = false;
		}
		if (Static635.anInt9910 != -1) {
			Static623.method8541(true);
		}
		if (Static525.aClass260_4.aClass141_1 != null && Static292.method4772(Static37.anInt498)) {
			Static232.method4112();
		}
		for (@Pc(289) int local289 = 0; local289 < 100; local289++) {
			Static72.aBooleanArray5[local289] = true;
		}
		if (-24334 != -24334) {
			method90(-114, (byte) -44);
		}
		Static217.aBoolean340 = true;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)V")
	public static void method93() {
		@Pc(1) Class359 local1 = Static535.aClass359_24;
		synchronized (Static535.aClass359_24) {
			Static535.aClass359_24.method8502(5);
		}
		@Pc(27) Class359 local27 = Static296.aClass359_42;
		synchronized (Static296.aClass359_42) {
			Static296.aClass359_42.method8502(5);
		}
	}
}

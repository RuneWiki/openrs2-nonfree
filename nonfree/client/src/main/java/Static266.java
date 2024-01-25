import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method3884(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static14.method345(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIZI)V")
	public static void method3885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static180.aFrame5 != null && (arg1 != 3 || Static86.aClass1_Sub30_Sub1_1.anInt6190 != arg4 || arg0 != Static86.aClass1_Sub30_Sub1_1.anInt6201)) {
			Static66.method1054(Static180.aFrame5, Static361.aClass198_3);
			Static180.aFrame5 = null;
		}
		if (arg1 == 3 && Static180.aFrame5 == null) {
			Static180.aFrame5 = Static448.method6297(arg4, arg0, 0, Static361.aClass198_3);
			if (Static180.aFrame5 != null) {
				Static86.aClass1_Sub30_Sub1_1.anInt6201 = arg0;
				Static86.aClass1_Sub30_Sub1_1.anInt6190 = arg4;
				Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
			}
		}
		if (arg1 == 3 && Static180.aFrame5 == null) {
			method3885(-1, Static86.aClass1_Sub30_Sub1_1.anInt6199, arg2, true, -1);
			return;
		}
		@Pc(79) Container local79;
		@Pc(96) Insets local96;
		if (Static180.aFrame5 != null) {
			Static8.anInt5988 = arg4;
			Static65.anInt1195 = arg0;
			local79 = Static180.aFrame5;
		} else if (Static73.aFrame1 == null) {
			if (Static433.anApplet2 == null) {
				local79 = Static149.anApplet_Sub1_1;
			} else {
				local79 = Static433.anApplet2;
			}
			Static8.anInt5988 = local79.getSize().width;
			Static65.anInt1195 = local79.getSize().height;
		} else {
			local96 = Static73.aFrame1.getInsets();
			Static8.anInt5988 = Static73.aFrame1.getSize().width - local96.right - local96.left;
			@Pc(114) int local114 = -local96.top;
			Static65.anInt1195 = Static73.aFrame1.getSize().height + local114 - local96.bottom;
			local79 = Static73.aFrame1;
		}
		if (arg1 == 1) {
			Static465.anInt8056 = 0;
			Static594.anInt9806 = Static192.anInt3766;
			Static349.anInt6422 = Static318.anInt5819;
			Static273.anInt1189 = (Static8.anInt5988 - Static318.anInt5819) / 2;
		} else {
			Static559.method7556();
		}
		if (Static76.aClass93_3 != Static405.aClass93_6) {
			@Pc(163) boolean local163;
			if (Static349.anInt6422 < 1024 && Static594.anInt9806 < 768) {
				local163 = true;
			} else {
				local163 = false;
			}
		}
		if (arg3) {
			Static473.method6514();
		} else {
			Static103.aCanvas2.setSize(Static349.anInt6422, Static594.anInt9806);
			Static31.aClass78_18.method6853(Static103.aCanvas2);
			if (local79 == Static73.aFrame1) {
				local96 = Static73.aFrame1.getInsets();
				Static103.aCanvas2.setLocation(local96.left + Static273.anInt1189, local96.top - -Static465.anInt8056);
			} else {
				Static103.aCanvas2.setLocation(Static273.anInt1189, Static465.anInt8056);
			}
		}
		if (arg1 >= 2) {
			Static290.aBoolean405 = true;
		} else {
			Static290.aBoolean405 = false;
		}
		if (Static165.anInt3165 != -1) {
			Static209.method7201(true);
		}
		if (Static485.aClass43_1 != null && Static186.method3008(Static55.anInt1068)) {
			Static368.method5401();
		}
		for (@Pc(232) int local232 = 0; local232 < 100; local232++) {
			Static73.aBooleanArray6[local232] = true;
		}
		Static47.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lclient!ba;")
	public static Class1_Sub9 method3886() {
		@Pc(11) Class1_Sub9 local11 = Static184.method2976();
		local11.aClass208_12 = null;
		local11.anInt634 = 0;
		local11.aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(5000);
		return local11;
	}
}

import java.awt.Canvas;
import java.awt.Component;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!um", name = "z", descriptor = "I")
	public static int anInt6497;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	public static final int anInt6483 = 0;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "[Lclient!vi;")
	public static final Class26_Sub2_Sub4_Sub2[] aClass26_Sub2_Sub4_Sub2Array1 = new Class26_Sub2_Sub4_Sub2[2048];

	@OriginalMember(owner = "client!um", name = "B", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_148 = new Class253(18, 10);

	@OriginalMember(owner = "client!um", name = "D", descriptor = "Z")
	public static boolean aBoolean421 = false;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!ec;IZLclient!ga;)Lclient!ya;")
	public static Class51 method5152(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface4 arg4) {
		return new Class51_Sub2(arg1, arg0, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method5153() {
		if (Static213.aBoolean229) {
			return;
		}
		Static213.aBoolean230 = true;
		Static213.aBoolean229 = true;
		if (Static130.aClass153_Sub1_1.aBoolean337) {
			Static67.aFloat36 = (int) Static67.aFloat36 + 47 & 0xFFFFFFF0;
		} else {
			Static323.aFloat154 += (12.0F - Static323.aFloat154) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V")
	public static void method5159() {
		for (@Pc(18) Class7_Sub4_Sub3 local18 = (Class7_Sub4_Sub3) Static235.aClass85_25.method2010(); local18 != null; local18 = (Class7_Sub4_Sub3) Static235.aClass85_25.method2000()) {
			@Pc(23) Class26_Sub2_Sub3 local23 = local18.aClass26_Sub2_Sub3_1;
			if (Static268.anInt4539 != local23.aByte102 || Static274.anInt4617 > local23.lb) {
				local18.method5802();
				local23.method2851();
			} else if (Static274.anInt4617 >= local23.anInt3507) {
				if (local23.anInt3505 > 0) {
					@Pc(56) Class26_Sub2_Sub4_Sub1 local56 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local23.anInt3505 - 1];
					if (local56 != null && local56.anInt7388 >= 0 && Static333.anInt3375 * 128 > local56.anInt7388 && local56.anInt7383 >= 0 && Static102.anInt2086 * 128 > local56.anInt7383) {
						local23.method2848(Static333.method2748(local23.aByte102, local56.anInt7383, local56.anInt7388) - local23.anInt3503, local56.anInt7388, Static274.anInt4617, local56.anInt7383);
					}
				}
				if (local23.anInt3505 < 0) {
					@Pc(117) int local117 = -local23.anInt3505 - 1;
					@Pc(122) Class26_Sub2_Sub4_Sub2 local122;
					if (local117 == Static296.anInt4920) {
						local122 = Static104.aClass26_Sub2_Sub4_Sub2_2;
					} else {
						local122 = aClass26_Sub2_Sub4_Sub2Array1[local117];
					}
					if (local122 != null && local122.anInt7388 >= 0 && Static333.anInt3375 * 128 > local122.anInt7388 && local122.anInt7383 >= 0 && local122.anInt7383 < Static102.anInt2086 * 128) {
						local23.method2848(Static333.method2748(local23.aByte102, local122.anInt7383, local122.anInt7388) - local23.anInt3503, local122.anInt7388, Static274.anInt4617, local122.anInt7383);
					}
				}
				local23.method2850(Static436.anInt7296);
				Static37.method529(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method5160(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static85.anInt1679 != 3) {
			Static393.aClass124_5 = new Class124();
			Static393.aClass124_5.anInt3453 = arg1;
			Static393.aClass124_5.aString37 = arg0;
			if (Static313.aClass136_7 != Static167.aClass136_5) {
				Static393.aClass124_5.anInt3455 = Static393.aClass124_5.anInt3453 + 40000;
				Static393.aClass124_5.anInt3454 = Static393.aClass124_5.anInt3453 + 50000;
			}
			return true;
		}
		@Pc(37) String local37 = "";
		if (Static167.aClass136_5 != Static313.aClass136_7) {
			local37 = ":" + (arg1 + 7000);
		}
		@Pc(59) String local59 = "";
		if (Static240.aString48 != null) {
			local59 = "/p=" + Static240.aString48;
		}
		@Pc(107) String local107 = "http://" + arg0 + local37 + "/l=" + Static5.anInt20 + "/a=" + Static274.anInt4622 + local59 + "/j" + (Static193.aBoolean205 ? "1" : "0") + ",o" + (Static129.aBoolean142 ? "1" : "0") + ",a2";
		try {
			Static129.aClient1.getAppletContext().showDocument(new URL(local107), "_self");
			return true;
		} catch (@Pc(117) Exception local117) {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!jv;")
	public static Class130 method5163(@OriginalArg(0) Component arg0) {
		return new Class130_Sub1(arg0);
	}
}

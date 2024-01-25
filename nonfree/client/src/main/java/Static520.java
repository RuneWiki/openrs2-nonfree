import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
	public static int anInt1936 = 0;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_24 = new Class243(22, -1);

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	public static int anInt1939 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method1885() {
		if (Static221.aBoolean311) {
			return;
		}
		Static253.aBoolean338 = true;
		Static221.aBoolean311 = true;
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean196) {
			Static265.aFloat182 = (int) Static265.aFloat182 + 47 & 0xFFFFFFF0;
		} else {
			Static291.aFloat102 += (12.0F - Static291.aFloat102) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1886(@OriginalArg(1) String arg0) {
		Static530.aString206 = arg0;
		if (Static531.aClass283_6.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static531.aClass283_6.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static531.aClass283_6.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static62.method1150(Static143.method2502() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static559.method6632(Static531.aClass283_6.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IJ)V")
	public static void method1887(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static530.anInt9204 + Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660;
		@Pc(15) int local15 = Static368.anInt6904 + Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659;
		if (Static31.anInt5633 - local10 < -500 || Static31.anInt5633 - local10 > 500 || Static169.anInt3089 - local15 < -500 || Static169.anInt3089 - local15 > 500) {
			Static31.anInt5633 = local10;
			Static169.anInt3089 = local15;
		}
		@Pc(53) int local53;
		@Pc(61) int local61;
		if (local10 != Static31.anInt5633) {
			local53 = local10 - Static31.anInt5633;
			local61 = (int) ((long) local53 * arg0 / 320L);
			if (local53 <= 0) {
				if (local61 == 0) {
					local61 = -1;
				} else if (local53 > local61) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = 1;
			} else if (local61 > local53) {
				local61 = local53;
			}
			Static31.anInt5633 += local61;
		}
		if (!Static281.aClass2_Sub19_Sub1_1.aBoolean196) {
			Static265.aFloat182 += Static291.aFloat102 * (float) arg0 / 6.0F;
			Static161.aFloat56 += (float) arg0 * Static232.aFloat73 / 6.0F;
		}
		if (local15 != Static169.anInt3089) {
			local53 = local15 - Static169.anInt3089;
			local61 = (int) (arg0 * (long) local53 / 320L);
			if (local53 > 0) {
				if (local61 == 0) {
					local61 = 1;
				} else if (local61 > local53) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = -1;
			} else if (local53 > local61) {
				local61 = local53;
			}
			Static169.anInt3089 += local61;
		}
		Static74.method1489();
	}
}

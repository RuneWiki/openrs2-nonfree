import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
	public static int anInt4483;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
	public static int anInt4484;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_3 = new Class266(5, 16);

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString48 = null;

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "[I")
	public static final int[] anIntArray304 = new int[50];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)I")
	public static int method3726(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static37.anInt925 - 1; local3++) {
			if (arg0 < Static643.anIntArray750[local3] + Static641.anIntArray741[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static37.anInt925 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ud;Z)Lclient!gu;")
	public static Class138_Sub1 method3727(@OriginalArg(0) Class2_Sub34 arg0) {
		@Pc(14) Class138 local14 = Static185.method3335(arg0);
		@Pc(18) int local18 = arg0.method6875();
		return new Class138_Sub1(local14.anInt4159, local14.aClass174_8, local14.aClass176_8, local14.anInt4158, local14.anInt4160, local18);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z")
	public static boolean method3728() {
		try {
			@Pc(7) Class284 local7 = new Class284();
			@Pc(17) byte[] local17 = local7.method6790(Static133.aByteArray30);
			Static555.method7694(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "(B)V")
	public static void method3730() {
		if (Static416.anInt7592 < 0) {
			Static416.anInt7592 = 0;
			Static413.anInt7559 = -1;
			Static92.anInt1857 = -1;
		}
		if (Static292.anInt8378 < Static416.anInt7592) {
			Static92.anInt1857 = -1;
			Static413.anInt7559 = -1;
			Static416.anInt7592 = Static292.anInt8378;
		}
		if (Static304.anInt5622 < 0) {
			Static92.anInt1857 = -1;
			Static413.anInt7559 = -1;
			Static304.anInt5622 = 0;
		}
		if (Static292.anInt8376 < Static304.anInt5622) {
			Static92.anInt1857 = -1;
			Static413.anInt7559 = -1;
			Static304.anInt5622 = Static292.anInt8376;
		}
	}
}

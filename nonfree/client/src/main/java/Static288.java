import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public static int anInt5769;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!rn;")
	public static Class155 aClass155_117;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "Lclient!rn;")
	public static Class155 aClass155_118;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString218 = " has logged out.";

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString219 = "Loaded update list";

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public static int anInt5767 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method4740() {
		Static156.aClass98_23.method2572();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	public static void method4743() {
		@Pc(13) Container local13;
		if (Static73.aFrame1 != null) {
			local13 = Static73.aFrame1;
		} else if (Static276.aFrame2 == null) {
			local13 = Static274.aClass176_4.anApplet1;
		} else {
			local13 = Static276.aFrame2;
		}
		Static199.anInt3882 = local13.getSize().width;
		Static256.anInt5286 = local13.getSize().height;
		@Pc(36) Insets local36;
		if (local13 == Static276.aFrame2) {
			local36 = Static276.aFrame2.getInsets();
			Static256.anInt5286 -= local36.top + local36.bottom;
			Static199.anInt3882 -= local36.right + local36.left;
		}
		if (Static254.method4299() >= 2) {
			Static253.anInt5224 = Static199.anInt3882;
			Static307.anInt6024 = 0;
			Static123.anInt2333 = Static256.anInt5286;
			Static59.anInt1138 = 0;
		} else {
			Static253.anInt5224 = 765;
			Static123.anInt2333 = 503;
			Static59.anInt1138 = (Static199.anInt3882 - 765) / 2;
			Static307.anInt6024 = 0;
		}
		if (Static283.aBoolean393) {
			Static283.method4640(Static253.anInt5224, Static123.anInt2333);
		}
		Static224.aCanvas12.setSize(Static253.anInt5224, Static123.anInt2333);
		if (local13 == Static276.aFrame2) {
			local36 = Static276.aFrame2.getInsets();
			Static224.aCanvas12.setLocation(local36.left + Static59.anInt1138, Static307.anInt6024 + local36.top);
		} else {
			Static224.aCanvas12.setLocation(Static59.anInt1138, Static307.anInt6024);
		}
		if (Static66.anInt1232 != -1) {
			Static315.method5005(true);
		}
		Static45.method685();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4745(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static149.anInt2817; local12++) {
			if (arg0.equalsIgnoreCase(Static88.aStringArray17[local12])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static308.aStringArray42[local12])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
	public static int method4747(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static241.method4083(arg0);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lclient!hg;")
	public static Class3_Sub4_Sub11 method4748(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub4_Sub11 local6 = (Class3_Sub4_Sub11) Static201.aClass98_32.method2570((long) arg0);
		if (local6 != null) {
			return local6;
		}
		local6 = Static251.method4237(arg0, Static267.aClass155_112, Static195.aClass155_81);
		if (local6 != null) {
			Static201.aClass98_32.method2568(local6, (long) arg0);
		}
		return local6;
	}
}

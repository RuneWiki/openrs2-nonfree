import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "Lclient!qn;")
	public static Class211 aClass211_62;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "Lclient!ae;")
	public static Class6 aClass6_7 = null;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3150(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static66.anInt1316; local16++) {
			if (arg0.equalsIgnoreCase(Static406.aStringArray42[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static178.aStringArray28[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lclient!dc;")
	public static Class47 method3151() {
		try {
			return (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!bf;Z)I")
	public static int method3152(@OriginalArg(0) Class8_Sub3_Sub1 arg0) {
		if (arg0.anInt7406 == 0) {
			return 0;
		}
		@Pc(55) int local55;
		@Pc(62) int local62;
		if (arg0.anInt7394 != -1) {
			@Pc(23) Class8_Sub3_Sub1 local23 = null;
			if (arg0.anInt7394 < 32768) {
				local23 = Static367.aClass8_Sub3_Sub1_Sub2Array1[arg0.anInt7394];
			} else if (arg0.anInt7394 >= 32768) {
				local23 = Static267.aClass8_Sub3_Sub1_Sub1Array1[arg0.anInt7394 - 32768];
			}
			if (local23 != null) {
				local55 = arg0.anInt7339 - local23.anInt7339;
				local62 = arg0.anInt7343 - local23.anInt7343;
				if (local55 != 0 || local62 != 0) {
					arg0.method5887((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class8_Sub3_Sub1_Sub1) {
			@Pc(91) Class8_Sub3_Sub1_Sub1 local91 = (Class8_Sub3_Sub1_Sub1) arg0;
			if (local91.anInt5671 != -1 && (local91.anInt7427 == 0 || local91.anInt7426 > 0)) {
				local91.method5887(local91.anInt5671);
				local91.anInt5671 = -1;
			}
		} else if (arg0 instanceof Class8_Sub3_Sub1_Sub2) {
			@Pc(118) Class8_Sub3_Sub1_Sub2 local118 = (Class8_Sub3_Sub1_Sub2) arg0;
			if (local118.anInt7431 != -1 && (local118.anInt7427 == 0 || local118.anInt7426 > 0)) {
				local55 = local118.anInt7339 - (local118.anInt7431 - Static365.anInt6047 - Static365.anInt6047) * 64;
				local62 = local118.anInt7343 - (local118.anInt7440 - Static366.anInt6052 - Static366.anInt6052) * 64;
				if (local55 != 0 || local62 != 0) {
					local118.method5887((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
				local118.anInt7431 = -1;
			}
		}
		return arg0.method5888();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)V")
	public static void method3154(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub2_Sub17 local15 = Static34.method1709(2, arg0);
		local15.method5523();
	}
}

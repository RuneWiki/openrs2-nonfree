import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!tj;")
	public static Class193 aClass193_81;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!ug;")
	public static Class51 aClass51_4;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!tj;")
	public static Class193 aClass193_82;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	public static int anInt4758 = 0;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
	public static boolean aBoolean359 = true;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4191(@OriginalArg(0) String arg0) {
		Static69.method1646("", 0, 0, arg0, "");
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method4194() {
		Static147.aClass21Array2 = null;
		Static15.method858(0, -1, Static24.anInt496, Static23.anInt465, 0, 0, 0, Static357.anInt6821);
		if (Static147.aClass21Array2 != null) {
			Static133.method2846(Static296.anInt5723, Static24.anInt496, 0, Static147.aClass21Array2, 0, Static348.anInt6591, Static23.anInt465, -1412584499, Static182.aClass21_11.anInt731);
			Static147.aClass21Array2 = null;
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public static void method4197() {
		for (@Pc(10) Class4_Sub4_Sub14 local10 = (Class4_Sub4_Sub14) Static321.aClass116_41.method3270(); local10 != null; local10 = (Class4_Sub4_Sub14) Static321.aClass116_41.method3272()) {
			@Pc(15) Class8_Sub1_Sub5 local15 = local10.aClass8_Sub1_Sub5_1;
			if (local15.aByte77 != Static12.anInt267 || Static199.anInt4137 > local15.anInt6707) {
				local10.method5687();
				local15.method5638();
			} else if (Static199.anInt4137 >= local15.anInt6717) {
				if (local15.anInt6721 > 0) {
					@Pc(62) Class8_Sub1_Sub2_Sub2 local62 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local15.anInt6721 - 1];
					if (local62 != null && local62.anInt6701 >= 0 && Static350.anInt6637 * 128 > local62.anInt6701 && local62.anInt6702 >= 0 && Static105.anInt2647 * 128 > local62.anInt6702) {
						local15.method5636(local62.anInt6702, local62.anInt6701, Static81.method2010(local15.aByte77, local62.anInt6702, local62.anInt6701) - local15.anInt6724, Static199.anInt4137);
					}
				}
				if (local15.anInt6721 < 0) {
					@Pc(123) int local123 = -local15.anInt6721 - 1;
					@Pc(128) Class8_Sub1_Sub2_Sub1 local128;
					if (Static64.anInt1674 == local123) {
						local128 = Static158.aClass8_Sub1_Sub2_Sub1_1;
					} else {
						local128 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local123];
					}
					if (local128 != null && local128.anInt6701 >= 0 && local128.anInt6701 < Static350.anInt6637 * 128 && local128.anInt6702 >= 0 && Static105.anInt2647 * 128 > local128.anInt6702) {
						local15.method5636(local128.anInt6702, local128.anInt6701, Static81.method2010(local15.aByte77, local128.anInt6702, local128.anInt6701) - local15.anInt6724, Static199.anInt4137);
					}
				}
				local15.method5635(Static218.anInt4454);
				Static301.method4952(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)Lclient!md;")
	public static Class130 method4202() {
		try {
			return (Class130) Class.forName("Class130_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}

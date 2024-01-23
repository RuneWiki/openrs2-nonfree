import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_54;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public static int anInt3998;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public static int anInt3991 = 1;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1374 = Static64.method1101("blinken3:");

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1375 = Static64.method1101("<col=00ff80>");

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Z")
	public static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!mb;Lclient!mb;)V")
	public static void method3095(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1) {
		Static126.aClass70_29 = arg1;
		Static201.aClass70_41 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method3096() {
		if (Static227.aDouble11 > Static10.aDouble1) {
			Static10.aDouble1 += Static10.aDouble1 / 30.0D;
			if (Static10.aDouble1 > Static227.aDouble11) {
				Static10.aDouble1 = Static227.aDouble11;
			}
			Static220.method3635();
		} else if (Static10.aDouble1 > Static227.aDouble11) {
			Static10.aDouble1 -= Static10.aDouble1 / 30.0D;
			if (Static10.aDouble1 < Static227.aDouble11) {
				Static10.aDouble1 = Static227.aDouble11;
			}
			Static220.method3635();
		}
		if (Static155.anInt3422 == -1 || Static41.anInt977 == -1) {
			return;
		}
		@Pc(57) int local57 = Static155.anInt3422 - Static87.anInt2015;
		@Pc(62) int local62 = Static41.anInt977 - Static150.anInt3286;
		if (local62 < 2 || local62 > 2) {
			local62 >>= 0x4;
		}
		Static150.anInt3286 += local62;
		if (local57 < 2 || local57 > 2) {
			local57 >>= 0x4;
		}
		Static87.anInt2015 += local57;
		if (local57 == 0 && local62 == 0) {
			Static41.anInt977 = -1;
			Static155.anInt3422 = -1;
		}
		Static220.method3635();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
	public static void method3098() {
		for (@Pc(10) Class1_Sub2_Sub9 local10 = (Class1_Sub2_Sub9) Static64.aClass105_7.method3120(); local10 != null; local10 = (Class1_Sub2_Sub9) Static64.aClass105_7.method3109()) {
			@Pc(15) Class5_Sub7 local15 = local10.aClass5_Sub7_1;
			if (Static197.anInt2422 != local15.anInt4724 || local15.anInt4714 < Static109.anInt2430) {
				local10.method3758();
			} else if (Static109.anInt2430 >= local15.anInt4722) {
				if (local15.anInt4711 > 0) {
					@Pc(45) Class5_Sub1_Sub2 local45 = Static168.aClass5_Sub1_Sub2Array1[local15.anInt4711 - 1];
					if (local45 != null && local45.anInt3624 >= 0 && local45.anInt3624 < 13312 && local45.anInt3598 >= 0 && local45.anInt3598 < 13312) {
						local15.method3685(Static26.method2454(local15.anInt4724, local45.anInt3598, local45.anInt3624) - local15.anInt4715, Static109.anInt2430, local45.anInt3624, local45.anInt3598);
					}
				}
				if (local15.anInt4711 < 0) {
					@Pc(97) int local97 = -local15.anInt4711 - 1;
					@Pc(108) Class5_Sub1_Sub1 local108;
					if (Static228.anInt4794 == local97) {
						local108 = Static73.aClass5_Sub1_Sub1_1;
					} else {
						local108 = Static191.aClass5_Sub1_Sub1Array1[local97];
					}
					if (local108 != null && local108.anInt3624 >= 0 && local108.anInt3624 < 13312 && local108.anInt3598 >= 0 && local108.anInt3598 < 13312) {
						local15.method3685(Static26.method2454(local15.anInt4724, local108.anInt3598, local108.anInt3624) - local15.anInt4715, Static109.anInt2430, local108.anInt3624, local108.anInt3598);
					}
				}
				local15.method3689(Static48.anInt1156);
				Static178.method3022(Static197.anInt2422, (int) local15.aDouble9, (int) local15.aDouble5, (int) local15.aDouble7, 60, local15, local15.anInt4721, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method3100(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.aBoolean132 = false;
		if (arg0.aClass1_Sub6_5 != null) {
			arg0.aClass1_Sub6_5.anInt3208 = 0;
		}
		for (@Pc(19) Class1_Sub4 local19 = arg0.method2353(); local19 != null; local19 = arg0.method2354()) {
			method3100(local19);
		}
	}
}

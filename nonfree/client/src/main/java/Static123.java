import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!en", name = "l", descriptor = "[I")
	public static int[] anIntArray152 = new int[2];

	@OriginalMember(owner = "client!en", name = "n", descriptor = "[I")
	public static final int[] anIntArray153 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public static void method2121() {
		Static201.method5537(Static363.aClass365_14);
		Static428.anInt4967++;
		if (Static484.aBoolean580 && Static204.aBoolean333) {
			@Pc(32) int local32 = Static287.aClass256_8.method7558();
			@Pc(36) int local36 = Static287.aClass256_8.method7561();
			local36 -= Static212.anInt4159;
			local32 -= Static318.anInt5733;
			if (local32 < Static424.anInt7197) {
				local32 = Static424.anInt7197;
			}
			if (Static199.anInt4027 > local36) {
				local36 = Static199.anInt4027;
			}
			if (Static363.aClass365_14.anInt9578 + local32 > Static394.aClass365_11.anInt9578 + Static424.anInt7197) {
				local32 = Static424.anInt7197 + Static394.aClass365_11.anInt9578 - Static363.aClass365_14.anInt9578;
			}
			if (Static394.aClass365_11.anInt9638 + Static199.anInt4027 < local36 - -Static363.aClass365_14.anInt9638) {
				local36 = Static199.anInt4027 + Static394.aClass365_11.anInt9638 - Static363.aClass365_14.anInt9638;
			}
			@Pc(104) int local104 = Static394.aClass365_11.anInt9571 + local32 - Static424.anInt7197;
			@Pc(111) int local111 = local36 + Static394.aClass365_11.anInt9617 - Static199.anInt4027;
			@Pc(160) Class1_Sub2 local160;
			if (Static287.aClass256_8.method7557()) {
				if (Static363.aClass365_14.anInt9631 < Static428.anInt4967) {
					@Pc(205) int local205 = local32 - Static452.anInt7758;
					@Pc(210) int local210 = local36 - Static129.anInt2624;
					if (local205 > Static363.aClass365_14.anInt9610 || -Static363.aClass365_14.anInt9610 > local205 || local210 > Static363.aClass365_14.anInt9610 || -Static363.aClass365_14.anInt9610 > local210) {
						Static103.aBoolean168 = true;
					}
				}
				if (Static363.aClass365_14.anObjectArray27 != null && Static103.aBoolean168) {
					local160 = new Class1_Sub2();
					local160.anInt157 = local104;
					local160.anInt156 = local111;
					local160.aClass365_1 = Static363.aClass365_14;
					local160.anObjectArray1 = Static363.aClass365_14.anObjectArray27;
					Static145.method2353(local160);
				}
			} else {
				if (Static103.aBoolean168) {
					Static130.method6495();
					if (Static363.aClass365_14.anObjectArray4 != null) {
						local160 = new Class1_Sub2();
						local160.aClass365_2 = Static310.aClass365_13;
						local160.anInt156 = local111;
						local160.aClass365_1 = Static363.aClass365_14;
						local160.anObjectArray1 = Static363.aClass365_14.anObjectArray4;
						local160.anInt157 = local104;
						Static145.method2353(local160);
					}
					if (Static310.aClass365_13 != null && Static72.method1568(Static363.aClass365_14) != null) {
						Static161.method2483(Static363.aClass365_14, Static310.aClass365_13);
					}
				} else if ((Static54.anInt1401 == 1 || Static9.method136()) && Static135.anInt2684 > 2) {
					Static328.method4964(Static318.anInt5733 + Static452.anInt7758, Static129.anInt2624 + Static212.anInt4159);
				} else if (Static388.method5570()) {
					Static328.method4964(Static452.anInt7758 + Static318.anInt5733, Static129.anInt2624 + Static212.anInt4159);
				}
				Static363.aClass365_14 = null;
			}
		} else if (Static428.anInt4967 > 1) {
			Static363.aClass365_14 = null;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	public static int method2122() {
		return 19;
	}
}

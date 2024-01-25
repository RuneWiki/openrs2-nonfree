import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_34 = new Class71(47, -1);

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "J")
	public static long aLong85 = 0L;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
	public static int anInt3573 = 0;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
	public static void method2950() {
		Static86.method2113(Static10.aClass331_3);
		Static432.anInt8162++;
		if (Static228.aBoolean388 && Static205.aBoolean341) {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			if (Static513.aBoolean642) {
				local32 = Static550.method8313();
				local34 = Static530.method7484();
			}
			@Pc(49) int local49 = Static288.aClass35_6.method5764() + local32;
			@Pc(56) int local56 = Static288.aClass35_6.method5761() + local34;
			local49 -= Static39.anInt1469;
			local56 -= Static632.anInt10539;
			if (Static256.anInt3672 > local49) {
				local49 = Static256.anInt3672;
			}
			if (Static258.anInt5551 > local56) {
				local56 = Static258.anInt5551;
			}
			if (Static10.aClass331_3.anInt9553 + local49 > Static256.anInt3672 + Static514.aClass331_15.anInt9553) {
				local49 = Static256.anInt3672 + Static514.aClass331_15.anInt9553 - Static10.aClass331_3.anInt9553;
			}
			if (Static258.anInt5551 + Static514.aClass331_15.anInt9505 < Static10.aClass331_3.anInt9505 + local56) {
				local56 = Static258.anInt5551 + Static514.aClass331_15.anInt9505 - Static10.aClass331_3.anInt9505;
			}
			@Pc(124) int local124 = Static514.aClass331_15.anInt9501 + local49 - Static256.anInt3672;
			@Pc(132) int local132 = local56 + Static514.aClass331_15.anInt9503 - Static258.anInt5551;
			@Pc(187) Class8_Sub40 local187;
			if (Static288.aClass35_6.method5767()) {
				if (Static10.aClass331_3.anInt9513 < Static432.anInt8162) {
					@Pc(145) int local145 = local49 - Static75.anInt2305;
					@Pc(150) int local150 = local56 - Static266.anInt5681;
					if (local145 > Static10.aClass331_3.anInt9555 || local145 < -Static10.aClass331_3.anInt9555 || Static10.aClass331_3.anInt9555 < local150 || -Static10.aClass331_3.anInt9555 > local150) {
						Static599.aBoolean733 = true;
					}
				}
				if (Static10.aClass331_3.anObjectArray4 != null && Static599.aBoolean733) {
					local187 = new Class8_Sub40();
					local187.aClass331_14 = Static10.aClass331_3;
					local187.anObjectArray2 = Static10.aClass331_3.anObjectArray4;
					local187.anInt7837 = local132;
					local187.anInt7833 = local124;
					Static273.method4698(local187);
					return;
				}
			} else {
				if (Static599.aBoolean733) {
					Static8.method91();
					if (Static10.aClass331_3.anObjectArray17 != null) {
						local187 = new Class8_Sub40();
						local187.aClass331_13 = Static367.aClass331_11;
						local187.anObjectArray2 = Static10.aClass331_3.anObjectArray17;
						local187.anInt7837 = local132;
						local187.anInt7833 = local124;
						local187.aClass331_14 = Static10.aClass331_3;
						Static273.method4698(local187);
					}
					if (Static367.aClass331_11 != null && Static73.method1920(Static10.aClass331_3) != null) {
						Static370.method5802(Static367.aClass331_11, Static10.aClass331_3);
					}
				} else if ((Static580.anInt5357 == 1 || Static596.method8230()) && Static548.anInt9471 > 2) {
					Static194.method3643(Static266.anInt5681 + Static632.anInt10539, Static39.anInt1469 - -Static75.anInt2305);
				} else if (Static507.method7335()) {
					Static194.method3643(Static266.anInt5681 + Static632.anInt10539, Static75.anInt2305 + Static39.anInt1469);
				}
				Static10.aClass331_3 = null;
			}
		} else if (Static432.anInt8162 > 1) {
			Static10.aClass331_3 = null;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
	public static void method2951() {
		Static227.aClient1.method1917();
		Static209.method4022();
		Static415.aClass71_103 = null;
		Static128.anInt3427 = 0;
		Static602.anInt10248 = 0;
		Static126.aClass71_32 = null;
		Static239.aClass71_61 = null;
		Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
		Static121.method2708();
		Static198.anInt4608 = 0;
		Static29.aClass249Array1 = null;
		Static220.aString61 = null;
		Static469.anInt8486 = 0;
		Static530.anInt9157 = 0;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V")
	public static void method2952() {
		Static295.aClass209_1.method5481();
		Static288.aClass35_6.method5763();
		Static227.aClient1.method1907();
		Static549.aCanvas13.setBackground(Color.black);
		Static601.anInt10242 = -1;
		Static295.aClass209_1 = Static585.method8136(Static549.aCanvas13);
		Static288.aClass35_6 = Static127.method2813(Static549.aCanvas13);
	}
}

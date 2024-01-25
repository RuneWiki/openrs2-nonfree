import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt1619;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	public static int anInt1623;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	public static int anInt1626;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt1617 = 0;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_28 = new Class57("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_5 = new Class68(9, 7);

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public static int anInt1625 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZZIII)V")
	public static void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1) {
			Static264.method4215();
		}
		if (Static225.aFrame2 != null && (arg4 != 3 || arg3 != Static164.aClass154_Sub1_1.anInt6067 || arg0 != Static164.aClass154_Sub1_1.anInt6062)) {
			Static20.method223(Static225.aFrame2, Static61.aClass156_1);
			Static225.aFrame2 = null;
		}
		if (arg4 == 3 && Static225.aFrame2 == null) {
			Static225.aFrame2 = Static312.method4796(0, Static61.aClass156_1, arg3, arg0);
			if (Static225.aFrame2 != null) {
				Static164.aClass154_Sub1_1.anInt6067 = arg3;
				Static164.aClass154_Sub1_1.anInt6062 = arg0;
				Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
			}
		}
		if (arg4 == 3 && Static225.aFrame2 == null) {
			method1311(-1, true, arg2, -1, Static164.aClass154_Sub1_1.anInt6068);
			return;
		}
		@Pc(85) Container local85;
		@Pc(109) Insets local109;
		if (Static225.aFrame2 != null) {
			local85 = Static225.aFrame2;
			Static177.anInt3088 = arg0;
			Static276.anInt4800 = arg3;
		} else if (Static34.aFrame1 == null) {
			local85 = Static61.aClass156_1.anApplet1;
			Static276.anInt4800 = local85.getSize().width;
			Static177.anInt3088 = local85.getSize().height;
		} else {
			local109 = Static34.aFrame1.getInsets();
			Static276.anInt4800 = Static34.aFrame1.getSize().width - local109.left - local109.right;
			@Pc(126) int local126 = -local109.top;
			Static177.anInt3088 = Static34.aFrame1.getSize().height + local126 - local109.bottom;
			local85 = Static34.aFrame1;
		}
		@Pc(153) int local153;
		if (arg4 == 1) {
			Static92.anInt1900 = 0;
			Static199.anInt3567 = Static196.anInt5198;
			Static207.anInt2251 = Static174.anInt3036;
			Static125.anInt2386 = (Static276.anInt4800 - Static196.anInt5198) / 2;
		} else if (Static368.anInt6173 < 96 && Static2.anInt68 == 0) {
			local153 = Static276.anInt4800 <= 1024 ? Static276.anInt4800 : 1024;
			Static125.anInt2386 = (Static276.anInt4800 - local153) / 2;
			Static199.anInt3567 = local153;
			@Pc(168) int local168 = Static177.anInt3088 > 768 ? 768 : Static177.anInt3088;
			Static92.anInt1900 = 0;
			Static207.anInt2251 = local168;
		} else {
			Static125.anInt2386 = 0;
			Static199.anInt3567 = Static276.anInt4800;
			Static92.anInt1900 = 0;
			Static207.anInt2251 = Static177.anInt3088;
		}
		if (Static238.aClass171_4 != Static291.aClass171_5) {
			@Pc(210) boolean local210;
			if (Static199.anInt3567 < 1024 && Static207.anInt2251 < 768) {
				local210 = true;
			} else {
				local210 = false;
			}
		}
		if (arg1) {
			Static186.method2929(Static2.anInt68);
		} else {
			Static173.aCanvas2.setSize(Static199.anInt3567, Static207.anInt2251);
			if (Static347.aClass155_9 != null) {
				Static347.aClass155_9.method4909();
			}
			if (local85 == Static34.aFrame1) {
				local109 = Static34.aFrame1.getInsets();
				Static173.aCanvas2.setLocation(Static125.anInt2386 + local109.left, local109.top - -Static92.anInt1900);
			} else {
				Static173.aCanvas2.setLocation(Static125.anInt2386, Static92.anInt1900);
			}
		}
		if (arg4 < 2) {
			Static104.aBoolean156 = false;
		} else {
			Static104.aBoolean156 = true;
		}
		if (Static68.anInt1346 != -1) {
			Static45.method706(true);
		}
		if (Static12.aClass145_2 != null && (Static348.anInt4439 == 30 || Static348.anInt4439 == 25)) {
			Static273.method4274();
		}
		for (local153 = 0; local153 < 100; local153++) {
			Static109.aBooleanArray45[local153] = true;
		}
		Static122.aBoolean179 = true;
	}
}

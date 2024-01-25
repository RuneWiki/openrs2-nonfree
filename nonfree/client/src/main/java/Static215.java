import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!it", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!it", name = "o", descriptor = "I")
	public static int anInt4441 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZIIIII)V")
	public static void method3853(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static478.aFrame1 != null && (arg1 != 3 || arg4 != Static89.aClass1_Sub28_Sub1_1.anInt4893 || Static89.aClass1_Sub28_Sub1_1.anInt4909 != arg2)) {
			Static488.method7067(Static478.aFrame1, Static91.aClass182_2);
			Static478.aFrame1 = null;
		}
		if (arg1 == 3 && Static478.aFrame1 == null) {
			Static478.aFrame1 = Static289.method4882(0, arg4, Static91.aClass182_2, arg2);
			if (Static478.aFrame1 != null) {
				Static89.aClass1_Sub28_Sub1_1.anInt4893 = arg4;
				Static89.aClass1_Sub28_Sub1_1.anInt4909 = arg2;
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
			}
		}
		if (arg1 == 3 && Static478.aFrame1 == null) {
			method3853(true, Static89.aClass1_Sub28_Sub1_1.anInt4904, -1, arg3, -1);
			return;
		}
		@Pc(74) Container local74;
		@Pc(86) Insets local86;
		if (Static478.aFrame1 != null) {
			Static60.anInt1681 = arg4;
			Static547.anInt9471 = arg2;
			local74 = Static478.aFrame1;
		} else if (Static543.aFrame2 == null) {
			local74 = Static91.aClass182_2.anApplet1;
			Static60.anInt1681 = local74.getSize().width;
			Static547.anInt9471 = local74.getSize().height;
		} else {
			local86 = Static543.aFrame2.getInsets();
			Static60.anInt1681 = Static543.aFrame2.getSize().width - local86.right - local86.left;
			@Pc(106) int local106 = local86.bottom + local86.top;
			Static547.anInt9471 = Static543.aFrame2.getSize().height - local106;
			local74 = Static543.aFrame2;
		}
		@Pc(150) int local150;
		if (arg1 == 1) {
			Static290.anInt6867 = Static347.anInt6402;
			Static145.anInt3327 = (Static60.anInt1681 - Static347.anInt6402) / 2;
			Static12.anInt658 = 0;
			Static90.anInt2326 = Static450.anInt7569;
		} else if (Static318.anInt6040 < 96 && Static526.anInt8926 == 0) {
			local150 = Static60.anInt1681 <= 1024 ? Static60.anInt1681 : 1024;
			@Pc(157) int local157 = Static547.anInt9471 <= 768 ? Static547.anInt9471 : 768;
			Static145.anInt3327 = (Static60.anInt1681 - local150) / 2;
			Static290.anInt6867 = local150;
			Static12.anInt658 = 0;
			Static90.anInt2326 = local157;
		} else {
			Static290.anInt6867 = Static60.anInt1681;
			Static145.anInt3327 = 0;
			Static12.anInt658 = 0;
			Static90.anInt2326 = Static547.anInt9471;
		}
		if (Static363.aClass199_14 != Static359.aClass199_13) {
			@Pc(193) boolean local193;
			if (Static290.anInt6867 < 1024 && Static90.anInt2326 < 768) {
				local193 = true;
			} else {
				local193 = false;
			}
		}
		if (arg0) {
			Static241.method2711();
		} else {
			Static78.aCanvas7.setSize(Static290.anInt6867, Static90.anInt2326);
			Static478.aClass9_10.method7627(Static78.aCanvas7);
			if (Static543.aFrame2 == local74) {
				local86 = Static543.aFrame2.getInsets();
				Static78.aCanvas7.setLocation(local86.left + Static145.anInt3327, Static12.anInt658 + local86.top);
			} else {
				Static78.aCanvas7.setLocation(Static145.anInt3327, Static12.anInt658);
			}
		}
		if (arg1 >= 2) {
			Static52.aBoolean113 = true;
		} else {
			Static52.aBoolean113 = false;
		}
		if (Static85.anInt2201 != -1) {
			Static204.method3768(true);
		}
		if (Static453.aClass154_1 != null && Static442.method6767(Static51.anInt7926)) {
			Static363.method6954();
		}
		for (local150 = 0; local150 < 100; local150++) {
			Static145.aBooleanArray14[local150] = true;
		}
		Static412.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V")
	public static void method3855() {
		if (Static51.anInt7926 == 2) {
			Static265.method4401(3);
		} else if (Static51.anInt7926 == 6) {
			Static265.method4401(7);
		} else if (Static51.anInt7926 == 9) {
			Static265.method4401(10);
			return;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!kda;)V")
	public static void method3856(@OriginalArg(1) Class160 arg0) {
		Static259.aClass160_58 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!kda;ILclient!qa;)V")
	public static void method3858(@OriginalArg(0) Class160 arg0, @OriginalArg(2) Class9 arg1) {
		@Pc(8) Class242[] local8 = Static559.method5935(arg0, Static173.anInt3750);
		Static137.aClass12Array10 = new Class12[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static137.aClass12Array10[local14] = arg1.method7625(local8[local14]);
		}
		local8 = Static559.method5935(arg0, Static424.anInt7376);
		Static149.aClass12Array20 = new Class12[local8.length];
		for (@Pc(40) int local40 = 0; local40 < local8.length; local40++) {
			Static149.aClass12Array20[local40] = arg1.method7625(local8[local40]);
		}
		local8 = Static559.method5935(arg0, Static288.anInt5628);
		Static217.aClass12Array14 = new Class12[local8.length];
		for (@Pc(69) int local69 = 0; local69 < local8.length; local69++) {
			Static217.aClass12Array14[local69] = arg1.method7625(local8[local69]);
		}
		local8 = Static559.method5935(arg0, Static476.anInt7310);
		Static290.aClass12Array24 = new Class12[local8.length];
		for (@Pc(95) int local95 = 0; local95 < local8.length; local95++) {
			Static290.aClass12Array24[local95] = arg1.method7625(local8[local95]);
		}
		local8 = Static559.method5935(arg0, Static252.anInt4932);
		Static289.aClass12Array19 = new Class12[local8.length];
		for (@Pc(121) int local121 = 0; local121 < local8.length; local121++) {
			Static289.aClass12Array19[local121] = arg1.method7625(local8[local121]);
		}
		local8 = Static559.method5935(arg0, Static163.anInt3578);
		Static81.aClass12Array8 = new Class12[local8.length];
		for (@Pc(147) int local147 = 0; local147 < local8.length; local147++) {
			Static81.aClass12Array8[local147] = arg1.method7625(local8[local147]);
		}
		local8 = Static559.method5935(arg0, Static167.anInt3663);
		Static417.aClass12Array21 = new Class12[local8.length];
		for (@Pc(173) int local173 = 0; local173 < local8.length; local173++) {
			Static417.aClass12Array21[local173] = arg1.method7625(local8[local173]);
		}
		local8 = Static559.method5935(arg0, Static294.anInt5701);
		Static42.aClass12Array4 = new Class12[local8.length];
		for (@Pc(203) int local203 = 0; local203 < local8.length; local203++) {
			Static42.aClass12Array4[local203] = arg1.method7625(local8[local203]);
		}
		local8 = Static559.method5935(arg0, Static266.anInt5160);
		Static204.aClass12Array13 = new Class12[local8.length];
		for (@Pc(229) int local229 = 0; local229 < local8.length; local229++) {
			Static204.aClass12Array13[local229] = arg1.method7625(local8[local229]);
		}
		local8 = Static559.method5935(arg0, Static137.anInt3221);
		Static19.aClass12Array1 = new Class12[local8.length];
		for (@Pc(259) int local259 = 0; local259 < local8.length; local259++) {
			Static19.aClass12Array1[local259] = arg1.method7625(local8[local259]);
		}
		local8 = Static559.method5935(arg0, Static227.anInt8839);
		Static221.aClass12Array15 = new Class12[local8.length];
		for (@Pc(289) int local289 = 0; local289 < local8.length; local289++) {
			Static221.aClass12Array15[local289] = arg1.method7625(local8[local289]);
		}
		local8 = Static559.method5935(arg0, Static246.anInt4757);
		Static107.aClass12Array9 = new Class12[local8.length];
		for (@Pc(319) int local319 = 0; local319 < local8.length; local319++) {
			Static107.aClass12Array9[local319] = arg1.method7625(local8[local319]);
		}
		Static151.aClass12_5 = arg1.method7625(Static559.method5942(arg0, Static271.anInt1860, 0));
		Static125.aClass12_2 = arg1.method7625(Static559.method5942(arg0, Static260.anInt5086, 0));
		local8 = Static559.method5935(arg0, Static534.anInt9244);
		Static284.aClass12Array18 = new Class12[local8.length];
		for (@Pc(365) int local365 = 0; local365 < local8.length; local365++) {
			Static284.aClass12Array18[local365] = arg1.method7625(local8[local365]);
		}
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(B)V")
	public static void method3859() {
		Static42.method1368();
		for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
			Static70.aClass299Array1[local6].method7230();
		}
		Static540.method7892();
		Static33.method1299();
		System.gc();
	}
}

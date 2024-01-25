import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	public static int anInt6681;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "Lclient!ik;")
	public static Class119 aClass119_3;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lclient!hh;")
	public static Class109 aClass109_83;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public static void method5237(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 2);
		local8.method28();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!hh;)V")
	public static void method5239(@OriginalArg(1) Class109 arg0) {
		Static151.anInt2730 = arg0.method2343("p11_full");
		Static162.anInt2876 = arg0.method2343("p12_full");
		Static275.anInt4643 = arg0.method2343("b12_full");
		Static406.anInt7171 = arg0.method2343("hitmarks");
		Static349.anInt6364 = arg0.method2343("hitbar_default");
		Static355.anInt6512 = arg0.method2343("timerbar_default");
		Static61.anInt1110 = arg0.method2343("headicons_pk");
		Static239.anInt4211 = arg0.method2343("headicons_prayer");
		Static427.anInt7220 = arg0.method2343("hint_headicons");
		Static68.anInt1240 = arg0.method2343("hint_mapmarkers");
		Static118.anInt2253 = arg0.method2343("mapflag");
		Static291.anInt7741 = arg0.method2343("cross");
		Static290.anInt4864 = arg0.method2343("mapdots");
		Static274.anInt4620 = arg0.method2343("scrollbar");
		Static442.anInt7682 = arg0.method2343("name_icons");
		Static111.anInt2134 = arg0.method2343("floorshadows");
		Static250.anInt4324 = arg0.method2343("compass");
		Static165.anInt4809 = arg0.method2343("otherlevel");
		Static40.anInt624 = arg0.method2343("hint_mapedge");
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZIIZI)V")
	public static void method5240(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static432.aFrame2 != null && (arg2 != 3 || arg4 != Static327.aClass230_Sub1_1.anInt7305 || Static327.aClass230_Sub1_1.anInt7303 != arg0)) {
			Static131.method2036(Static432.aFrame2, Static403.aClass42_6);
			Static432.aFrame2 = null;
		}
		if (arg2 == 3 && Static432.aFrame2 == null) {
			Static432.aFrame2 = Static323.method4469(Static403.aClass42_6, arg0, arg4, 0);
			if (Static432.aFrame2 != null) {
				Static327.aClass230_Sub1_1.anInt7305 = arg4;
				Static327.aClass230_Sub1_1.anInt7303 = arg0;
				Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
			}
		}
		if (arg2 == 3 && Static432.aFrame2 == null) {
			method5240(-1, true, Static327.aClass230_Sub1_1.anInt7301, arg3, -1);
			return;
		}
		@Pc(75) Container local75;
		@Pc(82) Insets local82;
		if (Static432.aFrame2 != null) {
			Static356.anInt6526 = arg0;
			Static90.anInt1737 = arg4;
			local75 = Static432.aFrame2;
		} else if (Static303.aFrame1 == null) {
			local75 = Static403.aClass42_6.anApplet1;
			Static90.anInt1737 = local75.getSize().width;
			Static356.anInt6526 = local75.getSize().height;
		} else {
			local82 = Static303.aFrame1.getInsets();
			@Pc(88) int local88 = -local82.right;
			Static90.anInt1737 = Static303.aFrame1.getSize().width + local88 - local82.left;
			Static356.anInt6526 = Static303.aFrame1.getSize().height - local82.bottom - local82.top;
			local75 = Static303.aFrame1;
		}
		@Pc(158) int local158;
		if (arg2 == 1) {
			Static128.anInt2407 = (Static90.anInt1737 - Static170.anInt3041) / 2;
			Static83.anInt4881 = 0;
			Static403.anInt7142 = Static170.anInt3041;
			Static324.anInt5725 = Static73.anInt1378;
		} else if (Static188.anInt3481 < 96 && Static146.anInt2664 == 0) {
			local158 = Static90.anInt1737 <= 1024 ? Static90.anInt1737 : 1024;
			Static128.anInt2407 = (Static90.anInt1737 - local158) / 2;
			Static403.anInt7142 = local158;
			@Pc(176) int local176 = Static356.anInt6526 > 768 ? 768 : Static356.anInt6526;
			Static83.anInt4881 = 0;
			Static324.anInt5725 = local176;
		} else {
			Static83.anInt4881 = 0;
			Static403.anInt7142 = Static90.anInt1737;
			Static324.anInt5725 = Static356.anInt6526;
			Static128.anInt2407 = 0;
		}
		if (Static191.aClass174_5 != Static153.aClass174_7) {
			@Pc(202) boolean local202;
			if (Static403.anInt7142 < 1024 && Static324.anInt5725 < 768) {
				local202 = true;
			} else {
				local202 = false;
			}
		}
		if (arg1) {
			Static90.method1404();
		} else {
			Static159.aCanvas3.setSize(Static403.anInt7142, Static324.anInt5725);
			Static447.aClass121_11.method4628(Static159.aCanvas3);
			if (Static303.aFrame1 == local75) {
				local82 = Static303.aFrame1.getInsets();
				Static159.aCanvas3.setLocation(local82.left + Static128.anInt2407, local82.top + Static83.anInt4881);
			} else {
				Static159.aCanvas3.setLocation(Static128.anInt2407, Static83.anInt4881);
			}
		}
		if (arg2 >= 2) {
			Static208.aBoolean303 = true;
		} else {
			Static208.aBoolean303 = false;
		}
		if (Static246.anInt4292 != -1) {
			Static159.method2523(true);
		}
		if (Static169.aClass114_4 != null && (Static40.anInt629 == 30 || Static40.anInt629 == 25)) {
			Static294.method4014();
		}
		for (local158 = 0; local158 < 100; local158++) {
			Static204.aBooleanArray15[local158] = true;
		}
		Static24.aBoolean22 = true;
	}
}
